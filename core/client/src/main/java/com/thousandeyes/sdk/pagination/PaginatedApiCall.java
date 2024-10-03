package com.thousandeyes.sdk.pagination;

import com.thousandeyes.sdk.client.ApiException;



@FunctionalInterface
public interface PaginatedApiCall<R> {
    R call(String cursor) throws ApiException;
}
