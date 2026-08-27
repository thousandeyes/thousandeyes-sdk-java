# CloudAndEnterpriseAgentNotificationRulesApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAgentsNotificationRule**](CloudAndEnterpriseAgentNotificationRulesApi.md#getAgentsNotificationRule) | **GET** /agents/notification-rules/{notificationRuleId} | Retrieve agent notification rule |
| [**getAgentsNotificationRuleWithHttpInfo**](CloudAndEnterpriseAgentNotificationRulesApi.md#getAgentsNotificationRuleWithHttpInfo) | **GET** /agents/notification-rules/{notificationRuleId} | Retrieve agent notification rule |
| [**getAgentsNotificationRules**](CloudAndEnterpriseAgentNotificationRulesApi.md#getAgentsNotificationRules) | **GET** /agents/notification-rules | List agent notification rules |
| [**getAgentsNotificationRulesWithHttpInfo**](CloudAndEnterpriseAgentNotificationRulesApi.md#getAgentsNotificationRulesWithHttpInfo) | **GET** /agents/notification-rules | List agent notification rules |



## getAgentsNotificationRule

> NotificationRuleDetail getAgentsNotificationRule(GetAgentsNotificationRuleRequest)

Retrieve agent notification rule

Returns details of an agent notification rule, including agents it is assigned to. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.agents.model.*;
import com.thousandeyes.sdk.agents.CloudAndEnterpriseAgentNotificationRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudAndEnterpriseAgentNotificationRulesApi apiInstance = new CloudAndEnterpriseAgentNotificationRulesApi(defaultClient);
        String notificationRuleId = "281474976710706"; // String | Unique ID for the agent notification rule.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudAndEnterpriseAgentNotificationRulesApi.GetAgentsNotificationRuleRequest request = CloudAndEnterpriseAgentNotificationRulesApi.GetAgentsNotificationRuleRequest.builder()
                .notificationRuleId(notificationRuleId)
                .aid(aid)
                .build();
            NotificationRuleDetail result = apiInstance.getAgentsNotificationRule(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudAndEnterpriseAgentNotificationRulesApi#getAgentsNotificationRule");
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
| request | [**GetAgentsNotificationRuleRequest**](CloudAndEnterpriseAgentNotificationRulesApi.md#GetAgentsNotificationRuleRequest)|-|-|

### Return type

[**NotificationRuleDetail**](NotificationRuleDetail.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

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

## getAgentsNotificationRuleWithHttpInfo

> ApiResponse<NotificationRuleDetail> getAgentsNotificationRule getAgentsNotificationRuleWithHttpInfo(GetAgentsNotificationRuleRequest)

Retrieve agent notification rule

Returns details of an agent notification rule, including agents it is assigned to. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.agents.model.*;
import com.thousandeyes.sdk.agents.CloudAndEnterpriseAgentNotificationRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudAndEnterpriseAgentNotificationRulesApi apiInstance = new CloudAndEnterpriseAgentNotificationRulesApi(defaultClient);
        String notificationRuleId = "281474976710706"; // String | Unique ID for the agent notification rule.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudAndEnterpriseAgentNotificationRulesApi.GetAgentsNotificationRuleRequest request = CloudAndEnterpriseAgentNotificationRulesApi.GetAgentsNotificationRuleRequest.builder()
                .notificationRuleId(notificationRuleId)
                .aid(aid)
                .build();
            ApiResponse<NotificationRuleDetail> response = apiInstance.getAgentsNotificationRuleWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudAndEnterpriseAgentNotificationRulesApi#getAgentsNotificationRule");
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
| request | [**GetAgentsNotificationRuleRequest**](CloudAndEnterpriseAgentNotificationRulesApi.md#GetAgentsNotificationRuleRequest)|-|-|

### Return type

ApiResponse<[**NotificationRuleDetail**](NotificationRuleDetail.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

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


<a id="GetAgentsNotificationRuleRequest"></a>
## GetAgentsNotificationRuleRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **notificationRuleId** | **String** | Unique ID for the agent notification rule. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getAgentsNotificationRules

> ListNotificationRulesResponse getAgentsNotificationRules(GetAgentsNotificationRulesRequest)

List agent notification rules

Returns a list of all agent notification rules configured under the account.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.agents.model.*;
import com.thousandeyes.sdk.agents.CloudAndEnterpriseAgentNotificationRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudAndEnterpriseAgentNotificationRulesApi apiInstance = new CloudAndEnterpriseAgentNotificationRulesApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudAndEnterpriseAgentNotificationRulesApi.GetAgentsNotificationRulesRequest request = CloudAndEnterpriseAgentNotificationRulesApi.GetAgentsNotificationRulesRequest.builder()
                .aid(aid)
                .build();
            ListNotificationRulesResponse result = apiInstance.getAgentsNotificationRules(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudAndEnterpriseAgentNotificationRulesApi#getAgentsNotificationRules");
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
| request | [**GetAgentsNotificationRulesRequest**](CloudAndEnterpriseAgentNotificationRulesApi.md#GetAgentsNotificationRulesRequest)|-|-|

### Return type

[**ListNotificationRulesResponse**](ListNotificationRulesResponse.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

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

## getAgentsNotificationRulesWithHttpInfo

> ApiResponse<ListNotificationRulesResponse> getAgentsNotificationRules getAgentsNotificationRulesWithHttpInfo(GetAgentsNotificationRulesRequest)

List agent notification rules

Returns a list of all agent notification rules configured under the account.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.agents.model.*;
import com.thousandeyes.sdk.agents.CloudAndEnterpriseAgentNotificationRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudAndEnterpriseAgentNotificationRulesApi apiInstance = new CloudAndEnterpriseAgentNotificationRulesApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudAndEnterpriseAgentNotificationRulesApi.GetAgentsNotificationRulesRequest request = CloudAndEnterpriseAgentNotificationRulesApi.GetAgentsNotificationRulesRequest.builder()
                .aid(aid)
                .build();
            ApiResponse<ListNotificationRulesResponse> response = apiInstance.getAgentsNotificationRulesWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudAndEnterpriseAgentNotificationRulesApi#getAgentsNotificationRules");
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
| request | [**GetAgentsNotificationRulesRequest**](CloudAndEnterpriseAgentNotificationRulesApi.md#GetAgentsNotificationRulesRequest)|-|-|

### Return type

ApiResponse<[**ListNotificationRulesResponse**](ListNotificationRulesResponse.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

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


<a id="GetAgentsNotificationRulesRequest"></a>
## GetAgentsNotificationRulesRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |


