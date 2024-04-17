/*
 * ThousandEyes for OpenTelemetry API
 *  Configure ThousandEyes to stream or push test data to a OpenTelemetry compliant endpoint with the ThousandEyes for OpenTelemetry API. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.api.streaming;

import static com.thousandeyes.api.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.api.client.RequestUtil.urlEncode;

import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.client.ApiException;
import com.thousandeyes.api.client.ApiResponse;
import com.thousandeyes.api.client.ApiRequest;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.api.streaming.model.ApiError;
import com.thousandeyes.api.streaming.model.ApiErrorIntegrationLimits;
import com.thousandeyes.api.streaming.model.BadRequestError;
import com.thousandeyes.api.streaming.model.CreateStreamResponse;
import com.thousandeyes.api.streaming.model.GetStreamResponse;
import com.thousandeyes.api.streaming.model.PutStream;
import com.thousandeyes.api.streaming.model.Stream;
import com.thousandeyes.api.streaming.model.StreamType;
import com.thousandeyes.api.streaming.model.UnauthorizedError;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-17T14:20:01.690107+01:00[Europe/Lisbon]")
public class StreamingApi {
  private final ApiClient apiClient;

  public StreamingApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create data stream
   * Creates a new data stream.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param stream Stream to configure (optional)
   * @return CreateStreamResponse
   * @throws ApiException if fails to make API call
   */
  public CreateStreamResponse createStream(String aid, Stream stream) throws ApiException {
    ApiResponse<CreateStreamResponse> response = createStreamWithHttpInfo(aid, stream);
    return response.getData();
  }

  /**
   * Create data stream
   * Creates a new data stream.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param stream Stream to configure (optional)
   * @return ApiResponse&lt;CreateStreamResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CreateStreamResponse> createStreamWithHttpInfo(String aid, Stream stream) throws ApiException {
    createStreamValidateRequest();

    var requestBuilder = createStreamRequestBuilder(aid, stream);

    return apiClient.send(requestBuilder.build(), CreateStreamResponse.class);
  }

  private void createStreamValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder createStreamRequestBuilder(String aid, Stream stream) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/stream";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/7.0.0"));
    requestBuilder.requestBody(stream);
    return requestBuilder;
  }
  /**
   * Delete a data stream
   * Deletes a configured data stream using its ID.
   * @param id ID of stream to query (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteStream(String id, String aid) throws ApiException {
    deleteStreamWithHttpInfo(id, aid);
  }

  /**
   * Delete a data stream
   * Deletes a configured data stream using its ID.
   * @param id ID of stream to query (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteStreamWithHttpInfo(String id, String aid) throws ApiException {
    deleteStreamValidateRequest(id);

    var requestBuilder = deleteStreamRequestBuilder(id, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteStreamValidateRequest(String id) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteStream");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteStreamRequestBuilder(String id, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/v7/stream/{id}"
        .replace("{id}", urlEncode(id.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/problem+json, application/json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/7.0.0"));
    return requestBuilder;
  }
  /**
   * Retrieve data stream
   * Retrieves a configured data stream using its ID.
   * @param id ID of stream to query (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param type Optional filter on type of Stream; should match one of Stream &#x60;type&#x60; enum (optional)
   * @return GetStreamResponse
   * @throws ApiException if fails to make API call
   */
  public GetStreamResponse getStream(String id, String aid, StreamType type) throws ApiException {
    ApiResponse<GetStreamResponse> response = getStreamWithHttpInfo(id, aid, type);
    return response.getData();
  }

  /**
   * Retrieve data stream
   * Retrieves a configured data stream using its ID.
   * @param id ID of stream to query (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param type Optional filter on type of Stream; should match one of Stream &#x60;type&#x60; enum (optional)
   * @return ApiResponse&lt;GetStreamResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetStreamResponse> getStreamWithHttpInfo(String id, String aid, StreamType type) throws ApiException {
    getStreamValidateRequest(id);

    var requestBuilder = getStreamRequestBuilder(id, aid, type);

    return apiClient.send(requestBuilder.build(), GetStreamResponse.class);
  }

  private void getStreamValidateRequest(String id) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getStream");
      }
  }

  private ApiRequest.ApiRequestBuilder getStreamRequestBuilder(String id, String aid, StreamType type) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/stream/{id}"
        .replace("{id}", urlEncode(id.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("type", type));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/7.0.0"));
    return requestBuilder;
  }
  /**
   * List data streams
   * Retrieves a list of configured data streams.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param type Optional filter on type of Stream; should match one of Stream &#x60;type&#x60; enum (optional)
   * @return List&lt;GetStreamResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public List<GetStreamResponse> getStreams(String aid, StreamType type) throws ApiException {
    ApiResponse<List<GetStreamResponse>> response = getStreamsWithHttpInfo(aid, type);
    return response.getData();
  }

  /**
   * List data streams
   * Retrieves a list of configured data streams.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param type Optional filter on type of Stream; should match one of Stream &#x60;type&#x60; enum (optional)
   * @return ApiResponse&lt;List&lt;GetStreamResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<GetStreamResponse>> getStreamsWithHttpInfo(String aid, StreamType type) throws ApiException {
    getStreamsValidateRequest();

    var requestBuilder = getStreamsRequestBuilder(aid, type);

    return apiClient.send(requestBuilder.build(), List<GetStreamResponse>.class);
  }

  private void getStreamsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getStreamsRequestBuilder(String aid, StreamType type) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/stream";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("type", type));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/7.0.0"));
    return requestBuilder;
  }
  /**
   * Update data stream
   * Updates a configured data stream using its ID. The fields are overwritten, not appended.
   * @param id ID of stream to query (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param putStream  (optional)
   * @return GetStreamResponse
   * @throws ApiException if fails to make API call
   */
  public GetStreamResponse putStream(String id, String aid, PutStream putStream) throws ApiException {
    ApiResponse<GetStreamResponse> response = putStreamWithHttpInfo(id, aid, putStream);
    return response.getData();
  }

  /**
   * Update data stream
   * Updates a configured data stream using its ID. The fields are overwritten, not appended.
   * @param id ID of stream to query (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param putStream  (optional)
   * @return ApiResponse&lt;GetStreamResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetStreamResponse> putStreamWithHttpInfo(String id, String aid, PutStream putStream) throws ApiException {
    putStreamValidateRequest(id);

    var requestBuilder = putStreamRequestBuilder(id, aid, putStream);

    return apiClient.send(requestBuilder.build(), GetStreamResponse.class);
  }

  private void putStreamValidateRequest(String id) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling putStream");
      }
  }

  private ApiRequest.ApiRequestBuilder putStreamRequestBuilder(String id, String aid, PutStream putStream) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/v7/stream/{id}"
        .replace("{id}", urlEncode(id.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/7.0.0"));
    requestBuilder.requestBody(putStream);
    return requestBuilder;
  }
}