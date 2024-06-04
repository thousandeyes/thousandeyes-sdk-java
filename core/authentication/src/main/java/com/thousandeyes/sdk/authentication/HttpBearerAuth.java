package com.thousandeyes.sdk.authentication;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

import org.apache.commons.lang3.tuple.Pair;



public class HttpBearerAuth implements Authentication {
    private final String scheme;
    private Supplier<String> tokenSupplier;

    public HttpBearerAuth(String scheme) {
        this.scheme = scheme;
    }

    public String getBearerToken() {
        return tokenSupplier.get();
    }

    public void setBearerToken(String bearerToken) {
        this.tokenSupplier = () -> bearerToken;
    }

    public void setBearerToken(Supplier<String> tokenSupplier) {
        this.tokenSupplier = tokenSupplier;
    }

    @Override
    public void applyToParams(List<Pair<String, String>> queryParams,
                              Map<String, String> headerParams,
                              Map<String, String> cookieParams)
    {
        Optional.ofNullable(tokenSupplier)
                .map(Supplier::get)
                .ifPresent(t -> putToken(t, headerParams));
    }

    private void putToken(String token, Map<String, String> headerParams) {
        var normalizedScheme = (scheme != null ? upperCaseBearer(scheme) + " " : "");
        headerParams.put("Authorization", normalizedScheme + token);
    }

    private static String upperCaseBearer(String scheme) {
        return ("bearer".equalsIgnoreCase(scheme)) ? "Bearer" : scheme;
    }
}
