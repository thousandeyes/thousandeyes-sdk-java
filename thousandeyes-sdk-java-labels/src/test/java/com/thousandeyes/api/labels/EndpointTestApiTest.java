/*
 * Labels API
 * ### Overview This is API for the Labels API (formerly called groups).
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.labels;

import com.thousandeyes.api.labels.model.CreateAgentLabel201Response;
import com.thousandeyes.api.labels.model.Error;
import com.thousandeyes.api.labels.model.GetLabels200Response;
import com.thousandeyes.api.labels.model.LabelRequest;
import java.net.URI;
import com.thousandeyes.api.labels.model.UnauthorizedError;
import com.thousandeyes.api.labels.model.ValidationError;
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
 * Request and Response model deserialization tests for EndpointTestApi
 */
public class EndpointTestApiTest {
    // private final EndpointTestApi api = new EndpointTestApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Create a Label of type &#x60;endpoint-test&#x60;
     * <p>
     * Creates a new label (formerly called group) in ThousandEyes, based on properties provided in the POST data.  In order to create a new label, the user attempting the creation must have sufficient privileges to create labels. Regular users are blocked from using any of the POST-based methods. Note: When creating or updating a label and assigning agents or tests, the user needs permission to modify the objects being added.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void createEndpointTestsLabelRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "name" : "My new label",
                  "ids" : [ "5048", "1234" ]
                }
                                 """;
        LabelRequest mappedRequest = 
                mapper.readValue(requestBodyJson, LabelRequest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "labelId" : "961123",
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
                  "name" : "Label XYZ",
                  "ids" : [ "231286", "6317a3ca0d2bfc6ab882d6ce", "6317a3ca0d2bfc6ab882d6ca" ],
                  "isBuiltIn" : true,
                  "type" : "endpoint-test"
                }
                                  """;
        CreateAgentLabel201Response mappedResponse = 
                mapper.readValue(responseBodyJson, CreateAgentLabel201Response.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Delete a Label object of type &#x60;endpoint-test&#x60;
     * <p>
     * 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Disabled
    @Test
    public void deleteEndpointTestLabelRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

    }
    
    /**
     * Get a Label object of type &#x60;endpoint-test&#x60;
     * <p>
     * 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getEndpointTestLabelRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "labelId" : "961123",
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
                  "name" : "Label XYZ",
                  "ids" : [ "231286", "6317a3ca0d2bfc6ab882d6ce", "6317a3ca0d2bfc6ab882d6ca" ],
                  "isBuiltIn" : true,
                  "type" : "endpoint-test"
                }
                                  """;
        CreateAgentLabel201Response mappedResponse = 
                mapper.readValue(responseBodyJson, CreateAgentLabel201Response.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Get list of Labels of type &#x60;endpoint-test&#x60;
     * <p>
     * Returns a list of all Endpoint Test labels (formerly called groups) configured in ThousandEyes.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getEndpointTestLabelsRequestAndResponseDeserializationTest()
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
                  "labels" : [ {
                    "labelId" : "961123",
                    "name" : "Label XYZ",
                    "isBuiltIn" : true,
                    "type" : "endpoint-test"
                  }, {
                    "labelId" : "961123",
                    "name" : "Label XYZ",
                    "isBuiltIn" : true,
                    "type" : "endpoint-test"
                  } ]
                }
                                  """;
        GetLabels200Response mappedResponse = 
                mapper.readValue(responseBodyJson, GetLabels200Response.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Update a Label object of type &#x60;endpoint-test&#x60;
     * <p>
     * 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void updateEndpointTestLabelRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "name" : "My new label",
                  "ids" : [ "5048", "1234" ]
                }
                                 """;
        LabelRequest mappedRequest = 
                mapper.readValue(requestBodyJson, LabelRequest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "labelId" : "961123",
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
                  "name" : "Label XYZ",
                  "ids" : [ "231286", "6317a3ca0d2bfc6ab882d6ce", "6317a3ca0d2bfc6ab882d6ca" ],
                  "isBuiltIn" : true,
                  "type" : "endpoint-test"
                }
                                  """;
        CreateAgentLabel201Response mappedResponse = 
                mapper.readValue(responseBodyJson, CreateAgentLabel201Response.class);
        assertNotNull(mappedResponse);
    }
    
}
