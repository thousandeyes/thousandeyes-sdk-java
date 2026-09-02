# CloudInsightsIntegrationsApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAWSFlowLogsMonitoringIntegration**](CloudInsightsIntegrationsApi.md#createAWSFlowLogsMonitoringIntegration) | **POST** /cloud-insights/integration/aws/flow-logs | Create AWS flow logs monitoring integration |
| [**createAWSFlowLogsMonitoringIntegrationWithHttpInfo**](CloudInsightsIntegrationsApi.md#createAWSFlowLogsMonitoringIntegrationWithHttpInfo) | **POST** /cloud-insights/integration/aws/flow-logs | Create AWS flow logs monitoring integration |
| [**createAWSInventoryMonitoringIntegration**](CloudInsightsIntegrationsApi.md#createAWSInventoryMonitoringIntegration) | **POST** /cloud-insights/integration/aws/inventory | Create AWS inventory monitoring integration |
| [**createAWSInventoryMonitoringIntegrationWithHttpInfo**](CloudInsightsIntegrationsApi.md#createAWSInventoryMonitoringIntegrationWithHttpInfo) | **POST** /cloud-insights/integration/aws/inventory | Create AWS inventory monitoring integration |
| [**createAzureFlowLogsMonitoringIntegration**](CloudInsightsIntegrationsApi.md#createAzureFlowLogsMonitoringIntegration) | **POST** /cloud-insights/integration/azure/flow-logs | Create Azure flow logs monitoring integration |
| [**createAzureFlowLogsMonitoringIntegrationWithHttpInfo**](CloudInsightsIntegrationsApi.md#createAzureFlowLogsMonitoringIntegrationWithHttpInfo) | **POST** /cloud-insights/integration/azure/flow-logs | Create Azure flow logs monitoring integration |
| [**createAzureInventoryMonitoringIntegration**](CloudInsightsIntegrationsApi.md#createAzureInventoryMonitoringIntegration) | **POST** /cloud-insights/integration/azure/inventory | Create Azure inventory monitoring integration |
| [**createAzureInventoryMonitoringIntegrationWithHttpInfo**](CloudInsightsIntegrationsApi.md#createAzureInventoryMonitoringIntegrationWithHttpInfo) | **POST** /cloud-insights/integration/azure/inventory | Create Azure inventory monitoring integration |
| [**deleteAwsMonitoringIntegration**](CloudInsightsIntegrationsApi.md#deleteAwsMonitoringIntegration) | **DELETE** /cloud-insights/integration/aws/{integrationId} | Delete AWS integration |
| [**deleteAwsMonitoringIntegrationWithHttpInfo**](CloudInsightsIntegrationsApi.md#deleteAwsMonitoringIntegrationWithHttpInfo) | **DELETE** /cloud-insights/integration/aws/{integrationId} | Delete AWS integration |
| [**deleteAzureMonitoringIntegration**](CloudInsightsIntegrationsApi.md#deleteAzureMonitoringIntegration) | **DELETE** /cloud-insights/integration/azure/{integrationId} | Delete Azure integration |
| [**deleteAzureMonitoringIntegrationWithHttpInfo**](CloudInsightsIntegrationsApi.md#deleteAzureMonitoringIntegrationWithHttpInfo) | **DELETE** /cloud-insights/integration/azure/{integrationId} | Delete Azure integration |
| [**getAWSFlowlogsMonitoringIntegrationPolicies**](CloudInsightsIntegrationsApi.md#getAWSFlowlogsMonitoringIntegrationPolicies) | **GET** /cloud-insights/integration/aws/flow-logs/policies | Get AWS flow logs monitoring IAM policies |
| [**getAWSFlowlogsMonitoringIntegrationPoliciesWithHttpInfo**](CloudInsightsIntegrationsApi.md#getAWSFlowlogsMonitoringIntegrationPoliciesWithHttpInfo) | **GET** /cloud-insights/integration/aws/flow-logs/policies | Get AWS flow logs monitoring IAM policies |
| [**getAWSInventoryMonitoringIntegrationPolicies**](CloudInsightsIntegrationsApi.md#getAWSInventoryMonitoringIntegrationPolicies) | **GET** /cloud-insights/integration/aws/inventory/policies | Get AWS inventory monitoring IAM policies |
| [**getAWSInventoryMonitoringIntegrationPoliciesWithHttpInfo**](CloudInsightsIntegrationsApi.md#getAWSInventoryMonitoringIntegrationPoliciesWithHttpInfo) | **GET** /cloud-insights/integration/aws/inventory/policies | Get AWS inventory monitoring IAM policies |
| [**getAWSMonitoringIntegration**](CloudInsightsIntegrationsApi.md#getAWSMonitoringIntegration) | **GET** /cloud-insights/integration/aws/{integrationId} | Get AWS integration |
| [**getAWSMonitoringIntegrationWithHttpInfo**](CloudInsightsIntegrationsApi.md#getAWSMonitoringIntegrationWithHttpInfo) | **GET** /cloud-insights/integration/aws/{integrationId} | Get AWS integration |
| [**getAllAWSMonitoringIntegrations**](CloudInsightsIntegrationsApi.md#getAllAWSMonitoringIntegrations) | **GET** /cloud-insights/integration/aws | List AWS integrations |
| [**getAllAWSMonitoringIntegrationsWithHttpInfo**](CloudInsightsIntegrationsApi.md#getAllAWSMonitoringIntegrationsWithHttpInfo) | **GET** /cloud-insights/integration/aws | List AWS integrations |
| [**getAllAzureMonitoringIntegrations**](CloudInsightsIntegrationsApi.md#getAllAzureMonitoringIntegrations) | **GET** /cloud-insights/integration/azure | List Azure integrations |
| [**getAllAzureMonitoringIntegrationsWithHttpInfo**](CloudInsightsIntegrationsApi.md#getAllAzureMonitoringIntegrationsWithHttpInfo) | **GET** /cloud-insights/integration/azure | List Azure integrations |
| [**getAzureMonitoringIntegration**](CloudInsightsIntegrationsApi.md#getAzureMonitoringIntegration) | **GET** /cloud-insights/integration/azure/{integrationId} | Get Azure integration |
| [**getAzureMonitoringIntegrationWithHttpInfo**](CloudInsightsIntegrationsApi.md#getAzureMonitoringIntegrationWithHttpInfo) | **GET** /cloud-insights/integration/azure/{integrationId} | Get Azure integration |
| [**updateAzureFlowLogsMonitoringIntegration**](CloudInsightsIntegrationsApi.md#updateAzureFlowLogsMonitoringIntegration) | **PUT** /cloud-insights/integration/azure/flow-logs/{integrationId} | Update Azure flow logs monitoring integration |
| [**updateAzureFlowLogsMonitoringIntegrationWithHttpInfo**](CloudInsightsIntegrationsApi.md#updateAzureFlowLogsMonitoringIntegrationWithHttpInfo) | **PUT** /cloud-insights/integration/azure/flow-logs/{integrationId} | Update Azure flow logs monitoring integration |
| [**updateAzureInventoryMonitoringIntegration**](CloudInsightsIntegrationsApi.md#updateAzureInventoryMonitoringIntegration) | **PUT** /cloud-insights/integration/azure/inventory/{integrationId} | Update Azure inventory monitoring integration |
| [**updateAzureInventoryMonitoringIntegrationWithHttpInfo**](CloudInsightsIntegrationsApi.md#updateAzureInventoryMonitoringIntegrationWithHttpInfo) | **PUT** /cloud-insights/integration/azure/inventory/{integrationId} | Update Azure inventory monitoring integration |



## createAWSFlowLogsMonitoringIntegration

> AwsMonitoringIntegration createAWSFlowLogsMonitoringIntegration(CreateAWSFlowLogsMonitoringIntegrationRequest)

Create AWS flow logs monitoring integration

Creates a new AWS flow logs monitoring integration.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationsApi apiInstance = new CloudInsightsIntegrationsApi(defaultClient);
        AwsFlowLogsIntegrationRequest awsFlowLogsIntegrationRequest = new AwsFlowLogsIntegrationRequest(); // AwsFlowLogsIntegrationRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationsApi.CreateAWSFlowLogsMonitoringIntegrationRequest request = CloudInsightsIntegrationsApi.CreateAWSFlowLogsMonitoringIntegrationRequest.builder()
                .awsFlowLogsIntegrationRequest(awsFlowLogsIntegrationRequest)
                .aid(aid)
                .build();
            AwsMonitoringIntegration result = apiInstance.createAWSFlowLogsMonitoringIntegration(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationsApi#createAWSFlowLogsMonitoringIntegration");
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
| request | [**CreateAWSFlowLogsMonitoringIntegrationRequest**](CloudInsightsIntegrationsApi.md#CreateAWSFlowLogsMonitoringIntegrationRequest)|-|-|

### Return type

[**AwsMonitoringIntegration**](AwsMonitoringIntegration.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | AWS flow logs monitoring integration created successfully. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |

## createAWSFlowLogsMonitoringIntegrationWithHttpInfo

> ApiResponse<AwsMonitoringIntegration> createAWSFlowLogsMonitoringIntegration createAWSFlowLogsMonitoringIntegrationWithHttpInfo(CreateAWSFlowLogsMonitoringIntegrationRequest)

Create AWS flow logs monitoring integration

Creates a new AWS flow logs monitoring integration.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationsApi apiInstance = new CloudInsightsIntegrationsApi(defaultClient);
        AwsFlowLogsIntegrationRequest awsFlowLogsIntegrationRequest = new AwsFlowLogsIntegrationRequest(); // AwsFlowLogsIntegrationRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationsApi.CreateAWSFlowLogsMonitoringIntegrationRequest request = CloudInsightsIntegrationsApi.CreateAWSFlowLogsMonitoringIntegrationRequest.builder()
                .awsFlowLogsIntegrationRequest(awsFlowLogsIntegrationRequest)
                .aid(aid)
                .build();
            ApiResponse<AwsMonitoringIntegration> response = apiInstance.createAWSFlowLogsMonitoringIntegrationWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationsApi#createAWSFlowLogsMonitoringIntegration");
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
| request | [**CreateAWSFlowLogsMonitoringIntegrationRequest**](CloudInsightsIntegrationsApi.md#CreateAWSFlowLogsMonitoringIntegrationRequest)|-|-|

### Return type

ApiResponse<[**AwsMonitoringIntegration**](AwsMonitoringIntegration.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | AWS flow logs monitoring integration created successfully. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |


<a id="CreateAWSFlowLogsMonitoringIntegrationRequest"></a>
## CreateAWSFlowLogsMonitoringIntegrationRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **awsFlowLogsIntegrationRequest** | [**AwsFlowLogsIntegrationRequest**](AwsFlowLogsIntegrationRequest.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## createAWSInventoryMonitoringIntegration

> AwsMonitoringIntegration createAWSInventoryMonitoringIntegration(CreateAWSInventoryMonitoringIntegrationRequest)

Create AWS inventory monitoring integration

Creates a new AWS inventory monitoring integration.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationsApi apiInstance = new CloudInsightsIntegrationsApi(defaultClient);
        AwsInventoryIntegrationRequest awsInventoryIntegrationRequest = new AwsInventoryIntegrationRequest(); // AwsInventoryIntegrationRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationsApi.CreateAWSInventoryMonitoringIntegrationRequest request = CloudInsightsIntegrationsApi.CreateAWSInventoryMonitoringIntegrationRequest.builder()
                .awsInventoryIntegrationRequest(awsInventoryIntegrationRequest)
                .aid(aid)
                .build();
            AwsMonitoringIntegration result = apiInstance.createAWSInventoryMonitoringIntegration(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationsApi#createAWSInventoryMonitoringIntegration");
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
| request | [**CreateAWSInventoryMonitoringIntegrationRequest**](CloudInsightsIntegrationsApi.md#CreateAWSInventoryMonitoringIntegrationRequest)|-|-|

### Return type

[**AwsMonitoringIntegration**](AwsMonitoringIntegration.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | AWS inventory monitoring integration created successfully. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |

## createAWSInventoryMonitoringIntegrationWithHttpInfo

> ApiResponse<AwsMonitoringIntegration> createAWSInventoryMonitoringIntegration createAWSInventoryMonitoringIntegrationWithHttpInfo(CreateAWSInventoryMonitoringIntegrationRequest)

Create AWS inventory monitoring integration

Creates a new AWS inventory monitoring integration.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationsApi apiInstance = new CloudInsightsIntegrationsApi(defaultClient);
        AwsInventoryIntegrationRequest awsInventoryIntegrationRequest = new AwsInventoryIntegrationRequest(); // AwsInventoryIntegrationRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationsApi.CreateAWSInventoryMonitoringIntegrationRequest request = CloudInsightsIntegrationsApi.CreateAWSInventoryMonitoringIntegrationRequest.builder()
                .awsInventoryIntegrationRequest(awsInventoryIntegrationRequest)
                .aid(aid)
                .build();
            ApiResponse<AwsMonitoringIntegration> response = apiInstance.createAWSInventoryMonitoringIntegrationWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationsApi#createAWSInventoryMonitoringIntegration");
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
| request | [**CreateAWSInventoryMonitoringIntegrationRequest**](CloudInsightsIntegrationsApi.md#CreateAWSInventoryMonitoringIntegrationRequest)|-|-|

### Return type

ApiResponse<[**AwsMonitoringIntegration**](AwsMonitoringIntegration.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | AWS inventory monitoring integration created successfully. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |


<a id="CreateAWSInventoryMonitoringIntegrationRequest"></a>
## CreateAWSInventoryMonitoringIntegrationRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **awsInventoryIntegrationRequest** | [**AwsInventoryIntegrationRequest**](AwsInventoryIntegrationRequest.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## createAzureFlowLogsMonitoringIntegration

> AzureMonitoringIntegration createAzureFlowLogsMonitoringIntegration(CreateAzureFlowLogsMonitoringIntegrationRequest)

Create Azure flow logs monitoring integration

Creates a new Azure flow logs monitoring integration.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationsApi apiInstance = new CloudInsightsIntegrationsApi(defaultClient);
        AzureFlowLogsIntegrationRequest azureFlowLogsIntegrationRequest = new AzureFlowLogsIntegrationRequest(); // AzureFlowLogsIntegrationRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationsApi.CreateAzureFlowLogsMonitoringIntegrationRequest request = CloudInsightsIntegrationsApi.CreateAzureFlowLogsMonitoringIntegrationRequest.builder()
                .azureFlowLogsIntegrationRequest(azureFlowLogsIntegrationRequest)
                .aid(aid)
                .build();
            AzureMonitoringIntegration result = apiInstance.createAzureFlowLogsMonitoringIntegration(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationsApi#createAzureFlowLogsMonitoringIntegration");
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
| request | [**CreateAzureFlowLogsMonitoringIntegrationRequest**](CloudInsightsIntegrationsApi.md#CreateAzureFlowLogsMonitoringIntegrationRequest)|-|-|

### Return type

[**AzureMonitoringIntegration**](AzureMonitoringIntegration.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Azure flow logs monitoring integration created successfully. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |

## createAzureFlowLogsMonitoringIntegrationWithHttpInfo

> ApiResponse<AzureMonitoringIntegration> createAzureFlowLogsMonitoringIntegration createAzureFlowLogsMonitoringIntegrationWithHttpInfo(CreateAzureFlowLogsMonitoringIntegrationRequest)

Create Azure flow logs monitoring integration

Creates a new Azure flow logs monitoring integration.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationsApi apiInstance = new CloudInsightsIntegrationsApi(defaultClient);
        AzureFlowLogsIntegrationRequest azureFlowLogsIntegrationRequest = new AzureFlowLogsIntegrationRequest(); // AzureFlowLogsIntegrationRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationsApi.CreateAzureFlowLogsMonitoringIntegrationRequest request = CloudInsightsIntegrationsApi.CreateAzureFlowLogsMonitoringIntegrationRequest.builder()
                .azureFlowLogsIntegrationRequest(azureFlowLogsIntegrationRequest)
                .aid(aid)
                .build();
            ApiResponse<AzureMonitoringIntegration> response = apiInstance.createAzureFlowLogsMonitoringIntegrationWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationsApi#createAzureFlowLogsMonitoringIntegration");
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
| request | [**CreateAzureFlowLogsMonitoringIntegrationRequest**](CloudInsightsIntegrationsApi.md#CreateAzureFlowLogsMonitoringIntegrationRequest)|-|-|

### Return type

ApiResponse<[**AzureMonitoringIntegration**](AzureMonitoringIntegration.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Azure flow logs monitoring integration created successfully. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |


<a id="CreateAzureFlowLogsMonitoringIntegrationRequest"></a>
## CreateAzureFlowLogsMonitoringIntegrationRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **azureFlowLogsIntegrationRequest** | [**AzureFlowLogsIntegrationRequest**](AzureFlowLogsIntegrationRequest.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## createAzureInventoryMonitoringIntegration

> AzureMonitoringIntegration createAzureInventoryMonitoringIntegration(CreateAzureInventoryMonitoringIntegrationRequest)

Create Azure inventory monitoring integration

Creates a new Azure inventory monitoring integration.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationsApi apiInstance = new CloudInsightsIntegrationsApi(defaultClient);
        AzureInventoryIntegrationRequest azureInventoryIntegrationRequest = new AzureInventoryIntegrationRequest(); // AzureInventoryIntegrationRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationsApi.CreateAzureInventoryMonitoringIntegrationRequest request = CloudInsightsIntegrationsApi.CreateAzureInventoryMonitoringIntegrationRequest.builder()
                .azureInventoryIntegrationRequest(azureInventoryIntegrationRequest)
                .aid(aid)
                .build();
            AzureMonitoringIntegration result = apiInstance.createAzureInventoryMonitoringIntegration(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationsApi#createAzureInventoryMonitoringIntegration");
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
| request | [**CreateAzureInventoryMonitoringIntegrationRequest**](CloudInsightsIntegrationsApi.md#CreateAzureInventoryMonitoringIntegrationRequest)|-|-|

### Return type

[**AzureMonitoringIntegration**](AzureMonitoringIntegration.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Azure inventory monitoring integration created successfully. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |

## createAzureInventoryMonitoringIntegrationWithHttpInfo

> ApiResponse<AzureMonitoringIntegration> createAzureInventoryMonitoringIntegration createAzureInventoryMonitoringIntegrationWithHttpInfo(CreateAzureInventoryMonitoringIntegrationRequest)

Create Azure inventory monitoring integration

Creates a new Azure inventory monitoring integration.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationsApi apiInstance = new CloudInsightsIntegrationsApi(defaultClient);
        AzureInventoryIntegrationRequest azureInventoryIntegrationRequest = new AzureInventoryIntegrationRequest(); // AzureInventoryIntegrationRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationsApi.CreateAzureInventoryMonitoringIntegrationRequest request = CloudInsightsIntegrationsApi.CreateAzureInventoryMonitoringIntegrationRequest.builder()
                .azureInventoryIntegrationRequest(azureInventoryIntegrationRequest)
                .aid(aid)
                .build();
            ApiResponse<AzureMonitoringIntegration> response = apiInstance.createAzureInventoryMonitoringIntegrationWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationsApi#createAzureInventoryMonitoringIntegration");
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
| request | [**CreateAzureInventoryMonitoringIntegrationRequest**](CloudInsightsIntegrationsApi.md#CreateAzureInventoryMonitoringIntegrationRequest)|-|-|

### Return type

ApiResponse<[**AzureMonitoringIntegration**](AzureMonitoringIntegration.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Azure inventory monitoring integration created successfully. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |


<a id="CreateAzureInventoryMonitoringIntegrationRequest"></a>
## CreateAzureInventoryMonitoringIntegrationRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **azureInventoryIntegrationRequest** | [**AzureInventoryIntegrationRequest**](AzureInventoryIntegrationRequest.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## deleteAwsMonitoringIntegration

> void deleteAwsMonitoringIntegration(DeleteAwsMonitoringIntegrationRequest)

Delete AWS integration

Deletes a specific AWS inventory or flow logs monitoring integration using the AWS integration ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationsApi apiInstance = new CloudInsightsIntegrationsApi(defaultClient);
        UUID integrationId = UUID.fromString("e9c3bf02-a48c-4aa8-9e5f-898800d6f569"); // UUID | The unique ID of the AWS or Azure inventory or flow logs monitoring integration.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationsApi.DeleteAwsMonitoringIntegrationRequest request = CloudInsightsIntegrationsApi.DeleteAwsMonitoringIntegrationRequest.builder()
                .integrationId(integrationId)
                .aid(aid)
                .build();
            apiInstance.deleteAwsMonitoringIntegration(request);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationsApi#deleteAwsMonitoringIntegration");
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
| request | [**DeleteAwsMonitoringIntegrationRequest**](CloudInsightsIntegrationsApi.md#DeleteAwsMonitoringIntegrationRequest)|-|-|

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

## deleteAwsMonitoringIntegrationWithHttpInfo

> ApiResponse<Void> deleteAwsMonitoringIntegration deleteAwsMonitoringIntegrationWithHttpInfo(DeleteAwsMonitoringIntegrationRequest)

Delete AWS integration

Deletes a specific AWS inventory or flow logs monitoring integration using the AWS integration ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationsApi apiInstance = new CloudInsightsIntegrationsApi(defaultClient);
        UUID integrationId = UUID.fromString("e9c3bf02-a48c-4aa8-9e5f-898800d6f569"); // UUID | The unique ID of the AWS or Azure inventory or flow logs monitoring integration.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationsApi.DeleteAwsMonitoringIntegrationRequest request = CloudInsightsIntegrationsApi.DeleteAwsMonitoringIntegrationRequest.builder()
                .integrationId(integrationId)
                .aid(aid)
                .build();
            ApiResponse<Void> response = apiInstance.deleteAwsMonitoringIntegrationWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationsApi#deleteAwsMonitoringIntegration");
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
| request | [**DeleteAwsMonitoringIntegrationRequest**](CloudInsightsIntegrationsApi.md#DeleteAwsMonitoringIntegrationRequest)|-|-|

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


<a id="DeleteAwsMonitoringIntegrationRequest"></a>
## DeleteAwsMonitoringIntegrationRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **integrationId** | **UUID** | The unique ID of the AWS or Azure inventory or flow logs monitoring integration. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## deleteAzureMonitoringIntegration

> void deleteAzureMonitoringIntegration(DeleteAzureMonitoringIntegrationRequest)

Delete Azure integration

Deletes a specific Azure inventory or flow logs monitoring integration using the Azure integration ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationsApi apiInstance = new CloudInsightsIntegrationsApi(defaultClient);
        UUID integrationId = UUID.fromString("e9c3bf02-a48c-4aa8-9e5f-898800d6f569"); // UUID | The unique ID of the AWS or Azure inventory or flow logs monitoring integration.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationsApi.DeleteAzureMonitoringIntegrationRequest request = CloudInsightsIntegrationsApi.DeleteAzureMonitoringIntegrationRequest.builder()
                .integrationId(integrationId)
                .aid(aid)
                .build();
            apiInstance.deleteAzureMonitoringIntegration(request);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationsApi#deleteAzureMonitoringIntegration");
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
| request | [**DeleteAzureMonitoringIntegrationRequest**](CloudInsightsIntegrationsApi.md#DeleteAzureMonitoringIntegrationRequest)|-|-|

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

## deleteAzureMonitoringIntegrationWithHttpInfo

> ApiResponse<Void> deleteAzureMonitoringIntegration deleteAzureMonitoringIntegrationWithHttpInfo(DeleteAzureMonitoringIntegrationRequest)

Delete Azure integration

Deletes a specific Azure inventory or flow logs monitoring integration using the Azure integration ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationsApi apiInstance = new CloudInsightsIntegrationsApi(defaultClient);
        UUID integrationId = UUID.fromString("e9c3bf02-a48c-4aa8-9e5f-898800d6f569"); // UUID | The unique ID of the AWS or Azure inventory or flow logs monitoring integration.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationsApi.DeleteAzureMonitoringIntegrationRequest request = CloudInsightsIntegrationsApi.DeleteAzureMonitoringIntegrationRequest.builder()
                .integrationId(integrationId)
                .aid(aid)
                .build();
            ApiResponse<Void> response = apiInstance.deleteAzureMonitoringIntegrationWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationsApi#deleteAzureMonitoringIntegration");
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
| request | [**DeleteAzureMonitoringIntegrationRequest**](CloudInsightsIntegrationsApi.md#DeleteAzureMonitoringIntegrationRequest)|-|-|

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


<a id="DeleteAzureMonitoringIntegrationRequest"></a>
## DeleteAzureMonitoringIntegrationRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **integrationId** | **UUID** | The unique ID of the AWS or Azure inventory or flow logs monitoring integration. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getAWSFlowlogsMonitoringIntegrationPolicies

> String getAWSFlowlogsMonitoringIntegrationPolicies(GetAWSFlowlogsMonitoringIntegrationPoliciesRequest)

Get AWS flow logs monitoring IAM policies

Retrieves the AWS IAM policies required to configure an AWS flow logs monitoring integration in JSON string format for the authenticated account group.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationsApi apiInstance = new CloudInsightsIntegrationsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationsApi.GetAWSFlowlogsMonitoringIntegrationPoliciesRequest request = CloudInsightsIntegrationsApi.GetAWSFlowlogsMonitoringIntegrationPoliciesRequest.builder()
                .aid(aid)
                .build();
            String result = apiInstance.getAWSFlowlogsMonitoringIntegrationPolicies(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationsApi#getAWSFlowlogsMonitoringIntegrationPolicies");
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
| request | [**GetAWSFlowlogsMonitoringIntegrationPoliciesRequest**](CloudInsightsIntegrationsApi.md#GetAWSFlowlogsMonitoringIntegrationPoliciesRequest)|-|-|

### Return type

**String**


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response contains a JSON object with the following policy documents under the policies key: 1) Trusted Policy — defines the trust relationship that allows ThousandEyes to assume a specified AWS IAM role via sts:AssumeRole. This includes the Principal ARN for ThousandEyes and the required ExternalId condition for secure cross-account access; 2) Permissions Policy — grants ThousandEyes read-only access to the Amazon S3 buckets where flow logs are stored. The policy includes permissions such as s3:GetObject and s3:ListBucket, scoped to the relevant flow log S3 bucket ARNs; 3) SNS Topic Access Policy — allows ThousandEyes to subscribe to Amazon SNS topics that receive flow log delivery notifications. It also enables the S3 service to publish events to those topics, ensuring ThousandEyes can be notified of new log data. This policy includes permissions for both SNS:Subscribe (for ThousandEyes) and SNS:Publish (for S3 event notifications). Use these policies when configuring the IAM role and SNS topic permissions required by ThousandEyes Cloud Insights to collect and monitor AWS flow logs data across your account. The response is returned as a JSON string in the policies object.  |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |

## getAWSFlowlogsMonitoringIntegrationPoliciesWithHttpInfo

> ApiResponse<String> getAWSFlowlogsMonitoringIntegrationPolicies getAWSFlowlogsMonitoringIntegrationPoliciesWithHttpInfo(GetAWSFlowlogsMonitoringIntegrationPoliciesRequest)

Get AWS flow logs monitoring IAM policies

Retrieves the AWS IAM policies required to configure an AWS flow logs monitoring integration in JSON string format for the authenticated account group.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationsApi apiInstance = new CloudInsightsIntegrationsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationsApi.GetAWSFlowlogsMonitoringIntegrationPoliciesRequest request = CloudInsightsIntegrationsApi.GetAWSFlowlogsMonitoringIntegrationPoliciesRequest.builder()
                .aid(aid)
                .build();
            ApiResponse<String> response = apiInstance.getAWSFlowlogsMonitoringIntegrationPoliciesWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationsApi#getAWSFlowlogsMonitoringIntegrationPolicies");
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
| request | [**GetAWSFlowlogsMonitoringIntegrationPoliciesRequest**](CloudInsightsIntegrationsApi.md#GetAWSFlowlogsMonitoringIntegrationPoliciesRequest)|-|-|

### Return type

ApiResponse<**String**>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response contains a JSON object with the following policy documents under the policies key: 1) Trusted Policy — defines the trust relationship that allows ThousandEyes to assume a specified AWS IAM role via sts:AssumeRole. This includes the Principal ARN for ThousandEyes and the required ExternalId condition for secure cross-account access; 2) Permissions Policy — grants ThousandEyes read-only access to the Amazon S3 buckets where flow logs are stored. The policy includes permissions such as s3:GetObject and s3:ListBucket, scoped to the relevant flow log S3 bucket ARNs; 3) SNS Topic Access Policy — allows ThousandEyes to subscribe to Amazon SNS topics that receive flow log delivery notifications. It also enables the S3 service to publish events to those topics, ensuring ThousandEyes can be notified of new log data. This policy includes permissions for both SNS:Subscribe (for ThousandEyes) and SNS:Publish (for S3 event notifications). Use these policies when configuring the IAM role and SNS topic permissions required by ThousandEyes Cloud Insights to collect and monitor AWS flow logs data across your account. The response is returned as a JSON string in the policies object.  |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |


<a id="GetAWSFlowlogsMonitoringIntegrationPoliciesRequest"></a>
## GetAWSFlowlogsMonitoringIntegrationPoliciesRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getAWSInventoryMonitoringIntegrationPolicies

> String getAWSInventoryMonitoringIntegrationPolicies(GetAWSInventoryMonitoringIntegrationPoliciesRequest)

Get AWS inventory monitoring IAM policies

Retrieves the AWS IAM policies required to configure an AWS inventory monitoring integration in JSON string format for the authenticated account group.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationsApi apiInstance = new CloudInsightsIntegrationsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationsApi.GetAWSInventoryMonitoringIntegrationPoliciesRequest request = CloudInsightsIntegrationsApi.GetAWSInventoryMonitoringIntegrationPoliciesRequest.builder()
                .aid(aid)
                .build();
            String result = apiInstance.getAWSInventoryMonitoringIntegrationPolicies(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationsApi#getAWSInventoryMonitoringIntegrationPolicies");
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
| request | [**GetAWSInventoryMonitoringIntegrationPoliciesRequest**](CloudInsightsIntegrationsApi.md#GetAWSInventoryMonitoringIntegrationPoliciesRequest)|-|-|

### Return type

**String**


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response includes a JSON object containing two key policy documents: 1) Trusted Policy — defines the trust relationship that allows ThousandEyes to assume a specified AWS IAM role through sts:AssumeRole. This policy includes the Principal ARN for ThousandEyes and the required ExternalId condition; 2) Permissions Policy — lists the AWS service-level read permissions needed by ThousandEyes Cloud Insights to inventory network resources. These permissions cover services such as EC2, VPC, Transit Gateway, Direct Connect, CloudFront, ELB, CloudTrail, ECS/EKS, and S3. Use these policies when creating or updating the IAM role that ThousandEyes will use for inventory monitoring. The response is returned as a JSON string in the policies object.  |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |

## getAWSInventoryMonitoringIntegrationPoliciesWithHttpInfo

> ApiResponse<String> getAWSInventoryMonitoringIntegrationPolicies getAWSInventoryMonitoringIntegrationPoliciesWithHttpInfo(GetAWSInventoryMonitoringIntegrationPoliciesRequest)

Get AWS inventory monitoring IAM policies

Retrieves the AWS IAM policies required to configure an AWS inventory monitoring integration in JSON string format for the authenticated account group.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationsApi apiInstance = new CloudInsightsIntegrationsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationsApi.GetAWSInventoryMonitoringIntegrationPoliciesRequest request = CloudInsightsIntegrationsApi.GetAWSInventoryMonitoringIntegrationPoliciesRequest.builder()
                .aid(aid)
                .build();
            ApiResponse<String> response = apiInstance.getAWSInventoryMonitoringIntegrationPoliciesWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationsApi#getAWSInventoryMonitoringIntegrationPolicies");
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
| request | [**GetAWSInventoryMonitoringIntegrationPoliciesRequest**](CloudInsightsIntegrationsApi.md#GetAWSInventoryMonitoringIntegrationPoliciesRequest)|-|-|

### Return type

ApiResponse<**String**>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response includes a JSON object containing two key policy documents: 1) Trusted Policy — defines the trust relationship that allows ThousandEyes to assume a specified AWS IAM role through sts:AssumeRole. This policy includes the Principal ARN for ThousandEyes and the required ExternalId condition; 2) Permissions Policy — lists the AWS service-level read permissions needed by ThousandEyes Cloud Insights to inventory network resources. These permissions cover services such as EC2, VPC, Transit Gateway, Direct Connect, CloudFront, ELB, CloudTrail, ECS/EKS, and S3. Use these policies when creating or updating the IAM role that ThousandEyes will use for inventory monitoring. The response is returned as a JSON string in the policies object.  |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |


<a id="GetAWSInventoryMonitoringIntegrationPoliciesRequest"></a>
## GetAWSInventoryMonitoringIntegrationPoliciesRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getAWSMonitoringIntegration

> AwsMonitoringIntegration getAWSMonitoringIntegration(GetAWSMonitoringIntegrationRequest)

Get AWS integration

Retrieves details for a specific AWS inventory or flow logs monitoring integration associated with the authenticated account group using the unique integration ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationsApi apiInstance = new CloudInsightsIntegrationsApi(defaultClient);
        UUID integrationId = UUID.fromString("e9c3bf02-a48c-4aa8-9e5f-898800d6f569"); // UUID | The unique ID of the AWS or Azure inventory or flow logs monitoring integration.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationsApi.GetAWSMonitoringIntegrationRequest request = CloudInsightsIntegrationsApi.GetAWSMonitoringIntegrationRequest.builder()
                .integrationId(integrationId)
                .aid(aid)
                .build();
            AwsMonitoringIntegration result = apiInstance.getAWSMonitoringIntegration(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationsApi#getAWSMonitoringIntegration");
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
| request | [**GetAWSMonitoringIntegrationRequest**](CloudInsightsIntegrationsApi.md#GetAWSMonitoringIntegrationRequest)|-|-|

### Return type

[**AwsMonitoringIntegration**](AwsMonitoringIntegration.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response contains a single integration object representing either: AWS inventory monitoring integration or AWS flow logs monitoring integration. Each integration includes metadata that defines its configuration: id — the unique identifier of the integration; name — the user-defined name of the integration; roleArn — the AWS IAM role ARN that ThousandEyes assumes to access your AWS resources; externalId — the external identifier used for secure cross-account role assumption; monitoringType — identifies whether the integration monitors AWS inventory (inventory-monitoring) or flow logs (flow-logs-monitoring); snsTopicsArns — a list of SNS topic ARNs associated with flow logs monitoring (only present for flow-logs-monitoring integrations); links — HAL-style link relations that include a self URL pointing to this integration resource. This endpoint is typically used to: retrieve detailed configuration information for a specific AWS integration, verify that the integration is correctly set up and associated with the expected AWS IAM role, and obtain integration details before performing deletion or troubleshooting operations.  |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |

## getAWSMonitoringIntegrationWithHttpInfo

> ApiResponse<AwsMonitoringIntegration> getAWSMonitoringIntegration getAWSMonitoringIntegrationWithHttpInfo(GetAWSMonitoringIntegrationRequest)

Get AWS integration

Retrieves details for a specific AWS inventory or flow logs monitoring integration associated with the authenticated account group using the unique integration ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationsApi apiInstance = new CloudInsightsIntegrationsApi(defaultClient);
        UUID integrationId = UUID.fromString("e9c3bf02-a48c-4aa8-9e5f-898800d6f569"); // UUID | The unique ID of the AWS or Azure inventory or flow logs monitoring integration.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationsApi.GetAWSMonitoringIntegrationRequest request = CloudInsightsIntegrationsApi.GetAWSMonitoringIntegrationRequest.builder()
                .integrationId(integrationId)
                .aid(aid)
                .build();
            ApiResponse<AwsMonitoringIntegration> response = apiInstance.getAWSMonitoringIntegrationWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationsApi#getAWSMonitoringIntegration");
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
| request | [**GetAWSMonitoringIntegrationRequest**](CloudInsightsIntegrationsApi.md#GetAWSMonitoringIntegrationRequest)|-|-|

### Return type

ApiResponse<[**AwsMonitoringIntegration**](AwsMonitoringIntegration.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response contains a single integration object representing either: AWS inventory monitoring integration or AWS flow logs monitoring integration. Each integration includes metadata that defines its configuration: id — the unique identifier of the integration; name — the user-defined name of the integration; roleArn — the AWS IAM role ARN that ThousandEyes assumes to access your AWS resources; externalId — the external identifier used for secure cross-account role assumption; monitoringType — identifies whether the integration monitors AWS inventory (inventory-monitoring) or flow logs (flow-logs-monitoring); snsTopicsArns — a list of SNS topic ARNs associated with flow logs monitoring (only present for flow-logs-monitoring integrations); links — HAL-style link relations that include a self URL pointing to this integration resource. This endpoint is typically used to: retrieve detailed configuration information for a specific AWS integration, verify that the integration is correctly set up and associated with the expected AWS IAM role, and obtain integration details before performing deletion or troubleshooting operations.  |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |


<a id="GetAWSMonitoringIntegrationRequest"></a>
## GetAWSMonitoringIntegrationRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **integrationId** | **UUID** | The unique ID of the AWS or Azure inventory or flow logs monitoring integration. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getAllAWSMonitoringIntegrations

> AwsMonitoringIntegrations getAllAWSMonitoringIntegrations(GetAllAWSMonitoringIntegrationsRequest)

List AWS integrations

Retrieves all AWS inventory and flow logs monitoring integrations configured for the authenticated account group in ThousandEyes.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationsApi apiInstance = new CloudInsightsIntegrationsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationsApi.GetAllAWSMonitoringIntegrationsRequest request = CloudInsightsIntegrationsApi.GetAllAWSMonitoringIntegrationsRequest.builder()
                .aid(aid)
                .build();
            AwsMonitoringIntegrations result = apiInstance.getAllAWSMonitoringIntegrations(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationsApi#getAllAWSMonitoringIntegrations");
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
| request | [**GetAllAWSMonitoringIntegrationsRequest**](CloudInsightsIntegrationsApi.md#GetAllAWSMonitoringIntegrationsRequest)|-|-|

### Return type

[**AwsMonitoringIntegrations**](AwsMonitoringIntegrations.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response is an array of integration objects, where each object represents either an Inventory Monitoring or Flow Logs Monitoring integration. Each integration includes metadata such as: id — the unique identifier of the integration; name — the user-defined name of the integration; roleArn — the AWS IAM role ARN that ThousandEyes assumes to access your AWS resources; externalId — the external identifier used for secure cross-account role assumption; monitoringType — specifies whether the integration monitors AWS inventory (inventory-monitoring) or flow logs (flow-logs-monitoring); snsTopicsArns — a list of SNS topic ARNs used for flow logs monitoring (only present for flow logs monitoring integrations); links — HAL-style link relations that provide the \&quot;self\&quot; URL for retrieving integration details. This endpoint can be used to: audit all existing AWS integrations configured for Cloud Insights, identify which integrations are set up for inventory versus flow logs monitoring, and retrieve integration IDs for further API operations such as inspection (GET /cloud-insights/integration/aws/{integrationId}) or deletion (DELETE). The response is returned as a JSON array conforming to the AwsMonitoringIntegration schema.  |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |

## getAllAWSMonitoringIntegrationsWithHttpInfo

> ApiResponse<AwsMonitoringIntegrations> getAllAWSMonitoringIntegrations getAllAWSMonitoringIntegrationsWithHttpInfo(GetAllAWSMonitoringIntegrationsRequest)

List AWS integrations

Retrieves all AWS inventory and flow logs monitoring integrations configured for the authenticated account group in ThousandEyes.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationsApi apiInstance = new CloudInsightsIntegrationsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationsApi.GetAllAWSMonitoringIntegrationsRequest request = CloudInsightsIntegrationsApi.GetAllAWSMonitoringIntegrationsRequest.builder()
                .aid(aid)
                .build();
            ApiResponse<AwsMonitoringIntegrations> response = apiInstance.getAllAWSMonitoringIntegrationsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationsApi#getAllAWSMonitoringIntegrations");
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
| request | [**GetAllAWSMonitoringIntegrationsRequest**](CloudInsightsIntegrationsApi.md#GetAllAWSMonitoringIntegrationsRequest)|-|-|

### Return type

ApiResponse<[**AwsMonitoringIntegrations**](AwsMonitoringIntegrations.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response is an array of integration objects, where each object represents either an Inventory Monitoring or Flow Logs Monitoring integration. Each integration includes metadata such as: id — the unique identifier of the integration; name — the user-defined name of the integration; roleArn — the AWS IAM role ARN that ThousandEyes assumes to access your AWS resources; externalId — the external identifier used for secure cross-account role assumption; monitoringType — specifies whether the integration monitors AWS inventory (inventory-monitoring) or flow logs (flow-logs-monitoring); snsTopicsArns — a list of SNS topic ARNs used for flow logs monitoring (only present for flow logs monitoring integrations); links — HAL-style link relations that provide the \&quot;self\&quot; URL for retrieving integration details. This endpoint can be used to: audit all existing AWS integrations configured for Cloud Insights, identify which integrations are set up for inventory versus flow logs monitoring, and retrieve integration IDs for further API operations such as inspection (GET /cloud-insights/integration/aws/{integrationId}) or deletion (DELETE). The response is returned as a JSON array conforming to the AwsMonitoringIntegration schema.  |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |


<a id="GetAllAWSMonitoringIntegrationsRequest"></a>
## GetAllAWSMonitoringIntegrationsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getAllAzureMonitoringIntegrations

> AzureMonitoringIntegrations getAllAzureMonitoringIntegrations(GetAllAzureMonitoringIntegrationsRequest)

List Azure integrations

Retrieves all Azure inventory and flow logs monitoring integrations configured for the authenticated account group in ThousandEyes.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationsApi apiInstance = new CloudInsightsIntegrationsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationsApi.GetAllAzureMonitoringIntegrationsRequest request = CloudInsightsIntegrationsApi.GetAllAzureMonitoringIntegrationsRequest.builder()
                .aid(aid)
                .build();
            AzureMonitoringIntegrations result = apiInstance.getAllAzureMonitoringIntegrations(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationsApi#getAllAzureMonitoringIntegrations");
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
| request | [**GetAllAzureMonitoringIntegrationsRequest**](CloudInsightsIntegrationsApi.md#GetAllAzureMonitoringIntegrationsRequest)|-|-|

### Return type

[**AzureMonitoringIntegrations**](AzureMonitoringIntegrations.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response is an array of integration objects, where each object represents either an Azure Inventory Monitoring or Azure Flow Logs Monitoring integration. Each integration includes metadata such as: id — the unique identifier of the integration; name — the user-defined name of the integration; appId / clientId — the Azure Application (client) ID of the service principal used for authentication; password / clientSecret — the client secret value associated with the service principal (note: for security reasons, the actual secret is never returned. The response includes a masked value (\&quot;********\&quot;) instead); azureTenantId — the Azure Active Directory tenant ID associated with the integration; serviceBusQueueUrl — the Service Bus queue URL used for flow logs monitoring (only present for azure-flow-logs-monitoring integrations); monitoringType — specifies whether the integration monitors Azure resources (azure-inventory-monitoring) or Azure flow logs (azure-flow-logs-monitoring); links — HAL-style link relations that provide the \&quot;self\&quot; URL for retrieving integration details. This endpoint can be used to: audit all existing Azure integrations configured for Cloud Insights, identify which integrations are configured for inventory versus flow logs monitoring, and retrieve integration IDs for further API operations such as inspection (GET /cloud-insights/integration/azure/{integrationId}) or deletion (DELETE). The response is returned as a JSON array conforming to the AwsMonitoringIntegration schema.  |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |

## getAllAzureMonitoringIntegrationsWithHttpInfo

> ApiResponse<AzureMonitoringIntegrations> getAllAzureMonitoringIntegrations getAllAzureMonitoringIntegrationsWithHttpInfo(GetAllAzureMonitoringIntegrationsRequest)

List Azure integrations

Retrieves all Azure inventory and flow logs monitoring integrations configured for the authenticated account group in ThousandEyes.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationsApi apiInstance = new CloudInsightsIntegrationsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationsApi.GetAllAzureMonitoringIntegrationsRequest request = CloudInsightsIntegrationsApi.GetAllAzureMonitoringIntegrationsRequest.builder()
                .aid(aid)
                .build();
            ApiResponse<AzureMonitoringIntegrations> response = apiInstance.getAllAzureMonitoringIntegrationsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationsApi#getAllAzureMonitoringIntegrations");
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
| request | [**GetAllAzureMonitoringIntegrationsRequest**](CloudInsightsIntegrationsApi.md#GetAllAzureMonitoringIntegrationsRequest)|-|-|

### Return type

ApiResponse<[**AzureMonitoringIntegrations**](AzureMonitoringIntegrations.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response is an array of integration objects, where each object represents either an Azure Inventory Monitoring or Azure Flow Logs Monitoring integration. Each integration includes metadata such as: id — the unique identifier of the integration; name — the user-defined name of the integration; appId / clientId — the Azure Application (client) ID of the service principal used for authentication; password / clientSecret — the client secret value associated with the service principal (note: for security reasons, the actual secret is never returned. The response includes a masked value (\&quot;********\&quot;) instead); azureTenantId — the Azure Active Directory tenant ID associated with the integration; serviceBusQueueUrl — the Service Bus queue URL used for flow logs monitoring (only present for azure-flow-logs-monitoring integrations); monitoringType — specifies whether the integration monitors Azure resources (azure-inventory-monitoring) or Azure flow logs (azure-flow-logs-monitoring); links — HAL-style link relations that provide the \&quot;self\&quot; URL for retrieving integration details. This endpoint can be used to: audit all existing Azure integrations configured for Cloud Insights, identify which integrations are configured for inventory versus flow logs monitoring, and retrieve integration IDs for further API operations such as inspection (GET /cloud-insights/integration/azure/{integrationId}) or deletion (DELETE). The response is returned as a JSON array conforming to the AwsMonitoringIntegration schema.  |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |


<a id="GetAllAzureMonitoringIntegrationsRequest"></a>
## GetAllAzureMonitoringIntegrationsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getAzureMonitoringIntegration

> AzureMonitoringIntegration getAzureMonitoringIntegration(GetAzureMonitoringIntegrationRequest)

Get Azure integration

Retrieves details for a specific Azure inventory or flow logs monitoring integration associated with the authenticated account group using the unique integration ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationsApi apiInstance = new CloudInsightsIntegrationsApi(defaultClient);
        UUID integrationId = UUID.fromString("e9c3bf02-a48c-4aa8-9e5f-898800d6f569"); // UUID | The unique ID of the AWS or Azure inventory or flow logs monitoring integration.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationsApi.GetAzureMonitoringIntegrationRequest request = CloudInsightsIntegrationsApi.GetAzureMonitoringIntegrationRequest.builder()
                .integrationId(integrationId)
                .aid(aid)
                .build();
            AzureMonitoringIntegration result = apiInstance.getAzureMonitoringIntegration(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationsApi#getAzureMonitoringIntegration");
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
| request | [**GetAzureMonitoringIntegrationRequest**](CloudInsightsIntegrationsApi.md#GetAzureMonitoringIntegrationRequest)|-|-|

### Return type

[**AzureMonitoringIntegration**](AzureMonitoringIntegration.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response contains a single integration object representing either: Azure Inventory Monitoring integration or Azure Flow Logs Monitoring integration. Each integration includes metadata that defines its configuration: id — the unique identifier of the integration; name — the user-defined name of the integration; appId / clientId — the Azure Application (client) ID of the service principal used for authentication; password / clientSecret — the client secret value associated with the service principal (note: for security reasons, the actual secret is never returned. The response includes a masked value (\&quot;********\&quot;) instead; azureTenantId — the Azure Active Directory tenant ID for the integration; serviceBusQueueUrl — the Service Bus queue URL used for receiving Flow Logs (only present for azure-flow-logs-monitoring integrations); monitoringType — identifies whether the integration monitors Azure resources (azure-inventory-monitoring) or flow logs (azure-flow-logs-monitoring); links — HAL-style link relations that include a \&quot;self\&quot; URL pointing to this integration resource. This endpoint is typically used to: retrieve detailed configuration information for a specific Azure integration, validate that the integration credentials and type (inventory or flow logs) are correctly configured, and obtain integration details before performing update or deletion operations.  |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |

## getAzureMonitoringIntegrationWithHttpInfo

> ApiResponse<AzureMonitoringIntegration> getAzureMonitoringIntegration getAzureMonitoringIntegrationWithHttpInfo(GetAzureMonitoringIntegrationRequest)

Get Azure integration

Retrieves details for a specific Azure inventory or flow logs monitoring integration associated with the authenticated account group using the unique integration ID.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationsApi apiInstance = new CloudInsightsIntegrationsApi(defaultClient);
        UUID integrationId = UUID.fromString("e9c3bf02-a48c-4aa8-9e5f-898800d6f569"); // UUID | The unique ID of the AWS or Azure inventory or flow logs monitoring integration.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationsApi.GetAzureMonitoringIntegrationRequest request = CloudInsightsIntegrationsApi.GetAzureMonitoringIntegrationRequest.builder()
                .integrationId(integrationId)
                .aid(aid)
                .build();
            ApiResponse<AzureMonitoringIntegration> response = apiInstance.getAzureMonitoringIntegrationWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationsApi#getAzureMonitoringIntegration");
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
| request | [**GetAzureMonitoringIntegrationRequest**](CloudInsightsIntegrationsApi.md#GetAzureMonitoringIntegrationRequest)|-|-|

### Return type

ApiResponse<[**AzureMonitoringIntegration**](AzureMonitoringIntegration.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response contains a single integration object representing either: Azure Inventory Monitoring integration or Azure Flow Logs Monitoring integration. Each integration includes metadata that defines its configuration: id — the unique identifier of the integration; name — the user-defined name of the integration; appId / clientId — the Azure Application (client) ID of the service principal used for authentication; password / clientSecret — the client secret value associated with the service principal (note: for security reasons, the actual secret is never returned. The response includes a masked value (\&quot;********\&quot;) instead; azureTenantId — the Azure Active Directory tenant ID for the integration; serviceBusQueueUrl — the Service Bus queue URL used for receiving Flow Logs (only present for azure-flow-logs-monitoring integrations); monitoringType — identifies whether the integration monitors Azure resources (azure-inventory-monitoring) or flow logs (azure-flow-logs-monitoring); links — HAL-style link relations that include a \&quot;self\&quot; URL pointing to this integration resource. This endpoint is typically used to: retrieve detailed configuration information for a specific Azure integration, validate that the integration credentials and type (inventory or flow logs) are correctly configured, and obtain integration details before performing update or deletion operations.  |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |


<a id="GetAzureMonitoringIntegrationRequest"></a>
## GetAzureMonitoringIntegrationRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **integrationId** | **UUID** | The unique ID of the AWS or Azure inventory or flow logs monitoring integration. | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## updateAzureFlowLogsMonitoringIntegration

> AzureMonitoringIntegration updateAzureFlowLogsMonitoringIntegration(UpdateAzureFlowLogsMonitoringIntegrationRequest)

Update Azure flow logs monitoring integration

Updates an existing Azure flow logs monitoring integration.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationsApi apiInstance = new CloudInsightsIntegrationsApi(defaultClient);
        UUID integrationId = UUID.fromString("e9c3bf02-a48c-4aa8-9e5f-898800d6f569"); // UUID | The unique ID of the AWS or Azure inventory or flow logs monitoring integration.
        AzureFlowLogsIntegrationRequest azureFlowLogsIntegrationRequest = new AzureFlowLogsIntegrationRequest(); // AzureFlowLogsIntegrationRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationsApi.UpdateAzureFlowLogsMonitoringIntegrationRequest request = CloudInsightsIntegrationsApi.UpdateAzureFlowLogsMonitoringIntegrationRequest.builder()
                .integrationId(integrationId)
                .azureFlowLogsIntegrationRequest(azureFlowLogsIntegrationRequest)
                .aid(aid)
                .build();
            AzureMonitoringIntegration result = apiInstance.updateAzureFlowLogsMonitoringIntegration(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationsApi#updateAzureFlowLogsMonitoringIntegration");
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
| request | [**UpdateAzureFlowLogsMonitoringIntegrationRequest**](CloudInsightsIntegrationsApi.md#UpdateAzureFlowLogsMonitoringIntegrationRequest)|-|-|

### Return type

[**AzureMonitoringIntegration**](AzureMonitoringIntegration.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Azure flow logs monitoring integration updated successfully. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |

## updateAzureFlowLogsMonitoringIntegrationWithHttpInfo

> ApiResponse<AzureMonitoringIntegration> updateAzureFlowLogsMonitoringIntegration updateAzureFlowLogsMonitoringIntegrationWithHttpInfo(UpdateAzureFlowLogsMonitoringIntegrationRequest)

Update Azure flow logs monitoring integration

Updates an existing Azure flow logs monitoring integration.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationsApi apiInstance = new CloudInsightsIntegrationsApi(defaultClient);
        UUID integrationId = UUID.fromString("e9c3bf02-a48c-4aa8-9e5f-898800d6f569"); // UUID | The unique ID of the AWS or Azure inventory or flow logs monitoring integration.
        AzureFlowLogsIntegrationRequest azureFlowLogsIntegrationRequest = new AzureFlowLogsIntegrationRequest(); // AzureFlowLogsIntegrationRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationsApi.UpdateAzureFlowLogsMonitoringIntegrationRequest request = CloudInsightsIntegrationsApi.UpdateAzureFlowLogsMonitoringIntegrationRequest.builder()
                .integrationId(integrationId)
                .azureFlowLogsIntegrationRequest(azureFlowLogsIntegrationRequest)
                .aid(aid)
                .build();
            ApiResponse<AzureMonitoringIntegration> response = apiInstance.updateAzureFlowLogsMonitoringIntegrationWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationsApi#updateAzureFlowLogsMonitoringIntegration");
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
| request | [**UpdateAzureFlowLogsMonitoringIntegrationRequest**](CloudInsightsIntegrationsApi.md#UpdateAzureFlowLogsMonitoringIntegrationRequest)|-|-|

### Return type

ApiResponse<[**AzureMonitoringIntegration**](AzureMonitoringIntegration.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Azure flow logs monitoring integration updated successfully. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |


<a id="UpdateAzureFlowLogsMonitoringIntegrationRequest"></a>
## UpdateAzureFlowLogsMonitoringIntegrationRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **integrationId** | **UUID** | The unique ID of the AWS or Azure inventory or flow logs monitoring integration. | |
| **azureFlowLogsIntegrationRequest** | [**AzureFlowLogsIntegrationRequest**](AzureFlowLogsIntegrationRequest.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## updateAzureInventoryMonitoringIntegration

> AzureMonitoringIntegration updateAzureInventoryMonitoringIntegration(UpdateAzureInventoryMonitoringIntegrationRequest)

Update Azure inventory monitoring integration

Updates an existing Azure inventory monitoring integration.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationsApi apiInstance = new CloudInsightsIntegrationsApi(defaultClient);
        UUID integrationId = UUID.fromString("e9c3bf02-a48c-4aa8-9e5f-898800d6f569"); // UUID | The unique ID of the AWS or Azure inventory or flow logs monitoring integration.
        AzureInventoryIntegrationRequest azureInventoryIntegrationRequest = new AzureInventoryIntegrationRequest(); // AzureInventoryIntegrationRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationsApi.UpdateAzureInventoryMonitoringIntegrationRequest request = CloudInsightsIntegrationsApi.UpdateAzureInventoryMonitoringIntegrationRequest.builder()
                .integrationId(integrationId)
                .azureInventoryIntegrationRequest(azureInventoryIntegrationRequest)
                .aid(aid)
                .build();
            AzureMonitoringIntegration result = apiInstance.updateAzureInventoryMonitoringIntegration(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationsApi#updateAzureInventoryMonitoringIntegration");
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
| request | [**UpdateAzureInventoryMonitoringIntegrationRequest**](CloudInsightsIntegrationsApi.md#UpdateAzureInventoryMonitoringIntegrationRequest)|-|-|

### Return type

[**AzureMonitoringIntegration**](AzureMonitoringIntegration.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Azure inventory monitoring integration updated successfully. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |

## updateAzureInventoryMonitoringIntegrationWithHttpInfo

> ApiResponse<AzureMonitoringIntegration> updateAzureInventoryMonitoringIntegration updateAzureInventoryMonitoringIntegrationWithHttpInfo(UpdateAzureInventoryMonitoringIntegrationRequest)

Update Azure inventory monitoring integration

Updates an existing Azure inventory monitoring integration.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.cloudinsights.Configuration;
import com.thousandeyes.sdk.cloudinsights.authentication.*;
import com.thousandeyes.sdk.cloudinsights.integrations.model.*;
import com.thousandeyes.sdk.cloudinsights.integrations.CloudInsightsIntegrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        CloudInsightsIntegrationsApi apiInstance = new CloudInsightsIntegrationsApi(defaultClient);
        UUID integrationId = UUID.fromString("e9c3bf02-a48c-4aa8-9e5f-898800d6f569"); // UUID | The unique ID of the AWS or Azure inventory or flow logs monitoring integration.
        AzureInventoryIntegrationRequest azureInventoryIntegrationRequest = new AzureInventoryIntegrationRequest(); // AzureInventoryIntegrationRequest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            CloudInsightsIntegrationsApi.UpdateAzureInventoryMonitoringIntegrationRequest request = CloudInsightsIntegrationsApi.UpdateAzureInventoryMonitoringIntegrationRequest.builder()
                .integrationId(integrationId)
                .azureInventoryIntegrationRequest(azureInventoryIntegrationRequest)
                .aid(aid)
                .build();
            ApiResponse<AzureMonitoringIntegration> response = apiInstance.updateAzureInventoryMonitoringIntegrationWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudInsightsIntegrationsApi#updateAzureInventoryMonitoringIntegration");
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
| request | [**UpdateAzureInventoryMonitoringIntegrationRequest**](CloudInsightsIntegrationsApi.md#UpdateAzureInventoryMonitoringIntegrationRequest)|-|-|

### Return type

ApiResponse<[**AzureMonitoringIntegration**](AzureMonitoringIntegration.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Azure inventory monitoring integration updated successfully. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |


<a id="UpdateAzureInventoryMonitoringIntegrationRequest"></a>
## UpdateAzureInventoryMonitoringIntegrationRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **integrationId** | **UUID** | The unique ID of the AWS or Azure inventory or flow logs monitoring integration. | |
| **azureInventoryIntegrationRequest** | [**AzureInventoryIntegrationRequest**](AzureInventoryIntegrationRequest.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |


