# thousandeyes-java-sdk-streaming

ThousandEyes for OpenTelemetry API

- API version: 7.0.0

- Build date: 2024-02-07T22:58:22.959841Z[Europe/Lisbon]


Configure ThousandEyes to stream or push test data to a OpenTelemetry compliant endpoint with the ThousandEyes for OpenTelemetry API.



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
  <artifactId>thousandeyes-java-sdk-streaming</artifactId>
  <version>7.0.0-SNAPSHOT</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.thousandeyes.api:thousandeyes-java-sdk-streaming:7.0.0-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/thousandeyes-java-sdk-streaming-7.0.0-SNAPSHOT.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.thousandeyes.api.*;
import com.thousandeyes.api.streaming.model.*;
import com.thousandeyes.api.streaming.StreamingApi;

public class StreamingApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure clients using the `defaultClient` object, such as
        // overriding the host and port, timeout, etc.
        StreamingApi apiInstance = new StreamingApi(defaultClient);
        String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        Stream stream = new Stream(); // Stream | Stream to configure
        try {
            CreateStreamResponse result = apiInstance.createStream(aid, stream);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StreamingApi#createStream");
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
*StreamingApi* | [**createStream**](docs/StreamingApi.md#createStream) | **POST** /v7/stream | Create data stream
*StreamingApi* | [**createStreamWithHttpInfo**](docs/StreamingApi.md#createStreamWithHttpInfo) | **POST** /v7/stream | Create data stream
*StreamingApi* | [**deleteStream**](docs/StreamingApi.md#deleteStream) | **DELETE** /v7/stream/{id} | Delete a data stream
*StreamingApi* | [**deleteStreamWithHttpInfo**](docs/StreamingApi.md#deleteStreamWithHttpInfo) | **DELETE** /v7/stream/{id} | Delete a data stream
*StreamingApi* | [**getStream**](docs/StreamingApi.md#getStream) | **GET** /v7/stream/{id} | Retrieve data stream
*StreamingApi* | [**getStreamWithHttpInfo**](docs/StreamingApi.md#getStreamWithHttpInfo) | **GET** /v7/stream/{id} | Retrieve data stream
*StreamingApi* | [**getStreams**](docs/StreamingApi.md#getStreams) | **GET** /v7/stream | List data streams
*StreamingApi* | [**getStreamsWithHttpInfo**](docs/StreamingApi.md#getStreamsWithHttpInfo) | **GET** /v7/stream | List data streams
*StreamingApi* | [**putStream**](docs/StreamingApi.md#putStream) | **PUT** /v7/stream/{id} | Update data stream
*StreamingApi* | [**putStreamWithHttpInfo**](docs/StreamingApi.md#putStreamWithHttpInfo) | **PUT** /v7/stream/{id} | Update data stream


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


