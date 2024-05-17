/*
 * Agents API
 *  ## Overview Manage all agents available to your account in ThousandEyes, including both Cloud and Enterprise Agents.
 *
 * The version of the OpenAPI document: 7.0.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.agents;

import com.thousandeyes.api.agents.model.AgentDetails;
import com.thousandeyes.api.agents.model.AgentDetailsExpand;
import com.thousandeyes.api.agents.model.AgentListExpand;
import com.thousandeyes.api.agents.model.AgentRequest;
import com.thousandeyes.api.agents.model.CloudEnterpriseAgentType;
import com.thousandeyes.api.agents.model.CloudEnterpriseAgents;
import com.thousandeyes.api.agents.model.Error;
import com.thousandeyes.api.agents.model.UnauthorizedError;
import com.thousandeyes.api.agents.model.ValidationError;
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
 * Request and Response model deserialization tests for CloudAndEnterpriseAgentsApi
 */
public class CloudAndEnterpriseAgentsApiTest {
    // private final CloudAndEnterpriseAgentsApi api = new CloudAndEnterpriseAgentsApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Delete Enterprise Agent
     * <p>
     * Deletes an Enterprise Agent.  Important notes related to agent removal: * If an agent is deleted, the modification date for tests using that agent at the time it was deleted will be changed. * If a deleted agent is the final remaining agent on a test, then the test will be disabled when the agent is removed. * If an agent is removed, it must be re-initialized to use the same machine again in different context. Virtual Appliances can be updated using the Reset State button in the Advanced tab of the agent management interface. Users running packaged versions of Linux will need to remove /var/lib/te-agent/\\*.sqlite in order to reinitialize an agent.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Disabled
    @Test
    public void deleteEnterpriseAgentRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

    }
    
    /**
     * Retrieve Cloud and Enterprise Agent
     * <p>
     * Returns details for an agent, including assigned tests.  For Enterprise Agents, this endpoint returns additional details, including utilization data, assigned accounts, a list of account groups the agent is assigned to, and utilization details. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getAgentDetailsRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "agentType" : "cloud",
                  "tests" : [ {
                    "_links" : {
                      "testResults" : [ {
                        "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/network"
                      }, {
                        "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/path-vis"
                      } ],
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
                    "liveShare" : false,
                    "savedEvent" : true,
                    "description" : "ThousandEyes Test",
                    "type" : "agent-to-server",
                    "enabled" : true,
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "createdBy" : "user@user.com",
                    "modifiedDate" : "2022-07-17T22:00:54Z",
                    "interval" : 120,
                    "modifiedBy" : "user@user.com",
                    "testId" : "281474976710706",
                    "alertsEnabled" : true,
                    "testName" : "ThousandEyes Test"
                  }, {
                    "_links" : {
                      "testResults" : [ {
                        "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/network"
                      }, {
                        "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/path-vis"
                      } ],
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
                    "liveShare" : false,
                    "savedEvent" : true,
                    "description" : "ThousandEyes Test",
                    "type" : "agent-to-server",
                    "enabled" : true,
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "createdBy" : "user@user.com",
                    "modifiedDate" : "2022-07-17T22:00:54Z",
                    "interval" : 120,
                    "modifiedBy" : "user@user.com",
                    "testId" : "281474976710706",
                    "alertsEnabled" : true,
                    "testName" : "ThousandEyes Test"
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
                  "labels" : [ {
                    "labelId" : "11",
                    "name" : "Label name"
                  }, {
                    "labelId" : "11",
                    "name" : "Label name"
                  } ]
                }
                                  """;
        AgentDetails mappedResponse = 
                mapper.readValue(responseBodyJson, AgentDetails.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * List Cloud and Enterprise Agents
     * <p>
     * Returns a list of all agents available to your ThousandEyes account, including both Enterprise and Cloud Agents.  If an agent is an Enterprise Agent, this endpoint returns the agent’s public and private IP addresses, as well as the public network where the agent is located. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getAgentsRequestAndResponseDeserializationTest()
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
                  "agents" : [ {
                    "agentType" : "enterprise-cluster"
                  }, {
                    "agentType" : "enterprise-cluster"
                  } ]
                }
                                  """;
        CloudEnterpriseAgents mappedResponse = 
                mapper.readValue(responseBodyJson, CloudEnterpriseAgents.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Update Enterprise Agent
     * <p>
     * Updates details for an Enterprise Agent. This endpoint can only be used for Enterprise Agents, and only for users in a role that permits modification of Enterprise Agents.  Important notes related to agent modification on tests: * if an agent is removed from a test, the modification date for tests using that agent at the time it was removed will be changed. * If an agent is removed from an entire account group, then all tests using this agent in the removed account group will be updated to reflect the removed agent. * If a removed agent is the final remaining agent on a test, then the test will be disabled when the agent is removed.  Users can update the following fields: * &#x60;agentName&#x60;: String representation of an agent. No two agents can have the same display name. * &#x60;enabled&#x60;: Boolean representation of agent state. * &#x60;accountGroups&#x60;: An array of account group ids. See &#x60;v7/account-groups&#x60; to pull a list of account IDs. * &#x60;tests&#x60;: An array of test Is. See &#x60;v7/tests&#x60; to retrieve a list tests available in the current account context. * &#x60;ipv6Policy&#x60;: Enum representation of the IP version policy. * &#x60;keepBrowserCache&#x60;: Boolean representation of the Keep browser cache state. * &#x60;targetForTests&#x60;: String representation of the target IP address or domain name. This represents the test destination when agent is acting as a test target in an agent-to-agent test. * &#x60;localResolutionPrefixes&#x60;: This array of strings represents the public IP ranges where the Enterprise Agent performs rDNS (Reverse DNS) lookups. The range should be in CIDR notation, such as &#x60;10.1.1.0/24&#x60;. Please note that a maximum of 5 prefixes is allowed. This only applies to Enterprise Agents and Enterprise Agent clusters.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void updateEnterpriseAgentDetailsRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "localResolutionPrefixes" : [ "10.2.3.3/24", "10.2.3.3/25" ],
                  "tests" : [ "12313145", "12345" ],
                  "ipv6Policy" : "force-ipv4",
                  "keepBrowserCache" : true,
                  "targetForTests" : "1.1.1.1",
                  "agentName" : "thousandeyes-stg-va-254",
                  "enabled" : true,
                  "accountGroups" : [ "1234", "1" ]
                }
                                 """;
        AgentRequest mappedRequest = 
                mapper.readValue(requestBodyJson, AgentRequest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "agentType" : "cloud",
                  "tests" : [ {
                    "_links" : {
                      "testResults" : [ {
                        "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/network"
                      }, {
                        "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/path-vis"
                      } ],
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
                    "liveShare" : false,
                    "savedEvent" : true,
                    "description" : "ThousandEyes Test",
                    "type" : "agent-to-server",
                    "enabled" : true,
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "createdBy" : "user@user.com",
                    "modifiedDate" : "2022-07-17T22:00:54Z",
                    "interval" : 120,
                    "modifiedBy" : "user@user.com",
                    "testId" : "281474976710706",
                    "alertsEnabled" : true,
                    "testName" : "ThousandEyes Test"
                  }, {
                    "_links" : {
                      "testResults" : [ {
                        "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/network"
                      }, {
                        "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/path-vis"
                      } ],
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
                    "liveShare" : false,
                    "savedEvent" : true,
                    "description" : "ThousandEyes Test",
                    "type" : "agent-to-server",
                    "enabled" : true,
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "createdBy" : "user@user.com",
                    "modifiedDate" : "2022-07-17T22:00:54Z",
                    "interval" : 120,
                    "modifiedBy" : "user@user.com",
                    "testId" : "281474976710706",
                    "alertsEnabled" : true,
                    "testName" : "ThousandEyes Test"
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
                  "labels" : [ {
                    "labelId" : "11",
                    "name" : "Label name"
                  }, {
                    "labelId" : "11",
                    "name" : "Label name"
                  } ]
                }
                                  """;
        AgentDetails mappedResponse = 
                mapper.readValue(responseBodyJson, AgentDetails.class);
        assertNotNull(mappedResponse);
    }
    
}
