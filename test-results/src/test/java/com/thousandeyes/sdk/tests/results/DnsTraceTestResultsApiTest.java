/*
 * Test Results API
 * Get test result metrics for Network and Application Synthetics tests.
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests.results;

import com.thousandeyes.sdk.tests.results.model.DnsTraceTestResults;
import com.thousandeyes.sdk.tests.results.model.Error;
import java.time.OffsetDateTime;
import com.thousandeyes.sdk.tests.results.model.UnauthorizedError;
import com.thousandeyes.sdk.tests.results.model.ValidationError;
import com.thousandeyes.sdk.tests.results.model.DnsTraceTestResult;
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
 * Request and Response model deserialization tests for DnsTraceTestResultsApi
 */
@WireMockTest
public class DnsTraceTestResultsApiTest {
    private static final String TOKEN = "valid-token";
    private static final String BEARER_TOKEN = "Bearer %s".formatted(TOKEN);
    private static DnsTraceTestResultsApi api;
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);

    @BeforeAll
    public static void setup(WireMockRuntimeInfo wireMockRuntimeInfo) {
        ApiClient client = NativeApiClient.builder()
                                .baseUri(wireMockRuntimeInfo.getHttpBaseUrl())
                                .bearerToken(TOKEN)
                                .build();
        api = new DnsTraceTestResultsApi(client);
    }
    
    /**
     * Get DNS trace test results
     * <p>
     * Returns a DNS record from the requesting agent&#39;s point of view. This is similar to dig +trace. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Test
    public void getTestDnsTraceResultsRequestAndResponseDeserializationTest()
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
                    "finalServerQueried" : "a1.verisigndns.com.",
                    "finalQueryTime" : 178,
                    "queries" : 3,
                    "failedQueries" : 0,
                    "output" : "com.\\t172800\\tIN\\tNS\\ta.gtld-servers.net.\\ncom.\\t172800\\tIN\\tNS\\tf.gtld-servers.net.\\ncom.\\t172800\\tIN\\tNS\\tc.gtld-servers.net.\\ncom.\\t172800\\tIN\\tNS\\tb.gtld-servers.net.\\ncom.\\t172800\\tIN\\tNS\\td.gtld-servers.net.\\ncom.\\t172800\\tIN\\tNS\\te.gtld-servers.net.\\ncom.\\t172800\\tIN\\tNS\\tg.gtld-servers.net.\\ncom.\\t172800\\tIN\\tNS\\tm.gtld-servers.net.\\ncom.\\t172800\\tIN\\tNS\\th.gtld-servers.net.\\ncom.\\t172800\\tIN\\tNS\\tj.gtld-servers.net.\\ncom.\\t172800\\tIN\\tNS\\ti.gtld-servers.net.\\ncom.\\t172800\\tIN\\tNS\\tl.gtld-servers.net.\\ncom.\\t172800\\tIN\\tNS\\tk.gtld-servers.net.\\n;; Received 498 bytes from 199.7.91.13(d.root-servers.net.) in 119 ms\\n\\nthousandeyes.com.\\t172800\\tIN\\tNS\\ta1.verisigndns.com.\\nthousandeyes.com.\\t172800\\tIN\\tNS\\ta2.verisigndns.com.\\nthousandeyes.com.\\t172800\\tIN\\tNS\\ta3.verisigndns.com.\\nthousandeyes.com.\\t172800\\tIN\\tNS\\tu1.verisigndns.com.\\n;; Received 266 bytes from 192.5.6.30(a.gtld-servers.net.) in 178 ms\\n\\napp.thousandeyes.com.\\t300\\tIN\\tCNAME\\tweb.thousandeyes.com.\\nweb.thousandeyes.com.\\t300\\tIN\\tCNAME\\tlb-app.thousandeyes.com.\\nlb-app.thousandeyes.com.\\t3600\\tIN\\tA\\t208.185.7.120\\n;; Received 173 bytes from 209.112.113.33(a1.verisigndns.com.) in 178 ms\\n\\n",
                    "mappings" : "208.185.7.120",
                    "startTime" : 1384309800,
                    "endTime" : 1384309800,
                    "roundId" : 1384309800,
                    "errorDetails" : "Connection error"
                  }, {
                    "date" : "2022-07-17T22:00:54Z",
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
                    "finalServerQueried" : "a1.verisigndns.com.",
                    "finalQueryTime" : 178,
                    "queries" : 3,
                    "failedQueries" : 0,
                    "output" : "com.\\t172800\\tIN\\tNS\\ta.gtld-servers.net.\\ncom.\\t172800\\tIN\\tNS\\tf.gtld-servers.net.\\ncom.\\t172800\\tIN\\tNS\\tc.gtld-servers.net.\\ncom.\\t172800\\tIN\\tNS\\tb.gtld-servers.net.\\ncom.\\t172800\\tIN\\tNS\\td.gtld-servers.net.\\ncom.\\t172800\\tIN\\tNS\\te.gtld-servers.net.\\ncom.\\t172800\\tIN\\tNS\\tg.gtld-servers.net.\\ncom.\\t172800\\tIN\\tNS\\tm.gtld-servers.net.\\ncom.\\t172800\\tIN\\tNS\\th.gtld-servers.net.\\ncom.\\t172800\\tIN\\tNS\\tj.gtld-servers.net.\\ncom.\\t172800\\tIN\\tNS\\ti.gtld-servers.net.\\ncom.\\t172800\\tIN\\tNS\\tl.gtld-servers.net.\\ncom.\\t172800\\tIN\\tNS\\tk.gtld-servers.net.\\n;; Received 498 bytes from 199.7.91.13(d.root-servers.net.) in 119 ms\\n\\nthousandeyes.com.\\t172800\\tIN\\tNS\\ta1.verisigndns.com.\\nthousandeyes.com.\\t172800\\tIN\\tNS\\ta2.verisigndns.com.\\nthousandeyes.com.\\t172800\\tIN\\tNS\\ta3.verisigndns.com.\\nthousandeyes.com.\\t172800\\tIN\\tNS\\tu1.verisigndns.com.\\n;; Received 266 bytes from 192.5.6.30(a.gtld-servers.net.) in 178 ms\\n\\napp.thousandeyes.com.\\t300\\tIN\\tCNAME\\tweb.thousandeyes.com.\\nweb.thousandeyes.com.\\t300\\tIN\\tCNAME\\tlb-app.thousandeyes.com.\\nlb-app.thousandeyes.com.\\t3600\\tIN\\tA\\t208.185.7.120\\n;; Received 173 bytes from 209.112.113.33(a1.verisigndns.com.) in 178 ms\\n\\n",
                    "mappings" : "208.185.7.120",
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
        DnsTraceTestResults mappedResponse = 
                mapper.readValue(responseBodyJson, DnsTraceTestResults.class);
        assertNotNull(mappedResponse);

        var path = "/test-results/{testId}/dns-trace";
        stubFor(get(urlPathTemplate(path))
                        .withPathParam("testId", equalTo(URLEncoder.encode(testId, StandardCharsets.UTF_8)))
                        .withHeader(AUTHORIZATION, equalTo(BEARER_TOKEN))
                        .willReturn(aResponse()
                                            .withHeader(CONTENT_TYPE, responseContentType)
                                            .withBody(responseBodyJson)
                                            .withStatus(statusCode)));

        var apiResponse = api.getTestDnsTraceResults(testId, null, null, null, null, null);
        assertEquals(mappedResponse, apiResponse);
    }
    
}
