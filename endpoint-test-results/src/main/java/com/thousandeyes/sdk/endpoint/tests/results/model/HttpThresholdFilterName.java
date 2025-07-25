/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.tests.results.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Metric on which the threshold filter is applied.
 */
public enum HttpThresholdFilterName {
  
  RESPONSE_TIME("response-time"),
  
  DNS_TIME("dns-time"),
  
  CONNECT_TIME("connect-time"),
  
  THROUGHPUT("throughput"),
  
  SSL_TIME("ssl-time"),
  
  WAIT_TIME("wait-time"),
  
  APPLICATION_SCORE("application-score"),
  
  UNKNOWN("unknown");

  private String value;

  HttpThresholdFilterName(String value) {
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
  public static HttpThresholdFilterName fromValue(String value) {
    for (HttpThresholdFilterName b : HttpThresholdFilterName.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
  }

}

