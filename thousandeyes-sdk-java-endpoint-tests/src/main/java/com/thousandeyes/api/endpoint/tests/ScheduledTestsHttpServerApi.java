/*
 * Endpoint Tests API
 *  Manage endpoint agent dynamic and scheduled tests using the Endpoint Tests API. 
 *
 * The version of the OpenAPI document: 7.0.6
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

import com.thousandeyes.api.endpoint.tests.model.EndpointHttpServerTest;
import com.thousandeyes.api.endpoint.tests.model.EndpointHttpServerTestRequest;
import com.thousandeyes.api.endpoint.tests.model.EndpointHttpServerTests;
import com.thousandeyes.api.endpoint.tests.model.EndpointHttpTestUpdate;
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
public class ScheduledTestsHttpServerApi {
  private final ApiClient apiClient;

  public ScheduledTestsHttpServerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create HTTP server endpoint scheduled test
   * Creates a new HTTP server endpoint test in ThousandEyes, using properties specified in the POST data. Please note that only users with Account Admin privileges have the authorization to create new tests; regular users are restricted from using POST-based methods. 
   * @param endpointHttpServerTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return EndpointHttpServerTest
   * @throws ApiException if fails to make API call
   */
  public EndpointHttpServerTest createHttpServerEndpointScheduledTest(EndpointHttpServerTestRequest endpointHttpServerTestRequest, String aid) throws ApiException {
    ApiResponse<EndpointHttpServerTest> response = createHttpServerEndpointScheduledTestWithHttpInfo(endpointHttpServerTestRequest, aid);
    return response.getData();
  }

  /**
   * Create HTTP server endpoint scheduled test
   * Creates a new HTTP server endpoint test in ThousandEyes, using properties specified in the POST data. Please note that only users with Account Admin privileges have the authorization to create new tests; regular users are restricted from using POST-based methods. 
   * @param endpointHttpServerTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;EndpointHttpServerTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EndpointHttpServerTest> createHttpServerEndpointScheduledTestWithHttpInfo(EndpointHttpServerTestRequest endpointHttpServerTestRequest, String aid) throws ApiException {
    createHttpServerEndpointScheduledTestValidateRequest(endpointHttpServerTestRequest);

    var requestBuilder = createHttpServerEndpointScheduledTestRequestBuilder(endpointHttpServerTestRequest, aid);

    return apiClient.send(requestBuilder.build(), EndpointHttpServerTest.class);
  }

  private void createHttpServerEndpointScheduledTestValidateRequest(EndpointHttpServerTestRequest endpointHttpServerTestRequest) throws ApiException {
      // verify the required parameter 'endpointHttpServerTestRequest' is set
      if (endpointHttpServerTestRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'endpointHttpServerTestRequest' when calling createHttpServerEndpointScheduledTest");
      }
  }

  private ApiRequest.ApiRequestBuilder createHttpServerEndpointScheduledTestRequestBuilder(EndpointHttpServerTestRequest endpointHttpServerTestRequest, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/endpoint/tests/scheduled-tests/http-server";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(endpointHttpServerTestRequest);
    return requestBuilder;
  }
  /**
   * Delete HTTP server scheduled test
   * Deletes an HTTP server endpoint scheduled test.
   * @param testId Unique ID of endpoint test. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteHttpServerEndpointScheduledTest(String testId, String aid) throws ApiException {
    deleteHttpServerEndpointScheduledTestWithHttpInfo(testId, aid);
  }

  /**
   * Delete HTTP server scheduled test
   * Deletes an HTTP server endpoint scheduled test.
   * @param testId Unique ID of endpoint test. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteHttpServerEndpointScheduledTestWithHttpInfo(String testId, String aid) throws ApiException {
    deleteHttpServerEndpointScheduledTestValidateRequest(testId);

    var requestBuilder = deleteHttpServerEndpointScheduledTestRequestBuilder(testId, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteHttpServerEndpointScheduledTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling deleteHttpServerEndpointScheduledTest");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteHttpServerEndpointScheduledTestRequestBuilder(String testId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/v7/endpoint/tests/scheduled-tests/http-server/{testId}"
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
   * Retrieves HTTP server endpoint scheduled test
   * Retrieves details of an HTTP Server endpoint scheduled test.
   * @param testId Unique ID of endpoint test. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return EndpointHttpServerTest
   * @throws ApiException if fails to make API call
   */
  public EndpointHttpServerTest getHttpServerEndpointScheduledTest(String testId, String aid) throws ApiException {
    ApiResponse<EndpointHttpServerTest> response = getHttpServerEndpointScheduledTestWithHttpInfo(testId, aid);
    return response.getData();
  }

  /**
   * Retrieves HTTP server endpoint scheduled test
   * Retrieves details of an HTTP Server endpoint scheduled test.
   * @param testId Unique ID of endpoint test. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;EndpointHttpServerTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EndpointHttpServerTest> getHttpServerEndpointScheduledTestWithHttpInfo(String testId, String aid) throws ApiException {
    getHttpServerEndpointScheduledTestValidateRequest(testId);

    var requestBuilder = getHttpServerEndpointScheduledTestRequestBuilder(testId, aid);

    return apiClient.send(requestBuilder.build(), EndpointHttpServerTest.class);
  }

  private void getHttpServerEndpointScheduledTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getHttpServerEndpointScheduledTest");
      }
  }

  private ApiRequest.ApiRequestBuilder getHttpServerEndpointScheduledTestRequestBuilder(String testId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/endpoint/tests/scheduled-tests/http-server/{testId}"
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
   * List HTTP server endpoint scheduled tests
   * Returns a list of agent to server endpoint scheduled tests configured in ThousandEyes. This list does not contain saved events. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return EndpointHttpServerTests
   * @throws ApiException if fails to make API call
   */
  public EndpointHttpServerTests getHttpServerEndpointScheduledTests(String aid) throws ApiException {
    ApiResponse<EndpointHttpServerTests> response = getHttpServerEndpointScheduledTestsWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List HTTP server endpoint scheduled tests
   * Returns a list of agent to server endpoint scheduled tests configured in ThousandEyes. This list does not contain saved events. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;EndpointHttpServerTests&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EndpointHttpServerTests> getHttpServerEndpointScheduledTestsWithHttpInfo(String aid) throws ApiException {
    getHttpServerEndpointScheduledTestsValidateRequest();

    var requestBuilder = getHttpServerEndpointScheduledTestsRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), EndpointHttpServerTests.class);
  }

  private void getHttpServerEndpointScheduledTestsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getHttpServerEndpointScheduledTestsRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/endpoint/tests/scheduled-tests/http-server";
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
   * Update HTTP server endpoint scheduled test
   * Updates an HTTP server scheduled test. Includes support for  enabling and disabling the test.
   * @param testId Unique ID of endpoint test. (required)
   * @param endpointHttpTestUpdate  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return EndpointHttpServerTest
   * @throws ApiException if fails to make API call
   */
  public EndpointHttpServerTest updateHttpServerEndpointScheduledTest(String testId, EndpointHttpTestUpdate endpointHttpTestUpdate, String aid) throws ApiException {
    ApiResponse<EndpointHttpServerTest> response = updateHttpServerEndpointScheduledTestWithHttpInfo(testId, endpointHttpTestUpdate, aid);
    return response.getData();
  }

  /**
   * Update HTTP server endpoint scheduled test
   * Updates an HTTP server scheduled test. Includes support for  enabling and disabling the test.
   * @param testId Unique ID of endpoint test. (required)
   * @param endpointHttpTestUpdate  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;EndpointHttpServerTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EndpointHttpServerTest> updateHttpServerEndpointScheduledTestWithHttpInfo(String testId, EndpointHttpTestUpdate endpointHttpTestUpdate, String aid) throws ApiException {
    updateHttpServerEndpointScheduledTestValidateRequest(testId, endpointHttpTestUpdate);

    var requestBuilder = updateHttpServerEndpointScheduledTestRequestBuilder(testId, endpointHttpTestUpdate, aid);

    return apiClient.send(requestBuilder.build(), EndpointHttpServerTest.class);
  }

  private void updateHttpServerEndpointScheduledTestValidateRequest(String testId, EndpointHttpTestUpdate endpointHttpTestUpdate) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling updateHttpServerEndpointScheduledTest");
      }
      // verify the required parameter 'endpointHttpTestUpdate' is set
      if (endpointHttpTestUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'endpointHttpTestUpdate' when calling updateHttpServerEndpointScheduledTest");
      }
  }

  private ApiRequest.ApiRequestBuilder updateHttpServerEndpointScheduledTestRequestBuilder(String testId, EndpointHttpTestUpdate endpointHttpTestUpdate, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PATCH");

    String path = "/v7/endpoint/tests/scheduled-tests/http-server/{testId}"
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
    requestBuilder.requestBody(endpointHttpTestUpdate);
    return requestBuilder;
  }
}
