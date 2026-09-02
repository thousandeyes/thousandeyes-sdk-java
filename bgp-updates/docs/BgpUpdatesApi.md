# BgpUpdatesApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBgpUpdates**](BgpUpdatesApi.md#getBgpUpdates) | **GET** /bgp/updates | List BGP updates |
| [**getBgpUpdatesWithHttpInfo**](BgpUpdatesApi.md#getBgpUpdatesWithHttpInfo) | **GET** /bgp/updates | List BGP updates |



## getBgpUpdates

> BgpUpdates getBgpUpdates(GetBgpUpdatesRequest)

List BGP updates

Retrieves a paginated list of BGP updates for prefixes tracked by the account group. When &#x60;prefix&#x60; filters are omitted, updates are returned for all prefixes currently tracked by the account group. Use the returned pagination links to request subsequent pages. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.bgp.Configuration;
import com.thousandeyes.sdk.bgp.authentication.*;
import com.thousandeyes.sdk.bgp.updates.model.*;
import com.thousandeyes.sdk.bgp.updates.BgpUpdatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        BgpUpdatesApi apiInstance = new BgpUpdatesApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        Integer max = 20; // Integer | Maximum number of BGP updates to return.
        String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `next` value from `_links` instead of this parameter.
        List<BgpDataExpandOption> expand = Arrays.asList(); // List<BgpDataExpandOption> | Optional expansions. Pass `expand=monitor` to replace monitor IDs with full BGP monitor objects.
        OffsetDateTime startDate = OffsetDateTime.parse("2022-07-17T22:00:54Z"); // OffsetDateTime | Use with the `endDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        OffsetDateTime endDate = OffsetDateTime.parse("2022-07-18T22:00:54Z"); // OffsetDateTime | Defaults to current time the request is made. Use with the `startDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        List<String> prefix = Arrays.asList(); // List<String> | Prefix CIDR filters. Repeat the parameter to filter by multiple prefixes.
        List<Long> originAs = Arrays.asList(); // List<Long> | Origin AS filters. Repeat the parameter to filter by multiple ASNs.
        List<String> asPath = Arrays.asList(); // List<String> | AS path filter, expressed as a space-separated list of ASNs. Repeat the parameter to filter by multiple AS paths.
        List<BgpRpkiStatus> rpkiStatus = Arrays.asList(); // List<BgpRpkiStatus> | RPKI status filters.
        List<BgpUpdateType> updateType = Arrays.asList(); // List<BgpUpdateType> | BGP update type filters.
        List<String> monitor = Arrays.asList(); // List<String> | BGP monitor ID filters. Repeat the parameter to filter by multiple monitors. Get `monitorId` from the `/monitors` endpoint.
        List<String> communities = Arrays.asList(); // List<String> | BGP community filters. Repeat the parameter to filter by multiple communities.
        try {
            BgpUpdatesApi.GetBgpUpdatesRequest request = BgpUpdatesApi.GetBgpUpdatesRequest.builder()
                .aid(aid)
                .max(max)
                .cursor(cursor)
                .expand(expand)
                .startDate(startDate)
                .endDate(endDate)
                .prefix(prefix)
                .originAs(originAs)
                .asPath(asPath)
                .rpkiStatus(rpkiStatus)
                .updateType(updateType)
                .monitor(monitor)
                .communities(communities)
                .build();
            BgpUpdates result = apiInstance.getBgpUpdates(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BgpUpdatesApi#getBgpUpdates");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| request | [**GetBgpUpdatesRequest**](BgpUpdatesApi.md#GetBgpUpdatesRequest)|-|-|

### Return type

[**BgpUpdates**](BgpUpdates.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of BGP updates. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad Gateway |  -  |

## getBgpUpdatesWithHttpInfo

> ApiResponse<BgpUpdates> getBgpUpdates getBgpUpdatesWithHttpInfo(GetBgpUpdatesRequest)

List BGP updates

Retrieves a paginated list of BGP updates for prefixes tracked by the account group. When &#x60;prefix&#x60; filters are omitted, updates are returned for all prefixes currently tracked by the account group. Use the returned pagination links to request subsequent pages. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.bgp.Configuration;
import com.thousandeyes.sdk.bgp.authentication.*;
import com.thousandeyes.sdk.bgp.updates.model.*;
import com.thousandeyes.sdk.bgp.updates.BgpUpdatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        BgpUpdatesApi apiInstance = new BgpUpdatesApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        Integer max = 20; // Integer | Maximum number of BGP updates to return.
        String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `next` value from `_links` instead of this parameter.
        List<BgpDataExpandOption> expand = Arrays.asList(); // List<BgpDataExpandOption> | Optional expansions. Pass `expand=monitor` to replace monitor IDs with full BGP monitor objects.
        OffsetDateTime startDate = OffsetDateTime.parse("2022-07-17T22:00:54Z"); // OffsetDateTime | Use with the `endDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        OffsetDateTime endDate = OffsetDateTime.parse("2022-07-18T22:00:54Z"); // OffsetDateTime | Defaults to current time the request is made. Use with the `startDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        List<String> prefix = Arrays.asList(); // List<String> | Prefix CIDR filters. Repeat the parameter to filter by multiple prefixes.
        List<Long> originAs = Arrays.asList(); // List<Long> | Origin AS filters. Repeat the parameter to filter by multiple ASNs.
        List<String> asPath = Arrays.asList(); // List<String> | AS path filter, expressed as a space-separated list of ASNs. Repeat the parameter to filter by multiple AS paths.
        List<BgpRpkiStatus> rpkiStatus = Arrays.asList(); // List<BgpRpkiStatus> | RPKI status filters.
        List<BgpUpdateType> updateType = Arrays.asList(); // List<BgpUpdateType> | BGP update type filters.
        List<String> monitor = Arrays.asList(); // List<String> | BGP monitor ID filters. Repeat the parameter to filter by multiple monitors. Get `monitorId` from the `/monitors` endpoint.
        List<String> communities = Arrays.asList(); // List<String> | BGP community filters. Repeat the parameter to filter by multiple communities.
        try {
            BgpUpdatesApi.GetBgpUpdatesRequest request = BgpUpdatesApi.GetBgpUpdatesRequest.builder()
                .aid(aid)
                .max(max)
                .cursor(cursor)
                .expand(expand)
                .startDate(startDate)
                .endDate(endDate)
                .prefix(prefix)
                .originAs(originAs)
                .asPath(asPath)
                .rpkiStatus(rpkiStatus)
                .updateType(updateType)
                .monitor(monitor)
                .communities(communities)
                .build();
            ApiResponse<BgpUpdates> response = apiInstance.getBgpUpdatesWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BgpUpdatesApi#getBgpUpdates");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| request | [**GetBgpUpdatesRequest**](BgpUpdatesApi.md#GetBgpUpdatesRequest)|-|-|

### Return type

ApiResponse<[**BgpUpdates**](BgpUpdates.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of BGP updates. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad Gateway |  -  |


<a id="GetBgpUpdatesRequest"></a>
## GetBgpUpdatesRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **max** | **Integer** | Maximum number of BGP updates to return. | [optional] [default to 20] |
| **cursor** | **String** | (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. | [optional] |
| **expand** | [**List&lt;BgpDataExpandOption&gt;**](BgpDataExpandOption.md) | Optional expansions. Pass &#x60;expand&#x3D;monitor&#x60; to replace monitor IDs with full BGP monitor objects. | [optional] |
| **startDate** | **OffsetDateTime** | Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. | [optional] |
| **endDate** | **OffsetDateTime** | Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. | [optional] |
| **prefix** | [**List&lt;String&gt;**](String.md) | Prefix CIDR filters. Repeat the parameter to filter by multiple prefixes. | [optional] |
| **originAs** | [**List&lt;Long&gt;**](Long.md) | Origin AS filters. Repeat the parameter to filter by multiple ASNs. | [optional] |
| **asPath** | [**List&lt;String&gt;**](String.md) | AS path filter, expressed as a space-separated list of ASNs. Repeat the parameter to filter by multiple AS paths. | [optional] |
| **rpkiStatus** | [**List&lt;BgpRpkiStatus&gt;**](BgpRpkiStatus.md) | RPKI status filters. | [optional] |
| **updateType** | [**List&lt;BgpUpdateType&gt;**](BgpUpdateType.md) | BGP update type filters. | [optional] |
| **monitor** | [**List&lt;String&gt;**](String.md) | BGP monitor ID filters. Repeat the parameter to filter by multiple monitors. Get &#x60;monitorId&#x60; from the &#x60;/monitors&#x60; endpoint. | [optional] |
| **communities** | [**List&lt;String&gt;**](String.md) | BGP community filters. Repeat the parameter to filter by multiple communities. | [optional] |


