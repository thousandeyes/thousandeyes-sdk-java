/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.sdk.dashboards;

import static com.thousandeyes.sdk.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.sdk.client.RequestUtil.urlEncode;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.ApiResponse;
import com.thousandeyes.sdk.client.ApiRequest;
import com.thousandeyes.sdk.utils.Config;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.reflect.TypeUtils;
import com.thousandeyes.sdk.dashboards.model.ApiDashboard;
import com.thousandeyes.sdk.dashboards.model.ApiWidgetDataResponse;
import java.math.BigDecimal;
import com.thousandeyes.sdk.dashboards.model.Dashboard;
import com.thousandeyes.sdk.dashboards.model.DashboardOrder;
import com.thousandeyes.sdk.dashboards.model.Error;
import java.time.OffsetDateTime;
import java.net.URI;
import com.thousandeyes.sdk.dashboards.model.UnauthorizedError;
import com.thousandeyes.sdk.dashboards.model.ValidationError;

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
public class DashboardsApi {
  private final ApiClient apiClient;

  public DashboardsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create dashboard
   * Creates a new dashboard in your account group. To create a dashboard,  you must have one of the following permissions: * &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin).  * &#x60;Edit own dashboard templates&#x60; permission (Regular User). 
   * @param dashboard Request body schema to create a dashboard. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return Dashboard
   * @throws ApiException if fails to make API call
   */
  public Dashboard createDashboard(Dashboard dashboard, String aid) throws ApiException {
    ApiResponse<Dashboard> response = createDashboardWithHttpInfo(dashboard, aid);
    return response.getData();
  }

  /**
   * Create dashboard
   * Creates a new dashboard in your account group. To create a dashboard,  you must have one of the following permissions: * &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin).  * &#x60;Edit own dashboard templates&#x60; permission (Regular User). 
   * @param dashboard Request body schema to create a dashboard. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Dashboard&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Dashboard> createDashboardWithHttpInfo(Dashboard dashboard, String aid) throws ApiException {
    createDashboardValidateRequest(dashboard);

    var requestBuilder = createDashboardRequestBuilder(dashboard, aid);

    return apiClient.send(requestBuilder.build(), Dashboard.class);
  }

  private void createDashboardValidateRequest(Dashboard dashboard) throws ApiException {
      // verify the required parameter 'dashboard' is set
      if (dashboard == null) {
        throw new ApiException(400, "Missing the required parameter 'dashboard' when calling createDashboard");
      }
  }

  private ApiRequest.ApiRequestBuilder createDashboardRequestBuilder(Dashboard dashboard, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/dashboards";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(dashboard);
    return requestBuilder;
  }
  /**
   * Delete dashboard
   * Deletes a dashboard using the &#x60;dashboardId&#x60; provided in the request.  **Note**: * Users with the &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin) can delete any dashboard. * Users with the &#x60;Edit own dashboard templates&#x60; permission (Regular User) can only delete the dashboards they have created themselves. 
   * @param dashboardId A Identifier for a dashboard which can be obtained from the &#x60;/dashboards&#x60; endpoint. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteDashboard(String dashboardId, String aid) throws ApiException {
    deleteDashboardWithHttpInfo(dashboardId, aid);
  }

  /**
   * Delete dashboard
   * Deletes a dashboard using the &#x60;dashboardId&#x60; provided in the request.  **Note**: * Users with the &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin) can delete any dashboard. * Users with the &#x60;Edit own dashboard templates&#x60; permission (Regular User) can only delete the dashboards they have created themselves. 
   * @param dashboardId A Identifier for a dashboard which can be obtained from the &#x60;/dashboards&#x60; endpoint. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteDashboardWithHttpInfo(String dashboardId, String aid) throws ApiException {
    deleteDashboardValidateRequest(dashboardId);

    var requestBuilder = deleteDashboardRequestBuilder(dashboardId, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteDashboardValidateRequest(String dashboardId) throws ApiException {
      // verify the required parameter 'dashboardId' is set
      if (dashboardId == null) {
        throw new ApiException(400, "Missing the required parameter 'dashboardId' when calling deleteDashboard");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteDashboardRequestBuilder(String dashboardId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/dashboards/{dashboardId}"
        .replace("{dashboardId}", urlEncode(dashboardId.toString()));
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
   * Retrieve dashboard
   * Returns a list of widgets within a dashboard, along with the dashboard&#39;s metadata. 
   * @param dashboardId A Identifier for a dashboard which can be obtained from the &#x60;/dashboards&#x60; endpoint. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiDashboard
   * @throws ApiException if fails to make API call
   */
  public ApiDashboard getDashboard(String dashboardId, String aid) throws ApiException {
    ApiResponse<ApiDashboard> response = getDashboardWithHttpInfo(dashboardId, aid);
    return response.getData();
  }

  /**
   * Retrieve dashboard
   * Returns a list of widgets within a dashboard, along with the dashboard&#39;s metadata. 
   * @param dashboardId A Identifier for a dashboard which can be obtained from the &#x60;/dashboards&#x60; endpoint. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;ApiDashboard&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ApiDashboard> getDashboardWithHttpInfo(String dashboardId, String aid) throws ApiException {
    getDashboardValidateRequest(dashboardId);

    var requestBuilder = getDashboardRequestBuilder(dashboardId, aid);

    return apiClient.send(requestBuilder.build(), ApiDashboard.class);
  }

  private void getDashboardValidateRequest(String dashboardId) throws ApiException {
      // verify the required parameter 'dashboardId' is set
      if (dashboardId == null) {
        throw new ApiException(400, "Missing the required parameter 'dashboardId' when calling getDashboard");
      }
  }

  private ApiRequest.ApiRequestBuilder getDashboardRequestBuilder(String dashboardId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/dashboards/{dashboardId}"
        .replace("{dashboardId}", urlEncode(dashboardId.toString()));
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
   * Retrieve dashboard widget data
   * Returns the raw data displayed within a widget in the dashboard. 
   * @param dashboardId A Identifier for a dashboard which can be obtained from the &#x60;/dashboards&#x60; endpoint. (required)
   * @param widgetId A Identifier for a widget. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param max Optionally specify the maximum number of objects to retrieve. This only applies to the **Alert List** and **Test Table** Widgets. * The default for the **Alert List** widget is set by its limitBy configuration. * The default value for the **Test Table** widget is 10. (optional)
   * @param cursor An optional pagination cursor. This parameter should not not be used directly. Instead, use the &#x60;_links&#x60; returned by the API. This feature is only available in the **Test Table** widget. (optional)
   * @param sort Optional sorting parameter with attributes listed comma-separated. This only applies to the **Alert List** and **Test Table** Widgets. * For the **Alert List** widget, you can sort by &#x60;alertStatus&#x60; or &#x60;startTime&#x60;. The default is &#x60;alertStatus&#x60;. * For the **Test Table** widget, you can sort by &#x60;alertStatus&#x60;, &#x60;testName&#x60;, or &#x60;testType&#x60;. The sequence might vary from the web application. The default sort attribute is &#x60;alertStatus&#x60;. (optional)
   * @param order Optional sorting order parameter that accepts either &#x60;asc&#x60; (ascending) or &#x60;desc&#x60; (descending) values. This only applies to the **Alert List** and **Test Table** Widgets. (optional)
   * @return ApiWidgetDataResponse
   * @throws ApiException if fails to make API call
   */
  public ApiWidgetDataResponse getDashboardWidgetData(String dashboardId, String widgetId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, BigDecimal max, String cursor, String sort, DashboardOrder order) throws ApiException {
    ApiResponse<ApiWidgetDataResponse> response = getDashboardWidgetDataWithHttpInfo(dashboardId, widgetId, aid, window, startDate, endDate, max, cursor, sort, order);
    return response.getData();
  }

  /**
   * Retrieve dashboard widget data
   * Returns the raw data displayed within a widget in the dashboard. 
   * @param dashboardId A Identifier for a dashboard which can be obtained from the &#x60;/dashboards&#x60; endpoint. (required)
   * @param widgetId A Identifier for a widget. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param max Optionally specify the maximum number of objects to retrieve. This only applies to the **Alert List** and **Test Table** Widgets. * The default for the **Alert List** widget is set by its limitBy configuration. * The default value for the **Test Table** widget is 10. (optional)
   * @param cursor An optional pagination cursor. This parameter should not not be used directly. Instead, use the &#x60;_links&#x60; returned by the API. This feature is only available in the **Test Table** widget. (optional)
   * @param sort Optional sorting parameter with attributes listed comma-separated. This only applies to the **Alert List** and **Test Table** Widgets. * For the **Alert List** widget, you can sort by &#x60;alertStatus&#x60; or &#x60;startTime&#x60;. The default is &#x60;alertStatus&#x60;. * For the **Test Table** widget, you can sort by &#x60;alertStatus&#x60;, &#x60;testName&#x60;, or &#x60;testType&#x60;. The sequence might vary from the web application. The default sort attribute is &#x60;alertStatus&#x60;. (optional)
   * @param order Optional sorting order parameter that accepts either &#x60;asc&#x60; (ascending) or &#x60;desc&#x60; (descending) values. This only applies to the **Alert List** and **Test Table** Widgets. (optional)
   * @return ApiResponse&lt;ApiWidgetDataResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ApiWidgetDataResponse> getDashboardWidgetDataWithHttpInfo(String dashboardId, String widgetId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, BigDecimal max, String cursor, String sort, DashboardOrder order) throws ApiException {
    getDashboardWidgetDataValidateRequest(dashboardId, widgetId);

    var requestBuilder = getDashboardWidgetDataRequestBuilder(dashboardId, widgetId, aid, window, startDate, endDate, max, cursor, sort, order);

    return apiClient.send(requestBuilder.build(), ApiWidgetDataResponse.class);
  }

  private void getDashboardWidgetDataValidateRequest(String dashboardId, String widgetId) throws ApiException {
      // verify the required parameter 'dashboardId' is set
      if (dashboardId == null) {
        throw new ApiException(400, "Missing the required parameter 'dashboardId' when calling getDashboardWidgetData");
      }
      // verify the required parameter 'widgetId' is set
      if (widgetId == null) {
        throw new ApiException(400, "Missing the required parameter 'widgetId' when calling getDashboardWidgetData");
      }
  }

  private ApiRequest.ApiRequestBuilder getDashboardWidgetDataRequestBuilder(String dashboardId, String widgetId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, BigDecimal max, String cursor, String sort, DashboardOrder order) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/dashboards/{dashboardId}/widgets/{widgetId}"
        .replace("{dashboardId}", urlEncode(dashboardId.toString()))
        .replace("{widgetId}", urlEncode(widgetId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("window", window));
    localVarQueryParams.addAll(parameterToPairs("startDate", startDate));
    localVarQueryParams.addAll(parameterToPairs("endDate", endDate));
    localVarQueryParams.addAll(parameterToPairs("max", max));
    localVarQueryParams.addAll(parameterToPairs("cursor", cursor));
    localVarQueryParams.addAll(parameterToPairs("sort", sort));
    localVarQueryParams.addAll(parameterToPairs("order", order));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * List dashboards
   * Returns a list of dashboards and their settings within your account group. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return List&lt;ApiDashboard&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ApiDashboard> getDashboards(String aid) throws ApiException {
    ApiResponse<List<ApiDashboard>> response = getDashboardsWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List dashboards
   * Returns a list of dashboards and their settings within your account group. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;List&lt;ApiDashboard&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<ApiDashboard>> getDashboardsWithHttpInfo(String aid) throws ApiException {
    getDashboardsValidateRequest();

    var requestBuilder = getDashboardsRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), TypeUtils.parameterize(List.class, ApiDashboard.class));
  }

  private void getDashboardsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getDashboardsRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/dashboards";
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
   * Update dashboard
   * Updates an existing dashboard in your account group.   **Note**:  * Users with the &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin) can update any dashboard. * Users with the &#x60;Edit own dashboard templates&#x60; permission (Regular User) can only update the dashboards they have created themselves. 
   * @param dashboardId A Identifier for a dashboard which can be obtained from the &#x60;/dashboards&#x60; endpoint. (required)
   * @param dashboard Request body schema to update a dashboard. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return Dashboard
   * @throws ApiException if fails to make API call
   */
  public Dashboard updateDashboard(String dashboardId, Dashboard dashboard, String aid) throws ApiException {
    ApiResponse<Dashboard> response = updateDashboardWithHttpInfo(dashboardId, dashboard, aid);
    return response.getData();
  }

  /**
   * Update dashboard
   * Updates an existing dashboard in your account group.   **Note**:  * Users with the &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin) can update any dashboard. * Users with the &#x60;Edit own dashboard templates&#x60; permission (Regular User) can only update the dashboards they have created themselves. 
   * @param dashboardId A Identifier for a dashboard which can be obtained from the &#x60;/dashboards&#x60; endpoint. (required)
   * @param dashboard Request body schema to update a dashboard. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Dashboard&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Dashboard> updateDashboardWithHttpInfo(String dashboardId, Dashboard dashboard, String aid) throws ApiException {
    updateDashboardValidateRequest(dashboardId, dashboard);

    var requestBuilder = updateDashboardRequestBuilder(dashboardId, dashboard, aid);

    return apiClient.send(requestBuilder.build(), Dashboard.class);
  }

  private void updateDashboardValidateRequest(String dashboardId, Dashboard dashboard) throws ApiException {
      // verify the required parameter 'dashboardId' is set
      if (dashboardId == null) {
        throw new ApiException(400, "Missing the required parameter 'dashboardId' when calling updateDashboard");
      }
      // verify the required parameter 'dashboard' is set
      if (dashboard == null) {
        throw new ApiException(400, "Missing the required parameter 'dashboard' when calling updateDashboard");
      }
  }

  private ApiRequest.ApiRequestBuilder updateDashboardRequestBuilder(String dashboardId, Dashboard dashboard, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/dashboards/{dashboardId}"
        .replace("{dashboardId}", urlEncode(dashboardId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(dashboard);
    return requestBuilder;
  }
}
