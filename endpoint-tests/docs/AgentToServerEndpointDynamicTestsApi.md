# AgentToServerEndpointDynamicTestsApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bulkDeleteAgentToServerEndpointDynamicTests**](AgentToServerEndpointDynamicTestsApi.md#bulkDeleteAgentToServerEndpointDynamicTests) | **DELETE** /endpoint/tests/dynamic-tests/agent-to-server | Bulk delete agent to server endpoint dynamic tests |
| [**bulkDeleteAgentToServerEndpointDynamicTestsWithHttpInfo**](AgentToServerEndpointDynamicTestsApi.md#bulkDeleteAgentToServerEndpointDynamicTestsWithHttpInfo) | **DELETE** /endpoint/tests/dynamic-tests/agent-to-server | Bulk delete agent to server endpoint dynamic tests |
| [**createAgentToServerEndpointDynamicTest**](AgentToServerEndpointDynamicTestsApi.md#createAgentToServerEndpointDynamicTest) | **POST** /endpoint/tests/dynamic-tests/agent-to-server | Create endpoint dynamic test |
| [**createAgentToServerEndpointDynamicTestWithHttpInfo**](AgentToServerEndpointDynamicTestsApi.md#createAgentToServerEndpointDynamicTestWithHttpInfo) | **POST** /endpoint/tests/dynamic-tests/agent-to-server | Create endpoint dynamic test |
| [**deleteAgentToServerEndpointDynamicTest**](AgentToServerEndpointDynamicTestsApi.md#deleteAgentToServerEndpointDynamicTest) | **DELETE** /endpoint/tests/dynamic-tests/agent-to-server/{testId} | Delete agent to server dynamic test |
| [**deleteAgentToServerEndpointDynamicTestWithHttpInfo**](AgentToServerEndpointDynamicTestsApi.md#deleteAgentToServerEndpointDynamicTestWithHttpInfo) | **DELETE** /endpoint/tests/dynamic-tests/agent-to-server/{testId} | Delete agent to server dynamic test |
| [**getAgentToServerEndpointDynamicTest**](AgentToServerEndpointDynamicTestsApi.md#getAgentToServerEndpointDynamicTest) | **GET** /endpoint/tests/dynamic-tests/agent-to-server/{testId} | Retrieve endpoint dynamic test |
| [**getAgentToServerEndpointDynamicTestWithHttpInfo**](AgentToServerEndpointDynamicTestsApi.md#getAgentToServerEndpointDynamicTestWithHttpInfo) | **GET** /endpoint/tests/dynamic-tests/agent-to-server/{testId} | Retrieve endpoint dynamic test |
| [**getAgentToServerEndpointDynamicTests**](AgentToServerEndpointDynamicTestsApi.md#getAgentToServerEndpointDynamicTests) | **GET** /endpoint/tests/dynamic-tests/agent-to-server | List endpoint dynamic tests |
| [**getAgentToServerEndpointDynamicTestsWithHttpInfo**](AgentToServerEndpointDynamicTestsApi.md#getAgentToServerEndpointDynamicTestsWithHttpInfo) | **GET** /endpoint/tests/dynamic-tests/agent-to-server | List endpoint dynamic tests |
| [**updateAgentToServerEndpointDynamicTest**](AgentToServerEndpointDynamicTestsApi.md#updateAgentToServerEndpointDynamicTest) | **PATCH** /endpoint/tests/dynamic-tests/agent-to-server/{testId} | Update agent to server dynamic test |
| [**updateAgentToServerEndpointDynamicTestWithHttpInfo**](AgentToServerEndpointDynamicTestsApi.md#updateAgentToServerEndpointDynamicTestWithHttpInfo) | **PATCH** /endpoint/tests/dynamic-tests/agent-to-server/{testId} | Update agent to server dynamic test |



## bulkDeleteAgentToServerEndpointDynamicTests

> EndpointTestBulkDeleteResult bulkDeleteAgentToServerEndpointDynamicTests(BulkDeleteAgentToServerEndpointDynamicTestsRequest)

Bulk delete agent to server endpoint dynamic tests

Deletes multiple agent to server endpoint dynamic tests in one all-or-nothing operation. Missing test IDs are ignored.  Before any tests are deleted, all found tests are validated to ensure they belong to this test family and can be deleted by the caller or, for partner-owned tests, by the owning partner. If any validation check fails, no tests are deleted. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.model.*;
import com.thousandeyes.sdk.endpoint.tests.AgentToServerEndpointDynamicTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToServerEndpointDynamicTestsApi apiInstance = new AgentToServerEndpointDynamicTestsApi(defaultClient);
        Set<String> testId = Arrays.asList(); // Set<String> | Endpoint test IDs to delete. Specify this parameter once for each test ID. The request must not contain more than the maximum number of tests supported by the operation. If the limit is exceeded, the `400 Bad Request` response includes the supported maximum in `maximumTestsSupported`.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AgentToServerEndpointDynamicTestsApi.BulkDeleteAgentToServerEndpointDynamicTestsRequest request = AgentToServerEndpointDynamicTestsApi.BulkDeleteAgentToServerEndpointDynamicTestsRequest.builder()
                .testId(testId)
                .aid(aid)
                .build();
            EndpointTestBulkDeleteResult result = apiInstance.bulkDeleteAgentToServerEndpointDynamicTests(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToServerEndpointDynamicTestsApi#bulkDeleteAgentToServerEndpointDynamicTests");
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
| request | [**BulkDeleteAgentToServerEndpointDynamicTestsRequest**](AgentToServerEndpointDynamicTestsApi.md#BulkDeleteAgentToServerEndpointDynamicTestsRequest)|-|-|

### Return type

[**EndpointTestBulkDeleteResult**](EndpointTestBulkDeleteResult.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The IDs of tests successfully deleted. |  -  |
| **400** | The request is invalid. Missing test IDs are ignored. Each test that is found must belong to the endpoint test family addressed by the operation and must be deletable by the caller or owning partner. If any validation check fails, no tests are deleted. When the request exceeds the bulk-delete limit, the response includes the maximum number of tests supported by the operation. |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |

## bulkDeleteAgentToServerEndpointDynamicTestsWithHttpInfo

> ApiResponse<EndpointTestBulkDeleteResult> bulkDeleteAgentToServerEndpointDynamicTests bulkDeleteAgentToServerEndpointDynamicTestsWithHttpInfo(BulkDeleteAgentToServerEndpointDynamicTestsRequest)

Bulk delete agent to server endpoint dynamic tests

Deletes multiple agent to server endpoint dynamic tests in one all-or-nothing operation. Missing test IDs are ignored.  Before any tests are deleted, all found tests are validated to ensure they belong to this test family and can be deleted by the caller or, for partner-owned tests, by the owning partner. If any validation check fails, no tests are deleted. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.model.*;
import com.thousandeyes.sdk.endpoint.tests.AgentToServerEndpointDynamicTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToServerEndpointDynamicTestsApi apiInstance = new AgentToServerEndpointDynamicTestsApi(defaultClient);
        Set<String> testId = Arrays.asList(); // Set<String> | Endpoint test IDs to delete. Specify this parameter once for each test ID. The request must not contain more than the maximum number of tests supported by the operation. If the limit is exceeded, the `400 Bad Request` response includes the supported maximum in `maximumTestsSupported`.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AgentToServerEndpointDynamicTestsApi.BulkDeleteAgentToServerEndpointDynamicTestsRequest request = AgentToServerEndpointDynamicTestsApi.BulkDeleteAgentToServerEndpointDynamicTestsRequest.builder()
                .testId(testId)
                .aid(aid)
                .build();
            ApiResponse<EndpointTestBulkDeleteResult> response = apiInstance.bulkDeleteAgentToServerEndpointDynamicTestsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToServerEndpointDynamicTestsApi#bulkDeleteAgentToServerEndpointDynamicTests");
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
| request | [**BulkDeleteAgentToServerEndpointDynamicTestsRequest**](AgentToServerEndpointDynamicTestsApi.md#BulkDeleteAgentToServerEndpointDynamicTestsRequest)|-|-|

### Return type

ApiResponse<[**EndpointTestBulkDeleteResult**](EndpointTestBulkDeleteResult.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The IDs of tests successfully deleted. |  -  |
| **400** | The request is invalid. Missing test IDs are ignored. Each test that is found must belong to the endpoint test family addressed by the operation and must be deletable by the caller or owning partner. If any validation check fails, no tests are deleted. When the request exceeds the bulk-delete limit, the response includes the maximum number of tests supported by the operation. |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |


<a id="BulkDeleteAgentToServerEndpointDynamicTestsRequest"></a>
## BulkDeleteAgentToServerEndpointDynamicTestsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **testId** | [**Set&lt;String&gt;**](String.md) | Endpoint test IDs to delete. Specify this parameter once for each test ID. The request must not contain more than the maximum number of tests supported by the operation. If the limit is exceeded, the &#x60;400 Bad Request&#x60; response includes the supported maximum in &#x60;maximumTestsSupported&#x60;. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## createAgentToServerEndpointDynamicTest

> DynamicTest createAgentToServerEndpointDynamicTest(CreateAgentToServerEndpointDynamicTestRequest)

Create endpoint dynamic test

Create a new endpoint dynamic test in ThousandEyes using properties specified in the POST data. Please note that only Account Admins have the authorization to create new tests; regular users are restricted from using POST-based methods. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.model.*;
import com.thousandeyes.sdk.endpoint.tests.AgentToServerEndpointDynamicTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToServerEndpointDynamicTestsApi apiInstance = new AgentToServerEndpointDynamicTestsApi(defaultClient);
        DynamicTestRequest dynamicTestRequest = new DynamicTestRequest(); // DynamicTestRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AgentToServerEndpointDynamicTestsApi.CreateAgentToServerEndpointDynamicTestRequest request = AgentToServerEndpointDynamicTestsApi.CreateAgentToServerEndpointDynamicTestRequest.builder()
                .dynamicTestRequest(dynamicTestRequest)
                .aid(aid)
                .build();
            DynamicTest result = apiInstance.createAgentToServerEndpointDynamicTest(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToServerEndpointDynamicTestsApi#createAgentToServerEndpointDynamicTest");
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
| request | [**CreateAgentToServerEndpointDynamicTestRequest**](AgentToServerEndpointDynamicTestsApi.md#CreateAgentToServerEndpointDynamicTestRequest)|-|-|

### Return type

[**DynamicTest**](DynamicTest.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

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

## createAgentToServerEndpointDynamicTestWithHttpInfo

> ApiResponse<DynamicTest> createAgentToServerEndpointDynamicTest createAgentToServerEndpointDynamicTestWithHttpInfo(CreateAgentToServerEndpointDynamicTestRequest)

Create endpoint dynamic test

Create a new endpoint dynamic test in ThousandEyes using properties specified in the POST data. Please note that only Account Admins have the authorization to create new tests; regular users are restricted from using POST-based methods. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.model.*;
import com.thousandeyes.sdk.endpoint.tests.AgentToServerEndpointDynamicTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToServerEndpointDynamicTestsApi apiInstance = new AgentToServerEndpointDynamicTestsApi(defaultClient);
        DynamicTestRequest dynamicTestRequest = new DynamicTestRequest(); // DynamicTestRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AgentToServerEndpointDynamicTestsApi.CreateAgentToServerEndpointDynamicTestRequest request = AgentToServerEndpointDynamicTestsApi.CreateAgentToServerEndpointDynamicTestRequest.builder()
                .dynamicTestRequest(dynamicTestRequest)
                .aid(aid)
                .build();
            ApiResponse<DynamicTest> response = apiInstance.createAgentToServerEndpointDynamicTestWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToServerEndpointDynamicTestsApi#createAgentToServerEndpointDynamicTest");
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
| request | [**CreateAgentToServerEndpointDynamicTestRequest**](AgentToServerEndpointDynamicTestsApi.md#CreateAgentToServerEndpointDynamicTestRequest)|-|-|

### Return type

ApiResponse<[**DynamicTest**](DynamicTest.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

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


<a id="CreateAgentToServerEndpointDynamicTestRequest"></a>
## CreateAgentToServerEndpointDynamicTestRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **dynamicTestRequest** | [**DynamicTestRequest**](DynamicTestRequest.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## deleteAgentToServerEndpointDynamicTest

> void deleteAgentToServerEndpointDynamicTest(DeleteAgentToServerEndpointDynamicTestRequest)

Delete agent to server dynamic test

Deletes an agent to server endpoint dynamic test.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.model.*;
import com.thousandeyes.sdk.endpoint.tests.AgentToServerEndpointDynamicTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToServerEndpointDynamicTestsApi apiInstance = new AgentToServerEndpointDynamicTestsApi(defaultClient);
        String testId = "584739201"; // String | Unique ID of endpoint test.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AgentToServerEndpointDynamicTestsApi.DeleteAgentToServerEndpointDynamicTestRequest request = AgentToServerEndpointDynamicTestsApi.DeleteAgentToServerEndpointDynamicTestRequest.builder()
                .testId(testId)
                .aid(aid)
                .build();
            apiInstance.deleteAgentToServerEndpointDynamicTest(request);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToServerEndpointDynamicTestsApi#deleteAgentToServerEndpointDynamicTest");
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
| request | [**DeleteAgentToServerEndpointDynamicTestRequest**](AgentToServerEndpointDynamicTestsApi.md#DeleteAgentToServerEndpointDynamicTestRequest)|-|-|

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
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |

## deleteAgentToServerEndpointDynamicTestWithHttpInfo

> ApiResponse<Void> deleteAgentToServerEndpointDynamicTest deleteAgentToServerEndpointDynamicTestWithHttpInfo(DeleteAgentToServerEndpointDynamicTestRequest)

Delete agent to server dynamic test

Deletes an agent to server endpoint dynamic test.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.model.*;
import com.thousandeyes.sdk.endpoint.tests.AgentToServerEndpointDynamicTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToServerEndpointDynamicTestsApi apiInstance = new AgentToServerEndpointDynamicTestsApi(defaultClient);
        String testId = "584739201"; // String | Unique ID of endpoint test.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AgentToServerEndpointDynamicTestsApi.DeleteAgentToServerEndpointDynamicTestRequest request = AgentToServerEndpointDynamicTestsApi.DeleteAgentToServerEndpointDynamicTestRequest.builder()
                .testId(testId)
                .aid(aid)
                .build();
            ApiResponse<Void> response = apiInstance.deleteAgentToServerEndpointDynamicTestWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToServerEndpointDynamicTestsApi#deleteAgentToServerEndpointDynamicTest");
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
| request | [**DeleteAgentToServerEndpointDynamicTestRequest**](AgentToServerEndpointDynamicTestsApi.md#DeleteAgentToServerEndpointDynamicTestRequest)|-|-|

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
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |


<a id="DeleteAgentToServerEndpointDynamicTestRequest"></a>
## DeleteAgentToServerEndpointDynamicTestRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **testId** | **String** | Unique ID of endpoint test. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getAgentToServerEndpointDynamicTest

> DynamicTest getAgentToServerEndpointDynamicTest(GetAgentToServerEndpointDynamicTestRequest)

Retrieve endpoint dynamic test

Returns details of an endpoint dynamic test, including test type, name, intervals, targets.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.model.*;
import com.thousandeyes.sdk.endpoint.tests.AgentToServerEndpointDynamicTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToServerEndpointDynamicTestsApi apiInstance = new AgentToServerEndpointDynamicTestsApi(defaultClient);
        String testId = "584739201"; // String | Unique ID of endpoint test.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AgentToServerEndpointDynamicTestsApi.GetAgentToServerEndpointDynamicTestRequest request = AgentToServerEndpointDynamicTestsApi.GetAgentToServerEndpointDynamicTestRequest.builder()
                .testId(testId)
                .aid(aid)
                .build();
            DynamicTest result = apiInstance.getAgentToServerEndpointDynamicTest(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToServerEndpointDynamicTestsApi#getAgentToServerEndpointDynamicTest");
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
| request | [**GetAgentToServerEndpointDynamicTestRequest**](AgentToServerEndpointDynamicTestsApi.md#GetAgentToServerEndpointDynamicTestRequest)|-|-|

### Return type

[**DynamicTest**](DynamicTest.md)


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

## getAgentToServerEndpointDynamicTestWithHttpInfo

> ApiResponse<DynamicTest> getAgentToServerEndpointDynamicTest getAgentToServerEndpointDynamicTestWithHttpInfo(GetAgentToServerEndpointDynamicTestRequest)

Retrieve endpoint dynamic test

Returns details of an endpoint dynamic test, including test type, name, intervals, targets.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.model.*;
import com.thousandeyes.sdk.endpoint.tests.AgentToServerEndpointDynamicTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToServerEndpointDynamicTestsApi apiInstance = new AgentToServerEndpointDynamicTestsApi(defaultClient);
        String testId = "584739201"; // String | Unique ID of endpoint test.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AgentToServerEndpointDynamicTestsApi.GetAgentToServerEndpointDynamicTestRequest request = AgentToServerEndpointDynamicTestsApi.GetAgentToServerEndpointDynamicTestRequest.builder()
                .testId(testId)
                .aid(aid)
                .build();
            ApiResponse<DynamicTest> response = apiInstance.getAgentToServerEndpointDynamicTestWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToServerEndpointDynamicTestsApi#getAgentToServerEndpointDynamicTest");
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
| request | [**GetAgentToServerEndpointDynamicTestRequest**](AgentToServerEndpointDynamicTestsApi.md#GetAgentToServerEndpointDynamicTestRequest)|-|-|

### Return type

ApiResponse<[**DynamicTest**](DynamicTest.md)>


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


<a id="GetAgentToServerEndpointDynamicTestRequest"></a>
## GetAgentToServerEndpointDynamicTestRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **testId** | **String** | Unique ID of endpoint test. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getAgentToServerEndpointDynamicTests

> DynamicTests getAgentToServerEndpointDynamicTests(GetAgentToServerEndpointDynamicTestsRequest)

List endpoint dynamic tests

Returns a list of all endpoint dynamic tests configured in ThousandEyes. This list does not contain saved events.  **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.model.*;
import com.thousandeyes.sdk.endpoint.tests.AgentToServerEndpointDynamicTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToServerEndpointDynamicTestsApi apiInstance = new AgentToServerEndpointDynamicTestsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AgentToServerEndpointDynamicTestsApi.GetAgentToServerEndpointDynamicTestsRequest request = AgentToServerEndpointDynamicTestsApi.GetAgentToServerEndpointDynamicTestsRequest.builder()
                .aid(aid)
                .build();
            DynamicTests result = apiInstance.getAgentToServerEndpointDynamicTests(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToServerEndpointDynamicTestsApi#getAgentToServerEndpointDynamicTests");
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
| request | [**GetAgentToServerEndpointDynamicTestsRequest**](AgentToServerEndpointDynamicTestsApi.md#GetAgentToServerEndpointDynamicTestsRequest)|-|-|

### Return type

[**DynamicTests**](DynamicTests.md)


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
| **500** | Internal server error |  -  |
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |

## getAgentToServerEndpointDynamicTestsWithHttpInfo

> ApiResponse<DynamicTests> getAgentToServerEndpointDynamicTests getAgentToServerEndpointDynamicTestsWithHttpInfo(GetAgentToServerEndpointDynamicTestsRequest)

List endpoint dynamic tests

Returns a list of all endpoint dynamic tests configured in ThousandEyes. This list does not contain saved events.  **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.model.*;
import com.thousandeyes.sdk.endpoint.tests.AgentToServerEndpointDynamicTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToServerEndpointDynamicTestsApi apiInstance = new AgentToServerEndpointDynamicTestsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AgentToServerEndpointDynamicTestsApi.GetAgentToServerEndpointDynamicTestsRequest request = AgentToServerEndpointDynamicTestsApi.GetAgentToServerEndpointDynamicTestsRequest.builder()
                .aid(aid)
                .build();
            ApiResponse<DynamicTests> response = apiInstance.getAgentToServerEndpointDynamicTestsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToServerEndpointDynamicTestsApi#getAgentToServerEndpointDynamicTests");
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
| request | [**GetAgentToServerEndpointDynamicTestsRequest**](AgentToServerEndpointDynamicTestsApi.md#GetAgentToServerEndpointDynamicTestsRequest)|-|-|

### Return type

ApiResponse<[**DynamicTests**](DynamicTests.md)>


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
| **500** | Internal server error |  -  |
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |


<a id="GetAgentToServerEndpointDynamicTestsRequest"></a>
## GetAgentToServerEndpointDynamicTestsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## updateAgentToServerEndpointDynamicTest

> DynamicTest updateAgentToServerEndpointDynamicTest(UpdateAgentToServerEndpointDynamicTestRequest)

Update agent to server dynamic test

Updates an agent to server endpoint dynamic test. Includes support for  enabling and disabling the test.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.model.*;
import com.thousandeyes.sdk.endpoint.tests.AgentToServerEndpointDynamicTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToServerEndpointDynamicTestsApi apiInstance = new AgentToServerEndpointDynamicTestsApi(defaultClient);
        String testId = "584739201"; // String | Unique ID of endpoint test.
        EndpointDynamicTestUpdate endpointDynamicTestUpdate = new EndpointDynamicTestUpdate(); // EndpointDynamicTestUpdate | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AgentToServerEndpointDynamicTestsApi.UpdateAgentToServerEndpointDynamicTestRequest request = AgentToServerEndpointDynamicTestsApi.UpdateAgentToServerEndpointDynamicTestRequest.builder()
                .testId(testId)
                .endpointDynamicTestUpdate(endpointDynamicTestUpdate)
                .aid(aid)
                .build();
            DynamicTest result = apiInstance.updateAgentToServerEndpointDynamicTest(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToServerEndpointDynamicTestsApi#updateAgentToServerEndpointDynamicTest");
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
| request | [**UpdateAgentToServerEndpointDynamicTestRequest**](AgentToServerEndpointDynamicTestsApi.md#UpdateAgentToServerEndpointDynamicTestRequest)|-|-|

### Return type

[**DynamicTest**](DynamicTest.md)


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

## updateAgentToServerEndpointDynamicTestWithHttpInfo

> ApiResponse<DynamicTest> updateAgentToServerEndpointDynamicTest updateAgentToServerEndpointDynamicTestWithHttpInfo(UpdateAgentToServerEndpointDynamicTestRequest)

Update agent to server dynamic test

Updates an agent to server endpoint dynamic test. Includes support for  enabling and disabling the test.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.model.*;
import com.thousandeyes.sdk.endpoint.tests.AgentToServerEndpointDynamicTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToServerEndpointDynamicTestsApi apiInstance = new AgentToServerEndpointDynamicTestsApi(defaultClient);
        String testId = "584739201"; // String | Unique ID of endpoint test.
        EndpointDynamicTestUpdate endpointDynamicTestUpdate = new EndpointDynamicTestUpdate(); // EndpointDynamicTestUpdate | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AgentToServerEndpointDynamicTestsApi.UpdateAgentToServerEndpointDynamicTestRequest request = AgentToServerEndpointDynamicTestsApi.UpdateAgentToServerEndpointDynamicTestRequest.builder()
                .testId(testId)
                .endpointDynamicTestUpdate(endpointDynamicTestUpdate)
                .aid(aid)
                .build();
            ApiResponse<DynamicTest> response = apiInstance.updateAgentToServerEndpointDynamicTestWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToServerEndpointDynamicTestsApi#updateAgentToServerEndpointDynamicTest");
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
| request | [**UpdateAgentToServerEndpointDynamicTestRequest**](AgentToServerEndpointDynamicTestsApi.md#UpdateAgentToServerEndpointDynamicTestRequest)|-|-|

### Return type

ApiResponse<[**DynamicTest**](DynamicTest.md)>


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


<a id="UpdateAgentToServerEndpointDynamicTestRequest"></a>
## UpdateAgentToServerEndpointDynamicTestRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **testId** | **String** | Unique ID of endpoint test. | |
| **endpointDynamicTestUpdate** | [**EndpointDynamicTestUpdate**](EndpointDynamicTestUpdate.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |


