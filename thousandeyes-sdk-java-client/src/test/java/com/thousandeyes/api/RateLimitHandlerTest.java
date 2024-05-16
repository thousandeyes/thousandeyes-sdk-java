package com.thousandeyes.api;

import static com.thousandeyes.api.client.RateLimitHandler.rateLimitResetAwait;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.InvocationTargetException;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.junit.jupiter.api.Test;

import com.thousandeyes.api.client.RateLimitHandler;



public class RateLimitHandlerTest {

    private static String getTimeInSeconds(Instant instant) {
        return Long.toString(instant.getEpochSecond());
    }

    @Test
    void shouldNotAwaitOtherStatusCode() throws InterruptedException {
        assertFalse(rateLimitResetAwait(200, Map.of()));
    }

    @Test
    void shouldNotAwaitIfNoHeaders() throws InterruptedException {
        assertFalse(rateLimitResetAwait(429, Map.of()));
    }

    @Test
    void shouldAwaitWhen429WithProperRLHeaders() throws InterruptedException {
        var headers =
                Map.of("x-organization-rate-limit-reset",
                       List.of(getTimeInSeconds(Instant.now().plusSeconds(2))));

        assertTrue(rateLimitResetAwait(429, headers));
    }

    @Test
    void shouldAwaitMaxResetStatusCode()
            throws NoSuchMethodException, InvocationTargetException,
                   IllegalAccessException
    {
        var now = Instant.now();
        var headers =
                Map.of("x-organization-rate-limit-reset",
                       List.of(getTimeInSeconds(now.plusSeconds(2))),
                       "x-instant-test-rate-limit-reset",
                       List.of(getTimeInSeconds(now.plusSeconds(10))));

        var retryAfterInSeconds = RateLimitHandler.class.getDeclaredMethod("retryAfterInSeconds",
                                                                           Map.class);
        retryAfterInSeconds.setAccessible(true); //if security settings allow this
        var awaitTimeInSeconds = (Optional<Long>) retryAfterInSeconds.invoke(null, headers);
        assertTrue(awaitTimeInSeconds.isPresent());
        assertTrue(awaitTimeInSeconds.get() > 2 && awaitTimeInSeconds.get() <= 10);
    }
}
