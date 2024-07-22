/*
 * Labels API
 * ### Overview This is API for the Labels API (formerly called groups).
 *
 * The version of the OpenAPI document: 7.0.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.sdk.labels;

import static com.thousandeyes.sdk.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.sdk.client.RequestUtil.urlEncode;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.ApiResponse;
import com.thousandeyes.sdk.client.ApiRequest;
import com.thousandeyes.sdk.utils.Config;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.sdk.labels.model.Error;
import com.thousandeyes.sdk.labels.model.LabelDetail;
import com.thousandeyes.sdk.labels.model.LabelRequest;
import com.thousandeyes.sdk.labels.model.Labels;
import java.net.URI;
import com.thousandeyes.sdk.labels.model.UnauthorizedError;
import com.thousandeyes.sdk.labels.model.ValidationError;

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
public class DashboardApi {
  private final ApiClient apiClient;

  public DashboardApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a Label of type &#x60;dashboard&#x60;
   * Creates a new label (formerly called group) in ThousandEyes, based on properties provided in the POST data.  In order to create a new label, the user attempting the creation must have sufficient privileges to create labels. Regular users are blocked from using any of the POST-based methods. Note: When creating or updating a label and assigning agents or tests, the user needs permission to modify the objects being added.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param labelRequest Label resource (optional)
   * @return LabelDetail
   * @throws ApiException if fails to make API call
   */
  public LabelDetail createDashboardLabel(String aid, LabelRequest labelRequest) throws ApiException {
    ApiResponse<LabelDetail> response = createDashboardLabelWithHttpInfo(aid, labelRequest);
    return response.getData();
  }

  /**
   * Create a Label of type &#x60;dashboard&#x60;
   * Creates a new label (formerly called group) in ThousandEyes, based on properties provided in the POST data.  In order to create a new label, the user attempting the creation must have sufficient privileges to create labels. Regular users are blocked from using any of the POST-based methods. Note: When creating or updating a label and assigning agents or tests, the user needs permission to modify the objects being added.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param labelRequest Label resource (optional)
   * @return ApiResponse&lt;LabelDetail&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LabelDetail> createDashboardLabelWithHttpInfo(String aid, LabelRequest labelRequest) throws ApiException {
    createDashboardLabelValidateRequest();

    var requestBuilder = createDashboardLabelRequestBuilder(aid, labelRequest);

    return apiClient.send(requestBuilder.build(), LabelDetail.class);
  }

  private void createDashboardLabelValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder createDashboardLabelRequestBuilder(String aid, LabelRequest labelRequest) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/labels/dashboard";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(labelRequest);
    return requestBuilder;
  }
  /**
   * Delete a Label object of type &#x60;dashboard&#x60;
   * 
   * @param labelId ID of the label to get (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteDashboardLabel(String labelId, String aid) throws ApiException {
    deleteDashboardLabelWithHttpInfo(labelId, aid);
  }

  /**
   * Delete a Label object of type &#x60;dashboard&#x60;
   * 
   * @param labelId ID of the label to get (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteDashboardLabelWithHttpInfo(String labelId, String aid) throws ApiException {
    deleteDashboardLabelValidateRequest(labelId);

    var requestBuilder = deleteDashboardLabelRequestBuilder(labelId, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteDashboardLabelValidateRequest(String labelId) throws ApiException {
      // verify the required parameter 'labelId' is set
      if (labelId == null) {
        throw new ApiException(400, "Missing the required parameter 'labelId' when calling deleteDashboardLabel");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteDashboardLabelRequestBuilder(String labelId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/v7/labels/dashboard/{labelId}"
        .replace("{labelId}", urlEncode(labelId.toString()));
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
   * Get a Label object of type &#x60;dashboard&#x60;
   * 
   * @param labelId ID of the label to get (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return LabelDetail
   * @throws ApiException if fails to make API call
   */
  public LabelDetail getDashboardLabel(String labelId, String aid) throws ApiException {
    ApiResponse<LabelDetail> response = getDashboardLabelWithHttpInfo(labelId, aid);
    return response.getData();
  }

  /**
   * Get a Label object of type &#x60;dashboard&#x60;
   * 
   * @param labelId ID of the label to get (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;LabelDetail&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LabelDetail> getDashboardLabelWithHttpInfo(String labelId, String aid) throws ApiException {
    getDashboardLabelValidateRequest(labelId);

    var requestBuilder = getDashboardLabelRequestBuilder(labelId, aid);

    return apiClient.send(requestBuilder.build(), LabelDetail.class);
  }

  private void getDashboardLabelValidateRequest(String labelId) throws ApiException {
      // verify the required parameter 'labelId' is set
      if (labelId == null) {
        throw new ApiException(400, "Missing the required parameter 'labelId' when calling getDashboardLabel");
      }
  }

  private ApiRequest.ApiRequestBuilder getDashboardLabelRequestBuilder(String labelId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/labels/dashboard/{labelId}"
        .replace("{labelId}", urlEncode(labelId.toString()));
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
   * Get list of Labels of type &#x60;dashboard&#x60;
   * Returns a list of all Dashboard labels (formerly called groups) configured in ThousandEyes.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return Labels
   * @throws ApiException if fails to make API call
   */
  public Labels getDashboardLabels(String aid) throws ApiException {
    ApiResponse<Labels> response = getDashboardLabelsWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * Get list of Labels of type &#x60;dashboard&#x60;
   * Returns a list of all Dashboard labels (formerly called groups) configured in ThousandEyes.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Labels&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Labels> getDashboardLabelsWithHttpInfo(String aid) throws ApiException {
    getDashboardLabelsValidateRequest();

    var requestBuilder = getDashboardLabelsRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), Labels.class);
  }

  private void getDashboardLabelsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getDashboardLabelsRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/labels/dashboard";
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
   * Update a Label object of type &#x60;dashboard&#x60;
   * 
   * @param labelId ID of the label to get (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param labelRequest  (optional)
   * @return LabelDetail
   * @throws ApiException if fails to make API call
   */
  public LabelDetail updateDashboardLabel(String labelId, String aid, LabelRequest labelRequest) throws ApiException {
    ApiResponse<LabelDetail> response = updateDashboardLabelWithHttpInfo(labelId, aid, labelRequest);
    return response.getData();
  }

  /**
   * Update a Label object of type &#x60;dashboard&#x60;
   * 
   * @param labelId ID of the label to get (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param labelRequest  (optional)
   * @return ApiResponse&lt;LabelDetail&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LabelDetail> updateDashboardLabelWithHttpInfo(String labelId, String aid, LabelRequest labelRequest) throws ApiException {
    updateDashboardLabelValidateRequest(labelId);

    var requestBuilder = updateDashboardLabelRequestBuilder(labelId, aid, labelRequest);

    return apiClient.send(requestBuilder.build(), LabelDetail.class);
  }

  private void updateDashboardLabelValidateRequest(String labelId) throws ApiException {
      // verify the required parameter 'labelId' is set
      if (labelId == null) {
        throw new ApiException(400, "Missing the required parameter 'labelId' when calling updateDashboardLabel");
      }
  }

  private ApiRequest.ApiRequestBuilder updateDashboardLabelRequestBuilder(String labelId, String aid, LabelRequest labelRequest) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/v7/labels/dashboard/{labelId}"
        .replace("{labelId}", urlEncode(labelId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(labelRequest);
    return requestBuilder;
  }
}
