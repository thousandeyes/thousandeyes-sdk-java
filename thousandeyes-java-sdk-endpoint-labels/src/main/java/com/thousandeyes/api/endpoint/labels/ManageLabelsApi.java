/*
 * Endpoint Agent Labels API
 * Manage labels applied to endpoint agents using this API. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.api.endpoint.labels;

import static com.thousandeyes.api.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.api.client.RequestUtil.urlEncode;

import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.client.ApiException;
import com.thousandeyes.api.client.ApiResponse;
import com.thousandeyes.api.client.ApiRequest;
import org.apache.commons.lang3.tuple.Pair;

import java.math.BigDecimal;
import com.thousandeyes.api.endpoint.labels.model.EndpointLabelsList200Response;
import com.thousandeyes.api.endpoint.labels.model.Error;
import com.thousandeyes.api.endpoint.labels.model.Expand;
import com.thousandeyes.api.endpoint.labels.model.Label;
import java.net.URI;
import com.thousandeyes.api.endpoint.labels.model.UnauthorizedError;
import com.thousandeyes.api.endpoint.labels.model.V7EndpointLabelsPost201Response;
import com.thousandeyes.api.endpoint.labels.model.V7EndpointLabelsPostRequest;
import com.thousandeyes.api.endpoint.labels.model.ValidationError;

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

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-02-07T22:58:17.517531Z[Europe/Lisbon]")
public class ManageLabelsApi {
  private final ApiClient apiClient;

  public ManageLabelsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Deletes label
   * Deletes the label from your account. 
   * @param id The unique identifier of the label to operate on. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void endpointLabelDelete(String id, String aid) throws ApiException {
    endpointLabelDeleteWithHttpInfo(id, aid);
  }

  /**
   * Deletes label
   * Deletes the label from your account. 
   * @param id The unique identifier of the label to operate on. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> endpointLabelDeleteWithHttpInfo(String id, String aid) throws ApiException {
    endpointLabelDeleteValidateRequest(id);

    var requestBuilder = endpointLabelDeleteRequestBuilder(id, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void endpointLabelDeleteValidateRequest(String id) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling endpointLabelDelete");
      }
  }

  private ApiRequest.ApiRequestBuilder endpointLabelDeleteRequestBuilder(String id, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/v7/endpoint/labels/{id}"
        .replace("{id}", urlEncode(id.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "aid";
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/problem+json"));

    return requestBuilder;
  }
  /**
   * Retrieve label
   * Returns a single label using its ID.
   * @param id The unique identifier of the label to operate on. (required)
   * @param expand This parameter is optional and determines whether to include additional details in the response. To specify multiple expansions, you can either separate the values with commas or specify the parameter multiple times. (optional
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return V7EndpointLabelsPost201Response
   * @throws ApiException if fails to make API call
   */
  public V7EndpointLabelsPost201Response endpointLabelGet(String id, List<Expand> expand, String aid) throws ApiException {
    ApiResponse<V7EndpointLabelsPost201Response> response = endpointLabelGetWithHttpInfo(id, expand, aid);
    return response.getData();
  }

  /**
   * Retrieve label
   * Returns a single label using its ID.
   * @param id The unique identifier of the label to operate on. (required)
   * @param expand This parameter is optional and determines whether to include additional details in the response. To specify multiple expansions, you can either separate the values with commas or specify the parameter multiple times. (optional
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;V7EndpointLabelsPost201Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<V7EndpointLabelsPost201Response> endpointLabelGetWithHttpInfo(String id, List<Expand> expand, String aid) throws ApiException {
    endpointLabelGetValidateRequest(id);

    var requestBuilder = endpointLabelGetRequestBuilder(id, expand, aid);

    return apiClient.send(requestBuilder.build(), V7EndpointLabelsPost201Response.class);
  }

  private void endpointLabelGetValidateRequest(String id) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling endpointLabelGet");
      }
  }

  private ApiRequest.ApiRequestBuilder endpointLabelGetRequestBuilder(String id, List<Expand> expand, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/endpoint/labels/{id}"
        .replace("{id}", urlEncode(id.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "expand";
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));
    localVarQueryParameterBaseName = "aid";
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/problem+json"));

    return requestBuilder;
  }
  /**
   * Update label
   * Updates a label using its ID.
   * @param id The unique identifier of the label to operate on. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param label Fields to change on the agent (optional)
   * @return V7EndpointLabelsPost201Response
   * @throws ApiException if fails to make API call
   */
  public V7EndpointLabelsPost201Response endpointLabelUpdate(String id, String aid, Label label) throws ApiException {
    ApiResponse<V7EndpointLabelsPost201Response> response = endpointLabelUpdateWithHttpInfo(id, aid, label);
    return response.getData();
  }

  /**
   * Update label
   * Updates a label using its ID.
   * @param id The unique identifier of the label to operate on. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param label Fields to change on the agent (optional)
   * @return ApiResponse&lt;V7EndpointLabelsPost201Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<V7EndpointLabelsPost201Response> endpointLabelUpdateWithHttpInfo(String id, String aid, Label label) throws ApiException {
    endpointLabelUpdateValidateRequest(id);

    var requestBuilder = endpointLabelUpdateRequestBuilder(id, aid, label);

    return apiClient.send(requestBuilder.build(), V7EndpointLabelsPost201Response.class);
  }

  private void endpointLabelUpdateValidateRequest(String id) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling endpointLabelUpdate");
      }
  }

  private ApiRequest.ApiRequestBuilder endpointLabelUpdateRequestBuilder(String id, String aid, Label label) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PATCH");

    String path = "/v7/endpoint/labels/{id}"
        .replace("{id}", urlEncode(id.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "aid";
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/problem+json"));

    requestBuilder.requestBody(label);
    return requestBuilder;
  }
  /**
   * List labels
   * 
   * @param max (Optional) Maximum number of objects to return. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @param expand This parameter is optional and determines whether to include additional details in the response. To specify multiple expansions, you can either separate the values with commas or specify the parameter multiple times. (optional
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return EndpointLabelsList200Response
   * @throws ApiException if fails to make API call
   */
  public EndpointLabelsList200Response endpointLabelsList(BigDecimal max, String cursor, List<Expand> expand, String aid) throws ApiException {
    ApiResponse<EndpointLabelsList200Response> response = endpointLabelsListWithHttpInfo(max, cursor, expand, aid);
    return response.getData();
  }

  /**
   * List labels
   * 
   * @param max (Optional) Maximum number of objects to return. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @param expand This parameter is optional and determines whether to include additional details in the response. To specify multiple expansions, you can either separate the values with commas or specify the parameter multiple times. (optional
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;EndpointLabelsList200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EndpointLabelsList200Response> endpointLabelsListWithHttpInfo(BigDecimal max, String cursor, List<Expand> expand, String aid) throws ApiException {
    endpointLabelsListValidateRequest();

    var requestBuilder = endpointLabelsListRequestBuilder(max, cursor, expand, aid);

    return apiClient.send(requestBuilder.build(), EndpointLabelsList200Response.class);
  }

  private void endpointLabelsListValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder endpointLabelsListRequestBuilder(BigDecimal max, String cursor, List<Expand> expand, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/endpoint/labels";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "max";
    localVarQueryParams.addAll(parameterToPairs("max", max));
    localVarQueryParameterBaseName = "cursor";
    localVarQueryParams.addAll(parameterToPairs("cursor", cursor));
    localVarQueryParameterBaseName = "expand";
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));
    localVarQueryParameterBaseName = "aid";
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/problem+json"));

    return requestBuilder;
  }
  /**
   * Create label
   * 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param v7EndpointLabelsPostRequest Label settings (optional)
   * @return V7EndpointLabelsPost201Response
   * @throws ApiException if fails to make API call
   */
  public V7EndpointLabelsPost201Response v7EndpointLabelsPost(String aid, V7EndpointLabelsPostRequest v7EndpointLabelsPostRequest) throws ApiException {
    ApiResponse<V7EndpointLabelsPost201Response> response = v7EndpointLabelsPostWithHttpInfo(aid, v7EndpointLabelsPostRequest);
    return response.getData();
  }

  /**
   * Create label
   * 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param v7EndpointLabelsPostRequest Label settings (optional)
   * @return ApiResponse&lt;V7EndpointLabelsPost201Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<V7EndpointLabelsPost201Response> v7EndpointLabelsPostWithHttpInfo(String aid, V7EndpointLabelsPostRequest v7EndpointLabelsPostRequest) throws ApiException {
    v7EndpointLabelsPostValidateRequest();

    var requestBuilder = v7EndpointLabelsPostRequestBuilder(aid, v7EndpointLabelsPostRequest);

    return apiClient.send(requestBuilder.build(), V7EndpointLabelsPost201Response.class);
  }

  private void v7EndpointLabelsPostValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder v7EndpointLabelsPostRequestBuilder(String aid, V7EndpointLabelsPostRequest v7EndpointLabelsPostRequest) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/endpoint/labels";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "aid";
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/problem+json"));

    requestBuilder.requestBody(v7EndpointLabelsPostRequest);
    return requestBuilder;
  }
}
