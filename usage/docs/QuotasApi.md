# QuotasApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignOrganizationsAccountGroupsQuotas**](QuotasApi.md#assignOrganizationsAccountGroupsQuotas) | **POST** /quotas/account-groups/assign | Create or update accout group quotas |
| [**assignOrganizationsAccountGroupsQuotasWithHttpInfo**](QuotasApi.md#assignOrganizationsAccountGroupsQuotasWithHttpInfo) | **POST** /quotas/account-groups/assign | Create or update accout group quotas |
| [**assignOrganizationsQuotas**](QuotasApi.md#assignOrganizationsQuotas) | **POST** /quotas/assign | Create or update organizations quotas |
| [**assignOrganizationsQuotasWithHttpInfo**](QuotasApi.md#assignOrganizationsQuotasWithHttpInfo) | **POST** /quotas/assign | Create or update organizations quotas |
| [**getQuotas**](QuotasApi.md#getQuotas) | **GET** /quotas | Get organization and account group usage quota |
| [**getQuotasWithHttpInfo**](QuotasApi.md#getQuotasWithHttpInfo) | **GET** /quotas | Get organization and account group usage quota |
| [**unassignOrganizationsAccountGroupsQuotas**](QuotasApi.md#unassignOrganizationsAccountGroupsQuotas) | **POST** /quotas/account-groups/unassign | Remove account group quotas from organizations |
| [**unassignOrganizationsAccountGroupsQuotasWithHttpInfo**](QuotasApi.md#unassignOrganizationsAccountGroupsQuotasWithHttpInfo) | **POST** /quotas/account-groups/unassign | Remove account group quotas from organizations |
| [**unassignOrganizationsQuotas**](QuotasApi.md#unassignOrganizationsQuotas) | **POST** /quotas/unassign | Remove organization quotas |
| [**unassignOrganizationsQuotasWithHttpInfo**](QuotasApi.md#unassignOrganizationsQuotasWithHttpInfo) | **POST** /quotas/unassign | Remove organization quotas |



## assignOrganizationsAccountGroupsQuotas

> OrganizationsQuotasAssign assignOrganizationsAccountGroupsQuotas(AssignOrganizationsAccountGroupsQuotasRequest)

Create or update accout group quotas

This operation assigns quota values to multiple account groups across multiple organizations. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission. This operation follows a cumulative behavior––This means that the quotas are assigned to the designated account groups, and any previous assignments remain in place without any unassignment occurring.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.usage.model.*;
import com.thousandeyes.sdk.usage.QuotasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        QuotasApi apiInstance = new QuotasApi(defaultClient);
        OrganizationsQuotasAssign organizationsQuotasAssign = new OrganizationsQuotasAssign(); // OrganizationsQuotasAssign | 
        try {
            QuotasApi.AssignOrganizationsAccountGroupsQuotasRequest request = QuotasApi.AssignOrganizationsAccountGroupsQuotasRequest.builder()
                .organizationsQuotasAssign(organizationsQuotasAssign)
                .build();
            OrganizationsQuotasAssign result = apiInstance.assignOrganizationsAccountGroupsQuotas(request);
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

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| request | [**AssignOrganizationsAccountGroupsQuotasRequest**](QuotasApi.md#AssignOrganizationsAccountGroupsQuotasRequest)|-|-|

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

> ApiResponse<OrganizationsQuotasAssign> assignOrganizationsAccountGroupsQuotas assignOrganizationsAccountGroupsQuotasWithHttpInfo(AssignOrganizationsAccountGroupsQuotasRequest)

Create or update accout group quotas

This operation assigns quota values to multiple account groups across multiple organizations. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission. This operation follows a cumulative behavior––This means that the quotas are assigned to the designated account groups, and any previous assignments remain in place without any unassignment occurring.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.usage.model.*;
import com.thousandeyes.sdk.usage.QuotasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        QuotasApi apiInstance = new QuotasApi(defaultClient);
        OrganizationsQuotasAssign organizationsQuotasAssign = new OrganizationsQuotasAssign(); // OrganizationsQuotasAssign | 
        try {
            QuotasApi.AssignOrganizationsAccountGroupsQuotasRequest request = QuotasApi.AssignOrganizationsAccountGroupsQuotasRequest.builder()
                .organizationsQuotasAssign(organizationsQuotasAssign)
                .build();
            ApiResponse<OrganizationsQuotasAssign> response = apiInstance.assignOrganizationsAccountGroupsQuotasWithHttpInfo(request);
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

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| request | [**AssignOrganizationsAccountGroupsQuotasRequest**](QuotasApi.md#AssignOrganizationsAccountGroupsQuotasRequest)|-|-|

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


<a id="AssignOrganizationsAccountGroupsQuotasRequest"></a>
## AssignOrganizationsAccountGroupsQuotasRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **organizationsQuotasAssign** | [**OrganizationsQuotasAssign**](OrganizationsQuotasAssign.md) |  | [optional] |



## assignOrganizationsQuotas

> QuotasAssignResponse assignOrganizationsQuotas(AssignOrganizationsQuotasRequest)

Create or update organizations quotas

This operation recieves a list of organization quotas to create or update. If there&#39;s no specific &#x60;orgId&#x60; defined for a quota, it defaults to using the authenticated organization. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission. This operation follows cumulative behavior––This means that the quotas are assigned to the specified organizations, and any previous assignments remain unchanged; no unassignments occur.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.usage.model.*;
import com.thousandeyes.sdk.usage.QuotasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        QuotasApi apiInstance = new QuotasApi(defaultClient);
        QuotasAssignRequest quotasAssignRequest = new QuotasAssignRequest(); // QuotasAssignRequest | 
        try {
            QuotasApi.AssignOrganizationsQuotasRequest request = QuotasApi.AssignOrganizationsQuotasRequest.builder()
                .quotasAssignRequest(quotasAssignRequest)
                .build();
            QuotasAssignResponse result = apiInstance.assignOrganizationsQuotas(request);
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

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| request | [**AssignOrganizationsQuotasRequest**](QuotasApi.md#AssignOrganizationsQuotasRequest)|-|-|

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

> ApiResponse<QuotasAssignResponse> assignOrganizationsQuotas assignOrganizationsQuotasWithHttpInfo(AssignOrganizationsQuotasRequest)

Create or update organizations quotas

This operation recieves a list of organization quotas to create or update. If there&#39;s no specific &#x60;orgId&#x60; defined for a quota, it defaults to using the authenticated organization. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission. This operation follows cumulative behavior––This means that the quotas are assigned to the specified organizations, and any previous assignments remain unchanged; no unassignments occur.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.usage.model.*;
import com.thousandeyes.sdk.usage.QuotasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        QuotasApi apiInstance = new QuotasApi(defaultClient);
        QuotasAssignRequest quotasAssignRequest = new QuotasAssignRequest(); // QuotasAssignRequest | 
        try {
            QuotasApi.AssignOrganizationsQuotasRequest request = QuotasApi.AssignOrganizationsQuotasRequest.builder()
                .quotasAssignRequest(quotasAssignRequest)
                .build();
            ApiResponse<QuotasAssignResponse> response = apiInstance.assignOrganizationsQuotasWithHttpInfo(request);
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

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| request | [**AssignOrganizationsQuotasRequest**](QuotasApi.md#AssignOrganizationsQuotasRequest)|-|-|

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


<a id="AssignOrganizationsQuotasRequest"></a>
## AssignOrganizationsQuotasRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **quotasAssignRequest** | [**QuotasAssignRequest**](QuotasAssignRequest.md) |  | [optional] |



## getQuotas

> Quotas getQuotas()

Get organization and account group usage quota

This operation retrieves usage quotas for both organization and account groups. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission. If a user has quota update permission in multiple organizations, the API returns data from all such organizations.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.usage.model.*;
import com.thousandeyes.sdk.usage.QuotasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
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

This operation retrieves usage quotas for both organization and account groups. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission. If a user has quota update permission in multiple organizations, the API returns data from all such organizations.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.usage.model.*;
import com.thousandeyes.sdk.usage.QuotasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
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

> void unassignOrganizationsAccountGroupsQuotas(UnassignOrganizationsAccountGroupsQuotasRequest)

Remove account group quotas from organizations

This operation removes quotas from multiple account groups across multiple organizations. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.usage.model.*;
import com.thousandeyes.sdk.usage.QuotasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        QuotasApi apiInstance = new QuotasApi(defaultClient);
        OrganizationsQuotasUnassign organizationsQuotasUnassign = new OrganizationsQuotasUnassign(); // OrganizationsQuotasUnassign | 
        try {
            QuotasApi.UnassignOrganizationsAccountGroupsQuotasRequest request = QuotasApi.UnassignOrganizationsAccountGroupsQuotasRequest.builder()
                .organizationsQuotasUnassign(organizationsQuotasUnassign)
                .build();
            apiInstance.unassignOrganizationsAccountGroupsQuotas(request);
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

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| request | [**UnassignOrganizationsAccountGroupsQuotasRequest**](QuotasApi.md#UnassignOrganizationsAccountGroupsQuotasRequest)|-|-|

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

> ApiResponse<Void> unassignOrganizationsAccountGroupsQuotas unassignOrganizationsAccountGroupsQuotasWithHttpInfo(UnassignOrganizationsAccountGroupsQuotasRequest)

Remove account group quotas from organizations

This operation removes quotas from multiple account groups across multiple organizations. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.usage.model.*;
import com.thousandeyes.sdk.usage.QuotasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        QuotasApi apiInstance = new QuotasApi(defaultClient);
        OrganizationsQuotasUnassign organizationsQuotasUnassign = new OrganizationsQuotasUnassign(); // OrganizationsQuotasUnassign | 
        try {
            QuotasApi.UnassignOrganizationsAccountGroupsQuotasRequest request = QuotasApi.UnassignOrganizationsAccountGroupsQuotasRequest.builder()
                .organizationsQuotasUnassign(organizationsQuotasUnassign)
                .build();
            ApiResponse<Void> response = apiInstance.unassignOrganizationsAccountGroupsQuotasWithHttpInfo(request);
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

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| request | [**UnassignOrganizationsAccountGroupsQuotasRequest**](QuotasApi.md#UnassignOrganizationsAccountGroupsQuotasRequest)|-|-|

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


<a id="UnassignOrganizationsAccountGroupsQuotasRequest"></a>
## UnassignOrganizationsAccountGroupsQuotasRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **organizationsQuotasUnassign** | [**OrganizationsQuotasUnassign**](OrganizationsQuotasUnassign.md) |  | [optional] |



## unassignOrganizationsQuotas

> void unassignOrganizationsQuotas(UnassignOrganizationsQuotasRequest)

Remove organization quotas

This operation recieves a list of organization IDs to remove their current quota. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.usage.model.*;
import com.thousandeyes.sdk.usage.QuotasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        QuotasApi apiInstance = new QuotasApi(defaultClient);
        QuotasUnassign quotasUnassign = new QuotasUnassign(); // QuotasUnassign | 
        try {
            QuotasApi.UnassignOrganizationsQuotasRequest request = QuotasApi.UnassignOrganizationsQuotasRequest.builder()
                .quotasUnassign(quotasUnassign)
                .build();
            apiInstance.unassignOrganizationsQuotas(request);
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

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| request | [**UnassignOrganizationsQuotasRequest**](QuotasApi.md#UnassignOrganizationsQuotasRequest)|-|-|

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

> ApiResponse<Void> unassignOrganizationsQuotas unassignOrganizationsQuotasWithHttpInfo(UnassignOrganizationsQuotasRequest)

Remove organization quotas

This operation recieves a list of organization IDs to remove their current quota. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.usage.model.*;
import com.thousandeyes.sdk.usage.QuotasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        QuotasApi apiInstance = new QuotasApi(defaultClient);
        QuotasUnassign quotasUnassign = new QuotasUnassign(); // QuotasUnassign | 
        try {
            QuotasApi.UnassignOrganizationsQuotasRequest request = QuotasApi.UnassignOrganizationsQuotasRequest.builder()
                .quotasUnassign(quotasUnassign)
                .build();
            ApiResponse<Void> response = apiInstance.unassignOrganizationsQuotasWithHttpInfo(request);
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

|    Name      |    Type       | Description   |     Notes    |
|------------- | ------------- | ------------- | -------------|
| request | [**UnassignOrganizationsQuotasRequest**](QuotasApi.md#UnassignOrganizationsQuotasRequest)|-|-|

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


<a id="UnassignOrganizationsQuotasRequest"></a>
## UnassignOrganizationsQuotasRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **quotasUnassign** | [**QuotasUnassign**](QuotasUnassign.md) |  | [optional] |


