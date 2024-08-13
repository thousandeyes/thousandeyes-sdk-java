/*
 * Alerts API
 * You can manage the following alert functionalities on the ThousandEyes platform using the Alerts API:  * **Alerts**: Retrieve alert details. Alerts are assigned to tests through alert rules.  * **Alert Rules**: Conditions that you configure in order to highlight or be notified of events of interest in your ThousandEyes tests. When an alert rule’s conditions are met, the associated alert is triggered and the alert becomes active. It remains active until the alert is cleared. Alert rules are reusable across multiple tests..  * **Alert Suppression Windows**: Suppress alerts for tests during periods such as planned maintenance. Windows can be one-time events or recurring events to handle periodic occurrences such as monthly downtime for maintenance.  For more information about the alerts, see [Alerts](https://docs.thousandeyes.com/product-documentation/alerts). 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.sdk.alerts;

import static com.thousandeyes.sdk.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.sdk.client.RequestUtil.urlEncode;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.ApiResponse;
import com.thousandeyes.sdk.client.ApiRequest;
import com.thousandeyes.sdk.utils.Config;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.sdk.alerts.model.AlertSuppressionWindowDetail;
import com.thousandeyes.sdk.alerts.model.AlertSuppressionWindowRequest;
import com.thousandeyes.sdk.alerts.model.AlertSuppressionWindows;
import com.thousandeyes.sdk.alerts.model.Error;
import com.thousandeyes.sdk.alerts.model.Expand;
import java.net.URI;
import com.thousandeyes.sdk.alerts.model.UnauthorizedError;
import com.thousandeyes.sdk.alerts.model.ValidationError;

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
public class AlertSuppressionWindowsApi {
  private final ApiClient apiClient;

  public AlertSuppressionWindowsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create alert suppression window
   * Creates a new alert suppression window in ThousandEyes, using the  provided POST data. Only Account Admins can create alert suppression windows.
   * @param alertSuppressionWindowRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand alert related resources.  Without this parameter, there&#39;s no default expansion. For example, to expand the \&quot;tests\&quot; resource, use the &#x60;?expand&#x3D;test&#x60; query. (optional
   * @return AlertSuppressionWindowDetail
   * @throws ApiException if fails to make API call
   */
  public AlertSuppressionWindowDetail createAlertSuppressionWindow(AlertSuppressionWindowRequest alertSuppressionWindowRequest, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<AlertSuppressionWindowDetail> response = createAlertSuppressionWindowWithHttpInfo(alertSuppressionWindowRequest, aid, expand);
    return response.getData();
  }

  /**
   * Create alert suppression window
   * Creates a new alert suppression window in ThousandEyes, using the  provided POST data. Only Account Admins can create alert suppression windows.
   * @param alertSuppressionWindowRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand alert related resources.  Without this parameter, there&#39;s no default expansion. For example, to expand the \&quot;tests\&quot; resource, use the &#x60;?expand&#x3D;test&#x60; query. (optional
   * @return ApiResponse&lt;AlertSuppressionWindowDetail&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AlertSuppressionWindowDetail> createAlertSuppressionWindowWithHttpInfo(AlertSuppressionWindowRequest alertSuppressionWindowRequest, String aid, List<Expand> expand) throws ApiException {
    createAlertSuppressionWindowValidateRequest(alertSuppressionWindowRequest);

    var requestBuilder = createAlertSuppressionWindowRequestBuilder(alertSuppressionWindowRequest, aid, expand);

    return apiClient.send(requestBuilder.build(), AlertSuppressionWindowDetail.class);
  }

  private void createAlertSuppressionWindowValidateRequest(AlertSuppressionWindowRequest alertSuppressionWindowRequest) throws ApiException {
      // verify the required parameter 'alertSuppressionWindowRequest' is set
      if (alertSuppressionWindowRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'alertSuppressionWindowRequest' when calling createAlertSuppressionWindow");
      }
  }

  private ApiRequest.ApiRequestBuilder createAlertSuppressionWindowRequestBuilder(AlertSuppressionWindowRequest alertSuppressionWindowRequest, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/alert-suppression-windows";
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
    requestBuilder.requestBody(alertSuppressionWindowRequest);
    return requestBuilder;
  }
  /**
   * Delete alert suppression window
   * Deletes an alert suppression window.
   * @param windowId Unique window ID. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteAlertSuppressionWindow(String windowId, String aid) throws ApiException {
    deleteAlertSuppressionWindowWithHttpInfo(windowId, aid);
  }

  /**
   * Delete alert suppression window
   * Deletes an alert suppression window.
   * @param windowId Unique window ID. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAlertSuppressionWindowWithHttpInfo(String windowId, String aid) throws ApiException {
    deleteAlertSuppressionWindowValidateRequest(windowId);

    var requestBuilder = deleteAlertSuppressionWindowRequestBuilder(windowId, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteAlertSuppressionWindowValidateRequest(String windowId) throws ApiException {
      // verify the required parameter 'windowId' is set
      if (windowId == null) {
        throw new ApiException(400, "Missing the required parameter 'windowId' when calling deleteAlertSuppressionWindow");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteAlertSuppressionWindowRequestBuilder(String windowId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/alert-suppression-windows/{windowId}"
        .replace("{windowId}", urlEncode(windowId.toString()));
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
   * Retrieve alert suppression window
   * Returns detailed information about an alert suppression window configured in your account group.
   * @param windowId Unique window ID. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand alert related resources.  Without this parameter, there&#39;s no default expansion. For example, to expand the \&quot;tests\&quot; resource, use the &#x60;?expand&#x3D;test&#x60; query. (optional
   * @return AlertSuppressionWindowDetail
   * @throws ApiException if fails to make API call
   */
  public AlertSuppressionWindowDetail getAlertSuppressionWindow(String windowId, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<AlertSuppressionWindowDetail> response = getAlertSuppressionWindowWithHttpInfo(windowId, aid, expand);
    return response.getData();
  }

  /**
   * Retrieve alert suppression window
   * Returns detailed information about an alert suppression window configured in your account group.
   * @param windowId Unique window ID. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand alert related resources.  Without this parameter, there&#39;s no default expansion. For example, to expand the \&quot;tests\&quot; resource, use the &#x60;?expand&#x3D;test&#x60; query. (optional
   * @return ApiResponse&lt;AlertSuppressionWindowDetail&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AlertSuppressionWindowDetail> getAlertSuppressionWindowWithHttpInfo(String windowId, String aid, List<Expand> expand) throws ApiException {
    getAlertSuppressionWindowValidateRequest(windowId);

    var requestBuilder = getAlertSuppressionWindowRequestBuilder(windowId, aid, expand);

    return apiClient.send(requestBuilder.build(), AlertSuppressionWindowDetail.class);
  }

  private void getAlertSuppressionWindowValidateRequest(String windowId) throws ApiException {
      // verify the required parameter 'windowId' is set
      if (windowId == null) {
        throw new ApiException(400, "Missing the required parameter 'windowId' when calling getAlertSuppressionWindow");
      }
  }

  private ApiRequest.ApiRequestBuilder getAlertSuppressionWindowRequestBuilder(String windowId, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/alert-suppression-windows/{windowId}"
        .replace("{windowId}", urlEncode(windowId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * List alert suppression windows
   * Returns a list of all alert suppression windows configured in your account group.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return AlertSuppressionWindows
   * @throws ApiException if fails to make API call
   */
  public AlertSuppressionWindows getAlertSuppressionWindows(String aid) throws ApiException {
    ApiResponse<AlertSuppressionWindows> response = getAlertSuppressionWindowsWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List alert suppression windows
   * Returns a list of all alert suppression windows configured in your account group.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;AlertSuppressionWindows&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AlertSuppressionWindows> getAlertSuppressionWindowsWithHttpInfo(String aid) throws ApiException {
    getAlertSuppressionWindowsValidateRequest();

    var requestBuilder = getAlertSuppressionWindowsRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), AlertSuppressionWindows.class);
  }

  private void getAlertSuppressionWindowsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getAlertSuppressionWindowsRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/alert-suppression-windows";
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
   * Update alert suppression window
   * Updates an alert suppression window in ThousandEyes, using the  provided POST data. Only Account Admins can update alert suppression windows.
   * @param windowId Unique window ID. (required)
   * @param alertSuppressionWindowRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand alert related resources.  Without this parameter, there&#39;s no default expansion. For example, to expand the \&quot;tests\&quot; resource, use the &#x60;?expand&#x3D;test&#x60; query. (optional
   * @return AlertSuppressionWindowDetail
   * @throws ApiException if fails to make API call
   */
  public AlertSuppressionWindowDetail updateAlertSuppressionWindow(String windowId, AlertSuppressionWindowRequest alertSuppressionWindowRequest, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<AlertSuppressionWindowDetail> response = updateAlertSuppressionWindowWithHttpInfo(windowId, alertSuppressionWindowRequest, aid, expand);
    return response.getData();
  }

  /**
   * Update alert suppression window
   * Updates an alert suppression window in ThousandEyes, using the  provided POST data. Only Account Admins can update alert suppression windows.
   * @param windowId Unique window ID. (required)
   * @param alertSuppressionWindowRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand alert related resources.  Without this parameter, there&#39;s no default expansion. For example, to expand the \&quot;tests\&quot; resource, use the &#x60;?expand&#x3D;test&#x60; query. (optional
   * @return ApiResponse&lt;AlertSuppressionWindowDetail&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AlertSuppressionWindowDetail> updateAlertSuppressionWindowWithHttpInfo(String windowId, AlertSuppressionWindowRequest alertSuppressionWindowRequest, String aid, List<Expand> expand) throws ApiException {
    updateAlertSuppressionWindowValidateRequest(windowId, alertSuppressionWindowRequest);

    var requestBuilder = updateAlertSuppressionWindowRequestBuilder(windowId, alertSuppressionWindowRequest, aid, expand);

    return apiClient.send(requestBuilder.build(), AlertSuppressionWindowDetail.class);
  }

  private void updateAlertSuppressionWindowValidateRequest(String windowId, AlertSuppressionWindowRequest alertSuppressionWindowRequest) throws ApiException {
      // verify the required parameter 'windowId' is set
      if (windowId == null) {
        throw new ApiException(400, "Missing the required parameter 'windowId' when calling updateAlertSuppressionWindow");
      }
      // verify the required parameter 'alertSuppressionWindowRequest' is set
      if (alertSuppressionWindowRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'alertSuppressionWindowRequest' when calling updateAlertSuppressionWindow");
      }
  }

  private ApiRequest.ApiRequestBuilder updateAlertSuppressionWindowRequestBuilder(String windowId, AlertSuppressionWindowRequest alertSuppressionWindowRequest, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/alert-suppression-windows/{windowId}"
        .replace("{windowId}", urlEncode(windowId.toString()));
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
    requestBuilder.requestBody(alertSuppressionWindowRequest);
    return requestBuilder;
  }
}
