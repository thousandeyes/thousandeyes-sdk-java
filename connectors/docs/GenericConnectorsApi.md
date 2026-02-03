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
| [**listGenericConnectorOperations**](GenericConnectorsApi.md#listGenericConnectorOperations) | **GET** /connectors/generic/{id}/operations | List operation IDs assigned to a connector |
| [**listGenericConnectorOperationsWithHttpInfo**](GenericConnectorsApi.md#listGenericConnectorOperationsWithHttpInfo) | **GET** /connectors/generic/{id}/operations | List operation IDs assigned to a connector |
| [**setGenericConnectorOperations**](GenericConnectorsApi.md#setGenericConnectorOperations) | **PUT** /connectors/generic/{id}/operations | Assign operations to a connector |
| [**setGenericConnectorOperationsWithHttpInfo**](GenericConnectorsApi.md#setGenericConnectorOperationsWithHttpInfo) | **PUT** /connectors/generic/{id}/operations | Assign operations to a connector |
| [**updateGenericConnector**](GenericConnectorsApi.md#updateGenericConnector) | **PUT** /connectors/generic/{id} | Update connector |
| [**updateGenericConnectorWithHttpInfo**](GenericConnectorsApi.md#updateGenericConnectorWithHttpInfo) | **PUT** /connectors/generic/{id} | Update connector |



## createGenericConnector

> GenericConnector createGenericConnector(genericConnector, aid)

Create connector

Creates a new connector.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.GenericConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");

        GenericConnectorsApi apiInstance = new GenericConnectorsApi(defaultClient);
        GenericConnector genericConnector = new GenericConnector(); // GenericConnector | 
        BigDecimal aid = new BigDecimal("123456"); // BigDecimal | Account ID
        try {
            GenericConnector result = apiInstance.createGenericConnector(genericConnector, aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **genericConnector** | [**GenericConnector**](GenericConnector.md)|  | |
| **aid** | **BigDecimal**| Account ID | [optional] |

### Return type

[**GenericConnector**](GenericConnector.md)


### Authorization

No authorization required

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

> ApiResponse<GenericConnector> createGenericConnector createGenericConnectorWithHttpInfo(genericConnector, aid)

Create connector

Creates a new connector.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.GenericConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");

        GenericConnectorsApi apiInstance = new GenericConnectorsApi(defaultClient);
        GenericConnector genericConnector = new GenericConnector(); // GenericConnector | 
        BigDecimal aid = new BigDecimal("123456"); // BigDecimal | Account ID
        try {
            ApiResponse<GenericConnector> response = apiInstance.createGenericConnectorWithHttpInfo(genericConnector, aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **genericConnector** | [**GenericConnector**](GenericConnector.md)|  | |
| **aid** | **BigDecimal**| Account ID | [optional] |

### Return type

ApiResponse<[**GenericConnector**](GenericConnector.md)>


### Authorization

No authorization required

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


## deleteGenericConnector

> void deleteGenericConnector(id, aid)

Delete connector

Deletes the connector specified by ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.GenericConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");

        GenericConnectorsApi apiInstance = new GenericConnectorsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The connector ID.
        BigDecimal aid = new BigDecimal("123456"); // BigDecimal | Account ID
        try {
            apiInstance.deleteGenericConnector(id, aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The connector ID. | |
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

## deleteGenericConnectorWithHttpInfo

> ApiResponse<Void> deleteGenericConnector deleteGenericConnectorWithHttpInfo(id, aid)

Delete connector

Deletes the connector specified by ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.GenericConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");

        GenericConnectorsApi apiInstance = new GenericConnectorsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The connector ID.
        BigDecimal aid = new BigDecimal("123456"); // BigDecimal | Account ID
        try {
            ApiResponse<Void> response = apiInstance.deleteGenericConnectorWithHttpInfo(id, aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The connector ID. | |
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


## getGenericConnector

> GenericConnector getGenericConnector(id, aid)

Retrieve connector

Retrieves details of a connector by its ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.GenericConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");

        GenericConnectorsApi apiInstance = new GenericConnectorsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The connector ID.
        BigDecimal aid = new BigDecimal("123456"); // BigDecimal | Account ID
        try {
            GenericConnector result = apiInstance.getGenericConnector(id, aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The connector ID. | |
| **aid** | **BigDecimal**| Account ID | [optional] |

### Return type

[**GenericConnector**](GenericConnector.md)


### Authorization

No authorization required

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

> ApiResponse<GenericConnector> getGenericConnector getGenericConnectorWithHttpInfo(id, aid)

Retrieve connector

Retrieves details of a connector by its ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.GenericConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");

        GenericConnectorsApi apiInstance = new GenericConnectorsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The connector ID.
        BigDecimal aid = new BigDecimal("123456"); // BigDecimal | Account ID
        try {
            ApiResponse<GenericConnector> response = apiInstance.getGenericConnectorWithHttpInfo(id, aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The connector ID. | |
| **aid** | **BigDecimal**| Account ID | [optional] |

### Return type

ApiResponse<[**GenericConnector**](GenericConnector.md)>


### Authorization

No authorization required

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


## getGenericConnectors

> GenericConnectors getGenericConnectors(aid)

List connectors

Returns a list of connectors in the specified account group. If no account group is specified, the user’s default account group is used.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.GenericConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");

        GenericConnectorsApi apiInstance = new GenericConnectorsApi(defaultClient);
        BigDecimal aid = new BigDecimal("123456"); // BigDecimal | Account ID
        try {
            GenericConnectors result = apiInstance.getGenericConnectors(aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aid** | **BigDecimal**| Account ID | [optional] |

### Return type

[**GenericConnectors**](GenericConnectors.md)


### Authorization

No authorization required

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

> ApiResponse<GenericConnectors> getGenericConnectors getGenericConnectorsWithHttpInfo(aid)

List connectors

Returns a list of connectors in the specified account group. If no account group is specified, the user’s default account group is used.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.GenericConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");

        GenericConnectorsApi apiInstance = new GenericConnectorsApi(defaultClient);
        BigDecimal aid = new BigDecimal("123456"); // BigDecimal | Account ID
        try {
            ApiResponse<GenericConnectors> response = apiInstance.getGenericConnectorsWithHttpInfo(aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aid** | **BigDecimal**| Account ID | [optional] |

### Return type

ApiResponse<[**GenericConnectors**](GenericConnectors.md)>


### Authorization

No authorization required

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


## listGenericConnectorOperations

> Assignments listGenericConnectorOperations(id, aid)

List operation IDs assigned to a connector

Returns a list of operation IDs assigned to a connector.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.GenericConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");

        GenericConnectorsApi apiInstance = new GenericConnectorsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The connector ID.
        BigDecimal aid = new BigDecimal("123456"); // BigDecimal | Account ID
        try {
            Assignments result = apiInstance.listGenericConnectorOperations(id, aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The connector ID. | |
| **aid** | **BigDecimal**| Account ID | [optional] |

### Return type

[**Assignments**](Assignments.md)


### Authorization

No authorization required

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

> ApiResponse<Assignments> listGenericConnectorOperations listGenericConnectorOperationsWithHttpInfo(id, aid)

List operation IDs assigned to a connector

Returns a list of operation IDs assigned to a connector.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.GenericConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");

        GenericConnectorsApi apiInstance = new GenericConnectorsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The connector ID.
        BigDecimal aid = new BigDecimal("123456"); // BigDecimal | Account ID
        try {
            ApiResponse<Assignments> response = apiInstance.listGenericConnectorOperationsWithHttpInfo(id, aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The connector ID. | |
| **aid** | **BigDecimal**| Account ID | [optional] |

### Return type

ApiResponse<[**Assignments**](Assignments.md)>


### Authorization

No authorization required

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


## setGenericConnectorOperations

> Assignments setGenericConnectorOperations(id, requestBody, aid)

Assign operations to a connector

Assigns operations to a connector. This replaces any existing assignments.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.GenericConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");

        GenericConnectorsApi apiInstance = new GenericConnectorsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The connector ID.
        List<String> requestBody = ["ca39314d-eb4f-496f-9435-b5d20b1bfbff","a32cfbab-32f6-41d8-9027-7127cba965dd"]; // List<String> | List of operation IDs to assign to the connector.
        BigDecimal aid = new BigDecimal("123456"); // BigDecimal | Account ID
        try {
            Assignments result = apiInstance.setGenericConnectorOperations(id, requestBody, aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The connector ID. | |
| **requestBody** | [**List&lt;String&gt;**](String.md)| List of operation IDs to assign to the connector. | |
| **aid** | **BigDecimal**| Account ID | [optional] |

### Return type

[**Assignments**](Assignments.md)


### Authorization

No authorization required

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

> ApiResponse<Assignments> setGenericConnectorOperations setGenericConnectorOperationsWithHttpInfo(id, requestBody, aid)

Assign operations to a connector

Assigns operations to a connector. This replaces any existing assignments.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.GenericConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");

        GenericConnectorsApi apiInstance = new GenericConnectorsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The connector ID.
        List<String> requestBody = ["ca39314d-eb4f-496f-9435-b5d20b1bfbff","a32cfbab-32f6-41d8-9027-7127cba965dd"]; // List<String> | List of operation IDs to assign to the connector.
        BigDecimal aid = new BigDecimal("123456"); // BigDecimal | Account ID
        try {
            ApiResponse<Assignments> response = apiInstance.setGenericConnectorOperationsWithHttpInfo(id, requestBody, aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The connector ID. | |
| **requestBody** | [**List&lt;String&gt;**](String.md)| List of operation IDs to assign to the connector. | |
| **aid** | **BigDecimal**| Account ID | [optional] |

### Return type

ApiResponse<[**Assignments**](Assignments.md)>


### Authorization

No authorization required

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


## updateGenericConnector

> GenericConnector updateGenericConnector(id, genericConnector, aid)

Update connector

Updates the connector specified by ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.GenericConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");

        GenericConnectorsApi apiInstance = new GenericConnectorsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The connector ID.
        GenericConnector genericConnector = new GenericConnector(); // GenericConnector | 
        BigDecimal aid = new BigDecimal("123456"); // BigDecimal | Account ID
        try {
            GenericConnector result = apiInstance.updateGenericConnector(id, genericConnector, aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The connector ID. | |
| **genericConnector** | [**GenericConnector**](GenericConnector.md)|  | |
| **aid** | **BigDecimal**| Account ID | [optional] |

### Return type

[**GenericConnector**](GenericConnector.md)


### Authorization

No authorization required

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

> ApiResponse<GenericConnector> updateGenericConnector updateGenericConnectorWithHttpInfo(id, genericConnector, aid)

Update connector

Updates the connector specified by ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.GenericConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");

        GenericConnectorsApi apiInstance = new GenericConnectorsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The connector ID.
        GenericConnector genericConnector = new GenericConnector(); // GenericConnector | 
        BigDecimal aid = new BigDecimal("123456"); // BigDecimal | Account ID
        try {
            ApiResponse<GenericConnector> response = apiInstance.updateGenericConnectorWithHttpInfo(id, genericConnector, aid);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The connector ID. | |
| **genericConnector** | [**GenericConnector**](GenericConnector.md)|  | |
| **aid** | **BigDecimal**| Account ID | [optional] |

### Return type

ApiResponse<[**GenericConnector**](GenericConnector.md)>


### Authorization

No authorization required

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

