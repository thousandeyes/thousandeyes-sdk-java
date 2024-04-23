/*
 * Tests API
 * This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.tests.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.tests.model.InterfaceGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * InterfaceGroups
 */
@JsonPropertyOrder({
  InterfaceGroups.JSON_PROPERTY_PATH_VIS_INTERFACE_GROUPS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T16:57:46.217350+01:00[Europe/Lisbon]")
public class InterfaceGroups {
  public static final String JSON_PROPERTY_PATH_VIS_INTERFACE_GROUPS = "pathVisInterfaceGroups";
  private List<InterfaceGroup> pathVisInterfaceGroups = new ArrayList<>();

  public InterfaceGroups() { 
  }

  public InterfaceGroups pathVisInterfaceGroups(List<InterfaceGroup> pathVisInterfaceGroups) {
    this.pathVisInterfaceGroups = pathVisInterfaceGroups;
    return this;
  }

  public InterfaceGroups addpathVisInterfaceGroupsItem(InterfaceGroup pathVisInterfaceGroupsItem) {
    if (this.pathVisInterfaceGroups == null) {
      this.pathVisInterfaceGroups = new ArrayList<>();
    }
    this.pathVisInterfaceGroups.add(pathVisInterfaceGroupsItem);
    return this;
  }

   /**
   * Get pathVisInterfaceGroups
   * @return pathVisInterfaceGroups
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH_VIS_INTERFACE_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InterfaceGroup> getPathVisInterfaceGroups() {
    return pathVisInterfaceGroups;
  }


  @JsonProperty(JSON_PROPERTY_PATH_VIS_INTERFACE_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPathVisInterfaceGroups(List<InterfaceGroup> pathVisInterfaceGroups) {
    this.pathVisInterfaceGroups = pathVisInterfaceGroups;
  }


  /**
   * Return true if this InterfaceGroups object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterfaceGroups interfaceGroups = (InterfaceGroups) o;
    return Objects.equals(this.pathVisInterfaceGroups, interfaceGroups.pathVisInterfaceGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pathVisInterfaceGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterfaceGroups {\n");
    sb.append("    pathVisInterfaceGroups: ").append(toIndentedString(pathVisInterfaceGroups)).append("\n");
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

