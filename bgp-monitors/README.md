# bgp-monitors

BGP Monitors API

- API version: 7.0.54


Retrieve information about BGP monitors available to your ThousandEyes account. ThousandEyes ingests BGP routing data from dozens of global BGP collectors and automatically integrates that visibility as a configurable layer under service, network, and path visualization layers.

When you specify a service URL in a test, layered BGP tests automatically track reachability and path changes for any relevant prefix. When you use an IP address as the target for a test, the ThousandEyes platform monitors the relevant internet-routed prefix. You can also create specific BGP monitoring for a prefix, and can alert on hijacks and leaks.

For more information about monitors, see [Inside-Out BGP Visibility](https://docs.thousandeyes.com/product-documentation/internet-and-wan-monitoring/tests/bgp-tests/inside-out-bgp-visibility).



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
        <artifactId>bgp-monitors</artifactId>
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
implementation "com.thousandeyes.sdk:bgp-monitors:<version>"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/bgp-monitors-version.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.thousandeyes.sdk.bgp.*;
import com.thousandeyes.sdk.bgp.client.*;
import com.thousandeyes.sdk.bgp.monitors.model.*;
import com.thousandeyes.sdk.bgp.monitors.BgpMonitorsApi;

public class BgpMonitorsApiExample {

    public static void main(String[] args) {
        // Configure clients using the `defaultClient` object, such as
        // overriding the host and port, timeout, etc. In this example we are using the NativeApiClient
        // but you can use your own client implementation
        ApiClient defaultClient = NativeApiClient
                .builder()
                .baseUri("https://api.thousandeyes.com/v7")
                .bearerToken("<bearer-token>")
                .build();

        BgpMonitorsApi apiInstance = new BgpMonitorsApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        try {
            Monitors result = apiInstance.getBgpMonitors(aid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BgpMonitorsApi#getBgpMonitors");
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
*BgpMonitorsApi* | [**getBgpMonitors**](docs/BgpMonitorsApi.md#getBgpMonitors) | **GET** /monitors | List BGP monitors
*BgpMonitorsApi* | [**getBgpMonitorsWithHttpInfo**](docs/BgpMonitorsApi.md#getBgpMonitorsWithHttpInfo) | **GET** /monitors | List BGP monitors


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



