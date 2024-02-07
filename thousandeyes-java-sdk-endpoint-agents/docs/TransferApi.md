# TransferApi

All URIs are relative to *https://api.thousandeyes.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**endpointAgentBulkTransfer**](TransferApi.md#endpointAgentBulkTransfer) | **POST** /v7/endpoint/agents/transfer/bulk | Bulk transfer agents |
| [**endpointAgentBulkTransferWithHttpInfo**](TransferApi.md#endpointAgentBulkTransferWithHttpInfo) | **POST** /v7/endpoint/agents/transfer/bulk | Bulk transfer agents |
| [**endpointAgentSingleTransfer**](TransferApi.md#endpointAgentSingleTransfer) | **POST** /v7/endpoint/agents/{agentId}/transfer | Transfer endpoint agent |
| [**endpointAgentSingleTransferWithHttpInfo**](TransferApi.md#endpointAgentSingleTransferWithHttpInfo) | **POST** /v7/endpoint/agents/{agentId}/transfer | Transfer endpoint agent |



## endpointAgentBulkTransfer

> EndpointAgentBulkTransfer207Response endpointAgentBulkTransfer(aid, endpointAgentBulkTransferRequest)

Bulk transfer agents

Initiates the transfer of multiple agents between accounts. The following conditions apply:  * The requester must possess &#39;write&#39; permissions for both the &#39;from&#39; and &#39;to&#39; accounts involved in each transfer.  * Multiple transfers may involve a mix of different source and destination accounts. * For each transfer request, the &#39;from&#39; account must match the current account of the respective agent. * Transfers are executed asynchronously. * Progress tracking is not intended, but users can monitor the progress by periodically polling the &#39;get agent&#39; endpoint. * Each transfer request is individually validated and completed; this operation is not atomic, meaning transfers can succeed or fail individually. * The API response provides the status of each transfer request. 

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.endpoint.Configuration;
import com.thousandeyes.api.endpoint.authentication.*;
import com.thousandeyes.api.endpoint.models.*;
import com.thousandeyes.api.endpoint.agents.TransferApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TransferApi apiInstance = new TransferApi(defaultClient);
        String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        EndpointAgentBulkTransferRequest endpointAgentBulkTransferRequest = new EndpointAgentBulkTransferRequest(); // EndpointAgentBulkTransferRequest | A collection of `AgentTransfers`.
        try {
            EndpointAgentBulkTransfer207Response result = apiInstance.endpointAgentBulkTransfer(aid, endpointAgentBulkTransferRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransferApi#endpointAgentBulkTransfer");
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
| **endpointAgentBulkTransferRequest** | [**EndpointAgentBulkTransferRequest**](EndpointAgentBulkTransferRequest.md)| A collection of &#x60;AgentTransfers&#x60;. | [optional] |

### Return type

[**EndpointAgentBulkTransfer207Response**](EndpointAgentBulkTransfer207Response.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json, text/csv, text/plain
- **Accept**: application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **207** | Transfer initiated |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |

## endpointAgentBulkTransferWithHttpInfo

> ApiResponse<EndpointAgentBulkTransfer207Response> endpointAgentBulkTransfer endpointAgentBulkTransferWithHttpInfo(aid, endpointAgentBulkTransferRequest)

Bulk transfer agents

Initiates the transfer of multiple agents between accounts. The following conditions apply:  * The requester must possess &#39;write&#39; permissions for both the &#39;from&#39; and &#39;to&#39; accounts involved in each transfer.  * Multiple transfers may involve a mix of different source and destination accounts. * For each transfer request, the &#39;from&#39; account must match the current account of the respective agent. * Transfers are executed asynchronously. * Progress tracking is not intended, but users can monitor the progress by periodically polling the &#39;get agent&#39; endpoint. * Each transfer request is individually validated and completed; this operation is not atomic, meaning transfers can succeed or fail individually. * The API response provides the status of each transfer request. 

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.common.ApiResponse;
import com.thousandeyes.api.endpoint.Configuration;
import com.thousandeyes.api.endpoint.authentication.*;
import com.thousandeyes.api.endpoint.models.*;
import com.thousandeyes.api.endpoint.agents.TransferApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TransferApi apiInstance = new TransferApi(defaultClient);
        String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        EndpointAgentBulkTransferRequest endpointAgentBulkTransferRequest = new EndpointAgentBulkTransferRequest(); // EndpointAgentBulkTransferRequest | A collection of `AgentTransfers`.
        try {
            ApiResponse<EndpointAgentBulkTransfer207Response> response = apiInstance.endpointAgentBulkTransferWithHttpInfo(aid, endpointAgentBulkTransferRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransferApi#endpointAgentBulkTransfer");
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
| **endpointAgentBulkTransferRequest** | [**EndpointAgentBulkTransferRequest**](EndpointAgentBulkTransferRequest.md)| A collection of &#x60;AgentTransfers&#x60;. | [optional] |

### Return type

ApiResponse<[**EndpointAgentBulkTransfer207Response**](EndpointAgentBulkTransfer207Response.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json, text/csv, text/plain
- **Accept**: application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **207** | Transfer initiated |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |


## endpointAgentSingleTransfer

> void endpointAgentSingleTransfer(agentId, agentTransferRequest, aid)

Transfer endpoint agent

Initiates the transfer of an agent from its current account, which must correspond to the provided aid, to the target account.  **Note:** It is essential to ensure that the &#x60;aid&#x60; parameter matches the current account of the agent for this operation to succeed. 

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.endpoint.Configuration;
import com.thousandeyes.api.endpoint.authentication.*;
import com.thousandeyes.api.endpoint.models.*;
import com.thousandeyes.api.endpoint.agents.TransferApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TransferApi apiInstance = new TransferApi(defaultClient);
        UUID agentId = UUID.randomUUID(); // UUID | The identifier of the agent to operate on.
        AgentTransferRequest agentTransferRequest = new AgentTransferRequest(); // AgentTransferRequest | The request to move an agent between accounts.
        String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            apiInstance.endpointAgentSingleTransfer(agentId, agentTransferRequest, aid);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransferApi#endpointAgentSingleTransfer");
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
- **Accept**: application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Transfer initiated |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |

## endpointAgentSingleTransferWithHttpInfo

> ApiResponse<Void> endpointAgentSingleTransfer endpointAgentSingleTransferWithHttpInfo(agentId, agentTransferRequest, aid)

Transfer endpoint agent

Initiates the transfer of an agent from its current account, which must correspond to the provided aid, to the target account.  **Note:** It is essential to ensure that the &#x60;aid&#x60; parameter matches the current account of the agent for this operation to succeed. 

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.common.ApiResponse;
import com.thousandeyes.api.endpoint.Configuration;
import com.thousandeyes.api.endpoint.authentication.*;
import com.thousandeyes.api.endpoint.models.*;
import com.thousandeyes.api.endpoint.agents.TransferApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TransferApi apiInstance = new TransferApi(defaultClient);
        UUID agentId = UUID.randomUUID(); // UUID | The identifier of the agent to operate on.
        AgentTransferRequest agentTransferRequest = new AgentTransferRequest(); // AgentTransferRequest | The request to move an agent between accounts.
        String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiResponse<Void> response = apiInstance.endpointAgentSingleTransferWithHttpInfo(agentId, agentTransferRequest, aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransferApi#endpointAgentSingleTransfer");
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
- **Accept**: application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Transfer initiated |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |

