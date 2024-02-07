/*
 * Tests API
 *  ### Overview This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.tests.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Subinterval for round-robin testing (in seconds). Must be less than or equal to interval and must evenly divide interval.
 */
public enum TestSubInterval {
  
  NUMBER_60(60),
  
  NUMBER_120(120),
  
  NUMBER_300(300),
  
  NUMBER_600(600),
  
  NUMBER_900(900),
  
  NUMBER_1200(1200),
  
  NUMBER_1800(1800),
  
  NUMBER_3600(3600);

  private Integer value;

  TestSubInterval(Integer value) {
    this.value = value;
  }

  @JsonValue
  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TestSubInterval fromValue(Integer value) {
    for (TestSubInterval b : TestSubInterval.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

