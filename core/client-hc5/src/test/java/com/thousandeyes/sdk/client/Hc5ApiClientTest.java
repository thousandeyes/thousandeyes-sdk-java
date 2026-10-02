package com.thousandeyes.sdk.client;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import org.apache.commons.lang3.reflect.TypeUtils;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import io.micrometer.core.instrument.Tag;
import io.micrometer.core.instrument.simple.SimpleMeterRegistry;

class Hc5ApiClientTest {
    private HttpServer server;
    private ExecutorService serverExecutor;
    private String baseUri;
    private final List<ApiClient> clients = new ArrayList<>();

    @BeforeEach
    void startServer() throws IOException {
        server = HttpServer.create(new InetSocketAddress("localhost", 0), 0);
        serverExecutor = Executors.newCachedThreadPool();
        server.setExecutor(serverExecutor);
        server.start();
        baseUri = "http://localhost:" + server.getAddress().getPort();
    }

    @AfterEach
    void stopServer() {
        clients.forEach(ApiClient::close);
        server.stop(0);
        serverExecutor.shutdownNow();
    }

    @Test
    void appliesProductionDefaultsAndBuilderOverrides() {
        Hc5ApiClient defaults = client(Hc5ApiClient.builder());

        assertEquals(100, defaults.getConnectionManager().getMaxTotal());
        assertEquals(20, defaults.getConnectionManager().getDefaultMaxPerRoute());
        assertEquals(5_000, defaults.getDefaultRequestConfig().getConnectionRequestTimeout().toMilliseconds());
        assertEquals(30_000, defaults.getDefaultRequestConfig().getResponseTimeout().toMilliseconds());
        assertEquals(180_000, defaults.getDefaultRequestConfig().getConnectionKeepAlive().toMilliseconds());

        AtomicInteger customizers = new AtomicInteger();
        Hc5ApiClient overridden = client(Hc5ApiClient.builder()
                .pool(Hc5PoolConfig.builder()
                        .maxConnectionsTotal(7)
                        .maxConnectionsPerRoute(3)
                        .fallbackKeepAlive(Duration.ofMillis(93))
                        .build())
                .timeouts(Hc5TimeoutConfig.builder()
                        .poolAcquisitionTimeout(Duration.ofMillis(91))
                        .responseTimeout(Duration.ofMillis(92))
                        .build())
                .customizeConnectionConfig(builder -> customizers.incrementAndGet())
                .customizeConnectionConfig(builder -> customizers.incrementAndGet())
                .customizeRequestConfig(builder -> {
                    customizers.incrementAndGet();
                    builder.setResponseTimeout(94, TimeUnit.MILLISECONDS);
                })
                .customizeConnectionManager(builder -> {
                    customizers.incrementAndGet();
                    builder.setMaxConnTotal(8);
                })
                .customizeHttpClient(builder -> customizers.incrementAndGet()));

        assertEquals(8, overridden.getConnectionManager().getMaxTotal());
        assertEquals(3, overridden.getConnectionManager().getDefaultMaxPerRoute());
        assertEquals(91, overridden.getDefaultRequestConfig().getConnectionRequestTimeout().toMilliseconds());
        assertEquals(94, overridden.getDefaultRequestConfig().getResponseTimeout().toMilliseconds());
        assertEquals(93, overridden.getDefaultRequestConfig().getConnectionKeepAlive().toMilliseconds());
        assertEquals(5, customizers.get());
    }

    @Test
    void sendsMethodsHeadersQueryAndBodiesAndReadsGenericResponse() throws Exception {
        AtomicReference<String> method = new AtomicReference<>();
        AtomicReference<String> query = new AtomicReference<>();
        AtomicReference<String> header = new AtomicReference<>();
        AtomicReference<String> body = new AtomicReference<>();
        server.createContext("/items", exchange -> {
            method.set(exchange.getRequestMethod());
            query.set(exchange.getRequestURI().getRawQuery());
            header.set(exchange.getRequestHeaders().getFirst("X-Test"));
            body.set(new String(exchange.getRequestBody().readAllBytes(), StandardCharsets.UTF_8));
            respond(exchange, 200, "[{\"name\":\"one\"}]");
        });
        Hc5ApiClient client = client(Hc5ApiClient.builder());

        ApiResponse<List<Item>> response = client.send(ApiRequest.builder()
                .method("POST")
                .path("/items")
                .queryParams(List.of(Pair.of("aid", "33"), Pair.of("window", "1h")))
                .header("X-Test", List.of("value"))
                .requestBody(new Item("request"))
                .build(), TypeUtils.parameterize(List.class, Item.class));

        assertEquals("POST", method.get());
        assertEquals("aid=33&window=1h", query.get());
        assertEquals("value", header.get());
        assertEquals("{\"name\":\"request\"}", body.get());
        assertEquals(List.of(new Item("one")), response.getData());
    }

    @Test
    void supportsStringAndVoidBodiesAndMapsErrors() throws Exception {
        AtomicReference<String> body = new AtomicReference<>();
        server.createContext("/text", exchange -> {
            body.set(new String(exchange.getRequestBody().readAllBytes(), StandardCharsets.UTF_8));
            exchange.getResponseHeaders().add("X-Result", "ok");
            respond(exchange, 204, null);
        });
        server.createContext("/error", exchange -> {
            exchange.getResponseHeaders().add("X-Error", "present");
            respond(exchange, 422, "bad request");
        });
        Hc5ApiClient client = client(Hc5ApiClient.builder());

        ApiResponse<Void> response = client.send(ApiRequest.builder()
                .method("PUT").path("/text").requestBody("plain text").build(), Void.class);
        assertEquals("plain text", body.get());
        assertNull(response.getData());
        assertEquals(List.of("ok"), response.getHeaders().get("x-result"));

        ApiException exception = assertThrows(ApiException.class, () -> client.send(
                ApiRequest.builder().method("GET").path("/error").build(), Item.class));
        assertEquals(422, exception.getCode());
        assertEquals("bad request", exception.getResponseBody());
        assertEquals(List.of("present"), exception.getResponseHeaders().get("x-error"));
    }

    @Test
    void runsBearerAuthenticationBeforeOrderedCallerInterceptors() throws Exception {
        List<String> order = new ArrayList<>();
        AtomicReference<String> authorization = new AtomicReference<>();
        server.createContext("/auth", exchange -> {
            authorization.set(exchange.getRequestHeaders().getFirst("Authorization"));
            respond(exchange, 200, "{\"name\":\"ok\"}");
        });
        Hc5ApiClient client = client(Hc5ApiClient.builder()
                .bearerToken("fixed")
                .addRequestInterceptor((request, entity, context) -> {
                    order.add("first");
                    assertEquals("Bearer fixed", request.getFirstHeader("Authorization").getValue());
                    request.setHeader("Authorization", "Bearer dynamic");
                })
                .addRequestInterceptor((request, entity, context) -> order.add("second"))
                .addResponseInterceptor((response, entity, context) -> order.add("response")));

        client.send(ApiRequest.builder().method("GET").path("/auth").build(), Item.class);

        assertEquals("Bearer dynamic", authorization.get());
        assertEquals(List.of("first", "second", "response"), order);
    }

    @Test
    void keepsBearerTokensFixedWhenBuilderIsReused() throws Exception {
        List<String> authorizations = new ArrayList<>();
        server.createContext("/fixed-auth", exchange -> {
            authorizations.add(exchange.getRequestHeaders().getFirst("Authorization"));
            respond(exchange, 204, null);
        });
        Hc5ApiClientBuilder builder = Hc5ApiClient.builder()
                .baseUri(baseUri)
                .retryOnRateLimit(false);
        ApiClient first = builder.bearerToken("first").build();
        ApiClient second = builder.bearerToken("second").build();
        clients.add(first);
        clients.add(second);

        first.send(ApiRequest.builder().method("GET").path("/fixed-auth").build(), Void.class);
        second.send(ApiRequest.builder().method("GET").path("/fixed-auth").build(), Void.class);

        assertEquals(List.of("Bearer first", "Bearer second"), authorizations);
    }

    @Test
    void appliesPerRequestResponseTimeout() {
        server.createContext("/slow", exchange -> {
            sleep(300);
            respond(exchange, 200, "{\"name\":\"late\"}");
        });
        Hc5ApiClient client = client(Hc5ApiClient.builder()
                .timeouts(Hc5TimeoutConfig.builder()
                        .responseTimeout(Duration.ofSeconds(2))
                        .build()));

        ApiException exception = assertThrows(ApiException.class, () -> client.send(ApiRequest.builder()
                .method("GET").path("/slow").readTimeout(Duration.ofMillis(50)).build(), Item.class));

        assertNotNull(exception.getCause());
    }

    @Test
    void enforcesSocketTimeoutWhileConsumingAStalledResponseBody() throws Exception {
        CountDownLatch bodyStarted = new CountDownLatch(1);
        server.createContext("/body-timeout", exchange -> {
            byte[] bytes = "{\"name\":\"late\"}".getBytes(StandardCharsets.UTF_8);
            exchange.sendResponseHeaders(200, bytes.length);
            exchange.getResponseBody().write(bytes, 0, 1);
            exchange.getResponseBody().flush();
            bodyStarted.countDown();
            sleep(300);
            exchange.close();
        });
        Hc5ApiClient client = client(Hc5ApiClient.builder()
                .timeouts(Hc5TimeoutConfig.builder()
                        .socketTimeout(Duration.ofMillis(50))
                        .responseTimeout(Duration.ofSeconds(1))
                        .build()));

        ApiException exception = assertThrows(ApiException.class, () -> client.send(
                ApiRequest.builder().method("GET").path("/body-timeout").build(), Item.class));

        assertTrue(bodyStarted.await(1, TimeUnit.SECONDS));
        assertNotNull(exception.getCause());
    }

    @Test
    void disablesAutomaticRetriesByDefaultAndAllowsOptIn() throws Exception {
        AtomicInteger defaultAttempts = new AtomicInteger();
        server.createContext("/no-automatic-retry", exchange -> {
            if (defaultAttempts.incrementAndGet() == 1) {
                exchange.close();
            }
            else {
                respond(exchange, 200, "{\"name\":\"retried\"}");
            }
        });
        AtomicInteger enabledAttempts = new AtomicInteger();
        server.createContext("/automatic-retry", exchange -> {
            if (enabledAttempts.incrementAndGet() == 1) {
                exchange.close();
            }
            else {
                respond(exchange, 200, "{\"name\":\"retried\"}");
            }
        });
        Hc5ApiClient defaults = client(Hc5ApiClient.builder());
        Hc5ApiClient enabled = client(Hc5ApiClient.builder().automaticRetries(true));

        assertThrows(ApiException.class, () -> defaults.send(ApiRequest.builder()
                .method("GET").path("/no-automatic-retry").build(), Item.class));
        assertEquals(1, defaultAttempts.get());
        assertEquals(new Item("retried"), enabled.send(ApiRequest.builder()
                .method("GET").path("/automatic-retry").build(), Item.class).getData());
        assertEquals(2, enabledAttempts.get());
    }

    @Test
    void limitsPoolAcquisitionWhileAnotherResponseBodyIsStalled() throws Exception {
        CountDownLatch bodyStarted = new CountDownLatch(1);
        server.createContext("/stall", exchange -> {
            byte[] bytes = "{\"name\":\"ok\"}".getBytes(StandardCharsets.UTF_8);
            exchange.sendResponseHeaders(200, bytes.length);
            exchange.getResponseBody().write(bytes, 0, 1);
            exchange.getResponseBody().flush();
            bodyStarted.countDown();
            sleep(400);
            exchange.getResponseBody().write(bytes, 1, bytes.length - 1);
            exchange.close();
        });
        Hc5ApiClient client = client(Hc5ApiClient.builder()
                .pool(Hc5PoolConfig.builder()
                        .maxConnectionsTotal(1)
                        .maxConnectionsPerRoute(1)
                        .build())
                .timeouts(Hc5TimeoutConfig.builder()
                        .poolAcquisitionTimeout(Duration.ofMillis(75))
                        .socketTimeout(Duration.ofSeconds(2))
                        .build()));
        ExecutorService caller = Executors.newSingleThreadExecutor();
        try {
            var first = caller.submit(() -> client.send(
                    ApiRequest.builder().method("GET").path("/stall").build(), Item.class));
            assertTrue(bodyStarted.await(1, TimeUnit.SECONDS));

            ApiException exception = assertThrows(ApiException.class, () -> client.send(
                    ApiRequest.builder().method("GET").path("/stall").build(), Item.class));
            assertNotNull(exception.getCause());
            assertEquals(new Item("ok"), first.get(2, TimeUnit.SECONDS).getData());
        }
        finally {
            caller.shutdownNow();
        }
    }

    @Test
    void reusesConnectionsAndClosesGracefully() throws Exception {
        Set<Integer> remotePorts = java.util.concurrent.ConcurrentHashMap.newKeySet();
        server.createContext("/reuse", exchange -> {
            remotePorts.add(exchange.getRemoteAddress().getPort());
            respond(exchange, 200, "{\"name\":\"ok\"}");
        });
        ApiClient client = Hc5ApiClient.builder()
                .baseUri(baseUri)
                .mapper(new ObjectMapper().findAndRegisterModules())
                .build();
        clients.add(client);

        client.send(ApiRequest.builder().method("GET").path("/reuse").build(), Item.class);
        client.send(ApiRequest.builder().method("GET").path("/reuse").build(), Item.class);
        assertEquals(1, remotePorts.size());

        client.close();
        assertThrows(ApiException.class, () -> client.send(
                ApiRequest.builder().method("GET").path("/reuse").build(), Item.class));
    }

    @Test
    void recordsNativeRequestAndPoolMetrics() throws Exception {
        AtomicInteger attempts = new AtomicInteger();
        server.createContext("/limited", exchange -> {
            if (attempts.incrementAndGet() == 1) {
                exchange.getResponseHeaders().add("X-Organization-Rate-Limit-Reset",
                        Long.toString(Instant.now().getEpochSecond()));
                respond(exchange, 429, "limited");
            }
            else {
                respond(exchange, 200, "{\"name\":\"ok\"}");
            }
        });
        SimpleMeterRegistry meters = new SimpleMeterRegistry();
        ApiClient client = Hc5ApiClient.builder()
                .baseUri(baseUri)
                .mapper(new ObjectMapper().findAndRegisterModules())
                .metrics(Hc5MetricsConfig.builder(meters)
                        .poolName("sdk")
                        .tags(List.of(Tag.of("component", "test")))
                        .build())
                .build();
        clients.add(client);

        ApiResponse<Item> response = client.send(
                ApiRequest.builder().method("GET").path("/limited").build(), Item.class);

        assertEquals(new Item("ok"), response.getData());
        assertEquals(2, attempts.get());
        assertEquals(2, meters.find("httpcomponents.httpclient.request").timers()
                .stream().mapToLong(timer -> timer.count()).sum());
        assertEquals(2, meters.find("httpcomponents.httpclient.response").counters()
                .stream().mapToDouble(counter -> counter.count()).sum());
        assertEquals(0, meters.get("httpcomponents.httpclient.inflight")
                .tag("httpclient", "sdk").tag("component", "test")
                .tag("kind", "classic").gauge().value());
        assertTrue(meters.get("httpcomponents.httpclient.pool.available")
                .tag("httpclient", "sdk").tag("component", "test").gauge().value() >= 0);
    }

    @Test
    void omitsOptionalInstrumentation() throws Exception {
        server.createContext("/plain", exchange -> respond(exchange, 200, "{\"name\":\"ok\"}"));
        Hc5ApiClient client = client(Hc5ApiClient.builder());
        assertEquals(new Item("ok"), client.send(
                ApiRequest.builder().method("GET").path("/plain").build(), Item.class).getData());
    }

    private Hc5ApiClient client(Hc5ApiClientBuilder builder) {
        ApiClient client = builder.baseUri(baseUri)
                .mapper(new ObjectMapper().findAndRegisterModules())
                .retryOnRateLimit(false)
                .build();
        clients.add(client);
        return (Hc5ApiClient) client;
    }

    private static void respond(HttpExchange exchange, int status, String body) throws IOException {
        if (body == null) {
            exchange.sendResponseHeaders(status, -1);
        }
        else {
            byte[] bytes = body.getBytes(StandardCharsets.UTF_8);
            exchange.getResponseHeaders().set("Content-Type", "application/json");
            exchange.sendResponseHeaders(status, bytes.length);
            exchange.getResponseBody().write(bytes);
        }
        exchange.close();
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private record Item(String name) {
    }
}
