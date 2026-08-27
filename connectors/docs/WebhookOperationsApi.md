# WebhookOperationsApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWebhookOperation**](WebhookOperationsApi.md#createWebhookOperation) | **POST** /operations/webhooks | Create webhook operation |
| [**createWebhookOperationWithHttpInfo**](WebhookOperationsApi.md#createWebhookOperationWithHttpInfo) | **POST** /operations/webhooks | Create webhook operation |
| [**deleteWebhookOperation**](WebhookOperationsApi.md#deleteWebhookOperation) | **DELETE** /operations/webhooks/{id} | Delete webhook operation |
| [**deleteWebhookOperationWithHttpInfo**](WebhookOperationsApi.md#deleteWebhookOperationWithHttpInfo) | **DELETE** /operations/webhooks/{id} | Delete webhook operation |
| [**getWebhookOperation**](WebhookOperationsApi.md#getWebhookOperation) | **GET** /operations/webhooks/{id} | Retrieve webhook operation |
| [**getWebhookOperationWithHttpInfo**](WebhookOperationsApi.md#getWebhookOperationWithHttpInfo) | **GET** /operations/webhooks/{id} | Retrieve webhook operation |
| [**getWebhookOperations**](WebhookOperationsApi.md#getWebhookOperations) | **GET** /operations/webhooks | List webhook operations |
| [**getWebhookOperationsWithHttpInfo**](WebhookOperationsApi.md#getWebhookOperationsWithHttpInfo) | **GET** /operations/webhooks | List webhook operations |
| [**updateWebhookOperation**](WebhookOperationsApi.md#updateWebhookOperation) | **PUT** /operations/webhooks/{id} | Update webhook operation |
| [**updateWebhookOperationWithHttpInfo**](WebhookOperationsApi.md#updateWebhookOperationWithHttpInfo) | **PUT** /operations/webhooks/{id} | Update webhook operation |



## createWebhookOperation

> WebhookOperation createWebhookOperation(CreateWebhookOperationRequest)

Create webhook operation

Creates a new webhook operation.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.WebhookOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        WebhookOperationsApi apiInstance = new WebhookOperationsApi(defaultClient);
        WebhookOperation webhookOperation = new WebhookOperation(); // WebhookOperation | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            WebhookOperationsApi.CreateWebhookOperationRequest request = WebhookOperationsApi.CreateWebhookOperationRequest.builder()
                .webhookOperation(webhookOperation)
                .aid(aid)
                .build();
            WebhookOperation result = apiInstance.createWebhookOperation(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhookOperationsApi#createWebhookOperation");
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
| request | [**CreateWebhookOperationRequest**](WebhookOperationsApi.md#CreateWebhookOperationRequest)|-|-|

### Return type

[**WebhookOperation**](WebhookOperation.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created webhook operation. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |

## createWebhookOperationWithHttpInfo

> ApiResponse<WebhookOperation> createWebhookOperation createWebhookOperationWithHttpInfo(CreateWebhookOperationRequest)

Create webhook operation

Creates a new webhook operation.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.WebhookOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        WebhookOperationsApi apiInstance = new WebhookOperationsApi(defaultClient);
        WebhookOperation webhookOperation = new WebhookOperation(); // WebhookOperation | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            WebhookOperationsApi.CreateWebhookOperationRequest request = WebhookOperationsApi.CreateWebhookOperationRequest.builder()
                .webhookOperation(webhookOperation)
                .aid(aid)
                .build();
            ApiResponse<WebhookOperation> response = apiInstance.createWebhookOperationWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhookOperationsApi#createWebhookOperation");
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
| request | [**CreateWebhookOperationRequest**](WebhookOperationsApi.md#CreateWebhookOperationRequest)|-|-|

### Return type

ApiResponse<[**WebhookOperation**](WebhookOperation.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created webhook operation. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |


<a id="CreateWebhookOperationRequest"></a>
## CreateWebhookOperationRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **webhookOperation** | [**WebhookOperation**](WebhookOperation.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## deleteWebhookOperation

> void deleteWebhookOperation(DeleteWebhookOperationRequest)

Delete webhook operation

Deletes the webhook operation specified by ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.WebhookOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        WebhookOperationsApi apiInstance = new WebhookOperationsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The operation ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            WebhookOperationsApi.DeleteWebhookOperationRequest request = WebhookOperationsApi.DeleteWebhookOperationRequest.builder()
                .id(id)
                .aid(aid)
                .build();
            apiInstance.deleteWebhookOperation(request);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhookOperationsApi#deleteWebhookOperation");
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
| request | [**DeleteWebhookOperationRequest**](WebhookOperationsApi.md#DeleteWebhookOperationRequest)|-|-|

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
| **204** | No Content. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |

## deleteWebhookOperationWithHttpInfo

> ApiResponse<Void> deleteWebhookOperation deleteWebhookOperationWithHttpInfo(DeleteWebhookOperationRequest)

Delete webhook operation

Deletes the webhook operation specified by ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.WebhookOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        WebhookOperationsApi apiInstance = new WebhookOperationsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The operation ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            WebhookOperationsApi.DeleteWebhookOperationRequest request = WebhookOperationsApi.DeleteWebhookOperationRequest.builder()
                .id(id)
                .aid(aid)
                .build();
            ApiResponse<Void> response = apiInstance.deleteWebhookOperationWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhookOperationsApi#deleteWebhookOperation");
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
| request | [**DeleteWebhookOperationRequest**](WebhookOperationsApi.md#DeleteWebhookOperationRequest)|-|-|

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
| **204** | No Content. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |


<a id="DeleteWebhookOperationRequest"></a>
## DeleteWebhookOperationRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **id** | **String** | The operation ID. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getWebhookOperation

> WebhookOperation getWebhookOperation(GetWebhookOperationRequest)

Retrieve webhook operation

Retrieves details of a webhook operation by its ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.WebhookOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        WebhookOperationsApi apiInstance = new WebhookOperationsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The operation ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            WebhookOperationsApi.GetWebhookOperationRequest request = WebhookOperationsApi.GetWebhookOperationRequest.builder()
                .id(id)
                .aid(aid)
                .build();
            WebhookOperation result = apiInstance.getWebhookOperation(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhookOperationsApi#getWebhookOperation");
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
| request | [**GetWebhookOperationRequest**](WebhookOperationsApi.md#GetWebhookOperationRequest)|-|-|

### Return type

[**WebhookOperation**](WebhookOperation.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Webhook operation with the given id. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |

## getWebhookOperationWithHttpInfo

> ApiResponse<WebhookOperation> getWebhookOperation getWebhookOperationWithHttpInfo(GetWebhookOperationRequest)

Retrieve webhook operation

Retrieves details of a webhook operation by its ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.WebhookOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        WebhookOperationsApi apiInstance = new WebhookOperationsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The operation ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            WebhookOperationsApi.GetWebhookOperationRequest request = WebhookOperationsApi.GetWebhookOperationRequest.builder()
                .id(id)
                .aid(aid)
                .build();
            ApiResponse<WebhookOperation> response = apiInstance.getWebhookOperationWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhookOperationsApi#getWebhookOperation");
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
| request | [**GetWebhookOperationRequest**](WebhookOperationsApi.md#GetWebhookOperationRequest)|-|-|

### Return type

ApiResponse<[**WebhookOperation**](WebhookOperation.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Webhook operation with the given id. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |


<a id="GetWebhookOperationRequest"></a>
## GetWebhookOperationRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **id** | **String** | The operation ID. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getWebhookOperations

> WebhookOperations getWebhookOperations(GetWebhookOperationsRequest)

List webhook operations

Returns a list of webhook operations in the specified account group. If no account group is specified, the user’s default account group is used.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.WebhookOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        WebhookOperationsApi apiInstance = new WebhookOperationsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            WebhookOperationsApi.GetWebhookOperationsRequest request = WebhookOperationsApi.GetWebhookOperationsRequest.builder()
                .aid(aid)
                .build();
            WebhookOperations result = apiInstance.getWebhookOperations(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhookOperationsApi#getWebhookOperations");
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
| request | [**GetWebhookOperationsRequest**](WebhookOperationsApi.md#GetWebhookOperationsRequest)|-|-|

### Return type

[**WebhookOperations**](WebhookOperations.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of webhook operations. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |

## getWebhookOperationsWithHttpInfo

> ApiResponse<WebhookOperations> getWebhookOperations getWebhookOperationsWithHttpInfo(GetWebhookOperationsRequest)

List webhook operations

Returns a list of webhook operations in the specified account group. If no account group is specified, the user’s default account group is used.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.WebhookOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        WebhookOperationsApi apiInstance = new WebhookOperationsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            WebhookOperationsApi.GetWebhookOperationsRequest request = WebhookOperationsApi.GetWebhookOperationsRequest.builder()
                .aid(aid)
                .build();
            ApiResponse<WebhookOperations> response = apiInstance.getWebhookOperationsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhookOperationsApi#getWebhookOperations");
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
| request | [**GetWebhookOperationsRequest**](WebhookOperationsApi.md#GetWebhookOperationsRequest)|-|-|

### Return type

ApiResponse<[**WebhookOperations**](WebhookOperations.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of webhook operations. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |


<a id="GetWebhookOperationsRequest"></a>
## GetWebhookOperationsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## updateWebhookOperation

> WebhookOperation updateWebhookOperation(UpdateWebhookOperationRequest)

Update webhook operation

Updates the webhook operation specified by ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.WebhookOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        WebhookOperationsApi apiInstance = new WebhookOperationsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The operation ID.
        WebhookOperation webhookOperation = new WebhookOperation(); // WebhookOperation | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            WebhookOperationsApi.UpdateWebhookOperationRequest request = WebhookOperationsApi.UpdateWebhookOperationRequest.builder()
                .id(id)
                .webhookOperation(webhookOperation)
                .aid(aid)
                .build();
            WebhookOperation result = apiInstance.updateWebhookOperation(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhookOperationsApi#updateWebhookOperation");
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
| request | [**UpdateWebhookOperationRequest**](WebhookOperationsApi.md#UpdateWebhookOperationRequest)|-|-|

### Return type

[**WebhookOperation**](WebhookOperation.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated webhook operation. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |

## updateWebhookOperationWithHttpInfo

> ApiResponse<WebhookOperation> updateWebhookOperation updateWebhookOperationWithHttpInfo(UpdateWebhookOperationRequest)

Update webhook operation

Updates the webhook operation specified by ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.WebhookOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        WebhookOperationsApi apiInstance = new WebhookOperationsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The operation ID.
        WebhookOperation webhookOperation = new WebhookOperation(); // WebhookOperation | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            WebhookOperationsApi.UpdateWebhookOperationRequest request = WebhookOperationsApi.UpdateWebhookOperationRequest.builder()
                .id(id)
                .webhookOperation(webhookOperation)
                .aid(aid)
                .build();
            ApiResponse<WebhookOperation> response = apiInstance.updateWebhookOperationWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhookOperationsApi#updateWebhookOperation");
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
| request | [**UpdateWebhookOperationRequest**](WebhookOperationsApi.md#UpdateWebhookOperationRequest)|-|-|

### Return type

ApiResponse<[**WebhookOperation**](WebhookOperation.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated webhook operation. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |


<a id="UpdateWebhookOperationRequest"></a>
## UpdateWebhookOperationRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **id** | **String** | The operation ID. | |
| **webhookOperation** | [**WebhookOperation**](WebhookOperation.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |


