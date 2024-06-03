package com.thousandeyes.sdk.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
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

    private OptionalLong retryAfterInSeconds(Map<String, List<String>> headers) {
        return RATE_LIMIT_RESET_HEADERS.stream()
                                       .flatMap(headerName -> headers.getOrDefault(headerName,
                                                                                   List.of())
                                                                     .stream())
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
