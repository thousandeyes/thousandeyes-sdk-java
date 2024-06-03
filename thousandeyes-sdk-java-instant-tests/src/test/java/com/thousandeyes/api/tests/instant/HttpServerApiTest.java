/*
 * Instant Tests API
 * The Instant Tests API endpoint lets you create and run new instant tests. You will need to be a regular user or have the following permissions:   * `API Access`   * `View tests`  The response does not include the immediate test results. Use the Test Results endpoints to get test results after creating and executing an instant test. You can find the URLs for these endpoints in the _links section of the test definition that is returned when you create the instant test. 
 *
 * The version of the OpenAPI document: 7.0.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.tests.instant;

import com.thousandeyes.api.tests.instant.model.Error;
import com.thousandeyes.api.tests.instant.model.Expand;
import com.thousandeyes.api.tests.instant.model.HttpServerInstantTest;
import com.thousandeyes.api.tests.instant.model.HttpServerInstantTestRequest;
import java.net.URI;
import com.thousandeyes.api.tests.instant.model.UnauthorizedError;
import com.thousandeyes.api.tests.instant.model.ValidationError;
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
 * Request and Response model deserialization tests for HttpServerApi
 */
public class HttpServerApiTest {
    // private final HttpServerApi api = new HttpServerApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Create HTTP server instant test
     * <p>
     * Creates and runs a new HTTP server instant test.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void createHttpServerInstantTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "clientCertificate" : "-----BEGIN PRIVATE KEY-----\\nMIICUTCCAfugAwIBAgIBADANBgkqhkiG9w0BAQQFADBXMQswCQYDVQQGEwJDTjEL\\n-----END PRIVATE KEY-----\\n-----BEGIN CERTIFICATE-----\\nMIICUTCCAfugAwIBAgIBADANBgkqhkiG9w0BAQQFADBXMQswCQYDVQQGEwJDTjEL\\n-----END CERTIFICATE-----\\n",
                  "mtuMeasurements" : false,
                  "sslVersion" : "Auto",
                  "useNtlm" : false,
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
                  "downloadLimit" : 2048,
                  "dnsOverride" : "8.8.8.8",
                  "bandwidthMeasurements" : true,
                  "description" : "ThousandEyes Test",
                  "httpTimeLimit" : 5,
                  "probeMode" : "auto",
                  "includeHeaders" : true,
                  "type" : "http-server",
                  "password" : "password",
                  "protocol" : "tcp",
                  "allowUnsafeLegacyRenegotiation" : true,
                  "fixedPacketRate" : 50,
                  "httpVersion" : 2,
                  "followRedirects" : true,
                  "pathTraceMode" : "classic",
                  "contentRegex" : "(regex)+",
                  "modifiedBy" : "user@user.com",
                  "authType" : "none",
                  "customHeaders" : {
                    "root" : {
                      "header1" : "value1"
                    },
                    "domains" : {
                      "domain1.com" : {
                        "header2" : "value2"
                      }
                    },
                    "all" : {
                      "header3" : "value3"
                    }
                  },
                  "testName" : "ThousandEyes Test",
                  "headers" : [ "header1: value1", "header2: value2" ],
                  "numPathTraces" : 3,
                  "verifyCertificate" : false,
                  "liveShare" : false,
                  "savedEvent" : true,
                  "userAgent" : "curl",
                  "networkMeasurements" : true,
                  "url" : "www.thousandeyes.com",
                  "labels" : [ "9842", "1283" ],
                  "agents" : [ {
                    "agentId" : "125",
                    "sourceIpAddress" : "1.1.1.1"
                  }, {
                    "agentId" : "125",
                    "sourceIpAddress" : "1.1.1.1"
                  } ],
                  "createdDate" : "2022-07-17T22:00:54Z",
                  "postBody" : "{ \\"example\\" : \\"value\\"}",
                  "createdBy" : "user@user.com",
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "testId" : "281474976710706",
                  "sharedWithAccounts" : [ "1234", "12345" ],
                  "desiredStatusCode" : "200",
                  "httpTargetTime" : 100,
                  "sslVersionId" : "0",
                  "username" : "username"
                }
                                 """;
        HttpServerInstantTestRequest mappedRequest = 
                mapper.readValue(requestBodyJson, HttpServerInstantTestRequest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "clientCertificate" : "-----BEGIN PRIVATE KEY-----\\nMIICUTCCAfugAwIBAgIBADANBgkqhkiG9w0BAQQFADBXMQswCQYDVQQGEwJDTjEL\\n-----END PRIVATE KEY-----\\n-----BEGIN CERTIFICATE-----\\nMIICUTCCAfugAwIBAgIBADANBgkqhkiG9w0BAQQFADBXMQswCQYDVQQGEwJDTjEL\\n-----END CERTIFICATE-----\\n",
                  "mtuMeasurements" : false,
                  "sslVersion" : "Auto",
                  "useNtlm" : false,
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
                  "downloadLimit" : 2048,
                  "dnsOverride" : "8.8.8.8",
                  "bandwidthMeasurements" : true,
                  "description" : "ThousandEyes Test",
                  "httpTimeLimit" : 5,
                  "probeMode" : "auto",
                  "includeHeaders" : true,
                  "type" : "http-server",
                  "password" : "password",
                  "protocol" : "tcp",
                  "allowUnsafeLegacyRenegotiation" : true,
                  "fixedPacketRate" : 50,
                  "httpVersion" : 2,
                  "followRedirects" : true,
                  "pathTraceMode" : "classic",
                  "contentRegex" : "(regex)+",
                  "modifiedBy" : "user@user.com",
                  "authType" : "none",
                  "customHeaders" : {
                    "root" : {
                      "header1" : "value1"
                    },
                    "domains" : {
                      "domain1.com" : {
                        "header2" : "value2"
                      }
                    },
                    "all" : {
                      "header3" : "value3"
                    }
                  },
                  "testName" : "ThousandEyes Test",
                  "headers" : [ "header1: value1", "header2: value2" ],
                  "numPathTraces" : 3,
                  "verifyCertificate" : false,
                  "liveShare" : false,
                  "savedEvent" : true,
                  "userAgent" : "curl",
                  "networkMeasurements" : true,
                  "url" : "www.thousandeyes.com",
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
                  "postBody" : "{ \\"example\\" : \\"value\\"}",
                  "createdBy" : "user@user.com",
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "testId" : "281474976710706",
                  "sharedWithAccounts" : [ {
                    "name" : "Account name",
                    "aid" : "1234"
                  }, {
                    "name" : "Account name",
                    "aid" : "1234"
                  } ],
                  "desiredStatusCode" : "200",
                  "httpTargetTime" : 100,
                  "sslVersionId" : "0",
                  "username" : "username"
                }
                                  """;
        HttpServerInstantTest mappedResponse = 
                mapper.readValue(responseBodyJson, HttpServerInstantTest.class);
        assertNotNull(mappedResponse);
    }
    
}
