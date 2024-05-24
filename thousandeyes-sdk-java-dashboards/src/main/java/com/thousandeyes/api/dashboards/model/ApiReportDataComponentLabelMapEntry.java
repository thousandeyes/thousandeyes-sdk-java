/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
 *
 * The version of the OpenAPI document: 7.0.5
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents a mapping entry of a group label.
 */
@JsonPropertyOrder({
  ApiReportDataComponentLabelMapEntry.JSON_PROPERTY_GROUP_ID,
  ApiReportDataComponentLabelMapEntry.JSON_PROPERTY_GROUP_LABEL
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ApiReportDataComponentLabelMapEntry {
  public static final String JSON_PROPERTY_GROUP_ID = "groupId";
  private String groupId;

  public static final String JSON_PROPERTY_GROUP_LABEL = "groupLabel";
  private String groupLabel;

  public ApiReportDataComponentLabelMapEntry() { 
  }

  public ApiReportDataComponentLabelMapEntry groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Identifier of the group.
   * @return groupId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupId() {
    return groupId;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public ApiReportDataComponentLabelMapEntry groupLabel(String groupLabel) {
    this.groupLabel = groupLabel;
    return this;
  }

   /**
   * Label of the group.
   * @return groupLabel
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupLabel() {
    return groupLabel;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupLabel(String groupLabel) {
    this.groupLabel = groupLabel;
  }


  /**
   * Return true if this ApiReportDataComponentLabelMapEntry object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiReportDataComponentLabelMapEntry apiReportDataComponentLabelMapEntry = (ApiReportDataComponentLabelMapEntry) o;
    return Objects.equals(this.groupId, apiReportDataComponentLabelMapEntry.groupId) &&
        Objects.equals(this.groupLabel, apiReportDataComponentLabelMapEntry.groupLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, groupLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiReportDataComponentLabelMapEntry {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupLabel: ").append(toIndentedString(groupLabel)).append("\n");
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

