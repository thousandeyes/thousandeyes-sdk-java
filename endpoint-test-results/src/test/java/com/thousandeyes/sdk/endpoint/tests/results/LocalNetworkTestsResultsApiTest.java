/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.tests.results;

import com.thousandeyes.sdk.endpoint.tests.results.model.EndpointNetworkTopologyResultRequest;
import com.thousandeyes.sdk.endpoint.tests.results.model.Error;
import com.thousandeyes.sdk.endpoint.tests.results.model.LocalNetworkResults;
import com.thousandeyes.sdk.endpoint.tests.results.model.LocalNetworkTopologyDetailResults;
import com.thousandeyes.sdk.endpoint.tests.results.model.LocalNetworkTopologyResults;
import java.time.OffsetDateTime;
import com.thousandeyes.sdk.endpoint.tests.results.model.UnauthorizedError;
import com.thousandeyes.sdk.endpoint.tests.results.model.ValidationError;
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
 * Request and Response model deserialization tests for LocalNetworkTestsResultsApi
 */
public class LocalNetworkTestsResultsApiTest {
    // private final LocalNetworkTestsResultsApi api = new LocalNetworkTestsResultsApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * List endpoint network topologies probes
     * <p>
     * Returns a list of all endpoint local network topologies probes.  Results from the last round are provided unless an explicit start and end is provided with &#x60;startDate&#x60;, &#x60;endDate&#x60; or &#x60;window&#x60; optional parameters.  ## Request body filters This endpoint supports complex filtering using the request body. It is important these filters remain unaltered when making use of pagination, otherwise the results will not be coherent with the original request.  ### Multiple filter fields When multiple filter fields are provided, a logical &#x60;AND&#x60; is applied between the filters.  &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/local-networks/topologies/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;platform\&quot;: [ \&quot;mac\&quot; ],     \&quot;domain\&quot;: [ \&quot;thousandeyes.com\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  ### Filter field with multiple values When a filter field contains multiple values, a logical &#x60;OR&#x60; is applied between the filter values.  &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/local-networks/topologies/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;networkId\&quot;: [ \&quot;660b34109d12\&quot;, \&quot;660b34109d15\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  ### Combination of request parameters and body filters &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/local-networks/topologies/filter?window&#x3D;12h&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;platform\&quot;: [ \&quot;mac\&quot; ],     \&quot;domain\&quot;: [ \&quot;thousandeyes.com\&quot; ],     \&quot;networkId\&quot;: [ \&quot;660b34109d12\&quot;, \&quot;660b34109d15\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  ### Warning Note that a maximum of 12h worth of data can be retrieved at once.  If you need more, you need to make multiple requests.  Returns a &#x60;results&#x60; array of network topology probes.  Network topology probes shown are from the latest round, or based on the time range specified. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void filterLocalNetworksTestResultsTopologiesRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "searchFilters" : {
                    "agentId" : [ "3fde6422-f119-40e1-ae32-d08a1243c038", "236e6f18-9637-4a2f-b15f-7aa6a29c9fce" ],
                    "bssid" : [ "8c:68:c8:a5:0a:8c", "0c:51:01:e4:3e:d0" ],
                    "location" : [ "San Francisco Bay Area", "Germany" ],
                    "connection" : [ "wireless", "wireless" ],
                    "vpnTarget" : [ "78.153.54.204", "78.153.54.206" ],
                    "networkId" : [ "660b34109d12", "660b34109d15" ],
                    "type" : [ "vpn", "proxy" ],
                    "ssid" : [ "wifi-name", "other-room-wifi" ],
                    "platform" : [ "mac", "mac" ],
                    "gateway" : [ "78.153.54.204", "78.153.54.206" ],
                    "proxyTarget" : [ "78.153.54.204", "78.153.54.206" ]
                  }
                }
                                 """;
        EndpointNetworkTopologyResultRequest mappedRequest = 
                mapper.readValue(requestBodyJson, EndpointNetworkTopologyResultRequest.class);
        assertNotNull(mappedRequest);

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
                    }
                  },
                  "results" : [ {
                    "date" : "2022-07-17T22:00:54Z",
                    "agentId" : "861b7557-cd57-4bbb-b648-00bddf88ef49",
                    "systemMetrics" : {
                      "cpuUtilization" : {
                        "min" : 0.22,
                        "median" : 0.61,
                        "max" : 0.75,
                        "mean" : 0.55,
                        "count" : 150,
                        "stdDev" : 0.01
                      },
                      "physicalMemoryTotalBytes" : 1024,
                      "startTimeMs" : 1581508857327,
                      "physicalMemoryUsedBytes" : {
                        "min" : 1.2,
                        "median" : 1.85,
                        "max" : 2.5,
                        "mean" : 1.77,
                        "count" : 155,
                        "stdDev" : 0.25
                      },
                      "endTimeMs" : 1581508867333
                    },
                    "isIcmpBlocked" : true,
                    "tcpConnect" : {
                      "rtt" : 77.777,
                      "errorCode" : "ERR_TIMED_OUT",
                      "error" : "An operation timed out.",
                      "infoFlags" : [ "TE_INFO_ICMP_BLOCKED_BY_FIREWALL" ]
                    },
                    "icmpPing" : {
                      "maxRtt" : 66,
                      "pktsReceived" : 10,
                      "avgRtt" : 7,
                      "meanDevRtt" : 11,
                      "minRtt" : 1,
                      "error" : "An operation timed out.",
                      "infoFlags" : [ "TE_INFO_ICMP_BLOCKED_BY_FIREWALL" ],
                      "pktsSent" : 10
                    },
                    "type" : "vpn",
                    "networkTopologyId" : "00160:54c3a4b180c6:1490536500:c7a58c49",
                    "roundId" : 1384309800,
                    "targetPort" : 80,
                    "target" : "10.0.2.2"
                  }, {
                    "date" : "2022-07-17T22:00:54Z",
                    "agentId" : "861b7557-cd57-4bbb-b648-00bddf88ef49",
                    "systemMetrics" : {
                      "cpuUtilization" : {
                        "min" : 0.22,
                        "median" : 0.61,
                        "max" : 0.75,
                        "mean" : 0.55,
                        "count" : 150,
                        "stdDev" : 0.01
                      },
                      "physicalMemoryTotalBytes" : 1024,
                      "startTimeMs" : 1581508857327,
                      "physicalMemoryUsedBytes" : {
                        "min" : 1.2,
                        "median" : 1.85,
                        "max" : 2.5,
                        "mean" : 1.77,
                        "count" : 155,
                        "stdDev" : 0.25
                      },
                      "endTimeMs" : 1581508867333
                    },
                    "isIcmpBlocked" : true,
                    "tcpConnect" : {
                      "rtt" : 77.777,
                      "errorCode" : "ERR_TIMED_OUT",
                      "error" : "An operation timed out.",
                      "infoFlags" : [ "TE_INFO_ICMP_BLOCKED_BY_FIREWALL" ]
                    },
                    "icmpPing" : {
                      "maxRtt" : 66,
                      "pktsReceived" : 10,
                      "avgRtt" : 7,
                      "meanDevRtt" : 11,
                      "minRtt" : 1,
                      "error" : "An operation timed out.",
                      "infoFlags" : [ "TE_INFO_ICMP_BLOCKED_BY_FIREWALL" ],
                      "pktsSent" : 10
                    },
                    "type" : "vpn",
                    "networkTopologyId" : "00160:54c3a4b180c6:1490536500:c7a58c49",
                    "roundId" : 1384309800,
                    "targetPort" : 80,
                    "target" : "10.0.2.2"
                  } ],
                  "startDate" : "2022-07-17T22:00:54Z"
                }
                                  """;
        LocalNetworkTopologyResults mappedResponse = 
                mapper.readValue(responseBodyJson, LocalNetworkTopologyResults.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * List local networks
     * <p>
     * Returns a list of all the networks used by endpoint agents.  Sends back a &#x60;localNetworks&#x60; array. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getLocalNetworksTestResultsRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "localNetworks" : [ {
                    "publicIpRange" : "178.216.56.0-178.216.63.255",
                    "networkName" : "10.5.51.0 (in 178.216.56.0/21)",
                    "networkId" : "006c4fa7a054",
                    "localPrefix" : "10.5.51.0"
                  }, {
                    "publicIpRange" : "178.216.56.0-178.216.63.255",
                    "networkName" : "10.5.51.0 (in 178.216.56.0/21)",
                    "networkId" : "006c4fa7a054",
                    "localPrefix" : "10.5.51.0"
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
        LocalNetworkResults mappedResponse = 
                mapper.readValue(responseBodyJson, LocalNetworkResults.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Retrieve endpoint local network topology
     * <p>
     * Returns detailed data of a local network topology. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getLocalNetworksTestResultsTopologyRequestAndResponseDeserializationTest()
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
                  "results" : [ {
                    "date" : "2022-07-17T22:00:54Z",
                    "agentId" : "861b7557-cd57-4bbb-b648-00bddf88ef49",
                    "isIcmpBlocked" : true,
                    "tcpConnect" : {
                      "rtt" : 77.777,
                      "errorCode" : "ERR_TIMED_OUT",
                      "error" : "An operation timed out.",
                      "infoFlags" : [ "TE_INFO_ICMP_BLOCKED_BY_FIREWALL" ]
                    },
                    "coordinates" : {
                      "latitude" : 46.0552778,
                      "location" : "Slovenia",
                      "longitude" : 14.5144444
                    },
                    "icmpTraceroutes" : [ {
                      "destination" : "13.32.22.232",
                      "hops" : [ {
                        "delay" : 5,
                        "prefix" : "196.40.96.0/20",
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "name" : "89-210-88-65.access.t-2.net",
                        "mpls" : [ "L=301472,E=0,S=1,T=1" ],
                        "asn" : 34779
                      }, {
                        "delay" : 5,
                        "prefix" : "196.40.96.0/20",
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "name" : "89-210-88-65.access.t-2.net",
                        "mpls" : [ "L=301472,E=0,S=1,T=1" ],
                        "asn" : 34779
                      } ],
                      "error" : "An operation timed out.",
                      "infoFlags" : [ "TE_INFO_ICMP_BLOCKED_BY_FIREWALL" ],
                      "internalErrors" : [ "TE_INFO_ICMP_BLOCKED_BY_FIREWALL" ]
                    }, {
                      "destination" : "13.32.22.232",
                      "hops" : [ {
                        "delay" : 5,
                        "prefix" : "196.40.96.0/20",
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "name" : "89-210-88-65.access.t-2.net",
                        "mpls" : [ "L=301472,E=0,S=1,T=1" ],
                        "asn" : 34779
                      }, {
                        "delay" : 5,
                        "prefix" : "196.40.96.0/20",
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "name" : "89-210-88-65.access.t-2.net",
                        "mpls" : [ "L=301472,E=0,S=1,T=1" ],
                        "asn" : 34779
                      } ],
                      "error" : "An operation timed out.",
                      "infoFlags" : [ "TE_INFO_ICMP_BLOCKED_BY_FIREWALL" ],
                      "internalErrors" : [ "TE_INFO_ICMP_BLOCKED_BY_FIREWALL" ]
                    } ],
                    "type" : "vpn",
                    "targetPort" : 80,
                    "target" : "10.0.2.2",
                    "systemMetrics" : {
                      "cpuUtilization" : {
                        "min" : 0.22,
                        "median" : 0.61,
                        "max" : 0.75,
                        "mean" : 0.55,
                        "count" : 150,
                        "stdDev" : 0.01
                      },
                      "physicalMemoryTotalBytes" : 1024,
                      "startTimeMs" : 1581508857327,
                      "physicalMemoryUsedBytes" : {
                        "min" : 1.2,
                        "median" : 1.85,
                        "max" : 2.5,
                        "mean" : 1.77,
                        "count" : 155,
                        "stdDev" : 0.25
                      },
                      "endTimeMs" : 1581508867333
                    },
                    "icmpTraceroute" : {
                      "destination" : "13.32.22.232",
                      "hops" : [ {
                        "delay" : 5,
                        "prefix" : "196.40.96.0/20",
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "name" : "89-210-88-65.access.t-2.net",
                        "mpls" : [ "L=301472,E=0,S=1,T=1" ],
                        "asn" : 34779
                      }, {
                        "delay" : 5,
                        "prefix" : "196.40.96.0/20",
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "name" : "89-210-88-65.access.t-2.net",
                        "mpls" : [ "L=301472,E=0,S=1,T=1" ],
                        "asn" : 34779
                      } ],
                      "error" : "An operation timed out.",
                      "infoFlags" : [ "TE_INFO_ICMP_BLOCKED_BY_FIREWALL" ],
                      "internalErrors" : [ "TE_INFO_ICMP_BLOCKED_BY_FIREWALL" ]
                    },
                    "networkProfile" : {
                      "previousInterface" : {
                        "publicIpAddress" : "84.255.241.1",
                        "publicIpRange" : "84.255.241.0-84.255.241.255",
                        "ipAddress" : "10.0.0.13",
                        "hardwareType" : "wireless",
                        "localPrefix" : "10.0.0.0",
                        "interfaceName" : "en0",
                        "subnetMask" : "255.255.255.0",
                        "dnsServers" : [ "8.8.8.8", "8.8.8.4" ]
                      },
                      "ethernetProfile" : {
                        "linkSpeed" : 860
                      },
                      "publicIpAddress" : "84.255.241.1",
                      "publicIpRange" : "84.255.241.0-84.255.241.255",
                      "ipAddress" : "10.0.0.13",
                      "hardwareType" : "wireless",
                      "localPrefix" : "10.0.0.0",
                      "proxyProfile" : {
                        "method" : "System",
                        "proxies" : [ {
                          "bypass" : "*.local;169.254/16",
                          "proxy" : "<direct>"
                        }, {
                          "bypass" : "*.local;169.254/16",
                          "proxy" : "<direct>"
                        } ]
                      },
                      "subnetMask" : "255.255.255.0",
                      "error" : "An operation timed out.",
                      "wirelessProfile" : {
                        "rssi" : -38,
                        "bssid" : "4c:ba:ba:f4:fa:fa",
                        "vendor" : "Cisco",
                        "txRate" : 130,
                        "channel" : 1,
                        "noise" : -95,
                        "phyMode" : "802.11n",
                        "ssid" : "Internet for the masses",
                        "quality" : 100
                      },
                      "interfaceName" : "en0",
                      "dnsServers" : [ "8.8.8.8", "8.8.8.4" ],
                      "gateway" : "10.0.0.1"
                    },
                    "icmpPing" : {
                      "maxRtt" : 66,
                      "pktsReceived" : 10,
                      "avgRtt" : 7,
                      "meanDevRtt" : 11,
                      "minRtt" : 1,
                      "error" : "An operation timed out.",
                      "infoFlags" : [ "TE_INFO_ICMP_BLOCKED_BY_FIREWALL" ],
                      "pktsSent" : 10
                    },
                    "networkTopologyId" : "00160:54c3a4b180c6:1490536500:c7a58c49",
                    "roundId" : 1384309800
                  }, {
                    "date" : "2022-07-17T22:00:54Z",
                    "agentId" : "861b7557-cd57-4bbb-b648-00bddf88ef49",
                    "isIcmpBlocked" : true,
                    "tcpConnect" : {
                      "rtt" : 77.777,
                      "errorCode" : "ERR_TIMED_OUT",
                      "error" : "An operation timed out.",
                      "infoFlags" : [ "TE_INFO_ICMP_BLOCKED_BY_FIREWALL" ]
                    },
                    "coordinates" : {
                      "latitude" : 46.0552778,
                      "location" : "Slovenia",
                      "longitude" : 14.5144444
                    },
                    "icmpTraceroutes" : [ {
                      "destination" : "13.32.22.232",
                      "hops" : [ {
                        "delay" : 5,
                        "prefix" : "196.40.96.0/20",
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "name" : "89-210-88-65.access.t-2.net",
                        "mpls" : [ "L=301472,E=0,S=1,T=1" ],
                        "asn" : 34779
                      }, {
                        "delay" : 5,
                        "prefix" : "196.40.96.0/20",
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "name" : "89-210-88-65.access.t-2.net",
                        "mpls" : [ "L=301472,E=0,S=1,T=1" ],
                        "asn" : 34779
                      } ],
                      "error" : "An operation timed out.",
                      "infoFlags" : [ "TE_INFO_ICMP_BLOCKED_BY_FIREWALL" ],
                      "internalErrors" : [ "TE_INFO_ICMP_BLOCKED_BY_FIREWALL" ]
                    }, {
                      "destination" : "13.32.22.232",
                      "hops" : [ {
                        "delay" : 5,
                        "prefix" : "196.40.96.0/20",
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "name" : "89-210-88-65.access.t-2.net",
                        "mpls" : [ "L=301472,E=0,S=1,T=1" ],
                        "asn" : 34779
                      }, {
                        "delay" : 5,
                        "prefix" : "196.40.96.0/20",
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "name" : "89-210-88-65.access.t-2.net",
                        "mpls" : [ "L=301472,E=0,S=1,T=1" ],
                        "asn" : 34779
                      } ],
                      "error" : "An operation timed out.",
                      "infoFlags" : [ "TE_INFO_ICMP_BLOCKED_BY_FIREWALL" ],
                      "internalErrors" : [ "TE_INFO_ICMP_BLOCKED_BY_FIREWALL" ]
                    } ],
                    "type" : "vpn",
                    "targetPort" : 80,
                    "target" : "10.0.2.2",
                    "systemMetrics" : {
                      "cpuUtilization" : {
                        "min" : 0.22,
                        "median" : 0.61,
                        "max" : 0.75,
                        "mean" : 0.55,
                        "count" : 150,
                        "stdDev" : 0.01
                      },
                      "physicalMemoryTotalBytes" : 1024,
                      "startTimeMs" : 1581508857327,
                      "physicalMemoryUsedBytes" : {
                        "min" : 1.2,
                        "median" : 1.85,
                        "max" : 2.5,
                        "mean" : 1.77,
                        "count" : 155,
                        "stdDev" : 0.25
                      },
                      "endTimeMs" : 1581508867333
                    },
                    "icmpTraceroute" : {
                      "destination" : "13.32.22.232",
                      "hops" : [ {
                        "delay" : 5,
                        "prefix" : "196.40.96.0/20",
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "name" : "89-210-88-65.access.t-2.net",
                        "mpls" : [ "L=301472,E=0,S=1,T=1" ],
                        "asn" : 34779
                      }, {
                        "delay" : 5,
                        "prefix" : "196.40.96.0/20",
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "name" : "89-210-88-65.access.t-2.net",
                        "mpls" : [ "L=301472,E=0,S=1,T=1" ],
                        "asn" : 34779
                      } ],
                      "error" : "An operation timed out.",
                      "infoFlags" : [ "TE_INFO_ICMP_BLOCKED_BY_FIREWALL" ],
                      "internalErrors" : [ "TE_INFO_ICMP_BLOCKED_BY_FIREWALL" ]
                    },
                    "networkProfile" : {
                      "previousInterface" : {
                        "publicIpAddress" : "84.255.241.1",
                        "publicIpRange" : "84.255.241.0-84.255.241.255",
                        "ipAddress" : "10.0.0.13",
                        "hardwareType" : "wireless",
                        "localPrefix" : "10.0.0.0",
                        "interfaceName" : "en0",
                        "subnetMask" : "255.255.255.0",
                        "dnsServers" : [ "8.8.8.8", "8.8.8.4" ]
                      },
                      "ethernetProfile" : {
                        "linkSpeed" : 860
                      },
                      "publicIpAddress" : "84.255.241.1",
                      "publicIpRange" : "84.255.241.0-84.255.241.255",
                      "ipAddress" : "10.0.0.13",
                      "hardwareType" : "wireless",
                      "localPrefix" : "10.0.0.0",
                      "proxyProfile" : {
                        "method" : "System",
                        "proxies" : [ {
                          "bypass" : "*.local;169.254/16",
                          "proxy" : "<direct>"
                        }, {
                          "bypass" : "*.local;169.254/16",
                          "proxy" : "<direct>"
                        } ]
                      },
                      "subnetMask" : "255.255.255.0",
                      "error" : "An operation timed out.",
                      "wirelessProfile" : {
                        "rssi" : -38,
                        "bssid" : "4c:ba:ba:f4:fa:fa",
                        "vendor" : "Cisco",
                        "txRate" : 130,
                        "channel" : 1,
                        "noise" : -95,
                        "phyMode" : "802.11n",
                        "ssid" : "Internet for the masses",
                        "quality" : 100
                      },
                      "interfaceName" : "en0",
                      "dnsServers" : [ "8.8.8.8", "8.8.8.4" ],
                      "gateway" : "10.0.0.1"
                    },
                    "icmpPing" : {
                      "maxRtt" : 66,
                      "pktsReceived" : 10,
                      "avgRtt" : 7,
                      "meanDevRtt" : 11,
                      "minRtt" : 1,
                      "error" : "An operation timed out.",
                      "infoFlags" : [ "TE_INFO_ICMP_BLOCKED_BY_FIREWALL" ],
                      "pktsSent" : 10
                    },
                    "networkTopologyId" : "00160:54c3a4b180c6:1490536500:c7a58c49",
                    "roundId" : 1384309800
                  } ]
                }
                                  """;
        LocalNetworkTopologyDetailResults mappedResponse = 
                mapper.readValue(responseBodyJson, LocalNetworkTopologyDetailResults.class);
        assertNotNull(mappedResponse);
    }
    
}
