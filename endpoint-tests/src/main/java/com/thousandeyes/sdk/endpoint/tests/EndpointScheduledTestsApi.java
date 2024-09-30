/*
 * Endpoint Tests API
 *  Manage endpoint agent dynamic and scheduled tests using the Endpoint Tests API. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.sdk.endpoint.tests;

import static com.thousandeyes.sdk.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.sdk.client.RequestUtil.urlEncode;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.ApiResponse;
import com.thousandeyes.sdk.client.ApiRequest;
import com.thousandeyes.sdk.utils.Config;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.reflect.TypeUtils;
import com.thousandeyes.sdk.endpoint.tests.model.EndpointTests;
import com.thousandeyes.sdk.endpoint.tests.model.Error;
import com.thousandeyes.sdk.endpoint.tests.model.UnauthorizedError;

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
public class EndpointScheduledTestsApi {
  private final ApiClient apiClient;

  public EndpointScheduledTestsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * List endpoint scheduled tests
   * Returns a list of all endpoint scheduled tests configured in ThousandEyes. This list does not contain saved events.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return EndpointTests
   * @throws ApiException if fails to make API call
   */
  public EndpointTests getEndpointScheduledTests(String aid) throws ApiException {
    ApiResponse<EndpointTests> response = getEndpointScheduledTestsWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List endpoint scheduled tests
   * Returns a list of all endpoint scheduled tests configured in ThousandEyes. This list does not contain saved events.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;EndpointTests&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EndpointTests> getEndpointScheduledTestsWithHttpInfo(String aid) throws ApiException {
    getEndpointScheduledTestsValidateRequest();

    var requestBuilder = getEndpointScheduledTestsRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), EndpointTests.class);
  }

  private void getEndpointScheduledTestsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getEndpointScheduledTestsRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/endpoint/tests/scheduled-tests";
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
}
