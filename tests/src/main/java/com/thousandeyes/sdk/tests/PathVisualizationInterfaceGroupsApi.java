/*
 * Tests API
 * This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests. 
 *
 * The version of the OpenAPI document: 7.0.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.sdk.tests;

import static com.thousandeyes.api.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.api.client.RequestUtil.urlEncode;

import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.client.ApiException;
import com.thousandeyes.api.client.ApiResponse;
import com.thousandeyes.api.client.ApiRequest;
import com.thousandeyes.api.utils.Config;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.sdk.tests.model.Error;
import com.thousandeyes.sdk.tests.model.InterfaceGroup;
import com.thousandeyes.sdk.tests.model.InterfaceGroups;
import java.net.URI;
import com.thousandeyes.sdk.tests.model.UnauthorizedError;
import com.thousandeyes.sdk.tests.model.ValidationError;

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

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class PathVisualizationInterfaceGroupsApi {
  private final ApiClient apiClient;

  public PathVisualizationInterfaceGroupsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create interface group for path visualization
   * Creates a new path visualization interface group.
   * @param interfaceGroup  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return InterfaceGroup
   * @throws ApiException if fails to make API call
   */
  public InterfaceGroup createPathVisInterfaceGroups(InterfaceGroup interfaceGroup, String aid) throws ApiException {
    ApiResponse<InterfaceGroup> response = createPathVisInterfaceGroupsWithHttpInfo(interfaceGroup, aid);
    return response.getData();
  }

  /**
   * Create interface group for path visualization
   * Creates a new path visualization interface group.
   * @param interfaceGroup  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;InterfaceGroup&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InterfaceGroup> createPathVisInterfaceGroupsWithHttpInfo(InterfaceGroup interfaceGroup, String aid) throws ApiException {
    createPathVisInterfaceGroupsValidateRequest(interfaceGroup);

    var requestBuilder = createPathVisInterfaceGroupsRequestBuilder(interfaceGroup, aid);

    return apiClient.send(requestBuilder.build(), InterfaceGroup.class);
  }

  private void createPathVisInterfaceGroupsValidateRequest(InterfaceGroup interfaceGroup) throws ApiException {
      // verify the required parameter 'interfaceGroup' is set
      if (interfaceGroup == null) {
        throw new ApiException(400, "Missing the required parameter 'interfaceGroup' when calling createPathVisInterfaceGroups");
      }
  }

  private ApiRequest.ApiRequestBuilder createPathVisInterfaceGroupsRequestBuilder(InterfaceGroup interfaceGroup, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/network/path-vis/interface-groups";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(interfaceGroup);
    return requestBuilder;
  }
  /**
   * Delete interface group
   * Deletes a path visualization interface group.
   * @param interfaceGroupId ID of the network path vis interface group (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deletePathVisInterfaceGroup(String interfaceGroupId, String aid) throws ApiException {
    deletePathVisInterfaceGroupWithHttpInfo(interfaceGroupId, aid);
  }

  /**
   * Delete interface group
   * Deletes a path visualization interface group.
   * @param interfaceGroupId ID of the network path vis interface group (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deletePathVisInterfaceGroupWithHttpInfo(String interfaceGroupId, String aid) throws ApiException {
    deletePathVisInterfaceGroupValidateRequest(interfaceGroupId);

    var requestBuilder = deletePathVisInterfaceGroupRequestBuilder(interfaceGroupId, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deletePathVisInterfaceGroupValidateRequest(String interfaceGroupId) throws ApiException {
      // verify the required parameter 'interfaceGroupId' is set
      if (interfaceGroupId == null) {
        throw new ApiException(400, "Missing the required parameter 'interfaceGroupId' when calling deletePathVisInterfaceGroup");
      }
  }

  private ApiRequest.ApiRequestBuilder deletePathVisInterfaceGroupRequestBuilder(String interfaceGroupId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/v7/network/path-vis/interface-groups/{interfaceGroupId}"
        .replace("{interfaceGroupId}", urlEncode(interfaceGroupId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * List interface groups for path visualization
   * Returns a list of all path visualization interface groups. For more information about interface groups, see https://docs.thousandeyes.com/product-documentation/end-user-monitoring/viewing-data/endpoint-agent-views-reference#grouping.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return InterfaceGroups
   * @throws ApiException if fails to make API call
   */
  public InterfaceGroups getPathVisInterfaceGroups(String aid) throws ApiException {
    ApiResponse<InterfaceGroups> response = getPathVisInterfaceGroupsWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List interface groups for path visualization
   * Returns a list of all path visualization interface groups. For more information about interface groups, see https://docs.thousandeyes.com/product-documentation/end-user-monitoring/viewing-data/endpoint-agent-views-reference#grouping.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;InterfaceGroups&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InterfaceGroups> getPathVisInterfaceGroupsWithHttpInfo(String aid) throws ApiException {
    getPathVisInterfaceGroupsValidateRequest();

    var requestBuilder = getPathVisInterfaceGroupsRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), InterfaceGroups.class);
  }

  private void getPathVisInterfaceGroupsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getPathVisInterfaceGroupsRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/network/path-vis/interface-groups";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * Update interface group
   * Updates a path visualization interface group..
   * @param interfaceGroupId ID of the network path vis interface group (required)
   * @param interfaceGroup  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return InterfaceGroup
   * @throws ApiException if fails to make API call
   */
  public InterfaceGroup updatePathVisInterfaceGroup(String interfaceGroupId, InterfaceGroup interfaceGroup, String aid) throws ApiException {
    ApiResponse<InterfaceGroup> response = updatePathVisInterfaceGroupWithHttpInfo(interfaceGroupId, interfaceGroup, aid);
    return response.getData();
  }

  /**
   * Update interface group
   * Updates a path visualization interface group..
   * @param interfaceGroupId ID of the network path vis interface group (required)
   * @param interfaceGroup  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;InterfaceGroup&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InterfaceGroup> updatePathVisInterfaceGroupWithHttpInfo(String interfaceGroupId, InterfaceGroup interfaceGroup, String aid) throws ApiException {
    updatePathVisInterfaceGroupValidateRequest(interfaceGroupId, interfaceGroup);

    var requestBuilder = updatePathVisInterfaceGroupRequestBuilder(interfaceGroupId, interfaceGroup, aid);

    return apiClient.send(requestBuilder.build(), InterfaceGroup.class);
  }

  private void updatePathVisInterfaceGroupValidateRequest(String interfaceGroupId, InterfaceGroup interfaceGroup) throws ApiException {
      // verify the required parameter 'interfaceGroupId' is set
      if (interfaceGroupId == null) {
        throw new ApiException(400, "Missing the required parameter 'interfaceGroupId' when calling updatePathVisInterfaceGroup");
      }
      // verify the required parameter 'interfaceGroup' is set
      if (interfaceGroup == null) {
        throw new ApiException(400, "Missing the required parameter 'interfaceGroup' when calling updatePathVisInterfaceGroup");
      }
  }

  private ApiRequest.ApiRequestBuilder updatePathVisInterfaceGroupRequestBuilder(String interfaceGroupId, InterfaceGroup interfaceGroup, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/v7/network/path-vis/interface-groups/{interfaceGroupId}"
        .replace("{interfaceGroupId}", urlEncode(interfaceGroupId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(interfaceGroup);
    return requestBuilder;
  }
}
