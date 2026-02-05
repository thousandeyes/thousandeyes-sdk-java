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

> WebhookOperation createWebhookOperation(webhookOperation, aid)

Create webhook operation

Creates a new webhook operation.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.WebhookOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");

        WebhookOperationsApi apiInstance = new WebhookOperationsApi(defaultClient);
        WebhookOperation webhookOperation = new WebhookOperation(); // WebhookOperation | 
        BigDecimal aid = new BigDecimal("123456"); // BigDecimal | Account ID
        try {
            WebhookOperation result = apiInstance.createWebhookOperation(webhookOperation, aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **webhookOperation** | [**WebhookOperation**](WebhookOperation.md)|  | |
| **aid** | **BigDecimal**| Account ID | [optional] |

### Return type

[**WebhookOperation**](WebhookOperation.md)


### Authorization

No authorization required

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

> ApiResponse<WebhookOperation> createWebhookOperation createWebhookOperationWithHttpInfo(webhookOperation, aid)

Create webhook operation

Creates a new webhook operation.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.WebhookOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");

        WebhookOperationsApi apiInstance = new WebhookOperationsApi(defaultClient);
        WebhookOperation webhookOperation = new WebhookOperation(); // WebhookOperation | 
        BigDecimal aid = new BigDecimal("123456"); // BigDecimal | Account ID
        try {
            ApiResponse<WebhookOperation> response = apiInstance.createWebhookOperationWithHttpInfo(webhookOperation, aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **webhookOperation** | [**WebhookOperation**](WebhookOperation.md)|  | |
| **aid** | **BigDecimal**| Account ID | [optional] |

### Return type

ApiResponse<[**WebhookOperation**](WebhookOperation.md)>


### Authorization

No authorization required

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


## deleteWebhookOperation

> void deleteWebhookOperation(id, aid)

Delete webhook operation

Deletes the webhook operation specified by ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.WebhookOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");

        WebhookOperationsApi apiInstance = new WebhookOperationsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The operation ID.
        BigDecimal aid = new BigDecimal("123456"); // BigDecimal | Account ID
        try {
            apiInstance.deleteWebhookOperation(id, aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The operation ID. | |
| **aid** | **BigDecimal**| Account ID | [optional] |

### Return type


null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |

## deleteWebhookOperationWithHttpInfo

> ApiResponse<Void> deleteWebhookOperation deleteWebhookOperationWithHttpInfo(id, aid)

Delete webhook operation

Deletes the webhook operation specified by ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.WebhookOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");

        WebhookOperationsApi apiInstance = new WebhookOperationsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The operation ID.
        BigDecimal aid = new BigDecimal("123456"); // BigDecimal | Account ID
        try {
            ApiResponse<Void> response = apiInstance.deleteWebhookOperationWithHttpInfo(id, aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The operation ID. | |
| **aid** | **BigDecimal**| Account ID | [optional] |

### Return type


ApiResponse<Void>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |


## getWebhookOperation

> WebhookOperation getWebhookOperation(id, aid)

Retrieve webhook operation

Retrieves details of a webhook operation by its ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.WebhookOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");

        WebhookOperationsApi apiInstance = new WebhookOperationsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The operation ID.
        BigDecimal aid = new BigDecimal("123456"); // BigDecimal | Account ID
        try {
            WebhookOperation result = apiInstance.getWebhookOperation(id, aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The operation ID. | |
| **aid** | **BigDecimal**| Account ID | [optional] |

### Return type

[**WebhookOperation**](WebhookOperation.md)


### Authorization

No authorization required

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

> ApiResponse<WebhookOperation> getWebhookOperation getWebhookOperationWithHttpInfo(id, aid)

Retrieve webhook operation

Retrieves details of a webhook operation by its ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.WebhookOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");

        WebhookOperationsApi apiInstance = new WebhookOperationsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The operation ID.
        BigDecimal aid = new BigDecimal("123456"); // BigDecimal | Account ID
        try {
            ApiResponse<WebhookOperation> response = apiInstance.getWebhookOperationWithHttpInfo(id, aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The operation ID. | |
| **aid** | **BigDecimal**| Account ID | [optional] |

### Return type

ApiResponse<[**WebhookOperation**](WebhookOperation.md)>


### Authorization

No authorization required

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


## getWebhookOperations

> WebhookOperations getWebhookOperations(aid)

List webhook operations

Returns a list of webhook operations in the specified account group. If no account group is specified, the user’s default account group is used.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.WebhookOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");

        WebhookOperationsApi apiInstance = new WebhookOperationsApi(defaultClient);
        BigDecimal aid = new BigDecimal("123456"); // BigDecimal | Account ID
        try {
            WebhookOperations result = apiInstance.getWebhookOperations(aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aid** | **BigDecimal**| Account ID | [optional] |

### Return type

[**WebhookOperations**](WebhookOperations.md)


### Authorization

No authorization required

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

> ApiResponse<WebhookOperations> getWebhookOperations getWebhookOperationsWithHttpInfo(aid)

List webhook operations

Returns a list of webhook operations in the specified account group. If no account group is specified, the user’s default account group is used.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.WebhookOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");

        WebhookOperationsApi apiInstance = new WebhookOperationsApi(defaultClient);
        BigDecimal aid = new BigDecimal("123456"); // BigDecimal | Account ID
        try {
            ApiResponse<WebhookOperations> response = apiInstance.getWebhookOperationsWithHttpInfo(aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aid** | **BigDecimal**| Account ID | [optional] |

### Return type

ApiResponse<[**WebhookOperations**](WebhookOperations.md)>


### Authorization

No authorization required

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


## updateWebhookOperation

> WebhookOperation updateWebhookOperation(id, webhookOperation, aid)

Update webhook operation

Updates the webhook operation specified by ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.WebhookOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");

        WebhookOperationsApi apiInstance = new WebhookOperationsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The operation ID.
        WebhookOperation webhookOperation = new WebhookOperation(); // WebhookOperation | 
        BigDecimal aid = new BigDecimal("123456"); // BigDecimal | Account ID
        try {
            WebhookOperation result = apiInstance.updateWebhookOperation(id, webhookOperation, aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The operation ID. | |
| **webhookOperation** | [**WebhookOperation**](WebhookOperation.md)|  | |
| **aid** | **BigDecimal**| Account ID | [optional] |

### Return type

[**WebhookOperation**](WebhookOperation.md)


### Authorization

No authorization required

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

> ApiResponse<WebhookOperation> updateWebhookOperation updateWebhookOperationWithHttpInfo(id, webhookOperation, aid)

Update webhook operation

Updates the webhook operation specified by ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.WebhookOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");

        WebhookOperationsApi apiInstance = new WebhookOperationsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The operation ID.
        WebhookOperation webhookOperation = new WebhookOperation(); // WebhookOperation | 
        BigDecimal aid = new BigDecimal("123456"); // BigDecimal | Account ID
        try {
            ApiResponse<WebhookOperation> response = apiInstance.updateWebhookOperationWithHttpInfo(id, webhookOperation, aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The operation ID. | |
| **webhookOperation** | [**WebhookOperation**](WebhookOperation.md)|  | |
| **aid** | **BigDecimal**| Account ID | [optional] |

### Return type

ApiResponse<[**WebhookOperation**](WebhookOperation.md)>


### Authorization

No authorization required

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

