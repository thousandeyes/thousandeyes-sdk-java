# QuotasApi

All URIs are relative to *https://api.thousandeyes.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignOrganizationsAccountGroupsQuotas**](QuotasApi.md#assignOrganizationsAccountGroupsQuotas) | **POST** /v7/quotas/account-groups/assign | Create or update accout group quotas |
| [**assignOrganizationsAccountGroupsQuotasWithHttpInfo**](QuotasApi.md#assignOrganizationsAccountGroupsQuotasWithHttpInfo) | **POST** /v7/quotas/account-groups/assign | Create or update accout group quotas |
| [**assignOrganizationsQuotas**](QuotasApi.md#assignOrganizationsQuotas) | **POST** /v7/quotas/assign | Create or update organizations quotas |
| [**assignOrganizationsQuotasWithHttpInfo**](QuotasApi.md#assignOrganizationsQuotasWithHttpInfo) | **POST** /v7/quotas/assign | Create or update organizations quotas |
| [**getQuotas**](QuotasApi.md#getQuotas) | **GET** /v7/quotas | Get organization and account group usage quota |
| [**getQuotasWithHttpInfo**](QuotasApi.md#getQuotasWithHttpInfo) | **GET** /v7/quotas | Get organization and account group usage quota |
| [**unassignOrganizationsAccountGroupsQuotas**](QuotasApi.md#unassignOrganizationsAccountGroupsQuotas) | **POST** /v7/quotas/account-groups/unassign | Remove account group quotas from organizations |
| [**unassignOrganizationsAccountGroupsQuotasWithHttpInfo**](QuotasApi.md#unassignOrganizationsAccountGroupsQuotasWithHttpInfo) | **POST** /v7/quotas/account-groups/unassign | Remove account group quotas from organizations |
| [**unassignOrganizationsQuotas**](QuotasApi.md#unassignOrganizationsQuotas) | **POST** /v7/quotas/unassign | Remove organization quotas |
| [**unassignOrganizationsQuotasWithHttpInfo**](QuotasApi.md#unassignOrganizationsQuotasWithHttpInfo) | **POST** /v7/quotas/unassign | Remove organization quotas |



## assignOrganizationsAccountGroupsQuotas

> OrganizationsQuotasAssign assignOrganizationsAccountGroupsQuotas(organizationsQuotasAssign)

Create or update accout group quotas

This endpoint assigns quota values to multiple account groups across multiple organizations. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission. This endpoint follows a cumulative behavior––This means that the quotas are assigned to the designated account groups, and any previous assignments remain in place without any unassignment occurring.

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.Configuration;
import com.thousandeyes.api.authentication.*;
import com.thousandeyes.api.models.*;
import com.thousandeyes.api.usage.QuotasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        QuotasApi apiInstance = new QuotasApi(defaultClient);
        OrganizationsQuotasAssign organizationsQuotasAssign = new OrganizationsQuotasAssign(); // OrganizationsQuotasAssign | 
        try {
            OrganizationsQuotasAssign result = apiInstance.assignOrganizationsAccountGroupsQuotas(organizationsQuotasAssign);
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
| **organizationsQuotasAssign** | [**OrganizationsQuotasAssign**](OrganizationsQuotasAssign.md)|  | [optional] |

### Return type

[**OrganizationsQuotasAssign**](OrganizationsQuotasAssign.md)


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

## assignOrganizationsAccountGroupsQuotasWithHttpInfo

> ApiResponse<OrganizationsQuotasAssign> assignOrganizationsAccountGroupsQuotas assignOrganizationsAccountGroupsQuotasWithHttpInfo(organizationsQuotasAssign)

Create or update accout group quotas

This endpoint assigns quota values to multiple account groups across multiple organizations. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission. This endpoint follows a cumulative behavior––This means that the quotas are assigned to the designated account groups, and any previous assignments remain in place without any unassignment occurring.

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.common.ApiResponse;
import com.thousandeyes.api.Configuration;
import com.thousandeyes.api.authentication.*;
import com.thousandeyes.api.models.*;
import com.thousandeyes.api.usage.QuotasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        QuotasApi apiInstance = new QuotasApi(defaultClient);
        OrganizationsQuotasAssign organizationsQuotasAssign = new OrganizationsQuotasAssign(); // OrganizationsQuotasAssign | 
        try {
            ApiResponse<OrganizationsQuotasAssign> response = apiInstance.assignOrganizationsAccountGroupsQuotasWithHttpInfo(organizationsQuotasAssign);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling QuotasApi#assignOrganizationsAccountGroupsQuotas");
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
| **organizationsQuotasAssign** | [**OrganizationsQuotasAssign**](OrganizationsQuotasAssign.md)|  | [optional] |

### Return type

ApiResponse<[**OrganizationsQuotasAssign**](OrganizationsQuotasAssign.md)>


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


## assignOrganizationsQuotas

> QuotasAssignResponse assignOrganizationsQuotas(quotasAssignRequest)

Create or update organizations quotas

This endpoint recieves a list of organization quotas to create or update. If there&#39;s no specific &#x60;orgId&#x60; defined for a quota, it defaults to using the authenticated organization. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission. This endpoint follows cumulative behavior––This means that the quotas are assigned to the specified organizations, and any previous assignments remain unchanged; no unassignments occur.

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.Configuration;
import com.thousandeyes.api.authentication.*;
import com.thousandeyes.api.models.*;
import com.thousandeyes.api.usage.QuotasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        QuotasApi apiInstance = new QuotasApi(defaultClient);
        QuotasAssignRequest quotasAssignRequest = new QuotasAssignRequest(); // QuotasAssignRequest | 
        try {
            QuotasAssignResponse result = apiInstance.assignOrganizationsQuotas(quotasAssignRequest);
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
| **quotasAssignRequest** | [**QuotasAssignRequest**](QuotasAssignRequest.md)|  | [optional] |

### Return type

[**QuotasAssignResponse**](QuotasAssignResponse.md)


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

## assignOrganizationsQuotasWithHttpInfo

> ApiResponse<QuotasAssignResponse> assignOrganizationsQuotas assignOrganizationsQuotasWithHttpInfo(quotasAssignRequest)

Create or update organizations quotas

This endpoint recieves a list of organization quotas to create or update. If there&#39;s no specific &#x60;orgId&#x60; defined for a quota, it defaults to using the authenticated organization. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission. This endpoint follows cumulative behavior––This means that the quotas are assigned to the specified organizations, and any previous assignments remain unchanged; no unassignments occur.

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.common.ApiResponse;
import com.thousandeyes.api.Configuration;
import com.thousandeyes.api.authentication.*;
import com.thousandeyes.api.models.*;
import com.thousandeyes.api.usage.QuotasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        QuotasApi apiInstance = new QuotasApi(defaultClient);
        QuotasAssignRequest quotasAssignRequest = new QuotasAssignRequest(); // QuotasAssignRequest | 
        try {
            ApiResponse<QuotasAssignResponse> response = apiInstance.assignOrganizationsQuotasWithHttpInfo(quotasAssignRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling QuotasApi#assignOrganizationsQuotas");
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
| **quotasAssignRequest** | [**QuotasAssignRequest**](QuotasAssignRequest.md)|  | [optional] |

### Return type

ApiResponse<[**QuotasAssignResponse**](QuotasAssignResponse.md)>


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


## getQuotas

> Quotas getQuotas()

Get organization and account group usage quota

This endpoint retrieves usage quotas for both organization and account groups. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission. If a user has quota update permission in multiple organizations, the API returns data from all such organizations.

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.Configuration;
import com.thousandeyes.api.authentication.*;
import com.thousandeyes.api.models.*;
import com.thousandeyes.api.usage.QuotasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        QuotasApi apiInstance = new QuotasApi(defaultClient);
        try {
            Quotas result = apiInstance.getQuotas();
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

[**Quotas**](Quotas.md)


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

## getQuotasWithHttpInfo

> ApiResponse<Quotas> getQuotas getQuotasWithHttpInfo()

Get organization and account group usage quota

This endpoint retrieves usage quotas for both organization and account groups. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission. If a user has quota update permission in multiple organizations, the API returns data from all such organizations.

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.common.ApiResponse;
import com.thousandeyes.api.Configuration;
import com.thousandeyes.api.authentication.*;
import com.thousandeyes.api.models.*;
import com.thousandeyes.api.usage.QuotasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        QuotasApi apiInstance = new QuotasApi(defaultClient);
        try {
            ApiResponse<Quotas> response = apiInstance.getQuotasWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling QuotasApi#getQuotas");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**Quotas**](Quotas.md)>


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


## unassignOrganizationsAccountGroupsQuotas

> void unassignOrganizationsAccountGroupsQuotas(organizationsQuotasUnassign)

Remove account group quotas from organizations

This endpoint removes quotas from multiple account groups across multiple organizations. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission.

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.Configuration;
import com.thousandeyes.api.authentication.*;
import com.thousandeyes.api.models.*;
import com.thousandeyes.api.usage.QuotasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        QuotasApi apiInstance = new QuotasApi(defaultClient);
        OrganizationsQuotasUnassign organizationsQuotasUnassign = new OrganizationsQuotasUnassign(); // OrganizationsQuotasUnassign | 
        try {
            apiInstance.unassignOrganizationsAccountGroupsQuotas(organizationsQuotasUnassign);
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

## unassignOrganizationsAccountGroupsQuotasWithHttpInfo

> ApiResponse<Void> unassignOrganizationsAccountGroupsQuotas unassignOrganizationsAccountGroupsQuotasWithHttpInfo(organizationsQuotasUnassign)

Remove account group quotas from organizations

This endpoint removes quotas from multiple account groups across multiple organizations. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission.

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.common.ApiResponse;
import com.thousandeyes.api.Configuration;
import com.thousandeyes.api.authentication.*;
import com.thousandeyes.api.models.*;
import com.thousandeyes.api.usage.QuotasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        QuotasApi apiInstance = new QuotasApi(defaultClient);
        OrganizationsQuotasUnassign organizationsQuotasUnassign = new OrganizationsQuotasUnassign(); // OrganizationsQuotasUnassign | 
        try {
            ApiResponse<Void> response = apiInstance.unassignOrganizationsAccountGroupsQuotasWithHttpInfo(organizationsQuotasUnassign);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling QuotasApi#unassignOrganizationsAccountGroupsQuotas");
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
| **organizationsQuotasUnassign** | [**OrganizationsQuotasUnassign**](OrganizationsQuotasUnassign.md)|  | [optional] |

### Return type


ApiResponse<Void>

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


## unassignOrganizationsQuotas

> void unassignOrganizationsQuotas(quotasUnassign)

Remove organization quotas

This endpoint recieves a list of organization IDs to remove their current quota. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission.

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.Configuration;
import com.thousandeyes.api.authentication.*;
import com.thousandeyes.api.models.*;
import com.thousandeyes.api.usage.QuotasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        QuotasApi apiInstance = new QuotasApi(defaultClient);
        QuotasUnassign quotasUnassign = new QuotasUnassign(); // QuotasUnassign | 
        try {
            apiInstance.unassignOrganizationsQuotas(quotasUnassign);
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

## unassignOrganizationsQuotasWithHttpInfo

> ApiResponse<Void> unassignOrganizationsQuotas unassignOrganizationsQuotasWithHttpInfo(quotasUnassign)

Remove organization quotas

This endpoint recieves a list of organization IDs to remove their current quota. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission.

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.common.ApiResponse;
import com.thousandeyes.api.Configuration;
import com.thousandeyes.api.authentication.*;
import com.thousandeyes.api.models.*;
import com.thousandeyes.api.usage.QuotasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        QuotasApi apiInstance = new QuotasApi(defaultClient);
        QuotasUnassign quotasUnassign = new QuotasUnassign(); // QuotasUnassign | 
        try {
            ApiResponse<Void> response = apiInstance.unassignOrganizationsQuotasWithHttpInfo(quotasUnassign);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling QuotasApi#unassignOrganizationsQuotas");
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
| **quotasUnassign** | [**QuotasUnassign**](QuotasUnassign.md)|  | [optional] |

### Return type


ApiResponse<Void>

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

