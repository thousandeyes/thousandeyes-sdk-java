/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests.results;

import com.thousandeyes.sdk.tests.results.model.ApiDetailTestResults;
import com.thousandeyes.sdk.tests.results.model.ApiTestResults;
import com.thousandeyes.sdk.tests.results.model.Error;
import java.time.OffsetDateTime;
import com.thousandeyes.sdk.tests.results.model.UnauthorizedError;
import com.thousandeyes.sdk.tests.results.model.ValidationError;
import com.thousandeyes.sdk.tests.results.model.ApiTestResult;
import com.thousandeyes.sdk.pagination.Paginator;
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
 * Request and Response model deserialization tests for ApiTestResultsApi
 */
@WireMockTest
public class ApiTestResultsApiTest {
    private static final String TOKEN = "valid-token";
    private static final String BEARER_TOKEN = "Bearer %s".formatted(TOKEN);
    private static ApiTestResultsApi api;
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);

    @BeforeAll
    public static void setup(WireMockRuntimeInfo wireMockRuntimeInfo) {
        ApiClient client = NativeApiClient.builder()
                                .baseUri(wireMockRuntimeInfo.getHttpBaseUrl())
                                .bearerToken(TOKEN)
                                .build();
        api = new ApiTestResultsApi(client);
    }
    
    /**
     * Get API test results by agent and round
     * <p>
     * Returns test results for API for a given agent and round. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Test
    public void getTestApiAgentRoundResultsRequestAndResponseDeserializationTest()
            throws JsonProcessingException, ApiException
    {
        String testId = "202701";
        String agentId = "11";
        String roundId = "1384309800";


        var responseBodyJson = """
                {
                  "test" : {
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
                    "interval" : 60,
                    "modifiedBy" : "user@user.com",
                    "testId" : "281474976710706",
                    "alertsEnabled" : true,
                    "testName" : "ThousandEyes Test"
                  },
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
                  "results" : [ {
                    "date" : "2022-07-17T22:00:54Z",
                    "completion" : 100.0,
                    "agent" : {
                      "agentId" : "281474976710706",
                      "agentName" : "thousandeyes-stg-va-254",
                      "location" : "San Francisco Bay Area",
                      "countryId" : "US"
                    },
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
                      }
                    },
                    "errorType" : "None",
                    "apiTransactionTime" : 990.1,
                    "startTime" : 1384309800,
                    "endTime" : 1384309800,
                    "requests" : [ {
                      "completion" : 100.0,
                      "responseTime" : 440.8,
                      "apiCallTime" : 900.9,
                      "processingTime" : 59.9,
                      "url" : "https://api.thousandeyes.com/v7/status",
                      "sendTime" : 8.1,
                      "receiveTime" : 224.1,
                      "connectTime" : 12.1,
                      "dnsTime" : 11.1,
                      "name" : "First Step to Acquire Token",
                      "stepNumber" : 1,
                      "assertions" : [ {
                        "hasFailed" : false,
                        "step" : 1
                      }, {
                        "hasFailed" : false,
                        "step" : 1
                      } ],
                      "assertErrorCount" : 0,
                      "blockedTime" : 49.9,
                      "stepTime" : 990.1,
                      "waitTime" : 18.1
                    }, {
                      "completion" : 100.0,
                      "responseTime" : 440.8,
                      "apiCallTime" : 900.9,
                      "processingTime" : 59.9,
                      "url" : "https://api.thousandeyes.com/v7/status",
                      "sendTime" : 8.1,
                      "receiveTime" : 224.1,
                      "connectTime" : 12.1,
                      "dnsTime" : 11.1,
                      "name" : "First Step to Acquire Token",
                      "stepNumber" : 1,
                      "assertions" : [ {
                        "hasFailed" : false,
                        "step" : 1
                      }, {
                        "hasFailed" : false,
                        "step" : 1
                      } ],
                      "assertErrorCount" : 0,
                      "blockedTime" : 49.9,
                      "stepTime" : 990.1,
                      "waitTime" : 18.1
                    } ],
                    "roundId" : 1384309800,
                    "errorDetails" : "Connection error"
                  }, {
                    "date" : "2022-07-17T22:00:54Z",
                    "completion" : 100.0,
                    "agent" : {
                      "agentId" : "281474976710706",
                      "agentName" : "thousandeyes-stg-va-254",
                      "location" : "San Francisco Bay Area",
                      "countryId" : "US"
                    },
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
                      }
                    },
                    "errorType" : "None",
                    "apiTransactionTime" : 990.1,
                    "startTime" : 1384309800,
                    "endTime" : 1384309800,
                    "requests" : [ {
                      "completion" : 100.0,
                      "responseTime" : 440.8,
                      "apiCallTime" : 900.9,
                      "processingTime" : 59.9,
                      "url" : "https://api.thousandeyes.com/v7/status",
                      "sendTime" : 8.1,
                      "receiveTime" : 224.1,
                      "connectTime" : 12.1,
                      "dnsTime" : 11.1,
                      "name" : "First Step to Acquire Token",
                      "stepNumber" : 1,
                      "assertions" : [ {
                        "hasFailed" : false,
                        "step" : 1
                      }, {
                        "hasFailed" : false,
                        "step" : 1
                      } ],
                      "assertErrorCount" : 0,
                      "blockedTime" : 49.9,
                      "stepTime" : 990.1,
                      "waitTime" : 18.1
                    }, {
                      "completion" : 100.0,
                      "responseTime" : 440.8,
                      "apiCallTime" : 900.9,
                      "processingTime" : 59.9,
                      "url" : "https://api.thousandeyes.com/v7/status",
                      "sendTime" : 8.1,
                      "receiveTime" : 224.1,
                      "connectTime" : 12.1,
                      "dnsTime" : 11.1,
                      "name" : "First Step to Acquire Token",
                      "stepNumber" : 1,
                      "assertions" : [ {
                        "hasFailed" : false,
                        "step" : 1
                      }, {
                        "hasFailed" : false,
                        "step" : 1
                      } ],
                      "assertErrorCount" : 0,
                      "blockedTime" : 49.9,
                      "stepTime" : 990.1,
                      "waitTime" : 18.1
                    } ],
                    "roundId" : 1384309800,
                    "errorDetails" : "Connection error"
                  } ]
                }
                                  """;
        var statusCode = 200;
        var responseContentType = "application/json";
        ApiDetailTestResults mappedResponse = 
                mapper.readValue(responseBodyJson, ApiDetailTestResults.class);
        assertNotNull(mappedResponse);

        var path = "/test-results/{testId}/api/agent/{agentId}/round/{roundId}";
        stubFor(get(urlPathTemplate(path))
                        .withPathParam("testId", equalTo(URLEncoder.encode(testId, StandardCharsets.UTF_8)))
                        .withPathParam("agentId", equalTo(URLEncoder.encode(agentId, StandardCharsets.UTF_8)))
                        .withPathParam("roundId", equalTo(URLEncoder.encode(roundId, StandardCharsets.UTF_8)))
                        .withHeader(AUTHORIZATION, equalTo(BEARER_TOKEN))
                        .willReturn(aResponse()
                                            .withHeader(CONTENT_TYPE, responseContentType)
                                            .withBody(responseBodyJson)
                                            .withStatus(statusCode)));

        var apiResponse = api.getTestApiAgentRoundResults(testId, agentId, roundId, null);
        assertEquals(mappedResponse, apiResponse);
    }
    
    /**
     * Get API test results
     * <p>
     * Returns test results for API. If you do not specify a window or a start and end date, data is displayed for the most recent testing round. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Test
    public void getTestApiResultsRequestAndResponseDeserializationTest()
            throws JsonProcessingException, ApiException
    {
        String testId = "202701";


        var responseBodyJson = """
                {
                  "test" : {
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
                    "interval" : 60,
                    "modifiedBy" : "user@user.com",
                    "testId" : "281474976710706",
                    "alertsEnabled" : true,
                    "testName" : "ThousandEyes Test"
                  },
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
                  "results" : [ {
                    "date" : "2022-07-17T22:00:54Z",
                    "completion" : 100.0,
                    "agent" : {
                      "agentId" : "281474976710706",
                      "agentName" : "thousandeyes-stg-va-254",
                      "location" : "San Francisco Bay Area",
                      "countryId" : "US"
                    },
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
                      }
                    },
                    "errorType" : "None",
                    "apiTransactionTime" : 990.1,
                    "startTime" : 1384309800,
                    "endTime" : 1384309800,
                    "roundId" : 1384309800,
                    "errorDetails" : "Connection error"
                  }, {
                    "date" : "2022-07-17T22:00:54Z",
                    "completion" : 100.0,
                    "agent" : {
                      "agentId" : "281474976710706",
                      "agentName" : "thousandeyes-stg-va-254",
                      "location" : "San Francisco Bay Area",
                      "countryId" : "US"
                    },
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
                      }
                    },
                    "errorType" : "None",
                    "apiTransactionTime" : 990.1,
                    "startTime" : 1384309800,
                    "endTime" : 1384309800,
                    "roundId" : 1384309800,
                    "errorDetails" : "Connection error"
                  } ],
                  "startDate" : "2022-07-17T22:00:54Z"
                }
                                  """;
        var statusCode = 200;
        var responseContentType = "application/json";
        ApiTestResults mappedResponse = 
                mapper.readValue(responseBodyJson, ApiTestResults.class);
        assertNotNull(mappedResponse);

        var path = "/test-results/{testId}/api";
        stubFor(get(urlPathTemplate(path))
                        .withPathParam("testId", equalTo(URLEncoder.encode(testId, StandardCharsets.UTF_8)))
                        .withHeader(AUTHORIZATION, equalTo(BEARER_TOKEN))
                        .willReturn(aResponse()
                                            .withHeader(CONTENT_TYPE, responseContentType)
                                            .withBody(responseBodyJson)
                                            .withStatus(statusCode)));

        var apiResponse = api.getTestApiResults(testId, null, null, null, null, null);
        assertEquals(mappedResponse, apiResponse);
    }
    
}
