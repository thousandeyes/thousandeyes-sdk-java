/*
 * Instant Tests API
 * The Instant Tests API operations lets you create and run new instant tests. You will need to be an Account Admin.  The response does not include the immediate test results. Use the Test Results endpoints to get test results after creating and executing an instant test. You can find the URLs for these endpoints in the _links section of the test definition that is returned when you create the instant test. 
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
import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.common.ContentTypes.AUTHORIZATION;
import static com.github.tomakehurst.wiremock.common.ContentTypes.CONTENT_TYPE;
import static com.thousandeyes.sdk.serialization.JSON.getDefault;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo;
import com.github.tomakehurst.wiremock.junit5.WireMockTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.NativeApiClient;


/**
 * Request and Response model deserialization tests for ApiInstantTestsApi
 */
@WireMockTest
public class ApiInstantTestsApiTest {
    private static final String TOKEN = "valid-token";
    private static final String BEARER_TOKEN = "Bearer %s".formatted(TOKEN);
    private static ApiInstantTestsApi api;
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);

    @BeforeAll
    public static void setup(WireMockRuntimeInfo wireMockRuntimeInfo) {
        ApiClient client = NativeApiClient.builder()
                                .baseUri(wireMockRuntimeInfo.getHttpBaseUrl())
                                .bearerToken(TOKEN)
                                .build();
        api = new ApiInstantTestsApi(client);
    }
    
    /**
     * Create API instant test
     * <p>
     * Creates and runs a new API instant test.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Test
    public void createApiInstantTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException, ApiException
    {

        var requestBodyJson = """
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
                    "clientId" : "client-id",
                    "tokenUrl" : "https://id.cisco.com/oauth2/default/v1/token",
                    "method" : "get",
                    "verifyCertificate" : false,
                    "body" : "body",
                    "url" : "https://api.thousandeyes.com/v7/status",
                    "password" : "basic_pw123",
                    "bearerToken" : "abcd-1234-...",
                    "scope" : "read, write, deploy",
                    "name" : "Step 1",
                    "waitTimeMs" : 0,
                    "clientAuthentication" : "basic-auth-header",
                    "clientSecret" : "client-secret",
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
                    "clientId" : "client-id",
                    "tokenUrl" : "https://id.cisco.com/oauth2/default/v1/token",
                    "method" : "get",
                    "verifyCertificate" : false,
                    "body" : "body",
                    "url" : "https://api.thousandeyes.com/v7/status",
                    "password" : "basic_pw123",
                    "bearerToken" : "abcd-1234-...",
                    "scope" : "read, write, deploy",
                    "name" : "Step 1",
                    "waitTimeMs" : 0,
                    "clientAuthentication" : "basic-auth-header",
                    "clientSecret" : "client-secret",
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
                  "clientCertDomainsAllowList" : "www.thousandeyes.com",
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
                  "distributedTracing" : false,
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
                  "randomizedStartTime" : false,
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "testId" : "281474976710706",
                  "sharedWithAccounts" : [ "1234", "12345" ],
                  "overrideProxyId" : "281474976710706",
                  "sslVersionId" : "0",
                  "targetTime" : 1
                }
                                 """;
        var requestBodyContentType = "application/json";
        ApiInstantTestRequest mappedRequest = 
                mapper.readValue(requestBodyJson, ApiInstantTestRequest.class);
        assertNotNull(mappedRequest);

        var responseBodyJson = """
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
                    "clientId" : "client-id",
                    "tokenUrl" : "https://id.cisco.com/oauth2/default/v1/token",
                    "method" : "get",
                    "verifyCertificate" : false,
                    "body" : "body",
                    "url" : "https://api.thousandeyes.com/v7/status",
                    "password" : "basic_pw123",
                    "bearerToken" : "abcd-1234-...",
                    "scope" : "read, write, deploy",
                    "name" : "Step 1",
                    "waitTimeMs" : 0,
                    "clientAuthentication" : "basic-auth-header",
                    "clientSecret" : "client-secret",
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
                    "clientId" : "client-id",
                    "tokenUrl" : "https://id.cisco.com/oauth2/default/v1/token",
                    "method" : "get",
                    "verifyCertificate" : false,
                    "body" : "body",
                    "url" : "https://api.thousandeyes.com/v7/status",
                    "password" : "basic_pw123",
                    "bearerToken" : "abcd-1234-...",
                    "scope" : "read, write, deploy",
                    "name" : "Step 1",
                    "waitTimeMs" : 0,
                    "clientAuthentication" : "basic-auth-header",
                    "clientSecret" : "client-secret",
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
                  "clientCertDomainsAllowList" : "www.thousandeyes.com",
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
                  "distributedTracing" : false,
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
                  "randomizedStartTime" : false,
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
        var statusCode = 201;
        var responseContentType = "application/json";
        ApiInstantTestResponse mappedResponse = 
                mapper.readValue(responseBodyJson, ApiInstantTestResponse.class);
        assertNotNull(mappedResponse);

        var path = "/tests/api/instant";
        stubFor(post(urlPathTemplate(path))
                        .withHeader(AUTHORIZATION, equalTo(BEARER_TOKEN))
                        .withHeader(CONTENT_TYPE, equalTo(requestBodyContentType))
                        .withRequestBody(equalToJson(requestBodyJson))
                        .willReturn(aResponse()
                                            .withHeader(CONTENT_TYPE, responseContentType)
                                            .withBody(responseBodyJson)
                                            .withStatus(statusCode)));

        var apiResponse = api.createApiInstantTest(mappedRequest, null, null);
        assertEquals(mappedResponse, apiResponse);
    }
    
}
