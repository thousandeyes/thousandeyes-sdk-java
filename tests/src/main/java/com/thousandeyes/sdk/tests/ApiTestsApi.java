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
import com.thousandeyes.sdk.tests.model.ApiTestRequest;
import com.thousandeyes.sdk.tests.model.ApiTestResponse;
import com.thousandeyes.sdk.tests.model.ApiTests;
import com.thousandeyes.sdk.tests.model.Error;
import com.thousandeyes.sdk.tests.model.ExpandTestOptions;
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
public class ApiTestsApi {
  private final ApiClient apiClient;

  public ApiTestsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create API test
   * Creates a new API test. This method requires Account Admin permissions.
   * @param apiTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiTestResponse
   * @throws ApiException if fails to make API call
   */
  public ApiTestResponse createApiTest(ApiTestRequest apiTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    ApiResponse<ApiTestResponse> response = createApiTestWithHttpInfo(apiTestRequest, aid, expand);
    return response.getData();
  }

  /**
   * Create API test
   * Creates a new API test. This method requires Account Admin permissions.
   * @param apiTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;ApiTestResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ApiTestResponse> createApiTestWithHttpInfo(ApiTestRequest apiTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    createApiTestValidateRequest(apiTestRequest);

    var requestBuilder = createApiTestRequestBuilder(apiTestRequest, aid, expand);

    return apiClient.send(requestBuilder.build(), ApiTestResponse.class);
  }

  private void createApiTestValidateRequest(ApiTestRequest apiTestRequest) throws ApiException {
      // verify the required parameter 'apiTestRequest' is set
      if (apiTestRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'apiTestRequest' when calling createApiTest");
      }
  }

  private ApiRequest.ApiRequestBuilder createApiTestRequestBuilder(ApiTestRequest apiTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/tests/api";
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
    requestBuilder.requestBody(apiTestRequest);
    return requestBuilder;
  }
  /**
   * Delete API test
   * Deletes the specified API test. This method requires write permissions.
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteApiTest(String testId, String aid) throws ApiException {
    deleteApiTestWithHttpInfo(testId, aid);
  }

  /**
   * Delete API test
   * Deletes the specified API test. This method requires write permissions.
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteApiTestWithHttpInfo(String testId, String aid) throws ApiException {
    deleteApiTestValidateRequest(testId);

    var requestBuilder = deleteApiTestRequestBuilder(testId, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteApiTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling deleteApiTest");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteApiTestRequestBuilder(String testId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/tests/api/{testId}"
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
   * Get API test
   * Returns details for a API test configuration. Please use &#x60;expand&#x60; parameter to access sub-resources such as alert rules and agents.
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiTestResponse
   * @throws ApiException if fails to make API call
   */
  public ApiTestResponse getApiTest(String testId, String aid, List<ExpandTestOptions> expand) throws ApiException {
    ApiResponse<ApiTestResponse> response = getApiTestWithHttpInfo(testId, aid, expand);
    return response.getData();
  }

  /**
   * Get API test
   * Returns details for a API test configuration. Please use &#x60;expand&#x60; parameter to access sub-resources such as alert rules and agents.
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;ApiTestResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ApiTestResponse> getApiTestWithHttpInfo(String testId, String aid, List<ExpandTestOptions> expand) throws ApiException {
    getApiTestValidateRequest(testId);

    var requestBuilder = getApiTestRequestBuilder(testId, aid, expand);

    return apiClient.send(requestBuilder.build(), ApiTestResponse.class);
  }

  private void getApiTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getApiTest");
      }
  }

  private ApiRequest.ApiRequestBuilder getApiTestRequestBuilder(String testId, String aid, List<ExpandTestOptions> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/tests/api/{testId}"
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
   * List API tests
   * Returns a list of all API tests and saved events.  **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiTests
   * @throws ApiException if fails to make API call
   */
  public ApiTests getApiTests(String aid) throws ApiException {
    ApiResponse<ApiTests> response = getApiTestsWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List API tests
   * Returns a list of all API tests and saved events.  **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;ApiTests&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ApiTests> getApiTestsWithHttpInfo(String aid) throws ApiException {
    getApiTestsValidateRequest();

    var requestBuilder = getApiTestsRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), ApiTests.class);
  }

  private void getApiTestsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getApiTestsRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/tests/api";
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
   * Update API test
   * Updates an API test. The target test cannot be a live share or saved event. This method requires write permissions. **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API.
   * @param testId Test ID (required)
   * @param apiTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiTestResponse
   * @throws ApiException if fails to make API call
   */
  public ApiTestResponse updateApiTest(String testId, ApiTestRequest apiTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    ApiResponse<ApiTestResponse> response = updateApiTestWithHttpInfo(testId, apiTestRequest, aid, expand);
    return response.getData();
  }

  /**
   * Update API test
   * Updates an API test. The target test cannot be a live share or saved event. This method requires write permissions. **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API.
   * @param testId Test ID (required)
   * @param apiTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;ApiTestResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ApiTestResponse> updateApiTestWithHttpInfo(String testId, ApiTestRequest apiTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    updateApiTestValidateRequest(testId, apiTestRequest);

    var requestBuilder = updateApiTestRequestBuilder(testId, apiTestRequest, aid, expand);

    return apiClient.send(requestBuilder.build(), ApiTestResponse.class);
  }

  private void updateApiTestValidateRequest(String testId, ApiTestRequest apiTestRequest) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling updateApiTest");
      }
      // verify the required parameter 'apiTestRequest' is set
      if (apiTestRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'apiTestRequest' when calling updateApiTest");
      }
  }

  private ApiRequest.ApiRequestBuilder updateApiTestRequestBuilder(String testId, ApiTestRequest apiTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/tests/api/{testId}"
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
    requestBuilder.requestBody(apiTestRequest);
    return requestBuilder;
  }
}
