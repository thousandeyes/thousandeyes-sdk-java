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

import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * Thread-safe Spring {@link RestClient} implementation of the ThousandEyes {@link ApiClient}.
 * Transport configuration and lifecycle are owned by the supplied Spring builder and its request
 * factory.
 */
@Getter
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public final class SpringApiClient implements ApiClient {
    private final URI baseUri;
    private final RestClient restClient;
    private final ResponseErrorHandler responseErrorHandler;

    /**
     * Creates a builder backed by a new Spring {@link RestClient.Builder}.
     *
     * @return a new client builder
     */
    public static SpringApiClientBuilder builder() {
        return new SpringApiClientBuilder(RestClient.builder());
    }

    /**
     * Creates a builder from a Spring managed builder. The supplied builder is cloned during
     * {@link SpringApiClientBuilder#build()}, preserving its observation registry, request factory,
     * and other Spring customizations without mutating the original. JSON conversion uses the SDK
     * mapper.
     *
     * @param restClientBuilder Spring RestClient builder to clone
     * @return a new client builder
     */
    public static SpringApiClientBuilder builder(RestClient.Builder restClientBuilder) {
        return new SpringApiClientBuilder(restClientBuilder);
    }

    /**
     * Sends one SDK request through Spring RestClient and converts a successful response using the
     * message converters configured on the RestClient builder.
     *
     * @param request SDK request definition
     * @param returnType response body type, including parameterized generic types
     * @param <T> response body type
     * @return response status, headers, and converted data
     * @throws ApiException when transport, conversion, or non-2xx response processing fails
     */
    @Override
    public <T> ApiResponse<T> send(ApiRequest request, Type returnType) throws ApiException {
        try {
            RestClient.RequestBodySpec requestSpec = restClient
                    .method(HttpMethod.valueOf(request.getMethod()))
                    .uri(requestUri(request));
            request.getHeaders().forEach((name, values) ->
                    values.forEach(value -> requestSpec.header(name, value)));
            if (request.getRequestBody() != null) {
                requestSpec.body(request.getRequestBody());
            }
            ParameterizedTypeReference<T> responseType = ParameterizedTypeReference.forType(returnType);
            ResponseEntity<T> response = requestSpec.retrieve()
                    .onStatus(responseErrorHandler)
                    .toEntity(responseType);
            return new ApiResponse<>(
                    response.getStatusCode().value(),
                    headers(response.getHeaders()),
                    response.getBody());
        }
        catch (RestClientResponseException e) {
            HttpHeaders responseHeaders = e.getResponseHeaders();
            throw new ApiException(
                    e.getStatusCode().value(),
                    responseHeaders == null ? Map.of() : headers(responseHeaders),
                    e.getResponseBodyAsString());
        }
        catch (RuntimeException e) {
            throw new ApiException(e);
        }
    }

    private URI requestUri(ApiRequest request) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromUri(baseUri)
                .path(request.getPath());
        if (request.getQueryParams() != null) {
            request.getQueryParams().forEach(parameter ->
                    builder.queryParam(parameter.getKey(), parameter.getValue()));
        }
        return builder.build(true).toUri();
    }

    private Map<String, List<String>> headers(HttpHeaders responseHeaders) {
        Map<String, List<String>> result = new LinkedHashMap<>();
        responseHeaders.forEach((name, values) -> result
                .computeIfAbsent(name.toLowerCase(Locale.ROOT), ignored -> new ArrayList<>())
                .addAll(values));
        return result;
    }

}
