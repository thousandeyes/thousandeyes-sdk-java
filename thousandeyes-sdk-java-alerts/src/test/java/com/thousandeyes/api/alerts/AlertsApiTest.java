/*
 * Alerts API
 * You can manage the following alert functionalities on the ThousandEyes platform using the Alerts API:  * **Alerts**: Retrieve alert details. Alerts are assigned to tests through alert rules.  * **Alert Rules**: Conditions that you configure in order to highlight or be notified of events of interest in your ThousandEyes tests. When an alert rule’s conditions are met, the associated alert is triggered and the alert becomes active. It remains active until the alert is cleared. Alert rules are reusable across multiple tests..  * **Alert Suppression Windows**: Suppress alerts for tests during periods such as planned maintenance. Windows can be one-time events or recurring events to handle periodic occurrences such as monthly downtime for maintenance.  For more information about the alerts, see [Alerts](https://docs.thousandeyes.com/product-documentation/alerts). 
 *
 * The version of the OpenAPI document: 7.0.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.alerts;

import com.thousandeyes.api.alerts.model.AlertDetail;
import com.thousandeyes.api.alerts.model.Alerts;
import java.math.BigDecimal;
import com.thousandeyes.api.alerts.model.Error;
import java.time.OffsetDateTime;
import com.thousandeyes.api.alerts.model.State;
import java.util.UUID;
import com.thousandeyes.api.alerts.model.UnauthorizedError;
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
 * Request and Response model deserialization tests for AlertsApi
 */
public class AlertsApiTest {
    // private final AlertsApi api = new AlertsApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Retrieve alert details
     * <p>
     * Returns detailed information about an alert using its ID.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getAlertDetailsRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "duration" : 60,
                  "severity" : "major",
                  "alertType" : "http-server",
                  "violationCount" : 2,
                  "endDate" : "2020-04-23T13:43:16Z",
                  "_links" : {
                    "appLink" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    },
                    "test" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    },
                    "rule" : {
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
                  "meta" : {
                    "version" : 1
                  },
                  "details" : [ {
                    "name" : "Bucharest, Romania",
                    "start" : {
                      "metrics" : "metrics"
                    },
                    "end" : {
                      "metrics" : "metrics"
                    },
                    "id" : "3379",
                    "state" : "active",
                    "type" : "cea_agent"
                  }, {
                    "name" : "Bucharest, Romania",
                    "start" : {
                      "metrics" : "metrics"
                    },
                    "end" : {
                      "metrics" : "metrics"
                    },
                    "id" : "3379",
                    "state" : "active",
                    "type" : "cea_agent"
                  } ],
                  "id" : "e9c3bf02-a48c-4aa8-9e5f-898800d6f569",
                  "suppressed" : false,
                  "state" : "active",
                  "startDate" : "2020-04-23T13:43:16Z"
                }
                                  """;
        AlertDetail mappedResponse = 
                mapper.readValue(responseBodyJson, AlertDetail.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * List active alerts
     * <p>
     * Returns a list of active alerts. If no alerts are active within the  specified time range, an empty response is returned.  Note that time filters (&#x60;window&#x60;, &#x60;startDate&#x60;, or &#x60;endDate&#x60;) are only applied to cleared alerts.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getAlertsRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "alerts" : [ {
                    "severity" : "MAJOR",
                    "alertType" : "http-server",
                    "endDate" : "2020-04-23T13:43:16Z",
                    "_links" : {
                      "appLink" : {
                        "hreflang" : "hreflang",
                        "templated" : true,
                        "profile" : "profile",
                        "name" : "name",
                        "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                        "type" : "type",
                        "deprecation" : "deprecation",
                        "title" : "title"
                      },
                      "test" : {
                        "hreflang" : "hreflang",
                        "templated" : true,
                        "profile" : "profile",
                        "name" : "name",
                        "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                        "type" : "type",
                        "deprecation" : "deprecation",
                        "title" : "title"
                      },
                      "rule" : {
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
                    "apiLinks" : [ {
                      "key" : ""
                    }, {
                      "key" : ""
                    } ],
                    "alertSeverity" : "major",
                    "dateEnd" : "2020-04-23 13:43:16",
                    "duration" : 60,
                    "violationCount" : 2,
                    "dateStart" : "2020-04-23 13:43:16",
                    "meta" : {
                      "version" : 1
                    },
                    "id" : "e9c3bf02-a48c-4aa8-9e5f-898800d6f569",
                    "suppressed" : false,
                    "alertId" : "e9c3bf02-a48c-4aa8-9e5f-898800d6f569",
                    "state" : "ACTIVE",
                    "ruleId" : 127094,
                    "permalink" : "https://app.thousandeyes.com/alerts/list?__a=75&alertId=2783&agentId=12",
                    "alertState" : "active",
                    "startDate" : "2020-04-23T13:43:16Z",
                    "alertRuleId" : "127094"
                  }, {
                    "severity" : "MAJOR",
                    "alertType" : "http-server",
                    "endDate" : "2020-04-23T13:43:16Z",
                    "_links" : {
                      "appLink" : {
                        "hreflang" : "hreflang",
                        "templated" : true,
                        "profile" : "profile",
                        "name" : "name",
                        "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                        "type" : "type",
                        "deprecation" : "deprecation",
                        "title" : "title"
                      },
                      "test" : {
                        "hreflang" : "hreflang",
                        "templated" : true,
                        "profile" : "profile",
                        "name" : "name",
                        "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                        "type" : "type",
                        "deprecation" : "deprecation",
                        "title" : "title"
                      },
                      "rule" : {
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
                    "apiLinks" : [ {
                      "key" : ""
                    }, {
                      "key" : ""
                    } ],
                    "alertSeverity" : "major",
                    "dateEnd" : "2020-04-23 13:43:16",
                    "duration" : 60,
                    "violationCount" : 2,
                    "dateStart" : "2020-04-23 13:43:16",
                    "meta" : {
                      "version" : 1
                    },
                    "id" : "e9c3bf02-a48c-4aa8-9e5f-898800d6f569",
                    "suppressed" : false,
                    "alertId" : "e9c3bf02-a48c-4aa8-9e5f-898800d6f569",
                    "state" : "ACTIVE",
                    "ruleId" : 127094,
                    "permalink" : "https://app.thousandeyes.com/alerts/list?__a=75&alertId=2783&agentId=12",
                    "alertState" : "active",
                    "startDate" : "2020-04-23T13:43:16Z",
                    "alertRuleId" : "127094"
                  } ],
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
                  }
                }
                                  """;
        Alerts mappedResponse = 
                mapper.readValue(responseBodyJson, Alerts.class);
        assertNotNull(mappedResponse);
    }
    
}
