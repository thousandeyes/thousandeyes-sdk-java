/*
 * ThousandEyes for OpenTelemetry API
 * ThousandEyes for OpenTelemetry provides machine-to-machine integration between ThousandEyes and its customers. It allows you to export ThousandEyes telemetry data in OTel format, which is widely used in the industry. With ThousandEyes for OTel, you can leverage frameworks widely used in the observability domain - such as Splunk, Grafana, and Honeycomb - to capture and analyze ThousandEyes data. Any client that supports OTel can use ThousandEyes for OpenTelemetry.  ThousandEyes for OTel is made up of the following components:  * Data streaming APIs that you can use to configure and enable your ThousandEyes tests with OTel-compatible streams, in particular to configure how ThousandEyes telemetry data is exported to client integrations. * A set of streaming pipelines called _collectors_ that actively fetch ThousandEyes network test data, enrich the data with some additional detail, filter, and push the data to the customer-configured endpoints, depending on what you configure via the public APIs. * Third-party OTel collectors that receive, transform, filter, and export different metrics to client applications such as AppD, or any other OTel-capable client configuration.  For more information about ThousandEyes for OpenTelemetry, see the [documentation](https://docs.thousandeyes.com/product-documentation/api/opentelemetry). 
 *
 * The version of the OpenAPI document: 7.0.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.streaming;

import com.thousandeyes.api.streaming.model.ApiError;
import com.thousandeyes.api.streaming.model.ApiErrorIntegrationLimits;
import com.thousandeyes.api.streaming.model.BadRequestError;
import com.thousandeyes.api.streaming.model.CreateStreamResponse;
import com.thousandeyes.api.streaming.model.GetStreamResponse;
import com.thousandeyes.api.streaming.model.PutStream;
import com.thousandeyes.api.streaming.model.Stream;
import com.thousandeyes.api.streaming.model.StreamType;
import com.thousandeyes.api.streaming.model.UnauthorizedError;
import static com.thousandeyes.api.serialization.JSON.getDefault;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * Request and Response model deserialization tests for StreamingApi
 */
public class StreamingApiTest {
    // private final StreamingApi api = new StreamingApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Create data stream
     * <p>
     * Creates a new data stream.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void createStreamRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "endpointType" : "grpc",
                  "streamEndpointUrl" : "https://api.thousandeyes.otel-collector",
                  "tagMatch" : [ {
                    "objectType" : "test",
                    "key" : "keyA",
                    "value" : "valueA"
                  }, {
                    "objectType" : "test",
                    "key" : "keyB",
                    "value" : "valueB"
                  } ],
                  "type" : "opentelemetry",
                  "customHeaders" : {
                    "Authorization" : "*****",
                    "Content-Type" : "*****"
                  },
                  "enabled" : true
                }
                                 """;
        Stream mappedRequest = 
                mapper.readValue(requestBodyJson, Stream.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "endpointType" : "grpc",
                  "_links" : {
                    "self" : {
                      "href" : "https://api.thousandeyes.com/v7/streams/575766da-9664-4e85-94fe-facbe1154799"
                    }
                  },
                  "streamEndpointUrl" : "https://api.thousandeyes.otel-collector",
                  "tagMatch" : [ {
                    "objectType" : "test",
                    "key" : "keyA",
                    "value" : "valueA"
                  }, {
                    "objectType" : "test",
                    "key" : "keyB",
                    "value" : "valueB"
                  } ],
                  "id" : "342ieu09",
                  "type" : "opentelemetry",
                  "auditOperation" : {
                    "createdDate" : 1679677853573,
                    "createdBy" : 3962
                  },
                  "enabled" : true,
                  "customHeaders" : {
                    "Authorization" : "*****",
                    "Content-Type" : "*****"
                  }
                }
                                  """;
        CreateStreamResponse mappedResponse = 
                mapper.readValue(responseBodyJson, CreateStreamResponse.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Delete a data stream
     * <p>
     * Deletes a configured data stream using its ID.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Disabled
    @Test
    public void deleteStreamRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

    }
    
    /**
     * Retrieve data stream
     * <p>
     * Retrieves a configured data stream using its ID.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getStreamRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "endpointType" : "grpc",
                  "_links" : {
                    "self" : {
                      "href" : "https://api.thousandeyes.com/v7/streams/575766da-9664-4e85-94fe-facbe1154799"
                    }
                  },
                  "streamEndpointUrl" : "https://api.thousandeyes.otel-collector",
                  "tagMatch" : [ {
                    "objectType" : "test",
                    "key" : "keyA",
                    "value" : "valueA"
                  }, {
                    "objectType" : "test",
                    "key" : "keyB",
                    "value" : "valueB"
                  } ],
                  "id" : "342ieu09",
                  "type" : "opentelemetry",
                  "auditOperation" : {
                    "createdDate" : 1679677853573,
                    "updatedBy" : 3962,
                    "createdBy" : 3962,
                    "updatedDate" : 1679677853573
                  },
                  "enabled" : true,
                  "customHeaders" : {
                    "Authorization" : "*****",
                    "Content-Type" : "*****"
                  }
                }
                                  """;
        GetStreamResponse mappedResponse = 
                mapper.readValue(responseBodyJson, GetStreamResponse.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * List data streams
     * <p>
     * Retrieves a list of configured data streams.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getStreamsRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                [ {
                  "endpointType" : "grpc",
                  "_links" : {
                    "self" : {
                      "href" : "https://api.thousandeyes.com/v7/streams/575766da-9664-4e85-94fe-facbe1154799"
                    }
                  },
                  "streamEndpointUrl" : "https://api.thousandeyes.otel-collector",
                  "tagMatch" : [ {
                    "objectType" : "test",
                    "key" : "keyA",
                    "value" : "valueA"
                  }, {
                    "objectType" : "test",
                    "key" : "keyB",
                    "value" : "valueB"
                  } ],
                  "id" : "342ieu09",
                  "type" : "opentelemetry",
                  "auditOperation" : {
                    "createdDate" : 1679677853573,
                    "updatedBy" : 3962,
                    "createdBy" : 3962,
                    "updatedDate" : 1679677853573
                  },
                  "enabled" : true,
                  "customHeaders" : {
                    "Authorization" : "*****",
                    "Content-Type" : "*****"
                  }
                }, {
                  "endpointType" : "grpc",
                  "_links" : {
                    "self" : {
                      "href" : "https://api.thousandeyes.com/v7/streams/575766da-9664-4e85-94fe-facbe1154799"
                    }
                  },
                  "streamEndpointUrl" : "https://api.thousandeyes.otel-collector",
                  "tagMatch" : [ {
                    "objectType" : "test",
                    "key" : "keyA",
                    "value" : "valueA"
                  }, {
                    "objectType" : "test",
                    "key" : "keyB",
                    "value" : "valueB"
                  } ],
                  "id" : "342ieu09",
                  "type" : "opentelemetry",
                  "auditOperation" : {
                    "createdDate" : 1679677853573,
                    "updatedBy" : 3962,
                    "createdBy" : 3962,
                    "updatedDate" : 1679677853573
                  },
                  "enabled" : true,
                  "customHeaders" : {
                    "Authorization" : "*****",
                    "Content-Type" : "*****"
                  }
                } ]
                                  """;
        List<GetStreamResponse> mappedResponse = 
                mapper.readValue(responseBodyJson, new TypeReference<List<GetStreamResponse>>(){});
        assertNotNull(mappedResponse);
    }
    
    /**
     * Update data stream
     * <p>
     * Updates a configured data stream using its ID. The fields are overwritten, not appended.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void putStreamRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "tagMatch" : [ {
                    "objectType" : "test",
                    "key" : "keyA",
                    "value" : "valueA"
                  }, {
                    "objectType" : "test",
                    "key" : "keyB",
                    "value" : "valueB"
                  } ],
                  "customHeaders" : {
                    "Authorization" : "*****",
                    "Content-Type" : "*****"
                  },
                  "enabled" : true
                }
                                 """;
        PutStream mappedRequest = 
                mapper.readValue(requestBodyJson, PutStream.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "endpointType" : "grpc",
                  "_links" : {
                    "self" : {
                      "href" : "https://api.thousandeyes.com/v7/streams/575766da-9664-4e85-94fe-facbe1154799"
                    }
                  },
                  "streamEndpointUrl" : "https://api.thousandeyes.otel-collector",
                  "tagMatch" : [ {
                    "objectType" : "test",
                    "key" : "keyA",
                    "value" : "valueA"
                  }, {
                    "objectType" : "test",
                    "key" : "keyB",
                    "value" : "valueB"
                  } ],
                  "id" : "342ieu09",
                  "type" : "opentelemetry",
                  "auditOperation" : {
                    "createdDate" : 1679677853573,
                    "updatedBy" : 3962,
                    "createdBy" : 3962,
                    "updatedDate" : 1679677853573
                  },
                  "enabled" : true,
                  "customHeaders" : {
                    "Authorization" : "*****",
                    "Content-Type" : "*****"
                  }
                }
                                  """;
        GetStreamResponse mappedResponse = 
                mapper.readValue(responseBodyJson, GetStreamResponse.class);
        assertNotNull(mappedResponse);
    }
    
}
