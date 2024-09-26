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

import com.thousandeyes.sdk.account.management.administrative.model.AccountGroupDetail;
import com.thousandeyes.sdk.account.management.administrative.model.AccountGroupRequest;
import com.thousandeyes.sdk.account.management.administrative.model.AccountGroups;
import com.thousandeyes.sdk.account.management.administrative.model.CreatedAccountGroup;
import com.thousandeyes.sdk.account.management.administrative.model.Error;
import com.thousandeyes.sdk.account.management.administrative.model.ExpandAccountGroupOptions;
import java.net.URI;
import com.thousandeyes.sdk.account.management.administrative.model.UnauthorizedError;
import com.thousandeyes.sdk.account.management.administrative.model.ValidationError;
import static com.thousandeyes.sdk.serialization.JSON.getDefault;
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
 * Request and Response model deserialization tests for AccountGroupsApi
 */
public class AccountGroupsApiTest {
    // private final AccountGroupsApi api = new AccountGroupsApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Create account group
     * <p>
     * Creates a new account group. This operation requires the &#x60;Edit all account groups&#x60; permission.  **Note:** Any user assigned to &#x60;All Account Groups&#x60; is automatically assigned to the new account group.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void createAccountGroupRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "accountGroupName" : "My testing account group",
                  "agents" : [ "105", "719" ]
                }
                                 """;
        AccountGroupRequest mappedRequest = 
                mapper.readValue(requestBodyJson, AccountGroupRequest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "isCurrentAccountGroup" : true,
                  "organizationName" : "organizationName",
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
                  "accountGroupName" : "Account A",
                  "isDefaultAccountGroup" : true,
                  "aid" : "1234",
                  "users" : [ {
                    "uid" : "235",
                    "lastLogin" : "2022-07-17T22:00:54Z",
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
                    "name" : "User X",
                    "email" : "userx@thousandeyes.com",
                    "dateRegistered" : "2022-07-17T22:00:54Z"
                  }, {
                    "uid" : "235",
                    "lastLogin" : "2022-07-17T22:00:54Z",
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
                    "name" : "User X",
                    "email" : "userx@thousandeyes.com",
                    "dateRegistered" : "2022-07-17T22:00:54Z"
                  } ]
                }
                                  """;
        CreatedAccountGroup mappedResponse = 
                mapper.readValue(responseBodyJson, CreatedAccountGroup.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Delete account group
     * <p>
     * Deletes an account group using its ID. This operation requires the following permissions:    * Assign management permissions   * Delete account   * Edit all account groups
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Disabled
    @Test
    public void deleteAccountGroupRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

    }
    
    /**
     * Retrieve account group
     * <p>
     * Retrieves detailed information about an account group using its ID.  This operation requires the &#x60;View all account groups settings&#x60; permission.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getAccountGroupRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "isCurrentAccountGroup" : true,
                  "organizationName" : "organizationName",
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
                  "accountGroupName" : "Account A",
                  "isDefaultAccountGroup" : true,
                  "accountToken" : "6j052y4vfgyuhefghue",
                  "aid" : "1234",
                  "users" : [ {
                    "uid" : "235",
                    "lastLogin" : "2022-07-17T22:00:54Z",
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
                    "name" : "User X",
                    "email" : "userx@thousandeyes.com",
                    "dateRegistered" : "2022-07-17T22:00:54Z"
                  }, {
                    "uid" : "235",
                    "lastLogin" : "2022-07-17T22:00:54Z",
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
                    "name" : "User X",
                    "email" : "userx@thousandeyes.com",
                    "dateRegistered" : "2022-07-17T22:00:54Z"
                  } ],
                  "agents" : [ {
                    "localResolutionPrefixes" : [ "10.2.3.3/24", "10.2.3.3/24" ],
                    "agentId" : "281474976710706",
                    "agentType" : "enterprise-cluster",
                    "ipv6Policy" : "force-ipv4",
                    "prefix" : "99.128.0.0/11",
                    "agentName" : "thousandeyes-stg-va-254",
                    "utilization" : 25,
                    "countryId" : "US",
                    "enabled" : true,
                    "network" : "AT&T Services, Inc. (AS 7018)",
                    "clusterMembers" : [ {
                      "lastSeen" : "2022-07-17T22:00:54Z",
                      "publicIpAddresses" : [ "192.168.1.78", "f9b2:3a21:f25c:d300:03f4:586d:f8d6:4e1c" ],
                      "agentState" : "online",
                      "targetForTests" : "1.1.1.1",
                      "name" : "Cluster member name",
                      "ipAddresses" : [ "99.139.65.220", "9bbd:8a0a:a257:5876:288b:6cb2:3f36:64ce" ],
                      "utilization" : 25,
                      "network" : "AT&T Services, Inc. (AS 7018)",
                      "memberId" : "10",
                      "errorDetails" : [ {
                        "code" : "agent-version-outdated",
                        "description" : "Agent Version 0.1.1 (latest: 1.0.0)"
                      }, {
                        "code" : "agent-version-outdated",
                        "description" : "Agent Version 0.1.1 (latest: 1.0.0)"
                      } ]
                    }, {
                      "lastSeen" : "2022-07-17T22:00:54Z",
                      "publicIpAddresses" : [ "192.168.1.78", "f9b2:3a21:f25c:d300:03f4:586d:f8d6:4e1c" ],
                      "agentState" : "online",
                      "targetForTests" : "1.1.1.1",
                      "name" : "Cluster member name",
                      "ipAddresses" : [ "99.139.65.220", "9bbd:8a0a:a257:5876:288b:6cb2:3f36:64ce" ],
                      "utilization" : 25,
                      "network" : "AT&T Services, Inc. (AS 7018)",
                      "memberId" : "10",
                      "errorDetails" : [ {
                        "code" : "agent-version-outdated",
                        "description" : "Agent Version 0.1.1 (latest: 1.0.0)"
                      }, {
                        "code" : "agent-version-outdated",
                        "description" : "Agent Version 0.1.1 (latest: 1.0.0)"
                      } ]
                    } ],
                    "hostname" : "thousandeyes.com",
                    "lastSeen" : "2022-07-17T22:00:54Z",
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "publicIpAddresses" : [ "192.168.1.78", "f9b2:3a21:f25c:d300:03f4:586d:f8d6:4e1c" ],
                    "keepBrowserCache" : true,
                    "interfaceIpMappings" : [ {
                      "ipAddresses" : [ "73.252.207.219", "2601:646:300:3ae0::b977" ],
                      "interfaceName" : "wlp4s0"
                    }, {
                      "ipAddresses" : [ "73.252.207.219", "2601:646:300:3ae0::b977" ],
                      "interfaceName" : "wlp4s0"
                    } ],
                    "agentState" : "online",
                    "targetForTests" : "1.1.1.1",
                    "ipAddresses" : [ "99.139.65.220", "9bbd:8a0a:a257:5876:288b:6cb2:3f36:64ce" ],
                    "location" : "San Francisco Bay Area",
                    "accountGroups" : [ {
                      "accountGroupName" : "Account A",
                      "aid" : "1234"
                    }, {
                      "accountGroupName" : "Account A",
                      "aid" : "1234"
                    } ],
                    "verifySslCertificates" : true,
                    "errorDetails" : [ {
                      "code" : "agent-version-outdated",
                      "description" : "Agent Version 0.1.1 (latest: 1.0.0)"
                    }, {
                      "code" : "agent-version-outdated",
                      "description" : "Agent Version 0.1.1 (latest: 1.0.0)"
                    } ]
                  }, {
                    "localResolutionPrefixes" : [ "10.2.3.3/24", "10.2.3.3/24" ],
                    "agentId" : "281474976710706",
                    "agentType" : "enterprise-cluster",
                    "ipv6Policy" : "force-ipv4",
                    "prefix" : "99.128.0.0/11",
                    "agentName" : "thousandeyes-stg-va-254",
                    "utilization" : 25,
                    "countryId" : "US",
                    "enabled" : true,
                    "network" : "AT&T Services, Inc. (AS 7018)",
                    "clusterMembers" : [ {
                      "lastSeen" : "2022-07-17T22:00:54Z",
                      "publicIpAddresses" : [ "192.168.1.78", "f9b2:3a21:f25c:d300:03f4:586d:f8d6:4e1c" ],
                      "agentState" : "online",
                      "targetForTests" : "1.1.1.1",
                      "name" : "Cluster member name",
                      "ipAddresses" : [ "99.139.65.220", "9bbd:8a0a:a257:5876:288b:6cb2:3f36:64ce" ],
                      "utilization" : 25,
                      "network" : "AT&T Services, Inc. (AS 7018)",
                      "memberId" : "10",
                      "errorDetails" : [ {
                        "code" : "agent-version-outdated",
                        "description" : "Agent Version 0.1.1 (latest: 1.0.0)"
                      }, {
                        "code" : "agent-version-outdated",
                        "description" : "Agent Version 0.1.1 (latest: 1.0.0)"
                      } ]
                    }, {
                      "lastSeen" : "2022-07-17T22:00:54Z",
                      "publicIpAddresses" : [ "192.168.1.78", "f9b2:3a21:f25c:d300:03f4:586d:f8d6:4e1c" ],
                      "agentState" : "online",
                      "targetForTests" : "1.1.1.1",
                      "name" : "Cluster member name",
                      "ipAddresses" : [ "99.139.65.220", "9bbd:8a0a:a257:5876:288b:6cb2:3f36:64ce" ],
                      "utilization" : 25,
                      "network" : "AT&T Services, Inc. (AS 7018)",
                      "memberId" : "10",
                      "errorDetails" : [ {
                        "code" : "agent-version-outdated",
                        "description" : "Agent Version 0.1.1 (latest: 1.0.0)"
                      }, {
                        "code" : "agent-version-outdated",
                        "description" : "Agent Version 0.1.1 (latest: 1.0.0)"
                      } ]
                    } ],
                    "hostname" : "thousandeyes.com",
                    "lastSeen" : "2022-07-17T22:00:54Z",
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "publicIpAddresses" : [ "192.168.1.78", "f9b2:3a21:f25c:d300:03f4:586d:f8d6:4e1c" ],
                    "keepBrowserCache" : true,
                    "interfaceIpMappings" : [ {
                      "ipAddresses" : [ "73.252.207.219", "2601:646:300:3ae0::b977" ],
                      "interfaceName" : "wlp4s0"
                    }, {
                      "ipAddresses" : [ "73.252.207.219", "2601:646:300:3ae0::b977" ],
                      "interfaceName" : "wlp4s0"
                    } ],
                    "agentState" : "online",
                    "targetForTests" : "1.1.1.1",
                    "ipAddresses" : [ "99.139.65.220", "9bbd:8a0a:a257:5876:288b:6cb2:3f36:64ce" ],
                    "location" : "San Francisco Bay Area",
                    "accountGroups" : [ {
                      "accountGroupName" : "Account A",
                      "aid" : "1234"
                    }, {
                      "accountGroupName" : "Account A",
                      "aid" : "1234"
                    } ],
                    "verifySslCertificates" : true,
                    "errorDetails" : [ {
                      "code" : "agent-version-outdated",
                      "description" : "Agent Version 0.1.1 (latest: 1.0.0)"
                    }, {
                      "code" : "agent-version-outdated",
                      "description" : "Agent Version 0.1.1 (latest: 1.0.0)"
                    } ]
                  } ]
                }
                                  """;
        AccountGroupDetail mappedResponse = 
                mapper.readValue(responseBodyJson, AccountGroupDetail.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * List account groups
     * <p>
     * Retrieves a list of account groups available to the current user.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getAccountGroupsRequestAndResponseDeserializationTest()
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
                  "accountGroups" : [ {
                    "isCurrentAccountGroup" : true,
                    "organizationName" : "organizationName",
                    "accountGroupName" : "Account A",
                    "isDefaultAccountGroup" : true,
                    "aid" : "1234"
                  }, {
                    "isCurrentAccountGroup" : true,
                    "organizationName" : "organizationName",
                    "accountGroupName" : "Account A",
                    "isDefaultAccountGroup" : true,
                    "aid" : "1234"
                  } ]
                }
                                  """;
        AccountGroups mappedResponse = 
                mapper.readValue(responseBodyJson, AccountGroups.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Update account group
     * <p>
     * Updates an account group using its ID. You can modify the account group’s name or the list of agents assigned to the account group.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void updateAccountGroupRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "accountGroupName" : "My testing account group",
                  "agents" : [ "105", "719" ]
                }
                                 """;
        AccountGroupRequest mappedRequest = 
                mapper.readValue(requestBodyJson, AccountGroupRequest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "isCurrentAccountGroup" : true,
                  "organizationName" : "organizationName",
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
                  "accountGroupName" : "Account A",
                  "isDefaultAccountGroup" : true,
                  "accountToken" : "6j052y4vfgyuhefghue",
                  "aid" : "1234",
                  "users" : [ {
                    "uid" : "235",
                    "lastLogin" : "2022-07-17T22:00:54Z",
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
                    "name" : "User X",
                    "email" : "userx@thousandeyes.com",
                    "dateRegistered" : "2022-07-17T22:00:54Z"
                  }, {
                    "uid" : "235",
                    "lastLogin" : "2022-07-17T22:00:54Z",
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
                    "name" : "User X",
                    "email" : "userx@thousandeyes.com",
                    "dateRegistered" : "2022-07-17T22:00:54Z"
                  } ],
                  "agents" : [ {
                    "localResolutionPrefixes" : [ "10.2.3.3/24", "10.2.3.3/24" ],
                    "agentId" : "281474976710706",
                    "agentType" : "enterprise-cluster",
                    "ipv6Policy" : "force-ipv4",
                    "prefix" : "99.128.0.0/11",
                    "agentName" : "thousandeyes-stg-va-254",
                    "utilization" : 25,
                    "countryId" : "US",
                    "enabled" : true,
                    "network" : "AT&T Services, Inc. (AS 7018)",
                    "clusterMembers" : [ {
                      "lastSeen" : "2022-07-17T22:00:54Z",
                      "publicIpAddresses" : [ "192.168.1.78", "f9b2:3a21:f25c:d300:03f4:586d:f8d6:4e1c" ],
                      "agentState" : "online",
                      "targetForTests" : "1.1.1.1",
                      "name" : "Cluster member name",
                      "ipAddresses" : [ "99.139.65.220", "9bbd:8a0a:a257:5876:288b:6cb2:3f36:64ce" ],
                      "utilization" : 25,
                      "network" : "AT&T Services, Inc. (AS 7018)",
                      "memberId" : "10",
                      "errorDetails" : [ {
                        "code" : "agent-version-outdated",
                        "description" : "Agent Version 0.1.1 (latest: 1.0.0)"
                      }, {
                        "code" : "agent-version-outdated",
                        "description" : "Agent Version 0.1.1 (latest: 1.0.0)"
                      } ]
                    }, {
                      "lastSeen" : "2022-07-17T22:00:54Z",
                      "publicIpAddresses" : [ "192.168.1.78", "f9b2:3a21:f25c:d300:03f4:586d:f8d6:4e1c" ],
                      "agentState" : "online",
                      "targetForTests" : "1.1.1.1",
                      "name" : "Cluster member name",
                      "ipAddresses" : [ "99.139.65.220", "9bbd:8a0a:a257:5876:288b:6cb2:3f36:64ce" ],
                      "utilization" : 25,
                      "network" : "AT&T Services, Inc. (AS 7018)",
                      "memberId" : "10",
                      "errorDetails" : [ {
                        "code" : "agent-version-outdated",
                        "description" : "Agent Version 0.1.1 (latest: 1.0.0)"
                      }, {
                        "code" : "agent-version-outdated",
                        "description" : "Agent Version 0.1.1 (latest: 1.0.0)"
                      } ]
                    } ],
                    "hostname" : "thousandeyes.com",
                    "lastSeen" : "2022-07-17T22:00:54Z",
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "publicIpAddresses" : [ "192.168.1.78", "f9b2:3a21:f25c:d300:03f4:586d:f8d6:4e1c" ],
                    "keepBrowserCache" : true,
                    "interfaceIpMappings" : [ {
                      "ipAddresses" : [ "73.252.207.219", "2601:646:300:3ae0::b977" ],
                      "interfaceName" : "wlp4s0"
                    }, {
                      "ipAddresses" : [ "73.252.207.219", "2601:646:300:3ae0::b977" ],
                      "interfaceName" : "wlp4s0"
                    } ],
                    "agentState" : "online",
                    "targetForTests" : "1.1.1.1",
                    "ipAddresses" : [ "99.139.65.220", "9bbd:8a0a:a257:5876:288b:6cb2:3f36:64ce" ],
                    "location" : "San Francisco Bay Area",
                    "accountGroups" : [ {
                      "accountGroupName" : "Account A",
                      "aid" : "1234"
                    }, {
                      "accountGroupName" : "Account A",
                      "aid" : "1234"
                    } ],
                    "verifySslCertificates" : true,
                    "errorDetails" : [ {
                      "code" : "agent-version-outdated",
                      "description" : "Agent Version 0.1.1 (latest: 1.0.0)"
                    }, {
                      "code" : "agent-version-outdated",
                      "description" : "Agent Version 0.1.1 (latest: 1.0.0)"
                    } ]
                  }, {
                    "localResolutionPrefixes" : [ "10.2.3.3/24", "10.2.3.3/24" ],
                    "agentId" : "281474976710706",
                    "agentType" : "enterprise-cluster",
                    "ipv6Policy" : "force-ipv4",
                    "prefix" : "99.128.0.0/11",
                    "agentName" : "thousandeyes-stg-va-254",
                    "utilization" : 25,
                    "countryId" : "US",
                    "enabled" : true,
                    "network" : "AT&T Services, Inc. (AS 7018)",
                    "clusterMembers" : [ {
                      "lastSeen" : "2022-07-17T22:00:54Z",
                      "publicIpAddresses" : [ "192.168.1.78", "f9b2:3a21:f25c:d300:03f4:586d:f8d6:4e1c" ],
                      "agentState" : "online",
                      "targetForTests" : "1.1.1.1",
                      "name" : "Cluster member name",
                      "ipAddresses" : [ "99.139.65.220", "9bbd:8a0a:a257:5876:288b:6cb2:3f36:64ce" ],
                      "utilization" : 25,
                      "network" : "AT&T Services, Inc. (AS 7018)",
                      "memberId" : "10",
                      "errorDetails" : [ {
                        "code" : "agent-version-outdated",
                        "description" : "Agent Version 0.1.1 (latest: 1.0.0)"
                      }, {
                        "code" : "agent-version-outdated",
                        "description" : "Agent Version 0.1.1 (latest: 1.0.0)"
                      } ]
                    }, {
                      "lastSeen" : "2022-07-17T22:00:54Z",
                      "publicIpAddresses" : [ "192.168.1.78", "f9b2:3a21:f25c:d300:03f4:586d:f8d6:4e1c" ],
                      "agentState" : "online",
                      "targetForTests" : "1.1.1.1",
                      "name" : "Cluster member name",
                      "ipAddresses" : [ "99.139.65.220", "9bbd:8a0a:a257:5876:288b:6cb2:3f36:64ce" ],
                      "utilization" : 25,
                      "network" : "AT&T Services, Inc. (AS 7018)",
                      "memberId" : "10",
                      "errorDetails" : [ {
                        "code" : "agent-version-outdated",
                        "description" : "Agent Version 0.1.1 (latest: 1.0.0)"
                      }, {
                        "code" : "agent-version-outdated",
                        "description" : "Agent Version 0.1.1 (latest: 1.0.0)"
                      } ]
                    } ],
                    "hostname" : "thousandeyes.com",
                    "lastSeen" : "2022-07-17T22:00:54Z",
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "publicIpAddresses" : [ "192.168.1.78", "f9b2:3a21:f25c:d300:03f4:586d:f8d6:4e1c" ],
                    "keepBrowserCache" : true,
                    "interfaceIpMappings" : [ {
                      "ipAddresses" : [ "73.252.207.219", "2601:646:300:3ae0::b977" ],
                      "interfaceName" : "wlp4s0"
                    }, {
                      "ipAddresses" : [ "73.252.207.219", "2601:646:300:3ae0::b977" ],
                      "interfaceName" : "wlp4s0"
                    } ],
                    "agentState" : "online",
                    "targetForTests" : "1.1.1.1",
                    "ipAddresses" : [ "99.139.65.220", "9bbd:8a0a:a257:5876:288b:6cb2:3f36:64ce" ],
                    "location" : "San Francisco Bay Area",
                    "accountGroups" : [ {
                      "accountGroupName" : "Account A",
                      "aid" : "1234"
                    }, {
                      "accountGroupName" : "Account A",
                      "aid" : "1234"
                    } ],
                    "verifySslCertificates" : true,
                    "errorDetails" : [ {
                      "code" : "agent-version-outdated",
                      "description" : "Agent Version 0.1.1 (latest: 1.0.0)"
                    }, {
                      "code" : "agent-version-outdated",
                      "description" : "Agent Version 0.1.1 (latest: 1.0.0)"
                    } ]
                  } ]
                }
                                  """;
        AccountGroupDetail mappedResponse = 
                mapper.readValue(responseBodyJson, AccountGroupDetail.class);
        assertNotNull(mappedResponse);
    }
    
}
