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
 * The severity of the alert.
 */
public enum Severity {
  
  INFO("info"),
  
  MAJOR("major"),
  
  MINOR("minor"),
  
  CRITICAL("critical"),
  
  UNKNOWN("unknown");

  private String value;

  Severity(String value) {
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
  public static Severity fromValue(String value) {
    for (Severity b : Severity.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
  }

}

