/*
 * Tags API
 * The ThousandEyes Tags API provides a tagging system with key/value pairs. It allows you to tag assets within the ThousandEyes platform (such as agents, tests, or alert rules) with meaningful metadata. For example: `branch:sfo`, `branch:nyc`, and `team:netops`.  This feature provides:  * Support for automation. * Powerful and flexible reports/dashboards. * Support for third-party integrations.  Things to note with the ThousandEyes Tags API:  * Tags are backwards-compatible with existing labels. * Tags are separated by Tests (CEA), Agents (CEA), Endpoint Agents, Scheduled Endpoint Tests, and Reports. A single tag can only apply to one type of target object, so each tag must specify the target type of object via a `type` field. * Tags are defined in a single table so that they can be represented using a single model - `Tag`. 
 *
 * The version of the OpenAPI document: 7.0.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tags;

import com.thousandeyes.sdk.tags.model.ApiError;
import com.thousandeyes.sdk.tags.model.BulkTagAssignments;
import com.thousandeyes.sdk.tags.model.Error;
import com.thousandeyes.sdk.tags.model.TagAssignment;
import com.thousandeyes.sdk.tags.model.UnauthorizedError;
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
 * Request and Response model deserialization tests for TagAssignmentApi
 */
public class TagAssignmentApiTest {
    // private final TagAssignmentApi api = new TagAssignmentApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Assign tag to multiple objects
     * <p>
     * Assigns a tag to one or more objects. This endpoint has cumulative behavior: The tag is assigned to the specified objects, and the previous assignments persist. No unassignment takes place.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void assignTagRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "assignments" : [ {
                    "id" : "123",
                    "type" : "test"
                  }, {
                    "id" : "123",
                    "type" : "test"
                  } ]
                }
                                 """;
        TagAssignment mappedRequest = 
                mapper.readValue(requestBodyJson, TagAssignment.class);
        assertNotNull(mappedRequest);

    }
    
    /**
     * Assign multiple tags to multiple objects
     * <p>
     * Assigns the specified tags to the specified objects. This endpoint has cumulative behavior: The tags are assigned to the specified objects, and the previous assignments persist. No unassignment takes place.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void assignTagsRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "tags" : [ {
                    "assignments" : [ {
                      "id" : "123",
                      "type" : "test"
                    }, {
                      "id" : "123",
                      "type" : "test"
                    } ],
                    "tagId" : "c6b78e57-81a2-4c5f-a11a-d96c3c664d55"
                  }, {
                    "assignments" : [ {
                      "id" : "123",
                      "type" : "test"
                    }, {
                      "id" : "123",
                      "type" : "test"
                    } ],
                    "tagId" : "c6b78e57-81a2-4c5f-a11a-d96c3c664d55"
                  } ]
                }
                                 """;
        BulkTagAssignments mappedRequest = 
                mapper.readValue(requestBodyJson, BulkTagAssignments.class);
        assertNotNull(mappedRequest);

    }
    
    /**
     * Remove tag from multiple objects
     * <p>
     * Removes a tag from one or more objects.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void unassignTagRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "assignments" : [ {
                    "id" : "123",
                    "type" : "test"
                  }, {
                    "id" : "123",
                    "type" : "test"
                  } ]
                }
                                 """;
        TagAssignment mappedRequest = 
                mapper.readValue(requestBodyJson, TagAssignment.class);
        assertNotNull(mappedRequest);

    }
    
    /**
     * Remove multiple tags from multiple objects
     * <p>
     * Removes the specified tags from one or more objects.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void unassignTagsRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "tags" : [ {
                    "assignments" : [ {
                      "id" : "123",
                      "type" : "test"
                    }, {
                      "id" : "123",
                      "type" : "test"
                    } ],
                    "tagId" : "c6b78e57-81a2-4c5f-a11a-d96c3c664d55"
                  }, {
                    "assignments" : [ {
                      "id" : "123",
                      "type" : "test"
                    }, {
                      "id" : "123",
                      "type" : "test"
                    } ],
                    "tagId" : "c6b78e57-81a2-4c5f-a11a-d96c3c664d55"
                  } ]
                }
                                 """;
        BulkTagAssignments mappedRequest = 
                mapper.readValue(requestBodyJson, BulkTagAssignments.class);
        assertNotNull(mappedRequest);

    }
    
}
