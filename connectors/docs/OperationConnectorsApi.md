# OperationConnectorsApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getOperationConnectors**](OperationConnectorsApi.md#getOperationConnectors) | **GET** /operations/{type}/{id}/connectors | Retrieve connectors assigned to an operation |
| [**getOperationConnectorsWithHttpInfo**](OperationConnectorsApi.md#getOperationConnectorsWithHttpInfo) | **GET** /operations/{type}/{id}/connectors | Retrieve connectors assigned to an operation |
| [**setOperationConnectors**](OperationConnectorsApi.md#setOperationConnectors) | **PUT** /operations/{type}/{id}/connectors | Assign connectors to an operation |
| [**setOperationConnectorsWithHttpInfo**](OperationConnectorsApi.md#setOperationConnectorsWithHttpInfo) | **PUT** /operations/{type}/{id}/connectors | Assign connectors to an operation |



## getOperationConnectors

> Assignments getOperationConnectors(type, id, aid)

Retrieve connectors assigned to an operation

Returns a list of connectors assigned to a specific operation.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.OperationConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");

        OperationConnectorsApi apiInstance = new OperationConnectorsApi(defaultClient);
        String type = "webhooks"; // String | The operation type.
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The operation ID.
        BigDecimal aid = new BigDecimal("123456"); // BigDecimal | Account ID
        try {
            Assignments result = apiInstance.getOperationConnectors(type, id, aid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationConnectorsApi#getOperationConnectors");
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
| **type** | **String**| The operation type. | |
| **id** | **String**| The operation ID. | |
| **aid** | **BigDecimal**| Account ID | [optional] |

### Return type

[**Assignments**](Assignments.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/problem+json, application/hal+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not found |  -  |
| **200** | A list of assigned connectors. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **500** | Internal server error |  -  |

## getOperationConnectorsWithHttpInfo

> ApiResponse<Assignments> getOperationConnectors getOperationConnectorsWithHttpInfo(type, id, aid)

Retrieve connectors assigned to an operation

Returns a list of connectors assigned to a specific operation.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.OperationConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");

        OperationConnectorsApi apiInstance = new OperationConnectorsApi(defaultClient);
        String type = "webhooks"; // String | The operation type.
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The operation ID.
        BigDecimal aid = new BigDecimal("123456"); // BigDecimal | Account ID
        try {
            ApiResponse<Assignments> response = apiInstance.getOperationConnectorsWithHttpInfo(type, id, aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationConnectorsApi#getOperationConnectors");
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
| **type** | **String**| The operation type. | |
| **id** | **String**| The operation ID. | |
| **aid** | **BigDecimal**| Account ID | [optional] |

### Return type

ApiResponse<[**Assignments**](Assignments.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/problem+json, application/hal+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not found |  -  |
| **200** | A list of assigned connectors. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **500** | Internal server error |  -  |


## setOperationConnectors

> Assignments setOperationConnectors(type, id, requestBody, aid)

Assign connectors to an operation

Assigns one or more connectors to an operation. This replaces any existing assignments.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.OperationConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");

        OperationConnectorsApi apiInstance = new OperationConnectorsApi(defaultClient);
        String type = "webhooks"; // String | The operation type.
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The operation ID.
        List<String> requestBody = ["ca39314d-eb4f-496f-9435-b5d20b1bfbff"]; // List<String> | List of connector IDs to assign to the operation.
        BigDecimal aid = new BigDecimal("123456"); // BigDecimal | Account ID
        try {
            Assignments result = apiInstance.setOperationConnectors(type, id, requestBody, aid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationConnectorsApi#setOperationConnectors");
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
| **type** | **String**| The operation type. | |
| **id** | **String**| The operation ID. | |
| **requestBody** | [**List&lt;String&gt;**](String.md)| List of connector IDs to assign to the operation. | |
| **aid** | **BigDecimal**| Account ID | [optional] |

### Return type

[**Assignments**](Assignments.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/problem+json, application/hal+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not found |  -  |
| **200** | Operation Connectors updated successfully. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **500** | Internal server error |  -  |

## setOperationConnectorsWithHttpInfo

> ApiResponse<Assignments> setOperationConnectors setOperationConnectorsWithHttpInfo(type, id, requestBody, aid)

Assign connectors to an operation

Assigns one or more connectors to an operation. This replaces any existing assignments.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.OperationConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");

        OperationConnectorsApi apiInstance = new OperationConnectorsApi(defaultClient);
        String type = "webhooks"; // String | The operation type.
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The operation ID.
        List<String> requestBody = ["ca39314d-eb4f-496f-9435-b5d20b1bfbff"]; // List<String> | List of connector IDs to assign to the operation.
        BigDecimal aid = new BigDecimal("123456"); // BigDecimal | Account ID
        try {
            ApiResponse<Assignments> response = apiInstance.setOperationConnectorsWithHttpInfo(type, id, requestBody, aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationConnectorsApi#setOperationConnectors");
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
| **type** | **String**| The operation type. | |
| **id** | **String**| The operation ID. | |
| **requestBody** | [**List&lt;String&gt;**](String.md)| List of connector IDs to assign to the operation. | |
| **aid** | **BigDecimal**| Account ID | [optional] |

### Return type

ApiResponse<[**Assignments**](Assignments.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/problem+json, application/hal+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Not found |  -  |
| **200** | Operation Connectors updated successfully. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **500** | Internal server error |  -  |

