package com.thousandeyes.api.client;

import java.util.List;
import java.util.Map;

import lombok.Getter;



@Getter
public class ApiException extends Exception {
    private int code = 0;
    private Map<String, List<String>> responseHeaders = null;
    private Object responseBody = null;

    public ApiException() {}

    public ApiException(Throwable throwable) {
        super(throwable);
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(String message, Throwable throwable, int code, Map<String, List<String>> responseHeaders, Object responseBody) {
        super(message, throwable);
        this.code = code;
        this.responseHeaders = responseHeaders;
        this.responseBody = responseBody;
    }

    public ApiException(String message, int code, Map<String, List<String>> responseHeaders, Object responseBody) {
        this(message, null, code, responseHeaders, responseBody);
    }

    public ApiException(String message, Throwable throwable, int code, Map<String, List<String>> responseHeaders) {
        this(message, throwable, code, responseHeaders, null);
    }

    public ApiException(int code, Map<String, List<String>> responseHeaders, Object responseBody) {
        this(null, null, code, responseHeaders, responseBody);
    }

    public ApiException(int code, String message) {
        super(message);
        this.code = code;
    }

    public ApiException(int code, String message, Map<String, List<String>> responseHeaders, Object responseBody) {
        this(code, message);
        this.responseHeaders = responseHeaders;
        this.responseBody = responseBody;
    }
}
