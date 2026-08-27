# AlertSuppressionWindowsApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAlertSuppressionWindow**](AlertSuppressionWindowsApi.md#createAlertSuppressionWindow) | **POST** /alert-suppression-windows | Create alert suppression window |
| [**createAlertSuppressionWindowWithHttpInfo**](AlertSuppressionWindowsApi.md#createAlertSuppressionWindowWithHttpInfo) | **POST** /alert-suppression-windows | Create alert suppression window |
| [**deleteAlertSuppressionWindow**](AlertSuppressionWindowsApi.md#deleteAlertSuppressionWindow) | **DELETE** /alert-suppression-windows/{windowId} | Delete alert suppression window |
| [**deleteAlertSuppressionWindowWithHttpInfo**](AlertSuppressionWindowsApi.md#deleteAlertSuppressionWindowWithHttpInfo) | **DELETE** /alert-suppression-windows/{windowId} | Delete alert suppression window |
| [**getAlertSuppressionWindow**](AlertSuppressionWindowsApi.md#getAlertSuppressionWindow) | **GET** /alert-suppression-windows/{windowId} | Retrieve alert suppression window |
| [**getAlertSuppressionWindowWithHttpInfo**](AlertSuppressionWindowsApi.md#getAlertSuppressionWindowWithHttpInfo) | **GET** /alert-suppression-windows/{windowId} | Retrieve alert suppression window |
| [**getAlertSuppressionWindows**](AlertSuppressionWindowsApi.md#getAlertSuppressionWindows) | **GET** /alert-suppression-windows | List alert suppression windows |
| [**getAlertSuppressionWindowsWithHttpInfo**](AlertSuppressionWindowsApi.md#getAlertSuppressionWindowsWithHttpInfo) | **GET** /alert-suppression-windows | List alert suppression windows |
| [**updateAlertSuppressionWindow**](AlertSuppressionWindowsApi.md#updateAlertSuppressionWindow) | **PUT** /alert-suppression-windows/{windowId} | Update alert suppression window |
| [**updateAlertSuppressionWindowWithHttpInfo**](AlertSuppressionWindowsApi.md#updateAlertSuppressionWindowWithHttpInfo) | **PUT** /alert-suppression-windows/{windowId} | Update alert suppression window |



## createAlertSuppressionWindow

> AlertSuppressionWindowDetail createAlertSuppressionWindow(CreateAlertSuppressionWindowRequest)

Create alert suppression window

Creates a new alert suppression window in ThousandEyes, using the  provided POST data. Only Account Admins can create alert suppression windows.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.alerts.model.*;
import com.thousandeyes.sdk.alerts.AlertSuppressionWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertSuppressionWindowsApi apiInstance = new AlertSuppressionWindowsApi(defaultClient);
        AlertSuppressionWindowRequest alertSuppressionWindowRequest = new AlertSuppressionWindowRequest(); // AlertSuppressionWindowRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandAlertTestOptions> expand = Arrays.asList(); // List<ExpandAlertTestOptions> | Optional parameter on whether or not to expand alert related resources.  Without this parameter, there's no default expansion. For example, to expand the \"tests\" resource, use the `?expand=test` query.
        try {
            AlertSuppressionWindowsApi.CreateAlertSuppressionWindowRequest request = AlertSuppressionWindowsApi.CreateAlertSuppressionWindowRequest.builder()
                .alertSuppressionWindowRequest(alertSuppressionWindowRequest)
                .aid(aid)
                .expand(expand)
                .build();
            AlertSuppressionWindowDetail result = apiInstance.createAlertSuppressionWindow(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertSuppressionWindowsApi#createAlertSuppressionWindow");
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
| request | [**CreateAlertSuppressionWindowRequest**](AlertSuppressionWindowsApi.md#CreateAlertSuppressionWindowRequest)|-|-|

### Return type

[**AlertSuppressionWindowDetail**](AlertSuppressionWindowDetail.md)


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

## createAlertSuppressionWindowWithHttpInfo

> ApiResponse<AlertSuppressionWindowDetail> createAlertSuppressionWindow createAlertSuppressionWindowWithHttpInfo(CreateAlertSuppressionWindowRequest)

Create alert suppression window

Creates a new alert suppression window in ThousandEyes, using the  provided POST data. Only Account Admins can create alert suppression windows.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.alerts.model.*;
import com.thousandeyes.sdk.alerts.AlertSuppressionWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertSuppressionWindowsApi apiInstance = new AlertSuppressionWindowsApi(defaultClient);
        AlertSuppressionWindowRequest alertSuppressionWindowRequest = new AlertSuppressionWindowRequest(); // AlertSuppressionWindowRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandAlertTestOptions> expand = Arrays.asList(); // List<ExpandAlertTestOptions> | Optional parameter on whether or not to expand alert related resources.  Without this parameter, there's no default expansion. For example, to expand the \"tests\" resource, use the `?expand=test` query.
        try {
            AlertSuppressionWindowsApi.CreateAlertSuppressionWindowRequest request = AlertSuppressionWindowsApi.CreateAlertSuppressionWindowRequest.builder()
                .alertSuppressionWindowRequest(alertSuppressionWindowRequest)
                .aid(aid)
                .expand(expand)
                .build();
            ApiResponse<AlertSuppressionWindowDetail> response = apiInstance.createAlertSuppressionWindowWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertSuppressionWindowsApi#createAlertSuppressionWindow");
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
| request | [**CreateAlertSuppressionWindowRequest**](AlertSuppressionWindowsApi.md#CreateAlertSuppressionWindowRequest)|-|-|

### Return type

ApiResponse<[**AlertSuppressionWindowDetail**](AlertSuppressionWindowDetail.md)>


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


<a id="CreateAlertSuppressionWindowRequest"></a>
## CreateAlertSuppressionWindowRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **alertSuppressionWindowRequest** | [**AlertSuppressionWindowRequest**](AlertSuppressionWindowRequest.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;ExpandAlertTestOptions&gt;**](ExpandAlertTestOptions.md) | Optional parameter on whether or not to expand alert related resources.  Without this parameter, there&#39;s no default expansion. For example, to expand the \&quot;tests\&quot; resource, use the &#x60;?expand&#x3D;test&#x60; query. | [optional] |



## deleteAlertSuppressionWindow

> void deleteAlertSuppressionWindow(DeleteAlertSuppressionWindowRequest)

Delete alert suppression window

Deletes an alert suppression window.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.alerts.model.*;
import com.thousandeyes.sdk.alerts.AlertSuppressionWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertSuppressionWindowsApi apiInstance = new AlertSuppressionWindowsApi(defaultClient);
        String windowId = "2411"; // String | Unique window ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AlertSuppressionWindowsApi.DeleteAlertSuppressionWindowRequest request = AlertSuppressionWindowsApi.DeleteAlertSuppressionWindowRequest.builder()
                .windowId(windowId)
                .aid(aid)
                .build();
            apiInstance.deleteAlertSuppressionWindow(request);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertSuppressionWindowsApi#deleteAlertSuppressionWindow");
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
| request | [**DeleteAlertSuppressionWindowRequest**](AlertSuppressionWindowsApi.md#DeleteAlertSuppressionWindowRequest)|-|-|

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

## deleteAlertSuppressionWindowWithHttpInfo

> ApiResponse<Void> deleteAlertSuppressionWindow deleteAlertSuppressionWindowWithHttpInfo(DeleteAlertSuppressionWindowRequest)

Delete alert suppression window

Deletes an alert suppression window.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.alerts.model.*;
import com.thousandeyes.sdk.alerts.AlertSuppressionWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertSuppressionWindowsApi apiInstance = new AlertSuppressionWindowsApi(defaultClient);
        String windowId = "2411"; // String | Unique window ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AlertSuppressionWindowsApi.DeleteAlertSuppressionWindowRequest request = AlertSuppressionWindowsApi.DeleteAlertSuppressionWindowRequest.builder()
                .windowId(windowId)
                .aid(aid)
                .build();
            ApiResponse<Void> response = apiInstance.deleteAlertSuppressionWindowWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertSuppressionWindowsApi#deleteAlertSuppressionWindow");
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
| request | [**DeleteAlertSuppressionWindowRequest**](AlertSuppressionWindowsApi.md#DeleteAlertSuppressionWindowRequest)|-|-|

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


<a id="DeleteAlertSuppressionWindowRequest"></a>
## DeleteAlertSuppressionWindowRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **windowId** | **String** | Unique window ID. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getAlertSuppressionWindow

> AlertSuppressionWindowDetail getAlertSuppressionWindow(GetAlertSuppressionWindowRequest)

Retrieve alert suppression window

Returns detailed information about an alert suppression window configured in your account group.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.alerts.model.*;
import com.thousandeyes.sdk.alerts.AlertSuppressionWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertSuppressionWindowsApi apiInstance = new AlertSuppressionWindowsApi(defaultClient);
        String windowId = "2411"; // String | Unique window ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandAlertTestOptions> expand = Arrays.asList(); // List<ExpandAlertTestOptions> | Optional parameter on whether or not to expand alert related resources.  Without this parameter, there's no default expansion. For example, to expand the \"tests\" resource, use the `?expand=test` query.
        try {
            AlertSuppressionWindowsApi.GetAlertSuppressionWindowRequest request = AlertSuppressionWindowsApi.GetAlertSuppressionWindowRequest.builder()
                .windowId(windowId)
                .aid(aid)
                .expand(expand)
                .build();
            AlertSuppressionWindowDetail result = apiInstance.getAlertSuppressionWindow(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertSuppressionWindowsApi#getAlertSuppressionWindow");
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
| request | [**GetAlertSuppressionWindowRequest**](AlertSuppressionWindowsApi.md#GetAlertSuppressionWindowRequest)|-|-|

### Return type

[**AlertSuppressionWindowDetail**](AlertSuppressionWindowDetail.md)


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

## getAlertSuppressionWindowWithHttpInfo

> ApiResponse<AlertSuppressionWindowDetail> getAlertSuppressionWindow getAlertSuppressionWindowWithHttpInfo(GetAlertSuppressionWindowRequest)

Retrieve alert suppression window

Returns detailed information about an alert suppression window configured in your account group.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.alerts.model.*;
import com.thousandeyes.sdk.alerts.AlertSuppressionWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertSuppressionWindowsApi apiInstance = new AlertSuppressionWindowsApi(defaultClient);
        String windowId = "2411"; // String | Unique window ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandAlertTestOptions> expand = Arrays.asList(); // List<ExpandAlertTestOptions> | Optional parameter on whether or not to expand alert related resources.  Without this parameter, there's no default expansion. For example, to expand the \"tests\" resource, use the `?expand=test` query.
        try {
            AlertSuppressionWindowsApi.GetAlertSuppressionWindowRequest request = AlertSuppressionWindowsApi.GetAlertSuppressionWindowRequest.builder()
                .windowId(windowId)
                .aid(aid)
                .expand(expand)
                .build();
            ApiResponse<AlertSuppressionWindowDetail> response = apiInstance.getAlertSuppressionWindowWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertSuppressionWindowsApi#getAlertSuppressionWindow");
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
| request | [**GetAlertSuppressionWindowRequest**](AlertSuppressionWindowsApi.md#GetAlertSuppressionWindowRequest)|-|-|

### Return type

ApiResponse<[**AlertSuppressionWindowDetail**](AlertSuppressionWindowDetail.md)>


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


<a id="GetAlertSuppressionWindowRequest"></a>
## GetAlertSuppressionWindowRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **windowId** | **String** | Unique window ID. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;ExpandAlertTestOptions&gt;**](ExpandAlertTestOptions.md) | Optional parameter on whether or not to expand alert related resources.  Without this parameter, there&#39;s no default expansion. For example, to expand the \&quot;tests\&quot; resource, use the &#x60;?expand&#x3D;test&#x60; query. | [optional] |



## getAlertSuppressionWindows

> AlertSuppressionWindows getAlertSuppressionWindows(GetAlertSuppressionWindowsRequest)

List alert suppression windows

Returns a list of all alert suppression windows configured in your account group.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.alerts.model.*;
import com.thousandeyes.sdk.alerts.AlertSuppressionWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertSuppressionWindowsApi apiInstance = new AlertSuppressionWindowsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AlertSuppressionWindowsApi.GetAlertSuppressionWindowsRequest request = AlertSuppressionWindowsApi.GetAlertSuppressionWindowsRequest.builder()
                .aid(aid)
                .build();
            AlertSuppressionWindows result = apiInstance.getAlertSuppressionWindows(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertSuppressionWindowsApi#getAlertSuppressionWindows");
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
| request | [**GetAlertSuppressionWindowsRequest**](AlertSuppressionWindowsApi.md#GetAlertSuppressionWindowsRequest)|-|-|

### Return type

[**AlertSuppressionWindows**](AlertSuppressionWindows.md)


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

## getAlertSuppressionWindowsWithHttpInfo

> ApiResponse<AlertSuppressionWindows> getAlertSuppressionWindows getAlertSuppressionWindowsWithHttpInfo(GetAlertSuppressionWindowsRequest)

List alert suppression windows

Returns a list of all alert suppression windows configured in your account group.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.alerts.model.*;
import com.thousandeyes.sdk.alerts.AlertSuppressionWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertSuppressionWindowsApi apiInstance = new AlertSuppressionWindowsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AlertSuppressionWindowsApi.GetAlertSuppressionWindowsRequest request = AlertSuppressionWindowsApi.GetAlertSuppressionWindowsRequest.builder()
                .aid(aid)
                .build();
            ApiResponse<AlertSuppressionWindows> response = apiInstance.getAlertSuppressionWindowsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertSuppressionWindowsApi#getAlertSuppressionWindows");
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
| request | [**GetAlertSuppressionWindowsRequest**](AlertSuppressionWindowsApi.md#GetAlertSuppressionWindowsRequest)|-|-|

### Return type

ApiResponse<[**AlertSuppressionWindows**](AlertSuppressionWindows.md)>


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


<a id="GetAlertSuppressionWindowsRequest"></a>
## GetAlertSuppressionWindowsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## updateAlertSuppressionWindow

> AlertSuppressionWindowDetail updateAlertSuppressionWindow(UpdateAlertSuppressionWindowRequest)

Update alert suppression window

Updates an alert suppression window in ThousandEyes, using the  provided POST data. Only Account Admins can update alert suppression windows.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.alerts.model.*;
import com.thousandeyes.sdk.alerts.AlertSuppressionWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertSuppressionWindowsApi apiInstance = new AlertSuppressionWindowsApi(defaultClient);
        String windowId = "2411"; // String | Unique window ID.
        AlertSuppressionWindowRequest alertSuppressionWindowRequest = new AlertSuppressionWindowRequest(); // AlertSuppressionWindowRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandAlertTestOptions> expand = Arrays.asList(); // List<ExpandAlertTestOptions> | Optional parameter on whether or not to expand alert related resources.  Without this parameter, there's no default expansion. For example, to expand the \"tests\" resource, use the `?expand=test` query.
        try {
            AlertSuppressionWindowsApi.UpdateAlertSuppressionWindowRequest request = AlertSuppressionWindowsApi.UpdateAlertSuppressionWindowRequest.builder()
                .windowId(windowId)
                .alertSuppressionWindowRequest(alertSuppressionWindowRequest)
                .aid(aid)
                .expand(expand)
                .build();
            AlertSuppressionWindowDetail result = apiInstance.updateAlertSuppressionWindow(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertSuppressionWindowsApi#updateAlertSuppressionWindow");
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
| request | [**UpdateAlertSuppressionWindowRequest**](AlertSuppressionWindowsApi.md#UpdateAlertSuppressionWindowRequest)|-|-|

### Return type

[**AlertSuppressionWindowDetail**](AlertSuppressionWindowDetail.md)


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

## updateAlertSuppressionWindowWithHttpInfo

> ApiResponse<AlertSuppressionWindowDetail> updateAlertSuppressionWindow updateAlertSuppressionWindowWithHttpInfo(UpdateAlertSuppressionWindowRequest)

Update alert suppression window

Updates an alert suppression window in ThousandEyes, using the  provided POST data. Only Account Admins can update alert suppression windows.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.alerts.model.*;
import com.thousandeyes.sdk.alerts.AlertSuppressionWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertSuppressionWindowsApi apiInstance = new AlertSuppressionWindowsApi(defaultClient);
        String windowId = "2411"; // String | Unique window ID.
        AlertSuppressionWindowRequest alertSuppressionWindowRequest = new AlertSuppressionWindowRequest(); // AlertSuppressionWindowRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandAlertTestOptions> expand = Arrays.asList(); // List<ExpandAlertTestOptions> | Optional parameter on whether or not to expand alert related resources.  Without this parameter, there's no default expansion. For example, to expand the \"tests\" resource, use the `?expand=test` query.
        try {
            AlertSuppressionWindowsApi.UpdateAlertSuppressionWindowRequest request = AlertSuppressionWindowsApi.UpdateAlertSuppressionWindowRequest.builder()
                .windowId(windowId)
                .alertSuppressionWindowRequest(alertSuppressionWindowRequest)
                .aid(aid)
                .expand(expand)
                .build();
            ApiResponse<AlertSuppressionWindowDetail> response = apiInstance.updateAlertSuppressionWindowWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertSuppressionWindowsApi#updateAlertSuppressionWindow");
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
| request | [**UpdateAlertSuppressionWindowRequest**](AlertSuppressionWindowsApi.md#UpdateAlertSuppressionWindowRequest)|-|-|

### Return type

ApiResponse<[**AlertSuppressionWindowDetail**](AlertSuppressionWindowDetail.md)>


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


<a id="UpdateAlertSuppressionWindowRequest"></a>
## UpdateAlertSuppressionWindowRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **windowId** | **String** | Unique window ID. | |
| **alertSuppressionWindowRequest** | [**AlertSuppressionWindowRequest**](AlertSuppressionWindowRequest.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;ExpandAlertTestOptions&gt;**](ExpandAlertTestOptions.md) | Optional parameter on whether or not to expand alert related resources.  Without this parameter, there&#39;s no default expansion. For example, to expand the \&quot;tests\&quot; resource, use the &#x60;?expand&#x3D;test&#x60; query. | [optional] |


