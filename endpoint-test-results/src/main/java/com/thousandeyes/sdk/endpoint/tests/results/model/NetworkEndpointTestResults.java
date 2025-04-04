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
import com.thousandeyes.sdk.endpoint.tests.results.model.EndpointScheduledTest;
import com.thousandeyes.sdk.endpoint.tests.results.model.NetworkEndpointTestResult;
import com.thousandeyes.sdk.endpoint.tests.results.model.PaginationNextLink;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * NetworkEndpointTestResults
 */
@JsonPropertyOrder({
  NetworkEndpointTestResults.JSON_PROPERTY_RESULTS,
  NetworkEndpointTestResults.JSON_PROPERTY_TOTAL_HITS,
  NetworkEndpointTestResults.JSON_PROPERTY_TEST,
  NetworkEndpointTestResults.JSON_PROPERTY_START_DATE,
  NetworkEndpointTestResults.JSON_PROPERTY_END_DATE,
  NetworkEndpointTestResults.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class NetworkEndpointTestResults {
  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<NetworkEndpointTestResult> results = new ArrayList<>();

  public static final String JSON_PROPERTY_TOTAL_HITS = "totalHits";
  private Integer totalHits;

  public static final String JSON_PROPERTY_TEST = "test";
  private EndpointScheduledTest test;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private OffsetDateTime endDate;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private PaginationNextLink links;

  public NetworkEndpointTestResults() { 
  }

  @JsonCreator
  public NetworkEndpointTestResults(
    @JsonProperty(JSON_PROPERTY_START_DATE) OffsetDateTime startDate, 
    @JsonProperty(JSON_PROPERTY_END_DATE) OffsetDateTime endDate
  ) {
  this();
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public NetworkEndpointTestResults results(List<NetworkEndpointTestResult> results) {
    this.results = results;
    return this;
  }

  public NetworkEndpointTestResults addResultsItem(NetworkEndpointTestResult resultsItem) {
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

  public List<NetworkEndpointTestResult> getResults() {
    return results;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResults(List<NetworkEndpointTestResult> results) {
    this.results = results;
  }


  public NetworkEndpointTestResults totalHits(Integer totalHits) {
    this.totalHits = totalHits;
    return this;
  }

   /**
   * Total number of measurements that match the search criteria.
   * @return totalHits
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_HITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalHits() {
    return totalHits;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_HITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalHits(Integer totalHits) {
    this.totalHits = totalHits;
  }


  public NetworkEndpointTestResults test(EndpointScheduledTest test) {
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




  public NetworkEndpointTestResults links(PaginationNextLink links) {
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
   * Return true if this NetworkEndpointTestResults object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkEndpointTestResults networkEndpointTestResults = (NetworkEndpointTestResults) o;
    return Objects.equals(this.results, networkEndpointTestResults.results) &&
        Objects.equals(this.totalHits, networkEndpointTestResults.totalHits) &&
        Objects.equals(this.test, networkEndpointTestResults.test) &&
        Objects.equals(this.startDate, networkEndpointTestResults.startDate) &&
        Objects.equals(this.endDate, networkEndpointTestResults.endDate) &&
        Objects.equals(this.links, networkEndpointTestResults.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, totalHits, test, startDate, endDate, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkEndpointTestResults {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    totalHits: ").append(toIndentedString(totalHits)).append("\n");
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

