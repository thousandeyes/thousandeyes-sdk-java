/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
 *
 * The version of the OpenAPI document: 7.0.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests.results;

import com.thousandeyes.sdk.tests.results.model.Error;
import com.thousandeyes.sdk.tests.results.model.NetworkTestResults;
import java.time.OffsetDateTime;
import com.thousandeyes.sdk.tests.results.model.PathVisDetailTestResults;
import com.thousandeyes.sdk.tests.results.model.PathVisDirection;
import com.thousandeyes.sdk.tests.results.model.PathVisTestResults;
import com.thousandeyes.sdk.tests.results.model.TestDirection;
import com.thousandeyes.sdk.tests.results.model.UnauthorizedError;
import com.thousandeyes.sdk.tests.results.model.ValidationError;
import static com.thousandeyes.sdk.serialization.JSON.getDefault;
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
 * Request and Response model deserialization tests for NetworkTestMetricsApi
 */
public class NetworkTestMetricsApiTest {
    // private final NetworkTestMetricsApi api = new NetworkTestMetricsApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Get network test results
     * <p>
     * Returns network test results for every agent and round. If you do not specify a window or a start and end date, data is displayed for the most recent testing round. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getTestNetworkResultsRequestAndResponseDeserializationTest()
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
                    "date" : "2022-07-17T22:00:54Z",
                    "server" : "www.thousandeyes.com:80",
                    "availableBandwidth" : 9.100464,
                    "agent" : {
                      "agentId" : "281474976710706",
                      "agentName" : "thousandeyes-stg-va-254",
                      "location" : "San Francisco Bay Area",
                      "countryId" : "US"
                    },
                    "packetsBySecond" : [ [ ], [ 0 ], [ 2 ], [ 2, 1 ], [ 1, 1 ] ],
                    "avgLatency" : 167.04,
                    "bandwidth" : 4.3313155,
                    "minLatency" : 167.0,
                    "_links" : {
                      "appLink" : {
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
                    "maxLatency" : 168.0,
                    "capacity" : 210.10854,
                    "loss" : 0.0,
                    "jitter" : 0.076808,
                    "serverIp" : "50.18.127.223",
                    "startTime" : 1384309800,
                    "endTime" : 1384309800,
                    "roundId" : 1384309800,
                    "direction" : "to-target"
                  }, {
                    "date" : "2022-07-17T22:00:54Z",
                    "server" : "www.thousandeyes.com:80",
                    "availableBandwidth" : 9.100464,
                    "agent" : {
                      "agentId" : "281474976710706",
                      "agentName" : "thousandeyes-stg-va-254",
                      "location" : "San Francisco Bay Area",
                      "countryId" : "US"
                    },
                    "packetsBySecond" : [ [ ], [ 0 ], [ 2 ], [ 2, 1 ], [ 1, 1 ] ],
                    "avgLatency" : 167.04,
                    "bandwidth" : 4.3313155,
                    "minLatency" : 167.0,
                    "_links" : {
                      "appLink" : {
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
                    "maxLatency" : 168.0,
                    "capacity" : 210.10854,
                    "loss" : 0.0,
                    "jitter" : 0.076808,
                    "serverIp" : "50.18.127.223",
                    "startTime" : 1384309800,
                    "endTime" : 1384309800,
                    "roundId" : 1384309800,
                    "direction" : "to-target"
                  } ],
                  "startDate" : "2022-07-17T22:00:54Z"
                }
                                  """;
        NetworkTestResults mappedResponse = 
                mapper.readValue(responseBodyJson, NetworkTestResults.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Get path visualization test results by agent and round
     * <p>
     * Returns a summary of the path trace data collected during path visualization for a given agent and round. With each attempt, three tries are made to reach the destination. The entire path is displayed in order.  Bidirectional agent-to-agent tests also support the &#x60;direction&#x60; parameter. For example, if agents A, B, and C are testing agent D bidirectionally, and you want results from the route from agent A to agent D, you can use the query &#x60;direction&#x3D;to-target&#x60;. For results from agent D to agent A, you can use &#x60;direction&#x3D;from-target&#x60;. To get both results for both routes, query without the direction parameter. The source will always be agent A and the destination will be agent D, but the direction field will indicate which trace direction you want test results from. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getTestPathVisAgentRoundResultsRequestAndResponseDeserializationTest()
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
                    "date" : "2022-07-17T22:00:54Z",
                    "server" : "www.google.com:443",
                    "agent" : {
                      "agentId" : "281474976710706",
                      "agentName" : "thousandeyes-stg-va-254",
                      "location" : "San Francisco Bay Area",
                      "countryId" : "US"
                    },
                    "_links" : {
                      "appLink" : {
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
                    "targetIsProxy" : true,
                    "sourcePrefix" : "196.40.96.0/20",
                    "sourceIp" : "196.40.106.237",
                    "pathTraces" : [ {
                      "hops" : [ {
                        "rdns" : "core-router1.cpt2.host-h.net",
                        "prefix" : "196.40.96.0/20",
                        "responseTime" : 1,
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "mpls" : "mpls",
                        "location" : "Cape Town, South Africa",
                        "network" : "HETZNER (Pty) Ltd (AS 37153)"
                      }, {
                        "rdns" : "core-router1.cpt2.host-h.net",
                        "prefix" : "196.40.96.0/20",
                        "responseTime" : 1,
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "mpls" : "mpls",
                        "location" : "Cape Town, South Africa",
                        "network" : "HETZNER (Pty) Ltd (AS 37153)"
                      } ],
                      "pathId" : "4711301366345855606023718047703941305741293841502186803"
                    }, {
                      "hops" : [ {
                        "rdns" : "core-router1.cpt2.host-h.net",
                        "prefix" : "196.40.96.0/20",
                        "responseTime" : 1,
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "mpls" : "mpls",
                        "location" : "Cape Town, South Africa",
                        "network" : "HETZNER (Pty) Ltd (AS 37153)"
                      }, {
                        "rdns" : "core-router1.cpt2.host-h.net",
                        "prefix" : "196.40.96.0/20",
                        "responseTime" : 1,
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "mpls" : "mpls",
                        "location" : "Cape Town, South Africa",
                        "network" : "HETZNER (Pty) Ltd (AS 37153)"
                      } ],
                      "pathId" : "4711301366345855606023718047703941305741293841502186803"
                    } ],
                    "serverIp" : "172.217.170.68",
                    "startTime" : 1384309800,
                    "endTime" : 1384309800,
                    "roundId" : 1384309800,
                    "direction" : "to-target"
                  }, {
                    "date" : "2022-07-17T22:00:54Z",
                    "server" : "www.google.com:443",
                    "agent" : {
                      "agentId" : "281474976710706",
                      "agentName" : "thousandeyes-stg-va-254",
                      "location" : "San Francisco Bay Area",
                      "countryId" : "US"
                    },
                    "_links" : {
                      "appLink" : {
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
                    "targetIsProxy" : true,
                    "sourcePrefix" : "196.40.96.0/20",
                    "sourceIp" : "196.40.106.237",
                    "pathTraces" : [ {
                      "hops" : [ {
                        "rdns" : "core-router1.cpt2.host-h.net",
                        "prefix" : "196.40.96.0/20",
                        "responseTime" : 1,
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "mpls" : "mpls",
                        "location" : "Cape Town, South Africa",
                        "network" : "HETZNER (Pty) Ltd (AS 37153)"
                      }, {
                        "rdns" : "core-router1.cpt2.host-h.net",
                        "prefix" : "196.40.96.0/20",
                        "responseTime" : 1,
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "mpls" : "mpls",
                        "location" : "Cape Town, South Africa",
                        "network" : "HETZNER (Pty) Ltd (AS 37153)"
                      } ],
                      "pathId" : "4711301366345855606023718047703941305741293841502186803"
                    }, {
                      "hops" : [ {
                        "rdns" : "core-router1.cpt2.host-h.net",
                        "prefix" : "196.40.96.0/20",
                        "responseTime" : 1,
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "mpls" : "mpls",
                        "location" : "Cape Town, South Africa",
                        "network" : "HETZNER (Pty) Ltd (AS 37153)"
                      }, {
                        "rdns" : "core-router1.cpt2.host-h.net",
                        "prefix" : "196.40.96.0/20",
                        "responseTime" : 1,
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "mpls" : "mpls",
                        "location" : "Cape Town, South Africa",
                        "network" : "HETZNER (Pty) Ltd (AS 37153)"
                      } ],
                      "pathId" : "4711301366345855606023718047703941305741293841502186803"
                    } ],
                    "serverIp" : "172.217.170.68",
                    "startTime" : 1384309800,
                    "endTime" : 1384309800,
                    "roundId" : 1384309800,
                    "direction" : "to-target"
                  } ]
                }
                                  """;
        PathVisDetailTestResults mappedResponse = 
                mapper.readValue(responseBodyJson, PathVisDetailTestResults.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Get path visualization network test results
     * <p>
     * Returns a summary of the path trace data collected during path visualization for a given time range. With each attempt, three tries are made to reach the destination. The entire path is displayed in order. If you do not specify a window or a start and end date, data is displayed for the most recent testing round.   Bidirectional agent-to-agent tests also support the &#x60;direction&#x60; parameter. For example, if agents A, B, and C are testing agent D bidirectionally, and you want results from the route from agent A to agent D, you can use the query &#x60;direction&#x3D;to-target&#x60;. For results from agent D to agent A, you can use &#x60;direction&#x3D;from-target&#x60;. To get both results for both routes, query without the direction parameter. The source will always be agent A and the destination will be agent D, but the direction field will indicate which trace direction you want test results from. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getTestPathVisResultsRequestAndResponseDeserializationTest()
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
                    "date" : "2022-07-17T22:00:54Z",
                    "server" : "www.google.com:443",
                    "agent" : {
                      "agentId" : "281474976710706",
                      "agentName" : "thousandeyes-stg-va-254",
                      "location" : "San Francisco Bay Area",
                      "countryId" : "US"
                    },
                    "_links" : {
                      "appLink" : {
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
                    "targetIsProxy" : true,
                    "sourcePrefix" : "196.40.96.0/20",
                    "sourceIp" : "196.40.106.237",
                    "pathTraces" : [ {
                      "numberOfHops" : 15,
                      "responseTime" : 1500,
                      "ipAddress" : "196.40.106.237",
                      "pathMtu" : 1500,
                      "pathId" : "1230899668701775614109128428722974545787322404682781961521",
                      "mss" : 1460
                    }, {
                      "numberOfHops" : 15,
                      "responseTime" : 1500,
                      "ipAddress" : "196.40.106.237",
                      "pathMtu" : 1500,
                      "pathId" : "1230899668701775614109128428722974545787322404682781961521",
                      "mss" : 1460
                    } ],
                    "serverIp" : "172.217.170.68",
                    "startTime" : 1384309800,
                    "endTime" : 1384309800,
                    "roundId" : 1384309800,
                    "direction" : "to-target"
                  }, {
                    "date" : "2022-07-17T22:00:54Z",
                    "server" : "www.google.com:443",
                    "agent" : {
                      "agentId" : "281474976710706",
                      "agentName" : "thousandeyes-stg-va-254",
                      "location" : "San Francisco Bay Area",
                      "countryId" : "US"
                    },
                    "_links" : {
                      "appLink" : {
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
                    "targetIsProxy" : true,
                    "sourcePrefix" : "196.40.96.0/20",
                    "sourceIp" : "196.40.106.237",
                    "pathTraces" : [ {
                      "numberOfHops" : 15,
                      "responseTime" : 1500,
                      "ipAddress" : "196.40.106.237",
                      "pathMtu" : 1500,
                      "pathId" : "1230899668701775614109128428722974545787322404682781961521",
                      "mss" : 1460
                    }, {
                      "numberOfHops" : 15,
                      "responseTime" : 1500,
                      "ipAddress" : "196.40.106.237",
                      "pathMtu" : 1500,
                      "pathId" : "1230899668701775614109128428722974545787322404682781961521",
                      "mss" : 1460
                    } ],
                    "serverIp" : "172.217.170.68",
                    "startTime" : 1384309800,
                    "endTime" : 1384309800,
                    "roundId" : 1384309800,
                    "direction" : "to-target"
                  } ],
                  "startDate" : "2022-07-17T22:00:54Z"
                }
                                  """;
        PathVisTestResults mappedResponse = 
                mapper.readValue(responseBodyJson, PathVisTestResults.class);
        assertNotNull(mappedResponse);
    }
    
}
