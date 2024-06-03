# ManageAgentsApi

All URIs are relative to *https://api.thousandeyes.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteEndpointAgent**](ManageAgentsApi.md#deleteEndpointAgent) | **DELETE** /v7/endpoint/agents/{agentId} | Delete endpoint agent |
| [**deleteEndpointAgentWithHttpInfo**](ManageAgentsApi.md#deleteEndpointAgentWithHttpInfo) | **DELETE** /v7/endpoint/agents/{agentId} | Delete endpoint agent |
| [**disableEndpointAgent**](ManageAgentsApi.md#disableEndpointAgent) | **POST** /v7/endpoint/agents/{agentId}/disable | Disable endpoint agent |
| [**disableEndpointAgentWithHttpInfo**](ManageAgentsApi.md#disableEndpointAgentWithHttpInfo) | **POST** /v7/endpoint/agents/{agentId}/disable | Disable endpoint agent |
| [**enableEndpointAgent**](ManageAgentsApi.md#enableEndpointAgent) | **POST** /v7/endpoint/agents/{agentId}/enable | Enable endpoint agent |
| [**enableEndpointAgentWithHttpInfo**](ManageAgentsApi.md#enableEndpointAgentWithHttpInfo) | **POST** /v7/endpoint/agents/{agentId}/enable | Enable endpoint agent |
| [**filterEndpointAgents**](ManageAgentsApi.md#filterEndpointAgents) | **POST** /v7/endpoint/agents/filter | Filter endpoint agents |
| [**filterEndpointAgentsWithHttpInfo**](ManageAgentsApi.md#filterEndpointAgentsWithHttpInfo) | **POST** /v7/endpoint/agents/filter | Filter endpoint agents |
| [**getEndpointAgent**](ManageAgentsApi.md#getEndpointAgent) | **GET** /v7/endpoint/agents/{agentId} | Retrieve endpoint agent |
| [**getEndpointAgentWithHttpInfo**](ManageAgentsApi.md#getEndpointAgentWithHttpInfo) | **GET** /v7/endpoint/agents/{agentId} | Retrieve endpoint agent |
| [**getEndpointAgents**](ManageAgentsApi.md#getEndpointAgents) | **GET** /v7/endpoint/agents | List endpoint agents |
| [**getEndpointAgentsWithHttpInfo**](ManageAgentsApi.md#getEndpointAgentsWithHttpInfo) | **GET** /v7/endpoint/agents | List endpoint agents |
| [**updateEndpointAgent**](ManageAgentsApi.md#updateEndpointAgent) | **PATCH** /v7/endpoint/agents/{agentId} | Update endpoint agent |
| [**updateEndpointAgentWithHttpInfo**](ManageAgentsApi.md#updateEndpointAgentWithHttpInfo) | **PATCH** /v7/endpoint/agents/{agentId} | Update endpoint agent |



## deleteEndpointAgent

> void deleteEndpointAgent(agentId, aid, expand)

Delete endpoint agent

Deletes the agent with the specified &#x60;agent_id&#x60;. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.models.*;
import com.thousandeyes.sdk.endpoint.agents.ManageAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ManageAgentsApi apiInstance = new ManageAgentsApi(defaultClient);
        UUID agentId = UUID.randomUUID(); // UUID | The identifier of the agent to operate on.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<Expand> expand = Arrays.asList(); // List<Expand> | This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \"clients\" resource, include the query parameter `?expand=clients`.  For multiple expansions, you have two options:    * Separate the values with commas. For example, `?expandAgent=clients,tasks`. * Specify the parameter multiple times. For example, `?expandAgent=clients&expandAgent=tasks`.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent. 
        try {
            apiInstance.deleteEndpointAgent(agentId, aid, expand);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManageAgentsApi#deleteEndpointAgent");
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
| **agentId** | **UUID**| The identifier of the agent to operate on. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  | [optional] |

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

## deleteEndpointAgentWithHttpInfo

> ApiResponse<Void> deleteEndpointAgent deleteEndpointAgentWithHttpInfo(agentId, aid, expand)

Delete endpoint agent

Deletes the agent with the specified &#x60;agent_id&#x60;. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.models.*;
import com.thousandeyes.sdk.endpoint.agents.ManageAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ManageAgentsApi apiInstance = new ManageAgentsApi(defaultClient);
        UUID agentId = UUID.randomUUID(); // UUID | The identifier of the agent to operate on.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<Expand> expand = Arrays.asList(); // List<Expand> | This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \"clients\" resource, include the query parameter `?expand=clients`.  For multiple expansions, you have two options:    * Separate the values with commas. For example, `?expandAgent=clients,tasks`. * Specify the parameter multiple times. For example, `?expandAgent=clients&expandAgent=tasks`.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent. 
        try {
            ApiResponse<Void> response = apiInstance.deleteEndpointAgentWithHttpInfo(agentId, aid, expand);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ManageAgentsApi#deleteEndpointAgent");
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
| **agentId** | **UUID**| The identifier of the agent to operate on. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  | [optional] |

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


## disableEndpointAgent

> EndpointAgent disableEndpointAgent(agentId, aid)

Disable endpoint agent

Disables an endpoint agent. If it&#39;s already disabled, it has no effect (no operation).

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.models.*;
import com.thousandeyes.sdk.endpoint.agents.ManageAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ManageAgentsApi apiInstance = new ManageAgentsApi(defaultClient);
        UUID agentId = UUID.randomUUID(); // UUID | The identifier of the agent to operate on.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            EndpointAgent result = apiInstance.disableEndpointAgent(agentId, aid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManageAgentsApi#disableEndpointAgent");
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
| **agentId** | **UUID**| The identifier of the agent to operate on. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**EndpointAgent**](EndpointAgent.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The agent&#39;s current state. |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |

## disableEndpointAgentWithHttpInfo

> ApiResponse<EndpointAgent> disableEndpointAgent disableEndpointAgentWithHttpInfo(agentId, aid)

Disable endpoint agent

Disables an endpoint agent. If it&#39;s already disabled, it has no effect (no operation).

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.models.*;
import com.thousandeyes.sdk.endpoint.agents.ManageAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ManageAgentsApi apiInstance = new ManageAgentsApi(defaultClient);
        UUID agentId = UUID.randomUUID(); // UUID | The identifier of the agent to operate on.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiResponse<EndpointAgent> response = apiInstance.disableEndpointAgentWithHttpInfo(agentId, aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ManageAgentsApi#disableEndpointAgent");
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
| **agentId** | **UUID**| The identifier of the agent to operate on. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

ApiResponse<[**EndpointAgent**](EndpointAgent.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The agent&#39;s current state. |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |


## enableEndpointAgent

> EndpointAgent enableEndpointAgent(agentId, aid)

Enable endpoint agent

Enables an endpoint agent. If it&#39;s already enabled, it has no effect (no operation).

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.models.*;
import com.thousandeyes.sdk.endpoint.agents.ManageAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ManageAgentsApi apiInstance = new ManageAgentsApi(defaultClient);
        UUID agentId = UUID.randomUUID(); // UUID | The identifier of the agent to operate on.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            EndpointAgent result = apiInstance.enableEndpointAgent(agentId, aid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManageAgentsApi#enableEndpointAgent");
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
| **agentId** | **UUID**| The identifier of the agent to operate on. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**EndpointAgent**](EndpointAgent.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The agent&#39;s current state. |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |

## enableEndpointAgentWithHttpInfo

> ApiResponse<EndpointAgent> enableEndpointAgent enableEndpointAgentWithHttpInfo(agentId, aid)

Enable endpoint agent

Enables an endpoint agent. If it&#39;s already enabled, it has no effect (no operation).

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.models.*;
import com.thousandeyes.sdk.endpoint.agents.ManageAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ManageAgentsApi apiInstance = new ManageAgentsApi(defaultClient);
        UUID agentId = UUID.randomUUID(); // UUID | The identifier of the agent to operate on.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiResponse<EndpointAgent> response = apiInstance.enableEndpointAgentWithHttpInfo(agentId, aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ManageAgentsApi#enableEndpointAgent");
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
| **agentId** | **UUID**| The identifier of the agent to operate on. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

ApiResponse<[**EndpointAgent**](EndpointAgent.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The agent&#39;s current state. |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |


## filterEndpointAgents

> FilterEndpointAgentsResponse filterEndpointAgents(agentSearchRequest, max, cursor, aid, expand, includeDeleted)

Filter endpoint agents

Retrieves a list of endpoint agents within the specified account group that match the specified filters.  If no agents meet the filter criteria, the API returns an empty array. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.models.*;
import com.thousandeyes.sdk.endpoint.agents.ManageAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ManageAgentsApi apiInstance = new ManageAgentsApi(defaultClient);
        AgentSearchRequest agentSearchRequest = new AgentSearchRequest(); // AgentSearchRequest | The filter options for advanced search filtering for agents.
        Integer max = 5; // Integer | (Optional) Maximum number of objects to return.
        String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `next` value from `_links` instead of this parameter.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<Expand> expand = Arrays.asList(); // List<Expand> | This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \"clients\" resource, include the query parameter `?expand=clients`.  For multiple expansions, you have two options:    * Separate the values with commas. For example, `?expandAgent=clients,tasks`. * Specify the parameter multiple times. For example, `?expandAgent=clients&expandAgent=tasks`.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent. 
        Boolean includeDeleted = false; // Boolean | When requesting entities, set to `true` if you want to see deleted entities.
        try {
            FilterEndpointAgentsResponse result = apiInstance.filterEndpointAgents(agentSearchRequest, max, cursor, aid, expand, includeDeleted);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManageAgentsApi#filterEndpointAgents");
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
| **agentSearchRequest** | [**AgentSearchRequest**](AgentSearchRequest.md)| The filter options for advanced search filtering for agents. | |
| **max** | **Integer**| (Optional) Maximum number of objects to return. | [optional] |
| **cursor** | **String**| (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. | [optional] |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  | [optional] |
| **includeDeleted** | **Boolean**| When requesting entities, set to &#x60;true&#x60; if you want to see deleted entities. | [optional] |

### Return type

[**FilterEndpointAgentsResponse**](FilterEndpointAgentsResponse.md)


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
| **429** | Exhausted rate limit for the organization |  -  |

## filterEndpointAgentsWithHttpInfo

> ApiResponse<FilterEndpointAgentsResponse> filterEndpointAgents filterEndpointAgentsWithHttpInfo(agentSearchRequest, max, cursor, aid, expand, includeDeleted)

Filter endpoint agents

Retrieves a list of endpoint agents within the specified account group that match the specified filters.  If no agents meet the filter criteria, the API returns an empty array. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.models.*;
import com.thousandeyes.sdk.endpoint.agents.ManageAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ManageAgentsApi apiInstance = new ManageAgentsApi(defaultClient);
        AgentSearchRequest agentSearchRequest = new AgentSearchRequest(); // AgentSearchRequest | The filter options for advanced search filtering for agents.
        Integer max = 5; // Integer | (Optional) Maximum number of objects to return.
        String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `next` value from `_links` instead of this parameter.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<Expand> expand = Arrays.asList(); // List<Expand> | This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \"clients\" resource, include the query parameter `?expand=clients`.  For multiple expansions, you have two options:    * Separate the values with commas. For example, `?expandAgent=clients,tasks`. * Specify the parameter multiple times. For example, `?expandAgent=clients&expandAgent=tasks`.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent. 
        Boolean includeDeleted = false; // Boolean | When requesting entities, set to `true` if you want to see deleted entities.
        try {
            ApiResponse<FilterEndpointAgentsResponse> response = apiInstance.filterEndpointAgentsWithHttpInfo(agentSearchRequest, max, cursor, aid, expand, includeDeleted);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ManageAgentsApi#filterEndpointAgents");
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
| **agentSearchRequest** | [**AgentSearchRequest**](AgentSearchRequest.md)| The filter options for advanced search filtering for agents. | |
| **max** | **Integer**| (Optional) Maximum number of objects to return. | [optional] |
| **cursor** | **String**| (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. | [optional] |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  | [optional] |
| **includeDeleted** | **Boolean**| When requesting entities, set to &#x60;true&#x60; if you want to see deleted entities. | [optional] |

### Return type

ApiResponse<[**FilterEndpointAgentsResponse**](FilterEndpointAgentsResponse.md)>


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
| **429** | Exhausted rate limit for the organization |  -  |


## getEndpointAgent

> EndpointAgent getEndpointAgent(agentId, aid, expand, includeDeleted)

Retrieve endpoint agent

Retrieves details of an agent with the specified &#x60;agent_id&#x60;.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.models.*;
import com.thousandeyes.sdk.endpoint.agents.ManageAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ManageAgentsApi apiInstance = new ManageAgentsApi(defaultClient);
        UUID agentId = UUID.randomUUID(); // UUID | The identifier of the agent to operate on.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<Expand> expand = Arrays.asList(); // List<Expand> | This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \"clients\" resource, include the query parameter `?expand=clients`.  For multiple expansions, you have two options:    * Separate the values with commas. For example, `?expandAgent=clients,tasks`. * Specify the parameter multiple times. For example, `?expandAgent=clients&expandAgent=tasks`.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent. 
        Boolean includeDeleted = false; // Boolean | When requesting entities, set to `true` if you want to see deleted entities.
        try {
            EndpointAgent result = apiInstance.getEndpointAgent(agentId, aid, expand, includeDeleted);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManageAgentsApi#getEndpointAgent");
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
| **agentId** | **UUID**| The identifier of the agent to operate on. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  | [optional] |
| **includeDeleted** | **Boolean**| When requesting entities, set to &#x60;true&#x60; if you want to see deleted entities. | [optional] |

### Return type

[**EndpointAgent**](EndpointAgent.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The agent&#39;s current state. |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |

## getEndpointAgentWithHttpInfo

> ApiResponse<EndpointAgent> getEndpointAgent getEndpointAgentWithHttpInfo(agentId, aid, expand, includeDeleted)

Retrieve endpoint agent

Retrieves details of an agent with the specified &#x60;agent_id&#x60;.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.models.*;
import com.thousandeyes.sdk.endpoint.agents.ManageAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ManageAgentsApi apiInstance = new ManageAgentsApi(defaultClient);
        UUID agentId = UUID.randomUUID(); // UUID | The identifier of the agent to operate on.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<Expand> expand = Arrays.asList(); // List<Expand> | This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \"clients\" resource, include the query parameter `?expand=clients`.  For multiple expansions, you have two options:    * Separate the values with commas. For example, `?expandAgent=clients,tasks`. * Specify the parameter multiple times. For example, `?expandAgent=clients&expandAgent=tasks`.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent. 
        Boolean includeDeleted = false; // Boolean | When requesting entities, set to `true` if you want to see deleted entities.
        try {
            ApiResponse<EndpointAgent> response = apiInstance.getEndpointAgentWithHttpInfo(agentId, aid, expand, includeDeleted);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ManageAgentsApi#getEndpointAgent");
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
| **agentId** | **UUID**| The identifier of the agent to operate on. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  | [optional] |
| **includeDeleted** | **Boolean**| When requesting entities, set to &#x60;true&#x60; if you want to see deleted entities. | [optional] |

### Return type

ApiResponse<[**EndpointAgent**](EndpointAgent.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The agent&#39;s current state. |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |


## getEndpointAgents

> ListEndpointAgentsResponse getEndpointAgents(max, cursor, aid, expand, includeDeleted, useAllPermittedAids, agentName, computerName)

List endpoint agents

Retrieves a list of endpoint agents in a given account group.  If there are no agents in the specified account group, it returns an empty array. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.models.*;
import com.thousandeyes.sdk.endpoint.agents.ManageAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ManageAgentsApi apiInstance = new ManageAgentsApi(defaultClient);
        Integer max = 5; // Integer | (Optional) Maximum number of objects to return.
        String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `next` value from `_links` instead of this parameter.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<Expand> expand = Arrays.asList(); // List<Expand> | This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \"clients\" resource, include the query parameter `?expand=clients`.  For multiple expansions, you have two options:    * Separate the values with commas. For example, `?expandAgent=clients,tasks`. * Specify the parameter multiple times. For example, `?expandAgent=clients&expandAgent=tasks`.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent. 
        Boolean includeDeleted = false; // Boolean | When requesting entities, set to `true` if you want to see deleted entities.
        Boolean useAllPermittedAids = false; // Boolean | Set to `true` to load data from all accounts the user has access to.
        String agentName = "agentName_example"; // String | Returns only agents with the specified name.  This is an exact match only. 
        String computerName = "computerName_example"; // String | Returns only agents with the specified computer name. This is an exact match only. 
        try {
            ListEndpointAgentsResponse result = apiInstance.getEndpointAgents(max, cursor, aid, expand, includeDeleted, useAllPermittedAids, agentName, computerName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManageAgentsApi#getEndpointAgents");
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
| **max** | **Integer**| (Optional) Maximum number of objects to return. | [optional] |
| **cursor** | **String**| (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. | [optional] |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  | [optional] |
| **includeDeleted** | **Boolean**| When requesting entities, set to &#x60;true&#x60; if you want to see deleted entities. | [optional] |
| **useAllPermittedAids** | **Boolean**| Set to &#x60;true&#x60; to load data from all accounts the user has access to. | [optional] [default to false] |
| **agentName** | **String**| Returns only agents with the specified name.  This is an exact match only.  | [optional] |
| **computerName** | **String**| Returns only agents with the specified computer name. This is an exact match only.  | [optional] |

### Return type

[**ListEndpointAgentsResponse**](ListEndpointAgentsResponse.md)


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
| **429** | Exhausted rate limit for the organization |  -  |

## getEndpointAgentsWithHttpInfo

> ApiResponse<ListEndpointAgentsResponse> getEndpointAgents getEndpointAgentsWithHttpInfo(max, cursor, aid, expand, includeDeleted, useAllPermittedAids, agentName, computerName)

List endpoint agents

Retrieves a list of endpoint agents in a given account group.  If there are no agents in the specified account group, it returns an empty array. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.models.*;
import com.thousandeyes.sdk.endpoint.agents.ManageAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ManageAgentsApi apiInstance = new ManageAgentsApi(defaultClient);
        Integer max = 5; // Integer | (Optional) Maximum number of objects to return.
        String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `next` value from `_links` instead of this parameter.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<Expand> expand = Arrays.asList(); // List<Expand> | This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \"clients\" resource, include the query parameter `?expand=clients`.  For multiple expansions, you have two options:    * Separate the values with commas. For example, `?expandAgent=clients,tasks`. * Specify the parameter multiple times. For example, `?expandAgent=clients&expandAgent=tasks`.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent. 
        Boolean includeDeleted = false; // Boolean | When requesting entities, set to `true` if you want to see deleted entities.
        Boolean useAllPermittedAids = false; // Boolean | Set to `true` to load data from all accounts the user has access to.
        String agentName = "agentName_example"; // String | Returns only agents with the specified name.  This is an exact match only. 
        String computerName = "computerName_example"; // String | Returns only agents with the specified computer name. This is an exact match only. 
        try {
            ApiResponse<ListEndpointAgentsResponse> response = apiInstance.getEndpointAgentsWithHttpInfo(max, cursor, aid, expand, includeDeleted, useAllPermittedAids, agentName, computerName);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ManageAgentsApi#getEndpointAgents");
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
| **max** | **Integer**| (Optional) Maximum number of objects to return. | [optional] |
| **cursor** | **String**| (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. | [optional] |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  | [optional] |
| **includeDeleted** | **Boolean**| When requesting entities, set to &#x60;true&#x60; if you want to see deleted entities. | [optional] |
| **useAllPermittedAids** | **Boolean**| Set to &#x60;true&#x60; to load data from all accounts the user has access to. | [optional] [default to false] |
| **agentName** | **String**| Returns only agents with the specified name.  This is an exact match only.  | [optional] |
| **computerName** | **String**| Returns only agents with the specified computer name. This is an exact match only.  | [optional] |

### Return type

ApiResponse<[**ListEndpointAgentsResponse**](ListEndpointAgentsResponse.md)>


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
| **429** | Exhausted rate limit for the organization |  -  |


## updateEndpointAgent

> EndpointAgent updateEndpointAgent(agentId, aid, expand, endpointAgentUpdate)

Update endpoint agent

Updates the agent with the specified &#x60;agent_id&#x60;. This API supports the modification of the following fields:  * &#x60;name&#x60;  * &#x60;licenseType&#x60;  Any attempt to update fields other than those listed above, with a value different from their current value, will result in a 400 Bad Request response. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.models.*;
import com.thousandeyes.sdk.endpoint.agents.ManageAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ManageAgentsApi apiInstance = new ManageAgentsApi(defaultClient);
        UUID agentId = UUID.randomUUID(); // UUID | The identifier of the agent to operate on.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<Expand> expand = Arrays.asList(); // List<Expand> | This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \"clients\" resource, include the query parameter `?expand=clients`.  For multiple expansions, you have two options:    * Separate the values with commas. For example, `?expandAgent=clients,tasks`. * Specify the parameter multiple times. For example, `?expandAgent=clients&expandAgent=tasks`.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent. 
        EndpointAgentUpdate endpointAgentUpdate = new EndpointAgentUpdate(); // EndpointAgentUpdate | Fields to modify on the agent
        try {
            EndpointAgent result = apiInstance.updateEndpointAgent(agentId, aid, expand, endpointAgentUpdate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManageAgentsApi#updateEndpointAgent");
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
| **agentId** | **UUID**| The identifier of the agent to operate on. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  | [optional] |
| **endpointAgentUpdate** | [**EndpointAgentUpdate**](EndpointAgentUpdate.md)| Fields to modify on the agent | [optional] |

### Return type

[**EndpointAgent**](EndpointAgent.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The agent&#39;s current state. |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |

## updateEndpointAgentWithHttpInfo

> ApiResponse<EndpointAgent> updateEndpointAgent updateEndpointAgentWithHttpInfo(agentId, aid, expand, endpointAgentUpdate)

Update endpoint agent

Updates the agent with the specified &#x60;agent_id&#x60;. This API supports the modification of the following fields:  * &#x60;name&#x60;  * &#x60;licenseType&#x60;  Any attempt to update fields other than those listed above, with a value different from their current value, will result in a 400 Bad Request response. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.models.*;
import com.thousandeyes.sdk.endpoint.agents.ManageAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ManageAgentsApi apiInstance = new ManageAgentsApi(defaultClient);
        UUID agentId = UUID.randomUUID(); // UUID | The identifier of the agent to operate on.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<Expand> expand = Arrays.asList(); // List<Expand> | This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \"clients\" resource, include the query parameter `?expand=clients`.  For multiple expansions, you have two options:    * Separate the values with commas. For example, `?expandAgent=clients,tasks`. * Specify the parameter multiple times. For example, `?expandAgent=clients&expandAgent=tasks`.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent. 
        EndpointAgentUpdate endpointAgentUpdate = new EndpointAgentUpdate(); // EndpointAgentUpdate | Fields to modify on the agent
        try {
            ApiResponse<EndpointAgent> response = apiInstance.updateEndpointAgentWithHttpInfo(agentId, aid, expand, endpointAgentUpdate);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ManageAgentsApi#updateEndpointAgent");
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
| **agentId** | **UUID**| The identifier of the agent to operate on. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  | [optional] |
| **endpointAgentUpdate** | [**EndpointAgentUpdate**](EndpointAgentUpdate.md)| Fields to modify on the agent | [optional] |

### Return type

ApiResponse<[**EndpointAgent**](EndpointAgent.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The agent&#39;s current state. |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |

