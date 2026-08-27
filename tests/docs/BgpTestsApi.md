# BgpTestsApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBgpTest**](BgpTestsApi.md#createBgpTest) | **POST** /tests/bgp | Create BGP test |
| [**createBgpTestWithHttpInfo**](BgpTestsApi.md#createBgpTestWithHttpInfo) | **POST** /tests/bgp | Create BGP test |
| [**deleteBgpTest**](BgpTestsApi.md#deleteBgpTest) | **DELETE** /tests/bgp/{testId} | Delete BGP test |
| [**deleteBgpTestWithHttpInfo**](BgpTestsApi.md#deleteBgpTestWithHttpInfo) | **DELETE** /tests/bgp/{testId} | Delete BGP test |
| [**getBgpTest**](BgpTestsApi.md#getBgpTest) | **GET** /tests/bgp/{testId} | Get BGP test |
| [**getBgpTestWithHttpInfo**](BgpTestsApi.md#getBgpTestWithHttpInfo) | **GET** /tests/bgp/{testId} | Get BGP test |
| [**getBgpTests**](BgpTestsApi.md#getBgpTests) | **GET** /tests/bgp | List BGP tests |
| [**getBgpTestsWithHttpInfo**](BgpTestsApi.md#getBgpTestsWithHttpInfo) | **GET** /tests/bgp | List BGP tests |
| [**updateBgpTest**](BgpTestsApi.md#updateBgpTest) | **PUT** /tests/bgp/{testId} | Update BGP test |
| [**updateBgpTestWithHttpInfo**](BgpTestsApi.md#updateBgpTestWithHttpInfo) | **PUT** /tests/bgp/{testId} | Update BGP test |



## createBgpTest

> BgpTestResponse createBgpTest(CreateBgpTestRequest)

Create BGP test

Creates a new BGP test. This method requires Account Admin permissions.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.BgpTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        BgpTestsApi apiInstance = new BgpTestsApi(defaultClient);
        BgpTestRequest bgpTestRequest = new BgpTestRequest(); // BgpTestRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandBgpTestOptions> expand = Arrays.asList(); // List<ExpandBgpTestOptions> | Optional parameter on whether or not to expand the test sub-resources. By default no expansion takes place if the query parameter is not present. To expand the `monitors` sub-resource, pass the `?expand=monitor` query.
        try {
            BgpTestsApi.CreateBgpTestRequest request = BgpTestsApi.CreateBgpTestRequest.builder()
                .bgpTestRequest(bgpTestRequest)
                .aid(aid)
                .expand(expand)
                .build();
            BgpTestResponse result = apiInstance.createBgpTest(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BgpTestsApi#createBgpTest");
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
| request | [**CreateBgpTestRequest**](BgpTestsApi.md#CreateBgpTestRequest)|-|-|

### Return type

[**BgpTestResponse**](BgpTestResponse.md)


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

## createBgpTestWithHttpInfo

> ApiResponse<BgpTestResponse> createBgpTest createBgpTestWithHttpInfo(CreateBgpTestRequest)

Create BGP test

Creates a new BGP test. This method requires Account Admin permissions.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.BgpTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        BgpTestsApi apiInstance = new BgpTestsApi(defaultClient);
        BgpTestRequest bgpTestRequest = new BgpTestRequest(); // BgpTestRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandBgpTestOptions> expand = Arrays.asList(); // List<ExpandBgpTestOptions> | Optional parameter on whether or not to expand the test sub-resources. By default no expansion takes place if the query parameter is not present. To expand the `monitors` sub-resource, pass the `?expand=monitor` query.
        try {
            BgpTestsApi.CreateBgpTestRequest request = BgpTestsApi.CreateBgpTestRequest.builder()
                .bgpTestRequest(bgpTestRequest)
                .aid(aid)
                .expand(expand)
                .build();
            ApiResponse<BgpTestResponse> response = apiInstance.createBgpTestWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BgpTestsApi#createBgpTest");
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
| request | [**CreateBgpTestRequest**](BgpTestsApi.md#CreateBgpTestRequest)|-|-|

### Return type

ApiResponse<[**BgpTestResponse**](BgpTestResponse.md)>


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


<a id="CreateBgpTestRequest"></a>
## CreateBgpTestRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **bgpTestRequest** | [**BgpTestRequest**](BgpTestRequest.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;ExpandBgpTestOptions&gt;**](ExpandBgpTestOptions.md) | Optional parameter on whether or not to expand the test sub-resources. By default no expansion takes place if the query parameter is not present. To expand the &#x60;monitors&#x60; sub-resource, pass the &#x60;?expand&#x3D;monitor&#x60; query. | [optional] |



## deleteBgpTest

> void deleteBgpTest(DeleteBgpTestRequest)

Delete BGP test

Deletes a BGP test. This method requires Account Admin permissions.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.BgpTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        BgpTestsApi apiInstance = new BgpTestsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            BgpTestsApi.DeleteBgpTestRequest request = BgpTestsApi.DeleteBgpTestRequest.builder()
                .testId(testId)
                .aid(aid)
                .build();
            apiInstance.deleteBgpTest(request);
        } catch (ApiException e) {
            System.err.println("Exception when calling BgpTestsApi#deleteBgpTest");
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
| request | [**DeleteBgpTestRequest**](BgpTestsApi.md#DeleteBgpTestRequest)|-|-|

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

## deleteBgpTestWithHttpInfo

> ApiResponse<Void> deleteBgpTest deleteBgpTestWithHttpInfo(DeleteBgpTestRequest)

Delete BGP test

Deletes a BGP test. This method requires Account Admin permissions.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.BgpTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        BgpTestsApi apiInstance = new BgpTestsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            BgpTestsApi.DeleteBgpTestRequest request = BgpTestsApi.DeleteBgpTestRequest.builder()
                .testId(testId)
                .aid(aid)
                .build();
            ApiResponse<Void> response = apiInstance.deleteBgpTestWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling BgpTestsApi#deleteBgpTest");
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
| request | [**DeleteBgpTestRequest**](BgpTestsApi.md#DeleteBgpTestRequest)|-|-|

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


<a id="DeleteBgpTestRequest"></a>
## DeleteBgpTestRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **testId** | **String** | Test ID | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getBgpTest

> BgpTestResponse getBgpTest(GetBgpTestRequest)

Get BGP test

Returns details for a BGP test, including name, intervals, targets, alert rules and agents.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.BgpTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        BgpTestsApi apiInstance = new BgpTestsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandBgpTestOptions> expand = Arrays.asList(); // List<ExpandBgpTestOptions> | Optional parameter on whether or not to expand the test sub-resources. By default no expansion takes place if the query parameter is not present. To expand the `monitors` sub-resource, pass the `?expand=monitor` query.
        try {
            BgpTestsApi.GetBgpTestRequest request = BgpTestsApi.GetBgpTestRequest.builder()
                .testId(testId)
                .aid(aid)
                .expand(expand)
                .build();
            BgpTestResponse result = apiInstance.getBgpTest(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BgpTestsApi#getBgpTest");
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
| request | [**GetBgpTestRequest**](BgpTestsApi.md#GetBgpTestRequest)|-|-|

### Return type

[**BgpTestResponse**](BgpTestResponse.md)


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

## getBgpTestWithHttpInfo

> ApiResponse<BgpTestResponse> getBgpTest getBgpTestWithHttpInfo(GetBgpTestRequest)

Get BGP test

Returns details for a BGP test, including name, intervals, targets, alert rules and agents.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.BgpTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        BgpTestsApi apiInstance = new BgpTestsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandBgpTestOptions> expand = Arrays.asList(); // List<ExpandBgpTestOptions> | Optional parameter on whether or not to expand the test sub-resources. By default no expansion takes place if the query parameter is not present. To expand the `monitors` sub-resource, pass the `?expand=monitor` query.
        try {
            BgpTestsApi.GetBgpTestRequest request = BgpTestsApi.GetBgpTestRequest.builder()
                .testId(testId)
                .aid(aid)
                .expand(expand)
                .build();
            ApiResponse<BgpTestResponse> response = apiInstance.getBgpTestWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BgpTestsApi#getBgpTest");
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
| request | [**GetBgpTestRequest**](BgpTestsApi.md#GetBgpTestRequest)|-|-|

### Return type

ApiResponse<[**BgpTestResponse**](BgpTestResponse.md)>


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


<a id="GetBgpTestRequest"></a>
## GetBgpTestRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **testId** | **String** | Test ID | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;ExpandBgpTestOptions&gt;**](ExpandBgpTestOptions.md) | Optional parameter on whether or not to expand the test sub-resources. By default no expansion takes place if the query parameter is not present. To expand the &#x60;monitors&#x60; sub-resource, pass the &#x60;?expand&#x3D;monitor&#x60; query. | [optional] |



## getBgpTests

> BgpTests getBgpTests(GetBgpTestsRequest)

List BGP tests

Returns a list of BGP tests and saved events.  **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.BgpTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        BgpTestsApi apiInstance = new BgpTestsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            BgpTestsApi.GetBgpTestsRequest request = BgpTestsApi.GetBgpTestsRequest.builder()
                .aid(aid)
                .build();
            BgpTests result = apiInstance.getBgpTests(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BgpTestsApi#getBgpTests");
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
| request | [**GetBgpTestsRequest**](BgpTestsApi.md#GetBgpTestsRequest)|-|-|

### Return type

[**BgpTests**](BgpTests.md)


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

## getBgpTestsWithHttpInfo

> ApiResponse<BgpTests> getBgpTests getBgpTestsWithHttpInfo(GetBgpTestsRequest)

List BGP tests

Returns a list of BGP tests and saved events.  **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.BgpTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        BgpTestsApi apiInstance = new BgpTestsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            BgpTestsApi.GetBgpTestsRequest request = BgpTestsApi.GetBgpTestsRequest.builder()
                .aid(aid)
                .build();
            ApiResponse<BgpTests> response = apiInstance.getBgpTestsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BgpTestsApi#getBgpTests");
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
| request | [**GetBgpTestsRequest**](BgpTestsApi.md#GetBgpTestsRequest)|-|-|

### Return type

ApiResponse<[**BgpTests**](BgpTests.md)>


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


<a id="GetBgpTestsRequest"></a>
## GetBgpTestsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## updateBgpTest

> BgpTestResponse updateBgpTest(UpdateBgpTestRequest)

Update BGP test

Updates a BGP test. Shared tests have limited updating capabilities. Only account-specific configurations may be updated, namely: alert rules, alert suppression windows, labels, tags. This method requires Account Admin permissions. **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.BgpTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        BgpTestsApi apiInstance = new BgpTestsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        com.thousandeyes.sdk.tests.model.UpdateBgpTestRequest updateBgpTestRequest = new UpdateBgpTestRequest(); // UpdateBgpTestRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandBgpTestOptions> expand = Arrays.asList(); // List<ExpandBgpTestOptions> | Optional parameter on whether or not to expand the test sub-resources. By default no expansion takes place if the query parameter is not present. To expand the `monitors` sub-resource, pass the `?expand=monitor` query.
        try {
            BgpTestsApi.UpdateBgpTestRequest request = BgpTestsApi.UpdateBgpTestRequest.builder()
                .testId(testId)
                .updateBgpTestRequest(updateBgpTestRequest)
                .aid(aid)
                .expand(expand)
                .build();
            BgpTestResponse result = apiInstance.updateBgpTest(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BgpTestsApi#updateBgpTest");
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
| request | [**UpdateBgpTestRequest**](BgpTestsApi.md#UpdateBgpTestRequest)|-|-|

### Return type

[**BgpTestResponse**](BgpTestResponse.md)


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

## updateBgpTestWithHttpInfo

> ApiResponse<BgpTestResponse> updateBgpTest updateBgpTestWithHttpInfo(UpdateBgpTestRequest)

Update BGP test

Updates a BGP test. Shared tests have limited updating capabilities. Only account-specific configurations may be updated, namely: alert rules, alert suppression windows, labels, tags. This method requires Account Admin permissions. **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.BgpTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        BgpTestsApi apiInstance = new BgpTestsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        com.thousandeyes.sdk.tests.model.UpdateBgpTestRequest updateBgpTestRequest = new UpdateBgpTestRequest(); // UpdateBgpTestRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandBgpTestOptions> expand = Arrays.asList(); // List<ExpandBgpTestOptions> | Optional parameter on whether or not to expand the test sub-resources. By default no expansion takes place if the query parameter is not present. To expand the `monitors` sub-resource, pass the `?expand=monitor` query.
        try {
            BgpTestsApi.UpdateBgpTestRequest request = BgpTestsApi.UpdateBgpTestRequest.builder()
                .testId(testId)
                .updateBgpTestRequest(updateBgpTestRequest)
                .aid(aid)
                .expand(expand)
                .build();
            ApiResponse<BgpTestResponse> response = apiInstance.updateBgpTestWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BgpTestsApi#updateBgpTest");
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
| request | [**UpdateBgpTestRequest**](BgpTestsApi.md#UpdateBgpTestRequest)|-|-|

### Return type

ApiResponse<[**BgpTestResponse**](BgpTestResponse.md)>


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


<a id="UpdateBgpTestRequest"></a>
## UpdateBgpTestRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **testId** | **String** | Test ID | |
| **updateBgpTestRequest** | [**UpdateBgpTestRequest**](UpdateBgpTestRequest.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;ExpandBgpTestOptions&gt;**](ExpandBgpTestOptions.md) | Optional parameter on whether or not to expand the test sub-resources. By default no expansion takes place if the query parameter is not present. To expand the &#x60;monitors&#x60; sub-resource, pass the &#x60;?expand&#x3D;monitor&#x60; query. | [optional] |


