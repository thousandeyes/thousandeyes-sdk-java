# ApiTestResultsApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTestApiAgentRoundResults**](ApiTestResultsApi.md#getTestApiAgentRoundResults) | **GET** /test-results/{testId}/api/agent/{agentId}/round/{roundId} | Get API test results by agent and round |
| [**getTestApiAgentRoundResultsWithHttpInfo**](ApiTestResultsApi.md#getTestApiAgentRoundResultsWithHttpInfo) | **GET** /test-results/{testId}/api/agent/{agentId}/round/{roundId} | Get API test results by agent and round |
| [**getTestApiResults**](ApiTestResultsApi.md#getTestApiResults) | **GET** /test-results/{testId}/api | Get API test results |
| [**getTestApiResultsWithHttpInfo**](ApiTestResultsApi.md#getTestApiResultsWithHttpInfo) | **GET** /test-results/{testId}/api | Get API test results |



## getTestApiAgentRoundResults

> ApiDetailTestResults getTestApiAgentRoundResults(testId, agentId, roundId, aid)

Get API test results by agent and round

Returns test results for API for a given agent and round. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.tests.Configuration;
import com.thousandeyes.sdk.tests.authentication.*;
import com.thousandeyes.sdk.tests.models.*;
import com.thousandeyes.sdk.tests.results.ApiTestResultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ApiTestResultsApi apiInstance = new ApiTestResultsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        String agentId = "11"; // String | Agent ID
        String roundId = "1384309800"; // String | Round ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiDetailTestResults result = apiInstance.getTestApiAgentRoundResults(testId, agentId, roundId, aid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiTestResultsApi#getTestApiAgentRoundResults");
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
| **testId** | **String**| Test ID | |
| **agentId** | **String**| Agent ID | |
| **roundId** | **String**| Round ID | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**ApiDetailTestResults**](ApiDetailTestResults.md)


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
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |

## getTestApiAgentRoundResultsWithHttpInfo

> ApiResponse<ApiDetailTestResults> getTestApiAgentRoundResults getTestApiAgentRoundResultsWithHttpInfo(testId, agentId, roundId, aid)

Get API test results by agent and round

Returns test results for API for a given agent and round. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.tests.Configuration;
import com.thousandeyes.sdk.tests.authentication.*;
import com.thousandeyes.sdk.tests.models.*;
import com.thousandeyes.sdk.tests.results.ApiTestResultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ApiTestResultsApi apiInstance = new ApiTestResultsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        String agentId = "11"; // String | Agent ID
        String roundId = "1384309800"; // String | Round ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiResponse<ApiDetailTestResults> response = apiInstance.getTestApiAgentRoundResultsWithHttpInfo(testId, agentId, roundId, aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiTestResultsApi#getTestApiAgentRoundResults");
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
| **testId** | **String**| Test ID | |
| **agentId** | **String**| Agent ID | |
| **roundId** | **String**| Round ID | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

ApiResponse<[**ApiDetailTestResults**](ApiDetailTestResults.md)>


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
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |


## getTestApiResults

> ApiTestResults getTestApiResults(testId, aid, window, startDate, endDate, cursor)

Get API test results

Returns test results for API. If you do not specify a window or a start and end date, data is displayed for the most recent testing round. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.tests.Configuration;
import com.thousandeyes.sdk.tests.authentication.*;
import com.thousandeyes.sdk.tests.models.*;
import com.thousandeyes.sdk.tests.results.ApiTestResultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ApiTestResultsApi apiInstance = new ApiTestResultsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        String window = "12h"; // String | A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: `s` for seconds (default if no type is specified), `m` for minutes, `h` for hours, `d` for days, and `w` for weeks. For a precise date range, use `startDate` and `endDate`.
        OffsetDateTime startDate = OffsetDateTime.parse("2022-07-17T22:00:54Z"); // OffsetDateTime | Use with the `endDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        OffsetDateTime endDate = OffsetDateTime.parse("2022-07-18T22:00:54Z"); // OffsetDateTime | Defaults to current time the request is made. Use with the `startDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `next` value from `_links` instead of this parameter.
        try {
            ApiTestResults result = apiInstance.getTestApiResults(testId, aid, window, startDate, endDate, cursor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiTestResultsApi#getTestApiResults");
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
| **testId** | **String**| Test ID | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **window** | **String**| A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. | [optional] |
| **startDate** | **OffsetDateTime**| Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. | [optional] |
| **endDate** | **OffsetDateTime**| Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. | [optional] |
| **cursor** | **String**| (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. | [optional] |

### Return type

[**ApiTestResults**](ApiTestResults.md)


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
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |

## getTestApiResultsWithHttpInfo

> ApiResponse<ApiTestResults> getTestApiResults getTestApiResultsWithHttpInfo(testId, aid, window, startDate, endDate, cursor)

Get API test results

Returns test results for API. If you do not specify a window or a start and end date, data is displayed for the most recent testing round. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.tests.Configuration;
import com.thousandeyes.sdk.tests.authentication.*;
import com.thousandeyes.sdk.tests.models.*;
import com.thousandeyes.sdk.tests.results.ApiTestResultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ApiTestResultsApi apiInstance = new ApiTestResultsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        String window = "12h"; // String | A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: `s` for seconds (default if no type is specified), `m` for minutes, `h` for hours, `d` for days, and `w` for weeks. For a precise date range, use `startDate` and `endDate`.
        OffsetDateTime startDate = OffsetDateTime.parse("2022-07-17T22:00:54Z"); // OffsetDateTime | Use with the `endDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        OffsetDateTime endDate = OffsetDateTime.parse("2022-07-18T22:00:54Z"); // OffsetDateTime | Defaults to current time the request is made. Use with the `startDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `next` value from `_links` instead of this parameter.
        try {
            ApiResponse<ApiTestResults> response = apiInstance.getTestApiResultsWithHttpInfo(testId, aid, window, startDate, endDate, cursor);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiTestResultsApi#getTestApiResults");
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
| **testId** | **String**| Test ID | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **window** | **String**| A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. | [optional] |
| **startDate** | **OffsetDateTime**| Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. | [optional] |
| **endDate** | **OffsetDateTime**| Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. | [optional] |
| **cursor** | **String**| (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. | [optional] |

### Return type

ApiResponse<[**ApiTestResults**](ApiTestResults.md)>


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
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |

