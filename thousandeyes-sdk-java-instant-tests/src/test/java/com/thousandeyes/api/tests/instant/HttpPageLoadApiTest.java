/*
 * Instant Tests API
 * The Instant Tests API endpoint lets you create and run new instant tests. You will need to be a regular user or have the following permissions:   * `API Access`   * `View tests`  The response does not include the immediate test results. Use the Test Results endpoints to get test results after creating and executing an instant test. You can find the URLs for these endpoints in the _links section of the test definition that is returned when you create the instant test. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.tests.instant;

import com.thousandeyes.api.tests.instant.model.Error;
import com.thousandeyes.api.tests.instant.model.Expand;
import com.thousandeyes.api.tests.instant.model.PageLoadInstantTest;
import com.thousandeyes.api.tests.instant.model.PageLoadInstantTestRequest;
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
    public void postInstantHTTPPageLoadRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "sharedWithAccounts" : [ "1234", "12345" ],
                  "labels" : [ "9842", "1283" ],
                  "agents" : [ {
                    "agentId" : "125",
                    "sourceIpAddress" : "1.1.1.1"
                  }, {
                    "agentId" : "125",
                    "sourceIpAddress" : "1.1.1.1"
                  } ]
                }
                                 """;
        PageLoadInstantTestRequest mappedRequest = 
                mapper.readValue(requestBodyJson, PageLoadInstantTestRequest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "clientCertificate" : "-----BEGIN PRIVATE KEY-----\\nMIICUTCCAfugAwIBAgIBADANBgkqhkiG9w0BAQQFADBXMQswCQYDVQQGEwJDTjEL\\n-----END PRIVATE KEY-----\\n-----BEGIN CERTIFICATE-----\\nMIICUTCCAfugAwIBAgIBADANBgkqhkiG9w0BAQQFADBXMQswCQYDVQQGEwJDTjEL\\n-----END CERTIFICATE-----\\n",
                  "mtuMeasurements" : false,
                  "sslVersion" : "Auto",
                  "useNtlm" : false,
                  "bandwidthMeasurements" : true,
                  "httpTimeLimit" : 9,
                  "blockDomains" : "domain.com/",
                  "includeHeaders" : true,
                  "type" : "page-load",
                  "allowGeolocation" : false,
                  "password" : "password",
                  "allowUnsafeLegacyRenegotiation" : true,
                  "fixedPacketRate" : 50,
                  "httpVersion" : 1,
                  "followRedirects" : true,
                  "contentRegex" : "(regex)+",
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
                  "allowMicAndCamera" : false,
                  "browserLanguage" : "en-US",
                  "numPathTraces" : 2,
                  "verifyCertificate" : false,
                  "pageLoadTimeLimit" : 37,
                  "userAgent" : "curl",
                  "networkMeasurements" : true,
                  "url" : "www.thousandeyes.com",
                  "disableScreenshot" : false,
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