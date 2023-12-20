/*
 * Test Templates API
 *  ## Overview  Test templates allow you create a set of tests, alert rules, dashboards, and labels from a single template configuration file.    The following applies to test templates:  * You can create tests for monitoring common services and applications such as Microsoft 365, Webex, and others using a predefined set of certified templates.  * Test templates reduce the time and complexity of creating tests for common SaaS or other services by providing a set of templates for creating tests, alert rules, and other assets within the ThousandEyes platform.  * Templates created with an account group in a particular organization are visible to all account groups in that organization, provided they have the `View Test Templates` permission.  * Credentials (usernames, passwords, tokens, etc.) can be included in a test template only as placeholders whose value is provided by user input when the template is deployed. Creating or updating a test template that contains a credentials field in plain text will result in a bad request (HTTP 400).  * The schemas to use for `labels`, `tests`, `alertRules` and `dashboards` are defined at https://developer.thousandeyes.com/v7/.  * To support referencing an asset from another asset of a different type (for example, defining the `testId` field of an `alertRule` by referencing the ID of a test defined in the template itself), the deployment of assets is done in a specific order:      1. Labels     2. Tests     3. Alert rules     4. Dashboards      For a given asset type, you can reference any asset type with a higher order. (For example, labels cannot reference other assets in the template; tests can only reference labels; alert rules can reference tests and labels, etc.)
 *
 * The version of the OpenAPI document: 7.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api;

import okhttp3.*;
import okio.Buffer;
import okio.BufferedSink;
import okio.GzipSink;
import okio.Okio;

import java.io.IOException;

/**
 * Encodes request bodies using gzip.
 *
 * Taken from https://github.com/square/okhttp/issues/350
 */
class GzipRequestInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request originalRequest = chain.request();
        if (originalRequest.body() == null || originalRequest.header("Content-Encoding") != null) {
            return chain.proceed(originalRequest);
        }

        Request compressedRequest = originalRequest.newBuilder()
                                                   .header("Content-Encoding", "gzip")
                                                   .method(originalRequest.method(), forceContentLength(gzip(originalRequest.body())))
                                                   .build();
        return chain.proceed(compressedRequest);
    }

    private RequestBody forceContentLength(final RequestBody requestBody) throws IOException {
        final Buffer buffer = new Buffer();
        requestBody.writeTo(buffer);
        return new RequestBody() {
            @Override
            public MediaType contentType() {
                return requestBody.contentType();
            }

            @Override
            public long contentLength() {
                return buffer.size();
            }

            @Override
            public void writeTo(BufferedSink sink) throws IOException {
                sink.write(buffer.snapshot());
            }
        };
    }

    private RequestBody gzip(final RequestBody body) {
        return new RequestBody() {
            @Override
            public MediaType contentType() {
                return body.contentType();
            }

            @Override
            public long contentLength() {
                return -1; // We don't know the compressed length in advance!
            }

            @Override
            public void writeTo(BufferedSink sink) throws IOException {
                BufferedSink gzipSink = Okio.buffer(new GzipSink(sink));
                body.writeTo(gzipSink);
                gzipSink.close();
            }
        };
    }
}
