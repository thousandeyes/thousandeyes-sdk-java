# CreateTestSnapshotApi

All URIs are relative to *https://api.thousandeyes.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTestSnapshot**](CreateTestSnapshotApi.md#createTestSnapshot) | **POST** /v7/tests/{testId}/snapshot | Create test snapshot |
| [**createTestSnapshotWithHttpInfo**](CreateTestSnapshotApi.md#createTestSnapshotWithHttpInfo) | **POST** /v7/tests/{testId}/snapshot | Create test snapshot |



## createTestSnapshot

> SnapshotResponse createTestSnapshot(testId, snapshotRequest, aid)

Create test snapshot

This endpoint creates a test snapshot based on the properties provided in the POST data.  * To use this endpoint, you need the &#x60;Create snapshot shares&#x60; permission. * You can create a maximum of 5 snapshots per organization within a 5-minute interval. * Snapshots generated through this endpoint have a 30-day expiration period. * The time range specified with the &#x60;from&#x60; and &#x60;to&#x60; parameters must adhere to one of the following intervals: 1, 2, 4, 6, 12, 24, or 48 hours. * The &#x60;endDate&#x60; field of the snapshot must be set to the present or a past date.  **Note**: This endpoint does not support the creation of Endpoint Agent snapshots. 

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.Configuration;
import com.thousandeyes.api.authentication.*;
import com.thousandeyes.api.models.*;
import com.thousandeyes.api.snapshots.CreateTestSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CreateTestSnapshotApi apiInstance = new CreateTestSnapshotApi(defaultClient);
        String testId = "281474976710706"; // String | Test ID.
        SnapshotRequest snapshotRequest = new SnapshotRequest(); // SnapshotRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            SnapshotResponse result = apiInstance.createTestSnapshot(testId, snapshotRequest, aid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreateTestSnapshotApi#createTestSnapshot");
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
| **testId** | **String**| Test ID. | |
| **snapshotRequest** | [**SnapshotRequest**](SnapshotRequest.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**SnapshotResponse**](SnapshotResponse.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |

## createTestSnapshotWithHttpInfo

> ApiResponse<SnapshotResponse> createTestSnapshot createTestSnapshotWithHttpInfo(testId, snapshotRequest, aid)

Create test snapshot

This endpoint creates a test snapshot based on the properties provided in the POST data.  * To use this endpoint, you need the &#x60;Create snapshot shares&#x60; permission. * You can create a maximum of 5 snapshots per organization within a 5-minute interval. * Snapshots generated through this endpoint have a 30-day expiration period. * The time range specified with the &#x60;from&#x60; and &#x60;to&#x60; parameters must adhere to one of the following intervals: 1, 2, 4, 6, 12, 24, or 48 hours. * The &#x60;endDate&#x60; field of the snapshot must be set to the present or a past date.  **Note**: This endpoint does not support the creation of Endpoint Agent snapshots. 

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.common.ApiResponse;
import com.thousandeyes.api.Configuration;
import com.thousandeyes.api.authentication.*;
import com.thousandeyes.api.models.*;
import com.thousandeyes.api.snapshots.CreateTestSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CreateTestSnapshotApi apiInstance = new CreateTestSnapshotApi(defaultClient);
        String testId = "281474976710706"; // String | Test ID.
        SnapshotRequest snapshotRequest = new SnapshotRequest(); // SnapshotRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiResponse<SnapshotResponse> response = apiInstance.createTestSnapshotWithHttpInfo(testId, snapshotRequest, aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CreateTestSnapshotApi#createTestSnapshot");
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
| **testId** | **String**| Test ID. | |
| **snapshotRequest** | [**SnapshotRequest**](SnapshotRequest.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

ApiResponse<[**SnapshotResponse**](SnapshotResponse.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |

