# EndpointAgentsTransferApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**transferEndpointAgent**](EndpointAgentsTransferApi.md#transferEndpointAgent) | **POST** /endpoint/agents/{agentId}/transfer | Transfer endpoint agent |
| [**transferEndpointAgentWithHttpInfo**](EndpointAgentsTransferApi.md#transferEndpointAgentWithHttpInfo) | **POST** /endpoint/agents/{agentId}/transfer | Transfer endpoint agent |
| [**transferEndpointAgents**](EndpointAgentsTransferApi.md#transferEndpointAgents) | **POST** /endpoint/agents/transfer/bulk | Bulk transfer agents |
| [**transferEndpointAgentsWithHttpInfo**](EndpointAgentsTransferApi.md#transferEndpointAgentsWithHttpInfo) | **POST** /endpoint/agents/transfer/bulk | Bulk transfer agents |



## transferEndpointAgent

> void transferEndpointAgent(agentId, agentTransferRequest, aid)

Transfer endpoint agent

Initiates the transfer of an agent from its current account, which must correspond to the provided aid, to the target account.  **Note:** It is essential to ensure that the &#x60;aid&#x60; parameter matches the current account of the agent for this operation to succeed. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.models.*;
import com.thousandeyes.sdk.endpoint.agents.EndpointAgentsTransferApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EndpointAgentsTransferApi apiInstance = new EndpointAgentsTransferApi(defaultClient);
        UUID agentId = UUID.randomUUID(); // UUID | The identifier of the agent to operate on.
        AgentTransferRequest agentTransferRequest = new AgentTransferRequest(); // AgentTransferRequest | The request to move an agent between accounts.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            apiInstance.transferEndpointAgent(agentId, agentTransferRequest, aid);
        } catch (ApiException e) {
            System.err.println("Exception when calling EndpointAgentsTransferApi#transferEndpointAgent");
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
| **agentTransferRequest** | [**AgentTransferRequest**](AgentTransferRequest.md)| The request to move an agent between accounts. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type


null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Transfer initiated |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |

## transferEndpointAgentWithHttpInfo

> ApiResponse<Void> transferEndpointAgent transferEndpointAgentWithHttpInfo(agentId, agentTransferRequest, aid)

Transfer endpoint agent

Initiates the transfer of an agent from its current account, which must correspond to the provided aid, to the target account.  **Note:** It is essential to ensure that the &#x60;aid&#x60; parameter matches the current account of the agent for this operation to succeed. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.models.*;
import com.thousandeyes.sdk.endpoint.agents.EndpointAgentsTransferApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EndpointAgentsTransferApi apiInstance = new EndpointAgentsTransferApi(defaultClient);
        UUID agentId = UUID.randomUUID(); // UUID | The identifier of the agent to operate on.
        AgentTransferRequest agentTransferRequest = new AgentTransferRequest(); // AgentTransferRequest | The request to move an agent between accounts.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiResponse<Void> response = apiInstance.transferEndpointAgentWithHttpInfo(agentId, agentTransferRequest, aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling EndpointAgentsTransferApi#transferEndpointAgent");
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
| **agentTransferRequest** | [**AgentTransferRequest**](AgentTransferRequest.md)| The request to move an agent between accounts. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Transfer initiated |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |


## transferEndpointAgents

> BulkAgentTransferResponse transferEndpointAgents(aid, bulkAgentTransferRequest)

Bulk transfer agents

Initiates the transfer of multiple agents between accounts. The following conditions apply:  * The requester must possess &#39;write&#39; permissions for both the &#39;from&#39; and &#39;to&#39; accounts involved in each transfer.  * Multiple transfers may involve a mix of different source and destination accounts. * For each transfer request, the &#39;from&#39; account must match the current account of the respective agent. * Transfers are executed asynchronously. * Progress tracking is not intended, but users can monitor the progress by periodically polling the &#39;get agent&#39; endpoint. * Each transfer request is individually validated and completed; this operation is not atomic, meaning transfers can succeed or fail individually. * The API response provides the status of each transfer request. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.models.*;
import com.thousandeyes.sdk.endpoint.agents.EndpointAgentsTransferApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EndpointAgentsTransferApi apiInstance = new EndpointAgentsTransferApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        BulkAgentTransferRequest bulkAgentTransferRequest = new BulkAgentTransferRequest(); // BulkAgentTransferRequest | A collection of `AgentTransfers`.
        try {
            BulkAgentTransferResponse result = apiInstance.transferEndpointAgents(aid, bulkAgentTransferRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EndpointAgentsTransferApi#transferEndpointAgents");
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
| **bulkAgentTransferRequest** | [**BulkAgentTransferRequest**](BulkAgentTransferRequest.md)| A collection of &#x60;AgentTransfers&#x60;. | [optional] |

### Return type

[**BulkAgentTransferResponse**](BulkAgentTransferResponse.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json, text/csv, text/plain
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **207** | Transfer initiated |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |

## transferEndpointAgentsWithHttpInfo

> ApiResponse<BulkAgentTransferResponse> transferEndpointAgents transferEndpointAgentsWithHttpInfo(aid, bulkAgentTransferRequest)

Bulk transfer agents

Initiates the transfer of multiple agents between accounts. The following conditions apply:  * The requester must possess &#39;write&#39; permissions for both the &#39;from&#39; and &#39;to&#39; accounts involved in each transfer.  * Multiple transfers may involve a mix of different source and destination accounts. * For each transfer request, the &#39;from&#39; account must match the current account of the respective agent. * Transfers are executed asynchronously. * Progress tracking is not intended, but users can monitor the progress by periodically polling the &#39;get agent&#39; endpoint. * Each transfer request is individually validated and completed; this operation is not atomic, meaning transfers can succeed or fail individually. * The API response provides the status of each transfer request. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.models.*;
import com.thousandeyes.sdk.endpoint.agents.EndpointAgentsTransferApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EndpointAgentsTransferApi apiInstance = new EndpointAgentsTransferApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        BulkAgentTransferRequest bulkAgentTransferRequest = new BulkAgentTransferRequest(); // BulkAgentTransferRequest | A collection of `AgentTransfers`.
        try {
            ApiResponse<BulkAgentTransferResponse> response = apiInstance.transferEndpointAgentsWithHttpInfo(aid, bulkAgentTransferRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EndpointAgentsTransferApi#transferEndpointAgents");
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
| **bulkAgentTransferRequest** | [**BulkAgentTransferRequest**](BulkAgentTransferRequest.md)| A collection of &#x60;AgentTransfers&#x60;. | [optional] |

### Return type

ApiResponse<[**BulkAgentTransferResponse**](BulkAgentTransferResponse.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json, text/csv, text/plain
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **207** | Transfer initiated |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |

