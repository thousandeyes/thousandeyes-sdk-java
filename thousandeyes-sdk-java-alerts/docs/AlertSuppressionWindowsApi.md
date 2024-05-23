# AlertSuppressionWindowsApi

All URIs are relative to *https://api.thousandeyes.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSuppressionWindows**](AlertSuppressionWindowsApi.md#createSuppressionWindows) | **POST** /v7/alert-suppression-windows | Create alert suppression window |
| [**createSuppressionWindowsWithHttpInfo**](AlertSuppressionWindowsApi.md#createSuppressionWindowsWithHttpInfo) | **POST** /v7/alert-suppression-windows | Create alert suppression window |
| [**deleteSuppressionWindow**](AlertSuppressionWindowsApi.md#deleteSuppressionWindow) | **DELETE** /v7/alert-suppression-windows/{windowId} | Delete alert suppression window |
| [**deleteSuppressionWindowWithHttpInfo**](AlertSuppressionWindowsApi.md#deleteSuppressionWindowWithHttpInfo) | **DELETE** /v7/alert-suppression-windows/{windowId} | Delete alert suppression window |
| [**getSuppressionWindowDetails**](AlertSuppressionWindowsApi.md#getSuppressionWindowDetails) | **GET** /v7/alert-suppression-windows/{windowId} | Retrieve alert suppression window |
| [**getSuppressionWindowDetailsWithHttpInfo**](AlertSuppressionWindowsApi.md#getSuppressionWindowDetailsWithHttpInfo) | **GET** /v7/alert-suppression-windows/{windowId} | Retrieve alert suppression window |
| [**getSuppressionWindows**](AlertSuppressionWindowsApi.md#getSuppressionWindows) | **GET** /v7/alert-suppression-windows | List alert suppression windows |
| [**getSuppressionWindowsWithHttpInfo**](AlertSuppressionWindowsApi.md#getSuppressionWindowsWithHttpInfo) | **GET** /v7/alert-suppression-windows | List alert suppression windows |
| [**updateSuppressionWindow**](AlertSuppressionWindowsApi.md#updateSuppressionWindow) | **PUT** /v7/alert-suppression-windows/{windowId} | Update alert suppression window |
| [**updateSuppressionWindowWithHttpInfo**](AlertSuppressionWindowsApi.md#updateSuppressionWindowWithHttpInfo) | **PUT** /v7/alert-suppression-windows/{windowId} | Update alert suppression window |



## createSuppressionWindows

> AlertSuppressionWindowDetail createSuppressionWindows(alertSuppressionWindowRequest, aid, expand)

Create alert suppression window

Creates a new alert suppression window in ThousandEyes, using the  provided POST data. Only Account Admins can create alert suppression windows.

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.Configuration;
import com.thousandeyes.api.authentication.*;
import com.thousandeyes.api.models.*;
import com.thousandeyes.api.alerts.AlertSuppressionWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertSuppressionWindowsApi apiInstance = new AlertSuppressionWindowsApi(defaultClient);
        AlertSuppressionWindowRequest alertSuppressionWindowRequest = new AlertSuppressionWindowRequest(); // AlertSuppressionWindowRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<Expand> expand = Arrays.asList(); // List<Expand> | Optional parameter on whether or not to expand alert related resources.  Without this parameter, there's no default expansion. For example, to expand the \"tests\" resource, use the `?expand=test` query.
        try {
            AlertSuppressionWindowDetail result = apiInstance.createSuppressionWindows(alertSuppressionWindowRequest, aid, expand);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertSuppressionWindowsApi#createSuppressionWindows");
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
| **alertSuppressionWindowRequest** | [**AlertSuppressionWindowRequest**](AlertSuppressionWindowRequest.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| Optional parameter on whether or not to expand alert related resources.  Without this parameter, there&#39;s no default expansion. For example, to expand the \&quot;tests\&quot; resource, use the &#x60;?expand&#x3D;test&#x60; query. | [optional] |

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

## createSuppressionWindowsWithHttpInfo

> ApiResponse<AlertSuppressionWindowDetail> createSuppressionWindows createSuppressionWindowsWithHttpInfo(alertSuppressionWindowRequest, aid, expand)

Create alert suppression window

Creates a new alert suppression window in ThousandEyes, using the  provided POST data. Only Account Admins can create alert suppression windows.

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.common.ApiResponse;
import com.thousandeyes.api.Configuration;
import com.thousandeyes.api.authentication.*;
import com.thousandeyes.api.models.*;
import com.thousandeyes.api.alerts.AlertSuppressionWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertSuppressionWindowsApi apiInstance = new AlertSuppressionWindowsApi(defaultClient);
        AlertSuppressionWindowRequest alertSuppressionWindowRequest = new AlertSuppressionWindowRequest(); // AlertSuppressionWindowRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<Expand> expand = Arrays.asList(); // List<Expand> | Optional parameter on whether or not to expand alert related resources.  Without this parameter, there's no default expansion. For example, to expand the \"tests\" resource, use the `?expand=test` query.
        try {
            ApiResponse<AlertSuppressionWindowDetail> response = apiInstance.createSuppressionWindowsWithHttpInfo(alertSuppressionWindowRequest, aid, expand);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertSuppressionWindowsApi#createSuppressionWindows");
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
| **alertSuppressionWindowRequest** | [**AlertSuppressionWindowRequest**](AlertSuppressionWindowRequest.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| Optional parameter on whether or not to expand alert related resources.  Without this parameter, there&#39;s no default expansion. For example, to expand the \&quot;tests\&quot; resource, use the &#x60;?expand&#x3D;test&#x60; query. | [optional] |

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


## deleteSuppressionWindow

> void deleteSuppressionWindow(windowId, aid)

Delete alert suppression window

Deletes an alert suppression window.

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.Configuration;
import com.thousandeyes.api.authentication.*;
import com.thousandeyes.api.models.*;
import com.thousandeyes.api.alerts.AlertSuppressionWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertSuppressionWindowsApi apiInstance = new AlertSuppressionWindowsApi(defaultClient);
        String windowId = "2411"; // String | Unique window ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            apiInstance.deleteSuppressionWindow(windowId, aid);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertSuppressionWindowsApi#deleteSuppressionWindow");
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
| **windowId** | **String**| Unique window ID. | |
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

## deleteSuppressionWindowWithHttpInfo

> ApiResponse<Void> deleteSuppressionWindow deleteSuppressionWindowWithHttpInfo(windowId, aid)

Delete alert suppression window

Deletes an alert suppression window.

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.common.ApiResponse;
import com.thousandeyes.api.Configuration;
import com.thousandeyes.api.authentication.*;
import com.thousandeyes.api.models.*;
import com.thousandeyes.api.alerts.AlertSuppressionWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertSuppressionWindowsApi apiInstance = new AlertSuppressionWindowsApi(defaultClient);
        String windowId = "2411"; // String | Unique window ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiResponse<Void> response = apiInstance.deleteSuppressionWindowWithHttpInfo(windowId, aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertSuppressionWindowsApi#deleteSuppressionWindow");
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
| **windowId** | **String**| Unique window ID. | |
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


## getSuppressionWindowDetails

> AlertSuppressionWindowDetail getSuppressionWindowDetails(windowId, aid, expand)

Retrieve alert suppression window

Returns detailed information about an alert suppression window configured in your account group.

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.Configuration;
import com.thousandeyes.api.authentication.*;
import com.thousandeyes.api.models.*;
import com.thousandeyes.api.alerts.AlertSuppressionWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertSuppressionWindowsApi apiInstance = new AlertSuppressionWindowsApi(defaultClient);
        String windowId = "2411"; // String | Unique window ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<Expand> expand = Arrays.asList(); // List<Expand> | Optional parameter on whether or not to expand alert related resources.  Without this parameter, there's no default expansion. For example, to expand the \"tests\" resource, use the `?expand=test` query.
        try {
            AlertSuppressionWindowDetail result = apiInstance.getSuppressionWindowDetails(windowId, aid, expand);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertSuppressionWindowsApi#getSuppressionWindowDetails");
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
| **windowId** | **String**| Unique window ID. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| Optional parameter on whether or not to expand alert related resources.  Without this parameter, there&#39;s no default expansion. For example, to expand the \&quot;tests\&quot; resource, use the &#x60;?expand&#x3D;test&#x60; query. | [optional] |

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

## getSuppressionWindowDetailsWithHttpInfo

> ApiResponse<AlertSuppressionWindowDetail> getSuppressionWindowDetails getSuppressionWindowDetailsWithHttpInfo(windowId, aid, expand)

Retrieve alert suppression window

Returns detailed information about an alert suppression window configured in your account group.

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.common.ApiResponse;
import com.thousandeyes.api.Configuration;
import com.thousandeyes.api.authentication.*;
import com.thousandeyes.api.models.*;
import com.thousandeyes.api.alerts.AlertSuppressionWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertSuppressionWindowsApi apiInstance = new AlertSuppressionWindowsApi(defaultClient);
        String windowId = "2411"; // String | Unique window ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<Expand> expand = Arrays.asList(); // List<Expand> | Optional parameter on whether or not to expand alert related resources.  Without this parameter, there's no default expansion. For example, to expand the \"tests\" resource, use the `?expand=test` query.
        try {
            ApiResponse<AlertSuppressionWindowDetail> response = apiInstance.getSuppressionWindowDetailsWithHttpInfo(windowId, aid, expand);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertSuppressionWindowsApi#getSuppressionWindowDetails");
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
| **windowId** | **String**| Unique window ID. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| Optional parameter on whether or not to expand alert related resources.  Without this parameter, there&#39;s no default expansion. For example, to expand the \&quot;tests\&quot; resource, use the &#x60;?expand&#x3D;test&#x60; query. | [optional] |

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


## getSuppressionWindows

> AlertSuppressionWindows getSuppressionWindows(aid)

List alert suppression windows

Returns a list of all alert suppression windows configured in your account group.

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.Configuration;
import com.thousandeyes.api.authentication.*;
import com.thousandeyes.api.models.*;
import com.thousandeyes.api.alerts.AlertSuppressionWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertSuppressionWindowsApi apiInstance = new AlertSuppressionWindowsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AlertSuppressionWindows result = apiInstance.getSuppressionWindows(aid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertSuppressionWindowsApi#getSuppressionWindows");
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

## getSuppressionWindowsWithHttpInfo

> ApiResponse<AlertSuppressionWindows> getSuppressionWindows getSuppressionWindowsWithHttpInfo(aid)

List alert suppression windows

Returns a list of all alert suppression windows configured in your account group.

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.common.ApiResponse;
import com.thousandeyes.api.Configuration;
import com.thousandeyes.api.authentication.*;
import com.thousandeyes.api.models.*;
import com.thousandeyes.api.alerts.AlertSuppressionWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertSuppressionWindowsApi apiInstance = new AlertSuppressionWindowsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiResponse<AlertSuppressionWindows> response = apiInstance.getSuppressionWindowsWithHttpInfo(aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertSuppressionWindowsApi#getSuppressionWindows");
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


## updateSuppressionWindow

> AlertSuppressionWindowDetail updateSuppressionWindow(windowId, alertSuppressionWindowRequest, aid, expand)

Update alert suppression window

Updates an alert suppression window in ThousandEyes, using the  provided POST data. Only Account Admins can update alert suppression windows.

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.Configuration;
import com.thousandeyes.api.authentication.*;
import com.thousandeyes.api.models.*;
import com.thousandeyes.api.alerts.AlertSuppressionWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertSuppressionWindowsApi apiInstance = new AlertSuppressionWindowsApi(defaultClient);
        String windowId = "2411"; // String | Unique window ID.
        AlertSuppressionWindowRequest alertSuppressionWindowRequest = new AlertSuppressionWindowRequest(); // AlertSuppressionWindowRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<Expand> expand = Arrays.asList(); // List<Expand> | Optional parameter on whether or not to expand alert related resources.  Without this parameter, there's no default expansion. For example, to expand the \"tests\" resource, use the `?expand=test` query.
        try {
            AlertSuppressionWindowDetail result = apiInstance.updateSuppressionWindow(windowId, alertSuppressionWindowRequest, aid, expand);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertSuppressionWindowsApi#updateSuppressionWindow");
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
| **windowId** | **String**| Unique window ID. | |
| **alertSuppressionWindowRequest** | [**AlertSuppressionWindowRequest**](AlertSuppressionWindowRequest.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| Optional parameter on whether or not to expand alert related resources.  Without this parameter, there&#39;s no default expansion. For example, to expand the \&quot;tests\&quot; resource, use the &#x60;?expand&#x3D;test&#x60; query. | [optional] |

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

## updateSuppressionWindowWithHttpInfo

> ApiResponse<AlertSuppressionWindowDetail> updateSuppressionWindow updateSuppressionWindowWithHttpInfo(windowId, alertSuppressionWindowRequest, aid, expand)

Update alert suppression window

Updates an alert suppression window in ThousandEyes, using the  provided POST data. Only Account Admins can update alert suppression windows.

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.common.ApiResponse;
import com.thousandeyes.api.Configuration;
import com.thousandeyes.api.authentication.*;
import com.thousandeyes.api.models.*;
import com.thousandeyes.api.alerts.AlertSuppressionWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertSuppressionWindowsApi apiInstance = new AlertSuppressionWindowsApi(defaultClient);
        String windowId = "2411"; // String | Unique window ID.
        AlertSuppressionWindowRequest alertSuppressionWindowRequest = new AlertSuppressionWindowRequest(); // AlertSuppressionWindowRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<Expand> expand = Arrays.asList(); // List<Expand> | Optional parameter on whether or not to expand alert related resources.  Without this parameter, there's no default expansion. For example, to expand the \"tests\" resource, use the `?expand=test` query.
        try {
            ApiResponse<AlertSuppressionWindowDetail> response = apiInstance.updateSuppressionWindowWithHttpInfo(windowId, alertSuppressionWindowRequest, aid, expand);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertSuppressionWindowsApi#updateSuppressionWindow");
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
| **windowId** | **String**| Unique window ID. | |
| **alertSuppressionWindowRequest** | [**AlertSuppressionWindowRequest**](AlertSuppressionWindowRequest.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| Optional parameter on whether or not to expand alert related resources.  Without this parameter, there&#39;s no default expansion. For example, to expand the \&quot;tests\&quot; resource, use the &#x60;?expand&#x3D;test&#x60; query. | [optional] |

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

