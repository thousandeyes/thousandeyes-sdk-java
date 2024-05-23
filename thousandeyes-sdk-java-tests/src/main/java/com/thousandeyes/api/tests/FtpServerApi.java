/*
 * Tests API
 * This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests. 
 *
 * The version of the OpenAPI document: 7.0.4
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
import com.thousandeyes.api.utils.Config;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.api.tests.model.Error;
import com.thousandeyes.api.tests.model.Expand;
import com.thousandeyes.api.tests.model.FtpServerTest;
import com.thousandeyes.api.tests.model.FtpServerTests;
import java.net.URI;
import com.thousandeyes.api.tests.model.UnauthorizedError;
import com.thousandeyes.api.tests.model.UpdateFtpServerTest;
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

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class FtpServerApi {
  private static final Config config = new Config();
  private final ApiClient apiClient;

  public FtpServerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create FTP Server test
   * Creates a new FTP Server test. This method requires Account Admin permissions.
   * @param updateFtpServerTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return FtpServerTest
   * @throws ApiException if fails to make API call
   */
  public FtpServerTest createFtpServerTest(UpdateFtpServerTest updateFtpServerTest, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<FtpServerTest> response = createFtpServerTestWithHttpInfo(updateFtpServerTest, aid, expand);
    return response.getData();
  }

  /**
   * Create FTP Server test
   * Creates a new FTP Server test. This method requires Account Admin permissions.
   * @param updateFtpServerTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;FtpServerTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FtpServerTest> createFtpServerTestWithHttpInfo(UpdateFtpServerTest updateFtpServerTest, String aid, List<Expand> expand) throws ApiException {
    createFtpServerTestValidateRequest(updateFtpServerTest);

    var requestBuilder = createFtpServerTestRequestBuilder(updateFtpServerTest, aid, expand);

    return apiClient.send(requestBuilder.build(), FtpServerTest.class);
  }

  private void createFtpServerTestValidateRequest(UpdateFtpServerTest updateFtpServerTest) throws ApiException {
      // verify the required parameter 'updateFtpServerTest' is set
      if (updateFtpServerTest == null) {
        throw new ApiException(400, "Missing the required parameter 'updateFtpServerTest' when calling createFtpServerTest");
      }
  }

  private ApiRequest.ApiRequestBuilder createFtpServerTestRequestBuilder(UpdateFtpServerTest updateFtpServerTest, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/tests/ftp-server";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/" + config.getVersion()));
    requestBuilder.requestBody(updateFtpServerTest);
    return requestBuilder;
  }
  /**
   * Delete FTP Server test
   * Deletes the specified FTP Server test. This method requires Account Admin permissions.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteFTPServerTest(String testId, String aid) throws ApiException {
    deleteFTPServerTestWithHttpInfo(testId, aid);
  }

  /**
   * Delete FTP Server test
   * Deletes the specified FTP Server test. This method requires Account Admin permissions.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteFTPServerTestWithHttpInfo(String testId, String aid) throws ApiException {
    deleteFTPServerTestValidateRequest(testId);

    var requestBuilder = deleteFTPServerTestRequestBuilder(testId, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteFTPServerTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling deleteFTPServerTest");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteFTPServerTestRequestBuilder(String testId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/v7/tests/ftp-server/{testId}"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/" + config.getVersion()));
    return requestBuilder;
  }
  /**
   * Get FTP Server test
   * Returns details for a FTP Server test, including name, intervals, targets, alert rules and agents.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return FtpServerTest
   * @throws ApiException if fails to make API call
   */
  public FtpServerTest getFtpServerTest(String testId, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<FtpServerTest> response = getFtpServerTestWithHttpInfo(testId, aid, expand);
    return response.getData();
  }

  /**
   * Get FTP Server test
   * Returns details for a FTP Server test, including name, intervals, targets, alert rules and agents.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;FtpServerTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FtpServerTest> getFtpServerTestWithHttpInfo(String testId, String aid, List<Expand> expand) throws ApiException {
    getFtpServerTestValidateRequest(testId);

    var requestBuilder = getFtpServerTestRequestBuilder(testId, aid, expand);

    return apiClient.send(requestBuilder.build(), FtpServerTest.class);
  }

  private void getFtpServerTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getFtpServerTest");
      }
  }

  private ApiRequest.ApiRequestBuilder getFtpServerTestRequestBuilder(String testId, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/tests/ftp-server/{testId}"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/" + config.getVersion()));
    return requestBuilder;
  }
  /**
   * List FTP Server tests
   * Returns a list of FTP Server tests and saved events.
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
   * Returns a list of FTP Server tests and saved events.
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

    String path = "/v7/tests/ftp-server";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/" + config.getVersion()));
    return requestBuilder;
  }
  /**
   * Update FTP Server test
   * Updates a FTP Server test. The target test cannot be a live share or saved event. This method requires Account Admin permissions.
   * @param testId ID of the test (required)
   * @param updateFtpServerTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return FtpServerTest
   * @throws ApiException if fails to make API call
   */
  public FtpServerTest updateFtpServerTest(String testId, UpdateFtpServerTest updateFtpServerTest, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<FtpServerTest> response = updateFtpServerTestWithHttpInfo(testId, updateFtpServerTest, aid, expand);
    return response.getData();
  }

  /**
   * Update FTP Server test
   * Updates a FTP Server test. The target test cannot be a live share or saved event. This method requires Account Admin permissions.
   * @param testId ID of the test (required)
   * @param updateFtpServerTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;FtpServerTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FtpServerTest> updateFtpServerTestWithHttpInfo(String testId, UpdateFtpServerTest updateFtpServerTest, String aid, List<Expand> expand) throws ApiException {
    updateFtpServerTestValidateRequest(testId, updateFtpServerTest);

    var requestBuilder = updateFtpServerTestRequestBuilder(testId, updateFtpServerTest, aid, expand);

    return apiClient.send(requestBuilder.build(), FtpServerTest.class);
  }

  private void updateFtpServerTestValidateRequest(String testId, UpdateFtpServerTest updateFtpServerTest) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling updateFtpServerTest");
      }
      // verify the required parameter 'updateFtpServerTest' is set
      if (updateFtpServerTest == null) {
        throw new ApiException(400, "Missing the required parameter 'updateFtpServerTest' when calling updateFtpServerTest");
      }
  }

  private ApiRequest.ApiRequestBuilder updateFtpServerTestRequestBuilder(String testId, UpdateFtpServerTest updateFtpServerTest, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/v7/tests/ftp-server/{testId}"
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
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/" + config.getVersion()));
    requestBuilder.requestBody(updateFtpServerTest);
    return requestBuilder;
  }
}
