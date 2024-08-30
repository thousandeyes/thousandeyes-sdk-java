/*
 * Usage API
 *  These usage endpoints define the following operations:  * **Usage**: Retrieve usage data for the specified time period (default is one month).          * Users must have the `View organization usage` permission to access this endpoint.     * This endpoint offers visibility across all account groups within the organization.     * Users with `View organization usage` permission in multiple organizations should query the endpoint with the `aid` query string parameter (see optional parameters) for each organization.  * **Quotas**: Obtain organization and account usage quotas. Additionally, users with the appropriate permissions can create, update, or delete these quotas.          * Users must have the necessary permissions to perform quota-related actions.  Refer to the Usage API endpoints for detailed usage instructions and optional parameters. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.sdk.usage;

import static com.thousandeyes.sdk.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.sdk.client.RequestUtil.urlEncode;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.ApiResponse;
import com.thousandeyes.sdk.client.ApiRequest;
import com.thousandeyes.sdk.utils.Config;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.sdk.usage.model.EnterpriseAgentsUsage;
import com.thousandeyes.sdk.usage.model.Error;
import com.thousandeyes.sdk.usage.model.ExpandUsageOptions;
import java.time.OffsetDateTime;
import com.thousandeyes.sdk.usage.model.TestsUsage;
import com.thousandeyes.sdk.usage.model.UnauthorizedError;
import com.thousandeyes.sdk.usage.model.Usage;
import com.thousandeyes.sdk.usage.model.ValidationError;

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
public class UsageApi {
  private final ApiClient apiClient;

  public UsageApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get enterprise agent usage
   * This endpoint returns the organization&#39;s enterprise agents usage for a specific time period, or the curent billing cycle if no time period is specified. In the &#x60;/v7/usage&#x60; API, a shared enterprise agent&#39;s usage is reported in the account group where the agent was created (i.e Primary Account Group).  However in this API, the shared agent&#39;s usage is distributed among all the account groups where the tests are running on the particular agent. This API is also only available to customers on usage based pricing model.
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @return EnterpriseAgentsUsage
   * @throws ApiException if fails to make API call
   */
  public EnterpriseAgentsUsage getEnterpriseAgentsUnitsUsage(OffsetDateTime startDate, OffsetDateTime endDate, String cursor) throws ApiException {
    ApiResponse<EnterpriseAgentsUsage> response = getEnterpriseAgentsUnitsUsageWithHttpInfo(startDate, endDate, cursor);
    return response.getData();
  }

  /**
   * Get enterprise agent usage
   * This endpoint returns the organization&#39;s enterprise agents usage for a specific time period, or the curent billing cycle if no time period is specified. In the &#x60;/v7/usage&#x60; API, a shared enterprise agent&#39;s usage is reported in the account group where the agent was created (i.e Primary Account Group).  However in this API, the shared agent&#39;s usage is distributed among all the account groups where the tests are running on the particular agent. This API is also only available to customers on usage based pricing model.
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @return ApiResponse&lt;EnterpriseAgentsUsage&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EnterpriseAgentsUsage> getEnterpriseAgentsUnitsUsageWithHttpInfo(OffsetDateTime startDate, OffsetDateTime endDate, String cursor) throws ApiException {
    getEnterpriseAgentsUnitsUsageValidateRequest();

    var requestBuilder = getEnterpriseAgentsUnitsUsageRequestBuilder(startDate, endDate, cursor);

    return apiClient.send(requestBuilder.build(), EnterpriseAgentsUsage.class);
  }

  private void getEnterpriseAgentsUnitsUsageValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getEnterpriseAgentsUnitsUsageRequestBuilder(OffsetDateTime startDate, OffsetDateTime endDate, String cursor) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/usage/units/enterprise-agents";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("startDate", startDate));
    localVarQueryParams.addAll(parameterToPairs("endDate", endDate));
    localVarQueryParams.addAll(parameterToPairs("cursor", cursor));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * Get cloud and enterprise agents units usage
   * This endpoint returns the cloud and enterprise agents usage for all the tests for a specific time period, or the curent billing cycle if no time period is specified. In the &#x60;/v7/usage&#x60; API, an enterprise agent&#39;s usage is reported in the account group where the agent was created (i.e Primary Account Group).  However in this API, the agent&#39;s usage is distributed among all the account groups where the tests are running on the particular agent. This API is also only available to customers on usage based pricing model.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @return TestsUsage
   * @throws ApiException if fails to make API call
   */
  public TestsUsage getTestsUnitsUsage(String aid, OffsetDateTime startDate, OffsetDateTime endDate, String cursor) throws ApiException {
    ApiResponse<TestsUsage> response = getTestsUnitsUsageWithHttpInfo(aid, startDate, endDate, cursor);
    return response.getData();
  }

  /**
   * Get cloud and enterprise agents units usage
   * This endpoint returns the cloud and enterprise agents usage for all the tests for a specific time period, or the curent billing cycle if no time period is specified. In the &#x60;/v7/usage&#x60; API, an enterprise agent&#39;s usage is reported in the account group where the agent was created (i.e Primary Account Group).  However in this API, the agent&#39;s usage is distributed among all the account groups where the tests are running on the particular agent. This API is also only available to customers on usage based pricing model.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @return ApiResponse&lt;TestsUsage&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TestsUsage> getTestsUnitsUsageWithHttpInfo(String aid, OffsetDateTime startDate, OffsetDateTime endDate, String cursor) throws ApiException {
    getTestsUnitsUsageValidateRequest();

    var requestBuilder = getTestsUnitsUsageRequestBuilder(aid, startDate, endDate, cursor);

    return apiClient.send(requestBuilder.build(), TestsUsage.class);
  }

  private void getTestsUnitsUsageValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getTestsUnitsUsageRequestBuilder(String aid, OffsetDateTime startDate, OffsetDateTime endDate, String cursor) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/usage/units/tests";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("startDate", startDate));
    localVarQueryParams.addAll(parameterToPairs("endDate", endDate));
    localVarQueryParams.addAll(parameterToPairs("cursor", cursor));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * Get usage information for the last month
   * This endpoint returns usage for the current period. It provides visibility across all account groups within an organization. To access this endpoint, you need the &#x60;View Billing&#x60; permission (a management permission). If you have access to view billing in multiple organizations, query the endpoint using an &#x60;aid&#x60; querystring parameter (see optional parameters, below) from each organization. **Note:** Access to billing information older than one month is not supported by this endpoint.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Expands the available resources. By default, no expansion takes place if the  &#x60;expand&#x60; query parameter is not passed. For example, to expand the \&quot;tests\&quot;  resource, pass the query &#39;?expand&#x3D;test&#39;. (optional
   * @return Usage
   * @throws ApiException if fails to make API call
   */
  public Usage getUsage(String aid, List<ExpandUsageOptions> expand) throws ApiException {
    ApiResponse<Usage> response = getUsageWithHttpInfo(aid, expand);
    return response.getData();
  }

  /**
   * Get usage information for the last month
   * This endpoint returns usage for the current period. It provides visibility across all account groups within an organization. To access this endpoint, you need the &#x60;View Billing&#x60; permission (a management permission). If you have access to view billing in multiple organizations, query the endpoint using an &#x60;aid&#x60; querystring parameter (see optional parameters, below) from each organization. **Note:** Access to billing information older than one month is not supported by this endpoint.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Expands the available resources. By default, no expansion takes place if the  &#x60;expand&#x60; query parameter is not passed. For example, to expand the \&quot;tests\&quot;  resource, pass the query &#39;?expand&#x3D;test&#39;. (optional
   * @return ApiResponse&lt;Usage&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Usage> getUsageWithHttpInfo(String aid, List<ExpandUsageOptions> expand) throws ApiException {
    getUsageValidateRequest();

    var requestBuilder = getUsageRequestBuilder(aid, expand);

    return apiClient.send(requestBuilder.build(), Usage.class);
  }

  private void getUsageValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getUsageRequestBuilder(String aid, List<ExpandUsageOptions> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/usage";
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
}
