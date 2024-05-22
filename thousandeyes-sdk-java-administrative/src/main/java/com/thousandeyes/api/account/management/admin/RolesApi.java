/*
 * Administrative API
 * ## Overview Manage users, accounts, and account groups in the ThousandEyes platform using the Administrative API. This API provides the following endpoints that define the operations to manage your organization:     * `/account-groups`: Account groups are used to divide an organization into different sections. These endpoints can be used to create, retrieve, update and delete account groups.   * `/users`: Create, retrieve, update and delete users within an organization.    * `/roles`: Create, retrieve and update roles for the current user.    * `/permissions`: Retrieve all assignable permissions. Used in the context of modifying roles.    * `/audit-user-events`: Retrieve all activity log events.    For more information about the administrative models, see [Account Management](https://docs.thousandeyes.com/product-documentation/user-management).
 *
 * The version of the OpenAPI document: 7.0.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.api.account.management.admin;

import static com.thousandeyes.api.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.api.client.RequestUtil.urlEncode;

import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.client.ApiException;
import com.thousandeyes.api.client.ApiResponse;
import com.thousandeyes.api.client.ApiRequest;
import com.thousandeyes.api.utils.Config;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.api.account.management.admin.model.Error;
import com.thousandeyes.api.account.management.admin.model.RoleDetail;
import com.thousandeyes.api.account.management.admin.model.RoleRequestBody;
import com.thousandeyes.api.account.management.admin.model.Roles;
import java.net.URI;
import com.thousandeyes.api.account.management.admin.model.UnauthorizedError;
import com.thousandeyes.api.account.management.admin.model.ValidationError;

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
public class RolesApi {
  private static final Config config = new Config();
  private final ApiClient apiClient;

  public RolesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create role
   * Creates a new role.
   * @param roleRequestBody  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return RoleDetail
   * @throws ApiException if fails to make API call
   */
  public RoleDetail createRole(RoleRequestBody roleRequestBody, String aid) throws ApiException {
    ApiResponse<RoleDetail> response = createRoleWithHttpInfo(roleRequestBody, aid);
    return response.getData();
  }

  /**
   * Create role
   * Creates a new role.
   * @param roleRequestBody  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;RoleDetail&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoleDetail> createRoleWithHttpInfo(RoleRequestBody roleRequestBody, String aid) throws ApiException {
    createRoleValidateRequest(roleRequestBody);

    var requestBuilder = createRoleRequestBuilder(roleRequestBody, aid);

    return apiClient.send(requestBuilder.build(), RoleDetail.class);
  }

  private void createRoleValidateRequest(RoleRequestBody roleRequestBody) throws ApiException {
      // verify the required parameter 'roleRequestBody' is set
      if (roleRequestBody == null) {
        throw new ApiException(400, "Missing the required parameter 'roleRequestBody' when calling createRole");
      }
  }

  private ApiRequest.ApiRequestBuilder createRoleRequestBuilder(RoleRequestBody roleRequestBody, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/roles";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/" + config.getVersion()));
    requestBuilder.requestBody(roleRequestBody);
    return requestBuilder;
  }
  /**
   * Delete role
   * Deletes a role using its ID. The user needs appropriate permissions to successfully call this endpoint.
   * @param id The ID of the desired role. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteRole(String id, String aid) throws ApiException {
    deleteRoleWithHttpInfo(id, aid);
  }

  /**
   * Delete role
   * Deletes a role using its ID. The user needs appropriate permissions to successfully call this endpoint.
   * @param id The ID of the desired role. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteRoleWithHttpInfo(String id, String aid) throws ApiException {
    deleteRoleValidateRequest(id);

    var requestBuilder = deleteRoleRequestBuilder(id, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteRoleValidateRequest(String id) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteRole");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteRoleRequestBuilder(String id, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/v7/roles/{id}"
        .replace("{id}", urlEncode(id.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/" + config.getVersion()));
    return requestBuilder;
  }
  /**
   * Retrieve role
   * Returns detailed information about a role using its ID.
   * @param id The ID of the desired role. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return RoleDetail
   * @throws ApiException if fails to make API call
   */
  public RoleDetail getRole(String id, String aid) throws ApiException {
    ApiResponse<RoleDetail> response = getRoleWithHttpInfo(id, aid);
    return response.getData();
  }

  /**
   * Retrieve role
   * Returns detailed information about a role using its ID.
   * @param id The ID of the desired role. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;RoleDetail&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoleDetail> getRoleWithHttpInfo(String id, String aid) throws ApiException {
    getRoleValidateRequest(id);

    var requestBuilder = getRoleRequestBuilder(id, aid);

    return apiClient.send(requestBuilder.build(), RoleDetail.class);
  }

  private void getRoleValidateRequest(String id) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getRole");
      }
  }

  private ApiRequest.ApiRequestBuilder getRoleRequestBuilder(String id, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/roles/{id}"
        .replace("{id}", urlEncode(id.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/" + config.getVersion()));
    return requestBuilder;
  }
  /**
   * List roles
   * Retrieves a list of defined roles visible to the current user.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return Roles
   * @throws ApiException if fails to make API call
   */
  public Roles getRoles(String aid) throws ApiException {
    ApiResponse<Roles> response = getRolesWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List roles
   * Retrieves a list of defined roles visible to the current user.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Roles&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Roles> getRolesWithHttpInfo(String aid) throws ApiException {
    getRolesValidateRequest();

    var requestBuilder = getRolesRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), Roles.class);
  }

  private void getRolesValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getRolesRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/roles";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/" + config.getVersion()));
    return requestBuilder;
  }
  /**
   * Update role
   * Updates a user-defined role using its ID.  When updating a role, the following applies:  * The full list of permissions must be sent, This endpoint does not support delta-based grant or revoking of permissions.  * Permission definitions and details can be obtained from the Permissions endpoint.
   * @param id The ID of the desired role. (required)
   * @param roleRequestBody  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return RoleDetail
   * @throws ApiException if fails to make API call
   */
  public RoleDetail updateRole(String id, RoleRequestBody roleRequestBody, String aid) throws ApiException {
    ApiResponse<RoleDetail> response = updateRoleWithHttpInfo(id, roleRequestBody, aid);
    return response.getData();
  }

  /**
   * Update role
   * Updates a user-defined role using its ID.  When updating a role, the following applies:  * The full list of permissions must be sent, This endpoint does not support delta-based grant or revoking of permissions.  * Permission definitions and details can be obtained from the Permissions endpoint.
   * @param id The ID of the desired role. (required)
   * @param roleRequestBody  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;RoleDetail&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoleDetail> updateRoleWithHttpInfo(String id, RoleRequestBody roleRequestBody, String aid) throws ApiException {
    updateRoleValidateRequest(id, roleRequestBody);

    var requestBuilder = updateRoleRequestBuilder(id, roleRequestBody, aid);

    return apiClient.send(requestBuilder.build(), RoleDetail.class);
  }

  private void updateRoleValidateRequest(String id, RoleRequestBody roleRequestBody) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling updateRole");
      }
      // verify the required parameter 'roleRequestBody' is set
      if (roleRequestBody == null) {
        throw new ApiException(400, "Missing the required parameter 'roleRequestBody' when calling updateRole");
      }
  }

  private ApiRequest.ApiRequestBuilder updateRoleRequestBuilder(String id, RoleRequestBody roleRequestBody, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/v7/roles/{id}"
        .replace("{id}", urlEncode(id.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/" + config.getVersion()));
    requestBuilder.requestBody(roleRequestBody);
    return requestBuilder;
  }
}
