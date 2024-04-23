/*
 * Endpoint Agents API
 * Manage ThousandEyes Endpoint Agents using this API.   For more information about Endpoint Agents, see [Endpoint Agents](https://docs.thousandeyes.com/product-documentation/global-vantage-points/endpoint-agents).
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.api.endpoint.agents;

import static com.thousandeyes.api.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.api.client.RequestUtil.urlEncode;

import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.client.ApiException;
import com.thousandeyes.api.client.ApiResponse;
import com.thousandeyes.api.client.ApiRequest;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.api.endpoint.agents.model.AgentSearchRequest;
import java.math.BigDecimal;
import com.thousandeyes.api.endpoint.agents.model.EndpointAgentGet200Response;
import com.thousandeyes.api.endpoint.agents.model.EndpointAgentUpdate;
import com.thousandeyes.api.endpoint.agents.model.EndpointAgentsList200Response;
import com.thousandeyes.api.endpoint.agents.model.EndpointAgentsSearch200Response;
import com.thousandeyes.api.endpoint.agents.model.Error;
import com.thousandeyes.api.endpoint.agents.model.Expand;
import java.util.UUID;
import com.thousandeyes.api.endpoint.agents.model.UnauthorizedError;
import com.thousandeyes.api.endpoint.agents.model.ValidationError;

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

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T17:12:31.591476+01:00[Europe/Lisbon]")
public class ManageAgentsApi {
  private final ApiClient apiClient;

  public ManageAgentsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Delete endpoint agent
   * Deletes the agent with the specified &#x60;agent_id&#x60;. 
   * @param agentId The identifier of the agent to operate on. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  (optional
   * @throws ApiException if fails to make API call
   */
  public void endpointAgentDelete(UUID agentId, String aid, List<Expand> expand) throws ApiException {
    endpointAgentDeleteWithHttpInfo(agentId, aid, expand);
  }

  /**
   * Delete endpoint agent
   * Deletes the agent with the specified &#x60;agent_id&#x60;. 
   * @param agentId The identifier of the agent to operate on. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  (optional
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> endpointAgentDeleteWithHttpInfo(UUID agentId, String aid, List<Expand> expand) throws ApiException {
    endpointAgentDeleteValidateRequest(agentId);

    var requestBuilder = endpointAgentDeleteRequestBuilder(agentId, aid, expand);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void endpointAgentDeleteValidateRequest(UUID agentId) throws ApiException {
      // verify the required parameter 'agentId' is set
      if (agentId == null) {
        throw new ApiException(400, "Missing the required parameter 'agentId' when calling endpointAgentDelete");
      }
  }

  private ApiRequest.ApiRequestBuilder endpointAgentDeleteRequestBuilder(UUID agentId, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/v7/endpoint/agents/{agentId}"
        .replace("{agentId}", urlEncode(agentId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    return requestBuilder;
  }
  /**
   * Disable endpoint agent
   * Disables an endpoint agent. If it&#39;s already disabled, it has no effect (no operation).
   * @param agentId The identifier of the agent to operate on. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return EndpointAgentGet200Response
   * @throws ApiException if fails to make API call
   */
  public EndpointAgentGet200Response endpointAgentDisable(UUID agentId, String aid) throws ApiException {
    ApiResponse<EndpointAgentGet200Response> response = endpointAgentDisableWithHttpInfo(agentId, aid);
    return response.getData();
  }

  /**
   * Disable endpoint agent
   * Disables an endpoint agent. If it&#39;s already disabled, it has no effect (no operation).
   * @param agentId The identifier of the agent to operate on. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;EndpointAgentGet200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EndpointAgentGet200Response> endpointAgentDisableWithHttpInfo(UUID agentId, String aid) throws ApiException {
    endpointAgentDisableValidateRequest(agentId);

    var requestBuilder = endpointAgentDisableRequestBuilder(agentId, aid);

    return apiClient.send(requestBuilder.build(), EndpointAgentGet200Response.class);
  }

  private void endpointAgentDisableValidateRequest(UUID agentId) throws ApiException {
      // verify the required parameter 'agentId' is set
      if (agentId == null) {
        throw new ApiException(400, "Missing the required parameter 'agentId' when calling endpointAgentDisable");
      }
  }

  private ApiRequest.ApiRequestBuilder endpointAgentDisableRequestBuilder(UUID agentId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/endpoint/agents/{agentId}/disable"
        .replace("{agentId}", urlEncode(agentId.toString()));
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
   * Enable endpoint agent
   * Enables an endpoint agent. If it&#39;s already enabled, it has no effect (no operation).
   * @param agentId The identifier of the agent to operate on. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return EndpointAgentGet200Response
   * @throws ApiException if fails to make API call
   */
  public EndpointAgentGet200Response endpointAgentEnable(UUID agentId, String aid) throws ApiException {
    ApiResponse<EndpointAgentGet200Response> response = endpointAgentEnableWithHttpInfo(agentId, aid);
    return response.getData();
  }

  /**
   * Enable endpoint agent
   * Enables an endpoint agent. If it&#39;s already enabled, it has no effect (no operation).
   * @param agentId The identifier of the agent to operate on. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;EndpointAgentGet200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EndpointAgentGet200Response> endpointAgentEnableWithHttpInfo(UUID agentId, String aid) throws ApiException {
    endpointAgentEnableValidateRequest(agentId);

    var requestBuilder = endpointAgentEnableRequestBuilder(agentId, aid);

    return apiClient.send(requestBuilder.build(), EndpointAgentGet200Response.class);
  }

  private void endpointAgentEnableValidateRequest(UUID agentId) throws ApiException {
      // verify the required parameter 'agentId' is set
      if (agentId == null) {
        throw new ApiException(400, "Missing the required parameter 'agentId' when calling endpointAgentEnable");
      }
  }

  private ApiRequest.ApiRequestBuilder endpointAgentEnableRequestBuilder(UUID agentId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/endpoint/agents/{agentId}/enable"
        .replace("{agentId}", urlEncode(agentId.toString()));
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
   * Retrieve endpoint agent
   * Retrieves details of an agent with the specified &#x60;agent_id&#x60;.
   * @param agentId The identifier of the agent to operate on. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  (optional
   * @param includeDeleted When requesting entities, set to &#x60;true&#x60; if you want to see deleted entities. (optional)
   * @return EndpointAgentGet200Response
   * @throws ApiException if fails to make API call
   */
  public EndpointAgentGet200Response endpointAgentGet(UUID agentId, String aid, List<Expand> expand, Boolean includeDeleted) throws ApiException {
    ApiResponse<EndpointAgentGet200Response> response = endpointAgentGetWithHttpInfo(agentId, aid, expand, includeDeleted);
    return response.getData();
  }

  /**
   * Retrieve endpoint agent
   * Retrieves details of an agent with the specified &#x60;agent_id&#x60;.
   * @param agentId The identifier of the agent to operate on. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  (optional
   * @param includeDeleted When requesting entities, set to &#x60;true&#x60; if you want to see deleted entities. (optional)
   * @return ApiResponse&lt;EndpointAgentGet200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EndpointAgentGet200Response> endpointAgentGetWithHttpInfo(UUID agentId, String aid, List<Expand> expand, Boolean includeDeleted) throws ApiException {
    endpointAgentGetValidateRequest(agentId);

    var requestBuilder = endpointAgentGetRequestBuilder(agentId, aid, expand, includeDeleted);

    return apiClient.send(requestBuilder.build(), EndpointAgentGet200Response.class);
  }

  private void endpointAgentGetValidateRequest(UUID agentId) throws ApiException {
      // verify the required parameter 'agentId' is set
      if (agentId == null) {
        throw new ApiException(400, "Missing the required parameter 'agentId' when calling endpointAgentGet");
      }
  }

  private ApiRequest.ApiRequestBuilder endpointAgentGetRequestBuilder(UUID agentId, String aid, List<Expand> expand, Boolean includeDeleted) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/endpoint/agents/{agentId}"
        .replace("{agentId}", urlEncode(agentId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));
    localVarQueryParams.addAll(parameterToPairs("includeDeleted", includeDeleted));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    return requestBuilder;
  }
  /**
   * Update endpoint agent
   * Updates the agent with the specified &#x60;agent_id&#x60;. This API supports the modification of the following fields:  * &#x60;name&#x60;  * &#x60;licenseType&#x60;  Any attempt to update fields other than those listed above, with a value different from their current value, will result in a 400 Bad Request response. 
   * @param agentId The identifier of the agent to operate on. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  (optional
   * @param endpointAgentUpdate Fields to modify on the agent (optional)
   * @return EndpointAgentGet200Response
   * @throws ApiException if fails to make API call
   */
  public EndpointAgentGet200Response endpointAgentUpdate(UUID agentId, String aid, List<Expand> expand, EndpointAgentUpdate endpointAgentUpdate) throws ApiException {
    ApiResponse<EndpointAgentGet200Response> response = endpointAgentUpdateWithHttpInfo(agentId, aid, expand, endpointAgentUpdate);
    return response.getData();
  }

  /**
   * Update endpoint agent
   * Updates the agent with the specified &#x60;agent_id&#x60;. This API supports the modification of the following fields:  * &#x60;name&#x60;  * &#x60;licenseType&#x60;  Any attempt to update fields other than those listed above, with a value different from their current value, will result in a 400 Bad Request response. 
   * @param agentId The identifier of the agent to operate on. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  (optional
   * @param endpointAgentUpdate Fields to modify on the agent (optional)
   * @return ApiResponse&lt;EndpointAgentGet200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EndpointAgentGet200Response> endpointAgentUpdateWithHttpInfo(UUID agentId, String aid, List<Expand> expand, EndpointAgentUpdate endpointAgentUpdate) throws ApiException {
    endpointAgentUpdateValidateRequest(agentId);

    var requestBuilder = endpointAgentUpdateRequestBuilder(agentId, aid, expand, endpointAgentUpdate);

    return apiClient.send(requestBuilder.build(), EndpointAgentGet200Response.class);
  }

  private void endpointAgentUpdateValidateRequest(UUID agentId) throws ApiException {
      // verify the required parameter 'agentId' is set
      if (agentId == null) {
        throw new ApiException(400, "Missing the required parameter 'agentId' when calling endpointAgentUpdate");
      }
  }

  private ApiRequest.ApiRequestBuilder endpointAgentUpdateRequestBuilder(UUID agentId, String aid, List<Expand> expand, EndpointAgentUpdate endpointAgentUpdate) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PATCH");

    String path = "/v7/endpoint/agents/{agentId}"
        .replace("{agentId}", urlEncode(agentId.toString()));
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
    requestBuilder.requestBody(endpointAgentUpdate);
    return requestBuilder;
  }
  /**
   * List endpoint agents
   * Retrieves a list of endpoint agents in a given account group.  If there are no agents in the specified account group, it returns an empty array. 
   * @param max (Optional) Maximum number of objects to return. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  (optional
   * @param includeDeleted When requesting entities, set to &#x60;true&#x60; if you want to see deleted entities. (optional)
   * @param useAllPermittedAids Set to &#x60;true&#x60; to load data from all accounts the user has access to. (optional, default to false)
   * @param agentName Returns only agents with the specified name.  This is an exact match only.  (optional)
   * @param computerName Returns only agents with the specified computer name. This is an exact match only.  (optional)
   * @return EndpointAgentsList200Response
   * @throws ApiException if fails to make API call
   */
  public EndpointAgentsList200Response endpointAgentsList(BigDecimal max, String cursor, String aid, List<Expand> expand, Boolean includeDeleted, Boolean useAllPermittedAids, String agentName, String computerName) throws ApiException {
    ApiResponse<EndpointAgentsList200Response> response = endpointAgentsListWithHttpInfo(max, cursor, aid, expand, includeDeleted, useAllPermittedAids, agentName, computerName);
    return response.getData();
  }

  /**
   * List endpoint agents
   * Retrieves a list of endpoint agents in a given account group.  If there are no agents in the specified account group, it returns an empty array. 
   * @param max (Optional) Maximum number of objects to return. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  (optional
   * @param includeDeleted When requesting entities, set to &#x60;true&#x60; if you want to see deleted entities. (optional)
   * @param useAllPermittedAids Set to &#x60;true&#x60; to load data from all accounts the user has access to. (optional, default to false)
   * @param agentName Returns only agents with the specified name.  This is an exact match only.  (optional)
   * @param computerName Returns only agents with the specified computer name. This is an exact match only.  (optional)
   * @return ApiResponse&lt;EndpointAgentsList200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EndpointAgentsList200Response> endpointAgentsListWithHttpInfo(BigDecimal max, String cursor, String aid, List<Expand> expand, Boolean includeDeleted, Boolean useAllPermittedAids, String agentName, String computerName) throws ApiException {
    endpointAgentsListValidateRequest();

    var requestBuilder = endpointAgentsListRequestBuilder(max, cursor, aid, expand, includeDeleted, useAllPermittedAids, agentName, computerName);

    return apiClient.send(requestBuilder.build(), EndpointAgentsList200Response.class);
  }

  private void endpointAgentsListValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder endpointAgentsListRequestBuilder(BigDecimal max, String cursor, String aid, List<Expand> expand, Boolean includeDeleted, Boolean useAllPermittedAids, String agentName, String computerName) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/endpoint/agents";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("max", max));
    localVarQueryParams.addAll(parameterToPairs("cursor", cursor));
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));
    localVarQueryParams.addAll(parameterToPairs("includeDeleted", includeDeleted));
    localVarQueryParams.addAll(parameterToPairs("useAllPermittedAids", useAllPermittedAids));
    localVarQueryParams.addAll(parameterToPairs("agentName", agentName));
    localVarQueryParams.addAll(parameterToPairs("computerName", computerName));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    return requestBuilder;
  }
  /**
   * Filter endpoint agents
   * Retrieves a list of endpoint agents within the specified account group that match the specified filters.  If no agents meet the filter criteria, the API returns an empty array. 
   * @param agentSearchRequest The filter options for advanced search filtering for agents. (required)
   * @param max (Optional) Maximum number of objects to return. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  (optional
   * @param includeDeleted When requesting entities, set to &#x60;true&#x60; if you want to see deleted entities. (optional)
   * @return EndpointAgentsSearch200Response
   * @throws ApiException if fails to make API call
   */
  public EndpointAgentsSearch200Response endpointAgentsSearch(AgentSearchRequest agentSearchRequest, BigDecimal max, String cursor, String aid, List<Expand> expand, Boolean includeDeleted) throws ApiException {
    ApiResponse<EndpointAgentsSearch200Response> response = endpointAgentsSearchWithHttpInfo(agentSearchRequest, max, cursor, aid, expand, includeDeleted);
    return response.getData();
  }

  /**
   * Filter endpoint agents
   * Retrieves a list of endpoint agents within the specified account group that match the specified filters.  If no agents meet the filter criteria, the API returns an empty array. 
   * @param agentSearchRequest The filter options for advanced search filtering for agents. (required)
   * @param max (Optional) Maximum number of objects to return. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  (optional
   * @param includeDeleted When requesting entities, set to &#x60;true&#x60; if you want to see deleted entities. (optional)
   * @return ApiResponse&lt;EndpointAgentsSearch200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EndpointAgentsSearch200Response> endpointAgentsSearchWithHttpInfo(AgentSearchRequest agentSearchRequest, BigDecimal max, String cursor, String aid, List<Expand> expand, Boolean includeDeleted) throws ApiException {
    endpointAgentsSearchValidateRequest(agentSearchRequest);

    var requestBuilder = endpointAgentsSearchRequestBuilder(agentSearchRequest, max, cursor, aid, expand, includeDeleted);

    return apiClient.send(requestBuilder.build(), EndpointAgentsSearch200Response.class);
  }

  private void endpointAgentsSearchValidateRequest(AgentSearchRequest agentSearchRequest) throws ApiException {
      // verify the required parameter 'agentSearchRequest' is set
      if (agentSearchRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'agentSearchRequest' when calling endpointAgentsSearch");
      }
  }

  private ApiRequest.ApiRequestBuilder endpointAgentsSearchRequestBuilder(AgentSearchRequest agentSearchRequest, BigDecimal max, String cursor, String aid, List<Expand> expand, Boolean includeDeleted) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/endpoint/agents/filter";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("max", max));
    localVarQueryParams.addAll(parameterToPairs("cursor", cursor));
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));
    localVarQueryParams.addAll(parameterToPairs("includeDeleted", includeDeleted));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    requestBuilder.requestBody(agentSearchRequest);
    return requestBuilder;
  }
}
