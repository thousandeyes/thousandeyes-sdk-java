/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
 *
 * The version of the OpenAPI document: 7.0.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.tests.results;

import com.thousandeyes.api.tests.results.model.BgpTestResults;
import com.thousandeyes.api.tests.results.model.BgpTestRouteInformationResults;
import com.thousandeyes.api.tests.results.model.Error;
import java.time.OffsetDateTime;
import com.thousandeyes.api.tests.results.model.UnauthorizedError;
import com.thousandeyes.api.tests.results.model.ValidationError;
import static com.thousandeyes.api.serialization.JSON.getDefault;
import static org.junit.jupiter.api.Assertions.assertNotNull;


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
 * Request and Response model deserialization tests for NetworkBgpTestMetricsApi
 */
public class NetworkBgpTestMetricsApiTest {
    // private final NetworkBgpTestMetricsApi api = new NetworkBgpTestMetricsApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Get BGP test results
     * <p>
     * Returns a list of BGP monitors actively monitoring the destination&#39;s target prefix. This list includes information about the prefix, its associated AS Number, and provides details regarding reachability, path updates, and any changes in the path for the target network. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getTestResultsBgpRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "test" : {
                    "_links" : {
                      "testResults" : [ {
                        "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/network"
                      }, {
                        "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/path-vis"
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
                    "liveShare" : false,
                    "savedEvent" : true,
                    "description" : "ThousandEyes Test",
                    "type" : "agent-to-server",
                    "enabled" : true,
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "createdBy" : "user@user.com",
                    "modifiedDate" : "2022-07-17T22:00:54Z",
                    "interval" : 120,
                    "modifiedBy" : "user@user.com",
                    "testId" : "281474976710706",
                    "alertsEnabled" : true,
                    "testName" : "ThousandEyes Test"
                  },
                  "endDate" : "2022-07-18T22:00:54Z",
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
                  "results" : [ {
                    "startTime" : 1384309800,
                    "endTime" : 1384309800,
                    "reachability" : 0.0,
                    "updates" : 0.0,
                    "pathChanges" : 0.0
                  }, {
                    "startTime" : 1384309800,
                    "endTime" : 1384309800,
                    "reachability" : 0.0,
                    "updates" : 0.0,
                    "pathChanges" : 0.0
                  } ],
                  "startDate" : "2022-07-17T22:00:54Z"
                }
                                  """;
        BgpTestResults mappedResponse = 
                mapper.readValue(responseBodyJson, BgpTestResults.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Get BGP route test results by prefix
     * <p>
     * Returns an ordered list of networks crossed by a particular network prefix, including assigned monitors for the test and the paths taken to reach the destination. This is similar to revealing ASPath details found in a BGP Routing Information Base (rib) dump. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getTestResultsBgpPrefixRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "test" : {
                    "_links" : {
                      "testResults" : [ {
                        "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/network"
                      }, {
                        "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/path-vis"
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
                    "liveShare" : false,
                    "savedEvent" : true,
                    "description" : "ThousandEyes Test",
                    "type" : "agent-to-server",
                    "enabled" : true,
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "createdBy" : "user@user.com",
                    "modifiedDate" : "2022-07-17T22:00:54Z",
                    "interval" : 120,
                    "modifiedBy" : "user@user.com",
                    "testId" : "281474976710706",
                    "alertsEnabled" : true,
                    "testName" : "ThousandEyes Test"
                  },
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
                  "results" : [ {
                    "hops" : [ {
                      "asName" : "Telus Advanced Communications",
                      "asn" : 852
                    }, {
                      "asName" : "Telus Advanced Communications",
                      "asn" : 852
                    } ],
                    "isActive" : true
                  }, {
                    "hops" : [ {
                      "asName" : "Telus Advanced Communications",
                      "asn" : 852
                    }, {
                      "asName" : "Telus Advanced Communications",
                      "asn" : 852
                    } ],
                    "isActive" : true
                  } ]
                }
                                  """;
        BgpTestRouteInformationResults mappedResponse = 
                mapper.readValue(responseBodyJson, BgpTestRouteInformationResults.class);
        assertNotNull(mappedResponse);
    }
    
}
