/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests.results.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.tests.results.model.TestResultAgent;
import com.thousandeyes.sdk.tests.results.model.TestResultAppLinks;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DnsTraceTestResult
 */
@JsonPropertyOrder({
  DnsTraceTestResult.JSON_PROPERTY_DATE,
  DnsTraceTestResult.JSON_PROPERTY_ROUND_ID,
  DnsTraceTestResult.JSON_PROPERTY_LINKS,
  DnsTraceTestResult.JSON_PROPERTY_START_TIME,
  DnsTraceTestResult.JSON_PROPERTY_END_TIME,
  DnsTraceTestResult.JSON_PROPERTY_AGENT,
  DnsTraceTestResult.JSON_PROPERTY_OUTPUT,
  DnsTraceTestResult.JSON_PROPERTY_ERROR_DETAILS,
  DnsTraceTestResult.JSON_PROPERTY_QUERIES,
  DnsTraceTestResult.JSON_PROPERTY_FAILED_QUERIES,
  DnsTraceTestResult.JSON_PROPERTY_FINAL_SERVER_QUERIED,
  DnsTraceTestResult.JSON_PROPERTY_FINAL_QUERY_TIME,
  DnsTraceTestResult.JSON_PROPERTY_MAPPINGS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class DnsTraceTestResult {
  public static final String JSON_PROPERTY_DATE = "date";
  private OffsetDateTime date;

  public static final String JSON_PROPERTY_ROUND_ID = "roundId";
  private Integer roundId;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private TestResultAppLinks links;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private Integer startTime;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private Integer endTime;

  public static final String JSON_PROPERTY_AGENT = "agent";
  private TestResultAgent agent;

  public static final String JSON_PROPERTY_OUTPUT = "output";
  private String output;

  public static final String JSON_PROPERTY_ERROR_DETAILS = "errorDetails";
  private String errorDetails;

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private Integer queries;

  public static final String JSON_PROPERTY_FAILED_QUERIES = "failedQueries";
  private Integer failedQueries;

  public static final String JSON_PROPERTY_FINAL_SERVER_QUERIED = "finalServerQueried";
  private String finalServerQueried;

  public static final String JSON_PROPERTY_FINAL_QUERY_TIME = "finalQueryTime";
  private Integer finalQueryTime;

  public static final String JSON_PROPERTY_MAPPINGS = "mappings";
  private String mappings;

  public DnsTraceTestResult() { 
  }

  @JsonCreator
  public DnsTraceTestResult(
    @JsonProperty(JSON_PROPERTY_DATE) OffsetDateTime date, 
    @JsonProperty(JSON_PROPERTY_ROUND_ID) Integer roundId, 
    @JsonProperty(JSON_PROPERTY_START_TIME) Integer startTime, 
    @JsonProperty(JSON_PROPERTY_END_TIME) Integer endTime, 
    @JsonProperty(JSON_PROPERTY_OUTPUT) String output, 
    @JsonProperty(JSON_PROPERTY_ERROR_DETAILS) String errorDetails, 
    @JsonProperty(JSON_PROPERTY_QUERIES) Integer queries, 
    @JsonProperty(JSON_PROPERTY_FAILED_QUERIES) Integer failedQueries, 
    @JsonProperty(JSON_PROPERTY_FINAL_SERVER_QUERIED) String finalServerQueried, 
    @JsonProperty(JSON_PROPERTY_FINAL_QUERY_TIME) Integer finalQueryTime, 
    @JsonProperty(JSON_PROPERTY_MAPPINGS) String mappings
  ) {
  this();
    this.date = date;
    this.roundId = roundId;
    this.startTime = startTime;
    this.endTime = endTime;
    this.output = output;
    this.errorDetails = errorDetails;
    this.queries = queries;
    this.failedQueries = failedQueries;
    this.finalServerQueried = finalServerQueried;
    this.finalQueryTime = finalQueryTime;
    this.mappings = mappings;
  }

   /**
   * Data point date UTC (ISO date-time format).
   * @return date
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDate() {
    return date;
  }




   /**
   * Epoch time (seconds) indicating the start time of the round
   * @return roundId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROUND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRoundId() {
    return roundId;
  }




  public DnsTraceTestResult links(TestResultAppLinks links) {
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

  public TestResultAppLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(TestResultAppLinks links) {
    this.links = links;
  }


   /**
   * Epoch time (seconds) indicating the start time of the round
   * @return startTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartTime() {
    return startTime;
  }




   /**
   * Epoch time (seconds) indicating the end time of the round
   * @return endTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEndTime() {
    return endTime;
  }




  public DnsTraceTestResult agent(TestResultAgent agent) {
    this.agent = agent;
    return this;
  }

   /**
   * Get agent
   * @return agent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestResultAgent getAgent() {
    return agent;
  }


  @JsonProperty(JSON_PROPERTY_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgent(TestResultAgent agent) {
    this.agent = agent;
  }


   /**
   * Verbose output from the trace request
   * @return output
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOutput() {
    return output;
  }




   /**
   * Error details, if an error were encountered
   * @return errorDetails
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorDetails() {
    return errorDetails;
  }




   /**
   * How many queries were required to get to the requested result
   * @return queries
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getQueries() {
    return queries;
  }




   /**
   * How many queries failed while getting to the requested result
   * @return failedQueries
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILED_QUERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFailedQueries() {
    return failedQueries;
  }




   /**
   * DNS server that provided the final result
   * @return finalServerQueried
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FINAL_SERVER_QUERIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFinalServerQueried() {
    return finalServerQueried;
  }




   /**
   * How long the final query took to return a response
   * @return finalQueryTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FINAL_QUERY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFinalQueryTime() {
    return finalQueryTime;
  }




   /**
   * Final mappings returned from the request
   * @return mappings
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAPPINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMappings() {
    return mappings;
  }




  /**
   * Return true if this DnsTraceTestResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsTraceTestResult dnsTraceTestResult = (DnsTraceTestResult) o;
    return Objects.equals(this.date, dnsTraceTestResult.date) &&
        Objects.equals(this.roundId, dnsTraceTestResult.roundId) &&
        Objects.equals(this.links, dnsTraceTestResult.links) &&
        Objects.equals(this.startTime, dnsTraceTestResult.startTime) &&
        Objects.equals(this.endTime, dnsTraceTestResult.endTime) &&
        Objects.equals(this.agent, dnsTraceTestResult.agent) &&
        Objects.equals(this.output, dnsTraceTestResult.output) &&
        Objects.equals(this.errorDetails, dnsTraceTestResult.errorDetails) &&
        Objects.equals(this.queries, dnsTraceTestResult.queries) &&
        Objects.equals(this.failedQueries, dnsTraceTestResult.failedQueries) &&
        Objects.equals(this.finalServerQueried, dnsTraceTestResult.finalServerQueried) &&
        Objects.equals(this.finalQueryTime, dnsTraceTestResult.finalQueryTime) &&
        Objects.equals(this.mappings, dnsTraceTestResult.mappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, roundId, links, startTime, endTime, agent, output, errorDetails, queries, failedQueries, finalServerQueried, finalQueryTime, mappings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsTraceTestResult {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    failedQueries: ").append(toIndentedString(failedQueries)).append("\n");
    sb.append("    finalServerQueried: ").append(toIndentedString(finalServerQueried)).append("\n");
    sb.append("    finalQueryTime: ").append(toIndentedString(finalQueryTime)).append("\n");
    sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
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

