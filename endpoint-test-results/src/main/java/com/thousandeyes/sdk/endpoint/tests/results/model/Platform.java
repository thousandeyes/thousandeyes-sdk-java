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
 * OS platform types. Platform \&quot;linux\&quot; was recently renamed to \&quot;roomos\&quot;.
 */
public enum Platform {
  
  WINDOWS("windows"),
  
  ROOMOS("roomos"),
  
  PHONEOS("phoneos"),
  
  ELUX("elux"),
  
  LINUX("linux"),
  
  MAC("mac"),
  
  UNKNOWN("unknown");

  private String value;

  Platform(String value) {
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
  public static Platform fromValue(String value) {
    for (Platform b : Platform.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
  }

}

