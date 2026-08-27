# TestsApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTestVersionHistory**](TestsApi.md#getTestVersionHistory) | **GET** /tests/{testId}/history | Get test version history |
| [**getTestVersionHistoryWithHttpInfo**](TestsApi.md#getTestVersionHistoryWithHttpInfo) | **GET** /tests/{testId}/history | Get test version history |
| [**getTests**](TestsApi.md#getTests) | **GET** /tests | List configured tests |
| [**getTestsWithHttpInfo**](TestsApi.md#getTestsWithHttpInfo) | **GET** /tests | List configured tests |



## getTestVersionHistory

> TestVersionHistoryResponse getTestVersionHistory(GetTestVersionHistoryRequest)

Get test version history

Retrieve the version history of a specific test.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.TestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TestsApi apiInstance = new TestsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        Integer limit = 50; // Integer | The maximum number of version history entries to return. If not specified, the default is 50 or the total number of available versions, whichever is fewer.
        try {
            TestsApi.GetTestVersionHistoryRequest request = TestsApi.GetTestVersionHistoryRequest.builder()
                .testId(testId)
                .aid(aid)
                .limit(limit)
                .build();
            TestVersionHistoryResponse result = apiInstance.getTestVersionHistory(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestsApi#getTestVersionHistory");
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
| request | [**GetTestVersionHistoryRequest**](TestsApi.md#GetTestVersionHistoryRequest)|-|-|

### Return type

[**TestVersionHistoryResponse**](TestVersionHistoryResponse.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |

## getTestVersionHistoryWithHttpInfo

> ApiResponse<TestVersionHistoryResponse> getTestVersionHistory getTestVersionHistoryWithHttpInfo(GetTestVersionHistoryRequest)

Get test version history

Retrieve the version history of a specific test.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.TestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TestsApi apiInstance = new TestsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        Integer limit = 50; // Integer | The maximum number of version history entries to return. If not specified, the default is 50 or the total number of available versions, whichever is fewer.
        try {
            TestsApi.GetTestVersionHistoryRequest request = TestsApi.GetTestVersionHistoryRequest.builder()
                .testId(testId)
                .aid(aid)
                .limit(limit)
                .build();
            ApiResponse<TestVersionHistoryResponse> response = apiInstance.getTestVersionHistoryWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TestsApi#getTestVersionHistory");
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
| request | [**GetTestVersionHistoryRequest**](TestsApi.md#GetTestVersionHistoryRequest)|-|-|

### Return type

ApiResponse<[**TestVersionHistoryResponse**](TestVersionHistoryResponse.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |


<a id="GetTestVersionHistoryRequest"></a>
## GetTestVersionHistoryRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **testId** | **String** | Test ID | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **limit** | **Integer** | The maximum number of version history entries to return. If not specified, the default is 50 or the total number of available versions, whichever is fewer. | [optional] [default to 50] |



## getTests

> Tests getTests(GetTestsRequest)

List configured tests

Returns configured tests and saved events.  **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.TestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TestsApi apiInstance = new TestsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            TestsApi.GetTestsRequest request = TestsApi.GetTestsRequest.builder()
                .aid(aid)
                .build();
            Tests result = apiInstance.getTests(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestsApi#getTests");
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
| request | [**GetTestsRequest**](TestsApi.md#GetTestsRequest)|-|-|

### Return type

[**Tests**](Tests.md)


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

## getTestsWithHttpInfo

> ApiResponse<Tests> getTests getTestsWithHttpInfo(GetTestsRequest)

List configured tests

Returns configured tests and saved events.  **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.TestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TestsApi apiInstance = new TestsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            TestsApi.GetTestsRequest request = TestsApi.GetTestsRequest.builder()
                .aid(aid)
                .build();
            ApiResponse<Tests> response = apiInstance.getTestsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TestsApi#getTests");
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
| request | [**GetTestsRequest**](TestsApi.md#GetTestsRequest)|-|-|

### Return type

ApiResponse<[**Tests**](Tests.md)>


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


<a id="GetTestsRequest"></a>
## GetTestsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |


