/*
 * Tests API
 * This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests. 
 *
 * The version of the OpenAPI document: 7.0.11
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

import com.thousandeyes.sdk.tests.model.AgentToServerTest;
import com.thousandeyes.sdk.tests.model.AgentToServerTests;
import com.thousandeyes.sdk.tests.model.Error;
import com.thousandeyes.sdk.tests.model.Expand;
import java.net.URI;
import com.thousandeyes.sdk.tests.model.UnauthorizedError;
import com.thousandeyes.sdk.tests.model.UpdateAgentToServerTest;
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
public class AgentToServerApi {
  private final ApiClient apiClient;

  public AgentToServerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create Agent to Server test
   * Creates a new Agent to Server test. This method requires Account Admin permissions.
   * @param updateAgentToServerTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return AgentToServerTest
   * @throws ApiException if fails to make API call
   */
  public AgentToServerTest createAgentToServerTest(UpdateAgentToServerTest updateAgentToServerTest, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<AgentToServerTest> response = createAgentToServerTestWithHttpInfo(updateAgentToServerTest, aid, expand);
    return response.getData();
  }

  /**
   * Create Agent to Server test
   * Creates a new Agent to Server test. This method requires Account Admin permissions.
   * @param updateAgentToServerTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;AgentToServerTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AgentToServerTest> createAgentToServerTestWithHttpInfo(UpdateAgentToServerTest updateAgentToServerTest, String aid, List<Expand> expand) throws ApiException {
    createAgentToServerTestValidateRequest(updateAgentToServerTest);

    var requestBuilder = createAgentToServerTestRequestBuilder(updateAgentToServerTest, aid, expand);

    return apiClient.send(requestBuilder.build(), AgentToServerTest.class);
  }

  private void createAgentToServerTestValidateRequest(UpdateAgentToServerTest updateAgentToServerTest) throws ApiException {
      // verify the required parameter 'updateAgentToServerTest' is set
      if (updateAgentToServerTest == null) {
        throw new ApiException(400, "Missing the required parameter 'updateAgentToServerTest' when calling createAgentToServerTest");
      }
  }

  private ApiRequest.ApiRequestBuilder createAgentToServerTestRequestBuilder(UpdateAgentToServerTest updateAgentToServerTest, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/tests/agent-to-server";
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
    requestBuilder.requestBody(updateAgentToServerTest);
    return requestBuilder;
  }
  /**
   * Delete Agent to Server test
   * Deletes an Agent to Server test. This method requires Account Admin permissions.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteAgentToServerTest(String testId, String aid) throws ApiException {
    deleteAgentToServerTestWithHttpInfo(testId, aid);
  }

  /**
   * Delete Agent to Server test
   * Deletes an Agent to Server test. This method requires Account Admin permissions.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAgentToServerTestWithHttpInfo(String testId, String aid) throws ApiException {
    deleteAgentToServerTestValidateRequest(testId);

    var requestBuilder = deleteAgentToServerTestRequestBuilder(testId, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteAgentToServerTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling deleteAgentToServerTest");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteAgentToServerTestRequestBuilder(String testId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/v7/tests/agent-to-server/{testId}"
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
   * Get Agent to Server test
   * Returns details for a Agent to Server test, including name, intervals, targets, alert rules and agents.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return AgentToServerTest
   * @throws ApiException if fails to make API call
   */
  public AgentToServerTest getAgentToServerTest(String testId, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<AgentToServerTest> response = getAgentToServerTestWithHttpInfo(testId, aid, expand);
    return response.getData();
  }

  /**
   * Get Agent to Server test
   * Returns details for a Agent to Server test, including name, intervals, targets, alert rules and agents.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;AgentToServerTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AgentToServerTest> getAgentToServerTestWithHttpInfo(String testId, String aid, List<Expand> expand) throws ApiException {
    getAgentToServerTestValidateRequest(testId);

    var requestBuilder = getAgentToServerTestRequestBuilder(testId, aid, expand);

    return apiClient.send(requestBuilder.build(), AgentToServerTest.class);
  }

  private void getAgentToServerTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getAgentToServerTest");
      }
  }

  private ApiRequest.ApiRequestBuilder getAgentToServerTestRequestBuilder(String testId, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/tests/agent-to-server/{testId}"
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
   * List Agent to Server tests
   * Returns a list of Agent to Server tests and saved events.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return AgentToServerTests
   * @throws ApiException if fails to make API call
   */
  public AgentToServerTests getAgentToServerTests(String aid) throws ApiException {
    ApiResponse<AgentToServerTests> response = getAgentToServerTestsWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List Agent to Server tests
   * Returns a list of Agent to Server tests and saved events.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;AgentToServerTests&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AgentToServerTests> getAgentToServerTestsWithHttpInfo(String aid) throws ApiException {
    getAgentToServerTestsValidateRequest();

    var requestBuilder = getAgentToServerTestsRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), AgentToServerTests.class);
  }

  private void getAgentToServerTestsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getAgentToServerTestsRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/tests/agent-to-server";
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
   * Update Agent to Server test
   * Updates an Agent to Server test. This method requires Account Admin permissions.
   * @param testId ID of the test (required)
   * @param updateAgentToServerTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return AgentToServerTest
   * @throws ApiException if fails to make API call
   */
  public AgentToServerTest updateAgentToServerTest(String testId, UpdateAgentToServerTest updateAgentToServerTest, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<AgentToServerTest> response = updateAgentToServerTestWithHttpInfo(testId, updateAgentToServerTest, aid, expand);
    return response.getData();
  }

  /**
   * Update Agent to Server test
   * Updates an Agent to Server test. This method requires Account Admin permissions.
   * @param testId ID of the test (required)
   * @param updateAgentToServerTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;AgentToServerTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AgentToServerTest> updateAgentToServerTestWithHttpInfo(String testId, UpdateAgentToServerTest updateAgentToServerTest, String aid, List<Expand> expand) throws ApiException {
    updateAgentToServerTestValidateRequest(testId, updateAgentToServerTest);

    var requestBuilder = updateAgentToServerTestRequestBuilder(testId, updateAgentToServerTest, aid, expand);

    return apiClient.send(requestBuilder.build(), AgentToServerTest.class);
  }

  private void updateAgentToServerTestValidateRequest(String testId, UpdateAgentToServerTest updateAgentToServerTest) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling updateAgentToServerTest");
      }
      // verify the required parameter 'updateAgentToServerTest' is set
      if (updateAgentToServerTest == null) {
        throw new ApiException(400, "Missing the required parameter 'updateAgentToServerTest' when calling updateAgentToServerTest");
      }
  }

  private ApiRequest.ApiRequestBuilder updateAgentToServerTestRequestBuilder(String testId, UpdateAgentToServerTest updateAgentToServerTest, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/v7/tests/agent-to-server/{testId}"
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
    requestBuilder.requestBody(updateAgentToServerTest);
    return requestBuilder;
  }
}