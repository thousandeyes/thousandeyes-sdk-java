# ManageAgentsApi

All URIs are relative to *https://api.thousandeyes.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**endpointAgentDelete**](ManageAgentsApi.md#endpointAgentDelete) | **DELETE** /v7/endpoint/agents/{agentId} | Delete endpoint agent |
| [**endpointAgentDisable**](ManageAgentsApi.md#endpointAgentDisable) | **POST** /v7/endpoint/agents/{agentId}/disable | Disable endpoint agent |
| [**endpointAgentEnable**](ManageAgentsApi.md#endpointAgentEnable) | **POST** /v7/endpoint/agents/{agentId}/enable | Enable endpoint agent |
| [**endpointAgentGet**](ManageAgentsApi.md#endpointAgentGet) | **GET** /v7/endpoint/agents/{agentId} | Retrieve endpoint agent |
| [**endpointAgentUpdate**](ManageAgentsApi.md#endpointAgentUpdate) | **PATCH** /v7/endpoint/agents/{agentId} | Update endpoint agent |
| [**endpointAgentsList**](ManageAgentsApi.md#endpointAgentsList) | **GET** /v7/endpoint/agents | List endpoint agents |
| [**endpointAgentsSearch**](ManageAgentsApi.md#endpointAgentsSearch) | **POST** /v7/endpoint/agents/filter | Filter endpoint agents |


<a id="endpointAgentDelete"></a>
# **endpointAgentDelete**
> endpointAgentDelete(agentId, aid, expand)

Delete endpoint agent

Deletes the agent with the specified &#x60;agent_id&#x60;. 

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.ManageAgentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ManageAgentsApi apiInstance = new ManageAgentsApi(defaultClient);
    String agentId = "agentId_example"; // String | The identifier of the agent to operate on.
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    List<Expand> expand = Arrays.asList(); // List<Expand> | This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \"clients\" resource, include the query parameter `?expand=clients`.  For multiple expansions, you have two options:    * Separate the values with commas. For example, `?expandAgent=clients,tasks`. * Specify the parameter multiple times. For example, `?expandAgent=clients&expandAgent=tasks`.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent. 
    try {
      apiInstance.endpointAgentDelete(agentId, aid, expand);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManageAgentsApi#endpointAgentDelete");
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
| **agentId** | **String**| The identifier of the agent to operate on. | |
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

<a id="endpointAgentDisable"></a>
# **endpointAgentDisable**
> EndpointAgentGet200Response endpointAgentDisable(agentId, aid)

Disable endpoint agent

Disables an endpoint agent. If it&#39;s already disabled, it has no effect (no operation).

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.ManageAgentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ManageAgentsApi apiInstance = new ManageAgentsApi(defaultClient);
    String agentId = "agentId_example"; // String | The identifier of the agent to operate on.
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      EndpointAgentGet200Response result = apiInstance.endpointAgentDisable(agentId, aid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManageAgentsApi#endpointAgentDisable");
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
| **agentId** | **String**| The identifier of the agent to operate on. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**EndpointAgentGet200Response**](EndpointAgentGet200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The agent&#39;s current state. |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |

<a id="endpointAgentEnable"></a>
# **endpointAgentEnable**
> EndpointAgentGet200Response endpointAgentEnable(agentId, aid)

Enable endpoint agent

Enables an endpoint agent. If it&#39;s already enabled, it has no effect (no operation).

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.ManageAgentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ManageAgentsApi apiInstance = new ManageAgentsApi(defaultClient);
    String agentId = "agentId_example"; // String | The identifier of the agent to operate on.
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      EndpointAgentGet200Response result = apiInstance.endpointAgentEnable(agentId, aid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManageAgentsApi#endpointAgentEnable");
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
| **agentId** | **String**| The identifier of the agent to operate on. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**EndpointAgentGet200Response**](EndpointAgentGet200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The agent&#39;s current state. |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |

<a id="endpointAgentGet"></a>
# **endpointAgentGet**
> EndpointAgentGet200Response endpointAgentGet(agentId, aid, expand, includeDeleted)

Retrieve endpoint agent

Retrieves details of an agent with the specified &#x60;agent_id&#x60;.

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.ManageAgentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ManageAgentsApi apiInstance = new ManageAgentsApi(defaultClient);
    String agentId = "agentId_example"; // String | The identifier of the agent to operate on.
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    List<Expand> expand = Arrays.asList(); // List<Expand> | This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \"clients\" resource, include the query parameter `?expand=clients`.  For multiple expansions, you have two options:    * Separate the values with commas. For example, `?expandAgent=clients,tasks`. * Specify the parameter multiple times. For example, `?expandAgent=clients&expandAgent=tasks`.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent. 
    Boolean includeDeleted = false; // Boolean | When requesting entities, set to `true` if you want to see deleted entities.
    try {
      EndpointAgentGet200Response result = apiInstance.endpointAgentGet(agentId, aid, expand, includeDeleted);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManageAgentsApi#endpointAgentGet");
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
| **agentId** | **String**| The identifier of the agent to operate on. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  | [optional] |
| **includeDeleted** | **Boolean**| When requesting entities, set to &#x60;true&#x60; if you want to see deleted entities. | [optional] |

### Return type

[**EndpointAgentGet200Response**](EndpointAgentGet200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The agent&#39;s current state. |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |

<a id="endpointAgentUpdate"></a>
# **endpointAgentUpdate**
> EndpointAgentGet200Response endpointAgentUpdate(agentId, aid, expand, endpointAgentUpdate)

Update endpoint agent

Updates the agent with the specified &#x60;agent_id&#x60;. This API supports the modification of the following fields:  * &#x60;name&#x60;  * &#x60;licenseType&#x60;  Any attempt to update fields other than those listed above, with a value different from their current value, will result in a 400 Bad Request response. 

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.ManageAgentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ManageAgentsApi apiInstance = new ManageAgentsApi(defaultClient);
    String agentId = "agentId_example"; // String | The identifier of the agent to operate on.
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    List<Expand> expand = Arrays.asList(); // List<Expand> | This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \"clients\" resource, include the query parameter `?expand=clients`.  For multiple expansions, you have two options:    * Separate the values with commas. For example, `?expandAgent=clients,tasks`. * Specify the parameter multiple times. For example, `?expandAgent=clients&expandAgent=tasks`.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent. 
    EndpointAgentUpdate endpointAgentUpdate = new EndpointAgentUpdate(); // EndpointAgentUpdate | Fields to modify on the agent
    try {
      EndpointAgentGet200Response result = apiInstance.endpointAgentUpdate(agentId, aid, expand, endpointAgentUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManageAgentsApi#endpointAgentUpdate");
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
| **agentId** | **String**| The identifier of the agent to operate on. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  | [optional] |
| **endpointAgentUpdate** | [**EndpointAgentUpdate**](EndpointAgentUpdate.md)| Fields to modify on the agent | [optional] |

### Return type

[**EndpointAgentGet200Response**](EndpointAgentGet200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The agent&#39;s current state. |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |

<a id="endpointAgentsList"></a>
# **endpointAgentsList**
> EndpointAgentsList200Response endpointAgentsList(max, cursor, aid, expand, includeDeleted, useAllPermittedAids, agentName, computerName)

List endpoint agents

Retrieves a list of endpoint agents in a given account group.  If there are no agents in the specified account group, it returns an empty array. 

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.ManageAgentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ManageAgentsApi apiInstance = new ManageAgentsApi(defaultClient);
    BigDecimal max = new BigDecimal("5"); // BigDecimal | (Optional) Maximum number of objects to return.
    String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `_links` instead of this parameter.
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    List<Expand> expand = Arrays.asList(); // List<Expand> | This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \"clients\" resource, include the query parameter `?expand=clients`.  For multiple expansions, you have two options:    * Separate the values with commas. For example, `?expandAgent=clients,tasks`. * Specify the parameter multiple times. For example, `?expandAgent=clients&expandAgent=tasks`.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent. 
    Boolean includeDeleted = false; // Boolean | When requesting entities, set to `true` if you want to see deleted entities.
    Boolean useAllPermittedAids = false; // Boolean | Set to `true` to load data from all accounts the user has access to.
    String agentName = "agentName_example"; // String | Returns only agents with the specified name.  This is an exact match only. 
    String computerName = "computerName_example"; // String | Returns only agents with the specified computer name. This is an exact match only. 
    try {
      EndpointAgentsList200Response result = apiInstance.endpointAgentsList(max, cursor, aid, expand, includeDeleted, useAllPermittedAids, agentName, computerName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManageAgentsApi#endpointAgentsList");
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
| **max** | **BigDecimal**| (Optional) Maximum number of objects to return. | [optional] |
| **cursor** | **String**| (Optional) Opaque cursor used for pagination. Clients should use &#x60;_links&#x60; instead of this parameter. | [optional] |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  | [optional] |
| **includeDeleted** | **Boolean**| When requesting entities, set to &#x60;true&#x60; if you want to see deleted entities. | [optional] |
| **useAllPermittedAids** | **Boolean**| Set to &#x60;true&#x60; to load data from all accounts the user has access to. | [optional] [default to false] |
| **agentName** | **String**| Returns only agents with the specified name.  This is an exact match only.  | [optional] |
| **computerName** | **String**| Returns only agents with the specified computer name. This is an exact match only.  | [optional] |

### Return type

[**EndpointAgentsList200Response**](EndpointAgentsList200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **429** | Exhausted rate limit for the organization |  -  |

<a id="endpointAgentsSearch"></a>
# **endpointAgentsSearch**
> EndpointAgentsSearch200Response endpointAgentsSearch(agentSearchRequest, max, cursor, aid, expand, includeDeleted)

Filter endpoint agents

Retrieves a list of endpoint agents within the specified account group that match the specified filters.  If no agents meet the filter criteria, the API returns an empty array. 

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.ManageAgentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ManageAgentsApi apiInstance = new ManageAgentsApi(defaultClient);
    AgentSearchRequest agentSearchRequest = new AgentSearchRequest(); // AgentSearchRequest | The filter options for advanced search filtering for agents.
    BigDecimal max = new BigDecimal("5"); // BigDecimal | (Optional) Maximum number of objects to return.
    String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `_links` instead of this parameter.
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    List<Expand> expand = Arrays.asList(); // List<Expand> | This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \"clients\" resource, include the query parameter `?expand=clients`.  For multiple expansions, you have two options:    * Separate the values with commas. For example, `?expandAgent=clients,tasks`. * Specify the parameter multiple times. For example, `?expandAgent=clients&expandAgent=tasks`.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent. 
    Boolean includeDeleted = false; // Boolean | When requesting entities, set to `true` if you want to see deleted entities.
    try {
      EndpointAgentsSearch200Response result = apiInstance.endpointAgentsSearch(agentSearchRequest, max, cursor, aid, expand, includeDeleted);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManageAgentsApi#endpointAgentsSearch");
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
| **max** | **BigDecimal**| (Optional) Maximum number of objects to return. | [optional] |
| **cursor** | **String**| (Optional) Opaque cursor used for pagination. Clients should use &#x60;_links&#x60; instead of this parameter. | [optional] |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \&quot;clients\&quot; resource, include the query parameter &#x60;?expand&#x3D;clients&#x60;.  For multiple expansions, you have two options:    * Separate the values with commas. For example, &#x60;?expandAgent&#x3D;clients,tasks&#x60;. * Specify the parameter multiple times. For example, &#x60;?expandAgent&#x3D;clients&amp;expandAgent&#x3D;tasks&#x60;.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent.  | [optional] |
| **includeDeleted** | **Boolean**| When requesting entities, set to &#x60;true&#x60; if you want to see deleted entities. | [optional] |

### Return type

[**EndpointAgentsSearch200Response**](EndpointAgentsSearch200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **429** | Exhausted rate limit for the organization |  -  |

