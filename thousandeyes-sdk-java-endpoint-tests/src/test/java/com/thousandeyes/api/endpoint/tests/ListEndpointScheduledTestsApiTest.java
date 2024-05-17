/*
 * Endpoint Tests API
 *  Manage endpoint agent dynamic and scheduled tests using the Endpoint Tests API. 
 *
 * The version of the OpenAPI document: 7.0.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.tests;

import com.thousandeyes.api.endpoint.tests.model.EndpointTests;
import com.thousandeyes.api.endpoint.tests.model.Error;
import com.thousandeyes.api.endpoint.tests.model.UnauthorizedError;
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
 * Request and Response model deserialization tests for ListEndpointScheduledTestsApi
 */
public class ListEndpointScheduledTestsApiTest {
    // private final ListEndpointScheduledTestsApi api = new ListEndpointScheduledTestsApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * List endpoint scheduled tests
     * <p>
     * Returns a list of all endpoint scheduled tests configured in ThousandEyes. This list does not contain saved events.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getEndpointTestsListRequestAndResponseDeserializationTest()
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
                    "networkMeasurements" : true,
                    "type" : "agent-to-server",
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
                    "networkMeasurements" : true,
                    "type" : "agent-to-server",
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
        EndpointTests mappedResponse = 
                mapper.readValue(responseBodyJson, EndpointTests.class);
        assertNotNull(mappedResponse);
    }
    
}
