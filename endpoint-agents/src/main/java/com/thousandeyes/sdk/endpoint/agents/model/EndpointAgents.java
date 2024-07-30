/*
 * Endpoint Agents API
 * Manage ThousandEyes Endpoint Agents using this API.   For more information about Endpoint Agents, see [Endpoint Agents](https://docs.thousandeyes.com/product-documentation/global-vantage-points/endpoint-agents).
 *
 * The version of the OpenAPI document: 7.0.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.agents.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.endpoint.agents.model.EndpointAgent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A list of &#x60;EndpointAgents&#x60;.
 */
@JsonPropertyOrder({
  EndpointAgents.JSON_PROPERTY_TOTAL_AGENTS,
  EndpointAgents.JSON_PROPERTY_AGENTS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class EndpointAgents {
  public static final String JSON_PROPERTY_TOTAL_AGENTS = "totalAgents";
  private Integer totalAgents;

  public static final String JSON_PROPERTY_AGENTS = "agents";
  private List<EndpointAgent> agents = new ArrayList<>();

  public EndpointAgents() { 
  }

  public EndpointAgents totalAgents(Integer totalAgents) {
    this.totalAgents = totalAgents;
    return this;
  }

   /**
   * The total number of agents.
   * @return totalAgents
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalAgents() {
    return totalAgents;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalAgents(Integer totalAgents) {
    this.totalAgents = totalAgents;
  }


  public EndpointAgents agents(List<EndpointAgent> agents) {
    this.agents = agents;
    return this;
  }

  public EndpointAgents addAgentsItem(EndpointAgent agentsItem) {
    if (this.agents == null) {
      this.agents = new ArrayList<>();
    }
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * Get agents
   * @return agents
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EndpointAgent> getAgents() {
    return agents;
  }


  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgents(List<EndpointAgent> agents) {
    this.agents = agents;
  }


  /**
   * Return true if this EndpointAgents object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointAgents endpointAgents = (EndpointAgents) o;
    return Objects.equals(this.totalAgents, endpointAgents.totalAgents) &&
        Objects.equals(this.agents, endpointAgents.agents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAgents, agents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointAgents {\n");
    sb.append("    totalAgents: ").append(toIndentedString(totalAgents)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
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

