/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
 *
 * The version of the OpenAPI document: 7.0.13
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
 * Name of the alert type
 */
public enum AlertListAlertType {
  
  NETWORK_END_TO_END_SERVER("network-end-to-end-server"),
  
  NETWORK_END_TO_END_AGENT("network-end-to-end-agent"),
  
  NETWORK_PATH_TRACE("network-path-trace"),
  
  DNS_SERVER("dns-server"),
  
  DNS_TRACE("dns-trace"),
  
  DNSSEC("dnssec"),
  
  DNS_PLUS_DOMAIN("dns-plus-domain"),
  
  DNS_PLUS_SERVER("dns-plus-server"),
  
  WEB_HTTP_SERVER("web-http-server"),
  
  WEB_PAGE_LOAD("web-page-load"),
  
  WEB_TRANSACTION_CLASSIC("web-transaction-classic"),
  
  WEB_TRANSACTION("web-transaction"),
  
  WEB_FTP_SERVER("web-ftp-server"),
  
  VOICE_SIP_SERVER("voice-sip-server"),
  
  VOICE_RTP_STREAM("voice-rtp-stream"),
  
  DEVICE("device"),
  
  DEVICE_INTERFACE("device-interface"),
  
  ENDPOINT_END_TO_END_SERVER("endpoint-end-to-end-server"),
  
  ENDPOINT_WEB_HTTP_SERVER("endpoint-web-http-server"),
  
  ENDPOINT_PATH_TRACE("endpoint-path-trace"),
  
  BROWSER_SESSION_AGENT("browser-session-agent"),
  
  BROWSER_SESSION_APPLICATION("browser-session-application"),
  
  ROUTING_BGP("routing-bgp");

  private String value;

  AlertListAlertType(String value) {
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
  public static AlertListAlertType fromValue(String value) {
    for (AlertListAlertType b : AlertListAlertType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

