package com.thousandeyes.api.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeUnit;



public final class RateLimitDecorator extends ApiClientDecorator {
    private static final List<String> rateLimitResetHeaders =
            List.of("x-organization-rate-limit-reset", "x-instant-test-rate-limit-reset");
    private static final int TOO_MANY_REQUESTS = 429;

    public RateLimitDecorator(ApiClient apiClient) {
        super(apiClient);
    }

    private boolean awaitIfRateLimitApiException(ApiException e)
            throws ApiException
    {
        Optional<Long> retryAfterInSeconds;
        if (TOO_MANY_REQUESTS == e.getCode() &&
            ((retryAfterInSeconds = retryAfterInSeconds(e.getResponseHeaders())).isPresent()))
        {
            try {
                TimeUnit.SECONDS.sleep(retryAfterInSeconds.get());
            }
            catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
                throw new ApiException(ex);
            }
            return true;
        }
        return false;
    }

    private Optional<Long> retryAfterInSeconds(Map<String, List<String>> headers) {
        return rateLimitResetHeaders.stream()
                                    .flatMap(headerName -> headers.getOrDefault(headerName,
                                                                                List.of())
                                                                  .stream())
                                    .map(Long::parseLong)
                                    .map(rlResetInstant -> rlResetInstant -
                                                           Instant.now().getEpochSecond())
                                    .max(Long::compareTo);
    }

    @Override
    public <T> ApiResponse<T> send(ApiRequest request, Class<T> returnType) throws ApiException {
        return sendWithRateLimitHandling(() -> super.send(request, returnType));
    }

    @Override
    public <T> ApiResponse<List<T>> sendForList(ApiRequest request, Class<T> returnType)
            throws ApiException
    {
        return sendWithRateLimitHandling(() -> super.sendForList(request, returnType));
    }

    private <T> T sendWithRateLimitHandling(Supplier<T> requestSupplier)
            throws ApiException
    {
        try {
            return requestSupplier.get();
        }
        catch (ApiException e) {
            if (awaitIfRateLimitApiException(e)) {
                return requestSupplier.get();
            }
            throw e;
        }
    }

    @FunctionalInterface
    private interface Supplier<T> {
        T get() throws ApiException;
    }
}
