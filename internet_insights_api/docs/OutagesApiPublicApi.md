# OutagesApiPublicApi

All URIs are relative to *https://api.thousandeyes.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getOutagesApp**](OutagesApiPublicApi.md#getOutagesApp) | **GET** /v7/internet-insights/outages/app/{outageId} | Retrieve application outage |
| [**getOutagesFilter**](OutagesApiPublicApi.md#getOutagesFilter) | **POST** /v7/internet-insights/outages/filter | List network and application outages |
| [**getOutagesNet**](OutagesApiPublicApi.md#getOutagesNet) | **GET** /v7/internet-insights/outages/net/{outageId} | Retrieve network outage |


<a id="getOutagesApp"></a>
# **getOutagesApp**
> ApiApplicationOutageResponse getOutagesApp(outageId, aid)

Retrieve application outage

Returns the details of an application outage. 

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.OutagesApiPublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    OutagesApiPublicApi apiInstance = new OutagesApiPublicApi(defaultClient);
    String outageId = "F73E24F17E4996923196826A208BB572508A8EB13BEE14B0"; // String | 
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      ApiApplicationOutageResponse result = apiInstance.getOutagesApp(outageId, aid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutagesApiPublicApi#getOutagesApp");
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
| **outageId** | **String**|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**ApiApplicationOutageResponse**](ApiApplicationOutageResponse.md)

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
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |

<a id="getOutagesFilter"></a>
# **getOutagesFilter**
> ApiOutagesResponse getOutagesFilter(apiOutageFilter, aid)

List network and application outages

Returns a list of network and application outages using a filter object. Advanced Filter persistance is not currently supported.  &lt;b&gt;Note:&lt;/b&gt; Support for pagination will be added in the future.   ## Samples Queries with Different Filter Permutations   ### Window  &#x60;&#x60;&#x60;  curl --location --request POST &#39;https://api.thousandeyes.com/v7/internet-insights/outages/filter&#39; --header &#39;Authorization: Bearer $token --header &#39;Accept-Encoding: application/gzip&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;window\&quot; : \&quot;1d\&quot;   }&#39; &#x60;&#x60;&#x60;  ### Date Range &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/internet-insights/outages/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{     \&quot;startDate\&quot;: \&quot;2022-03-01T01:30:00Z\&quot;,     \&quot;endDate\&quot;  : \&quot;2022-03-01T23:30:15Z\&quot;   }&#39; &#x60;&#x60;&#x60;  ### Date Range with Scope &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/internet-insights/outages/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{     \&quot;startDate\&quot;: \&quot;2022-03-01T01:30:00Z\&quot;,     \&quot;endDate\&quot;  : \&quot;2022-03-01T23:30:15Z\&quot;,     \&quot;outageScope\&quot;: \&quot;with-affected-test\&quot;   }&#39; &#x60;&#x60;&#x60; ### Date Range with Network &#x60;&#x60;&#x60;   curl --location --request POST &#39;https://api.thousandeyes.com/v7/internet-insights/outages/filter&#39;   --header &#39;Authorization: Bearer $token&#39;   --header &#39;Content-Type: application/json&#39;   --data-raw &#39;{       \&quot;startDate\&quot;: \&quot;2022-03-01T01:30:00Z\&quot;,       \&quot;endDate\&quot;  : \&quot;2022-03-01T23:30:15Z\&quot;,       \&quot;interfaceNetwork\&quot;:  [\&quot;Telianet\&quot;]     }&#39; &#x60;&#x60;&#x60;  ### Date Range with Application &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/internet-insights/outages/filter&#39;   --header &#39;Authorization: Bearer $token&#39;   --header &#39;Content-Type: application/json&#39;   --data-raw &#39;{       \&quot;startDate\&quot;: \&quot;2022-03-01T01:30:00Z\&quot;,       \&quot;endDate\&quot;  : \&quot;2022-03-01T23:30:15Z\&quot;,       \&quot;applicationName\&quot;: [\&quot;Google\&quot;]   }&#39; &#x60;&#x60;&#x60; ### Date Range with Provider &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/internet-insights/outages/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{       \&quot;startDate\&quot;: \&quot;2022-03-01T01:30:00Z\&quot;,       \&quot;endDate\&quot;  : \&quot;2022-03-01T23:30:15Z\&quot;,       \&quot;providerName\&quot;: [\&quot;Century Link\&quot;, \&quot;Microsoft\&quot;]   }&#39;  &#x60;&#x60;&#x60; ### Date Range with Application and Scope &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/internet-insights/outages/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{     \&quot;startDate\&quot;: \&quot;2022-03-01T01:30:00Z\&quot;,     \&quot;endDate\&quot;  : \&quot;2022-03-01T23:30:15Z\&quot;,     \&quot;outageScope\&quot;: \&quot;all\&quot;,     \&quot;applicationName\&quot;: [\&quot;Google\&quot;] }&#39; &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.OutagesApiPublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    OutagesApiPublicApi apiInstance = new OutagesApiPublicApi(defaultClient);
    ApiOutageFilter apiOutageFilter = new ApiOutageFilter(); // ApiOutageFilter | 
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      ApiOutagesResponse result = apiInstance.getOutagesFilter(apiOutageFilter, aid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutagesApiPublicApi#getOutagesFilter");
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
| **apiOutageFilter** | [**ApiOutageFilter**](ApiOutageFilter.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**ApiOutagesResponse**](ApiOutagesResponse.md)

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
| **0** | An error occurred |  -  |

<a id="getOutagesNet"></a>
# **getOutagesNet**
> ApiNetworkOutageResponse getOutagesNet(outageId, aid)

Retrieve network outage

Returns the details of a network outage. 

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.OutagesApiPublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    OutagesApiPublicApi apiInstance = new OutagesApiPublicApi(defaultClient);
    String outageId = "694D8656960F34F76489BCE5E9BCD58EC53027462740D75F"; // String | 
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      ApiNetworkOutageResponse result = apiInstance.getOutagesNet(outageId, aid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutagesApiPublicApi#getOutagesNet");
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
| **outageId** | **String**|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**ApiNetworkOutageResponse**](ApiNetworkOutageResponse.md)

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
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |

