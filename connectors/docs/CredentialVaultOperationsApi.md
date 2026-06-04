# CredentialVaultOperationsApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCredentialVaultOperation**](CredentialVaultOperationsApi.md#createCredentialVaultOperation) | **POST** /operations/credential-vault | Create Credential Vault operation |
| [**createCredentialVaultOperationWithHttpInfo**](CredentialVaultOperationsApi.md#createCredentialVaultOperationWithHttpInfo) | **POST** /operations/credential-vault | Create Credential Vault operation |
| [**deleteCredentialVaultOperation**](CredentialVaultOperationsApi.md#deleteCredentialVaultOperation) | **DELETE** /operations/credential-vault/{id} | Delete Credential Vault operation |
| [**deleteCredentialVaultOperationWithHttpInfo**](CredentialVaultOperationsApi.md#deleteCredentialVaultOperationWithHttpInfo) | **DELETE** /operations/credential-vault/{id} | Delete Credential Vault operation |
| [**getCredentialVaultOperation**](CredentialVaultOperationsApi.md#getCredentialVaultOperation) | **GET** /operations/credential-vault/{id} | Get Credential Vault operation |
| [**getCredentialVaultOperationWithHttpInfo**](CredentialVaultOperationsApi.md#getCredentialVaultOperationWithHttpInfo) | **GET** /operations/credential-vault/{id} | Get Credential Vault operation |
| [**getCredentialVaultOperations**](CredentialVaultOperationsApi.md#getCredentialVaultOperations) | **GET** /operations/credential-vault | List Credential Vault operations |
| [**getCredentialVaultOperationsWithHttpInfo**](CredentialVaultOperationsApi.md#getCredentialVaultOperationsWithHttpInfo) | **GET** /operations/credential-vault | List Credential Vault operations |
| [**updateCredentialVaultOperation**](CredentialVaultOperationsApi.md#updateCredentialVaultOperation) | **PUT** /operations/credential-vault/{id} | Update Credential Vault operation |
| [**updateCredentialVaultOperationWithHttpInfo**](CredentialVaultOperationsApi.md#updateCredentialVaultOperationWithHttpInfo) | **PUT** /operations/credential-vault/{id} | Update Credential Vault operation |



## createCredentialVaultOperation

> CredentialVaultOperation createCredentialVaultOperation(credentialVaultOperation, aid)

Create Credential Vault operation

Create a new Credential Vault operation.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.CredentialVaultOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CredentialVaultOperationsApi apiInstance = new CredentialVaultOperationsApi(defaultClient);
        CredentialVaultOperation credentialVaultOperation = new CredentialVaultOperation(); // CredentialVaultOperation | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CredentialVaultOperation result = apiInstance.createCredentialVaultOperation(credentialVaultOperation, aid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialVaultOperationsApi#createCredentialVaultOperation");
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
| **credentialVaultOperation** | [**CredentialVaultOperation**](CredentialVaultOperation.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**CredentialVaultOperation**](CredentialVaultOperation.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created Credential Vault operation. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |

## createCredentialVaultOperationWithHttpInfo

> ApiResponse<CredentialVaultOperation> createCredentialVaultOperation createCredentialVaultOperationWithHttpInfo(credentialVaultOperation, aid)

Create Credential Vault operation

Create a new Credential Vault operation.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.CredentialVaultOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CredentialVaultOperationsApi apiInstance = new CredentialVaultOperationsApi(defaultClient);
        CredentialVaultOperation credentialVaultOperation = new CredentialVaultOperation(); // CredentialVaultOperation | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiResponse<CredentialVaultOperation> response = apiInstance.createCredentialVaultOperationWithHttpInfo(credentialVaultOperation, aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialVaultOperationsApi#createCredentialVaultOperation");
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
| **credentialVaultOperation** | [**CredentialVaultOperation**](CredentialVaultOperation.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

ApiResponse<[**CredentialVaultOperation**](CredentialVaultOperation.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created Credential Vault operation. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |


## deleteCredentialVaultOperation

> void deleteCredentialVaultOperation(id, confirmDisabledObjects, aid)

Delete Credential Vault operation

Delete a single Credential Vault operation by its ID. Note: This operation may disable affected objects (such as tests).

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.CredentialVaultOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CredentialVaultOperationsApi apiInstance = new CredentialVaultOperationsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The operation ID.
        Boolean confirmDisabledObjects = false; // Boolean | Confirmation to disable affected objects (for example, tests) for credential-vault operations.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            apiInstance.deleteCredentialVaultOperation(id, confirmDisabledObjects, aid);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialVaultOperationsApi#deleteCredentialVaultOperation");
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
| **confirmDisabledObjects** | **Boolean**| Confirmation to disable affected objects (for example, tests) for credential-vault operations. | [default to false] |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

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

## deleteCredentialVaultOperationWithHttpInfo

> ApiResponse<Void> deleteCredentialVaultOperation deleteCredentialVaultOperationWithHttpInfo(id, confirmDisabledObjects, aid)

Delete Credential Vault operation

Delete a single Credential Vault operation by its ID. Note: This operation may disable affected objects (such as tests).

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.CredentialVaultOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CredentialVaultOperationsApi apiInstance = new CredentialVaultOperationsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The operation ID.
        Boolean confirmDisabledObjects = false; // Boolean | Confirmation to disable affected objects (for example, tests) for credential-vault operations.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiResponse<Void> response = apiInstance.deleteCredentialVaultOperationWithHttpInfo(id, confirmDisabledObjects, aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialVaultOperationsApi#deleteCredentialVaultOperation");
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
| **confirmDisabledObjects** | **Boolean**| Confirmation to disable affected objects (for example, tests) for credential-vault operations. | [default to false] |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

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


## getCredentialVaultOperation

> CredentialVaultOperation getCredentialVaultOperation(id, aid)

Get Credential Vault operation

Retrieve a single Credential Vault operation by its ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.CredentialVaultOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CredentialVaultOperationsApi apiInstance = new CredentialVaultOperationsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The operation ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CredentialVaultOperation result = apiInstance.getCredentialVaultOperation(id, aid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialVaultOperationsApi#getCredentialVaultOperation");
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
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**CredentialVaultOperation**](CredentialVaultOperation.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Credential Vault operation details. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |

## getCredentialVaultOperationWithHttpInfo

> ApiResponse<CredentialVaultOperation> getCredentialVaultOperation getCredentialVaultOperationWithHttpInfo(id, aid)

Get Credential Vault operation

Retrieve a single Credential Vault operation by its ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.CredentialVaultOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CredentialVaultOperationsApi apiInstance = new CredentialVaultOperationsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The operation ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiResponse<CredentialVaultOperation> response = apiInstance.getCredentialVaultOperationWithHttpInfo(id, aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialVaultOperationsApi#getCredentialVaultOperation");
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
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

ApiResponse<[**CredentialVaultOperation**](CredentialVaultOperation.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Credential Vault operation details. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |


## getCredentialVaultOperations

> CredentialVaultOperations getCredentialVaultOperations(aid)

List Credential Vault operations

Returns a list of Credential Vault operations in the specified account group. If no account group is specified, the user&#39;s default account group is used.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.CredentialVaultOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CredentialVaultOperationsApi apiInstance = new CredentialVaultOperationsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CredentialVaultOperations result = apiInstance.getCredentialVaultOperations(aid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialVaultOperationsApi#getCredentialVaultOperations");
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
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**CredentialVaultOperations**](CredentialVaultOperations.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of Credential Vault operations. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |

## getCredentialVaultOperationsWithHttpInfo

> ApiResponse<CredentialVaultOperations> getCredentialVaultOperations getCredentialVaultOperationsWithHttpInfo(aid)

List Credential Vault operations

Returns a list of Credential Vault operations in the specified account group. If no account group is specified, the user&#39;s default account group is used.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.CredentialVaultOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CredentialVaultOperationsApi apiInstance = new CredentialVaultOperationsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiResponse<CredentialVaultOperations> response = apiInstance.getCredentialVaultOperationsWithHttpInfo(aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialVaultOperationsApi#getCredentialVaultOperations");
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
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

ApiResponse<[**CredentialVaultOperations**](CredentialVaultOperations.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of Credential Vault operations. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |


## updateCredentialVaultOperation

> CredentialVaultOperation updateCredentialVaultOperation(id, credentialVaultOperation, aid)

Update Credential Vault operation

Update a single existing Credential Vault operation.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.CredentialVaultOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CredentialVaultOperationsApi apiInstance = new CredentialVaultOperationsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The operation ID.
        CredentialVaultOperation credentialVaultOperation = new CredentialVaultOperation(); // CredentialVaultOperation | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CredentialVaultOperation result = apiInstance.updateCredentialVaultOperation(id, credentialVaultOperation, aid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialVaultOperationsApi#updateCredentialVaultOperation");
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
| **credentialVaultOperation** | [**CredentialVaultOperation**](CredentialVaultOperation.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**CredentialVaultOperation**](CredentialVaultOperation.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated Credential Vault operation. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |

## updateCredentialVaultOperationWithHttpInfo

> ApiResponse<CredentialVaultOperation> updateCredentialVaultOperation updateCredentialVaultOperationWithHttpInfo(id, credentialVaultOperation, aid)

Update Credential Vault operation

Update a single existing Credential Vault operation.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.models.*;
import com.thousandeyes.sdk.connectors.CredentialVaultOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CredentialVaultOperationsApi apiInstance = new CredentialVaultOperationsApi(defaultClient);
        String id = "cb1b8033-ea2d-4e9b-a920-fe87850693cf"; // String | The operation ID.
        CredentialVaultOperation credentialVaultOperation = new CredentialVaultOperation(); // CredentialVaultOperation | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiResponse<CredentialVaultOperation> response = apiInstance.updateCredentialVaultOperationWithHttpInfo(id, credentialVaultOperation, aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialVaultOperationsApi#updateCredentialVaultOperation");
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
| **credentialVaultOperation** | [**CredentialVaultOperation**](CredentialVaultOperation.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

ApiResponse<[**CredentialVaultOperation**](CredentialVaultOperation.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated Credential Vault operation. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |

