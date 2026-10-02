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

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringJoiner;

import org.apache.hc.client5.http.classic.methods.HttpUriRequestBase;
import org.apache.hc.client5.http.config.RequestConfig;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManager;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.Header;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.io.entity.ByteArrayEntity;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.apache.hc.core5.io.CloseMode;
import org.apache.hc.core5.util.Timeout;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Thread-safe Apache HttpClient 5 implementation of the ThousandEyes {@link ApiClient}.
 * Instances own their connection pool and eviction thread. Applications should normally share one
 * instance and call {@link #close()} during shutdown.
 */
public final class Hc5ApiClient implements ApiClient, AutoCloseable {
    private final String baseUri;
    private final CloseableHttpClient httpClient;
    private final PoolingHttpClientConnectionManager connectionManager;
    private final ObjectMapper mapper;
    private final RequestConfig defaultRequestConfig;

    Hc5ApiClient(String baseUri,
                 CloseableHttpClient httpClient,
                 PoolingHttpClientConnectionManager connectionManager,
                 ObjectMapper mapper,
                 RequestConfig defaultRequestConfig) {
        this.baseUri = baseUri;
        this.httpClient = httpClient;
        this.connectionManager = connectionManager;
        this.mapper = mapper;
        this.defaultRequestConfig = defaultRequestConfig;
    }

    /**
     * Creates a builder initialized with production defaults.
     *
     * @return a new client builder
     */
    public static Hc5ApiClientBuilder builder() {
        return new Hc5ApiClientBuilder();
    }

    /**
     * Sends one SDK request and deserializes a successful response to the supplied type.
     * @param request SDK request definition
     * @param returnType response body type, including parameterized generic types
     * @param <T> response body type
     * @return response status, headers, and deserialized data
     * @throws ApiException when transport, serialization, or non-2xx response processing fails
     */
    @Override
    public <T> ApiResponse<T> send(ApiRequest request, Type returnType) throws ApiException {
        HttpUriRequestBase httpRequest = createRequest(request);
        ProcessedResponse<T> result;
        try {
            result = httpClient.execute(httpRequest, response -> processResponse(response, returnType));
        }
        catch (IOException | RuntimeException e) {
            throw new ApiException(e);
        }
        if (result.error() != null) {
            throw result.error();
        }
        return result.response();
    }

    private HttpUriRequestBase createRequest(ApiRequest request) throws ApiException {
        HttpUriRequestBase httpRequest = new HttpUriRequestBase(request.getMethod(), requestUri(request));
        RequestConfig config = defaultRequestConfig;
        if (request.getReadTimeout() != null) {
            config = RequestConfig.copy(defaultRequestConfig)
                                  .setResponseTimeout(Timeout.of(request.getReadTimeout()))
                                  .build();
        }
        httpRequest.setConfig(config);
        request.getHeaders().forEach((name, values) ->
                values.forEach(value -> httpRequest.addHeader(name, value)));
        httpRequest.setEntity(requestEntity(request.getRequestBody()));
        return httpRequest;
    }

    private URI requestUri(ApiRequest request) {
        if (request.getQueryParams() == null || request.getQueryParams().isEmpty()) {
            return URI.create(baseUri + request.getPath());
        }
        StringJoiner query = new StringJoiner("&");
        request.getQueryParams().forEach(parameter ->
                query.add(parameter.getKey() + "=" + parameter.getValue()));
        return URI.create(baseUri + request.getPath() + "?" + query);
    }

    private HttpEntity requestEntity(Object body) throws ApiException {
        if (body == null) {
            return null;
        }
        if (body instanceof String) {
            return new StringEntity((String) body, (org.apache.hc.core5.http.ContentType) null);
        }
        try {
            return new ByteArrayEntity(mapper.writeValueAsBytes(body), null);
        }
        catch (IOException e) {
            throw new ApiException(e);
        }
    }

    private <T> ProcessedResponse<T> processResponse(ClassicHttpResponse response, Type returnType)
            throws IOException {
        int status = response.getCode();
        Map<String, List<String>> headers = headers(response.getHeaders());
        HttpEntity entity = response.getEntity();
        if (status < 200 || status >= 300) {
            return new ProcessedResponse<>(null, new ApiException(status, headers, responseBody(entity)));
        }
        JavaType responseType = mapper.constructType(returnType);
        if (entity == null || responseType.hasRawClass(Void.class)) {
            return new ProcessedResponse<>(new ApiResponse<>(status, headers, null), null);
        }
        T data = mapper.readValue(entity.getContent(), responseType);
        return new ProcessedResponse<>(new ApiResponse<>(status, headers, data), null);
    }

    private String responseBody(HttpEntity entity) throws IOException {
        if (entity == null) {
            return "";
        }
        return new String(entity.getContent().readAllBytes(), StandardCharsets.UTF_8);
    }

    private Map<String, List<String>> headers(Header[] responseHeaders) {
        Map<String, List<String>> result = new LinkedHashMap<>();
        for (Header header : responseHeaders) {
            result.computeIfAbsent(header.getName().toLowerCase(Locale.ROOT), ignored -> new ArrayList<>())
                  .add(header.getValue());
        }
        return result;
    }

    private record ProcessedResponse<T>(ApiResponse<T> response, ApiException error) {
    }

    /**
     * Gracefully closes the Apache client, its owned connection pool, and its eviction thread.
     * Calling this method more than once is safe.
     */
    @Override
    public void close() {
        httpClient.close(CloseMode.GRACEFUL);
    }

    /**
     * Returns the normalized base URI used to resolve API request paths.
     *
     * @return configured base URI
     */
    public String getBaseUri() {
        return baseUri;
    }

    /**
     * Returns the owned Apache client for diagnostics and advanced integrations.
     * Closing this object closes the SDK client.
     *
     * @return underlying closeable Apache client
     */
    public CloseableHttpClient getHttpClient() {
        return httpClient;
    }

    /**
     * Returns the owned pooling connection manager.
     *
     * @return client connection manager
     */
    public PoolingHttpClientConnectionManager getConnectionManager() {
        return connectionManager;
    }

    /**
     * Returns the mapper used for request and response bodies.
     *
     * @return configured object mapper
     */
    public ObjectMapper getMapper() {
        return mapper;
    }

    /**
     * Returns the default request configuration after builder defaults and customizers were applied.
     * Per-request response timeouts are derived from this configuration.
     *
     * @return default HC5 request configuration
     */
    public RequestConfig getDefaultRequestConfig() {
        return defaultRequestConfig;
    }

}
