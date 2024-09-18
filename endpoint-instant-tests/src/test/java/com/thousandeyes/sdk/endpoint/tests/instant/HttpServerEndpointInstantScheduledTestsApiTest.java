/*
 * Endpoint Instant Scheduled Tests API
 *  You can create and execute a new endpoint instant scheduled test within ThousandEyes using this API. The test parameters are specified in the `POST` data.  The following applies to the Endpoint Instant Scheduled Tests API:  * To initiate the creation and execution of an instant scheduled test, the user must possess the `Edit endpoint tests` permission.  * Upon successful creation of an instant scheduled test, the API responds with an HTTP/201 CREATED status code and return the test definition. * It's important to note that the response does not include the results of the instant scheduled test. To retrieve test results, users can utilize the Endpoint Test Data endpoints. The URLs for these API test data endpoints are provided within the test definition output when an instant scheduled test is created. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.tests.instant;

import com.thousandeyes.sdk.endpoint.tests.instant.model.EndpointHttpServerInstantTest;
import com.thousandeyes.sdk.endpoint.tests.instant.model.EndpointHttpServerTest;
import com.thousandeyes.sdk.endpoint.tests.instant.model.Error;
import java.net.URI;
import com.thousandeyes.sdk.endpoint.tests.instant.model.UnauthorizedError;
import com.thousandeyes.sdk.endpoint.tests.instant.model.ValidationError;
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
 * Request and Response model deserialization tests for HttpServerEndpointInstantScheduledTestsApi
 */
public class HttpServerEndpointInstantScheduledTestsApiTest {
    // private final HttpServerEndpointInstantScheduledTestsApi api = new HttpServerEndpointInstantScheduledTestsApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Run http server instant scheduled test
     * <p>
     * Creates and runs a new endpoint http server instant scheduled test in ThousandEyes.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void createHttpServerScheduledInstantTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "verifyCertificate" : true,
                  "hasPing" : true,
                  "agentSelectorType" : "all-agents",
                  "maxMachines" : 25,
                  "httpTimeLimit" : 5000,
                  "networkMeasurements" : true,
                  "endpointAgentLabels" : [ "567", "214" ],
                  "tcpProbeMode" : "auto",
                  "url" : "url",
                  "agents" : [ "0a3b9998-dc3a-4ff2-b50d-ac4a7cd986e1", "66eec0f1-72b4-4755-aa83-3aed61d17f3c" ],
                  "protocol" : "icmp",
                  "password" : "password",
                  "port" : 443,
                  "hasTraceroute" : true,
                  "targetResponseTime" : 1000,
                  "authType" : "none",
                  "hasPathTraceInSession" : true,
                  "testName" : "Test name",
                  "username" : "username",
                  "sslVersionId" : "0"
                }
                                 """;
        EndpointHttpServerInstantTest mappedRequest = 
                mapper.readValue(requestBodyJson, EndpointHttpServerInstantTest.class);
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
                  "httpTimeLimit" : 5000,
                  "type" : "http-server",
                  "protocol" : "icmp",
                  "httpVersion" : 2,
                  "followRedirects" : true,
                  "authType" : "none",
                  "testName" : "Test name",
                  "verifyCertificate" : true,
                  "networkMeasurements" : true,
                  "tcpProbeMode" : "auto",
                  "url" : "https://example.com:443",
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
                  "port" : 443,
                  "isEnabled" : true,
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "interval" : 60,
                  "testId" : "281474976710706",
                  "aid" : "1234",
                  "agentSelectorConfig" : {
                    "agentSelectorType" : "all-agents",
                    "maxMachines" : 25
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
