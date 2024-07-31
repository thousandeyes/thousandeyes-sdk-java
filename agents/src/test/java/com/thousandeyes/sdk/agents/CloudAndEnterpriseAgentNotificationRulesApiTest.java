/*
 * Agents API
 *  ## Overview Manage all agents available to your account in ThousandEyes, including both Cloud and Enterprise Agents.
 *
 * The version of the OpenAPI document: 7.0.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.agents;

import com.thousandeyes.sdk.agents.model.Error;
import com.thousandeyes.sdk.agents.model.ListNotificationRulesResponse;
import com.thousandeyes.sdk.agents.model.NotificationRuleDetail;
import com.thousandeyes.sdk.agents.model.UnauthorizedError;
import static com.thousandeyes.sdk.serialization.JSON.getDefault;
import static org.junit.jupiter.api.Assertions.assertNotNull;


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
 * Request and Response model deserialization tests for CloudAndEnterpriseAgentNotificationRulesApi
 */
public class CloudAndEnterpriseAgentNotificationRulesApiTest {
    // private final CloudAndEnterpriseAgentNotificationRulesApi api = new CloudAndEnterpriseAgentNotificationRulesApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Retrieve agent notification rule
     * <p>
     * Returns details of an agent notification rule, including agents it is assigned to. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getAgentsNotificationRuleRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "isDefault" : false,
                  "expression" : "((lastContact >= 30 min))",
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
                  "ruleName" : "Default Agent Offline Notification",
                  "ruleId" : "281474976710706",
                  "notifications" : {
                    "thirdParty" : [ {
                      "integrationType" : "slack",
                      "integrationName" : "integrationSlack1",
                      "authToken" : "0VqDYEpidpHVAK397x8PBsmZ",
                      "channel" : "#slackChannel",
                      "integrationId" : "wb-78",
                      "authMethod" : "Basic",
                      "authUser" : "user123",
                      "target" : "https://hooks.slack.com/services/asd/0VqDYEpidpHVAK397x8PBsmZ"
                    }, {
                      "integrationType" : "slack",
                      "integrationName" : "integrationSlack1",
                      "authToken" : "0VqDYEpidpHVAK397x8PBsmZ",
                      "channel" : "#slackChannel",
                      "integrationId" : "wb-78",
                      "authMethod" : "Basic",
                      "authUser" : "user123",
                      "target" : "https://hooks.slack.com/services/asd/0VqDYEpidpHVAK397x8PBsmZ"
                    } ],
                    "webhook" : [ {
                      "integrationType" : "slack",
                      "integrationName" : "integrationSlack1",
                      "authToken" : "0VqDYEpidpHVAK397x8PBsmZ",
                      "channel" : "#slackChannel",
                      "integrationId" : "wb-78",
                      "authMethod" : "Basic",
                      "authUser" : "user123",
                      "target" : "https://hooks.slack.com/services/asd/0VqDYEpidpHVAK397x8PBsmZ"
                    }, {
                      "integrationType" : "slack",
                      "integrationName" : "integrationSlack1",
                      "authToken" : "0VqDYEpidpHVAK397x8PBsmZ",
                      "channel" : "#slackChannel",
                      "integrationId" : "wb-78",
                      "authMethod" : "Basic",
                      "authUser" : "user123",
                      "target" : "https://hooks.slack.com/services/asd/0VqDYEpidpHVAK397x8PBsmZ"
                    } ],
                    "email" : {
                      "recipients" : [ "user1@thousandeyes.com", "user2@cisco.com" ],
                      "message" : "This test is failing, check as soon as possible."
                    }
                  },
                  "notifyOnClear" : true,
                  "agents" : [ {
                    "agentId" : "281474976710706",
                    "agentType" : "enterprise-cluster",
                    "publicIpAddresses" : [ "192.168.1.78", "f9b2:3a21:f25c:d300:03f4:586d:f8d6:4e1c" ],
                    "prefix" : "99.128.0.0/11",
                    "agentName" : "thousandeyes-stg-va-254",
                    "ipAddresses" : [ "99.139.65.220", "9bbd:8a0a:a257:5876:288b:6cb2:3f36:64ce" ],
                    "location" : "San Francisco Bay Area",
                    "countryId" : "US",
                    "enabled" : true,
                    "network" : "AT&T Services, Inc. (AS 7018)",
                    "verifySslCertificates" : true
                  }, {
                    "agentId" : "281474976710706",
                    "agentType" : "enterprise-cluster",
                    "publicIpAddresses" : [ "192.168.1.78", "f9b2:3a21:f25c:d300:03f4:586d:f8d6:4e1c" ],
                    "prefix" : "99.128.0.0/11",
                    "agentName" : "thousandeyes-stg-va-254",
                    "ipAddresses" : [ "99.139.65.220", "9bbd:8a0a:a257:5876:288b:6cb2:3f36:64ce" ],
                    "location" : "San Francisco Bay Area",
                    "countryId" : "US",
                    "enabled" : true,
                    "network" : "AT&T Services, Inc. (AS 7018)",
                    "verifySslCertificates" : true
                  } ]
                }
                                  """;
        NotificationRuleDetail mappedResponse = 
                mapper.readValue(responseBodyJson, NotificationRuleDetail.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * List agent notification rules
     * <p>
     * Returns a list of all agent notification rules configured under the account.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getAgentsNotificationRulesRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "agentAlertRules" : [ {
                    "ruleId" : "281474976710706",
                    "ruleName" : "Default Agent Offline Notification",
                    "expression" : "((lastContact >= 30 min))",
                    "notifyOnClear" : true,
                    "isDefault" : false
                  }, {
                    "ruleId" : "281474976710709",
                    "ruleName" : "Test Rule",
                    "expression" : "((lastContact >= 40 min))",
                    "notifyOnClear" : true,
                    "isDefault" : true
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
                  }
                }
                                  """;
        ListNotificationRulesResponse mappedResponse = 
                mapper.readValue(responseBodyJson, ListNotificationRulesResponse.class);
        assertNotNull(mappedResponse);
    }
    
}
