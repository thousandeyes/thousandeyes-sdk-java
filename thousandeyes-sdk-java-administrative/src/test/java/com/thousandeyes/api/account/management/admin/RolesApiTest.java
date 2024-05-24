/*
 * Administrative API
 * ## Overview Manage users, accounts, and account groups in the ThousandEyes platform using the Administrative API. This API provides the following endpoints that define the operations to manage your organization:     * `/account-groups`: Account groups are used to divide an organization into different sections. These endpoints can be used to create, retrieve, update and delete account groups.   * `/users`: Create, retrieve, update and delete users within an organization.    * `/roles`: Create, retrieve and update roles for the current user.    * `/permissions`: Retrieve all assignable permissions. Used in the context of modifying roles.    * `/audit-user-events`: Retrieve all activity log events.    For more information about the administrative models, see [Account Management](https://docs.thousandeyes.com/product-documentation/user-management).
 *
 * The version of the OpenAPI document: 7.0.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.account.management.admin;

import com.thousandeyes.api.account.management.admin.model.Error;
import com.thousandeyes.api.account.management.admin.model.RoleDetail;
import com.thousandeyes.api.account.management.admin.model.RoleRequestBody;
import com.thousandeyes.api.account.management.admin.model.Roles;
import java.net.URI;
import com.thousandeyes.api.account.management.admin.model.UnauthorizedError;
import com.thousandeyes.api.account.management.admin.model.ValidationError;
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
 * Request and Response model deserialization tests for RolesApi
 */
public class RolesApiTest {
    // private final RolesApi api = new RolesApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Create role
     * <p>
     * Creates a new role.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void createRoleRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "permissions" : [ "56", "315" ],
                  "name" : "Organization Admin"
                }
                                 """;
        RoleRequestBody mappedRequest = 
                mapper.readValue(requestBodyJson, RoleRequestBody.class);
        assertNotNull(mappedRequest);

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
                  "roleId" : "35",
                  "permissions" : [ {
                    "label" : "View reports",
                    "permissionId" : 1,
                    "isManagementPermission" : true,
                    "permission" : "REPORT_READ"
                  }, {
                    "label" : "View snapshots",
                    "permissionId" : 51,
                    "isManagementPermission" : false,
                    "permission" : "REPORT_SNAPSHOTS_READ"
                  } ],
                  "name" : "Organization Admin",
                  "isBuiltin" : true
                }
                                  """;
        RoleDetail mappedResponse = 
                mapper.readValue(responseBodyJson, RoleDetail.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Delete role
     * <p>
     * Deletes a role using its ID. The user needs appropriate permissions to successfully call this endpoint.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Disabled
    @Test
    public void deleteRoleRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

    }
    
    /**
     * Retrieve role
     * <p>
     * Returns detailed information about a role using its ID.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getRoleRequestAndResponseDeserializationTest()
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
                  "roleId" : "35",
                  "permissions" : [ {
                    "label" : "View reports",
                    "permissionId" : 1,
                    "isManagementPermission" : true,
                    "permission" : "REPORT_READ"
                  }, {
                    "label" : "View snapshots",
                    "permissionId" : 51,
                    "isManagementPermission" : false,
                    "permission" : "REPORT_SNAPSHOTS_READ"
                  } ],
                  "name" : "Organization Admin",
                  "isBuiltin" : true
                }
                                  """;
        RoleDetail mappedResponse = 
                mapper.readValue(responseBodyJson, RoleDetail.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * List roles
     * <p>
     * Retrieves a list of defined roles visible to the current user.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getRolesRequestAndResponseDeserializationTest()
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
                  "roles" : [ {
                    "roleId" : "35",
                    "name" : "Organization Admin",
                    "isBuiltin" : true,
                    "hasManagementPermissions" : true
                  }, {
                    "roleId" : "35",
                    "name" : "Organization Admin",
                    "isBuiltin" : true,
                    "hasManagementPermissions" : true
                  } ]
                }
                                  """;
        Roles mappedResponse = 
                mapper.readValue(responseBodyJson, Roles.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Update role
     * <p>
     * Updates a user-defined role using its ID.  When updating a role, the following applies:  * The full list of permissions must be sent, This endpoint does not support delta-based grant or revoking of permissions.  * Permission definitions and details can be obtained from the Permissions endpoint.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void updateRoleRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "permissions" : [ "56", "315" ],
                  "name" : "Organization Admin"
                }
                                 """;
        RoleRequestBody mappedRequest = 
                mapper.readValue(requestBodyJson, RoleRequestBody.class);
        assertNotNull(mappedRequest);

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
                  "roleId" : "35",
                  "permissions" : [ {
                    "label" : "View reports",
                    "permissionId" : 1,
                    "isManagementPermission" : true,
                    "permission" : "REPORT_READ"
                  }, {
                    "label" : "View snapshots",
                    "permissionId" : 51,
                    "isManagementPermission" : false,
                    "permission" : "REPORT_SNAPSHOTS_READ"
                  } ],
                  "name" : "Organization Admin",
                  "isBuiltin" : true
                }
                                  """;
        RoleDetail mappedResponse = 
                mapper.readValue(responseBodyJson, RoleDetail.class);
        assertNotNull(mappedResponse);
    }
    
}
