/*
 * Usage API
 *  These usage endpoints define the following operations:  * **Usage**: Retrieve usage data for the specified time period (default is one month).          * Users must have the `View organization usage` permission to access this endpoint.     * This operation offers visibility across all account groups within the organization.     * Users with `View organization usage` permission in multiple organizations should query the operation with the `aid` query string parameter (see optional parameters) for each organization.  * **Quotas**: Obtain organization and account usage quotas. Additionally, users with the appropriate permissions can create, update, or delete these quotas.          * Users must have the necessary permissions to perform quota-related actions.  Refer to the Usage API operations for detailed usage instructions and optional parameters. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.usage;

import com.thousandeyes.sdk.usage.model.EnterpriseAgentsUsage;
import com.thousandeyes.sdk.usage.model.Error;
import com.thousandeyes.sdk.usage.model.ExpandUsageOptions;
import java.time.OffsetDateTime;
import com.thousandeyes.sdk.usage.model.TestsUsage;
import com.thousandeyes.sdk.usage.model.UnauthorizedError;
import com.thousandeyes.sdk.usage.model.Usage;
import com.thousandeyes.sdk.usage.model.ValidationError;
import com.thousandeyes.sdk.usage.model.EnterpriseAgentUnitsByTestOwnerAccountGroup;
import com.thousandeyes.sdk.pagination.Paginator;
import com.thousandeyes.sdk.usage.model.UnitsByTests;
import com.thousandeyes.sdk.pagination.Paginator;
import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.common.ContentTypes.AUTHORIZATION;
import static com.github.tomakehurst.wiremock.common.ContentTypes.CONTENT_TYPE;
import static com.thousandeyes.sdk.serialization.JSON.getDefault;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo;
import com.github.tomakehurst.wiremock.junit5.WireMockTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.NativeApiClient;


/**
 * Request and Response model deserialization tests for UsageApi
 */
@WireMockTest
public class UsageApiTest {
    private static final String TOKEN = "valid-token";
    private static final String BEARER_TOKEN = "Bearer %s".formatted(TOKEN);
    private static UsageApi api;
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);

    @BeforeAll
    public static void setup(WireMockRuntimeInfo wireMockRuntimeInfo) {
        ApiClient client = NativeApiClient.builder()
                                .baseUri(wireMockRuntimeInfo.getHttpBaseUrl())
                                .bearerToken(TOKEN)
                                .build();
        api = new UsageApi(client);
    }
    
    /**
     * Get enterprise agent usage
     * <p>
     * This operation returns the organization&#39;s enterprise agents usage for a specific time period, or the curent billing cycle if no time period is specified. In the &#x60;/v7/usage&#x60; API, a shared enterprise agent&#39;s usage is reported in the account group where the agent was created (i.e Primary Account Group).  However in this API, the shared agent&#39;s usage is distributed among all the account groups where the tests are running on the particular agent. This API is also only available to customers on usage based pricing model.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Test
    public void getEnterpriseAgentsUnitsUsageRequestAndResponseDeserializationTest()
            throws JsonProcessingException, ApiException
    {


        var responseBodyJson = """
                {
                  "_links" : {
                    "next" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    },
                    "previous" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    },
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  },
                  "breakdowns" : [ {
                    "aid" : "1234",
                    "agentId" : "121404",
                    "accountGroupName" : "Support",
                    "agentName" : "TEVA-test-agent",
                    "enterpriseUnitsUsed" : 599878,
                    "enterpriseUnitsProjected" : 597808,
                    "vagentId" : "123456"
                  }, {
                    "aid" : "315",
                    "agentId" : "121404",
                    "accountGroupName" : "Documentation",
                    "agentName" : "lab-physical-appliance-1",
                    "enterpriseUnitsUsed" : 597123,
                    "enterpriseUnitsProjected" : 597808,
                    "vagentId" : "789"
                  } ]
                }
                                  """;
        var statusCode = 200;
        var responseContentType = "application/json";
        EnterpriseAgentsUsage mappedResponse = 
                mapper.readValue(responseBodyJson, EnterpriseAgentsUsage.class);
        assertNotNull(mappedResponse);

        var path = "/usage/units/enterprise-agents";
        stubFor(get(urlPathTemplate(path))
                        .withHeader(AUTHORIZATION, equalTo(BEARER_TOKEN))
                        .willReturn(aResponse()
                                            .withHeader(CONTENT_TYPE, responseContentType)
                                            .withBody(responseBodyJson)
                                            .withStatus(statusCode)));

        var apiResponse = api.getEnterpriseAgentsUnitsUsage(null, null, null);
        assertEquals(mappedResponse, apiResponse);
    }
    
    /**
     * Get cloud and enterprise agents units usage
     * <p>
     * This operation returns the cloud and enterprise agents usage for all the tests for a specific time period, or the curent billing cycle if no time period is specified. In the &#x60;/v7/usage&#x60; API, an enterprise agent&#39;s usage is reported in the account group where the agent was created (i.e Primary Account Group).  However in this API, the agent&#39;s usage is distributed among all the account groups where the tests are running on the particular agent. This API is also only available to customers on usage based pricing model.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Test
    public void getTestsUnitsUsageRequestAndResponseDeserializationTest()
            throws JsonProcessingException, ApiException
    {


        var responseBodyJson = """
                {
                  "_links" : {
                    "next" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    },
                    "previous" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    },
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  },
                  "breakdowns" : [ {
                    "testId" : "1158",
                    "testName" : "https://app.thousandeyes.com",
                    "testType" : "Web-Page Load",
                    "enterpriseUnitsUsed" : 14050,
                    "enterpriseUnitsProjected" : 340674,
                    "cloudUnitsUsed" : 10000,
                    "cloudUnitsProjected" : 12000,
                    "aid" : "1234",
                    "accountGroupName" : "Support"
                  }, {
                    "testId" : "1221",
                    "testName" : "https://app.thousandeyes.com",
                    "testType" : "Web - HTTP Server",
                    "enterpriseUnitsUsed" : 194051,
                    "enterpriseUnitsProjected" : 30622,
                    "cloudUnitsUsed" : 12000,
                    "cloudUnitsProjected" : 13000,
                    "aid" : "1234",
                    "accountGroupName" : "Support"
                  } ]
                }
                                  """;
        var statusCode = 200;
        var responseContentType = "application/json";
        TestsUsage mappedResponse = 
                mapper.readValue(responseBodyJson, TestsUsage.class);
        assertNotNull(mappedResponse);

        var path = "/usage/units/tests";
        stubFor(get(urlPathTemplate(path))
                        .withHeader(AUTHORIZATION, equalTo(BEARER_TOKEN))
                        .willReturn(aResponse()
                                            .withHeader(CONTENT_TYPE, responseContentType)
                                            .withBody(responseBodyJson)
                                            .withStatus(statusCode)));

        var apiResponse = api.getTestsUnitsUsage(null, null, null, null);
        assertEquals(mappedResponse, apiResponse);
    }
    
    /**
     * Get usage information for the last month
     * <p>
     * This operation returns usage for the current period. It provides visibility across all account groups within an organization. To access this endpoint, you need the &#x60;View Billing&#x60; permission (a management permission). If you have access to view billing in multiple organizations, query the endpoint using an &#x60;aid&#x60; querystring parameter (see optional parameters, below) from each organization. **Note:** Access to billing information older than one month is not supported by this endpoint.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Test
    public void getUsageRequestAndResponseDeserializationTest()
            throws JsonProcessingException, ApiException
    {


        var responseBodyJson = """
                {
                  "_links" : {
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  },
                  "usage" : {
                    "cloudUnitsProjected" : 20993812,
                    "connectedDevicesUnitsUsed" : 79640902,
                    "enterpriseAgentsUsed" : 58,
                    "endpointAgents" : [ {
                      "aid" : "1234",
                      "accountGroupName" : "Support",
                      "endpointAgentsUsed" : 22
                    }, {
                      "aid" : "12345",
                      "accountGroupName" : "Documentation",
                      "endpointAgentsUsed" : 14
                    } ],
                    "cloudUnitsNextBillingPeriod" : 25123456,
                    "enterpriseUnitsNextBillingPeriod" : 0,
                    "endpointAgentsUsed" : 42,
                    "enterpriseUnitsUsed" : 79640902,
                    "cloudUnitsUsed" : 8500489,
                    "connectedDevicesUnitsNextBillingPeriod" : 0,
                    "connectedDevicesUnitsProjected" : 108016317,
                    "tests" : [ {
                      "aid" : "1234",
                      "testId" : "1158",
                      "accountGroupName" : "Documentation",
                      "testName" : "https://app.thousandeyes.com",
                      "testType" : "Web-Page Load",
                      "cloudUnitsUsed" : 14050,
                      "cloudUnitsProjected" : 340674
                    }, {
                      "aid" : "12345",
                      "testId" : "1159",
                      "accountGroupName" : "Documentation",
                      "testName" : "https://support.thousandeyes.com",
                      "testType" : "Web - HTTP Server",
                      "cloudUnitsUsed" : 64390,
                      "cloudUnitsProjected" : 164457
                    } ],
                    "endpointAgentsEmbedded" : [ {
                      "aid" : "1234",
                      "accountGroupName" : "Support",
                      "endpointAgentsEmbeddedUsed" : 2
                    }, {
                      "aid" : "12345",
                      "accountGroupName" : "Documentation",
                      "endpointAgentsEmbeddedUsed" : 3
                    } ],
                    "allocations" : {
                      "used" : 1000,
                      "projected" : 1000,
                      "allocations" : [ {
                        "productName" : "Some Product Name",
                        "allocatedUnits" : 600
                      } ]
                    },
                    "endpointAgentsEssentialsUsed" : 5,
                    "quota" : {
                      "monthEnd" : "2020-02-05T08:00:00Z",
                      "endpointAgentsEmbeddedIncluded" : 10,
                      "enterpriseAgentsIncluded" : 25,
                      "monthStart" : "2020-01-05T08:00:00Z",
                      "cloudUnitsIncluded" : 4320000000,
                      "deviceAgentsIncluded" : 100,
                      "endpointAgentsIncluded" : 200,
                      "endpointAgentsEssentialsIncluded" : 10
                    },
                    "enterpriseUnitsProjected" : 108016317,
                    "endpointAgentsEmbeddedUsed" : 5,
                    "enterpriseAgents" : [ {
                      "aid" : "1234",
                      "accountGroupName" : "Support",
                      "enterpriseAgentsUsed" : 7
                    }, {
                      "aid" : "12345",
                      "accountGroupName" : "Documentation",
                      "enterpriseAgentsUsed" : 1
                    } ],
                    "enterpriseAgentUnits" : [ {
                      "aid" : "1234",
                      "agentId" : "121404",
                      "accountGroupName" : "Support",
                      "agentName" : "TEVA-test-agent",
                      "enterpriseUnitsUsed" : 599878,
                      "enterpriseUnitsProjected" : 597808,
                      "vagentId" : "123456"
                    }, {
                      "aid" : "315",
                      "agentId" : "121404",
                      "accountGroupName" : "Documentation",
                      "agentName" : "lab-physical-appliance-1",
                      "enterpriseUnitsUsed" : 597123,
                      "enterpriseUnitsProjected" : 597808,
                      "vagentId" : "789"
                    } ],
                    "endpointAgentsEssentials" : [ {
                      "aid" : "1234",
                      "accountGroupName" : "Support",
                      "endpointAgentsEssentialsUsed" : 2
                    }, {
                      "aid" : "12345",
                      "accountGroupName" : "Documentation",
                      "endpointAgentsEssentialsUsed" : 3
                    } ]
                  }
                }
                                  """;
        var statusCode = 200;
        var responseContentType = "application/json";
        Usage mappedResponse = 
                mapper.readValue(responseBodyJson, Usage.class);
        assertNotNull(mappedResponse);

        var path = "/usage";
        stubFor(get(urlPathTemplate(path))
                        .withHeader(AUTHORIZATION, equalTo(BEARER_TOKEN))
                        .willReturn(aResponse()
                                            .withHeader(CONTENT_TYPE, responseContentType)
                                            .withBody(responseBodyJson)
                                            .withStatus(statusCode)));

        var apiResponse = api.getUsage(null, null);
        assertEquals(mappedResponse, apiResponse);
    }
    
}
