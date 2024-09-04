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
 * Gets or Sets EndpointTestsDataSearchSortKey
 */
public enum EndpointTestsDataSearchSortKey {
  
  ROUND_ID("round-id"),
  
  LOSS("loss"),
  
  LATENCY("latency"),
  
  JITTER("jitter"),
  
  CPU("cpu"),
  
  MEMORY("memory"),
  
  SIGNAL_QUALITY("signal-quality");

  private String value;

  EndpointTestsDataSearchSortKey(String value) {
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
  public static EndpointTestsDataSearchSortKey fromValue(String value) {
    for (EndpointTestsDataSearchSortKey b : EndpointTestsDataSearchSortKey.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

