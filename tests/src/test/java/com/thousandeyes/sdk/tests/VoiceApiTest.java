/*
 * Tests API
 * This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests. 
 *
 * The version of the OpenAPI document: 7.0.14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests;

import com.thousandeyes.sdk.tests.model.Error;
import com.thousandeyes.sdk.tests.model.Expand;
import java.net.URI;
import com.thousandeyes.sdk.tests.model.UnauthorizedError;
import com.thousandeyes.sdk.tests.model.UpdateVoiceTest;
import com.thousandeyes.sdk.tests.model.ValidationError;
import com.thousandeyes.sdk.tests.model.VoiceTest;
import com.thousandeyes.sdk.tests.model.VoiceTests;
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
 * Request and Response model deserialization tests for VoiceApi
 */
public class VoiceApiTest {
    // private final VoiceApi api = new VoiceApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Create Voice test
     * <p>
     * Creates a new Voice test. This method requires Account Admin permissions.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void createVoiceTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
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
                  "alertRules" : [ "344753", "212697" ],
                  "description" : "ThousandEyes Test",
                  "type" : "voice",
                  "usePublicBgp" : true,
                  "enabled" : true,
                  "jitterBuffer" : 40,
                  "dscpId" : "0",
                  "duration" : 5,
                  "dscp" : "Best Effort (DSCP 0)",
                  "modifiedBy" : "user@user.com",
                  "alertsEnabled" : true,
                  "testName" : "ThousandEyes Test",
                  "numPathTraces" : 3,
                  "bgpMeasurements" : true,
                  "liveShare" : false,
                  "savedEvent" : true,
                  "labels" : [ "9842", "1283" ],
                  "agents" : [ {
                    "agentId" : "125",
                    "sourceIpAddress" : "1.1.1.1"
                  }, {
                    "agentId" : "125",
                    "sourceIpAddress" : "1.1.1.1"
                  } ],
                  "codec" : "G.711 @ 64 Kbps",
                  "codecId" : "0",
                  "createdDate" : "2022-07-17T22:00:54Z",
                  "createdBy" : "user@user.com",
                  "port" : 1024,
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "targetAgentId" : "281474976710706",
                  "interval" : 120,
                  "testId" : "281474976710706",
                  "sharedWithAccounts" : [ "1234", "12345" ],
                  "monitors" : [ {
                    "monitorType" : "public",
                    "monitorId" : "1234",
                    "monitorName" : "Seattle, WA",
                    "ipAddress" : "4.69.184.193",
                    "countryId" : "GB",
                    "network" : "Level 3 Communications, Inc. (AS 3356)"
                  }, {
                    "monitorType" : "public",
                    "monitorId" : "1234",
                    "monitorName" : "Seattle, WA",
                    "ipAddress" : "4.69.184.193",
                    "countryId" : "GB",
                    "network" : "Level 3 Communications, Inc. (AS 3356)"
                  } ]
                }
                                 """;
        UpdateVoiceTest mappedRequest = 
                mapper.readValue(requestBodyJson, UpdateVoiceTest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
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
                  "description" : "ThousandEyes Test",
                  "type" : "voice",
                  "usePublicBgp" : true,
                  "enabled" : true,
                  "jitterBuffer" : 40,
                  "dscpId" : "0",
                  "duration" : 5,
                  "dscp" : "Best Effort (DSCP 0)",
                  "modifiedBy" : "user@user.com",
                  "alertsEnabled" : true,
                  "testName" : "ThousandEyes Test",
                  "numPathTraces" : 3,
                  "bgpMeasurements" : true,
                  "liveShare" : false,
                  "savedEvent" : true,
                  "labels" : [ {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  }, {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  } ],
                  "agents" : [ {
                    "agentId" : "281474976710706",
                    "agentType" : "enterprise-cluster",
                    "publicIpAddresses" : [ "192.168.1.78", "f9b2:3a21:f25c:d300:03f4:586d:f8d6:4e1c" ],
                    "prefix" : "99.128.0.0/11",
                    "agentName" : "thousandeyes-stg-va-254",
                    "ipAddresses" : [ "99.139.65.220", "9bbd:8a0a:a257:5876:288b:6cb2:3f36:64ce" ],
                    "location" : "San Francisco Bay Area",
                    "countryId" : "US",
                    "enabled" : true,
                    "network" : "AT&T Services, Inc. (AS 7018)",
                    "verifySslCertificates" : true
                  }, {
                    "agentId" : "281474976710706",
                    "agentType" : "enterprise-cluster",
                    "publicIpAddresses" : [ "192.168.1.78", "f9b2:3a21:f25c:d300:03f4:586d:f8d6:4e1c" ],
                    "prefix" : "99.128.0.0/11",
                    "agentName" : "thousandeyes-stg-va-254",
                    "ipAddresses" : [ "99.139.65.220", "9bbd:8a0a:a257:5876:288b:6cb2:3f36:64ce" ],
                    "location" : "San Francisco Bay Area",
                    "countryId" : "US",
                    "enabled" : true,
                    "network" : "AT&T Services, Inc. (AS 7018)",
                    "verifySslCertificates" : true
                  } ],
                  "codec" : "G.711 @ 64 Kbps",
                  "codecId" : "0",
                  "createdDate" : "2022-07-17T22:00:54Z",
                  "createdBy" : "user@user.com",
                  "port" : 1024,
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "targetAgentId" : "281474976710706",
                  "interval" : 120,
                  "testId" : "281474976710706",
                  "sharedWithAccounts" : [ {
                    "name" : "Account name",
                    "aid" : "1234"
                  }, {
                    "name" : "Account name",
                    "aid" : "1234"
                  } ],
                  "monitors" : [ {
                    "monitorType" : "public",
                    "monitorId" : "1234",
                    "monitorName" : "Seattle, WA",
                    "ipAddress" : "4.69.184.193",
                    "countryId" : "GB",
                    "network" : "Level 3 Communications, Inc. (AS 3356)"
                  }, {
                    "monitorType" : "public",
                    "monitorId" : "1234",
                    "monitorName" : "Seattle, WA",
                    "ipAddress" : "4.69.184.193",
                    "countryId" : "GB",
                    "network" : "Level 3 Communications, Inc. (AS 3356)"
                  } ]
                }
                                  """;
        VoiceTest mappedResponse = 
                mapper.readValue(responseBodyJson, VoiceTest.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Delete Voice test
     * <p>
     * Deletes the specified Voice test. This method requires Account Admin permissions.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Disabled
    @Test
    public void deleteVoiceTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

    }
    
    /**
     * Get Voice test
     * <p>
     * Returns details for a Voice test, including name, intervals, targets, alert rules and agents.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getVoiceTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
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
                  "description" : "ThousandEyes Test",
                  "type" : "voice",
                  "usePublicBgp" : true,
                  "enabled" : true,
                  "jitterBuffer" : 40,
                  "dscpId" : "0",
                  "duration" : 5,
                  "dscp" : "Best Effort (DSCP 0)",
                  "modifiedBy" : "user@user.com",
                  "alertsEnabled" : true,
                  "testName" : "ThousandEyes Test",
                  "numPathTraces" : 3,
                  "bgpMeasurements" : true,
                  "liveShare" : false,
                  "savedEvent" : true,
                  "labels" : [ {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  }, {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  } ],
                  "agents" : [ {
                    "agentId" : "281474976710706",
                    "agentType" : "enterprise-cluster",
                    "publicIpAddresses" : [ "192.168.1.78", "f9b2:3a21:f25c:d300:03f4:586d:f8d6:4e1c" ],
                    "prefix" : "99.128.0.0/11",
                    "agentName" : "thousandeyes-stg-va-254",
                    "ipAddresses" : [ "99.139.65.220", "9bbd:8a0a:a257:5876:288b:6cb2:3f36:64ce" ],
                    "location" : "San Francisco Bay Area",
                    "countryId" : "US",
                    "enabled" : true,
                    "network" : "AT&T Services, Inc. (AS 7018)",
                    "verifySslCertificates" : true
                  }, {
                    "agentId" : "281474976710706",
                    "agentType" : "enterprise-cluster",
                    "publicIpAddresses" : [ "192.168.1.78", "f9b2:3a21:f25c:d300:03f4:586d:f8d6:4e1c" ],
                    "prefix" : "99.128.0.0/11",
                    "agentName" : "thousandeyes-stg-va-254",
                    "ipAddresses" : [ "99.139.65.220", "9bbd:8a0a:a257:5876:288b:6cb2:3f36:64ce" ],
                    "location" : "San Francisco Bay Area",
                    "countryId" : "US",
                    "enabled" : true,
                    "network" : "AT&T Services, Inc. (AS 7018)",
                    "verifySslCertificates" : true
                  } ],
                  "codec" : "G.711 @ 64 Kbps",
                  "codecId" : "0",
                  "createdDate" : "2022-07-17T22:00:54Z",
                  "createdBy" : "user@user.com",
                  "port" : 1024,
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "targetAgentId" : "281474976710706",
                  "interval" : 120,
                  "testId" : "281474976710706",
                  "sharedWithAccounts" : [ {
                    "name" : "Account name",
                    "aid" : "1234"
                  }, {
                    "name" : "Account name",
                    "aid" : "1234"
                  } ],
                  "monitors" : [ {
                    "monitorType" : "public",
                    "monitorId" : "1234",
                    "monitorName" : "Seattle, WA",
                    "ipAddress" : "4.69.184.193",
                    "countryId" : "GB",
                    "network" : "Level 3 Communications, Inc. (AS 3356)"
                  }, {
                    "monitorType" : "public",
                    "monitorId" : "1234",
                    "monitorName" : "Seattle, WA",
                    "ipAddress" : "4.69.184.193",
                    "countryId" : "GB",
                    "network" : "Level 3 Communications, Inc. (AS 3356)"
                  } ]
                }
                                  """;
        VoiceTest mappedResponse = 
                mapper.readValue(responseBodyJson, VoiceTest.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * List Voice tests
     * <p>
     * Returns a list of Voice tests and saved events.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getVoiceTestsRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "tests" : [ {
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
                    "description" : "ThousandEyes Test",
                    "type" : "voice",
                    "usePublicBgp" : true,
                    "enabled" : true,
                    "jitterBuffer" : 40,
                    "dscpId" : "0",
                    "duration" : 5,
                    "dscp" : "Best Effort (DSCP 0)",
                    "modifiedBy" : "user@user.com",
                    "alertsEnabled" : true,
                    "testName" : "ThousandEyes Test",
                    "numPathTraces" : 3,
                    "bgpMeasurements" : true,
                    "liveShare" : false,
                    "savedEvent" : true,
                    "codec" : "G.711 @ 64 Kbps",
                    "codecId" : "0",
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "createdBy" : "user@user.com",
                    "port" : 1024,
                    "modifiedDate" : "2022-07-17T22:00:54Z",
                    "targetAgentId" : "281474976710706",
                    "interval" : 120,
                    "testId" : "281474976710706"
                  }, {
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
                    "description" : "ThousandEyes Test",
                    "type" : "voice",
                    "usePublicBgp" : true,
                    "enabled" : true,
                    "jitterBuffer" : 40,
                    "dscpId" : "0",
                    "duration" : 5,
                    "dscp" : "Best Effort (DSCP 0)",
                    "modifiedBy" : "user@user.com",
                    "alertsEnabled" : true,
                    "testName" : "ThousandEyes Test",
                    "numPathTraces" : 3,
                    "bgpMeasurements" : true,
                    "liveShare" : false,
                    "savedEvent" : true,
                    "codec" : "G.711 @ 64 Kbps",
                    "codecId" : "0",
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "createdBy" : "user@user.com",
                    "port" : 1024,
                    "modifiedDate" : "2022-07-17T22:00:54Z",
                    "targetAgentId" : "281474976710706",
                    "interval" : 120,
                    "testId" : "281474976710706"
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
        VoiceTests mappedResponse = 
                mapper.readValue(responseBodyJson, VoiceTests.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Update Voice test
     * <p>
     * Updates a Voice test. The target test cannot be a live share or saved event. This method requires Account Admin permissions.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void updateVoiceTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
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
                  "alertRules" : [ "344753", "212697" ],
                  "description" : "ThousandEyes Test",
                  "type" : "voice",
                  "usePublicBgp" : true,
                  "enabled" : true,
                  "jitterBuffer" : 40,
                  "dscpId" : "0",
                  "duration" : 5,
                  "dscp" : "Best Effort (DSCP 0)",
                  "modifiedBy" : "user@user.com",
                  "alertsEnabled" : true,
                  "testName" : "ThousandEyes Test",
                  "numPathTraces" : 3,
                  "bgpMeasurements" : true,
                  "liveShare" : false,
                  "savedEvent" : true,
                  "labels" : [ "9842", "1283" ],
                  "agents" : [ {
                    "agentId" : "125",
                    "sourceIpAddress" : "1.1.1.1"
                  }, {
                    "agentId" : "125",
                    "sourceIpAddress" : "1.1.1.1"
                  } ],
                  "codec" : "G.711 @ 64 Kbps",
                  "codecId" : "0",
                  "createdDate" : "2022-07-17T22:00:54Z",
                  "createdBy" : "user@user.com",
                  "port" : 1024,
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "targetAgentId" : "281474976710706",
                  "interval" : 120,
                  "testId" : "281474976710706",
                  "sharedWithAccounts" : [ "1234", "12345" ],
                  "monitors" : [ {
                    "monitorType" : "public",
                    "monitorId" : "1234",
                    "monitorName" : "Seattle, WA",
                    "ipAddress" : "4.69.184.193",
                    "countryId" : "GB",
                    "network" : "Level 3 Communications, Inc. (AS 3356)"
                  }, {
                    "monitorType" : "public",
                    "monitorId" : "1234",
                    "monitorName" : "Seattle, WA",
                    "ipAddress" : "4.69.184.193",
                    "countryId" : "GB",
                    "network" : "Level 3 Communications, Inc. (AS 3356)"
                  } ]
                }
                                 """;
        UpdateVoiceTest mappedRequest = 
                mapper.readValue(requestBodyJson, UpdateVoiceTest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
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
                  "description" : "ThousandEyes Test",
                  "type" : "voice",
                  "usePublicBgp" : true,
                  "enabled" : true,
                  "jitterBuffer" : 40,
                  "dscpId" : "0",
                  "duration" : 5,
                  "dscp" : "Best Effort (DSCP 0)",
                  "modifiedBy" : "user@user.com",
                  "alertsEnabled" : true,
                  "testName" : "ThousandEyes Test",
                  "numPathTraces" : 3,
                  "bgpMeasurements" : true,
                  "liveShare" : false,
                  "savedEvent" : true,
                  "labels" : [ {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  }, {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  } ],
                  "agents" : [ {
                    "agentId" : "281474976710706",
                    "agentType" : "enterprise-cluster",
                    "publicIpAddresses" : [ "192.168.1.78", "f9b2:3a21:f25c:d300:03f4:586d:f8d6:4e1c" ],
                    "prefix" : "99.128.0.0/11",
                    "agentName" : "thousandeyes-stg-va-254",
                    "ipAddresses" : [ "99.139.65.220", "9bbd:8a0a:a257:5876:288b:6cb2:3f36:64ce" ],
                    "location" : "San Francisco Bay Area",
                    "countryId" : "US",
                    "enabled" : true,
                    "network" : "AT&T Services, Inc. (AS 7018)",
                    "verifySslCertificates" : true
                  }, {
                    "agentId" : "281474976710706",
                    "agentType" : "enterprise-cluster",
                    "publicIpAddresses" : [ "192.168.1.78", "f9b2:3a21:f25c:d300:03f4:586d:f8d6:4e1c" ],
                    "prefix" : "99.128.0.0/11",
                    "agentName" : "thousandeyes-stg-va-254",
                    "ipAddresses" : [ "99.139.65.220", "9bbd:8a0a:a257:5876:288b:6cb2:3f36:64ce" ],
                    "location" : "San Francisco Bay Area",
                    "countryId" : "US",
                    "enabled" : true,
                    "network" : "AT&T Services, Inc. (AS 7018)",
                    "verifySslCertificates" : true
                  } ],
                  "codec" : "G.711 @ 64 Kbps",
                  "codecId" : "0",
                  "createdDate" : "2022-07-17T22:00:54Z",
                  "createdBy" : "user@user.com",
                  "port" : 1024,
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "targetAgentId" : "281474976710706",
                  "interval" : 120,
                  "testId" : "281474976710706",
                  "sharedWithAccounts" : [ {
                    "name" : "Account name",
                    "aid" : "1234"
                  }, {
                    "name" : "Account name",
                    "aid" : "1234"
                  } ],
                  "monitors" : [ {
                    "monitorType" : "public",
                    "monitorId" : "1234",
                    "monitorName" : "Seattle, WA",
                    "ipAddress" : "4.69.184.193",
                    "countryId" : "GB",
                    "network" : "Level 3 Communications, Inc. (AS 3356)"
                  }, {
                    "monitorType" : "public",
                    "monitorId" : "1234",
                    "monitorName" : "Seattle, WA",
                    "ipAddress" : "4.69.184.193",
                    "countryId" : "GB",
                    "network" : "Level 3 Communications, Inc. (AS 3356)"
                  } ]
                }
                                  """;
        VoiceTest mappedResponse = 
                mapper.readValue(responseBodyJson, VoiceTest.class);
        assertNotNull(mappedResponse);
    }
    
}
