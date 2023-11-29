# DashboardSnapshotsApi

All URIs are relative to *https://api.thousandeyes.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDashboardSnapshot**](DashboardSnapshotsApi.md#createDashboardSnapshot) | **POST** /v7/dashboard-snapshots | Create dashboard snapshot |
| [**dashboardSnapshotById**](DashboardSnapshotsApi.md#dashboardSnapshotById) | **GET** /v7/dashboard-snapshots/{snapshotId} | Retrieve dashboard snapshot |
| [**dashboardSnapshots**](DashboardSnapshotsApi.md#dashboardSnapshots) | **GET** /v7/dashboard-snapshots | List dashboard snapshots |
| [**deleteDashboardSnapshot**](DashboardSnapshotsApi.md#deleteDashboardSnapshot) | **DELETE** /v7/dashboard-snapshots/{snapshotId} | Delete dashboard snapshot |
| [**snapshotDataByWidget**](DashboardSnapshotsApi.md#snapshotDataByWidget) | **GET** /v7/dashboard-snapshots/{snapshotId}/widgets/{widgetId} | Retrieve dashboard snapshot data |
| [**updateSnapshotExpirationDate**](DashboardSnapshotsApi.md#updateSnapshotExpirationDate) | **PATCH** /v7/dashboard-snapshots/{snapshotId} | Update snapshot expiration |


<a id="createDashboardSnapshot"></a>
# **createDashboardSnapshot**
> ApiDashboardSnapshot createDashboardSnapshot(generateDashboardSnapshotRequest, aid)

Create dashboard snapshot

Creates a new dashboard snapshot within your account group. The &#x60;Edit Snapshots&#x60; permission is required to use this endpoint. 

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.DashboardSnapshotsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DashboardSnapshotsApi apiInstance = new DashboardSnapshotsApi(defaultClient);
    GenerateDashboardSnapshotRequest generateDashboardSnapshotRequest = new GenerateDashboardSnapshotRequest(); // GenerateDashboardSnapshotRequest | Request body schema to create a dashboard snapshot.
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      ApiDashboardSnapshot result = apiInstance.createDashboardSnapshot(generateDashboardSnapshotRequest, aid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardSnapshotsApi#createDashboardSnapshot");
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
| **generateDashboardSnapshotRequest** | [**GenerateDashboardSnapshotRequest**](GenerateDashboardSnapshotRequest.md)| Request body schema to create a dashboard snapshot. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**ApiDashboardSnapshot**](ApiDashboardSnapshot.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/hal+json
 - **Accept**: application/hal+json, application/problem+json

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

<a id="dashboardSnapshotById"></a>
# **dashboardSnapshotById**
> ApiDashboardSnapshot dashboardSnapshotById(snapshotId, aid)

Retrieve dashboard snapshot

This endpoint returns a list of widgets configured in dashboard snapshot configured in ThousandEyes. Seed this endpoint with a snapshotId found from the /dashboard-snapshots endpoint. This endpoint requires the &#x60;View Snapshots&#x60; permission be assigned to the role of the user accessing this endpoint. Returns a list of widgets configured within a dashboard snapshot. Use the &#x60;snapshotId&#x60; obtained from the &#x60;/dashboard-snapshots&#x60; endpoint. The &#x60;View Snapshots&#x60; permission is required to use this endpoint.\&quot;

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.DashboardSnapshotsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DashboardSnapshotsApi apiInstance = new DashboardSnapshotsApi(defaultClient);
    String snapshotId = "d28bb71f-5a47-4783-8f12-d4b115e61b0c"; // String | A Identifier for a dashboard snapshot which can be obtained from the `/dashboards-snapshots` endpoint.
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      ApiDashboardSnapshot result = apiInstance.dashboardSnapshotById(snapshotId, aid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardSnapshotsApi#dashboardSnapshotById");
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
| **snapshotId** | **String**| A Identifier for a dashboard snapshot which can be obtained from the &#x60;/dashboards-snapshots&#x60; endpoint. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**ApiDashboardSnapshot**](ApiDashboardSnapshot.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/problem+json

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

<a id="dashboardSnapshots"></a>
# **dashboardSnapshots**
> DashboardSnapshots200Response dashboardSnapshots(aid, dashboardId, cursor)

List dashboard snapshots

Returns a list of dashboard snapshots within your account group. Use this data to identify a specific dashboard snapshot, which can be used in other endpoints to access aggregated data. The &#x60;View Snapshots&#x60; permission is required to use this endpoint.\&quot; 

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.DashboardSnapshotsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DashboardSnapshotsApi apiInstance = new DashboardSnapshotsApi(defaultClient);
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    String dashboardId = "646f4d2ce3c99b0536c3821e"; // String | 
    String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `_links` instead of this parameter.
    try {
      DashboardSnapshots200Response result = apiInstance.dashboardSnapshots(aid, dashboardId, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardSnapshotsApi#dashboardSnapshots");
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
| **dashboardId** | **String**|  | [optional] |
| **cursor** | **String**| (Optional) Opaque cursor used for pagination. Clients should use &#x60;_links&#x60; instead of this parameter. | [optional] |

### Return type

[**DashboardSnapshots200Response**](DashboardSnapshots200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/problem+json

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

<a id="deleteDashboardSnapshot"></a>
# **deleteDashboardSnapshot**
> deleteDashboardSnapshot(snapshotId, aid)

Delete dashboard snapshot

Deletes a dashboard snapshot using the &#x60;snapshotId&#x60; provided in the request. Users with the &#x60;Edit reports for all users in account group&#x60; permission (Account Admin) can delete any dashboard snapshot. 

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.DashboardSnapshotsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DashboardSnapshotsApi apiInstance = new DashboardSnapshotsApi(defaultClient);
    String snapshotId = "d28bb71f-5a47-4783-8f12-d4b115e61b0c"; // String | A Identifier for a dashboard snapshot which can be obtained from the `/dashboards-snapshots` endpoint.
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      apiInstance.deleteDashboardSnapshot(snapshotId, aid);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardSnapshotsApi#deleteDashboardSnapshot");
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
| **snapshotId** | **String**| A Identifier for a dashboard snapshot which can be obtained from the &#x60;/dashboards-snapshots&#x60; endpoint. | |
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

<a id="snapshotDataByWidget"></a>
# **snapshotDataByWidget**
> SnapshotDataByWidget200Response snapshotDataByWidget(snapshotId, widgetId, aid)

Retrieve dashboard snapshot data

Returns actual metrics used in the generation of a dashboard snapshot. 

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.DashboardSnapshotsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DashboardSnapshotsApi apiInstance = new DashboardSnapshotsApi(defaultClient);
    String snapshotId = "d28bb71f-5a47-4783-8f12-d4b115e61b0c"; // String | A Identifier for a dashboard snapshot which can be obtained from the `/dashboards-snapshots` endpoint.
    String widgetId = "unpmg"; // String | A Identifier for a widget.
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      SnapshotDataByWidget200Response result = apiInstance.snapshotDataByWidget(snapshotId, widgetId, aid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardSnapshotsApi#snapshotDataByWidget");
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
| **snapshotId** | **String**| A Identifier for a dashboard snapshot which can be obtained from the &#x60;/dashboards-snapshots&#x60; endpoint. | |
| **widgetId** | **String**| A Identifier for a widget. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**SnapshotDataByWidget200Response**](SnapshotDataByWidget200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/problem+json

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

<a id="updateSnapshotExpirationDate"></a>
# **updateSnapshotExpirationDate**
> updateSnapshotExpirationDate(snapshotId, updateSnapshotExpirationDateApiRequest, aid)

Update snapshot expiration

Updates the expiration date of a dashboard snapshot. The &#x60;Edit snapshots&#x60; permission is required to access this endpoint. 

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.DashboardSnapshotsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DashboardSnapshotsApi apiInstance = new DashboardSnapshotsApi(defaultClient);
    String snapshotId = "d28bb71f-5a47-4783-8f12-d4b115e61b0c"; // String | A Identifier for a dashboard snapshot which can be obtained from the `/dashboards-snapshots` endpoint.
    UpdateSnapshotExpirationDateApiRequest updateSnapshotExpirationDateApiRequest = new UpdateSnapshotExpirationDateApiRequest(); // UpdateSnapshotExpirationDateApiRequest | Request body schema to update a snapshot expiration.
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      apiInstance.updateSnapshotExpirationDate(snapshotId, updateSnapshotExpirationDateApiRequest, aid);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardSnapshotsApi#updateSnapshotExpirationDate");
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
| **snapshotId** | **String**| A Identifier for a dashboard snapshot which can be obtained from the &#x60;/dashboards-snapshots&#x60; endpoint. | |
| **updateSnapshotExpirationDateApiRequest** | [**UpdateSnapshotExpirationDateApiRequest**](UpdateSnapshotExpirationDateApiRequest.md)| Request body schema to update a snapshot expiration. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/hal+json
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

