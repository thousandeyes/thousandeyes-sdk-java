/*
 * Administrative API
 * ## Overview Manage users, accounts, and account groups in the ThousandEyes platform using the Administrative API. This API provides the following endpoints that define the operations to manage your organization:     * `/account-groups`: Account groups are used to divide an organization into different sections. These endpoints can be used to create, retrieve, update and delete account groups.   * `/users`: Create, retrieve, update and delete users within an organization.    * `/roles`: Create, retrieve and update roles for the current user.    * `/permissions`: Retrieve all assignable permissions. Used in the context of modifying roles.    * `/audit-user-events`: Retrieve all activity log events.    For more information about the administrative models, see [Account Management](https://docs.thousandeyes.com/product-documentation/user-management).
 *
 * The version of the OpenAPI document: 7.0.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.account.management.admin;

import com.thousandeyes.api.account.management.admin.model.CreatedUser;
import com.thousandeyes.api.account.management.admin.model.Error;
import java.net.URI;
import com.thousandeyes.api.account.management.admin.model.UnauthorizedError;
import com.thousandeyes.api.account.management.admin.model.UserDetail;
import com.thousandeyes.api.account.management.admin.model.UserRequest;
import com.thousandeyes.api.account.management.admin.model.Users;
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
 * Request and Response model deserialization tests for UsersApi
 */
public class UsersApiTest {
    // private final UsersApi api = new UsersApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Create user
     * <p>
     * Creates a new user.  The following applies when creating a user:  * If the user is already a member of another ThousandEyes customer organization, the user must set their own login account group.  * Any update that includes &#x60;accountGroupRoles&#x60; is a replace-based update and not a delta-based update.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void createUserRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "loginAccountGroupId" : "691",
                  "accountGroupRoles" : [ {
                    "roleIds" : [ "57", "1140" ],
                    "accountGroupId" : "315"
                  }, {
                    "roleIds" : [ "57", "1140" ],
                    "accountGroupId" : "315"
                  } ],
                  "name" : "User X",
                  "allAccountGroupRoleIds" : [ "57", "1140" ],
                  "email" : "userx@thousandeyes.com"
                }
                                 """;
        UserRequest mappedRequest = 
                mapper.readValue(requestBodyJson, UserRequest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "loginAccountGroup" : {
                    "accountGroupName" : "Account A",
                    "aid" : "1234"
                  },
                  "uid" : "245",
                  "allAccountGroupRoles" : [ {
                    "roleId" : "35",
                    "name" : "Organization Admin",
                    "isBuiltin" : true,
                    "hasManagementPermissions" : true
                  }, {
                    "roleId" : "35",
                    "name" : "Organization Admin",
                    "isBuiltin" : true,
                    "hasManagementPermissions" : true
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
                  },
                  "accountGroupRoles" : [ {
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
                    } ],
                    "accountGroup" : {
                      "accountGroupName" : "Account A",
                      "aid" : "1234"
                    }
                  }, {
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
                    } ],
                    "accountGroup" : {
                      "accountGroupName" : "Account A",
                      "aid" : "1234"
                    }
                  } ],
                  "name" : "User X",
                  "email" : "userx@thousandeyes.com",
                  "dateRegistered" : "2020-07-17T22:00:54Z"
                }
                                  """;
        CreatedUser mappedResponse = 
                mapper.readValue(responseBodyJson, CreatedUser.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Delete user
     * <p>
     * Deletes a user using the user ID. This endpoint requires the &#x60;Edit users in all account groups&#x60; or &#x60;Edit users&#x60; permission.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Disabled
    @Test
    public void deleteUserRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

    }
    
    /**
     * Retrieve user
     * <p>
     * Retrieves detailed information about a user. This operation requires the &#x60;API Access&#x60; and &#x60;View All Users&#x60; permissions.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getUserRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "loginAccountGroup" : {
                    "accountGroupName" : "Account A",
                    "aid" : "1234"
                  },
                  "uid" : "245",
                  "lastLogin" : "2022-07-17T22:00:54Z",
                  "allAccountGroupRoles" : [ {
                    "roleId" : "35",
                    "name" : "Organization Admin",
                    "isBuiltin" : true,
                    "hasManagementPermissions" : true
                  }, {
                    "roleId" : "35",
                    "name" : "Organization Admin",
                    "isBuiltin" : true,
                    "hasManagementPermissions" : true
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
                  },
                  "accountGroupRoles" : [ {
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
                    } ],
                    "accountGroup" : {
                      "accountGroupName" : "Account A",
                      "aid" : "1234"
                    }
                  }, {
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
                    } ],
                    "accountGroup" : {
                      "accountGroupName" : "Account A",
                      "aid" : "1234"
                    }
                  } ],
                  "name" : "User X",
                  "email" : "userx@thousandeyes.com",
                  "dateRegistered" : "2020-07-17T22:00:54Z"
                }
                                  """;
        UserDetail mappedResponse = 
                mapper.readValue(responseBodyJson, UserDetail.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * List users
     * <p>
     * Retrieves a list of users in the organization the account group ID belongs to. This operation requires the &#x60;API Access&#x60; and &#x60;View all users&#x60; permissions. See [Account Context](https://developer.thousandeyes.com/v7/#/accountcontext) for more information on changing the account group context.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getUsersRequestAndResponseDeserializationTest()
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
                  "users" : [ {
                    "loginAccountGroup" : {
                      "accountGroupName" : "Account A",
                      "aid" : "1234"
                    },
                    "uid" : "245",
                    "lastLogin" : "2022-07-17T22:00:54Z",
                    "name" : "User X",
                    "email" : "userx@thousandeyes.com",
                    "dateRegistered" : "2020-07-17T22:00:54Z"
                  }, {
                    "loginAccountGroup" : {
                      "accountGroupName" : "Account A",
                      "aid" : "1234"
                    },
                    "uid" : "245",
                    "lastLogin" : "2022-07-17T22:00:54Z",
                    "name" : "User X",
                    "email" : "userx@thousandeyes.com",
                    "dateRegistered" : "2020-07-17T22:00:54Z"
                  } ]
                }
                                  """;
        Users mappedResponse = 
                mapper.readValue(responseBodyJson, Users.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Update user
     * <p>
     * Updates a user using the user ID. You can update the user name, email address, account group assignments, or roles. This endpoint requires the &#x60;Edit users in all account groups&#x60; or &#x60;Edit users&#x60; permission.   When updating a user, the following applies: * When updating a user&#39;s email address, the user must confirm the username change before they can subsequently log in or perform API operations. * Any update that includes &#x60;accountGroupRoles&#x60; is a replace-based update and not a delta-based update.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void updateUserRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "loginAccountGroupId" : "691",
                  "accountGroupRoles" : [ {
                    "roleIds" : [ "57", "1140" ],
                    "accountGroupId" : "315"
                  }, {
                    "roleIds" : [ "57", "1140" ],
                    "accountGroupId" : "315"
                  } ],
                  "name" : "User X",
                  "allAccountGroupRoleIds" : [ "57", "1140" ],
                  "email" : "userx@thousandeyes.com"
                }
                                 """;
        UserRequest mappedRequest = 
                mapper.readValue(requestBodyJson, UserRequest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "loginAccountGroup" : {
                    "accountGroupName" : "Account A",
                    "aid" : "1234"
                  },
                  "uid" : "245",
                  "lastLogin" : "2022-07-17T22:00:54Z",
                  "allAccountGroupRoles" : [ {
                    "roleId" : "35",
                    "name" : "Organization Admin",
                    "isBuiltin" : true,
                    "hasManagementPermissions" : true
                  }, {
                    "roleId" : "35",
                    "name" : "Organization Admin",
                    "isBuiltin" : true,
                    "hasManagementPermissions" : true
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
                  },
                  "accountGroupRoles" : [ {
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
                    } ],
                    "accountGroup" : {
                      "accountGroupName" : "Account A",
                      "aid" : "1234"
                    }
                  }, {
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
                    } ],
                    "accountGroup" : {
                      "accountGroupName" : "Account A",
                      "aid" : "1234"
                    }
                  } ],
                  "name" : "User X",
                  "email" : "userx@thousandeyes.com",
                  "dateRegistered" : "2020-07-17T22:00:54Z"
                }
                                  """;
        UserDetail mappedResponse = 
                mapper.readValue(responseBodyJson, UserDetail.class);
        assertNotNull(mappedResponse);
    }
    
}
