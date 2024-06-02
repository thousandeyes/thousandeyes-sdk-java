# NetworkTestMetricsApi

All URIs are relative to *https://api.thousandeyes.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTestNetworkResults**](NetworkTestMetricsApi.md#getTestNetworkResults) | **GET** /v7/test-results/{testId}/network | Get network test results |
| [**getTestNetworkResultsWithHttpInfo**](NetworkTestMetricsApi.md#getTestNetworkResultsWithHttpInfo) | **GET** /v7/test-results/{testId}/network | Get network test results |
| [**getTestPathVisAgentRoundResults**](NetworkTestMetricsApi.md#getTestPathVisAgentRoundResults) | **GET** /v7/test-results/{testId}/path-vis/agent/{agentId}/round/{roundId} | Get path visualization test results by agent and round |
| [**getTestPathVisAgentRoundResultsWithHttpInfo**](NetworkTestMetricsApi.md#getTestPathVisAgentRoundResultsWithHttpInfo) | **GET** /v7/test-results/{testId}/path-vis/agent/{agentId}/round/{roundId} | Get path visualization test results by agent and round |
| [**getTestPathVisResults**](NetworkTestMetricsApi.md#getTestPathVisResults) | **GET** /v7/test-results/{testId}/path-vis | Get path visualization network test results |
| [**getTestPathVisResultsWithHttpInfo**](NetworkTestMetricsApi.md#getTestPathVisResultsWithHttpInfo) | **GET** /v7/test-results/{testId}/path-vis | Get path visualization network test results |



## getTestNetworkResults

> NetworkTestResults getTestNetworkResults(testId, aid, window, startDate, endDate, cursor, direction)

Get network test results

Returns network test results for every agent and round. If you do not specify a window or a start and end date, data is displayed for the most recent testing round. 

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.sdk.tests.Configuration;
import com.thousandeyes.sdk.tests.authentication.*;
import com.thousandeyes.sdk.tests.models.*;
import com.thousandeyes.sdk.tests.results.NetworkTestMetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        NetworkTestMetricsApi apiInstance = new NetworkTestMetricsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        String window = "12h"; // String | A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: `s` for seconds (default if no type is specified), `m` for minutes, `h` for hours, `d` for days, and `w` for weeks. For a precise date range, use `startDate` and `endDate`.
        OffsetDateTime startDate = OffsetDateTime.parse("2022-07-17T22:00:54Z"); // OffsetDateTime | Use with the `endDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        OffsetDateTime endDate = OffsetDateTime.parse("2022-07-18T22:00:54Z"); // OffsetDateTime | Defaults to current time the request is made. Use with the `startDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `next` value from `_links` instead of this parameter.
        TestDirection direction = TestDirection.fromValue("to-target"); // TestDirection | Choose the direction for the metrics you want: [`from-target`, `to-target`, `bidirectional`]. This applies when you're doing bidirectional Agent-to-Agent tests. For bidirectional data, you'll get combined results; otherwise, you'll get data for one direction. If you try to get unidirectional test data with an incorrect direction parameter, it will trigger an error response.
        try {
            NetworkTestResults result = apiInstance.getTestNetworkResults(testId, aid, window, startDate, endDate, cursor, direction);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkTestMetricsApi#getTestNetworkResults");
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
| **direction** | [**TestDirection**](.md)| Choose the direction for the metrics you want: [&#x60;from-target&#x60;, &#x60;to-target&#x60;, &#x60;bidirectional&#x60;]. This applies when you&#39;re doing bidirectional Agent-to-Agent tests. For bidirectional data, you&#39;ll get combined results; otherwise, you&#39;ll get data for one direction. If you try to get unidirectional test data with an incorrect direction parameter, it will trigger an error response. | [optional] [default to to-target] [enum: to-target, from-target, bidirectional] |

### Return type

[**NetworkTestResults**](NetworkTestResults.md)


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

## getTestNetworkResultsWithHttpInfo

> ApiResponse<NetworkTestResults> getTestNetworkResults getTestNetworkResultsWithHttpInfo(testId, aid, window, startDate, endDate, cursor, direction)

Get network test results

Returns network test results for every agent and round. If you do not specify a window or a start and end date, data is displayed for the most recent testing round. 

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.common.ApiResponse;
import com.thousandeyes.sdk.tests.Configuration;
import com.thousandeyes.sdk.tests.authentication.*;
import com.thousandeyes.sdk.tests.models.*;
import com.thousandeyes.sdk.tests.results.NetworkTestMetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        NetworkTestMetricsApi apiInstance = new NetworkTestMetricsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        String window = "12h"; // String | A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: `s` for seconds (default if no type is specified), `m` for minutes, `h` for hours, `d` for days, and `w` for weeks. For a precise date range, use `startDate` and `endDate`.
        OffsetDateTime startDate = OffsetDateTime.parse("2022-07-17T22:00:54Z"); // OffsetDateTime | Use with the `endDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        OffsetDateTime endDate = OffsetDateTime.parse("2022-07-18T22:00:54Z"); // OffsetDateTime | Defaults to current time the request is made. Use with the `startDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `next` value from `_links` instead of this parameter.
        TestDirection direction = TestDirection.fromValue("to-target"); // TestDirection | Choose the direction for the metrics you want: [`from-target`, `to-target`, `bidirectional`]. This applies when you're doing bidirectional Agent-to-Agent tests. For bidirectional data, you'll get combined results; otherwise, you'll get data for one direction. If you try to get unidirectional test data with an incorrect direction parameter, it will trigger an error response.
        try {
            ApiResponse<NetworkTestResults> response = apiInstance.getTestNetworkResultsWithHttpInfo(testId, aid, window, startDate, endDate, cursor, direction);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkTestMetricsApi#getTestNetworkResults");
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
| **direction** | [**TestDirection**](.md)| Choose the direction for the metrics you want: [&#x60;from-target&#x60;, &#x60;to-target&#x60;, &#x60;bidirectional&#x60;]. This applies when you&#39;re doing bidirectional Agent-to-Agent tests. For bidirectional data, you&#39;ll get combined results; otherwise, you&#39;ll get data for one direction. If you try to get unidirectional test data with an incorrect direction parameter, it will trigger an error response. | [optional] [default to to-target] [enum: to-target, from-target, bidirectional] |

### Return type

ApiResponse<[**NetworkTestResults**](NetworkTestResults.md)>


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


## getTestPathVisAgentRoundResults

> PathVisDetailTestResults getTestPathVisAgentRoundResults(testId, agentId, roundId, aid, direction)

Get path visualization test results by agent and round

Returns a summary of the path trace data collected during path visualization for a given agent and round. With each attempt, three tries are made to reach the destination. The entire path is displayed in order.  Bidirectional agent-to-agent tests also support the &#x60;direction&#x60; parameter. For example, if agents A, B, and C are testing agent D bidirectionally, and you want results from the route from agent A to agent D, you can use the query &#x60;direction&#x3D;to-target&#x60;. For results from agent D to agent A, you can use &#x60;direction&#x3D;from-target&#x60;. To get both results for both routes, query without the direction parameter. The source will always be agent A and the destination will be agent D, but the direction field will indicate which trace direction you want test results from. 

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.sdk.tests.Configuration;
import com.thousandeyes.sdk.tests.authentication.*;
import com.thousandeyes.sdk.tests.models.*;
import com.thousandeyes.sdk.tests.results.NetworkTestMetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        NetworkTestMetricsApi apiInstance = new NetworkTestMetricsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        String agentId = "11"; // String | Agent ID
        String roundId = "1384309800"; // String | Round ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        PathVisDirection direction = PathVisDirection.fromValue("to-target"); // PathVisDirection | Choose the direction for the metrics you want: [`from-target`, `to-target`]. This applies when you're doing bidirectional Agent-to-Agent tests. Omitting the parameter will default the results to both `from-target` and `to-target` values (bidirectional); otherwise, you'll get data for one direction. If you try to get unidirectional test data with an incorrect direction parameter, it will trigger an error response.
        try {
            PathVisDetailTestResults result = apiInstance.getTestPathVisAgentRoundResults(testId, agentId, roundId, aid, direction);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkTestMetricsApi#getTestPathVisAgentRoundResults");
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
| **direction** | [**PathVisDirection**](.md)| Choose the direction for the metrics you want: [&#x60;from-target&#x60;, &#x60;to-target&#x60;]. This applies when you&#39;re doing bidirectional Agent-to-Agent tests. Omitting the parameter will default the results to both &#x60;from-target&#x60; and &#x60;to-target&#x60; values (bidirectional); otherwise, you&#39;ll get data for one direction. If you try to get unidirectional test data with an incorrect direction parameter, it will trigger an error response. | [optional] [enum: to-target, from-target] |

### Return type

[**PathVisDetailTestResults**](PathVisDetailTestResults.md)


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

## getTestPathVisAgentRoundResultsWithHttpInfo

> ApiResponse<PathVisDetailTestResults> getTestPathVisAgentRoundResults getTestPathVisAgentRoundResultsWithHttpInfo(testId, agentId, roundId, aid, direction)

Get path visualization test results by agent and round

Returns a summary of the path trace data collected during path visualization for a given agent and round. With each attempt, three tries are made to reach the destination. The entire path is displayed in order.  Bidirectional agent-to-agent tests also support the &#x60;direction&#x60; parameter. For example, if agents A, B, and C are testing agent D bidirectionally, and you want results from the route from agent A to agent D, you can use the query &#x60;direction&#x3D;to-target&#x60;. For results from agent D to agent A, you can use &#x60;direction&#x3D;from-target&#x60;. To get both results for both routes, query without the direction parameter. The source will always be agent A and the destination will be agent D, but the direction field will indicate which trace direction you want test results from. 

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.common.ApiResponse;
import com.thousandeyes.sdk.tests.Configuration;
import com.thousandeyes.sdk.tests.authentication.*;
import com.thousandeyes.sdk.tests.models.*;
import com.thousandeyes.sdk.tests.results.NetworkTestMetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        NetworkTestMetricsApi apiInstance = new NetworkTestMetricsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        String agentId = "11"; // String | Agent ID
        String roundId = "1384309800"; // String | Round ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        PathVisDirection direction = PathVisDirection.fromValue("to-target"); // PathVisDirection | Choose the direction for the metrics you want: [`from-target`, `to-target`]. This applies when you're doing bidirectional Agent-to-Agent tests. Omitting the parameter will default the results to both `from-target` and `to-target` values (bidirectional); otherwise, you'll get data for one direction. If you try to get unidirectional test data with an incorrect direction parameter, it will trigger an error response.
        try {
            ApiResponse<PathVisDetailTestResults> response = apiInstance.getTestPathVisAgentRoundResultsWithHttpInfo(testId, agentId, roundId, aid, direction);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkTestMetricsApi#getTestPathVisAgentRoundResults");
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
| **direction** | [**PathVisDirection**](.md)| Choose the direction for the metrics you want: [&#x60;from-target&#x60;, &#x60;to-target&#x60;]. This applies when you&#39;re doing bidirectional Agent-to-Agent tests. Omitting the parameter will default the results to both &#x60;from-target&#x60; and &#x60;to-target&#x60; values (bidirectional); otherwise, you&#39;ll get data for one direction. If you try to get unidirectional test data with an incorrect direction parameter, it will trigger an error response. | [optional] [enum: to-target, from-target] |

### Return type

ApiResponse<[**PathVisDetailTestResults**](PathVisDetailTestResults.md)>


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


## getTestPathVisResults

> PathVisTestResults getTestPathVisResults(testId, aid, window, startDate, endDate, cursor, direction)

Get path visualization network test results

Returns a summary of the path trace data collected during path visualization for a given time range. With each attempt, three tries are made to reach the destination. The entire path is displayed in order. If you do not specify a window or a start and end date, data is displayed for the most recent testing round.   Bidirectional agent-to-agent tests also support the &#x60;direction&#x60; parameter. For example, if agents A, B, and C are testing agent D bidirectionally, and you want results from the route from agent A to agent D, you can use the query &#x60;direction&#x3D;to-target&#x60;. For results from agent D to agent A, you can use &#x60;direction&#x3D;from-target&#x60;. To get both results for both routes, query without the direction parameter. The source will always be agent A and the destination will be agent D, but the direction field will indicate which trace direction you want test results from. 

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.sdk.tests.Configuration;
import com.thousandeyes.sdk.tests.authentication.*;
import com.thousandeyes.sdk.tests.models.*;
import com.thousandeyes.sdk.tests.results.NetworkTestMetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        NetworkTestMetricsApi apiInstance = new NetworkTestMetricsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        String window = "12h"; // String | A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: `s` for seconds (default if no type is specified), `m` for minutes, `h` for hours, `d` for days, and `w` for weeks. For a precise date range, use `startDate` and `endDate`.
        OffsetDateTime startDate = OffsetDateTime.parse("2022-07-17T22:00:54Z"); // OffsetDateTime | Use with the `endDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        OffsetDateTime endDate = OffsetDateTime.parse("2022-07-18T22:00:54Z"); // OffsetDateTime | Defaults to current time the request is made. Use with the `startDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `next` value from `_links` instead of this parameter.
        PathVisDirection direction = PathVisDirection.fromValue("to-target"); // PathVisDirection | Choose the direction for the metrics you want: [`from-target`, `to-target`]. This applies when you're doing bidirectional Agent-to-Agent tests. Omitting the parameter will default the results to both `from-target` and `to-target` values (bidirectional); otherwise, you'll get data for one direction. If you try to get unidirectional test data with an incorrect direction parameter, it will trigger an error response.
        try {
            PathVisTestResults result = apiInstance.getTestPathVisResults(testId, aid, window, startDate, endDate, cursor, direction);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkTestMetricsApi#getTestPathVisResults");
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
| **direction** | [**PathVisDirection**](.md)| Choose the direction for the metrics you want: [&#x60;from-target&#x60;, &#x60;to-target&#x60;]. This applies when you&#39;re doing bidirectional Agent-to-Agent tests. Omitting the parameter will default the results to both &#x60;from-target&#x60; and &#x60;to-target&#x60; values (bidirectional); otherwise, you&#39;ll get data for one direction. If you try to get unidirectional test data with an incorrect direction parameter, it will trigger an error response. | [optional] [enum: to-target, from-target] |

### Return type

[**PathVisTestResults**](PathVisTestResults.md)


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

## getTestPathVisResultsWithHttpInfo

> ApiResponse<PathVisTestResults> getTestPathVisResults getTestPathVisResultsWithHttpInfo(testId, aid, window, startDate, endDate, cursor, direction)

Get path visualization network test results

Returns a summary of the path trace data collected during path visualization for a given time range. With each attempt, three tries are made to reach the destination. The entire path is displayed in order. If you do not specify a window or a start and end date, data is displayed for the most recent testing round.   Bidirectional agent-to-agent tests also support the &#x60;direction&#x60; parameter. For example, if agents A, B, and C are testing agent D bidirectionally, and you want results from the route from agent A to agent D, you can use the query &#x60;direction&#x3D;to-target&#x60;. For results from agent D to agent A, you can use &#x60;direction&#x3D;from-target&#x60;. To get both results for both routes, query without the direction parameter. The source will always be agent A and the destination will be agent D, but the direction field will indicate which trace direction you want test results from. 

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.common.ApiResponse;
import com.thousandeyes.sdk.tests.Configuration;
import com.thousandeyes.sdk.tests.authentication.*;
import com.thousandeyes.sdk.tests.models.*;
import com.thousandeyes.sdk.tests.results.NetworkTestMetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        NetworkTestMetricsApi apiInstance = new NetworkTestMetricsApi(defaultClient);
        String testId = "202701"; // String | Test ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        String window = "12h"; // String | A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: `s` for seconds (default if no type is specified), `m` for minutes, `h` for hours, `d` for days, and `w` for weeks. For a precise date range, use `startDate` and `endDate`.
        OffsetDateTime startDate = OffsetDateTime.parse("2022-07-17T22:00:54Z"); // OffsetDateTime | Use with the `endDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        OffsetDateTime endDate = OffsetDateTime.parse("2022-07-18T22:00:54Z"); // OffsetDateTime | Defaults to current time the request is made. Use with the `startDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `next` value from `_links` instead of this parameter.
        PathVisDirection direction = PathVisDirection.fromValue("to-target"); // PathVisDirection | Choose the direction for the metrics you want: [`from-target`, `to-target`]. This applies when you're doing bidirectional Agent-to-Agent tests. Omitting the parameter will default the results to both `from-target` and `to-target` values (bidirectional); otherwise, you'll get data for one direction. If you try to get unidirectional test data with an incorrect direction parameter, it will trigger an error response.
        try {
            ApiResponse<PathVisTestResults> response = apiInstance.getTestPathVisResultsWithHttpInfo(testId, aid, window, startDate, endDate, cursor, direction);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkTestMetricsApi#getTestPathVisResults");
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
| **direction** | [**PathVisDirection**](.md)| Choose the direction for the metrics you want: [&#x60;from-target&#x60;, &#x60;to-target&#x60;]. This applies when you&#39;re doing bidirectional Agent-to-Agent tests. Omitting the parameter will default the results to both &#x60;from-target&#x60; and &#x60;to-target&#x60; values (bidirectional); otherwise, you&#39;ll get data for one direction. If you try to get unidirectional test data with an incorrect direction parameter, it will trigger an error response. | [optional] [enum: to-target, from-target] |

### Return type

ApiResponse<[**PathVisTestResults**](PathVisTestResults.md)>


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

