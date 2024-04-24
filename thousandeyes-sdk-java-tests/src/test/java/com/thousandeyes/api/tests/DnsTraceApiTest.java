/*
 * Tests API
 * This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.tests;

import com.thousandeyes.api.tests.model.DnsTraceTest;
import com.thousandeyes.api.tests.model.Error;
import com.thousandeyes.api.tests.model.Expand;
import com.thousandeyes.api.tests.model.GetDnsTraceTests200Response;
import java.net.URI;
import com.thousandeyes.api.tests.model.UnauthorizedError;
import com.thousandeyes.api.tests.model.UpdateDnsTraceTest;
import com.thousandeyes.api.tests.model.ValidationError;
import static com.thousandeyes.api.serialization.JSON.getDefault;
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
 * Request and Response model deserialization tests for DnsTraceApi
 */
public class DnsTraceApiTest {
    // private final DnsTraceApi api = new DnsTraceApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Create DNS Trace test
     * <p>
     * Creates a new DNS Trace test. This method requires Account Admin permissions. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void createDnsTraceTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                { }
                                 """;
        UpdateDnsTraceTest mappedRequest = 
                mapper.readValue(requestBodyJson, UpdateDnsTraceTest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                { }
                                  """;
        DnsTraceTest mappedResponse = 
                mapper.readValue(responseBodyJson, DnsTraceTest.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Delete DNS Trace test
     * <p>
     * Deletes the specified DNS Trace test. This method requires Account Admin permissions. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Disabled
    @Test
    public void deleteDnsTraceTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

    }
    
    /**
     * Get DNS Trace test
     * <p>
     * Returns details for a DNS Trace test, including name, intervals, targets, alert rules and agents.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getDnsTraceTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                { }
                                  """;
        DnsTraceTest mappedResponse = 
                mapper.readValue(responseBodyJson, DnsTraceTest.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * List DNS Trace tests
     * <p>
     * Returns a list of all DNS Trace tests and saved events.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getDnsTraceTestsRequestAndResponseDeserializationTest()
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
                    "liveShare" : false,
                    "savedEvent" : true,
                    "description" : "ThousandEyes Test",
                    "type" : "dns-trace",
                    "enabled" : true,
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "createdBy" : "user@user.com",
                    "domain" : "www.thousandeyes.com",
                    "modifiedDate" : "2022-07-17T22:00:54Z",
                    "interval" : 120,
                    "modifiedBy" : "user@user.com",
                    "testId" : "281474976710706",
                    "alertsEnabled" : true,
                    "testName" : "ThousandEyes Test"
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
                    "liveShare" : false,
                    "savedEvent" : true,
                    "description" : "ThousandEyes Test",
                    "type" : "dns-trace",
                    "enabled" : true,
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "createdBy" : "user@user.com",
                    "domain" : "www.thousandeyes.com",
                    "modifiedDate" : "2022-07-17T22:00:54Z",
                    "interval" : 120,
                    "modifiedBy" : "user@user.com",
                    "testId" : "281474976710706",
                    "alertsEnabled" : true,
                    "testName" : "ThousandEyes Test"
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
        GetDnsTraceTests200Response mappedResponse = 
                mapper.readValue(responseBodyJson, GetDnsTraceTests200Response.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Update DNS Trace test
     * <p>
     * Updates a DNS Trace test. The target test cannot be a live share or saved event. This method requires Account Admin permissions. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void updateDnsTraceTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                { }
                                 """;
        UpdateDnsTraceTest mappedRequest = 
                mapper.readValue(requestBodyJson, UpdateDnsTraceTest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                { }
                                  """;
        DnsTraceTest mappedResponse = 
                mapper.readValue(responseBodyJson, DnsTraceTest.class);
        assertNotNull(mappedResponse);
    }
    
}