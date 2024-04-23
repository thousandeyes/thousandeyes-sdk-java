/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.api.dashboards;

import static com.thousandeyes.api.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.api.client.RequestUtil.urlEncode;

import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.client.ApiException;
import com.thousandeyes.api.client.ApiResponse;
import com.thousandeyes.api.client.ApiRequest;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.api.dashboards.model.ApiDashboardSnapshot;
import com.thousandeyes.api.dashboards.model.CreateDashboardSnapshot201Response;
import com.thousandeyes.api.dashboards.model.DashboardSnapshots200Response;
import com.thousandeyes.api.dashboards.model.Error;
import com.thousandeyes.api.dashboards.model.GenerateDashboardSnapshotRequest;
import com.thousandeyes.api.dashboards.model.SnapshotDataByWidget200Response;
import java.net.URI;
import com.thousandeyes.api.dashboards.model.UnauthorizedError;
import com.thousandeyes.api.dashboards.model.UpdateSnapshotExpirationDateApiRequest;
import com.thousandeyes.api.dashboards.model.ValidationError;

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

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T16:57:45.219460+01:00[Europe/Lisbon]")
public class DashboardSnapshotsApi {
  private final ApiClient apiClient;

  public DashboardSnapshotsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create dashboard snapshot
   * Creates a new dashboard snapshot within your account group. The &#x60;Edit Snapshots&#x60; permission is required to use this endpoint. 
   * @param generateDashboardSnapshotRequest Request body schema to create a dashboard snapshot. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return CreateDashboardSnapshot201Response
   * @throws ApiException if fails to make API call
   */
  public CreateDashboardSnapshot201Response createDashboardSnapshot(GenerateDashboardSnapshotRequest generateDashboardSnapshotRequest, String aid) throws ApiException {
    ApiResponse<CreateDashboardSnapshot201Response> response = createDashboardSnapshotWithHttpInfo(generateDashboardSnapshotRequest, aid);
    return response.getData();
  }

  /**
   * Create dashboard snapshot
   * Creates a new dashboard snapshot within your account group. The &#x60;Edit Snapshots&#x60; permission is required to use this endpoint. 
   * @param generateDashboardSnapshotRequest Request body schema to create a dashboard snapshot. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;CreateDashboardSnapshot201Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CreateDashboardSnapshot201Response> createDashboardSnapshotWithHttpInfo(GenerateDashboardSnapshotRequest generateDashboardSnapshotRequest, String aid) throws ApiException {
    createDashboardSnapshotValidateRequest(generateDashboardSnapshotRequest);

    var requestBuilder = createDashboardSnapshotRequestBuilder(generateDashboardSnapshotRequest, aid);

    return apiClient.send(requestBuilder.build(), CreateDashboardSnapshot201Response.class);
  }

  private void createDashboardSnapshotValidateRequest(GenerateDashboardSnapshotRequest generateDashboardSnapshotRequest) throws ApiException {
      // verify the required parameter 'generateDashboardSnapshotRequest' is set
      if (generateDashboardSnapshotRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'generateDashboardSnapshotRequest' when calling createDashboardSnapshot");
      }
  }

  private ApiRequest.ApiRequestBuilder createDashboardSnapshotRequestBuilder(GenerateDashboardSnapshotRequest generateDashboardSnapshotRequest, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/dashboard-snapshots";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    requestBuilder.requestBody(generateDashboardSnapshotRequest);
    return requestBuilder;
  }
  /**
   * Retrieve dashboard snapshot
   * This endpoint returns a list of widgets configured in dashboard snapshot configured in ThousandEyes. Seed this endpoint with a snapshotId found from the /dashboard-snapshots endpoint. This endpoint requires the &#x60;View Snapshots&#x60; permission be assigned to the role of the user accessing this endpoint. Returns a list of widgets configured within a dashboard snapshot. Use the &#x60;snapshotId&#x60; obtained from the &#x60;/dashboard-snapshots&#x60; endpoint. The &#x60;View Snapshots&#x60; permission is required to use this endpoint.\&quot;
   * @param snapshotId A Identifier for a dashboard snapshot which can be obtained from the &#x60;/dashboards-snapshots&#x60; endpoint. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiDashboardSnapshot
   * @throws ApiException if fails to make API call
   */
  public ApiDashboardSnapshot dashboardSnapshotById(String snapshotId, String aid) throws ApiException {
    ApiResponse<ApiDashboardSnapshot> response = dashboardSnapshotByIdWithHttpInfo(snapshotId, aid);
    return response.getData();
  }

  /**
   * Retrieve dashboard snapshot
   * This endpoint returns a list of widgets configured in dashboard snapshot configured in ThousandEyes. Seed this endpoint with a snapshotId found from the /dashboard-snapshots endpoint. This endpoint requires the &#x60;View Snapshots&#x60; permission be assigned to the role of the user accessing this endpoint. Returns a list of widgets configured within a dashboard snapshot. Use the &#x60;snapshotId&#x60; obtained from the &#x60;/dashboard-snapshots&#x60; endpoint. The &#x60;View Snapshots&#x60; permission is required to use this endpoint.\&quot;
   * @param snapshotId A Identifier for a dashboard snapshot which can be obtained from the &#x60;/dashboards-snapshots&#x60; endpoint. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;ApiDashboardSnapshot&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ApiDashboardSnapshot> dashboardSnapshotByIdWithHttpInfo(String snapshotId, String aid) throws ApiException {
    dashboardSnapshotByIdValidateRequest(snapshotId);

    var requestBuilder = dashboardSnapshotByIdRequestBuilder(snapshotId, aid);

    return apiClient.send(requestBuilder.build(), ApiDashboardSnapshot.class);
  }

  private void dashboardSnapshotByIdValidateRequest(String snapshotId) throws ApiException {
      // verify the required parameter 'snapshotId' is set
      if (snapshotId == null) {
        throw new ApiException(400, "Missing the required parameter 'snapshotId' when calling dashboardSnapshotById");
      }
  }

  private ApiRequest.ApiRequestBuilder dashboardSnapshotByIdRequestBuilder(String snapshotId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/dashboard-snapshots/{snapshotId}"
        .replace("{snapshotId}", urlEncode(snapshotId.toString()));
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
   * List dashboard snapshots
   * Returns a list of dashboard snapshots within your account group. Use this data to identify a specific dashboard snapshot, which can be used in other endpoints to access aggregated data. The &#x60;View Snapshots&#x60; permission is required to use this endpoint.\&quot; 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param dashboardId  (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @return DashboardSnapshots200Response
   * @throws ApiException if fails to make API call
   */
  public DashboardSnapshots200Response dashboardSnapshots(String aid, String dashboardId, String cursor) throws ApiException {
    ApiResponse<DashboardSnapshots200Response> response = dashboardSnapshotsWithHttpInfo(aid, dashboardId, cursor);
    return response.getData();
  }

  /**
   * List dashboard snapshots
   * Returns a list of dashboard snapshots within your account group. Use this data to identify a specific dashboard snapshot, which can be used in other endpoints to access aggregated data. The &#x60;View Snapshots&#x60; permission is required to use this endpoint.\&quot; 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param dashboardId  (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @return ApiResponse&lt;DashboardSnapshots200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DashboardSnapshots200Response> dashboardSnapshotsWithHttpInfo(String aid, String dashboardId, String cursor) throws ApiException {
    dashboardSnapshotsValidateRequest();

    var requestBuilder = dashboardSnapshotsRequestBuilder(aid, dashboardId, cursor);

    return apiClient.send(requestBuilder.build(), DashboardSnapshots200Response.class);
  }

  private void dashboardSnapshotsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder dashboardSnapshotsRequestBuilder(String aid, String dashboardId, String cursor) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/dashboard-snapshots";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("dashboardId", dashboardId));
    localVarQueryParams.addAll(parameterToPairs("cursor", cursor));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    return requestBuilder;
  }
  /**
   * Delete dashboard snapshot
   * Deletes a dashboard snapshot using the &#x60;snapshotId&#x60; provided in the request. Users with the &#x60;Edit reports for all users in account group&#x60; permission (Account Admin) can delete any dashboard snapshot. 
   * @param snapshotId A Identifier for a dashboard snapshot which can be obtained from the &#x60;/dashboards-snapshots&#x60; endpoint. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteDashboardSnapshot(String snapshotId, String aid) throws ApiException {
    deleteDashboardSnapshotWithHttpInfo(snapshotId, aid);
  }

  /**
   * Delete dashboard snapshot
   * Deletes a dashboard snapshot using the &#x60;snapshotId&#x60; provided in the request. Users with the &#x60;Edit reports for all users in account group&#x60; permission (Account Admin) can delete any dashboard snapshot. 
   * @param snapshotId A Identifier for a dashboard snapshot which can be obtained from the &#x60;/dashboards-snapshots&#x60; endpoint. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteDashboardSnapshotWithHttpInfo(String snapshotId, String aid) throws ApiException {
    deleteDashboardSnapshotValidateRequest(snapshotId);

    var requestBuilder = deleteDashboardSnapshotRequestBuilder(snapshotId, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteDashboardSnapshotValidateRequest(String snapshotId) throws ApiException {
      // verify the required parameter 'snapshotId' is set
      if (snapshotId == null) {
        throw new ApiException(400, "Missing the required parameter 'snapshotId' when calling deleteDashboardSnapshot");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteDashboardSnapshotRequestBuilder(String snapshotId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/v7/dashboard-snapshots/{snapshotId}"
        .replace("{snapshotId}", urlEncode(snapshotId.toString()));
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
   * Retrieve dashboard snapshot data
   * Returns actual metrics used in the generation of a dashboard snapshot. 
   * @param snapshotId A Identifier for a dashboard snapshot which can be obtained from the &#x60;/dashboards-snapshots&#x60; endpoint. (required)
   * @param widgetId A Identifier for a widget. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return SnapshotDataByWidget200Response
   * @throws ApiException if fails to make API call
   */
  public SnapshotDataByWidget200Response snapshotDataByWidget(String snapshotId, String widgetId, String aid) throws ApiException {
    ApiResponse<SnapshotDataByWidget200Response> response = snapshotDataByWidgetWithHttpInfo(snapshotId, widgetId, aid);
    return response.getData();
  }

  /**
   * Retrieve dashboard snapshot data
   * Returns actual metrics used in the generation of a dashboard snapshot. 
   * @param snapshotId A Identifier for a dashboard snapshot which can be obtained from the &#x60;/dashboards-snapshots&#x60; endpoint. (required)
   * @param widgetId A Identifier for a widget. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;SnapshotDataByWidget200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SnapshotDataByWidget200Response> snapshotDataByWidgetWithHttpInfo(String snapshotId, String widgetId, String aid) throws ApiException {
    snapshotDataByWidgetValidateRequest(snapshotId, widgetId);

    var requestBuilder = snapshotDataByWidgetRequestBuilder(snapshotId, widgetId, aid);

    return apiClient.send(requestBuilder.build(), SnapshotDataByWidget200Response.class);
  }

  private void snapshotDataByWidgetValidateRequest(String snapshotId, String widgetId) throws ApiException {
      // verify the required parameter 'snapshotId' is set
      if (snapshotId == null) {
        throw new ApiException(400, "Missing the required parameter 'snapshotId' when calling snapshotDataByWidget");
      }
      // verify the required parameter 'widgetId' is set
      if (widgetId == null) {
        throw new ApiException(400, "Missing the required parameter 'widgetId' when calling snapshotDataByWidget");
      }
  }

  private ApiRequest.ApiRequestBuilder snapshotDataByWidgetRequestBuilder(String snapshotId, String widgetId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/dashboard-snapshots/{snapshotId}/widgets/{widgetId}"
        .replace("{snapshotId}", urlEncode(snapshotId.toString()))
        .replace("{widgetId}", urlEncode(widgetId.toString()));
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
   * Update snapshot expiration
   * Updates the expiration date of a dashboard snapshot. The &#x60;Edit snapshots&#x60; permission is required to access this endpoint. 
   * @param snapshotId A Identifier for a dashboard snapshot which can be obtained from the &#x60;/dashboards-snapshots&#x60; endpoint. (required)
   * @param updateSnapshotExpirationDateApiRequest Request body schema to update a snapshot expiration. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateSnapshotExpirationDate(String snapshotId, UpdateSnapshotExpirationDateApiRequest updateSnapshotExpirationDateApiRequest, String aid) throws ApiException {
    updateSnapshotExpirationDateWithHttpInfo(snapshotId, updateSnapshotExpirationDateApiRequest, aid);
  }

  /**
   * Update snapshot expiration
   * Updates the expiration date of a dashboard snapshot. The &#x60;Edit snapshots&#x60; permission is required to access this endpoint. 
   * @param snapshotId A Identifier for a dashboard snapshot which can be obtained from the &#x60;/dashboards-snapshots&#x60; endpoint. (required)
   * @param updateSnapshotExpirationDateApiRequest Request body schema to update a snapshot expiration. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updateSnapshotExpirationDateWithHttpInfo(String snapshotId, UpdateSnapshotExpirationDateApiRequest updateSnapshotExpirationDateApiRequest, String aid) throws ApiException {
    updateSnapshotExpirationDateValidateRequest(snapshotId, updateSnapshotExpirationDateApiRequest);

    var requestBuilder = updateSnapshotExpirationDateRequestBuilder(snapshotId, updateSnapshotExpirationDateApiRequest, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void updateSnapshotExpirationDateValidateRequest(String snapshotId, UpdateSnapshotExpirationDateApiRequest updateSnapshotExpirationDateApiRequest) throws ApiException {
      // verify the required parameter 'snapshotId' is set
      if (snapshotId == null) {
        throw new ApiException(400, "Missing the required parameter 'snapshotId' when calling updateSnapshotExpirationDate");
      }
      // verify the required parameter 'updateSnapshotExpirationDateApiRequest' is set
      if (updateSnapshotExpirationDateApiRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'updateSnapshotExpirationDateApiRequest' when calling updateSnapshotExpirationDate");
      }
  }

  private ApiRequest.ApiRequestBuilder updateSnapshotExpirationDateRequestBuilder(String snapshotId, UpdateSnapshotExpirationDateApiRequest updateSnapshotExpirationDateApiRequest, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PATCH");

    String path = "/v7/dashboard-snapshots/{snapshotId}"
        .replace("{snapshotId}", urlEncode(snapshotId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    requestBuilder.requestBody(updateSnapshotExpirationDateApiRequest);
    return requestBuilder;
  }
}
