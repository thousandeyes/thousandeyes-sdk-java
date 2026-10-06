# Apache HttpClient 5 API client

`client-hc5` is a thread safe `ApiClient` implementation backed by Apache HttpClient 5. It owns a
connection pool and an idle connection eviction thread, so create one client for the application and
close it during application shutdown.

```java
try (ApiClient client = Hc5ApiClient.builder()
        .bearerToken(System.getenv("THOUSANDEYES_TOKEN"))
        .build()) {
    // Reuse client for API calls.
}
```

The defaults allow 100 total connections and 20 connections per route. Pool acquisition and connect
timeouts are 5 seconds, socket and response timeouts are 30 seconds, connection lifetime is 5 minutes,
and idle connections are evicted after 30 seconds. Redirect handling and Apache HttpClient automatic
retries are disabled. The SDK rate-limit retry remains enabled and can be disabled when retries are
managed elsewhere:

```java
ApiClient client = Hc5ApiClient.builder()
        .retryOnRateLimit(false)
        .build();
```

## Authentication and interceptors

`bearerToken` installs fixed bearer authentication. For tokens selected at request time, add a standard
HttpClient 5 request interceptor and set the `Authorization` header there. Caller request interceptors run
after fixed authentication, so they can replace it with `setHeader`.

```java
ApiClient client = Hc5ApiClient.builder()
        .bearerToken("fallback-token")
        .addRequestInterceptor((request, entity, context) ->
                request.setHeader("Authorization", "Bearer " + currentToken()))
        .build();
```

Request and response interceptors are cumulative and retain registration order.

## Metrics

Pass a `MeterRegistry` to enable the native metrics from Apache HttpClient's
`httpclient5-observation` module. Metrics are omitted when the registry is absent.

```java
ApiClient client = Hc5ApiClient.builder()
        .metrics(Hc5MetricsConfig.builder(meterRegistry)
                .poolName("api")
                .tags(List.of(Tag.of("region", "eu")))
                .build())
        .build();
```

The module enables only HC5's `BASIC` and `CONN_POOL` metric sets:

- `http.client.request`: request latency timer
- `http.client.response`: response counter
- `http.client.inflight`: in-flight request gauge
- `http.client.pool.leased`, `.pool.available`, and `.pool.pending`: connection pool gauges

Prometheus exposes the request timer as `http_client_request_seconds_count`,
`http_client_request_seconds_sum`, and the related timer series.

Request metrics use `method` and `status` tags. The configured pool name is published as the
`httpclient` tag, and the configured tags are added to all HC5 meters. SDK rate-limit retries produce
a separate HC5 request measurement for each attempt.

## Advanced configuration

Connection pool, timeout, and metrics options are grouped into immutable configuration objects.
Customizers provide access to less common options such as TLS, proxies, DNS, and retry strategies:

```java
ApiClient client = Hc5ApiClient.builder()
        .timeouts(Hc5TimeoutConfig.builder()
                .connectTimeout(Duration.ofSeconds(2))
                .responseTimeout(Duration.ofSeconds(10))
                .build())
        .pool(Hc5PoolConfig.builder()
                .maxConnectionsTotal(200)
                .maxConnectionsPerRoute(40)
                .build())
        .customizeConnectionConfig(builder -> { /* connection options */ })
        .customizeRequestConfig(builder -> { /* request options */ })
        .customizeConnectionManager(builder -> { /* pool and TLS options */ })
        .customizeHttpClient(builder -> { /* proxy or execution chain options */ })
        .build();
```

Customizers are cumulative and run after module defaults. The module attaches its owned connection
manager and optional HC5 metrics after the HTTP client customizers.

A positive `idleEviction` setting takes precedence over `expiredConnectionEvictionEnabled`: Apache
HttpClient's idle eviction task also evicts expired connections. To disable background eviction of
expired connections, set `expiredConnectionEvictionEnabled(false)` and use a zero or negative
`idleEviction` duration.
