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
import com.thousandeyes.api.tests.instant.model.FtpServerInstantTest;
import com.thousandeyes.api.tests.instant.model.ServerInstantTestRequest;
import java.net.URI;
import com.thousandeyes.api.tests.instant.model.UnauthorizedError;
import com.thousandeyes.api.tests.instant.model.ValidationError;
import static org.junit.jupiter.api.Assertions.assertNotNull;


import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * Request and Response model deserialization tests for FtpServerApi
 */
public class FtpServerApiTest {
    // private final FtpServerApi api = new FtpServerApi();
    private final ObjectMapper mapper = com.thousandeyes.api.serialization.JSON.getDefault()
                                                                               .getMapper();
    
    /**
     * Create FTP server instant test
     * <p>
     * Creates and runs a new FTP server instant test.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void postInstantFtpServerRequestAndResponseDeserializationTest()
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
        ServerInstantTestRequest mappedRequest = 
                mapper.readValue(requestBodyJson, ServerInstantTestRequest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "numPathTraces" : 2,
                  "mtuMeasurements" : false,
                  "downloadLimit" : 1048576,
                  "bandwidthMeasurements" : true,
                  "useExplicitFtps" : false,
                  "networkMeasurements" : true,
                  "type" : "ftp-server",
                  "url" : "www.thousandeyes.com",
                  "password" : "password",
                  "fixedPacketRate" : 50,
                  "ftpTargetTime" : 1400,
                  "ftpTimeLimit" : 40,
                  "useActiveFtp" : false,
                  "username" : "username"
                }
                                  """;
        FtpServerInstantTest mappedResponse = 
                mapper.readValue(responseBodyJson, FtpServerInstantTest.class);
        assertNotNull(mappedResponse);
    }
    
}
