package com.thousandeyes.api.client;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Consumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

import lombok.AllArgsConstructor;
import lombok.Getter;



@AllArgsConstructor
public class NativeApiClient implements ApiClient {
    @Getter
    private String baseUri;
    @Getter
    private HttpClient httpClient;
    @Getter
    private ObjectMapper mapper;
    @Getter
    private Consumer<HttpRequest.Builder> interceptor;
    @Getter
    private Consumer<HttpResponse<InputStream>> responseInterceptor;

    public static NativeApiClientBuilder builder() {
        return new NativeApiClientBuilder();
    }

    @Override
    public <T> ApiResponse<T> send(ApiRequest request, Class<T> returnType) throws ApiException {
        return sendRequestAndProcessResponse(
                getRequestBuilder(request),
                mapper.readerFor(returnType));
    }

    @Override
    public <T> ApiResponse<List<T>> sendForList(ApiRequest request, Class<T> returnType)
            throws ApiException
    {
        return sendRequestAndProcessResponse(
                getRequestBuilder(request),
                mapper.readerForListOf(returnType));
    }

    private HttpRequest.Builder getRequestBuilder(ApiRequest request) throws ApiException {
        var httpRequest = HttpRequest.newBuilder();

        if (request.getReadTimeout() != null) {
            httpRequest.timeout(request.getReadTimeout());
        }

        setPathAndQueryParams(httpRequest, request);

        setMethodAndBody(httpRequest, request);

        var requestHeaders = request.getHeaders();
        requestHeaders.forEach((k, lv) -> lv.forEach(v -> httpRequest.header(k, v)));

        if (this.interceptor != null) {
            this.interceptor.accept(httpRequest);
        }
        return httpRequest;
    }

    private <T> ApiResponse<T> sendRequestAndProcessResponse(HttpRequest.Builder httpRequest,
                                                             ObjectReader reader)
            throws ApiException
    {
        try {
            var response = this.getHttpClient().send(httpRequest.build(),
                                                     HttpResponse.BodyHandlers.ofInputStream());
            if (responseInterceptor != null) {
                responseInterceptor.accept(response);
            }

            return processResponse(response, reader);
        }
        catch (IOException e) {
            throw new ApiException(e);
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new ApiException(e);
        }
    }

    private <T> ApiResponse<T> processResponse(HttpResponse<InputStream> response,
                                               ObjectReader reader)
            throws IOException, ApiException
    {
        try (var body = response.body()) {
            if (response.statusCode() / 100 != 2) {
                throw new ApiException(response.statusCode(),
                                       response.headers().map(),
                                       new String(body.readAllBytes()));
            }
            return new ApiResponse<>(
                    response.statusCode(),
                    response.headers().map(),
                    body == null ? null : reader.readValue(body)
            );
        }
    }

    private void setMethodAndBody(HttpRequest.Builder httpRequest, ApiRequest request)
            throws ApiException
    {
        var requestBody = request.getRequestBody();
        if (requestBody == null) {
            httpRequest.method(request.getMethod(), HttpRequest.BodyPublishers.noBody());
            return;
        }

        if (requestBody instanceof String) {
            httpRequest.method(request.getMethod(), HttpRequest.BodyPublishers
                    .ofString((String.valueOf(requestBody))));
        }
        else {
            try {
                var body = mapper.writeValueAsBytes(requestBody);
                httpRequest.method(request.getMethod(),
                                   HttpRequest.BodyPublishers.ofByteArray(body));
            }
            catch (IOException e) {
                throw new ApiException(e);
            }
        }
    }

    private void setPathAndQueryParams(HttpRequest.Builder httpRequest, ApiRequest request) {
        var path = request.getPath();
        var queryParams = request.getQueryParams();
        if (queryParams != null && !queryParams.isEmpty()) {
            var queryJoiner = new StringJoiner("&");
            queryParams.forEach(p -> queryJoiner.add(p.getKey() + '=' + p.getValue()));
            httpRequest.uri(URI.create(baseUri + path + '?' + queryJoiner));
        }
        else {
            httpRequest.uri(URI.create(baseUri + path));
        }
    }
}
