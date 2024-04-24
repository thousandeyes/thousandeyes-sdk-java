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

import com.thousandeyes.api.tests.model.DnsSecTest;
import com.thousandeyes.api.tests.model.Error;
import com.thousandeyes.api.tests.model.Expand;
import com.thousandeyes.api.tests.model.GetDnsSecTests200Response;
import java.net.URI;
import com.thousandeyes.api.tests.model.UnauthorizedError;
import com.thousandeyes.api.tests.model.UpdateDnsSecTest;
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

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T10:46:27.140198+01:00[Europe/Lisbon]")
public class DnssecApi {
  private final ApiClient apiClient;

  public DnssecApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create DNSSEC test
   * Creates a new DNSSEC test. This method requires Account Admin permissions. 
   * @param updateDnsSecTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return DnsSecTest
   * @throws ApiException if fails to make API call
   */
  public DnsSecTest createDnsSecTest(UpdateDnsSecTest updateDnsSecTest, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<DnsSecTest> response = createDnsSecTestWithHttpInfo(updateDnsSecTest, aid, expand);
    return response.getData();
  }

  /**
   * Create DNSSEC test
   * Creates a new DNSSEC test. This method requires Account Admin permissions. 
   * @param updateDnsSecTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;DnsSecTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DnsSecTest> createDnsSecTestWithHttpInfo(UpdateDnsSecTest updateDnsSecTest, String aid, List<Expand> expand) throws ApiException {
    createDnsSecTestValidateRequest(updateDnsSecTest);

    var requestBuilder = createDnsSecTestRequestBuilder(updateDnsSecTest, aid, expand);

    return apiClient.send(requestBuilder.build(), DnsSecTest.class);
  }

  private void createDnsSecTestValidateRequest(UpdateDnsSecTest updateDnsSecTest) throws ApiException {
      // verify the required parameter 'updateDnsSecTest' is set
      if (updateDnsSecTest == null) {
        throw new ApiException(400, "Missing the required parameter 'updateDnsSecTest' when calling createDnsSecTest");
      }
  }

  private ApiRequest.ApiRequestBuilder createDnsSecTestRequestBuilder(UpdateDnsSecTest updateDnsSecTest, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/tests/dnssec";
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
    requestBuilder.requestBody(updateDnsSecTest);
    return requestBuilder;
  }
  /**
   * Delete DNSSEC test
   * Deletes the specified DNSSEC test. This method requires Account Admin permissions.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteDnsSecTest(String testId, String aid) throws ApiException {
    deleteDnsSecTestWithHttpInfo(testId, aid);
  }

  /**
   * Delete DNSSEC test
   * Deletes the specified DNSSEC test. This method requires Account Admin permissions.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteDnsSecTestWithHttpInfo(String testId, String aid) throws ApiException {
    deleteDnsSecTestValidateRequest(testId);

    var requestBuilder = deleteDnsSecTestRequestBuilder(testId, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteDnsSecTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling deleteDnsSecTest");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteDnsSecTestRequestBuilder(String testId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/v7/tests/dnssec/{testId}"
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
   * Get DNSSEC test
   * Returns details for a DNSSEC test, including name, intervals, targets, alert rules and agents.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return DnsSecTest
   * @throws ApiException if fails to make API call
   */
  public DnsSecTest getDnsSecTest(String testId, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<DnsSecTest> response = getDnsSecTestWithHttpInfo(testId, aid, expand);
    return response.getData();
  }

  /**
   * Get DNSSEC test
   * Returns details for a DNSSEC test, including name, intervals, targets, alert rules and agents.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;DnsSecTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DnsSecTest> getDnsSecTestWithHttpInfo(String testId, String aid, List<Expand> expand) throws ApiException {
    getDnsSecTestValidateRequest(testId);

    var requestBuilder = getDnsSecTestRequestBuilder(testId, aid, expand);

    return apiClient.send(requestBuilder.build(), DnsSecTest.class);
  }

  private void getDnsSecTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getDnsSecTest");
      }
  }

  private ApiRequest.ApiRequestBuilder getDnsSecTestRequestBuilder(String testId, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/tests/dnssec/{testId}"
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
   * List DNSSEC tests
   * Returns a list of all DNSSEC tests and saved events.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return GetDnsSecTests200Response
   * @throws ApiException if fails to make API call
   */
  public GetDnsSecTests200Response getDnsSecTests(String aid) throws ApiException {
    ApiResponse<GetDnsSecTests200Response> response = getDnsSecTestsWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List DNSSEC tests
   * Returns a list of all DNSSEC tests and saved events.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;GetDnsSecTests200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetDnsSecTests200Response> getDnsSecTestsWithHttpInfo(String aid) throws ApiException {
    getDnsSecTestsValidateRequest();

    var requestBuilder = getDnsSecTestsRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), GetDnsSecTests200Response.class);
  }

  private void getDnsSecTestsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getDnsSecTestsRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/tests/dnssec";
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
   * Update DNSSEC test
   * Updates a DNSSEC test. The target test cannot be a live share or saved event. This method requires Account Admin permissions.
   * @param testId ID of the test (required)
   * @param updateDnsSecTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return DnsSecTest
   * @throws ApiException if fails to make API call
   */
  public DnsSecTest updateDnsSecTest(String testId, UpdateDnsSecTest updateDnsSecTest, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<DnsSecTest> response = updateDnsSecTestWithHttpInfo(testId, updateDnsSecTest, aid, expand);
    return response.getData();
  }

  /**
   * Update DNSSEC test
   * Updates a DNSSEC test. The target test cannot be a live share or saved event. This method requires Account Admin permissions.
   * @param testId ID of the test (required)
   * @param updateDnsSecTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;DnsSecTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DnsSecTest> updateDnsSecTestWithHttpInfo(String testId, UpdateDnsSecTest updateDnsSecTest, String aid, List<Expand> expand) throws ApiException {
    updateDnsSecTestValidateRequest(testId, updateDnsSecTest);

    var requestBuilder = updateDnsSecTestRequestBuilder(testId, updateDnsSecTest, aid, expand);

    return apiClient.send(requestBuilder.build(), DnsSecTest.class);
  }

  private void updateDnsSecTestValidateRequest(String testId, UpdateDnsSecTest updateDnsSecTest) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling updateDnsSecTest");
      }
      // verify the required parameter 'updateDnsSecTest' is set
      if (updateDnsSecTest == null) {
        throw new ApiException(400, "Missing the required parameter 'updateDnsSecTest' when calling updateDnsSecTest");
      }
  }

  private ApiRequest.ApiRequestBuilder updateDnsSecTestRequestBuilder(String testId, UpdateDnsSecTest updateDnsSecTest, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/v7/tests/dnssec/{testId}"
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
    requestBuilder.requestBody(updateDnsSecTest);
    return requestBuilder;
  }
}
