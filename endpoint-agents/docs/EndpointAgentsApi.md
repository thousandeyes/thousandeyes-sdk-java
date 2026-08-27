# EndpointAgentsApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteEndpointAgent**](EndpointAgentsApi.md#deleteEndpointAgent) | **DELETE** /endpoint/agents/{agentId} | Delete endpoint agent |
| [**deleteEndpointAgentWithHttpInfo**](EndpointAgentsApi.md#deleteEndpointAgentWithHttpInfo) | **DELETE** /endpoint/agents/{agentId} | Delete endpoint agent |
| [**disableEndpointAgent**](EndpointAgentsApi.md#disableEndpointAgent) | **POST** /endpoint/agents/{agentId}/disable | Disable endpoint agent |
| [**disableEndpointAgentWithHttpInfo**](EndpointAgentsApi.md#disableEndpointAgentWithHttpInfo) | **POST** /endpoint/agents/{agentId}/disable | Disable endpoint agent |
| [**enableEndpointAgent**](EndpointAgentsApi.md#enableEndpointAgent) | **POST** /endpoint/agents/{agentId}/enable | Enable endpoint agent |
| [**enableEndpointAgentWithHttpInfo**](EndpointAgentsApi.md#enableEndpointAgentWithHttpInfo) | **POST** /endpoint/agents/{agentId}/enable | Enable endpoint agent |
| [**filterEndpointAgents**](EndpointAgentsApi.md#filterEndpointAgents) | **POST** /endpoint/agents/filter | Filter endpoint agents |
| [**filterEndpointAgentsWithHttpInfo**](EndpointAgentsApi.md#filterEndpointAgentsWithHttpInfo) | **POST** /endpoint/agents/filter | Filter endpoint agents |
| [**getEndpointAgent**](EndpointAgentsApi.md#getEndpointAgent) | **GET** /endpoint/agents/{agentId} | Retrieve endpoint agent |
| [**getEndpointAgentWithHttpInfo**](EndpointAgentsApi.md#getEndpointAgentWithHttpInfo) | **GET** /endpoint/agents/{agentId} | Retrieve endpoint agent |
| [**getEndpointAgents**](EndpointAgentsApi.md#getEndpointAgents) | **GET** /endpoint/agents | List endpoint agents |
| [**getEndpointAgentsWithHttpInfo**](EndpointAgentsApi.md#getEndpointAgentsWithHttpInfo) | **GET** /endpoint/agents | List endpoint agents |
| [**getEndpointAgentsConnectionString**](EndpointAgentsApi.md#getEndpointAgentsConnectionString) | **GET** /endpoint/agents/connection-string | Get agent connection string |
| [**getEndpointAgentsConnectionStringWithHttpInfo**](EndpointAgentsApi.md#getEndpointAgentsConnectionStringWithHttpInfo) | **GET** /endpoint/agents/connection-string | Get agent connection string |
| [**updateEndpointAgent**](EndpointAgentsApi.md#updateEndpointAgent) | **PATCH** /endpoint/agents/{agentId} | Update endpoint agent |
| [**updateEndpointAgentWithHttpInfo**](EndpointAgentsApi.md#updateEndpointAgentWithHttpInfo) | **PATCH** /endpoint/agents/{agentId} | Update endpoint agent |



## deleteEndpointAgent

> void deleteEndpointAgent(DeleteEndpointAgentRequest)

Delete endpoint agent

Deletes the agent with the specified &#x60;agent_id&#x60;. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.agents.model.*;
import com.thousandeyes.sdk.endpoint.agents.EndpointAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EndpointAgentsApi apiInstance = new EndpointAgentsApi(defaultClient);
        UUID agentId = UUID.randomUUID(); // UUID | The identifier of the agent to operate on.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandEndpointAgentOptions> expand = Arrays.asList(); // List<ExpandEndpointAgentOptions> | This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \"clients\" resource, include the query parameter `?expand=clients`.  For multiple expansions, you have two options:    * Separate the values with commas. For example, `?expandAgent=clients,tasks`. * Specify the parameter multiple times. For example, `?expandAgent=clients&expandAgent=tasks`.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent. 
        try {
            EndpointAgentsApi.DeleteEndpointAgentRequest request = EndpointAgentsApi.DeleteEndpointAgentRequest.builder()
                .agentId(agentId)
                .aid(aid)
                .expand(expand)
                .build();
            apiInstance.deleteEndpointAgent(request);
        } catch (ApiException e) {
            System.err.println("Exception when calling EndpointAgentsApi#deleteEndpointAgent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| request | [**DeleteEndpointAgentRequest**](EndpointAgentsApi.md#DeleteEndpointAgentRequest)|-|-|

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

> ApiResponse<Void> deleteEndpointAgent deleteEndpointAgentWithHttpInfo(DeleteEndpointAgentRequest)

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
import com.thousandeyes.sdk.endpoint.agents.model.*;
import com.thousandeyes.sdk.endpoint.agents.EndpointAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EndpointAgentsApi apiInstance = new EndpointAgentsApi(defaultClient);
        UUID agentId = UUID.randomUUID(); // UUID | The identifier of the agent to operate on.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandEndpointAgentOptions> expand = Arrays.asList(); // List<ExpandEndpointAgentOptions> | This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \"clients\" resource, include the query parameter `?expand=clients`.  For multiple expansions, you have two options:    * Separate the values with commas. For example, `?expandAgent=clients,tasks`. * Specify the parameter multiple times. For example, `?expandAgent=clients&expandAgent=tasks`.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent. 
        try {
            EndpointAgentsApi.DeleteEndpointAgentRequest request = EndpointAgentsApi.DeleteEndpointAgentRequest.builder()
                .agentId(agentId)
                .aid(aid)
                .expand(expand)
                .build();
            ApiResponse<Void> response = apiInstance.deleteEndpointAgentWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling EndpointAgentsApi#deleteEndpointAgent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| request | [**DeleteEndpointAgentRequest**](EndpointAgentsApi.md#DeleteEndpointAgentRequest)|-|-|

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


<a id="DeleteEndpointAgentRequest"></a>
## DeleteEndpointAgentRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **agentId** | **UUID** | The identifier of the agent to operate on. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;ExpandEndpointAgentOptions&gt;**](ExpandEndpointAgentOptions.md) | This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  | [optional] |



## disableEndpointAgent

> EndpointAgent disableEndpointAgent(DisableEndpointAgentRequest)

Disable endpoint agent

Disables an endpoint agent. If it&#39;s already disabled, it has no effect (no operation).

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.agents.model.*;
import com.thousandeyes.sdk.endpoint.agents.EndpointAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EndpointAgentsApi apiInstance = new EndpointAgentsApi(defaultClient);
        UUID agentId = UUID.randomUUID(); // UUID | The identifier of the agent to operate on.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            EndpointAgentsApi.DisableEndpointAgentRequest request = EndpointAgentsApi.DisableEndpointAgentRequest.builder()
                .agentId(agentId)
                .aid(aid)
                .build();
            EndpointAgent result = apiInstance.disableEndpointAgent(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EndpointAgentsApi#disableEndpointAgent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| request | [**DisableEndpointAgentRequest**](EndpointAgentsApi.md#DisableEndpointAgentRequest)|-|-|

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

> ApiResponse<EndpointAgent> disableEndpointAgent disableEndpointAgentWithHttpInfo(DisableEndpointAgentRequest)

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
import com.thousandeyes.sdk.endpoint.agents.model.*;
import com.thousandeyes.sdk.endpoint.agents.EndpointAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EndpointAgentsApi apiInstance = new EndpointAgentsApi(defaultClient);
        UUID agentId = UUID.randomUUID(); // UUID | The identifier of the agent to operate on.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            EndpointAgentsApi.DisableEndpointAgentRequest request = EndpointAgentsApi.DisableEndpointAgentRequest.builder()
                .agentId(agentId)
                .aid(aid)
                .build();
            ApiResponse<EndpointAgent> response = apiInstance.disableEndpointAgentWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EndpointAgentsApi#disableEndpointAgent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| request | [**DisableEndpointAgentRequest**](EndpointAgentsApi.md#DisableEndpointAgentRequest)|-|-|

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


<a id="DisableEndpointAgentRequest"></a>
## DisableEndpointAgentRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **agentId** | **UUID** | The identifier of the agent to operate on. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## enableEndpointAgent

> EndpointAgent enableEndpointAgent(EnableEndpointAgentRequest)

Enable endpoint agent

Enables an endpoint agent. If it&#39;s already enabled, it has no effect (no operation).

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.agents.model.*;
import com.thousandeyes.sdk.endpoint.agents.EndpointAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EndpointAgentsApi apiInstance = new EndpointAgentsApi(defaultClient);
        UUID agentId = UUID.randomUUID(); // UUID | The identifier of the agent to operate on.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            EndpointAgentsApi.EnableEndpointAgentRequest request = EndpointAgentsApi.EnableEndpointAgentRequest.builder()
                .agentId(agentId)
                .aid(aid)
                .build();
            EndpointAgent result = apiInstance.enableEndpointAgent(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EndpointAgentsApi#enableEndpointAgent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| request | [**EnableEndpointAgentRequest**](EndpointAgentsApi.md#EnableEndpointAgentRequest)|-|-|

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

> ApiResponse<EndpointAgent> enableEndpointAgent enableEndpointAgentWithHttpInfo(EnableEndpointAgentRequest)

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
import com.thousandeyes.sdk.endpoint.agents.model.*;
import com.thousandeyes.sdk.endpoint.agents.EndpointAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EndpointAgentsApi apiInstance = new EndpointAgentsApi(defaultClient);
        UUID agentId = UUID.randomUUID(); // UUID | The identifier of the agent to operate on.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            EndpointAgentsApi.EnableEndpointAgentRequest request = EndpointAgentsApi.EnableEndpointAgentRequest.builder()
                .agentId(agentId)
                .aid(aid)
                .build();
            ApiResponse<EndpointAgent> response = apiInstance.enableEndpointAgentWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EndpointAgentsApi#enableEndpointAgent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| request | [**EnableEndpointAgentRequest**](EndpointAgentsApi.md#EnableEndpointAgentRequest)|-|-|

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


<a id="EnableEndpointAgentRequest"></a>
## EnableEndpointAgentRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **agentId** | **UUID** | The identifier of the agent to operate on. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## filterEndpointAgents

> FilterEndpointAgentsResponse filterEndpointAgents(FilterEndpointAgentsRequest)

Filter endpoint agents

Retrieves a list of endpoint agents within the specified account group that match the specified filters.  If no agents meet the filter criteria, the API returns an empty array. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.agents.model.*;
import com.thousandeyes.sdk.endpoint.agents.EndpointAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EndpointAgentsApi apiInstance = new EndpointAgentsApi(defaultClient);
        AgentSearchRequest agentSearchRequest = new AgentSearchRequest(); // AgentSearchRequest | The filter options for advanced search filtering for agents.
        Integer max = 5; // Integer | (Optional) Maximum number of objects to return.
        String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `next` value from `_links` instead of this parameter.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandEndpointAgentOptions> expand = Arrays.asList(); // List<ExpandEndpointAgentOptions> | This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \"clients\" resource, include the query parameter `?expand=clients`.  For multiple expansions, you have two options:    * Separate the values with commas. For example, `?expandAgent=clients,tasks`. * Specify the parameter multiple times. For example, `?expandAgent=clients&expandAgent=tasks`.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent. 
        Boolean includeDeleted = false; // Boolean | When requesting entities, set to `true` if you want to see deleted entities.
        try {
            EndpointAgentsApi.FilterEndpointAgentsRequest request = EndpointAgentsApi.FilterEndpointAgentsRequest.builder()
                .agentSearchRequest(agentSearchRequest)
                .max(max)
                .cursor(cursor)
                .aid(aid)
                .expand(expand)
                .includeDeleted(includeDeleted)
                .build();
            FilterEndpointAgentsResponse result = apiInstance.filterEndpointAgents(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EndpointAgentsApi#filterEndpointAgents");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| request | [**FilterEndpointAgentsRequest**](EndpointAgentsApi.md#FilterEndpointAgentsRequest)|-|-|

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

> ApiResponse<FilterEndpointAgentsResponse> filterEndpointAgents filterEndpointAgentsWithHttpInfo(FilterEndpointAgentsRequest)

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
import com.thousandeyes.sdk.endpoint.agents.model.*;
import com.thousandeyes.sdk.endpoint.agents.EndpointAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EndpointAgentsApi apiInstance = new EndpointAgentsApi(defaultClient);
        AgentSearchRequest agentSearchRequest = new AgentSearchRequest(); // AgentSearchRequest | The filter options for advanced search filtering for agents.
        Integer max = 5; // Integer | (Optional) Maximum number of objects to return.
        String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `next` value from `_links` instead of this parameter.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandEndpointAgentOptions> expand = Arrays.asList(); // List<ExpandEndpointAgentOptions> | This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \"clients\" resource, include the query parameter `?expand=clients`.  For multiple expansions, you have two options:    * Separate the values with commas. For example, `?expandAgent=clients,tasks`. * Specify the parameter multiple times. For example, `?expandAgent=clients&expandAgent=tasks`.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent. 
        Boolean includeDeleted = false; // Boolean | When requesting entities, set to `true` if you want to see deleted entities.
        try {
            EndpointAgentsApi.FilterEndpointAgentsRequest request = EndpointAgentsApi.FilterEndpointAgentsRequest.builder()
                .agentSearchRequest(agentSearchRequest)
                .max(max)
                .cursor(cursor)
                .aid(aid)
                .expand(expand)
                .includeDeleted(includeDeleted)
                .build();
            ApiResponse<FilterEndpointAgentsResponse> response = apiInstance.filterEndpointAgentsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EndpointAgentsApi#filterEndpointAgents");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| request | [**FilterEndpointAgentsRequest**](EndpointAgentsApi.md#FilterEndpointAgentsRequest)|-|-|

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


<a id="FilterEndpointAgentsRequest"></a>
## FilterEndpointAgentsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **agentSearchRequest** | [**AgentSearchRequest**](AgentSearchRequest.md) | The filter options for advanced search filtering for agents. | |
| **max** | **Integer** | (Optional) Maximum number of objects to return. | [optional] |
| **cursor** | **String** | (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. | [optional] |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;ExpandEndpointAgentOptions&gt;**](ExpandEndpointAgentOptions.md) | This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  | [optional] |
| **includeDeleted** | **Boolean** | When requesting entities, set to &#x60;true&#x60; if you want to see deleted entities. | [optional] |



## getEndpointAgent

> EndpointAgent getEndpointAgent(GetEndpointAgentRequest)

Retrieve endpoint agent

Retrieves details of an agent with the specified &#x60;agent_id&#x60;.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.agents.model.*;
import com.thousandeyes.sdk.endpoint.agents.EndpointAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EndpointAgentsApi apiInstance = new EndpointAgentsApi(defaultClient);
        UUID agentId = UUID.randomUUID(); // UUID | The identifier of the agent to operate on.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandEndpointAgentOptions> expand = Arrays.asList(); // List<ExpandEndpointAgentOptions> | This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \"clients\" resource, include the query parameter `?expand=clients`.  For multiple expansions, you have two options:    * Separate the values with commas. For example, `?expandAgent=clients,tasks`. * Specify the parameter multiple times. For example, `?expandAgent=clients&expandAgent=tasks`.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent. 
        Boolean includeDeleted = false; // Boolean | When requesting entities, set to `true` if you want to see deleted entities.
        try {
            EndpointAgentsApi.GetEndpointAgentRequest request = EndpointAgentsApi.GetEndpointAgentRequest.builder()
                .agentId(agentId)
                .aid(aid)
                .expand(expand)
                .includeDeleted(includeDeleted)
                .build();
            EndpointAgent result = apiInstance.getEndpointAgent(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EndpointAgentsApi#getEndpointAgent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| request | [**GetEndpointAgentRequest**](EndpointAgentsApi.md#GetEndpointAgentRequest)|-|-|

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

> ApiResponse<EndpointAgent> getEndpointAgent getEndpointAgentWithHttpInfo(GetEndpointAgentRequest)

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
import com.thousandeyes.sdk.endpoint.agents.model.*;
import com.thousandeyes.sdk.endpoint.agents.EndpointAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EndpointAgentsApi apiInstance = new EndpointAgentsApi(defaultClient);
        UUID agentId = UUID.randomUUID(); // UUID | The identifier of the agent to operate on.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandEndpointAgentOptions> expand = Arrays.asList(); // List<ExpandEndpointAgentOptions> | This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \"clients\" resource, include the query parameter `?expand=clients`.  For multiple expansions, you have two options:    * Separate the values with commas. For example, `?expandAgent=clients,tasks`. * Specify the parameter multiple times. For example, `?expandAgent=clients&expandAgent=tasks`.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent. 
        Boolean includeDeleted = false; // Boolean | When requesting entities, set to `true` if you want to see deleted entities.
        try {
            EndpointAgentsApi.GetEndpointAgentRequest request = EndpointAgentsApi.GetEndpointAgentRequest.builder()
                .agentId(agentId)
                .aid(aid)
                .expand(expand)
                .includeDeleted(includeDeleted)
                .build();
            ApiResponse<EndpointAgent> response = apiInstance.getEndpointAgentWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EndpointAgentsApi#getEndpointAgent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| request | [**GetEndpointAgentRequest**](EndpointAgentsApi.md#GetEndpointAgentRequest)|-|-|

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


<a id="GetEndpointAgentRequest"></a>
## GetEndpointAgentRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **agentId** | **UUID** | The identifier of the agent to operate on. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;ExpandEndpointAgentOptions&gt;**](ExpandEndpointAgentOptions.md) | This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  | [optional] |
| **includeDeleted** | **Boolean** | When requesting entities, set to &#x60;true&#x60; if you want to see deleted entities. | [optional] |



## getEndpointAgents

> ListEndpointAgentsResponse getEndpointAgents(GetEndpointAgentsRequest)

List endpoint agents

Retrieves a list of endpoint agents in a given account group.  If there are no agents in the specified account group, it returns an empty array. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.agents.model.*;
import com.thousandeyes.sdk.endpoint.agents.EndpointAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EndpointAgentsApi apiInstance = new EndpointAgentsApi(defaultClient);
        Integer max = 5; // Integer | (Optional) Maximum number of objects to return.
        String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `next` value from `_links` instead of this parameter.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandEndpointAgentOptions> expand = Arrays.asList(); // List<ExpandEndpointAgentOptions> | This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \"clients\" resource, include the query parameter `?expand=clients`.  For multiple expansions, you have two options:    * Separate the values with commas. For example, `?expandAgent=clients,tasks`. * Specify the parameter multiple times. For example, `?expandAgent=clients&expandAgent=tasks`.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent. 
        Boolean includeDeleted = false; // Boolean | When requesting entities, set to `true` if you want to see deleted entities.
        Boolean useAllPermittedAids = false; // Boolean | Set to `true` to load data from all accounts the user has access to.
        String agentName = "agentName_example"; // String | Returns only agents with the specified name.  This is an exact match only. 
        String computerName = "computerName_example"; // String | Returns only agents with the specified computer name. This is an exact match only. 
        try {
            EndpointAgentsApi.GetEndpointAgentsRequest request = EndpointAgentsApi.GetEndpointAgentsRequest.builder()
                .max(max)
                .cursor(cursor)
                .aid(aid)
                .expand(expand)
                .includeDeleted(includeDeleted)
                .useAllPermittedAids(useAllPermittedAids)
                .agentName(agentName)
                .computerName(computerName)
                .build();
            ListEndpointAgentsResponse result = apiInstance.getEndpointAgents(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EndpointAgentsApi#getEndpointAgents");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| request | [**GetEndpointAgentsRequest**](EndpointAgentsApi.md#GetEndpointAgentsRequest)|-|-|

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

> ApiResponse<ListEndpointAgentsResponse> getEndpointAgents getEndpointAgentsWithHttpInfo(GetEndpointAgentsRequest)

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
import com.thousandeyes.sdk.endpoint.agents.model.*;
import com.thousandeyes.sdk.endpoint.agents.EndpointAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EndpointAgentsApi apiInstance = new EndpointAgentsApi(defaultClient);
        Integer max = 5; // Integer | (Optional) Maximum number of objects to return.
        String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `next` value from `_links` instead of this parameter.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandEndpointAgentOptions> expand = Arrays.asList(); // List<ExpandEndpointAgentOptions> | This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \"clients\" resource, include the query parameter `?expand=clients`.  For multiple expansions, you have two options:    * Separate the values with commas. For example, `?expandAgent=clients,tasks`. * Specify the parameter multiple times. For example, `?expandAgent=clients&expandAgent=tasks`.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent. 
        Boolean includeDeleted = false; // Boolean | When requesting entities, set to `true` if you want to see deleted entities.
        Boolean useAllPermittedAids = false; // Boolean | Set to `true` to load data from all accounts the user has access to.
        String agentName = "agentName_example"; // String | Returns only agents with the specified name.  This is an exact match only. 
        String computerName = "computerName_example"; // String | Returns only agents with the specified computer name. This is an exact match only. 
        try {
            EndpointAgentsApi.GetEndpointAgentsRequest request = EndpointAgentsApi.GetEndpointAgentsRequest.builder()
                .max(max)
                .cursor(cursor)
                .aid(aid)
                .expand(expand)
                .includeDeleted(includeDeleted)
                .useAllPermittedAids(useAllPermittedAids)
                .agentName(agentName)
                .computerName(computerName)
                .build();
            ApiResponse<ListEndpointAgentsResponse> response = apiInstance.getEndpointAgentsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EndpointAgentsApi#getEndpointAgents");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| request | [**GetEndpointAgentsRequest**](EndpointAgentsApi.md#GetEndpointAgentsRequest)|-|-|

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


<a id="GetEndpointAgentsRequest"></a>
## GetEndpointAgentsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **max** | **Integer** | (Optional) Maximum number of objects to return. | [optional] |
| **cursor** | **String** | (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. | [optional] |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;ExpandEndpointAgentOptions&gt;**](ExpandEndpointAgentOptions.md) | This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  | [optional] |
| **includeDeleted** | **Boolean** | When requesting entities, set to &#x60;true&#x60; if you want to see deleted entities. | [optional] |
| **useAllPermittedAids** | **Boolean** | Set to &#x60;true&#x60; to load data from all accounts the user has access to. | [optional] [default to false] |
| **agentName** | **String** | Returns only agents with the specified name.  This is an exact match only.  | [optional] |
| **computerName** | **String** | Returns only agents with the specified computer name. This is an exact match only.  | [optional] |



## getEndpointAgentsConnectionString

> ConnectionString getEndpointAgentsConnectionString(GetEndpointAgentsConnectionStringRequest)

Get agent connection string

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.agents.model.*;
import com.thousandeyes.sdk.endpoint.agents.EndpointAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EndpointAgentsApi apiInstance = new EndpointAgentsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            EndpointAgentsApi.GetEndpointAgentsConnectionStringRequest request = EndpointAgentsApi.GetEndpointAgentsConnectionStringRequest.builder()
                .aid(aid)
                .build();
            ConnectionString result = apiInstance.getEndpointAgentsConnectionString(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EndpointAgentsApi#getEndpointAgentsConnectionString");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| request | [**GetEndpointAgentsConnectionStringRequest**](EndpointAgentsApi.md#GetEndpointAgentsConnectionStringRequest)|-|-|

### Return type

[**ConnectionString**](ConnectionString.md)


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

## getEndpointAgentsConnectionStringWithHttpInfo

> ApiResponse<ConnectionString> getEndpointAgentsConnectionString getEndpointAgentsConnectionStringWithHttpInfo(GetEndpointAgentsConnectionStringRequest)

Get agent connection string

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.agents.model.*;
import com.thousandeyes.sdk.endpoint.agents.EndpointAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EndpointAgentsApi apiInstance = new EndpointAgentsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            EndpointAgentsApi.GetEndpointAgentsConnectionStringRequest request = EndpointAgentsApi.GetEndpointAgentsConnectionStringRequest.builder()
                .aid(aid)
                .build();
            ApiResponse<ConnectionString> response = apiInstance.getEndpointAgentsConnectionStringWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EndpointAgentsApi#getEndpointAgentsConnectionString");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| request | [**GetEndpointAgentsConnectionStringRequest**](EndpointAgentsApi.md#GetEndpointAgentsConnectionStringRequest)|-|-|

### Return type

ApiResponse<[**ConnectionString**](ConnectionString.md)>


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


<a id="GetEndpointAgentsConnectionStringRequest"></a>
## GetEndpointAgentsConnectionStringRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## updateEndpointAgent

> EndpointAgent updateEndpointAgent(UpdateEndpointAgentRequest)

Update endpoint agent

Updates the agent with the specified &#x60;agent_id&#x60;. This API supports the modification of the following fields:  * &#x60;name&#x60;  * &#x60;licenseType&#x60;  Any attempt to update fields other than those listed above, with a value different from their current value, will result in a 400 Bad Request response. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.agents.model.*;
import com.thousandeyes.sdk.endpoint.agents.EndpointAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EndpointAgentsApi apiInstance = new EndpointAgentsApi(defaultClient);
        UUID agentId = UUID.randomUUID(); // UUID | The identifier of the agent to operate on.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandEndpointAgentOptions> expand = Arrays.asList(); // List<ExpandEndpointAgentOptions> | This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \"clients\" resource, include the query parameter `?expand=clients`.  For multiple expansions, you have two options:    * Separate the values with commas. For example, `?expandAgent=clients,tasks`. * Specify the parameter multiple times. For example, `?expandAgent=clients&expandAgent=tasks`.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent. 
        EndpointAgentUpdate endpointAgentUpdate = new EndpointAgentUpdate(); // EndpointAgentUpdate | Fields to modify on the agent
        try {
            EndpointAgentsApi.UpdateEndpointAgentRequest request = EndpointAgentsApi.UpdateEndpointAgentRequest.builder()
                .agentId(agentId)
                .aid(aid)
                .expand(expand)
                .endpointAgentUpdate(endpointAgentUpdate)
                .build();
            EndpointAgent result = apiInstance.updateEndpointAgent(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EndpointAgentsApi#updateEndpointAgent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| request | [**UpdateEndpointAgentRequest**](EndpointAgentsApi.md#UpdateEndpointAgentRequest)|-|-|

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

> ApiResponse<EndpointAgent> updateEndpointAgent updateEndpointAgentWithHttpInfo(UpdateEndpointAgentRequest)

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
import com.thousandeyes.sdk.endpoint.agents.model.*;
import com.thousandeyes.sdk.endpoint.agents.EndpointAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EndpointAgentsApi apiInstance = new EndpointAgentsApi(defaultClient);
        UUID agentId = UUID.randomUUID(); // UUID | The identifier of the agent to operate on.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandEndpointAgentOptions> expand = Arrays.asList(); // List<ExpandEndpointAgentOptions> | This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \"clients\" resource, include the query parameter `?expand=clients`.  For multiple expansions, you have two options:    * Separate the values with commas. For example, `?expandAgent=clients,tasks`. * Specify the parameter multiple times. For example, `?expandAgent=clients&expandAgent=tasks`.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent. 
        EndpointAgentUpdate endpointAgentUpdate = new EndpointAgentUpdate(); // EndpointAgentUpdate | Fields to modify on the agent
        try {
            EndpointAgentsApi.UpdateEndpointAgentRequest request = EndpointAgentsApi.UpdateEndpointAgentRequest.builder()
                .agentId(agentId)
                .aid(aid)
                .expand(expand)
                .endpointAgentUpdate(endpointAgentUpdate)
                .build();
            ApiResponse<EndpointAgent> response = apiInstance.updateEndpointAgentWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EndpointAgentsApi#updateEndpointAgent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| request | [**UpdateEndpointAgentRequest**](EndpointAgentsApi.md#UpdateEndpointAgentRequest)|-|-|

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


<a id="UpdateEndpointAgentRequest"></a>
## UpdateEndpointAgentRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **agentId** | **UUID** | The identifier of the agent to operate on. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;ExpandEndpointAgentOptions&gt;**](ExpandEndpointAgentOptions.md) | This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  | [optional] |
| **endpointAgentUpdate** | [**EndpointAgentUpdate**](EndpointAgentUpdate.md) | Fields to modify on the agent | [optional] |


