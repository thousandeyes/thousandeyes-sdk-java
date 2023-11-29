/*
 * Endpoint Tests API
 *  ## Overview Manage endpoint agent dynamic and scheduled tests using the Endpoint Tests API.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api;

import com.thousandeyes.ApiException;
import com.thousandeyes.api.model.EndpointAgentToServerTestRequest;
import com.thousandeyes.api.model.Error;
import com.thousandeyes.api.model.GetEndpointAgentToserverTestsList200Response;
import com.thousandeyes.api.model.PostEndpointAgentToServerTest201Response;
import java.net.URI;
import com.thousandeyes.api.model.UnauthorizedError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScheduledTestsAgentToServerApi
 */
@Disabled
public class ScheduledTestsAgentToServerApiTest {

    private final ScheduledTestsAgentToServerApi api = new ScheduledTestsAgentToServerApi();

    /**
     * Retrieve agent to server endpoint scheduled test
     *
     * Retrieves details of an agent to server endpoint scheduled test.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEndpointAgentToServerDetailTest() throws ApiException {
        String testId = null;
        String aid = null;
        PostEndpointAgentToServerTest201Response response = api.getEndpointAgentToServerDetail(testId, aid);
        // TODO: test validations
    }

    /**
     * List agent to server endpoint scheduled tests
     *
     * Returns a list of all agent to server endpoint scheduled tests configured in ThousandEyes. This list does not contain saved events. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEndpointAgentToserverTestsListTest() throws ApiException {
        String aid = null;
        GetEndpointAgentToserverTestsList200Response response = api.getEndpointAgentToserverTestsList(aid);
        // TODO: test validations
    }

    /**
     * Creates agent to server endpoint scheduled test
     *
     * Creates a new endpoint test in ThousandEyes using properties specified in the POST data. Please note that only Account Admins have the authorization to create new tests; regular users are restricted from using POST-based methods. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postEndpointAgentToServerTestTest() throws ApiException {
        EndpointAgentToServerTestRequest endpointAgentToServerTestRequest = null;
        String aid = null;
        PostEndpointAgentToServerTest201Response response = api.postEndpointAgentToServerTest(endpointAgentToServerTestRequest, aid);
        // TODO: test validations
    }

}
