/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
 *
 * The version of the OpenAPI document: 7.0.6
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
 * Datasource of the pie chart widget.
 */
public enum PieChartDatasource {
  
  CLOUD_AND_ENTERPRISE_AGENTS("CLOUD_AND_ENTERPRISE_AGENTS"),
  
  ENDPOINT_AGENTS("ENDPOINT_AGENTS"),
  
  ENDPOINT_BROWSER_SESSION("ENDPOINT_BROWSER_SESSION"),
  
  ENDPOINT_SCHEDULED_TEST("ENDPOINT_SCHEDULED_TEST");

  private String value;

  PieChartDatasource(String value) {
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
  public static PieChartDatasource fromValue(String value) {
    for (PieChartDatasource b : PieChartDatasource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

