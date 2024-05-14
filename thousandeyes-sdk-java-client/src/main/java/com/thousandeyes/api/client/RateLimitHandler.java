package com.thousandeyes.api.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeUnit;



public final class RateLimitHandler {
    private static final List<String> rateLimitResetHeaders =
            List.of("x-organization-rate-limit-reset", "x-instant-test-rate-limit-reset");
    private static final int TOO_MANY_REQUESTS = 429;

    public static boolean rateLimitResetAwait(int statusCode, Map<String, List<String>> headers)
            throws InterruptedException
    {
        Optional<Long> retryAfterInSeconds;
        if (TOO_MANY_REQUESTS == statusCode &&
            ((retryAfterInSeconds = retryAfterInSeconds(headers)).isPresent()))
        {
            TimeUnit.SECONDS.sleep(retryAfterInSeconds.get());
            return true;
        }
        return false;
    }

    private static Optional<Long> retryAfterInSeconds(Map<String, List<String>> headers) {
        return rateLimitResetHeaders.stream()
                                    .flatMap(headerName -> headers.getOrDefault(headerName,
                                                                                List.of())
                                                                  .stream())
                                    .map(Long::parseLong)
                                    .map(rlResetInstant -> rlResetInstant -
                                                           Instant.now().getEpochSecond())
                                    .max(Long::compareTo);
    }
}
