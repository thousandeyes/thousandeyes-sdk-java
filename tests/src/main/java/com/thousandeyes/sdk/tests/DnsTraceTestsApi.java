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
import com.thousandeyes.sdk.tests.model.DnsTraceTestRequest;
import com.thousandeyes.sdk.tests.model.DnsTraceTestResponse;
import com.thousandeyes.sdk.tests.model.DnsTraceTests;
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
public class DnsTraceTestsApi {
  private final ApiClient apiClient;

  public DnsTraceTestsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create DNS Trace test
   * Creates a new DNS Trace test. This method requires Account Admin permissions. 
   * @param dnsTraceTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return DnsTraceTestResponse
   * @throws ApiException if fails to make API call
   */
  public DnsTraceTestResponse createDnsTraceTest(DnsTraceTestRequest dnsTraceTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    ApiResponse<DnsTraceTestResponse> response = createDnsTraceTestWithHttpInfo(dnsTraceTestRequest, aid, expand);
    return response.getData();
  }

  /**
   * Create DNS Trace test
   * Creates a new DNS Trace test. This method requires Account Admin permissions. 
   * @param dnsTraceTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;DnsTraceTestResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DnsTraceTestResponse> createDnsTraceTestWithHttpInfo(DnsTraceTestRequest dnsTraceTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    createDnsTraceTestValidateRequest(dnsTraceTestRequest);

    var requestBuilder = createDnsTraceTestRequestBuilder(dnsTraceTestRequest, aid, expand);

    return apiClient.send(requestBuilder.build(), DnsTraceTestResponse.class);
  }

  private void createDnsTraceTestValidateRequest(DnsTraceTestRequest dnsTraceTestRequest) throws ApiException {
      // verify the required parameter 'dnsTraceTestRequest' is set
      if (dnsTraceTestRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'dnsTraceTestRequest' when calling createDnsTraceTest");
      }
  }

  private ApiRequest.ApiRequestBuilder createDnsTraceTestRequestBuilder(DnsTraceTestRequest dnsTraceTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/tests/dns-trace";
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
    requestBuilder.requestBody(dnsTraceTestRequest);
    return requestBuilder;
  }
  /**
   * Delete DNS Trace test
   * Deletes the specified DNS Trace test. This method requires Account Admin permissions. 
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteDnsTraceTest(String testId, String aid) throws ApiException {
    deleteDnsTraceTestWithHttpInfo(testId, aid);
  }

  /**
   * Delete DNS Trace test
   * Deletes the specified DNS Trace test. This method requires Account Admin permissions. 
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteDnsTraceTestWithHttpInfo(String testId, String aid) throws ApiException {
    deleteDnsTraceTestValidateRequest(testId);

    var requestBuilder = deleteDnsTraceTestRequestBuilder(testId, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteDnsTraceTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling deleteDnsTraceTest");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteDnsTraceTestRequestBuilder(String testId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/tests/dns-trace/{testId}"
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
   * Get DNS Trace test
   * Returns details for a DNS Trace test, including name, intervals, targets, alert rules and agents.
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param versionId The unique identifier for a specific version of the test settings. If provided, returns the test configuration as it existed at that version. To retrieve available version IDs, use the &#x60;/tests/{testId}/history&#x60; endpoint. If not specified, the current version of the test settings is returned. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return DnsTraceTestResponse
   * @throws ApiException if fails to make API call
   */
  public DnsTraceTestResponse getDnsTraceTest(String testId, String aid, String versionId, List<ExpandTestOptions> expand) throws ApiException {
    ApiResponse<DnsTraceTestResponse> response = getDnsTraceTestWithHttpInfo(testId, aid, versionId, expand);
    return response.getData();
  }

  /**
   * Get DNS Trace test
   * Returns details for a DNS Trace test, including name, intervals, targets, alert rules and agents.
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param versionId The unique identifier for a specific version of the test settings. If provided, returns the test configuration as it existed at that version. To retrieve available version IDs, use the &#x60;/tests/{testId}/history&#x60; endpoint. If not specified, the current version of the test settings is returned. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;DnsTraceTestResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DnsTraceTestResponse> getDnsTraceTestWithHttpInfo(String testId, String aid, String versionId, List<ExpandTestOptions> expand) throws ApiException {
    getDnsTraceTestValidateRequest(testId);

    var requestBuilder = getDnsTraceTestRequestBuilder(testId, aid, versionId, expand);

    return apiClient.send(requestBuilder.build(), DnsTraceTestResponse.class);
  }

  private void getDnsTraceTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getDnsTraceTest");
      }
  }

  private ApiRequest.ApiRequestBuilder getDnsTraceTestRequestBuilder(String testId, String aid, String versionId, List<ExpandTestOptions> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/tests/dns-trace/{testId}"
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
   * List DNS Trace tests
   * Returns a list of all DNS Trace tests and saved events.  **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return DnsTraceTests
   * @throws ApiException if fails to make API call
   */
  public DnsTraceTests getDnsTraceTests(String aid) throws ApiException {
    ApiResponse<DnsTraceTests> response = getDnsTraceTestsWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List DNS Trace tests
   * Returns a list of all DNS Trace tests and saved events.  **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;DnsTraceTests&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DnsTraceTests> getDnsTraceTestsWithHttpInfo(String aid) throws ApiException {
    getDnsTraceTestsValidateRequest();

    var requestBuilder = getDnsTraceTestsRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), DnsTraceTests.class);
  }

  private void getDnsTraceTestsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getDnsTraceTestsRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/tests/dns-trace";
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
   * Update DNS Trace test
   * Updates a DNS Trace test. The target test cannot be a live share or saved event. This method requires Account Admin permissions. **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API.
   * @param testId Test ID (required)
   * @param dnsTraceTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return DnsTraceTestResponse
   * @throws ApiException if fails to make API call
   */
  public DnsTraceTestResponse updateDnsTraceTest(String testId, DnsTraceTestRequest dnsTraceTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    ApiResponse<DnsTraceTestResponse> response = updateDnsTraceTestWithHttpInfo(testId, dnsTraceTestRequest, aid, expand);
    return response.getData();
  }

  /**
   * Update DNS Trace test
   * Updates a DNS Trace test. The target test cannot be a live share or saved event. This method requires Account Admin permissions. **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API.
   * @param testId Test ID (required)
   * @param dnsTraceTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;DnsTraceTestResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DnsTraceTestResponse> updateDnsTraceTestWithHttpInfo(String testId, DnsTraceTestRequest dnsTraceTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    updateDnsTraceTestValidateRequest(testId, dnsTraceTestRequest);

    var requestBuilder = updateDnsTraceTestRequestBuilder(testId, dnsTraceTestRequest, aid, expand);

    return apiClient.send(requestBuilder.build(), DnsTraceTestResponse.class);
  }

  private void updateDnsTraceTestValidateRequest(String testId, DnsTraceTestRequest dnsTraceTestRequest) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling updateDnsTraceTest");
      }
      // verify the required parameter 'dnsTraceTestRequest' is set
      if (dnsTraceTestRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'dnsTraceTestRequest' when calling updateDnsTraceTest");
      }
  }

  private ApiRequest.ApiRequestBuilder updateDnsTraceTestRequestBuilder(String testId, DnsTraceTestRequest dnsTraceTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/tests/dns-trace/{testId}"
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
    requestBuilder.requestBody(dnsTraceTestRequest);
    return requestBuilder;
  }
}
