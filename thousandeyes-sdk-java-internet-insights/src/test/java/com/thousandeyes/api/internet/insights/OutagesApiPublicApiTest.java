/*
 * Internet Insights API
 * We are happy to announce the release of the Internet Insights API set. This limited release includes endpoints that:  * Make our catalog provider and Internet outage data accessible to API users. * Provide access to advanced filtering, which is part of our next-generation API efforts to allow API users to fine-tune queries across all of our APIs in a consistent manner.  Internet Insights provide visibility into core Internet infrastructure, including ISPs, DNS providers, IaaS, CDNs , and SaaS providers. It tracks the macro-level impact of Internet events on individual users and enterprise networks connecting at the edge of the Internet. These events include Outages, Routing hijacks and leaks, DDoS attacks, And political interference, among others.  Future releases of the Internet Insights API set will further unlock access to core Internet Insights functionality, unlocking potential integrations to enrich customer process flows. 
 *
 * The version of the OpenAPI document: 7.0.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.internet.insights;

import com.thousandeyes.api.internet.insights.model.ApiApplicationOutageDetails;
import com.thousandeyes.api.internet.insights.model.ApiNetworkOutageDetails;
import com.thousandeyes.api.internet.insights.model.ApiOutageFilter;
import com.thousandeyes.api.internet.insights.model.ApiOutagesResponse;
import com.thousandeyes.api.internet.insights.model.Error;
import com.thousandeyes.api.internet.insights.model.UnauthorizedError;
import com.thousandeyes.api.internet.insights.model.ValidationError;
import static com.thousandeyes.api.serialization.JSON.getDefault;
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
 * Request and Response model deserialization tests for OutagesApiPublicApi
 */
public class OutagesApiPublicApiTest {
    // private final OutagesApiPublicApi api = new OutagesApiPublicApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Retrieve application outage
     * <p>
     * Returns the details of an application outage. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getOutagesAppRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "affectedDomains" : [ "amazon.com", "amazon.com" ],
                  "affectedTests" : [ {
                    "name" : "amazon-test2",
                    "id" : 5
                  }, {
                    "name" : "amazon-test2",
                    "id" : 5
                  } ],
                  "endDate" : "2023-01-27T20:53:51.256Z",
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
                  "endRoundId" : 1674852600,
                  "providerType" : "SAAS",
                  "duration" : 180,
                  "startRoundId" : 1674852600,
                  "affectedAgents" : [ {
                    "name" : "London, England",
                    "id" : 11
                  }, {
                    "name" : "London, England",
                    "id" : 11
                  } ],
                  "id" : "0CC4C4209887126DE42E92252FB43962CBB3193147F318EA",
                  "providerName" : "Amazon Web Services",
                  "applicationName" : "Amazon Web Services",
                  "startDate" : "2023-01-27T20:50:51.256Z",
                  "errors" : [ "HTTP_SERVER_TIMEOUT", "HTTP_SERVER_TIMEOUT" ],
                  "affectedLocations" : [ {
                    "location" : "Chicago, Illinois, US",
                    "affectedServers" : [ {
                      "prefix" : "123.176.185.0/23",
                      "domain" : "amazon.com"
                    }, {
                      "prefix" : "123.176.185.0/23",
                      "domain" : "amazon.com"
                    } ]
                  }, {
                    "location" : "Chicago, Illinois, US",
                    "affectedServers" : [ {
                      "prefix" : "123.176.185.0/23",
                      "domain" : "amazon.com"
                    }, {
                      "prefix" : "123.176.185.0/23",
                      "domain" : "amazon.com"
                    } ]
                  } ]
                }
                                  """;
        ApiApplicationOutageDetails mappedResponse = 
                mapper.readValue(responseBodyJson, ApiApplicationOutageDetails.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * List network and application outages
     * <p>
     * Returns a list of network and application outages using a filter object. Advanced Filter persistance is not currently supported.  &lt;b&gt;Note:&lt;/b&gt; Support for pagination will be added in the future.   ## Samples Queries with Different Filter Permutations   ### Window  &#x60;&#x60;&#x60;  curl --location --request POST &#39;https://api.thousandeyes.com/v7/internet-insights/outages/filter&#39; --header &#39;Authorization: Bearer $token --header &#39;Accept-Encoding: application/gzip&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;window\&quot; : \&quot;1d\&quot;   }&#39; &#x60;&#x60;&#x60;  ### Date Range &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/internet-insights/outages/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{     \&quot;startDate\&quot;: \&quot;2022-03-01T01:30:00Z\&quot;,     \&quot;endDate\&quot;  : \&quot;2022-03-01T23:30:15Z\&quot;   }&#39; &#x60;&#x60;&#x60;  ### Date Range with Scope &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/internet-insights/outages/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{     \&quot;startDate\&quot;: \&quot;2022-03-01T01:30:00Z\&quot;,     \&quot;endDate\&quot;  : \&quot;2022-03-01T23:30:15Z\&quot;,     \&quot;outageScope\&quot;: \&quot;with-affected-test\&quot;   }&#39; &#x60;&#x60;&#x60; ### Date Range with Network &#x60;&#x60;&#x60;   curl --location --request POST &#39;https://api.thousandeyes.com/v7/internet-insights/outages/filter&#39;   --header &#39;Authorization: Bearer $token&#39;   --header &#39;Content-Type: application/json&#39;   --data-raw &#39;{       \&quot;startDate\&quot;: \&quot;2022-03-01T01:30:00Z\&quot;,       \&quot;endDate\&quot;  : \&quot;2022-03-01T23:30:15Z\&quot;,       \&quot;interfaceNetwork\&quot;:  [\&quot;Telianet\&quot;]     }&#39; &#x60;&#x60;&#x60;  ### Date Range with Application &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/internet-insights/outages/filter&#39;   --header &#39;Authorization: Bearer $token&#39;   --header &#39;Content-Type: application/json&#39;   --data-raw &#39;{       \&quot;startDate\&quot;: \&quot;2022-03-01T01:30:00Z\&quot;,       \&quot;endDate\&quot;  : \&quot;2022-03-01T23:30:15Z\&quot;,       \&quot;applicationName\&quot;: [\&quot;Google\&quot;]   }&#39; &#x60;&#x60;&#x60; ### Date Range with Provider &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/internet-insights/outages/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{       \&quot;startDate\&quot;: \&quot;2022-03-01T01:30:00Z\&quot;,       \&quot;endDate\&quot;  : \&quot;2022-03-01T23:30:15Z\&quot;,       \&quot;providerName\&quot;: [\&quot;Century Link\&quot;, \&quot;Microsoft\&quot;]   }&#39;  &#x60;&#x60;&#x60; ### Date Range with Application and Scope &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/internet-insights/outages/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{     \&quot;startDate\&quot;: \&quot;2022-03-01T01:30:00Z\&quot;,     \&quot;endDate\&quot;  : \&quot;2022-03-01T23:30:15Z\&quot;,     \&quot;outageScope\&quot;: \&quot;all\&quot;,     \&quot;applicationName\&quot;: [\&quot;Google\&quot;] }&#39; &#x60;&#x60;&#x60; 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getOutagesFilterRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "startDate" : "2022-03-01T01:30:00Z",
                  "endDate" : "2022-03-01T23:30:15Z",
                  "outageScope" : "all",
                  "providerName" : [ "Telia", "Amazon" ],
                  "interfaceNetwork" : [ "Telianet", "Cloudflare" ],
                  "applicationName" : [ "slack", "facebook" ]
                }
                                 """;
        ApiOutageFilter mappedRequest = 
                mapper.readValue(requestBodyJson, ApiOutageFilter.class);
        assertNotNull(mappedRequest);

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
                  "outages" : [ {
                    "affectedInterfacesCount" : 1,
                    "endDate" : "2022-03-01T23:31:11Z",
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
                    "affectedLocationsCount" : 1,
                    "endRoundId" : 1646177700,
                    "affectedTestsCount" : 1,
                    "type" : "app",
                    "providerType" : "SAAS",
                    "duration" : 214,
                    "startRoundId" : 1646177400,
                    "name" : "Google",
                    "id" : "xxxxxxxxxxxxxxxxxx1",
                    "affectedServersCount" : 2,
                    "asn" : 19994,
                    "providerName" : "Google",
                    "startDate" : "2022-03-01T23:31:11Z"
                  }, {
                    "affectedInterfacesCount" : 1,
                    "endDate" : "2022-03-01T23:31:11Z",
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
                    "affectedLocationsCount" : 1,
                    "endRoundId" : 1646177700,
                    "affectedTestsCount" : 1,
                    "type" : "app",
                    "providerType" : "SAAS",
                    "duration" : 214,
                    "startRoundId" : 1646177400,
                    "name" : "Google",
                    "id" : "xxxxxxxxxxxxxxxxxx1",
                    "affectedServersCount" : 2,
                    "asn" : 19994,
                    "providerName" : "Google",
                    "startDate" : "2022-03-01T23:31:11Z"
                  } ]
                }
                                  """;
        ApiOutagesResponse mappedResponse = 
                mapper.readValue(responseBodyJson, ApiOutagesResponse.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Retrieve network outage
     * <p>
     * Returns the details of a network outage. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getOutagesNetRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "affectedDomains" : [ "periodic-failure.com", "periodic-failure.com" ],
                  "affectedTests" : [ {
                    "name" : "amazon-test2",
                    "id" : 5
                  }, {
                    "name" : "amazon-test2",
                    "id" : 5
                  } ],
                  "endDate" : "2023-01-27T20:53:51.256Z",
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
                  "networkName" : "Rackspace Hosting",
                  "endRoundId" : 1674852600,
                  "providerType" : "IAAS",
                  "duration" : 180,
                  "startRoundId" : 1674852600,
                  "affectedAgents" : [ {
                    "name" : "London, England",
                    "id" : 11
                  }, {
                    "name" : "London, England",
                    "id" : 11
                  } ],
                  "id" : "8EF2760862C705783A2F8BCBAAABB44F28DBC670DBA3B610",
                  "asn" : 19994,
                  "providerName" : "Rackspace",
                  "startDate" : "2023-01-27T20:50:51.256Z",
                  "affectedLocations" : [ {
                    "affectedInterfaces" : [ "50.51.52.53", "50.51.52.53" ],
                    "location" : "Chicago, Illinois, US"
                  }, {
                    "affectedInterfaces" : [ "50.51.52.53", "50.51.52.53" ],
                    "location" : "Chicago, Illinois, US"
                  } ]
                }
                                  """;
        ApiNetworkOutageDetails mappedResponse = 
                mapper.readValue(responseBodyJson, ApiNetworkOutageDetails.class);
        assertNotNull(mappedResponse);
    }
    
}
