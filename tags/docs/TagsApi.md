# TagsApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTag**](TagsApi.md#createTag) | **POST** /tags | Create tag |
| [**createTagWithHttpInfo**](TagsApi.md#createTagWithHttpInfo) | **POST** /tags | Create tag |
| [**createTags**](TagsApi.md#createTags) | **POST** /tags/bulk | Create multiple tags |
| [**createTagsWithHttpInfo**](TagsApi.md#createTagsWithHttpInfo) | **POST** /tags/bulk | Create multiple tags |
| [**deleteTag**](TagsApi.md#deleteTag) | **DELETE** /tags/{id} | Delete tag |
| [**deleteTagWithHttpInfo**](TagsApi.md#deleteTagWithHttpInfo) | **DELETE** /tags/{id} | Delete tag |
| [**getTag**](TagsApi.md#getTag) | **GET** /tags/{id} | Retrieve tag |
| [**getTagWithHttpInfo**](TagsApi.md#getTagWithHttpInfo) | **GET** /tags/{id} | Retrieve tag |
| [**getTags**](TagsApi.md#getTags) | **GET** /tags | List tags |
| [**getTagsWithHttpInfo**](TagsApi.md#getTagsWithHttpInfo) | **GET** /tags | List tags |
| [**updateTag**](TagsApi.md#updateTag) | **PUT** /tags/{id} | Update tag |
| [**updateTagWithHttpInfo**](TagsApi.md#updateTagWithHttpInfo) | **PUT** /tags/{id} | Update tag |



## createTag

> Tag createTag(CreateTagRequest)

Create tag

Creates a new tag. Creating a dynamic endpoint-agent tag (&#x60;objectType: endpoint-agent&#x60;, &#x60;type: dynamic&#x60;) requires all Endpoint Agent PII view permissions. Requests missing any of these permissions return &#x60;403&#x60;.    For more information, see [Endpoint Agent permissions](https://docs.thousandeyes.com/product-documentation/global-vantage-points/endpoint-agents#endpoint-agent-permissions).

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tags.model.*;
import com.thousandeyes.sdk.tags.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TagsApi apiInstance = new TagsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        TagInfo tagInfo = new TagInfo(); // TagInfo | Tag resource
        try {
            TagsApi.CreateTagRequest request = TagsApi.CreateTagRequest.builder()
                .aid(aid)
                .tagInfo(tagInfo)
                .build();
            Tag result = apiInstance.createTag(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#createTag");
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
| request | [**CreateTagRequest**](TagsApi.md#CreateTagRequest)|-|-|

### Return type

[**Tag**](Tag.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | item created |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **409** | An existing item already exists |  -  |
| **500** | Internal Server Error |  -  |

## createTagWithHttpInfo

> ApiResponse<Tag> createTag createTagWithHttpInfo(CreateTagRequest)

Create tag

Creates a new tag. Creating a dynamic endpoint-agent tag (&#x60;objectType: endpoint-agent&#x60;, &#x60;type: dynamic&#x60;) requires all Endpoint Agent PII view permissions. Requests missing any of these permissions return &#x60;403&#x60;.    For more information, see [Endpoint Agent permissions](https://docs.thousandeyes.com/product-documentation/global-vantage-points/endpoint-agents#endpoint-agent-permissions).

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tags.model.*;
import com.thousandeyes.sdk.tags.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TagsApi apiInstance = new TagsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        TagInfo tagInfo = new TagInfo(); // TagInfo | Tag resource
        try {
            TagsApi.CreateTagRequest request = TagsApi.CreateTagRequest.builder()
                .aid(aid)
                .tagInfo(tagInfo)
                .build();
            ApiResponse<Tag> response = apiInstance.createTagWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#createTag");
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
| request | [**CreateTagRequest**](TagsApi.md#CreateTagRequest)|-|-|

### Return type

ApiResponse<[**Tag**](Tag.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | item created |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **409** | An existing item already exists |  -  |
| **500** | Internal Server Error |  -  |


<a id="CreateTagRequest"></a>
## CreateTagRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **tagInfo** | [**TagInfo**](TagInfo.md) | Tag resource | [optional] |



## createTags

> BulkTagResponse createTags(CreateTagsRequest)

Create multiple tags

Creates multiple tags. Note the response includes a &#x60;statuses&#x60; array. This array provides status information for each tag object, indexed 1:1 with the &#x60;tags&#x60; array. Creating a dynamic endpoint-agent tag (&#x60;objectType: endpoint-agent&#x60;, &#x60;type: dynamic&#x60;) requires all Endpoint Agent PII view permissions. A tag that fails this permission check is reported as a per-item &#x60;403&#x60; in the &#x60;errors&#x60; array, while the top-level status remains &#x60;207&#x60;. If the caller does not have permission to create tags, the request returns a top-level &#x60;403&#x60;. For more information, see [Endpoint Agent permissions](https://docs.thousandeyes.com/product-documentation/global-vantage-points/endpoint-agents#endpoint-agent-permissions).

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tags.model.*;
import com.thousandeyes.sdk.tags.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TagsApi apiInstance = new TagsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        BulkTagResponse bulkTagResponse = new BulkTagResponse(); // BulkTagResponse | Tag resource
        try {
            TagsApi.CreateTagsRequest request = TagsApi.CreateTagsRequest.builder()
                .aid(aid)
                .bulkTagResponse(bulkTagResponse)
                .build();
            BulkTagResponse result = apiInstance.createTags(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#createTags");
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
| request | [**CreateTagsRequest**](TagsApi.md#CreateTagsRequest)|-|-|

### Return type

[**BulkTagResponse**](BulkTagResponse.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **207** | Item created |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **500** | Internal Server Error |  -  |

## createTagsWithHttpInfo

> ApiResponse<BulkTagResponse> createTags createTagsWithHttpInfo(CreateTagsRequest)

Create multiple tags

Creates multiple tags. Note the response includes a &#x60;statuses&#x60; array. This array provides status information for each tag object, indexed 1:1 with the &#x60;tags&#x60; array. Creating a dynamic endpoint-agent tag (&#x60;objectType: endpoint-agent&#x60;, &#x60;type: dynamic&#x60;) requires all Endpoint Agent PII view permissions. A tag that fails this permission check is reported as a per-item &#x60;403&#x60; in the &#x60;errors&#x60; array, while the top-level status remains &#x60;207&#x60;. If the caller does not have permission to create tags, the request returns a top-level &#x60;403&#x60;. For more information, see [Endpoint Agent permissions](https://docs.thousandeyes.com/product-documentation/global-vantage-points/endpoint-agents#endpoint-agent-permissions).

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tags.model.*;
import com.thousandeyes.sdk.tags.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TagsApi apiInstance = new TagsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        BulkTagResponse bulkTagResponse = new BulkTagResponse(); // BulkTagResponse | Tag resource
        try {
            TagsApi.CreateTagsRequest request = TagsApi.CreateTagsRequest.builder()
                .aid(aid)
                .bulkTagResponse(bulkTagResponse)
                .build();
            ApiResponse<BulkTagResponse> response = apiInstance.createTagsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#createTags");
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
| request | [**CreateTagsRequest**](TagsApi.md#CreateTagsRequest)|-|-|

### Return type

ApiResponse<[**BulkTagResponse**](BulkTagResponse.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **207** | Item created |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **500** | Internal Server Error |  -  |


<a id="CreateTagsRequest"></a>
## CreateTagsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **bulkTagResponse** | [**BulkTagResponse**](BulkTagResponse.md) | Tag resource | [optional] |



## deleteTag

> void deleteTag(DeleteTagRequest)

Delete tag

Deletes a tag.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tags.model.*;
import com.thousandeyes.sdk.tags.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TagsApi apiInstance = new TagsApi(defaultClient);
        String id = "c6b78e57-81a2-4c5f-a11a-d96c3c664d55"; // String | Tag ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            TagsApi.DeleteTagRequest request = TagsApi.DeleteTagRequest.builder()
                .id(id)
                .aid(aid)
                .build();
            apiInstance.deleteTag(request);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#deleteTag");
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
| request | [**DeleteTagRequest**](TagsApi.md#DeleteTagRequest)|-|-|

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
| **500** | Internal Server Error |  -  |

## deleteTagWithHttpInfo

> ApiResponse<Void> deleteTag deleteTagWithHttpInfo(DeleteTagRequest)

Delete tag

Deletes a tag.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tags.model.*;
import com.thousandeyes.sdk.tags.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TagsApi apiInstance = new TagsApi(defaultClient);
        String id = "c6b78e57-81a2-4c5f-a11a-d96c3c664d55"; // String | Tag ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            TagsApi.DeleteTagRequest request = TagsApi.DeleteTagRequest.builder()
                .id(id)
                .aid(aid)
                .build();
            ApiResponse<Void> response = apiInstance.deleteTagWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#deleteTag");
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
| request | [**DeleteTagRequest**](TagsApi.md#DeleteTagRequest)|-|-|

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
| **500** | Internal Server Error |  -  |


<a id="DeleteTagRequest"></a>
## DeleteTagRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **id** | **String** | Tag ID | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getTag

> Tag getTag(GetTagRequest)

Retrieve tag

Retrieves a tag using its ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tags.model.*;
import com.thousandeyes.sdk.tags.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TagsApi apiInstance = new TagsApi(defaultClient);
        String id = "c6b78e57-81a2-4c5f-a11a-d96c3c664d55"; // String | Tag ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandTagsOptions> expand = Arrays.asList(); // List<ExpandTagsOptions> | Optional, to retrieve associated assignments. Only static tags will return object assignments.
        try {
            TagsApi.GetTagRequest request = TagsApi.GetTagRequest.builder()
                .id(id)
                .aid(aid)
                .expand(expand)
                .build();
            Tag result = apiInstance.getTag(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#getTag");
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
| request | [**GetTagRequest**](TagsApi.md#GetTagRequest)|-|-|

### Return type

[**Tag**](Tag.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal Server Error |  -  |

## getTagWithHttpInfo

> ApiResponse<Tag> getTag getTagWithHttpInfo(GetTagRequest)

Retrieve tag

Retrieves a tag using its ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tags.model.*;
import com.thousandeyes.sdk.tags.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TagsApi apiInstance = new TagsApi(defaultClient);
        String id = "c6b78e57-81a2-4c5f-a11a-d96c3c664d55"; // String | Tag ID
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandTagsOptions> expand = Arrays.asList(); // List<ExpandTagsOptions> | Optional, to retrieve associated assignments. Only static tags will return object assignments.
        try {
            TagsApi.GetTagRequest request = TagsApi.GetTagRequest.builder()
                .id(id)
                .aid(aid)
                .expand(expand)
                .build();
            ApiResponse<Tag> response = apiInstance.getTagWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#getTag");
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
| request | [**GetTagRequest**](TagsApi.md#GetTagRequest)|-|-|

### Return type

ApiResponse<[**Tag**](Tag.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal Server Error |  -  |


<a id="GetTagRequest"></a>
## GetTagRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **id** | **String** | Tag ID | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;ExpandTagsOptions&gt;**](ExpandTagsOptions.md) | Optional, to retrieve associated assignments. Only static tags will return object assignments. | [optional] |



## getTags

> Tags getTags(GetTagsRequest)

List tags

This operation returns a list of tags in the specified account group (&#x60;aid&#x60;).

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tags.model.*;
import com.thousandeyes.sdk.tags.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TagsApi apiInstance = new TagsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandTagsOptions> expand = Arrays.asList(); // List<ExpandTagsOptions> | Optional, to retrieve associated assignments. Only static tags will return object assignments.
        try {
            TagsApi.GetTagsRequest request = TagsApi.GetTagsRequest.builder()
                .aid(aid)
                .expand(expand)
                .build();
            Tags result = apiInstance.getTags(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#getTags");
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
| request | [**GetTagsRequest**](TagsApi.md#GetTagsRequest)|-|-|

### Return type

[**Tags**](Tags.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal Server Error |  -  |

## getTagsWithHttpInfo

> ApiResponse<Tags> getTags getTagsWithHttpInfo(GetTagsRequest)

List tags

This operation returns a list of tags in the specified account group (&#x60;aid&#x60;).

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tags.model.*;
import com.thousandeyes.sdk.tags.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TagsApi apiInstance = new TagsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandTagsOptions> expand = Arrays.asList(); // List<ExpandTagsOptions> | Optional, to retrieve associated assignments. Only static tags will return object assignments.
        try {
            TagsApi.GetTagsRequest request = TagsApi.GetTagsRequest.builder()
                .aid(aid)
                .expand(expand)
                .build();
            ApiResponse<Tags> response = apiInstance.getTagsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#getTags");
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
| request | [**GetTagsRequest**](TagsApi.md#GetTagsRequest)|-|-|

### Return type

ApiResponse<[**Tags**](Tags.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal Server Error |  -  |


<a id="GetTagsRequest"></a>
## GetTagsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;ExpandTagsOptions&gt;**](ExpandTagsOptions.md) | Optional, to retrieve associated assignments. Only static tags will return object assignments. | [optional] |



## updateTag

> Tag updateTag(UpdateTagRequest)

Update tag

Updates a tag. Updating a dynamic endpoint-agent tag (&#x60;objectType: endpoint-agent&#x60;, &#x60;type: dynamic&#x60;) requires all Endpoint Agent PII view permissions. Requests missing any of these permissions return &#x60;403&#x60;. For more information, see [Endpoint Agent permissions](https://docs.thousandeyes.com/product-documentation/global-vantage-points/endpoint-agents#endpoint-agent-permissions).

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tags.model.*;
import com.thousandeyes.sdk.tags.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TagsApi apiInstance = new TagsApi(defaultClient);
        String id = "c6b78e57-81a2-4c5f-a11a-d96c3c664d55"; // String | ID of tag to update
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        TagInfo tagInfo = new TagInfo(); // TagInfo | 
        try {
            TagsApi.UpdateTagRequest request = TagsApi.UpdateTagRequest.builder()
                .id(id)
                .aid(aid)
                .tagInfo(tagInfo)
                .build();
            Tag result = apiInstance.updateTag(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#updateTag");
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
| request | [**UpdateTagRequest**](TagsApi.md#UpdateTagRequest)|-|-|

### Return type

[**Tag**](Tag.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal Server Error |  -  |

## updateTagWithHttpInfo

> ApiResponse<Tag> updateTag updateTagWithHttpInfo(UpdateTagRequest)

Update tag

Updates a tag. Updating a dynamic endpoint-agent tag (&#x60;objectType: endpoint-agent&#x60;, &#x60;type: dynamic&#x60;) requires all Endpoint Agent PII view permissions. Requests missing any of these permissions return &#x60;403&#x60;. For more information, see [Endpoint Agent permissions](https://docs.thousandeyes.com/product-documentation/global-vantage-points/endpoint-agents#endpoint-agent-permissions).

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.tags.model.*;
import com.thousandeyes.sdk.tags.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TagsApi apiInstance = new TagsApi(defaultClient);
        String id = "c6b78e57-81a2-4c5f-a11a-d96c3c664d55"; // String | ID of tag to update
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        TagInfo tagInfo = new TagInfo(); // TagInfo | 
        try {
            TagsApi.UpdateTagRequest request = TagsApi.UpdateTagRequest.builder()
                .id(id)
                .aid(aid)
                .tagInfo(tagInfo)
                .build();
            ApiResponse<Tag> response = apiInstance.updateTagWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#updateTag");
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
| request | [**UpdateTagRequest**](TagsApi.md#UpdateTagRequest)|-|-|

### Return type

ApiResponse<[**Tag**](Tag.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal Server Error |  -  |


<a id="UpdateTagRequest"></a>
## UpdateTagRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **id** | **String** | ID of tag to update | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **tagInfo** | [**TagInfo**](TagInfo.md) |  | [optional] |


