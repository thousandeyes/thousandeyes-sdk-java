# QuotasApi

All URIs are relative to *https://api.thousandeyes.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignOrganizationsAccountGroupsQuotas**](QuotasApi.md#assignOrganizationsAccountGroupsQuotas) | **POST** /v7/quotas/account-groups/assign | Create or update accout group quotas |
| [**assignOrganizationsQuotas**](QuotasApi.md#assignOrganizationsQuotas) | **POST** /v7/quotas/assign | Create or update organizations quotas |
| [**getQuotas**](QuotasApi.md#getQuotas) | **GET** /v7/quotas | Get organization and account group usage quota |
| [**unassignOrganizationsAccountGroupsQuotas**](QuotasApi.md#unassignOrganizationsAccountGroupsQuotas) | **POST** /v7/quotas/account-groups/unassign | Remove account group quotas from organizations |
| [**unassignOrganizationsQuotas**](QuotasApi.md#unassignOrganizationsQuotas) | **POST** /v7/quotas/unassign | Remove organization quotas |


<a id="assignOrganizationsAccountGroupsQuotas"></a>
# **assignOrganizationsAccountGroupsQuotas**
> OrganizationsQuotasAssign assignOrganizationsAccountGroupsQuotas(aid, organizationsQuotasAssign)

Create or update accout group quotas

Assigns quota values to multiple account groups from multiple organizations. &#x60;Edit organization and account group quotas&#x60; permission (a management permission) is required. This endpoint has cumulative behavior: The quotas are assigned to the specified account groups, and the previous assignments persist. No unassignment takes place.  This endpoint assigns quota values to multiple account groups across multiple organizations. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission. This endpoint follows a cumulative behavior––This means that the quotas are assigned to the designated account groups, and any previous assignments remain in place without any unassignment occurring.

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.QuotasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    QuotasApi apiInstance = new QuotasApi(defaultClient);
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    OrganizationsQuotasAssign organizationsQuotasAssign = new OrganizationsQuotasAssign(); // OrganizationsQuotasAssign | 
    try {
      OrganizationsQuotasAssign result = apiInstance.assignOrganizationsAccountGroupsQuotas(aid, organizationsQuotasAssign);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotasApi#assignOrganizationsAccountGroupsQuotas");
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
| **organizationsQuotasAssign** | [**OrganizationsQuotasAssign**](OrganizationsQuotasAssign.md)|  | [optional] |

### Return type

[**OrganizationsQuotasAssign**](OrganizationsQuotasAssign.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |

<a id="assignOrganizationsQuotas"></a>
# **assignOrganizationsQuotas**
> QuotasAssignResponse assignOrganizationsQuotas(aid, quotasAssignRequest)

Create or update organizations quotas

This endpoint recieves a list of organization quotas to create or update. If there&#39;s no specific &#x60;orgId&#x60; defined for a quota, it defaults to using the authenticated organization. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission. This endpoint follows cumulative behavior––This means that the quotas are assigned to the specified organizations, and any previous assignments remain unchanged; no unassignments occur.

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.QuotasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    QuotasApi apiInstance = new QuotasApi(defaultClient);
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    QuotasAssignRequest quotasAssignRequest = new QuotasAssignRequest(); // QuotasAssignRequest | 
    try {
      QuotasAssignResponse result = apiInstance.assignOrganizationsQuotas(aid, quotasAssignRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotasApi#assignOrganizationsQuotas");
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
| **quotasAssignRequest** | [**QuotasAssignRequest**](QuotasAssignRequest.md)|  | [optional] |

### Return type

[**QuotasAssignResponse**](QuotasAssignResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |

<a id="getQuotas"></a>
# **getQuotas**
> GetQuotas200Response getQuotas()

Get organization and account group usage quota

This endpoint retrieves usage quotas for both organization and account groups. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission. If a user has quota update permission in multiple organizations, the API returns data from all such organizations.

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.QuotasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    QuotasApi apiInstance = new QuotasApi(defaultClient);
    try {
      GetQuotas200Response result = apiInstance.getQuotas();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotasApi#getQuotas");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetQuotas200Response**](GetQuotas200Response.md)

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

<a id="unassignOrganizationsAccountGroupsQuotas"></a>
# **unassignOrganizationsAccountGroupsQuotas**
> unassignOrganizationsAccountGroupsQuotas(aid, organizationsQuotasUnassign)

Remove account group quotas from organizations

Removes the quotas from multiple account groups from multiple organizations. &#x60;Edit organization and account group quotas&#x60; permission (a management permission) is required. Removes quotas from multiple account groups across multiple organizations. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission.

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.QuotasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    QuotasApi apiInstance = new QuotasApi(defaultClient);
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    OrganizationsQuotasUnassign organizationsQuotasUnassign = new OrganizationsQuotasUnassign(); // OrganizationsQuotasUnassign | 
    try {
      apiInstance.unassignOrganizationsAccountGroupsQuotas(aid, organizationsQuotasUnassign);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotasApi#unassignOrganizationsAccountGroupsQuotas");
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
| **organizationsQuotasUnassign** | [**OrganizationsQuotasUnassign**](OrganizationsQuotasUnassign.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

<a id="unassignOrganizationsQuotas"></a>
# **unassignOrganizationsQuotas**
> unassignOrganizationsQuotas(aid, quotasUnassign)

Remove organization quotas

This endpoint recieves a list of organization IDs to remove their current quota. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission.

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.QuotasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    QuotasApi apiInstance = new QuotasApi(defaultClient);
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    QuotasUnassign quotasUnassign = new QuotasUnassign(); // QuotasUnassign | 
    try {
      apiInstance.unassignOrganizationsQuotas(aid, quotasUnassign);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotasApi#unassignOrganizationsQuotas");
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
| **quotasUnassign** | [**QuotasUnassign**](QuotasUnassign.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

