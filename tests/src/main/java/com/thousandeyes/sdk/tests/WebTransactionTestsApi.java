/*
 * Tests API
 * This API allows you to list, create, edit, and delete Network and Application Synthetics tests. 
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
import com.thousandeyes.sdk.tests.model.Error;
import com.thousandeyes.sdk.tests.model.ExpandTestOptions;
import java.net.URI;
import com.thousandeyes.sdk.tests.model.UnauthorizedError;
import com.thousandeyes.sdk.tests.model.ValidationError;
import com.thousandeyes.sdk.tests.model.WebTransactionTestRequest;
import com.thousandeyes.sdk.tests.model.WebTransactionTestResponse;
import com.thousandeyes.sdk.tests.model.WebTransactionTests;

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
public class WebTransactionTestsApi {
  private final ApiClient apiClient;

  public WebTransactionTestsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create Web Transactions test
   * Creates a new Web Transactions test. This method requires Account Admin permissions.
   * @param webTransactionTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return WebTransactionTestResponse
   * @throws ApiException if fails to make API call
   */
  public WebTransactionTestResponse createWebTransactionsTest(WebTransactionTestRequest webTransactionTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    ApiResponse<WebTransactionTestResponse> response = createWebTransactionsTestWithHttpInfo(webTransactionTestRequest, aid, expand);
    return response.getData();
  }

  /**
   * Create Web Transactions test
   * Creates a new Web Transactions test. This method requires Account Admin permissions.
   * @param webTransactionTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;WebTransactionTestResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WebTransactionTestResponse> createWebTransactionsTestWithHttpInfo(WebTransactionTestRequest webTransactionTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    createWebTransactionsTestValidateRequest(webTransactionTestRequest);

    var requestBuilder = createWebTransactionsTestRequestBuilder(webTransactionTestRequest, aid, expand);

    return apiClient.send(requestBuilder.build(), WebTransactionTestResponse.class);
  }

  private void createWebTransactionsTestValidateRequest(WebTransactionTestRequest webTransactionTestRequest) throws ApiException {
      // verify the required parameter 'webTransactionTestRequest' is set
      if (webTransactionTestRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'webTransactionTestRequest' when calling createWebTransactionsTest");
      }
  }

  private ApiRequest.ApiRequestBuilder createWebTransactionsTestRequestBuilder(WebTransactionTestRequest webTransactionTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/tests/web-transactions";
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
    requestBuilder.requestBody(webTransactionTestRequest);
    return requestBuilder;
  }
  /**
   * Delete Web Transactions test
   * Deletes the specified Web Transactions test. This method requires Account Admin permissions.
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteWebTransactionsTest(String testId, String aid) throws ApiException {
    deleteWebTransactionsTestWithHttpInfo(testId, aid);
  }

  /**
   * Delete Web Transactions test
   * Deletes the specified Web Transactions test. This method requires Account Admin permissions.
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteWebTransactionsTestWithHttpInfo(String testId, String aid) throws ApiException {
    deleteWebTransactionsTestValidateRequest(testId);

    var requestBuilder = deleteWebTransactionsTestRequestBuilder(testId, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteWebTransactionsTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling deleteWebTransactionsTest");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteWebTransactionsTestRequestBuilder(String testId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/tests/web-transactions/{testId}"
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
   * Get Web Transactions test
   * Returns details for a Web Transactions test, including name, intervals, targets, alert rules and agents.
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param versionId The unique identifier for a specific version of the test settings. If provided, returns the test configuration as it existed at that version. To retrieve available version IDs, use the &#x60;/tests/{testId}/history&#x60; endpoint. If not specified, the current version of the test settings is returned. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return WebTransactionTestResponse
   * @throws ApiException if fails to make API call
   */
  public WebTransactionTestResponse getWebTransactionsTest(String testId, String aid, String versionId, List<ExpandTestOptions> expand) throws ApiException {
    ApiResponse<WebTransactionTestResponse> response = getWebTransactionsTestWithHttpInfo(testId, aid, versionId, expand);
    return response.getData();
  }

  /**
   * Get Web Transactions test
   * Returns details for a Web Transactions test, including name, intervals, targets, alert rules and agents.
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param versionId The unique identifier for a specific version of the test settings. If provided, returns the test configuration as it existed at that version. To retrieve available version IDs, use the &#x60;/tests/{testId}/history&#x60; endpoint. If not specified, the current version of the test settings is returned. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;WebTransactionTestResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WebTransactionTestResponse> getWebTransactionsTestWithHttpInfo(String testId, String aid, String versionId, List<ExpandTestOptions> expand) throws ApiException {
    getWebTransactionsTestValidateRequest(testId);

    var requestBuilder = getWebTransactionsTestRequestBuilder(testId, aid, versionId, expand);

    return apiClient.send(requestBuilder.build(), WebTransactionTestResponse.class);
  }

  private void getWebTransactionsTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getWebTransactionsTest");
      }
  }

  private ApiRequest.ApiRequestBuilder getWebTransactionsTestRequestBuilder(String testId, String aid, String versionId, List<ExpandTestOptions> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/tests/web-transactions/{testId}"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("versionId", versionId));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * List Web Transactions tests
   * Returns a list of all Web Transactions tests and saved events.  **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return WebTransactionTests
   * @throws ApiException if fails to make API call
   */
  public WebTransactionTests getWebTransactionsTests(String aid) throws ApiException {
    ApiResponse<WebTransactionTests> response = getWebTransactionsTestsWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List Web Transactions tests
   * Returns a list of all Web Transactions tests and saved events.  **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;WebTransactionTests&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WebTransactionTests> getWebTransactionsTestsWithHttpInfo(String aid) throws ApiException {
    getWebTransactionsTestsValidateRequest();

    var requestBuilder = getWebTransactionsTestsRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), WebTransactionTests.class);
  }

  private void getWebTransactionsTestsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getWebTransactionsTestsRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/tests/web-transactions";
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
   * Update Web Transactions test
   * Updates a Web Transactions test. The target test cannot be a live share or saved event. This method requires Account Admin permissions. **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API.
   * @param testId Test ID (required)
   * @param webTransactionTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return WebTransactionTestResponse
   * @throws ApiException if fails to make API call
   */
  public WebTransactionTestResponse updateWebTransactionsTest(String testId, WebTransactionTestRequest webTransactionTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    ApiResponse<WebTransactionTestResponse> response = updateWebTransactionsTestWithHttpInfo(testId, webTransactionTestRequest, aid, expand);
    return response.getData();
  }

  /**
   * Update Web Transactions test
   * Updates a Web Transactions test. The target test cannot be a live share or saved event. This method requires Account Admin permissions. **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API.
   * @param testId Test ID (required)
   * @param webTransactionTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;WebTransactionTestResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WebTransactionTestResponse> updateWebTransactionsTestWithHttpInfo(String testId, WebTransactionTestRequest webTransactionTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    updateWebTransactionsTestValidateRequest(testId, webTransactionTestRequest);

    var requestBuilder = updateWebTransactionsTestRequestBuilder(testId, webTransactionTestRequest, aid, expand);

    return apiClient.send(requestBuilder.build(), WebTransactionTestResponse.class);
  }

  private void updateWebTransactionsTestValidateRequest(String testId, WebTransactionTestRequest webTransactionTestRequest) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling updateWebTransactionsTest");
      }
      // verify the required parameter 'webTransactionTestRequest' is set
      if (webTransactionTestRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'webTransactionTestRequest' when calling updateWebTransactionsTest");
      }
  }

  private ApiRequest.ApiRequestBuilder updateWebTransactionsTestRequestBuilder(String testId, WebTransactionTestRequest webTransactionTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/tests/web-transactions/{testId}"
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
    requestBuilder.requestBody(webTransactionTestRequest);
    return requestBuilder;
  }
}
