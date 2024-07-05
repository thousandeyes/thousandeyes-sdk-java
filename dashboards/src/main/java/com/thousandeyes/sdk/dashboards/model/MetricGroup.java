/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
 *
 * The version of the OpenAPI document: 7.0.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.dashboards.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Metric group of widget as it appears in the UI. Note: may not be required in some cases.
 */
public enum MetricGroup {
  
  AGENT_TO_AGENT("AGENT_TO_AGENT"),
  
  AGENT_TO_SERVER("AGENT_TO_SERVER"),
  
  HTTP_SERVER("HTTP_SERVER"),
  
  FTP_SERVER("FTP_SERVER"),
  
  PAGE_LOAD("PAGE_LOAD"),
  
  TRANSACTIONS_CLASSIC("TRANSACTIONS_CLASSIC"),
  
  TRANSACTIONS("TRANSACTIONS"),
  
  API("API"),
  
  ENDPOINT_BROWSER_SESSION_NETWORK("ENDPOINT_BROWSER_SESSION_NETWORK"),
  
  ENDPOINT_BROWSER_SESSION_SYSTEM("ENDPOINT_BROWSER_SESSION_SYSTEM"),
  
  ENDPOINT_BROWSER_SESSION_VISITED_PAGES("ENDPOINT_BROWSER_SESSION_VISITED_PAGES"),
  
  ENDPOINT_SCHEDULED_TEST_HTTP_SERVER("ENDPOINT_SCHEDULED_TEST_HTTP_SERVER"),
  
  ENDPOINT_SCHEDULED_TEST_NETWORK("ENDPOINT_SCHEDULED_TEST_NETWORK"),
  
  ENDPOINT_SCHEDULED_TEST_SYSTEM("ENDPOINT_SCHEDULED_TEST_SYSTEM"),
  
  ENDPOINT_AST_TEST_NETWORK("ENDPOINT_AST_TEST_NETWORK"),
  
  ENDPOINT_AST_TEST_SYSTEM("ENDPOINT_AST_TEST_SYSTEM"),
  
  ENDPOINT_LOCAL_NETWORK_GATEWAY("ENDPOINT_LOCAL_NETWORK_GATEWAY"),
  
  ENDPOINT_LOCAL_NETWORK_AGENTS("ENDPOINT_LOCAL_NETWORK_AGENTS"),
  
  ENDPOINT_LOCAL_NETWORK_DNS("ENDPOINT_LOCAL_NETWORK_DNS"),
  
  ENDPOINT_LOCAL_NETWORK_NETWORK_ACCESS("ENDPOINT_LOCAL_NETWORK_NETWORK_ACCESS"),
  
  ENDPOINT_LOCAL_NETWORK_PROXY("ENDPOINT_LOCAL_NETWORK_PROXY"),
  
  ENDPOINT_LOCAL_NETWORK_SYSTEM("ENDPOINT_LOCAL_NETWORK_SYSTEM"),
  
  ENDPOINT_LOCAL_NETWORK_VPN("ENDPOINT_LOCAL_NETWORK_VPN"),
  
  ENDPOINT_LOCAL_NETWORK_WIRELESS("ENDPOINT_LOCAL_NETWORK_WIRELESS"),
  
  BGP("BGP"),
  
  DEVICE("DEVICE"),
  
  VOIP("VOIP"),
  
  SIP("SIP"),
  
  ALERTS("ALERTS"),
  
  DNS("DNS"),
  
  DOMAIN_TRACE("DOMAIN_TRACE"),
  
  DNSSEC("DNSSEC"),
  
  DNSP("DNSP"),
  
  NETWORK_OUTAGES("NETWORK_OUTAGES"),
  
  APPLICATION_OUTAGES("APPLICATION_OUTAGES"),
  
  APPDYNAMICS_SERVICE_HEALTH("APPDYNAMICS_SERVICE_HEALTH");

  private String value;

  MetricGroup(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MetricGroup fromValue(String value) {
    for (MetricGroup b : MetricGroup.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

