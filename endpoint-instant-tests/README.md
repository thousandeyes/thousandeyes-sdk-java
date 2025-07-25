# endpoint-instant-tests

Endpoint Instant Scheduled Tests API

- API version: 7.0.54


You can create and execute a new endpoint instant scheduled test within ThousandEyes using this API. The test parameters are specified in the `POST` data.

The following applies to the Endpoint Instant Scheduled Tests API:

* To initiate the creation and execution of an instant scheduled test, the user must possess the `Edit endpoint tests` permission.

* Upon successful creation of an instant scheduled test, the API responds with an HTTP/201 CREATED status code and return the test definition.
* It's important to note that the response does not include the results of the instant scheduled test. To retrieve test results, users can utilize the Endpoint Test Data endpoints.
The URLs for these API test data endpoints are provided within the test definition output when an instant scheduled test is created.



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
<dependencies>
    <dependency>
        <groupId>com.thousandeyes.sdk</groupId>
        <artifactId>endpoint-instant-tests</artifactId>
        <version>version</version>
    </dependency>
    <dependency>
        <groupId>com.thousandeyes.sdk</groupId>
        <artifactId>client</artifactId>
        <version>version</version>
    </dependency>

    <!-- Example only, you can use your own client implementation -->
    <dependency>
        <groupId>com.thousandeyes.sdk</groupId>
        <artifactId>client-native</artifactId>
        <version>version</version>
    </dependency>
</dependencies>

```

### Gradle users

Add this dependency to your project's build file:

```groovy
implementation "com.thousandeyes.sdk:client:<version>"
implementation "com.thousandeyes.sdk:client-native:<version>" #Example only, you can use your own client implementation
implementation "com.thousandeyes.sdk:endpoint-instant-tests:<version>"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/endpoint-instant-tests-version.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.thousandeyes.sdk.endpoint.tests.*;
import com.thousandeyes.sdk.endpoint.tests.client.*;
import com.thousandeyes.sdk.endpoint.tests.instant.model.*;
import com.thousandeyes.sdk.endpoint.tests.instant.AgentToServerEndpointInstantScheduledTestsApi;

public class AgentToServerEndpointInstantScheduledTestsApiExample {

    public static void main(String[] args) {
        // Configure clients using the `defaultClient` object, such as
        // overriding the host and port, timeout, etc. In this example we are using the NativeApiClient
        // but you can use your own client implementation
        ApiClient defaultClient = NativeApiClient
                .builder()
                .baseUri("https://api.thousandeyes.com/v7")
                .bearerToken("<bearer-token>")
                .build();

        AgentToServerEndpointInstantScheduledTestsApi apiInstance = new AgentToServerEndpointInstantScheduledTestsApi(defaultClient);
        EndpointAgentToServerInstantTest endpointAgentToServerInstantTest = new EndpointAgentToServerInstantTest(); // EndpointAgentToServerInstantTest | 
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            EndpointAgentToServerTest result = apiInstance.createAgentToServerScheduledInstantTest(endpointAgentToServerInstantTest, aid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentToServerEndpointInstantScheduledTestsApi#createAgentToServerScheduledInstantTest");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.thousandeyes.com/v7*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AgentToServerEndpointInstantScheduledTestsApi* | [**createAgentToServerScheduledInstantTest**](docs/AgentToServerEndpointInstantScheduledTestsApi.md#createAgentToServerScheduledInstantTest) | **POST** /endpoint/tests/scheduled-tests/agent-to-server/instant | Run agent to server instant scheduled test
*AgentToServerEndpointInstantScheduledTestsApi* | [**createAgentToServerScheduledInstantTestWithHttpInfo**](docs/AgentToServerEndpointInstantScheduledTestsApi.md#createAgentToServerScheduledInstantTestWithHttpInfo) | **POST** /endpoint/tests/scheduled-tests/agent-to-server/instant | Run agent to server instant scheduled test
*HttpServerEndpointInstantScheduledTestsApi* | [**createHttpServerScheduledInstantTest**](docs/HttpServerEndpointInstantScheduledTestsApi.md#createHttpServerScheduledInstantTest) | **POST** /endpoint/tests/scheduled-tests/http-server/instant | Run http server instant scheduled test
*HttpServerEndpointInstantScheduledTestsApi* | [**createHttpServerScheduledInstantTestWithHttpInfo**](docs/HttpServerEndpointInstantScheduledTestsApi.md#createHttpServerScheduledInstantTestWithHttpInfo) | **POST** /endpoint/tests/scheduled-tests/http-server/instant | Run http server instant scheduled test
*RunEndpointInstantScheduledTestsApi* | [**runEndpointScheduledInstantTest**](docs/RunEndpointInstantScheduledTestsApi.md#runEndpointScheduledInstantTest) | **POST** /endpoint/tests/scheduled-tests/{testId}/run | Run endpoint instant scheduled test
*RunEndpointInstantScheduledTestsApi* | [**runEndpointScheduledInstantTestWithHttpInfo**](docs/RunEndpointInstantScheduledTestsApi.md#runEndpointScheduledInstantTestWithHttpInfo) | **POST** /endpoint/tests/scheduled-tests/{testId}/run | Run endpoint instant scheduled test


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



