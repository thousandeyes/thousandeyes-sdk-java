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

package com.thousandeyes.sdk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.Instant;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.ApiRequest;
import com.thousandeyes.sdk.client.ApiResponse;
import com.thousandeyes.sdk.client.RateLimitDecorator;



public class RateLimitDecoratorTest {

    private static final int TOO_MANY_REQUESTS = 429;
    private final ApiResponse<String> okResponse = new ApiResponse<>(200, Map.of(), "ok");
    @Mock
    private ApiClient client = Mockito.mock(ApiClient.class);
    private RateLimitDecorator rlClient = new RateLimitDecorator(client);

    private static String getTimeInSeconds(Instant instant) {
        return Long.toString(instant.getEpochSecond());
    }

    @Test
    void shouldNotAwaitOtherStatusCode() throws ApiException {
        when(client.<String>send(any(), eq(String.class))).thenReturn(okResponse);
        var response = rlClient.send(mock(ApiRequest.class), String.class);
        assertEquals(response, okResponse);
    }

    @Test
    void shouldThrowIfApiExceptionHasOtherStatusCode() throws ApiException {
        var exception = new ApiException(401, Map.of(), null);
        when(client.send(any(), any())).thenThrow(exception);
        assertThrows(ApiException.class, () -> rlClient.send(null, null));
    }

    @Test
    void shouldThrowIfApiExceptionHasNoHeaders() throws ApiException {
        var exception = new ApiException(TOO_MANY_REQUESTS, Map.of(), null);
        when(client.send(any(), any())).thenThrow(exception);
        assertThrows(ApiException.class, () -> rlClient.send(null, null));
    }

    @ParameterizedTest
    @ValueSource(strings = { "x-organization-rate-limit-reset", "x-instant-test-rate-limit-reset" })
    void shouldRetryProperRateLimitApiException(String header) throws ApiException {
        var resetTime = getTimeInSeconds(Instant.now().plusSeconds(2));
        Map<String, Collection<String>> headers = Map.of(header, List.of(resetTime));

        var exception = new ApiException(TOO_MANY_REQUESTS, headers, null);

        when(client.<String>send(any(), eq(String.class))).thenThrow(exception)
                                                          .thenReturn(okResponse);

        var response = rlClient.send(mock(ApiRequest.class), String.class);
        assertEquals(response, okResponse);
    }
}
