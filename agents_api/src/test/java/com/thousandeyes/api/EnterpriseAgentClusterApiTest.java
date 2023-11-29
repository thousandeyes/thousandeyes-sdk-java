/*
 * Agents API
 *  ## Overview Manage all agents available to your account in ThousandEyes, including both Cloud and Enterprise Agents.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api;

import com.thousandeyes.ApiException;
import com.thousandeyes.api.model.AgentDetailsExpand;
import com.thousandeyes.api.model.AssignEnterpriseAgentClusterRequest;
import com.thousandeyes.api.model.Error;
import com.thousandeyes.api.model.GetAgentDetails200Response;
import com.thousandeyes.api.model.GetAgents200Response;
import com.thousandeyes.api.model.UnassignEnterpriseAgentFromClusterRequest;
import com.thousandeyes.api.model.UnauthorizedError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EnterpriseAgentClusterApi
 */
@Disabled
public class EnterpriseAgentClusterApiTest {

    private final EnterpriseAgentClusterApi api = new EnterpriseAgentClusterApi();

    /**
     * Add member to Enterprise Agent cluster
     *
     * Adding a member to an Enterprise Agent cluster converts a standalone Enterprise Agent to an Enterprise Agent cluster. If the agent represented by the path {agentId} is not already a cluster, it will be converted to a cluster.  The response will be a single Enterprise Agent Cluster. The converted Enterprise Agents will become cluster members, and can be returned using the &#x60;?expand&#x3D;cluster-member&#x60; parameter.  This endpoint requires users to have the &#x60;Edit agents in account group&#x60; permission.  Upon successful cluster creation, the response includes:  * Information about the new cluster in the response body.  * Each cluster member receives a unique &#x60;memberId&#x60; within the cluster.  * The &#x60;memberId&#x60; value is not linked to the original &#x60;agentId&#x60; used in the request URL or POST body.  * The cluster name is based on the agent whose &#x60;agentId&#x60; is present in the request URL.  **Example - converting a single agent** &#x60;&#x60;&#x60; curl -X POST https://api.thousandeyes.com/v7/agents/64965/cluster/assign  -H \&quot;Authorization: Bearer $Bearer_token\&quot;  &#x60;&#x60;&#x60;&#x60;  **Example - converting multiple agents** &#x60;&#x60;&#x60; curl https://api.thousandeyes.com/v7/agents/64965/cluster/assign \\ &#39;{\&quot;agents\&quot;:[   \&quot;2277\&quot;,   \&quot;1234\&quot; ]}&#39; \\ -H \&quot;content-type:application/json\&quot; \\ -H \&quot;Authorization: Bearer $Bearer_token\&quot;  &#x60;&#x60;&#x60;&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assignEnterpriseAgentClusterTest() throws ApiException {
        String agentId = null;
        AssignEnterpriseAgentClusterRequest assignEnterpriseAgentClusterRequest = null;
        String aid = null;
        List<AgentDetailsExpand> expand = null;
        GetAgentDetails200Response response = api.assignEnterpriseAgentCluster(agentId, assignEnterpriseAgentClusterRequest, aid, expand);
        // TODO: test validations
    }

    /**
     * Remove member from Enterprise Agent cluster
     *
     * Converts a cluster with a single or multiple Enterprise Agent members back to a standalone Enterprise Agent(s). This endpoint can also be used to remove one or more members from an Enterprise Agent cluster. Removed members revert to being standalone Enterprise Agents. If all members are removed from the cluster, the Enterprise Agent Cluster is deleted.  The response is an list of agents, containing both the Enterprise Agent Cluster (if it still exists), and the removed members, now as standalone Enterprise Agents. This endpoint is exclusive to Enterprise Agent clusters and can be accessed only by users with the &#x60;Edit agents in account group&#x60; permission.  On successful completion, the response contains the following information:  * The updated cluster information is provided in the response body, unless all members are removed from the cluster.  * Information about each removed member, now a standalone agent.  * When a non-last member is removed from the cluster, it receives a new &#x60;agentId&#x60; value. This new &#x60;agentId&#x60; is different from the &#x60;agentId&#x60; the agent had before joining the cluster, and it is also unrelated to the &#x60;memberId&#x60; value the agent had while being a part of the cluster.  * If all members are removed from the cluster, the cluster itself is converted back to a standalone Enterprise Agent too. Such standalone agent inherits the old cluster’s &#x60;agentId&#x60; value. The last &#x60;memberId&#x60; listed in the POST body inherits the cluster’s &#x60;agentId&#x60; value.  **Example - removing a single member** &#x60;&#x60;&#x60; curl -X POST https://api.thousandeyes.com/v7/agents/64965/cluster/unassign   \\ &#39;{\&quot;members\&quot;:[\&quot;55974\&quot;]}&#39; \\ -H \&quot;content-type:application/json\&quot; \\ -H \&quot;Authorization: Bearer $Bearer_token\&quot;  &#x60;&#x60;&#x60;  **Example - removing multiple members** &#x60;&#x60;&#x60; curl https://api.thousandeyes.com/v7/agents/64965/cluster/unassign \\ &#39;{\&quot;members\&quot;:[     \&quot;55974\&quot;,     \&quot;12313\&quot;]  }&#39; \\ -H \&quot;content-type:application/json\&quot; \\ -H \&quot;Authorization: Bearer $Bearer_token\&quot;  &#x60;&#x60;&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unassignEnterpriseAgentFromClusterTest() throws ApiException {
        String agentId = null;
        UnassignEnterpriseAgentFromClusterRequest unassignEnterpriseAgentFromClusterRequest = null;
        String aid = null;
        List<AgentDetailsExpand> expand = null;
        GetAgents200Response response = api.unassignEnterpriseAgentFromCluster(agentId, unassignEnterpriseAgentFromClusterRequest, aid, expand);
        // TODO: test validations
    }

}
