/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
 *
 * The version of the OpenAPI document: 7.0.4
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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.dashboards.model.ApiReportDataComponentLabelMapEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Map of group labels.
 */
@JsonPropertyOrder({
  ApiReportDataComponentLabelMap.JSON_PROPERTY_GROUP_PROPERTY,
  ApiReportDataComponentLabelMap.JSON_PROPERTY_GROUP_LABELS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ApiReportDataComponentLabelMap {
  public static final String JSON_PROPERTY_GROUP_PROPERTY = "groupProperty";
  private String groupProperty;

  public static final String JSON_PROPERTY_GROUP_LABELS = "groupLabels";
  private List<ApiReportDataComponentLabelMapEntry> groupLabels = new ArrayList<>();

  public ApiReportDataComponentLabelMap() { 
  }

  public ApiReportDataComponentLabelMap groupProperty(String groupProperty) {
    this.groupProperty = groupProperty;
    return this;
  }

   /**
   * Defines the criterion used to aggregate data points under specific group values.
   * @return groupProperty
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupProperty() {
    return groupProperty;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupProperty(String groupProperty) {
    this.groupProperty = groupProperty;
  }


  public ApiReportDataComponentLabelMap groupLabels(List<ApiReportDataComponentLabelMapEntry> groupLabels) {
    this.groupLabels = groupLabels;
    return this;
  }

  public ApiReportDataComponentLabelMap addGroupLabelsItem(ApiReportDataComponentLabelMapEntry groupLabelsItem) {
    if (this.groupLabels == null) {
      this.groupLabels = new ArrayList<>();
    }
    this.groupLabels.add(groupLabelsItem);
    return this;
  }

   /**
   * List of group labels.
   * @return groupLabels
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiReportDataComponentLabelMapEntry> getGroupLabels() {
    return groupLabels;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupLabels(List<ApiReportDataComponentLabelMapEntry> groupLabels) {
    this.groupLabels = groupLabels;
  }


  /**
   * Return true if this ApiReportDataComponentLabelMap object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiReportDataComponentLabelMap apiReportDataComponentLabelMap = (ApiReportDataComponentLabelMap) o;
    return Objects.equals(this.groupProperty, apiReportDataComponentLabelMap.groupProperty) &&
        Objects.equals(this.groupLabels, apiReportDataComponentLabelMap.groupLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupProperty, groupLabels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiReportDataComponentLabelMap {\n");
    sb.append("    groupProperty: ").append(toIndentedString(groupProperty)).append("\n");
    sb.append("    groupLabels: ").append(toIndentedString(groupLabels)).append("\n");
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

