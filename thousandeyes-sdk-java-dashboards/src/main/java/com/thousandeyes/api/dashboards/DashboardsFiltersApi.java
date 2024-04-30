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

import com.thousandeyes.api.dashboards.model.ApiContextFilterRequest;
import com.thousandeyes.api.dashboards.model.ApiContextFilterResponse;
import com.thousandeyes.api.dashboards.model.ApiContextFiltersResponse;
import com.thousandeyes.api.dashboards.model.Error;
import java.net.URI;
import com.thousandeyes.api.dashboards.model.UnauthorizedError;
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

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-30T10:06:13.271495+01:00[Europe/Lisbon]")
public class DashboardsFiltersApi {
  private final ApiClient apiClient;

  public DashboardsFiltersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create dashboard filter
   * Creates a new dashboard filter in your account group. To create a filter,  you must have one of the following permissions: * &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin). * &#x60;Edit own dashboard templates&#x60; permission (Regular User). 
   * @param apiContextFilterRequest Dashboard filter object to be created and saved (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiContextFilterResponse
   * @throws ApiException if fails to make API call
   */
  public ApiContextFilterResponse createDashboardFilter(ApiContextFilterRequest apiContextFilterRequest, String aid) throws ApiException {
    ApiResponse<ApiContextFilterResponse> response = createDashboardFilterWithHttpInfo(apiContextFilterRequest, aid);
    return response.getData();
  }

  /**
   * Create dashboard filter
   * Creates a new dashboard filter in your account group. To create a filter,  you must have one of the following permissions: * &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin). * &#x60;Edit own dashboard templates&#x60; permission (Regular User). 
   * @param apiContextFilterRequest Dashboard filter object to be created and saved (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;ApiContextFilterResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ApiContextFilterResponse> createDashboardFilterWithHttpInfo(ApiContextFilterRequest apiContextFilterRequest, String aid) throws ApiException {
    createDashboardFilterValidateRequest(apiContextFilterRequest);

    var requestBuilder = createDashboardFilterRequestBuilder(apiContextFilterRequest, aid);

    return apiClient.send(requestBuilder.build(), ApiContextFilterResponse.class);
  }

  private void createDashboardFilterValidateRequest(ApiContextFilterRequest apiContextFilterRequest) throws ApiException {
      // verify the required parameter 'apiContextFilterRequest' is set
      if (apiContextFilterRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'apiContextFilterRequest' when calling createDashboardFilter");
      }
  }

  private ApiRequest.ApiRequestBuilder createDashboardFilterRequestBuilder(ApiContextFilterRequest apiContextFilterRequest, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/dashboards/filters";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    requestBuilder.requestBody(apiContextFilterRequest);
    return requestBuilder;
  }
  /**
   * Delete dashboard filter
   * Deletes a dashboard filter using the &#x60;filterId&#x60; provided in the request.    **Note**:   * Users with the &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin) can delete any dashboard filter.   * Users with the &#x60;Edit own dashboard templates&#x60; permission (Regular User) can only delete the dashboard filters they have created themselves. 
   * @param id Unique dashboard filter ID. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteDashboardFilterById(String id, String aid) throws ApiException {
    deleteDashboardFilterByIdWithHttpInfo(id, aid);
  }

  /**
   * Delete dashboard filter
   * Deletes a dashboard filter using the &#x60;filterId&#x60; provided in the request.    **Note**:   * Users with the &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin) can delete any dashboard filter.   * Users with the &#x60;Edit own dashboard templates&#x60; permission (Regular User) can only delete the dashboard filters they have created themselves. 
   * @param id Unique dashboard filter ID. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteDashboardFilterByIdWithHttpInfo(String id, String aid) throws ApiException {
    deleteDashboardFilterByIdValidateRequest(id);

    var requestBuilder = deleteDashboardFilterByIdRequestBuilder(id, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteDashboardFilterByIdValidateRequest(String id) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteDashboardFilterById");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteDashboardFilterByIdRequestBuilder(String id, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/v7/dashboards/filters/{id}"
        .replace("{id}", urlEncode(id.toString()));
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
   * List dashboard filters
   * Returns a list of dashboard filters and its context within your account group. 
   * @param searchPattern Optional search pattern parameter to filter list of dashboard filters by either name or description values. (optional)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiContextFiltersResponse
   * @throws ApiException if fails to make API call
   */
  public ApiContextFiltersResponse getAllDashboardFilters(String searchPattern, String aid) throws ApiException {
    ApiResponse<ApiContextFiltersResponse> response = getAllDashboardFiltersWithHttpInfo(searchPattern, aid);
    return response.getData();
  }

  /**
   * List dashboard filters
   * Returns a list of dashboard filters and its context within your account group. 
   * @param searchPattern Optional search pattern parameter to filter list of dashboard filters by either name or description values. (optional)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;ApiContextFiltersResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ApiContextFiltersResponse> getAllDashboardFiltersWithHttpInfo(String searchPattern, String aid) throws ApiException {
    getAllDashboardFiltersValidateRequest();

    var requestBuilder = getAllDashboardFiltersRequestBuilder(searchPattern, aid);

    return apiClient.send(requestBuilder.build(), ApiContextFiltersResponse.class);
  }

  private void getAllDashboardFiltersValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getAllDashboardFiltersRequestBuilder(String searchPattern, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/dashboards/filters";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("searchPattern", searchPattern));
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    return requestBuilder;
  }
  /**
   * Get dashboard filter
   * Returns a list of data source filters and their metadata within the dashboard filter. 
   * @param id Unique dashboard filter ID. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiContextFilterResponse
   * @throws ApiException if fails to make API call
   */
  public ApiContextFilterResponse getDashboardFilterById(String id, String aid) throws ApiException {
    ApiResponse<ApiContextFilterResponse> response = getDashboardFilterByIdWithHttpInfo(id, aid);
    return response.getData();
  }

  /**
   * Get dashboard filter
   * Returns a list of data source filters and their metadata within the dashboard filter. 
   * @param id Unique dashboard filter ID. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;ApiContextFilterResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ApiContextFilterResponse> getDashboardFilterByIdWithHttpInfo(String id, String aid) throws ApiException {
    getDashboardFilterByIdValidateRequest(id);

    var requestBuilder = getDashboardFilterByIdRequestBuilder(id, aid);

    return apiClient.send(requestBuilder.build(), ApiContextFilterResponse.class);
  }

  private void getDashboardFilterByIdValidateRequest(String id) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getDashboardFilterById");
      }
  }

  private ApiRequest.ApiRequestBuilder getDashboardFilterByIdRequestBuilder(String id, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/dashboards/filters/{id}"
        .replace("{id}", urlEncode(id.toString()));
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
   * Update dashboard filter
   * Updates an existing dashboard filter in your account group.                        **Note**:    * Users with the &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin) can update any dashboard filter.    * Users with the &#x60;Edit own dashboard templates&#x60; permission (Regular User) can only update the dashboard filters they have created themselves. 
   * @param id Unique dashboard filter ID. (required)
   * @param apiContextFilterRequest Updated dashboard filter context object (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiContextFilterResponse
   * @throws ApiException if fails to make API call
   */
  public ApiContextFilterResponse updateDashboardFilterById(String id, ApiContextFilterRequest apiContextFilterRequest, String aid) throws ApiException {
    ApiResponse<ApiContextFilterResponse> response = updateDashboardFilterByIdWithHttpInfo(id, apiContextFilterRequest, aid);
    return response.getData();
  }

  /**
   * Update dashboard filter
   * Updates an existing dashboard filter in your account group.                        **Note**:    * Users with the &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin) can update any dashboard filter.    * Users with the &#x60;Edit own dashboard templates&#x60; permission (Regular User) can only update the dashboard filters they have created themselves. 
   * @param id Unique dashboard filter ID. (required)
   * @param apiContextFilterRequest Updated dashboard filter context object (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;ApiContextFilterResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ApiContextFilterResponse> updateDashboardFilterByIdWithHttpInfo(String id, ApiContextFilterRequest apiContextFilterRequest, String aid) throws ApiException {
    updateDashboardFilterByIdValidateRequest(id, apiContextFilterRequest);

    var requestBuilder = updateDashboardFilterByIdRequestBuilder(id, apiContextFilterRequest, aid);

    return apiClient.send(requestBuilder.build(), ApiContextFilterResponse.class);
  }

  private void updateDashboardFilterByIdValidateRequest(String id, ApiContextFilterRequest apiContextFilterRequest) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling updateDashboardFilterById");
      }
      // verify the required parameter 'apiContextFilterRequest' is set
      if (apiContextFilterRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'apiContextFilterRequest' when calling updateDashboardFilterById");
      }
  }

  private ApiRequest.ApiRequestBuilder updateDashboardFilterByIdRequestBuilder(String id, ApiContextFilterRequest apiContextFilterRequest, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/v7/dashboards/filters/{id}"
        .replace("{id}", urlEncode(id.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    requestBuilder.requestBody(apiContextFilterRequest);
    return requestBuilder;
  }
}
