# AccountGroupsApi

All URIs are relative to *https://api.thousandeyes.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAccountGroup**](AccountGroupsApi.md#createAccountGroup) | **POST** /v7/account-groups | Create account group |
| [**createAccountGroupWithHttpInfo**](AccountGroupsApi.md#createAccountGroupWithHttpInfo) | **POST** /v7/account-groups | Create account group |
| [**deleteAccountGroup**](AccountGroupsApi.md#deleteAccountGroup) | **DELETE** /v7/account-groups/{id} | Delete account group |
| [**deleteAccountGroupWithHttpInfo**](AccountGroupsApi.md#deleteAccountGroupWithHttpInfo) | **DELETE** /v7/account-groups/{id} | Delete account group |
| [**getAccountGroup**](AccountGroupsApi.md#getAccountGroup) | **GET** /v7/account-groups/{id} | Retrieve account group |
| [**getAccountGroupWithHttpInfo**](AccountGroupsApi.md#getAccountGroupWithHttpInfo) | **GET** /v7/account-groups/{id} | Retrieve account group |
| [**getAccountGroups**](AccountGroupsApi.md#getAccountGroups) | **GET** /v7/account-groups | List account groups |
| [**getAccountGroupsWithHttpInfo**](AccountGroupsApi.md#getAccountGroupsWithHttpInfo) | **GET** /v7/account-groups | List account groups |
| [**updateAccountGroup**](AccountGroupsApi.md#updateAccountGroup) | **PUT** /v7/account-groups/{id} | Update account group |
| [**updateAccountGroupWithHttpInfo**](AccountGroupsApi.md#updateAccountGroupWithHttpInfo) | **PUT** /v7/account-groups/{id} | Update account group |



## createAccountGroup

> CreatedAccountGroup createAccountGroup(accountGroupRequest, expand)

Create account group

Creates a new account group. This operation requires the &#x60;Edit all account groups&#x60; permission.  **Note:** Any user assigned to &#x60;All Account Groups&#x60; is automatically assigned to the new account group.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.account.management.Configuration;
import com.thousandeyes.sdk.account.management.authentication.*;
import com.thousandeyes.sdk.account.management.models.*;
import com.thousandeyes.sdk.account.management.administrative.AccountGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AccountGroupsApi apiInstance = new AccountGroupsApi(defaultClient);
        AccountGroupRequest accountGroupRequest = new AccountGroupRequest(); // AccountGroupRequest | 
        List<Expand> expand = Arrays.asList(); // List<Expand> | Optional parameter that specifies whether or not account group related resources should be expanded. By default, no expansion takes place if the query parameter is not passed. For example, to expand the `users` resource, pass the `?expand=user` query.
        try {
            CreatedAccountGroup result = apiInstance.createAccountGroup(accountGroupRequest, expand);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountGroupsApi#createAccountGroup");
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
| **accountGroupRequest** | [**AccountGroupRequest**](AccountGroupRequest.md)|  | |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| Optional parameter that specifies whether or not account group related resources should be expanded. By default, no expansion takes place if the query parameter is not passed. For example, to expand the &#x60;users&#x60; resource, pass the &#x60;?expand&#x3D;user&#x60; query. | [optional] |

### Return type

[**CreatedAccountGroup**](CreatedAccountGroup.md)


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

## createAccountGroupWithHttpInfo

> ApiResponse<CreatedAccountGroup> createAccountGroup createAccountGroupWithHttpInfo(accountGroupRequest, expand)

Create account group

Creates a new account group. This operation requires the &#x60;Edit all account groups&#x60; permission.  **Note:** Any user assigned to &#x60;All Account Groups&#x60; is automatically assigned to the new account group.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.account.management.Configuration;
import com.thousandeyes.sdk.account.management.authentication.*;
import com.thousandeyes.sdk.account.management.models.*;
import com.thousandeyes.sdk.account.management.administrative.AccountGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AccountGroupsApi apiInstance = new AccountGroupsApi(defaultClient);
        AccountGroupRequest accountGroupRequest = new AccountGroupRequest(); // AccountGroupRequest | 
        List<Expand> expand = Arrays.asList(); // List<Expand> | Optional parameter that specifies whether or not account group related resources should be expanded. By default, no expansion takes place if the query parameter is not passed. For example, to expand the `users` resource, pass the `?expand=user` query.
        try {
            ApiResponse<CreatedAccountGroup> response = apiInstance.createAccountGroupWithHttpInfo(accountGroupRequest, expand);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountGroupsApi#createAccountGroup");
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
| **accountGroupRequest** | [**AccountGroupRequest**](AccountGroupRequest.md)|  | |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| Optional parameter that specifies whether or not account group related resources should be expanded. By default, no expansion takes place if the query parameter is not passed. For example, to expand the &#x60;users&#x60; resource, pass the &#x60;?expand&#x3D;user&#x60; query. | [optional] |

### Return type

ApiResponse<[**CreatedAccountGroup**](CreatedAccountGroup.md)>


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


## deleteAccountGroup

> void deleteAccountGroup(id)

Delete account group

Deletes an account group using its ID. This operation requires the following permissions:    * Assign management permissions   * Delete account   * Edit all account groups

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.account.management.Configuration;
import com.thousandeyes.sdk.account.management.authentication.*;
import com.thousandeyes.sdk.account.management.models.*;
import com.thousandeyes.sdk.account.management.administrative.AccountGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AccountGroupsApi apiInstance = new AccountGroupsApi(defaultClient);
        String id = "1234"; // String | Identifier for the account group.
        try {
            apiInstance.deleteAccountGroup(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountGroupsApi#deleteAccountGroup");
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
| **id** | **String**| Identifier for the account group. | |

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
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |

## deleteAccountGroupWithHttpInfo

> ApiResponse<Void> deleteAccountGroup deleteAccountGroupWithHttpInfo(id)

Delete account group

Deletes an account group using its ID. This operation requires the following permissions:    * Assign management permissions   * Delete account   * Edit all account groups

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.account.management.Configuration;
import com.thousandeyes.sdk.account.management.authentication.*;
import com.thousandeyes.sdk.account.management.models.*;
import com.thousandeyes.sdk.account.management.administrative.AccountGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AccountGroupsApi apiInstance = new AccountGroupsApi(defaultClient);
        String id = "1234"; // String | Identifier for the account group.
        try {
            ApiResponse<Void> response = apiInstance.deleteAccountGroupWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountGroupsApi#deleteAccountGroup");
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
| **id** | **String**| Identifier for the account group. | |

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
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |


## getAccountGroup

> AccountGroupDetail getAccountGroup(id, expand)

Retrieve account group

Retrieves detailed information about an account group using its ID.  This operation requires the &#x60;View all account groups settings&#x60; permission.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.account.management.Configuration;
import com.thousandeyes.sdk.account.management.authentication.*;
import com.thousandeyes.sdk.account.management.models.*;
import com.thousandeyes.sdk.account.management.administrative.AccountGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AccountGroupsApi apiInstance = new AccountGroupsApi(defaultClient);
        String id = "1234"; // String | Identifier for the account group.
        List<Expand> expand = Arrays.asList(); // List<Expand> | Optional parameter that specifies whether or not account group related resources should be expanded. By default, no expansion takes place if the query parameter is not passed. For example, to expand the `users` resource, pass the `?expand=user` query.
        try {
            AccountGroupDetail result = apiInstance.getAccountGroup(id, expand);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountGroupsApi#getAccountGroup");
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
| **id** | **String**| Identifier for the account group. | |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| Optional parameter that specifies whether or not account group related resources should be expanded. By default, no expansion takes place if the query parameter is not passed. For example, to expand the &#x60;users&#x60; resource, pass the &#x60;?expand&#x3D;user&#x60; query. | [optional] |

### Return type

[**AccountGroupDetail**](AccountGroupDetail.md)


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

## getAccountGroupWithHttpInfo

> ApiResponse<AccountGroupDetail> getAccountGroup getAccountGroupWithHttpInfo(id, expand)

Retrieve account group

Retrieves detailed information about an account group using its ID.  This operation requires the &#x60;View all account groups settings&#x60; permission.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.account.management.Configuration;
import com.thousandeyes.sdk.account.management.authentication.*;
import com.thousandeyes.sdk.account.management.models.*;
import com.thousandeyes.sdk.account.management.administrative.AccountGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AccountGroupsApi apiInstance = new AccountGroupsApi(defaultClient);
        String id = "1234"; // String | Identifier for the account group.
        List<Expand> expand = Arrays.asList(); // List<Expand> | Optional parameter that specifies whether or not account group related resources should be expanded. By default, no expansion takes place if the query parameter is not passed. For example, to expand the `users` resource, pass the `?expand=user` query.
        try {
            ApiResponse<AccountGroupDetail> response = apiInstance.getAccountGroupWithHttpInfo(id, expand);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountGroupsApi#getAccountGroup");
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
| **id** | **String**| Identifier for the account group. | |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| Optional parameter that specifies whether or not account group related resources should be expanded. By default, no expansion takes place if the query parameter is not passed. For example, to expand the &#x60;users&#x60; resource, pass the &#x60;?expand&#x3D;user&#x60; query. | [optional] |

### Return type

ApiResponse<[**AccountGroupDetail**](AccountGroupDetail.md)>


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


## getAccountGroups

> AccountGroups getAccountGroups(aid)

List account groups

Retrieves a list of account groups available to the current user.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.account.management.Configuration;
import com.thousandeyes.sdk.account.management.authentication.*;
import com.thousandeyes.sdk.account.management.models.*;
import com.thousandeyes.sdk.account.management.administrative.AccountGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AccountGroupsApi apiInstance = new AccountGroupsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AccountGroups result = apiInstance.getAccountGroups(aid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountGroupsApi#getAccountGroups");
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

[**AccountGroups**](AccountGroups.md)


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

## getAccountGroupsWithHttpInfo

> ApiResponse<AccountGroups> getAccountGroups getAccountGroupsWithHttpInfo(aid)

List account groups

Retrieves a list of account groups available to the current user.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.account.management.Configuration;
import com.thousandeyes.sdk.account.management.authentication.*;
import com.thousandeyes.sdk.account.management.models.*;
import com.thousandeyes.sdk.account.management.administrative.AccountGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AccountGroupsApi apiInstance = new AccountGroupsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiResponse<AccountGroups> response = apiInstance.getAccountGroupsWithHttpInfo(aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountGroupsApi#getAccountGroups");
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

ApiResponse<[**AccountGroups**](AccountGroups.md)>


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


## updateAccountGroup

> AccountGroupDetail updateAccountGroup(id, accountGroupRequest, expand)

Update account group

Updates an account group using its ID. You can modify the account group’s name or the list of agents assigned to the account group.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.account.management.Configuration;
import com.thousandeyes.sdk.account.management.authentication.*;
import com.thousandeyes.sdk.account.management.models.*;
import com.thousandeyes.sdk.account.management.administrative.AccountGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AccountGroupsApi apiInstance = new AccountGroupsApi(defaultClient);
        String id = "1234"; // String | Identifier for the account group.
        AccountGroupRequest accountGroupRequest = new AccountGroupRequest(); // AccountGroupRequest | 
        List<Expand> expand = Arrays.asList(); // List<Expand> | Optional parameter that specifies whether or not account group related resources should be expanded. By default, no expansion takes place if the query parameter is not passed. For example, to expand the `users` resource, pass the `?expand=user` query.
        try {
            AccountGroupDetail result = apiInstance.updateAccountGroup(id, accountGroupRequest, expand);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountGroupsApi#updateAccountGroup");
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
| **id** | **String**| Identifier for the account group. | |
| **accountGroupRequest** | [**AccountGroupRequest**](AccountGroupRequest.md)|  | |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| Optional parameter that specifies whether or not account group related resources should be expanded. By default, no expansion takes place if the query parameter is not passed. For example, to expand the &#x60;users&#x60; resource, pass the &#x60;?expand&#x3D;user&#x60; query. | [optional] |

### Return type

[**AccountGroupDetail**](AccountGroupDetail.md)


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

## updateAccountGroupWithHttpInfo

> ApiResponse<AccountGroupDetail> updateAccountGroup updateAccountGroupWithHttpInfo(id, accountGroupRequest, expand)

Update account group

Updates an account group using its ID. You can modify the account group’s name or the list of agents assigned to the account group.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.account.management.Configuration;
import com.thousandeyes.sdk.account.management.authentication.*;
import com.thousandeyes.sdk.account.management.models.*;
import com.thousandeyes.sdk.account.management.administrative.AccountGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AccountGroupsApi apiInstance = new AccountGroupsApi(defaultClient);
        String id = "1234"; // String | Identifier for the account group.
        AccountGroupRequest accountGroupRequest = new AccountGroupRequest(); // AccountGroupRequest | 
        List<Expand> expand = Arrays.asList(); // List<Expand> | Optional parameter that specifies whether or not account group related resources should be expanded. By default, no expansion takes place if the query parameter is not passed. For example, to expand the `users` resource, pass the `?expand=user` query.
        try {
            ApiResponse<AccountGroupDetail> response = apiInstance.updateAccountGroupWithHttpInfo(id, accountGroupRequest, expand);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountGroupsApi#updateAccountGroup");
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
| **id** | **String**| Identifier for the account group. | |
| **accountGroupRequest** | [**AccountGroupRequest**](AccountGroupRequest.md)|  | |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| Optional parameter that specifies whether or not account group related resources should be expanded. By default, no expansion takes place if the query parameter is not passed. For example, to expand the &#x60;users&#x60; resource, pass the &#x60;?expand&#x3D;user&#x60; query. | [optional] |

### Return type

ApiResponse<[**AccountGroupDetail**](AccountGroupDetail.md)>


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

