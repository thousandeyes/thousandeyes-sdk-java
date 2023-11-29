# AccountGroupsApi

All URIs are relative to *https://api.thousandeyes.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAccountGroup**](AccountGroupsApi.md#createAccountGroup) | **POST** /v7/account-groups | Create account group |
| [**deleteAccountGroup**](AccountGroupsApi.md#deleteAccountGroup) | **DELETE** /v7/account-groups/{id} | Delete account group |
| [**getAccountGroup**](AccountGroupsApi.md#getAccountGroup) | **GET** /v7/account-groups/{id} | Retrieve account group |
| [**getAccountGroups**](AccountGroupsApi.md#getAccountGroups) | **GET** /v7/account-groups | List account groups |
| [**updateAccountGroup**](AccountGroupsApi.md#updateAccountGroup) | **PUT** /v7/account-groups/{id} | Update account group |


<a id="createAccountGroup"></a>
# **createAccountGroup**
> CreateAccountGroup201Response createAccountGroup(accountGroupRequestBody, expand)

Create account group

Creates a new account group. This operation requires the &#x60;Edit all account groups&#x60; permission.  **Note:** Any user assigned to &#x60;All Account Groups&#x60; is automatically assigned to the new account group.

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.AccountGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AccountGroupsApi apiInstance = new AccountGroupsApi(defaultClient);
    AccountGroupRequestBody accountGroupRequestBody = new AccountGroupRequestBody(); // AccountGroupRequestBody | 
    List<Expand> expand = Arrays.asList(); // List<Expand> | Optional parameter that specifies whether or not account group related resources should be expanded. By default, no expansion takes place if the query parameter is not passed. For example, to expand the `users` resource, pass the `?expand=user` query.
    try {
      CreateAccountGroup201Response result = apiInstance.createAccountGroup(accountGroupRequestBody, expand);
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
| **accountGroupRequestBody** | [**AccountGroupRequestBody**](AccountGroupRequestBody.md)|  | |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| Optional parameter that specifies whether or not account group related resources should be expanded. By default, no expansion takes place if the query parameter is not passed. For example, to expand the &#x60;users&#x60; resource, pass the &#x60;?expand&#x3D;user&#x60; query. | [optional] |

### Return type

[**CreateAccountGroup201Response**](CreateAccountGroup201Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/problem+json

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

<a id="deleteAccountGroup"></a>
# **deleteAccountGroup**
> deleteAccountGroup(id)

Delete account group

Deletes an account group using its ID. This operation requires the following permissions:    * Assign management permissions   * Delete account   * Edit all account groups

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.AccountGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AccountGroupsApi apiInstance = new AccountGroupsApi(defaultClient);
    String id = "2067"; // String | Identifier for the account group.
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

<a id="getAccountGroup"></a>
# **getAccountGroup**
> GetAccountGroup200Response getAccountGroup(id, expand)

Retrieve account group

Retrieves detailed information about an account group using its ID.  This operation requires the &#x60;View all account groups settings&#x60; permission.

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.AccountGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AccountGroupsApi apiInstance = new AccountGroupsApi(defaultClient);
    String id = "2067"; // String | Identifier for the account group.
    List<Expand> expand = Arrays.asList(); // List<Expand> | Optional parameter that specifies whether or not account group related resources should be expanded. By default, no expansion takes place if the query parameter is not passed. For example, to expand the `users` resource, pass the `?expand=user` query.
    try {
      GetAccountGroup200Response result = apiInstance.getAccountGroup(id, expand);
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

[**GetAccountGroup200Response**](GetAccountGroup200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/problem+json

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

<a id="getAccountGroups"></a>
# **getAccountGroups**
> GetAccountGroups200Response getAccountGroups(aid)

List account groups

Retrieves a list of account groups available to the current user.

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.AccountGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AccountGroupsApi apiInstance = new AccountGroupsApi(defaultClient);
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      GetAccountGroups200Response result = apiInstance.getAccountGroups(aid);
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

[**GetAccountGroups200Response**](GetAccountGroups200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/problem+json

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

<a id="updateAccountGroup"></a>
# **updateAccountGroup**
> GetAccountGroup200Response updateAccountGroup(id, accountGroupRequestBody, expand)

Update account group

Updates an account group using its ID. You can modify the account group’s name or the list of agents assigned to the account group.

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.AccountGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AccountGroupsApi apiInstance = new AccountGroupsApi(defaultClient);
    String id = "2067"; // String | Identifier for the account group.
    AccountGroupRequestBody accountGroupRequestBody = new AccountGroupRequestBody(); // AccountGroupRequestBody | 
    List<Expand> expand = Arrays.asList(); // List<Expand> | Optional parameter that specifies whether or not account group related resources should be expanded. By default, no expansion takes place if the query parameter is not passed. For example, to expand the `users` resource, pass the `?expand=user` query.
    try {
      GetAccountGroup200Response result = apiInstance.updateAccountGroup(id, accountGroupRequestBody, expand);
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
| **accountGroupRequestBody** | [**AccountGroupRequestBody**](AccountGroupRequestBody.md)|  | |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| Optional parameter that specifies whether or not account group related resources should be expanded. By default, no expansion takes place if the query parameter is not passed. For example, to expand the &#x60;users&#x60; resource, pass the &#x60;?expand&#x3D;user&#x60; query. | [optional] |

### Return type

[**GetAccountGroup200Response**](GetAccountGroup200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/problem+json

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

