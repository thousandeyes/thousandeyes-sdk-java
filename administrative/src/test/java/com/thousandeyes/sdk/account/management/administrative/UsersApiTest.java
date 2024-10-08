/*
 * Administrative API
 * Manage users, accounts, and account groups in the ThousandEyes platform using the Administrative API. This API provides the following operations to manage your organization:     * `/account-groups`: Account groups are used to divide an organization into different sections. These operations can be used to create, retrieve, update and delete account groups.   * `/users`: Create, retrieve, update and delete users within an organization.    * `/roles`: Create, retrieve and update roles for the current user.    * `/permissions`: Retrieve all assignable permissions. Used in the context of modifying roles.    * `/audit-user-events`: Retrieve all activity log events.    For more information about the administrative models, see [Account Management](https://docs.thousandeyes.com/product-documentation/user-management).
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.account.management.administrative;

import com.thousandeyes.sdk.account.management.administrative.model.CreatedUser;
import com.thousandeyes.sdk.account.management.administrative.model.Error;
import java.net.URI;
import com.thousandeyes.sdk.account.management.administrative.model.UnauthorizedError;
import com.thousandeyes.sdk.account.management.administrative.model.UserDetail;
import com.thousandeyes.sdk.account.management.administrative.model.UserRequest;
import com.thousandeyes.sdk.account.management.administrative.model.Users;
import com.thousandeyes.sdk.account.management.administrative.model.ValidationError;
import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.common.ContentTypes.AUTHORIZATION;
import static com.github.tomakehurst.wiremock.common.ContentTypes.CONTENT_TYPE;
import static com.thousandeyes.sdk.serialization.JSON.getDefault;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo;
import com.github.tomakehurst.wiremock.junit5.WireMockTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.NativeApiClient;


/**
 * Request and Response model deserialization tests for UsersApi
 */
@WireMockTest
public class UsersApiTest {
    private static final String TOKEN = "valid-token";
    private static final String BEARER_TOKEN = "Bearer %s".formatted(TOKEN);
    private static UsersApi api;
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);

    @BeforeAll
    public static void setup(WireMockRuntimeInfo wireMockRuntimeInfo) {
        ApiClient client = NativeApiClient.builder()
                                .baseUri(wireMockRuntimeInfo.getHttpBaseUrl())
                                .bearerToken(TOKEN)
                                .build();
        api = new UsersApi(client);
    }
    
    /**
     * Create user
     * <p>
     * Creates a new user.  The following applies when creating a user:  * If the user is already a member of another ThousandEyes customer organization, the user must set their own login account group.  * Any update that includes &#x60;accountGroupRoles&#x60; is a replace-based update and not a delta-based update.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Test
    public void createUserRequestAndResponseDeserializationTest()
            throws JsonProcessingException, ApiException
    {

        var requestBodyJson = """
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
        var requestBodyContentType = "application/json";
        UserRequest mappedRequest = 
                mapper.readValue(requestBodyJson, UserRequest.class);
        assertNotNull(mappedRequest);

        var responseBodyJson = """
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
        var statusCode = 201;
        var responseContentType = "application/json";
        CreatedUser mappedResponse = 
                mapper.readValue(responseBodyJson, CreatedUser.class);
        assertNotNull(mappedResponse);

        var path = "/users";
        stubFor(post(urlPathTemplate(path))
                        .withHeader(AUTHORIZATION, equalTo(BEARER_TOKEN))
                        .withHeader(CONTENT_TYPE, equalTo(requestBodyContentType))
                        .withRequestBody(equalToJson(requestBodyJson))
                        .willReturn(aResponse()
                                            .withHeader(CONTENT_TYPE, responseContentType)
                                            .withBody(responseBodyJson)
                                            .withStatus(statusCode)));

        var apiResponse = api.createUser(mappedRequest, null);
        assertEquals(mappedResponse, apiResponse);
    }
    
    /**
     * Delete user
     * <p>
     * Deletes a user using the user ID. This operation requires the &#x60;Edit users in all account groups&#x60; or &#x60;Edit users&#x60; permission.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Test
    public void deleteUserRequestAndResponseDeserializationTest()
            throws JsonProcessingException, ApiException
    {
        String id = "1234";


        var statusCode = 204;

        var path = "/users/{id}";
        stubFor(delete(urlPathTemplate(path))
                        .withPathParam("id", equalTo(URLEncoder.encode(id, StandardCharsets.UTF_8)))
                        .withHeader(AUTHORIZATION, equalTo(BEARER_TOKEN))
                        .willReturn(aResponse()
                                            .withStatus(statusCode)));

        var apiResponse = api.deleteUserWithHttpInfo(id, null);
        assertEquals(statusCode, apiResponse.getStatusCode());
    }
    
    /**
     * Retrieve current user
     * <p>
     * Retrieves detailed information about the current user.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Test
    public void getCurrentUserRequestAndResponseDeserializationTest()
            throws JsonProcessingException, ApiException
    {


        var responseBodyJson = """
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
        var statusCode = 200;
        var responseContentType = "application/json";
        UserDetail mappedResponse = 
                mapper.readValue(responseBodyJson, UserDetail.class);
        assertNotNull(mappedResponse);

        var path = "/users/current";
        stubFor(get(urlPathTemplate(path))
                        .withHeader(AUTHORIZATION, equalTo(BEARER_TOKEN))
                        .willReturn(aResponse()
                                            .withHeader(CONTENT_TYPE, responseContentType)
                                            .withBody(responseBodyJson)
                                            .withStatus(statusCode)));

        var apiResponse = api.getCurrentUser();
        assertEquals(mappedResponse, apiResponse);
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
            throws JsonProcessingException, ApiException
    {
        String id = "1234";


        var responseBodyJson = """
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
        var statusCode = 200;
        var responseContentType = "application/json";
        UserDetail mappedResponse = 
                mapper.readValue(responseBodyJson, UserDetail.class);
        assertNotNull(mappedResponse);

        var path = "/users/{id}";
        stubFor(get(urlPathTemplate(path))
                        .withPathParam("id", equalTo(URLEncoder.encode(id, StandardCharsets.UTF_8)))
                        .withHeader(AUTHORIZATION, equalTo(BEARER_TOKEN))
                        .willReturn(aResponse()
                                            .withHeader(CONTENT_TYPE, responseContentType)
                                            .withBody(responseBodyJson)
                                            .withStatus(statusCode)));

        var apiResponse = api.getUser(id, null);
        assertEquals(mappedResponse, apiResponse);
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
            throws JsonProcessingException, ApiException
    {


        var responseBodyJson = """
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
        var statusCode = 200;
        var responseContentType = "application/json";
        Users mappedResponse = 
                mapper.readValue(responseBodyJson, Users.class);
        assertNotNull(mappedResponse);

        var path = "/users";
        stubFor(get(urlPathTemplate(path))
                        .withHeader(AUTHORIZATION, equalTo(BEARER_TOKEN))
                        .willReturn(aResponse()
                                            .withHeader(CONTENT_TYPE, responseContentType)
                                            .withBody(responseBodyJson)
                                            .withStatus(statusCode)));

        var apiResponse = api.getUsers(null);
        assertEquals(mappedResponse, apiResponse);
    }
    
    /**
     * Update user
     * <p>
     * Updates a user using the user ID. You can update the user name, email address, account group assignments, or roles. This operation requires the &#x60;Edit users in all account groups&#x60; or &#x60;Edit users&#x60; permission.   When updating a user, the following applies: * When updating a user&#39;s email address, the user must confirm the username change before they can subsequently log in or perform API operations. * Any update that includes &#x60;accountGroupRoles&#x60; is a replace-based update and not a delta-based update.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Test
    public void updateUserRequestAndResponseDeserializationTest()
            throws JsonProcessingException, ApiException
    {
        String id = "1234";

        var requestBodyJson = """
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
        var requestBodyContentType = "application/json";
        UserRequest mappedRequest = 
                mapper.readValue(requestBodyJson, UserRequest.class);
        assertNotNull(mappedRequest);

        var responseBodyJson = """
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
        var statusCode = 200;
        var responseContentType = "application/json";
        UserDetail mappedResponse = 
                mapper.readValue(responseBodyJson, UserDetail.class);
        assertNotNull(mappedResponse);

        var path = "/users/{id}";
        stubFor(put(urlPathTemplate(path))
                        .withPathParam("id", equalTo(URLEncoder.encode(id, StandardCharsets.UTF_8)))
                        .withHeader(AUTHORIZATION, equalTo(BEARER_TOKEN))
                        .withHeader(CONTENT_TYPE, equalTo(requestBodyContentType))
                        .withRequestBody(equalToJson(requestBodyJson))
                        .willReturn(aResponse()
                                            .withHeader(CONTENT_TYPE, responseContentType)
                                            .withBody(responseBodyJson)
                                            .withStatus(statusCode)));

        var apiResponse = api.updateUser(id, mappedRequest, null);
        assertEquals(mappedResponse, apiResponse);
    }
    
}
