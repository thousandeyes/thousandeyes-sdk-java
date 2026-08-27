# GenericConnectorsApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createGenericConnector**](GenericConnectorsApi.md#createGenericConnector) | **POST** /connectors/generic | Create connector |
| [**createGenericConnectorWithHttpInfo**](GenericConnectorsApi.md#createGenericConnectorWithHttpInfo) | **POST** /connectors/generic | Create connector |
| [**deleteGenericConnector**](GenericConnectorsApi.md#deleteGenericConnector) | **DELETE** /connectors/generic/{id} | Delete connector |
| [**deleteGenericConnectorWithHttpInfo**](GenericConnectorsApi.md#deleteGenericConnectorWithHttpInfo) | **DELETE** /connectors/generic/{id} | Delete connector |
| [**getGenericConnector**](GenericConnectorsApi.md#getGenericConnector) | **GET** /connectors/generic/{id} | Retrieve connector |
| [**getGenericConnectorWithHttpInfo**](GenericConnectorsApi.md#getGenericConnectorWithHttpInfo) | **GET** /connectors/generic/{id} | Retrieve connector |
| [**getGenericConnectors**](GenericConnectorsApi.md#getGenericConnectors) | **GET** /connectors/generic | List connectors |
| [**getGenericConnectorsWithHttpInfo**](GenericConnectorsApi.md#getGenericConnectorsWithHttpInfo) | **GET** /connectors/generic | List connectors |
| [**listGenericConnectorOperations**](GenericConnectorsApi.md#listGenericConnectorOperations) | **GET** /connectors/generic/{id}/operations | List operation IDs for a connector |
| [**listGenericConnectorOperationsWithHttpInfo**](GenericConnectorsApi.md#listGenericConnectorOperationsWithHttpInfo) | **GET** /connectors/generic/{id}/operations | List operation IDs for a connector |
| [**setGenericConnectorOperations**](GenericConnectorsApi.md#setGenericConnectorOperations) | **PUT** /connectors/generic/{id}/operations | Assign operations to a connector |
| [**setGenericConnectorOperationsWithHttpInfo**](GenericConnectorsApi.md#setGenericConnectorOperationsWithHttpInfo) | **PUT** /connectors/generic/{id}/operations | Assign operations to a connector |
| [**updateGenericConnector**](GenericConnectorsApi.md#updateGenericConnector) | **PUT** /connectors/generic/{id} | Update connector |
| [**updateGenericConnectorWithHttpInfo**](GenericConnectorsApi.md#updateGenericConnectorWithHttpInfo) | **PUT** /connectors/generic/{id} | Update connector |



## createGenericConnector

> GenericConnector createGenericConnector(CreateGenericConnectorRequest)

Create connector

Creates a new connector.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.GenericConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        GenericConnectorsApi apiInstance = new GenericConnectorsApi(defaultClient);
        GenericConnector genericConnector = new GenericConnector(); // GenericConnector | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            GenericConnectorsApi.CreateGenericConnectorRequest request = GenericConnectorsApi.CreateGenericConnectorRequest.builder()
                .genericConnector(genericConnector)
                .aid(aid)
                .build();
            GenericConnector result = apiInstance.createGenericConnector(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenericConnectorsApi#createGenericConnector");
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
| request | [**CreateGenericConnectorRequest**](GenericConnectorsApi.md#CreateGenericConnectorRequest)|-|-|

### Return type

[**GenericConnector**](GenericConnector.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created connector. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |

## createGenericConnectorWithHttpInfo

> ApiResponse<GenericConnector> createGenericConnector createGenericConnectorWithHttpInfo(CreateGenericConnectorRequest)

Create connector

Creates a new connector.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.GenericConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        GenericConnectorsApi apiInstance = new GenericConnectorsApi(defaultClient);
        GenericConnector genericConnector = new GenericConnector(); // GenericConnector | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            GenericConnectorsApi.CreateGenericConnectorRequest request = GenericConnectorsApi.CreateGenericConnectorRequest.builder()
                .genericConnector(genericConnector)
                .aid(aid)
                .build();
            ApiResponse<GenericConnector> response = apiInstance.createGenericConnectorWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GenericConnectorsApi#createGenericConnector");
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
| request | [**CreateGenericConnectorRequest**](GenericConnectorsApi.md#CreateGenericConnectorRequest)|-|-|

### Return type

ApiResponse<[**GenericConnector**](GenericConnector.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created connector. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |


<a id="CreateGenericConnectorRequest"></a>
## CreateGenericConnectorRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **genericConnector** | [**GenericConnector**](GenericConnector.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## deleteGenericConnector

> void deleteGenericConnector(DeleteGenericConnectorRequest)

Delete connector

Deletes the connector specified by ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.GenericConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        GenericConnectorsApi apiInstance = new GenericConnectorsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The connector ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            GenericConnectorsApi.DeleteGenericConnectorRequest request = GenericConnectorsApi.DeleteGenericConnectorRequest.builder()
                .id(id)
                .aid(aid)
                .build();
            apiInstance.deleteGenericConnector(request);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenericConnectorsApi#deleteGenericConnector");
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
| request | [**DeleteGenericConnectorRequest**](GenericConnectorsApi.md#DeleteGenericConnectorRequest)|-|-|

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

## deleteGenericConnectorWithHttpInfo

> ApiResponse<Void> deleteGenericConnector deleteGenericConnectorWithHttpInfo(DeleteGenericConnectorRequest)

Delete connector

Deletes the connector specified by ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.GenericConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        GenericConnectorsApi apiInstance = new GenericConnectorsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The connector ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            GenericConnectorsApi.DeleteGenericConnectorRequest request = GenericConnectorsApi.DeleteGenericConnectorRequest.builder()
                .id(id)
                .aid(aid)
                .build();
            ApiResponse<Void> response = apiInstance.deleteGenericConnectorWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling GenericConnectorsApi#deleteGenericConnector");
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
| request | [**DeleteGenericConnectorRequest**](GenericConnectorsApi.md#DeleteGenericConnectorRequest)|-|-|

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


<a id="DeleteGenericConnectorRequest"></a>
## DeleteGenericConnectorRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **id** | **String** | The connector ID. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getGenericConnector

> GenericConnector getGenericConnector(GetGenericConnectorRequest)

Retrieve connector

Retrieves details of a connector by its ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.GenericConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        GenericConnectorsApi apiInstance = new GenericConnectorsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The connector ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            GenericConnectorsApi.GetGenericConnectorRequest request = GenericConnectorsApi.GetGenericConnectorRequest.builder()
                .id(id)
                .aid(aid)
                .build();
            GenericConnector result = apiInstance.getGenericConnector(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenericConnectorsApi#getGenericConnector");
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
| request | [**GetGenericConnectorRequest**](GenericConnectorsApi.md#GetGenericConnectorRequest)|-|-|

### Return type

[**GenericConnector**](GenericConnector.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Connector details. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |

## getGenericConnectorWithHttpInfo

> ApiResponse<GenericConnector> getGenericConnector getGenericConnectorWithHttpInfo(GetGenericConnectorRequest)

Retrieve connector

Retrieves details of a connector by its ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.GenericConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        GenericConnectorsApi apiInstance = new GenericConnectorsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The connector ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            GenericConnectorsApi.GetGenericConnectorRequest request = GenericConnectorsApi.GetGenericConnectorRequest.builder()
                .id(id)
                .aid(aid)
                .build();
            ApiResponse<GenericConnector> response = apiInstance.getGenericConnectorWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GenericConnectorsApi#getGenericConnector");
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
| request | [**GetGenericConnectorRequest**](GenericConnectorsApi.md#GetGenericConnectorRequest)|-|-|

### Return type

ApiResponse<[**GenericConnector**](GenericConnector.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Connector details. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |


<a id="GetGenericConnectorRequest"></a>
## GetGenericConnectorRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **id** | **String** | The connector ID. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getGenericConnectors

> GenericConnectors getGenericConnectors(GetGenericConnectorsRequest)

List connectors

Returns a list of connectors in the specified account group. If no account group is specified, the user’s default account group is used.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.GenericConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        GenericConnectorsApi apiInstance = new GenericConnectorsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            GenericConnectorsApi.GetGenericConnectorsRequest request = GenericConnectorsApi.GetGenericConnectorsRequest.builder()
                .aid(aid)
                .build();
            GenericConnectors result = apiInstance.getGenericConnectors(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenericConnectorsApi#getGenericConnectors");
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
| request | [**GetGenericConnectorsRequest**](GenericConnectorsApi.md#GetGenericConnectorsRequest)|-|-|

### Return type

[**GenericConnectors**](GenericConnectors.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of connectors. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |

## getGenericConnectorsWithHttpInfo

> ApiResponse<GenericConnectors> getGenericConnectors getGenericConnectorsWithHttpInfo(GetGenericConnectorsRequest)

List connectors

Returns a list of connectors in the specified account group. If no account group is specified, the user’s default account group is used.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.GenericConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        GenericConnectorsApi apiInstance = new GenericConnectorsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            GenericConnectorsApi.GetGenericConnectorsRequest request = GenericConnectorsApi.GetGenericConnectorsRequest.builder()
                .aid(aid)
                .build();
            ApiResponse<GenericConnectors> response = apiInstance.getGenericConnectorsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GenericConnectorsApi#getGenericConnectors");
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
| request | [**GetGenericConnectorsRequest**](GenericConnectorsApi.md#GetGenericConnectorsRequest)|-|-|

### Return type

ApiResponse<[**GenericConnectors**](GenericConnectors.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of connectors. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |


<a id="GetGenericConnectorsRequest"></a>
## GetGenericConnectorsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## listGenericConnectorOperations

> Assignments listGenericConnectorOperations(ListGenericConnectorOperationsRequest)

List operation IDs for a connector

Returns a list of operation IDs assigned to a connector.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.GenericConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        GenericConnectorsApi apiInstance = new GenericConnectorsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The connector ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            GenericConnectorsApi.ListGenericConnectorOperationsRequest request = GenericConnectorsApi.ListGenericConnectorOperationsRequest.builder()
                .id(id)
                .aid(aid)
                .build();
            Assignments result = apiInstance.listGenericConnectorOperations(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenericConnectorsApi#listGenericConnectorOperations");
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
| request | [**ListGenericConnectorOperationsRequest**](GenericConnectorsApi.md#ListGenericConnectorOperationsRequest)|-|-|

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
| **200** | A list of assigned operation IDs. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |

## listGenericConnectorOperationsWithHttpInfo

> ApiResponse<Assignments> listGenericConnectorOperations listGenericConnectorOperationsWithHttpInfo(ListGenericConnectorOperationsRequest)

List operation IDs for a connector

Returns a list of operation IDs assigned to a connector.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.GenericConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        GenericConnectorsApi apiInstance = new GenericConnectorsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The connector ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            GenericConnectorsApi.ListGenericConnectorOperationsRequest request = GenericConnectorsApi.ListGenericConnectorOperationsRequest.builder()
                .id(id)
                .aid(aid)
                .build();
            ApiResponse<Assignments> response = apiInstance.listGenericConnectorOperationsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GenericConnectorsApi#listGenericConnectorOperations");
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
| request | [**ListGenericConnectorOperationsRequest**](GenericConnectorsApi.md#ListGenericConnectorOperationsRequest)|-|-|

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
| **200** | A list of assigned operation IDs. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |


<a id="ListGenericConnectorOperationsRequest"></a>
## ListGenericConnectorOperationsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **id** | **String** | The connector ID. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## setGenericConnectorOperations

> Assignments setGenericConnectorOperations(SetGenericConnectorOperationsRequest)

Assign operations to a connector

Assigns operations to a connector. This replaces any existing assignments.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.GenericConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        GenericConnectorsApi apiInstance = new GenericConnectorsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The connector ID.
        List<String> requestBody = ["ca39314d-eb4f-496f-9435-b5d20b1bfbff","a32cfbab-32f6-41d8-9027-7127cba965dd"]; // List<String> | List of operation IDs to assign to the connector.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            GenericConnectorsApi.SetGenericConnectorOperationsRequest request = GenericConnectorsApi.SetGenericConnectorOperationsRequest.builder()
                .id(id)
                .requestBody(requestBody)
                .aid(aid)
                .build();
            Assignments result = apiInstance.setGenericConnectorOperations(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenericConnectorsApi#setGenericConnectorOperations");
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
| request | [**SetGenericConnectorOperationsRequest**](GenericConnectorsApi.md#SetGenericConnectorOperationsRequest)|-|-|

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
| **200** | Operations assigned successfully. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |

## setGenericConnectorOperationsWithHttpInfo

> ApiResponse<Assignments> setGenericConnectorOperations setGenericConnectorOperationsWithHttpInfo(SetGenericConnectorOperationsRequest)

Assign operations to a connector

Assigns operations to a connector. This replaces any existing assignments.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.GenericConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        GenericConnectorsApi apiInstance = new GenericConnectorsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The connector ID.
        List<String> requestBody = ["ca39314d-eb4f-496f-9435-b5d20b1bfbff","a32cfbab-32f6-41d8-9027-7127cba965dd"]; // List<String> | List of operation IDs to assign to the connector.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            GenericConnectorsApi.SetGenericConnectorOperationsRequest request = GenericConnectorsApi.SetGenericConnectorOperationsRequest.builder()
                .id(id)
                .requestBody(requestBody)
                .aid(aid)
                .build();
            ApiResponse<Assignments> response = apiInstance.setGenericConnectorOperationsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GenericConnectorsApi#setGenericConnectorOperations");
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
| request | [**SetGenericConnectorOperationsRequest**](GenericConnectorsApi.md#SetGenericConnectorOperationsRequest)|-|-|

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
| **200** | Operations assigned successfully. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |


<a id="SetGenericConnectorOperationsRequest"></a>
## SetGenericConnectorOperationsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **id** | **String** | The connector ID. | |
| **requestBody** | [**List&lt;String&gt;**](String.md) | List of operation IDs to assign to the connector. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## updateGenericConnector

> GenericConnector updateGenericConnector(UpdateGenericConnectorRequest)

Update connector

Updates the connector specified by ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.GenericConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        GenericConnectorsApi apiInstance = new GenericConnectorsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The connector ID.
        GenericConnector genericConnector = new GenericConnector(); // GenericConnector | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            GenericConnectorsApi.UpdateGenericConnectorRequest request = GenericConnectorsApi.UpdateGenericConnectorRequest.builder()
                .id(id)
                .genericConnector(genericConnector)
                .aid(aid)
                .build();
            GenericConnector result = apiInstance.updateGenericConnector(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenericConnectorsApi#updateGenericConnector");
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
| request | [**UpdateGenericConnectorRequest**](GenericConnectorsApi.md#UpdateGenericConnectorRequest)|-|-|

### Return type

[**GenericConnector**](GenericConnector.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated connector. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |

## updateGenericConnectorWithHttpInfo

> ApiResponse<GenericConnector> updateGenericConnector updateGenericConnectorWithHttpInfo(UpdateGenericConnectorRequest)

Update connector

Updates the connector specified by ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.GenericConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        GenericConnectorsApi apiInstance = new GenericConnectorsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The connector ID.
        GenericConnector genericConnector = new GenericConnector(); // GenericConnector | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            GenericConnectorsApi.UpdateGenericConnectorRequest request = GenericConnectorsApi.UpdateGenericConnectorRequest.builder()
                .id(id)
                .genericConnector(genericConnector)
                .aid(aid)
                .build();
            ApiResponse<GenericConnector> response = apiInstance.updateGenericConnectorWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GenericConnectorsApi#updateGenericConnector");
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
| request | [**UpdateGenericConnectorRequest**](GenericConnectorsApi.md#UpdateGenericConnectorRequest)|-|-|

### Return type

ApiResponse<[**GenericConnector**](GenericConnector.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated connector. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |


<a id="UpdateGenericConnectorRequest"></a>
## UpdateGenericConnectorRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **id** | **String** | The connector ID. | |
| **genericConnector** | [**GenericConnector**](GenericConnector.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |


