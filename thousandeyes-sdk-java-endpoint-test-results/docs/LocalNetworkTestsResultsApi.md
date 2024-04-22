# LocalNetworkTestsResultsApi

All URIs are relative to *https://api.thousandeyes.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEndpointLocalNetworkTopologyDetails**](LocalNetworkTestsResultsApi.md#getEndpointLocalNetworkTopologyDetails) | **GET** /v7/endpoint/test-results/local-networks/topologies/{networkTopologyId} | Retrieve endpoint local network topology |
| [**getEndpointLocalNetworkTopologyDetailsWithHttpInfo**](LocalNetworkTestsResultsApi.md#getEndpointLocalNetworkTopologyDetailsWithHttpInfo) | **GET** /v7/endpoint/test-results/local-networks/topologies/{networkTopologyId} | Retrieve endpoint local network topology |
| [**getEndpointLocalNetworks**](LocalNetworkTestsResultsApi.md#getEndpointLocalNetworks) | **GET** /v7/endpoint/test-results/local-networks | List local networks |
| [**getEndpointLocalNetworksWithHttpInfo**](LocalNetworkTestsResultsApi.md#getEndpointLocalNetworksWithHttpInfo) | **GET** /v7/endpoint/test-results/local-networks | List local networks |
| [**getEndpointLocalNetworksTopologies**](LocalNetworkTestsResultsApi.md#getEndpointLocalNetworksTopologies) | **POST** /v7/endpoint/test-results/local-networks/topologies/filter | List endpoint network topologies probes |
| [**getEndpointLocalNetworksTopologiesWithHttpInfo**](LocalNetworkTestsResultsApi.md#getEndpointLocalNetworksTopologiesWithHttpInfo) | **POST** /v7/endpoint/test-results/local-networks/topologies/filter | List endpoint network topologies probes |



## getEndpointLocalNetworkTopologyDetails

> GetEndpointLocalNetworkTopologyDetails200Response getEndpointLocalNetworkTopologyDetails(networkTopologyId, aid)

Retrieve endpoint local network topology

Returns detailed data of a local network topology. 

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.endpoint.tests.Configuration;
import com.thousandeyes.api.endpoint.tests.authentication.*;
import com.thousandeyes.api.endpoint.tests.models.*;
import com.thousandeyes.api.endpoint.tests.results.LocalNetworkTestsResultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        LocalNetworkTestsResultsApi apiInstance = new LocalNetworkTestsResultsApi(defaultClient);
        String networkTopologyId = "00160:39c518560de9:1491651900:236e6f18"; // String | The network topology ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            GetEndpointLocalNetworkTopologyDetails200Response result = apiInstance.getEndpointLocalNetworkTopologyDetails(networkTopologyId, aid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LocalNetworkTestsResultsApi#getEndpointLocalNetworkTopologyDetails");
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
| **networkTopologyId** | **String**| The network topology ID. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**GetEndpointLocalNetworkTopologyDetails200Response**](GetEndpointLocalNetworkTopologyDetails200Response.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/problem+json

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

## getEndpointLocalNetworkTopologyDetailsWithHttpInfo

> ApiResponse<GetEndpointLocalNetworkTopologyDetails200Response> getEndpointLocalNetworkTopologyDetails getEndpointLocalNetworkTopologyDetailsWithHttpInfo(networkTopologyId, aid)

Retrieve endpoint local network topology

Returns detailed data of a local network topology. 

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.common.ApiResponse;
import com.thousandeyes.api.endpoint.tests.Configuration;
import com.thousandeyes.api.endpoint.tests.authentication.*;
import com.thousandeyes.api.endpoint.tests.models.*;
import com.thousandeyes.api.endpoint.tests.results.LocalNetworkTestsResultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        LocalNetworkTestsResultsApi apiInstance = new LocalNetworkTestsResultsApi(defaultClient);
        String networkTopologyId = "00160:39c518560de9:1491651900:236e6f18"; // String | The network topology ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiResponse<GetEndpointLocalNetworkTopologyDetails200Response> response = apiInstance.getEndpointLocalNetworkTopologyDetailsWithHttpInfo(networkTopologyId, aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LocalNetworkTestsResultsApi#getEndpointLocalNetworkTopologyDetails");
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
| **networkTopologyId** | **String**| The network topology ID. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

ApiResponse<[**GetEndpointLocalNetworkTopologyDetails200Response**](GetEndpointLocalNetworkTopologyDetails200Response.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/problem+json

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


## getEndpointLocalNetworks

> GetEndpointLocalNetworks200Response getEndpointLocalNetworks(aid)

List local networks

Returns a list of all the networks used by endpoint agents.  Sends back a &#x60;localNetworks&#x60; array. 

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.endpoint.tests.Configuration;
import com.thousandeyes.api.endpoint.tests.authentication.*;
import com.thousandeyes.api.endpoint.tests.models.*;
import com.thousandeyes.api.endpoint.tests.results.LocalNetworkTestsResultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        LocalNetworkTestsResultsApi apiInstance = new LocalNetworkTestsResultsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            GetEndpointLocalNetworks200Response result = apiInstance.getEndpointLocalNetworks(aid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LocalNetworkTestsResultsApi#getEndpointLocalNetworks");
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

[**GetEndpointLocalNetworks200Response**](GetEndpointLocalNetworks200Response.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/problem+json

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

## getEndpointLocalNetworksWithHttpInfo

> ApiResponse<GetEndpointLocalNetworks200Response> getEndpointLocalNetworks getEndpointLocalNetworksWithHttpInfo(aid)

List local networks

Returns a list of all the networks used by endpoint agents.  Sends back a &#x60;localNetworks&#x60; array. 

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.common.ApiResponse;
import com.thousandeyes.api.endpoint.tests.Configuration;
import com.thousandeyes.api.endpoint.tests.authentication.*;
import com.thousandeyes.api.endpoint.tests.models.*;
import com.thousandeyes.api.endpoint.tests.results.LocalNetworkTestsResultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        LocalNetworkTestsResultsApi apiInstance = new LocalNetworkTestsResultsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiResponse<GetEndpointLocalNetworks200Response> response = apiInstance.getEndpointLocalNetworksWithHttpInfo(aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LocalNetworkTestsResultsApi#getEndpointLocalNetworks");
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

ApiResponse<[**GetEndpointLocalNetworks200Response**](GetEndpointLocalNetworks200Response.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/problem+json

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


## getEndpointLocalNetworksTopologies

> GetEndpointLocalNetworksTopologies200Response getEndpointLocalNetworksTopologies(aid, window, startDate, endDate, cursor, getEndpointLocalNetworksTopologiesRequest)

List endpoint network topologies probes

Returns a list of all endpoint local network topologies probes.  Results from the last round are provided unless an explicit start and end is provided with &#x60;startDate&#x60;, &#x60;endDate&#x60; or &#x60;window&#x60; optional parameters.  ## Request body filters This endpoint supports complex filtering using the request body. It is important these filters remain unaltered when making use of pagination, otherwise the results will not be coherent with the original request.  ### Multiple filter fields When multiple filter fields are provided, a logical &#x60;AND&#x60; is applied between the filters.  &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/local-networks/topologies/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;platform\&quot;: [ \&quot;mac\&quot; ],     \&quot;domain\&quot;: [ \&quot;thousandeyes.com\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  ### Filter field with multiple values When a filter field contains multiple values, a logical &#x60;OR&#x60; is applied between the filter values.  &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/local-networks/topologies/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;networkId\&quot;: [ \&quot;660b34109d12\&quot;, \&quot;660b34109d15\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  ### Combination of request parameters and body filters &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/local-networks/topologies/filter?window&#x3D;12h&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;platform\&quot;: [ \&quot;mac\&quot; ],     \&quot;domain\&quot;: [ \&quot;thousandeyes.com\&quot; ],     \&quot;networkId\&quot;: [ \&quot;660b34109d12\&quot;, \&quot;660b34109d15\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  ### Warning Note that a maximum of 12h worth of data can be retrieved at once.  If you need more, you need to make multiple requests.  Returns a &#x60;results&#x60; array of network topology probes.  Network topology probes shown are from the latest round, or based on the time range specified. 

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.endpoint.tests.Configuration;
import com.thousandeyes.api.endpoint.tests.authentication.*;
import com.thousandeyes.api.endpoint.tests.models.*;
import com.thousandeyes.api.endpoint.tests.results.LocalNetworkTestsResultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        LocalNetworkTestsResultsApi apiInstance = new LocalNetworkTestsResultsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        String window = "12h"; // String | A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: `s` for seconds (default if no type is specified), `m` for minutes, `h` for hours, `d` for days, and `w` for weeks. For a precise date range, use `startDate` and `endDate`.
        OffsetDateTime startDate = OffsetDateTime.parse("2022-07-17T22:00:54Z"); // OffsetDateTime | Use with the `endDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        OffsetDateTime endDate = OffsetDateTime.parse("2022-07-18T22:00:54Z"); // OffsetDateTime | Defaults to current time the request is made. Use with the `startDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `next` value from `_links` instead of this parameter.
        GetEndpointLocalNetworksTopologiesRequest getEndpointLocalNetworksTopologiesRequest = new GetEndpointLocalNetworksTopologiesRequest(); // GetEndpointLocalNetworksTopologiesRequest | 
        try {
            GetEndpointLocalNetworksTopologies200Response result = apiInstance.getEndpointLocalNetworksTopologies(aid, window, startDate, endDate, cursor, getEndpointLocalNetworksTopologiesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LocalNetworkTestsResultsApi#getEndpointLocalNetworksTopologies");
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
| **getEndpointLocalNetworksTopologiesRequest** | [**GetEndpointLocalNetworksTopologiesRequest**](GetEndpointLocalNetworksTopologiesRequest.md)|  | [optional] |

### Return type

[**GetEndpointLocalNetworksTopologies200Response**](GetEndpointLocalNetworksTopologies200Response.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
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
| **502** | Bad Gateway |  -  |

## getEndpointLocalNetworksTopologiesWithHttpInfo

> ApiResponse<GetEndpointLocalNetworksTopologies200Response> getEndpointLocalNetworksTopologies getEndpointLocalNetworksTopologiesWithHttpInfo(aid, window, startDate, endDate, cursor, getEndpointLocalNetworksTopologiesRequest)

List endpoint network topologies probes

Returns a list of all endpoint local network topologies probes.  Results from the last round are provided unless an explicit start and end is provided with &#x60;startDate&#x60;, &#x60;endDate&#x60; or &#x60;window&#x60; optional parameters.  ## Request body filters This endpoint supports complex filtering using the request body. It is important these filters remain unaltered when making use of pagination, otherwise the results will not be coherent with the original request.  ### Multiple filter fields When multiple filter fields are provided, a logical &#x60;AND&#x60; is applied between the filters.  &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/local-networks/topologies/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;platform\&quot;: [ \&quot;mac\&quot; ],     \&quot;domain\&quot;: [ \&quot;thousandeyes.com\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  ### Filter field with multiple values When a filter field contains multiple values, a logical &#x60;OR&#x60; is applied between the filter values.  &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/local-networks/topologies/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;networkId\&quot;: [ \&quot;660b34109d12\&quot;, \&quot;660b34109d15\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  ### Combination of request parameters and body filters &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/local-networks/topologies/filter?window&#x3D;12h&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;platform\&quot;: [ \&quot;mac\&quot; ],     \&quot;domain\&quot;: [ \&quot;thousandeyes.com\&quot; ],     \&quot;networkId\&quot;: [ \&quot;660b34109d12\&quot;, \&quot;660b34109d15\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  ### Warning Note that a maximum of 12h worth of data can be retrieved at once.  If you need more, you need to make multiple requests.  Returns a &#x60;results&#x60; array of network topology probes.  Network topology probes shown are from the latest round, or based on the time range specified. 

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.common.ApiResponse;
import com.thousandeyes.api.endpoint.tests.Configuration;
import com.thousandeyes.api.endpoint.tests.authentication.*;
import com.thousandeyes.api.endpoint.tests.models.*;
import com.thousandeyes.api.endpoint.tests.results.LocalNetworkTestsResultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        LocalNetworkTestsResultsApi apiInstance = new LocalNetworkTestsResultsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        String window = "12h"; // String | A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: `s` for seconds (default if no type is specified), `m` for minutes, `h` for hours, `d` for days, and `w` for weeks. For a precise date range, use `startDate` and `endDate`.
        OffsetDateTime startDate = OffsetDateTime.parse("2022-07-17T22:00:54Z"); // OffsetDateTime | Use with the `endDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        OffsetDateTime endDate = OffsetDateTime.parse("2022-07-18T22:00:54Z"); // OffsetDateTime | Defaults to current time the request is made. Use with the `startDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
        String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `next` value from `_links` instead of this parameter.
        GetEndpointLocalNetworksTopologiesRequest getEndpointLocalNetworksTopologiesRequest = new GetEndpointLocalNetworksTopologiesRequest(); // GetEndpointLocalNetworksTopologiesRequest | 
        try {
            ApiResponse<GetEndpointLocalNetworksTopologies200Response> response = apiInstance.getEndpointLocalNetworksTopologiesWithHttpInfo(aid, window, startDate, endDate, cursor, getEndpointLocalNetworksTopologiesRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LocalNetworkTestsResultsApi#getEndpointLocalNetworksTopologies");
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
| **getEndpointLocalNetworksTopologiesRequest** | [**GetEndpointLocalNetworksTopologiesRequest**](GetEndpointLocalNetworksTopologiesRequest.md)|  | [optional] |

### Return type

ApiResponse<[**GetEndpointLocalNetworksTopologies200Response**](GetEndpointLocalNetworksTopologies200Response.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
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
| **502** | Bad Gateway |  -  |

