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
import com.thousandeyes.sdk.tests.model.VoiceTestRequest;
import com.thousandeyes.sdk.tests.model.VoiceTestResponse;
import com.thousandeyes.sdk.tests.model.VoiceTests;

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
public class VoiceTestsApi {
  private final ApiClient apiClient;

  public VoiceTestsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create Voice test
   * Creates a new Voice test. This method requires Account Admin permissions.
   * @param voiceTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return VoiceTestResponse
   * @throws ApiException if fails to make API call
   */
  public VoiceTestResponse createVoiceTest(VoiceTestRequest voiceTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    ApiResponse<VoiceTestResponse> response = createVoiceTestWithHttpInfo(voiceTestRequest, aid, expand);
    return response.getData();
  }

  /**
   * Create Voice test
   * Creates a new Voice test. This method requires Account Admin permissions.
   * @param voiceTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;VoiceTestResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoiceTestResponse> createVoiceTestWithHttpInfo(VoiceTestRequest voiceTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    createVoiceTestValidateRequest(voiceTestRequest);

    var requestBuilder = createVoiceTestRequestBuilder(voiceTestRequest, aid, expand);

    return apiClient.send(requestBuilder.build(), VoiceTestResponse.class);
  }

  private void createVoiceTestValidateRequest(VoiceTestRequest voiceTestRequest) throws ApiException {
      // verify the required parameter 'voiceTestRequest' is set
      if (voiceTestRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'voiceTestRequest' when calling createVoiceTest");
      }
  }

  private ApiRequest.ApiRequestBuilder createVoiceTestRequestBuilder(VoiceTestRequest voiceTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/tests/voice";
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
    requestBuilder.requestBody(voiceTestRequest);
    return requestBuilder;
  }
  /**
   * Delete Voice test
   * Deletes the specified Voice test. This method requires Account Admin permissions.
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteVoiceTest(String testId, String aid) throws ApiException {
    deleteVoiceTestWithHttpInfo(testId, aid);
  }

  /**
   * Delete Voice test
   * Deletes the specified Voice test. This method requires Account Admin permissions.
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteVoiceTestWithHttpInfo(String testId, String aid) throws ApiException {
    deleteVoiceTestValidateRequest(testId);

    var requestBuilder = deleteVoiceTestRequestBuilder(testId, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteVoiceTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling deleteVoiceTest");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteVoiceTestRequestBuilder(String testId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/tests/voice/{testId}"
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
   * Get Voice test
   * Returns details for a Voice test, including name, intervals, targets, alert rules and agents.
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param versionId The unique identifier for a specific version of the test settings. If provided, returns the test configuration as it existed at that version. To retrieve available version IDs, use the &#x60;/tests/{testId}/history&#x60; endpoint. If not specified, the current version of the test settings is returned. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return VoiceTestResponse
   * @throws ApiException if fails to make API call
   */
  public VoiceTestResponse getVoiceTest(String testId, String aid, String versionId, List<ExpandTestOptions> expand) throws ApiException {
    ApiResponse<VoiceTestResponse> response = getVoiceTestWithHttpInfo(testId, aid, versionId, expand);
    return response.getData();
  }

  /**
   * Get Voice test
   * Returns details for a Voice test, including name, intervals, targets, alert rules and agents.
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param versionId The unique identifier for a specific version of the test settings. If provided, returns the test configuration as it existed at that version. To retrieve available version IDs, use the &#x60;/tests/{testId}/history&#x60; endpoint. If not specified, the current version of the test settings is returned. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;VoiceTestResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoiceTestResponse> getVoiceTestWithHttpInfo(String testId, String aid, String versionId, List<ExpandTestOptions> expand) throws ApiException {
    getVoiceTestValidateRequest(testId);

    var requestBuilder = getVoiceTestRequestBuilder(testId, aid, versionId, expand);

    return apiClient.send(requestBuilder.build(), VoiceTestResponse.class);
  }

  private void getVoiceTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getVoiceTest");
      }
  }

  private ApiRequest.ApiRequestBuilder getVoiceTestRequestBuilder(String testId, String aid, String versionId, List<ExpandTestOptions> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/tests/voice/{testId}"
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
   * List Voice tests
   * Returns a list of Voice tests and saved events.  **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return VoiceTests
   * @throws ApiException if fails to make API call
   */
  public VoiceTests getVoiceTests(String aid) throws ApiException {
    ApiResponse<VoiceTests> response = getVoiceTestsWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List Voice tests
   * Returns a list of Voice tests and saved events.  **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;VoiceTests&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoiceTests> getVoiceTestsWithHttpInfo(String aid) throws ApiException {
    getVoiceTestsValidateRequest();

    var requestBuilder = getVoiceTestsRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), VoiceTests.class);
  }

  private void getVoiceTestsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getVoiceTestsRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/tests/voice";
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
   * Update Voice test
   * Updates a Voice test. The target test cannot be a live share or saved event. This method requires Account Admin permissions. **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API.
   * @param testId Test ID (required)
   * @param voiceTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return VoiceTestResponse
   * @throws ApiException if fails to make API call
   */
  public VoiceTestResponse updateVoiceTest(String testId, VoiceTestRequest voiceTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    ApiResponse<VoiceTestResponse> response = updateVoiceTestWithHttpInfo(testId, voiceTestRequest, aid, expand);
    return response.getData();
  }

  /**
   * Update Voice test
   * Updates a Voice test. The target test cannot be a live share or saved event. This method requires Account Admin permissions. **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API.
   * @param testId Test ID (required)
   * @param voiceTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;VoiceTestResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<VoiceTestResponse> updateVoiceTestWithHttpInfo(String testId, VoiceTestRequest voiceTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    updateVoiceTestValidateRequest(testId, voiceTestRequest);

    var requestBuilder = updateVoiceTestRequestBuilder(testId, voiceTestRequest, aid, expand);

    return apiClient.send(requestBuilder.build(), VoiceTestResponse.class);
  }

  private void updateVoiceTestValidateRequest(String testId, VoiceTestRequest voiceTestRequest) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling updateVoiceTest");
      }
      // verify the required parameter 'voiceTestRequest' is set
      if (voiceTestRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'voiceTestRequest' when calling updateVoiceTest");
      }
  }

  private ApiRequest.ApiRequestBuilder updateVoiceTestRequestBuilder(String testId, VoiceTestRequest voiceTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/tests/voice/{testId}"
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
    requestBuilder.requestBody(voiceTestRequest);
    return requestBuilder;
  }
}
