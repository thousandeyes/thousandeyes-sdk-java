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
import com.thousandeyes.api.agents.model.AgentProxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AgentProxies
 */
@JsonPropertyOrder({
  AgentProxies.JSON_PROPERTY_AGENT_PROXIES
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-30T10:06:13.083499+01:00[Europe/Lisbon]")
public class AgentProxies {
  public static final String JSON_PROPERTY_AGENT_PROXIES = "agentProxies";
  private List<AgentProxy> agentProxies = new ArrayList<>();

  public AgentProxies() { 
  }

  public AgentProxies agentProxies(List<AgentProxy> agentProxies) {
    this.agentProxies = agentProxies;
    return this;
  }

  public AgentProxies addAgentProxiesItem(AgentProxy agentProxiesItem) {
    if (this.agentProxies == null) {
      this.agentProxies = new ArrayList<>();
    }
    this.agentProxies.add(agentProxiesItem);
    return this;
  }

   /**
   * Get agentProxies
   * @return agentProxies
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_PROXIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AgentProxy> getAgentProxies() {
    return agentProxies;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_PROXIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentProxies(List<AgentProxy> agentProxies) {
    this.agentProxies = agentProxies;
  }


  /**
   * Return true if this AgentProxies object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentProxies agentProxies = (AgentProxies) o;
    return Objects.equals(this.agentProxies, agentProxies.agentProxies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentProxies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentProxies {\n");
    sb.append("    agentProxies: ").append(toIndentedString(agentProxies)).append("\n");
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

