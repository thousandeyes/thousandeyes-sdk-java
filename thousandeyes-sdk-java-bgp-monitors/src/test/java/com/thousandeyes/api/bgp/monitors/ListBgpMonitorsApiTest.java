/*
 * BGP Monitors API
 *  Retrieve information about BGP monitors available to your ThousandEyes account. ThousandEyes ingests BGP routing data from dozens of global BGP collectors and automatically integrates that visibility as a configurable layer under service, network, and path visualization layers.  When you specify a service URL in a test, layered BGP tests automatically track reachability and path changes for any relevant prefix. When you use an IP address as the target for a test, the ThousandEyes platform monitors the relevant internet-routed prefix. You can also create specific BGP monitoring for a prefix, and can alert on hijacks and leaks.  For more information about monitors, see [Inside-Out BGP Visibility](https://docs.thousandeyes.com/product-documentation/internet-and-wan-monitoring/tests/bgp-tests/inside-out-bgp-visibility). 
 *
 * The version of the OpenAPI document: 7.0.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.bgp.monitors;

import com.thousandeyes.api.bgp.monitors.model.Error;
import com.thousandeyes.api.bgp.monitors.model.Monitors;
import com.thousandeyes.api.bgp.monitors.model.UnauthorizedError;
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
 * Request and Response model deserialization tests for ListBgpMonitorsApi
 */
public class ListBgpMonitorsApiTest {
    // private final ListBgpMonitorsApi api = new ListBgpMonitorsApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * List BGP monitors
     * <p>
     * Retrieves a list of BGP monitors available to your account in ThousandEyes, including public and private feeds.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getBGPMonitorsRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
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
                  },
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
        Monitors mappedResponse = 
                mapper.readValue(responseBodyJson, Monitors.class);
        assertNotNull(mappedResponse);
    }
    
}
