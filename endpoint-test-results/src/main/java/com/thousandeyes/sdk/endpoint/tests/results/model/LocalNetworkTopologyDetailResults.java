/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.tests.results.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.endpoint.tests.results.model.LocalNetworkTopologyResult;
import com.thousandeyes.sdk.endpoint.tests.results.model.SelfLinks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * LocalNetworkTopologyDetailResults
 */
@JsonPropertyOrder({
  LocalNetworkTopologyDetailResults.JSON_PROPERTY_RESULTS,
  LocalNetworkTopologyDetailResults.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class LocalNetworkTopologyDetailResults {
  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<LocalNetworkTopologyResult> results = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinks links;

  public LocalNetworkTopologyDetailResults() { 
  }

  public LocalNetworkTopologyDetailResults results(List<LocalNetworkTopologyResult> results) {
    this.results = results;
    return this;
  }

  public LocalNetworkTopologyDetailResults addResultsItem(LocalNetworkTopologyResult resultsItem) {
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

  public List<LocalNetworkTopologyResult> getResults() {
    return results;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResults(List<LocalNetworkTopologyResult> results) {
    this.results = results;
  }


  public LocalNetworkTopologyDetailResults links(SelfLinks links) {
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
   * Return true if this LocalNetworkTopologyDetailResults object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalNetworkTopologyDetailResults localNetworkTopologyDetailResults = (LocalNetworkTopologyDetailResults) o;
    return Objects.equals(this.results, localNetworkTopologyDetailResults.results) &&
        Objects.equals(this.links, localNetworkTopologyDetailResults.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalNetworkTopologyDetailResults {\n");
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

