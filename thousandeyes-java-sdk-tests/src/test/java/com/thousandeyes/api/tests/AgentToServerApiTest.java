/*
 * Tests API
 *  ### Overview This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.tests;

import com.thousandeyes.api.ApiException;
import com.thousandeyes.api.tests.model.AgentToServerTest;
import com.thousandeyes.api.tests.model.Error;
import com.thousandeyes.api.tests.model.Expand;
import com.thousandeyes.api.tests.model.GetAgentToServerTest200Response;
import com.thousandeyes.api.tests.model.GetAgentToServerTests200Response;
import java.net.URI;
import com.thousandeyes.api.tests.model.UnauthorizedError;
import com.thousandeyes.api.tests.model.UpdateAgentToServerTest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AgentToServerApi
 */
@Disabled
public class AgentToServerApiTest {

    private final AgentToServerApi api = new AgentToServerApi();

    /**
     * Create Agent to Server test
     *
     * Creates a new Agent to Server test. This method requires Account Admin permissions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAgentToServerTestTest() throws ApiException {
        UpdateAgentToServerTest updateAgentToServerTest = null;
        String aid = null;
        List<Expand> expand = null;
        AgentToServerTest response = api.createAgentToServerTest(updateAgentToServerTest, aid, expand);
        // TODO: test validations
    }

    /**
     * Delete Agent to Server test
     *
     * Deletes an Agent to Server test. This method requires Account Admin permissions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAgentToServerTestTest() throws ApiException {
        String testId = null;
        String aid = null;
        api.deleteAgentToServerTest(testId, aid);
        // TODO: test validations
    }

    /**
     * Get Agent to Server test
     *
     * Returns details for a Agent to Server test, including name, intervals, targets, alert rules and agents.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAgentToServerTestTest() throws ApiException {
        String testId = null;
        String aid = null;
        List<Expand> expand = null;
        GetAgentToServerTest200Response response = api.getAgentToServerTest(testId, aid, expand);
        // TODO: test validations
    }

    /**
     * List Agent to Server tests
     *
     * Returns a list of Agent to Server tests and saved events.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAgentToServerTestsTest() throws ApiException {
        String aid = null;
        GetAgentToServerTests200Response response = api.getAgentToServerTests(aid);
        // TODO: test validations
    }

    /**
     * Update Agent to Server test
     *
     * Updates an Agent to Server test. This method requires Account Admin permissions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAgentToServerTestTest() throws ApiException {
        String testId = null;
        UpdateAgentToServerTest updateAgentToServerTest = null;
        String aid = null;
        List<Expand> expand = null;
        GetAgentToServerTest200Response response = api.updateAgentToServerTest(testId, updateAgentToServerTest, aid, expand);
        // TODO: test validations
    }

}
