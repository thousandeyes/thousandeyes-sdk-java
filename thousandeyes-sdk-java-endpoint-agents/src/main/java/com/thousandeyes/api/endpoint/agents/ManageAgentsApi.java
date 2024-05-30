/*
 * Endpoint Agents API
 * Manage ThousandEyes Endpoint Agents using this API.   For more information about Endpoint Agents, see [Endpoint Agents](https://docs.thousandeyes.com/product-documentation/global-vantage-points/endpoint-agents).
 *
 * The version of the OpenAPI document: 7.0.6
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
import com.thousandeyes.api.utils.Config;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.api.endpoint.agents.model.AgentSearchRequest;
import com.thousandeyes.api.endpoint.agents.model.EndpointAgent;
import com.thousandeyes.api.endpoint.agents.model.EndpointAgentUpdate;
import com.thousandeyes.api.endpoint.agents.model.Error;
import com.thousandeyes.api.endpoint.agents.model.Expand;
import com.thousandeyes.api.endpoint.agents.model.FilterEndpointAgentsResponse;
import com.thousandeyes.api.endpoint.agents.model.ListEndpointAgentsResponse;
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

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
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
  public void deleteEndpointAgent(UUID agentId, String aid, List<Expand> expand) throws ApiException {
    deleteEndpointAgentWithHttpInfo(agentId, aid, expand);
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
  public ApiResponse<Void> deleteEndpointAgentWithHttpInfo(UUID agentId, String aid, List<Expand> expand) throws ApiException {
    deleteEndpointAgentValidateRequest(agentId);

    var requestBuilder = deleteEndpointAgentRequestBuilder(agentId, aid, expand);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteEndpointAgentValidateRequest(UUID agentId) throws ApiException {
      // verify the required parameter 'agentId' is set
      if (agentId == null) {
        throw new ApiException(400, "Missing the required parameter 'agentId' when calling deleteEndpointAgent");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteEndpointAgentRequestBuilder(UUID agentId, String aid, List<Expand> expand) throws ApiException {
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
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * Disable endpoint agent
   * Disables an endpoint agent. If it&#39;s already disabled, it has no effect (no operation).
   * @param agentId The identifier of the agent to operate on. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return EndpointAgent
   * @throws ApiException if fails to make API call
   */
  public EndpointAgent disableEndpointAgent(UUID agentId, String aid) throws ApiException {
    ApiResponse<EndpointAgent> response = disableEndpointAgentWithHttpInfo(agentId, aid);
    return response.getData();
  }

  /**
   * Disable endpoint agent
   * Disables an endpoint agent. If it&#39;s already disabled, it has no effect (no operation).
   * @param agentId The identifier of the agent to operate on. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;EndpointAgent&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EndpointAgent> disableEndpointAgentWithHttpInfo(UUID agentId, String aid) throws ApiException {
    disableEndpointAgentValidateRequest(agentId);

    var requestBuilder = disableEndpointAgentRequestBuilder(agentId, aid);

    return apiClient.send(requestBuilder.build(), EndpointAgent.class);
  }

  private void disableEndpointAgentValidateRequest(UUID agentId) throws ApiException {
      // verify the required parameter 'agentId' is set
      if (agentId == null) {
        throw new ApiException(400, "Missing the required parameter 'agentId' when calling disableEndpointAgent");
      }
  }

  private ApiRequest.ApiRequestBuilder disableEndpointAgentRequestBuilder(UUID agentId, String aid) throws ApiException {
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
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * Enable endpoint agent
   * Enables an endpoint agent. If it&#39;s already enabled, it has no effect (no operation).
   * @param agentId The identifier of the agent to operate on. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return EndpointAgent
   * @throws ApiException if fails to make API call
   */
  public EndpointAgent enableEndpointAgent(UUID agentId, String aid) throws ApiException {
    ApiResponse<EndpointAgent> response = enableEndpointAgentWithHttpInfo(agentId, aid);
    return response.getData();
  }

  /**
   * Enable endpoint agent
   * Enables an endpoint agent. If it&#39;s already enabled, it has no effect (no operation).
   * @param agentId The identifier of the agent to operate on. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;EndpointAgent&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EndpointAgent> enableEndpointAgentWithHttpInfo(UUID agentId, String aid) throws ApiException {
    enableEndpointAgentValidateRequest(agentId);

    var requestBuilder = enableEndpointAgentRequestBuilder(agentId, aid);

    return apiClient.send(requestBuilder.build(), EndpointAgent.class);
  }

  private void enableEndpointAgentValidateRequest(UUID agentId) throws ApiException {
      // verify the required parameter 'agentId' is set
      if (agentId == null) {
        throw new ApiException(400, "Missing the required parameter 'agentId' when calling enableEndpointAgent");
      }
  }

  private ApiRequest.ApiRequestBuilder enableEndpointAgentRequestBuilder(UUID agentId, String aid) throws ApiException {
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
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
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
   * @return FilterEndpointAgentsResponse
   * @throws ApiException if fails to make API call
   */
  public FilterEndpointAgentsResponse filterEndpointAgents(AgentSearchRequest agentSearchRequest, Integer max, String cursor, String aid, List<Expand> expand, Boolean includeDeleted) throws ApiException {
    ApiResponse<FilterEndpointAgentsResponse> response = filterEndpointAgentsWithHttpInfo(agentSearchRequest, max, cursor, aid, expand, includeDeleted);
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
   * @return ApiResponse&lt;FilterEndpointAgentsResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<FilterEndpointAgentsResponse> filterEndpointAgentsWithHttpInfo(AgentSearchRequest agentSearchRequest, Integer max, String cursor, String aid, List<Expand> expand, Boolean includeDeleted) throws ApiException {
    filterEndpointAgentsValidateRequest(agentSearchRequest);

    var requestBuilder = filterEndpointAgentsRequestBuilder(agentSearchRequest, max, cursor, aid, expand, includeDeleted);

    return apiClient.send(requestBuilder.build(), FilterEndpointAgentsResponse.class);
  }

  private void filterEndpointAgentsValidateRequest(AgentSearchRequest agentSearchRequest) throws ApiException {
      // verify the required parameter 'agentSearchRequest' is set
      if (agentSearchRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'agentSearchRequest' when calling filterEndpointAgents");
      }
  }

  private ApiRequest.ApiRequestBuilder filterEndpointAgentsRequestBuilder(AgentSearchRequest agentSearchRequest, Integer max, String cursor, String aid, List<Expand> expand, Boolean includeDeleted) throws ApiException {
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
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(agentSearchRequest);
    return requestBuilder;
  }
  /**
   * Retrieve endpoint agent
   * Retrieves details of an agent with the specified &#x60;agent_id&#x60;.
   * @param agentId The identifier of the agent to operate on. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  (optional
   * @param includeDeleted When requesting entities, set to &#x60;true&#x60; if you want to see deleted entities. (optional)
   * @return EndpointAgent
   * @throws ApiException if fails to make API call
   */
  public EndpointAgent getEndpointAgent(UUID agentId, String aid, List<Expand> expand, Boolean includeDeleted) throws ApiException {
    ApiResponse<EndpointAgent> response = getEndpointAgentWithHttpInfo(agentId, aid, expand, includeDeleted);
    return response.getData();
  }

  /**
   * Retrieve endpoint agent
   * Retrieves details of an agent with the specified &#x60;agent_id&#x60;.
   * @param agentId The identifier of the agent to operate on. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  (optional
   * @param includeDeleted When requesting entities, set to &#x60;true&#x60; if you want to see deleted entities. (optional)
   * @return ApiResponse&lt;EndpointAgent&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EndpointAgent> getEndpointAgentWithHttpInfo(UUID agentId, String aid, List<Expand> expand, Boolean includeDeleted) throws ApiException {
    getEndpointAgentValidateRequest(agentId);

    var requestBuilder = getEndpointAgentRequestBuilder(agentId, aid, expand, includeDeleted);

    return apiClient.send(requestBuilder.build(), EndpointAgent.class);
  }

  private void getEndpointAgentValidateRequest(UUID agentId) throws ApiException {
      // verify the required parameter 'agentId' is set
      if (agentId == null) {
        throw new ApiException(400, "Missing the required parameter 'agentId' when calling getEndpointAgent");
      }
  }

  private ApiRequest.ApiRequestBuilder getEndpointAgentRequestBuilder(UUID agentId, String aid, List<Expand> expand, Boolean includeDeleted) throws ApiException {
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
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
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
   * @return ListEndpointAgentsResponse
   * @throws ApiException if fails to make API call
   */
  public ListEndpointAgentsResponse getEndpointAgents(Integer max, String cursor, String aid, List<Expand> expand, Boolean includeDeleted, Boolean useAllPermittedAids, String agentName, String computerName) throws ApiException {
    ApiResponse<ListEndpointAgentsResponse> response = getEndpointAgentsWithHttpInfo(max, cursor, aid, expand, includeDeleted, useAllPermittedAids, agentName, computerName);
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
   * @return ApiResponse&lt;ListEndpointAgentsResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ListEndpointAgentsResponse> getEndpointAgentsWithHttpInfo(Integer max, String cursor, String aid, List<Expand> expand, Boolean includeDeleted, Boolean useAllPermittedAids, String agentName, String computerName) throws ApiException {
    getEndpointAgentsValidateRequest();

    var requestBuilder = getEndpointAgentsRequestBuilder(max, cursor, aid, expand, includeDeleted, useAllPermittedAids, agentName, computerName);

    return apiClient.send(requestBuilder.build(), ListEndpointAgentsResponse.class);
  }

  private void getEndpointAgentsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getEndpointAgentsRequestBuilder(Integer max, String cursor, String aid, List<Expand> expand, Boolean includeDeleted, Boolean useAllPermittedAids, String agentName, String computerName) throws ApiException {
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
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * Update endpoint agent
   * Updates the agent with the specified &#x60;agent_id&#x60;. This API supports the modification of the following fields:  * &#x60;name&#x60;  * &#x60;licenseType&#x60;  Any attempt to update fields other than those listed above, with a value different from their current value, will result in a 400 Bad Request response. 
   * @param agentId The identifier of the agent to operate on. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  (optional
   * @param endpointAgentUpdate Fields to modify on the agent (optional)
   * @return EndpointAgent
   * @throws ApiException if fails to make API call
   */
  public EndpointAgent updateEndpointAgent(UUID agentId, String aid, List<Expand> expand, EndpointAgentUpdate endpointAgentUpdate) throws ApiException {
    ApiResponse<EndpointAgent> response = updateEndpointAgentWithHttpInfo(agentId, aid, expand, endpointAgentUpdate);
    return response.getData();
  }

  /**
   * Update endpoint agent
   * Updates the agent with the specified &#x60;agent_id&#x60;. This API supports the modification of the following fields:  * &#x60;name&#x60;  * &#x60;licenseType&#x60;  Any attempt to update fields other than those listed above, with a value different from their current value, will result in a 400 Bad Request response. 
   * @param agentId The identifier of the agent to operate on. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  (optional
   * @param endpointAgentUpdate Fields to modify on the agent (optional)
   * @return ApiResponse&lt;EndpointAgent&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EndpointAgent> updateEndpointAgentWithHttpInfo(UUID agentId, String aid, List<Expand> expand, EndpointAgentUpdate endpointAgentUpdate) throws ApiException {
    updateEndpointAgentValidateRequest(agentId);

    var requestBuilder = updateEndpointAgentRequestBuilder(agentId, aid, expand, endpointAgentUpdate);

    return apiClient.send(requestBuilder.build(), EndpointAgent.class);
  }

  private void updateEndpointAgentValidateRequest(UUID agentId) throws ApiException {
      // verify the required parameter 'agentId' is set
      if (agentId == null) {
        throw new ApiException(400, "Missing the required parameter 'agentId' when calling updateEndpointAgent");
      }
  }

  private ApiRequest.ApiRequestBuilder updateEndpointAgentRequestBuilder(UUID agentId, String aid, List<Expand> expand, EndpointAgentUpdate endpointAgentUpdate) throws ApiException {
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
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(endpointAgentUpdate);
    return requestBuilder;
  }
}
