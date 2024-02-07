/*
 * Dashboards API
 * Manage ThousandEyes Dashboards
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
 * Type of the Widget
 */
public enum WidgetType {
  
  BAR_CHART_STACKED("Bar Chart: Stacked"),
  
  BAR_CHART_GROUPED("Bar Chart: Grouped"),
  
  TIME_SERIES_LINE("Time Series: Line"),
  
  TIME_SERIES_STACKED_AREA("Time Series: Stacked Area"),
  
  PIE_CHART("Pie Chart"),
  
  TABLE("Table"),
  
  MULTI_METRIC_TABLE("Multi Metric Table"),
  
  NUMBER("Number"),
  
  AGENT_STATUS("Agent Status"),
  
  COLOR_GRID("Color Grid"),
  
  ALERT_LIST("Alert List"),
  
  TEST_TABLE("Test Table"),
  
  MAP("Map"),
  
  BOX_AND_WHISKERS("Box and Whiskers");

  private String value;

  WidgetType(String value) {
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
  public static WidgetType fromValue(String value) {
    for (WidgetType b : WidgetType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

