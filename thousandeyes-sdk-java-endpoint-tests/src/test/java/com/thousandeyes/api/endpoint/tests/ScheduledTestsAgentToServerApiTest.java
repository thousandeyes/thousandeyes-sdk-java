/*
 * Endpoint Tests API
 *  Manage endpoint agent dynamic and scheduled tests using the Endpoint Tests API. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.tests;

import com.thousandeyes.api.endpoint.tests.model.EndpointAgentToServerTest;
import com.thousandeyes.api.endpoint.tests.model.EndpointAgentToServerTestRequest;
import com.thousandeyes.api.endpoint.tests.model.EndpointNetworkTestUpdate;
import com.thousandeyes.api.endpoint.tests.model.Error;
import com.thousandeyes.api.endpoint.tests.model.GetEndpointAgentToserverTestsList200Response;
import java.net.URI;
import com.thousandeyes.api.endpoint.tests.model.UnauthorizedError;
import com.thousandeyes.api.endpoint.tests.model.ValidationError;
import static com.thousandeyes.api.serialization.JSON.getDefault;
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
 * Request and Response model deserialization tests for ScheduledTestsAgentToServerApi
 */
public class ScheduledTestsAgentToServerApiTest {
    // private final ScheduledTestsAgentToServerApi api = new ScheduledTestsAgentToServerApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Delete agent to server scheduled test
     * <p>
     * Deletes an agent to server endpoint scheduled test.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Disabled
    @Test
    public void deleteEndpointAgentToServerTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

    }
    
    /**
     * Retrieve agent to server endpoint scheduled test
     * <p>
     * Retrieves details of an agent to server endpoint scheduled test.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getEndpointAgentToServerDetailRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "server" : "www.example.com",
                  "isSavedEvent" : false,
                  "_links" : {
                    "testResults" : [ {
                      "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/scheduled-tests/281474976710706/network/filter"
                    }, {
                      "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/scheduled-tests/281474976710706/pathvis"
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
                  "alertRules" : [ {
                    "severity" : "major",
                    "roundsViolatingOutOf" : 5,
                    "roundsViolatingRequired" : 2,
                    "isDefault" : true,
                    "expression" : "((hops((hopDelay >= 100 ms))))",
                    "alertType" : "http-server",
                    "minimumSourcesPct" : 99,
                    "ruleName" : "The End of the Internet",
                    "minimumSources" : 10,
                    "roundsViolatingMode" : "exact",
                    "ruleId" : "127094"
                  }, {
                    "severity" : "major",
                    "roundsViolatingOutOf" : 5,
                    "roundsViolatingRequired" : 2,
                    "isDefault" : true,
                    "expression" : "((hops((hopDelay >= 100 ms))))",
                    "alertType" : "http-server",
                    "minimumSourcesPct" : 99,
                    "ruleName" : "The End of the Internet",
                    "minimumSources" : 10,
                    "roundsViolatingMode" : "exact",
                    "ruleId" : "127094"
                  } ],
                  "type" : "agent-to-server",
                  "labels" : [ {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  }, {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  } ],
                  "createdDate" : "2022-07-17T22:00:54Z",
                  "port" : 80,
                  "isEnabled" : true,
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "interval" : 120,
                  "testId" : "281474976710706",
                  "aid" : "1234",
                  "agentSelectorConfig" : {
                    "agentSelectorType" : "all-agents",
                    "maxMachines" : 10
                  },
                  "hasPathTraceInSession" : true,
                  "testName" : "Test name"
                }
                                  """;
        EndpointAgentToServerTest mappedResponse = 
                mapper.readValue(responseBodyJson, EndpointAgentToServerTest.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * List agent to server endpoint scheduled tests
     * <p>
     * Returns a list of all agent to server endpoint scheduled tests configured in ThousandEyes. This list does not contain saved events. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getEndpointAgentToserverTestsListRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "tests" : [ {
                    "server" : "www.example.com",
                    "isSavedEvent" : false,
                    "_links" : {
                      "testResults" : [ {
                        "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/scheduled-tests/281474976710706/network/filter"
                      }, {
                        "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/scheduled-tests/281474976710706/pathvis"
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
                    "alertRules" : [ {
                      "severity" : "major",
                      "roundsViolatingOutOf" : 5,
                      "roundsViolatingRequired" : 2,
                      "isDefault" : true,
                      "expression" : "((hops((hopDelay >= 100 ms))))",
                      "alertType" : "http-server",
                      "minimumSourcesPct" : 99,
                      "ruleName" : "The End of the Internet",
                      "minimumSources" : 10,
                      "roundsViolatingMode" : "exact",
                      "ruleId" : "127094"
                    }, {
                      "severity" : "major",
                      "roundsViolatingOutOf" : 5,
                      "roundsViolatingRequired" : 2,
                      "isDefault" : true,
                      "expression" : "((hops((hopDelay >= 100 ms))))",
                      "alertType" : "http-server",
                      "minimumSourcesPct" : 99,
                      "ruleName" : "The End of the Internet",
                      "minimumSources" : 10,
                      "roundsViolatingMode" : "exact",
                      "ruleId" : "127094"
                    } ],
                    "type" : "agent-to-server",
                    "labels" : [ {
                      "labelId" : "961",
                      "name" : "Artem label",
                      "isBuiltin" : false
                    }, {
                      "labelId" : "961",
                      "name" : "Artem label",
                      "isBuiltin" : false
                    } ],
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "port" : 80,
                    "isEnabled" : true,
                    "modifiedDate" : "2022-07-17T22:00:54Z",
                    "interval" : 120,
                    "testId" : "281474976710706",
                    "aid" : "1234",
                    "agentSelectorConfig" : {
                      "agentSelectorType" : "all-agents",
                      "maxMachines" : 10
                    },
                    "hasPathTraceInSession" : true,
                    "testName" : "Test name"
                  }, {
                    "server" : "www.example.com",
                    "isSavedEvent" : false,
                    "_links" : {
                      "testResults" : [ {
                        "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/scheduled-tests/281474976710706/network/filter"
                      }, {
                        "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/scheduled-tests/281474976710706/pathvis"
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
                    "alertRules" : [ {
                      "severity" : "major",
                      "roundsViolatingOutOf" : 5,
                      "roundsViolatingRequired" : 2,
                      "isDefault" : true,
                      "expression" : "((hops((hopDelay >= 100 ms))))",
                      "alertType" : "http-server",
                      "minimumSourcesPct" : 99,
                      "ruleName" : "The End of the Internet",
                      "minimumSources" : 10,
                      "roundsViolatingMode" : "exact",
                      "ruleId" : "127094"
                    }, {
                      "severity" : "major",
                      "roundsViolatingOutOf" : 5,
                      "roundsViolatingRequired" : 2,
                      "isDefault" : true,
                      "expression" : "((hops((hopDelay >= 100 ms))))",
                      "alertType" : "http-server",
                      "minimumSourcesPct" : 99,
                      "ruleName" : "The End of the Internet",
                      "minimumSources" : 10,
                      "roundsViolatingMode" : "exact",
                      "ruleId" : "127094"
                    } ],
                    "type" : "agent-to-server",
                    "labels" : [ {
                      "labelId" : "961",
                      "name" : "Artem label",
                      "isBuiltin" : false
                    }, {
                      "labelId" : "961",
                      "name" : "Artem label",
                      "isBuiltin" : false
                    } ],
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "port" : 80,
                    "isEnabled" : true,
                    "modifiedDate" : "2022-07-17T22:00:54Z",
                    "interval" : 120,
                    "testId" : "281474976710706",
                    "aid" : "1234",
                    "agentSelectorConfig" : {
                      "agentSelectorType" : "all-agents",
                      "maxMachines" : 10
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
        GetEndpointAgentToserverTestsList200Response mappedResponse = 
                mapper.readValue(responseBodyJson, GetEndpointAgentToserverTestsList200Response.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Creates agent to server endpoint scheduled test
     * <p>
     * Creates a new endpoint test in ThousandEyes using properties specified in the POST data. Please note that only Account Admins have the authorization to create new tests; regular users are restricted from using POST-based methods. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void postEndpointAgentToServerTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "hasPing" : true,
                  "port" : 80,
                  "agentSelectorType" : "all-agents",
                  "hasTraceroute" : true,
                  "maxMachines" : 10,
                  "serverName" : "www.example.com",
                  "interval" : 120,
                  "endpointAgentLabels" : [ "567", "214" ],
                  "agents" : [ "0a3b9998-dc3a-4ff2-b50d-ac4a7cd986e1", "66eec0f1-72b4-4755-aa83-3aed61d17f3c" ],
                  "testName" : "Test name"
                }
                                 """;
        EndpointAgentToServerTestRequest mappedRequest = 
                mapper.readValue(requestBodyJson, EndpointAgentToServerTestRequest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "server" : "www.example.com",
                  "isSavedEvent" : false,
                  "_links" : {
                    "testResults" : [ {
                      "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/scheduled-tests/281474976710706/network/filter"
                    }, {
                      "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/scheduled-tests/281474976710706/pathvis"
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
                  "alertRules" : [ {
                    "severity" : "major",
                    "roundsViolatingOutOf" : 5,
                    "roundsViolatingRequired" : 2,
                    "isDefault" : true,
                    "expression" : "((hops((hopDelay >= 100 ms))))",
                    "alertType" : "http-server",
                    "minimumSourcesPct" : 99,
                    "ruleName" : "The End of the Internet",
                    "minimumSources" : 10,
                    "roundsViolatingMode" : "exact",
                    "ruleId" : "127094"
                  }, {
                    "severity" : "major",
                    "roundsViolatingOutOf" : 5,
                    "roundsViolatingRequired" : 2,
                    "isDefault" : true,
                    "expression" : "((hops((hopDelay >= 100 ms))))",
                    "alertType" : "http-server",
                    "minimumSourcesPct" : 99,
                    "ruleName" : "The End of the Internet",
                    "minimumSources" : 10,
                    "roundsViolatingMode" : "exact",
                    "ruleId" : "127094"
                  } ],
                  "type" : "agent-to-server",
                  "labels" : [ {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  }, {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  } ],
                  "createdDate" : "2022-07-17T22:00:54Z",
                  "port" : 80,
                  "isEnabled" : true,
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "interval" : 120,
                  "testId" : "281474976710706",
                  "aid" : "1234",
                  "agentSelectorConfig" : {
                    "agentSelectorType" : "all-agents",
                    "maxMachines" : 10
                  },
                  "hasPathTraceInSession" : true,
                  "testName" : "Test name"
                }
                                  """;
        EndpointAgentToServerTest mappedResponse = 
                mapper.readValue(responseBodyJson, EndpointAgentToServerTest.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Update agent to server endpoint scheduled test
     * <p>
     * Updates an agent to server scheduled test. Includes support for  enabling and disabling the test.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void updateEndpointAgentToServerDetailRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "server" : "www.example.com",
                  "isEnabled" : true,
                  "interval" : 120,
                  "testName" : "Test name"
                }
                                 """;
        EndpointNetworkTestUpdate mappedRequest = 
                mapper.readValue(requestBodyJson, EndpointNetworkTestUpdate.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "server" : "www.example.com",
                  "isSavedEvent" : false,
                  "_links" : {
                    "testResults" : [ {
                      "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/scheduled-tests/281474976710706/network/filter"
                    }, {
                      "href" : "https://api.thousandeyes.com/v7/endpoint/test-results/scheduled-tests/281474976710706/pathvis"
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
                  "alertRules" : [ {
                    "severity" : "major",
                    "roundsViolatingOutOf" : 5,
                    "roundsViolatingRequired" : 2,
                    "isDefault" : true,
                    "expression" : "((hops((hopDelay >= 100 ms))))",
                    "alertType" : "http-server",
                    "minimumSourcesPct" : 99,
                    "ruleName" : "The End of the Internet",
                    "minimumSources" : 10,
                    "roundsViolatingMode" : "exact",
                    "ruleId" : "127094"
                  }, {
                    "severity" : "major",
                    "roundsViolatingOutOf" : 5,
                    "roundsViolatingRequired" : 2,
                    "isDefault" : true,
                    "expression" : "((hops((hopDelay >= 100 ms))))",
                    "alertType" : "http-server",
                    "minimumSourcesPct" : 99,
                    "ruleName" : "The End of the Internet",
                    "minimumSources" : 10,
                    "roundsViolatingMode" : "exact",
                    "ruleId" : "127094"
                  } ],
                  "type" : "agent-to-server",
                  "labels" : [ {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  }, {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  } ],
                  "createdDate" : "2022-07-17T22:00:54Z",
                  "port" : 80,
                  "isEnabled" : true,
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "interval" : 120,
                  "testId" : "281474976710706",
                  "aid" : "1234",
                  "agentSelectorConfig" : {
                    "agentSelectorType" : "all-agents",
                    "maxMachines" : 10
                  },
                  "hasPathTraceInSession" : true,
                  "testName" : "Test name"
                }
                                  """;
        EndpointAgentToServerTest mappedResponse = 
                mapper.readValue(responseBodyJson, EndpointAgentToServerTest.class);
        assertNotNull(mappedResponse);
    }
    
}
