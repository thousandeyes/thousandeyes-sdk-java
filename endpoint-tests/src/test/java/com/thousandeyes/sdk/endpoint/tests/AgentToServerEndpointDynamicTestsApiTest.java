/*
 * Endpoint Tests API
 *  Manage endpoint agent dynamic and scheduled tests using the Endpoint Tests API. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.tests;

import com.thousandeyes.sdk.endpoint.tests.model.DynamicTest;
import com.thousandeyes.sdk.endpoint.tests.model.DynamicTestRequest;
import com.thousandeyes.sdk.endpoint.tests.model.DynamicTests;
import com.thousandeyes.sdk.endpoint.tests.model.EndpointDynamicTestUpdate;
import com.thousandeyes.sdk.endpoint.tests.model.Error;
import java.net.URI;
import com.thousandeyes.sdk.endpoint.tests.model.UnauthorizedError;
import com.thousandeyes.sdk.endpoint.tests.model.ValidationError;
import static com.thousandeyes.sdk.serialization.JSON.getDefault;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * Request and Response model deserialization tests for AgentToServerEndpointDynamicTestsApi
 */
public class AgentToServerEndpointDynamicTestsApiTest {
    // private final AgentToServerEndpointDynamicTestsApi api = new AgentToServerEndpointDynamicTestsApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Create endpoint dynamic test
     * <p>
     * Create a new endpoint dynamic test in ThousandEyes using properties specified in the POST data. Please note that only Account Admins have the authorization to create new tests; regular users are restricted from using POST-based methods. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void createAgentToServerEndpointDynamicTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "protocol" : "icmp",
                  "application" : "webex",
                  "agentSelectorType" : "all-agents",
                  "maxMachines" : 25,
                  "interval" : 60,
                  "hasPathTraceInSession" : true,
                  "endpointAgentLabels" : [ "567", "214" ],
                  "tcpProbeMode" : "auto",
                  "agents" : [ "0a3b9998-dc3a-4ff2-b50d-ac4a7cd986e1", "66eec0f1-72b4-4755-aa83-3aed61d17f3c" ],
                  "testName" : "Test name"
                }
                                 """;
        DynamicTestRequest mappedRequest = 
                mapper.readValue(requestBodyJson, DynamicTestRequest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "hasPing" : true,
                  "_links" : {
                    "testResults" : [ {
                      "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/dynamic-tests/281474976710706/network/filter"
                    }, {
                      "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/dynamic-tests/281474976710706/pathvis"
                    } ],
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
                  "networkMeasurements" : true,
                  "tcpProbeMode" : "auto",
                  "labels" : [ {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  }, {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  } ],
                  "protocol" : "icmp",
                  "createdDate" : "2022-07-17T22:00:54Z",
                  "application" : "webex",
                  "hasTraceroute" : true,
                  "isEnabled" : true,
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "interval" : 60,
                  "testId" : "281474976710706",
                  "aid" : "1234",
                  "agentSelectorConfig" : {
                    "agentSelectorType" : "all-agents",
                    "maxMachines" : 25
                  },
                  "hasPathTraceInSession" : true,
                  "testName" : "Test name"
                }
                                  """;
        DynamicTest mappedResponse = 
                mapper.readValue(responseBodyJson, DynamicTest.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Delete agent to server dynamic test
     * <p>
     * Deletes an agent to server endpoint dynamic test.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Disabled
    @Test
    public void deleteAgentToServerEndpointDynamicTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

    }
    
    /**
     * Retrieve endpoint dynamic test
     * <p>
     * Returns details of an endpoint dynamic test, including test type, name, intervals, targets.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getAgentToServerEndpointDynamicTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "hasPing" : true,
                  "_links" : {
                    "testResults" : [ {
                      "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/dynamic-tests/281474976710706/network/filter"
                    }, {
                      "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/dynamic-tests/281474976710706/pathvis"
                    } ],
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
                  "networkMeasurements" : true,
                  "tcpProbeMode" : "auto",
                  "labels" : [ {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  }, {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  } ],
                  "protocol" : "icmp",
                  "createdDate" : "2022-07-17T22:00:54Z",
                  "application" : "webex",
                  "hasTraceroute" : true,
                  "isEnabled" : true,
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "interval" : 60,
                  "testId" : "281474976710706",
                  "aid" : "1234",
                  "agentSelectorConfig" : {
                    "agentSelectorType" : "all-agents",
                    "maxMachines" : 25
                  },
                  "hasPathTraceInSession" : true,
                  "testName" : "Test name"
                }
                                  """;
        DynamicTest mappedResponse = 
                mapper.readValue(responseBodyJson, DynamicTest.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * List endpoint dynamic tests
     * <p>
     * Returns a list of all endpoint dynamic tests configured in ThousandEyes. This list does not contain saved events.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getAgentToServerEndpointDynamicTestsRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "tests" : [ {
                    "hasPing" : true,
                    "_links" : {
                      "testResults" : [ {
                        "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/dynamic-tests/281474976710706/network/filter"
                      }, {
                        "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/dynamic-tests/281474976710706/pathvis"
                      } ],
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
                    "networkMeasurements" : true,
                    "tcpProbeMode" : "auto",
                    "labels" : [ {
                      "labelId" : "961",
                      "name" : "Artem label",
                      "isBuiltin" : false
                    }, {
                      "labelId" : "961",
                      "name" : "Artem label",
                      "isBuiltin" : false
                    } ],
                    "protocol" : "icmp",
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "application" : "webex",
                    "hasTraceroute" : true,
                    "isEnabled" : true,
                    "modifiedDate" : "2022-07-17T22:00:54Z",
                    "interval" : 60,
                    "testId" : "281474976710706",
                    "aid" : "1234",
                    "agentSelectorConfig" : {
                      "agentSelectorType" : "all-agents",
                      "maxMachines" : 25
                    },
                    "hasPathTraceInSession" : true,
                    "testName" : "Test name"
                  }, {
                    "hasPing" : true,
                    "_links" : {
                      "testResults" : [ {
                        "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/dynamic-tests/281474976710706/network/filter"
                      }, {
                        "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/dynamic-tests/281474976710706/pathvis"
                      } ],
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
                    "networkMeasurements" : true,
                    "tcpProbeMode" : "auto",
                    "labels" : [ {
                      "labelId" : "961",
                      "name" : "Artem label",
                      "isBuiltin" : false
                    }, {
                      "labelId" : "961",
                      "name" : "Artem label",
                      "isBuiltin" : false
                    } ],
                    "protocol" : "icmp",
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "application" : "webex",
                    "hasTraceroute" : true,
                    "isEnabled" : true,
                    "modifiedDate" : "2022-07-17T22:00:54Z",
                    "interval" : 60,
                    "testId" : "281474976710706",
                    "aid" : "1234",
                    "agentSelectorConfig" : {
                      "agentSelectorType" : "all-agents",
                      "maxMachines" : 25
                    },
                    "hasPathTraceInSession" : true,
                    "testName" : "Test name"
                  } ],
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
                  }
                }
                                  """;
        DynamicTests mappedResponse = 
                mapper.readValue(responseBodyJson, DynamicTests.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Update agent to server dynamic test
     * <p>
     * Updates an agent to server endpoint dynamic test. Includes support for  enabling and disabling the test.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void updateAgentToServerEndpointDynamicTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "protocol" : "icmp",
                  "application" : "webex",
                  "isEnabled" : true,
                  "interval" : 60,
                  "tcpProbeMode" : "auto",
                  "testName" : "Test name"
                }
                                 """;
        EndpointDynamicTestUpdate mappedRequest = 
                mapper.readValue(requestBodyJson, EndpointDynamicTestUpdate.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "hasPing" : true,
                  "_links" : {
                    "testResults" : [ {
                      "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/dynamic-tests/281474976710706/network/filter"
                    }, {
                      "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/dynamic-tests/281474976710706/pathvis"
                    } ],
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
                  "networkMeasurements" : true,
                  "tcpProbeMode" : "auto",
                  "labels" : [ {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  }, {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  } ],
                  "protocol" : "icmp",
                  "createdDate" : "2022-07-17T22:00:54Z",
                  "application" : "webex",
                  "hasTraceroute" : true,
                  "isEnabled" : true,
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "interval" : 60,
                  "testId" : "281474976710706",
                  "aid" : "1234",
                  "agentSelectorConfig" : {
                    "agentSelectorType" : "all-agents",
                    "maxMachines" : 25
                  },
                  "hasPathTraceInSession" : true,
                  "testName" : "Test name"
                }
                                  """;
        DynamicTest mappedResponse = 
                mapper.readValue(responseBodyJson, DynamicTest.class);
        assertNotNull(mappedResponse);
    }
    
}
