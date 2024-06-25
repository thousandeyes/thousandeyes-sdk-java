/*
 * Tests API
 * This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests. 
 *
 * The version of the OpenAPI document: 7.0.8
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
 * This is a read only value, as test type is implicit in the test creation url.
 */
public enum TestType {
  
  API("api"),
  
  AGENT_TO_AGENT("agent-to-agent"),
  
  AGENT_TO_SERVER("agent-to-server"),
  
  BGP("bgp"),
  
  HTTP_SERVER("http-server"),
  
  PAGE_LOAD("page-load"),
  
  WEB_TRANSACTIONS("web-transactions"),
  
  FTP_SERVER("ftp-server"),
  
  DNS_TRACE("dns-trace"),
  
  DNS_SERVER("dns-server"),
  
  DNSSEC("dnssec"),
  
  SIP_SERVER("sip-server"),
  
  VOICE("voice");

  private String value;

  TestType(String value) {
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
  public static TestType fromValue(String value) {
    for (TestType b : TestType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

