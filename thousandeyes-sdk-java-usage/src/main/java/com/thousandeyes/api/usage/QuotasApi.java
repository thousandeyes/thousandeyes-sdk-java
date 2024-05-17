/*
 * Usage API
 *  These usage endpoints define the following operations:  * **Usage**: Retrieve usage data for the specified time period (default is one month).          * Users must have the `View Billing` permission to access this endpoint.     * This endpoint offers visibility across all account groups within the organization.     * Users with `View Billing` permission in multiple organizations should query the endpoint with the `aid` query string parameter (see optional parameters) for each organization.  * **Quotas**: Obtain organization and account usage quotas. Additionally, users with the appropriate permissions can create, update, or delete these quotas.          * Users must have the necessary permissions to perform quota-related actions.  Refer to the Usage API endpoints for detailed usage instructions and optional parameters. 
 *
 * The version of the OpenAPI document: 7.0.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.api.usage;

import static com.thousandeyes.api.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.api.client.RequestUtil.urlEncode;

import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.client.ApiException;
import com.thousandeyes.api.client.ApiResponse;
import com.thousandeyes.api.client.ApiRequest;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.api.usage.model.Error;
import com.thousandeyes.api.usage.model.OrganizationsQuotasAssign;
import com.thousandeyes.api.usage.model.OrganizationsQuotasUnassign;
import com.thousandeyes.api.usage.model.Quotas;
import com.thousandeyes.api.usage.model.QuotasAssignRequest;
import com.thousandeyes.api.usage.model.QuotasAssignResponse;
import com.thousandeyes.api.usage.model.QuotasUnassign;
import com.thousandeyes.api.usage.model.UnauthorizedError;
import com.thousandeyes.api.usage.model.ValidationError;

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

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-05-17T09:32:25.977275+01:00[Europe/Lisbon]")
public class QuotasApi {
  private final ApiClient apiClient;

  public QuotasApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create or update accout group quotas
   * This endpoint assigns quota values to multiple account groups across multiple organizations. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission. This endpoint follows a cumulative behavior––This means that the quotas are assigned to the designated account groups, and any previous assignments remain in place without any unassignment occurring.
   * @param organizationsQuotasAssign  (optional)
   * @return OrganizationsQuotasAssign
   * @throws ApiException if fails to make API call
   */
  public OrganizationsQuotasAssign assignOrganizationsAccountGroupsQuotas(OrganizationsQuotasAssign organizationsQuotasAssign) throws ApiException {
    ApiResponse<OrganizationsQuotasAssign> response = assignOrganizationsAccountGroupsQuotasWithHttpInfo(organizationsQuotasAssign);
    return response.getData();
  }

  /**
   * Create or update accout group quotas
   * This endpoint assigns quota values to multiple account groups across multiple organizations. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission. This endpoint follows a cumulative behavior––This means that the quotas are assigned to the designated account groups, and any previous assignments remain in place without any unassignment occurring.
   * @param organizationsQuotasAssign  (optional)
   * @return ApiResponse&lt;OrganizationsQuotasAssign&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrganizationsQuotasAssign> assignOrganizationsAccountGroupsQuotasWithHttpInfo(OrganizationsQuotasAssign organizationsQuotasAssign) throws ApiException {
    assignOrganizationsAccountGroupsQuotasValidateRequest();

    var requestBuilder = assignOrganizationsAccountGroupsQuotasRequestBuilder(organizationsQuotasAssign);

    return apiClient.send(requestBuilder.build(), OrganizationsQuotasAssign.class);
  }

  private void assignOrganizationsAccountGroupsQuotasValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder assignOrganizationsAccountGroupsQuotasRequestBuilder(OrganizationsQuotasAssign organizationsQuotasAssign) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/quotas/account-groups/assign";
    requestBuilder.path(path);


    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    requestBuilder.requestBody(organizationsQuotasAssign);
    return requestBuilder;
  }
  /**
   * Create or update organizations quotas
   * This endpoint recieves a list of organization quotas to create or update. If there&#39;s no specific &#x60;orgId&#x60; defined for a quota, it defaults to using the authenticated organization. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission. This endpoint follows cumulative behavior––This means that the quotas are assigned to the specified organizations, and any previous assignments remain unchanged; no unassignments occur.
   * @param quotasAssignRequest  (optional)
   * @return QuotasAssignResponse
   * @throws ApiException if fails to make API call
   */
  public QuotasAssignResponse assignOrganizationsQuotas(QuotasAssignRequest quotasAssignRequest) throws ApiException {
    ApiResponse<QuotasAssignResponse> response = assignOrganizationsQuotasWithHttpInfo(quotasAssignRequest);
    return response.getData();
  }

  /**
   * Create or update organizations quotas
   * This endpoint recieves a list of organization quotas to create or update. If there&#39;s no specific &#x60;orgId&#x60; defined for a quota, it defaults to using the authenticated organization. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission. This endpoint follows cumulative behavior––This means that the quotas are assigned to the specified organizations, and any previous assignments remain unchanged; no unassignments occur.
   * @param quotasAssignRequest  (optional)
   * @return ApiResponse&lt;QuotasAssignResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<QuotasAssignResponse> assignOrganizationsQuotasWithHttpInfo(QuotasAssignRequest quotasAssignRequest) throws ApiException {
    assignOrganizationsQuotasValidateRequest();

    var requestBuilder = assignOrganizationsQuotasRequestBuilder(quotasAssignRequest);

    return apiClient.send(requestBuilder.build(), QuotasAssignResponse.class);
  }

  private void assignOrganizationsQuotasValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder assignOrganizationsQuotasRequestBuilder(QuotasAssignRequest quotasAssignRequest) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/quotas/assign";
    requestBuilder.path(path);


    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    requestBuilder.requestBody(quotasAssignRequest);
    return requestBuilder;
  }
  /**
   * Get organization and account group usage quota
   * This endpoint retrieves usage quotas for both organization and account groups. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission. If a user has quota update permission in multiple organizations, the API returns data from all such organizations.
   * @return Quotas
   * @throws ApiException if fails to make API call
   */
  public Quotas getQuotas() throws ApiException {
    ApiResponse<Quotas> response = getQuotasWithHttpInfo();
    return response.getData();
  }

  /**
   * Get organization and account group usage quota
   * This endpoint retrieves usage quotas for both organization and account groups. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission. If a user has quota update permission in multiple organizations, the API returns data from all such organizations.
   * @return ApiResponse&lt;Quotas&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Quotas> getQuotasWithHttpInfo() throws ApiException {
    getQuotasValidateRequest();

    var requestBuilder = getQuotasRequestBuilder();

    return apiClient.send(requestBuilder.build(), Quotas.class);
  }

  private void getQuotasValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getQuotasRequestBuilder() throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/quotas";
    requestBuilder.path(path);


    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    return requestBuilder;
  }
  /**
   * Remove account group quotas from organizations
   * This endpoint removes quotas from multiple account groups across multiple organizations. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission.
   * @param organizationsQuotasUnassign  (optional)
   * @throws ApiException if fails to make API call
   */
  public void unassignOrganizationsAccountGroupsQuotas(OrganizationsQuotasUnassign organizationsQuotasUnassign) throws ApiException {
    unassignOrganizationsAccountGroupsQuotasWithHttpInfo(organizationsQuotasUnassign);
  }

  /**
   * Remove account group quotas from organizations
   * This endpoint removes quotas from multiple account groups across multiple organizations. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission.
   * @param organizationsQuotasUnassign  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> unassignOrganizationsAccountGroupsQuotasWithHttpInfo(OrganizationsQuotasUnassign organizationsQuotasUnassign) throws ApiException {
    unassignOrganizationsAccountGroupsQuotasValidateRequest();

    var requestBuilder = unassignOrganizationsAccountGroupsQuotasRequestBuilder(organizationsQuotasUnassign);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void unassignOrganizationsAccountGroupsQuotasValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder unassignOrganizationsAccountGroupsQuotasRequestBuilder(OrganizationsQuotasUnassign organizationsQuotasUnassign) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/quotas/account-groups/unassign";
    requestBuilder.path(path);


    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    requestBuilder.requestBody(organizationsQuotasUnassign);
    return requestBuilder;
  }
  /**
   * Remove organization quotas
   * This endpoint recieves a list of organization IDs to remove their current quota. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission.
   * @param quotasUnassign  (optional)
   * @throws ApiException if fails to make API call
   */
  public void unassignOrganizationsQuotas(QuotasUnassign quotasUnassign) throws ApiException {
    unassignOrganizationsQuotasWithHttpInfo(quotasUnassign);
  }

  /**
   * Remove organization quotas
   * This endpoint recieves a list of organization IDs to remove their current quota. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission.
   * @param quotasUnassign  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> unassignOrganizationsQuotasWithHttpInfo(QuotasUnassign quotasUnassign) throws ApiException {
    unassignOrganizationsQuotasValidateRequest();

    var requestBuilder = unassignOrganizationsQuotasRequestBuilder(quotasUnassign);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void unassignOrganizationsQuotasValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder unassignOrganizationsQuotasRequestBuilder(QuotasUnassign quotasUnassign) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/quotas/unassign";
    requestBuilder.path(path);


    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    requestBuilder.requestBody(quotasUnassign);
    return requestBuilder;
  }
}
