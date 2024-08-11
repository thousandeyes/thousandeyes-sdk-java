/*
 * Tests API
 * This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests;

import com.thousandeyes.sdk.tests.model.DnsServerTest;
import com.thousandeyes.sdk.tests.model.DnsServerTests;
import com.thousandeyes.sdk.tests.model.Error;
import com.thousandeyes.sdk.tests.model.Expand;
import java.net.URI;
import com.thousandeyes.sdk.tests.model.UnauthorizedError;
import com.thousandeyes.sdk.tests.model.UpdateDnsServerTest;
import com.thousandeyes.sdk.tests.model.ValidationError;
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
 * Request and Response model deserialization tests for DnsServerApi
 */
public class DnsServerApiTest {
    // private final DnsServerApi api = new DnsServerApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Create DNS Server test
     * <p>
     * Creates a new DNS Server test. This method requires Account Admin permissions.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void createDnsServerTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "mtuMeasurements" : false,
                  "ipv6Policy" : "use-agent-policy",
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
                  "bandwidthMeasurements" : true,
                  "description" : "ThousandEyes Test",
                  "dnsTransportProtocol" : "udp",
                  "probeMode" : "auto",
                  "type" : "dns-server",
                  "usePublicBgp" : true,
                  "enabled" : true,
                  "protocol" : "tcp",
                  "fixedPacketRate" : 50,
                  "pathTraceMode" : "classic",
                  "modifiedBy" : "user@user.com",
                  "dnsServers" : [ "dns-example.net", "8.8.8.8" ],
                  "alertsEnabled" : true,
                  "recursiveQueries" : true,
                  "testName" : "ThousandEyes Test",
                  "numPathTraces" : 3,
                  "bgpMeasurements" : true,
                  "dnsQueryClass" : "in",
                  "liveShare" : false,
                  "savedEvent" : true,
                  "networkMeasurements" : true,
                  "labels" : [ "9842", "1283" ],
                  "agents" : [ {
                    "agentId" : "125",
                    "sourceIpAddress" : "1.1.1.1"
                  }, {
                    "agentId" : "125",
                    "sourceIpAddress" : "1.1.1.1"
                  } ],
                  "createdDate" : "2022-07-17T22:00:54Z",
                  "createdBy" : "user@user.com",
                  "domain" : "www.thousandeyes.com",
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "interval" : 120,
                  "testId" : "281474976710706",
                  "sharedWithAccounts" : [ "1234", "12345" ],
                  "monitors" : [ "17410", "5" ]
                }
                                 """;
        UpdateDnsServerTest mappedRequest = 
                mapper.readValue(requestBodyJson, UpdateDnsServerTest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "mtuMeasurements" : false,
                  "ipv6Policy" : "use-agent-policy",
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
                  "bandwidthMeasurements" : true,
                  "description" : "ThousandEyes Test",
                  "dnsTransportProtocol" : "udp",
                  "probeMode" : "auto",
                  "type" : "dns-server",
                  "usePublicBgp" : true,
                  "enabled" : true,
                  "protocol" : "tcp",
                  "fixedPacketRate" : 50,
                  "pathTraceMode" : "classic",
                  "modifiedBy" : "user@user.com",
                  "dnsServers" : [ {
                    "serverName" : "dns-example.net",
                    "serverId" : "1447"
                  }, {
                    "serverName" : "dns-example.net",
                    "serverId" : "1447"
                  } ],
                  "alertsEnabled" : true,
                  "recursiveQueries" : true,
                  "testName" : "ThousandEyes Test",
                  "numPathTraces" : 3,
                  "bgpMeasurements" : true,
                  "dnsQueryClass" : "in",
                  "liveShare" : false,
                  "savedEvent" : true,
                  "networkMeasurements" : true,
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
                  "createdDate" : "2022-07-17T22:00:54Z",
                  "createdBy" : "user@user.com",
                  "domain" : "www.thousandeyes.com",
                  "modifiedDate" : "2022-07-17T22:00:54Z",
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
        DnsServerTest mappedResponse = 
                mapper.readValue(responseBodyJson, DnsServerTest.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Delete DNS Server test
     * <p>
     * Deletes the specified DNS Server test. This method requires Account Admin permissions. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Disabled
    @Test
    public void deleteDnsServerTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

    }
    
    /**
     * Get DNS Server test
     * <p>
     * Returns details for a DNS Server test, including name, intervals, targets, alert rules and agents.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getDnsServerTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "mtuMeasurements" : false,
                  "ipv6Policy" : "use-agent-policy",
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
                  "bandwidthMeasurements" : true,
                  "description" : "ThousandEyes Test",
                  "dnsTransportProtocol" : "udp",
                  "probeMode" : "auto",
                  "type" : "dns-server",
                  "usePublicBgp" : true,
                  "enabled" : true,
                  "protocol" : "tcp",
                  "fixedPacketRate" : 50,
                  "pathTraceMode" : "classic",
                  "modifiedBy" : "user@user.com",
                  "dnsServers" : [ {
                    "serverName" : "dns-example.net",
                    "serverId" : "1447"
                  }, {
                    "serverName" : "dns-example.net",
                    "serverId" : "1447"
                  } ],
                  "alertsEnabled" : true,
                  "recursiveQueries" : true,
                  "testName" : "ThousandEyes Test",
                  "numPathTraces" : 3,
                  "bgpMeasurements" : true,
                  "dnsQueryClass" : "in",
                  "liveShare" : false,
                  "savedEvent" : true,
                  "networkMeasurements" : true,
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
                  "createdDate" : "2022-07-17T22:00:54Z",
                  "createdBy" : "user@user.com",
                  "domain" : "www.thousandeyes.com",
                  "modifiedDate" : "2022-07-17T22:00:54Z",
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
        DnsServerTest mappedResponse = 
                mapper.readValue(responseBodyJson, DnsServerTest.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * List DNS Server tests
     * <p>
     * Returns a list of all DNS Server tests and saved events.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getDnsServerTestsRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "tests" : [ {
                    "mtuMeasurements" : false,
                    "ipv6Policy" : "use-agent-policy",
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
                    "bandwidthMeasurements" : true,
                    "description" : "ThousandEyes Test",
                    "dnsTransportProtocol" : "udp",
                    "probeMode" : "auto",
                    "type" : "dns-server",
                    "usePublicBgp" : true,
                    "enabled" : true,
                    "protocol" : "tcp",
                    "fixedPacketRate" : 50,
                    "pathTraceMode" : "classic",
                    "modifiedBy" : "user@user.com",
                    "dnsServers" : [ {
                      "serverName" : "dns-example.net",
                      "serverId" : "1447"
                    }, {
                      "serverName" : "dns-example.net",
                      "serverId" : "1447"
                    } ],
                    "alertsEnabled" : true,
                    "recursiveQueries" : true,
                    "testName" : "ThousandEyes Test",
                    "numPathTraces" : 3,
                    "bgpMeasurements" : true,
                    "dnsQueryClass" : "in",
                    "liveShare" : false,
                    "savedEvent" : true,
                    "networkMeasurements" : true,
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "createdBy" : "user@user.com",
                    "domain" : "www.thousandeyes.com",
                    "modifiedDate" : "2022-07-17T22:00:54Z",
                    "interval" : 120,
                    "testId" : "281474976710706"
                  }, {
                    "mtuMeasurements" : false,
                    "ipv6Policy" : "use-agent-policy",
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
                    "bandwidthMeasurements" : true,
                    "description" : "ThousandEyes Test",
                    "dnsTransportProtocol" : "udp",
                    "probeMode" : "auto",
                    "type" : "dns-server",
                    "usePublicBgp" : true,
                    "enabled" : true,
                    "protocol" : "tcp",
                    "fixedPacketRate" : 50,
                    "pathTraceMode" : "classic",
                    "modifiedBy" : "user@user.com",
                    "dnsServers" : [ {
                      "serverName" : "dns-example.net",
                      "serverId" : "1447"
                    }, {
                      "serverName" : "dns-example.net",
                      "serverId" : "1447"
                    } ],
                    "alertsEnabled" : true,
                    "recursiveQueries" : true,
                    "testName" : "ThousandEyes Test",
                    "numPathTraces" : 3,
                    "bgpMeasurements" : true,
                    "dnsQueryClass" : "in",
                    "liveShare" : false,
                    "savedEvent" : true,
                    "networkMeasurements" : true,
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "createdBy" : "user@user.com",
                    "domain" : "www.thousandeyes.com",
                    "modifiedDate" : "2022-07-17T22:00:54Z",
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
        DnsServerTests mappedResponse = 
                mapper.readValue(responseBodyJson, DnsServerTests.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Update DNS Server test
     * <p>
     * Updates a DNS Server test. The target test cannot be a live share or saved event. This method requires Account Admin permissions.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void updateDnsServerTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "mtuMeasurements" : false,
                  "ipv6Policy" : "use-agent-policy",
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
                  "bandwidthMeasurements" : true,
                  "description" : "ThousandEyes Test",
                  "dnsTransportProtocol" : "udp",
                  "probeMode" : "auto",
                  "type" : "dns-server",
                  "usePublicBgp" : true,
                  "enabled" : true,
                  "protocol" : "tcp",
                  "fixedPacketRate" : 50,
                  "pathTraceMode" : "classic",
                  "modifiedBy" : "user@user.com",
                  "dnsServers" : [ "dns-example.net", "8.8.8.8" ],
                  "alertsEnabled" : true,
                  "recursiveQueries" : true,
                  "testName" : "ThousandEyes Test",
                  "numPathTraces" : 3,
                  "bgpMeasurements" : true,
                  "dnsQueryClass" : "in",
                  "liveShare" : false,
                  "savedEvent" : true,
                  "networkMeasurements" : true,
                  "labels" : [ "9842", "1283" ],
                  "agents" : [ {
                    "agentId" : "125",
                    "sourceIpAddress" : "1.1.1.1"
                  }, {
                    "agentId" : "125",
                    "sourceIpAddress" : "1.1.1.1"
                  } ],
                  "createdDate" : "2022-07-17T22:00:54Z",
                  "createdBy" : "user@user.com",
                  "domain" : "www.thousandeyes.com",
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "interval" : 120,
                  "testId" : "281474976710706",
                  "sharedWithAccounts" : [ "1234", "12345" ],
                  "monitors" : [ "17410", "5" ]
                }
                                 """;
        UpdateDnsServerTest mappedRequest = 
                mapper.readValue(requestBodyJson, UpdateDnsServerTest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "mtuMeasurements" : false,
                  "ipv6Policy" : "use-agent-policy",
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
                  "bandwidthMeasurements" : true,
                  "description" : "ThousandEyes Test",
                  "dnsTransportProtocol" : "udp",
                  "probeMode" : "auto",
                  "type" : "dns-server",
                  "usePublicBgp" : true,
                  "enabled" : true,
                  "protocol" : "tcp",
                  "fixedPacketRate" : 50,
                  "pathTraceMode" : "classic",
                  "modifiedBy" : "user@user.com",
                  "dnsServers" : [ {
                    "serverName" : "dns-example.net",
                    "serverId" : "1447"
                  }, {
                    "serverName" : "dns-example.net",
                    "serverId" : "1447"
                  } ],
                  "alertsEnabled" : true,
                  "recursiveQueries" : true,
                  "testName" : "ThousandEyes Test",
                  "numPathTraces" : 3,
                  "bgpMeasurements" : true,
                  "dnsQueryClass" : "in",
                  "liveShare" : false,
                  "savedEvent" : true,
                  "networkMeasurements" : true,
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
                  "createdDate" : "2022-07-17T22:00:54Z",
                  "createdBy" : "user@user.com",
                  "domain" : "www.thousandeyes.com",
                  "modifiedDate" : "2022-07-17T22:00:54Z",
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
        DnsServerTest mappedResponse = 
                mapper.readValue(responseBodyJson, DnsServerTest.class);
        assertNotNull(mappedResponse);
    }
    
}
