/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.tests.results.model;

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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TestsDataSearchFilter
 */
@JsonPropertyOrder({
  TestsDataSearchFilter.JSON_PROPERTY_AGENT_ID
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class TestsDataSearchFilter {
  public static final String JSON_PROPERTY_AGENT_ID = "agentId";
  private List<UUID> agentId = new ArrayList<>();

  public TestsDataSearchFilter() { 
  }

  public TestsDataSearchFilter agentId(List<UUID> agentId) {
    this.agentId = agentId;
    return this;
  }

  public TestsDataSearchFilter addAgentIdItem(UUID agentIdItem) {
    if (this.agentId == null) {
      this.agentId = new ArrayList<>();
    }
    this.agentId.add(agentIdItem);
    return this;
  }

   /**
   * Filter using the &#x60;agent-id&#x60;.
   * @return agentId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UUID> getAgentId() {
    return agentId;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentId(List<UUID> agentId) {
    this.agentId = agentId;
  }


  /**
   * Return true if this TestsDataSearchFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestsDataSearchFilter testsDataSearchFilter = (TestsDataSearchFilter) o;
    return Objects.equals(this.agentId, testsDataSearchFilter.agentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestsDataSearchFilter {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
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

