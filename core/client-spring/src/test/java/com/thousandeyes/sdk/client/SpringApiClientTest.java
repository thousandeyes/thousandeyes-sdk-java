/*
 * Copyright 2026 Cisco Systems, Inc. and its affiliates
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.thousandeyes.sdk.client;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import com.sun.net.httpserver.HttpServer;
import org.apache.commons.lang3.reflect.TypeUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tools.jackson.databind.json.JsonMapper;

import com.thousandeyes.sdk.serialization.JSON;

class SpringApiClientTest {
    private final AtomicReference<String> requestBody = new AtomicReference<>();
    private final AtomicReference<String> rawPath = new AtomicReference<>();
    private final AtomicReference<String> rawQuery = new AtomicReference<>();
    private final AtomicReference<String> responseBody = new AtomicReference<>("{}");
    private HttpServer server;

    @BeforeEach
    void setUp() throws IOException {
        server = HttpServer.create(new InetSocketAddress("localhost", 0), 0);
        server.createContext("/", exchange -> {
            rawPath.set(exchange.getRequestURI().getRawPath());
            rawQuery.set(exchange.getRequestURI().getRawQuery());
            requestBody.set(new String(exchange.getRequestBody().readAllBytes(), UTF_8));

            byte[] response = responseBody.get().getBytes(UTF_8);
            exchange.getResponseHeaders().set("Content-Type", "application/json");
            exchange.sendResponseHeaders(200, response.length);
            exchange.getResponseBody().write(response);
            exchange.close();
        });
        server.start();
    }

    @AfterEach
    void tearDown() {
        server.stop(0);
    }

    @Test
    void preservesEncodedPathAndQueryParameters() throws ApiException {
        ApiClient client = clientBuilder().build();
        OffsetDateTime start = OffsetDateTime.parse("2026-10-07T10:15:30+01:00");
        ApiRequest request = ApiRequest.builder()
                .method("GET")
                .pathTemplate("/items/{itemId}")
                .pathVariable("itemId", "a/b")
                .queryParams(RequestUtil.parameterToPairs("start time", start))
                .build();

        client.send(request, Void.class);

        assertEquals("/items/a%2Fb", rawPath.get());
        assertEquals("start%20time=2026-10-07T10%3A15%3A30%2B01%3A00", rawQuery.get());
        assertFalse(rawQuery.get().contains("%25"));
    }

    @Test
    void defaultMapperOmitsNullRequestProperties() throws Exception {
        ApiClient client = clientBuilder().build();

        client.send(jsonRequest(new PatchBody("agent", null)), Void.class);

        var body = JSON.getDefault().getMapper().readTree(requestBody.get());
        assertEquals("agent", body.get("name").textValue());
        assertFalse(body.has("licenseType"));
    }

    @Test
    void usesInjectedObjectMapper() throws Exception {
        ApiClient client = clientBuilder()
                .objectMapper(JsonMapper.builder().build())
                .build();

        client.send(jsonRequest(new PatchBody("agent", null)), Void.class);

        var body = JSON.getDefault().getMapper().readTree(requestBody.get());
        assertEquals("agent", body.get("name").textValue());
        assertTrue(body.has("licenseType"));
        assertTrue(body.get("licenseType").isNull());
    }

    @Test
    void deserializesGenericResponses() throws ApiException {
        responseBody.set("[{\"name\":\"agent\",\"licenseType\":\"enterprise\"}]");
        ApiClient client = clientBuilder().build();

        ApiResponse<List<PatchBody>> response = client.send(
                ApiRequest.builder().method("GET").path("/agents").build(),
                TypeUtils.parameterize(List.class, PatchBody.class));

        assertEquals(List.of(new PatchBody("agent", "enterprise")), response.getData());
    }

    private SpringApiClientBuilder clientBuilder() {
        return SpringApiClient.builder()
                .baseUri(URI.create("http://localhost:" + server.getAddress().getPort()))
                .retryOnRateLimit(false);
    }

    private ApiRequest jsonRequest(Object body) {
        return ApiRequest.builder()
                .method("PATCH")
                .path("/agents/1")
                .header("Content-Type", List.of("application/json"))
                .requestBody(body)
                .build();
    }

    private record PatchBody(String name, String licenseType) { }
}
