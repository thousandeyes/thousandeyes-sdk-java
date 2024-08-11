/*
 * Agents API
 *  ## Overview Manage all agents available to your account in ThousandEyes, including both Cloud and Enterprise Agents.
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.sdk.agents;

import static com.thousandeyes.sdk.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.sdk.client.RequestUtil.urlEncode;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.ApiResponse;
import com.thousandeyes.sdk.client.ApiRequest;
import com.thousandeyes.sdk.utils.Config;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.sdk.agents.model.AgentClusterAssignRequest;
import com.thousandeyes.sdk.agents.model.AgentClusterUnassignRequest;
import com.thousandeyes.sdk.agents.model.AgentDetails;
import com.thousandeyes.sdk.agents.model.AgentDetailsExpand;
import com.thousandeyes.sdk.agents.model.CloudEnterpriseAgents;
import com.thousandeyes.sdk.agents.model.Error;
import com.thousandeyes.sdk.agents.model.UnauthorizedError;
import com.thousandeyes.sdk.agents.model.ValidationError;

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
public class EnterpriseAgentClusterApi {
  private final ApiClient apiClient;

  public EnterpriseAgentClusterApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Add member to Enterprise Agent cluster
   * Adding a member to an Enterprise Agent cluster converts a standalone Enterprise Agent to an Enterprise Agent cluster. If the agent represented by the path {agentId} is not already a cluster, it will be converted to a cluster.  The response will be a single Enterprise Agent Cluster. The converted Enterprise Agents will become cluster members, and can be returned using the &#x60;?expand&#x3D;cluster-member&#x60; parameter.  This endpoint requires users to have the &#x60;Edit agents in account group&#x60; permission.  Upon successful cluster creation, the response includes:  * Information about the new cluster in the response body.  * Each cluster member receives a unique &#x60;memberId&#x60; within the cluster.  * The &#x60;memberId&#x60; value is not linked to the original &#x60;agentId&#x60; used in the request URL or POST body.  * The cluster name is based on the agent whose &#x60;agentId&#x60; is present in the request URL.  **Example - converting a single agent** &#x60;&#x60;&#x60; curl -X POST https://api.thousandeyes.com/v7/agents/64965/cluster/assign  -H \&quot;Authorization: Bearer $Bearer_token\&quot;  &#x60;&#x60;&#x60;&#x60;  **Example - converting multiple agents** &#x60;&#x60;&#x60; curl https://api.thousandeyes.com/v7/agents/64965/cluster/assign \\ &#39;{\&quot;agents\&quot;:[   \&quot;2277\&quot;,   \&quot;1234\&quot; ]}&#39; \\ -H \&quot;content-type:application/json\&quot; \\ -H \&quot;Authorization: Bearer $Bearer_token\&quot;  &#x60;&#x60;&#x60;&#x60;
   * @param agentId Unique ID for the Enterprise Agent cluster to add new agents to. (required)
   * @param agentClusterAssignRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter, off by default. Indicates which agent sub-resource to expand. For example, if you wish to expand the &#x60;clusterMembers&#x60; sub-resource, pass the &#x60;?expand&#x3D;cluster-member&#x60; query. (optional
   * @return AgentDetails
   * @throws ApiException if fails to make API call
   */
  public AgentDetails assignAgentToCluster(String agentId, AgentClusterAssignRequest agentClusterAssignRequest, String aid, List<AgentDetailsExpand> expand) throws ApiException {
    ApiResponse<AgentDetails> response = assignAgentToClusterWithHttpInfo(agentId, agentClusterAssignRequest, aid, expand);
    return response.getData();
  }

  /**
   * Add member to Enterprise Agent cluster
   * Adding a member to an Enterprise Agent cluster converts a standalone Enterprise Agent to an Enterprise Agent cluster. If the agent represented by the path {agentId} is not already a cluster, it will be converted to a cluster.  The response will be a single Enterprise Agent Cluster. The converted Enterprise Agents will become cluster members, and can be returned using the &#x60;?expand&#x3D;cluster-member&#x60; parameter.  This endpoint requires users to have the &#x60;Edit agents in account group&#x60; permission.  Upon successful cluster creation, the response includes:  * Information about the new cluster in the response body.  * Each cluster member receives a unique &#x60;memberId&#x60; within the cluster.  * The &#x60;memberId&#x60; value is not linked to the original &#x60;agentId&#x60; used in the request URL or POST body.  * The cluster name is based on the agent whose &#x60;agentId&#x60; is present in the request URL.  **Example - converting a single agent** &#x60;&#x60;&#x60; curl -X POST https://api.thousandeyes.com/v7/agents/64965/cluster/assign  -H \&quot;Authorization: Bearer $Bearer_token\&quot;  &#x60;&#x60;&#x60;&#x60;  **Example - converting multiple agents** &#x60;&#x60;&#x60; curl https://api.thousandeyes.com/v7/agents/64965/cluster/assign \\ &#39;{\&quot;agents\&quot;:[   \&quot;2277\&quot;,   \&quot;1234\&quot; ]}&#39; \\ -H \&quot;content-type:application/json\&quot; \\ -H \&quot;Authorization: Bearer $Bearer_token\&quot;  &#x60;&#x60;&#x60;&#x60;
   * @param agentId Unique ID for the Enterprise Agent cluster to add new agents to. (required)
   * @param agentClusterAssignRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter, off by default. Indicates which agent sub-resource to expand. For example, if you wish to expand the &#x60;clusterMembers&#x60; sub-resource, pass the &#x60;?expand&#x3D;cluster-member&#x60; query. (optional
   * @return ApiResponse&lt;AgentDetails&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AgentDetails> assignAgentToClusterWithHttpInfo(String agentId, AgentClusterAssignRequest agentClusterAssignRequest, String aid, List<AgentDetailsExpand> expand) throws ApiException {
    assignAgentToClusterValidateRequest(agentId, agentClusterAssignRequest);

    var requestBuilder = assignAgentToClusterRequestBuilder(agentId, agentClusterAssignRequest, aid, expand);

    return apiClient.send(requestBuilder.build(), AgentDetails.class);
  }

  private void assignAgentToClusterValidateRequest(String agentId, AgentClusterAssignRequest agentClusterAssignRequest) throws ApiException {
      // verify the required parameter 'agentId' is set
      if (agentId == null) {
        throw new ApiException(400, "Missing the required parameter 'agentId' when calling assignAgentToCluster");
      }
      // verify the required parameter 'agentClusterAssignRequest' is set
      if (agentClusterAssignRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'agentClusterAssignRequest' when calling assignAgentToCluster");
      }
  }

  private ApiRequest.ApiRequestBuilder assignAgentToClusterRequestBuilder(String agentId, AgentClusterAssignRequest agentClusterAssignRequest, String aid, List<AgentDetailsExpand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/agents/{agentId}/cluster/assign"
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
    requestBuilder.requestBody(agentClusterAssignRequest);
    return requestBuilder;
  }
  /**
   * Remove member from Enterprise Agent cluster
   * Converts a cluster with a single or multiple Enterprise Agent members back to a standalone Enterprise Agent(s). This endpoint can also be used to remove one or more members from an Enterprise Agent cluster. Removed members revert to being standalone Enterprise Agents. If all members are removed from the cluster, the Enterprise Agent Cluster is deleted.  The response is an list of agents, containing both the Enterprise Agent Cluster (if it still exists), and the removed members, now as standalone Enterprise Agents. This endpoint is exclusive to Enterprise Agent clusters and can be accessed only by users with the &#x60;Edit agents in account group&#x60; permission.  On successful completion, the response contains the following information:  * The updated cluster information is provided in the response body, unless all members are removed from the cluster.  * Information about each removed member, now a standalone agent.  * When a non-last member is removed from the cluster, it receives a new &#x60;agentId&#x60; value. This new &#x60;agentId&#x60; is different from the &#x60;agentId&#x60; the agent had before joining the cluster, and it is also unrelated to the &#x60;memberId&#x60; value the agent had while being a part of the cluster.  * If all members are removed from the cluster, the cluster itself is converted back to a standalone Enterprise Agent too. Such standalone agent inherits the old cluster’s &#x60;agentId&#x60; value. The last &#x60;memberId&#x60; listed in the POST body inherits the cluster’s &#x60;agentId&#x60; value.  **Example - removing a single member** &#x60;&#x60;&#x60; curl -X POST https://api.thousandeyes.com/v7/agents/64965/cluster/unassign   \\ &#39;{\&quot;members\&quot;:[\&quot;55974\&quot;]}&#39; \\ -H \&quot;content-type:application/json\&quot; \\ -H \&quot;Authorization: Bearer $Bearer_token\&quot;  &#x60;&#x60;&#x60;  **Example - removing multiple members** &#x60;&#x60;&#x60; curl https://api.thousandeyes.com/v7/agents/64965/cluster/unassign \\ &#39;{\&quot;members\&quot;:[     \&quot;55974\&quot;,     \&quot;12313\&quot;]  }&#39; \\ -H \&quot;content-type:application/json\&quot; \\ -H \&quot;Authorization: Bearer $Bearer_token\&quot;  &#x60;&#x60;&#x60;
   * @param agentId Unique ID for the Enterprise Agent cluster to remove agents from. (required)
   * @param agentClusterUnassignRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter, off by default. Indicates which agent sub-resource to expand. For example, if you wish to expand the &#x60;clusterMembers&#x60; sub-resource, pass the &#x60;?expand&#x3D;cluster-member&#x60; query. (optional
   * @return CloudEnterpriseAgents
   * @throws ApiException if fails to make API call
   */
  public CloudEnterpriseAgents unassignAgentFromCluster(String agentId, AgentClusterUnassignRequest agentClusterUnassignRequest, String aid, List<AgentDetailsExpand> expand) throws ApiException {
    ApiResponse<CloudEnterpriseAgents> response = unassignAgentFromClusterWithHttpInfo(agentId, agentClusterUnassignRequest, aid, expand);
    return response.getData();
  }

  /**
   * Remove member from Enterprise Agent cluster
   * Converts a cluster with a single or multiple Enterprise Agent members back to a standalone Enterprise Agent(s). This endpoint can also be used to remove one or more members from an Enterprise Agent cluster. Removed members revert to being standalone Enterprise Agents. If all members are removed from the cluster, the Enterprise Agent Cluster is deleted.  The response is an list of agents, containing both the Enterprise Agent Cluster (if it still exists), and the removed members, now as standalone Enterprise Agents. This endpoint is exclusive to Enterprise Agent clusters and can be accessed only by users with the &#x60;Edit agents in account group&#x60; permission.  On successful completion, the response contains the following information:  * The updated cluster information is provided in the response body, unless all members are removed from the cluster.  * Information about each removed member, now a standalone agent.  * When a non-last member is removed from the cluster, it receives a new &#x60;agentId&#x60; value. This new &#x60;agentId&#x60; is different from the &#x60;agentId&#x60; the agent had before joining the cluster, and it is also unrelated to the &#x60;memberId&#x60; value the agent had while being a part of the cluster.  * If all members are removed from the cluster, the cluster itself is converted back to a standalone Enterprise Agent too. Such standalone agent inherits the old cluster’s &#x60;agentId&#x60; value. The last &#x60;memberId&#x60; listed in the POST body inherits the cluster’s &#x60;agentId&#x60; value.  **Example - removing a single member** &#x60;&#x60;&#x60; curl -X POST https://api.thousandeyes.com/v7/agents/64965/cluster/unassign   \\ &#39;{\&quot;members\&quot;:[\&quot;55974\&quot;]}&#39; \\ -H \&quot;content-type:application/json\&quot; \\ -H \&quot;Authorization: Bearer $Bearer_token\&quot;  &#x60;&#x60;&#x60;  **Example - removing multiple members** &#x60;&#x60;&#x60; curl https://api.thousandeyes.com/v7/agents/64965/cluster/unassign \\ &#39;{\&quot;members\&quot;:[     \&quot;55974\&quot;,     \&quot;12313\&quot;]  }&#39; \\ -H \&quot;content-type:application/json\&quot; \\ -H \&quot;Authorization: Bearer $Bearer_token\&quot;  &#x60;&#x60;&#x60;
   * @param agentId Unique ID for the Enterprise Agent cluster to remove agents from. (required)
   * @param agentClusterUnassignRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter, off by default. Indicates which agent sub-resource to expand. For example, if you wish to expand the &#x60;clusterMembers&#x60; sub-resource, pass the &#x60;?expand&#x3D;cluster-member&#x60; query. (optional
   * @return ApiResponse&lt;CloudEnterpriseAgents&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CloudEnterpriseAgents> unassignAgentFromClusterWithHttpInfo(String agentId, AgentClusterUnassignRequest agentClusterUnassignRequest, String aid, List<AgentDetailsExpand> expand) throws ApiException {
    unassignAgentFromClusterValidateRequest(agentId, agentClusterUnassignRequest);

    var requestBuilder = unassignAgentFromClusterRequestBuilder(agentId, agentClusterUnassignRequest, aid, expand);

    return apiClient.send(requestBuilder.build(), CloudEnterpriseAgents.class);
  }

  private void unassignAgentFromClusterValidateRequest(String agentId, AgentClusterUnassignRequest agentClusterUnassignRequest) throws ApiException {
      // verify the required parameter 'agentId' is set
      if (agentId == null) {
        throw new ApiException(400, "Missing the required parameter 'agentId' when calling unassignAgentFromCluster");
      }
      // verify the required parameter 'agentClusterUnassignRequest' is set
      if (agentClusterUnassignRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'agentClusterUnassignRequest' when calling unassignAgentFromCluster");
      }
  }

  private ApiRequest.ApiRequestBuilder unassignAgentFromClusterRequestBuilder(String agentId, AgentClusterUnassignRequest agentClusterUnassignRequest, String aid, List<AgentDetailsExpand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/agents/{agentId}/cluster/unassign"
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
    requestBuilder.requestBody(agentClusterUnassignRequest);
    return requestBuilder;
  }
}
