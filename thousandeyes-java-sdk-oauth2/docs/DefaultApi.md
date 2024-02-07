# DefaultApi

All URIs are relative to *https://api.thousandeyes.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v7Oauth2TokenPost**](DefaultApi.md#v7Oauth2TokenPost) | **POST** /v7/oauth2/token | Create and return access token. |
| [**v7Oauth2TokenPostWithHttpInfo**](DefaultApi.md#v7Oauth2TokenPostWithHttpInfo) | **POST** /v7/oauth2/token | Create and return access token. |



## v7Oauth2TokenPost

> AccessToken v7Oauth2TokenPost(clientId, clientSecret, grantType, scope)

Create and return access token.

This endpoint uses the client credentials passed alongside the request to create a new access token and return it to the client.

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.Configuration;
import com.thousandeyes.api.authentication.*;
import com.thousandeyes.api.models.*;
import com.thousandeyes.api.oauth2.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure OAuth2 access token for authorization: application
        OAuth application = (OAuth) defaultClient.getAuthentication("application");
        application.setAccessToken("YOUR ACCESS TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String clientId = "clientId_example"; // String | The Application ID.
        String clientSecret = "clientSecret_example"; // String | The application secret that was generated for you during the app registration. The Basic auth pattern of instead providing credentials in the Authorization header, per RFC 6749 is also supported.
        String grantType = "grantType_example"; // String | Must be set to `client_credentials`.
        String scope = "scope_example"; // String | Requested scope values for the new access token.
        try {
            AccessToken result = apiInstance.v7Oauth2TokenPost(clientId, clientSecret, grantType, scope);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#v7Oauth2TokenPost");
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
| **clientId** | **String**| The Application ID. | [optional] |
| **clientSecret** | **String**| The application secret that was generated for you during the app registration. The Basic auth pattern of instead providing credentials in the Authorization header, per RFC 6749 is also supported. | [optional] |
| **grantType** | **String**| Must be set to &#x60;client_credentials&#x60;. | [optional] |
| **scope** | **String**| Requested scope values for the new access token. | [optional] |

### Return type

[**AccessToken**](AccessToken.md)


### Authorization

[application](../README.md#application)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **429** | Exhausted rate limit for the organization |  -  |

## v7Oauth2TokenPostWithHttpInfo

> ApiResponse<AccessToken> v7Oauth2TokenPost v7Oauth2TokenPostWithHttpInfo(clientId, clientSecret, grantType, scope)

Create and return access token.

This endpoint uses the client credentials passed alongside the request to create a new access token and return it to the client.

### Example

```java
// Import classes:
import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.common.ApiException;
import com.thousandeyes.api.common.ApiResponse;
import com.thousandeyes.api.Configuration;
import com.thousandeyes.api.authentication.*;
import com.thousandeyes.api.models.*;
import com.thousandeyes.api.oauth2.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.thousandeyes.com");
        
        // Configure OAuth2 access token for authorization: application
        OAuth application = (OAuth) defaultClient.getAuthentication("application");
        application.setAccessToken("YOUR ACCESS TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String clientId = "clientId_example"; // String | The Application ID.
        String clientSecret = "clientSecret_example"; // String | The application secret that was generated for you during the app registration. The Basic auth pattern of instead providing credentials in the Authorization header, per RFC 6749 is also supported.
        String grantType = "grantType_example"; // String | Must be set to `client_credentials`.
        String scope = "scope_example"; // String | Requested scope values for the new access token.
        try {
            ApiResponse<AccessToken> response = apiInstance.v7Oauth2TokenPostWithHttpInfo(clientId, clientSecret, grantType, scope);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#v7Oauth2TokenPost");
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
| **clientId** | **String**| The Application ID. | [optional] |
| **clientSecret** | **String**| The application secret that was generated for you during the app registration. The Basic auth pattern of instead providing credentials in the Authorization header, per RFC 6749 is also supported. | [optional] |
| **grantType** | **String**| Must be set to &#x60;client_credentials&#x60;. | [optional] |
| **scope** | **String**| Requested scope values for the new access token. | [optional] |

### Return type

ApiResponse<[**AccessToken**](AccessToken.md)>


### Authorization

[application](../README.md#application)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **429** | Exhausted rate limit for the organization |  -  |

