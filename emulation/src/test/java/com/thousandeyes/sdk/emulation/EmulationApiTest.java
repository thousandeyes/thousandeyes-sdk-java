/*
 * Emulation API
 * The Emulation API facilitates the retrieval of user-agent strings for HTTP, pageload, and transaction tests. It also enables the retrieval and addition of emulated devices for pageload and transaction tests.  To access Emulation API endpoints, the following permissions are required:  * `Settings Tests Read` for read operations. * `Settings Tests Update` for write operations. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.emulation;

import com.thousandeyes.sdk.emulation.model.EmulatedDevice;
import com.thousandeyes.sdk.emulation.model.EmulatedDeviceResponse;
import com.thousandeyes.sdk.emulation.model.EmulatedDeviceResponses;
import com.thousandeyes.sdk.emulation.model.Error;
import com.thousandeyes.sdk.emulation.model.ExpandEmulatedDeviceOptions;
import com.thousandeyes.sdk.emulation.model.UnauthorizedError;
import com.thousandeyes.sdk.emulation.model.UserAgents;
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
 * Request and Response model deserialization tests for EmulationApi
 */
public class EmulationApiTest {
    // private final EmulationApi api = new EmulationApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Create emulated device
     * <p>
     * Creates a new device for emulation.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void createEmulatedDeviceRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "width" : 1024,
                  "category" : "desktop",
                  "height" : 768
                }
                                 """;
        EmulatedDevice mappedRequest = 
                mapper.readValue(requestBodyJson, EmulatedDevice.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "availableUserAgents" : [ "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/118.0.5993.70 Mobile Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/118.0.5993.70 Safari/537.36" ],
                  "width" : 1024,
                  "name" : "iPad Pro 12.9-in",
                  "codeName" : "IPAD_PRO_12_9",
                  "id" : "11",
                  "category" : "desktop",
                  "defaultUserAgentTemplate" : "Mozilla/5.0 (Android 4.4; Tablet; rv:70.0) Gecko/70.0 Firefox/70.0",
                  "height" : 768
                }
                                  """;
        EmulatedDeviceResponse mappedResponse = 
                mapper.readValue(responseBodyJson, EmulatedDeviceResponse.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * List emulated devices
     * <p>
     * Retrieves a list of emulated devices available for browser tests.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getEmulatedDevicesRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "emulatedDevices" : [ {
                    "availableUserAgents" : [ "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/118.0.5993.70 Mobile Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/118.0.5993.70 Safari/537.36" ],
                    "width" : 1024,
                    "name" : "iPad Pro 12.9-in",
                    "codeName" : "IPAD_PRO_12_9",
                    "id" : "11",
                    "category" : "desktop",
                    "defaultUserAgentTemplate" : "Mozilla/5.0 (Android 4.4; Tablet; rv:70.0) Gecko/70.0 Firefox/70.0",
                    "height" : 768
                  }, {
                    "availableUserAgents" : [ "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/118.0.5993.70 Mobile Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/118.0.5993.70 Safari/537.36" ],
                    "width" : 1024,
                    "name" : "iPad Pro 12.9-in",
                    "codeName" : "IPAD_PRO_12_9",
                    "id" : "11",
                    "category" : "desktop",
                    "defaultUserAgentTemplate" : "Mozilla/5.0 (Android 4.4; Tablet; rv:70.0) Gecko/70.0 Firefox/70.0",
                    "height" : 768
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
        EmulatedDeviceResponses mappedResponse = 
                mapper.readValue(responseBodyJson, EmulatedDeviceResponses.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * List user-agents
     * <p>
     * Retrieves a list of user-agent strings.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getUserAgentsRequestAndResponseDeserializationTest()
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
                  "userAgents" : [ {
                    "os" : "Windows",
                    "browser" : "Firefox",
                    "value" : "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/118.0.5993.70 Mobile Safari/537.36"
                  }, {
                    "os" : "Windows",
                    "browser" : "Firefox",
                    "value" : "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/118.0.5993.70 Mobile Safari/537.36"
                  } ]
                }
                                  """;
        UserAgents mappedResponse = 
                mapper.readValue(responseBodyJson, UserAgents.class);
        assertNotNull(mappedResponse);
    }
    
}
