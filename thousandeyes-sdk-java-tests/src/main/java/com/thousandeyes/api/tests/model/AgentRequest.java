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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AgentRequest
 */
@JsonPropertyOrder({
  AgentRequest.JSON_PROPERTY_AGENT_ID,
  AgentRequest.JSON_PROPERTY_SOURCE_IP_ADDRESS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T13:50:11.174036+01:00[Europe/Lisbon]")
public class AgentRequest {
  public static final String JSON_PROPERTY_AGENT_ID = "agentId";
  private String agentId;

  public static final String JSON_PROPERTY_SOURCE_IP_ADDRESS = "sourceIpAddress";
  private String sourceIpAddress;

  public AgentRequest() { 
  }

  public AgentRequest agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }

   /**
   * Agent Id (get &#x60;agentId&#x60; from &#x60;/agents&#x60; endpoint)
   * @return agentId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAgentId() {
    return agentId;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }


  public AgentRequest sourceIpAddress(String sourceIpAddress) {
    this.sourceIpAddress = sourceIpAddress;
    return this;
  }

   /**
   * IP address from &#x60;ipAddresses&#x60; of Agent Details for interface selection (get &#x60;ipAddresses&#x60; from &#x60;/agents&#x60; endpoint)
   * @return sourceIpAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceIpAddress() {
    return sourceIpAddress;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceIpAddress(String sourceIpAddress) {
    this.sourceIpAddress = sourceIpAddress;
  }


  /**
   * Return true if this AgentRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentRequest agentRequest = (AgentRequest) o;
    return Objects.equals(this.agentId, agentRequest.agentId) &&
        Objects.equals(this.sourceIpAddress, agentRequest.sourceIpAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, sourceIpAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentRequest {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    sourceIpAddress: ").append(toIndentedString(sourceIpAddress)).append("\n");
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
