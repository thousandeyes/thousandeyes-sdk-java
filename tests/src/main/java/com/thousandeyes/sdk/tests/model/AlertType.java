/*
 * Tests API
 * This API allows you to list, create, edit, and delete Network and Application Synthetics tests. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of alert being triggered. In multi-layered tests, this value represents the layer the alert relates to. See [Alert Details](https://developer.cisco.com/docs/thousandeyes/retrieve-alert-details/) documentation for a list of possible values
 */
public enum AlertType {
  
  PAGE_LOAD("page-load"),
  
  HTTP_SERVER("http-server"),
  
  END_TO_END_SERVER("end-to-end-server"),
  
  END_TO_END_AGENT("end-to-end-agent"),
  
  VOICE("voice"),
  
  DNS_SERVER("dns-server"),
  
  DNS_TRACE("dns-trace"),
  
  DNSSEC("dnssec"),
  
  BGP("bgp"),
  
  PATH_TRACE("path-trace"),
  
  FTP("ftp"),
  
  SIP_SERVER("sip-server"),
  
  TRANSACTIONS("transactions"),
  
  WEB_TRANSACTIONS("web-transactions"),
  
  AGENT("agent"),
  
  NETWORK_OUTAGE("network-outage"),
  
  APPLICATION_OUTAGE("application-outage"),
  
  DEVICE_DEVICE("device-device"),
  
  DEVICE_INTERFACE("device-interface"),
  
  ENDPOINT_NETWORK_SERVER("endpoint-network-server"),
  
  ENDPOINT_HTTP_SERVER("endpoint-http-server"),
  
  ENDPOINT_PATH_TRACE("endpoint-path-trace"),
  
  ENDPOINT_BROWSER_SESSIONS_AGENT("endpoint-browser-sessions-agent"),
  
  ENDPOINT_BROWSER_SESSIONS_APPLICATION("endpoint-browser-sessions-application"),
  
  API("api"),
  
  WEB_TRANSACTION("web-transaction"),
  
  UNKNOWN("unknown");

  private String value;

  AlertType(String value) {
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
  public static AlertType fromValue(String value) {
    for (AlertType b : AlertType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
  }

}

