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
 * Group of data points.
 */
@JsonPropertyOrder({
  ApiDataPointGroup.JSON_PROPERTY_GROUP_PROPERTY,
  ApiDataPointGroup.JSON_PROPERTY_GROUP_VALUE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ApiDataPointGroup {
  public static final String JSON_PROPERTY_GROUP_PROPERTY = "groupProperty";
  private String groupProperty;

  public static final String JSON_PROPERTY_GROUP_VALUE = "groupValue";
  private String groupValue;

  public ApiDataPointGroup() { 
  }

  public ApiDataPointGroup groupProperty(String groupProperty) {
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


  public ApiDataPointGroup groupValue(String groupValue) {
    this.groupValue = groupValue;
    return this;
  }

   /**
   * The value of a group.
   * @return groupValue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupValue() {
    return groupValue;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupValue(String groupValue) {
    this.groupValue = groupValue;
  }


  /**
   * Return true if this ApiDataPointGroup object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiDataPointGroup apiDataPointGroup = (ApiDataPointGroup) o;
    return Objects.equals(this.groupProperty, apiDataPointGroup.groupProperty) &&
        Objects.equals(this.groupValue, apiDataPointGroup.groupValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupProperty, groupValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiDataPointGroup {\n");
    sb.append("    groupProperty: ").append(toIndentedString(groupProperty)).append("\n");
    sb.append("    groupValue: ").append(toIndentedString(groupValue)).append("\n");
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

