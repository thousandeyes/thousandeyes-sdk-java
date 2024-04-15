package com.thousandeyes.api.authentication;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.tuple.Pair;

public interface Authentication {
    void applyToParams(List<Pair<String, String>> queryParams, Map<String, String> headerParams, Map<String, String> cookieParams);
}
