# RolesApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRole**](RolesApi.md#createRole) | **POST** /roles | Create role |
| [**createRoleWithHttpInfo**](RolesApi.md#createRoleWithHttpInfo) | **POST** /roles | Create role |
| [**deleteRole**](RolesApi.md#deleteRole) | **DELETE** /roles/{id} | Delete role |
| [**deleteRoleWithHttpInfo**](RolesApi.md#deleteRoleWithHttpInfo) | **DELETE** /roles/{id} | Delete role |
| [**getRole**](RolesApi.md#getRole) | **GET** /roles/{id} | Retrieve role |
| [**getRoleWithHttpInfo**](RolesApi.md#getRoleWithHttpInfo) | **GET** /roles/{id} | Retrieve role |
| [**getRoles**](RolesApi.md#getRoles) | **GET** /roles | List roles |
| [**getRolesWithHttpInfo**](RolesApi.md#getRolesWithHttpInfo) | **GET** /roles | List roles |
| [**updateRole**](RolesApi.md#updateRole) | **PUT** /roles/{id} | Update role |
| [**updateRoleWithHttpInfo**](RolesApi.md#updateRoleWithHttpInfo) | **PUT** /roles/{id} | Update role |



## createRole

> RoleDetail createRole(CreateRoleRequest)

Create role

Creates a new role.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.account.management.Configuration;
import com.thousandeyes.sdk.account.management.authentication.*;
import com.thousandeyes.sdk.account.management.administrative.model.*;
import com.thousandeyes.sdk.account.management.administrative.RolesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        RolesApi apiInstance = new RolesApi(defaultClient);
        RoleRequestBody roleRequestBody = new RoleRequestBody(); // RoleRequestBody | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            RolesApi.CreateRoleRequest request = RolesApi.CreateRoleRequest.builder()
                .roleRequestBody(roleRequestBody)
                .aid(aid)
                .build();
            RoleDetail result = apiInstance.createRole(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#createRole");
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
| request | [**CreateRoleRequest**](RolesApi.md#CreateRoleRequest)|-|-|

### Return type

[**RoleDetail**](RoleDetail.md)


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

## createRoleWithHttpInfo

> ApiResponse<RoleDetail> createRole createRoleWithHttpInfo(CreateRoleRequest)

Create role

Creates a new role.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.account.management.Configuration;
import com.thousandeyes.sdk.account.management.authentication.*;
import com.thousandeyes.sdk.account.management.administrative.model.*;
import com.thousandeyes.sdk.account.management.administrative.RolesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        RolesApi apiInstance = new RolesApi(defaultClient);
        RoleRequestBody roleRequestBody = new RoleRequestBody(); // RoleRequestBody | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            RolesApi.CreateRoleRequest request = RolesApi.CreateRoleRequest.builder()
                .roleRequestBody(roleRequestBody)
                .aid(aid)
                .build();
            ApiResponse<RoleDetail> response = apiInstance.createRoleWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#createRole");
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
| request | [**CreateRoleRequest**](RolesApi.md#CreateRoleRequest)|-|-|

### Return type

ApiResponse<[**RoleDetail**](RoleDetail.md)>


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


<a id="CreateRoleRequest"></a>
## CreateRoleRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **roleRequestBody** | [**RoleRequestBody**](RoleRequestBody.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## deleteRole

> void deleteRole(DeleteRoleRequest)

Delete role

Deletes a role using its ID. The user needs appropriate permissions to successfully call this operation.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.account.management.Configuration;
import com.thousandeyes.sdk.account.management.authentication.*;
import com.thousandeyes.sdk.account.management.administrative.model.*;
import com.thousandeyes.sdk.account.management.administrative.RolesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        RolesApi apiInstance = new RolesApi(defaultClient);
        String id = "23"; // String | The ID of the desired role.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            RolesApi.DeleteRoleRequest request = RolesApi.DeleteRoleRequest.builder()
                .id(id)
                .aid(aid)
                .build();
            apiInstance.deleteRole(request);
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#deleteRole");
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
| request | [**DeleteRoleRequest**](RolesApi.md#DeleteRoleRequest)|-|-|

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

## deleteRoleWithHttpInfo

> ApiResponse<Void> deleteRole deleteRoleWithHttpInfo(DeleteRoleRequest)

Delete role

Deletes a role using its ID. The user needs appropriate permissions to successfully call this operation.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.account.management.Configuration;
import com.thousandeyes.sdk.account.management.authentication.*;
import com.thousandeyes.sdk.account.management.administrative.model.*;
import com.thousandeyes.sdk.account.management.administrative.RolesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        RolesApi apiInstance = new RolesApi(defaultClient);
        String id = "23"; // String | The ID of the desired role.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            RolesApi.DeleteRoleRequest request = RolesApi.DeleteRoleRequest.builder()
                .id(id)
                .aid(aid)
                .build();
            ApiResponse<Void> response = apiInstance.deleteRoleWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#deleteRole");
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
| request | [**DeleteRoleRequest**](RolesApi.md#DeleteRoleRequest)|-|-|

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


<a id="DeleteRoleRequest"></a>
## DeleteRoleRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **id** | **String** | The ID of the desired role. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getRole

> RoleDetail getRole(GetRoleRequest)

Retrieve role

Returns detailed information about a role using its ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.account.management.Configuration;
import com.thousandeyes.sdk.account.management.authentication.*;
import com.thousandeyes.sdk.account.management.administrative.model.*;
import com.thousandeyes.sdk.account.management.administrative.RolesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        RolesApi apiInstance = new RolesApi(defaultClient);
        String id = "23"; // String | The ID of the desired role.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            RolesApi.GetRoleRequest request = RolesApi.GetRoleRequest.builder()
                .id(id)
                .aid(aid)
                .build();
            RoleDetail result = apiInstance.getRole(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#getRole");
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
| request | [**GetRoleRequest**](RolesApi.md#GetRoleRequest)|-|-|

### Return type

[**RoleDetail**](RoleDetail.md)


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

## getRoleWithHttpInfo

> ApiResponse<RoleDetail> getRole getRoleWithHttpInfo(GetRoleRequest)

Retrieve role

Returns detailed information about a role using its ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.account.management.Configuration;
import com.thousandeyes.sdk.account.management.authentication.*;
import com.thousandeyes.sdk.account.management.administrative.model.*;
import com.thousandeyes.sdk.account.management.administrative.RolesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        RolesApi apiInstance = new RolesApi(defaultClient);
        String id = "23"; // String | The ID of the desired role.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            RolesApi.GetRoleRequest request = RolesApi.GetRoleRequest.builder()
                .id(id)
                .aid(aid)
                .build();
            ApiResponse<RoleDetail> response = apiInstance.getRoleWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#getRole");
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
| request | [**GetRoleRequest**](RolesApi.md#GetRoleRequest)|-|-|

### Return type

ApiResponse<[**RoleDetail**](RoleDetail.md)>


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


<a id="GetRoleRequest"></a>
## GetRoleRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **id** | **String** | The ID of the desired role. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getRoles

> Roles getRoles(GetRolesRequest)

List roles

Retrieves a list of defined roles visible to the current user.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.account.management.Configuration;
import com.thousandeyes.sdk.account.management.authentication.*;
import com.thousandeyes.sdk.account.management.administrative.model.*;
import com.thousandeyes.sdk.account.management.administrative.RolesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        RolesApi apiInstance = new RolesApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            RolesApi.GetRolesRequest request = RolesApi.GetRolesRequest.builder()
                .aid(aid)
                .build();
            Roles result = apiInstance.getRoles(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#getRoles");
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
| request | [**GetRolesRequest**](RolesApi.md#GetRolesRequest)|-|-|

### Return type

[**Roles**](Roles.md)


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

## getRolesWithHttpInfo

> ApiResponse<Roles> getRoles getRolesWithHttpInfo(GetRolesRequest)

List roles

Retrieves a list of defined roles visible to the current user.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.account.management.Configuration;
import com.thousandeyes.sdk.account.management.authentication.*;
import com.thousandeyes.sdk.account.management.administrative.model.*;
import com.thousandeyes.sdk.account.management.administrative.RolesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        RolesApi apiInstance = new RolesApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            RolesApi.GetRolesRequest request = RolesApi.GetRolesRequest.builder()
                .aid(aid)
                .build();
            ApiResponse<Roles> response = apiInstance.getRolesWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#getRoles");
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
| request | [**GetRolesRequest**](RolesApi.md#GetRolesRequest)|-|-|

### Return type

ApiResponse<[**Roles**](Roles.md)>


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


<a id="GetRolesRequest"></a>
## GetRolesRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## updateRole

> RoleDetail updateRole(UpdateRoleRequest)

Update role

Updates a user-defined role using its ID.  When updating a role, the following applies:  * The full list of permissions must be sent, This operation does not support delta-based grant or revoking of permissions.  * Permission definitions and details can be obtained from the Permissions operation.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.account.management.Configuration;
import com.thousandeyes.sdk.account.management.authentication.*;
import com.thousandeyes.sdk.account.management.administrative.model.*;
import com.thousandeyes.sdk.account.management.administrative.RolesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        RolesApi apiInstance = new RolesApi(defaultClient);
        String id = "23"; // String | The ID of the desired role.
        RoleRequestBody roleRequestBody = new RoleRequestBody(); // RoleRequestBody | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            RolesApi.UpdateRoleRequest request = RolesApi.UpdateRoleRequest.builder()
                .id(id)
                .roleRequestBody(roleRequestBody)
                .aid(aid)
                .build();
            RoleDetail result = apiInstance.updateRole(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#updateRole");
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
| request | [**UpdateRoleRequest**](RolesApi.md#UpdateRoleRequest)|-|-|

### Return type

[**RoleDetail**](RoleDetail.md)


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

## updateRoleWithHttpInfo

> ApiResponse<RoleDetail> updateRole updateRoleWithHttpInfo(UpdateRoleRequest)

Update role

Updates a user-defined role using its ID.  When updating a role, the following applies:  * The full list of permissions must be sent, This operation does not support delta-based grant or revoking of permissions.  * Permission definitions and details can be obtained from the Permissions operation.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.account.management.Configuration;
import com.thousandeyes.sdk.account.management.authentication.*;
import com.thousandeyes.sdk.account.management.administrative.model.*;
import com.thousandeyes.sdk.account.management.administrative.RolesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        RolesApi apiInstance = new RolesApi(defaultClient);
        String id = "23"; // String | The ID of the desired role.
        RoleRequestBody roleRequestBody = new RoleRequestBody(); // RoleRequestBody | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            RolesApi.UpdateRoleRequest request = RolesApi.UpdateRoleRequest.builder()
                .id(id)
                .roleRequestBody(roleRequestBody)
                .aid(aid)
                .build();
            ApiResponse<RoleDetail> response = apiInstance.updateRoleWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#updateRole");
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
| request | [**UpdateRoleRequest**](RolesApi.md#UpdateRoleRequest)|-|-|

### Return type

ApiResponse<[**RoleDetail**](RoleDetail.md)>


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


<a id="UpdateRoleRequest"></a>
## UpdateRoleRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **id** | **String** | The ID of the desired role. | |
| **roleRequestBody** | [**RoleRequestBody**](RoleRequestBody.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |


