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

import java.net.URI;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

import org.apache.commons.lang3.StringUtils;
import org.apache.hc.client5.http.config.ConnectionConfig;
import org.apache.hc.client5.http.config.RequestConfig;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManagerBuilder;
import org.apache.hc.client5.http.observation.HttpClientObservationSupport;
import org.apache.hc.client5.http.observation.MetricConfig;
import org.apache.hc.client5.http.observation.ObservingOptions;
import org.apache.hc.core5.http.HttpRequestInterceptor;
import org.apache.hc.core5.http.HttpResponseInterceptor;
import org.apache.hc.core5.util.TimeValue;
import org.apache.hc.core5.util.Timeout;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.thousandeyes.sdk.serialization.JSON;

/**
 * Builds a thread-safe {@link Hc5ApiClient} with a bounded connection pool and finite timeouts.
 * Builder instances are mutable and are not thread-safe. Customizers and interceptors are cumulative
 * and run in registration order.
 */
public final class Hc5ApiClientBuilder {
    private String baseUri = "https://api.thousandeyes.com/v7";
    private ObjectMapper mapper = JSON.getDefault().getMapper();
    private String bearerToken;
    private boolean retryOnRateLimit = true;

    private Hc5PoolConfig poolConfig = Hc5PoolConfig.builder().build();
    private Hc5TimeoutConfig timeoutConfig = Hc5TimeoutConfig.builder().build();
    private Hc5MetricsConfig metricsConfig;
    private boolean automaticRetries;

    private final List<HttpRequestInterceptor> requestInterceptors = new ArrayList<>();
    private final List<HttpResponseInterceptor> responseInterceptors = new ArrayList<>();
    private final List<Consumer<ConnectionConfig.Builder>> connectionConfigCustomizers = new ArrayList<>();
    private final List<Consumer<RequestConfig.Builder>> requestConfigCustomizers = new ArrayList<>();
    private final List<Consumer<PoolingHttpClientConnectionManagerBuilder>> connectionManagerCustomizers = new ArrayList<>();
    private final List<Consumer<HttpClientBuilder>> httpClientCustomizers = new ArrayList<>();

    /**
     * Creates a client that owns its connection manager and eviction thread.
     * The returned client should normally be shared and must be closed when it is no longer needed.
     *
     * @return a configured, closeable API client
     */
    public ApiClient build() {
        ConnectionConfig.Builder connectionConfigBuilder = ConnectionConfig.custom()
                .setConnectTimeout(Timeout.of(timeoutConfig.connectTimeout()))
                .setSocketTimeout(Timeout.of(timeoutConfig.socketTimeout()))
                .setTimeToLive(TimeValue.ofMilliseconds(poolConfig.connectionTimeToLive().toMillis()))
                .setValidateAfterInactivity(
                        TimeValue.ofMilliseconds(poolConfig.validateAfterInactivity().toMillis()));
        connectionConfigCustomizers.forEach(customizer -> customizer.accept(connectionConfigBuilder));

        RequestConfig.Builder requestConfigBuilder = RequestConfig.custom()
                .setConnectionRequestTimeout(Timeout.of(timeoutConfig.poolAcquisitionTimeout()))
                .setResponseTimeout(Timeout.of(timeoutConfig.responseTimeout()))
                .setConnectionKeepAlive(TimeValue.ofMilliseconds(poolConfig.fallbackKeepAlive().toMillis()));
        requestConfigCustomizers.forEach(customizer -> customizer.accept(requestConfigBuilder));
        RequestConfig requestConfig = requestConfigBuilder.build();

        PoolingHttpClientConnectionManagerBuilder connectionManagerBuilder =
                PoolingHttpClientConnectionManagerBuilder.create()
                        .setMaxConnTotal(poolConfig.maxConnectionsTotal())
                        .setMaxConnPerRoute(poolConfig.maxConnectionsPerRoute())
                        .setPoolConcurrencyPolicy(poolConfig.concurrencyPolicy())
                        .setConnPoolPolicy(poolConfig.reusePolicy())
                        .setDefaultConnectionConfig(connectionConfigBuilder.build());
        connectionManagerCustomizers.forEach(customizer -> customizer.accept(connectionManagerBuilder));
        var connectionManager = connectionManagerBuilder.build();

        HttpClientBuilder httpClientBuilder = HttpClients.custom().setDefaultRequestConfig(requestConfig);
        if (!automaticRetries) {
            httpClientBuilder.disableAutomaticRetries();
        }
        if (poolConfig.expiredConnectionEvictionEnabled()) {
            httpClientBuilder.evictExpiredConnections();
        }
        if (!poolConfig.idleEviction().isNegative() && !poolConfig.idleEviction().isZero()) {
            httpClientBuilder.evictIdleConnections(
                    TimeValue.ofMilliseconds(poolConfig.idleEviction().toMillis()));
        }
        if (StringUtils.isNotBlank(bearerToken)) {
            String configuredBearerToken = bearerToken;
            httpClientBuilder.addRequestInterceptorLast((request, entity, context) ->
                    request.setHeader("Authorization", "Bearer " + configuredBearerToken));
        }
        requestInterceptors.forEach(httpClientBuilder::addRequestInterceptorLast);
        responseInterceptors.forEach(httpClientBuilder::addResponseInterceptorLast);
        httpClientCustomizers.forEach(customizer -> customizer.accept(httpClientBuilder));

        // These are owned by the SDK and must survive arbitrary builder customizers.
        httpClientBuilder.setConnectionManager(connectionManager);
        httpClientBuilder.setConnectionManagerShared(false);
        if (metricsConfig != null) {
            var options = ObservingOptions.builder()
                    .metrics(EnumSet.of(ObservingOptions.MetricSet.BASIC,
                                        ObservingOptions.MetricSet.CONN_POOL))
                    .build();
            var metricConfig = MetricConfig.builder()
                    .prefix("httpcomponents.httpclient")
                    .addCommonTag("httpclient", metricsConfig.poolName())
                    .addCommonTags(metricsConfig.tags())
                    .build();
            HttpClientObservationSupport.enable(
                    httpClientBuilder, null, metricsConfig.registry(), options, metricConfig);
        }

        ApiClient client = new Hc5ApiClient(
                parseBaseUri(baseUri), httpClientBuilder.build(), connectionManager, mapper, requestConfig);

        if (retryOnRateLimit) {
            return new RateLimitDecorator(client);
        }

        return client;
    }

    private String parseBaseUri(String value) {
        URI uri = URI.create(value);
        return uri.getScheme() + "://" + uri.getHost() +
                (uri.getPort() == -1 ? "" : ":" + uri.getPort()) + uri.getRawPath();
    }

    /**
     * Sets the API base URI. The default is {@code https://api.thousandeyes.com/v7}.
     *
     * @param value absolute base URI without a trailing request path
     * @return this builder
     */
    public Hc5ApiClientBuilder baseUri(String value) {
        this.baseUri = Objects.requireNonNull(value);
        return this;
    }

    /**
     * Sets the mapper used to serialize request objects and deserialize response bodies.
     * The default is {@link JSON#getDefault() the SDK default mapper}.
     *
     * @param value thread-safe mapper configuration to share with the client
     * @return this builder
     */
    public Hc5ApiClientBuilder mapper(ObjectMapper value) {
        this.mapper = Objects.requireNonNull(value);
        return this;
    }

    /**
     * Sets a fixed bearer token. Blank values disable fixed bearer authentication.
     * Fixed authentication runs before caller request interceptors, allowing an interceptor to replace it.
     *
     * @param value token value without the {@code Bearer } prefix
     * @return this builder
     */
    public Hc5ApiClientBuilder bearerToken(String value) {
        this.bearerToken = value;
        return this;
    }

    /**
     * Enables the SDK retry for HTTP 429 responses that contain a supported reset header.
     * Enabled by default. Disable it when retries are managed outside the SDK.
     *
     * @param value whether the SDK rate-limit retry is enabled
     * @return this builder
     */
    public Hc5ApiClientBuilder retryOnRateLimit(boolean value) {
        this.retryOnRateLimit = value;
        return this;
    }

    /**
     * Sets connection pool and connection lifetime options. Defaults are provided by
     * {@link Hc5PoolConfig#builder()}.
     *
     * @param value immutable pool configuration
     * @return this builder
     */
    public Hc5ApiClientBuilder pool(Hc5PoolConfig value) {
        this.poolConfig = Objects.requireNonNull(value);
        return this;
    }

    /**
     * Sets pool acquisition, connection, socket, and response timeouts. Defaults are provided by
     * {@link Hc5TimeoutConfig#builder()}. An {@link ApiRequest#getReadTimeout()} value overrides the
     * configured response timeout for that request.
     *
     * @param value immutable timeout configuration
     * @return this builder
     */
    public Hc5ApiClientBuilder timeouts(Hc5TimeoutConfig value) {
        this.timeoutConfig = Objects.requireNonNull(value);
        return this;
    }

    /**
     * Controls Apache HttpClient automatic retries. Disabled by default so retries are explicit.
     * This setting is independent of {@link #retryOnRateLimit(boolean)}.
     *
     * @param value whether HC5 automatic retries are enabled
     * @return this builder
     */
    public Hc5ApiClientBuilder automaticRetries(boolean value) {
        this.automaticRetries = value;
        return this;
    }

    /**
     * Enables native HC5 request and connection pool metrics. Metrics remain disabled when this
     * method is not called.
     *
     * @param value immutable metrics configuration containing the target registry
     * @return this builder
     */
    public Hc5ApiClientBuilder metrics(Hc5MetricsConfig value) {
        this.metricsConfig = Objects.requireNonNull(value);
        return this;
    }

    /**
     * Adds an HC5 request interceptor. Interceptors are cumulative and run in registration order after
     * fixed bearer authentication.
     *
     * @param value request interceptor
     * @return this builder
     */
    public Hc5ApiClientBuilder addRequestInterceptor(HttpRequestInterceptor value) {
        this.requestInterceptors.add(Objects.requireNonNull(value));
        return this;
    }

    /**
     * Adds an HC5 response interceptor. Interceptors are cumulative and run in registration order.
     *
     * @param value response interceptor
     * @return this builder
     */
    public Hc5ApiClientBuilder addResponseInterceptor(HttpResponseInterceptor value) {
        this.responseInterceptors.add(Objects.requireNonNull(value));
        return this;
    }

    /**
     * Adds a connection configuration customizer. Customizers are cumulative and run after SDK defaults.
     *
     * @param value connection configuration customizer
     * @return this builder
     */
    public Hc5ApiClientBuilder customizeConnectionConfig(Consumer<ConnectionConfig.Builder> value) {
        this.connectionConfigCustomizers.add(Objects.requireNonNull(value));
        return this;
    }

    /**
     * Adds a request configuration customizer. Customizers are cumulative and run after SDK defaults.
     *
     * @param value request configuration customizer
     * @return this builder
     */
    public Hc5ApiClientBuilder customizeRequestConfig(Consumer<RequestConfig.Builder> value) {
        this.requestConfigCustomizers.add(Objects.requireNonNull(value));
        return this;
    }

    /**
     * Adds a connection manager customizer. Customizers are cumulative and run after pool defaults.
     *
     * @param value connection manager builder customizer
     * @return this builder
     */
    public Hc5ApiClientBuilder customizeConnectionManager(
            Consumer<PoolingHttpClientConnectionManagerBuilder> value) {
        this.connectionManagerCustomizers.add(Objects.requireNonNull(value));
        return this;
    }

    /**
     * Adds an HTTP client customizer. Customizers are cumulative and run after SDK defaults. The SDK owned
     * connection manager and optional metrics are attached after these customizers.
     *
     * @param value HTTP client builder customizer
     * @return this builder
     */
    public Hc5ApiClientBuilder customizeHttpClient(Consumer<HttpClientBuilder> value) {
        this.httpClientCustomizers.add(Objects.requireNonNull(value));
        return this;
    }

}
