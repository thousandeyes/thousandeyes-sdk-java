# DashboardsApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDashboard**](DashboardsApi.md#createDashboard) | **POST** /dashboards | Create dashboard |
| [**createDashboardWithHttpInfo**](DashboardsApi.md#createDashboardWithHttpInfo) | **POST** /dashboards | Create dashboard |
| [**deleteDashboard**](DashboardsApi.md#deleteDashboard) | **DELETE** /dashboards/{dashboardId} | Delete dashboard |
| [**deleteDashboardWithHttpInfo**](DashboardsApi.md#deleteDashboardWithHttpInfo) | **DELETE** /dashboards/{dashboardId} | Delete dashboard |
| [**getDashboard**](DashboardsApi.md#getDashboard) | **GET** /dashboards/{dashboardId} | Retrieve dashboard |
| [**getDashboardWithHttpInfo**](DashboardsApi.md#getDashboardWithHttpInfo) | **GET** /dashboards/{dashboardId} | Retrieve dashboard |
| [**getDashboardWidgetData**](DashboardsApi.md#getDashboardWidgetData) | **GET** /dashboards/{dashboardId}/widgets/{widgetId} | Retrieve dashboard widget data |
| [**getDashboardWidgetDataWithHttpInfo**](DashboardsApi.md#getDashboardWidgetDataWithHttpInfo) | **GET** /dashboards/{dashboardId}/widgets/{widgetId} | Retrieve dashboard widget data |
| [**getDashboards**](DashboardsApi.md#getDashboards) | **GET** /dashboards | List dashboards |
| [**getDashboardsWithHttpInfo**](DashboardsApi.md#getDashboardsWithHttpInfo) | **GET** /dashboards | List dashboards |
| [**updateDashboard**](DashboardsApi.md#updateDashboard) | **PUT** /dashboards/{dashboardId} | Update dashboard |
| [**updateDashboardWithHttpInfo**](DashboardsApi.md#updateDashboardWithHttpInfo) | **PUT** /dashboards/{dashboardId} | Update dashboard |



## createDashboard

> Dashboard createDashboard(dashboard, aid)

Create dashboard

Creates a new dashboard in your account group. To create a dashboard,  you must have one of the following permissions: * &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin).  * &#x60;Edit own dashboard templates&#x60; permission (Regular User). 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.dashboards.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        Dashboard dashboard = new Dashboard(); // Dashboard | Request body schema to create a dashboard.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            Dashboard result = apiInstance.createDashboard(dashboard, aid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#createDashboard");
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
| **dashboard** | [**Dashboard**](Dashboard.md)| Request body schema to create a dashboard. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**Dashboard**](Dashboard.md)


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

## createDashboardWithHttpInfo

> ApiResponse<Dashboard> createDashboard createDashboardWithHttpInfo(dashboard, aid)

Create dashboard

Creates a new dashboard in your account group. To create a dashboard,  you must have one of the following permissions: * &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin).  * &#x60;Edit own dashboard templates&#x60; permission (Regular User). 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.dashboards.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        Dashboard dashboard = new Dashboard(); // Dashboard | Request body schema to create a dashboard.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiResponse<Dashboard> response = apiInstance.createDashboardWithHttpInfo(dashboard, aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#createDashboard");
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
| **dashboard** | [**Dashboard**](Dashboard.md)| Request body schema to create a dashboard. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

ApiResponse<[**Dashboard**](Dashboard.md)>


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


## deleteDashboard

> void deleteDashboard(dashboardId, aid)

Delete dashboard

Deletes a dashboard using the &#x60;dashboardId&#x60; provided in the request.  **Note**: * Users with the &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin) can delete any dashboard. * Users with the &#x60;Edit own dashboard templates&#x60; permission (Regular User) can only delete the dashboards they have created themselves. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.dashboards.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        String dashboardId = "646f4d2ce3c99b0536c3821e"; // String | A Identifier for a dashboard which can be obtained from the `/dashboards` endpoint.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            apiInstance.deleteDashboard(dashboardId, aid);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#deleteDashboard");
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
| **dashboardId** | **String**| A Identifier for a dashboard which can be obtained from the &#x60;/dashboards&#x60; endpoint. | |
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

## deleteDashboardWithHttpInfo

> ApiResponse<Void> deleteDashboard deleteDashboardWithHttpInfo(dashboardId, aid)

Delete dashboard

Deletes a dashboard using the &#x60;dashboardId&#x60; provided in the request.  **Note**: * Users with the &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin) can delete any dashboard. * Users with the &#x60;Edit own dashboard templates&#x60; permission (Regular User) can only delete the dashboards they have created themselves. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.dashboards.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        String dashboardId = "646f4d2ce3c99b0536c3821e"; // String | A Identifier for a dashboard which can be obtained from the `/dashboards` endpoint.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiResponse<Void> response = apiInstance.deleteDashboardWithHttpInfo(dashboardId, aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#deleteDashboard");
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
| **dashboardId** | **String**| A Identifier for a dashboard which can be obtained from the &#x60;/dashboards&#x60; endpoint. | |
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


## getDashboard

> ApiDashboard getDashboard(dashboardId, aid)

Retrieve dashboard

Returns a list of widgets within a dashboard, along with the dashboard&#39;s metadata. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.dashboards.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        String dashboardId = "646f4d2ce3c99b0536c3821e"; // String | A Identifier for a dashboard which can be obtained from the `/dashboards` endpoint.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiDashboard result = apiInstance.getDashboard(dashboardId, aid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#getDashboard");
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
| **dashboardId** | **String**| A Identifier for a dashboard which can be obtained from the &#x60;/dashboards&#x60; endpoint. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**ApiDashboard**](ApiDashboard.md)


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

## getDashboardWithHttpInfo

> ApiResponse<ApiDashboard> getDashboard getDashboardWithHttpInfo(dashboardId, aid)

Retrieve dashboard

Returns a list of widgets within a dashboard, along with the dashboard&#39;s metadata. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.dashboards.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        String dashboardId = "646f4d2ce3c99b0536c3821e"; // String | A Identifier for a dashboard which can be obtained from the `/dashboards` endpoint.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiResponse<ApiDashboard> response = apiInstance.getDashboardWithHttpInfo(dashboardId, aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#getDashboard");
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
| **dashboardId** | **String**| A Identifier for a dashboard which can be obtained from the &#x60;/dashboards&#x60; endpoint. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

ApiResponse<[**ApiDashboard**](ApiDashboard.md)>


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


## getDashboardWidgetData

> ApiWidgetDataResponse getDashboardWidgetData(dashboardId, widgetId, aid, window, startDate, endDate, max, cursor, sort, order)

Retrieve dashboard widget data

Returns the raw data displayed within a widget in the dashboard. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.dashboards.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        String dashboardId = "646f4d2ce3c99b0536c3821e"; // String | A Identifier for a dashboard which can be obtained from the `/dashboards` endpoint.
        String widgetId = "unpmg"; // String | A Identifier for a widget.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        String window = "12h"; // String | A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: `s` for seconds (default if no type is specified), `m` for minutes, `h` for hours, `d` for days, and `w` for weeks. For a precise date range, use `startDate` and `endDate`.
        OffsetDateTime startDate = OffsetDateTime.parse("2022-07-17T22:00:54Z"); // OffsetDateTime | Use with the `endDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        OffsetDateTime endDate = OffsetDateTime.parse("2022-07-18T22:00:54Z"); // OffsetDateTime | Defaults to current time the request is made. Use with the `startDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        BigDecimal max = new BigDecimal("10"); // BigDecimal | Optionally specify the maximum number of objects to retrieve. This only applies to the **Alert List** and **Test Table** Widgets. * The default for the **Alert List** widget is set by its limitBy configuration. * The default value for the **Test Table** widget is 10.
        String cursor = "bGFzdFJvdW5kSWQ9MTY4MTQxMDQ4MA"; // String | An optional pagination cursor. This parameter should not not be used directly. Instead, use the `_links` returned by the API. This feature is only available in the **Test Table** widget.
        String sort = "alertStatus"; // String | Optional sorting parameter with attributes listed comma-separated. This only applies to the **Alert List** and **Test Table** Widgets. * For the **Alert List** widget, you can sort by `alertStatus` or `startTime`. The default is `alertStatus`. * For the **Test Table** widget, you can sort by `alertStatus`, `testName`, or `testType`. The sequence might vary from the web application. The default sort attribute is `alertStatus`.
        DashboardOrder order = DashboardOrder.fromValue("asc"); // DashboardOrder | Optional sorting order parameter that accepts either `asc` (ascending) or `desc` (descending) values. This only applies to the **Alert List** and **Test Table** Widgets.
        try {
            ApiWidgetDataResponse result = apiInstance.getDashboardWidgetData(dashboardId, widgetId, aid, window, startDate, endDate, max, cursor, sort, order);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#getDashboardWidgetData");
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
| **dashboardId** | **String**| A Identifier for a dashboard which can be obtained from the &#x60;/dashboards&#x60; endpoint. | |
| **widgetId** | **String**| A Identifier for a widget. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **window** | **String**| A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. | [optional] |
| **startDate** | **OffsetDateTime**| Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. | [optional] |
| **endDate** | **OffsetDateTime**| Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. | [optional] |
| **max** | **BigDecimal**| Optionally specify the maximum number of objects to retrieve. This only applies to the **Alert List** and **Test Table** Widgets. * The default for the **Alert List** widget is set by its limitBy configuration. * The default value for the **Test Table** widget is 10. | [optional] |
| **cursor** | **String**| An optional pagination cursor. This parameter should not not be used directly. Instead, use the &#x60;_links&#x60; returned by the API. This feature is only available in the **Test Table** widget. | [optional] |
| **sort** | **String**| Optional sorting parameter with attributes listed comma-separated. This only applies to the **Alert List** and **Test Table** Widgets. * For the **Alert List** widget, you can sort by &#x60;alertStatus&#x60; or &#x60;startTime&#x60;. The default is &#x60;alertStatus&#x60;. * For the **Test Table** widget, you can sort by &#x60;alertStatus&#x60;, &#x60;testName&#x60;, or &#x60;testType&#x60;. The sequence might vary from the web application. The default sort attribute is &#x60;alertStatus&#x60;. | [optional] |
| **order** | [**DashboardOrder**](.md)| Optional sorting order parameter that accepts either &#x60;asc&#x60; (ascending) or &#x60;desc&#x60; (descending) values. This only applies to the **Alert List** and **Test Table** Widgets. | [optional] [enum: asc, desc] |

### Return type

[**ApiWidgetDataResponse**](ApiWidgetDataResponse.md)


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

## getDashboardWidgetDataWithHttpInfo

> ApiResponse<ApiWidgetDataResponse> getDashboardWidgetData getDashboardWidgetDataWithHttpInfo(dashboardId, widgetId, aid, window, startDate, endDate, max, cursor, sort, order)

Retrieve dashboard widget data

Returns the raw data displayed within a widget in the dashboard. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.dashboards.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        String dashboardId = "646f4d2ce3c99b0536c3821e"; // String | A Identifier for a dashboard which can be obtained from the `/dashboards` endpoint.
        String widgetId = "unpmg"; // String | A Identifier for a widget.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        String window = "12h"; // String | A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: `s` for seconds (default if no type is specified), `m` for minutes, `h` for hours, `d` for days, and `w` for weeks. For a precise date range, use `startDate` and `endDate`.
        OffsetDateTime startDate = OffsetDateTime.parse("2022-07-17T22:00:54Z"); // OffsetDateTime | Use with the `endDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        OffsetDateTime endDate = OffsetDateTime.parse("2022-07-18T22:00:54Z"); // OffsetDateTime | Defaults to current time the request is made. Use with the `startDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        BigDecimal max = new BigDecimal("10"); // BigDecimal | Optionally specify the maximum number of objects to retrieve. This only applies to the **Alert List** and **Test Table** Widgets. * The default for the **Alert List** widget is set by its limitBy configuration. * The default value for the **Test Table** widget is 10.
        String cursor = "bGFzdFJvdW5kSWQ9MTY4MTQxMDQ4MA"; // String | An optional pagination cursor. This parameter should not not be used directly. Instead, use the `_links` returned by the API. This feature is only available in the **Test Table** widget.
        String sort = "alertStatus"; // String | Optional sorting parameter with attributes listed comma-separated. This only applies to the **Alert List** and **Test Table** Widgets. * For the **Alert List** widget, you can sort by `alertStatus` or `startTime`. The default is `alertStatus`. * For the **Test Table** widget, you can sort by `alertStatus`, `testName`, or `testType`. The sequence might vary from the web application. The default sort attribute is `alertStatus`.
        DashboardOrder order = DashboardOrder.fromValue("asc"); // DashboardOrder | Optional sorting order parameter that accepts either `asc` (ascending) or `desc` (descending) values. This only applies to the **Alert List** and **Test Table** Widgets.
        try {
            ApiResponse<ApiWidgetDataResponse> response = apiInstance.getDashboardWidgetDataWithHttpInfo(dashboardId, widgetId, aid, window, startDate, endDate, max, cursor, sort, order);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#getDashboardWidgetData");
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
| **dashboardId** | **String**| A Identifier for a dashboard which can be obtained from the &#x60;/dashboards&#x60; endpoint. | |
| **widgetId** | **String**| A Identifier for a widget. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **window** | **String**| A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. | [optional] |
| **startDate** | **OffsetDateTime**| Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. | [optional] |
| **endDate** | **OffsetDateTime**| Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. | [optional] |
| **max** | **BigDecimal**| Optionally specify the maximum number of objects to retrieve. This only applies to the **Alert List** and **Test Table** Widgets. * The default for the **Alert List** widget is set by its limitBy configuration. * The default value for the **Test Table** widget is 10. | [optional] |
| **cursor** | **String**| An optional pagination cursor. This parameter should not not be used directly. Instead, use the &#x60;_links&#x60; returned by the API. This feature is only available in the **Test Table** widget. | [optional] |
| **sort** | **String**| Optional sorting parameter with attributes listed comma-separated. This only applies to the **Alert List** and **Test Table** Widgets. * For the **Alert List** widget, you can sort by &#x60;alertStatus&#x60; or &#x60;startTime&#x60;. The default is &#x60;alertStatus&#x60;. * For the **Test Table** widget, you can sort by &#x60;alertStatus&#x60;, &#x60;testName&#x60;, or &#x60;testType&#x60;. The sequence might vary from the web application. The default sort attribute is &#x60;alertStatus&#x60;. | [optional] |
| **order** | [**DashboardOrder**](.md)| Optional sorting order parameter that accepts either &#x60;asc&#x60; (ascending) or &#x60;desc&#x60; (descending) values. This only applies to the **Alert List** and **Test Table** Widgets. | [optional] [enum: asc, desc] |

### Return type

ApiResponse<[**ApiWidgetDataResponse**](ApiWidgetDataResponse.md)>


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


## getDashboards

> List<ApiDashboard> getDashboards(aid)

List dashboards

Returns a list of dashboards and their settings within your account group. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.dashboards.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            List<ApiDashboard> result = apiInstance.getDashboards(aid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#getDashboards");
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

[**List&lt;ApiDashboard&gt;**](ApiDashboard.md)


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

## getDashboardsWithHttpInfo

> ApiResponse<List<ApiDashboard>> getDashboards getDashboardsWithHttpInfo(aid)

List dashboards

Returns a list of dashboards and their settings within your account group. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.dashboards.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiResponse<List<ApiDashboard>> response = apiInstance.getDashboardsWithHttpInfo(aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#getDashboards");
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

ApiResponse<[**List&lt;ApiDashboard&gt;**](ApiDashboard.md)>


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


## updateDashboard

> Dashboard updateDashboard(dashboardId, dashboard, aid)

Update dashboard

Updates an existing dashboard in your account group.   **Note**:  * Users with the &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin) can update any dashboard. * Users with the &#x60;Edit own dashboard templates&#x60; permission (Regular User) can only update the dashboards they have created themselves. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.dashboards.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        String dashboardId = "646f4d2ce3c99b0536c3821e"; // String | A Identifier for a dashboard which can be obtained from the `/dashboards` endpoint.
        Dashboard dashboard = new Dashboard(); // Dashboard | Request body schema to update a dashboard.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            Dashboard result = apiInstance.updateDashboard(dashboardId, dashboard, aid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#updateDashboard");
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
| **dashboardId** | **String**| A Identifier for a dashboard which can be obtained from the &#x60;/dashboards&#x60; endpoint. | |
| **dashboard** | [**Dashboard**](Dashboard.md)| Request body schema to update a dashboard. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**Dashboard**](Dashboard.md)


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

## updateDashboardWithHttpInfo

> ApiResponse<Dashboard> updateDashboard updateDashboardWithHttpInfo(dashboardId, dashboard, aid)

Update dashboard

Updates an existing dashboard in your account group.   **Note**:  * Users with the &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin) can update any dashboard. * Users with the &#x60;Edit own dashboard templates&#x60; permission (Regular User) can only update the dashboards they have created themselves. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.dashboards.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        String dashboardId = "646f4d2ce3c99b0536c3821e"; // String | A Identifier for a dashboard which can be obtained from the `/dashboards` endpoint.
        Dashboard dashboard = new Dashboard(); // Dashboard | Request body schema to update a dashboard.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiResponse<Dashboard> response = apiInstance.updateDashboardWithHttpInfo(dashboardId, dashboard, aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#updateDashboard");
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
| **dashboardId** | **String**| A Identifier for a dashboard which can be obtained from the &#x60;/dashboards&#x60; endpoint. | |
| **dashboard** | [**Dashboard**](Dashboard.md)| Request body schema to update a dashboard. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

ApiResponse<[**Dashboard**](Dashboard.md)>


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

