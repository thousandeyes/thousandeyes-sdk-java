/*
 * Agents API
 *  ## Overview Manage all agents available to your account in ThousandEyes, including both Cloud and Enterprise Agents.
 *
 * The version of the OpenAPI document: 7.0.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.agents;

import com.thousandeyes.sdk.agents.model.AgentProxies;
import com.thousandeyes.sdk.agents.model.Error;
import com.thousandeyes.sdk.agents.model.UnauthorizedError;
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
 * Request and Response model deserialization tests for ProxiesApi
 */
public class ProxiesApiTest {
    // private final ProxiesApi api = new ProxiesApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * List agent proxies
     * <p>
     * List all agent proxies available under the account group. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getAgentsProxiesRequestAndResponseDeserializationTest()
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
                  "agentProxies" : [ {
                    "password" : "**********",
                    "isLocalConfigured" : true,
                    "name" : "Test Proxy - Auth Type - BASIC",
                    "location" : "proxy.thousandeyes.com:3128",
                    "lastModified" : "2022-07-17T22:00:54Z",
                    "authType" : "basic",
                    "type" : "static",
                    "aid" : "1234",
                    "bypassList" : [ "10.0.0.0/16", "*.thousandeyes.com" ],
                    "user" : "user1",
                    "proxyId" : "281474976710706"
                  }, {
                    "password" : "**********",
                    "isLocalConfigured" : true,
                    "name" : "Test Proxy - Auth Type - BASIC",
                    "location" : "proxy.thousandeyes.com:3128",
                    "lastModified" : "2022-07-17T22:00:54Z",
                    "authType" : "basic",
                    "type" : "static",
                    "aid" : "1234",
                    "bypassList" : [ "10.0.0.0/16", "*.thousandeyes.com" ],
                    "user" : "user1",
                    "proxyId" : "281474976710706"
                  } ]
                }
                                  """;
        AgentProxies mappedResponse = 
                mapper.readValue(responseBodyJson, AgentProxies.class);
        assertNotNull(mappedResponse);
    }
    
}
