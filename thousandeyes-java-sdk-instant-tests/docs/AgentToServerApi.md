# AgentToServerApi

All URIs are relative to *https://api.thousandeyes.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postInstantAgentToServer**](AgentToServerApi.md#postInstantAgentToServer) | **POST** /v7/tests/agent-to-server/instant | Create agent-to-server instant test |
| [**postInstantAgentToServerWithHttpInfo**](AgentToServerApi.md#postInstantAgentToServerWithHttpInfo) | **POST** /v7/tests/agent-to-server/instant | Create agent-to-server instant test |



## postInstantAgentToServer

> AgentToServerInstantTest postInstantAgentToServer(agentToServerInstantTestRequest, aid, expand)

Create agent-to-server instant test

Creates and runs a new agent-to-server instant test.

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.tests.Configuration;
import com.thousandeyes.api.tests.authentication.*;
import com.thousandeyes.api.tests.models.*;
import com.thousandeyes.api.tests.instant.AgentToServerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToServerApi apiInstance = new AgentToServerApi(defaultClient);
        AgentToServerInstantTestRequest agentToServerInstantTestRequest = new AgentToServerInstantTestRequest(); // AgentToServerInstantTestRequest | 
        String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<Expand> expand = Arrays.asList(); // List<Expand> | (Optional) Indicates if the test sub-resources should be expanded. Defaults to no expansion. To expand the `agents` sub-resource, use the query `?expand=agent`.
        try {
            AgentToServerInstantTest result = apiInstance.postInstantAgentToServer(agentToServerInstantTestRequest, aid, expand);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToServerApi#postInstantAgentToServer");
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
| **agentToServerInstantTestRequest** | [**AgentToServerInstantTestRequest**](AgentToServerInstantTestRequest.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| (Optional) Indicates if the test sub-resources should be expanded. Defaults to no expansion. To expand the &#x60;agents&#x60; sub-resource, use the query &#x60;?expand&#x3D;agent&#x60;. | [optional] |

### Return type

[**AgentToServerInstantTest**](AgentToServerInstantTest.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  * Location -  <br>  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |

## postInstantAgentToServerWithHttpInfo

> ApiResponse<AgentToServerInstantTest> postInstantAgentToServer postInstantAgentToServerWithHttpInfo(agentToServerInstantTestRequest, aid, expand)

Create agent-to-server instant test

Creates and runs a new agent-to-server instant test.

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.common.ApiResponse;
import com.thousandeyes.api.tests.Configuration;
import com.thousandeyes.api.tests.authentication.*;
import com.thousandeyes.api.tests.models.*;
import com.thousandeyes.api.tests.instant.AgentToServerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToServerApi apiInstance = new AgentToServerApi(defaultClient);
        AgentToServerInstantTestRequest agentToServerInstantTestRequest = new AgentToServerInstantTestRequest(); // AgentToServerInstantTestRequest | 
        String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<Expand> expand = Arrays.asList(); // List<Expand> | (Optional) Indicates if the test sub-resources should be expanded. Defaults to no expansion. To expand the `agents` sub-resource, use the query `?expand=agent`.
        try {
            ApiResponse<AgentToServerInstantTest> response = apiInstance.postInstantAgentToServerWithHttpInfo(agentToServerInstantTestRequest, aid, expand);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToServerApi#postInstantAgentToServer");
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
| **agentToServerInstantTestRequest** | [**AgentToServerInstantTestRequest**](AgentToServerInstantTestRequest.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| (Optional) Indicates if the test sub-resources should be expanded. Defaults to no expansion. To expand the &#x60;agents&#x60; sub-resource, use the query &#x60;?expand&#x3D;agent&#x60;. | [optional] |

### Return type

ApiResponse<[**AgentToServerInstantTest**](AgentToServerInstantTest.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  * Location -  <br>  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |

