/*
 * Tags API
 * The ThousandEyes Tags API provides a tagging system with key/value pairs. It allows you to tag assets within the ThousandEyes platform (such as agents, tests, or alert rules) with meaningful metadata. For example: `branch:sfo`, `branch:nyc`, and `team:netops`.  This feature provides:  * Support for automation. * Powerful and flexible reports/dashboards. * Support for third-party integrations.  Things to note with the ThousandEyes Tags API:  * Tags are backwards-compatible with existing labels. * Tags are separated by Tests (CEA), Agents (CEA), Endpoint Agents, Scheduled Endpoint Tests, and Reports. A single tag can only apply to one type of target object, so each tag must specify the target type of object via a `type` field. * Tags are defined in a single table so that they can be represented using a single model - `Tag`. 
 *
 * The version of the OpenAPI document: 7.0.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.tags.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.tags.model.Assignment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TagAssignment
 */
@JsonPropertyOrder({
  TagAssignment.JSON_PROPERTY_ASSIGNMENTS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class TagAssignment {
  public static final String JSON_PROPERTY_ASSIGNMENTS = "assignments";
  private List<Assignment> assignments = new ArrayList<>();

  public TagAssignment() { 
  }

  public TagAssignment assignments(List<Assignment> assignments) {
    this.assignments = assignments;
    return this;
  }

  public TagAssignment addAssignmentsItem(Assignment assignmentsItem) {
    if (this.assignments == null) {
      this.assignments = new ArrayList<>();
    }
    this.assignments.add(assignmentsItem);
    return this;
  }

   /**
   * Get assignments
   * @return assignments
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSIGNMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Assignment> getAssignments() {
    return assignments;
  }


  @JsonProperty(JSON_PROPERTY_ASSIGNMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssignments(List<Assignment> assignments) {
    this.assignments = assignments;
  }


  /**
   * Return true if this TagAssignment object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagAssignment tagAssignment = (TagAssignment) o;
    return Objects.equals(this.assignments, tagAssignment.assignments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagAssignment {\n");
    sb.append("    assignments: ").append(toIndentedString(assignments)).append("\n");
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

