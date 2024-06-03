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
