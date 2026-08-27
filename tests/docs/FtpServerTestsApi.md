# FtpServerTestsApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFtpServerTest**](FtpServerTestsApi.md#createFtpServerTest) | **POST** /tests/ftp-server | Create FTP Server test |
| [**createFtpServerTestWithHttpInfo**](FtpServerTestsApi.md#createFtpServerTestWithHttpInfo) | **POST** /tests/ftp-server | Create FTP Server test |
| [**deleteFtpServerTest**](FtpServerTestsApi.md#deleteFtpServerTest) | **DELETE** /tests/ftp-server/{testId} | Delete FTP Server test |
| [**deleteFtpServerTestWithHttpInfo**](FtpServerTestsApi.md#deleteFtpServerTestWithHttpInfo) | **DELETE** /tests/ftp-server/{testId} | Delete FTP Server test |
| [**getFtpServerTest**](FtpServerTestsApi.md#getFtpServerTest) | **GET** /tests/ftp-server/{testId} | Get FTP Server test |
| [**getFtpServerTestWithHttpInfo**](FtpServerTestsApi.md#getFtpServerTestWithHttpInfo) | **GET** /tests/ftp-server/{testId} | Get FTP Server test |
| [**getFtpServerTests**](FtpServerTestsApi.md#getFtpServerTests) | **GET** /tests/ftp-server | List FTP Server tests |
| [**getFtpServerTestsWithHttpInfo**](FtpServerTestsApi.md#getFtpServerTestsWithHttpInfo) | **GET** /tests/ftp-server | List FTP Server tests |
| [**updateFtpServerTest**](FtpServerTestsApi.md#updateFtpServerTest) | **PUT** /tests/ftp-server/{testId} | Update FTP Server test |
| [**updateFtpServerTestWithHttpInfo**](FtpServerTestsApi.md#updateFtpServerTestWithHttpInfo) | **PUT** /tests/ftp-server/{testId} | Update FTP Server test |



## createFtpServerTest

> FtpServerTestResponse createFtpServerTest(CreateFtpServerTestRequest)

Create FTP Server test

Creates a new FTP Server test. This method requires Account Admin permissions.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.FtpServerTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        FtpServerTestsApi apiInstance = new FtpServerTestsApi(defaultClient);
        FtpServerTestRequest ftpServerTestRequest = new FtpServerTestRequest(); // FtpServerTestRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandTestOptions> expand = Arrays.asList(); // List<ExpandTestOptions> | Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the `agents` sub-resource, they need to pass the `?expand=agent` query.
        try {
            FtpServerTestsApi.CreateFtpServerTestRequest request = FtpServerTestsApi.CreateFtpServerTestRequest.builder()
                .ftpServerTestRequest(ftpServerTestRequest)
                .aid(aid)
                .expand(expand)
                .build();
            FtpServerTestResponse result = apiInstance.createFtpServerTest(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FtpServerTestsApi#createFtpServerTest");
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
| request | [**CreateFtpServerTestRequest**](FtpServerTestsApi.md#CreateFtpServerTestRequest)|-|-|

### Return type

[**FtpServerTestResponse**](FtpServerTestResponse.md)


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

## createFtpServerTestWithHttpInfo

> ApiResponse<FtpServerTestResponse> createFtpServerTest createFtpServerTestWithHttpInfo(CreateFtpServerTestRequest)

Create FTP Server test

Creates a new FTP Server test. This method requires Account Admin permissions.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.FtpServerTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        FtpServerTestsApi apiInstance = new FtpServerTestsApi(defaultClient);
        FtpServerTestRequest ftpServerTestRequest = new FtpServerTestRequest(); // FtpServerTestRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandTestOptions> expand = Arrays.asList(); // List<ExpandTestOptions> | Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the `agents` sub-resource, they need to pass the `?expand=agent` query.
        try {
            FtpServerTestsApi.CreateFtpServerTestRequest request = FtpServerTestsApi.CreateFtpServerTestRequest.builder()
                .ftpServerTestRequest(ftpServerTestRequest)
                .aid(aid)
                .expand(expand)
                .build();
            ApiResponse<FtpServerTestResponse> response = apiInstance.createFtpServerTestWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling FtpServerTestsApi#createFtpServerTest");
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
| request | [**CreateFtpServerTestRequest**](FtpServerTestsApi.md#CreateFtpServerTestRequest)|-|-|

### Return type

ApiResponse<[**FtpServerTestResponse**](FtpServerTestResponse.md)>


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


<a id="CreateFtpServerTestRequest"></a>
## CreateFtpServerTestRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **ftpServerTestRequest** | [**FtpServerTestRequest**](FtpServerTestRequest.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;ExpandTestOptions&gt;**](ExpandTestOptions.md) | Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. | [optional] |



## deleteFtpServerTest

> void deleteFtpServerTest(DeleteFtpServerTestRequest)

Delete FTP Server test

Deletes the specified FTP Server test. This method requires Account Admin permissions.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.FtpServerTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        FtpServerTestsApi apiInstance = new FtpServerTestsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            FtpServerTestsApi.DeleteFtpServerTestRequest request = FtpServerTestsApi.DeleteFtpServerTestRequest.builder()
                .testId(testId)
                .aid(aid)
                .build();
            apiInstance.deleteFtpServerTest(request);
        } catch (ApiException e) {
            System.err.println("Exception when calling FtpServerTestsApi#deleteFtpServerTest");
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
| request | [**DeleteFtpServerTestRequest**](FtpServerTestsApi.md#DeleteFtpServerTestRequest)|-|-|

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

## deleteFtpServerTestWithHttpInfo

> ApiResponse<Void> deleteFtpServerTest deleteFtpServerTestWithHttpInfo(DeleteFtpServerTestRequest)

Delete FTP Server test

Deletes the specified FTP Server test. This method requires Account Admin permissions.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.FtpServerTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        FtpServerTestsApi apiInstance = new FtpServerTestsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            FtpServerTestsApi.DeleteFtpServerTestRequest request = FtpServerTestsApi.DeleteFtpServerTestRequest.builder()
                .testId(testId)
                .aid(aid)
                .build();
            ApiResponse<Void> response = apiInstance.deleteFtpServerTestWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling FtpServerTestsApi#deleteFtpServerTest");
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
| request | [**DeleteFtpServerTestRequest**](FtpServerTestsApi.md#DeleteFtpServerTestRequest)|-|-|

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


<a id="DeleteFtpServerTestRequest"></a>
## DeleteFtpServerTestRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **testId** | **String** | Test ID | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getFtpServerTest

> FtpServerTestResponse getFtpServerTest(GetFtpServerTestRequest)

Get FTP Server test

Returns details for a FTP Server test, including name, intervals, targets, alert rules and agents.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.FtpServerTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        FtpServerTestsApi apiInstance = new FtpServerTestsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        String versionId = "1234"; // String | The unique identifier for a specific version of the test settings. If provided, returns the test configuration as it existed at that version. To retrieve available version IDs, use the `/tests/{testId}/history` endpoint. If not specified, the current version of the test settings is returned.
        List<ExpandTestOptions> expand = Arrays.asList(); // List<ExpandTestOptions> | Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the `agents` sub-resource, they need to pass the `?expand=agent` query.
        try {
            FtpServerTestsApi.GetFtpServerTestRequest request = FtpServerTestsApi.GetFtpServerTestRequest.builder()
                .testId(testId)
                .aid(aid)
                .versionId(versionId)
                .expand(expand)
                .build();
            FtpServerTestResponse result = apiInstance.getFtpServerTest(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FtpServerTestsApi#getFtpServerTest");
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
| request | [**GetFtpServerTestRequest**](FtpServerTestsApi.md#GetFtpServerTestRequest)|-|-|

### Return type

[**FtpServerTestResponse**](FtpServerTestResponse.md)


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

## getFtpServerTestWithHttpInfo

> ApiResponse<FtpServerTestResponse> getFtpServerTest getFtpServerTestWithHttpInfo(GetFtpServerTestRequest)

Get FTP Server test

Returns details for a FTP Server test, including name, intervals, targets, alert rules and agents.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.FtpServerTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        FtpServerTestsApi apiInstance = new FtpServerTestsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        String versionId = "1234"; // String | The unique identifier for a specific version of the test settings. If provided, returns the test configuration as it existed at that version. To retrieve available version IDs, use the `/tests/{testId}/history` endpoint. If not specified, the current version of the test settings is returned.
        List<ExpandTestOptions> expand = Arrays.asList(); // List<ExpandTestOptions> | Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the `agents` sub-resource, they need to pass the `?expand=agent` query.
        try {
            FtpServerTestsApi.GetFtpServerTestRequest request = FtpServerTestsApi.GetFtpServerTestRequest.builder()
                .testId(testId)
                .aid(aid)
                .versionId(versionId)
                .expand(expand)
                .build();
            ApiResponse<FtpServerTestResponse> response = apiInstance.getFtpServerTestWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling FtpServerTestsApi#getFtpServerTest");
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
| request | [**GetFtpServerTestRequest**](FtpServerTestsApi.md#GetFtpServerTestRequest)|-|-|

### Return type

ApiResponse<[**FtpServerTestResponse**](FtpServerTestResponse.md)>


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


<a id="GetFtpServerTestRequest"></a>
## GetFtpServerTestRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **testId** | **String** | Test ID | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **versionId** | **String** | The unique identifier for a specific version of the test settings. If provided, returns the test configuration as it existed at that version. To retrieve available version IDs, use the &#x60;/tests/{testId}/history&#x60; endpoint. If not specified, the current version of the test settings is returned. | [optional] |
| **expand** | [**List&lt;ExpandTestOptions&gt;**](ExpandTestOptions.md) | Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. | [optional] |



## getFtpServerTests

> FtpServerTests getFtpServerTests(GetFtpServerTestsRequest)

List FTP Server tests

Returns a list of FTP Server tests and saved events.  **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.FtpServerTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        FtpServerTestsApi apiInstance = new FtpServerTestsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            FtpServerTestsApi.GetFtpServerTestsRequest request = FtpServerTestsApi.GetFtpServerTestsRequest.builder()
                .aid(aid)
                .build();
            FtpServerTests result = apiInstance.getFtpServerTests(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FtpServerTestsApi#getFtpServerTests");
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
| request | [**GetFtpServerTestsRequest**](FtpServerTestsApi.md#GetFtpServerTestsRequest)|-|-|

### Return type

[**FtpServerTests**](FtpServerTests.md)


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

## getFtpServerTestsWithHttpInfo

> ApiResponse<FtpServerTests> getFtpServerTests getFtpServerTestsWithHttpInfo(GetFtpServerTestsRequest)

List FTP Server tests

Returns a list of FTP Server tests and saved events.  **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.FtpServerTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        FtpServerTestsApi apiInstance = new FtpServerTestsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            FtpServerTestsApi.GetFtpServerTestsRequest request = FtpServerTestsApi.GetFtpServerTestsRequest.builder()
                .aid(aid)
                .build();
            ApiResponse<FtpServerTests> response = apiInstance.getFtpServerTestsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling FtpServerTestsApi#getFtpServerTests");
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
| request | [**GetFtpServerTestsRequest**](FtpServerTestsApi.md#GetFtpServerTestsRequest)|-|-|

### Return type

ApiResponse<[**FtpServerTests**](FtpServerTests.md)>


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


<a id="GetFtpServerTestsRequest"></a>
## GetFtpServerTestsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## updateFtpServerTest

> FtpServerTestResponse updateFtpServerTest(UpdateFtpServerTestRequest)

Update FTP Server test

Updates a FTP Server test. Shared tests have limited updating capabilities. Only account-specific configurations may be updated, namely: alert rules, alert suppression windows, labels, tags. This method requires Account Admin permissions. **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.FtpServerTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        FtpServerTestsApi apiInstance = new FtpServerTestsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        FtpServerTestRequest ftpServerTestRequest = new FtpServerTestRequest(); // FtpServerTestRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandTestOptions> expand = Arrays.asList(); // List<ExpandTestOptions> | Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the `agents` sub-resource, they need to pass the `?expand=agent` query.
        try {
            FtpServerTestsApi.UpdateFtpServerTestRequest request = FtpServerTestsApi.UpdateFtpServerTestRequest.builder()
                .testId(testId)
                .ftpServerTestRequest(ftpServerTestRequest)
                .aid(aid)
                .expand(expand)
                .build();
            FtpServerTestResponse result = apiInstance.updateFtpServerTest(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FtpServerTestsApi#updateFtpServerTest");
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
| request | [**UpdateFtpServerTestRequest**](FtpServerTestsApi.md#UpdateFtpServerTestRequest)|-|-|

### Return type

[**FtpServerTestResponse**](FtpServerTestResponse.md)


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

## updateFtpServerTestWithHttpInfo

> ApiResponse<FtpServerTestResponse> updateFtpServerTest updateFtpServerTestWithHttpInfo(UpdateFtpServerTestRequest)

Update FTP Server test

Updates a FTP Server test. Shared tests have limited updating capabilities. Only account-specific configurations may be updated, namely: alert rules, alert suppression windows, labels, tags. This method requires Account Admin permissions. **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.FtpServerTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        FtpServerTestsApi apiInstance = new FtpServerTestsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        FtpServerTestRequest ftpServerTestRequest = new FtpServerTestRequest(); // FtpServerTestRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandTestOptions> expand = Arrays.asList(); // List<ExpandTestOptions> | Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the `agents` sub-resource, they need to pass the `?expand=agent` query.
        try {
            FtpServerTestsApi.UpdateFtpServerTestRequest request = FtpServerTestsApi.UpdateFtpServerTestRequest.builder()
                .testId(testId)
                .ftpServerTestRequest(ftpServerTestRequest)
                .aid(aid)
                .expand(expand)
                .build();
            ApiResponse<FtpServerTestResponse> response = apiInstance.updateFtpServerTestWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling FtpServerTestsApi#updateFtpServerTest");
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
| request | [**UpdateFtpServerTestRequest**](FtpServerTestsApi.md#UpdateFtpServerTestRequest)|-|-|

### Return type

ApiResponse<[**FtpServerTestResponse**](FtpServerTestResponse.md)>


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


<a id="UpdateFtpServerTestRequest"></a>
## UpdateFtpServerTestRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **testId** | **String** | Test ID | |
| **ftpServerTestRequest** | [**FtpServerTestRequest**](FtpServerTestRequest.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;ExpandTestOptions&gt;**](ExpandTestOptions.md) | Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. | [optional] |


