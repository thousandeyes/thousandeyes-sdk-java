/*
 * Endpoint Agents API
 * Manage ThousandEyes Endpoint Agents using this API.   For more information about Endpoint Agents, see [Endpoint Agents](https://docs.thousandeyes.com/product-documentation/global-vantage-points/endpoint-agents).
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.agents.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.endpoint.agents.model.AgentTransfer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AgentTransfers
 */
@JsonPropertyOrder({
  AgentTransfers.JSON_PROPERTY_TRANSFERS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T17:12:31.591476+01:00[Europe/Lisbon]")
public class AgentTransfers {
  public static final String JSON_PROPERTY_TRANSFERS = "transfers";
  private List<AgentTransfer> transfers = new ArrayList<>();

  public AgentTransfers() { 
  }

  public AgentTransfers transfers(List<AgentTransfer> transfers) {
    this.transfers = transfers;
    return this;
  }

  public AgentTransfers addTransfersItem(AgentTransfer transfersItem) {
    if (this.transfers == null) {
      this.transfers = new ArrayList<>();
    }
    this.transfers.add(transfersItem);
    return this;
  }

   /**
   * Get transfers
   * @return transfers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSFERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AgentTransfer> getTransfers() {
    return transfers;
  }


  @JsonProperty(JSON_PROPERTY_TRANSFERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransfers(List<AgentTransfer> transfers) {
    this.transfers = transfers;
  }


  /**
   * Return true if this AgentTransfers object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentTransfers agentTransfers = (AgentTransfers) o;
    return Objects.equals(this.transfers, agentTransfers.transfers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transfers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentTransfers {\n");
    sb.append("    transfers: ").append(toIndentedString(transfers)).append("\n");
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

