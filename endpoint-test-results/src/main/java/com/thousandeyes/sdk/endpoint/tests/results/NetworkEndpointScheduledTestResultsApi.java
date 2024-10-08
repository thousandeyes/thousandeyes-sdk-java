/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.sdk.endpoint.tests.results;

import static com.thousandeyes.sdk.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.sdk.client.RequestUtil.urlEncode;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.ApiResponse;
import com.thousandeyes.sdk.client.ApiRequest;
import com.thousandeyes.sdk.utils.Config;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.reflect.TypeUtils;
import com.thousandeyes.sdk.endpoint.tests.results.model.EndpointTestsDataRoundsSearch;
import com.thousandeyes.sdk.endpoint.tests.results.model.Error;
import com.thousandeyes.sdk.endpoint.tests.results.model.MultiTestIdEndpointTestsDataRoundsSearch;
import com.thousandeyes.sdk.endpoint.tests.results.model.MultiTestIdNetworkEndpointTestResults;
import com.thousandeyes.sdk.endpoint.tests.results.model.NetworkEndpointTestResults;
import java.time.OffsetDateTime;
import com.thousandeyes.sdk.endpoint.tests.results.model.PathVisDetailEndpointTestResults;
import com.thousandeyes.sdk.endpoint.tests.results.model.PathVisEndpointTestResults;
import com.thousandeyes.sdk.endpoint.tests.results.model.UnauthorizedError;
import com.thousandeyes.sdk.endpoint.tests.results.model.NetworkEndpointTestResult;
import com.thousandeyes.sdk.pagination.Paginator;
import com.thousandeyes.sdk.endpoint.tests.results.model.NetworkEndpointTestResult;
import com.thousandeyes.sdk.pagination.Paginator;
import com.thousandeyes.sdk.endpoint.tests.results.model.PathVisEndpointTestResult;
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
public class NetworkEndpointScheduledTestResultsApi {
  private final ApiClient apiClient;

  public NetworkEndpointScheduledTestResultsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Retrieve network scheduled test results with pagination
   * Returns network metrics (loss, latency, and jitter) from each endpoint agent, for each roundId within the specified time window, as determined by search filters. If a time frame is provided, the rounds relevant to that time frame are returned, and the order is not predefined unless the user specifies a sort order in the filter. When no time frame is provided, the latest rounds are returned. 
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endpointTestsDataRoundsSearch Tests data search filters. (optional)
   * @return Paginator<NetworkEndpointTestResult, NetworkEndpointTestResults>
   */
  public Paginator<NetworkEndpointTestResult, NetworkEndpointTestResults> filterScheduledTestNetworkResultsPaginated(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, EndpointTestsDataRoundsSearch endpointTestsDataRoundsSearch) {
    return new Paginator<>(cursor -> filterScheduledTestNetworkResults(testId, aid, window, startDate, endDate, cursor, endpointTestsDataRoundsSearch),
                           NetworkEndpointTestResults::getResults);

  }
  /**
   * Retrieve network scheduled test results
   * Returns network metrics (loss, latency, and jitter) from each endpoint agent, for each roundId within the specified time window, as determined by search filters. If a time frame is provided, the rounds relevant to that time frame are returned, and the order is not predefined unless the user specifies a sort order in the filter. When no time frame is provided, the latest rounds are returned. 
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @param endpointTestsDataRoundsSearch Tests data search filters. (optional)
   * @return NetworkEndpointTestResults
   * @throws ApiException if fails to make API call
   */
  public NetworkEndpointTestResults filterScheduledTestNetworkResults(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor, EndpointTestsDataRoundsSearch endpointTestsDataRoundsSearch) throws ApiException {
    ApiResponse<NetworkEndpointTestResults> response = filterScheduledTestNetworkResultsWithHttpInfo(testId, aid, window, startDate, endDate, cursor, endpointTestsDataRoundsSearch);
    return response.getData();
  }

  /**
   * Retrieve network scheduled test results
   * Returns network metrics (loss, latency, and jitter) from each endpoint agent, for each roundId within the specified time window, as determined by search filters. If a time frame is provided, the rounds relevant to that time frame are returned, and the order is not predefined unless the user specifies a sort order in the filter. When no time frame is provided, the latest rounds are returned. 
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @param endpointTestsDataRoundsSearch Tests data search filters. (optional)
   * @return ApiResponse&lt;NetworkEndpointTestResults&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<NetworkEndpointTestResults> filterScheduledTestNetworkResultsWithHttpInfo(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor, EndpointTestsDataRoundsSearch endpointTestsDataRoundsSearch) throws ApiException {
    filterScheduledTestNetworkResultsValidateRequest(testId);

    var requestBuilder = filterScheduledTestNetworkResultsRequestBuilder(testId, aid, window, startDate, endDate, cursor, endpointTestsDataRoundsSearch);

    return apiClient.send(requestBuilder.build(), NetworkEndpointTestResults.class);
  }

  private void filterScheduledTestNetworkResultsValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling filterScheduledTestNetworkResults");
      }
  }

  private ApiRequest.ApiRequestBuilder filterScheduledTestNetworkResultsRequestBuilder(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor, EndpointTestsDataRoundsSearch endpointTestsDataRoundsSearch) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/endpoint/test-results/scheduled-tests/{testId}/network/filter"
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

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(endpointTestsDataRoundsSearch);
    return requestBuilder;
  }
  /**
   * Retrieve network scheduled test results from multiple tests with pagination
   * Returns network metrics, including loss, latency, and jitter, for multiple test IDs obtained from each endpoint agent. It allows you to specify a time window using search filters to retrieve metrics for specific round IDs within that time frame. The default order of results is unspecified unless you include a sorting preference in the filter. When no time frame is provided, the API returns metrics for the most recent rounds. Access to all accounts associated with the specified test IDs is required to use this endpoint. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param max (Optional) Maximum number of objects to return. (optional)
   * @param multiTestIdEndpointTestsDataRoundsSearch Test data search filters. (optional)
   * @return Paginator<NetworkEndpointTestResult, MultiTestIdNetworkEndpointTestResults>
   */
  public Paginator<NetworkEndpointTestResult, MultiTestIdNetworkEndpointTestResults> filterScheduledTestsNetworkResultsPaginated(String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, Integer max, MultiTestIdEndpointTestsDataRoundsSearch multiTestIdEndpointTestsDataRoundsSearch) {
    return new Paginator<>(cursor -> filterScheduledTestsNetworkResults(aid, window, startDate, endDate, max, cursor, multiTestIdEndpointTestsDataRoundsSearch),
                           MultiTestIdNetworkEndpointTestResults::getResults);

  }
  /**
   * Retrieve network scheduled test results from multiple tests
   * Returns network metrics, including loss, latency, and jitter, for multiple test IDs obtained from each endpoint agent. It allows you to specify a time window using search filters to retrieve metrics for specific round IDs within that time frame. The default order of results is unspecified unless you include a sorting preference in the filter. When no time frame is provided, the API returns metrics for the most recent rounds. Access to all accounts associated with the specified test IDs is required to use this endpoint. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param max (Optional) Maximum number of objects to return. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @param multiTestIdEndpointTestsDataRoundsSearch Test data search filters. (optional)
   * @return MultiTestIdNetworkEndpointTestResults
   * @throws ApiException if fails to make API call
   */
  public MultiTestIdNetworkEndpointTestResults filterScheduledTestsNetworkResults(String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, Integer max, String cursor, MultiTestIdEndpointTestsDataRoundsSearch multiTestIdEndpointTestsDataRoundsSearch) throws ApiException {
    ApiResponse<MultiTestIdNetworkEndpointTestResults> response = filterScheduledTestsNetworkResultsWithHttpInfo(aid, window, startDate, endDate, max, cursor, multiTestIdEndpointTestsDataRoundsSearch);
    return response.getData();
  }

  /**
   * Retrieve network scheduled test results from multiple tests
   * Returns network metrics, including loss, latency, and jitter, for multiple test IDs obtained from each endpoint agent. It allows you to specify a time window using search filters to retrieve metrics for specific round IDs within that time frame. The default order of results is unspecified unless you include a sorting preference in the filter. When no time frame is provided, the API returns metrics for the most recent rounds. Access to all accounts associated with the specified test IDs is required to use this endpoint. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param max (Optional) Maximum number of objects to return. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @param multiTestIdEndpointTestsDataRoundsSearch Test data search filters. (optional)
   * @return ApiResponse&lt;MultiTestIdNetworkEndpointTestResults&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<MultiTestIdNetworkEndpointTestResults> filterScheduledTestsNetworkResultsWithHttpInfo(String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, Integer max, String cursor, MultiTestIdEndpointTestsDataRoundsSearch multiTestIdEndpointTestsDataRoundsSearch) throws ApiException {
    filterScheduledTestsNetworkResultsValidateRequest();

    var requestBuilder = filterScheduledTestsNetworkResultsRequestBuilder(aid, window, startDate, endDate, max, cursor, multiTestIdEndpointTestsDataRoundsSearch);

    return apiClient.send(requestBuilder.build(), MultiTestIdNetworkEndpointTestResults.class);
  }

  private void filterScheduledTestsNetworkResultsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder filterScheduledTestsNetworkResultsRequestBuilder(String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, Integer max, String cursor, MultiTestIdEndpointTestsDataRoundsSearch multiTestIdEndpointTestsDataRoundsSearch) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/endpoint/test-results/scheduled-tests/network/filter";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("window", window));
    localVarQueryParams.addAll(parameterToPairs("startDate", startDate));
    localVarQueryParams.addAll(parameterToPairs("endDate", endDate));
    localVarQueryParams.addAll(parameterToPairs("max", max));
    localVarQueryParams.addAll(parameterToPairs("cursor", cursor));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(multiTestIdEndpointTestsDataRoundsSearch);
    return requestBuilder;
  }
  /**
   * Retrieve path visualization network scheduled test results details
   * Returns a hop-by-hop summary of the path trace data collected during path visualization. In each round, one path discovery attempt is made to reach the destination. The entire path is returned. A &#x60;roundId&#x60; must be specified. 
   * @param testId Test ID (required)
   * @param agentId Agent ID (required)
   * @param roundId Round ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return PathVisDetailEndpointTestResults
   * @throws ApiException if fails to make API call
   */
  public PathVisDetailEndpointTestResults getScheduledTestPathVisAgentRoundResults(String testId, String agentId, String roundId, String aid) throws ApiException {
    ApiResponse<PathVisDetailEndpointTestResults> response = getScheduledTestPathVisAgentRoundResultsWithHttpInfo(testId, agentId, roundId, aid);
    return response.getData();
  }

  /**
   * Retrieve path visualization network scheduled test results details
   * Returns a hop-by-hop summary of the path trace data collected during path visualization. In each round, one path discovery attempt is made to reach the destination. The entire path is returned. A &#x60;roundId&#x60; must be specified. 
   * @param testId Test ID (required)
   * @param agentId Agent ID (required)
   * @param roundId Round ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;PathVisDetailEndpointTestResults&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PathVisDetailEndpointTestResults> getScheduledTestPathVisAgentRoundResultsWithHttpInfo(String testId, String agentId, String roundId, String aid) throws ApiException {
    getScheduledTestPathVisAgentRoundResultsValidateRequest(testId, agentId, roundId);

    var requestBuilder = getScheduledTestPathVisAgentRoundResultsRequestBuilder(testId, agentId, roundId, aid);

    return apiClient.send(requestBuilder.build(), PathVisDetailEndpointTestResults.class);
  }

  private void getScheduledTestPathVisAgentRoundResultsValidateRequest(String testId, String agentId, String roundId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getScheduledTestPathVisAgentRoundResults");
      }
      // verify the required parameter 'agentId' is set
      if (agentId == null) {
        throw new ApiException(400, "Missing the required parameter 'agentId' when calling getScheduledTestPathVisAgentRoundResults");
      }
      // verify the required parameter 'roundId' is set
      if (roundId == null) {
        throw new ApiException(400, "Missing the required parameter 'roundId' when calling getScheduledTestPathVisAgentRoundResults");
      }
  }

  private ApiRequest.ApiRequestBuilder getScheduledTestPathVisAgentRoundResultsRequestBuilder(String testId, String agentId, String roundId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/endpoint/test-results/scheduled-tests/{testId}/path-vis/agent/{agentId}/round/{roundId}"
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
   * Retrieve path visualization network scheduled test results with pagination
   * Returns a summary of the path visualization data collected from each endpoint agent to the destination. In each path visualization attempt, one attempt is made to reach the destination. Each set of data is summarized, based on response time, number of hops, and response time to the target. A time frame must be specified, or the most recent round within last 2 hours is returned. 
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @return Paginator<PathVisEndpointTestResult, PathVisEndpointTestResults>
   */
  public Paginator<PathVisEndpointTestResult, PathVisEndpointTestResults> getScheduledTestPathVisResultsPaginated(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate) {
    return new Paginator<>(cursor -> getScheduledTestPathVisResults(testId, aid, window, startDate, endDate, cursor),
                           PathVisEndpointTestResults::getResults);

  }
  /**
   * Retrieve path visualization network scheduled test results
   * Returns a summary of the path visualization data collected from each endpoint agent to the destination. In each path visualization attempt, one attempt is made to reach the destination. Each set of data is summarized, based on response time, number of hops, and response time to the target. A time frame must be specified, or the most recent round within last 2 hours is returned. 
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @return PathVisEndpointTestResults
   * @throws ApiException if fails to make API call
   */
  public PathVisEndpointTestResults getScheduledTestPathVisResults(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor) throws ApiException {
    ApiResponse<PathVisEndpointTestResults> response = getScheduledTestPathVisResultsWithHttpInfo(testId, aid, window, startDate, endDate, cursor);
    return response.getData();
  }

  /**
   * Retrieve path visualization network scheduled test results
   * Returns a summary of the path visualization data collected from each endpoint agent to the destination. In each path visualization attempt, one attempt is made to reach the destination. Each set of data is summarized, based on response time, number of hops, and response time to the target. A time frame must be specified, or the most recent round within last 2 hours is returned. 
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @return ApiResponse&lt;PathVisEndpointTestResults&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PathVisEndpointTestResults> getScheduledTestPathVisResultsWithHttpInfo(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor) throws ApiException {
    getScheduledTestPathVisResultsValidateRequest(testId);

    var requestBuilder = getScheduledTestPathVisResultsRequestBuilder(testId, aid, window, startDate, endDate, cursor);

    return apiClient.send(requestBuilder.build(), PathVisEndpointTestResults.class);
  }

  private void getScheduledTestPathVisResultsValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getScheduledTestPathVisResults");
      }
  }

  private ApiRequest.ApiRequestBuilder getScheduledTestPathVisResultsRequestBuilder(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/endpoint/test-results/scheduled-tests/{testId}/path-vis"
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
