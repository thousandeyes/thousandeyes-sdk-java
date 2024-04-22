/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.dashboards.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AswRepeat
 */
public enum AswRepeat {
  
  NONE("none"),
  
  EVERY_DAY("every-day"),
  
  ALT_EVERY_DAY("alt-every-day"),
  
  EVERY_WEEK("every-week"),
  
  EVERY_TWO_WEEK("every-two-week"),
  
  EVERY_MONTH("every-month"),
  
  EVERY_THREE_MONTH("every-three-month"),
  
  CUSTOM("custom");

  private String value;

  AswRepeat(String value) {
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
  public static AswRepeat fromValue(String value) {
    for (AswRepeat b : AswRepeat.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

