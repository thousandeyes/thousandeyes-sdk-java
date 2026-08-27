# EmulationApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEmulatedDevice**](EmulationApi.md#createEmulatedDevice) | **POST** /emulated-devices | Create emulated device |
| [**createEmulatedDeviceWithHttpInfo**](EmulationApi.md#createEmulatedDeviceWithHttpInfo) | **POST** /emulated-devices | Create emulated device |
| [**getEmulatedDevices**](EmulationApi.md#getEmulatedDevices) | **GET** /emulated-devices | List emulated devices |
| [**getEmulatedDevicesWithHttpInfo**](EmulationApi.md#getEmulatedDevicesWithHttpInfo) | **GET** /emulated-devices | List emulated devices |
| [**getUserAgents**](EmulationApi.md#getUserAgents) | **GET** /user-agents | List user-agents |
| [**getUserAgentsWithHttpInfo**](EmulationApi.md#getUserAgentsWithHttpInfo) | **GET** /user-agents | List user-agents |



## createEmulatedDevice

> EmulatedDeviceResponse createEmulatedDevice(CreateEmulatedDeviceRequest)

Create emulated device

Creates a new device for emulation.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.emulation.model.*;
import com.thousandeyes.sdk.emulation.EmulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EmulationApi apiInstance = new EmulationApi(defaultClient);
        EmulatedDevice emulatedDevice = new EmulatedDevice(); // EmulatedDevice | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            EmulationApi.CreateEmulatedDeviceRequest request = EmulationApi.CreateEmulatedDeviceRequest.builder()
                .emulatedDevice(emulatedDevice)
                .aid(aid)
                .build();
            EmulatedDeviceResponse result = apiInstance.createEmulatedDevice(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmulationApi#createEmulatedDevice");
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
| request | [**CreateEmulatedDeviceRequest**](EmulationApi.md#CreateEmulatedDeviceRequest)|-|-|

### Return type

[**EmulatedDeviceResponse**](EmulatedDeviceResponse.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |

## createEmulatedDeviceWithHttpInfo

> ApiResponse<EmulatedDeviceResponse> createEmulatedDevice createEmulatedDeviceWithHttpInfo(CreateEmulatedDeviceRequest)

Create emulated device

Creates a new device for emulation.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.emulation.model.*;
import com.thousandeyes.sdk.emulation.EmulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EmulationApi apiInstance = new EmulationApi(defaultClient);
        EmulatedDevice emulatedDevice = new EmulatedDevice(); // EmulatedDevice | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            EmulationApi.CreateEmulatedDeviceRequest request = EmulationApi.CreateEmulatedDeviceRequest.builder()
                .emulatedDevice(emulatedDevice)
                .aid(aid)
                .build();
            ApiResponse<EmulatedDeviceResponse> response = apiInstance.createEmulatedDeviceWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EmulationApi#createEmulatedDevice");
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
| request | [**CreateEmulatedDeviceRequest**](EmulationApi.md#CreateEmulatedDeviceRequest)|-|-|

### Return type

ApiResponse<[**EmulatedDeviceResponse**](EmulatedDeviceResponse.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |


<a id="CreateEmulatedDeviceRequest"></a>
## CreateEmulatedDeviceRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **emulatedDevice** | [**EmulatedDevice**](EmulatedDevice.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |



## getEmulatedDevices

> EmulatedDeviceResponses getEmulatedDevices(GetEmulatedDevicesRequest)

List emulated devices

Retrieves a list of emulated devices available for browser tests.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.emulation.model.*;
import com.thousandeyes.sdk.emulation.EmulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EmulationApi apiInstance = new EmulationApi(defaultClient);
        List<ExpandEmulatedDeviceOptions> expand = Arrays.asList(); // List<ExpandEmulatedDeviceOptions> | Optional query parameter that controls whether user-agent templates are included in the response. By default, user-agent templates are not included. To include them, add `?expand=user-agent` to the request. 
        try {
            EmulationApi.GetEmulatedDevicesRequest request = EmulationApi.GetEmulatedDevicesRequest.builder()
                .expand(expand)
                .build();
            EmulatedDeviceResponses result = apiInstance.getEmulatedDevices(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmulationApi#getEmulatedDevices");
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
| request | [**GetEmulatedDevicesRequest**](EmulationApi.md#GetEmulatedDevicesRequest)|-|-|

### Return type

[**EmulatedDeviceResponses**](EmulatedDeviceResponses.md)


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

## getEmulatedDevicesWithHttpInfo

> ApiResponse<EmulatedDeviceResponses> getEmulatedDevices getEmulatedDevicesWithHttpInfo(GetEmulatedDevicesRequest)

List emulated devices

Retrieves a list of emulated devices available for browser tests.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.emulation.model.*;
import com.thousandeyes.sdk.emulation.EmulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EmulationApi apiInstance = new EmulationApi(defaultClient);
        List<ExpandEmulatedDeviceOptions> expand = Arrays.asList(); // List<ExpandEmulatedDeviceOptions> | Optional query parameter that controls whether user-agent templates are included in the response. By default, user-agent templates are not included. To include them, add `?expand=user-agent` to the request. 
        try {
            EmulationApi.GetEmulatedDevicesRequest request = EmulationApi.GetEmulatedDevicesRequest.builder()
                .expand(expand)
                .build();
            ApiResponse<EmulatedDeviceResponses> response = apiInstance.getEmulatedDevicesWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EmulationApi#getEmulatedDevices");
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
| request | [**GetEmulatedDevicesRequest**](EmulationApi.md#GetEmulatedDevicesRequest)|-|-|

### Return type

ApiResponse<[**EmulatedDeviceResponses**](EmulatedDeviceResponses.md)>


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


<a id="GetEmulatedDevicesRequest"></a>
## GetEmulatedDevicesRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **expand** | [**List&lt;ExpandEmulatedDeviceOptions&gt;**](ExpandEmulatedDeviceOptions.md) | Optional query parameter that controls whether user-agent templates are included in the response. By default, user-agent templates are not included. To include them, add &#x60;?expand&#x3D;user-agent&#x60; to the request.  | [optional] |



## getUserAgents

> UserAgents getUserAgents(GetUserAgentsRequest)

List user-agents

Retrieves a list of user-agent strings.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.emulation.model.*;
import com.thousandeyes.sdk.emulation.EmulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EmulationApi apiInstance = new EmulationApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            EmulationApi.GetUserAgentsRequest request = EmulationApi.GetUserAgentsRequest.builder()
                .aid(aid)
                .build();
            UserAgents result = apiInstance.getUserAgents(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmulationApi#getUserAgents");
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
| request | [**GetUserAgentsRequest**](EmulationApi.md#GetUserAgentsRequest)|-|-|

### Return type

[**UserAgents**](UserAgents.md)


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

## getUserAgentsWithHttpInfo

> ApiResponse<UserAgents> getUserAgents getUserAgentsWithHttpInfo(GetUserAgentsRequest)

List user-agents

Retrieves a list of user-agent strings.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.Configuration;
import com.thousandeyes.sdk.authentication.*;
import com.thousandeyes.sdk.emulation.model.*;
import com.thousandeyes.sdk.emulation.EmulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        EmulationApi apiInstance = new EmulationApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            EmulationApi.GetUserAgentsRequest request = EmulationApi.GetUserAgentsRequest.builder()
                .aid(aid)
                .build();
            ApiResponse<UserAgents> response = apiInstance.getUserAgentsWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EmulationApi#getUserAgents");
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
| request | [**GetUserAgentsRequest**](EmulationApi.md#GetUserAgentsRequest)|-|-|

### Return type

ApiResponse<[**UserAgents**](UserAgents.md)>


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


<a id="GetUserAgentsRequest"></a>
## GetUserAgentsRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |


