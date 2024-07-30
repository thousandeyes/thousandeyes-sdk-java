/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
 *
 * The version of the OpenAPI document: 7.0.12
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
import com.thousandeyes.sdk.tests.results.model.Agent;
import com.thousandeyes.sdk.tests.results.model.TestResultAppLinks;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DnsServerTestResult
 */
@JsonPropertyOrder({
  DnsServerTestResult.JSON_PROPERTY_DATE,
  DnsServerTestResult.JSON_PROPERTY_ROUND_ID,
  DnsServerTestResult.JSON_PROPERTY_LINKS,
  DnsServerTestResult.JSON_PROPERTY_START_TIME,
  DnsServerTestResult.JSON_PROPERTY_END_TIME,
  DnsServerTestResult.JSON_PROPERTY_AGENT,
  DnsServerTestResult.JSON_PROPERTY_SERVER_ID,
  DnsServerTestResult.JSON_PROPERTY_SERVER,
  DnsServerTestResult.JSON_PROPERTY_RESOLUTION_TIME,
  DnsServerTestResult.JSON_PROPERTY_ERROR_DETAILS,
  DnsServerTestResult.JSON_PROPERTY_MAPPINGS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class DnsServerTestResult {
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
  private Agent agent;

  public static final String JSON_PROPERTY_SERVER_ID = "serverId";
  private String serverId;

  public static final String JSON_PROPERTY_SERVER = "server";
  private String server;

  public static final String JSON_PROPERTY_RESOLUTION_TIME = "resolutionTime";
  private Integer resolutionTime;

  public static final String JSON_PROPERTY_ERROR_DETAILS = "errorDetails";
  private String errorDetails;

  public static final String JSON_PROPERTY_MAPPINGS = "mappings";
  private String mappings;

  public DnsServerTestResult() { 
  }

  @JsonCreator
  public DnsServerTestResult(
    @JsonProperty(JSON_PROPERTY_DATE) OffsetDateTime date, 
    @JsonProperty(JSON_PROPERTY_ROUND_ID) Integer roundId, 
    @JsonProperty(JSON_PROPERTY_START_TIME) Integer startTime, 
    @JsonProperty(JSON_PROPERTY_END_TIME) Integer endTime, 
    @JsonProperty(JSON_PROPERTY_SERVER_ID) String serverId, 
    @JsonProperty(JSON_PROPERTY_SERVER) String server, 
    @JsonProperty(JSON_PROPERTY_RESOLUTION_TIME) Integer resolutionTime, 
    @JsonProperty(JSON_PROPERTY_ERROR_DETAILS) String errorDetails, 
    @JsonProperty(JSON_PROPERTY_MAPPINGS) String mappings
  ) {
  this();
    this.date = date;
    this.roundId = roundId;
    this.startTime = startTime;
    this.endTime = endTime;
    this.serverId = serverId;
    this.server = server;
    this.resolutionTime = resolutionTime;
    this.errorDetails = errorDetails;
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




  public DnsServerTestResult links(TestResultAppLinks links) {
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




  public DnsServerTestResult agent(Agent agent) {
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

  public Agent getAgent() {
    return agent;
  }


  @JsonProperty(JSON_PROPERTY_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgent(Agent agent) {
    this.agent = agent;
  }


   /**
   * Internal ID of DNS server being tested
   * @return serverId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServerId() {
    return serverId;
  }




   /**
   * Canonical name of server being tested
   * @return server
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServer() {
    return server;
  }




   /**
   * How long it took to run the query against the serverow long it took to run the query against the server
   * @return resolutionTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOLUTION_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getResolutionTime() {
    return resolutionTime;
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
   * Return true if this DnsServerTestResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsServerTestResult dnsServerTestResult = (DnsServerTestResult) o;
    return Objects.equals(this.date, dnsServerTestResult.date) &&
        Objects.equals(this.roundId, dnsServerTestResult.roundId) &&
        Objects.equals(this.links, dnsServerTestResult.links) &&
        Objects.equals(this.startTime, dnsServerTestResult.startTime) &&
        Objects.equals(this.endTime, dnsServerTestResult.endTime) &&
        Objects.equals(this.agent, dnsServerTestResult.agent) &&
        Objects.equals(this.serverId, dnsServerTestResult.serverId) &&
        Objects.equals(this.server, dnsServerTestResult.server) &&
        Objects.equals(this.resolutionTime, dnsServerTestResult.resolutionTime) &&
        Objects.equals(this.errorDetails, dnsServerTestResult.errorDetails) &&
        Objects.equals(this.mappings, dnsServerTestResult.mappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, roundId, links, startTime, endTime, agent, serverId, server, resolutionTime, errorDetails, mappings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsServerTestResult {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    resolutionTime: ").append(toIndentedString(resolutionTime)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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

