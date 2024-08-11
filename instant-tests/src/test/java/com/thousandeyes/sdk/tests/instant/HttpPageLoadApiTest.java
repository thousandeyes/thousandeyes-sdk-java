/*
 * Instant Tests API
 * The Instant Tests API endpoint lets you create and run new instant tests. You will need to be a regular user or have the following permissions:   * `API Access`   * `View tests`  The response does not include the immediate test results. Use the Test Results endpoints to get test results after creating and executing an instant test. You can find the URLs for these endpoints in the _links section of the test definition that is returned when you create the instant test. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests.instant;

import com.thousandeyes.sdk.tests.instant.model.Error;
import com.thousandeyes.sdk.tests.instant.model.Expand;
import com.thousandeyes.sdk.tests.instant.model.PageLoadInstantTest;
import com.thousandeyes.sdk.tests.instant.model.PageLoadInstantTestRequest;
import java.net.URI;
import com.thousandeyes.sdk.tests.instant.model.UnauthorizedError;
import com.thousandeyes.sdk.tests.instant.model.ValidationError;
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
 * Request and Response model deserialization tests for HttpPageLoadApi
 */
public class HttpPageLoadApiTest {
    // private final HttpPageLoadApi api = new HttpPageLoadApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Create HTTP page load instant test
     * <p>
     * Creates and runs a new HTTP page load instant test.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void createPageLoadInstantTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "clientCertificate" : "-----BEGIN PRIVATE KEY-----\\nMIICUTCCAfugAwIBAgIBADANBgkqhkiG9w0BAQQFADBXMQswCQYDVQQGEwJDTjEL\\n-----END PRIVATE KEY-----\\n-----BEGIN CERTIFICATE-----\\nMIICUTCCAfugAwIBAgIBADANBgkqhkiG9w0BAQQFADBXMQswCQYDVQQGEwJDTjEL\\n-----END CERTIFICATE-----\\n",
                  "mtuMeasurements" : false,
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
                  "dnsOverride" : "8.8.8.8",
                  "bandwidthMeasurements" : true,
                  "probeMode" : "auto",
                  "includeHeaders" : true,
                  "type" : "page-load",
                  "oAuth" : {
                    "configId" : "123321123",
                    "testUrl" : "https://api.thousandeyes.com/v7/status",
                    "requestMethod" : "get",
                    "postBody" : "client_id: ************",
                    "headers" : "Authorization: Basic ************",
                    "authType" : "none",
                    "username" : "user123",
                    "password" : "*******"
                  },
                  "password" : "password",
                  "protocol" : "tcp",
                  "followRedirects" : true,
                  "contentRegex" : "(regex)+",
                  "pageLoadingStrategy" : "normal",
                  "testName" : "ThousandEyes Test",
                  "allowMicAndCamera" : false,
                  "browserLanguage" : "en-US",
                  "verifyCertificate" : false,
                  "overrideAgentProxy" : false,
                  "liveShare" : false,
                  "agentInterfaces" : {
                    "agentId" : "2954",
                    "ipAddress" : "192.1.1.0"
                  },
                  "labels" : [ "9842", "1283" ],
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "emulatedDeviceId" : "2",
                  "sharedWithAccounts" : [ "1234", "12345" ],
                  "overrideProxyId" : "281474976710706",
                  "sslVersion" : "Auto",
                  "useNtlm" : false,
                  "downloadLimit" : 2048,
                  "description" : "ThousandEyes Test",
                  "httpTimeLimit" : 5,
                  "blockDomains" : "domain.com/",
                  "allowGeolocation" : false,
                  "allowUnsafeLegacyRenegotiation" : true,
                  "fixedPacketRate" : 50,
                  "httpVersion" : 2,
                  "collectProxyNetworkData" : false,
                  "pathTraceMode" : "classic",
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
                  "pageLoadTargetTime" : 10,
                  "numPathTraces" : 3,
                  "savedEvent" : true,
                  "userAgent" : "curl",
                  "pageLoadTimeLimit" : 10,
                  "networkMeasurements" : true,
                  "url" : "www.thousandeyes.com",
                  "agents" : [ {
                    "agentId" : "125",
                    "sourceIpAddress" : "1.1.1.1"
                  }, {
                    "agentId" : "125",
                    "sourceIpAddress" : "1.1.1.1"
                  } ],
                  "createdDate" : "2022-07-17T22:00:54Z",
                  "disableScreenshot" : false,
                  "createdBy" : "user@user.com",
                  "testId" : "281474976710706",
                  "desiredStatusCode" : "200",
                  "httpTargetTime" : 100,
                  "sslVersionId" : "0",
                  "username" : "username"
                }
                                 """;
        PageLoadInstantTestRequest mappedRequest = 
                mapper.readValue(requestBodyJson, PageLoadInstantTestRequest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "clientCertificate" : "-----BEGIN PRIVATE KEY-----\\nMIICUTCCAfugAwIBAgIBADANBgkqhkiG9w0BAQQFADBXMQswCQYDVQQGEwJDTjEL\\n-----END PRIVATE KEY-----\\n-----BEGIN CERTIFICATE-----\\nMIICUTCCAfugAwIBAgIBADANBgkqhkiG9w0BAQQFADBXMQswCQYDVQQGEwJDTjEL\\n-----END CERTIFICATE-----\\n",
                  "mtuMeasurements" : false,
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
                  "dnsOverride" : "8.8.8.8",
                  "bandwidthMeasurements" : true,
                  "probeMode" : "auto",
                  "includeHeaders" : true,
                  "type" : "page-load",
                  "oAuth" : {
                    "configId" : "123321123",
                    "testUrl" : "https://api.thousandeyes.com/v7/status",
                    "requestMethod" : "get",
                    "postBody" : "client_id: ************",
                    "headers" : "Authorization: Basic ************",
                    "authType" : "none",
                    "username" : "user123",
                    "password" : "*******"
                  },
                  "password" : "password",
                  "protocol" : "tcp",
                  "followRedirects" : true,
                  "contentRegex" : "(regex)+",
                  "pageLoadingStrategy" : "normal",
                  "testName" : "ThousandEyes Test",
                  "allowMicAndCamera" : false,
                  "browserLanguage" : "en-US",
                  "verifyCertificate" : false,
                  "overrideAgentProxy" : false,
                  "liveShare" : false,
                  "agentInterfaces" : {
                    "agentId" : "2954",
                    "ipAddress" : "192.1.1.0"
                  },
                  "labels" : [ {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  }, {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  } ],
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "emulatedDeviceId" : "2",
                  "sharedWithAccounts" : [ {
                    "name" : "Account name",
                    "aid" : "1234"
                  }, {
                    "name" : "Account name",
                    "aid" : "1234"
                  } ],
                  "overrideProxyId" : "281474976710706",
                  "sslVersion" : "Auto",
                  "useNtlm" : false,
                  "downloadLimit" : 2048,
                  "description" : "ThousandEyes Test",
                  "httpTimeLimit" : 5,
                  "blockDomains" : "domain.com/",
                  "allowGeolocation" : false,
                  "allowUnsafeLegacyRenegotiation" : true,
                  "fixedPacketRate" : 50,
                  "httpVersion" : 2,
                  "collectProxyNetworkData" : false,
                  "pathTraceMode" : "classic",
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
                  "pageLoadTargetTime" : 10,
                  "numPathTraces" : 3,
                  "savedEvent" : true,
                  "userAgent" : "curl",
                  "pageLoadTimeLimit" : 10,
                  "networkMeasurements" : true,
                  "url" : "www.thousandeyes.com",
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
                  "disableScreenshot" : false,
                  "createdBy" : "user@user.com",
                  "testId" : "281474976710706",
                  "desiredStatusCode" : "200",
                  "httpTargetTime" : 100,
                  "sslVersionId" : "0",
                  "username" : "username"
                }
                                  """;
        PageLoadInstantTest mappedResponse = 
                mapper.readValue(responseBodyJson, PageLoadInstantTest.class);
        assertNotNull(mappedResponse);
    }
    
}
