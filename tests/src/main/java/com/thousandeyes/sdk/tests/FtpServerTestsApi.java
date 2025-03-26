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
import com.thousandeyes.sdk.tests.model.FtpServerTestRequest;
import com.thousandeyes.sdk.tests.model.FtpServerTestResponse;
import com.thousandeyes.sdk.tests.model.FtpServerTests;
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
public class FtpServerTestsApi {
  private final ApiClient apiClient;

  public FtpServerTestsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create FTP Server test
   * Creates a new FTP Server test. This method requires Account Admin permissions.
   * @param ftpServerTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return FtpServerTestResponse
   * @throws ApiException if fails to make API call
   */
  public FtpServerTestResponse createFtpServerTest(FtpServerTestRequest ftpServerTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    ApiResponse<FtpServerTestResponse> response = createFtpServerTestWithHttpInfo(ftpServerTestRequest, aid, expand);
    return response.getData();
  }

  /**
   * Create FTP Server test
   * Creates a new FTP Server test. This method requires Account Admin permissions.
   * @param ftpServerTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;FtpServerTestResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FtpServerTestResponse> createFtpServerTestWithHttpInfo(FtpServerTestRequest ftpServerTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    createFtpServerTestValidateRequest(ftpServerTestRequest);

    var requestBuilder = createFtpServerTestRequestBuilder(ftpServerTestRequest, aid, expand);

    return apiClient.send(requestBuilder.build(), FtpServerTestResponse.class);
  }

  private void createFtpServerTestValidateRequest(FtpServerTestRequest ftpServerTestRequest) throws ApiException {
      // verify the required parameter 'ftpServerTestRequest' is set
      if (ftpServerTestRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'ftpServerTestRequest' when calling createFtpServerTest");
      }
  }

  private ApiRequest.ApiRequestBuilder createFtpServerTestRequestBuilder(FtpServerTestRequest ftpServerTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/tests/ftp-server";
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
    requestBuilder.requestBody(ftpServerTestRequest);
    return requestBuilder;
  }
  /**
   * Delete FTP Server test
   * Deletes the specified FTP Server test. This method requires Account Admin permissions.
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteFtpServerTest(String testId, String aid) throws ApiException {
    deleteFtpServerTestWithHttpInfo(testId, aid);
  }

  /**
   * Delete FTP Server test
   * Deletes the specified FTP Server test. This method requires Account Admin permissions.
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteFtpServerTestWithHttpInfo(String testId, String aid) throws ApiException {
    deleteFtpServerTestValidateRequest(testId);

    var requestBuilder = deleteFtpServerTestRequestBuilder(testId, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteFtpServerTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling deleteFtpServerTest");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteFtpServerTestRequestBuilder(String testId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/tests/ftp-server/{testId}"
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
   * Get FTP Server test
   * Returns details for a FTP Server test, including name, intervals, targets, alert rules and agents.
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return FtpServerTestResponse
   * @throws ApiException if fails to make API call
   */
  public FtpServerTestResponse getFtpServerTest(String testId, String aid, List<ExpandTestOptions> expand) throws ApiException {
    ApiResponse<FtpServerTestResponse> response = getFtpServerTestWithHttpInfo(testId, aid, expand);
    return response.getData();
  }

  /**
   * Get FTP Server test
   * Returns details for a FTP Server test, including name, intervals, targets, alert rules and agents.
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;FtpServerTestResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FtpServerTestResponse> getFtpServerTestWithHttpInfo(String testId, String aid, List<ExpandTestOptions> expand) throws ApiException {
    getFtpServerTestValidateRequest(testId);

    var requestBuilder = getFtpServerTestRequestBuilder(testId, aid, expand);

    return apiClient.send(requestBuilder.build(), FtpServerTestResponse.class);
  }

  private void getFtpServerTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getFtpServerTest");
      }
  }

  private ApiRequest.ApiRequestBuilder getFtpServerTestRequestBuilder(String testId, String aid, List<ExpandTestOptions> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/tests/ftp-server/{testId}"
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
   * List FTP Server tests
   * Returns a list of FTP Server tests and saved events.  **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return FtpServerTests
   * @throws ApiException if fails to make API call
   */
  public FtpServerTests getFtpServerTests(String aid) throws ApiException {
    ApiResponse<FtpServerTests> response = getFtpServerTestsWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List FTP Server tests
   * Returns a list of FTP Server tests and saved events.  **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;FtpServerTests&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FtpServerTests> getFtpServerTestsWithHttpInfo(String aid) throws ApiException {
    getFtpServerTestsValidateRequest();

    var requestBuilder = getFtpServerTestsRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), FtpServerTests.class);
  }

  private void getFtpServerTestsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getFtpServerTestsRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/tests/ftp-server";
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
   * Update FTP Server test
   * Updates a FTP Server test. The target test cannot be a live share or saved event. This method requires Account Admin permissions. **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API.
   * @param testId Test ID (required)
   * @param ftpServerTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return FtpServerTestResponse
   * @throws ApiException if fails to make API call
   */
  public FtpServerTestResponse updateFtpServerTest(String testId, FtpServerTestRequest ftpServerTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    ApiResponse<FtpServerTestResponse> response = updateFtpServerTestWithHttpInfo(testId, ftpServerTestRequest, aid, expand);
    return response.getData();
  }

  /**
   * Update FTP Server test
   * Updates a FTP Server test. The target test cannot be a live share or saved event. This method requires Account Admin permissions. **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API.
   * @param testId Test ID (required)
   * @param ftpServerTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;FtpServerTestResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FtpServerTestResponse> updateFtpServerTestWithHttpInfo(String testId, FtpServerTestRequest ftpServerTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    updateFtpServerTestValidateRequest(testId, ftpServerTestRequest);

    var requestBuilder = updateFtpServerTestRequestBuilder(testId, ftpServerTestRequest, aid, expand);

    return apiClient.send(requestBuilder.build(), FtpServerTestResponse.class);
  }

  private void updateFtpServerTestValidateRequest(String testId, FtpServerTestRequest ftpServerTestRequest) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling updateFtpServerTest");
      }
      // verify the required parameter 'ftpServerTestRequest' is set
      if (ftpServerTestRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'ftpServerTestRequest' when calling updateFtpServerTest");
      }
  }

  private ApiRequest.ApiRequestBuilder updateFtpServerTestRequestBuilder(String testId, FtpServerTestRequest ftpServerTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/tests/ftp-server/{testId}"
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
    requestBuilder.requestBody(ftpServerTestRequest);
    return requestBuilder;
  }
}
