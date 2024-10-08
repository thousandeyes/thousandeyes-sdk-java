/*
 * Endpoint Agents API
 * Manage ThousandEyes Endpoint Agents using this API.   For more information about Endpoint Agents, see [Endpoint Agents](https://docs.thousandeyes.com/product-documentation/global-vantage-points/endpoint-agents).
 *
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
import com.thousandeyes.sdk.endpoint.agents.model.PaginationNextLink;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * FilterEndpointAgentsResponse
 */
@JsonPropertyOrder({
  FilterEndpointAgentsResponse.JSON_PROPERTY_TOTAL_AGENTS,
  FilterEndpointAgentsResponse.JSON_PROPERTY_AGENTS,
  FilterEndpointAgentsResponse.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class FilterEndpointAgentsResponse {
  public static final String JSON_PROPERTY_TOTAL_AGENTS = "totalAgents";
  private Integer totalAgents;

  public static final String JSON_PROPERTY_AGENTS = "agents";
  private List<EndpointAgent> agents = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKS = "_links";
  private PaginationNextLink links;

  public FilterEndpointAgentsResponse() { 
  }

  public FilterEndpointAgentsResponse totalAgents(Integer totalAgents) {
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


  public FilterEndpointAgentsResponse agents(List<EndpointAgent> agents) {
    this.agents = agents;
    return this;
  }

  public FilterEndpointAgentsResponse addAgentsItem(EndpointAgent agentsItem) {
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


  public FilterEndpointAgentsResponse links(PaginationNextLink links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaginationNextLink getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(PaginationNextLink links) {
    this.links = links;
  }


  /**
   * Return true if this FilterEndpointAgentsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterEndpointAgentsResponse filterEndpointAgentsResponse = (FilterEndpointAgentsResponse) o;
    return Objects.equals(this.totalAgents, filterEndpointAgentsResponse.totalAgents) &&
        Objects.equals(this.agents, filterEndpointAgentsResponse.agents) &&
        Objects.equals(this.links, filterEndpointAgentsResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAgents, agents, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterEndpointAgentsResponse {\n");
    sb.append("    totalAgents: ").append(toIndentedString(totalAgents)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

