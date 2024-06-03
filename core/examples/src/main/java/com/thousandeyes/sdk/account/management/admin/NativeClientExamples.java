package com.thousandeyes.sdk.account.management.admin;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.NativeApiClient;



class NativeClientExamples {
    private ApiClient apiClient = NativeApiClient
            .builder()
            .baseUri("https://api.stg.thousandeyes.com")
            .bearerToken("<<aToken>>")
            .build();

    public static void main(String[] args) {
        //TODO
    }
}
