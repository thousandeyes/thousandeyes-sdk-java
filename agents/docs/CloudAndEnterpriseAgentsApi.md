# CloudAndEnterpriseAgentsApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteAgent**](CloudAndEnterpriseAgentsApi.md#deleteAgent) | **DELETE** /agents/{agentId} | Delete Enterprise Agent |
| [**deleteAgentWithHttpInfo**](CloudAndEnterpriseAgentsApi.md#deleteAgentWithHttpInfo) | **DELETE** /agents/{agentId} | Delete Enterprise Agent |
| [**getAgent**](CloudAndEnterpriseAgentsApi.md#getAgent) | **GET** /agents/{agentId} | Retrieve Cloud and Enterprise Agent |
| [**getAgentWithHttpInfo**](CloudAndEnterpriseAgentsApi.md#getAgentWithHttpInfo) | **GET** /agents/{agentId} | Retrieve Cloud and Enterprise Agent |
| [**getAgents**](CloudAndEnterpriseAgentsApi.md#getAgents) | **GET** /agents | List Cloud and Enterprise Agents |
| [**getAgentsWithHttpInfo**](CloudAndEnterpriseAgentsApi.md#getAgentsWithHttpInfo) | **GET** /agents | List Cloud and Enterprise Agents |
| [**updateAgent**](CloudAndEnterpriseAgentsApi.md#updateAgent) | **PUT** /agents/{agentId} | Update Enterprise Agent |
| [**updateAgentWithHttpInfo**](CloudAndEnterpriseAgentsApi.md#updateAgentWithHttpInfo) | **PUT** /agents/{agentId} | Update Enterprise Agent |



## deleteAgent

> void deleteAgent(agentId, aid)

Delete Enterprise Agent

Deletes an Enterprise Agent.  Important notes related to agent removal: * If an agent is deleted, the modification date for tests using that agent at the time it was deleted will be changed. * If a deleted agent is the final remaining agent on a test, then the test will be disabled when the agent is removed. * If an agent is removed, it must be re-initialized to use the same machine again in different context. Virtual Appliances can be updated using the Reset State button in the Advanced tab of the agent management interface. Users running packaged versions of Linux will need to remove /var/lib/te-agent/\\*.sqlite in order to reinitialize an agent.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.agents.CloudAndEnterpriseAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudAndEnterpriseAgentsApi apiInstance = new CloudAndEnterpriseAgentsApi(defaultClient);
        String agentId = "281474976710706"; // String | Unique ID for the agent.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            apiInstance.deleteAgent(agentId, aid);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudAndEnterpriseAgentsApi#deleteAgent");
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
| **agentId** | **String**| Unique ID for the agent. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type


null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |

## deleteAgentWithHttpInfo

> ApiResponse<Void> deleteAgent deleteAgentWithHttpInfo(agentId, aid)

Delete Enterprise Agent

Deletes an Enterprise Agent.  Important notes related to agent removal: * If an agent is deleted, the modification date for tests using that agent at the time it was deleted will be changed. * If a deleted agent is the final remaining agent on a test, then the test will be disabled when the agent is removed. * If an agent is removed, it must be re-initialized to use the same machine again in different context. Virtual Appliances can be updated using the Reset State button in the Advanced tab of the agent management interface. Users running packaged versions of Linux will need to remove /var/lib/te-agent/\\*.sqlite in order to reinitialize an agent.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.agents.CloudAndEnterpriseAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudAndEnterpriseAgentsApi apiInstance = new CloudAndEnterpriseAgentsApi(defaultClient);
        String agentId = "281474976710706"; // String | Unique ID for the agent.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiResponse<Void> response = apiInstance.deleteAgentWithHttpInfo(agentId, aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudAndEnterpriseAgentsApi#deleteAgent");
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
| **agentId** | **String**| Unique ID for the agent. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |


## getAgent

> AgentDetails getAgent(agentId, aid, expand)

Retrieve Cloud and Enterprise Agent

Returns details for an agent, including assigned tests.  For Enterprise Agents, this operation returns additional details, including utilization data, assigned accounts, a list of account groups the agent is assigned to, and utilization details. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.agents.CloudAndEnterpriseAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudAndEnterpriseAgentsApi apiInstance = new CloudAndEnterpriseAgentsApi(defaultClient);
        String agentId = "281474976710706"; // String | Unique ID for the agent.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<AgentDetailsExpand> expand = Arrays.asList(); // List<AgentDetailsExpand> | Optional parameter, off by default. Indicates which agent sub-resource to expand. For example, if you wish to expand the `clusterMembers` sub-resource, pass the `?expand=cluster-member` query.
        try {
            AgentDetails result = apiInstance.getAgent(agentId, aid, expand);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudAndEnterpriseAgentsApi#getAgent");
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
| **agentId** | **String**| Unique ID for the agent. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;AgentDetailsExpand&gt;**](AgentDetailsExpand.md)| Optional parameter, off by default. Indicates which agent sub-resource to expand. For example, if you wish to expand the &#x60;clusterMembers&#x60; sub-resource, pass the &#x60;?expand&#x3D;cluster-member&#x60; query. | [optional] |

### Return type

[**AgentDetails**](AgentDetails.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |

## getAgentWithHttpInfo

> ApiResponse<AgentDetails> getAgent getAgentWithHttpInfo(agentId, aid, expand)

Retrieve Cloud and Enterprise Agent

Returns details for an agent, including assigned tests.  For Enterprise Agents, this operation returns additional details, including utilization data, assigned accounts, a list of account groups the agent is assigned to, and utilization details. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.agents.CloudAndEnterpriseAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudAndEnterpriseAgentsApi apiInstance = new CloudAndEnterpriseAgentsApi(defaultClient);
        String agentId = "281474976710706"; // String | Unique ID for the agent.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<AgentDetailsExpand> expand = Arrays.asList(); // List<AgentDetailsExpand> | Optional parameter, off by default. Indicates which agent sub-resource to expand. For example, if you wish to expand the `clusterMembers` sub-resource, pass the `?expand=cluster-member` query.
        try {
            ApiResponse<AgentDetails> response = apiInstance.getAgentWithHttpInfo(agentId, aid, expand);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudAndEnterpriseAgentsApi#getAgent");
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
| **agentId** | **String**| Unique ID for the agent. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;AgentDetailsExpand&gt;**](AgentDetailsExpand.md)| Optional parameter, off by default. Indicates which agent sub-resource to expand. For example, if you wish to expand the &#x60;clusterMembers&#x60; sub-resource, pass the &#x60;?expand&#x3D;cluster-member&#x60; query. | [optional] |

### Return type

ApiResponse<[**AgentDetails**](AgentDetails.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |


## getAgents

> CloudEnterpriseAgents getAgents(aid, expand, agentTypes, labels)

List Cloud and Enterprise Agents

List the Cloud and Enterprise Agents available to your account in ThousandEyes.  If an agent is an Enterprise Agent, this operation returns the agent’s public and private IP addresses, as well as the public network where the agent is located. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.agents.CloudAndEnterpriseAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudAndEnterpriseAgentsApi apiInstance = new CloudAndEnterpriseAgentsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<AgentListExpand> expand = Arrays.asList(); // List<AgentListExpand> | Optional parameter, off by default. Indicates which agent sub-resource to expand. For example, if you wish to expand the `clusterMembers` sub-resource, pass the `?expand=cluster-member` query.
        List<CloudEnterpriseAgentType> agentTypes = Arrays.asList(); // List<CloudEnterpriseAgentType> | Specifies the type of agent to request.
        List<String> labels = Arrays.asList(); // List<String> | Specifies the labels of the agents to request.
        try {
            CloudEnterpriseAgents result = apiInstance.getAgents(aid, expand, agentTypes, labels);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudAndEnterpriseAgentsApi#getAgents");
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
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;AgentListExpand&gt;**](AgentListExpand.md)| Optional parameter, off by default. Indicates which agent sub-resource to expand. For example, if you wish to expand the &#x60;clusterMembers&#x60; sub-resource, pass the &#x60;?expand&#x3D;cluster-member&#x60; query. | [optional] |
| **agentTypes** | [**List&lt;CloudEnterpriseAgentType&gt;**](CloudEnterpriseAgentType.md)| Specifies the type of agent to request. | [optional] |
| **labels** | [**List&lt;String&gt;**](String.md)| Specifies the labels of the agents to request. | [optional] |

### Return type

[**CloudEnterpriseAgents**](CloudEnterpriseAgents.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |

## getAgentsWithHttpInfo

> ApiResponse<CloudEnterpriseAgents> getAgents getAgentsWithHttpInfo(aid, expand, agentTypes, labels)

List Cloud and Enterprise Agents

List the Cloud and Enterprise Agents available to your account in ThousandEyes.  If an agent is an Enterprise Agent, this operation returns the agent’s public and private IP addresses, as well as the public network where the agent is located. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.agents.CloudAndEnterpriseAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudAndEnterpriseAgentsApi apiInstance = new CloudAndEnterpriseAgentsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<AgentListExpand> expand = Arrays.asList(); // List<AgentListExpand> | Optional parameter, off by default. Indicates which agent sub-resource to expand. For example, if you wish to expand the `clusterMembers` sub-resource, pass the `?expand=cluster-member` query.
        List<CloudEnterpriseAgentType> agentTypes = Arrays.asList(); // List<CloudEnterpriseAgentType> | Specifies the type of agent to request.
        List<String> labels = Arrays.asList(); // List<String> | Specifies the labels of the agents to request.
        try {
            ApiResponse<CloudEnterpriseAgents> response = apiInstance.getAgentsWithHttpInfo(aid, expand, agentTypes, labels);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudAndEnterpriseAgentsApi#getAgents");
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
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;AgentListExpand&gt;**](AgentListExpand.md)| Optional parameter, off by default. Indicates which agent sub-resource to expand. For example, if you wish to expand the &#x60;clusterMembers&#x60; sub-resource, pass the &#x60;?expand&#x3D;cluster-member&#x60; query. | [optional] |
| **agentTypes** | [**List&lt;CloudEnterpriseAgentType&gt;**](CloudEnterpriseAgentType.md)| Specifies the type of agent to request. | [optional] |
| **labels** | [**List&lt;String&gt;**](String.md)| Specifies the labels of the agents to request. | [optional] |

### Return type

ApiResponse<[**CloudEnterpriseAgents**](CloudEnterpriseAgents.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |


## updateAgent

> AgentDetails updateAgent(agentId, agentRequest, aid, expand)

Update Enterprise Agent

Updates details for an Enterprise Agent. This operation can only be used for Enterprise Agents, and only for users in a role that permits modification of Enterprise Agents.  Important notes related to agent modification on tests: * if an agent is removed from a test, the modification date for tests using that agent at the time it was removed will be changed. * If an agent is removed from an entire account group, then all tests using this agent in the removed account group will be updated to reflect the removed agent. * If a removed agent is the final remaining agent on a test, then the test will be disabled when the agent is removed.  Users can update the following fields: * &#x60;agentName&#x60;: String representation of an agent. No two agents can have the same display name. * &#x60;enabled&#x60;: Boolean representation of agent state. * &#x60;accountGroups&#x60;: An array of account group ids. See &#x60;v7/account-groups&#x60; to pull a list of account IDs. * &#x60;tests&#x60;: An array of test Is. See &#x60;v7/tests&#x60; to retrieve a list tests available in the current account context. * &#x60;ipv6Policy&#x60;: Enum representation of the IP version policy. * &#x60;keepBrowserCache&#x60;: Boolean representation of the Keep browser cache state. * &#x60;targetForTests&#x60;: String representation of the target IP address or domain name. This represents the test destination when agent is acting as a test target in an agent-to-agent test. * &#x60;localResolutionPrefixes&#x60;: This array of strings represents the public IP ranges where the Enterprise Agent performs rDNS (Reverse DNS) lookups. The range should be in CIDR notation, such as &#x60;10.1.1.0/24&#x60;. Please note that a maximum of 5 prefixes is allowed. This only applies to Enterprise Agents and Enterprise Agent clusters.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.agents.CloudAndEnterpriseAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudAndEnterpriseAgentsApi apiInstance = new CloudAndEnterpriseAgentsApi(defaultClient);
        String agentId = "281474976710706"; // String | Unique ID for the agent.
        AgentRequest agentRequest = new AgentRequest(); // AgentRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<AgentDetailsExpand> expand = Arrays.asList(); // List<AgentDetailsExpand> | Optional parameter, off by default. Indicates which agent sub-resource to expand. For example, if you wish to expand the `clusterMembers` sub-resource, pass the `?expand=cluster-member` query.
        try {
            AgentDetails result = apiInstance.updateAgent(agentId, agentRequest, aid, expand);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudAndEnterpriseAgentsApi#updateAgent");
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
| **agentId** | **String**| Unique ID for the agent. | |
| **agentRequest** | [**AgentRequest**](AgentRequest.md)|  | |
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

## updateAgentWithHttpInfo

> ApiResponse<AgentDetails> updateAgent updateAgentWithHttpInfo(agentId, agentRequest, aid, expand)

Update Enterprise Agent

Updates details for an Enterprise Agent. This operation can only be used for Enterprise Agents, and only for users in a role that permits modification of Enterprise Agents.  Important notes related to agent modification on tests: * if an agent is removed from a test, the modification date for tests using that agent at the time it was removed will be changed. * If an agent is removed from an entire account group, then all tests using this agent in the removed account group will be updated to reflect the removed agent. * If a removed agent is the final remaining agent on a test, then the test will be disabled when the agent is removed.  Users can update the following fields: * &#x60;agentName&#x60;: String representation of an agent. No two agents can have the same display name. * &#x60;enabled&#x60;: Boolean representation of agent state. * &#x60;accountGroups&#x60;: An array of account group ids. See &#x60;v7/account-groups&#x60; to pull a list of account IDs. * &#x60;tests&#x60;: An array of test Is. See &#x60;v7/tests&#x60; to retrieve a list tests available in the current account context. * &#x60;ipv6Policy&#x60;: Enum representation of the IP version policy. * &#x60;keepBrowserCache&#x60;: Boolean representation of the Keep browser cache state. * &#x60;targetForTests&#x60;: String representation of the target IP address or domain name. This represents the test destination when agent is acting as a test target in an agent-to-agent test. * &#x60;localResolutionPrefixes&#x60;: This array of strings represents the public IP ranges where the Enterprise Agent performs rDNS (Reverse DNS) lookups. The range should be in CIDR notation, such as &#x60;10.1.1.0/24&#x60;. Please note that a maximum of 5 prefixes is allowed. This only applies to Enterprise Agents and Enterprise Agent clusters.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.agents.CloudAndEnterpriseAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudAndEnterpriseAgentsApi apiInstance = new CloudAndEnterpriseAgentsApi(defaultClient);
        String agentId = "281474976710706"; // String | Unique ID for the agent.
        AgentRequest agentRequest = new AgentRequest(); // AgentRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<AgentDetailsExpand> expand = Arrays.asList(); // List<AgentDetailsExpand> | Optional parameter, off by default. Indicates which agent sub-resource to expand. For example, if you wish to expand the `clusterMembers` sub-resource, pass the `?expand=cluster-member` query.
        try {
            ApiResponse<AgentDetails> response = apiInstance.updateAgentWithHttpInfo(agentId, agentRequest, aid, expand);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudAndEnterpriseAgentsApi#updateAgent");
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
| **agentId** | **String**| Unique ID for the agent. | |
| **agentRequest** | [**AgentRequest**](AgentRequest.md)|  | |
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

