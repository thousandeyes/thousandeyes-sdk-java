# CloudInsightsIntegrationPolicySettingsApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAWSIntegrationPolicySettings**](CloudInsightsIntegrationPolicySettingsApi.md#getAWSIntegrationPolicySettings) | **GET** /cloud-insights/integration/aws/policy/settings | Get AWS integration policy settings |
| [**getAWSIntegrationPolicySettingsWithHttpInfo**](CloudInsightsIntegrationPolicySettingsApi.md#getAWSIntegrationPolicySettingsWithHttpInfo) | **GET** /cloud-insights/integration/aws/policy/settings | Get AWS integration policy settings |
| [**getAzureIntegrationPolicySettings**](CloudInsightsIntegrationPolicySettingsApi.md#getAzureIntegrationPolicySettings) | **GET** /cloud-insights/integration/azure/policy/settings | Get Azure integration policy settings |
| [**getAzureIntegrationPolicySettingsWithHttpInfo**](CloudInsightsIntegrationPolicySettingsApi.md#getAzureIntegrationPolicySettingsWithHttpInfo) | **GET** /cloud-insights/integration/azure/policy/settings | Get Azure integration policy settings |
| [**updateAWSIntegrationPolicySettings**](CloudInsightsIntegrationPolicySettingsApi.md#updateAWSIntegrationPolicySettings) | **PUT** /cloud-insights/integration/aws/policy/settings | Update AWS integration policy settings |
| [**updateAWSIntegrationPolicySettingsWithHttpInfo**](CloudInsightsIntegrationPolicySettingsApi.md#updateAWSIntegrationPolicySettingsWithHttpInfo) | **PUT** /cloud-insights/integration/aws/policy/settings | Update AWS integration policy settings |
| [**updateAzureIntegrationPolicySettings**](CloudInsightsIntegrationPolicySettingsApi.md#updateAzureIntegrationPolicySettings) | **PUT** /cloud-insights/integration/azure/policy/settings | Update Azure integration policy settings |
| [**updateAzureIntegrationPolicySettingsWithHttpInfo**](CloudInsightsIntegrationPolicySettingsApi.md#updateAzureIntegrationPolicySettingsWithHttpInfo) | **PUT** /cloud-insights/integration/azure/policy/settings | Update Azure integration policy settings |



## getAWSIntegrationPolicySettings

> AwsIntegrationPolicySetting getAWSIntegrationPolicySettings(GetAWSIntegrationPolicySettingsRequest)

Get AWS integration policy settings

Retrieves the AWS integration policy settings for the authenticated account group. Use this endpoint to audit which AWS resource group types and AWS regions are enabled, and whether CloudTrail is enabled, for Cloud Insights inventory monitoring. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationPolicySettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationPolicySettingsApi apiInstance = new CloudInsightsIntegrationPolicySettingsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationPolicySettingsApi.GetAWSIntegrationPolicySettingsRequest request = CloudInsightsIntegrationPolicySettingsApi.GetAWSIntegrationPolicySettingsRequest.builder()
                .aid(aid)
                .build();
            AwsIntegrationPolicySetting result = apiInstance.getAWSIntegrationPolicySettings(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationPolicySettingsApi#getAWSIntegrationPolicySettings");
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
| request | [**GetAWSIntegrationPolicySettingsRequest**](CloudInsightsIntegrationPolicySettingsApi.md#GetAWSIntegrationPolicySettingsRequest)|-|-|

### Return type

[**AwsIntegrationPolicySetting**](AwsIntegrationPolicySetting.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | AWS integration policy settings returned successfully. |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |

## getAWSIntegrationPolicySettingsWithHttpInfo

> ApiResponse<AwsIntegrationPolicySetting> getAWSIntegrationPolicySettings getAWSIntegrationPolicySettingsWithHttpInfo(GetAWSIntegrationPolicySettingsRequest)

Get AWS integration policy settings

Retrieves the AWS integration policy settings for the authenticated account group. Use this endpoint to audit which AWS resource group types and AWS regions are enabled, and whether CloudTrail is enabled, for Cloud Insights inventory monitoring. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationPolicySettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationPolicySettingsApi apiInstance = new CloudInsightsIntegrationPolicySettingsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationPolicySettingsApi.GetAWSIntegrationPolicySettingsRequest request = CloudInsightsIntegrationPolicySettingsApi.GetAWSIntegrationPolicySettingsRequest.builder()
                .aid(aid)
                .build();
            ApiResponse<AwsIntegrationPolicySetting> response = apiInstance.getAWSIntegrationPolicySettingsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationPolicySettingsApi#getAWSIntegrationPolicySettings");
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
| request | [**GetAWSIntegrationPolicySettingsRequest**](CloudInsightsIntegrationPolicySettingsApi.md#GetAWSIntegrationPolicySettingsRequest)|-|-|

### Return type

ApiResponse<[**AwsIntegrationPolicySetting**](AwsIntegrationPolicySetting.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | AWS integration policy settings returned successfully. |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |


<a id="GetAWSIntegrationPolicySettingsRequest"></a>
## GetAWSIntegrationPolicySettingsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getAzureIntegrationPolicySettings

> AzureIntegrationPolicySetting getAzureIntegrationPolicySettings(GetAzureIntegrationPolicySettingsRequest)

Get Azure integration policy settings

Retrieves the Azure integration policy settings for the authenticated account group. Use this endpoint to review which Azure resource group types are monitored and inspect the subscriptions policy rules that gate which subscriptions ThousandEyes inventories. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationPolicySettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationPolicySettingsApi apiInstance = new CloudInsightsIntegrationPolicySettingsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationPolicySettingsApi.GetAzureIntegrationPolicySettingsRequest request = CloudInsightsIntegrationPolicySettingsApi.GetAzureIntegrationPolicySettingsRequest.builder()
                .aid(aid)
                .build();
            AzureIntegrationPolicySetting result = apiInstance.getAzureIntegrationPolicySettings(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationPolicySettingsApi#getAzureIntegrationPolicySettings");
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
| request | [**GetAzureIntegrationPolicySettingsRequest**](CloudInsightsIntegrationPolicySettingsApi.md#GetAzureIntegrationPolicySettingsRequest)|-|-|

### Return type

[**AzureIntegrationPolicySetting**](AzureIntegrationPolicySetting.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Azure integration policy settings returned successfully. |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |

## getAzureIntegrationPolicySettingsWithHttpInfo

> ApiResponse<AzureIntegrationPolicySetting> getAzureIntegrationPolicySettings getAzureIntegrationPolicySettingsWithHttpInfo(GetAzureIntegrationPolicySettingsRequest)

Get Azure integration policy settings

Retrieves the Azure integration policy settings for the authenticated account group. Use this endpoint to review which Azure resource group types are monitored and inspect the subscriptions policy rules that gate which subscriptions ThousandEyes inventories. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationPolicySettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationPolicySettingsApi apiInstance = new CloudInsightsIntegrationPolicySettingsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationPolicySettingsApi.GetAzureIntegrationPolicySettingsRequest request = CloudInsightsIntegrationPolicySettingsApi.GetAzureIntegrationPolicySettingsRequest.builder()
                .aid(aid)
                .build();
            ApiResponse<AzureIntegrationPolicySetting> response = apiInstance.getAzureIntegrationPolicySettingsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationPolicySettingsApi#getAzureIntegrationPolicySettings");
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
| request | [**GetAzureIntegrationPolicySettingsRequest**](CloudInsightsIntegrationPolicySettingsApi.md#GetAzureIntegrationPolicySettingsRequest)|-|-|

### Return type

ApiResponse<[**AzureIntegrationPolicySetting**](AzureIntegrationPolicySetting.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Azure integration policy settings returned successfully. |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |


<a id="GetAzureIntegrationPolicySettingsRequest"></a>
## GetAzureIntegrationPolicySettingsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## updateAWSIntegrationPolicySettings

> AwsIntegrationPolicySetting updateAWSIntegrationPolicySettings(UpdateAWSIntegrationPolicySettingsRequest)

Update AWS integration policy settings

Updates the AWS integration policy settings for the authenticated account group. This endpoint lets you enable or disable specific AWS resource group types, adjust the set of AWS regions to inventory, and control whether CloudTrail is enabled for inventory monitoring. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationPolicySettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationPolicySettingsApi apiInstance = new CloudInsightsIntegrationPolicySettingsApi(defaultClient);
        AwsIntegrationPolicySetting awsIntegrationPolicySetting = new AwsIntegrationPolicySetting(); // AwsIntegrationPolicySetting | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationPolicySettingsApi.UpdateAWSIntegrationPolicySettingsRequest request = CloudInsightsIntegrationPolicySettingsApi.UpdateAWSIntegrationPolicySettingsRequest.builder()
                .awsIntegrationPolicySetting(awsIntegrationPolicySetting)
                .aid(aid)
                .build();
            AwsIntegrationPolicySetting result = apiInstance.updateAWSIntegrationPolicySettings(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationPolicySettingsApi#updateAWSIntegrationPolicySettings");
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
| request | [**UpdateAWSIntegrationPolicySettingsRequest**](CloudInsightsIntegrationPolicySettingsApi.md#UpdateAWSIntegrationPolicySettingsRequest)|-|-|

### Return type

[**AwsIntegrationPolicySetting**](AwsIntegrationPolicySetting.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | AWS integration policy settings updated successfully. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |

## updateAWSIntegrationPolicySettingsWithHttpInfo

> ApiResponse<AwsIntegrationPolicySetting> updateAWSIntegrationPolicySettings updateAWSIntegrationPolicySettingsWithHttpInfo(UpdateAWSIntegrationPolicySettingsRequest)

Update AWS integration policy settings

Updates the AWS integration policy settings for the authenticated account group. This endpoint lets you enable or disable specific AWS resource group types, adjust the set of AWS regions to inventory, and control whether CloudTrail is enabled for inventory monitoring. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationPolicySettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationPolicySettingsApi apiInstance = new CloudInsightsIntegrationPolicySettingsApi(defaultClient);
        AwsIntegrationPolicySetting awsIntegrationPolicySetting = new AwsIntegrationPolicySetting(); // AwsIntegrationPolicySetting | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationPolicySettingsApi.UpdateAWSIntegrationPolicySettingsRequest request = CloudInsightsIntegrationPolicySettingsApi.UpdateAWSIntegrationPolicySettingsRequest.builder()
                .awsIntegrationPolicySetting(awsIntegrationPolicySetting)
                .aid(aid)
                .build();
            ApiResponse<AwsIntegrationPolicySetting> response = apiInstance.updateAWSIntegrationPolicySettingsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationPolicySettingsApi#updateAWSIntegrationPolicySettings");
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
| request | [**UpdateAWSIntegrationPolicySettingsRequest**](CloudInsightsIntegrationPolicySettingsApi.md#UpdateAWSIntegrationPolicySettingsRequest)|-|-|

### Return type

ApiResponse<[**AwsIntegrationPolicySetting**](AwsIntegrationPolicySetting.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | AWS integration policy settings updated successfully. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |


<a id="UpdateAWSIntegrationPolicySettingsRequest"></a>
## UpdateAWSIntegrationPolicySettingsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **awsIntegrationPolicySetting** | [**AwsIntegrationPolicySetting**](AwsIntegrationPolicySetting.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## updateAzureIntegrationPolicySettings

> AzureIntegrationPolicySetting updateAzureIntegrationPolicySettings(UpdateAzureIntegrationPolicySettingsRequest)

Update Azure integration policy settings

Updates the Azure integration policy settings for the authenticated account group. This endpoint lets you enable or disable Azure resource group types and manage the subscriptions policy (rules plus default action) that controls which Azure subscriptions are inventoried. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationPolicySettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationPolicySettingsApi apiInstance = new CloudInsightsIntegrationPolicySettingsApi(defaultClient);
        AzureIntegrationPolicySetting azureIntegrationPolicySetting = new AzureIntegrationPolicySetting(); // AzureIntegrationPolicySetting | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationPolicySettingsApi.UpdateAzureIntegrationPolicySettingsRequest request = CloudInsightsIntegrationPolicySettingsApi.UpdateAzureIntegrationPolicySettingsRequest.builder()
                .azureIntegrationPolicySetting(azureIntegrationPolicySetting)
                .aid(aid)
                .build();
            AzureIntegrationPolicySetting result = apiInstance.updateAzureIntegrationPolicySettings(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationPolicySettingsApi#updateAzureIntegrationPolicySettings");
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
| request | [**UpdateAzureIntegrationPolicySettingsRequest**](CloudInsightsIntegrationPolicySettingsApi.md#UpdateAzureIntegrationPolicySettingsRequest)|-|-|

### Return type

[**AzureIntegrationPolicySetting**](AzureIntegrationPolicySetting.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Azure integration policy settings updated successfully. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |

## updateAzureIntegrationPolicySettingsWithHttpInfo

> ApiResponse<AzureIntegrationPolicySetting> updateAzureIntegrationPolicySettings updateAzureIntegrationPolicySettingsWithHttpInfo(UpdateAzureIntegrationPolicySettingsRequest)

Update Azure integration policy settings

Updates the Azure integration policy settings for the authenticated account group. This endpoint lets you enable or disable Azure resource group types and manage the subscriptions policy (rules plus default action) that controls which Azure subscriptions are inventoried. 

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationPolicySettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationPolicySettingsApi apiInstance = new CloudInsightsIntegrationPolicySettingsApi(defaultClient);
        AzureIntegrationPolicySetting azureIntegrationPolicySetting = new AzureIntegrationPolicySetting(); // AzureIntegrationPolicySetting | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationPolicySettingsApi.UpdateAzureIntegrationPolicySettingsRequest request = CloudInsightsIntegrationPolicySettingsApi.UpdateAzureIntegrationPolicySettingsRequest.builder()
                .azureIntegrationPolicySetting(azureIntegrationPolicySetting)
                .aid(aid)
                .build();
            ApiResponse<AzureIntegrationPolicySetting> response = apiInstance.updateAzureIntegrationPolicySettingsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationPolicySettingsApi#updateAzureIntegrationPolicySettings");
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
| request | [**UpdateAzureIntegrationPolicySettingsRequest**](CloudInsightsIntegrationPolicySettingsApi.md#UpdateAzureIntegrationPolicySettingsRequest)|-|-|

### Return type

ApiResponse<[**AzureIntegrationPolicySetting**](AzureIntegrationPolicySetting.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Azure integration policy settings updated successfully. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |


<a id="UpdateAzureIntegrationPolicySettingsRequest"></a>
## UpdateAzureIntegrationPolicySettingsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **azureIntegrationPolicySetting** | [**AzureIntegrationPolicySetting**](AzureIntegrationPolicySetting.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |


