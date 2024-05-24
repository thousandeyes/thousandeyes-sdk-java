/*
 * Endpoint Tests API
 *  Manage endpoint agent dynamic and scheduled tests using the Endpoint Tests API. 
 *
 * The version of the OpenAPI document: 7.0.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.api.endpoint.tests;

import static com.thousandeyes.api.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.api.client.RequestUtil.urlEncode;

import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.client.ApiException;
import com.thousandeyes.api.client.ApiResponse;
import com.thousandeyes.api.client.ApiRequest;
import com.thousandeyes.api.utils.Config;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.api.endpoint.tests.model.DynamicTest;
import com.thousandeyes.api.endpoint.tests.model.DynamicTestRequest;
import com.thousandeyes.api.endpoint.tests.model.DynamicTests;
import com.thousandeyes.api.endpoint.tests.model.EndpointDynamicTestUpdate;
import com.thousandeyes.api.endpoint.tests.model.Error;
import java.net.URI;
import com.thousandeyes.api.endpoint.tests.model.UnauthorizedError;
import com.thousandeyes.api.endpoint.tests.model.ValidationError;

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
public class DynamicTestsAgentToServerApi {
  private final ApiClient apiClient;

  public DynamicTestsAgentToServerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Delete agent to server dynamic test
   * Deletes an agent to server endpoint dynamic test.
   * @param testId Unique ID of endpoint test. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteEndpointDynamicTest(String testId, String aid) throws ApiException {
    deleteEndpointDynamicTestWithHttpInfo(testId, aid);
  }

  /**
   * Delete agent to server dynamic test
   * Deletes an agent to server endpoint dynamic test.
   * @param testId Unique ID of endpoint test. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteEndpointDynamicTestWithHttpInfo(String testId, String aid) throws ApiException {
    deleteEndpointDynamicTestValidateRequest(testId);

    var requestBuilder = deleteEndpointDynamicTestRequestBuilder(testId, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteEndpointDynamicTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling deleteEndpointDynamicTest");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteEndpointDynamicTestRequestBuilder(String testId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/v7/endpoint/tests/dynamic-tests/agent-to-server/{testId}"
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
   * Retrieve endpoint dynamic test
   * Returns details of an endpoint dynamic test, including test type, name, intervals, targets.
   * @param testId Unique ID of endpoint test. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return DynamicTest
   * @throws ApiException if fails to make API call
   */
  public DynamicTest getDynamicTestDetail(String testId, String aid) throws ApiException {
    ApiResponse<DynamicTest> response = getDynamicTestDetailWithHttpInfo(testId, aid);
    return response.getData();
  }

  /**
   * Retrieve endpoint dynamic test
   * Returns details of an endpoint dynamic test, including test type, name, intervals, targets.
   * @param testId Unique ID of endpoint test. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;DynamicTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DynamicTest> getDynamicTestDetailWithHttpInfo(String testId, String aid) throws ApiException {
    getDynamicTestDetailValidateRequest(testId);

    var requestBuilder = getDynamicTestDetailRequestBuilder(testId, aid);

    return apiClient.send(requestBuilder.build(), DynamicTest.class);
  }

  private void getDynamicTestDetailValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getDynamicTestDetail");
      }
  }

  private ApiRequest.ApiRequestBuilder getDynamicTestDetailRequestBuilder(String testId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/endpoint/tests/dynamic-tests/agent-to-server/{testId}"
        .replace("{testId}", urlEncode(testId.toString()));
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
   * List endpoint dynamic tests
   * Returns a list of all endpoint dynamic tests configured in ThousandEyes. This list does not contain saved events.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return DynamicTests
   * @throws ApiException if fails to make API call
   */
  public DynamicTests getDynamicTestsList(String aid) throws ApiException {
    ApiResponse<DynamicTests> response = getDynamicTestsListWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List endpoint dynamic tests
   * Returns a list of all endpoint dynamic tests configured in ThousandEyes. This list does not contain saved events.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;DynamicTests&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DynamicTests> getDynamicTestsListWithHttpInfo(String aid) throws ApiException {
    getDynamicTestsListValidateRequest();

    var requestBuilder = getDynamicTestsListRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), DynamicTests.class);
  }

  private void getDynamicTestsListValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getDynamicTestsListRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/endpoint/tests/dynamic-tests/agent-to-server";
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
   * Create endpoint dynamic test
   * Create a new endpoint dynamic test in ThousandEyes using properties specified in the POST data. Please note that only Account Admins have the authorization to create new tests; regular users are restricted from using POST-based methods. 
   * @param dynamicTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return DynamicTest
   * @throws ApiException if fails to make API call
   */
  public DynamicTest postDynamicTest(DynamicTestRequest dynamicTestRequest, String aid) throws ApiException {
    ApiResponse<DynamicTest> response = postDynamicTestWithHttpInfo(dynamicTestRequest, aid);
    return response.getData();
  }

  /**
   * Create endpoint dynamic test
   * Create a new endpoint dynamic test in ThousandEyes using properties specified in the POST data. Please note that only Account Admins have the authorization to create new tests; regular users are restricted from using POST-based methods. 
   * @param dynamicTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;DynamicTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DynamicTest> postDynamicTestWithHttpInfo(DynamicTestRequest dynamicTestRequest, String aid) throws ApiException {
    postDynamicTestValidateRequest(dynamicTestRequest);

    var requestBuilder = postDynamicTestRequestBuilder(dynamicTestRequest, aid);

    return apiClient.send(requestBuilder.build(), DynamicTest.class);
  }

  private void postDynamicTestValidateRequest(DynamicTestRequest dynamicTestRequest) throws ApiException {
      // verify the required parameter 'dynamicTestRequest' is set
      if (dynamicTestRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'dynamicTestRequest' when calling postDynamicTest");
      }
  }

  private ApiRequest.ApiRequestBuilder postDynamicTestRequestBuilder(DynamicTestRequest dynamicTestRequest, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/endpoint/tests/dynamic-tests/agent-to-server";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(dynamicTestRequest);
    return requestBuilder;
  }
  /**
   * Update agent to server dynamic test
   * Updates an agent to server endpoint dynamic test. Includes support for  enabling and disabling the test.
   * @param testId Unique ID of endpoint test. (required)
   * @param endpointDynamicTestUpdate  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return DynamicTest
   * @throws ApiException if fails to make API call
   */
  public DynamicTest updateEndpointDynamicTestDetail(String testId, EndpointDynamicTestUpdate endpointDynamicTestUpdate, String aid) throws ApiException {
    ApiResponse<DynamicTest> response = updateEndpointDynamicTestDetailWithHttpInfo(testId, endpointDynamicTestUpdate, aid);
    return response.getData();
  }

  /**
   * Update agent to server dynamic test
   * Updates an agent to server endpoint dynamic test. Includes support for  enabling and disabling the test.
   * @param testId Unique ID of endpoint test. (required)
   * @param endpointDynamicTestUpdate  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;DynamicTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DynamicTest> updateEndpointDynamicTestDetailWithHttpInfo(String testId, EndpointDynamicTestUpdate endpointDynamicTestUpdate, String aid) throws ApiException {
    updateEndpointDynamicTestDetailValidateRequest(testId, endpointDynamicTestUpdate);

    var requestBuilder = updateEndpointDynamicTestDetailRequestBuilder(testId, endpointDynamicTestUpdate, aid);

    return apiClient.send(requestBuilder.build(), DynamicTest.class);
  }

  private void updateEndpointDynamicTestDetailValidateRequest(String testId, EndpointDynamicTestUpdate endpointDynamicTestUpdate) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling updateEndpointDynamicTestDetail");
      }
      // verify the required parameter 'endpointDynamicTestUpdate' is set
      if (endpointDynamicTestUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'endpointDynamicTestUpdate' when calling updateEndpointDynamicTestDetail");
      }
  }

  private ApiRequest.ApiRequestBuilder updateEndpointDynamicTestDetailRequestBuilder(String testId, EndpointDynamicTestUpdate endpointDynamicTestUpdate, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PATCH");

    String path = "/v7/endpoint/tests/dynamic-tests/agent-to-server/{testId}"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(endpointDynamicTestUpdate);
    return requestBuilder;
  }
}
