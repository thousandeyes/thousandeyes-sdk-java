/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
 *
 * The version of the OpenAPI document: 7.0.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.api.tests.results;

import static com.thousandeyes.api.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.api.client.RequestUtil.urlEncode;

import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.client.ApiException;
import com.thousandeyes.api.client.ApiResponse;
import com.thousandeyes.api.client.ApiRequest;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.api.tests.results.model.Error;
import java.time.OffsetDateTime;
import com.thousandeyes.api.tests.results.model.PageLoadDetailTestResults;
import com.thousandeyes.api.tests.results.model.PageLoadTestResults;
import com.thousandeyes.api.tests.results.model.UnauthorizedError;
import com.thousandeyes.api.tests.results.model.ValidationError;

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

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-05-17T09:32:26.577562+01:00[Europe/Lisbon]")
public class WebPageLoadTestMetricsApi {
  private final ApiClient apiClient;

  public WebPageLoadTestMetricsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get page load server test results
   * Returns results for page load server tests with a focus on page load times and DOM for a web page. 
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @return PageLoadTestResults
   * @throws ApiException if fails to make API call
   */
  public PageLoadTestResults getTestResultPageLoad(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor) throws ApiException {
    ApiResponse<PageLoadTestResults> response = getTestResultPageLoadWithHttpInfo(testId, aid, window, startDate, endDate, cursor);
    return response.getData();
  }

  /**
   * Get page load server test results
   * Returns results for page load server tests with a focus on page load times and DOM for a web page. 
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @return ApiResponse&lt;PageLoadTestResults&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PageLoadTestResults> getTestResultPageLoadWithHttpInfo(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor) throws ApiException {
    getTestResultPageLoadValidateRequest(testId);

    var requestBuilder = getTestResultPageLoadRequestBuilder(testId, aid, window, startDate, endDate, cursor);

    return apiClient.send(requestBuilder.build(), PageLoadTestResults.class);
  }

  private void getTestResultPageLoadValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getTestResultPageLoad");
      }
  }

  private ApiRequest.ApiRequestBuilder getTestResultPageLoadRequestBuilder(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/test-results/{testId}/page-load"
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
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    return requestBuilder;
  }
  /**
   * Get page load server test results by agent and round
   * Returns test results for a given agent and round in [HAR (http archive)](http://www.softwareishard.com/blog/har-12-spec/) format. These results contain a list of components and their load times in a page load test, similar to the waterfall view for a page load test. 
   * @param testId Test ID (required)
   * @param agentId Agent ID (required)
   * @param roundId Round ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return PageLoadDetailTestResults
   * @throws ApiException if fails to make API call
   */
  public PageLoadDetailTestResults getTestResultPageLoadComponentDetail(String testId, String agentId, String roundId, String aid) throws ApiException {
    ApiResponse<PageLoadDetailTestResults> response = getTestResultPageLoadComponentDetailWithHttpInfo(testId, agentId, roundId, aid);
    return response.getData();
  }

  /**
   * Get page load server test results by agent and round
   * Returns test results for a given agent and round in [HAR (http archive)](http://www.softwareishard.com/blog/har-12-spec/) format. These results contain a list of components and their load times in a page load test, similar to the waterfall view for a page load test. 
   * @param testId Test ID (required)
   * @param agentId Agent ID (required)
   * @param roundId Round ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;PageLoadDetailTestResults&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PageLoadDetailTestResults> getTestResultPageLoadComponentDetailWithHttpInfo(String testId, String agentId, String roundId, String aid) throws ApiException {
    getTestResultPageLoadComponentDetailValidateRequest(testId, agentId, roundId);

    var requestBuilder = getTestResultPageLoadComponentDetailRequestBuilder(testId, agentId, roundId, aid);

    return apiClient.send(requestBuilder.build(), PageLoadDetailTestResults.class);
  }

  private void getTestResultPageLoadComponentDetailValidateRequest(String testId, String agentId, String roundId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getTestResultPageLoadComponentDetail");
      }
      // verify the required parameter 'agentId' is set
      if (agentId == null) {
        throw new ApiException(400, "Missing the required parameter 'agentId' when calling getTestResultPageLoadComponentDetail");
      }
      // verify the required parameter 'roundId' is set
      if (roundId == null) {
        throw new ApiException(400, "Missing the required parameter 'roundId' when calling getTestResultPageLoadComponentDetail");
      }
  }

  private ApiRequest.ApiRequestBuilder getTestResultPageLoadComponentDetailRequestBuilder(String testId, String agentId, String roundId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/test-results/{testId}/page-load/agent/{agentId}/round/{roundId}"
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
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    return requestBuilder;
  }
}
