/*
 * Tests API
 * This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.api.tests;

import static com.thousandeyes.api.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.api.client.RequestUtil.urlEncode;

import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.client.ApiException;
import com.thousandeyes.api.client.ApiResponse;
import com.thousandeyes.api.client.ApiRequest;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.api.tests.model.Error;
import com.thousandeyes.api.tests.model.Expand;
import com.thousandeyes.api.tests.model.GetPageLoadTests200Response;
import com.thousandeyes.api.tests.model.PageLoadTest;
import java.net.URI;
import com.thousandeyes.api.tests.model.UnauthorizedError;
import com.thousandeyes.api.tests.model.UpdatePageLoadTest;
import com.thousandeyes.api.tests.model.ValidationError;

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

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T17:12:32.734520+01:00[Europe/Lisbon]")
public class PageLoadApi {
  private final ApiClient apiClient;

  public PageLoadApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create Page Load test
   * Creates a new Page Load test. This method requires Account Admin permissions.
   * @param updatePageLoadTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return PageLoadTest
   * @throws ApiException if fails to make API call
   */
  public PageLoadTest createPageLoadTest(UpdatePageLoadTest updatePageLoadTest, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<PageLoadTest> response = createPageLoadTestWithHttpInfo(updatePageLoadTest, aid, expand);
    return response.getData();
  }

  /**
   * Create Page Load test
   * Creates a new Page Load test. This method requires Account Admin permissions.
   * @param updatePageLoadTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;PageLoadTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PageLoadTest> createPageLoadTestWithHttpInfo(UpdatePageLoadTest updatePageLoadTest, String aid, List<Expand> expand) throws ApiException {
    createPageLoadTestValidateRequest(updatePageLoadTest);

    var requestBuilder = createPageLoadTestRequestBuilder(updatePageLoadTest, aid, expand);

    return apiClient.send(requestBuilder.build(), PageLoadTest.class);
  }

  private void createPageLoadTestValidateRequest(UpdatePageLoadTest updatePageLoadTest) throws ApiException {
      // verify the required parameter 'updatePageLoadTest' is set
      if (updatePageLoadTest == null) {
        throw new ApiException(400, "Missing the required parameter 'updatePageLoadTest' when calling createPageLoadTest");
      }
  }

  private ApiRequest.ApiRequestBuilder createPageLoadTestRequestBuilder(UpdatePageLoadTest updatePageLoadTest, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/tests/page-load";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    requestBuilder.requestBody(updatePageLoadTest);
    return requestBuilder;
  }
  /**
   * Delete Page Load test
   * Deletes the specified Page Load test. This method requires Account Admin permissions. 
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deletePageLoadTest(String testId, String aid) throws ApiException {
    deletePageLoadTestWithHttpInfo(testId, aid);
  }

  /**
   * Delete Page Load test
   * Deletes the specified Page Load test. This method requires Account Admin permissions. 
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deletePageLoadTestWithHttpInfo(String testId, String aid) throws ApiException {
    deletePageLoadTestValidateRequest(testId);

    var requestBuilder = deletePageLoadTestRequestBuilder(testId, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deletePageLoadTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling deletePageLoadTest");
      }
  }

  private ApiRequest.ApiRequestBuilder deletePageLoadTestRequestBuilder(String testId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/v7/tests/page-load/{testId}"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    return requestBuilder;
  }
  /**
   * Get Page Load test
   * Returns details for a Page Load test, including name, intervals, targets, alert rules and agents.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return PageLoadTest
   * @throws ApiException if fails to make API call
   */
  public PageLoadTest getPageLoadTest(String testId, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<PageLoadTest> response = getPageLoadTestWithHttpInfo(testId, aid, expand);
    return response.getData();
  }

  /**
   * Get Page Load test
   * Returns details for a Page Load test, including name, intervals, targets, alert rules and agents.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;PageLoadTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PageLoadTest> getPageLoadTestWithHttpInfo(String testId, String aid, List<Expand> expand) throws ApiException {
    getPageLoadTestValidateRequest(testId);

    var requestBuilder = getPageLoadTestRequestBuilder(testId, aid, expand);

    return apiClient.send(requestBuilder.build(), PageLoadTest.class);
  }

  private void getPageLoadTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getPageLoadTest");
      }
  }

  private ApiRequest.ApiRequestBuilder getPageLoadTestRequestBuilder(String testId, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/tests/page-load/{testId}"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    return requestBuilder;
  }
  /**
   * List Page Load tests
   * Returns a list of all Page Load tests and saved events.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return GetPageLoadTests200Response
   * @throws ApiException if fails to make API call
   */
  public GetPageLoadTests200Response getPageLoadTests(String aid) throws ApiException {
    ApiResponse<GetPageLoadTests200Response> response = getPageLoadTestsWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List Page Load tests
   * Returns a list of all Page Load tests and saved events.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;GetPageLoadTests200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetPageLoadTests200Response> getPageLoadTestsWithHttpInfo(String aid) throws ApiException {
    getPageLoadTestsValidateRequest();

    var requestBuilder = getPageLoadTestsRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), GetPageLoadTests200Response.class);
  }

  private void getPageLoadTestsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getPageLoadTestsRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/tests/page-load";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    return requestBuilder;
  }
  /**
   * Update Page Load test
   * Updates a Page Load test. The target test cannot be a live share or saved event. This method requires Account Admin permissions.
   * @param testId ID of the test (required)
   * @param updatePageLoadTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return PageLoadTest
   * @throws ApiException if fails to make API call
   */
  public PageLoadTest updatePageLoadTest(String testId, UpdatePageLoadTest updatePageLoadTest, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<PageLoadTest> response = updatePageLoadTestWithHttpInfo(testId, updatePageLoadTest, aid, expand);
    return response.getData();
  }

  /**
   * Update Page Load test
   * Updates a Page Load test. The target test cannot be a live share or saved event. This method requires Account Admin permissions.
   * @param testId ID of the test (required)
   * @param updatePageLoadTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;PageLoadTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PageLoadTest> updatePageLoadTestWithHttpInfo(String testId, UpdatePageLoadTest updatePageLoadTest, String aid, List<Expand> expand) throws ApiException {
    updatePageLoadTestValidateRequest(testId, updatePageLoadTest);

    var requestBuilder = updatePageLoadTestRequestBuilder(testId, updatePageLoadTest, aid, expand);

    return apiClient.send(requestBuilder.build(), PageLoadTest.class);
  }

  private void updatePageLoadTestValidateRequest(String testId, UpdatePageLoadTest updatePageLoadTest) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling updatePageLoadTest");
      }
      // verify the required parameter 'updatePageLoadTest' is set
      if (updatePageLoadTest == null) {
        throw new ApiException(400, "Missing the required parameter 'updatePageLoadTest' when calling updatePageLoadTest");
      }
  }

  private ApiRequest.ApiRequestBuilder updatePageLoadTestRequestBuilder(String testId, UpdatePageLoadTest updatePageLoadTest, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/v7/tests/page-load/{testId}"
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
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    requestBuilder.requestBody(updatePageLoadTest);
    return requestBuilder;
  }
}
