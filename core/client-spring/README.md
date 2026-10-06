# client-spring

`client-spring` provides a ThousandEyes `ApiClient` implemented with Spring `RestClient`. It uses
the request factory, interceptors, observation registry, and conventions from the supplied
`RestClient.Builder`. JSON conversion uses the SDK mapper by default so generated models have the
same wire format as the other SDK clients, including omission of null properties. Supply a different
mapper with `objectMapper(...)` when the application needs additional Jackson configuration.

```gradle
implementation "com.thousandeyes.sdk:client-spring:<version>"
```

## Spring configuration

Pass Spring Boot's managed builder so the SDK client retains the application's HTTP client
configuration and Spring observations:

```java
import java.net.URI;

@Bean
ApiClient thousandEyesApiClient(RestClient.Builder restClientBuilder) {
    return SpringApiClient.builder(restClientBuilder)
            .baseUri(URI.create("https://api.thousandeyes.com/v7"))
            .bearerToken(token)
            .build();
}
```

The SDK clones the builder and does not mutate the supplied instance. `SpringApiClient` stores only
the built `RestClient`; Spring and the application own the request factory and its lifecycle.

Without a supplied builder, `SpringApiClient.builder()` uses `RestClient.builder()` and Spring's
classpath-based request factory selection.

Generated SDK methods URL-encode path substitutions and query parameter names and values before
creating an `ApiRequest`; this client preserves that encoding. Callers that construct `ApiRequest`
directly must likewise supply encoded path and query components.

## Apache HttpClient 5

Configure `HttpComponentsClientHttpRequestFactory` in the application and keep it as a Spring bean
so it can be shared by multiple clients. Spring then closes its connection pool and eviction thread
during application shutdown.

```java
@Bean
ApiClient thousandEyesApiClient(
        RestClient.Builder restClientBuilder,
        HttpComponentsClientHttpRequestFactory apiRequestFactory) {
    return SpringApiClient.builder(restClientBuilder)
            .requestFactory(apiRequestFactory)
            .bearerToken(token)
            .build();
}
```

Spring `RestClient` does not expose the SDK's per-request `ApiRequest.readTimeout` option, so this
module ignores that value. Configure timeouts on the Spring request factory instead.

## Authentication

Use `bearerToken` when one token is fixed for the life of the client. For request scoped or
renewable credentials, add a Spring interceptor:

```java
ApiClient client = SpringApiClient.builder(restClientBuilder)
        .addRequestInterceptor((request, body, execution) -> {
            request.getHeaders().setBearerAuth(tokenProvider.currentToken());
            return execution.execute(request, body);
        })
        .build();
```

Interceptors already present on the supplied Spring builder run first, followed by fixed bearer
authentication and interceptors added through `SpringApiClientBuilder`. A caller interceptor can
therefore replace the fixed authorization header.

## Metrics

When the supplied builder has an `ObservationRegistry`, Spring records the standard
`http.client.requests` timer. Prometheus exposes series such as:

```text
http_client_requests_seconds_count
http_client_requests_seconds_sum
```

Spring's observation covers request conversion, the HTTP exchange, response conversion, and body
consumption. SDK rate-limit retries create one observation for each physical attempt. Generated SDK
requests contain expanded paths instead of URI templates, so the standard low-cardinality `uri` tag
is `none`.

Spring Boot distribution settings apply normally:

```yaml
management:
  metrics:
    distribution:
      percentiles:
        http.client.requests: 0.5, 0.9, 0.95, 0.99
      percentiles-histogram:
        http.client.requests: true
      slo:
        http.client.requests: 100ms, 500ms, 1s
```

The module does not install separate Apache request instrumentation or connection pool gauges.

## Retry configuration

SDK handling of supported HTTP 429 responses is enabled by default. Disable it when another layer
owns rate-limit retries:

```java
ApiClient client = SpringApiClient.builder(restClientBuilder)
        .retryOnRateLimit(false)
        .build();
```

Apache HttpClient retries some HTTP 429 and 503 responses by default. Disable its automatic retries
when the SDK rate-limit retry is enabled so one response cannot be retried by both layers. With
Spring Boot 4.1, customize its managed HC5 builder without replacing the managed request factory:

```java
@Bean
ClientHttpRequestFactoryBuilderCustomizer<HttpComponentsClientHttpRequestFactoryBuilder>
        disableAutomaticHttpClientRetries() {
    return builder -> builder.withHttpClientCustomizer(
            HttpClientBuilder::disableAutomaticRetries);
}
```

This customizer applies to Spring Boot managed synchronous HC5 clients. Transport retries otherwise
belong to the configured Spring request factory and its underlying HTTP client.

Configure default headers, non-JSON message converters, observations, and other Spring options on
the supplied `RestClient.Builder`. The SDK installs its configured mapper for JSON conversion.
Request factory resources supplied to `SpringApiClientBuilder` remain owned by the application.
