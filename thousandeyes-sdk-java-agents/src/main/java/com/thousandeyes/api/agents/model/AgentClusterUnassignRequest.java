/*
 * Agents API
 *  ## Overview Manage all agents available to your account in ThousandEyes, including both Cloud and Enterprise Agents.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.agents.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AgentClusterUnassignRequest
 */
@JsonPropertyOrder({
  AgentClusterUnassignRequest.JSON_PROPERTY_MEMBERS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T17:12:31.654346+01:00[Europe/Lisbon]")
public class AgentClusterUnassignRequest {
  public static final String JSON_PROPERTY_MEMBERS = "members";
  private List<String> members = new ArrayList<>();

  public AgentClusterUnassignRequest() { 
  }

  public AgentClusterUnassignRequest members(List<String> members) {
    this.members = members;
    return this;
  }

  public AgentClusterUnassignRequest addMembersItem(String membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * Contains list of member IDs. (get &#x60;memberId&#x60; from &#x60;/agents/{agentId}&#x60; endpoint)
   * @return members
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getMembers() {
    return members;
  }


  @JsonProperty(JSON_PROPERTY_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMembers(List<String> members) {
    this.members = members;
  }


  /**
   * Return true if this AgentClusterUnassignRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentClusterUnassignRequest agentClusterUnassignRequest = (AgentClusterUnassignRequest) o;
    return Objects.equals(this.members, agentClusterUnassignRequest.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(members);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentClusterUnassignRequest {\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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

