/*
 * Instant Tests API
 * The Instant Tests API operations lets you create and run new instant tests. You will need to be a regular user or have the following permissions:   * `API Access`   * `View tests`  The response does not include the immediate test results. Use the Test Results endpoints to get test results after creating and executing an instant test. You can find the URLs for these endpoints in the _links section of the test definition that is returned when you create the instant test. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests.instant;

import com.thousandeyes.sdk.tests.instant.model.ApiInstantTestRequest;
import com.thousandeyes.sdk.tests.instant.model.ApiInstantTestResponse;
import com.thousandeyes.sdk.tests.instant.model.Error;
import com.thousandeyes.sdk.tests.instant.model.ExpandInstantTestOptions;
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
 * Request and Response model deserialization tests for ApiInstantTestsApi
 */
public class ApiInstantTestsApiTest {
    // private final ApiInstantTestsApi api = new ApiInstantTestsApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Create API instant test
     * <p>
     * Creates and runs a new API instant test.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void createApiInstantTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
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
                  "credentials" : [ "3247", "1051" ],
                  "description" : "ThousandEyes Test",
                  "probeMode" : "auto",
                  "requests" : [ {
                    "headers" : [ {
                      "value" : "keep-alive",
                      "key" : "x-custom-header"
                    }, {
                      "value" : "keep-alive",
                      "key" : "x-custom-header"
                    } ],
                    "variables" : [ {
                      "name" : "myTestName",
                      "value" : "tests[0].name"
                    }, {
                      "name" : "myTestName",
                      "value" : "tests[0].name"
                    } ],
                    "method" : "get",
                    "body" : "body",
                    "url" : "https://api.thousandeyes.com/v7/status",
                    "password" : "basic_pw123",
                    "bearerToken" : "abcd-1234-...",
                    "name" : "Step 1",
                    "waitTimeMs" : 0,
                    "assertions" : [ {
                      "name" : "status-code",
                      "value" : "200",
                      "operator" : "is"
                    }, {
                      "name" : "status-code",
                      "value" : "200",
                      "operator" : "is"
                    } ],
                    "authType" : "none",
                    "collectApiResponse" : true,
                    "username" : "ThousandEyesUserName"
                  }, {
                    "headers" : [ {
                      "value" : "keep-alive",
                      "key" : "x-custom-header"
                    }, {
                      "value" : "keep-alive",
                      "key" : "x-custom-header"
                    } ],
                    "variables" : [ {
                      "name" : "myTestName",
                      "value" : "tests[0].name"
                    }, {
                      "name" : "myTestName",
                      "value" : "tests[0].name"
                    } ],
                    "method" : "get",
                    "body" : "body",
                    "url" : "https://api.thousandeyes.com/v7/status",
                    "password" : "basic_pw123",
                    "bearerToken" : "abcd-1234-...",
                    "name" : "Step 1",
                    "waitTimeMs" : 0,
                    "assertions" : [ {
                      "name" : "status-code",
                      "value" : "200",
                      "operator" : "is"
                    }, {
                      "name" : "status-code",
                      "value" : "200",
                      "operator" : "is"
                    } ],
                    "authType" : "none",
                    "collectApiResponse" : true,
                    "username" : "ThousandEyesUserName"
                  } ],
                  "type" : "api",
                  "protocol" : "tcp",
                  "collectProxyNetworkData" : false,
                  "followRedirects" : true,
                  "pathTraceMode" : "classic",
                  "modifiedBy" : "user@user.com",
                  "testName" : "ThousandEyes Test",
                  "numPathTraces" : 3,
                  "overrideAgentProxy" : false,
                  "predefinedVariables" : [ {
                    "name" : "myUsername",
                    "value" : "ThousandEyesAccountUserName"
                  }, {
                    "name" : "myUsername",
                    "value" : "ThousandEyesAccountUserName"
                  } ],
                  "liveShare" : false,
                  "savedEvent" : true,
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
                  "timeLimit" : 19,
                  "createdDate" : "2022-07-17T22:00:54Z",
                  "createdBy" : "user@user.com",
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "testId" : "281474976710706",
                  "sharedWithAccounts" : [ "1234", "12345" ],
                  "overrideProxyId" : "281474976710706",
                  "sslVersionId" : "0",
                  "targetTime" : 1
                }
                                 """;
        ApiInstantTestRequest mappedRequest = 
                mapper.readValue(requestBodyJson, ApiInstantTestRequest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
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
                  "credentials" : [ "3247", "1051" ],
                  "description" : "ThousandEyes Test",
                  "probeMode" : "auto",
                  "requests" : [ {
                    "headers" : [ {
                      "value" : "keep-alive",
                      "key" : "x-custom-header"
                    }, {
                      "value" : "keep-alive",
                      "key" : "x-custom-header"
                    } ],
                    "variables" : [ {
                      "name" : "myTestName",
                      "value" : "tests[0].name"
                    }, {
                      "name" : "myTestName",
                      "value" : "tests[0].name"
                    } ],
                    "method" : "get",
                    "body" : "body",
                    "url" : "https://api.thousandeyes.com/v7/status",
                    "password" : "basic_pw123",
                    "bearerToken" : "abcd-1234-...",
                    "name" : "Step 1",
                    "waitTimeMs" : 0,
                    "assertions" : [ {
                      "name" : "status-code",
                      "value" : "200",
                      "operator" : "is"
                    }, {
                      "name" : "status-code",
                      "value" : "200",
                      "operator" : "is"
                    } ],
                    "authType" : "none",
                    "collectApiResponse" : true,
                    "username" : "ThousandEyesUserName"
                  }, {
                    "headers" : [ {
                      "value" : "keep-alive",
                      "key" : "x-custom-header"
                    }, {
                      "value" : "keep-alive",
                      "key" : "x-custom-header"
                    } ],
                    "variables" : [ {
                      "name" : "myTestName",
                      "value" : "tests[0].name"
                    }, {
                      "name" : "myTestName",
                      "value" : "tests[0].name"
                    } ],
                    "method" : "get",
                    "body" : "body",
                    "url" : "https://api.thousandeyes.com/v7/status",
                    "password" : "basic_pw123",
                    "bearerToken" : "abcd-1234-...",
                    "name" : "Step 1",
                    "waitTimeMs" : 0,
                    "assertions" : [ {
                      "name" : "status-code",
                      "value" : "200",
                      "operator" : "is"
                    }, {
                      "name" : "status-code",
                      "value" : "200",
                      "operator" : "is"
                    } ],
                    "authType" : "none",
                    "collectApiResponse" : true,
                    "username" : "ThousandEyesUserName"
                  } ],
                  "type" : "api",
                  "protocol" : "tcp",
                  "collectProxyNetworkData" : false,
                  "followRedirects" : true,
                  "pathTraceMode" : "classic",
                  "modifiedBy" : "user@user.com",
                  "testName" : "ThousandEyes Test",
                  "numPathTraces" : 3,
                  "overrideAgentProxy" : false,
                  "predefinedVariables" : [ {
                    "name" : "myUsername",
                    "value" : "ThousandEyesAccountUserName"
                  }, {
                    "name" : "myUsername",
                    "value" : "ThousandEyesAccountUserName"
                  } ],
                  "liveShare" : false,
                  "savedEvent" : true,
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
                  "timeLimit" : 19,
                  "createdDate" : "2022-07-17T22:00:54Z",
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
                  "overrideProxyId" : "281474976710706",
                  "sslVersionId" : "0",
                  "targetTime" : 1
                }
                                  """;
        ApiInstantTestResponse mappedResponse = 
                mapper.readValue(responseBodyJson, ApiInstantTestResponse.class);
        assertNotNull(mappedResponse);
    }
    
}