package com.thousandeyes.sdk.pagination;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

import com.thousandeyes.sdk.client.ApiException;



public interface PaginatedApi {

    PaginatedResponse getItems(String aid, String window, String cursor) throws ApiException;

    record PaginatedResponse(List<Item> items, @JsonProperty("_links") @Getter Links links) {
    }



    record Item(String id, String name) {
    }



    record Links(@Getter Link next, Link self) {
    }



    record Link(@Getter String href) {
    }
}
