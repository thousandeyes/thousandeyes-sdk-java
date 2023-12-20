# WaniOnboardingApi

All URIs are relative to *http://api.thousandeyes.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateWanInsightsForOverlayUsingPOST**](WaniOnboardingApi.md#activateWanInsightsForOverlayUsingPOST) | **POST** /api/v1/wan-insights/activations | Activate WANI overlay |
| [**getActivationStatusUsingGET**](WaniOnboardingApi.md#getActivationStatusUsingGET) | **GET** /api/v1/wan-insights/activations/{activationId} | Activation Request Status Endpoint |


<a id="activateWanInsightsForOverlayUsingPOST"></a>
# **activateWanInsightsForOverlayUsingPOST**
> ActivationResponse activateWanInsightsForOverlayUsingPOST(activationRequest)

Activate WANI overlay

Creates a tenant for overlay and assigns the tenant to an organization

### Example
```java
// Import classes:
import com.thousandeyes.api.wan.ApiClient;
import com.thousandeyes.api.wan.ApiException;
import com.thousandeyes.api.wan.Configuration;
import com.thousandeyes.api.wan.models.*;
import com.thousandeyes.api.wan.insights.WaniOnboardingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.thousandeyes.com");

    WaniOnboardingApi apiInstance = new WaniOnboardingApi(defaultClient);
    ActivationRequest activationRequest = new ActivationRequest(); // ActivationRequest | activationRequest
    try {
      ActivationResponse result = apiInstance.activateWanInsightsForOverlayUsingPOST(activationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaniOnboardingApi#activateWanInsightsForOverlayUsingPOST");
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
| **activationRequest** | [**ActivationRequest**](ActivationRequest.md)| activationRequest | |

### Return type

[**ActivationResponse**](ActivationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="getActivationStatusUsingGET"></a>
# **getActivationStatusUsingGET**
> ActivationResponse getActivationStatusUsingGET(activationId)

Activation Request Status Endpoint

Provides the status of an activation request along with the sharelink status

### Example
```java
// Import classes:
import com.thousandeyes.api.wan.ApiClient;
import com.thousandeyes.api.wan.ApiException;
import com.thousandeyes.api.wan.Configuration;
import com.thousandeyes.api.wan.models.*;
import com.thousandeyes.api.wan.insights.WaniOnboardingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.thousandeyes.com");

    WaniOnboardingApi apiInstance = new WaniOnboardingApi(defaultClient);
    String activationId = "activationId_example"; // String | Activation ID returned in the response of the activation request
    try {
      ActivationResponse result = apiInstance.getActivationStatusUsingGET(activationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaniOnboardingApi#getActivationStatusUsingGET");
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
| **activationId** | **String**| Activation ID returned in the response of the activation request | |

### Return type

[**ActivationResponse**](ActivationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | When the organization doesn&#39;t exist |  -  |

