package com.thousandeyes.api.account.management.admin;

import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.client.NativeApiClient;



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
