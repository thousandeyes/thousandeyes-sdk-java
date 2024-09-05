# RunEndpointInstantScheduledTestsApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**runEndpointScheduledInstantTest**](RunEndpointInstantScheduledTestsApi.md#runEndpointScheduledInstantTest) | **POST** /endpoint/tests/scheduled-tests/{testId}/run | Run endpoint instant scheduled test |
| [**runEndpointScheduledInstantTestWithHttpInfo**](RunEndpointInstantScheduledTestsApi.md#runEndpointScheduledInstantTestWithHttpInfo) | **POST** /endpoint/tests/scheduled-tests/{testId}/run | Run endpoint instant scheduled test |



## runEndpointScheduledInstantTest

> void runEndpointScheduledInstantTest(testId, aid)

Run endpoint instant scheduled test

Runs an existing endpoint instant scheduled test in ThousandEyes.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.tests.Configuration;
import com.thousandeyes.sdk.endpoint.tests.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.models.*;
import com.thousandeyes.sdk.endpoint.tests.instant.RunEndpointInstantScheduledTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        RunEndpointInstantScheduledTestsApi apiInstance = new RunEndpointInstantScheduledTestsApi(defaultClient);
        String testId = "765231567"; // String | ID of the endpoint instant scheduled test to rerun
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            apiInstance.runEndpointScheduledInstantTest(testId, aid);
        } catch (ApiException e) {
            System.err.println("Exception when calling RunEndpointInstantScheduledTestsApi#runEndpointScheduledInstantTest");
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
| **testId** | **String**| ID of the endpoint instant scheduled test to rerun | |
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
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |

## runEndpointScheduledInstantTestWithHttpInfo

> ApiResponse<Void> runEndpointScheduledInstantTest runEndpointScheduledInstantTestWithHttpInfo(testId, aid)

Run endpoint instant scheduled test

Runs an existing endpoint instant scheduled test in ThousandEyes.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.tests.Configuration;
import com.thousandeyes.sdk.endpoint.tests.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.models.*;
import com.thousandeyes.sdk.endpoint.tests.instant.RunEndpointInstantScheduledTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        RunEndpointInstantScheduledTestsApi apiInstance = new RunEndpointInstantScheduledTestsApi(defaultClient);
        String testId = "765231567"; // String | ID of the endpoint instant scheduled test to rerun
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiResponse<Void> response = apiInstance.runEndpointScheduledInstantTestWithHttpInfo(testId, aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RunEndpointInstantScheduledTestsApi#runEndpointScheduledInstantTest");
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
| **testId** | **String**| ID of the endpoint instant scheduled test to rerun | |
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
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |

