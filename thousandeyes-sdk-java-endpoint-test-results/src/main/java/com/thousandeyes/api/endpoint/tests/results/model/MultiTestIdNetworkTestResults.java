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
import com.thousandeyes.api.endpoint.tests.results.model.NetworkTestResult;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * MultiTestIdNetworkTestResults
 */
@JsonPropertyOrder({
  MultiTestIdNetworkTestResults.JSON_PROPERTY_RESULTS,
  MultiTestIdNetworkTestResults.JSON_PROPERTY_TOTAL_HITS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-30T10:06:13.283389+01:00[Europe/Lisbon]")
public class MultiTestIdNetworkTestResults {
  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<NetworkTestResult> results = new ArrayList<>();

  public static final String JSON_PROPERTY_TOTAL_HITS = "totalHits";
  private BigDecimal totalHits;

  public MultiTestIdNetworkTestResults() { 
  }

  public MultiTestIdNetworkTestResults results(List<NetworkTestResult> results) {
    this.results = results;
    return this;
  }

  public MultiTestIdNetworkTestResults addResultsItem(NetworkTestResult resultsItem) {
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

  public List<NetworkTestResult> getResults() {
    return results;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResults(List<NetworkTestResult> results) {
    this.results = results;
  }


  public MultiTestIdNetworkTestResults totalHits(BigDecimal totalHits) {
    this.totalHits = totalHits;
    return this;
  }

   /**
   * Total number of measurements that match the search criteria
   * @return totalHits
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_HITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTotalHits() {
    return totalHits;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_HITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalHits(BigDecimal totalHits) {
    this.totalHits = totalHits;
  }


  /**
   * Return true if this MultiTestIdNetworkTestResults object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiTestIdNetworkTestResults multiTestIdNetworkTestResults = (MultiTestIdNetworkTestResults) o;
    return Objects.equals(this.results, multiTestIdNetworkTestResults.results) &&
        Objects.equals(this.totalHits, multiTestIdNetworkTestResults.totalHits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, totalHits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiTestIdNetworkTestResults {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    totalHits: ").append(toIndentedString(totalHits)).append("\n");
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

