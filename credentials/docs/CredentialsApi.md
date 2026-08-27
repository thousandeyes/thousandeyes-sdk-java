# CredentialsApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCredential**](CredentialsApi.md#createCredential) | **POST** /credentials | Create credential |
| [**createCredentialWithHttpInfo**](CredentialsApi.md#createCredentialWithHttpInfo) | **POST** /credentials | Create credential |
| [**deleteCredential**](CredentialsApi.md#deleteCredential) | **DELETE** /credentials/{id} | Delete credential |
| [**deleteCredentialWithHttpInfo**](CredentialsApi.md#deleteCredentialWithHttpInfo) | **DELETE** /credentials/{id} | Delete credential |
| [**getCredential**](CredentialsApi.md#getCredential) | **GET** /credentials/{id} | Retrieve credential |
| [**getCredentialWithHttpInfo**](CredentialsApi.md#getCredentialWithHttpInfo) | **GET** /credentials/{id} | Retrieve credential |
| [**getCredentials**](CredentialsApi.md#getCredentials) | **GET** /credentials | List credentials |
| [**getCredentialsWithHttpInfo**](CredentialsApi.md#getCredentialsWithHttpInfo) | **GET** /credentials | List credentials |
| [**updateCredential**](CredentialsApi.md#updateCredential) | **PUT** /credentials/{id} | Update credential |
| [**updateCredentialWithHttpInfo**](CredentialsApi.md#updateCredentialWithHttpInfo) | **PUT** /credentials/{id} | Update credential |



## createCredential

> CredentialWithoutValue createCredential(CreateCredentialRequest)

Create credential

Creates a new credential for ThousandEyes transaction tests, based on properties provided in the request data. To create a new credential, you must have permission to update tests.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.credentials.model.*;
import com.thousandeyes.sdk.credentials.CredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CredentialsApi apiInstance = new CredentialsApi(defaultClient);
        CredentialRequest credentialRequest = new CredentialRequest(); // CredentialRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CredentialsApi.CreateCredentialRequest request = CredentialsApi.CreateCredentialRequest.builder()
                .credentialRequest(credentialRequest)
                .aid(aid)
                .build();
            CredentialWithoutValue result = apiInstance.createCredential(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialsApi#createCredential");
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
| request | [**CreateCredentialRequest**](CredentialsApi.md#CreateCredentialRequest)|-|-|

### Return type

[**CredentialWithoutValue**](CredentialWithoutValue.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  * Location -  <br>  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |

## createCredentialWithHttpInfo

> ApiResponse<CredentialWithoutValue> createCredential createCredentialWithHttpInfo(CreateCredentialRequest)

Create credential

Creates a new credential for ThousandEyes transaction tests, based on properties provided in the request data. To create a new credential, you must have permission to update tests.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.credentials.model.*;
import com.thousandeyes.sdk.credentials.CredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CredentialsApi apiInstance = new CredentialsApi(defaultClient);
        CredentialRequest credentialRequest = new CredentialRequest(); // CredentialRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CredentialsApi.CreateCredentialRequest request = CredentialsApi.CreateCredentialRequest.builder()
                .credentialRequest(credentialRequest)
                .aid(aid)
                .build();
            ApiResponse<CredentialWithoutValue> response = apiInstance.createCredentialWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialsApi#createCredential");
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
| request | [**CreateCredentialRequest**](CredentialsApi.md#CreateCredentialRequest)|-|-|

### Return type

ApiResponse<[**CredentialWithoutValue**](CredentialWithoutValue.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  * Location -  <br>  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |


<a id="CreateCredentialRequest"></a>
## CreateCredentialRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **credentialRequest** | [**CredentialRequest**](CredentialRequest.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## deleteCredential

> void deleteCredential(DeleteCredentialRequest)

Delete credential

Deletes a ThousandEyes transaction test credential, using the request parameters. To delete a credential, you must have permission to update tests and access to the credential based on its default or provided account ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.credentials.model.*;
import com.thousandeyes.sdk.credentials.CredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CredentialsApi apiInstance = new CredentialsApi(defaultClient);
        String id = "3247"; // String | The ID of the desired credential.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CredentialsApi.DeleteCredentialRequest request = CredentialsApi.DeleteCredentialRequest.builder()
                .id(id)
                .aid(aid)
                .build();
            apiInstance.deleteCredential(request);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialsApi#deleteCredential");
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
| request | [**DeleteCredentialRequest**](CredentialsApi.md#DeleteCredentialRequest)|-|-|

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
| **500** | Internal server error |  -  |

## deleteCredentialWithHttpInfo

> ApiResponse<Void> deleteCredential deleteCredentialWithHttpInfo(DeleteCredentialRequest)

Delete credential

Deletes a ThousandEyes transaction test credential, using the request parameters. To delete a credential, you must have permission to update tests and access to the credential based on its default or provided account ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.credentials.model.*;
import com.thousandeyes.sdk.credentials.CredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CredentialsApi apiInstance = new CredentialsApi(defaultClient);
        String id = "3247"; // String | The ID of the desired credential.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CredentialsApi.DeleteCredentialRequest request = CredentialsApi.DeleteCredentialRequest.builder()
                .id(id)
                .aid(aid)
                .build();
            ApiResponse<Void> response = apiInstance.deleteCredentialWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialsApi#deleteCredential");
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
| request | [**DeleteCredentialRequest**](CredentialsApi.md#DeleteCredentialRequest)|-|-|

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
| **500** | Internal server error |  -  |


<a id="DeleteCredentialRequest"></a>
## DeleteCredentialRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **id** | **String** | The ID of the desired credential. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getCredential

> Credential getCredential(GetCredentialRequest)

Retrieve credential

Retrieves detailed information about a ThousandEyes transaction test credential. To access this information, you must have access to the credential based on its default or provided account ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.credentials.model.*;
import com.thousandeyes.sdk.credentials.CredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CredentialsApi apiInstance = new CredentialsApi(defaultClient);
        String id = "3247"; // String | The ID of the desired credential.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CredentialsApi.GetCredentialRequest request = CredentialsApi.GetCredentialRequest.builder()
                .id(id)
                .aid(aid)
                .build();
            Credential result = apiInstance.getCredential(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialsApi#getCredential");
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
| request | [**GetCredentialRequest**](CredentialsApi.md#GetCredentialRequest)|-|-|

### Return type

[**Credential**](Credential.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
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
| **500** | Internal server error |  -  |

## getCredentialWithHttpInfo

> ApiResponse<Credential> getCredential getCredentialWithHttpInfo(GetCredentialRequest)

Retrieve credential

Retrieves detailed information about a ThousandEyes transaction test credential. To access this information, you must have access to the credential based on its default or provided account ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.credentials.model.*;
import com.thousandeyes.sdk.credentials.CredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CredentialsApi apiInstance = new CredentialsApi(defaultClient);
        String id = "3247"; // String | The ID of the desired credential.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CredentialsApi.GetCredentialRequest request = CredentialsApi.GetCredentialRequest.builder()
                .id(id)
                .aid(aid)
                .build();
            ApiResponse<Credential> response = apiInstance.getCredentialWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialsApi#getCredential");
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
| request | [**GetCredentialRequest**](CredentialsApi.md#GetCredentialRequest)|-|-|

### Return type

ApiResponse<[**Credential**](Credential.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
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
| **500** | Internal server error |  -  |


<a id="GetCredentialRequest"></a>
## GetCredentialRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **id** | **String** | The ID of the desired credential. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getCredentials

> Credentials getCredentials(GetCredentialsRequest)

List credentials

Retrieves a list of credentials configured in ThousandEyes. Users have access to the list of credentials based on the default settings or the specified account ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.credentials.model.*;
import com.thousandeyes.sdk.credentials.CredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CredentialsApi apiInstance = new CredentialsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CredentialsApi.GetCredentialsRequest request = CredentialsApi.GetCredentialsRequest.builder()
                .aid(aid)
                .build();
            Credentials result = apiInstance.getCredentials(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialsApi#getCredentials");
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
| request | [**GetCredentialsRequest**](CredentialsApi.md#GetCredentialsRequest)|-|-|

### Return type

[**Credentials**](Credentials.md)


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
| **500** | Internal server error |  -  |

## getCredentialsWithHttpInfo

> ApiResponse<Credentials> getCredentials getCredentialsWithHttpInfo(GetCredentialsRequest)

List credentials

Retrieves a list of credentials configured in ThousandEyes. Users have access to the list of credentials based on the default settings or the specified account ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.credentials.model.*;
import com.thousandeyes.sdk.credentials.CredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CredentialsApi apiInstance = new CredentialsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CredentialsApi.GetCredentialsRequest request = CredentialsApi.GetCredentialsRequest.builder()
                .aid(aid)
                .build();
            ApiResponse<Credentials> response = apiInstance.getCredentialsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialsApi#getCredentials");
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
| request | [**GetCredentialsRequest**](CredentialsApi.md#GetCredentialsRequest)|-|-|

### Return type

ApiResponse<[**Credentials**](Credentials.md)>


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
| **500** | Internal server error |  -  |


<a id="GetCredentialsRequest"></a>
## GetCredentialsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## updateCredential

> CredentialWithoutValue updateCredential(UpdateCredentialRequest)

Update credential

Updates the credential for ThousandEyes transaction tests, based on properties provided in the request data. To update a credential, you must have permission to update tests and access to the credential based on its default or provided account ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.credentials.model.*;
import com.thousandeyes.sdk.credentials.CredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CredentialsApi apiInstance = new CredentialsApi(defaultClient);
        String id = "3247"; // String | The ID of the desired credential.
        CredentialRequest credentialRequest = new CredentialRequest(); // CredentialRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CredentialsApi.UpdateCredentialRequest request = CredentialsApi.UpdateCredentialRequest.builder()
                .id(id)
                .credentialRequest(credentialRequest)
                .aid(aid)
                .build();
            CredentialWithoutValue result = apiInstance.updateCredential(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialsApi#updateCredential");
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
| request | [**UpdateCredentialRequest**](CredentialsApi.md#UpdateCredentialRequest)|-|-|

### Return type

[**CredentialWithoutValue**](CredentialWithoutValue.md)


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
| **500** | Internal server error |  -  |

## updateCredentialWithHttpInfo

> ApiResponse<CredentialWithoutValue> updateCredential updateCredentialWithHttpInfo(UpdateCredentialRequest)

Update credential

Updates the credential for ThousandEyes transaction tests, based on properties provided in the request data. To update a credential, you must have permission to update tests and access to the credential based on its default or provided account ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.credentials.model.*;
import com.thousandeyes.sdk.credentials.CredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CredentialsApi apiInstance = new CredentialsApi(defaultClient);
        String id = "3247"; // String | The ID of the desired credential.
        CredentialRequest credentialRequest = new CredentialRequest(); // CredentialRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CredentialsApi.UpdateCredentialRequest request = CredentialsApi.UpdateCredentialRequest.builder()
                .id(id)
                .credentialRequest(credentialRequest)
                .aid(aid)
                .build();
            ApiResponse<CredentialWithoutValue> response = apiInstance.updateCredentialWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialsApi#updateCredential");
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
| request | [**UpdateCredentialRequest**](CredentialsApi.md#UpdateCredentialRequest)|-|-|

### Return type

ApiResponse<[**CredentialWithoutValue**](CredentialWithoutValue.md)>


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
| **500** | Internal server error |  -  |


<a id="UpdateCredentialRequest"></a>
## UpdateCredentialRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **id** | **String** | The ID of the desired credential. | |
| **credentialRequest** | [**CredentialRequest**](CredentialRequest.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |


