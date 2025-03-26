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
 * HTTP test run interval. The interval between HTTP test runs in seconds cannot exceed the specified interval value and defaults to the same value as the interval if not set.
 */
public enum TestHttpInterval {
  
  NUMBER_60(60),
  
  NUMBER_120(120),
  
  NUMBER_300(300),
  
  NUMBER_600(600),
  
  NUMBER_900(900),
  
  NUMBER_1800(1800),
  
  NUMBER_3600(3600),
  
  NUMBER_unknown(11184809);

  private Integer value;

  TestHttpInterval(Integer value) {
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
  public static TestHttpInterval fromValue(Integer value) {
    for (TestHttpInterval b : TestHttpInterval.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return NUMBER_unknown;
  }

}

