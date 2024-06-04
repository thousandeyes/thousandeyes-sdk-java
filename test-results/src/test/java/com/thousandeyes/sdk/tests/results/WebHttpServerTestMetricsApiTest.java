/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
 *
 * The version of the OpenAPI document: 7.0.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests.results;

import com.thousandeyes.sdk.tests.results.model.Error;
import com.thousandeyes.sdk.tests.results.model.Expand;
import com.thousandeyes.sdk.tests.results.model.HttpTestResults;
import java.time.OffsetDateTime;
import com.thousandeyes.sdk.tests.results.model.UnauthorizedError;
import com.thousandeyes.sdk.tests.results.model.ValidationError;
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
 * Request and Response model deserialization tests for WebHttpServerTestMetricsApi
 */
public class WebHttpServerTestMetricsApiTest {
    // private final WebHttpServerTestMetricsApi api = new WebHttpServerTestMetricsApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Get HTTP server test results
     * <p>
     * Returns results for requests made over HTTP. Components include DNS, Connect, Wait, Receive, and Fetch. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getTestHttpServerResultsRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
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
                    "interval" : 120,
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
                    "sslVersion" : "TLSv1.3",
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
                    "numRedirects" : 0,
                    "errorType" : "None",
                    "responseCode" : 200,
                    "connectTime" : 2,
                    "startTime" : 1384309800,
                    "throughput" : 123.0,
                    "roundId" : 1384309800,
                    "headers" : {
                      "requestHeaders" : "GET / HTTP/1.1\\r\\nHost: www.thousandeyes.com\\r\\nUser-Agent: curl/7.58.0-DEV\\r\\nAccept: */*\\r\\nAccept-Encoding: deflate, gzip\\r\\nX-ThousandEyes-Agent: yes\\r\\n",
                      "responseHeaders" : "HTTP/1.1 200 OK\\r\\nContent-Type: text/html;charset=UTF-8\\r\\nContent-Length: 9993\\r\\nConnection: keep-alive\\r\\nDate: Mon, 04 May 2020 16:13:00 GMT\\r\\nServer: Apache\\r\\nContent-Language: en-US\\r\\nContent-Encoding: gzip\\r\\nX-Frame-Options: sameorigin\\r\\nCache-Control: max-age=600, must-revalidate\\r\\nStrict-Transport-Security: max-age=31536000\\r\\nX-Content-Type-Options: nosniff\\r\\nX-XSS-Protection: 1; mode=block\\r\\nVary: Accept-Encoding\\r\\nX-Cache: Hit from cloudfront\\r\\nVia: 1.1 7ba3caf71ae7a52dd411d1a543e80cd8.cloudfront.net (CloudFront)\\r\\nX-Amz-Cf-Pop: SFO5-C3\\r\\nX-Amz-Cf-Id: w4h42tkoJD-rEpkRDZUvnQBmy26GVGe6pUsuRr1Dphf7oajYbjXaOA==\\r\\nAge: 132\\r\\n"
                    },
                    "sslCipher" : "sslCipher",
                    "redirectTime" : 10,
                    "sslCertificates" : [ {
                      "hasValidSigningCert" : false,
                      "issuerName" : "DigiCert SHA2 Extended Validation Server CA",
                      "subjectAlternativeNames" : [ "www.thousandeyes.com", "thousandeyes.com" ],
                      "isFetchDateInValidCertDateRange" : true,
                      "validBefore" : "2020-05-12T12:00:00Z",
                      "daysUntilExpiry" : 0,
                      "validAfter" : "2018-03-27T00:00:00Z",
                      "subjectName" : "www.thousandeyes.com"
                    }, {
                      "hasValidSigningCert" : false,
                      "issuerName" : "DigiCert SHA2 Extended Validation Server CA",
                      "subjectAlternativeNames" : [ "www.thousandeyes.com", "thousandeyes.com" ],
                      "isFetchDateInValidCertDateRange" : true,
                      "validBefore" : "2020-05-12T12:00:00Z",
                      "daysUntilExpiry" : 0,
                      "validAfter" : "2018-03-27T00:00:00Z",
                      "subjectName" : "www.thousandeyes.com"
                    } ],
                    "responseTime" : 14,
                    "totalTime" : 15,
                    "receiveTime" : 1,
                    "dnsTime" : 0,
                    "serverIp" : "193.2.1.88",
                    "sslTime" : 9,
                    "endTime" : 1384309800,
                    "waitTime" : 3,
                    "wireSize" : 9993,
                    "errorDetails" : "Connection error"
                  }, {
                    "date" : "2022-07-17T22:00:54Z",
                    "agent" : {
                      "agentId" : "281474976710706",
                      "agentName" : "thousandeyes-stg-va-254",
                      "location" : "San Francisco Bay Area",
                      "countryId" : "US"
                    },
                    "sslVersion" : "TLSv1.3",
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
                    "numRedirects" : 0,
                    "errorType" : "None",
                    "responseCode" : 200,
                    "connectTime" : 2,
                    "startTime" : 1384309800,
                    "throughput" : 123.0,
                    "roundId" : 1384309800,
                    "headers" : {
                      "requestHeaders" : "GET / HTTP/1.1\\r\\nHost: www.thousandeyes.com\\r\\nUser-Agent: curl/7.58.0-DEV\\r\\nAccept: */*\\r\\nAccept-Encoding: deflate, gzip\\r\\nX-ThousandEyes-Agent: yes\\r\\n",
                      "responseHeaders" : "HTTP/1.1 200 OK\\r\\nContent-Type: text/html;charset=UTF-8\\r\\nContent-Length: 9993\\r\\nConnection: keep-alive\\r\\nDate: Mon, 04 May 2020 16:13:00 GMT\\r\\nServer: Apache\\r\\nContent-Language: en-US\\r\\nContent-Encoding: gzip\\r\\nX-Frame-Options: sameorigin\\r\\nCache-Control: max-age=600, must-revalidate\\r\\nStrict-Transport-Security: max-age=31536000\\r\\nX-Content-Type-Options: nosniff\\r\\nX-XSS-Protection: 1; mode=block\\r\\nVary: Accept-Encoding\\r\\nX-Cache: Hit from cloudfront\\r\\nVia: 1.1 7ba3caf71ae7a52dd411d1a543e80cd8.cloudfront.net (CloudFront)\\r\\nX-Amz-Cf-Pop: SFO5-C3\\r\\nX-Amz-Cf-Id: w4h42tkoJD-rEpkRDZUvnQBmy26GVGe6pUsuRr1Dphf7oajYbjXaOA==\\r\\nAge: 132\\r\\n"
                    },
                    "sslCipher" : "sslCipher",
                    "redirectTime" : 10,
                    "sslCertificates" : [ {
                      "hasValidSigningCert" : false,
                      "issuerName" : "DigiCert SHA2 Extended Validation Server CA",
                      "subjectAlternativeNames" : [ "www.thousandeyes.com", "thousandeyes.com" ],
                      "isFetchDateInValidCertDateRange" : true,
                      "validBefore" : "2020-05-12T12:00:00Z",
                      "daysUntilExpiry" : 0,
                      "validAfter" : "2018-03-27T00:00:00Z",
                      "subjectName" : "www.thousandeyes.com"
                    }, {
                      "hasValidSigningCert" : false,
                      "issuerName" : "DigiCert SHA2 Extended Validation Server CA",
                      "subjectAlternativeNames" : [ "www.thousandeyes.com", "thousandeyes.com" ],
                      "isFetchDateInValidCertDateRange" : true,
                      "validBefore" : "2020-05-12T12:00:00Z",
                      "daysUntilExpiry" : 0,
                      "validAfter" : "2018-03-27T00:00:00Z",
                      "subjectName" : "www.thousandeyes.com"
                    } ],
                    "responseTime" : 14,
                    "totalTime" : 15,
                    "receiveTime" : 1,
                    "dnsTime" : 0,
                    "serverIp" : "193.2.1.88",
                    "sslTime" : 9,
                    "endTime" : 1384309800,
                    "waitTime" : 3,
                    "wireSize" : 9993,
                    "errorDetails" : "Connection error"
                  } ],
                  "startDate" : "2022-07-17T22:00:54Z"
                }
                                  """;
        HttpTestResults mappedResponse = 
                mapper.readValue(responseBodyJson, HttpTestResults.class);
        assertNotNull(mappedResponse);
    }
    
}
