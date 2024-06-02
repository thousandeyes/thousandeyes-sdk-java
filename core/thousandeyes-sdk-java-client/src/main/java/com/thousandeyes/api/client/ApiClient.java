package com.thousandeyes.api.client;

import java.util.List;



public interface ApiClient {
    <T> ApiResponse<T> send(ApiRequest request, Class<T> returnType) throws ApiException;

    <T> ApiResponse<List<T>> sendForList(ApiRequest request, Class<T> returnType)
            throws ApiException;
}
