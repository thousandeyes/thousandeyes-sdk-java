/*
 * Tests API
 * This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.sdk.tests;

import static com.thousandeyes.sdk.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.sdk.client.RequestUtil.urlEncode;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.ApiResponse;
import com.thousandeyes.sdk.client.ApiRequest;
import com.thousandeyes.sdk.utils.Config;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.reflect.TypeUtils;
import com.thousandeyes.sdk.tests.model.BgpTestRequest;
import com.thousandeyes.sdk.tests.model.BgpTestResponse;
import com.thousandeyes.sdk.tests.model.BgpTests;
import com.thousandeyes.sdk.tests.model.Error;
import com.thousandeyes.sdk.tests.model.ExpandBgpTestOptions;
import java.net.URI;
import com.thousandeyes.sdk.tests.model.UnauthorizedError;
import com.thousandeyes.sdk.tests.model.UpdateBgpTestRequest;
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
public class BgpTestsApi {
  private final ApiClient apiClient;

  public BgpTestsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create BGP test
   * Creates a new BGP test. This method requires Account Admin permissions.
   * @param bgpTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion takes place if the query parameter is not present. To expand the &#x60;monitors&#x60; sub-resource, pass the &#x60;?expand&#x3D;monitor&#x60; query. (optional
   * @return BgpTestResponse
   * @throws ApiException if fails to make API call
   */
  public BgpTestResponse createBgpTest(BgpTestRequest bgpTestRequest, String aid, List<ExpandBgpTestOptions> expand) throws ApiException {
    ApiResponse<BgpTestResponse> response = createBgpTestWithHttpInfo(bgpTestRequest, aid, expand);
    return response.getData();
  }

  /**
   * Create BGP test
   * Creates a new BGP test. This method requires Account Admin permissions.
   * @param bgpTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion takes place if the query parameter is not present. To expand the &#x60;monitors&#x60; sub-resource, pass the &#x60;?expand&#x3D;monitor&#x60; query. (optional
   * @return ApiResponse&lt;BgpTestResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<BgpTestResponse> createBgpTestWithHttpInfo(BgpTestRequest bgpTestRequest, String aid, List<ExpandBgpTestOptions> expand) throws ApiException {
    createBgpTestValidateRequest(bgpTestRequest);

    var requestBuilder = createBgpTestRequestBuilder(bgpTestRequest, aid, expand);

    return apiClient.send(requestBuilder.build(), BgpTestResponse.class);
  }

  private void createBgpTestValidateRequest(BgpTestRequest bgpTestRequest) throws ApiException {
      // verify the required parameter 'bgpTestRequest' is set
      if (bgpTestRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'bgpTestRequest' when calling createBgpTest");
      }
  }

  private ApiRequest.ApiRequestBuilder createBgpTestRequestBuilder(BgpTestRequest bgpTestRequest, String aid, List<ExpandBgpTestOptions> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/tests/bgp";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(bgpTestRequest);
    return requestBuilder;
  }
  /**
   * Delete BGP test
   * Deletes a BGP test. This method requires Account Admin permissions.
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteBgpTest(String testId, String aid) throws ApiException {
    deleteBgpTestWithHttpInfo(testId, aid);
  }

  /**
   * Delete BGP test
   * Deletes a BGP test. This method requires Account Admin permissions.
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteBgpTestWithHttpInfo(String testId, String aid) throws ApiException {
    deleteBgpTestValidateRequest(testId);

    var requestBuilder = deleteBgpTestRequestBuilder(testId, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteBgpTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling deleteBgpTest");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteBgpTestRequestBuilder(String testId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/tests/bgp/{testId}"
        .replace("{testId}", urlEncode(testId.toString()));
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
   * Get BGP test
   * Returns details for a BGP test, including name, intervals, targets, alert rules and agents.
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion takes place if the query parameter is not present. To expand the &#x60;monitors&#x60; sub-resource, pass the &#x60;?expand&#x3D;monitor&#x60; query. (optional
   * @return BgpTestResponse
   * @throws ApiException if fails to make API call
   */
  public BgpTestResponse getBgpTest(String testId, String aid, List<ExpandBgpTestOptions> expand) throws ApiException {
    ApiResponse<BgpTestResponse> response = getBgpTestWithHttpInfo(testId, aid, expand);
    return response.getData();
  }

  /**
   * Get BGP test
   * Returns details for a BGP test, including name, intervals, targets, alert rules and agents.
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion takes place if the query parameter is not present. To expand the &#x60;monitors&#x60; sub-resource, pass the &#x60;?expand&#x3D;monitor&#x60; query. (optional
   * @return ApiResponse&lt;BgpTestResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<BgpTestResponse> getBgpTestWithHttpInfo(String testId, String aid, List<ExpandBgpTestOptions> expand) throws ApiException {
    getBgpTestValidateRequest(testId);

    var requestBuilder = getBgpTestRequestBuilder(testId, aid, expand);

    return apiClient.send(requestBuilder.build(), BgpTestResponse.class);
  }

  private void getBgpTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getBgpTest");
      }
  }

  private ApiRequest.ApiRequestBuilder getBgpTestRequestBuilder(String testId, String aid, List<ExpandBgpTestOptions> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/tests/bgp/{testId}"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * List BGP tests
   * Returns a list of BGP tests and saved events.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return BgpTests
   * @throws ApiException if fails to make API call
   */
  public BgpTests getBgpTests(String aid) throws ApiException {
    ApiResponse<BgpTests> response = getBgpTestsWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List BGP tests
   * Returns a list of BGP tests and saved events.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;BgpTests&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<BgpTests> getBgpTestsWithHttpInfo(String aid) throws ApiException {
    getBgpTestsValidateRequest();

    var requestBuilder = getBgpTestsRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), BgpTests.class);
  }

  private void getBgpTestsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getBgpTestsRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/tests/bgp";
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
   * Update BGP test
   * Updates a BGP test. This method requires Account Admin permissions. The target test cannot be a live share or saved event.
   * @param testId Test ID (required)
   * @param updateBgpTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion takes place if the query parameter is not present. To expand the &#x60;monitors&#x60; sub-resource, pass the &#x60;?expand&#x3D;monitor&#x60; query. (optional
   * @return BgpTestResponse
   * @throws ApiException if fails to make API call
   */
  public BgpTestResponse updateBgpTest(String testId, UpdateBgpTestRequest updateBgpTestRequest, String aid, List<ExpandBgpTestOptions> expand) throws ApiException {
    ApiResponse<BgpTestResponse> response = updateBgpTestWithHttpInfo(testId, updateBgpTestRequest, aid, expand);
    return response.getData();
  }

  /**
   * Update BGP test
   * Updates a BGP test. This method requires Account Admin permissions. The target test cannot be a live share or saved event.
   * @param testId Test ID (required)
   * @param updateBgpTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion takes place if the query parameter is not present. To expand the &#x60;monitors&#x60; sub-resource, pass the &#x60;?expand&#x3D;monitor&#x60; query. (optional
   * @return ApiResponse&lt;BgpTestResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<BgpTestResponse> updateBgpTestWithHttpInfo(String testId, UpdateBgpTestRequest updateBgpTestRequest, String aid, List<ExpandBgpTestOptions> expand) throws ApiException {
    updateBgpTestValidateRequest(testId, updateBgpTestRequest);

    var requestBuilder = updateBgpTestRequestBuilder(testId, updateBgpTestRequest, aid, expand);

    return apiClient.send(requestBuilder.build(), BgpTestResponse.class);
  }

  private void updateBgpTestValidateRequest(String testId, UpdateBgpTestRequest updateBgpTestRequest) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling updateBgpTest");
      }
      // verify the required parameter 'updateBgpTestRequest' is set
      if (updateBgpTestRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'updateBgpTestRequest' when calling updateBgpTest");
      }
  }

  private ApiRequest.ApiRequestBuilder updateBgpTestRequestBuilder(String testId, UpdateBgpTestRequest updateBgpTestRequest, String aid, List<ExpandBgpTestOptions> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/tests/bgp/{testId}"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(updateBgpTestRequest);
    return requestBuilder;
  }
}
