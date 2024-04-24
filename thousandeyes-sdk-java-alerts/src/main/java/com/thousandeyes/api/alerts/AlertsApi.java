/*
 * Alerts API
 * You can manage the following alert functionalities on the ThousandEyes platform using the Alerts API:  * **Alerts**: Retrieve alert details. Alerts are assigned to tests through alert rules.  * **Alert Rules**: Conditions that you configure in order to highlight or be notified of events of interest in your ThousandEyes tests. When an alert rule’s conditions are met, the associated alert is triggered and the alert becomes active. It remains active until the alert is cleared. Alert rules are reusable across multiple tests..  * **Alert Suppression Windows**: Suppress alerts for tests during periods such as planned maintenance. Windows can be one-time events or recurring events to handle periodic occurrences such as monthly downtime for maintenance.  For more information about the alerts, see [Alerts](https://docs.thousandeyes.com/product-documentation/alerts). 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.api.alerts;

import static com.thousandeyes.api.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.api.client.RequestUtil.urlEncode;

import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.client.ApiException;
import com.thousandeyes.api.client.ApiResponse;
import com.thousandeyes.api.client.ApiRequest;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.api.alerts.model.AlertDetail;
import java.math.BigDecimal;
import com.thousandeyes.api.alerts.model.Error;
import com.thousandeyes.api.alerts.model.GetAlerts200Response;
import java.time.OffsetDateTime;
import com.thousandeyes.api.alerts.model.State;
import java.util.UUID;
import com.thousandeyes.api.alerts.model.UnauthorizedError;

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

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T10:46:26.150768+01:00[Europe/Lisbon]")
public class AlertsApi {
  private final ApiClient apiClient;

  public AlertsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Retrieve alert details
   * Returns detailed information about an alert using its ID.
   * @param alertId Unique alert ID. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return AlertDetail
   * @throws ApiException if fails to make API call
   */
  public AlertDetail getAlertDetails(UUID alertId, String aid) throws ApiException {
    ApiResponse<AlertDetail> response = getAlertDetailsWithHttpInfo(alertId, aid);
    return response.getData();
  }

  /**
   * Retrieve alert details
   * Returns detailed information about an alert using its ID.
   * @param alertId Unique alert ID. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;AlertDetail&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AlertDetail> getAlertDetailsWithHttpInfo(UUID alertId, String aid) throws ApiException {
    getAlertDetailsValidateRequest(alertId);

    var requestBuilder = getAlertDetailsRequestBuilder(alertId, aid);

    return apiClient.send(requestBuilder.build(), AlertDetail.class);
  }

  private void getAlertDetailsValidateRequest(UUID alertId) throws ApiException {
      // verify the required parameter 'alertId' is set
      if (alertId == null) {
        throw new ApiException(400, "Missing the required parameter 'alertId' when calling getAlertDetails");
      }
  }

  private ApiRequest.ApiRequestBuilder getAlertDetailsRequestBuilder(UUID alertId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/alerts/{alertId}"
        .replace("{alertId}", urlEncode(alertId.toString()));
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
   * List active alerts
   * Returns a list of active alerts. If no alerts are active within the  specified time range, an empty response is returned.  Note that time filters (&#x60;window&#x60;, &#x60;startDate&#x60;, or &#x60;endDate&#x60;) are only applied to cleared alerts.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param max (Optional) Maximum number of objects to return. (optional)
   * @param state Optional parameter to match a specific alert state. If not specified, it defaults to &#x60;trigger&#x60;. (optional)
   * @return GetAlerts200Response
   * @throws ApiException if fails to make API call
   */
  public GetAlerts200Response getAlerts(String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, BigDecimal max, State state) throws ApiException {
    ApiResponse<GetAlerts200Response> response = getAlertsWithHttpInfo(aid, window, startDate, endDate, max, state);
    return response.getData();
  }

  /**
   * List active alerts
   * Returns a list of active alerts. If no alerts are active within the  specified time range, an empty response is returned.  Note that time filters (&#x60;window&#x60;, &#x60;startDate&#x60;, or &#x60;endDate&#x60;) are only applied to cleared alerts.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param max (Optional) Maximum number of objects to return. (optional)
   * @param state Optional parameter to match a specific alert state. If not specified, it defaults to &#x60;trigger&#x60;. (optional)
   * @return ApiResponse&lt;GetAlerts200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetAlerts200Response> getAlertsWithHttpInfo(String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, BigDecimal max, State state) throws ApiException {
    getAlertsValidateRequest();

    var requestBuilder = getAlertsRequestBuilder(aid, window, startDate, endDate, max, state);

    return apiClient.send(requestBuilder.build(), GetAlerts200Response.class);
  }

  private void getAlertsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getAlertsRequestBuilder(String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, BigDecimal max, State state) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/alerts";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("window", window));
    localVarQueryParams.addAll(parameterToPairs("startDate", startDate));
    localVarQueryParams.addAll(parameterToPairs("endDate", endDate));
    localVarQueryParams.addAll(parameterToPairs("max", max));
    localVarQueryParams.addAll(parameterToPairs("state", state));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    return requestBuilder;
  }
}
