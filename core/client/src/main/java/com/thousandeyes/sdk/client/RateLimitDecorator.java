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

import java.time.Instant;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;



public final class RateLimitDecorator extends ApiClientDecorator {
    private static final List<String> RATE_LIMIT_RESET_HEADERS =
            List.of("x-organization-rate-limit-reset", "x-instant-test-rate-limit-reset");
    private static final int TOO_MANY_REQUESTS = 429;

    public RateLimitDecorator(ApiClient apiClient) {
        super(apiClient);
    }

    private <T> T awaitAndRetry(ApiException apiException, Callable<T> requestCallable)
            throws ApiException
    {
        OptionalLong retryAfterInSeconds = retryAfterInSeconds(apiException.getResponseHeaders());
        if (retryAfterInSeconds.isPresent()) {
            try {
                TimeUnit.SECONDS.sleep(retryAfterInSeconds.getAsLong());
                return requestCallable.call();
            }
            catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
                throw new ApiException(ex);
            }
            catch (ApiException e) {
                throw e;
            }
            catch (Exception e) {
                throw new ApiException(e);
            }
        }
        // If we can't find rate limit headers, just re-throw original exception
        throw apiException;
    }

    private OptionalLong retryAfterInSeconds(Map<String, ? extends Collection<String>> headers) {
        return RATE_LIMIT_RESET_HEADERS.stream()
                                       .flatMap(headerName -> Optional.ofNullable(
                                               headers.get(headerName)).stream())
                                       .flatMap(Collection::stream)
                                       .mapToLong(Long::parseLong)
                                       .map(rlResetInstant -> rlResetInstant -
                                                              Instant.now().getEpochSecond())
                                       .max();
    }

    public <T> ApiResponse<T> decorate(Callable<ApiResponse<T>> requestCallable)
            throws ApiException
    {
        try {
            return requestCallable.call();
        }
        catch (ApiException e) {
            if (e.getCode() == TOO_MANY_REQUESTS) {
                return awaitAndRetry(e, requestCallable);
            }
            throw e;
        }
        catch (Exception e) {
            // This really shouldn't be possible, but Callable doesn't know that
            throw new ApiException(e);
        }
    }
}
