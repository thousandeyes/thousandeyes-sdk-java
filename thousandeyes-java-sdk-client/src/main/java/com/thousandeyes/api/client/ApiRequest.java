package com.thousandeyes.api.client;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.tuple.Pair;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;



@Builder
@Getter
public class ApiRequest {
    String method;
    String path;
    Object requestBody;
    List<Pair<String, String>> queryParams;
    @Singular
    Map<String, List<String>> headers;
    Duration readTimeout;
}
