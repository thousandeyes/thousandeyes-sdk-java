# AlertsApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAlert**](AlertsApi.md#getAlert) | **GET** /alerts/{alertId} | Retrieve alert details |
| [**getAlertWithHttpInfo**](AlertsApi.md#getAlertWithHttpInfo) | **GET** /alerts/{alertId} | Retrieve alert details |
| [**getAlerts**](AlertsApi.md#getAlerts) | **GET** /alerts | List active alerts |
| [**getAlertsWithHttpInfo**](AlertsApi.md#getAlertsWithHttpInfo) | **GET** /alerts | List active alerts |



## getAlert

> AlertDetail getAlert(alertId, aid)

Retrieve alert details

Returns detailed information about an alert using its ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.alerts.AlertsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertsApi apiInstance = new AlertsApi(defaultClient);
        UUID alertId = UUID.fromString("e9c3bf02-a48c-4aa8-9e5f-898800d6f569"); // UUID | Unique alert ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AlertDetail result = apiInstance.getAlert(alertId, aid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertsApi#getAlert");
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
| **alertId** | **UUID**| Unique alert ID. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**AlertDetail**](AlertDetail.md)


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

## getAlertWithHttpInfo

> ApiResponse<AlertDetail> getAlert getAlertWithHttpInfo(alertId, aid)

Retrieve alert details

Returns detailed information about an alert using its ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.alerts.AlertsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertsApi apiInstance = new AlertsApi(defaultClient);
        UUID alertId = UUID.fromString("e9c3bf02-a48c-4aa8-9e5f-898800d6f569"); // UUID | Unique alert ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiResponse<AlertDetail> response = apiInstance.getAlertWithHttpInfo(alertId, aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertsApi#getAlert");
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
| **alertId** | **UUID**| Unique alert ID. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

ApiResponse<[**AlertDetail**](AlertDetail.md)>


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


## getAlerts

> Alerts getAlerts(aid, window, startDate, endDate, max, cursor, state)

List active alerts

Returns a list of active alerts. If no alerts are active within the  specified time range, an empty response is returned.  Note that time filters (&#x60;window&#x60;, &#x60;startDate&#x60;, or &#x60;endDate&#x60;) are only applied to cleared alerts.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.alerts.AlertsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertsApi apiInstance = new AlertsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        String window = "12h"; // String | A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: `s` for seconds (default if no type is specified), `m` for minutes, `h` for hours, `d` for days, and `w` for weeks. For a precise date range, use `startDate` and `endDate`.
        OffsetDateTime startDate = OffsetDateTime.parse("2022-07-17T22:00:54Z"); // OffsetDateTime | Use with the `endDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        OffsetDateTime endDate = OffsetDateTime.parse("2022-07-18T22:00:54Z"); // OffsetDateTime | Defaults to current time the request is made. Use with the `startDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        Integer max = 5; // Integer | (Optional) Maximum number of objects to return.
        String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `next` value from `_links` instead of this parameter.
        AlertState state = new AlertState(); // AlertState | Optional parameter to match a specific alert state. If not specified, it defaults to `trigger`.
        try {
            Alerts result = apiInstance.getAlerts(aid, window, startDate, endDate, max, cursor, state);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertsApi#getAlerts");
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
| **window** | **String**| A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. | [optional] |
| **startDate** | **OffsetDateTime**| Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. | [optional] |
| **endDate** | **OffsetDateTime**| Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. | [optional] |
| **max** | **Integer**| (Optional) Maximum number of objects to return. | [optional] |
| **cursor** | **String**| (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. | [optional] |
| **state** | [**AlertState**](.md)| Optional parameter to match a specific alert state. If not specified, it defaults to &#x60;trigger&#x60;. | [optional] |

### Return type

[**Alerts**](Alerts.md)


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

## getAlertsWithHttpInfo

> ApiResponse<Alerts> getAlerts getAlertsWithHttpInfo(aid, window, startDate, endDate, max, cursor, state)

List active alerts

Returns a list of active alerts. If no alerts are active within the  specified time range, an empty response is returned.  Note that time filters (&#x60;window&#x60;, &#x60;startDate&#x60;, or &#x60;endDate&#x60;) are only applied to cleared alerts.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.alerts.AlertsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertsApi apiInstance = new AlertsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        String window = "12h"; // String | A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: `s` for seconds (default if no type is specified), `m` for minutes, `h` for hours, `d` for days, and `w` for weeks. For a precise date range, use `startDate` and `endDate`.
        OffsetDateTime startDate = OffsetDateTime.parse("2022-07-17T22:00:54Z"); // OffsetDateTime | Use with the `endDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        OffsetDateTime endDate = OffsetDateTime.parse("2022-07-18T22:00:54Z"); // OffsetDateTime | Defaults to current time the request is made. Use with the `startDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        Integer max = 5; // Integer | (Optional) Maximum number of objects to return.
        String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `next` value from `_links` instead of this parameter.
        AlertState state = new AlertState(); // AlertState | Optional parameter to match a specific alert state. If not specified, it defaults to `trigger`.
        try {
            ApiResponse<Alerts> response = apiInstance.getAlertsWithHttpInfo(aid, window, startDate, endDate, max, cursor, state);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertsApi#getAlerts");
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
| **window** | **String**| A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. | [optional] |
| **startDate** | **OffsetDateTime**| Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. | [optional] |
| **endDate** | **OffsetDateTime**| Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. | [optional] |
| **max** | **Integer**| (Optional) Maximum number of objects to return. | [optional] |
| **cursor** | **String**| (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. | [optional] |
| **state** | [**AlertState**](.md)| Optional parameter to match a specific alert state. If not specified, it defaults to &#x60;trigger&#x60;. | [optional] |

### Return type

ApiResponse<[**Alerts**](Alerts.md)>


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

