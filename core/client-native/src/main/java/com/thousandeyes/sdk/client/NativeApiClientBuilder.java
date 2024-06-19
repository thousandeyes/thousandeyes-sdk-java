/*
 * Copyright 2024 Cisco Systems, Inc. and its affiliates
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

import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Setter;
import lombok.experimental.Accessors;

import com.thousandeyes.sdk.authentication.Authentication;
import com.thousandeyes.sdk.authentication.HttpBearerAuth;
import com.thousandeyes.sdk.serialization.JSON;



@Setter
@Accessors(fluent = true)
public class NativeApiClientBuilder {
    private static Map<String, Authentication> authentications = Map.of(
            HttpBearerAuth.class.getSimpleName(), new HttpBearerAuth("Bearer")
    );
    private HttpClient.Builder httpClientBuilder = HttpClient.newBuilder();
    private ObjectMapper mapper = JSON.getDefault().getMapper();
    private String baseUri = "https://api.thousandeyes.com";
    private Consumer<HttpRequest.Builder> interceptor;
    private Consumer<HttpResponse<InputStream>> responseInterceptor;
    private Duration connectTimeout;
    private String bearerToken;
    private boolean defaultRateLimitingEnabled = true;

    public ApiClient build() {
        var baseUri = parseBaseUri(this.baseUri);
        if (this.connectTimeout != null) {
            this.httpClientBuilder.connectTimeout(this.connectTimeout);
        }
        if (StringUtils.isNotBlank(bearerToken)) {
            setBearerTokenInterceptor();
        }
        ApiClient client = new NativeApiClient(
                baseUri,
                this.httpClientBuilder.build(),
                this.mapper,
                this.interceptor,
                this.responseInterceptor
        );

        if (this.defaultRateLimitingEnabled) {
            client = new RateLimitDecorator(client);
        }

        return client;
    }

    private String parseBaseUri(String baseUri) {
        URI uri = URI.create(baseUri);
        var port = uri.getPort();
        return uri.getScheme() + "://" + uri.getHost() + (port == -1 ? "" : ":" + port) +
               uri.getRawPath();
    }

    private void setBearerTokenInterceptor() {
        var bearerAuth = authentications.get(HttpBearerAuth.class.getSimpleName());
        if (bearerAuth == null) {
            throw new RuntimeException("Client has no Bearer authentication configured!");
        }

        ((HttpBearerAuth) bearerAuth).setBearerToken(bearerToken);
        if (this.interceptor != null) {
            this.interceptor = this.interceptor
                    .andThen(authInterceptor(bearerAuth));
        }
        else {
            this.interceptor = authInterceptor(bearerAuth);
        }
    }

    private Consumer<HttpRequest.Builder> authInterceptor(Authentication auth) {
        return rb -> {
            var headers = new HashMap<String, String>();
            auth.applyToParams(null, headers, null);
            headers.forEach(rb::header);
        };
    }
}
