package com.thousandeyes.api.client;

import java.util.List;

import lombok.RequiredArgsConstructor;



@RequiredArgsConstructor
public class ApiClientDecorator implements ApiClient {
    private final ApiClient apiClient;

    @Override
    public <T> ApiResponse<T> send(ApiRequest request, Class<T> returnType)
            throws ApiException
    {
        return apiClient.send(request, returnType);
    }

    @Override
    public <T> ApiResponse<List<T>> sendForList(ApiRequest request, Class<T> returnType)
            throws ApiException
    {
        return apiClient.sendForList(request, returnType);
    }
}
