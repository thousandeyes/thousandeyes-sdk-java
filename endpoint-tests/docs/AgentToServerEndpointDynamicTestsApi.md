# AgentToServerEndpointDynamicTestsApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
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



## createAgentToServerEndpointDynamicTest

> DynamicTest createAgentToServerEndpointDynamicTest(dynamicTestRequest, aid)

Create endpoint dynamic test

Create a new endpoint dynamic test in ThousandEyes using properties specified in the POST data. Please note that only Account Admins have the authorization to create new tests; regular users are restricted from using POST-based methods. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.models.*;
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
            DynamicTest result = apiInstance.createAgentToServerEndpointDynamicTest(dynamicTestRequest, aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dynamicTestRequest** | [**DynamicTestRequest**](DynamicTestRequest.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

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

> ApiResponse<DynamicTest> createAgentToServerEndpointDynamicTest createAgentToServerEndpointDynamicTestWithHttpInfo(dynamicTestRequest, aid)

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
import com.thousandeyes.sdk.endpoint.models.*;
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
            ApiResponse<DynamicTest> response = apiInstance.createAgentToServerEndpointDynamicTestWithHttpInfo(dynamicTestRequest, aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dynamicTestRequest** | [**DynamicTestRequest**](DynamicTestRequest.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

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


## deleteAgentToServerEndpointDynamicTest

> void deleteAgentToServerEndpointDynamicTest(testId, aid)

Delete agent to server dynamic test

Deletes an agent to server endpoint dynamic test.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.models.*;
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
            apiInstance.deleteAgentToServerEndpointDynamicTest(testId, aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **testId** | **String**| Unique ID of endpoint test. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

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

> ApiResponse<Void> deleteAgentToServerEndpointDynamicTest deleteAgentToServerEndpointDynamicTestWithHttpInfo(testId, aid)

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
import com.thousandeyes.sdk.endpoint.models.*;
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
            ApiResponse<Void> response = apiInstance.deleteAgentToServerEndpointDynamicTestWithHttpInfo(testId, aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **testId** | **String**| Unique ID of endpoint test. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

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


## getAgentToServerEndpointDynamicTest

> DynamicTest getAgentToServerEndpointDynamicTest(testId, aid)

Retrieve endpoint dynamic test

Returns details of an endpoint dynamic test, including test type, name, intervals, targets.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.models.*;
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
            DynamicTest result = apiInstance.getAgentToServerEndpointDynamicTest(testId, aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **testId** | **String**| Unique ID of endpoint test. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

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

> ApiResponse<DynamicTest> getAgentToServerEndpointDynamicTest getAgentToServerEndpointDynamicTestWithHttpInfo(testId, aid)

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
import com.thousandeyes.sdk.endpoint.models.*;
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
            ApiResponse<DynamicTest> response = apiInstance.getAgentToServerEndpointDynamicTestWithHttpInfo(testId, aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **testId** | **String**| Unique ID of endpoint test. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

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


## getAgentToServerEndpointDynamicTests

> DynamicTests getAgentToServerEndpointDynamicTests(aid)

List endpoint dynamic tests

Returns a list of all endpoint dynamic tests configured in ThousandEyes. This list does not contain saved events.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.models.*;
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
            DynamicTests result = apiInstance.getAgentToServerEndpointDynamicTests(aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

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

> ApiResponse<DynamicTests> getAgentToServerEndpointDynamicTests getAgentToServerEndpointDynamicTestsWithHttpInfo(aid)

List endpoint dynamic tests

Returns a list of all endpoint dynamic tests configured in ThousandEyes. This list does not contain saved events.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.models.*;
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
            ApiResponse<DynamicTests> response = apiInstance.getAgentToServerEndpointDynamicTestsWithHttpInfo(aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

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


## updateAgentToServerEndpointDynamicTest

> DynamicTest updateAgentToServerEndpointDynamicTest(testId, endpointDynamicTestUpdate, aid)

Update agent to server dynamic test

Updates an agent to server endpoint dynamic test. Includes support for  enabling and disabling the test.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.models.*;
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
            DynamicTest result = apiInstance.updateAgentToServerEndpointDynamicTest(testId, endpointDynamicTestUpdate, aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **testId** | **String**| Unique ID of endpoint test. | |
| **endpointDynamicTestUpdate** | [**EndpointDynamicTestUpdate**](EndpointDynamicTestUpdate.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

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

> ApiResponse<DynamicTest> updateAgentToServerEndpointDynamicTest updateAgentToServerEndpointDynamicTestWithHttpInfo(testId, endpointDynamicTestUpdate, aid)

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
import com.thousandeyes.sdk.endpoint.models.*;
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
            ApiResponse<DynamicTest> response = apiInstance.updateAgentToServerEndpointDynamicTestWithHttpInfo(testId, endpointDynamicTestUpdate, aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **testId** | **String**| Unique ID of endpoint test. | |
| **endpointDynamicTestUpdate** | [**EndpointDynamicTestUpdate**](EndpointDynamicTestUpdate.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

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

