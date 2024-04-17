# thousandeyes-sdk-java-endpoint-labels

Endpoint Agent Labels API

- API version: 7.0.0

- Build date: 2024-04-17T14:20:01.595867+01:00[Europe/Lisbon]

Manage labels applied to endpoint agents using this API.



*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 11+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.thousandeyes.api</groupId>
  <artifactId>thousandeyes-sdk-java-endpoint-labels</artifactId>
  <version>7.0.0-SNAPSHOT</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.thousandeyes.api:thousandeyes-sdk-java-endpoint-labels:7.0.0-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/thousandeyes-sdk-java-endpoint-labels-7.0.0-SNAPSHOT.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.thousandeyes.api.endpoint.*;
import com.thousandeyes.api.endpoint.labels.model.*;
import com.thousandeyes.api.endpoint.labels.ManageLabelsApi;

public class ManageLabelsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure clients using the `defaultClient` object, such as
        // overriding the host and port, timeout, etc.
        ManageLabelsApi apiInstance = new ManageLabelsApi(defaultClient);
        String id = "id_example"; // String | The unique identifier of the label to operate on.
        String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            apiInstance.endpointLabelDelete(id, aid);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManageLabelsApi#endpointLabelDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.thousandeyes.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ManageLabelsApi* | [**endpointLabelDelete**](docs/ManageLabelsApi.md#endpointLabelDelete) | **DELETE** /v7/endpoint/labels/{id} | Deletes label
*ManageLabelsApi* | [**endpointLabelDeleteWithHttpInfo**](docs/ManageLabelsApi.md#endpointLabelDeleteWithHttpInfo) | **DELETE** /v7/endpoint/labels/{id} | Deletes label
*ManageLabelsApi* | [**endpointLabelGet**](docs/ManageLabelsApi.md#endpointLabelGet) | **GET** /v7/endpoint/labels/{id} | Retrieve label
*ManageLabelsApi* | [**endpointLabelGetWithHttpInfo**](docs/ManageLabelsApi.md#endpointLabelGetWithHttpInfo) | **GET** /v7/endpoint/labels/{id} | Retrieve label
*ManageLabelsApi* | [**endpointLabelUpdate**](docs/ManageLabelsApi.md#endpointLabelUpdate) | **PATCH** /v7/endpoint/labels/{id} | Update label
*ManageLabelsApi* | [**endpointLabelUpdateWithHttpInfo**](docs/ManageLabelsApi.md#endpointLabelUpdateWithHttpInfo) | **PATCH** /v7/endpoint/labels/{id} | Update label
*ManageLabelsApi* | [**endpointLabelsList**](docs/ManageLabelsApi.md#endpointLabelsList) | **GET** /v7/endpoint/labels | List labels
*ManageLabelsApi* | [**endpointLabelsListWithHttpInfo**](docs/ManageLabelsApi.md#endpointLabelsListWithHttpInfo) | **GET** /v7/endpoint/labels | List labels
*ManageLabelsApi* | [**v7EndpointLabelsPost**](docs/ManageLabelsApi.md#v7EndpointLabelsPost) | **POST** /v7/endpoint/labels | Create label
*ManageLabelsApi* | [**v7EndpointLabelsPostWithHttpInfo**](docs/ManageLabelsApi.md#v7EndpointLabelsPostWithHttpInfo) | **POST** /v7/endpoint/labels | Create label


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="BearerAuth"></a>
### BearerAuth


- **Type**: HTTP Bearer Token authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.
However, the instances of the api clients created from the `ApiClient` are thread-safe and can be re-used.

## Author


