# ScheduledTestsAgentToServerApi

All URIs are relative to *https://api.thousandeyes.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEndpointAgentToServerDetail**](ScheduledTestsAgentToServerApi.md#getEndpointAgentToServerDetail) | **GET** /v7/endpoint/tests/scheduled-tests/agent-to-server/{testId} | Retrieve agent to server endpoint scheduled test |
| [**getEndpointAgentToserverTestsList**](ScheduledTestsAgentToServerApi.md#getEndpointAgentToserverTestsList) | **GET** /v7/endpoint/tests/scheduled-tests/agent-to-server | List agent to server endpoint scheduled tests |
| [**postEndpointAgentToServerTest**](ScheduledTestsAgentToServerApi.md#postEndpointAgentToServerTest) | **POST** /v7/endpoint/tests/scheduled-tests/agent-to-server | Creates agent to server endpoint scheduled test |


<a id="getEndpointAgentToServerDetail"></a>
# **getEndpointAgentToServerDetail**
> PostEndpointAgentToServerTest201Response getEndpointAgentToServerDetail(testId, aid)

Retrieve agent to server endpoint scheduled test

Retrieves details of an agent to server endpoint scheduled test.

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.ScheduledTestsAgentToServerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ScheduledTestsAgentToServerApi apiInstance = new ScheduledTestsAgentToServerApi(defaultClient);
    String testId = "584739201"; // String | Unique ID of endpoint test.
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      PostEndpointAgentToServerTest201Response result = apiInstance.getEndpointAgentToServerDetail(testId, aid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduledTestsAgentToServerApi#getEndpointAgentToServerDetail");
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
| **testId** | **String**| Unique ID of endpoint test. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**PostEndpointAgentToServerTest201Response**](PostEndpointAgentToServerTest201Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |

<a id="getEndpointAgentToserverTestsList"></a>
# **getEndpointAgentToserverTestsList**
> GetEndpointAgentToserverTestsList200Response getEndpointAgentToserverTestsList(aid)

List agent to server endpoint scheduled tests

Returns a list of all agent to server endpoint scheduled tests configured in ThousandEyes. This list does not contain saved events. 

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.ScheduledTestsAgentToServerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ScheduledTestsAgentToServerApi apiInstance = new ScheduledTestsAgentToServerApi(defaultClient);
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      GetEndpointAgentToserverTestsList200Response result = apiInstance.getEndpointAgentToserverTestsList(aid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduledTestsAgentToServerApi#getEndpointAgentToserverTestsList");
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

[**GetEndpointAgentToserverTestsList200Response**](GetEndpointAgentToserverTestsList200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |

<a id="postEndpointAgentToServerTest"></a>
# **postEndpointAgentToServerTest**
> PostEndpointAgentToServerTest201Response postEndpointAgentToServerTest(endpointAgentToServerTestRequest, aid)

Creates agent to server endpoint scheduled test

Creates a new endpoint test in ThousandEyes using properties specified in the POST data. Please note that only Account Admins have the authorization to create new tests; regular users are restricted from using POST-based methods. 

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.ScheduledTestsAgentToServerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ScheduledTestsAgentToServerApi apiInstance = new ScheduledTestsAgentToServerApi(defaultClient);
    EndpointAgentToServerTestRequest endpointAgentToServerTestRequest = new EndpointAgentToServerTestRequest(); // EndpointAgentToServerTestRequest | 
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      PostEndpointAgentToServerTest201Response result = apiInstance.postEndpointAgentToServerTest(endpointAgentToServerTestRequest, aid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduledTestsAgentToServerApi#postEndpointAgentToServerTest");
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
| **endpointAgentToServerTestRequest** | [**EndpointAgentToServerTestRequest**](EndpointAgentToServerTestRequest.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**PostEndpointAgentToServerTest201Response**](PostEndpointAgentToServerTest201Response.md)

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
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |

