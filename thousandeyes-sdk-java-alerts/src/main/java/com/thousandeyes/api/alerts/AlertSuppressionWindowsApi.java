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

import com.thousandeyes.api.alerts.model.AlertSuppressionWindowRequest;
import com.thousandeyes.api.alerts.model.CreateSuppressionWindows201Response;
import com.thousandeyes.api.alerts.model.Error;
import com.thousandeyes.api.alerts.model.Expand;
import com.thousandeyes.api.alerts.model.GetSuppressionWindows200Response;
import java.net.URI;
import com.thousandeyes.api.alerts.model.UnauthorizedError;
import com.thousandeyes.api.alerts.model.ValidationError;

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

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T16:57:45.250800+01:00[Europe/Lisbon]")
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
   * @return CreateSuppressionWindows201Response
   * @throws ApiException if fails to make API call
   */
  public CreateSuppressionWindows201Response createSuppressionWindows(AlertSuppressionWindowRequest alertSuppressionWindowRequest, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<CreateSuppressionWindows201Response> response = createSuppressionWindowsWithHttpInfo(alertSuppressionWindowRequest, aid, expand);
    return response.getData();
  }

  /**
   * Create alert suppression window
   * Creates a new alert suppression window in ThousandEyes, using the  provided POST data. Only Account Admins can create alert suppression windows.
   * @param alertSuppressionWindowRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand alert related resources.  Without this parameter, there&#39;s no default expansion. For example, to expand the \&quot;tests\&quot; resource, use the &#x60;?expand&#x3D;test&#x60; query. (optional
   * @return ApiResponse&lt;CreateSuppressionWindows201Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CreateSuppressionWindows201Response> createSuppressionWindowsWithHttpInfo(AlertSuppressionWindowRequest alertSuppressionWindowRequest, String aid, List<Expand> expand) throws ApiException {
    createSuppressionWindowsValidateRequest(alertSuppressionWindowRequest);

    var requestBuilder = createSuppressionWindowsRequestBuilder(alertSuppressionWindowRequest, aid, expand);

    return apiClient.send(requestBuilder.build(), CreateSuppressionWindows201Response.class);
  }

  private void createSuppressionWindowsValidateRequest(AlertSuppressionWindowRequest alertSuppressionWindowRequest) throws ApiException {
      // verify the required parameter 'alertSuppressionWindowRequest' is set
      if (alertSuppressionWindowRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'alertSuppressionWindowRequest' when calling createSuppressionWindows");
      }
  }

  private ApiRequest.ApiRequestBuilder createSuppressionWindowsRequestBuilder(AlertSuppressionWindowRequest alertSuppressionWindowRequest, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/alert-suppression-windows";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
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
  public void deleteSuppressionWindow(String windowId, String aid) throws ApiException {
    deleteSuppressionWindowWithHttpInfo(windowId, aid);
  }

  /**
   * Delete alert suppression window
   * Deletes an alert suppression window.
   * @param windowId Unique window ID. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteSuppressionWindowWithHttpInfo(String windowId, String aid) throws ApiException {
    deleteSuppressionWindowValidateRequest(windowId);

    var requestBuilder = deleteSuppressionWindowRequestBuilder(windowId, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteSuppressionWindowValidateRequest(String windowId) throws ApiException {
      // verify the required parameter 'windowId' is set
      if (windowId == null) {
        throw new ApiException(400, "Missing the required parameter 'windowId' when calling deleteSuppressionWindow");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteSuppressionWindowRequestBuilder(String windowId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/v7/alert-suppression-windows/{windowId}"
        .replace("{windowId}", urlEncode(windowId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    return requestBuilder;
  }
  /**
   * Retrieve alert suppression window
   * Returns detailed information about an alert suppression window configured in your account group.
   * @param windowId Unique window ID. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand alert related resources.  Without this parameter, there&#39;s no default expansion. For example, to expand the \&quot;tests\&quot; resource, use the &#x60;?expand&#x3D;test&#x60; query. (optional
   * @return CreateSuppressionWindows201Response
   * @throws ApiException if fails to make API call
   */
  public CreateSuppressionWindows201Response getSuppressionWindowDetails(String windowId, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<CreateSuppressionWindows201Response> response = getSuppressionWindowDetailsWithHttpInfo(windowId, aid, expand);
    return response.getData();
  }

  /**
   * Retrieve alert suppression window
   * Returns detailed information about an alert suppression window configured in your account group.
   * @param windowId Unique window ID. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand alert related resources.  Without this parameter, there&#39;s no default expansion. For example, to expand the \&quot;tests\&quot; resource, use the &#x60;?expand&#x3D;test&#x60; query. (optional
   * @return ApiResponse&lt;CreateSuppressionWindows201Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CreateSuppressionWindows201Response> getSuppressionWindowDetailsWithHttpInfo(String windowId, String aid, List<Expand> expand) throws ApiException {
    getSuppressionWindowDetailsValidateRequest(windowId);

    var requestBuilder = getSuppressionWindowDetailsRequestBuilder(windowId, aid, expand);

    return apiClient.send(requestBuilder.build(), CreateSuppressionWindows201Response.class);
  }

  private void getSuppressionWindowDetailsValidateRequest(String windowId) throws ApiException {
      // verify the required parameter 'windowId' is set
      if (windowId == null) {
        throw new ApiException(400, "Missing the required parameter 'windowId' when calling getSuppressionWindowDetails");
      }
  }

  private ApiRequest.ApiRequestBuilder getSuppressionWindowDetailsRequestBuilder(String windowId, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/alert-suppression-windows/{windowId}"
        .replace("{windowId}", urlEncode(windowId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    return requestBuilder;
  }
  /**
   * List alert suppression windows
   * Returns a list of all alert suppression windows configured in your account group.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return GetSuppressionWindows200Response
   * @throws ApiException if fails to make API call
   */
  public GetSuppressionWindows200Response getSuppressionWindows(String aid) throws ApiException {
    ApiResponse<GetSuppressionWindows200Response> response = getSuppressionWindowsWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List alert suppression windows
   * Returns a list of all alert suppression windows configured in your account group.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;GetSuppressionWindows200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetSuppressionWindows200Response> getSuppressionWindowsWithHttpInfo(String aid) throws ApiException {
    getSuppressionWindowsValidateRequest();

    var requestBuilder = getSuppressionWindowsRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), GetSuppressionWindows200Response.class);
  }

  private void getSuppressionWindowsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getSuppressionWindowsRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/alert-suppression-windows";
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
   * Update alert suppression window
   * Updates an alert suppression window in ThousandEyes, using the  provided POST data. Only Account Admins can update alert suppression windows.
   * @param windowId Unique window ID. (required)
   * @param alertSuppressionWindowRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand alert related resources.  Without this parameter, there&#39;s no default expansion. For example, to expand the \&quot;tests\&quot; resource, use the &#x60;?expand&#x3D;test&#x60; query. (optional
   * @return CreateSuppressionWindows201Response
   * @throws ApiException if fails to make API call
   */
  public CreateSuppressionWindows201Response updateSuppressionWindow(String windowId, AlertSuppressionWindowRequest alertSuppressionWindowRequest, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<CreateSuppressionWindows201Response> response = updateSuppressionWindowWithHttpInfo(windowId, alertSuppressionWindowRequest, aid, expand);
    return response.getData();
  }

  /**
   * Update alert suppression window
   * Updates an alert suppression window in ThousandEyes, using the  provided POST data. Only Account Admins can update alert suppression windows.
   * @param windowId Unique window ID. (required)
   * @param alertSuppressionWindowRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand alert related resources.  Without this parameter, there&#39;s no default expansion. For example, to expand the \&quot;tests\&quot; resource, use the &#x60;?expand&#x3D;test&#x60; query. (optional
   * @return ApiResponse&lt;CreateSuppressionWindows201Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CreateSuppressionWindows201Response> updateSuppressionWindowWithHttpInfo(String windowId, AlertSuppressionWindowRequest alertSuppressionWindowRequest, String aid, List<Expand> expand) throws ApiException {
    updateSuppressionWindowValidateRequest(windowId, alertSuppressionWindowRequest);

    var requestBuilder = updateSuppressionWindowRequestBuilder(windowId, alertSuppressionWindowRequest, aid, expand);

    return apiClient.send(requestBuilder.build(), CreateSuppressionWindows201Response.class);
  }

  private void updateSuppressionWindowValidateRequest(String windowId, AlertSuppressionWindowRequest alertSuppressionWindowRequest) throws ApiException {
      // verify the required parameter 'windowId' is set
      if (windowId == null) {
        throw new ApiException(400, "Missing the required parameter 'windowId' when calling updateSuppressionWindow");
      }
      // verify the required parameter 'alertSuppressionWindowRequest' is set
      if (alertSuppressionWindowRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'alertSuppressionWindowRequest' when calling updateSuppressionWindow");
      }
  }

  private ApiRequest.ApiRequestBuilder updateSuppressionWindowRequestBuilder(String windowId, AlertSuppressionWindowRequest alertSuppressionWindowRequest, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/v7/alert-suppression-windows/{windowId}"
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
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    requestBuilder.requestBody(alertSuppressionWindowRequest);
    return requestBuilder;
  }
}
