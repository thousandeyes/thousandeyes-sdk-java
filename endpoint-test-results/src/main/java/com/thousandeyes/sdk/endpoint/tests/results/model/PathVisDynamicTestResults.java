/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.6
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
import com.thousandeyes.sdk.endpoint.tests.results.model.DynamicTest;
import com.thousandeyes.sdk.endpoint.tests.results.model.PaginationNextAndSelfLink;
import com.thousandeyes.sdk.endpoint.tests.results.model.PathVisDynamicTestResult;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PathVisDynamicTestResults
 */
@JsonPropertyOrder({
  PathVisDynamicTestResults.JSON_PROPERTY_RESULTS,
  PathVisDynamicTestResults.JSON_PROPERTY_TEST,
  PathVisDynamicTestResults.JSON_PROPERTY_START_DATE,
  PathVisDynamicTestResults.JSON_PROPERTY_END_DATE,
  PathVisDynamicTestResults.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class PathVisDynamicTestResults {
  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<PathVisDynamicTestResult> results = new ArrayList<>();

  public static final String JSON_PROPERTY_TEST = "test";
  private DynamicTest test;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private OffsetDateTime endDate;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private PaginationNextAndSelfLink links;

  public PathVisDynamicTestResults() { 
  }

  @JsonCreator
  public PathVisDynamicTestResults(
    @JsonProperty(JSON_PROPERTY_START_DATE) OffsetDateTime startDate, 
    @JsonProperty(JSON_PROPERTY_END_DATE) OffsetDateTime endDate
  ) {
  this();
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public PathVisDynamicTestResults results(List<PathVisDynamicTestResult> results) {
    this.results = results;
    return this;
  }

  public PathVisDynamicTestResults addResultsItem(PathVisDynamicTestResult resultsItem) {
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

  public List<PathVisDynamicTestResult> getResults() {
    return results;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResults(List<PathVisDynamicTestResult> results) {
    this.results = results;
  }


  public PathVisDynamicTestResults test(DynamicTest test) {
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

  public DynamicTest getTest() {
    return test;
  }


  @JsonProperty(JSON_PROPERTY_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTest(DynamicTest test) {
    this.test = test;
  }


   /**
   * (Optional) When passing &#x60;window&#x60; or &#x60;startDate&#x60; parameter,  the client will also receive the &#x60;startDate&#x60; field indicating the UTC start date of the data&#39;s time range being retrieved  (ISO date-time format).
   * @return startDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartDate() {
    return startDate;
  }




   /**
   * (Optional) When passing &#x60;window&#x60; or &#x60;endDate&#x60; parameter,  the client will also receive the &#x60;endDate&#x60; field indicating the UTC end date of the data&#39;s time range being retrieved  (ISO date-time format).
   * @return endDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEndDate() {
    return endDate;
  }




  public PathVisDynamicTestResults links(PaginationNextAndSelfLink links) {
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

  public PaginationNextAndSelfLink getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(PaginationNextAndSelfLink links) {
    this.links = links;
  }


  /**
   * Return true if this PathVisDynamicTestResults object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PathVisDynamicTestResults pathVisDynamicTestResults = (PathVisDynamicTestResults) o;
    return Objects.equals(this.results, pathVisDynamicTestResults.results) &&
        Objects.equals(this.test, pathVisDynamicTestResults.test) &&
        Objects.equals(this.startDate, pathVisDynamicTestResults.startDate) &&
        Objects.equals(this.endDate, pathVisDynamicTestResults.endDate) &&
        Objects.equals(this.links, pathVisDynamicTestResults.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, test, startDate, endDate, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PathVisDynamicTestResults {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

