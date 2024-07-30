/*
 * Endpoint Tests API
 *  Manage endpoint agent dynamic and scheduled tests using the Endpoint Tests API. 
 *
 * The version of the OpenAPI document: 7.0.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.tests;

import com.thousandeyes.sdk.endpoint.tests.model.EndpointHttpServerTest;
import com.thousandeyes.sdk.endpoint.tests.model.EndpointHttpServerTestRequest;
import com.thousandeyes.sdk.endpoint.tests.model.EndpointHttpServerTests;
import com.thousandeyes.sdk.endpoint.tests.model.EndpointHttpTestUpdate;
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
 * Request and Response model deserialization tests for ScheduledTestsHttpServerApi
 */
public class ScheduledTestsHttpServerApiTest {
    // private final ScheduledTestsHttpServerApi api = new ScheduledTestsHttpServerApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Create HTTP server endpoint scheduled test
     * <p>
     * Creates a new HTTP server endpoint test in ThousandEyes, using properties specified in the POST data. Please note that only users with Account Admin privileges have the authorization to create new tests; regular users are restricted from using POST-based methods. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void createHttpServerEndpointScheduledTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "hasPing" : true,
                  "verifyCertificate" : false,
                  "agentSelectorType" : "all-agents",
                  "maxMachines" : 10,
                  "httpTimeLimit" : 5000,
                  "endpointAgentLabels" : [ "567", "214" ],
                  "url" : "www.example.com",
                  "tcpProbeMode" : "auto",
                  "agents" : [ "0a3b9998-dc3a-4ff2-b50d-ac4a7cd986e1", "66eec0f1-72b4-4755-aa83-3aed61d17f3c" ],
                  "protocol" : "icmp",
                  "password" : "password",
                  "port" : 80,
                  "hasTraceroute" : true,
                  "targetResponseTime" : 1000,
                  "interval" : 120,
                  "authType" : "none",
                  "hasPathTraceInSession" : true,
                  "testName" : "Test name",
                  "username" : "username",
                  "sslVersionId" : "0"
                }
                                 """;
        EndpointHttpServerTestRequest mappedRequest = 
                mapper.readValue(requestBodyJson, EndpointHttpServerTestRequest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "server" : "www.example.com",
                  "isSavedEvent" : false,
                  "sslVersion" : "Auto",
                  "useNtlm" : false,
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
                    "ruleId" : "127094",
                    "direction" : "to-target"
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
                    "ruleId" : "127094",
                    "direction" : "to-target"
                  } ],
                  "httpTimeLimit" : 5000,
                  "type" : "http-server",
                  "protocol" : "icmp",
                  "httpVersion" : 2,
                  "followRedirects" : true,
                  "contentRegex" : "(regex)+",
                  "authType" : "none",
                  "testName" : "Test name",
                  "verifyCertificate" : false,
                  "userAgent" : "curl",
                  "networkMeasurements" : true,
                  "tcpProbeMode" : "auto",
                  "url" : "www.example.com",
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
                  "postBody" : "body",
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
                  "httpTargetTime" : 100,
                  "username" : "username",
                  "sslVersionId" : "0"
                }
                                  """;
        EndpointHttpServerTest mappedResponse = 
                mapper.readValue(responseBodyJson, EndpointHttpServerTest.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Delete HTTP server scheduled test
     * <p>
     * Deletes an HTTP server endpoint scheduled test.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Disabled
    @Test
    public void deleteHttpServerEndpointScheduledTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

    }
    
    /**
     * Retrieves HTTP server endpoint scheduled test
     * <p>
     * Retrieves details of an HTTP Server endpoint scheduled test.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getHttpServerEndpointScheduledTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "server" : "www.example.com",
                  "isSavedEvent" : false,
                  "sslVersion" : "Auto",
                  "useNtlm" : false,
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
                    "ruleId" : "127094",
                    "direction" : "to-target"
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
                    "ruleId" : "127094",
                    "direction" : "to-target"
                  } ],
                  "httpTimeLimit" : 5000,
                  "type" : "http-server",
                  "protocol" : "icmp",
                  "httpVersion" : 2,
                  "followRedirects" : true,
                  "contentRegex" : "(regex)+",
                  "authType" : "none",
                  "testName" : "Test name",
                  "verifyCertificate" : false,
                  "userAgent" : "curl",
                  "networkMeasurements" : true,
                  "tcpProbeMode" : "auto",
                  "url" : "www.example.com",
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
                  "postBody" : "body",
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
                  "httpTargetTime" : 100,
                  "username" : "username",
                  "sslVersionId" : "0"
                }
                                  """;
        EndpointHttpServerTest mappedResponse = 
                mapper.readValue(responseBodyJson, EndpointHttpServerTest.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * List HTTP server endpoint scheduled tests
     * <p>
     * Returns a list of agent to server endpoint scheduled tests configured in ThousandEyes. This list does not contain saved events. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getHttpServerEndpointScheduledTestsRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "tests" : [ {
                    "server" : "www.example.com",
                    "isSavedEvent" : false,
                    "sslVersion" : "Auto",
                    "useNtlm" : false,
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
                      "ruleId" : "127094",
                      "direction" : "to-target"
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
                      "ruleId" : "127094",
                      "direction" : "to-target"
                    } ],
                    "httpTimeLimit" : 5000,
                    "type" : "http-server",
                    "protocol" : "icmp",
                    "httpVersion" : 2,
                    "followRedirects" : true,
                    "contentRegex" : "(regex)+",
                    "authType" : "none",
                    "testName" : "Test name",
                    "verifyCertificate" : false,
                    "userAgent" : "curl",
                    "networkMeasurements" : true,
                    "tcpProbeMode" : "auto",
                    "url" : "www.example.com",
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
                    "postBody" : "body",
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
                    "httpTargetTime" : 100,
                    "username" : "username",
                    "sslVersionId" : "0"
                  }, {
                    "server" : "www.example.com",
                    "isSavedEvent" : false,
                    "sslVersion" : "Auto",
                    "useNtlm" : false,
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
                      "ruleId" : "127094",
                      "direction" : "to-target"
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
                      "ruleId" : "127094",
                      "direction" : "to-target"
                    } ],
                    "httpTimeLimit" : 5000,
                    "type" : "http-server",
                    "protocol" : "icmp",
                    "httpVersion" : 2,
                    "followRedirects" : true,
                    "contentRegex" : "(regex)+",
                    "authType" : "none",
                    "testName" : "Test name",
                    "verifyCertificate" : false,
                    "userAgent" : "curl",
                    "networkMeasurements" : true,
                    "tcpProbeMode" : "auto",
                    "url" : "www.example.com",
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
                    "postBody" : "body",
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
                    "httpTargetTime" : 100,
                    "username" : "username",
                    "sslVersionId" : "0"
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
        EndpointHttpServerTests mappedResponse = 
                mapper.readValue(responseBodyJson, EndpointHttpServerTests.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Update HTTP server endpoint scheduled test
     * <p>
     * Updates an HTTP server scheduled test. Includes support for  enabling and disabling the test.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void updateHttpServerEndpointScheduledTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "protocol" : "icmp",
                  "isEnabled" : true,
                  "interval" : 120,
                  "tcpProbeMode" : "auto",
                  "url" : "www.thousandeyes.com",
                  "testName" : "Test name"
                }
                                 """;
        EndpointHttpTestUpdate mappedRequest = 
                mapper.readValue(requestBodyJson, EndpointHttpTestUpdate.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "server" : "www.example.com",
                  "isSavedEvent" : false,
                  "sslVersion" : "Auto",
                  "useNtlm" : false,
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
                    "ruleId" : "127094",
                    "direction" : "to-target"
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
                    "ruleId" : "127094",
                    "direction" : "to-target"
                  } ],
                  "httpTimeLimit" : 5000,
                  "type" : "http-server",
                  "protocol" : "icmp",
                  "httpVersion" : 2,
                  "followRedirects" : true,
                  "contentRegex" : "(regex)+",
                  "authType" : "none",
                  "testName" : "Test name",
                  "verifyCertificate" : false,
                  "userAgent" : "curl",
                  "networkMeasurements" : true,
                  "tcpProbeMode" : "auto",
                  "url" : "www.example.com",
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
                  "postBody" : "body",
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
                  "httpTargetTime" : 100,
                  "username" : "username",
                  "sslVersionId" : "0"
                }
                                  """;
        EndpointHttpServerTest mappedResponse = 
                mapper.readValue(responseBodyJson, EndpointHttpServerTest.class);
        assertNotNull(mappedResponse);
    }
    
}
