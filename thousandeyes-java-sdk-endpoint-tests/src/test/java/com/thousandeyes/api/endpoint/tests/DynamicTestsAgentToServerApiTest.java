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


package com.thousandeyes.api.endpoint.tests;

import com.thousandeyes.api.endpoint.ApiException;
import com.thousandeyes.api.endpoint.tests.model.DynamicTest;
import com.thousandeyes.api.endpoint.tests.model.DynamicTestRequest;
import com.thousandeyes.api.endpoint.tests.model.EndpointDynamicTestUpdate;
import com.thousandeyes.api.endpoint.tests.model.Error;
import com.thousandeyes.api.endpoint.tests.model.GetDynamicTestDetail200Response;
import com.thousandeyes.api.endpoint.tests.model.GetDynamicTestsList200Response;
import java.net.URI;
import com.thousandeyes.api.endpoint.tests.model.UnauthorizedError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DynamicTestsAgentToServerApi
 */
@Disabled
public class DynamicTestsAgentToServerApiTest {

    private final DynamicTestsAgentToServerApi api = new DynamicTestsAgentToServerApi();

    /**
     * Delete agent to server dynamic test
     *
     * Deletes an agent to server endpoint dynamic test.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteEndpointDynamicTestTest() throws ApiException {
        String testId = null;
        String aid = null;
        api.deleteEndpointDynamicTest(testId, aid);
        // TODO: test validations
    }

    /**
     * Retrieve endpoint dynamic test
     *
     * Returns details of an endpoint dynamic test, including test type, name, intervals, targets.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDynamicTestDetailTest() throws ApiException {
        String testId = null;
        String aid = null;
        GetDynamicTestDetail200Response response = api.getDynamicTestDetail(testId, aid);
        // TODO: test validations
    }

    /**
     * List endpoint dynamic tests
     *
     * Returns a list of all endpoint dynamic tests configured in ThousandEyes. This list does not contain saved events.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDynamicTestsListTest() throws ApiException {
        String aid = null;
        GetDynamicTestsList200Response response = api.getDynamicTestsList(aid);
        // TODO: test validations
    }

    /**
     * Create endpoint dynamic test
     *
     * Create a new endpoint dynamic test in ThousandEyes using properties specified in the POST data. Please note that only Account Admins have the authorization to create new tests; regular users are restricted from using POST-based methods. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postDynamicTestTest() throws ApiException {
        DynamicTestRequest dynamicTestRequest = null;
        String aid = null;
        DynamicTest response = api.postDynamicTest(dynamicTestRequest, aid);
        // TODO: test validations
    }

    /**
     * Update agent to server dynamic test
     *
     * Updates an agent to server endpoint dynamic test. Includes support for  enabling and disabling the test.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateEndpointDynamicTestDetailTest() throws ApiException {
        String testId = null;
        EndpointDynamicTestUpdate endpointDynamicTestUpdate = null;
        String aid = null;
        GetDynamicTestDetail200Response response = api.updateEndpointDynamicTestDetail(testId, endpointDynamicTestUpdate, aid);
        // TODO: test validations
    }

}
