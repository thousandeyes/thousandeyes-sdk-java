# RolesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRole**](RolesApi.md#createRole) | **POST** /v7/roles | Create role |
| [**deleteRole**](RolesApi.md#deleteRole) | **DELETE** /v7/roles/{id} | Delete role |
| [**getRole**](RolesApi.md#getRole) | **GET** /v7/roles/{id} | Retrieve role |
| [**getRoles**](RolesApi.md#getRoles) | **GET** /v7/roles | List roles |
| [**updateRole**](RolesApi.md#updateRole) | **PUT** /v7/roles/{id} | Update role |


<a id="createRole"></a>
# **createRole**
> CreateRole201Response createRole(roleRequestBody, aid)

Create role

Creates a new role.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RolesApi apiInstance = new RolesApi(defaultClient);
    RoleRequestBody roleRequestBody = new RoleRequestBody(); // RoleRequestBody | 
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      CreateRole201Response result = apiInstance.createRole(roleRequestBody, aid);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **roleRequestBody** | [**RoleRequestBody**](RoleRequestBody.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**CreateRole201Response**](CreateRole201Response.md)

### Authorization

No authorization required

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

<a id="deleteRole"></a>
# **deleteRole**
> deleteRole(id, aid)

Delete role

Deletes a role using its ID. The user needs appropriate permissions to successfully call this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RolesApi apiInstance = new RolesApi(defaultClient);
    String id = "23"; // String | The ID of the desired role.
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      apiInstance.deleteRole(id, aid);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the desired role. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

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
| **204** | No content |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |

<a id="getRole"></a>
# **getRole**
> CreateRole201Response getRole(id, aid)

Retrieve role

Returns detailed information about a role using its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RolesApi apiInstance = new RolesApi(defaultClient);
    String id = "23"; // String | The ID of the desired role.
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      CreateRole201Response result = apiInstance.getRole(id, aid);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the desired role. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**CreateRole201Response**](CreateRole201Response.md)

### Authorization

No authorization required

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

<a id="getRoles"></a>
# **getRoles**
> GetRoles200Response getRoles(aid)

List roles

Retrieves a list of defined roles visible to the current user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RolesApi apiInstance = new RolesApi(defaultClient);
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      GetRoles200Response result = apiInstance.getRoles(aid);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**GetRoles200Response**](GetRoles200Response.md)

### Authorization

No authorization required

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

<a id="updateRole"></a>
# **updateRole**
> CreateRole201Response updateRole(id, roleRequestBody, aid)

Update role

Updates a user-defined role using its ID.  When updating a role, the following applies:  * The full list of permissions must be sent, This endpoint does not support delta-based grant or revoking of permissions.  * Permission definitions and details can be obtained from the Permissions endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RolesApi apiInstance = new RolesApi(defaultClient);
    String id = "23"; // String | The ID of the desired role.
    RoleRequestBody roleRequestBody = new RoleRequestBody(); // RoleRequestBody | 
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      CreateRole201Response result = apiInstance.updateRole(id, roleRequestBody, aid);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the desired role. | |
| **roleRequestBody** | [**RoleRequestBody**](RoleRequestBody.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**CreateRole201Response**](CreateRole201Response.md)

### Authorization

No authorization required

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

