# EndpointAgentLabelsApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEndpointLabel**](EndpointAgentLabelsApi.md#createEndpointLabel) | **POST** /endpoint/labels | Create label |
| [**createEndpointLabelWithHttpInfo**](EndpointAgentLabelsApi.md#createEndpointLabelWithHttpInfo) | **POST** /endpoint/labels | Create label |
| [**deleteEndpointLabel**](EndpointAgentLabelsApi.md#deleteEndpointLabel) | **DELETE** /endpoint/labels/{id} | Delete label |
| [**deleteEndpointLabelWithHttpInfo**](EndpointAgentLabelsApi.md#deleteEndpointLabelWithHttpInfo) | **DELETE** /endpoint/labels/{id} | Delete label |
| [**getEndpointLabel**](EndpointAgentLabelsApi.md#getEndpointLabel) | **GET** /endpoint/labels/{id} | Retrieve label |
| [**getEndpointLabelWithHttpInfo**](EndpointAgentLabelsApi.md#getEndpointLabelWithHttpInfo) | **GET** /endpoint/labels/{id} | Retrieve label |
| [**getEndpointLabels**](EndpointAgentLabelsApi.md#getEndpointLabels) | **GET** /endpoint/labels | List labels |
| [**getEndpointLabelsWithHttpInfo**](EndpointAgentLabelsApi.md#getEndpointLabelsWithHttpInfo) | **GET** /endpoint/labels | List labels |
| [**updateEndpointLabel**](EndpointAgentLabelsApi.md#updateEndpointLabel) | **PATCH** /endpoint/labels/{id} | Update label |
| [**updateEndpointLabelWithHttpInfo**](EndpointAgentLabelsApi.md#updateEndpointLabelWithHttpInfo) | **PATCH** /endpoint/labels/{id} | Update label |



## createEndpointLabel

> LabelResponse createEndpointLabel(CreateEndpointLabelRequest)

Create label

Creates a new label.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.labels.model.*;
import com.thousandeyes.sdk.endpoint.labels.EndpointAgentLabelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EndpointAgentLabelsApi apiInstance = new EndpointAgentLabelsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        LabelRequest labelRequest = new LabelRequest(); // LabelRequest | Label settings
        try {
            EndpointAgentLabelsApi.CreateEndpointLabelRequest request = EndpointAgentLabelsApi.CreateEndpointLabelRequest.builder()
                .aid(aid)
                .labelRequest(labelRequest)
                .build();
            LabelResponse result = apiInstance.createEndpointLabel(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EndpointAgentLabelsApi#createEndpointLabel");
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
| request | [**CreateEndpointLabelRequest**](EndpointAgentLabelsApi.md#CreateEndpointLabelRequest)|-|-|

### Return type

[**LabelResponse**](LabelResponse.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | created |  * Location -  <br>  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **429** | Exhausted rate limit for the organization |  -  |

## createEndpointLabelWithHttpInfo

> ApiResponse<LabelResponse> createEndpointLabel createEndpointLabelWithHttpInfo(CreateEndpointLabelRequest)

Create label

Creates a new label.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.labels.model.*;
import com.thousandeyes.sdk.endpoint.labels.EndpointAgentLabelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EndpointAgentLabelsApi apiInstance = new EndpointAgentLabelsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        LabelRequest labelRequest = new LabelRequest(); // LabelRequest | Label settings
        try {
            EndpointAgentLabelsApi.CreateEndpointLabelRequest request = EndpointAgentLabelsApi.CreateEndpointLabelRequest.builder()
                .aid(aid)
                .labelRequest(labelRequest)
                .build();
            ApiResponse<LabelResponse> response = apiInstance.createEndpointLabelWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EndpointAgentLabelsApi#createEndpointLabel");
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
| request | [**CreateEndpointLabelRequest**](EndpointAgentLabelsApi.md#CreateEndpointLabelRequest)|-|-|

### Return type

ApiResponse<[**LabelResponse**](LabelResponse.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | created |  * Location -  <br>  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **429** | Exhausted rate limit for the organization |  -  |


<a id="CreateEndpointLabelRequest"></a>
## CreateEndpointLabelRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **labelRequest** | [**LabelRequest**](LabelRequest.md) | Label settings | [optional] |



## deleteEndpointLabel

> void deleteEndpointLabel(DeleteEndpointLabelRequest)

Delete label

Deletes the label from your account. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.labels.model.*;
import com.thousandeyes.sdk.endpoint.labels.EndpointAgentLabelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EndpointAgentLabelsApi apiInstance = new EndpointAgentLabelsApi(defaultClient);
        String id = "id_example"; // String | The unique identifier of the label to operate on.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            EndpointAgentLabelsApi.DeleteEndpointLabelRequest request = EndpointAgentLabelsApi.DeleteEndpointLabelRequest.builder()
                .id(id)
                .aid(aid)
                .build();
            apiInstance.deleteEndpointLabel(request);
        } catch (ApiException e) {
            System.err.println("Exception when calling EndpointAgentLabelsApi#deleteEndpointLabel");
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
| request | [**DeleteEndpointLabelRequest**](EndpointAgentLabelsApi.md#DeleteEndpointLabelRequest)|-|-|

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

## deleteEndpointLabelWithHttpInfo

> ApiResponse<Void> deleteEndpointLabel deleteEndpointLabelWithHttpInfo(DeleteEndpointLabelRequest)

Delete label

Deletes the label from your account. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.labels.model.*;
import com.thousandeyes.sdk.endpoint.labels.EndpointAgentLabelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EndpointAgentLabelsApi apiInstance = new EndpointAgentLabelsApi(defaultClient);
        String id = "id_example"; // String | The unique identifier of the label to operate on.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            EndpointAgentLabelsApi.DeleteEndpointLabelRequest request = EndpointAgentLabelsApi.DeleteEndpointLabelRequest.builder()
                .id(id)
                .aid(aid)
                .build();
            ApiResponse<Void> response = apiInstance.deleteEndpointLabelWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling EndpointAgentLabelsApi#deleteEndpointLabel");
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
| request | [**DeleteEndpointLabelRequest**](EndpointAgentLabelsApi.md#DeleteEndpointLabelRequest)|-|-|

### Return type


ApiResponse<Void>

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


<a id="DeleteEndpointLabelRequest"></a>
## DeleteEndpointLabelRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **id** | **String** | The unique identifier of the label to operate on. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getEndpointLabel

> LabelResponse getEndpointLabel(GetEndpointLabelRequest)

Retrieve label

Returns a single label using its ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.labels.model.*;
import com.thousandeyes.sdk.endpoint.labels.EndpointAgentLabelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EndpointAgentLabelsApi apiInstance = new EndpointAgentLabelsApi(defaultClient);
        String id = "id_example"; // String | The unique identifier of the label to operate on.
        List<ExpandLabelOptions> expand = Arrays.asList(); // List<ExpandLabelOptions> | This parameter is optional and determines whether to include additional details in the response. To specify multiple expansions, you can either separate the values with commas or specify the parameter multiple times.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            EndpointAgentLabelsApi.GetEndpointLabelRequest request = EndpointAgentLabelsApi.GetEndpointLabelRequest.builder()
                .id(id)
                .expand(expand)
                .aid(aid)
                .build();
            LabelResponse result = apiInstance.getEndpointLabel(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EndpointAgentLabelsApi#getEndpointLabel");
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
| request | [**GetEndpointLabelRequest**](EndpointAgentLabelsApi.md#GetEndpointLabelRequest)|-|-|

### Return type

[**LabelResponse**](LabelResponse.md)


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

## getEndpointLabelWithHttpInfo

> ApiResponse<LabelResponse> getEndpointLabel getEndpointLabelWithHttpInfo(GetEndpointLabelRequest)

Retrieve label

Returns a single label using its ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.labels.model.*;
import com.thousandeyes.sdk.endpoint.labels.EndpointAgentLabelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EndpointAgentLabelsApi apiInstance = new EndpointAgentLabelsApi(defaultClient);
        String id = "id_example"; // String | The unique identifier of the label to operate on.
        List<ExpandLabelOptions> expand = Arrays.asList(); // List<ExpandLabelOptions> | This parameter is optional and determines whether to include additional details in the response. To specify multiple expansions, you can either separate the values with commas or specify the parameter multiple times.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            EndpointAgentLabelsApi.GetEndpointLabelRequest request = EndpointAgentLabelsApi.GetEndpointLabelRequest.builder()
                .id(id)
                .expand(expand)
                .aid(aid)
                .build();
            ApiResponse<LabelResponse> response = apiInstance.getEndpointLabelWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EndpointAgentLabelsApi#getEndpointLabel");
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
| request | [**GetEndpointLabelRequest**](EndpointAgentLabelsApi.md#GetEndpointLabelRequest)|-|-|

### Return type

ApiResponse<[**LabelResponse**](LabelResponse.md)>


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


<a id="GetEndpointLabelRequest"></a>
## GetEndpointLabelRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **id** | **String** | The unique identifier of the label to operate on. | |
| **expand** | [**List&lt;ExpandLabelOptions&gt;**](ExpandLabelOptions.md) | This parameter is optional and determines whether to include additional details in the response. To specify multiple expansions, you can either separate the values with commas or specify the parameter multiple times. | [optional] |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getEndpointLabels

> Labels getEndpointLabels(GetEndpointLabelsRequest)

List labels

Returns a list of labels.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.labels.model.*;
import com.thousandeyes.sdk.endpoint.labels.EndpointAgentLabelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EndpointAgentLabelsApi apiInstance = new EndpointAgentLabelsApi(defaultClient);
        Integer max = 5; // Integer | (Optional) Maximum number of objects to return.
        String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `next` value from `_links` instead of this parameter.
        List<ExpandLabelOptions> expand = Arrays.asList(); // List<ExpandLabelOptions> | This parameter is optional and determines whether to include additional details in the response. To specify multiple expansions, you can either separate the values with commas or specify the parameter multiple times.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            EndpointAgentLabelsApi.GetEndpointLabelsRequest request = EndpointAgentLabelsApi.GetEndpointLabelsRequest.builder()
                .max(max)
                .cursor(cursor)
                .expand(expand)
                .aid(aid)
                .build();
            Labels result = apiInstance.getEndpointLabels(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EndpointAgentLabelsApi#getEndpointLabels");
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
| request | [**GetEndpointLabelsRequest**](EndpointAgentLabelsApi.md#GetEndpointLabelsRequest)|-|-|

### Return type

[**Labels**](Labels.md)


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
| **429** | Exhausted rate limit for the organization |  -  |

## getEndpointLabelsWithHttpInfo

> ApiResponse<Labels> getEndpointLabels getEndpointLabelsWithHttpInfo(GetEndpointLabelsRequest)

List labels

Returns a list of labels.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.labels.model.*;
import com.thousandeyes.sdk.endpoint.labels.EndpointAgentLabelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EndpointAgentLabelsApi apiInstance = new EndpointAgentLabelsApi(defaultClient);
        Integer max = 5; // Integer | (Optional) Maximum number of objects to return.
        String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `next` value from `_links` instead of this parameter.
        List<ExpandLabelOptions> expand = Arrays.asList(); // List<ExpandLabelOptions> | This parameter is optional and determines whether to include additional details in the response. To specify multiple expansions, you can either separate the values with commas or specify the parameter multiple times.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            EndpointAgentLabelsApi.GetEndpointLabelsRequest request = EndpointAgentLabelsApi.GetEndpointLabelsRequest.builder()
                .max(max)
                .cursor(cursor)
                .expand(expand)
                .aid(aid)
                .build();
            ApiResponse<Labels> response = apiInstance.getEndpointLabelsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EndpointAgentLabelsApi#getEndpointLabels");
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
| request | [**GetEndpointLabelsRequest**](EndpointAgentLabelsApi.md#GetEndpointLabelsRequest)|-|-|

### Return type

ApiResponse<[**Labels**](Labels.md)>


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
| **429** | Exhausted rate limit for the organization |  -  |


<a id="GetEndpointLabelsRequest"></a>
## GetEndpointLabelsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **max** | **Integer** | (Optional) Maximum number of objects to return. | [optional] |
| **cursor** | **String** | (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. | [optional] |
| **expand** | [**List&lt;ExpandLabelOptions&gt;**](ExpandLabelOptions.md) | This parameter is optional and determines whether to include additional details in the response. To specify multiple expansions, you can either separate the values with commas or specify the parameter multiple times. | [optional] |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## updateEndpointLabel

> LabelResponse updateEndpointLabel(UpdateEndpointLabelRequest)

Update label

Updates a label using its ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.labels.model.*;
import com.thousandeyes.sdk.endpoint.labels.EndpointAgentLabelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EndpointAgentLabelsApi apiInstance = new EndpointAgentLabelsApi(defaultClient);
        String id = "id_example"; // String | The unique identifier of the label to operate on.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        Label label = new Label(); // Label | Fields to change on the agent
        try {
            EndpointAgentLabelsApi.UpdateEndpointLabelRequest request = EndpointAgentLabelsApi.UpdateEndpointLabelRequest.builder()
                .id(id)
                .aid(aid)
                .label(label)
                .build();
            LabelResponse result = apiInstance.updateEndpointLabel(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EndpointAgentLabelsApi#updateEndpointLabel");
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
| request | [**UpdateEndpointLabelRequest**](EndpointAgentLabelsApi.md#UpdateEndpointLabelRequest)|-|-|

### Return type

[**LabelResponse**](LabelResponse.md)


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

## updateEndpointLabelWithHttpInfo

> ApiResponse<LabelResponse> updateEndpointLabel updateEndpointLabelWithHttpInfo(UpdateEndpointLabelRequest)

Update label

Updates a label using its ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.Configuration;
import com.thousandeyes.sdk.endpoint.authentication.*;
import com.thousandeyes.sdk.endpoint.labels.model.*;
import com.thousandeyes.sdk.endpoint.labels.EndpointAgentLabelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EndpointAgentLabelsApi apiInstance = new EndpointAgentLabelsApi(defaultClient);
        String id = "id_example"; // String | The unique identifier of the label to operate on.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        Label label = new Label(); // Label | Fields to change on the agent
        try {
            EndpointAgentLabelsApi.UpdateEndpointLabelRequest request = EndpointAgentLabelsApi.UpdateEndpointLabelRequest.builder()
                .id(id)
                .aid(aid)
                .label(label)
                .build();
            ApiResponse<LabelResponse> response = apiInstance.updateEndpointLabelWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EndpointAgentLabelsApi#updateEndpointLabel");
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
| request | [**UpdateEndpointLabelRequest**](EndpointAgentLabelsApi.md#UpdateEndpointLabelRequest)|-|-|

### Return type

ApiResponse<[**LabelResponse**](LabelResponse.md)>


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


<a id="UpdateEndpointLabelRequest"></a>
## UpdateEndpointLabelRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **id** | **String** | The unique identifier of the label to operate on. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **label** | [**Label**](Label.md) | Fields to change on the agent | [optional] |


