# TestTemplateEndpointsApi

All URIs are relative to *https://api.thousandeyes.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTestTemplate**](TestTemplateEndpointsApi.md#createTestTemplate) | **POST** /v7/tests/templates | Create a test template. |
| [**deleteTestTemplate**](TestTemplateEndpointsApi.md#deleteTestTemplate) | **DELETE** /v7/tests/templates/{id} | Delete a test template |
| [**deployUserTemplate**](TestTemplateEndpointsApi.md#deployUserTemplate) | **POST** /v7/tests/templates/{id}/deploy | Deploy a test template. |
| [**getUserOrgTestTemplate**](TestTemplateEndpointsApi.md#getUserOrgTestTemplate) | **GET** /v7/tests/templates/{id} | Retrieve a test template |
| [**getUserOrgTestTemplates**](TestTemplateEndpointsApi.md#getUserOrgTestTemplates) | **GET** /v7/tests/templates | List all test templates. |
| [**updateTestTemplate**](TestTemplateEndpointsApi.md#updateTestTemplate) | **PUT** /v7/tests/templates/{id} | Update a test template |


<a id="createTestTemplate"></a>
# **createTestTemplate**
> TestTemplate createTestTemplate(testTemplateUpsert, aid)

Create a test template.

Creates a test template.

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.TestTemplateEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    TestTemplateEndpointsApi apiInstance = new TestTemplateEndpointsApi(defaultClient);
    TestTemplateUpsert testTemplateUpsert = new TestTemplateUpsert(); // TestTemplateUpsert | The test template to create or update.
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      TestTemplate result = apiInstance.createTestTemplate(testTemplateUpsert, aid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestTemplateEndpointsApi#createTestTemplate");
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
| **testTemplateUpsert** | [**TestTemplateUpsert**](TestTemplateUpsert.md)| The test template to create or update. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**TestTemplate**](TestTemplate.md)

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="deleteTestTemplate"></a>
# **deleteTestTemplate**
> deleteTestTemplate(id, aid)

Delete a test template

Deletes a test template using its ID.

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.TestTemplateEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    TestTemplateEndpointsApi apiInstance = new TestTemplateEndpointsApi(defaultClient);
    UUID id = UUID.fromString("fcbb89a7-61cf-4616-9c4f-828fa3cb4684"); // UUID | The ID of the test template
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      apiInstance.deleteTestTemplate(id, aid);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestTemplateEndpointsApi#deleteTestTemplate");
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
| **id** | **UUID**| The ID of the test template | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="deployUserTemplate"></a>
# **deployUserTemplate**
> deployUserTemplate(id, deployTestTemplate, aid)

Deploy a test template.

Deploys a test template to create tests, alert rules, and dashboards defined by the template. You can deploy templates to easily create new tests.   To deploy test templates, you must specify &#x60;userInputValues&#x60; required by the template in the request body. &#x60;userInputValues&#x60; enables you to specify a minimum set of user values required to configure the tests from a test template. This way, you do not have to edit all the details of each test configuration. If necessary, you can edit the test details directly in the template.   ### Considerations  Consider the following when deploying a test template:  * To deploy a test template, you must first create the template or use one of ThousandEyes&#39; predefined test templates.  * The deployment strategy allows you to specify what should happen to a particular asset in the event that a test template is redeployed.    When you attempt to deploy a test template that has already been deployed, the API service compares any assets that have not yet been deployed with the assets that were deployed in the previous deployment (the comparison is done using the **asset key**; the asset keys are simply the object keys used in the &#x60;tests&#x60;, &#x60;labels&#x60;, &#x60;alertRules&#x60;, and &#x60;dashboards&#x60; fields). By default, if the configuration of a particular asset has not changed from the previous deployment, that asset is ignored.       If a change is detected:    * If the asset is a test, a new test is created with the new configuration.   * If the asset is not a test, the asset is updated.  * You can create new resources such as tests, alert rules, labels, dashboards, and modify existing resources defined in test templates, overwriting the default configurations.  * You can also use existing resources (such as those created outside the test template deployment flow) by adding their ID either in the raw test template or using the overrides when deploying the template. See example usage below for the raw test template sample.  **Note**: The test template API does not currently track \&quot;live\&quot; configuration of assets. Any changes made to assets outside of the test template API will not be considered when comparing changes during the redeployment scenario.  ### Example usage:  &#x60;&#x60;&#x60;POST /v7/tests/templates/fcbb89a7-61cf-4616-9c4f-828fa3cb4684/deploy  {   \&quot;userInputValues\&quot;: {     \&quot;interval\&quot;: 120,     \&quot;target\&quot;: \&quot;https://microsoft.com\&quot;,     \&quot;agents\&quot;: [{\&quot;agentId\&quot;:11}],     \&quot;domain\&quot;: \&quot;microsoft.com\&quot;   },   \&quot;name\&quot;:\&quot;Microsoft Suite\&quot;,   \&quot;tests\&quot;: {     \&quot;secondPageLoadTest\&quot;: {       \&quot;httpInterval\&quot;: 120,       \&quot;interval\&quot;: 120,       \&quot;testId\&quot;: 182481,       \&quot;type\&quot;: \&quot;page-load\&quot;,       \&quot;url\&quot;: \&quot;https://microsoft.com\&quot;,       \&quot;testName\&quot;: \&quot;Microsoft Suite - Second Page Load\&quot;,       \&quot;agents\&quot;: [         {           \&quot;agentId\&quot;: 11         }       ]     }   } } &#x60;&#x60;&#x60; #### Raw Test Template Sample  &#x60;&#x60;&#x60; {   ...   \&quot;tests\&quot;: {       \&quot;existingTest\&quot;: {           \&quot;testId\&quot;: \&quot;123\&quot;, //The API will only try to update this test; will never create it           \&quot;type\&quot;: \&quot;http-server\&quot;,           ....       },       ...   },   ... } &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.TestTemplateEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    TestTemplateEndpointsApi apiInstance = new TestTemplateEndpointsApi(defaultClient);
    UUID id = UUID.fromString("fcbb89a7-61cf-4616-9c4f-828fa3cb4684"); // UUID | The ID of the test template
    DeployTestTemplate deployTestTemplate = new DeployTestTemplate(); // DeployTestTemplate | Deploy test template
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      apiInstance.deployUserTemplate(id, deployTestTemplate, aid);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestTemplateEndpointsApi#deployUserTemplate");
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
| **id** | **UUID**| The ID of the test template | |
| **deployTestTemplate** | [**DeployTestTemplate**](DeployTestTemplate.md)| Deploy test template | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getUserOrgTestTemplate"></a>
# **getUserOrgTestTemplate**
> TestTemplate getUserOrgTestTemplate(id, aid)

Retrieve a test template

Retrieves a test template using its ID.

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.TestTemplateEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    TestTemplateEndpointsApi apiInstance = new TestTemplateEndpointsApi(defaultClient);
    UUID id = UUID.fromString("fcbb89a7-61cf-4616-9c4f-828fa3cb4684"); // UUID | The ID of the test template
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      TestTemplate result = apiInstance.getUserOrgTestTemplate(id, aid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestTemplateEndpointsApi#getUserOrgTestTemplate");
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
| **id** | **UUID**| The ID of the test template | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**TestTemplate**](TestTemplate.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getUserOrgTestTemplates"></a>
# **getUserOrgTestTemplates**
> TestTemplateCollection getUserOrgTestTemplates(aid)

List all test templates.

Retrieves a list of all your test templates

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.TestTemplateEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    TestTemplateEndpointsApi apiInstance = new TestTemplateEndpointsApi(defaultClient);
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      TestTemplateCollection result = apiInstance.getUserOrgTestTemplates(aid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestTemplateEndpointsApi#getUserOrgTestTemplates");
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

[**TestTemplateCollection**](TestTemplateCollection.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="updateTestTemplate"></a>
# **updateTestTemplate**
> TestTemplate updateTestTemplate(id, testTemplateUpsert, aid)

Update a test template

Updates an existing test template. This operation overwrites the existing test template object with the object sent in the request. If a partial update is required, it is recommended that you retrieve the test template and modify the test template object before updating it.

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.TestTemplateEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    TestTemplateEndpointsApi apiInstance = new TestTemplateEndpointsApi(defaultClient);
    UUID id = UUID.fromString("fcbb89a7-61cf-4616-9c4f-828fa3cb4684"); // UUID | The ID of the test template
    TestTemplateUpsert testTemplateUpsert = new TestTemplateUpsert(); // TestTemplateUpsert | The test template to create or update.
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      TestTemplate result = apiInstance.updateTestTemplate(id, testTemplateUpsert, aid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestTemplateEndpointsApi#updateTestTemplate");
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
| **id** | **UUID**| The ID of the test template | |
| **testTemplateUpsert** | [**TestTemplateUpsert**](TestTemplateUpsert.md)| The test template to create or update. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**TestTemplate**](TestTemplate.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

