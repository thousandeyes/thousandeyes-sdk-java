# AgentToAgentTestsApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAgentToAgentTest**](AgentToAgentTestsApi.md#createAgentToAgentTest) | **POST** /tests/agent-to-agent | Create Agent to Agent test |
| [**createAgentToAgentTestWithHttpInfo**](AgentToAgentTestsApi.md#createAgentToAgentTestWithHttpInfo) | **POST** /tests/agent-to-agent | Create Agent to Agent test |
| [**deleteAgentToAgentTest**](AgentToAgentTestsApi.md#deleteAgentToAgentTest) | **DELETE** /tests/agent-to-agent/{testId} | Delete Agent to Agent test |
| [**deleteAgentToAgentTestWithHttpInfo**](AgentToAgentTestsApi.md#deleteAgentToAgentTestWithHttpInfo) | **DELETE** /tests/agent-to-agent/{testId} | Delete Agent to Agent test |
| [**getAgentToAgentTest**](AgentToAgentTestsApi.md#getAgentToAgentTest) | **GET** /tests/agent-to-agent/{testId} | Get Agent to Agent test |
| [**getAgentToAgentTestWithHttpInfo**](AgentToAgentTestsApi.md#getAgentToAgentTestWithHttpInfo) | **GET** /tests/agent-to-agent/{testId} | Get Agent to Agent test |
| [**getAgentToAgentTests**](AgentToAgentTestsApi.md#getAgentToAgentTests) | **GET** /tests/agent-to-agent | List Agent to Agent tests |
| [**getAgentToAgentTestsWithHttpInfo**](AgentToAgentTestsApi.md#getAgentToAgentTestsWithHttpInfo) | **GET** /tests/agent-to-agent | List Agent to Agent tests |
| [**updateAgentToAgentTest**](AgentToAgentTestsApi.md#updateAgentToAgentTest) | **PUT** /tests/agent-to-agent/{testId} | Update Agent to Agent test |
| [**updateAgentToAgentTestWithHttpInfo**](AgentToAgentTestsApi.md#updateAgentToAgentTestWithHttpInfo) | **PUT** /tests/agent-to-agent/{testId} | Update Agent to Agent test |



## createAgentToAgentTest

> AgentToAgentTestResponse createAgentToAgentTest(CreateAgentToAgentTestRequest)

Create Agent to Agent test

Creates a new Agent to Agent test. This method requires Account Admin permissions.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.AgentToAgentTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToAgentTestsApi apiInstance = new AgentToAgentTestsApi(defaultClient);
        AgentToAgentTestRequest agentToAgentTestRequest = new AgentToAgentTestRequest(); // AgentToAgentTestRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandTestOptions> expand = Arrays.asList(); // List<ExpandTestOptions> | Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the `agents` sub-resource, they need to pass the `?expand=agent` query.
        try {
            AgentToAgentTestsApi.CreateAgentToAgentTestRequest request = AgentToAgentTestsApi.CreateAgentToAgentTestRequest.builder()
                .agentToAgentTestRequest(agentToAgentTestRequest)
                .aid(aid)
                .expand(expand)
                .build();
            AgentToAgentTestResponse result = apiInstance.createAgentToAgentTest(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToAgentTestsApi#createAgentToAgentTest");
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
| request | [**CreateAgentToAgentTestRequest**](AgentToAgentTestsApi.md#CreateAgentToAgentTestRequest)|-|-|

### Return type

[**AgentToAgentTestResponse**](AgentToAgentTestResponse.md)


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

## createAgentToAgentTestWithHttpInfo

> ApiResponse<AgentToAgentTestResponse> createAgentToAgentTest createAgentToAgentTestWithHttpInfo(CreateAgentToAgentTestRequest)

Create Agent to Agent test

Creates a new Agent to Agent test. This method requires Account Admin permissions.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.AgentToAgentTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToAgentTestsApi apiInstance = new AgentToAgentTestsApi(defaultClient);
        AgentToAgentTestRequest agentToAgentTestRequest = new AgentToAgentTestRequest(); // AgentToAgentTestRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandTestOptions> expand = Arrays.asList(); // List<ExpandTestOptions> | Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the `agents` sub-resource, they need to pass the `?expand=agent` query.
        try {
            AgentToAgentTestsApi.CreateAgentToAgentTestRequest request = AgentToAgentTestsApi.CreateAgentToAgentTestRequest.builder()
                .agentToAgentTestRequest(agentToAgentTestRequest)
                .aid(aid)
                .expand(expand)
                .build();
            ApiResponse<AgentToAgentTestResponse> response = apiInstance.createAgentToAgentTestWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToAgentTestsApi#createAgentToAgentTest");
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
| request | [**CreateAgentToAgentTestRequest**](AgentToAgentTestsApi.md#CreateAgentToAgentTestRequest)|-|-|

### Return type

ApiResponse<[**AgentToAgentTestResponse**](AgentToAgentTestResponse.md)>


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


<a id="CreateAgentToAgentTestRequest"></a>
## CreateAgentToAgentTestRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **agentToAgentTestRequest** | [**AgentToAgentTestRequest**](AgentToAgentTestRequest.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;ExpandTestOptions&gt;**](ExpandTestOptions.md) | Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. | [optional] |



## deleteAgentToAgentTest

> void deleteAgentToAgentTest(DeleteAgentToAgentTestRequest)

Delete Agent to Agent test

Deletes the specified Agent to Agent test. This method requires Account Admin permissions.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.AgentToAgentTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToAgentTestsApi apiInstance = new AgentToAgentTestsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AgentToAgentTestsApi.DeleteAgentToAgentTestRequest request = AgentToAgentTestsApi.DeleteAgentToAgentTestRequest.builder()
                .testId(testId)
                .aid(aid)
                .build();
            apiInstance.deleteAgentToAgentTest(request);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToAgentTestsApi#deleteAgentToAgentTest");
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
| request | [**DeleteAgentToAgentTestRequest**](AgentToAgentTestsApi.md#DeleteAgentToAgentTestRequest)|-|-|

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

## deleteAgentToAgentTestWithHttpInfo

> ApiResponse<Void> deleteAgentToAgentTest deleteAgentToAgentTestWithHttpInfo(DeleteAgentToAgentTestRequest)

Delete Agent to Agent test

Deletes the specified Agent to Agent test. This method requires Account Admin permissions.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.AgentToAgentTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToAgentTestsApi apiInstance = new AgentToAgentTestsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AgentToAgentTestsApi.DeleteAgentToAgentTestRequest request = AgentToAgentTestsApi.DeleteAgentToAgentTestRequest.builder()
                .testId(testId)
                .aid(aid)
                .build();
            ApiResponse<Void> response = apiInstance.deleteAgentToAgentTestWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToAgentTestsApi#deleteAgentToAgentTest");
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
| request | [**DeleteAgentToAgentTestRequest**](AgentToAgentTestsApi.md#DeleteAgentToAgentTestRequest)|-|-|

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


<a id="DeleteAgentToAgentTestRequest"></a>
## DeleteAgentToAgentTestRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **testId** | **String** | Test ID | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getAgentToAgentTest

> AgentToAgentTestResponse getAgentToAgentTest(GetAgentToAgentTestRequest)

Get Agent to Agent test

Returns details for a Agent to Agent test, including name, intervals, targets, alert rules and agents.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.AgentToAgentTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToAgentTestsApi apiInstance = new AgentToAgentTestsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        String versionId = "1234"; // String | The unique identifier for a specific version of the test settings. If provided, returns the test configuration as it existed at that version. To retrieve available version IDs, use the `/tests/{testId}/history` endpoint. If not specified, the current version of the test settings is returned.
        List<ExpandTestOptions> expand = Arrays.asList(); // List<ExpandTestOptions> | Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the `agents` sub-resource, they need to pass the `?expand=agent` query.
        try {
            AgentToAgentTestsApi.GetAgentToAgentTestRequest request = AgentToAgentTestsApi.GetAgentToAgentTestRequest.builder()
                .testId(testId)
                .aid(aid)
                .versionId(versionId)
                .expand(expand)
                .build();
            AgentToAgentTestResponse result = apiInstance.getAgentToAgentTest(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToAgentTestsApi#getAgentToAgentTest");
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
| request | [**GetAgentToAgentTestRequest**](AgentToAgentTestsApi.md#GetAgentToAgentTestRequest)|-|-|

### Return type

[**AgentToAgentTestResponse**](AgentToAgentTestResponse.md)


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

## getAgentToAgentTestWithHttpInfo

> ApiResponse<AgentToAgentTestResponse> getAgentToAgentTest getAgentToAgentTestWithHttpInfo(GetAgentToAgentTestRequest)

Get Agent to Agent test

Returns details for a Agent to Agent test, including name, intervals, targets, alert rules and agents.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.AgentToAgentTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToAgentTestsApi apiInstance = new AgentToAgentTestsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        String versionId = "1234"; // String | The unique identifier for a specific version of the test settings. If provided, returns the test configuration as it existed at that version. To retrieve available version IDs, use the `/tests/{testId}/history` endpoint. If not specified, the current version of the test settings is returned.
        List<ExpandTestOptions> expand = Arrays.asList(); // List<ExpandTestOptions> | Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the `agents` sub-resource, they need to pass the `?expand=agent` query.
        try {
            AgentToAgentTestsApi.GetAgentToAgentTestRequest request = AgentToAgentTestsApi.GetAgentToAgentTestRequest.builder()
                .testId(testId)
                .aid(aid)
                .versionId(versionId)
                .expand(expand)
                .build();
            ApiResponse<AgentToAgentTestResponse> response = apiInstance.getAgentToAgentTestWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToAgentTestsApi#getAgentToAgentTest");
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
| request | [**GetAgentToAgentTestRequest**](AgentToAgentTestsApi.md#GetAgentToAgentTestRequest)|-|-|

### Return type

ApiResponse<[**AgentToAgentTestResponse**](AgentToAgentTestResponse.md)>


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


<a id="GetAgentToAgentTestRequest"></a>
## GetAgentToAgentTestRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **testId** | **String** | Test ID | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **versionId** | **String** | The unique identifier for a specific version of the test settings. If provided, returns the test configuration as it existed at that version. To retrieve available version IDs, use the &#x60;/tests/{testId}/history&#x60; endpoint. If not specified, the current version of the test settings is returned. | [optional] |
| **expand** | [**List&lt;ExpandTestOptions&gt;**](ExpandTestOptions.md) | Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. | [optional] |



## getAgentToAgentTests

> AgentToAgentTests getAgentToAgentTests(GetAgentToAgentTestsRequest)

List Agent to Agent tests

Returns a list of Agent to Agent tests and saved events.  **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.AgentToAgentTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToAgentTestsApi apiInstance = new AgentToAgentTestsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AgentToAgentTestsApi.GetAgentToAgentTestsRequest request = AgentToAgentTestsApi.GetAgentToAgentTestsRequest.builder()
                .aid(aid)
                .build();
            AgentToAgentTests result = apiInstance.getAgentToAgentTests(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToAgentTestsApi#getAgentToAgentTests");
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
| request | [**GetAgentToAgentTestsRequest**](AgentToAgentTestsApi.md#GetAgentToAgentTestsRequest)|-|-|

### Return type

[**AgentToAgentTests**](AgentToAgentTests.md)


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

## getAgentToAgentTestsWithHttpInfo

> ApiResponse<AgentToAgentTests> getAgentToAgentTests getAgentToAgentTestsWithHttpInfo(GetAgentToAgentTestsRequest)

List Agent to Agent tests

Returns a list of Agent to Agent tests and saved events.  **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.AgentToAgentTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToAgentTestsApi apiInstance = new AgentToAgentTestsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AgentToAgentTestsApi.GetAgentToAgentTestsRequest request = AgentToAgentTestsApi.GetAgentToAgentTestsRequest.builder()
                .aid(aid)
                .build();
            ApiResponse<AgentToAgentTests> response = apiInstance.getAgentToAgentTestsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToAgentTestsApi#getAgentToAgentTests");
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
| request | [**GetAgentToAgentTestsRequest**](AgentToAgentTestsApi.md#GetAgentToAgentTestsRequest)|-|-|

### Return type

ApiResponse<[**AgentToAgentTests**](AgentToAgentTests.md)>


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


<a id="GetAgentToAgentTestsRequest"></a>
## GetAgentToAgentTestsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## updateAgentToAgentTest

> AgentToAgentTestResponse updateAgentToAgentTest(UpdateAgentToAgentTestRequest)

Update Agent to Agent test

Updates a Agent to Agent test. Shared tests have limited updating capabilities. Only account-specific configurations may be updated, namely: alert rules, alert suppression windows, labels, tags. This method requires Account Admin permissions.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.AgentToAgentTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToAgentTestsApi apiInstance = new AgentToAgentTestsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        AgentToAgentTestRequest agentToAgentTestRequest = new AgentToAgentTestRequest(); // AgentToAgentTestRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandTestOptions> expand = Arrays.asList(); // List<ExpandTestOptions> | Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the `agents` sub-resource, they need to pass the `?expand=agent` query.
        try {
            AgentToAgentTestsApi.UpdateAgentToAgentTestRequest request = AgentToAgentTestsApi.UpdateAgentToAgentTestRequest.builder()
                .testId(testId)
                .agentToAgentTestRequest(agentToAgentTestRequest)
                .aid(aid)
                .expand(expand)
                .build();
            AgentToAgentTestResponse result = apiInstance.updateAgentToAgentTest(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToAgentTestsApi#updateAgentToAgentTest");
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
| request | [**UpdateAgentToAgentTestRequest**](AgentToAgentTestsApi.md#UpdateAgentToAgentTestRequest)|-|-|

### Return type

[**AgentToAgentTestResponse**](AgentToAgentTestResponse.md)


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

## updateAgentToAgentTestWithHttpInfo

> ApiResponse<AgentToAgentTestResponse> updateAgentToAgentTest updateAgentToAgentTestWithHttpInfo(UpdateAgentToAgentTestRequest)

Update Agent to Agent test

Updates a Agent to Agent test. Shared tests have limited updating capabilities. Only account-specific configurations may be updated, namely: alert rules, alert suppression windows, labels, tags. This method requires Account Admin permissions.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.AgentToAgentTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AgentToAgentTestsApi apiInstance = new AgentToAgentTestsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        AgentToAgentTestRequest agentToAgentTestRequest = new AgentToAgentTestRequest(); // AgentToAgentTestRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandTestOptions> expand = Arrays.asList(); // List<ExpandTestOptions> | Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the `agents` sub-resource, they need to pass the `?expand=agent` query.
        try {
            AgentToAgentTestsApi.UpdateAgentToAgentTestRequest request = AgentToAgentTestsApi.UpdateAgentToAgentTestRequest.builder()
                .testId(testId)
                .agentToAgentTestRequest(agentToAgentTestRequest)
                .aid(aid)
                .expand(expand)
                .build();
            ApiResponse<AgentToAgentTestResponse> response = apiInstance.updateAgentToAgentTestWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToAgentTestsApi#updateAgentToAgentTest");
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
| request | [**UpdateAgentToAgentTestRequest**](AgentToAgentTestsApi.md#UpdateAgentToAgentTestRequest)|-|-|

### Return type

ApiResponse<[**AgentToAgentTestResponse**](AgentToAgentTestResponse.md)>


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


<a id="UpdateAgentToAgentTestRequest"></a>
## UpdateAgentToAgentTestRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **testId** | **String** | Test ID | |
| **agentToAgentTestRequest** | [**AgentToAgentTestRequest**](AgentToAgentTestRequest.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;ExpandTestOptions&gt;**](ExpandTestOptions.md) | Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. | [optional] |


