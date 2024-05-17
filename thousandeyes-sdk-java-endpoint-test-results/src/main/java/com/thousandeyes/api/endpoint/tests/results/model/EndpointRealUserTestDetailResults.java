/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.4
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
import com.thousandeyes.api.endpoint.tests.results.model.EndpointRealUserTestDetail;
import com.thousandeyes.api.endpoint.tests.results.model.SelfLinks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EndpointRealUserTestDetailResults
 */
@JsonPropertyOrder({
  EndpointRealUserTestDetailResults.JSON_PROPERTY_RESULTS,
  EndpointRealUserTestDetailResults.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-05-17T09:32:26.589642+01:00[Europe/Lisbon]")
public class EndpointRealUserTestDetailResults {
  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<EndpointRealUserTestDetail> results;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinks links;

  public EndpointRealUserTestDetailResults() { 
  }

  public EndpointRealUserTestDetailResults results(List<EndpointRealUserTestDetail> results) {
    this.results = results;
    return this;
  }

  public EndpointRealUserTestDetailResults addItem(EndpointRealUserTestDetail resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EndpointRealUserTestDetail> getResults() {
    return results;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResults(List<EndpointRealUserTestDetail> results) {
    this.results = results;
  }


  public EndpointRealUserTestDetailResults links(SelfLinks links) {
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

  public SelfLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(SelfLinks links) {
    this.links = links;
  }


  /**
   * Return true if this EndpointRealUserTestDetailResults object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointRealUserTestDetailResults endpointRealUserTestDetailResults = (EndpointRealUserTestDetailResults) o;
    return Objects.equals(this.results, endpointRealUserTestDetailResults.results) &&
        Objects.equals(this.links, endpointRealUserTestDetailResults.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointRealUserTestDetailResults {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

