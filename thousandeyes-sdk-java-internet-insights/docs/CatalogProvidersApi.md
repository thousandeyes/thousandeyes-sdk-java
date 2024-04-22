# CatalogProvidersApi

All URIs are relative to *https://api.thousandeyes.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**catalogProviderList**](CatalogProvidersApi.md#catalogProviderList) | **POST** /v7/internet-insights/catalog/providers/filter | List catalog providers |
| [**catalogProviderListWithHttpInfo**](CatalogProvidersApi.md#catalogProviderListWithHttpInfo) | **POST** /v7/internet-insights/catalog/providers/filter | List catalog providers |
| [**getCatalogProvider**](CatalogProvidersApi.md#getCatalogProvider) | **GET** /v7/internet-insights/catalog/providers/{providerId} | Retrieve a catalog provider |
| [**getCatalogProviderWithHttpInfo**](CatalogProvidersApi.md#getCatalogProviderWithHttpInfo) | **GET** /v7/internet-insights/catalog/providers/{providerId} | Retrieve a catalog provider |



## catalogProviderList

> ApiCatalogProviderResponse catalogProviderList(apiCatalogProviderFilter, aid)

List catalog providers

Returns a list of catalog providers using the specified filters. Returns high-level information about each catalog provider. For more details about a specific provider, call the Get a catalog provider endpoint.  &lt;b&gt;Note:&lt;/b&gt; Support for pagination will be added in the future. 

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.internet.Configuration;
import com.thousandeyes.api.internet.authentication.*;
import com.thousandeyes.api.internet.models.*;
import com.thousandeyes.api.internet.insights.CatalogProvidersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CatalogProvidersApi apiInstance = new CatalogProvidersApi(defaultClient);
        ApiCatalogProviderFilter apiCatalogProviderFilter = new ApiCatalogProviderFilter(); // ApiCatalogProviderFilter | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiCatalogProviderResponse result = apiInstance.catalogProviderList(apiCatalogProviderFilter, aid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogProvidersApi#catalogProviderList");
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
| **apiCatalogProviderFilter** | [**ApiCatalogProviderFilter**](ApiCatalogProviderFilter.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**ApiCatalogProviderResponse**](ApiCatalogProviderResponse.md)


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

## catalogProviderListWithHttpInfo

> ApiResponse<ApiCatalogProviderResponse> catalogProviderList catalogProviderListWithHttpInfo(apiCatalogProviderFilter, aid)

List catalog providers

Returns a list of catalog providers using the specified filters. Returns high-level information about each catalog provider. For more details about a specific provider, call the Get a catalog provider endpoint.  &lt;b&gt;Note:&lt;/b&gt; Support for pagination will be added in the future. 

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.common.ApiResponse;
import com.thousandeyes.api.internet.Configuration;
import com.thousandeyes.api.internet.authentication.*;
import com.thousandeyes.api.internet.models.*;
import com.thousandeyes.api.internet.insights.CatalogProvidersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CatalogProvidersApi apiInstance = new CatalogProvidersApi(defaultClient);
        ApiCatalogProviderFilter apiCatalogProviderFilter = new ApiCatalogProviderFilter(); // ApiCatalogProviderFilter | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiResponse<ApiCatalogProviderResponse> response = apiInstance.catalogProviderListWithHttpInfo(apiCatalogProviderFilter, aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogProvidersApi#catalogProviderList");
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
| **apiCatalogProviderFilter** | [**ApiCatalogProviderFilter**](ApiCatalogProviderFilter.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

ApiResponse<[**ApiCatalogProviderResponse**](ApiCatalogProviderResponse.md)>


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


## getCatalogProvider

> ApiCatalogProviderDetailsResponse getCatalogProvider(providerId, aid)

Retrieve a catalog provider

Returns the details of a catalog provider. 

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.internet.Configuration;
import com.thousandeyes.api.internet.authentication.*;
import com.thousandeyes.api.internet.models.*;
import com.thousandeyes.api.internet.insights.CatalogProvidersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CatalogProvidersApi apiInstance = new CatalogProvidersApi(defaultClient);
        UUID providerId = UUID.fromString("85602a0a-54a7-4e97-946e-67492ef1fa26"); // UUID | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiCatalogProviderDetailsResponse result = apiInstance.getCatalogProvider(providerId, aid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogProvidersApi#getCatalogProvider");
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
| **providerId** | **UUID**|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**ApiCatalogProviderDetailsResponse**](ApiCatalogProviderDetailsResponse.md)


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

## getCatalogProviderWithHttpInfo

> ApiResponse<ApiCatalogProviderDetailsResponse> getCatalogProvider getCatalogProviderWithHttpInfo(providerId, aid)

Retrieve a catalog provider

Returns the details of a catalog provider. 

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.common.ApiResponse;
import com.thousandeyes.api.internet.Configuration;
import com.thousandeyes.api.internet.authentication.*;
import com.thousandeyes.api.internet.models.*;
import com.thousandeyes.api.internet.insights.CatalogProvidersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CatalogProvidersApi apiInstance = new CatalogProvidersApi(defaultClient);
        UUID providerId = UUID.fromString("85602a0a-54a7-4e97-946e-67492ef1fa26"); // UUID | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiResponse<ApiCatalogProviderDetailsResponse> response = apiInstance.getCatalogProviderWithHttpInfo(providerId, aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogProvidersApi#getCatalogProvider");
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
| **providerId** | **UUID**|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

ApiResponse<[**ApiCatalogProviderDetailsResponse**](ApiCatalogProviderDetailsResponse.md)>


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

