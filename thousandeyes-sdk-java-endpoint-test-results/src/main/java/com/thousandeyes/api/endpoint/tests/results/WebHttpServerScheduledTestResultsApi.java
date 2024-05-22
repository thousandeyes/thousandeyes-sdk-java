/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.api.endpoint.tests.results;

import static com.thousandeyes.api.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.api.client.RequestUtil.urlEncode;

import com.thousandeyes.api.endpoint.tests.results.utils.Config;
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.client.ApiException;
import com.thousandeyes.api.client.ApiResponse;
import com.thousandeyes.api.client.ApiRequest;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.api.endpoint.tests.results.model.Error;
import com.thousandeyes.api.endpoint.tests.results.model.Expand;
import com.thousandeyes.api.endpoint.tests.results.model.HttpTestResults;
import java.time.OffsetDateTime;
import com.thousandeyes.api.endpoint.tests.results.model.UnauthorizedError;

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
public class WebHttpServerScheduledTestResultsApi {
  private static final Config config = new Config();
  private final ApiClient apiClient;

  public WebHttpServerScheduledTestResultsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Retrieve HTTP server scheduled test results
   * Returns component-level (DNS, Connect, Wait and Receive) timing for the load of an object over HTTP. 
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @param expand This parameter is optional and determines whether to expand resources related to test results. By default, no expansion occurs when this query parameter is omitted. To expand a specific resource, such as \&quot;header,\&quot; append &#x60;?expand&#x3D;header&#x60; to the query. (optional
   * @return HttpTestResults
   * @throws ApiException if fails to make API call
   */
  public HttpTestResults getTestResultHttpServer(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor, List<Expand> expand) throws ApiException {
    ApiResponse<HttpTestResults> response = getTestResultHttpServerWithHttpInfo(testId, aid, window, startDate, endDate, cursor, expand);
    return response.getData();
  }

  /**
   * Retrieve HTTP server scheduled test results
   * Returns component-level (DNS, Connect, Wait and Receive) timing for the load of an object over HTTP. 
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @param expand This parameter is optional and determines whether to expand resources related to test results. By default, no expansion occurs when this query parameter is omitted. To expand a specific resource, such as \&quot;header,\&quot; append &#x60;?expand&#x3D;header&#x60; to the query. (optional
   * @return ApiResponse&lt;HttpTestResults&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<HttpTestResults> getTestResultHttpServerWithHttpInfo(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor, List<Expand> expand) throws ApiException {
    getTestResultHttpServerValidateRequest(testId);

    var requestBuilder = getTestResultHttpServerRequestBuilder(testId, aid, window, startDate, endDate, cursor, expand);

    return apiClient.send(requestBuilder.build(), HttpTestResults.class);
  }

  private void getTestResultHttpServerValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getTestResultHttpServer");
      }
  }

  private ApiRequest.ApiRequestBuilder getTestResultHttpServerRequestBuilder(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/endpoint/test-results/scheduled-tests/{testId}/http-server"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("window", window));
    localVarQueryParams.addAll(parameterToPairs("startDate", startDate));
    localVarQueryParams.addAll(parameterToPairs("endDate", endDate));
    localVarQueryParams.addAll(parameterToPairs("cursor", cursor));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/" + config.getVersion()));
    return requestBuilder;
  }
}
