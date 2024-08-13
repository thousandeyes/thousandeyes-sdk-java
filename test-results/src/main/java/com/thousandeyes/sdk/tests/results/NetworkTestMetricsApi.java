/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
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

import com.thousandeyes.sdk.tests.results.model.Error;
import com.thousandeyes.sdk.tests.results.model.NetworkTestResults;
import java.time.OffsetDateTime;
import com.thousandeyes.sdk.tests.results.model.PathVisDetailTestResults;
import com.thousandeyes.sdk.tests.results.model.PathVisDirection;
import com.thousandeyes.sdk.tests.results.model.PathVisTestResults;
import com.thousandeyes.sdk.tests.results.model.TestDirection;
import com.thousandeyes.sdk.tests.results.model.UnauthorizedError;
import com.thousandeyes.sdk.tests.results.model.ValidationError;

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
public class NetworkTestMetricsApi {
  private final ApiClient apiClient;

  public NetworkTestMetricsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get network test results
   * Returns network test results for every agent and round. If you do not specify a window or a start and end date, data is displayed for the most recent testing round. 
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @param direction Choose the direction for the metrics you want: [&#x60;from-target&#x60;, &#x60;to-target&#x60;, &#x60;bidirectional&#x60;]. This applies when you&#39;re doing bidirectional Agent-to-Agent tests. For bidirectional data, you&#39;ll get combined results; otherwise, you&#39;ll get data for one direction. If you try to get unidirectional test data with an incorrect direction parameter, it will trigger an error response. (optional, default to to-target)
   * @return NetworkTestResults
   * @throws ApiException if fails to make API call
   */
  public NetworkTestResults getTestNetworkResults(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor, TestDirection direction) throws ApiException {
    ApiResponse<NetworkTestResults> response = getTestNetworkResultsWithHttpInfo(testId, aid, window, startDate, endDate, cursor, direction);
    return response.getData();
  }

  /**
   * Get network test results
   * Returns network test results for every agent and round. If you do not specify a window or a start and end date, data is displayed for the most recent testing round. 
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @param direction Choose the direction for the metrics you want: [&#x60;from-target&#x60;, &#x60;to-target&#x60;, &#x60;bidirectional&#x60;]. This applies when you&#39;re doing bidirectional Agent-to-Agent tests. For bidirectional data, you&#39;ll get combined results; otherwise, you&#39;ll get data for one direction. If you try to get unidirectional test data with an incorrect direction parameter, it will trigger an error response. (optional, default to to-target)
   * @return ApiResponse&lt;NetworkTestResults&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<NetworkTestResults> getTestNetworkResultsWithHttpInfo(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor, TestDirection direction) throws ApiException {
    getTestNetworkResultsValidateRequest(testId);

    var requestBuilder = getTestNetworkResultsRequestBuilder(testId, aid, window, startDate, endDate, cursor, direction);

    return apiClient.send(requestBuilder.build(), NetworkTestResults.class);
  }

  private void getTestNetworkResultsValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getTestNetworkResults");
      }
  }

  private ApiRequest.ApiRequestBuilder getTestNetworkResultsRequestBuilder(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor, TestDirection direction) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/test-results/{testId}/network"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("window", window));
    localVarQueryParams.addAll(parameterToPairs("startDate", startDate));
    localVarQueryParams.addAll(parameterToPairs("endDate", endDate));
    localVarQueryParams.addAll(parameterToPairs("cursor", cursor));
    localVarQueryParams.addAll(parameterToPairs("direction", direction));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * Get path visualization test results by agent and round
   * Returns a summary of the path trace data collected during path visualization for a given agent and round. With each attempt, three tries are made to reach the destination. The entire path is displayed in order.  Bidirectional agent-to-agent tests also support the &#x60;direction&#x60; parameter. For example, if agents A, B, and C are testing agent D bidirectionally, and you want results from the route from agent A to agent D, you can use the query &#x60;direction&#x3D;to-target&#x60;. For results from agent D to agent A, you can use &#x60;direction&#x3D;from-target&#x60;. To get both results for both routes, query without the direction parameter. The source will always be agent A and the destination will be agent D, but the direction field will indicate which trace direction you want test results from. 
   * @param testId Test ID (required)
   * @param agentId Agent ID (required)
   * @param roundId Round ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param direction Choose the direction for the metrics you want: [&#x60;from-target&#x60;, &#x60;to-target&#x60;]. This applies when you&#39;re doing bidirectional Agent-to-Agent tests. Omitting the parameter will default the results to both &#x60;from-target&#x60; and &#x60;to-target&#x60; values (bidirectional); otherwise, you&#39;ll get data for one direction. If you try to get unidirectional test data with an incorrect direction parameter, it will trigger an error response. (optional)
   * @return PathVisDetailTestResults
   * @throws ApiException if fails to make API call
   */
  public PathVisDetailTestResults getTestPathVisAgentRoundResults(String testId, String agentId, String roundId, String aid, PathVisDirection direction) throws ApiException {
    ApiResponse<PathVisDetailTestResults> response = getTestPathVisAgentRoundResultsWithHttpInfo(testId, agentId, roundId, aid, direction);
    return response.getData();
  }

  /**
   * Get path visualization test results by agent and round
   * Returns a summary of the path trace data collected during path visualization for a given agent and round. With each attempt, three tries are made to reach the destination. The entire path is displayed in order.  Bidirectional agent-to-agent tests also support the &#x60;direction&#x60; parameter. For example, if agents A, B, and C are testing agent D bidirectionally, and you want results from the route from agent A to agent D, you can use the query &#x60;direction&#x3D;to-target&#x60;. For results from agent D to agent A, you can use &#x60;direction&#x3D;from-target&#x60;. To get both results for both routes, query without the direction parameter. The source will always be agent A and the destination will be agent D, but the direction field will indicate which trace direction you want test results from. 
   * @param testId Test ID (required)
   * @param agentId Agent ID (required)
   * @param roundId Round ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param direction Choose the direction for the metrics you want: [&#x60;from-target&#x60;, &#x60;to-target&#x60;]. This applies when you&#39;re doing bidirectional Agent-to-Agent tests. Omitting the parameter will default the results to both &#x60;from-target&#x60; and &#x60;to-target&#x60; values (bidirectional); otherwise, you&#39;ll get data for one direction. If you try to get unidirectional test data with an incorrect direction parameter, it will trigger an error response. (optional)
   * @return ApiResponse&lt;PathVisDetailTestResults&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PathVisDetailTestResults> getTestPathVisAgentRoundResultsWithHttpInfo(String testId, String agentId, String roundId, String aid, PathVisDirection direction) throws ApiException {
    getTestPathVisAgentRoundResultsValidateRequest(testId, agentId, roundId);

    var requestBuilder = getTestPathVisAgentRoundResultsRequestBuilder(testId, agentId, roundId, aid, direction);

    return apiClient.send(requestBuilder.build(), PathVisDetailTestResults.class);
  }

  private void getTestPathVisAgentRoundResultsValidateRequest(String testId, String agentId, String roundId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getTestPathVisAgentRoundResults");
      }
      // verify the required parameter 'agentId' is set
      if (agentId == null) {
        throw new ApiException(400, "Missing the required parameter 'agentId' when calling getTestPathVisAgentRoundResults");
      }
      // verify the required parameter 'roundId' is set
      if (roundId == null) {
        throw new ApiException(400, "Missing the required parameter 'roundId' when calling getTestPathVisAgentRoundResults");
      }
  }

  private ApiRequest.ApiRequestBuilder getTestPathVisAgentRoundResultsRequestBuilder(String testId, String agentId, String roundId, String aid, PathVisDirection direction) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/test-results/{testId}/path-vis/agent/{agentId}/round/{roundId}"
        .replace("{testId}", urlEncode(testId.toString()))
        .replace("{agentId}", urlEncode(agentId.toString()))
        .replace("{roundId}", urlEncode(roundId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("direction", direction));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * Get path visualization network test results
   * Returns a summary of the path trace data collected during path visualization for a given time range. With each attempt, three tries are made to reach the destination. The entire path is displayed in order. If you do not specify a window or a start and end date, data is displayed for the most recent testing round.   Bidirectional agent-to-agent tests also support the &#x60;direction&#x60; parameter. For example, if agents A, B, and C are testing agent D bidirectionally, and you want results from the route from agent A to agent D, you can use the query &#x60;direction&#x3D;to-target&#x60;. For results from agent D to agent A, you can use &#x60;direction&#x3D;from-target&#x60;. To get both results for both routes, query without the direction parameter. The source will always be agent A and the destination will be agent D, but the direction field will indicate which trace direction you want test results from. 
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @param direction Choose the direction for the metrics you want: [&#x60;from-target&#x60;, &#x60;to-target&#x60;]. This applies when you&#39;re doing bidirectional Agent-to-Agent tests. Omitting the parameter will default the results to both &#x60;from-target&#x60; and &#x60;to-target&#x60; values (bidirectional); otherwise, you&#39;ll get data for one direction. If you try to get unidirectional test data with an incorrect direction parameter, it will trigger an error response. (optional)
   * @return PathVisTestResults
   * @throws ApiException if fails to make API call
   */
  public PathVisTestResults getTestPathVisResults(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor, PathVisDirection direction) throws ApiException {
    ApiResponse<PathVisTestResults> response = getTestPathVisResultsWithHttpInfo(testId, aid, window, startDate, endDate, cursor, direction);
    return response.getData();
  }

  /**
   * Get path visualization network test results
   * Returns a summary of the path trace data collected during path visualization for a given time range. With each attempt, three tries are made to reach the destination. The entire path is displayed in order. If you do not specify a window or a start and end date, data is displayed for the most recent testing round.   Bidirectional agent-to-agent tests also support the &#x60;direction&#x60; parameter. For example, if agents A, B, and C are testing agent D bidirectionally, and you want results from the route from agent A to agent D, you can use the query &#x60;direction&#x3D;to-target&#x60;. For results from agent D to agent A, you can use &#x60;direction&#x3D;from-target&#x60;. To get both results for both routes, query without the direction parameter. The source will always be agent A and the destination will be agent D, but the direction field will indicate which trace direction you want test results from. 
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @param direction Choose the direction for the metrics you want: [&#x60;from-target&#x60;, &#x60;to-target&#x60;]. This applies when you&#39;re doing bidirectional Agent-to-Agent tests. Omitting the parameter will default the results to both &#x60;from-target&#x60; and &#x60;to-target&#x60; values (bidirectional); otherwise, you&#39;ll get data for one direction. If you try to get unidirectional test data with an incorrect direction parameter, it will trigger an error response. (optional)
   * @return ApiResponse&lt;PathVisTestResults&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PathVisTestResults> getTestPathVisResultsWithHttpInfo(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor, PathVisDirection direction) throws ApiException {
    getTestPathVisResultsValidateRequest(testId);

    var requestBuilder = getTestPathVisResultsRequestBuilder(testId, aid, window, startDate, endDate, cursor, direction);

    return apiClient.send(requestBuilder.build(), PathVisTestResults.class);
  }

  private void getTestPathVisResultsValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getTestPathVisResults");
      }
  }

  private ApiRequest.ApiRequestBuilder getTestPathVisResultsRequestBuilder(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor, PathVisDirection direction) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/test-results/{testId}/path-vis"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("window", window));
    localVarQueryParams.addAll(parameterToPairs("startDate", startDate));
    localVarQueryParams.addAll(parameterToPairs("endDate", endDate));
    localVarQueryParams.addAll(parameterToPairs("cursor", cursor));
    localVarQueryParams.addAll(parameterToPairs("direction", direction));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
}
