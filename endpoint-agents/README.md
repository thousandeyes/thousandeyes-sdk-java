# endpoint-agents

Endpoint Agents API

- API version: 7.0.54

Manage ThousandEyes Endpoint Agents using this API. 

For more information about Endpoint Agents, see [Endpoint Agents](https://docs.thousandeyes.com/product-documentation/global-vantage-points/endpoint-agents).


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
        <artifactId>endpoint-agents</artifactId>
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
implementation "com.thousandeyes.sdk:endpoint-agents:<version>"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/endpoint-agents-version.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.thousandeyes.sdk.endpoint.*;
import com.thousandeyes.sdk.endpoint.client.*;
import com.thousandeyes.sdk.endpoint.agents.model.*;
import com.thousandeyes.sdk.endpoint.agents.EndpointAgentsApi;

public class EndpointAgentsApiExample {

    public static void main(String[] args) {
        // Configure clients using the `defaultClient` object, such as
        // overriding the host and port, timeout, etc. In this example we are using the NativeApiClient
        // but you can use your own client implementation
        ApiClient defaultClient = NativeApiClient
                .builder()
                .baseUri("https://api.thousandeyes.com/v7")
                .bearerToken("<bearer-token>")
                .build();

        EndpointAgentsApi apiInstance = new EndpointAgentsApi(defaultClient);
        UUID agentId = UUID.randomUUID(); // UUID | The identifier of the agent to operate on.
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        List<ExpandEndpointAgentOptions> expand = Arrays.asList(); // List<ExpandEndpointAgentOptions> | This optional parameter allows you to control the expansion of test resources associated with the agent. By default, no expansion occurs when this query parameter is omitted. To expand the \"clients\" resource, include the query parameter `?expand=clients`.  For multiple expansions, you have two options:    * Separate the values with commas. For example, `?expandAgent=clients,tasks`. * Specify the parameter multiple times. For example, `?expandAgent=clients&expandAgent=tasks`.  This parameter offers flexibility for users to customize the expansion of specific resources related to the agent. 
        try {
            apiInstance.deleteEndpointAgent(agentId, aid, expand);
        } catch (ApiException e) {
            System.err.println("Exception when calling EndpointAgentsApi#deleteEndpointAgent");
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
*EndpointAgentsApi* | [**deleteEndpointAgent**](docs/EndpointAgentsApi.md#deleteEndpointAgent) | **DELETE** /endpoint/agents/{agentId} | Delete endpoint agent
*EndpointAgentsApi* | [**deleteEndpointAgentWithHttpInfo**](docs/EndpointAgentsApi.md#deleteEndpointAgentWithHttpInfo) | **DELETE** /endpoint/agents/{agentId} | Delete endpoint agent
*EndpointAgentsApi* | [**disableEndpointAgent**](docs/EndpointAgentsApi.md#disableEndpointAgent) | **POST** /endpoint/agents/{agentId}/disable | Disable endpoint agent
*EndpointAgentsApi* | [**disableEndpointAgentWithHttpInfo**](docs/EndpointAgentsApi.md#disableEndpointAgentWithHttpInfo) | **POST** /endpoint/agents/{agentId}/disable | Disable endpoint agent
*EndpointAgentsApi* | [**enableEndpointAgent**](docs/EndpointAgentsApi.md#enableEndpointAgent) | **POST** /endpoint/agents/{agentId}/enable | Enable endpoint agent
*EndpointAgentsApi* | [**enableEndpointAgentWithHttpInfo**](docs/EndpointAgentsApi.md#enableEndpointAgentWithHttpInfo) | **POST** /endpoint/agents/{agentId}/enable | Enable endpoint agent
*EndpointAgentsApi* | [**filterEndpointAgents**](docs/EndpointAgentsApi.md#filterEndpointAgents) | **POST** /endpoint/agents/filter | Filter endpoint agents
*EndpointAgentsApi* | [**filterEndpointAgentsWithHttpInfo**](docs/EndpointAgentsApi.md#filterEndpointAgentsWithHttpInfo) | **POST** /endpoint/agents/filter | Filter endpoint agents
*EndpointAgentsApi* | [**getEndpointAgent**](docs/EndpointAgentsApi.md#getEndpointAgent) | **GET** /endpoint/agents/{agentId} | Retrieve endpoint agent
*EndpointAgentsApi* | [**getEndpointAgentWithHttpInfo**](docs/EndpointAgentsApi.md#getEndpointAgentWithHttpInfo) | **GET** /endpoint/agents/{agentId} | Retrieve endpoint agent
*EndpointAgentsApi* | [**getEndpointAgents**](docs/EndpointAgentsApi.md#getEndpointAgents) | **GET** /endpoint/agents | List endpoint agents
*EndpointAgentsApi* | [**getEndpointAgentsWithHttpInfo**](docs/EndpointAgentsApi.md#getEndpointAgentsWithHttpInfo) | **GET** /endpoint/agents | List endpoint agents
*EndpointAgentsApi* | [**getEndpointAgentsConnectionString**](docs/EndpointAgentsApi.md#getEndpointAgentsConnectionString) | **GET** /endpoint/agents/connection-string | Get agent connection string
*EndpointAgentsApi* | [**getEndpointAgentsConnectionStringWithHttpInfo**](docs/EndpointAgentsApi.md#getEndpointAgentsConnectionStringWithHttpInfo) | **GET** /endpoint/agents/connection-string | Get agent connection string
*EndpointAgentsApi* | [**updateEndpointAgent**](docs/EndpointAgentsApi.md#updateEndpointAgent) | **PATCH** /endpoint/agents/{agentId} | Update endpoint agent
*EndpointAgentsApi* | [**updateEndpointAgentWithHttpInfo**](docs/EndpointAgentsApi.md#updateEndpointAgentWithHttpInfo) | **PATCH** /endpoint/agents/{agentId} | Update endpoint agent
*EndpointAgentsTransferApi* | [**transferEndpointAgent**](docs/EndpointAgentsTransferApi.md#transferEndpointAgent) | **POST** /endpoint/agents/{agentId}/transfer | Transfer endpoint agent
*EndpointAgentsTransferApi* | [**transferEndpointAgentWithHttpInfo**](docs/EndpointAgentsTransferApi.md#transferEndpointAgentWithHttpInfo) | **POST** /endpoint/agents/{agentId}/transfer | Transfer endpoint agent
*EndpointAgentsTransferApi* | [**transferEndpointAgents**](docs/EndpointAgentsTransferApi.md#transferEndpointAgents) | **POST** /endpoint/agents/transfer/bulk | Bulk transfer agents
*EndpointAgentsTransferApi* | [**transferEndpointAgentsWithHttpInfo**](docs/EndpointAgentsTransferApi.md#transferEndpointAgentsWithHttpInfo) | **POST** /endpoint/agents/transfer/bulk | Bulk transfer agents


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



