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
 * Datasource of the agent to retrieve status.
 */
public enum AgentStatusDatasource {
  
  ALERTS("ALERTS"),
  
  DEVICES("DEVICES"),
  
  DNSP("DNSP"),
  
  ENDPOINT_AGENTS("ENDPOINT_AGENTS"),
  
  ENDPOINT_SCHEDULED_TEST("ENDPOINT_SCHEDULED_TEST"),
  
  ENDPOINT_AST_TEST("ENDPOINT_AST_TEST"),
  
  ENDPOINT_BROWSER_SESSION("ENDPOINT_BROWSER_SESSION"),
  
  ENDPOINT_LOCAL_NETWORK("ENDPOINT_LOCAL_NETWORK"),
  
  ENDPOINT_LOCAL_NETWORK_WIRELESS("ENDPOINT_LOCAL_NETWORK_WIRELESS"),
  
  ROUTING("ROUTING"),
  
  CLOUD_AND_ENTERPRISE_AGENTS("CLOUD_AND_ENTERPRISE_AGENTS"),
  
  INTERNET_INSIGHTS("INTERNET_INSIGHTS"),
  
  APPDYNAMICS_SERVICE_HEALTH("APPDYNAMICS_SERVICE_HEALTH"),
  
  CLOUD_NATIVE_MONITORING("CLOUD_NATIVE_MONITORING"),
  
  UNKNOWN("unknown");

  private String value;

  AgentStatusDatasource(String value) {
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
  public static AgentStatusDatasource fromValue(String value) {
    for (AgentStatusDatasource b : AgentStatusDatasource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
  }

}

