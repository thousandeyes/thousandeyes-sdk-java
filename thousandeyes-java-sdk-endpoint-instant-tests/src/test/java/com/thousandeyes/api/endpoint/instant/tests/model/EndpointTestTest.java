/*
 * Endpoint Instant Scheduled Tests API
 *  ### Overview  You can create and execute a new endpoint instant scheduled test within ThousandEyes using this API. The test parameters are specified in the `POST` data.  The following applies to the Endpoint Instant Scheduled Tests API:  * To initiate the creation and execution of an instant scheduled test, the user must possess the `Edit endpoint tests` permission.  * Upon successful creation of an instant scheduled test, the API responds with an HTTP/201 CREATED status code and return the test definition. * It's important to note that the response does not include the results of the instant scheduled test. To retrieve test results, users can utilize the Endpoint Test Data endpoints. The URLs for these API test data endpoints are provided within the test definition output when an instant scheduled test is created. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.instant.tests.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.endpoint.instant.tests.model.EndpointAgentSelectorConfig;
import com.thousandeyes.api.endpoint.instant.tests.model.EndpointScheduledTestType;
import com.thousandeyes.api.endpoint.instant.tests.model.EndpointTestAid;
import com.thousandeyes.api.endpoint.instant.tests.model.EndpointTestLinks;
import com.thousandeyes.api.endpoint.instant.tests.model.EndpointTestProtocol;
import com.thousandeyes.api.endpoint.instant.tests.model.TestInterval;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for EndpointTest
 */
public class EndpointTestTest {
    private final EndpointTest model = new EndpointTest();

    /**
     * Model tests for EndpointTest
     */
    @Test
    public void testEndpointTest() {
        // TODO: test EndpointTest
    }

    /**
     * Test the property 'links'
     */
    @Test
    public void linksTest() {
        // TODO: test links
    }

    /**
     * Test the property 'agentSelectorConfig'
     */
    @Test
    public void agentSelectorConfigTest() {
        // TODO: test agentSelectorConfig
    }

    /**
     * Test the property 'createdDate'
     */
    @Test
    public void createdDateTest() {
        // TODO: test createdDate
    }

    /**
     * Test the property 'interval'
     */
    @Test
    public void intervalTest() {
        // TODO: test interval
    }

    /**
     * Test the property 'isEnabled'
     */
    @Test
    public void isEnabledTest() {
        // TODO: test isEnabled
    }

    /**
     * Test the property 'isSavedEvent'
     */
    @Test
    public void isSavedEventTest() {
        // TODO: test isSavedEvent
    }

    /**
     * Test the property 'hasPathTraceInSession'
     */
    @Test
    public void hasPathTraceInSessionTest() {
        // TODO: test hasPathTraceInSession
    }

    /**
     * Test the property 'modifiedDate'
     */
    @Test
    public void modifiedDateTest() {
        // TODO: test modifiedDate
    }

    /**
     * Test the property 'networkMeasurements'
     */
    @Test
    public void networkMeasurementsTest() {
        // TODO: test networkMeasurements
    }

    /**
     * Test the property 'port'
     */
    @Test
    public void portTest() {
        // TODO: test port
    }

    /**
     * Test the property 'protocol'
     */
    @Test
    public void protocolTest() {
        // TODO: test protocol
    }

    /**
     * Test the property 'server'
     */
    @Test
    public void serverTest() {
        // TODO: test server
    }

    /**
     * Test the property 'testId'
     */
    @Test
    public void testIdTest() {
        // TODO: test testId
    }

    /**
     * Test the property 'aid'
     */
    @Test
    public void aidTest() {
        // TODO: test aid
    }

    /**
     * Test the property 'testName'
     */
    @Test
    public void testNameTest() {
        // TODO: test testName
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

}
