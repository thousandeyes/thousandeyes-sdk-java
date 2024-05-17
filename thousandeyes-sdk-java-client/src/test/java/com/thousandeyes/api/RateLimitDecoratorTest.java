package com.thousandeyes.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.Instant;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.client.ApiException;
import com.thousandeyes.api.client.ApiRequest;
import com.thousandeyes.api.client.ApiResponse;
import com.thousandeyes.api.client.RateLimitDecorator;



public class RateLimitDecoratorTest {

    private static final int TOO_MANY_REQUESTS = 429;
    private final ApiResponse<String> okResponse = new ApiResponse<>(200, Map.of(), "ok");
    @Mock
    private ApiClient client = Mockito.mock(ApiClient.class);
    @InjectMocks
    private RateLimitDecorator rlClient = new RateLimitDecorator(client);

    private static String getTimeInSeconds(Instant instant) {
        return Long.toString(instant.getEpochSecond());
    }

    //    @BeforeEach
    //    public void setup() {
    //        Mockito.reset(client);
    //    }

    @Test
    void shouldNotAwaitOtherStatusCode() throws ApiException {
        when(client.send(any(), eq(String.class))).thenReturn(okResponse);
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

    @Test
    void shouldRetryProperRateLimitApiException() throws ApiException {
        var now = Instant.now();
        var headers =
                Map.of("x-organization-rate-limit-reset",
                       List.of(getTimeInSeconds(now.plusSeconds(2))),
                       "x-instant-test-rate-limit-reset",
                       List.of(getTimeInSeconds(now.plusSeconds(10))));

        var exception = new ApiException(TOO_MANY_REQUESTS, headers, null);

        when(client.send(any(), eq(String.class))).thenThrow(exception)
                                                  .thenReturn(okResponse);

        var response = rlClient.send(mock(ApiRequest.class), String.class);
        assertEquals(response, okResponse);
    }
}
