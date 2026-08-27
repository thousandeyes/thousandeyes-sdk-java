# AgentToServerEndpointScheduledTestsApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAgentToServerEndpointScheduledTest**](AgentToServerEndpointScheduledTestsApi.md#createAgentToServerEndpointScheduledTest) | **POST** /endpoint/tests/scheduled-tests/agent-to-server | Creates agent to server endpoint scheduled test |
| [**createAgentToServerEndpointScheduledTestWithHttpInfo**](AgentToServerEndpointScheduledTestsApi.md#createAgentToServerEndpointScheduledTestWithHttpInfo) | **POST** /endpoint/tests/scheduled-tests/agent-to-server | Creates agent to server endpoint scheduled test |
| [**deleteAgentToServerEndpointScheduledTest**](AgentToServerEndpointScheduledTestsApi.md#deleteAgentToServerEndpointScheduledTest) | **DELETE** /endpoint/tests/scheduled-tests/agent-to-server/{testId} | Delete agent to server scheduled test |
| [**deleteAgentToServerEndpointScheduledTestWithHttpInfo**](AgentToServerEndpointScheduledTestsApi.md#deleteAgentToServerEndpointScheduledTestWithHttpInfo) | **DELETE** /endpoint/tests/scheduled-tests/agent-to-server/{testId} | Delete agent to server scheduled test |
| [**getAgentToServerEndpointScheduledTest**](AgentToServerEndpointScheduledTestsApi.md#getAgentToServerEndpointScheduledTest) | **GET** /endpoint/tests/scheduled-tests/agent-to-server/{testId} | Retrieve agent to server endpoint scheduled test |
| [**getAgentToServerEndpointScheduledTestWithHttpInfo**](AgentToServerEndpointScheduledTestsApi.md#getAgentToServerEndpointScheduledTestWithHttpInfo) | **GET** /endpoint/tests/scheduled-tests/agent-to-server/{testId} | Retrieve agent to server endpoint scheduled test |
| [**getAgentToServerEndpointScheduledTests**](AgentToServerEndpointScheduledTestsApi.md#getAgentToServerEndpointScheduledTests) | **GET** /endpoint/tests/scheduled-tests/agent-to-server | List agent to server endpoint scheduled tests |
| [**getAgentToServerEndpointScheduledTestsWithHttpInfo**](AgentToServerEndpointScheduledTestsApi.md#getAgentToServerEndpointScheduledTestsWithHttpInfo) | **GET** /endpoint/tests/scheduled-tests/agent-to-server | List agent to server endpoint scheduled tests |
| [**updateAgentToServerEndpointScheduledTest**](AgentToServerEndpointScheduledTestsApi.md#updateAgentToServerEndpointScheduledTest) | **PATCH** /endpoint/tests/scheduled-tests/agent-to-server/{testId} | Update agent to server endpoint scheduled test |
| [**updateAgentToServerEndpointScheduledTestWithHttpInfo**](AgentToServerEndpointScheduledTestsApi.md#updateAgentToServerEndpointScheduledTestWithHttpInfo) | **PATCH** /endpoint/tests/scheduled-tests/agent-to-server/{testId} | Update agent to server endpoint scheduled test |



## createAgentToServerEndpointScheduledTest

> EndpointAgentToServerTest createAgentToServerEndpointScheduledTest(CreateAgentToServerEndpointScheduledTestRequest)

Creates agent to server endpoint scheduled test

Creates a new endpoint test in ThousandEyes using properties specified in the POST data. Please note that only Account Admins have the authorization to create new tests; regular users are restricted from using POST-based methods. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.model.*;
import com.thousandeyes.sdk.endpoint.tests.AgentToServerEndpointScheduledTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToServerEndpointScheduledTestsApi apiInstance = new AgentToServerEndpointScheduledTestsApi(defaultClient);
        EndpointAgentToServerTestRequest endpointAgentToServerTestRequest = new EndpointAgentToServerTestRequest(); // EndpointAgentToServerTestRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AgentToServerEndpointScheduledTestsApi.CreateAgentToServerEndpointScheduledTestRequest request = AgentToServerEndpointScheduledTestsApi.CreateAgentToServerEndpointScheduledTestRequest.builder()
                .endpointAgentToServerTestRequest(endpointAgentToServerTestRequest)
                .aid(aid)
                .build();
            EndpointAgentToServerTest result = apiInstance.createAgentToServerEndpointScheduledTest(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToServerEndpointScheduledTestsApi#createAgentToServerEndpointScheduledTest");
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
| request | [**CreateAgentToServerEndpointScheduledTestRequest**](AgentToServerEndpointScheduledTestsApi.md#CreateAgentToServerEndpointScheduledTestRequest)|-|-|

### Return type

[**EndpointAgentToServerTest**](EndpointAgentToServerTest.md)


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

## createAgentToServerEndpointScheduledTestWithHttpInfo

> ApiResponse<EndpointAgentToServerTest> createAgentToServerEndpointScheduledTest createAgentToServerEndpointScheduledTestWithHttpInfo(CreateAgentToServerEndpointScheduledTestRequest)

Creates agent to server endpoint scheduled test

Creates a new endpoint test in ThousandEyes using properties specified in the POST data. Please note that only Account Admins have the authorization to create new tests; regular users are restricted from using POST-based methods. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.model.*;
import com.thousandeyes.sdk.endpoint.tests.AgentToServerEndpointScheduledTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToServerEndpointScheduledTestsApi apiInstance = new AgentToServerEndpointScheduledTestsApi(defaultClient);
        EndpointAgentToServerTestRequest endpointAgentToServerTestRequest = new EndpointAgentToServerTestRequest(); // EndpointAgentToServerTestRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AgentToServerEndpointScheduledTestsApi.CreateAgentToServerEndpointScheduledTestRequest request = AgentToServerEndpointScheduledTestsApi.CreateAgentToServerEndpointScheduledTestRequest.builder()
                .endpointAgentToServerTestRequest(endpointAgentToServerTestRequest)
                .aid(aid)
                .build();
            ApiResponse<EndpointAgentToServerTest> response = apiInstance.createAgentToServerEndpointScheduledTestWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToServerEndpointScheduledTestsApi#createAgentToServerEndpointScheduledTest");
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
| request | [**CreateAgentToServerEndpointScheduledTestRequest**](AgentToServerEndpointScheduledTestsApi.md#CreateAgentToServerEndpointScheduledTestRequest)|-|-|

### Return type

ApiResponse<[**EndpointAgentToServerTest**](EndpointAgentToServerTest.md)>


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


<a id="CreateAgentToServerEndpointScheduledTestRequest"></a>
## CreateAgentToServerEndpointScheduledTestRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **endpointAgentToServerTestRequest** | [**EndpointAgentToServerTestRequest**](EndpointAgentToServerTestRequest.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## deleteAgentToServerEndpointScheduledTest

> void deleteAgentToServerEndpointScheduledTest(DeleteAgentToServerEndpointScheduledTestRequest)

Delete agent to server scheduled test

Deletes an agent to server endpoint scheduled test.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.model.*;
import com.thousandeyes.sdk.endpoint.tests.AgentToServerEndpointScheduledTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToServerEndpointScheduledTestsApi apiInstance = new AgentToServerEndpointScheduledTestsApi(defaultClient);
        String testId = "584739201"; // String | Unique ID of endpoint test.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AgentToServerEndpointScheduledTestsApi.DeleteAgentToServerEndpointScheduledTestRequest request = AgentToServerEndpointScheduledTestsApi.DeleteAgentToServerEndpointScheduledTestRequest.builder()
                .testId(testId)
                .aid(aid)
                .build();
            apiInstance.deleteAgentToServerEndpointScheduledTest(request);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToServerEndpointScheduledTestsApi#deleteAgentToServerEndpointScheduledTest");
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
| request | [**DeleteAgentToServerEndpointScheduledTestRequest**](AgentToServerEndpointScheduledTestsApi.md#DeleteAgentToServerEndpointScheduledTestRequest)|-|-|

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

## deleteAgentToServerEndpointScheduledTestWithHttpInfo

> ApiResponse<Void> deleteAgentToServerEndpointScheduledTest deleteAgentToServerEndpointScheduledTestWithHttpInfo(DeleteAgentToServerEndpointScheduledTestRequest)

Delete agent to server scheduled test

Deletes an agent to server endpoint scheduled test.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.model.*;
import com.thousandeyes.sdk.endpoint.tests.AgentToServerEndpointScheduledTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToServerEndpointScheduledTestsApi apiInstance = new AgentToServerEndpointScheduledTestsApi(defaultClient);
        String testId = "584739201"; // String | Unique ID of endpoint test.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AgentToServerEndpointScheduledTestsApi.DeleteAgentToServerEndpointScheduledTestRequest request = AgentToServerEndpointScheduledTestsApi.DeleteAgentToServerEndpointScheduledTestRequest.builder()
                .testId(testId)
                .aid(aid)
                .build();
            ApiResponse<Void> response = apiInstance.deleteAgentToServerEndpointScheduledTestWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToServerEndpointScheduledTestsApi#deleteAgentToServerEndpointScheduledTest");
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
| request | [**DeleteAgentToServerEndpointScheduledTestRequest**](AgentToServerEndpointScheduledTestsApi.md#DeleteAgentToServerEndpointScheduledTestRequest)|-|-|

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


<a id="DeleteAgentToServerEndpointScheduledTestRequest"></a>
## DeleteAgentToServerEndpointScheduledTestRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **testId** | **String** | Unique ID of endpoint test. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getAgentToServerEndpointScheduledTest

> EndpointAgentToServerTest getAgentToServerEndpointScheduledTest(GetAgentToServerEndpointScheduledTestRequest)

Retrieve agent to server endpoint scheduled test

Retrieves details of an agent to server endpoint scheduled test.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.model.*;
import com.thousandeyes.sdk.endpoint.tests.AgentToServerEndpointScheduledTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToServerEndpointScheduledTestsApi apiInstance = new AgentToServerEndpointScheduledTestsApi(defaultClient);
        String testId = "584739201"; // String | Unique ID of endpoint test.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AgentToServerEndpointScheduledTestsApi.GetAgentToServerEndpointScheduledTestRequest request = AgentToServerEndpointScheduledTestsApi.GetAgentToServerEndpointScheduledTestRequest.builder()
                .testId(testId)
                .aid(aid)
                .build();
            EndpointAgentToServerTest result = apiInstance.getAgentToServerEndpointScheduledTest(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToServerEndpointScheduledTestsApi#getAgentToServerEndpointScheduledTest");
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
| request | [**GetAgentToServerEndpointScheduledTestRequest**](AgentToServerEndpointScheduledTestsApi.md#GetAgentToServerEndpointScheduledTestRequest)|-|-|

### Return type

[**EndpointAgentToServerTest**](EndpointAgentToServerTest.md)


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

## getAgentToServerEndpointScheduledTestWithHttpInfo

> ApiResponse<EndpointAgentToServerTest> getAgentToServerEndpointScheduledTest getAgentToServerEndpointScheduledTestWithHttpInfo(GetAgentToServerEndpointScheduledTestRequest)

Retrieve agent to server endpoint scheduled test

Retrieves details of an agent to server endpoint scheduled test.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.model.*;
import com.thousandeyes.sdk.endpoint.tests.AgentToServerEndpointScheduledTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToServerEndpointScheduledTestsApi apiInstance = new AgentToServerEndpointScheduledTestsApi(defaultClient);
        String testId = "584739201"; // String | Unique ID of endpoint test.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AgentToServerEndpointScheduledTestsApi.GetAgentToServerEndpointScheduledTestRequest request = AgentToServerEndpointScheduledTestsApi.GetAgentToServerEndpointScheduledTestRequest.builder()
                .testId(testId)
                .aid(aid)
                .build();
            ApiResponse<EndpointAgentToServerTest> response = apiInstance.getAgentToServerEndpointScheduledTestWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToServerEndpointScheduledTestsApi#getAgentToServerEndpointScheduledTest");
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
| request | [**GetAgentToServerEndpointScheduledTestRequest**](AgentToServerEndpointScheduledTestsApi.md#GetAgentToServerEndpointScheduledTestRequest)|-|-|

### Return type

ApiResponse<[**EndpointAgentToServerTest**](EndpointAgentToServerTest.md)>


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


<a id="GetAgentToServerEndpointScheduledTestRequest"></a>
## GetAgentToServerEndpointScheduledTestRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **testId** | **String** | Unique ID of endpoint test. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getAgentToServerEndpointScheduledTests

> EndpointAgentToServerTests getAgentToServerEndpointScheduledTests(GetAgentToServerEndpointScheduledTestsRequest)

List agent to server endpoint scheduled tests

Returns a list of all agent to server endpoint scheduled tests configured in ThousandEyes. This list does not contain saved events.  **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.model.*;
import com.thousandeyes.sdk.endpoint.tests.AgentToServerEndpointScheduledTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToServerEndpointScheduledTestsApi apiInstance = new AgentToServerEndpointScheduledTestsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AgentToServerEndpointScheduledTestsApi.GetAgentToServerEndpointScheduledTestsRequest request = AgentToServerEndpointScheduledTestsApi.GetAgentToServerEndpointScheduledTestsRequest.builder()
                .aid(aid)
                .build();
            EndpointAgentToServerTests result = apiInstance.getAgentToServerEndpointScheduledTests(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToServerEndpointScheduledTestsApi#getAgentToServerEndpointScheduledTests");
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
| request | [**GetAgentToServerEndpointScheduledTestsRequest**](AgentToServerEndpointScheduledTestsApi.md#GetAgentToServerEndpointScheduledTestsRequest)|-|-|

### Return type

[**EndpointAgentToServerTests**](EndpointAgentToServerTests.md)


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

## getAgentToServerEndpointScheduledTestsWithHttpInfo

> ApiResponse<EndpointAgentToServerTests> getAgentToServerEndpointScheduledTests getAgentToServerEndpointScheduledTestsWithHttpInfo(GetAgentToServerEndpointScheduledTestsRequest)

List agent to server endpoint scheduled tests

Returns a list of all agent to server endpoint scheduled tests configured in ThousandEyes. This list does not contain saved events.  **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.model.*;
import com.thousandeyes.sdk.endpoint.tests.AgentToServerEndpointScheduledTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToServerEndpointScheduledTestsApi apiInstance = new AgentToServerEndpointScheduledTestsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AgentToServerEndpointScheduledTestsApi.GetAgentToServerEndpointScheduledTestsRequest request = AgentToServerEndpointScheduledTestsApi.GetAgentToServerEndpointScheduledTestsRequest.builder()
                .aid(aid)
                .build();
            ApiResponse<EndpointAgentToServerTests> response = apiInstance.getAgentToServerEndpointScheduledTestsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToServerEndpointScheduledTestsApi#getAgentToServerEndpointScheduledTests");
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
| request | [**GetAgentToServerEndpointScheduledTestsRequest**](AgentToServerEndpointScheduledTestsApi.md#GetAgentToServerEndpointScheduledTestsRequest)|-|-|

### Return type

ApiResponse<[**EndpointAgentToServerTests**](EndpointAgentToServerTests.md)>


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


<a id="GetAgentToServerEndpointScheduledTestsRequest"></a>
## GetAgentToServerEndpointScheduledTestsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## updateAgentToServerEndpointScheduledTest

> EndpointAgentToServerTest updateAgentToServerEndpointScheduledTest(UpdateAgentToServerEndpointScheduledTestRequest)

Update agent to server endpoint scheduled test

Updates an agent to server scheduled test. Includes support for  enabling and disabling the test.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.model.*;
import com.thousandeyes.sdk.endpoint.tests.AgentToServerEndpointScheduledTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToServerEndpointScheduledTestsApi apiInstance = new AgentToServerEndpointScheduledTestsApi(defaultClient);
        String testId = "584739201"; // String | Unique ID of endpoint test.
        EndpointNetworkTestUpdate endpointNetworkTestUpdate = new EndpointNetworkTestUpdate(); // EndpointNetworkTestUpdate | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AgentToServerEndpointScheduledTestsApi.UpdateAgentToServerEndpointScheduledTestRequest request = AgentToServerEndpointScheduledTestsApi.UpdateAgentToServerEndpointScheduledTestRequest.builder()
                .testId(testId)
                .endpointNetworkTestUpdate(endpointNetworkTestUpdate)
                .aid(aid)
                .build();
            EndpointAgentToServerTest result = apiInstance.updateAgentToServerEndpointScheduledTest(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToServerEndpointScheduledTestsApi#updateAgentToServerEndpointScheduledTest");
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
| request | [**UpdateAgentToServerEndpointScheduledTestRequest**](AgentToServerEndpointScheduledTestsApi.md#UpdateAgentToServerEndpointScheduledTestRequest)|-|-|

### Return type

[**EndpointAgentToServerTest**](EndpointAgentToServerTest.md)


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

## updateAgentToServerEndpointScheduledTestWithHttpInfo

> ApiResponse<EndpointAgentToServerTest> updateAgentToServerEndpointScheduledTest updateAgentToServerEndpointScheduledTestWithHttpInfo(UpdateAgentToServerEndpointScheduledTestRequest)

Update agent to server endpoint scheduled test

Updates an agent to server scheduled test. Includes support for  enabling and disabling the test.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.model.*;
import com.thousandeyes.sdk.endpoint.tests.AgentToServerEndpointScheduledTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToServerEndpointScheduledTestsApi apiInstance = new AgentToServerEndpointScheduledTestsApi(defaultClient);
        String testId = "584739201"; // String | Unique ID of endpoint test.
        EndpointNetworkTestUpdate endpointNetworkTestUpdate = new EndpointNetworkTestUpdate(); // EndpointNetworkTestUpdate | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AgentToServerEndpointScheduledTestsApi.UpdateAgentToServerEndpointScheduledTestRequest request = AgentToServerEndpointScheduledTestsApi.UpdateAgentToServerEndpointScheduledTestRequest.builder()
                .testId(testId)
                .endpointNetworkTestUpdate(endpointNetworkTestUpdate)
                .aid(aid)
                .build();
            ApiResponse<EndpointAgentToServerTest> response = apiInstance.updateAgentToServerEndpointScheduledTestWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToServerEndpointScheduledTestsApi#updateAgentToServerEndpointScheduledTest");
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
| request | [**UpdateAgentToServerEndpointScheduledTestRequest**](AgentToServerEndpointScheduledTestsApi.md#UpdateAgentToServerEndpointScheduledTestRequest)|-|-|

### Return type

ApiResponse<[**EndpointAgentToServerTest**](EndpointAgentToServerTest.md)>


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


<a id="UpdateAgentToServerEndpointScheduledTestRequest"></a>
## UpdateAgentToServerEndpointScheduledTestRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **testId** | **String** | Unique ID of endpoint test. | |
| **endpointNetworkTestUpdate** | [**EndpointNetworkTestUpdate**](EndpointNetworkTestUpdate.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |


