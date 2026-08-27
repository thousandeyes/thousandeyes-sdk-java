# DnssecTestsApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDnsSecTest**](DnssecTestsApi.md#createDnsSecTest) | **POST** /tests/dnssec | Create DNSSEC test |
| [**createDnsSecTestWithHttpInfo**](DnssecTestsApi.md#createDnsSecTestWithHttpInfo) | **POST** /tests/dnssec | Create DNSSEC test |
| [**deleteDnsSecTest**](DnssecTestsApi.md#deleteDnsSecTest) | **DELETE** /tests/dnssec/{testId} | Delete DNSSEC test |
| [**deleteDnsSecTestWithHttpInfo**](DnssecTestsApi.md#deleteDnsSecTestWithHttpInfo) | **DELETE** /tests/dnssec/{testId} | Delete DNSSEC test |
| [**getDnsSecTest**](DnssecTestsApi.md#getDnsSecTest) | **GET** /tests/dnssec/{testId} | Get DNSSEC test |
| [**getDnsSecTestWithHttpInfo**](DnssecTestsApi.md#getDnsSecTestWithHttpInfo) | **GET** /tests/dnssec/{testId} | Get DNSSEC test |
| [**getDnsSecTests**](DnssecTestsApi.md#getDnsSecTests) | **GET** /tests/dnssec | List DNSSEC tests |
| [**getDnsSecTestsWithHttpInfo**](DnssecTestsApi.md#getDnsSecTestsWithHttpInfo) | **GET** /tests/dnssec | List DNSSEC tests |
| [**updateDnsSecTest**](DnssecTestsApi.md#updateDnsSecTest) | **PUT** /tests/dnssec/{testId} | Update DNSSEC test |
| [**updateDnsSecTestWithHttpInfo**](DnssecTestsApi.md#updateDnsSecTestWithHttpInfo) | **PUT** /tests/dnssec/{testId} | Update DNSSEC test |



## createDnsSecTest

> DnsSecTestResponse createDnsSecTest(CreateDnsSecTestRequest)

Create DNSSEC test

Creates a new DNSSEC test. This method requires Account Admin permissions. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.DnssecTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        DnssecTestsApi apiInstance = new DnssecTestsApi(defaultClient);
        DnsSecTestRequest dnsSecTestRequest = new DnsSecTestRequest(); // DnsSecTestRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandTestOptions> expand = Arrays.asList(); // List<ExpandTestOptions> | Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the `agents` sub-resource, they need to pass the `?expand=agent` query.
        try {
            DnssecTestsApi.CreateDnsSecTestRequest request = DnssecTestsApi.CreateDnsSecTestRequest.builder()
                .dnsSecTestRequest(dnsSecTestRequest)
                .aid(aid)
                .expand(expand)
                .build();
            DnsSecTestResponse result = apiInstance.createDnsSecTest(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DnssecTestsApi#createDnsSecTest");
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
| request | [**CreateDnsSecTestRequest**](DnssecTestsApi.md#CreateDnsSecTestRequest)|-|-|

### Return type

[**DnsSecTestResponse**](DnsSecTestResponse.md)


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

## createDnsSecTestWithHttpInfo

> ApiResponse<DnsSecTestResponse> createDnsSecTest createDnsSecTestWithHttpInfo(CreateDnsSecTestRequest)

Create DNSSEC test

Creates a new DNSSEC test. This method requires Account Admin permissions. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.DnssecTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        DnssecTestsApi apiInstance = new DnssecTestsApi(defaultClient);
        DnsSecTestRequest dnsSecTestRequest = new DnsSecTestRequest(); // DnsSecTestRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandTestOptions> expand = Arrays.asList(); // List<ExpandTestOptions> | Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the `agents` sub-resource, they need to pass the `?expand=agent` query.
        try {
            DnssecTestsApi.CreateDnsSecTestRequest request = DnssecTestsApi.CreateDnsSecTestRequest.builder()
                .dnsSecTestRequest(dnsSecTestRequest)
                .aid(aid)
                .expand(expand)
                .build();
            ApiResponse<DnsSecTestResponse> response = apiInstance.createDnsSecTestWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DnssecTestsApi#createDnsSecTest");
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
| request | [**CreateDnsSecTestRequest**](DnssecTestsApi.md#CreateDnsSecTestRequest)|-|-|

### Return type

ApiResponse<[**DnsSecTestResponse**](DnsSecTestResponse.md)>


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


<a id="CreateDnsSecTestRequest"></a>
## CreateDnsSecTestRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **dnsSecTestRequest** | [**DnsSecTestRequest**](DnsSecTestRequest.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;ExpandTestOptions&gt;**](ExpandTestOptions.md) | Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. | [optional] |



## deleteDnsSecTest

> void deleteDnsSecTest(DeleteDnsSecTestRequest)

Delete DNSSEC test

Deletes the specified DNSSEC test. This method requires Account Admin permissions.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.DnssecTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        DnssecTestsApi apiInstance = new DnssecTestsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            DnssecTestsApi.DeleteDnsSecTestRequest request = DnssecTestsApi.DeleteDnsSecTestRequest.builder()
                .testId(testId)
                .aid(aid)
                .build();
            apiInstance.deleteDnsSecTest(request);
        } catch (ApiException e) {
            System.err.println("Exception when calling DnssecTestsApi#deleteDnsSecTest");
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
| request | [**DeleteDnsSecTestRequest**](DnssecTestsApi.md#DeleteDnsSecTestRequest)|-|-|

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

## deleteDnsSecTestWithHttpInfo

> ApiResponse<Void> deleteDnsSecTest deleteDnsSecTestWithHttpInfo(DeleteDnsSecTestRequest)

Delete DNSSEC test

Deletes the specified DNSSEC test. This method requires Account Admin permissions.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.DnssecTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        DnssecTestsApi apiInstance = new DnssecTestsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            DnssecTestsApi.DeleteDnsSecTestRequest request = DnssecTestsApi.DeleteDnsSecTestRequest.builder()
                .testId(testId)
                .aid(aid)
                .build();
            ApiResponse<Void> response = apiInstance.deleteDnsSecTestWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling DnssecTestsApi#deleteDnsSecTest");
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
| request | [**DeleteDnsSecTestRequest**](DnssecTestsApi.md#DeleteDnsSecTestRequest)|-|-|

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


<a id="DeleteDnsSecTestRequest"></a>
## DeleteDnsSecTestRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **testId** | **String** | Test ID | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getDnsSecTest

> DnsSecTestResponse getDnsSecTest(GetDnsSecTestRequest)

Get DNSSEC test

Returns details for a DNSSEC test, including name, intervals, targets, alert rules and agents.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.DnssecTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        DnssecTestsApi apiInstance = new DnssecTestsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        String versionId = "1234"; // String | The unique identifier for a specific version of the test settings. If provided, returns the test configuration as it existed at that version. To retrieve available version IDs, use the `/tests/{testId}/history` endpoint. If not specified, the current version of the test settings is returned.
        List<ExpandTestOptions> expand = Arrays.asList(); // List<ExpandTestOptions> | Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the `agents` sub-resource, they need to pass the `?expand=agent` query.
        try {
            DnssecTestsApi.GetDnsSecTestRequest request = DnssecTestsApi.GetDnsSecTestRequest.builder()
                .testId(testId)
                .aid(aid)
                .versionId(versionId)
                .expand(expand)
                .build();
            DnsSecTestResponse result = apiInstance.getDnsSecTest(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DnssecTestsApi#getDnsSecTest");
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
| request | [**GetDnsSecTestRequest**](DnssecTestsApi.md#GetDnsSecTestRequest)|-|-|

### Return type

[**DnsSecTestResponse**](DnsSecTestResponse.md)


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

## getDnsSecTestWithHttpInfo

> ApiResponse<DnsSecTestResponse> getDnsSecTest getDnsSecTestWithHttpInfo(GetDnsSecTestRequest)

Get DNSSEC test

Returns details for a DNSSEC test, including name, intervals, targets, alert rules and agents.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.DnssecTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        DnssecTestsApi apiInstance = new DnssecTestsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        String versionId = "1234"; // String | The unique identifier for a specific version of the test settings. If provided, returns the test configuration as it existed at that version. To retrieve available version IDs, use the `/tests/{testId}/history` endpoint. If not specified, the current version of the test settings is returned.
        List<ExpandTestOptions> expand = Arrays.asList(); // List<ExpandTestOptions> | Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the `agents` sub-resource, they need to pass the `?expand=agent` query.
        try {
            DnssecTestsApi.GetDnsSecTestRequest request = DnssecTestsApi.GetDnsSecTestRequest.builder()
                .testId(testId)
                .aid(aid)
                .versionId(versionId)
                .expand(expand)
                .build();
            ApiResponse<DnsSecTestResponse> response = apiInstance.getDnsSecTestWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DnssecTestsApi#getDnsSecTest");
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
| request | [**GetDnsSecTestRequest**](DnssecTestsApi.md#GetDnsSecTestRequest)|-|-|

### Return type

ApiResponse<[**DnsSecTestResponse**](DnsSecTestResponse.md)>


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


<a id="GetDnsSecTestRequest"></a>
## GetDnsSecTestRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **testId** | **String** | Test ID | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **versionId** | **String** | The unique identifier for a specific version of the test settings. If provided, returns the test configuration as it existed at that version. To retrieve available version IDs, use the &#x60;/tests/{testId}/history&#x60; endpoint. If not specified, the current version of the test settings is returned. | [optional] |
| **expand** | [**List&lt;ExpandTestOptions&gt;**](ExpandTestOptions.md) | Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. | [optional] |



## getDnsSecTests

> DnsSecTests getDnsSecTests(GetDnsSecTestsRequest)

List DNSSEC tests

Returns a list of all DNSSEC tests and saved events.  **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.DnssecTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        DnssecTestsApi apiInstance = new DnssecTestsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            DnssecTestsApi.GetDnsSecTestsRequest request = DnssecTestsApi.GetDnsSecTestsRequest.builder()
                .aid(aid)
                .build();
            DnsSecTests result = apiInstance.getDnsSecTests(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DnssecTestsApi#getDnsSecTests");
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
| request | [**GetDnsSecTestsRequest**](DnssecTestsApi.md#GetDnsSecTestsRequest)|-|-|

### Return type

[**DnsSecTests**](DnsSecTests.md)


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

## getDnsSecTestsWithHttpInfo

> ApiResponse<DnsSecTests> getDnsSecTests getDnsSecTestsWithHttpInfo(GetDnsSecTestsRequest)

List DNSSEC tests

Returns a list of all DNSSEC tests and saved events.  **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.DnssecTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        DnssecTestsApi apiInstance = new DnssecTestsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            DnssecTestsApi.GetDnsSecTestsRequest request = DnssecTestsApi.GetDnsSecTestsRequest.builder()
                .aid(aid)
                .build();
            ApiResponse<DnsSecTests> response = apiInstance.getDnsSecTestsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DnssecTestsApi#getDnsSecTests");
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
| request | [**GetDnsSecTestsRequest**](DnssecTestsApi.md#GetDnsSecTestsRequest)|-|-|

### Return type

ApiResponse<[**DnsSecTests**](DnsSecTests.md)>


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


<a id="GetDnsSecTestsRequest"></a>
## GetDnsSecTestsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## updateDnsSecTest

> DnsSecTestResponse updateDnsSecTest(UpdateDnsSecTestRequest)

Update DNSSEC test

Updates a DNSSEC test. Shared tests have limited updating capabilities. Only account-specific configurations may be updated, namely: alert rules, alert suppression windows, labels, tags. This method requires Account Admin permissions. **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.DnssecTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        DnssecTestsApi apiInstance = new DnssecTestsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        DnsSecTestRequest dnsSecTestRequest = new DnsSecTestRequest(); // DnsSecTestRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandTestOptions> expand = Arrays.asList(); // List<ExpandTestOptions> | Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the `agents` sub-resource, they need to pass the `?expand=agent` query.
        try {
            DnssecTestsApi.UpdateDnsSecTestRequest request = DnssecTestsApi.UpdateDnsSecTestRequest.builder()
                .testId(testId)
                .dnsSecTestRequest(dnsSecTestRequest)
                .aid(aid)
                .expand(expand)
                .build();
            DnsSecTestResponse result = apiInstance.updateDnsSecTest(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DnssecTestsApi#updateDnsSecTest");
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
| request | [**UpdateDnsSecTestRequest**](DnssecTestsApi.md#UpdateDnsSecTestRequest)|-|-|

### Return type

[**DnsSecTestResponse**](DnsSecTestResponse.md)


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

## updateDnsSecTestWithHttpInfo

> ApiResponse<DnsSecTestResponse> updateDnsSecTest updateDnsSecTestWithHttpInfo(UpdateDnsSecTestRequest)

Update DNSSEC test

Updates a DNSSEC test. Shared tests have limited updating capabilities. Only account-specific configurations may be updated, namely: alert rules, alert suppression windows, labels, tags. This method requires Account Admin permissions. **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tests.model.*;
import com.thousandeyes.sdk.tests.DnssecTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        DnssecTestsApi apiInstance = new DnssecTestsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        DnsSecTestRequest dnsSecTestRequest = new DnsSecTestRequest(); // DnsSecTestRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandTestOptions> expand = Arrays.asList(); // List<ExpandTestOptions> | Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the `agents` sub-resource, they need to pass the `?expand=agent` query.
        try {
            DnssecTestsApi.UpdateDnsSecTestRequest request = DnssecTestsApi.UpdateDnsSecTestRequest.builder()
                .testId(testId)
                .dnsSecTestRequest(dnsSecTestRequest)
                .aid(aid)
                .expand(expand)
                .build();
            ApiResponse<DnsSecTestResponse> response = apiInstance.updateDnsSecTestWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DnssecTestsApi#updateDnsSecTest");
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
| request | [**UpdateDnsSecTestRequest**](DnssecTestsApi.md#UpdateDnsSecTestRequest)|-|-|

### Return type

ApiResponse<[**DnsSecTestResponse**](DnsSecTestResponse.md)>


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


<a id="UpdateDnsSecTestRequest"></a>
## UpdateDnsSecTestRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **testId** | **String** | Test ID | |
| **dnsSecTestRequest** | [**DnsSecTestRequest**](DnsSecTestRequest.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;ExpandTestOptions&gt;**](ExpandTestOptions.md) | Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. | [optional] |


