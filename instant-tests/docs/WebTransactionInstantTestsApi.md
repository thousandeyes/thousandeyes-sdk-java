# WebTransactionInstantTestsApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWebTransactionInstantTest**](WebTransactionInstantTestsApi.md#createWebTransactionInstantTest) | **POST** /tests/web-transactions/instant | Create web transactions instant test |
| [**createWebTransactionInstantTestWithHttpInfo**](WebTransactionInstantTestsApi.md#createWebTransactionInstantTestWithHttpInfo) | **POST** /tests/web-transactions/instant | Create web transactions instant test |



## createWebTransactionInstantTest

> WebTransactionInstantTestResponse createWebTransactionInstantTest(webTransactionInstantTestRequest, aid, expand)

Create web transactions instant test

Creates and runs a new Web transactions instant test.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.tests.Configuration;
import com.thousandeyes.sdk.tests.authentication.*;
import com.thousandeyes.sdk.tests.models.*;
import com.thousandeyes.sdk.tests.instant.WebTransactionInstantTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        WebTransactionInstantTestsApi apiInstance = new WebTransactionInstantTestsApi(defaultClient);
        WebTransactionInstantTestRequest webTransactionInstantTestRequest = new WebTransactionInstantTestRequest(); // WebTransactionInstantTestRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandInstantTestOptions> expand = Arrays.asList(); // List<ExpandInstantTestOptions> | (Optional) Indicates if the test sub-resources should be expanded. Defaults to no expansion. To expand the `agents` sub-resource, use the query `?expand=agent`.
        try {
            WebTransactionInstantTestResponse result = apiInstance.createWebTransactionInstantTest(webTransactionInstantTestRequest, aid, expand);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebTransactionInstantTestsApi#createWebTransactionInstantTest");
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
| **webTransactionInstantTestRequest** | [**WebTransactionInstantTestRequest**](WebTransactionInstantTestRequest.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;ExpandInstantTestOptions&gt;**](ExpandInstantTestOptions.md)| (Optional) Indicates if the test sub-resources should be expanded. Defaults to no expansion. To expand the &#x60;agents&#x60; sub-resource, use the query &#x60;?expand&#x3D;agent&#x60;. | [optional] |

### Return type

[**WebTransactionInstantTestResponse**](WebTransactionInstantTestResponse.md)


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

## createWebTransactionInstantTestWithHttpInfo

> ApiResponse<WebTransactionInstantTestResponse> createWebTransactionInstantTest createWebTransactionInstantTestWithHttpInfo(webTransactionInstantTestRequest, aid, expand)

Create web transactions instant test

Creates and runs a new Web transactions instant test.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.tests.Configuration;
import com.thousandeyes.sdk.tests.authentication.*;
import com.thousandeyes.sdk.tests.models.*;
import com.thousandeyes.sdk.tests.instant.WebTransactionInstantTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        WebTransactionInstantTestsApi apiInstance = new WebTransactionInstantTestsApi(defaultClient);
        WebTransactionInstantTestRequest webTransactionInstantTestRequest = new WebTransactionInstantTestRequest(); // WebTransactionInstantTestRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandInstantTestOptions> expand = Arrays.asList(); // List<ExpandInstantTestOptions> | (Optional) Indicates if the test sub-resources should be expanded. Defaults to no expansion. To expand the `agents` sub-resource, use the query `?expand=agent`.
        try {
            ApiResponse<WebTransactionInstantTestResponse> response = apiInstance.createWebTransactionInstantTestWithHttpInfo(webTransactionInstantTestRequest, aid, expand);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling WebTransactionInstantTestsApi#createWebTransactionInstantTest");
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
| **webTransactionInstantTestRequest** | [**WebTransactionInstantTestRequest**](WebTransactionInstantTestRequest.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;ExpandInstantTestOptions&gt;**](ExpandInstantTestOptions.md)| (Optional) Indicates if the test sub-resources should be expanded. Defaults to no expansion. To expand the &#x60;agents&#x60; sub-resource, use the query &#x60;?expand&#x3D;agent&#x60;. | [optional] |

### Return type

ApiResponse<[**WebTransactionInstantTestResponse**](WebTransactionInstantTestResponse.md)>


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
