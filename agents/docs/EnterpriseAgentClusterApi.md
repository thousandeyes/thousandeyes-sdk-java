# EnterpriseAgentClusterApi

All URIs are relative to *https://api.thousandeyes.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignAgentToCluster**](EnterpriseAgentClusterApi.md#assignAgentToCluster) | **POST** /v7/agents/{agentId}/cluster/assign | Add member to Enterprise Agent cluster |
| [**assignAgentToClusterWithHttpInfo**](EnterpriseAgentClusterApi.md#assignAgentToClusterWithHttpInfo) | **POST** /v7/agents/{agentId}/cluster/assign | Add member to Enterprise Agent cluster |
| [**unassignAgentFromCluster**](EnterpriseAgentClusterApi.md#unassignAgentFromCluster) | **POST** /v7/agents/{agentId}/cluster/unassign | Remove member from Enterprise Agent cluster |
| [**unassignAgentFromClusterWithHttpInfo**](EnterpriseAgentClusterApi.md#unassignAgentFromClusterWithHttpInfo) | **POST** /v7/agents/{agentId}/cluster/unassign | Remove member from Enterprise Agent cluster |



## assignAgentToCluster

> AgentDetails assignAgentToCluster(agentId, agentClusterAssignRequest, aid, expand)

Add member to Enterprise Agent cluster

Adding a member to an Enterprise Agent cluster converts a standalone Enterprise Agent to an Enterprise Agent cluster. If the agent represented by the path {agentId} is not already a cluster, it will be converted to a cluster.  The response will be a single Enterprise Agent Cluster. The converted Enterprise Agents will become cluster members, and can be returned using the &#x60;?expand&#x3D;cluster-member&#x60; parameter.  This endpoint requires users to have the &#x60;Edit agents in account group&#x60; permission.  Upon successful cluster creation, the response includes:  * Information about the new cluster in the response body.  * Each cluster member receives a unique &#x60;memberId&#x60; within the cluster.  * The &#x60;memberId&#x60; value is not linked to the original &#x60;agentId&#x60; used in the request URL or POST body.  * The cluster name is based on the agent whose &#x60;agentId&#x60; is present in the request URL.  **Example - converting a single agent** &#x60;&#x60;&#x60; curl -X POST https://api.thousandeyes.com/v7/agents/64965/cluster/assign  -H \&quot;Authorization: Bearer $Bearer_token\&quot;  &#x60;&#x60;&#x60;&#x60;  **Example - converting multiple agents** &#x60;&#x60;&#x60; curl https://api.thousandeyes.com/v7/agents/64965/cluster/assign \\ &#39;{\&quot;agents\&quot;:[   \&quot;2277\&quot;,   \&quot;1234\&quot; ]}&#39; \\ -H \&quot;content-type:application/json\&quot; \\ -H \&quot;Authorization: Bearer $Bearer_token\&quot;  &#x60;&#x60;&#x60;&#x60;

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.agents.EnterpriseAgentClusterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EnterpriseAgentClusterApi apiInstance = new EnterpriseAgentClusterApi(defaultClient);
        String agentId = "281474976710706"; // String | Unique ID for the Enterprise Agent cluster to add new agents to.
        AgentClusterAssignRequest agentClusterAssignRequest = new AgentClusterAssignRequest(); // AgentClusterAssignRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<AgentDetailsExpand> expand = Arrays.asList(); // List<AgentDetailsExpand> | Optional parameter, off by default. Indicates which agent sub-resource to expand. For example, if you wish to expand the `clusterMembers` sub-resource, pass the `?expand=cluster-member` query.
        try {
            AgentDetails result = apiInstance.assignAgentToCluster(agentId, agentClusterAssignRequest, aid, expand);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EnterpriseAgentClusterApi#assignAgentToCluster");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentId** | **String**| Unique ID for the Enterprise Agent cluster to add new agents to. | |
| **agentClusterAssignRequest** | [**AgentClusterAssignRequest**](AgentClusterAssignRequest.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;AgentDetailsExpand&gt;**](AgentDetailsExpand.md)| Optional parameter, off by default. Indicates which agent sub-resource to expand. For example, if you wish to expand the &#x60;clusterMembers&#x60; sub-resource, pass the &#x60;?expand&#x3D;cluster-member&#x60; query. | [optional] |

### Return type

[**AgentDetails**](AgentDetails.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |

## assignAgentToClusterWithHttpInfo

> ApiResponse<AgentDetails> assignAgentToCluster assignAgentToClusterWithHttpInfo(agentId, agentClusterAssignRequest, aid, expand)

Add member to Enterprise Agent cluster

Adding a member to an Enterprise Agent cluster converts a standalone Enterprise Agent to an Enterprise Agent cluster. If the agent represented by the path {agentId} is not already a cluster, it will be converted to a cluster.  The response will be a single Enterprise Agent Cluster. The converted Enterprise Agents will become cluster members, and can be returned using the &#x60;?expand&#x3D;cluster-member&#x60; parameter.  This endpoint requires users to have the &#x60;Edit agents in account group&#x60; permission.  Upon successful cluster creation, the response includes:  * Information about the new cluster in the response body.  * Each cluster member receives a unique &#x60;memberId&#x60; within the cluster.  * The &#x60;memberId&#x60; value is not linked to the original &#x60;agentId&#x60; used in the request URL or POST body.  * The cluster name is based on the agent whose &#x60;agentId&#x60; is present in the request URL.  **Example - converting a single agent** &#x60;&#x60;&#x60; curl -X POST https://api.thousandeyes.com/v7/agents/64965/cluster/assign  -H \&quot;Authorization: Bearer $Bearer_token\&quot;  &#x60;&#x60;&#x60;&#x60;  **Example - converting multiple agents** &#x60;&#x60;&#x60; curl https://api.thousandeyes.com/v7/agents/64965/cluster/assign \\ &#39;{\&quot;agents\&quot;:[   \&quot;2277\&quot;,   \&quot;1234\&quot; ]}&#39; \\ -H \&quot;content-type:application/json\&quot; \\ -H \&quot;Authorization: Bearer $Bearer_token\&quot;  &#x60;&#x60;&#x60;&#x60;

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.agents.EnterpriseAgentClusterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EnterpriseAgentClusterApi apiInstance = new EnterpriseAgentClusterApi(defaultClient);
        String agentId = "281474976710706"; // String | Unique ID for the Enterprise Agent cluster to add new agents to.
        AgentClusterAssignRequest agentClusterAssignRequest = new AgentClusterAssignRequest(); // AgentClusterAssignRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<AgentDetailsExpand> expand = Arrays.asList(); // List<AgentDetailsExpand> | Optional parameter, off by default. Indicates which agent sub-resource to expand. For example, if you wish to expand the `clusterMembers` sub-resource, pass the `?expand=cluster-member` query.
        try {
            ApiResponse<AgentDetails> response = apiInstance.assignAgentToClusterWithHttpInfo(agentId, agentClusterAssignRequest, aid, expand);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EnterpriseAgentClusterApi#assignAgentToCluster");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentId** | **String**| Unique ID for the Enterprise Agent cluster to add new agents to. | |
| **agentClusterAssignRequest** | [**AgentClusterAssignRequest**](AgentClusterAssignRequest.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;AgentDetailsExpand&gt;**](AgentDetailsExpand.md)| Optional parameter, off by default. Indicates which agent sub-resource to expand. For example, if you wish to expand the &#x60;clusterMembers&#x60; sub-resource, pass the &#x60;?expand&#x3D;cluster-member&#x60; query. | [optional] |

### Return type

ApiResponse<[**AgentDetails**](AgentDetails.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |


## unassignAgentFromCluster

> CloudEnterpriseAgents unassignAgentFromCluster(agentId, agentClusterUnassignRequest, aid, expand)

Remove member from Enterprise Agent cluster

Converts a cluster with a single or multiple Enterprise Agent members back to a standalone Enterprise Agent(s). This endpoint can also be used to remove one or more members from an Enterprise Agent cluster. Removed members revert to being standalone Enterprise Agents. If all members are removed from the cluster, the Enterprise Agent Cluster is deleted.  The response is an list of agents, containing both the Enterprise Agent Cluster (if it still exists), and the removed members, now as standalone Enterprise Agents. This endpoint is exclusive to Enterprise Agent clusters and can be accessed only by users with the &#x60;Edit agents in account group&#x60; permission.  On successful completion, the response contains the following information:  * The updated cluster information is provided in the response body, unless all members are removed from the cluster.  * Information about each removed member, now a standalone agent.  * When a non-last member is removed from the cluster, it receives a new &#x60;agentId&#x60; value. This new &#x60;agentId&#x60; is different from the &#x60;agentId&#x60; the agent had before joining the cluster, and it is also unrelated to the &#x60;memberId&#x60; value the agent had while being a part of the cluster.  * If all members are removed from the cluster, the cluster itself is converted back to a standalone Enterprise Agent too. Such standalone agent inherits the old cluster’s &#x60;agentId&#x60; value. The last &#x60;memberId&#x60; listed in the POST body inherits the cluster’s &#x60;agentId&#x60; value.  **Example - removing a single member** &#x60;&#x60;&#x60; curl -X POST https://api.thousandeyes.com/v7/agents/64965/cluster/unassign   \\ &#39;{\&quot;members\&quot;:[\&quot;55974\&quot;]}&#39; \\ -H \&quot;content-type:application/json\&quot; \\ -H \&quot;Authorization: Bearer $Bearer_token\&quot;  &#x60;&#x60;&#x60;  **Example - removing multiple members** &#x60;&#x60;&#x60; curl https://api.thousandeyes.com/v7/agents/64965/cluster/unassign \\ &#39;{\&quot;members\&quot;:[     \&quot;55974\&quot;,     \&quot;12313\&quot;]  }&#39; \\ -H \&quot;content-type:application/json\&quot; \\ -H \&quot;Authorization: Bearer $Bearer_token\&quot;  &#x60;&#x60;&#x60;

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.agents.EnterpriseAgentClusterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EnterpriseAgentClusterApi apiInstance = new EnterpriseAgentClusterApi(defaultClient);
        String agentId = "281474976710706"; // String | Unique ID for the Enterprise Agent cluster to remove agents from.
        AgentClusterUnassignRequest agentClusterUnassignRequest = new AgentClusterUnassignRequest(); // AgentClusterUnassignRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<AgentDetailsExpand> expand = Arrays.asList(); // List<AgentDetailsExpand> | Optional parameter, off by default. Indicates which agent sub-resource to expand. For example, if you wish to expand the `clusterMembers` sub-resource, pass the `?expand=cluster-member` query.
        try {
            CloudEnterpriseAgents result = apiInstance.unassignAgentFromCluster(agentId, agentClusterUnassignRequest, aid, expand);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EnterpriseAgentClusterApi#unassignAgentFromCluster");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentId** | **String**| Unique ID for the Enterprise Agent cluster to remove agents from. | |
| **agentClusterUnassignRequest** | [**AgentClusterUnassignRequest**](AgentClusterUnassignRequest.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;AgentDetailsExpand&gt;**](AgentDetailsExpand.md)| Optional parameter, off by default. Indicates which agent sub-resource to expand. For example, if you wish to expand the &#x60;clusterMembers&#x60; sub-resource, pass the &#x60;?expand&#x3D;cluster-member&#x60; query. | [optional] |

### Return type

[**CloudEnterpriseAgents**](CloudEnterpriseAgents.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |

## unassignAgentFromClusterWithHttpInfo

> ApiResponse<CloudEnterpriseAgents> unassignAgentFromCluster unassignAgentFromClusterWithHttpInfo(agentId, agentClusterUnassignRequest, aid, expand)

Remove member from Enterprise Agent cluster

Converts a cluster with a single or multiple Enterprise Agent members back to a standalone Enterprise Agent(s). This endpoint can also be used to remove one or more members from an Enterprise Agent cluster. Removed members revert to being standalone Enterprise Agents. If all members are removed from the cluster, the Enterprise Agent Cluster is deleted.  The response is an list of agents, containing both the Enterprise Agent Cluster (if it still exists), and the removed members, now as standalone Enterprise Agents. This endpoint is exclusive to Enterprise Agent clusters and can be accessed only by users with the &#x60;Edit agents in account group&#x60; permission.  On successful completion, the response contains the following information:  * The updated cluster information is provided in the response body, unless all members are removed from the cluster.  * Information about each removed member, now a standalone agent.  * When a non-last member is removed from the cluster, it receives a new &#x60;agentId&#x60; value. This new &#x60;agentId&#x60; is different from the &#x60;agentId&#x60; the agent had before joining the cluster, and it is also unrelated to the &#x60;memberId&#x60; value the agent had while being a part of the cluster.  * If all members are removed from the cluster, the cluster itself is converted back to a standalone Enterprise Agent too. Such standalone agent inherits the old cluster’s &#x60;agentId&#x60; value. The last &#x60;memberId&#x60; listed in the POST body inherits the cluster’s &#x60;agentId&#x60; value.  **Example - removing a single member** &#x60;&#x60;&#x60; curl -X POST https://api.thousandeyes.com/v7/agents/64965/cluster/unassign   \\ &#39;{\&quot;members\&quot;:[\&quot;55974\&quot;]}&#39; \\ -H \&quot;content-type:application/json\&quot; \\ -H \&quot;Authorization: Bearer $Bearer_token\&quot;  &#x60;&#x60;&#x60;  **Example - removing multiple members** &#x60;&#x60;&#x60; curl https://api.thousandeyes.com/v7/agents/64965/cluster/unassign \\ &#39;{\&quot;members\&quot;:[     \&quot;55974\&quot;,     \&quot;12313\&quot;]  }&#39; \\ -H \&quot;content-type:application/json\&quot; \\ -H \&quot;Authorization: Bearer $Bearer_token\&quot;  &#x60;&#x60;&#x60;

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.agents.EnterpriseAgentClusterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EnterpriseAgentClusterApi apiInstance = new EnterpriseAgentClusterApi(defaultClient);
        String agentId = "281474976710706"; // String | Unique ID for the Enterprise Agent cluster to remove agents from.
        AgentClusterUnassignRequest agentClusterUnassignRequest = new AgentClusterUnassignRequest(); // AgentClusterUnassignRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<AgentDetailsExpand> expand = Arrays.asList(); // List<AgentDetailsExpand> | Optional parameter, off by default. Indicates which agent sub-resource to expand. For example, if you wish to expand the `clusterMembers` sub-resource, pass the `?expand=cluster-member` query.
        try {
            ApiResponse<CloudEnterpriseAgents> response = apiInstance.unassignAgentFromClusterWithHttpInfo(agentId, agentClusterUnassignRequest, aid, expand);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EnterpriseAgentClusterApi#unassignAgentFromCluster");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agentId** | **String**| Unique ID for the Enterprise Agent cluster to remove agents from. | |
| **agentClusterUnassignRequest** | [**AgentClusterUnassignRequest**](AgentClusterUnassignRequest.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;AgentDetailsExpand&gt;**](AgentDetailsExpand.md)| Optional parameter, off by default. Indicates which agent sub-resource to expand. For example, if you wish to expand the &#x60;clusterMembers&#x60; sub-resource, pass the &#x60;?expand&#x3D;cluster-member&#x60; query. | [optional] |

### Return type

ApiResponse<[**CloudEnterpriseAgents**](CloudEnterpriseAgents.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |

