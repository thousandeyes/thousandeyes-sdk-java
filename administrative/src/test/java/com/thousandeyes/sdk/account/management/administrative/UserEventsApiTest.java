/*
 * Administrative API
 * Manage users, accounts, and account groups in the ThousandEyes platform using the Administrative API. This API provides the following endpoints that define the operations to manage your organization:     * `/account-groups`: Account groups are used to divide an organization into different sections. These endpoints can be used to create, retrieve, update and delete account groups.   * `/users`: Create, retrieve, update and delete users within an organization.    * `/roles`: Create, retrieve and update roles for the current user.    * `/permissions`: Retrieve all assignable permissions. Used in the context of modifying roles.    * `/audit-user-events`: Retrieve all activity log events.    For more information about the administrative models, see [Account Management](https://docs.thousandeyes.com/product-documentation/user-management).
 *
 * The version of the OpenAPI document: 7.0.11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.account.management.administrative;

import com.thousandeyes.sdk.account.management.administrative.model.AuditUserEvents;
import com.thousandeyes.sdk.account.management.administrative.model.Error;
import java.time.OffsetDateTime;
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
 * Request and Response model deserialization tests for UserEventsApi
 */
public class UserEventsApiTest {
    // private final UserEventsApi api = new UserEventsApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * List activity log events
     * <p>
     * Returns a list of activity log events in the current account group.   If &#x60;useAllPermittedAids&#x3D;true&#x60; query parameter is passed and the user has permission &#x60;View activity log for all users in account group&#x60; the logs returned include events across all the account groups they belong to.  For more information about changing the account group context, see [Account Context](https://developer.thousandeyes.com/v7/#/accountcontext).
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getUserEventsRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "endDate" : "2022-07-18T22:00:54Z",
                  "_links" : {
                    "next" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    },
                    "previous" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    },
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
                  "auditEvents" : [ {
                    "accountGroupName" : "API Sandbox",
                    "aid" : "1234",
                    "date" : "2020-07-17T21:54:54Z",
                    "event" : "Report created.",
                    "ipAddress" : "99.128.0.0/11",
                    "uid" : "1234",
                    "user" : "API Sandbox User (noreply@thousandeyes.com)",
                    "resources" : [ {
                      "name" : "My New report",
                      "type" : "reportTitle"
                    }, {
                      "name" : "Other Report",
                      "type" : "testName"
                    } ]
                  }, {
                    "accountGroupName" : "API Sandbox",
                    "aid" : "1234",
                    "date" : "2020-07-17T22:00:54Z",
                    "event" : "Login failed.",
                    "ipAddress" : "99.128.0.0/11",
                    "uid" : "1234",
                    "user" : "API Sandbox User (noreply@thousandeyes.com)"
                  } ],
                  "startDate" : "2022-07-17T22:00:54Z"
                }
                                  """;
        AuditUserEvents mappedResponse = 
                mapper.readValue(responseBodyJson, AuditUserEvents.class);
        assertNotNull(mappedResponse);
    }
    
}