# DashboardsFiltersApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDashboardFilter**](DashboardsFiltersApi.md#createDashboardFilter) | **POST** /dashboards/filters | Create dashboard filter |
| [**createDashboardFilterWithHttpInfo**](DashboardsFiltersApi.md#createDashboardFilterWithHttpInfo) | **POST** /dashboards/filters | Create dashboard filter |
| [**deleteDashboardFilter**](DashboardsFiltersApi.md#deleteDashboardFilter) | **DELETE** /dashboards/filters/{id} | Delete dashboard filter |
| [**deleteDashboardFilterWithHttpInfo**](DashboardsFiltersApi.md#deleteDashboardFilterWithHttpInfo) | **DELETE** /dashboards/filters/{id} | Delete dashboard filter |
| [**getDashboardFilter**](DashboardsFiltersApi.md#getDashboardFilter) | **GET** /dashboards/filters/{id} | Get dashboard filter |
| [**getDashboardFilterWithHttpInfo**](DashboardsFiltersApi.md#getDashboardFilterWithHttpInfo) | **GET** /dashboards/filters/{id} | Get dashboard filter |
| [**getDashboardsFilters**](DashboardsFiltersApi.md#getDashboardsFilters) | **GET** /dashboards/filters | List dashboard filters |
| [**getDashboardsFiltersWithHttpInfo**](DashboardsFiltersApi.md#getDashboardsFiltersWithHttpInfo) | **GET** /dashboards/filters | List dashboard filters |
| [**updateDashboardFilter**](DashboardsFiltersApi.md#updateDashboardFilter) | **PUT** /dashboards/filters/{id} | Update dashboard filter |
| [**updateDashboardFilterWithHttpInfo**](DashboardsFiltersApi.md#updateDashboardFilterWithHttpInfo) | **PUT** /dashboards/filters/{id} | Update dashboard filter |



## createDashboardFilter

> ApiContextFilterResponse createDashboardFilter(CreateDashboardFilterRequest)

Create dashboard filter

Creates a new dashboard filter in your account group. To create a filter,  you must have one of the following permissions: * &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin). * &#x60;Edit own dashboard templates&#x60; permission (Regular User). 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.dashboards.model.*;
import com.thousandeyes.sdk.dashboards.DashboardsFiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        DashboardsFiltersApi apiInstance = new DashboardsFiltersApi(defaultClient);
        ApiContextFilterRequest apiContextFilterRequest = new ApiContextFilterRequest(); // ApiContextFilterRequest | Dashboard filter object to be created and saved
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            DashboardsFiltersApi.CreateDashboardFilterRequest request = DashboardsFiltersApi.CreateDashboardFilterRequest.builder()
                .apiContextFilterRequest(apiContextFilterRequest)
                .aid(aid)
                .build();
            ApiContextFilterResponse result = apiInstance.createDashboardFilter(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsFiltersApi#createDashboardFilter");
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
| request | [**CreateDashboardFilterRequest**](DashboardsFiltersApi.md#CreateDashboardFilterRequest)|-|-|

### Return type

[**ApiContextFilterResponse**](ApiContextFilterResponse.md)


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

## createDashboardFilterWithHttpInfo

> ApiResponse<ApiContextFilterResponse> createDashboardFilter createDashboardFilterWithHttpInfo(CreateDashboardFilterRequest)

Create dashboard filter

Creates a new dashboard filter in your account group. To create a filter,  you must have one of the following permissions: * &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin). * &#x60;Edit own dashboard templates&#x60; permission (Regular User). 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.dashboards.model.*;
import com.thousandeyes.sdk.dashboards.DashboardsFiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        DashboardsFiltersApi apiInstance = new DashboardsFiltersApi(defaultClient);
        ApiContextFilterRequest apiContextFilterRequest = new ApiContextFilterRequest(); // ApiContextFilterRequest | Dashboard filter object to be created and saved
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            DashboardsFiltersApi.CreateDashboardFilterRequest request = DashboardsFiltersApi.CreateDashboardFilterRequest.builder()
                .apiContextFilterRequest(apiContextFilterRequest)
                .aid(aid)
                .build();
            ApiResponse<ApiContextFilterResponse> response = apiInstance.createDashboardFilterWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsFiltersApi#createDashboardFilter");
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
| request | [**CreateDashboardFilterRequest**](DashboardsFiltersApi.md#CreateDashboardFilterRequest)|-|-|

### Return type

ApiResponse<[**ApiContextFilterResponse**](ApiContextFilterResponse.md)>


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


<a id="CreateDashboardFilterRequest"></a>
## CreateDashboardFilterRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **apiContextFilterRequest** | [**ApiContextFilterRequest**](ApiContextFilterRequest.md) | Dashboard filter object to be created and saved | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## deleteDashboardFilter

> void deleteDashboardFilter(DeleteDashboardFilterRequest)

Delete dashboard filter

Deletes a dashboard filter using the &#x60;filterId&#x60; provided in the request.    **Note**:   * Users with the &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin) can delete any dashboard filter.   * Users with the &#x60;Edit own dashboard templates&#x60; permission (Regular User) can only delete the dashboard filters they have created themselves. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.dashboards.model.*;
import com.thousandeyes.sdk.dashboards.DashboardsFiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        DashboardsFiltersApi apiInstance = new DashboardsFiltersApi(defaultClient);
        String id = "65bc18e8f2073a4a469cd958"; // String | Unique dashboard filter ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            DashboardsFiltersApi.DeleteDashboardFilterRequest request = DashboardsFiltersApi.DeleteDashboardFilterRequest.builder()
                .id(id)
                .aid(aid)
                .build();
            apiInstance.deleteDashboardFilter(request);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsFiltersApi#deleteDashboardFilter");
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
| request | [**DeleteDashboardFilterRequest**](DashboardsFiltersApi.md#DeleteDashboardFilterRequest)|-|-|

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

## deleteDashboardFilterWithHttpInfo

> ApiResponse<Void> deleteDashboardFilter deleteDashboardFilterWithHttpInfo(DeleteDashboardFilterRequest)

Delete dashboard filter

Deletes a dashboard filter using the &#x60;filterId&#x60; provided in the request.    **Note**:   * Users with the &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin) can delete any dashboard filter.   * Users with the &#x60;Edit own dashboard templates&#x60; permission (Regular User) can only delete the dashboard filters they have created themselves. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.dashboards.model.*;
import com.thousandeyes.sdk.dashboards.DashboardsFiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        DashboardsFiltersApi apiInstance = new DashboardsFiltersApi(defaultClient);
        String id = "65bc18e8f2073a4a469cd958"; // String | Unique dashboard filter ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            DashboardsFiltersApi.DeleteDashboardFilterRequest request = DashboardsFiltersApi.DeleteDashboardFilterRequest.builder()
                .id(id)
                .aid(aid)
                .build();
            ApiResponse<Void> response = apiInstance.deleteDashboardFilterWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsFiltersApi#deleteDashboardFilter");
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
| request | [**DeleteDashboardFilterRequest**](DashboardsFiltersApi.md#DeleteDashboardFilterRequest)|-|-|

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


<a id="DeleteDashboardFilterRequest"></a>
## DeleteDashboardFilterRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **id** | **String** | Unique dashboard filter ID. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getDashboardFilter

> ApiContextFilterResponse getDashboardFilter(GetDashboardFilterRequest)

Get dashboard filter

Returns a list of data source filters and their metadata within the dashboard filter. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.dashboards.model.*;
import com.thousandeyes.sdk.dashboards.DashboardsFiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        DashboardsFiltersApi apiInstance = new DashboardsFiltersApi(defaultClient);
        String id = "65bc18e8f2073a4a469cd958"; // String | Unique dashboard filter ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            DashboardsFiltersApi.GetDashboardFilterRequest request = DashboardsFiltersApi.GetDashboardFilterRequest.builder()
                .id(id)
                .aid(aid)
                .build();
            ApiContextFilterResponse result = apiInstance.getDashboardFilter(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsFiltersApi#getDashboardFilter");
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
| request | [**GetDashboardFilterRequest**](DashboardsFiltersApi.md#GetDashboardFilterRequest)|-|-|

### Return type

[**ApiContextFilterResponse**](ApiContextFilterResponse.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
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

## getDashboardFilterWithHttpInfo

> ApiResponse<ApiContextFilterResponse> getDashboardFilter getDashboardFilterWithHttpInfo(GetDashboardFilterRequest)

Get dashboard filter

Returns a list of data source filters and their metadata within the dashboard filter. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.dashboards.model.*;
import com.thousandeyes.sdk.dashboards.DashboardsFiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        DashboardsFiltersApi apiInstance = new DashboardsFiltersApi(defaultClient);
        String id = "65bc18e8f2073a4a469cd958"; // String | Unique dashboard filter ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            DashboardsFiltersApi.GetDashboardFilterRequest request = DashboardsFiltersApi.GetDashboardFilterRequest.builder()
                .id(id)
                .aid(aid)
                .build();
            ApiResponse<ApiContextFilterResponse> response = apiInstance.getDashboardFilterWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsFiltersApi#getDashboardFilter");
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
| request | [**GetDashboardFilterRequest**](DashboardsFiltersApi.md#GetDashboardFilterRequest)|-|-|

### Return type

ApiResponse<[**ApiContextFilterResponse**](ApiContextFilterResponse.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
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


<a id="GetDashboardFilterRequest"></a>
## GetDashboardFilterRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **id** | **String** | Unique dashboard filter ID. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getDashboardsFilters

> ApiContextFiltersResponse getDashboardsFilters(GetDashboardsFiltersRequest)

List dashboard filters

Returns a list of dashboard filters and its context within your account group. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.dashboards.model.*;
import com.thousandeyes.sdk.dashboards.DashboardsFiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        DashboardsFiltersApi apiInstance = new DashboardsFiltersApi(defaultClient);
        String searchPattern = "cea-filter"; // String | Optional search pattern parameter to filter list of dashboard filters by either name or description values.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            DashboardsFiltersApi.GetDashboardsFiltersRequest request = DashboardsFiltersApi.GetDashboardsFiltersRequest.builder()
                .searchPattern(searchPattern)
                .aid(aid)
                .build();
            ApiContextFiltersResponse result = apiInstance.getDashboardsFilters(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsFiltersApi#getDashboardsFilters");
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
| request | [**GetDashboardsFiltersRequest**](DashboardsFiltersApi.md#GetDashboardsFiltersRequest)|-|-|

### Return type

[**ApiContextFiltersResponse**](ApiContextFiltersResponse.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
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

## getDashboardsFiltersWithHttpInfo

> ApiResponse<ApiContextFiltersResponse> getDashboardsFilters getDashboardsFiltersWithHttpInfo(GetDashboardsFiltersRequest)

List dashboard filters

Returns a list of dashboard filters and its context within your account group. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.dashboards.model.*;
import com.thousandeyes.sdk.dashboards.DashboardsFiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        DashboardsFiltersApi apiInstance = new DashboardsFiltersApi(defaultClient);
        String searchPattern = "cea-filter"; // String | Optional search pattern parameter to filter list of dashboard filters by either name or description values.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            DashboardsFiltersApi.GetDashboardsFiltersRequest request = DashboardsFiltersApi.GetDashboardsFiltersRequest.builder()
                .searchPattern(searchPattern)
                .aid(aid)
                .build();
            ApiResponse<ApiContextFiltersResponse> response = apiInstance.getDashboardsFiltersWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsFiltersApi#getDashboardsFilters");
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
| request | [**GetDashboardsFiltersRequest**](DashboardsFiltersApi.md#GetDashboardsFiltersRequest)|-|-|

### Return type

ApiResponse<[**ApiContextFiltersResponse**](ApiContextFiltersResponse.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
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


<a id="GetDashboardsFiltersRequest"></a>
## GetDashboardsFiltersRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **searchPattern** | **String** | Optional search pattern parameter to filter list of dashboard filters by either name or description values. | [optional] |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## updateDashboardFilter

> ApiContextFilterResponse updateDashboardFilter(UpdateDashboardFilterRequest)

Update dashboard filter

Updates an existing dashboard filter in your account group.                        **Note**:    * Users with the &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin) can update any dashboard filter.    * Users with the &#x60;Edit own dashboard templates&#x60; permission (Regular User) can only update the dashboard filters they have created themselves. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.dashboards.model.*;
import com.thousandeyes.sdk.dashboards.DashboardsFiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        DashboardsFiltersApi apiInstance = new DashboardsFiltersApi(defaultClient);
        String id = "65bc18e8f2073a4a469cd958"; // String | Unique dashboard filter ID.
        ApiContextFilterRequest apiContextFilterRequest = new ApiContextFilterRequest(); // ApiContextFilterRequest | Updated dashboard filter context object
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            DashboardsFiltersApi.UpdateDashboardFilterRequest request = DashboardsFiltersApi.UpdateDashboardFilterRequest.builder()
                .id(id)
                .apiContextFilterRequest(apiContextFilterRequest)
                .aid(aid)
                .build();
            ApiContextFilterResponse result = apiInstance.updateDashboardFilter(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsFiltersApi#updateDashboardFilter");
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
| request | [**UpdateDashboardFilterRequest**](DashboardsFiltersApi.md#UpdateDashboardFilterRequest)|-|-|

### Return type

[**ApiContextFilterResponse**](ApiContextFilterResponse.md)


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

## updateDashboardFilterWithHttpInfo

> ApiResponse<ApiContextFilterResponse> updateDashboardFilter updateDashboardFilterWithHttpInfo(UpdateDashboardFilterRequest)

Update dashboard filter

Updates an existing dashboard filter in your account group.                        **Note**:    * Users with the &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin) can update any dashboard filter.    * Users with the &#x60;Edit own dashboard templates&#x60; permission (Regular User) can only update the dashboard filters they have created themselves. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.dashboards.model.*;
import com.thousandeyes.sdk.dashboards.DashboardsFiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        DashboardsFiltersApi apiInstance = new DashboardsFiltersApi(defaultClient);
        String id = "65bc18e8f2073a4a469cd958"; // String | Unique dashboard filter ID.
        ApiContextFilterRequest apiContextFilterRequest = new ApiContextFilterRequest(); // ApiContextFilterRequest | Updated dashboard filter context object
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            DashboardsFiltersApi.UpdateDashboardFilterRequest request = DashboardsFiltersApi.UpdateDashboardFilterRequest.builder()
                .id(id)
                .apiContextFilterRequest(apiContextFilterRequest)
                .aid(aid)
                .build();
            ApiResponse<ApiContextFilterResponse> response = apiInstance.updateDashboardFilterWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsFiltersApi#updateDashboardFilter");
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
| request | [**UpdateDashboardFilterRequest**](DashboardsFiltersApi.md#UpdateDashboardFilterRequest)|-|-|

### Return type

ApiResponse<[**ApiContextFilterResponse**](ApiContextFilterResponse.md)>


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


<a id="UpdateDashboardFilterRequest"></a>
## UpdateDashboardFilterRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **id** | **String** | Unique dashboard filter ID. | |
| **apiContextFilterRequest** | [**ApiContextFilterRequest**](ApiContextFilterRequest.md) | Updated dashboard filter context object | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |


