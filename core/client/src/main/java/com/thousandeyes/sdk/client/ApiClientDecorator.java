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

import java.util.List;
import java.util.concurrent.Callable;

import lombok.RequiredArgsConstructor;



@RequiredArgsConstructor
public abstract class ApiClientDecorator implements ApiClient {
    private final ApiClient apiClient;

    @Override
    public final <T> ApiResponse<T> send(ApiRequest request, Class<T> returnType)
            throws ApiException
    {
        return decorate(() -> apiClient.send(request, returnType));
    }

    @Override
    public final <T> ApiResponse<List<T>> sendForList(ApiRequest request, Class<T> returnType)
            throws ApiException
    {
        return decorate(() -> apiClient.sendForList(request, returnType));
    }

    public abstract <T> ApiResponse<T> decorate(Callable<ApiResponse<T>> requestCallable)
            throws ApiException;
}
