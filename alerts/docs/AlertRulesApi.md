# AlertRulesApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAlertRule**](AlertRulesApi.md#createAlertRule) | **POST** /alerts/rules | Create alert rule |
| [**createAlertRuleWithHttpInfo**](AlertRulesApi.md#createAlertRuleWithHttpInfo) | **POST** /alerts/rules | Create alert rule |
| [**deleteAlertRule**](AlertRulesApi.md#deleteAlertRule) | **DELETE** /alerts/rules/{ruleId} | Delete alert rule |
| [**deleteAlertRuleWithHttpInfo**](AlertRulesApi.md#deleteAlertRuleWithHttpInfo) | **DELETE** /alerts/rules/{ruleId} | Delete alert rule |
| [**getAlertRule**](AlertRulesApi.md#getAlertRule) | **GET** /alerts/rules/{ruleId} | Retrieve alert rule |
| [**getAlertRuleWithHttpInfo**](AlertRulesApi.md#getAlertRuleWithHttpInfo) | **GET** /alerts/rules/{ruleId} | Retrieve alert rule |
| [**getAlertsRules**](AlertRulesApi.md#getAlertsRules) | **GET** /alerts/rules | List alert rules |
| [**getAlertsRulesWithHttpInfo**](AlertRulesApi.md#getAlertsRulesWithHttpInfo) | **GET** /alerts/rules | List alert rules |
| [**updateAlertRule**](AlertRulesApi.md#updateAlertRule) | **PUT** /alerts/rules/{ruleId} | Update alert rule |
| [**updateAlertRuleWithHttpInfo**](AlertRulesApi.md#updateAlertRuleWithHttpInfo) | **PUT** /alerts/rules/{ruleId} | Update alert rule |



## createAlertRule

> Rule createAlertRule(CreateAlertRuleRequest)

Create alert rule

Creates a new alert rule in your account, using the provided POST data. This endpoint is limited to alert rules for Network &amp; App Synthetics tests and Routing tests. The &#x60;Edit alert rules&#x60; permission is required to create an alert rule. Note: Assigning an alert rule to a test during creation requires the &#x60;Edit tests&#x60; permission.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.alerts.model.*;
import com.thousandeyes.sdk.alerts.AlertRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertRulesApi apiInstance = new AlertRulesApi(defaultClient);
        RuleDetailUpdate ruleDetailUpdate = new RuleDetailUpdate(); // RuleDetailUpdate | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AlertRulesApi.CreateAlertRuleRequest request = AlertRulesApi.CreateAlertRuleRequest.builder()
                .ruleDetailUpdate(ruleDetailUpdate)
                .aid(aid)
                .build();
            Rule result = apiInstance.createAlertRule(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertRulesApi#createAlertRule");
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
| request | [**CreateAlertRuleRequest**](AlertRulesApi.md#CreateAlertRuleRequest)|-|-|

### Return type

[**Rule**](Rule.md)


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

## createAlertRuleWithHttpInfo

> ApiResponse<Rule> createAlertRule createAlertRuleWithHttpInfo(CreateAlertRuleRequest)

Create alert rule

Creates a new alert rule in your account, using the provided POST data. This endpoint is limited to alert rules for Network &amp; App Synthetics tests and Routing tests. The &#x60;Edit alert rules&#x60; permission is required to create an alert rule. Note: Assigning an alert rule to a test during creation requires the &#x60;Edit tests&#x60; permission.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.alerts.model.*;
import com.thousandeyes.sdk.alerts.AlertRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertRulesApi apiInstance = new AlertRulesApi(defaultClient);
        RuleDetailUpdate ruleDetailUpdate = new RuleDetailUpdate(); // RuleDetailUpdate | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AlertRulesApi.CreateAlertRuleRequest request = AlertRulesApi.CreateAlertRuleRequest.builder()
                .ruleDetailUpdate(ruleDetailUpdate)
                .aid(aid)
                .build();
            ApiResponse<Rule> response = apiInstance.createAlertRuleWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertRulesApi#createAlertRule");
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
| request | [**CreateAlertRuleRequest**](AlertRulesApi.md#CreateAlertRuleRequest)|-|-|

### Return type

ApiResponse<[**Rule**](Rule.md)>


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


<a id="CreateAlertRuleRequest"></a>
## CreateAlertRuleRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **ruleDetailUpdate** | [**RuleDetailUpdate**](RuleDetailUpdate.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## deleteAlertRule

> void deleteAlertRule(DeleteAlertRuleRequest)

Delete alert rule

Deletes an alert rule from your account. Users must have both &#x60;Edit alert rules&#x60; and &#x60;Edit tests&#x60; permissions, especially if the rule is linked to any tests. Without these permissions, an error occurs. This endpoint is limited to alert rules for Network &amp; App Synthetics tests and Routing tests.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.alerts.model.*;
import com.thousandeyes.sdk.alerts.AlertRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertRulesApi apiInstance = new AlertRulesApi(defaultClient);
        String ruleId = "127094"; // String | Unique alert rule ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AlertRulesApi.DeleteAlertRuleRequest request = AlertRulesApi.DeleteAlertRuleRequest.builder()
                .ruleId(ruleId)
                .aid(aid)
                .build();
            apiInstance.deleteAlertRule(request);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertRulesApi#deleteAlertRule");
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
| request | [**DeleteAlertRuleRequest**](AlertRulesApi.md#DeleteAlertRuleRequest)|-|-|

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

## deleteAlertRuleWithHttpInfo

> ApiResponse<Void> deleteAlertRule deleteAlertRuleWithHttpInfo(DeleteAlertRuleRequest)

Delete alert rule

Deletes an alert rule from your account. Users must have both &#x60;Edit alert rules&#x60; and &#x60;Edit tests&#x60; permissions, especially if the rule is linked to any tests. Without these permissions, an error occurs. This endpoint is limited to alert rules for Network &amp; App Synthetics tests and Routing tests.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.alerts.model.*;
import com.thousandeyes.sdk.alerts.AlertRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertRulesApi apiInstance = new AlertRulesApi(defaultClient);
        String ruleId = "127094"; // String | Unique alert rule ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AlertRulesApi.DeleteAlertRuleRequest request = AlertRulesApi.DeleteAlertRuleRequest.builder()
                .ruleId(ruleId)
                .aid(aid)
                .build();
            ApiResponse<Void> response = apiInstance.deleteAlertRuleWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertRulesApi#deleteAlertRule");
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
| request | [**DeleteAlertRuleRequest**](AlertRulesApi.md#DeleteAlertRuleRequest)|-|-|

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


<a id="DeleteAlertRuleRequest"></a>
## DeleteAlertRuleRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **ruleId** | **String** | Unique alert rule ID. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getAlertRule

> RuleDetail getAlertRule(GetAlertRuleRequest)

Retrieve alert rule

Returns detailed information about an alert rule using the &#x60;ruleId&#x60;. This endpoint is limited to alert rules for Network &amp; App Synthetics tests and Routing tests. If the &#x60;ruleId&#x60; doesn’t exist or is inaccessible by your account, an empty response is returned.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.alerts.model.*;
import com.thousandeyes.sdk.alerts.AlertRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertRulesApi apiInstance = new AlertRulesApi(defaultClient);
        String ruleId = "127094"; // String | Unique alert rule ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AlertRulesApi.GetAlertRuleRequest request = AlertRulesApi.GetAlertRuleRequest.builder()
                .ruleId(ruleId)
                .aid(aid)
                .build();
            RuleDetail result = apiInstance.getAlertRule(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertRulesApi#getAlertRule");
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
| request | [**GetAlertRuleRequest**](AlertRulesApi.md#GetAlertRuleRequest)|-|-|

### Return type

[**RuleDetail**](RuleDetail.md)


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

## getAlertRuleWithHttpInfo

> ApiResponse<RuleDetail> getAlertRule getAlertRuleWithHttpInfo(GetAlertRuleRequest)

Retrieve alert rule

Returns detailed information about an alert rule using the &#x60;ruleId&#x60;. This endpoint is limited to alert rules for Network &amp; App Synthetics tests and Routing tests. If the &#x60;ruleId&#x60; doesn’t exist or is inaccessible by your account, an empty response is returned.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.alerts.model.*;
import com.thousandeyes.sdk.alerts.AlertRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertRulesApi apiInstance = new AlertRulesApi(defaultClient);
        String ruleId = "127094"; // String | Unique alert rule ID.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AlertRulesApi.GetAlertRuleRequest request = AlertRulesApi.GetAlertRuleRequest.builder()
                .ruleId(ruleId)
                .aid(aid)
                .build();
            ApiResponse<RuleDetail> response = apiInstance.getAlertRuleWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertRulesApi#getAlertRule");
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
| request | [**GetAlertRuleRequest**](AlertRulesApi.md#GetAlertRuleRequest)|-|-|

### Return type

ApiResponse<[**RuleDetail**](RuleDetail.md)>


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


<a id="GetAlertRuleRequest"></a>
## GetAlertRuleRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **ruleId** | **String** | Unique alert rule ID. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getAlertsRules

> Rules getAlertsRules(GetAlertsRulesRequest)

List alert rules

Returns a list of alert rules. Default rules for each test type are indicated with a boolean response (true or false); these default alert rules automatically apply to their respective test types. This endpoint is limited to alert rules for Network &amp; App Synthetics tests and Routing tests.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.alerts.model.*;
import com.thousandeyes.sdk.alerts.AlertRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertRulesApi apiInstance = new AlertRulesApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AlertRulesApi.GetAlertsRulesRequest request = AlertRulesApi.GetAlertsRulesRequest.builder()
                .aid(aid)
                .build();
            Rules result = apiInstance.getAlertsRules(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertRulesApi#getAlertsRules");
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
| request | [**GetAlertsRulesRequest**](AlertRulesApi.md#GetAlertsRulesRequest)|-|-|

### Return type

[**Rules**](Rules.md)


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

## getAlertsRulesWithHttpInfo

> ApiResponse<Rules> getAlertsRules getAlertsRulesWithHttpInfo(GetAlertsRulesRequest)

List alert rules

Returns a list of alert rules. Default rules for each test type are indicated with a boolean response (true or false); these default alert rules automatically apply to their respective test types. This endpoint is limited to alert rules for Network &amp; App Synthetics tests and Routing tests.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.alerts.model.*;
import com.thousandeyes.sdk.alerts.AlertRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertRulesApi apiInstance = new AlertRulesApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AlertRulesApi.GetAlertsRulesRequest request = AlertRulesApi.GetAlertsRulesRequest.builder()
                .aid(aid)
                .build();
            ApiResponse<Rules> response = apiInstance.getAlertsRulesWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertRulesApi#getAlertsRules");
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
| request | [**GetAlertsRulesRequest**](AlertRulesApi.md#GetAlertsRulesRequest)|-|-|

### Return type

ApiResponse<[**Rules**](Rules.md)>


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


<a id="GetAlertsRulesRequest"></a>
## GetAlertsRulesRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## updateAlertRule

> Rule updateAlertRule(UpdateAlertRuleRequest)

Update alert rule

Modifies an existing alert rule in your account, using the provided POST data. This endpoint is limited to alert rules for Network &amp; App Synthetics tests and Routing tests. The &#x60;Edit alert rules&#x60; permission is required to modify an alert rule.  Note: Assigning an alert rule to a test during creation requires the &#x60;Edit tests&#x60; permission.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.alerts.model.*;
import com.thousandeyes.sdk.alerts.AlertRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertRulesApi apiInstance = new AlertRulesApi(defaultClient);
        String ruleId = "127094"; // String | Unique alert rule ID.
        RuleDetailUpdate ruleDetailUpdate = new RuleDetailUpdate(); // RuleDetailUpdate | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AlertRulesApi.UpdateAlertRuleRequest request = AlertRulesApi.UpdateAlertRuleRequest.builder()
                .ruleId(ruleId)
                .ruleDetailUpdate(ruleDetailUpdate)
                .aid(aid)
                .build();
            Rule result = apiInstance.updateAlertRule(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertRulesApi#updateAlertRule");
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
| request | [**UpdateAlertRuleRequest**](AlertRulesApi.md#UpdateAlertRuleRequest)|-|-|

### Return type

[**Rule**](Rule.md)


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

## updateAlertRuleWithHttpInfo

> ApiResponse<Rule> updateAlertRule updateAlertRuleWithHttpInfo(UpdateAlertRuleRequest)

Update alert rule

Modifies an existing alert rule in your account, using the provided POST data. This endpoint is limited to alert rules for Network &amp; App Synthetics tests and Routing tests. The &#x60;Edit alert rules&#x60; permission is required to modify an alert rule.  Note: Assigning an alert rule to a test during creation requires the &#x60;Edit tests&#x60; permission.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.alerts.model.*;
import com.thousandeyes.sdk.alerts.AlertRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AlertRulesApi apiInstance = new AlertRulesApi(defaultClient);
        String ruleId = "127094"; // String | Unique alert rule ID.
        RuleDetailUpdate ruleDetailUpdate = new RuleDetailUpdate(); // RuleDetailUpdate | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            AlertRulesApi.UpdateAlertRuleRequest request = AlertRulesApi.UpdateAlertRuleRequest.builder()
                .ruleId(ruleId)
                .ruleDetailUpdate(ruleDetailUpdate)
                .aid(aid)
                .build();
            ApiResponse<Rule> response = apiInstance.updateAlertRuleWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertRulesApi#updateAlertRule");
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
| request | [**UpdateAlertRuleRequest**](AlertRulesApi.md#UpdateAlertRuleRequest)|-|-|

### Return type

ApiResponse<[**Rule**](Rule.md)>


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


<a id="UpdateAlertRuleRequest"></a>
## UpdateAlertRuleRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **ruleId** | **String** | Unique alert rule ID. | |
| **ruleDetailUpdate** | [**RuleDetailUpdate**](RuleDetailUpdate.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |


