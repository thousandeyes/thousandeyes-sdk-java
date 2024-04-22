/*
 * Endpoint Tests API
 *  Manage endpoint agent dynamic and scheduled tests using the Endpoint Tests API. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.tests.model;

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
 * Agent labels selection object.
 */
@JsonPropertyOrder({
  EndpointAgentLabelsSelectorConfig.JSON_PROPERTY_AGENT_SELECTOR_TYPE,
  EndpointAgentLabelsSelectorConfig.JSON_PROPERTY_MAX_MACHINES,
  EndpointAgentLabelsSelectorConfig.JSON_PROPERTY_ENDPOINT_AGENT_LABELS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-22T10:43:50.756412+01:00[Europe/London]")
public class EndpointAgentLabelsSelectorConfig {
  public static final String JSON_PROPERTY_AGENT_SELECTOR_TYPE = "agentSelectorType";
  private String agentSelectorType;

  public static final String JSON_PROPERTY_MAX_MACHINES = "maxMachines";
  private Integer maxMachines;

  public static final String JSON_PROPERTY_ENDPOINT_AGENT_LABELS = "endpointAgentLabels";
  private List<String> endpointAgentLabels;

  public EndpointAgentLabelsSelectorConfig() { 
  }

  public EndpointAgentLabelsSelectorConfig agentSelectorType(String agentSelectorType) {
    this.agentSelectorType = agentSelectorType;
    return this;
  }

   /**
   * Get agentSelectorType
   * @return agentSelectorType
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AGENT_SELECTOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAgentSelectorType() {
    return agentSelectorType;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_SELECTOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAgentSelectorType(String agentSelectorType) {
    this.agentSelectorType = agentSelectorType;
  }


  public EndpointAgentLabelsSelectorConfig maxMachines(Integer maxMachines) {
    this.maxMachines = maxMachines;
    return this;
  }

   /**
   * Maximum number of agents which can execute the test.
   * minimum: 1
   * maximum: 50000
   * @return maxMachines
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_MACHINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxMachines() {
    return maxMachines;
  }


  @JsonProperty(JSON_PROPERTY_MAX_MACHINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxMachines(Integer maxMachines) {
    this.maxMachines = maxMachines;
  }


  public EndpointAgentLabelsSelectorConfig endpointAgentLabels(List<String> endpointAgentLabels) {
    this.endpointAgentLabels = endpointAgentLabels;
    return this;
  }

  public EndpointAgentLabelsSelectorConfig addEndpointAgentLabelsItem(String endpointAgentLabelsItem) {
    if (this.endpointAgentLabels == null) {
      this.endpointAgentLabels = new ArrayList<>();
    }
    this.endpointAgentLabels.add(endpointAgentLabelsItem);
    return this;
  }

   /**
   * List of endpoint agent label IDs (obtained from &#x60;/endpoint/labels&#x60; endpoint), required when &#x60;agentSelectorType&#x60; is set to &#x60;agent-labels&#x60;.
   * @return endpointAgentLabels
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDPOINT_AGENT_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getEndpointAgentLabels() {
    return endpointAgentLabels;
  }


  @JsonProperty(JSON_PROPERTY_ENDPOINT_AGENT_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndpointAgentLabels(List<String> endpointAgentLabels) {
    this.endpointAgentLabels = endpointAgentLabels;
  }


  /**
   * Return true if this EndpointAgentLabelsSelectorConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointAgentLabelsSelectorConfig endpointAgentLabelsSelectorConfig = (EndpointAgentLabelsSelectorConfig) o;
    return Objects.equals(this.agentSelectorType, endpointAgentLabelsSelectorConfig.agentSelectorType) &&
        Objects.equals(this.maxMachines, endpointAgentLabelsSelectorConfig.maxMachines) &&
        Objects.equals(this.endpointAgentLabels, endpointAgentLabelsSelectorConfig.endpointAgentLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentSelectorType, maxMachines, endpointAgentLabels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointAgentLabelsSelectorConfig {\n");
    sb.append("    agentSelectorType: ").append(toIndentedString(agentSelectorType)).append("\n");
    sb.append("    maxMachines: ").append(toIndentedString(maxMachines)).append("\n");
    sb.append("    endpointAgentLabels: ").append(toIndentedString(endpointAgentLabels)).append("\n");
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

