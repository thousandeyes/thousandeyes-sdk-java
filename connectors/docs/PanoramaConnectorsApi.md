# PanoramaConnectorsApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPanoramaConnector**](PanoramaConnectorsApi.md#createPanoramaConnector) | **POST** /connectors/panorama | Create Panorama connector |
| [**createPanoramaConnectorWithHttpInfo**](PanoramaConnectorsApi.md#createPanoramaConnectorWithHttpInfo) | **POST** /connectors/panorama | Create Panorama connector |
| [**deletePanoramaConnector**](PanoramaConnectorsApi.md#deletePanoramaConnector) | **DELETE** /connectors/panorama/{id} | Delete Panorama connector |
| [**deletePanoramaConnectorWithHttpInfo**](PanoramaConnectorsApi.md#deletePanoramaConnectorWithHttpInfo) | **DELETE** /connectors/panorama/{id} | Delete Panorama connector |
| [**getPanoramaConnector**](PanoramaConnectorsApi.md#getPanoramaConnector) | **GET** /connectors/panorama/{id} | Retrieve Panorama connector |
| [**getPanoramaConnectorWithHttpInfo**](PanoramaConnectorsApi.md#getPanoramaConnectorWithHttpInfo) | **GET** /connectors/panorama/{id} | Retrieve Panorama connector |
| [**getPanoramaConnectorOperations**](PanoramaConnectorsApi.md#getPanoramaConnectorOperations) | **GET** /connectors/panorama/{id}/operations | List operation IDs for Panorama connector |
| [**getPanoramaConnectorOperationsWithHttpInfo**](PanoramaConnectorsApi.md#getPanoramaConnectorOperationsWithHttpInfo) | **GET** /connectors/panorama/{id}/operations | List operation IDs for Panorama connector |
| [**getPanoramaConnectors**](PanoramaConnectorsApi.md#getPanoramaConnectors) | **GET** /connectors/panorama | List Panorama connectors |
| [**getPanoramaConnectorsWithHttpInfo**](PanoramaConnectorsApi.md#getPanoramaConnectorsWithHttpInfo) | **GET** /connectors/panorama | List Panorama connectors |
| [**setPanoramaConnectorOperations**](PanoramaConnectorsApi.md#setPanoramaConnectorOperations) | **PUT** /connectors/panorama/{id}/operations | Assign operations to Panorama connector |
| [**setPanoramaConnectorOperationsWithHttpInfo**](PanoramaConnectorsApi.md#setPanoramaConnectorOperationsWithHttpInfo) | **PUT** /connectors/panorama/{id}/operations | Assign operations to Panorama connector |
| [**updatePanoramaConnector**](PanoramaConnectorsApi.md#updatePanoramaConnector) | **PUT** /connectors/panorama/{id} | Update Panorama connector |
| [**updatePanoramaConnectorWithHttpInfo**](PanoramaConnectorsApi.md#updatePanoramaConnectorWithHttpInfo) | **PUT** /connectors/panorama/{id} | Update Panorama connector |



## createPanoramaConnector

> PanoramaConnector createPanoramaConnector(CreatePanoramaConnectorRequest)

Create Panorama connector

Creates a new Panorama connector.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.PanoramaConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        PanoramaConnectorsApi apiInstance = new PanoramaConnectorsApi(defaultClient);
        PanoramaConnector panoramaConnector = new PanoramaConnector(); // PanoramaConnector | Panorama connector configuration.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            PanoramaConnectorsApi.CreatePanoramaConnectorRequest request = PanoramaConnectorsApi.CreatePanoramaConnectorRequest.builder()
                .panoramaConnector(panoramaConnector)
                .aid(aid)
                .build();
            PanoramaConnector result = apiInstance.createPanoramaConnector(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PanoramaConnectorsApi#createPanoramaConnector");
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
| request | [**CreatePanoramaConnectorRequest**](PanoramaConnectorsApi.md#CreatePanoramaConnectorRequest)|-|-|

### Return type

[**PanoramaConnector**](PanoramaConnector.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created Panorama connector. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |

## createPanoramaConnectorWithHttpInfo

> ApiResponse<PanoramaConnector> createPanoramaConnector createPanoramaConnectorWithHttpInfo(CreatePanoramaConnectorRequest)

Create Panorama connector

Creates a new Panorama connector.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.PanoramaConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        PanoramaConnectorsApi apiInstance = new PanoramaConnectorsApi(defaultClient);
        PanoramaConnector panoramaConnector = new PanoramaConnector(); // PanoramaConnector | Panorama connector configuration.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            PanoramaConnectorsApi.CreatePanoramaConnectorRequest request = PanoramaConnectorsApi.CreatePanoramaConnectorRequest.builder()
                .panoramaConnector(panoramaConnector)
                .aid(aid)
                .build();
            ApiResponse<PanoramaConnector> response = apiInstance.createPanoramaConnectorWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PanoramaConnectorsApi#createPanoramaConnector");
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
| request | [**CreatePanoramaConnectorRequest**](PanoramaConnectorsApi.md#CreatePanoramaConnectorRequest)|-|-|

### Return type

ApiResponse<[**PanoramaConnector**](PanoramaConnector.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created Panorama connector. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |


<a id="CreatePanoramaConnectorRequest"></a>
## CreatePanoramaConnectorRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **panoramaConnector** | [**PanoramaConnector**](PanoramaConnector.md) | Panorama connector configuration. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## deletePanoramaConnector

> void deletePanoramaConnector(DeletePanoramaConnectorRequest)

Delete Panorama connector

Deletes the Panorama connector specified by ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.PanoramaConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        PanoramaConnectorsApi apiInstance = new PanoramaConnectorsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The connector ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            PanoramaConnectorsApi.DeletePanoramaConnectorRequest request = PanoramaConnectorsApi.DeletePanoramaConnectorRequest.builder()
                .id(id)
                .aid(aid)
                .build();
            apiInstance.deletePanoramaConnector(request);
        } catch (ApiException e) {
            System.err.println("Exception when calling PanoramaConnectorsApi#deletePanoramaConnector");
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
| request | [**DeletePanoramaConnectorRequest**](PanoramaConnectorsApi.md#DeletePanoramaConnectorRequest)|-|-|

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

## deletePanoramaConnectorWithHttpInfo

> ApiResponse<Void> deletePanoramaConnector deletePanoramaConnectorWithHttpInfo(DeletePanoramaConnectorRequest)

Delete Panorama connector

Deletes the Panorama connector specified by ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.PanoramaConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        PanoramaConnectorsApi apiInstance = new PanoramaConnectorsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The connector ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            PanoramaConnectorsApi.DeletePanoramaConnectorRequest request = PanoramaConnectorsApi.DeletePanoramaConnectorRequest.builder()
                .id(id)
                .aid(aid)
                .build();
            ApiResponse<Void> response = apiInstance.deletePanoramaConnectorWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling PanoramaConnectorsApi#deletePanoramaConnector");
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
| request | [**DeletePanoramaConnectorRequest**](PanoramaConnectorsApi.md#DeletePanoramaConnectorRequest)|-|-|

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


<a id="DeletePanoramaConnectorRequest"></a>
## DeletePanoramaConnectorRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **id** | **String** | The connector ID. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getPanoramaConnector

> PanoramaConnector getPanoramaConnector(GetPanoramaConnectorRequest)

Retrieve Panorama connector

Retrieves details of a Panorama connector by its ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.PanoramaConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        PanoramaConnectorsApi apiInstance = new PanoramaConnectorsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The connector ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            PanoramaConnectorsApi.GetPanoramaConnectorRequest request = PanoramaConnectorsApi.GetPanoramaConnectorRequest.builder()
                .id(id)
                .aid(aid)
                .build();
            PanoramaConnector result = apiInstance.getPanoramaConnector(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PanoramaConnectorsApi#getPanoramaConnector");
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
| request | [**GetPanoramaConnectorRequest**](PanoramaConnectorsApi.md#GetPanoramaConnectorRequest)|-|-|

### Return type

[**PanoramaConnector**](PanoramaConnector.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Panorama connector details. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |

## getPanoramaConnectorWithHttpInfo

> ApiResponse<PanoramaConnector> getPanoramaConnector getPanoramaConnectorWithHttpInfo(GetPanoramaConnectorRequest)

Retrieve Panorama connector

Retrieves details of a Panorama connector by its ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.PanoramaConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        PanoramaConnectorsApi apiInstance = new PanoramaConnectorsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The connector ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            PanoramaConnectorsApi.GetPanoramaConnectorRequest request = PanoramaConnectorsApi.GetPanoramaConnectorRequest.builder()
                .id(id)
                .aid(aid)
                .build();
            ApiResponse<PanoramaConnector> response = apiInstance.getPanoramaConnectorWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PanoramaConnectorsApi#getPanoramaConnector");
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
| request | [**GetPanoramaConnectorRequest**](PanoramaConnectorsApi.md#GetPanoramaConnectorRequest)|-|-|

### Return type

ApiResponse<[**PanoramaConnector**](PanoramaConnector.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Panorama connector details. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |


<a id="GetPanoramaConnectorRequest"></a>
## GetPanoramaConnectorRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **id** | **String** | The connector ID. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getPanoramaConnectorOperations

> Assignments getPanoramaConnectorOperations(GetPanoramaConnectorOperationsRequest)

List operation IDs for Panorama connector

Returns a list of operation IDs assigned to a Panorama connector.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.PanoramaConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        PanoramaConnectorsApi apiInstance = new PanoramaConnectorsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The connector ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            PanoramaConnectorsApi.GetPanoramaConnectorOperationsRequest request = PanoramaConnectorsApi.GetPanoramaConnectorOperationsRequest.builder()
                .id(id)
                .aid(aid)
                .build();
            Assignments result = apiInstance.getPanoramaConnectorOperations(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PanoramaConnectorsApi#getPanoramaConnectorOperations");
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
| request | [**GetPanoramaConnectorOperationsRequest**](PanoramaConnectorsApi.md#GetPanoramaConnectorOperationsRequest)|-|-|

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
| **200** | Operation IDs assigned to the Panorama connector. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |

## getPanoramaConnectorOperationsWithHttpInfo

> ApiResponse<Assignments> getPanoramaConnectorOperations getPanoramaConnectorOperationsWithHttpInfo(GetPanoramaConnectorOperationsRequest)

List operation IDs for Panorama connector

Returns a list of operation IDs assigned to a Panorama connector.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.PanoramaConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        PanoramaConnectorsApi apiInstance = new PanoramaConnectorsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The connector ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            PanoramaConnectorsApi.GetPanoramaConnectorOperationsRequest request = PanoramaConnectorsApi.GetPanoramaConnectorOperationsRequest.builder()
                .id(id)
                .aid(aid)
                .build();
            ApiResponse<Assignments> response = apiInstance.getPanoramaConnectorOperationsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PanoramaConnectorsApi#getPanoramaConnectorOperations");
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
| request | [**GetPanoramaConnectorOperationsRequest**](PanoramaConnectorsApi.md#GetPanoramaConnectorOperationsRequest)|-|-|

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
| **200** | Operation IDs assigned to the Panorama connector. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |


<a id="GetPanoramaConnectorOperationsRequest"></a>
## GetPanoramaConnectorOperationsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **id** | **String** | The connector ID. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getPanoramaConnectors

> PanoramaConnectors getPanoramaConnectors(GetPanoramaConnectorsRequest)

List Panorama connectors

Returns a list of Panorama connectors in the specified account group. If no account group is specified, the user’s default account group is used.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.PanoramaConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        PanoramaConnectorsApi apiInstance = new PanoramaConnectorsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            PanoramaConnectorsApi.GetPanoramaConnectorsRequest request = PanoramaConnectorsApi.GetPanoramaConnectorsRequest.builder()
                .aid(aid)
                .build();
            PanoramaConnectors result = apiInstance.getPanoramaConnectors(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PanoramaConnectorsApi#getPanoramaConnectors");
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
| request | [**GetPanoramaConnectorsRequest**](PanoramaConnectorsApi.md#GetPanoramaConnectorsRequest)|-|-|

### Return type

[**PanoramaConnectors**](PanoramaConnectors.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of Panorama connectors. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |

## getPanoramaConnectorsWithHttpInfo

> ApiResponse<PanoramaConnectors> getPanoramaConnectors getPanoramaConnectorsWithHttpInfo(GetPanoramaConnectorsRequest)

List Panorama connectors

Returns a list of Panorama connectors in the specified account group. If no account group is specified, the user’s default account group is used.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.PanoramaConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        PanoramaConnectorsApi apiInstance = new PanoramaConnectorsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            PanoramaConnectorsApi.GetPanoramaConnectorsRequest request = PanoramaConnectorsApi.GetPanoramaConnectorsRequest.builder()
                .aid(aid)
                .build();
            ApiResponse<PanoramaConnectors> response = apiInstance.getPanoramaConnectorsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PanoramaConnectorsApi#getPanoramaConnectors");
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
| request | [**GetPanoramaConnectorsRequest**](PanoramaConnectorsApi.md#GetPanoramaConnectorsRequest)|-|-|

### Return type

ApiResponse<[**PanoramaConnectors**](PanoramaConnectors.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of Panorama connectors. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |


<a id="GetPanoramaConnectorsRequest"></a>
## GetPanoramaConnectorsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## setPanoramaConnectorOperations

> Assignments setPanoramaConnectorOperations(SetPanoramaConnectorOperationsRequest)

Assign operations to Panorama connector

Assigns operations to a Panorama connector. This replaces any existing assignments. Passing an empty array removes all operation assignments from the connector.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.PanoramaConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        PanoramaConnectorsApi apiInstance = new PanoramaConnectorsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The connector ID.
        List<String> requestBody = ["ca39314d-eb4f-496f-9435-b5d20b1bfbff","a32cfbab-32f6-41d8-9027-7127cba965dd"]; // List<String> | List of operation IDs to assign to the connector.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            PanoramaConnectorsApi.SetPanoramaConnectorOperationsRequest request = PanoramaConnectorsApi.SetPanoramaConnectorOperationsRequest.builder()
                .id(id)
                .requestBody(requestBody)
                .aid(aid)
                .build();
            Assignments result = apiInstance.setPanoramaConnectorOperations(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PanoramaConnectorsApi#setPanoramaConnectorOperations");
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
| request | [**SetPanoramaConnectorOperationsRequest**](PanoramaConnectorsApi.md#SetPanoramaConnectorOperationsRequest)|-|-|

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

## setPanoramaConnectorOperationsWithHttpInfo

> ApiResponse<Assignments> setPanoramaConnectorOperations setPanoramaConnectorOperationsWithHttpInfo(SetPanoramaConnectorOperationsRequest)

Assign operations to Panorama connector

Assigns operations to a Panorama connector. This replaces any existing assignments. Passing an empty array removes all operation assignments from the connector.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.PanoramaConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        PanoramaConnectorsApi apiInstance = new PanoramaConnectorsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The connector ID.
        List<String> requestBody = ["ca39314d-eb4f-496f-9435-b5d20b1bfbff","a32cfbab-32f6-41d8-9027-7127cba965dd"]; // List<String> | List of operation IDs to assign to the connector.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            PanoramaConnectorsApi.SetPanoramaConnectorOperationsRequest request = PanoramaConnectorsApi.SetPanoramaConnectorOperationsRequest.builder()
                .id(id)
                .requestBody(requestBody)
                .aid(aid)
                .build();
            ApiResponse<Assignments> response = apiInstance.setPanoramaConnectorOperationsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PanoramaConnectorsApi#setPanoramaConnectorOperations");
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
| request | [**SetPanoramaConnectorOperationsRequest**](PanoramaConnectorsApi.md#SetPanoramaConnectorOperationsRequest)|-|-|

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


<a id="SetPanoramaConnectorOperationsRequest"></a>
## SetPanoramaConnectorOperationsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **id** | **String** | The connector ID. | |
| **requestBody** | [**List&lt;String&gt;**](String.md) | List of operation IDs to assign to the connector. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## updatePanoramaConnector

> PanoramaConnector updatePanoramaConnector(UpdatePanoramaConnectorRequest)

Update Panorama connector

Replaces the Panorama connector specified by ID. The request must include the complete connector configuration, including authentication credentials; existing credentials are not retained when authentication is omitted.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.PanoramaConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        PanoramaConnectorsApi apiInstance = new PanoramaConnectorsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The connector ID.
        PanoramaConnector panoramaConnector = new PanoramaConnector(); // PanoramaConnector | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            PanoramaConnectorsApi.UpdatePanoramaConnectorRequest request = PanoramaConnectorsApi.UpdatePanoramaConnectorRequest.builder()
                .id(id)
                .panoramaConnector(panoramaConnector)
                .aid(aid)
                .build();
            PanoramaConnector result = apiInstance.updatePanoramaConnector(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PanoramaConnectorsApi#updatePanoramaConnector");
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
| request | [**UpdatePanoramaConnectorRequest**](PanoramaConnectorsApi.md#UpdatePanoramaConnectorRequest)|-|-|

### Return type

[**PanoramaConnector**](PanoramaConnector.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated Panorama connector. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |

## updatePanoramaConnectorWithHttpInfo

> ApiResponse<PanoramaConnector> updatePanoramaConnector updatePanoramaConnectorWithHttpInfo(UpdatePanoramaConnectorRequest)

Update Panorama connector

Replaces the Panorama connector specified by ID. The request must include the complete connector configuration, including authentication credentials; existing credentials are not retained when authentication is omitted.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.connectors.model.*;
import com.thousandeyes.sdk.connectors.PanoramaConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        PanoramaConnectorsApi apiInstance = new PanoramaConnectorsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The connector ID.
        PanoramaConnector panoramaConnector = new PanoramaConnector(); // PanoramaConnector | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            PanoramaConnectorsApi.UpdatePanoramaConnectorRequest request = PanoramaConnectorsApi.UpdatePanoramaConnectorRequest.builder()
                .id(id)
                .panoramaConnector(panoramaConnector)
                .aid(aid)
                .build();
            ApiResponse<PanoramaConnector> response = apiInstance.updatePanoramaConnectorWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PanoramaConnectorsApi#updatePanoramaConnector");
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
| request | [**UpdatePanoramaConnectorRequest**](PanoramaConnectorsApi.md#UpdatePanoramaConnectorRequest)|-|-|

### Return type

ApiResponse<[**PanoramaConnector**](PanoramaConnector.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated Panorama connector. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |


<a id="UpdatePanoramaConnectorRequest"></a>
## UpdatePanoramaConnectorRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **id** | **String** | The connector ID. | |
| **panoramaConnector** | [**PanoramaConnector**](PanoramaConnector.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |


