package com.thousandeyes.api.client;

public interface ApiClient {
    <T> ApiResponse<T> send(ApiRequest request, Class<T> returnType) throws ApiException;
}
