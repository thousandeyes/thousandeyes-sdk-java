/*
 * Test Results API
 * Get test result metrics for Network and Application Synthetics tests.
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.sdk.tests.results;

import static com.thousandeyes.sdk.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.sdk.client.RequestUtil.urlEncode;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.ApiResponse;
import com.thousandeyes.sdk.client.ApiRequest;
import com.thousandeyes.sdk.utils.Config;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.reflect.TypeUtils;
import com.thousandeyes.sdk.tests.results.model.ApiDetailTestResults;
import com.thousandeyes.sdk.tests.results.model.ApiTestResults;
import com.thousandeyes.sdk.tests.results.model.Error;
import java.time.OffsetDateTime;
import com.thousandeyes.sdk.tests.results.model.UnauthorizedError;
import com.thousandeyes.sdk.tests.results.model.ValidationError;
import com.thousandeyes.sdk.tests.results.model.ApiTestResult;
import com.thousandeyes.sdk.pagination.Paginator;

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
public class ApiTestResultsApi {
  private final ApiClient apiClient;

  public ApiTestResultsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get API test results by agent and round
   * Returns test results for API for a given agent and round. 
   * @param testId Test ID (required)
   * @param agentId Agent ID (required)
   * @param roundId Round ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiDetailTestResults
   * @throws ApiException if fails to make API call
   */
  public ApiDetailTestResults getTestApiAgentRoundResults(String testId, String agentId, String roundId, String aid) throws ApiException {
    ApiResponse<ApiDetailTestResults> response = getTestApiAgentRoundResultsWithHttpInfo(testId, agentId, roundId, aid);
    return response.getData();
  }

  /**
   * Get API test results by agent and round
   * Returns test results for API for a given agent and round. 
   * @param testId Test ID (required)
   * @param agentId Agent ID (required)
   * @param roundId Round ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;ApiDetailTestResults&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ApiDetailTestResults> getTestApiAgentRoundResultsWithHttpInfo(String testId, String agentId, String roundId, String aid) throws ApiException {
    getTestApiAgentRoundResultsValidateRequest(testId, agentId, roundId);

    var requestBuilder = getTestApiAgentRoundResultsRequestBuilder(testId, agentId, roundId, aid);

    return apiClient.send(requestBuilder.build(), ApiDetailTestResults.class);
  }

  private void getTestApiAgentRoundResultsValidateRequest(String testId, String agentId, String roundId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getTestApiAgentRoundResults");
      }
      // verify the required parameter 'agentId' is set
      if (agentId == null) {
        throw new ApiException(400, "Missing the required parameter 'agentId' when calling getTestApiAgentRoundResults");
      }
      // verify the required parameter 'roundId' is set
      if (roundId == null) {
        throw new ApiException(400, "Missing the required parameter 'roundId' when calling getTestApiAgentRoundResults");
      }
  }

  private ApiRequest.ApiRequestBuilder getTestApiAgentRoundResultsRequestBuilder(String testId, String agentId, String roundId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/test-results/{testId}/api/agent/{agentId}/round/{roundId}"
        .replace("{testId}", urlEncode(testId.toString()))
        .replace("{agentId}", urlEncode(agentId.toString()))
        .replace("{roundId}", urlEncode(roundId.toString()));
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
   * Get API test results with pagination
   * Returns test results for API. If no window, start time, or end time is specified, data for the most recent round is returned. If a window or start time is specified, the results might include a round that started just before the specified start time. 
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @return Paginator<ApiTestResult, ApiTestResults>
   */
  public Paginator<ApiTestResult, ApiTestResults> getTestApiResultsPaginated(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate) {
    return new Paginator<>(cursor -> getTestApiResults(testId, aid, window, startDate, endDate, cursor),
                           ApiTestResults::getResults);

  }
  /**
   * Get API test results
   * Returns test results for API. If no window, start time, or end time is specified, data for the most recent round is returned. If a window or start time is specified, the results might include a round that started just before the specified start time. 
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @return ApiTestResults
   * @throws ApiException if fails to make API call
   */
  public ApiTestResults getTestApiResults(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor) throws ApiException {
    ApiResponse<ApiTestResults> response = getTestApiResultsWithHttpInfo(testId, aid, window, startDate, endDate, cursor);
    return response.getData();
  }

  /**
   * Get API test results
   * Returns test results for API. If no window, start time, or end time is specified, data for the most recent round is returned. If a window or start time is specified, the results might include a round that started just before the specified start time. 
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @return ApiResponse&lt;ApiTestResults&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ApiTestResults> getTestApiResultsWithHttpInfo(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor) throws ApiException {
    getTestApiResultsValidateRequest(testId);

    var requestBuilder = getTestApiResultsRequestBuilder(testId, aid, window, startDate, endDate, cursor);

    return apiClient.send(requestBuilder.build(), ApiTestResults.class);
  }

  private void getTestApiResultsValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getTestApiResults");
      }
  }

  private ApiRequest.ApiRequestBuilder getTestApiResultsRequestBuilder(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/test-results/{testId}/api"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("window", window));
    localVarQueryParams.addAll(parameterToPairs("startDate", startDate));
    localVarQueryParams.addAll(parameterToPairs("endDate", endDate));
    localVarQueryParams.addAll(parameterToPairs("cursor", cursor));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
}
