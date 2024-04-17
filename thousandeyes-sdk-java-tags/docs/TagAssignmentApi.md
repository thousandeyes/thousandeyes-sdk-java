# TagAssignmentApi

All URIs are relative to *https://api.thousandeyes.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignTag**](TagAssignmentApi.md#assignTag) | **POST** /v7/tags/{id}/assign | Assign tag to multiple objects |
| [**assignTagWithHttpInfo**](TagAssignmentApi.md#assignTagWithHttpInfo) | **POST** /v7/tags/{id}/assign | Assign tag to multiple objects |
| [**bulkAssignTag**](TagAssignmentApi.md#bulkAssignTag) | **POST** /v7/tags/assign | Assign multiple tags to multiple objects |
| [**bulkAssignTagWithHttpInfo**](TagAssignmentApi.md#bulkAssignTagWithHttpInfo) | **POST** /v7/tags/assign | Assign multiple tags to multiple objects |
| [**bulkUnAssignTag**](TagAssignmentApi.md#bulkUnAssignTag) | **POST** /v7/tags/unassign | Remove multiple tags from multiple objects |
| [**bulkUnAssignTagWithHttpInfo**](TagAssignmentApi.md#bulkUnAssignTagWithHttpInfo) | **POST** /v7/tags/unassign | Remove multiple tags from multiple objects |
| [**unassignTag**](TagAssignmentApi.md#unassignTag) | **POST** /v7/tags/{id}/unassign | Remove tag from multiple objects |
| [**unassignTagWithHttpInfo**](TagAssignmentApi.md#unassignTagWithHttpInfo) | **POST** /v7/tags/{id}/unassign | Remove tag from multiple objects |



## assignTag

> BulkTagAssignment assignTag(id, tagAssignment, aid)

Assign tag to multiple objects

Assigns a tag to one or more objects. This endpoint has cumulative behavior: The tag is assigned to the specified objects, and the previous assignments persist. No unassignment takes place.

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.Configuration;
import com.thousandeyes.api.authentication.*;
import com.thousandeyes.api.models.*;
import com.thousandeyes.api.tags.TagAssignmentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TagAssignmentApi apiInstance = new TagAssignmentApi(defaultClient);
        String id = "c6b78e57-81a2-4c5f-a11a-d96c3c664d55"; // String | ID of the tag to associate
        TagAssignment tagAssignment = new TagAssignment(); // TagAssignment | 
        String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            BulkTagAssignment result = apiInstance.assignTag(id, tagAssignment, aid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagAssignmentApi#assignTag");
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
| **id** | **String**| ID of the tag to associate | |
| **tagAssignment** | [**TagAssignment**](TagAssignment.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**BulkTagAssignment**](BulkTagAssignment.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **207** | Assignment created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal Server Error |  -  |

## assignTagWithHttpInfo

> ApiResponse<BulkTagAssignment> assignTag assignTagWithHttpInfo(id, tagAssignment, aid)

Assign tag to multiple objects

Assigns a tag to one or more objects. This endpoint has cumulative behavior: The tag is assigned to the specified objects, and the previous assignments persist. No unassignment takes place.

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.common.ApiResponse;
import com.thousandeyes.api.Configuration;
import com.thousandeyes.api.authentication.*;
import com.thousandeyes.api.models.*;
import com.thousandeyes.api.tags.TagAssignmentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TagAssignmentApi apiInstance = new TagAssignmentApi(defaultClient);
        String id = "c6b78e57-81a2-4c5f-a11a-d96c3c664d55"; // String | ID of the tag to associate
        TagAssignment tagAssignment = new TagAssignment(); // TagAssignment | 
        String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiResponse<BulkTagAssignment> response = apiInstance.assignTagWithHttpInfo(id, tagAssignment, aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TagAssignmentApi#assignTag");
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
| **id** | **String**| ID of the tag to associate | |
| **tagAssignment** | [**TagAssignment**](TagAssignment.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

ApiResponse<[**BulkTagAssignment**](BulkTagAssignment.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **207** | Assignment created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal Server Error |  -  |


## bulkAssignTag

> BulkTagAssignments bulkAssignTag(bulkTagAssignments, aid)

Assign multiple tags to multiple objects

Assigns the specified tags to the specified objects. This endpoint has cumulative behavior: The tags are assigned to the specified objects, and the previous assignments persist. No unassignment takes place.

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.Configuration;
import com.thousandeyes.api.authentication.*;
import com.thousandeyes.api.models.*;
import com.thousandeyes.api.tags.TagAssignmentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TagAssignmentApi apiInstance = new TagAssignmentApi(defaultClient);
        BulkTagAssignments bulkTagAssignments = new BulkTagAssignments(); // BulkTagAssignments | 
        String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            BulkTagAssignments result = apiInstance.bulkAssignTag(bulkTagAssignments, aid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagAssignmentApi#bulkAssignTag");
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
| **bulkTagAssignments** | [**BulkTagAssignments**](BulkTagAssignments.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**BulkTagAssignments**](BulkTagAssignments.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **207** | Item created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal Server Error |  -  |

## bulkAssignTagWithHttpInfo

> ApiResponse<BulkTagAssignments> bulkAssignTag bulkAssignTagWithHttpInfo(bulkTagAssignments, aid)

Assign multiple tags to multiple objects

Assigns the specified tags to the specified objects. This endpoint has cumulative behavior: The tags are assigned to the specified objects, and the previous assignments persist. No unassignment takes place.

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.common.ApiResponse;
import com.thousandeyes.api.Configuration;
import com.thousandeyes.api.authentication.*;
import com.thousandeyes.api.models.*;
import com.thousandeyes.api.tags.TagAssignmentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TagAssignmentApi apiInstance = new TagAssignmentApi(defaultClient);
        BulkTagAssignments bulkTagAssignments = new BulkTagAssignments(); // BulkTagAssignments | 
        String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiResponse<BulkTagAssignments> response = apiInstance.bulkAssignTagWithHttpInfo(bulkTagAssignments, aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TagAssignmentApi#bulkAssignTag");
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
| **bulkTagAssignments** | [**BulkTagAssignments**](BulkTagAssignments.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

ApiResponse<[**BulkTagAssignments**](BulkTagAssignments.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **207** | Item created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal Server Error |  -  |


## bulkUnAssignTag

> BulkTagAssignments bulkUnAssignTag(bulkTagAssignments, aid)

Remove multiple tags from multiple objects

Removes the specified tags from one or more objects.

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.Configuration;
import com.thousandeyes.api.authentication.*;
import com.thousandeyes.api.models.*;
import com.thousandeyes.api.tags.TagAssignmentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TagAssignmentApi apiInstance = new TagAssignmentApi(defaultClient);
        BulkTagAssignments bulkTagAssignments = new BulkTagAssignments(); // BulkTagAssignments | 
        String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            BulkTagAssignments result = apiInstance.bulkUnAssignTag(bulkTagAssignments, aid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagAssignmentApi#bulkUnAssignTag");
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
| **bulkTagAssignments** | [**BulkTagAssignments**](BulkTagAssignments.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**BulkTagAssignments**](BulkTagAssignments.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **207** | Tag assignments created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal Server Error |  -  |

## bulkUnAssignTagWithHttpInfo

> ApiResponse<BulkTagAssignments> bulkUnAssignTag bulkUnAssignTagWithHttpInfo(bulkTagAssignments, aid)

Remove multiple tags from multiple objects

Removes the specified tags from one or more objects.

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.common.ApiResponse;
import com.thousandeyes.api.Configuration;
import com.thousandeyes.api.authentication.*;
import com.thousandeyes.api.models.*;
import com.thousandeyes.api.tags.TagAssignmentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TagAssignmentApi apiInstance = new TagAssignmentApi(defaultClient);
        BulkTagAssignments bulkTagAssignments = new BulkTagAssignments(); // BulkTagAssignments | 
        String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiResponse<BulkTagAssignments> response = apiInstance.bulkUnAssignTagWithHttpInfo(bulkTagAssignments, aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TagAssignmentApi#bulkUnAssignTag");
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
| **bulkTagAssignments** | [**BulkTagAssignments**](BulkTagAssignments.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

ApiResponse<[**BulkTagAssignments**](BulkTagAssignments.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **207** | Tag assignments created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal Server Error |  -  |


## unassignTag

> void unassignTag(id, tagAssignment, aid)

Remove tag from multiple objects

Removes a tag from one or more objects.

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.Configuration;
import com.thousandeyes.api.authentication.*;
import com.thousandeyes.api.models.*;
import com.thousandeyes.api.tags.TagAssignmentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TagAssignmentApi apiInstance = new TagAssignmentApi(defaultClient);
        String id = "2983u1"; // String | ID of the tag to associate
        TagAssignment tagAssignment = new TagAssignment(); // TagAssignment | 
        String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            apiInstance.unassignTag(id, tagAssignment, aid);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagAssignmentApi#unassignTag");
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
| **id** | **String**| ID of the tag to associate | |
| **tagAssignment** | [**TagAssignment**](TagAssignment.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type


null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/problem+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal Server Error |  -  |

## unassignTagWithHttpInfo

> ApiResponse<Void> unassignTag unassignTagWithHttpInfo(id, tagAssignment, aid)

Remove tag from multiple objects

Removes a tag from one or more objects.

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.common.ApiResponse;
import com.thousandeyes.api.Configuration;
import com.thousandeyes.api.authentication.*;
import com.thousandeyes.api.models.*;
import com.thousandeyes.api.tags.TagAssignmentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TagAssignmentApi apiInstance = new TagAssignmentApi(defaultClient);
        String id = "2983u1"; // String | ID of the tag to associate
        TagAssignment tagAssignment = new TagAssignment(); // TagAssignment | 
        String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            ApiResponse<Void> response = apiInstance.unassignTagWithHttpInfo(id, tagAssignment, aid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TagAssignmentApi#unassignTag");
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
| **id** | **String**| ID of the tag to associate | |
| **tagAssignment** | [**TagAssignment**](TagAssignment.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/problem+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal Server Error |  -  |
