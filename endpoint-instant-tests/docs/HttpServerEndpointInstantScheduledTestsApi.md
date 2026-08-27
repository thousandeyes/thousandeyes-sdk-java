# HttpServerEndpointInstantScheduledTestsApi

All URIs are relative to *https://api.thousandeyes.com/v7*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createHttpServerScheduledInstantTest**](HttpServerEndpointInstantScheduledTestsApi.md#createHttpServerScheduledInstantTest) | **POST** /endpoint/tests/scheduled-tests/http-server/instant | Run http server instant scheduled test |
| [**createHttpServerScheduledInstantTestWithHttpInfo**](HttpServerEndpointInstantScheduledTestsApi.md#createHttpServerScheduledInstantTestWithHttpInfo) | **POST** /endpoint/tests/scheduled-tests/http-server/instant | Run http server instant scheduled test |



## createHttpServerScheduledInstantTest

> EndpointHttpServerTest createHttpServerScheduledInstantTest(CreateHttpServerScheduledInstantTestRequest)

Run http server instant scheduled test

Creates and runs a new endpoint http server instant scheduled test in ThousandEyes.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.endpoint.tests.Configuration;
import com.thousandeyes.sdk.endpoint.tests.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.instant.model.*;
import com.thousandeyes.sdk.endpoint.tests.instant.HttpServerEndpointInstantScheduledTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        HttpServerEndpointInstantScheduledTestsApi apiInstance = new HttpServerEndpointInstantScheduledTestsApi(defaultClient);
        EndpointHttpServerInstantTest endpointHttpServerInstantTest = new EndpointHttpServerInstantTest(); // EndpointHttpServerInstantTest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            HttpServerEndpointInstantScheduledTestsApi.CreateHttpServerScheduledInstantTestRequest request = HttpServerEndpointInstantScheduledTestsApi.CreateHttpServerScheduledInstantTestRequest.builder()
                .endpointHttpServerInstantTest(endpointHttpServerInstantTest)
                .aid(aid)
                .build();
            EndpointHttpServerTest result = apiInstance.createHttpServerScheduledInstantTest(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HttpServerEndpointInstantScheduledTestsApi#createHttpServerScheduledInstantTest");
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
| request | [**CreateHttpServerScheduledInstantTestRequest**](HttpServerEndpointInstantScheduledTestsApi.md#CreateHttpServerScheduledInstantTestRequest)|-|-|

### Return type

[**EndpointHttpServerTest**](EndpointHttpServerTest.md)


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
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |

## createHttpServerScheduledInstantTestWithHttpInfo

> ApiResponse<EndpointHttpServerTest> createHttpServerScheduledInstantTest createHttpServerScheduledInstantTestWithHttpInfo(CreateHttpServerScheduledInstantTestRequest)

Run http server instant scheduled test

Creates and runs a new endpoint http server instant scheduled test in ThousandEyes.

### Example

```java
// Import classes:
import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.common.ApiException;
import com.thousandeyes.sdk.common.ApiResponse;
import com.thousandeyes.sdk.endpoint.tests.Configuration;
import com.thousandeyes.sdk.endpoint.tests.authentication.*;
import com.thousandeyes.sdk.endpoint.tests.instant.model.*;
import com.thousandeyes.sdk.endpoint.tests.instant.HttpServerEndpointInstantScheduledTestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com/v7");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        HttpServerEndpointInstantScheduledTestsApi apiInstance = new HttpServerEndpointInstantScheduledTestsApi(defaultClient);
        EndpointHttpServerInstantTest endpointHttpServerInstantTest = new EndpointHttpServerInstantTest(); // EndpointHttpServerInstantTest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            HttpServerEndpointInstantScheduledTestsApi.CreateHttpServerScheduledInstantTestRequest request = HttpServerEndpointInstantScheduledTestsApi.CreateHttpServerScheduledInstantTestRequest.builder()
                .endpointHttpServerInstantTest(endpointHttpServerInstantTest)
                .aid(aid)
                .build();
            ApiResponse<EndpointHttpServerTest> response = apiInstance.createHttpServerScheduledInstantTestWithHttpInfo(request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling HttpServerEndpointInstantScheduledTestsApi#createHttpServerScheduledInstantTest");
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
| request | [**CreateHttpServerScheduledInstantTestRequest**](HttpServerEndpointInstantScheduledTestsApi.md#CreateHttpServerScheduledInstantTestRequest)|-|-|

### Return type

ApiResponse<[**EndpointHttpServerTest**](EndpointHttpServerTest.md)>


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
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |


<a id="CreateHttpServerScheduledInstantTestRequest"></a>
## CreateHttpServerScheduledInstantTestRequest
### Properties

|     Name      |    Type       | Description   |     Notes    |
| ------------- | ------------- | ------------- | -------------|
| **endpointHttpServerInstantTest** | [**EndpointHttpServerInstantTest**](EndpointHttpServerInstantTest.md) |  | |
| **aid** | **String** | A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |


