/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.tests.results.model;

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
 * MultiTestIdTestsDataSearchFilter
 */
@JsonPropertyOrder({
  MultiTestIdTestsDataSearchFilter.JSON_PROPERTY_AGENT_ID,
  MultiTestIdTestsDataSearchFilter.JSON_PROPERTY_TEST_ID
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T10:46:26.208767+01:00[Europe/Lisbon]")
public class MultiTestIdTestsDataSearchFilter {
  public static final String JSON_PROPERTY_AGENT_ID = "agentId";
  private List<UUID> agentId = new ArrayList<>();

  public static final String JSON_PROPERTY_TEST_ID = "testId";
  private List<String> testId = new ArrayList<>();

  public MultiTestIdTestsDataSearchFilter() { 
  }

  public MultiTestIdTestsDataSearchFilter agentId(List<UUID> agentId) {
    this.agentId = agentId;
    return this;
  }

  public MultiTestIdTestsDataSearchFilter addAgentIdItem(UUID agentIdItem) {
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


  public MultiTestIdTestsDataSearchFilter testId(List<String> testId) {
    this.testId = testId;
    return this;
  }

  public MultiTestIdTestsDataSearchFilter addTestIdItem(String testIdItem) {
    if (this.testId == null) {
      this.testId = new ArrayList<>();
    }
    this.testId.add(testIdItem);
    return this;
  }

   /**
   * Get testId
   * @return testId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTestId() {
    return testId;
  }


  @JsonProperty(JSON_PROPERTY_TEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestId(List<String> testId) {
    this.testId = testId;
  }


  /**
   * Return true if this MultiTestIdTestsDataSearchFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiTestIdTestsDataSearchFilter multiTestIdTestsDataSearchFilter = (MultiTestIdTestsDataSearchFilter) o;
    return Objects.equals(this.agentId, multiTestIdTestsDataSearchFilter.agentId) &&
        Objects.equals(this.testId, multiTestIdTestsDataSearchFilter.testId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, testId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiTestIdTestsDataSearchFilter {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
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

