/*
 * Administrative API
 * ## Overview Manage users, accounts, and account groups in the ThousandEyes platform using the Administrative API.  This API provides the following endpoints that define the operations to manage your organization:     * `/account-groups`: Account groups are used to divide an organization into different sections. These endpoints can be used to create, retrieve, update and delete account groups.   * `/users`: Create, retrieve, update and delete users within an organization.    * `/roles`: Create, retrieve and update roles for the current user.    * `/permissions`: Retrieve all assignable permissions. Used in the context of modifying roles.    * `/audit-user-events`: Retrieve all activity log events.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.administrative;

import com.thousandeyes.api.ApiException;
import com.thousandeyes.api.administrative.model.CreateRole201Response;
import com.thousandeyes.api.administrative.model.Error;
import com.thousandeyes.api.administrative.model.GetRoles200Response;
import com.thousandeyes.api.administrative.model.RoleRequestBody;
import java.net.URI;
import com.thousandeyes.api.administrative.model.UnauthorizedError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RolesApi
 */
@Disabled
public class RolesApiTest {

    private final RolesApi api = new RolesApi();

    /**
     * Create role
     *
     * Creates a new role.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createRoleTest() throws ApiException {
        RoleRequestBody roleRequestBody = null;
        String aid = null;
        CreateRole201Response response = api.createRole(roleRequestBody, aid);
        // TODO: test validations
    }

    /**
     * Delete role
     *
     * Deletes a role using its ID. The user needs appropriate permissions to successfully call this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteRoleTest() throws ApiException {
        String id = null;
        String aid = null;
        api.deleteRole(id, aid);
        // TODO: test validations
    }

    /**
     * Retrieve role
     *
     * Returns detailed information about a role using its ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRoleTest() throws ApiException {
        String id = null;
        String aid = null;
        CreateRole201Response response = api.getRole(id, aid);
        // TODO: test validations
    }

    /**
     * List roles
     *
     * Retrieves a list of defined roles visible to the current user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRolesTest() throws ApiException {
        String aid = null;
        GetRoles200Response response = api.getRoles(aid);
        // TODO: test validations
    }

    /**
     * Update role
     *
     * Updates a user-defined role using its ID.  When updating a role, the following applies:  * The full list of permissions must be sent, This endpoint does not support delta-based grant or revoking of permissions.  * Permission definitions and details can be obtained from the Permissions endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateRoleTest() throws ApiException {
        String id = null;
        RoleRequestBody roleRequestBody = null;
        String aid = null;
        CreateRole201Response response = api.updateRole(id, roleRequestBody, aid);
        // TODO: test validations
    }

}
