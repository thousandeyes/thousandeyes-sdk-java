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
import java.util.List;
import java.util.Objects;

import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.converter.json.JacksonJsonHttpMessageConverter;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestClient;

import tools.jackson.databind.json.JsonMapper;

import com.thousandeyes.sdk.serialization.JSON;

/**
 * Builds a thread-safe {@link SpringApiClient} from Spring's {@link RestClient.Builder}. Builder
 * instances are mutable and are not thread-safe. Interceptors are cumulative and run in
 * registration order.
 */
public final class SpringApiClientBuilder {
    private RestClient.Builder restClientBuilder;
    private URI baseUri = URI.create("https://api.thousandeyes.com/v7");
    private String bearerToken;
    private boolean retryOnRateLimit = true;
    private ClientHttpRequestFactory requestFactory;
    private JsonMapper objectMapper = (JsonMapper) JSON.getDefault().getMapper();
    private ResponseErrorHandler responseErrorHandler = new Non2xxResponseErrorHandler();
    private final List<ClientHttpRequestInterceptor> requestInterceptors = new ArrayList<>();

    SpringApiClientBuilder(RestClient.Builder restClientBuilder) {
        this.restClientBuilder = Objects.requireNonNull(restClientBuilder);
    }

    /**
     * Clones the supplied Spring builder and creates an SDK client. The clone retains the supplied
     * request factory, observation registry, and other Spring configuration. Its JSON converter
     * uses the SDK mapper so request and response serialization match the other SDK clients.
     *
     * @return configured API client, optionally decorated with SDK rate-limit retries
     */
    public ApiClient build() {
        RestClient.Builder springBuilder = restClientBuilder.clone().baseUrl(baseUri);
        configureJsonMessageConverter(springBuilder);
        if (requestFactory != null) {
            springBuilder.requestFactory(requestFactory);
        }
        if (bearerToken != null && !bearerToken.isBlank()) {
            String configuredBearerToken = bearerToken;
            springBuilder.requestInterceptor((request, body, execution) -> {
                request.getHeaders().setBearerAuth(configuredBearerToken);
                return execution.execute(request, body);
            });
        }
        requestInterceptors.forEach(springBuilder::requestInterceptor);

        ApiClient client = new SpringApiClient(
                baseUri,
                springBuilder.build(),
                responseErrorHandler);
        if (retryOnRateLimit) {
            return new RateLimitDecorator(client);
        }
        return client;
    }

    private void configureJsonMessageConverter(RestClient.Builder springBuilder) {
        var jsonConverter = new JacksonJsonHttpMessageConverter(objectMapper);
        springBuilder.configureMessageConverters(builder -> builder.withJsonConverter(jsonConverter));
    }

    /**
     * Replaces the Spring builder that will be cloned when the client is built. Supplying Spring
     * Boot's managed builder enables its configured observations and HTTP client metrics.
     *
     * @param value Spring RestClient builder
     * @return this builder
     */
    public SpringApiClientBuilder restClientBuilder(RestClient.Builder value) {
        this.restClientBuilder = Objects.requireNonNull(value);
        return this;
    }

    /**
     * Sets the API base URI. The default is {@code https://api.thousandeyes.com/v7}.
     *
     * @param value absolute base URI without a trailing request path
     * @return this builder
     */
    public SpringApiClientBuilder baseUri(URI value) {
        this.baseUri = Objects.requireNonNull(value);
        return this;
    }

    /**
     * Sets a fixed bearer token. Blank values disable fixed bearer authentication. Fixed
     * authentication runs after interceptors inherited from the supplied Spring builder and before
     * caller supplied interceptors, which can replace it with request scoped authentication.
     *
     * @param value token value without the {@code Bearer } prefix
     * @return this builder
     */
    public SpringApiClientBuilder bearerToken(String value) {
        this.bearerToken = value;
        return this;
    }

    /**
     * Enables the SDK retry for HTTP 429 responses that contain a supported reset header. Enabled
     * by default. Apache HttpClient also retries some 429 responses by default; disable its
     * automatic retries on the application-owned request factory when this SDK retry is enabled.
     * Disable this retry when another layer owns rate-limit retries.
     *
     * @param value whether SDK rate-limit retry is enabled
     * @return this builder
     */
    public SpringApiClientBuilder retryOnRateLimit(boolean value) {
        this.retryOnRateLimit = value;
        return this;
    }

    /**
     * Sets the Spring request factory used by the client. The factory may be shared by multiple
     * clients and remains owned by the caller or Spring application context.
     *
     * @param value Spring request factory
     * @return this builder
     */
    public SpringApiClientBuilder requestFactory(ClientHttpRequestFactory value) {
        this.requestFactory = Objects.requireNonNull(value);
        return this;
    }

    /**
     * Sets the Jackson mapper used to serialize request bodies and deserialize responses. The
     * default is {@code JSON.getDefault().getMapper()}, which provides the SDK's generated-model
     * serialization behavior. The mapper must be safe for concurrent use after the client is built.
     *
     * @param value Jackson JSON mapper
     * @return this builder
     */
    public SpringApiClientBuilder objectMapper(JsonMapper value) {
        this.objectMapper = Objects.requireNonNull(value);
        return this;
    }

    /**
     * Sets the Spring error handler applied to every response. The default treats every non-2xx
     * response as an error.
     *
     * @param value Spring response error handler
     * @return this builder
     */
    public SpringApiClientBuilder responseErrorHandler(ResponseErrorHandler value) {
        this.responseErrorHandler = Objects.requireNonNull(value);
        return this;
    }

    /**
     * Adds a Spring request interceptor. Interceptors are cumulative and run after interceptors
     * already present on the supplied Spring builder and fixed bearer authentication.
     *
     * @param value request interceptor
     * @return this builder
     */
    public SpringApiClientBuilder addRequestInterceptor(ClientHttpRequestInterceptor value) {
        requestInterceptors.add(Objects.requireNonNull(value));
        return this;
    }

}
