# OperationConnectorsApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getOperationConnectors**](OperationConnectorsApi.md#getOperationConnectors) | **GET** /operations/{type}/{id}/connectors | Retrieve connectors assigned to an operation |
| [**getOperationConnectorsWithHttpInfo**](OperationConnectorsApi.md#getOperationConnectorsWithHttpInfo) | **GET** /operations/{type}/{id}/connectors | Retrieve connectors assigned to an operation |
| [**setOperationConnectors**](OperationConnectorsApi.md#setOperationConnectors) | **PUT** /operations/{type}/{id}/connectors | Assign connectors to an operation |
| [**setOperationConnectorsWithHttpInfo**](OperationConnectorsApi.md#setOperationConnectorsWithHttpInfo) | **PUT** /operations/{type}/{id}/connectors | Assign connectors to an operation |



## getOperationConnectors

> Assignments getOperationConnectors(GetOperationConnectorsRequest)

Retrieve connectors assigned to an operation

Returns a list of connectors assigned to a specific operation.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.OperationConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        OperationConnectorsApi apiInstance = new OperationConnectorsApi(defaultClient);
        String type = "webhooks"; // String | The operation type.
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The operation ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            OperationConnectorsApi.GetOperationConnectorsRequest request = OperationConnectorsApi.GetOperationConnectorsRequest.builder()
                .type(type)
                .id(id)
                .aid(aid)
                .build();
            Assignments result = apiInstance.getOperationConnectors(request);
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

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| request | [**GetOperationConnectorsRequest**](OperationConnectorsApi.md#GetOperationConnectorsRequest)|-|-|

### Return type

[**Assignments**](Assignments.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of assigned connectors. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |

## getOperationConnectorsWithHttpInfo

> ApiResponse<Assignments> getOperationConnectors getOperationConnectorsWithHttpInfo(GetOperationConnectorsRequest)

Retrieve connectors assigned to an operation

Returns a list of connectors assigned to a specific operation.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.OperationConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        OperationConnectorsApi apiInstance = new OperationConnectorsApi(defaultClient);
        String type = "webhooks"; // String | The operation type.
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The operation ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            OperationConnectorsApi.GetOperationConnectorsRequest request = OperationConnectorsApi.GetOperationConnectorsRequest.builder()
                .type(type)
                .id(id)
                .aid(aid)
                .build();
            ApiResponse<Assignments> response = apiInstance.getOperationConnectorsWithHttpInfo(request);
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

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| request | [**GetOperationConnectorsRequest**](OperationConnectorsApi.md#GetOperationConnectorsRequest)|-|-|

### Return type

ApiResponse<[**Assignments**](Assignments.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of assigned connectors. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |


<a id="GetOperationConnectorsRequest"></a>
## GetOperationConnectorsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **type** | **String** | The operation type. | |
| **id** | **String** | The operation ID. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## setOperationConnectors

> Assignments setOperationConnectors(SetOperationConnectorsRequest)

Assign connectors to an operation

Assigns one or more connectors to an operation. This replaces any existing assignments. Note: This operation may disable affected objects (such as tests) if connectors are changed.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.OperationConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        OperationConnectorsApi apiInstance = new OperationConnectorsApi(defaultClient);
        String type = "webhooks"; // String | The operation type.
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The operation ID.
        List<String> requestBody = ["ca39314d-eb4f-496f-9435-b5d20b1bfbff"]; // List<String> | List of connector IDs to assign to the operation.
        Boolean confirmDisabledObjects = false; // Boolean | Confirmation to disable affected objects (for example, tests) for credential-vault operations.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            OperationConnectorsApi.SetOperationConnectorsRequest request = OperationConnectorsApi.SetOperationConnectorsRequest.builder()
                .type(type)
                .id(id)
                .requestBody(requestBody)
                .confirmDisabledObjects(confirmDisabledObjects)
                .aid(aid)
                .build();
            Assignments result = apiInstance.setOperationConnectors(request);
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

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| request | [**SetOperationConnectorsRequest**](OperationConnectorsApi.md#SetOperationConnectorsRequest)|-|-|

### Return type

[**Assignments**](Assignments.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Operation Connectors updated successfully. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |

## setOperationConnectorsWithHttpInfo

> ApiResponse<Assignments> setOperationConnectors setOperationConnectorsWithHttpInfo(SetOperationConnectorsRequest)

Assign connectors to an operation

Assigns one or more connectors to an operation. This replaces any existing assignments. Note: This operation may disable affected objects (such as tests) if connectors are changed.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.OperationConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        OperationConnectorsApi apiInstance = new OperationConnectorsApi(defaultClient);
        String type = "webhooks"; // String | The operation type.
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The operation ID.
        List<String> requestBody = ["ca39314d-eb4f-496f-9435-b5d20b1bfbff"]; // List<String> | List of connector IDs to assign to the operation.
        Boolean confirmDisabledObjects = false; // Boolean | Confirmation to disable affected objects (for example, tests) for credential-vault operations.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            OperationConnectorsApi.SetOperationConnectorsRequest request = OperationConnectorsApi.SetOperationConnectorsRequest.builder()
                .type(type)
                .id(id)
                .requestBody(requestBody)
                .confirmDisabledObjects(confirmDisabledObjects)
                .aid(aid)
                .build();
            ApiResponse<Assignments> response = apiInstance.setOperationConnectorsWithHttpInfo(request);
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

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| request | [**SetOperationConnectorsRequest**](OperationConnectorsApi.md#SetOperationConnectorsRequest)|-|-|

### Return type

ApiResponse<[**Assignments**](Assignments.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Operation Connectors updated successfully. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |


<a id="SetOperationConnectorsRequest"></a>
## SetOperationConnectorsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **type** | **String** | The operation type. | |
| **id** | **String** | The operation ID. | |
| **requestBody** | [**List&lt;String&gt;**](String.md) | List of connector IDs to assign to the operation. | |
| **confirmDisabledObjects** | **Boolean** | Confirmation to disable affected objects (for example, tests) for credential-vault operations. | [optional] [default to false] |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |


