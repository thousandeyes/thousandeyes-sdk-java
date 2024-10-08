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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DashboardGlobalFilterId
 */
@JsonPropertyOrder({
  DashboardGlobalFilterId.JSON_PROPERTY_GLOBAL_FILTER_ID
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class DashboardGlobalFilterId {
  public static final String JSON_PROPERTY_GLOBAL_FILTER_ID = "globalFilterId";
  private String globalFilterId;

  public DashboardGlobalFilterId() { 
  }

  public DashboardGlobalFilterId globalFilterId(String globalFilterId) {
    this.globalFilterId = globalFilterId;
    return this;
  }

   /**
   * Default global dashboard filter ID (obtained from &#x60;/dashboards/filters&#x60; endpoint).
   * @return globalFilterId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GLOBAL_FILTER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGlobalFilterId() {
    return globalFilterId;
  }


  @JsonProperty(JSON_PROPERTY_GLOBAL_FILTER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGlobalFilterId(String globalFilterId) {
    this.globalFilterId = globalFilterId;
  }


  /**
   * Return true if this DashboardGlobalFilterId object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardGlobalFilterId dashboardGlobalFilterId = (DashboardGlobalFilterId) o;
    return Objects.equals(this.globalFilterId, dashboardGlobalFilterId.globalFilterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(globalFilterId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardGlobalFilterId {\n");
    sb.append("    globalFilterId: ").append(toIndentedString(globalFilterId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

