# RealUserEndpointTestResultsApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**filterRealUserTestsNetworkResults**](RealUserEndpointTestResultsApi.md#filterRealUserTestsNetworkResults) | **POST** /endpoint/test-results/real-user-tests/networks/filter | List endpoint real user tests networks |
| [**filterRealUserTestsNetworkResultsWithHttpInfo**](RealUserEndpointTestResultsApi.md#filterRealUserTestsNetworkResultsWithHttpInfo) | **POST** /endpoint/test-results/real-user-tests/networks/filter | List endpoint real user tests networks |
| [**filterRealUserTestsResults**](RealUserEndpointTestResultsApi.md#filterRealUserTestsResults) | **POST** /endpoint/test-results/real-user-tests/filter | List endpoint real user tests |
| [**filterRealUserTestsResultsWithHttpInfo**](RealUserEndpointTestResultsApi.md#filterRealUserTestsResultsWithHttpInfo) | **POST** /endpoint/test-results/real-user-tests/filter | List endpoint real user tests |
| [**filterRealUserTestsVisitedPagesResults**](RealUserEndpointTestResultsApi.md#filterRealUserTestsVisitedPagesResults) | **POST** /endpoint/test-results/real-user-tests/pages/filter | List endpoint real user tests visited pages |
| [**filterRealUserTestsVisitedPagesResultsWithHttpInfo**](RealUserEndpointTestResultsApi.md#filterRealUserTestsVisitedPagesResultsWithHttpInfo) | **POST** /endpoint/test-results/real-user-tests/pages/filter | List endpoint real user tests visited pages |
| [**getRealUserTestPageResults**](RealUserEndpointTestResultsApi.md#getRealUserTestPageResults) | **GET** /endpoint/test-results/real-user-tests/{id}/pages/{pageId} | Retrieve endpoint real user test page |
| [**getRealUserTestPageResultsWithHttpInfo**](RealUserEndpointTestResultsApi.md#getRealUserTestPageResultsWithHttpInfo) | **GET** /endpoint/test-results/real-user-tests/{id}/pages/{pageId} | Retrieve endpoint real user test page |
| [**getRealUserTestResults**](RealUserEndpointTestResultsApi.md#getRealUserTestResults) | **GET** /endpoint/test-results/real-user-tests/{id} | Retrieve endpoint real user test |
| [**getRealUserTestResultsWithHttpInfo**](RealUserEndpointTestResultsApi.md#getRealUserTestResultsWithHttpInfo) | **GET** /endpoint/test-results/real-user-tests/{id} | Retrieve endpoint real user test |



## filterRealUserTestsNetworkResults

> RealUserEndpointTestNetworkResults filterRealUserTestsNetworkResults(aid, window, startDate, endDate, cursor, realUserEndpointTestResultsRequest)

List endpoint real user tests networks

Returns a list of all endpoint real user tests.  Sessions from the last round are provided unless an explicit start and end is provided with &#x60;startDate&#x60;, &#x60;endDate&#x60; or &#x60;window&#x60; optional parameters.  ## Request body filters This endpoint supports complex filtering using the request body. It is important these filters remain unaltered when making use of pagination, otherwise the results will not be coherent with the original request.  ### Multiple filter fields When multiple filter fields are provided, a logical &#x60;AND&#x60; is applied between the filters.  &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/real-user-tests/networks/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{    \&quot;searchFilters\&quot;: {     \&quot;platform\&quot;: [ \&quot;mac\&quot; ],     \&quot;domain\&quot;: [ \&quot;thousandeyes.com\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  ### Filter field with multiple values When a filter field contains multiple values, a logical &#x60;OR&#x60; is applied between the filter values.  &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/real-user-tests/networks/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;networkId\&quot;: [ \&quot;660b34109d12\&quot;, \&quot;660b34109d15\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  ### Combination of request parameters and body filters &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/real-user-tests/networks/filter?window&#x3D;1w&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;platform\&quot;: [ \&quot;mac\&quot; ],     \&quot;domain\&quot;: [ \&quot;thousandeyes.com\&quot; ],     \&quot;networkId\&quot;: [ \&quot;660b34109d12\&quot;, \&quot;660b34109d15\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  Returns a &#x60;results&#x60; array of endpoint real user tests.  Network sessions shown are from the latest round, or based on the time range specified. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.tests.Configuration;
import com.thousandeyes.sdk.endpoint.tests.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.models.*;
import com.thousandeyes.sdk.endpoint.tests.results.RealUserEndpointTestResultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        RealUserEndpointTestResultsApi apiInstance = new RealUserEndpointTestResultsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        String window = "12h"; // String | A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: `s` for seconds (default if no type is specified), `m` for minutes, `h` for hours, `d` for days, and `w` for weeks. For a precise date range, use `startDate` and `endDate`.
        OffsetDateTime startDate = OffsetDateTime.parse("2022-07-17T22:00:54Z"); // OffsetDateTime | Use with the `endDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        OffsetDateTime endDate = OffsetDateTime.parse("2022-07-18T22:00:54Z"); // OffsetDateTime | Defaults to current time the request is made. Use with the `startDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `next` value from `_links` instead of this parameter.
        RealUserEndpointTestResultsRequest realUserEndpointTestResultsRequest = new RealUserEndpointTestResultsRequest(); // RealUserEndpointTestResultsRequest | 
        try {
            RealUserEndpointTestNetworkResults result = apiInstance.filterRealUserTestsNetworkResults(aid, window, startDate, endDate, cursor, realUserEndpointTestResultsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RealUserEndpointTestResultsApi#filterRealUserTestsNetworkResults");
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
| **cursor** | **String**| (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. | [optional] |
| **realUserEndpointTestResultsRequest** | [**RealUserEndpointTestResultsRequest**](RealUserEndpointTestResultsRequest.md)|  | [optional] |

### Return type

[**RealUserEndpointTestNetworkResults**](RealUserEndpointTestNetworkResults.md)


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
| **502** | Bad Gateway |  -  |

## filterRealUserTestsNetworkResultsWithHttpInfo

> ApiResponse<RealUserEndpointTestNetworkResults> filterRealUserTestsNetworkResults filterRealUserTestsNetworkResultsWithHttpInfo(aid, window, startDate, endDate, cursor, realUserEndpointTestResultsRequest)

List endpoint real user tests networks

Returns a list of all endpoint real user tests.  Sessions from the last round are provided unless an explicit start and end is provided with &#x60;startDate&#x60;, &#x60;endDate&#x60; or &#x60;window&#x60; optional parameters.  ## Request body filters This endpoint supports complex filtering using the request body. It is important these filters remain unaltered when making use of pagination, otherwise the results will not be coherent with the original request.  ### Multiple filter fields When multiple filter fields are provided, a logical &#x60;AND&#x60; is applied between the filters.  &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/real-user-tests/networks/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{    \&quot;searchFilters\&quot;: {     \&quot;platform\&quot;: [ \&quot;mac\&quot; ],     \&quot;domain\&quot;: [ \&quot;thousandeyes.com\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  ### Filter field with multiple values When a filter field contains multiple values, a logical &#x60;OR&#x60; is applied between the filter values.  &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/real-user-tests/networks/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;networkId\&quot;: [ \&quot;660b34109d12\&quot;, \&quot;660b34109d15\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  ### Combination of request parameters and body filters &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/real-user-tests/networks/filter?window&#x3D;1w&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;platform\&quot;: [ \&quot;mac\&quot; ],     \&quot;domain\&quot;: [ \&quot;thousandeyes.com\&quot; ],     \&quot;networkId\&quot;: [ \&quot;660b34109d12\&quot;, \&quot;660b34109d15\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  Returns a &#x60;results&#x60; array of endpoint real user tests.  Network sessions shown are from the latest round, or based on the time range specified. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.tests.Configuration;
import com.thousandeyes.sdk.endpoint.tests.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.models.*;
import com.thousandeyes.sdk.endpoint.tests.results.RealUserEndpointTestResultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        RealUserEndpointTestResultsApi apiInstance = new RealUserEndpointTestResultsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        String window = "12h"; // String | A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: `s` for seconds (default if no type is specified), `m` for minutes, `h` for hours, `d` for days, and `w` for weeks. For a precise date range, use `startDate` and `endDate`.
        OffsetDateTime startDate = OffsetDateTime.parse("2022-07-17T22:00:54Z"); // OffsetDateTime | Use with the `endDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        OffsetDateTime endDate = OffsetDateTime.parse("2022-07-18T22:00:54Z"); // OffsetDateTime | Defaults to current time the request is made. Use with the `startDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `next` value from `_links` instead of this parameter.
        RealUserEndpointTestResultsRequest realUserEndpointTestResultsRequest = new RealUserEndpointTestResultsRequest(); // RealUserEndpointTestResultsRequest | 
        try {
            ApiResponse<RealUserEndpointTestNetworkResults> response = apiInstance.filterRealUserTestsNetworkResultsWithHttpInfo(aid, window, startDate, endDate, cursor, realUserEndpointTestResultsRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RealUserEndpointTestResultsApi#filterRealUserTestsNetworkResults");
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
| **cursor** | **String**| (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. | [optional] |
| **realUserEndpointTestResultsRequest** | [**RealUserEndpointTestResultsRequest**](RealUserEndpointTestResultsRequest.md)|  | [optional] |

### Return type

ApiResponse<[**RealUserEndpointTestNetworkResults**](RealUserEndpointTestNetworkResults.md)>


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
| **502** | Bad Gateway |  -  |


## filterRealUserTestsResults

> RealUserEndpointTestResults filterRealUserTestsResults(aid, window, startDate, endDate, cursor, realUserEndpointTestResultsRequest)

List endpoint real user tests

Returns a list of all endpoint real user tests. Results from the last round are provided unless an explicit start and end is provided with &#x60;startDate&#x60;, &#x60;endDate&#x60; or &#x60;window&#x60; optional parameters.  ## Request body filters This endpoint supports complex filtering using the request body. It is important these filters remain unaltered when making use of pagination, otherwise the results will not be coherent with the original request.  ### Multiple filter fields When multiple filter fields are provided, a logical &#x60;AND&#x60; is applied between the filters.  &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/real-user-tests/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;platform\&quot;: [ \&quot;mac\&quot; ],     \&quot;domain\&quot;: [ \&quot;thousandeyes.com\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  ### Filter field with multiple values When a filter field contains multiple values, a logical &#x60;OR&#x60; is applied between the filter values.  &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/real-user-tests/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{     \&quot;searchFilters\&quot;: {       \&quot;networkId\&quot;: [ \&quot;660b34109d12\&quot;, \&quot;660b34109d15\&quot; ]     }   }&#39; &#x60;&#x60;&#x60;  ### Combination of request parameters and body filters &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/real-user-tests/filter?window&#x3D;1w&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{     \&quot;searchFilters\&quot;: {       \&quot;platform\&quot;: [ \&quot;mac\&quot; ],       \&quot;domain\&quot;: [ \&quot;thousandeyes.com\&quot; ],       \&quot;networkId\&quot;: [ \&quot;660b34109d12\&quot;, \&quot;660b34109d15\&quot; ]     }   }&#39; &#x60;&#x60;&#x60;  Returns a &#x60;results&#x60; array of endpoint real user tests. Either the latest results, or based on the time range and body filters specified. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.tests.Configuration;
import com.thousandeyes.sdk.endpoint.tests.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.models.*;
import com.thousandeyes.sdk.endpoint.tests.results.RealUserEndpointTestResultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        RealUserEndpointTestResultsApi apiInstance = new RealUserEndpointTestResultsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        String window = "12h"; // String | A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: `s` for seconds (default if no type is specified), `m` for minutes, `h` for hours, `d` for days, and `w` for weeks. For a precise date range, use `startDate` and `endDate`.
        OffsetDateTime startDate = OffsetDateTime.parse("2022-07-17T22:00:54Z"); // OffsetDateTime | Use with the `endDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        OffsetDateTime endDate = OffsetDateTime.parse("2022-07-18T22:00:54Z"); // OffsetDateTime | Defaults to current time the request is made. Use with the `startDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `next` value from `_links` instead of this parameter.
        RealUserEndpointTestResultsRequest realUserEndpointTestResultsRequest = new RealUserEndpointTestResultsRequest(); // RealUserEndpointTestResultsRequest | 
        try {
            RealUserEndpointTestResults result = apiInstance.filterRealUserTestsResults(aid, window, startDate, endDate, cursor, realUserEndpointTestResultsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RealUserEndpointTestResultsApi#filterRealUserTestsResults");
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
| **cursor** | **String**| (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. | [optional] |
| **realUserEndpointTestResultsRequest** | [**RealUserEndpointTestResultsRequest**](RealUserEndpointTestResultsRequest.md)|  | [optional] |

### Return type

[**RealUserEndpointTestResults**](RealUserEndpointTestResults.md)


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
| **502** | Bad Gateway |  -  |

## filterRealUserTestsResultsWithHttpInfo

> ApiResponse<RealUserEndpointTestResults> filterRealUserTestsResults filterRealUserTestsResultsWithHttpInfo(aid, window, startDate, endDate, cursor, realUserEndpointTestResultsRequest)

List endpoint real user tests

Returns a list of all endpoint real user tests. Results from the last round are provided unless an explicit start and end is provided with &#x60;startDate&#x60;, &#x60;endDate&#x60; or &#x60;window&#x60; optional parameters.  ## Request body filters This endpoint supports complex filtering using the request body. It is important these filters remain unaltered when making use of pagination, otherwise the results will not be coherent with the original request.  ### Multiple filter fields When multiple filter fields are provided, a logical &#x60;AND&#x60; is applied between the filters.  &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/real-user-tests/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;platform\&quot;: [ \&quot;mac\&quot; ],     \&quot;domain\&quot;: [ \&quot;thousandeyes.com\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  ### Filter field with multiple values When a filter field contains multiple values, a logical &#x60;OR&#x60; is applied between the filter values.  &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/real-user-tests/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{     \&quot;searchFilters\&quot;: {       \&quot;networkId\&quot;: [ \&quot;660b34109d12\&quot;, \&quot;660b34109d15\&quot; ]     }   }&#39; &#x60;&#x60;&#x60;  ### Combination of request parameters and body filters &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/real-user-tests/filter?window&#x3D;1w&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{     \&quot;searchFilters\&quot;: {       \&quot;platform\&quot;: [ \&quot;mac\&quot; ],       \&quot;domain\&quot;: [ \&quot;thousandeyes.com\&quot; ],       \&quot;networkId\&quot;: [ \&quot;660b34109d12\&quot;, \&quot;660b34109d15\&quot; ]     }   }&#39; &#x60;&#x60;&#x60;  Returns a &#x60;results&#x60; array of endpoint real user tests. Either the latest results, or based on the time range and body filters specified. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.tests.Configuration;
import com.thousandeyes.sdk.endpoint.tests.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.models.*;
import com.thousandeyes.sdk.endpoint.tests.results.RealUserEndpointTestResultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        RealUserEndpointTestResultsApi apiInstance = new RealUserEndpointTestResultsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        String window = "12h"; // String | A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: `s` for seconds (default if no type is specified), `m` for minutes, `h` for hours, `d` for days, and `w` for weeks. For a precise date range, use `startDate` and `endDate`.
        OffsetDateTime startDate = OffsetDateTime.parse("2022-07-17T22:00:54Z"); // OffsetDateTime | Use with the `endDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        OffsetDateTime endDate = OffsetDateTime.parse("2022-07-18T22:00:54Z"); // OffsetDateTime | Defaults to current time the request is made. Use with the `startDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `next` value from `_links` instead of this parameter.
        RealUserEndpointTestResultsRequest realUserEndpointTestResultsRequest = new RealUserEndpointTestResultsRequest(); // RealUserEndpointTestResultsRequest | 
        try {
            ApiResponse<RealUserEndpointTestResults> response = apiInstance.filterRealUserTestsResultsWithHttpInfo(aid, window, startDate, endDate, cursor, realUserEndpointTestResultsRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RealUserEndpointTestResultsApi#filterRealUserTestsResults");
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
| **cursor** | **String**| (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. | [optional] |
| **realUserEndpointTestResultsRequest** | [**RealUserEndpointTestResultsRequest**](RealUserEndpointTestResultsRequest.md)|  | [optional] |

### Return type

ApiResponse<[**RealUserEndpointTestResults**](RealUserEndpointTestResults.md)>


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
| **502** | Bad Gateway |  -  |


## filterRealUserTestsVisitedPagesResults

> RealUserEndpointTestPageResults filterRealUserTestsVisitedPagesResults(aid, window, startDate, endDate, cursor, realUserEndpointTestResultRequestFilter)

List endpoint real user tests visited pages

Returns a list of all endpoint real user tests visited pages.  Sessions from the last round are provided unless an explicit start and end is provided with &#x60;startDate&#x60;, &#x60;endDate&#x60; or &#x60;window&#x60; optional parameters.  ## Request body filters This endpoint supports complex filtering using the request body. It is important these filters remain unaltered when making use of pagination, otherwise the results will not be coherent with the original request.  ### Multiple filter fields When multiple filter fields are provided, a logical &#x60;AND&#x60; is applied between the filters.  &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/real-user-tests/pages/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;platform\&quot;: [ \&quot;mac\&quot; ],     \&quot;domain\&quot;: [ \&quot;thousandeyes.com\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  ### Filter field with multiple values When a filter field contains multiple values, a logical &#x60;OR&#x60; is applied between the filter values.  &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/real-user-tests/pages/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;networkId\&quot;: [ \&quot;660b34109d12\&quot;, \&quot;660b34109d15\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  ### Combination of request parameters and body filters &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/real-user-tests/pages/filter?window&#x3D;1w&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;platform\&quot;: [ \&quot;mac\&quot; ],     \&quot;domain\&quot;: [ \&quot;thousandeyes.com\&quot; ],     \&quot;networkId\&quot;: [ \&quot;660b34109d12\&quot;, \&quot;660b34109d15\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  Returns a &#x60;results&#x60; array of user loaded pages in an endpoint real user test.  Pages shown are from the latest round, or based on the time range specified. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.tests.Configuration;
import com.thousandeyes.sdk.endpoint.tests.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.models.*;
import com.thousandeyes.sdk.endpoint.tests.results.RealUserEndpointTestResultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        RealUserEndpointTestResultsApi apiInstance = new RealUserEndpointTestResultsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        String window = "12h"; // String | A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: `s` for seconds (default if no type is specified), `m` for minutes, `h` for hours, `d` for days, and `w` for weeks. For a precise date range, use `startDate` and `endDate`.
        OffsetDateTime startDate = OffsetDateTime.parse("2022-07-17T22:00:54Z"); // OffsetDateTime | Use with the `endDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        OffsetDateTime endDate = OffsetDateTime.parse("2022-07-18T22:00:54Z"); // OffsetDateTime | Defaults to current time the request is made. Use with the `startDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `next` value from `_links` instead of this parameter.
        RealUserEndpointTestResultRequestFilter realUserEndpointTestResultRequestFilter = new RealUserEndpointTestResultRequestFilter(); // RealUserEndpointTestResultRequestFilter | 
        try {
            RealUserEndpointTestPageResults result = apiInstance.filterRealUserTestsVisitedPagesResults(aid, window, startDate, endDate, cursor, realUserEndpointTestResultRequestFilter);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RealUserEndpointTestResultsApi#filterRealUserTestsVisitedPagesResults");
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
| **cursor** | **String**| (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. | [optional] |
| **realUserEndpointTestResultRequestFilter** | [**RealUserEndpointTestResultRequestFilter**](RealUserEndpointTestResultRequestFilter.md)|  | [optional] |

### Return type

[**RealUserEndpointTestPageResults**](RealUserEndpointTestPageResults.md)


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
| **502** | Bad Gateway |  -  |

## filterRealUserTestsVisitedPagesResultsWithHttpInfo

> ApiResponse<RealUserEndpointTestPageResults> filterRealUserTestsVisitedPagesResults filterRealUserTestsVisitedPagesResultsWithHttpInfo(aid, window, startDate, endDate, cursor, realUserEndpointTestResultRequestFilter)

List endpoint real user tests visited pages

Returns a list of all endpoint real user tests visited pages.  Sessions from the last round are provided unless an explicit start and end is provided with &#x60;startDate&#x60;, &#x60;endDate&#x60; or &#x60;window&#x60; optional parameters.  ## Request body filters This endpoint supports complex filtering using the request body. It is important these filters remain unaltered when making use of pagination, otherwise the results will not be coherent with the original request.  ### Multiple filter fields When multiple filter fields are provided, a logical &#x60;AND&#x60; is applied between the filters.  &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/real-user-tests/pages/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;platform\&quot;: [ \&quot;mac\&quot; ],     \&quot;domain\&quot;: [ \&quot;thousandeyes.com\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  ### Filter field with multiple values When a filter field contains multiple values, a logical &#x60;OR&#x60; is applied between the filter values.  &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/real-user-tests/pages/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;networkId\&quot;: [ \&quot;660b34109d12\&quot;, \&quot;660b34109d15\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  ### Combination of request parameters and body filters &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/real-user-tests/pages/filter?window&#x3D;1w&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;platform\&quot;: [ \&quot;mac\&quot; ],     \&quot;domain\&quot;: [ \&quot;thousandeyes.com\&quot; ],     \&quot;networkId\&quot;: [ \&quot;660b34109d12\&quot;, \&quot;660b34109d15\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  Returns a &#x60;results&#x60; array of user loaded pages in an endpoint real user test.  Pages shown are from the latest round, or based on the time range specified. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.tests.Configuration;
import com.thousandeyes.sdk.endpoint.tests.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.models.*;
import com.thousandeyes.sdk.endpoint.tests.results.RealUserEndpointTestResultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        RealUserEndpointTestResultsApi apiInstance = new RealUserEndpointTestResultsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        String window = "12h"; // String | A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: `s` for seconds (default if no type is specified), `m` for minutes, `h` for hours, `d` for days, and `w` for weeks. For a precise date range, use `startDate` and `endDate`.
        OffsetDateTime startDate = OffsetDateTime.parse("2022-07-17T22:00:54Z"); // OffsetDateTime | Use with the `endDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        OffsetDateTime endDate = OffsetDateTime.parse("2022-07-18T22:00:54Z"); // OffsetDateTime | Defaults to current time the request is made. Use with the `startDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `next` value from `_links` instead of this parameter.
        RealUserEndpointTestResultRequestFilter realUserEndpointTestResultRequestFilter = new RealUserEndpointTestResultRequestFilter(); // RealUserEndpointTestResultRequestFilter | 
        try {
            ApiResponse<RealUserEndpointTestPageResults> response = apiInstance.filterRealUserTestsVisitedPagesResultsWithHttpInfo(aid, window, startDate, endDate, cursor, realUserEndpointTestResultRequestFilter);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RealUserEndpointTestResultsApi#filterRealUserTestsVisitedPagesResults");
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
| **cursor** | **String**| (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. | [optional] |
| **realUserEndpointTestResultRequestFilter** | [**RealUserEndpointTestResultRequestFilter**](RealUserEndpointTestResultRequestFilter.md)|  | [optional] |

### Return type

ApiResponse<[**RealUserEndpointTestPageResults**](RealUserEndpointTestPageResults.md)>


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
| **502** | Bad Gateway |  -  |


## getRealUserTestPageResults

> RealUserEndpointTestPageDetailResult getRealUserTestPageResults(id, pageId, aid)

Retrieve endpoint real user test page

Returns details for endpoint real user test web page request.  Provides complete waterfall information with all object requests.  Sends back detailed endpoint real user test web page request.  Returned object has a single field: &#x60;har&#x60; which is an HAR object according to the HTTP Archive 1.2 specifications.  [You can read more about the specification](http://www.softwareishard.com/blog/har-12-spec/).  In addition to standard fields, the object har includes a custom property &#x60;systemMetrics&#x60; which contain metrics about CPU and physical memory usage.  Check &#x60;SystemMetrics&#x60; on schemas tab for more information. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.tests.Configuration;
import com.thousandeyes.sdk.endpoint.tests.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.models.*;
import com.thousandeyes.sdk.endpoint.tests.results.RealUserEndpointTestResultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        RealUserEndpointTestResultsApi apiInstance = new RealUserEndpointTestResultsApi(defaultClient);
        String id = "07625:1490529480:h3qJQTpl"; // String | The real user test id.
        String pageId = "281474976710706"; // String | Web page ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            RealUserEndpointTestPageDetailResult result = apiInstance.getRealUserTestPageResults(id, pageId, aid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RealUserEndpointTestResultsApi#getRealUserTestPageResults");
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
| **id** | **String**| The real user test id. | |
| **pageId** | **String**| Web page ID | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**RealUserEndpointTestPageDetailResult**](RealUserEndpointTestPageDetailResult.md)


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
| **502** | Bad Gateway |  -  |

## getRealUserTestPageResultsWithHttpInfo

> ApiResponse<RealUserEndpointTestPageDetailResult> getRealUserTestPageResults getRealUserTestPageResultsWithHttpInfo(id, pageId, aid)

Retrieve endpoint real user test page

Returns details for endpoint real user test web page request.  Provides complete waterfall information with all object requests.  Sends back detailed endpoint real user test web page request.  Returned object has a single field: &#x60;har&#x60; which is an HAR object according to the HTTP Archive 1.2 specifications.  [You can read more about the specification](http://www.softwareishard.com/blog/har-12-spec/).  In addition to standard fields, the object har includes a custom property &#x60;systemMetrics&#x60; which contain metrics about CPU and physical memory usage.  Check &#x60;SystemMetrics&#x60; on schemas tab for more information. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.tests.Configuration;
import com.thousandeyes.sdk.endpoint.tests.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.models.*;
import com.thousandeyes.sdk.endpoint.tests.results.RealUserEndpointTestResultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        RealUserEndpointTestResultsApi apiInstance = new RealUserEndpointTestResultsApi(defaultClient);
        String id = "07625:1490529480:h3qJQTpl"; // String | The real user test id.
        String pageId = "281474976710706"; // String | Web page ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiResponse<RealUserEndpointTestPageDetailResult> response = apiInstance.getRealUserTestPageResultsWithHttpInfo(id, pageId, aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RealUserEndpointTestResultsApi#getRealUserTestPageResults");
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
| **id** | **String**| The real user test id. | |
| **pageId** | **String**| Web page ID | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

ApiResponse<[**RealUserEndpointTestPageDetailResult**](RealUserEndpointTestPageDetailResult.md)>


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
| **502** | Bad Gateway |  -  |


## getRealUserTestResults

> RealUserEndpointTestDetailResults getRealUserTestResults(id, aid)

Retrieve endpoint real user test

Provides details for an endpoint real user test. Returns a results array containing detailed information about endpoint real user tests.\&quot; 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.tests.Configuration;
import com.thousandeyes.sdk.endpoint.tests.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.models.*;
import com.thousandeyes.sdk.endpoint.tests.results.RealUserEndpointTestResultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        RealUserEndpointTestResultsApi apiInstance = new RealUserEndpointTestResultsApi(defaultClient);
        String id = "07625:1490529480:h3qJQTpl"; // String | The real user test id.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            RealUserEndpointTestDetailResults result = apiInstance.getRealUserTestResults(id, aid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RealUserEndpointTestResultsApi#getRealUserTestResults");
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
| **id** | **String**| The real user test id. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**RealUserEndpointTestDetailResults**](RealUserEndpointTestDetailResults.md)


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
| **502** | Bad Gateway |  -  |

## getRealUserTestResultsWithHttpInfo

> ApiResponse<RealUserEndpointTestDetailResults> getRealUserTestResults getRealUserTestResultsWithHttpInfo(id, aid)

Retrieve endpoint real user test

Provides details for an endpoint real user test. Returns a results array containing detailed information about endpoint real user tests.\&quot; 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.tests.Configuration;
import com.thousandeyes.sdk.endpoint.tests.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.models.*;
import com.thousandeyes.sdk.endpoint.tests.results.RealUserEndpointTestResultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        RealUserEndpointTestResultsApi apiInstance = new RealUserEndpointTestResultsApi(defaultClient);
        String id = "07625:1490529480:h3qJQTpl"; // String | The real user test id.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiResponse<RealUserEndpointTestDetailResults> response = apiInstance.getRealUserTestResultsWithHttpInfo(id, aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RealUserEndpointTestResultsApi#getRealUserTestResults");
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
| **id** | **String**| The real user test id. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

ApiResponse<[**RealUserEndpointTestDetailResults**](RealUserEndpointTestDetailResults.md)>


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
| **502** | Bad Gateway |  -  |

