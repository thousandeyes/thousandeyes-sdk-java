# HttpServerEndpointScheduledTestsApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createHttpServerEndpointScheduledTest**](HttpServerEndpointScheduledTestsApi.md#createHttpServerEndpointScheduledTest) | **POST** /endpoint/tests/scheduled-tests/http-server | Create HTTP server endpoint scheduled test |
| [**createHttpServerEndpointScheduledTestWithHttpInfo**](HttpServerEndpointScheduledTestsApi.md#createHttpServerEndpointScheduledTestWithHttpInfo) | **POST** /endpoint/tests/scheduled-tests/http-server | Create HTTP server endpoint scheduled test |
| [**deleteHttpServerEndpointScheduledTest**](HttpServerEndpointScheduledTestsApi.md#deleteHttpServerEndpointScheduledTest) | **DELETE** /endpoint/tests/scheduled-tests/http-server/{testId} | Delete HTTP server scheduled test |
| [**deleteHttpServerEndpointScheduledTestWithHttpInfo**](HttpServerEndpointScheduledTestsApi.md#deleteHttpServerEndpointScheduledTestWithHttpInfo) | **DELETE** /endpoint/tests/scheduled-tests/http-server/{testId} | Delete HTTP server scheduled test |
| [**getHttpServerEndpointScheduledTest**](HttpServerEndpointScheduledTestsApi.md#getHttpServerEndpointScheduledTest) | **GET** /endpoint/tests/scheduled-tests/http-server/{testId} | Retrieves HTTP server endpoint scheduled test |
| [**getHttpServerEndpointScheduledTestWithHttpInfo**](HttpServerEndpointScheduledTestsApi.md#getHttpServerEndpointScheduledTestWithHttpInfo) | **GET** /endpoint/tests/scheduled-tests/http-server/{testId} | Retrieves HTTP server endpoint scheduled test |
| [**getHttpServerEndpointScheduledTests**](HttpServerEndpointScheduledTestsApi.md#getHttpServerEndpointScheduledTests) | **GET** /endpoint/tests/scheduled-tests/http-server | List HTTP server endpoint scheduled tests |
| [**getHttpServerEndpointScheduledTestsWithHttpInfo**](HttpServerEndpointScheduledTestsApi.md#getHttpServerEndpointScheduledTestsWithHttpInfo) | **GET** /endpoint/tests/scheduled-tests/http-server | List HTTP server endpoint scheduled tests |
| [**updateHttpServerEndpointScheduledTest**](HttpServerEndpointScheduledTestsApi.md#updateHttpServerEndpointScheduledTest) | **PATCH** /endpoint/tests/scheduled-tests/http-server/{testId} | Update HTTP server endpoint scheduled test |
| [**updateHttpServerEndpointScheduledTestWithHttpInfo**](HttpServerEndpointScheduledTestsApi.md#updateHttpServerEndpointScheduledTestWithHttpInfo) | **PATCH** /endpoint/tests/scheduled-tests/http-server/{testId} | Update HTTP server endpoint scheduled test |



## createHttpServerEndpointScheduledTest

> EndpointHttpServerTest createHttpServerEndpointScheduledTest(CreateHttpServerEndpointScheduledTestRequest)

Create HTTP server endpoint scheduled test

Creates a new HTTP server endpoint test in ThousandEyes, using properties specified in the POST data. Please note that only users with Account Admin privileges have the authorization to create new tests; regular users are restricted from using POST-based methods. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.model.*;
import com.thousandeyes.sdk.endpoint.tests.HttpServerEndpointScheduledTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        HttpServerEndpointScheduledTestsApi apiInstance = new HttpServerEndpointScheduledTestsApi(defaultClient);
        EndpointHttpServerTestRequest endpointHttpServerTestRequest = new EndpointHttpServerTestRequest(); // EndpointHttpServerTestRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            HttpServerEndpointScheduledTestsApi.CreateHttpServerEndpointScheduledTestRequest request = HttpServerEndpointScheduledTestsApi.CreateHttpServerEndpointScheduledTestRequest.builder()
                .endpointHttpServerTestRequest(endpointHttpServerTestRequest)
                .aid(aid)
                .build();
            EndpointHttpServerTest result = apiInstance.createHttpServerEndpointScheduledTest(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HttpServerEndpointScheduledTestsApi#createHttpServerEndpointScheduledTest");
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
| request | [**CreateHttpServerEndpointScheduledTestRequest**](HttpServerEndpointScheduledTestsApi.md#CreateHttpServerEndpointScheduledTestRequest)|-|-|

### Return type

[**EndpointHttpServerTest**](EndpointHttpServerTest.md)


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

## createHttpServerEndpointScheduledTestWithHttpInfo

> ApiResponse<EndpointHttpServerTest> createHttpServerEndpointScheduledTest createHttpServerEndpointScheduledTestWithHttpInfo(CreateHttpServerEndpointScheduledTestRequest)

Create HTTP server endpoint scheduled test

Creates a new HTTP server endpoint test in ThousandEyes, using properties specified in the POST data. Please note that only users with Account Admin privileges have the authorization to create new tests; regular users are restricted from using POST-based methods. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.model.*;
import com.thousandeyes.sdk.endpoint.tests.HttpServerEndpointScheduledTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        HttpServerEndpointScheduledTestsApi apiInstance = new HttpServerEndpointScheduledTestsApi(defaultClient);
        EndpointHttpServerTestRequest endpointHttpServerTestRequest = new EndpointHttpServerTestRequest(); // EndpointHttpServerTestRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            HttpServerEndpointScheduledTestsApi.CreateHttpServerEndpointScheduledTestRequest request = HttpServerEndpointScheduledTestsApi.CreateHttpServerEndpointScheduledTestRequest.builder()
                .endpointHttpServerTestRequest(endpointHttpServerTestRequest)
                .aid(aid)
                .build();
            ApiResponse<EndpointHttpServerTest> response = apiInstance.createHttpServerEndpointScheduledTestWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling HttpServerEndpointScheduledTestsApi#createHttpServerEndpointScheduledTest");
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
| request | [**CreateHttpServerEndpointScheduledTestRequest**](HttpServerEndpointScheduledTestsApi.md#CreateHttpServerEndpointScheduledTestRequest)|-|-|

### Return type

ApiResponse<[**EndpointHttpServerTest**](EndpointHttpServerTest.md)>


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


<a id="CreateHttpServerEndpointScheduledTestRequest"></a>
## CreateHttpServerEndpointScheduledTestRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **endpointHttpServerTestRequest** | [**EndpointHttpServerTestRequest**](EndpointHttpServerTestRequest.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## deleteHttpServerEndpointScheduledTest

> void deleteHttpServerEndpointScheduledTest(DeleteHttpServerEndpointScheduledTestRequest)

Delete HTTP server scheduled test

Deletes an HTTP server endpoint scheduled test.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.model.*;
import com.thousandeyes.sdk.endpoint.tests.HttpServerEndpointScheduledTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        HttpServerEndpointScheduledTestsApi apiInstance = new HttpServerEndpointScheduledTestsApi(defaultClient);
        String testId = "584739201"; // String | Unique ID of endpoint test.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            HttpServerEndpointScheduledTestsApi.DeleteHttpServerEndpointScheduledTestRequest request = HttpServerEndpointScheduledTestsApi.DeleteHttpServerEndpointScheduledTestRequest.builder()
                .testId(testId)
                .aid(aid)
                .build();
            apiInstance.deleteHttpServerEndpointScheduledTest(request);
        } catch (ApiException e) {
            System.err.println("Exception when calling HttpServerEndpointScheduledTestsApi#deleteHttpServerEndpointScheduledTest");
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
| request | [**DeleteHttpServerEndpointScheduledTestRequest**](HttpServerEndpointScheduledTestsApi.md#DeleteHttpServerEndpointScheduledTestRequest)|-|-|

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

## deleteHttpServerEndpointScheduledTestWithHttpInfo

> ApiResponse<Void> deleteHttpServerEndpointScheduledTest deleteHttpServerEndpointScheduledTestWithHttpInfo(DeleteHttpServerEndpointScheduledTestRequest)

Delete HTTP server scheduled test

Deletes an HTTP server endpoint scheduled test.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.model.*;
import com.thousandeyes.sdk.endpoint.tests.HttpServerEndpointScheduledTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        HttpServerEndpointScheduledTestsApi apiInstance = new HttpServerEndpointScheduledTestsApi(defaultClient);
        String testId = "584739201"; // String | Unique ID of endpoint test.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            HttpServerEndpointScheduledTestsApi.DeleteHttpServerEndpointScheduledTestRequest request = HttpServerEndpointScheduledTestsApi.DeleteHttpServerEndpointScheduledTestRequest.builder()
                .testId(testId)
                .aid(aid)
                .build();
            ApiResponse<Void> response = apiInstance.deleteHttpServerEndpointScheduledTestWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling HttpServerEndpointScheduledTestsApi#deleteHttpServerEndpointScheduledTest");
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
| request | [**DeleteHttpServerEndpointScheduledTestRequest**](HttpServerEndpointScheduledTestsApi.md#DeleteHttpServerEndpointScheduledTestRequest)|-|-|

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


<a id="DeleteHttpServerEndpointScheduledTestRequest"></a>
## DeleteHttpServerEndpointScheduledTestRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **testId** | **String** | Unique ID of endpoint test. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getHttpServerEndpointScheduledTest

> EndpointHttpServerTest getHttpServerEndpointScheduledTest(GetHttpServerEndpointScheduledTestRequest)

Retrieves HTTP server endpoint scheduled test

Retrieves details of an HTTP Server endpoint scheduled test.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.model.*;
import com.thousandeyes.sdk.endpoint.tests.HttpServerEndpointScheduledTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        HttpServerEndpointScheduledTestsApi apiInstance = new HttpServerEndpointScheduledTestsApi(defaultClient);
        String testId = "584739201"; // String | Unique ID of endpoint test.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            HttpServerEndpointScheduledTestsApi.GetHttpServerEndpointScheduledTestRequest request = HttpServerEndpointScheduledTestsApi.GetHttpServerEndpointScheduledTestRequest.builder()
                .testId(testId)
                .aid(aid)
                .build();
            EndpointHttpServerTest result = apiInstance.getHttpServerEndpointScheduledTest(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HttpServerEndpointScheduledTestsApi#getHttpServerEndpointScheduledTest");
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
| request | [**GetHttpServerEndpointScheduledTestRequest**](HttpServerEndpointScheduledTestsApi.md#GetHttpServerEndpointScheduledTestRequest)|-|-|

### Return type

[**EndpointHttpServerTest**](EndpointHttpServerTest.md)


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

## getHttpServerEndpointScheduledTestWithHttpInfo

> ApiResponse<EndpointHttpServerTest> getHttpServerEndpointScheduledTest getHttpServerEndpointScheduledTestWithHttpInfo(GetHttpServerEndpointScheduledTestRequest)

Retrieves HTTP server endpoint scheduled test

Retrieves details of an HTTP Server endpoint scheduled test.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.model.*;
import com.thousandeyes.sdk.endpoint.tests.HttpServerEndpointScheduledTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        HttpServerEndpointScheduledTestsApi apiInstance = new HttpServerEndpointScheduledTestsApi(defaultClient);
        String testId = "584739201"; // String | Unique ID of endpoint test.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            HttpServerEndpointScheduledTestsApi.GetHttpServerEndpointScheduledTestRequest request = HttpServerEndpointScheduledTestsApi.GetHttpServerEndpointScheduledTestRequest.builder()
                .testId(testId)
                .aid(aid)
                .build();
            ApiResponse<EndpointHttpServerTest> response = apiInstance.getHttpServerEndpointScheduledTestWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling HttpServerEndpointScheduledTestsApi#getHttpServerEndpointScheduledTest");
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
| request | [**GetHttpServerEndpointScheduledTestRequest**](HttpServerEndpointScheduledTestsApi.md#GetHttpServerEndpointScheduledTestRequest)|-|-|

### Return type

ApiResponse<[**EndpointHttpServerTest**](EndpointHttpServerTest.md)>


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


<a id="GetHttpServerEndpointScheduledTestRequest"></a>
## GetHttpServerEndpointScheduledTestRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **testId** | **String** | Unique ID of endpoint test. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getHttpServerEndpointScheduledTests

> EndpointHttpServerTests getHttpServerEndpointScheduledTests(GetHttpServerEndpointScheduledTestsRequest)

List HTTP server endpoint scheduled tests

Returns a list of agent to server endpoint scheduled tests configured in ThousandEyes. This list does not contain saved events.  **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.model.*;
import com.thousandeyes.sdk.endpoint.tests.HttpServerEndpointScheduledTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        HttpServerEndpointScheduledTestsApi apiInstance = new HttpServerEndpointScheduledTestsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            HttpServerEndpointScheduledTestsApi.GetHttpServerEndpointScheduledTestsRequest request = HttpServerEndpointScheduledTestsApi.GetHttpServerEndpointScheduledTestsRequest.builder()
                .aid(aid)
                .build();
            EndpointHttpServerTests result = apiInstance.getHttpServerEndpointScheduledTests(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HttpServerEndpointScheduledTestsApi#getHttpServerEndpointScheduledTests");
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
| request | [**GetHttpServerEndpointScheduledTestsRequest**](HttpServerEndpointScheduledTestsApi.md#GetHttpServerEndpointScheduledTestsRequest)|-|-|

### Return type

[**EndpointHttpServerTests**](EndpointHttpServerTests.md)


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

## getHttpServerEndpointScheduledTestsWithHttpInfo

> ApiResponse<EndpointHttpServerTests> getHttpServerEndpointScheduledTests getHttpServerEndpointScheduledTestsWithHttpInfo(GetHttpServerEndpointScheduledTestsRequest)

List HTTP server endpoint scheduled tests

Returns a list of agent to server endpoint scheduled tests configured in ThousandEyes. This list does not contain saved events.  **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.model.*;
import com.thousandeyes.sdk.endpoint.tests.HttpServerEndpointScheduledTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        HttpServerEndpointScheduledTestsApi apiInstance = new HttpServerEndpointScheduledTestsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            HttpServerEndpointScheduledTestsApi.GetHttpServerEndpointScheduledTestsRequest request = HttpServerEndpointScheduledTestsApi.GetHttpServerEndpointScheduledTestsRequest.builder()
                .aid(aid)
                .build();
            ApiResponse<EndpointHttpServerTests> response = apiInstance.getHttpServerEndpointScheduledTestsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling HttpServerEndpointScheduledTestsApi#getHttpServerEndpointScheduledTests");
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
| request | [**GetHttpServerEndpointScheduledTestsRequest**](HttpServerEndpointScheduledTestsApi.md#GetHttpServerEndpointScheduledTestsRequest)|-|-|

### Return type

ApiResponse<[**EndpointHttpServerTests**](EndpointHttpServerTests.md)>


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


<a id="GetHttpServerEndpointScheduledTestsRequest"></a>
## GetHttpServerEndpointScheduledTestsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## updateHttpServerEndpointScheduledTest

> EndpointHttpServerTest updateHttpServerEndpointScheduledTest(UpdateHttpServerEndpointScheduledTestRequest)

Update HTTP server endpoint scheduled test

Updates an HTTP server scheduled test. Includes support for  enabling and disabling the test.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.model.*;
import com.thousandeyes.sdk.endpoint.tests.HttpServerEndpointScheduledTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        HttpServerEndpointScheduledTestsApi apiInstance = new HttpServerEndpointScheduledTestsApi(defaultClient);
        String testId = "584739201"; // String | Unique ID of endpoint test.
        EndpointHttpTestUpdate endpointHttpTestUpdate = new EndpointHttpTestUpdate(); // EndpointHttpTestUpdate | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            HttpServerEndpointScheduledTestsApi.UpdateHttpServerEndpointScheduledTestRequest request = HttpServerEndpointScheduledTestsApi.UpdateHttpServerEndpointScheduledTestRequest.builder()
                .testId(testId)
                .endpointHttpTestUpdate(endpointHttpTestUpdate)
                .aid(aid)
                .build();
            EndpointHttpServerTest result = apiInstance.updateHttpServerEndpointScheduledTest(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HttpServerEndpointScheduledTestsApi#updateHttpServerEndpointScheduledTest");
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
| request | [**UpdateHttpServerEndpointScheduledTestRequest**](HttpServerEndpointScheduledTestsApi.md#UpdateHttpServerEndpointScheduledTestRequest)|-|-|

### Return type

[**EndpointHttpServerTest**](EndpointHttpServerTest.md)


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

## updateHttpServerEndpointScheduledTestWithHttpInfo

> ApiResponse<EndpointHttpServerTest> updateHttpServerEndpointScheduledTest updateHttpServerEndpointScheduledTestWithHttpInfo(UpdateHttpServerEndpointScheduledTestRequest)

Update HTTP server endpoint scheduled test

Updates an HTTP server scheduled test. Includes support for  enabling and disabling the test.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.model.*;
import com.thousandeyes.sdk.endpoint.tests.HttpServerEndpointScheduledTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        HttpServerEndpointScheduledTestsApi apiInstance = new HttpServerEndpointScheduledTestsApi(defaultClient);
        String testId = "584739201"; // String | Unique ID of endpoint test.
        EndpointHttpTestUpdate endpointHttpTestUpdate = new EndpointHttpTestUpdate(); // EndpointHttpTestUpdate | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            HttpServerEndpointScheduledTestsApi.UpdateHttpServerEndpointScheduledTestRequest request = HttpServerEndpointScheduledTestsApi.UpdateHttpServerEndpointScheduledTestRequest.builder()
                .testId(testId)
                .endpointHttpTestUpdate(endpointHttpTestUpdate)
                .aid(aid)
                .build();
            ApiResponse<EndpointHttpServerTest> response = apiInstance.updateHttpServerEndpointScheduledTestWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling HttpServerEndpointScheduledTestsApi#updateHttpServerEndpointScheduledTest");
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
| request | [**UpdateHttpServerEndpointScheduledTestRequest**](HttpServerEndpointScheduledTestsApi.md#UpdateHttpServerEndpointScheduledTestRequest)|-|-|

### Return type

ApiResponse<[**EndpointHttpServerTest**](EndpointHttpServerTest.md)>


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


<a id="UpdateHttpServerEndpointScheduledTestRequest"></a>
## UpdateHttpServerEndpointScheduledTestRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **testId** | **String** | Unique ID of endpoint test. | |
| **endpointHttpTestUpdate** | [**EndpointHttpTestUpdate**](EndpointHttpTestUpdate.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |


