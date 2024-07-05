/*
 * Endpoint Tests API
 *  Manage endpoint agent dynamic and scheduled tests using the Endpoint Tests API. 
 *
 * The version of the OpenAPI document: 7.0.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.tests.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Probe mode used by network test, only valid when the protocol is set to TCP.
 */
public enum TestProbeModeResponse {
  
  AUTO("auto"),
  
  SACK("sack"),
  
  SYN("syn"),
  
  UNKNOWN("unknown");

  private String value;

  TestProbeModeResponse(String value) {
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
  public static TestProbeModeResponse fromValue(String value) {
    for (TestProbeModeResponse b : TestProbeModeResponse.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

