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
import com.thousandeyes.api.endpoint.tests.results.model.EndpointRealUserTestResultRequestFilter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EndpointRealUserTestResultsRequest
 */
@JsonPropertyOrder({
  EndpointRealUserTestResultsRequest.JSON_PROPERTY_SEARCH_FILTERS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T13:50:10.282697+01:00[Europe/Lisbon]")
public class EndpointRealUserTestResultsRequest {
  public static final String JSON_PROPERTY_SEARCH_FILTERS = "searchFilters";
  private EndpointRealUserTestResultRequestFilter searchFilters;

  public EndpointRealUserTestResultsRequest() { 
  }

  public EndpointRealUserTestResultsRequest searchFilters(EndpointRealUserTestResultRequestFilter searchFilters) {
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

  public EndpointRealUserTestResultRequestFilter getSearchFilters() {
    return searchFilters;
  }


  @JsonProperty(JSON_PROPERTY_SEARCH_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchFilters(EndpointRealUserTestResultRequestFilter searchFilters) {
    this.searchFilters = searchFilters;
  }


  /**
   * Return true if this EndpointRealUserTestResultsRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointRealUserTestResultsRequest endpointRealUserTestResultsRequest = (EndpointRealUserTestResultsRequest) o;
    return Objects.equals(this.searchFilters, endpointRealUserTestResultsRequest.searchFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchFilters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointRealUserTestResultsRequest {\n");
    sb.append("    searchFilters: ").append(toIndentedString(searchFilters)).append("\n");
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
