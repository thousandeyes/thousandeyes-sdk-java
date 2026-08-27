# InternetInsightsCatalogProvidersApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**filterCatalogProviders**](InternetInsightsCatalogProvidersApi.md#filterCatalogProviders) | **POST** /internet-insights/catalog/providers/filter | List catalog providers |
| [**filterCatalogProvidersWithHttpInfo**](InternetInsightsCatalogProvidersApi.md#filterCatalogProvidersWithHttpInfo) | **POST** /internet-insights/catalog/providers/filter | List catalog providers |
| [**getCatalogProvider**](InternetInsightsCatalogProvidersApi.md#getCatalogProvider) | **GET** /internet-insights/catalog/providers/{providerId} | Retrieve a catalog provider |
| [**getCatalogProviderWithHttpInfo**](InternetInsightsCatalogProvidersApi.md#getCatalogProviderWithHttpInfo) | **GET** /internet-insights/catalog/providers/{providerId} | Retrieve a catalog provider |



## filterCatalogProviders

> ApiCatalogProviderResponse filterCatalogProviders(FilterCatalogProvidersRequest)

List catalog providers

Returns a list of catalog providers using the specified filters. Returns high-level information about each catalog provider. For more details about a specific provider, call the Get a catalog provider endpoint.  &lt;b&gt;Note:&lt;/b&gt; Support for pagination will be added in the future. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.internet.Configuration;
import com.thousandeyes.sdk.internet.authentication.*;
import com.thousandeyes.sdk.internet.insights.model.*;
import com.thousandeyes.sdk.internet.insights.InternetInsightsCatalogProvidersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        InternetInsightsCatalogProvidersApi apiInstance = new InternetInsightsCatalogProvidersApi(defaultClient);
        ApiCatalogProviderFilter apiCatalogProviderFilter = new ApiCatalogProviderFilter(); // ApiCatalogProviderFilter | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            InternetInsightsCatalogProvidersApi.FilterCatalogProvidersRequest request = InternetInsightsCatalogProvidersApi.FilterCatalogProvidersRequest.builder()
                .apiCatalogProviderFilter(apiCatalogProviderFilter)
                .aid(aid)
                .build();
            ApiCatalogProviderResponse result = apiInstance.filterCatalogProviders(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InternetInsightsCatalogProvidersApi#filterCatalogProviders");
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
| request | [**FilterCatalogProvidersRequest**](InternetInsightsCatalogProvidersApi.md#FilterCatalogProvidersRequest)|-|-|

### Return type

[**ApiCatalogProviderResponse**](ApiCatalogProviderResponse.md)


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
| **0** | An error occurred |  -  |

## filterCatalogProvidersWithHttpInfo

> ApiResponse<ApiCatalogProviderResponse> filterCatalogProviders filterCatalogProvidersWithHttpInfo(FilterCatalogProvidersRequest)

List catalog providers

Returns a list of catalog providers using the specified filters. Returns high-level information about each catalog provider. For more details about a specific provider, call the Get a catalog provider endpoint.  &lt;b&gt;Note:&lt;/b&gt; Support for pagination will be added in the future. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.internet.Configuration;
import com.thousandeyes.sdk.internet.authentication.*;
import com.thousandeyes.sdk.internet.insights.model.*;
import com.thousandeyes.sdk.internet.insights.InternetInsightsCatalogProvidersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        InternetInsightsCatalogProvidersApi apiInstance = new InternetInsightsCatalogProvidersApi(defaultClient);
        ApiCatalogProviderFilter apiCatalogProviderFilter = new ApiCatalogProviderFilter(); // ApiCatalogProviderFilter | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            InternetInsightsCatalogProvidersApi.FilterCatalogProvidersRequest request = InternetInsightsCatalogProvidersApi.FilterCatalogProvidersRequest.builder()
                .apiCatalogProviderFilter(apiCatalogProviderFilter)
                .aid(aid)
                .build();
            ApiResponse<ApiCatalogProviderResponse> response = apiInstance.filterCatalogProvidersWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling InternetInsightsCatalogProvidersApi#filterCatalogProviders");
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
| request | [**FilterCatalogProvidersRequest**](InternetInsightsCatalogProvidersApi.md#FilterCatalogProvidersRequest)|-|-|

### Return type

ApiResponse<[**ApiCatalogProviderResponse**](ApiCatalogProviderResponse.md)>


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
| **0** | An error occurred |  -  |


<a id="FilterCatalogProvidersRequest"></a>
## FilterCatalogProvidersRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **apiCatalogProviderFilter** | [**ApiCatalogProviderFilter**](ApiCatalogProviderFilter.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getCatalogProvider

> ApiCatalogProviderDetails getCatalogProvider(GetCatalogProviderRequest)

Retrieve a catalog provider

Returns the details of a catalog provider. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.internet.Configuration;
import com.thousandeyes.sdk.internet.authentication.*;
import com.thousandeyes.sdk.internet.insights.model.*;
import com.thousandeyes.sdk.internet.insights.InternetInsightsCatalogProvidersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        InternetInsightsCatalogProvidersApi apiInstance = new InternetInsightsCatalogProvidersApi(defaultClient);
        UUID providerId = UUID.fromString("85602a0a-54a7-4e97-946e-67492ef1fa26"); // UUID | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            InternetInsightsCatalogProvidersApi.GetCatalogProviderRequest request = InternetInsightsCatalogProvidersApi.GetCatalogProviderRequest.builder()
                .providerId(providerId)
                .aid(aid)
                .build();
            ApiCatalogProviderDetails result = apiInstance.getCatalogProvider(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InternetInsightsCatalogProvidersApi#getCatalogProvider");
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
| request | [**GetCatalogProviderRequest**](InternetInsightsCatalogProvidersApi.md#GetCatalogProviderRequest)|-|-|

### Return type

[**ApiCatalogProviderDetails**](ApiCatalogProviderDetails.md)


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

## getCatalogProviderWithHttpInfo

> ApiResponse<ApiCatalogProviderDetails> getCatalogProvider getCatalogProviderWithHttpInfo(GetCatalogProviderRequest)

Retrieve a catalog provider

Returns the details of a catalog provider. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.internet.Configuration;
import com.thousandeyes.sdk.internet.authentication.*;
import com.thousandeyes.sdk.internet.insights.model.*;
import com.thousandeyes.sdk.internet.insights.InternetInsightsCatalogProvidersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        InternetInsightsCatalogProvidersApi apiInstance = new InternetInsightsCatalogProvidersApi(defaultClient);
        UUID providerId = UUID.fromString("85602a0a-54a7-4e97-946e-67492ef1fa26"); // UUID | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            InternetInsightsCatalogProvidersApi.GetCatalogProviderRequest request = InternetInsightsCatalogProvidersApi.GetCatalogProviderRequest.builder()
                .providerId(providerId)
                .aid(aid)
                .build();
            ApiResponse<ApiCatalogProviderDetails> response = apiInstance.getCatalogProviderWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling InternetInsightsCatalogProvidersApi#getCatalogProvider");
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
| request | [**GetCatalogProviderRequest**](InternetInsightsCatalogProvidersApi.md#GetCatalogProviderRequest)|-|-|

### Return type

ApiResponse<[**ApiCatalogProviderDetails**](ApiCatalogProviderDetails.md)>


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


<a id="GetCatalogProviderRequest"></a>
## GetCatalogProviderRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **providerId** | **UUID** |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |


