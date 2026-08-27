# TestsAssignmentOnAgentsApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignTests**](TestsAssignmentOnAgentsApi.md#assignTests) | **POST** /agents/{agentId}/tests/assign | Assign tests to an agent |
| [**assignTestsWithHttpInfo**](TestsAssignmentOnAgentsApi.md#assignTestsWithHttpInfo) | **POST** /agents/{agentId}/tests/assign | Assign tests to an agent |
| [**overwriteTests**](TestsAssignmentOnAgentsApi.md#overwriteTests) | **POST** /agents/{agentId}/tests/override | Overwrite tests assigned to an agent |
| [**overwriteTestsWithHttpInfo**](TestsAssignmentOnAgentsApi.md#overwriteTestsWithHttpInfo) | **POST** /agents/{agentId}/tests/override | Overwrite tests assigned to an agent |
| [**unassignTests**](TestsAssignmentOnAgentsApi.md#unassignTests) | **POST** /agents/{agentId}/tests/unassign | Unassign tests from an agent |
| [**unassignTestsWithHttpInfo**](TestsAssignmentOnAgentsApi.md#unassignTestsWithHttpInfo) | **POST** /agents/{agentId}/tests/unassign | Unassign tests from an agent |



## assignTests

> AgentDetails assignTests(AssignTestsRequest)

Assign tests to an agent

Assign tests to a specific Agent. Existing assigned tests are not removed.  **Important notes:**    * The operation fails if the specified agent does not exist.    * If any provided test ID is invalid, the entire operation is canceled.    * Already assigned tests are ignored; other valid tests will be assigned.    * This operation does not overwrite existing assignments.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.agents.model.*;
import com.thousandeyes.sdk.agents.TestsAssignmentOnAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TestsAssignmentOnAgentsApi apiInstance = new TestsAssignmentOnAgentsApi(defaultClient);
        String agentId = "281474976710706"; // String | Unique ID for the Enterprise Agent cluster to add new agents to.
        AgentTestsAssignRequest agentTestsAssignRequest = new AgentTestsAssignRequest(); // AgentTestsAssignRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            TestsAssignmentOnAgentsApi.AssignTestsRequest request = TestsAssignmentOnAgentsApi.AssignTestsRequest.builder()
                .agentId(agentId)
                .agentTestsAssignRequest(agentTestsAssignRequest)
                .aid(aid)
                .build();
            AgentDetails result = apiInstance.assignTests(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestsAssignmentOnAgentsApi#assignTests");
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
| request | [**AssignTestsRequest**](TestsAssignmentOnAgentsApi.md#AssignTestsRequest)|-|-|

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

## assignTestsWithHttpInfo

> ApiResponse<AgentDetails> assignTests assignTestsWithHttpInfo(AssignTestsRequest)

Assign tests to an agent

Assign tests to a specific Agent. Existing assigned tests are not removed.  **Important notes:**    * The operation fails if the specified agent does not exist.    * If any provided test ID is invalid, the entire operation is canceled.    * Already assigned tests are ignored; other valid tests will be assigned.    * This operation does not overwrite existing assignments.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.agents.model.*;
import com.thousandeyes.sdk.agents.TestsAssignmentOnAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TestsAssignmentOnAgentsApi apiInstance = new TestsAssignmentOnAgentsApi(defaultClient);
        String agentId = "281474976710706"; // String | Unique ID for the Enterprise Agent cluster to add new agents to.
        AgentTestsAssignRequest agentTestsAssignRequest = new AgentTestsAssignRequest(); // AgentTestsAssignRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            TestsAssignmentOnAgentsApi.AssignTestsRequest request = TestsAssignmentOnAgentsApi.AssignTestsRequest.builder()
                .agentId(agentId)
                .agentTestsAssignRequest(agentTestsAssignRequest)
                .aid(aid)
                .build();
            ApiResponse<AgentDetails> response = apiInstance.assignTestsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TestsAssignmentOnAgentsApi#assignTests");
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
| request | [**AssignTestsRequest**](TestsAssignmentOnAgentsApi.md#AssignTestsRequest)|-|-|

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


<a id="AssignTestsRequest"></a>
## AssignTestsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **agentId** | **String** | Unique ID for the Enterprise Agent cluster to add new agents to. | |
| **agentTestsAssignRequest** | [**AgentTestsAssignRequest**](AgentTestsAssignRequest.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## overwriteTests

> AgentDetails overwriteTests(OverwriteTestsRequest)

Overwrite tests assigned to an agent

Replaces all tests assigned to a specific agent with the new set of test IDs provided.  **Important notes:**    * The operation fails if the specified agent does not exist.    * If any test ID is invalid, the operation is canceled and no changes are made.    * Already assigned tests that are also in the request are ignored.    * Previously assigned tests not included in the request will be removed.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.agents.model.*;
import com.thousandeyes.sdk.agents.TestsAssignmentOnAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TestsAssignmentOnAgentsApi apiInstance = new TestsAssignmentOnAgentsApi(defaultClient);
        String agentId = "281474976710706"; // String | Unique ID for the Enterprise Agent cluster to add new agents to.
        AgentTestsAssignRequest agentTestsAssignRequest = new AgentTestsAssignRequest(); // AgentTestsAssignRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            TestsAssignmentOnAgentsApi.OverwriteTestsRequest request = TestsAssignmentOnAgentsApi.OverwriteTestsRequest.builder()
                .agentId(agentId)
                .agentTestsAssignRequest(agentTestsAssignRequest)
                .aid(aid)
                .build();
            AgentDetails result = apiInstance.overwriteTests(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestsAssignmentOnAgentsApi#overwriteTests");
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
| request | [**OverwriteTestsRequest**](TestsAssignmentOnAgentsApi.md#OverwriteTestsRequest)|-|-|

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

## overwriteTestsWithHttpInfo

> ApiResponse<AgentDetails> overwriteTests overwriteTestsWithHttpInfo(OverwriteTestsRequest)

Overwrite tests assigned to an agent

Replaces all tests assigned to a specific agent with the new set of test IDs provided.  **Important notes:**    * The operation fails if the specified agent does not exist.    * If any test ID is invalid, the operation is canceled and no changes are made.    * Already assigned tests that are also in the request are ignored.    * Previously assigned tests not included in the request will be removed.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.agents.model.*;
import com.thousandeyes.sdk.agents.TestsAssignmentOnAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TestsAssignmentOnAgentsApi apiInstance = new TestsAssignmentOnAgentsApi(defaultClient);
        String agentId = "281474976710706"; // String | Unique ID for the Enterprise Agent cluster to add new agents to.
        AgentTestsAssignRequest agentTestsAssignRequest = new AgentTestsAssignRequest(); // AgentTestsAssignRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            TestsAssignmentOnAgentsApi.OverwriteTestsRequest request = TestsAssignmentOnAgentsApi.OverwriteTestsRequest.builder()
                .agentId(agentId)
                .agentTestsAssignRequest(agentTestsAssignRequest)
                .aid(aid)
                .build();
            ApiResponse<AgentDetails> response = apiInstance.overwriteTestsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TestsAssignmentOnAgentsApi#overwriteTests");
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
| request | [**OverwriteTestsRequest**](TestsAssignmentOnAgentsApi.md#OverwriteTestsRequest)|-|-|

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


<a id="OverwriteTestsRequest"></a>
## OverwriteTestsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **agentId** | **String** | Unique ID for the Enterprise Agent cluster to add new agents to. | |
| **agentTestsAssignRequest** | [**AgentTestsAssignRequest**](AgentTestsAssignRequest.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## unassignTests

> AgentDetails unassignTests(UnassignTestsRequest)

Unassign tests from an agent

Unassigns the specified tests from a specific agent.  **Important notes:**    * The operation fails if the specified agent does not exist.    * If any test ID is invalid, the operation is canceled and no changes are made.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.agents.model.*;
import com.thousandeyes.sdk.agents.TestsAssignmentOnAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TestsAssignmentOnAgentsApi apiInstance = new TestsAssignmentOnAgentsApi(defaultClient);
        String agentId = "281474976710706"; // String | Unique ID for the Enterprise Agent cluster to add new agents to.
        AgentTestsAssignRequest agentTestsAssignRequest = new AgentTestsAssignRequest(); // AgentTestsAssignRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            TestsAssignmentOnAgentsApi.UnassignTestsRequest request = TestsAssignmentOnAgentsApi.UnassignTestsRequest.builder()
                .agentId(agentId)
                .agentTestsAssignRequest(agentTestsAssignRequest)
                .aid(aid)
                .build();
            AgentDetails result = apiInstance.unassignTests(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestsAssignmentOnAgentsApi#unassignTests");
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
| request | [**UnassignTestsRequest**](TestsAssignmentOnAgentsApi.md#UnassignTestsRequest)|-|-|

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

## unassignTestsWithHttpInfo

> ApiResponse<AgentDetails> unassignTests unassignTestsWithHttpInfo(UnassignTestsRequest)

Unassign tests from an agent

Unassigns the specified tests from a specific agent.  **Important notes:**    * The operation fails if the specified agent does not exist.    * If any test ID is invalid, the operation is canceled and no changes are made.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.agents.model.*;
import com.thousandeyes.sdk.agents.TestsAssignmentOnAgentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TestsAssignmentOnAgentsApi apiInstance = new TestsAssignmentOnAgentsApi(defaultClient);
        String agentId = "281474976710706"; // String | Unique ID for the Enterprise Agent cluster to add new agents to.
        AgentTestsAssignRequest agentTestsAssignRequest = new AgentTestsAssignRequest(); // AgentTestsAssignRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            TestsAssignmentOnAgentsApi.UnassignTestsRequest request = TestsAssignmentOnAgentsApi.UnassignTestsRequest.builder()
                .agentId(agentId)
                .agentTestsAssignRequest(agentTestsAssignRequest)
                .aid(aid)
                .build();
            ApiResponse<AgentDetails> response = apiInstance.unassignTestsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TestsAssignmentOnAgentsApi#unassignTests");
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
| request | [**UnassignTestsRequest**](TestsAssignmentOnAgentsApi.md#UnassignTestsRequest)|-|-|

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


<a id="UnassignTestsRequest"></a>
## UnassignTestsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **agentId** | **String** | Unique ID for the Enterprise Agent cluster to add new agents to. | |
| **agentTestsAssignRequest** | [**AgentTestsAssignRequest**](AgentTestsAssignRequest.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |


