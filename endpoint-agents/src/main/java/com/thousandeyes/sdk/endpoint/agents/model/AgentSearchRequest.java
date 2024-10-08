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
import com.thousandeyes.sdk.endpoint.agents.model.AgentSearchFilters;
import com.thousandeyes.sdk.endpoint.agents.model.AgentSearchSort;
import com.thousandeyes.sdk.endpoint.agents.model.AgentThresholdFilters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Parameters for filtering a list of agents.
 */
@JsonPropertyOrder({
  AgentSearchRequest.JSON_PROPERTY_SEARCH_FILTERS,
  AgentSearchRequest.JSON_PROPERTY_THRESHOLD_FILTER,
  AgentSearchRequest.JSON_PROPERTY_SEARCH_SORT
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class AgentSearchRequest {
  public static final String JSON_PROPERTY_SEARCH_FILTERS = "searchFilters";
  private AgentSearchFilters searchFilters;

  public static final String JSON_PROPERTY_THRESHOLD_FILTER = "thresholdFilter";
  private AgentThresholdFilters thresholdFilter;

  public static final String JSON_PROPERTY_SEARCH_SORT = "searchSort";
  private List<AgentSearchSort> searchSort = new ArrayList<>();

  public AgentSearchRequest() { 
  }

  public AgentSearchRequest searchFilters(AgentSearchFilters searchFilters) {
    this.searchFilters = searchFilters;
    return this;
  }

   /**
   * Get searchFilters
   * @return searchFilters
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEARCH_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AgentSearchFilters getSearchFilters() {
    return searchFilters;
  }


  @JsonProperty(JSON_PROPERTY_SEARCH_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchFilters(AgentSearchFilters searchFilters) {
    this.searchFilters = searchFilters;
  }


  public AgentSearchRequest thresholdFilter(AgentThresholdFilters thresholdFilter) {
    this.thresholdFilter = thresholdFilter;
    return this;
  }

   /**
   * Get thresholdFilter
   * @return thresholdFilter
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THRESHOLD_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AgentThresholdFilters getThresholdFilter() {
    return thresholdFilter;
  }


  @JsonProperty(JSON_PROPERTY_THRESHOLD_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThresholdFilter(AgentThresholdFilters thresholdFilter) {
    this.thresholdFilter = thresholdFilter;
  }


  public AgentSearchRequest searchSort(List<AgentSearchSort> searchSort) {
    this.searchSort = searchSort;
    return this;
  }

  public AgentSearchRequest addSearchSortItem(AgentSearchSort searchSortItem) {
    if (this.searchSort == null) {
      this.searchSort = new ArrayList<>();
    }
    this.searchSort.add(searchSortItem);
    return this;
  }

   /**
   * Get searchSort
   * @return searchSort
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEARCH_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AgentSearchSort> getSearchSort() {
    return searchSort;
  }


  @JsonProperty(JSON_PROPERTY_SEARCH_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchSort(List<AgentSearchSort> searchSort) {
    this.searchSort = searchSort;
  }


  /**
   * Return true if this AgentSearchRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentSearchRequest agentSearchRequest = (AgentSearchRequest) o;
    return Objects.equals(this.searchFilters, agentSearchRequest.searchFilters) &&
        Objects.equals(this.thresholdFilter, agentSearchRequest.thresholdFilter) &&
        Objects.equals(this.searchSort, agentSearchRequest.searchSort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchFilters, thresholdFilter, searchSort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentSearchRequest {\n");
    sb.append("    searchFilters: ").append(toIndentedString(searchFilters)).append("\n");
    sb.append("    thresholdFilter: ").append(toIndentedString(thresholdFilter)).append("\n");
    sb.append("    searchSort: ").append(toIndentedString(searchSort)).append("\n");
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

