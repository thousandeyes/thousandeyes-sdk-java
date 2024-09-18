/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
 *
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
 * Determines how to aggregate the the metric.
 */
public enum WidgetMeasureType {
  
  MINIMUM("MINIMUM"),
  
  MAXIMUM("MAXIMUM"),
  
  MEAN("MEAN"),
  
  MEDIAN("MEDIAN"),
  
  NTH_PERCENTILE("NTH_PERCENTILE"),
  
  PERCPOSITIVE("PERCPOSITIVE"),
  
  PERCZERO("PERCZERO"),
  
  STDDEV("STDDEV"),
  
  TOTAL("TOTAL"),
  
  VALUES("VALUES"),
  
  UNKNOWN("unknown");

  private String value;

  WidgetMeasureType(String value) {
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
  public static WidgetMeasureType fromValue(String value) {
    for (WidgetMeasureType b : WidgetMeasureType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
  }

}

