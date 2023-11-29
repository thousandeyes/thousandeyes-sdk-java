# ManageLabelsApi

All URIs are relative to *https://api.thousandeyes.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**endpointLabelDelete**](ManageLabelsApi.md#endpointLabelDelete) | **DELETE** /v7/endpoint/labels/{id} | Deletes label |
| [**endpointLabelGet**](ManageLabelsApi.md#endpointLabelGet) | **GET** /v7/endpoint/labels/{id} | Retrieve label |
| [**endpointLabelUpdate**](ManageLabelsApi.md#endpointLabelUpdate) | **PATCH** /v7/endpoint/labels/{id} | Update label |
| [**endpointLabelsList**](ManageLabelsApi.md#endpointLabelsList) | **GET** /v7/endpoint/labels | List labels |
| [**v7EndpointLabelsPost**](ManageLabelsApi.md#v7EndpointLabelsPost) | **POST** /v7/endpoint/labels | Create label |


<a id="endpointLabelDelete"></a>
# **endpointLabelDelete**
> endpointLabelDelete(id)

Deletes label

Deletes the label from your account. 

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.ManageLabelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ManageLabelsApi apiInstance = new ManageLabelsApi(defaultClient);
    String id = "id_example"; // String | The unique identifier of the label to operate on.
    try {
      apiInstance.endpointLabelDelete(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManageLabelsApi#endpointLabelDelete");
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
| **id** | **String**| The unique identifier of the label to operate on. | |

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
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |

<a id="endpointLabelGet"></a>
# **endpointLabelGet**
> V7EndpointLabelsPost201Response endpointLabelGet(id, expand)

Retrieve label

Returns a single label using its ID.

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.ManageLabelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ManageLabelsApi apiInstance = new ManageLabelsApi(defaultClient);
    String id = "id_example"; // String | The unique identifier of the label to operate on.
    List<Expand> expand = Arrays.asList(); // List<Expand> | This parameter is optional and determines whether to include additional details in the response. To specify multiple expansions, you can either separate the values with commas or specify the parameter multiple times.
    try {
      V7EndpointLabelsPost201Response result = apiInstance.endpointLabelGet(id, expand);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManageLabelsApi#endpointLabelGet");
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
| **id** | **String**| The unique identifier of the label to operate on. | |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| This parameter is optional and determines whether to include additional details in the response. To specify multiple expansions, you can either separate the values with commas or specify the parameter multiple times. | [optional] |

### Return type

[**V7EndpointLabelsPost201Response**](V7EndpointLabelsPost201Response.md)

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

<a id="endpointLabelUpdate"></a>
# **endpointLabelUpdate**
> V7EndpointLabelsPost201Response endpointLabelUpdate(id, label)

Update label

Updates a label using its ID.

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.ManageLabelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ManageLabelsApi apiInstance = new ManageLabelsApi(defaultClient);
    String id = "id_example"; // String | The unique identifier of the label to operate on.
    Label label = new Label(); // Label | Fields to change on the agent
    try {
      V7EndpointLabelsPost201Response result = apiInstance.endpointLabelUpdate(id, label);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManageLabelsApi#endpointLabelUpdate");
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
| **id** | **String**| The unique identifier of the label to operate on. | |
| **label** | [**Label**](Label.md)| Fields to change on the agent | [optional] |

### Return type

[**V7EndpointLabelsPost201Response**](V7EndpointLabelsPost201Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |

<a id="endpointLabelsList"></a>
# **endpointLabelsList**
> EndpointLabelsList200Response endpointLabelsList(max, cursor, expand)

List labels

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.ManageLabelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ManageLabelsApi apiInstance = new ManageLabelsApi(defaultClient);
    BigDecimal max = new BigDecimal("5"); // BigDecimal | (Optional) Maximum number of objects to return.
    String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `_links` instead of this parameter.
    List<Expand> expand = Arrays.asList(); // List<Expand> | This parameter is optional and determines whether to include additional details in the response. To specify multiple expansions, you can either separate the values with commas or specify the parameter multiple times.
    try {
      EndpointLabelsList200Response result = apiInstance.endpointLabelsList(max, cursor, expand);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManageLabelsApi#endpointLabelsList");
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
| **max** | **BigDecimal**| (Optional) Maximum number of objects to return. | [optional] |
| **cursor** | **String**| (Optional) Opaque cursor used for pagination. Clients should use &#x60;_links&#x60; instead of this parameter. | [optional] |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| This parameter is optional and determines whether to include additional details in the response. To specify multiple expansions, you can either separate the values with commas or specify the parameter multiple times. | [optional] |

### Return type

[**EndpointLabelsList200Response**](EndpointLabelsList200Response.md)

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
| **429** | Exhausted rate limit for the organization |  -  |

<a id="v7EndpointLabelsPost"></a>
# **v7EndpointLabelsPost**
> V7EndpointLabelsPost201Response v7EndpointLabelsPost(v7EndpointLabelsPostRequest)

Create label

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.ManageLabelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ManageLabelsApi apiInstance = new ManageLabelsApi(defaultClient);
    V7EndpointLabelsPostRequest v7EndpointLabelsPostRequest = new V7EndpointLabelsPostRequest(); // V7EndpointLabelsPostRequest | Label settings
    try {
      V7EndpointLabelsPost201Response result = apiInstance.v7EndpointLabelsPost(v7EndpointLabelsPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManageLabelsApi#v7EndpointLabelsPost");
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
| **v7EndpointLabelsPostRequest** | [**V7EndpointLabelsPostRequest**](V7EndpointLabelsPostRequest.md)| Label settings | [optional] |

### Return type

[**V7EndpointLabelsPost201Response**](V7EndpointLabelsPost201Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | created |  * Location -  <br>  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **429** | Exhausted rate limit for the organization |  -  |

