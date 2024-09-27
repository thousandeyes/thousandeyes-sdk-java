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

package com.thousandeyes.sdk.authentication;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

import org.apache.commons.lang3.tuple.Pair;



public class HttpBearerAuth implements Authentication {
    private final String scheme;
    private Supplier<String> tokenSupplier;

    public HttpBearerAuth(String scheme) {
        this.scheme = scheme;
    }

    public void setBearerToken(String bearerToken) {
        this.tokenSupplier = () -> bearerToken;
    }

    @Override
    public void applyToParams(List<Pair<String, String>> queryParams,
                              Map<String, String> headerParams,
                              Map<String, String> cookieParams)
    {
        Optional.ofNullable(tokenSupplier)
                .map(Supplier::get)
                .ifPresent(t -> putToken(t, headerParams));
    }

    private void putToken(String token, Map<String, String> headerParams) {
        var normalizedScheme = (scheme != null ? upperCaseBearer(scheme) + " " : "");
        headerParams.put("Authorization", normalizedScheme + token);
    }

    private static String upperCaseBearer(String scheme) {
        return ("bearer".equalsIgnoreCase(scheme)) ? "Bearer" : scheme;
    }
}
