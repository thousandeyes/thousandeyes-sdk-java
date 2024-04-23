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
import com.thousandeyes.api.endpoint.tests.results.model.EndpointScheduledTest;
import com.thousandeyes.api.endpoint.tests.results.model.PathVisDetailTestResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PathVisDetailTestResults
 */
@JsonPropertyOrder({
  PathVisDetailTestResults.JSON_PROPERTY_RESULTS,
  PathVisDetailTestResults.JSON_PROPERTY_TEST
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T16:57:45.229088+01:00[Europe/Lisbon]")
public class PathVisDetailTestResults {
  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<PathVisDetailTestResult> results = new ArrayList<>();

  public static final String JSON_PROPERTY_TEST = "test";
  private EndpointScheduledTest test;

  public PathVisDetailTestResults() { 
  }

  public PathVisDetailTestResults results(List<PathVisDetailTestResult> results) {
    this.results = results;
    return this;
  }

  public PathVisDetailTestResults addresultsItem(PathVisDetailTestResult resultsItem) {
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

  public List<PathVisDetailTestResult> getResults() {
    return results;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResults(List<PathVisDetailTestResult> results) {
    this.results = results;
  }


  public PathVisDetailTestResults test(EndpointScheduledTest test) {
    this.test = test;
    return this;
  }

   /**
   * Get test
   * @return test
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EndpointScheduledTest getTest() {
    return test;
  }


  @JsonProperty(JSON_PROPERTY_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTest(EndpointScheduledTest test) {
    this.test = test;
  }


  /**
   * Return true if this PathVisDetailTestResults object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PathVisDetailTestResults pathVisDetailTestResults = (PathVisDetailTestResults) o;
    return Objects.equals(this.results, pathVisDetailTestResults.results) &&
        Objects.equals(this.test, pathVisDetailTestResults.test);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, test);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PathVisDetailTestResults {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
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

