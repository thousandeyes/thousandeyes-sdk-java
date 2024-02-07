/*
 * Administrative API
 * ## Overview Manage users, accounts, and account groups in the ThousandEyes platform using the Administrative API.  This API provides the following endpoints that define the operations to manage your organization:     * `/account-groups`: Account groups are used to divide an organization into different sections. These endpoints can be used to create, retrieve, update and delete account groups.   * `/users`: Create, retrieve, update and delete users within an organization.    * `/roles`: Create, retrieve and update roles for the current user.    * `/permissions`: Retrieve all assignable permissions. Used in the context of modifying roles.    * `/audit-user-events`: Retrieve all activity log events.
 *
 * The version of the OpenAPI document: 7.0.0
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
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.api.account.management.admin.model.Error;
import com.thousandeyes.api.account.management.admin.model.GetPermissions200Response;
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

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-02-07T22:58:17.986770Z[Europe/Lisbon]")
public class PermissionsApi {
  private final ApiClient apiClient;

  public PermissionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * List assignable permissions
   * Users must be in a role assigned management permissions to access this endpoint. Users without management permissions who attempt to access this endpoint receive an HTTP/403 response code.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return GetPermissions200Response
   * @throws ApiException if fails to make API call
   */
  public GetPermissions200Response getPermissions(String aid) throws ApiException {
    ApiResponse<GetPermissions200Response> response = getPermissionsWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List assignable permissions
   * Users must be in a role assigned management permissions to access this endpoint. Users without management permissions who attempt to access this endpoint receive an HTTP/403 response code.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;GetPermissions200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetPermissions200Response> getPermissionsWithHttpInfo(String aid) throws ApiException {
    getPermissionsValidateRequest();

    var requestBuilder = getPermissionsRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), GetPermissions200Response.class);
  }

  private void getPermissionsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getPermissionsRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/permissions";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "aid";
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/problem+json"));

    return requestBuilder;
  }
}
