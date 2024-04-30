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
import com.thousandeyes.api.endpoint.tests.results.model.RealUserTestPagePageTimings;
import com.thousandeyes.api.endpoint.tests.results.model.SystemMetrics;
import java.time.OffsetDateTime;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RealUserTestPageResult
 */
@JsonPropertyOrder({
  RealUserTestPageResult.JSON_PROPERTY_PAGE_ID,
  RealUserTestPageResult.JSON_PROPERTY_PAGE_TITLE,
  RealUserTestPageResult.JSON_PROPERTY_PAGE_URL,
  RealUserTestPageResult.JSON_PROPERTY_LOAD_DATE,
  RealUserTestPageResult.JSON_PROPERTY_RESPONSE_CODE,
  RealUserTestPageResult.JSON_PROPERTY_PAGE_TIMINGS,
  RealUserTestPageResult.JSON_PROPERTY_AGENT_ID,
  RealUserTestPageResult.JSON_PROPERTY_ID,
  RealUserTestPageResult.JSON_PROPERTY_ROUND_ID,
  RealUserTestPageResult.JSON_PROPERTY_RESPONSE_TIME,
  RealUserTestPageResult.JSON_PROPERTY_SYSTEM_METRICS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-30T10:06:13.283389+01:00[Europe/Lisbon]")
public class RealUserTestPageResult {
  public static final String JSON_PROPERTY_PAGE_ID = "pageId";
  private String pageId;

  public static final String JSON_PROPERTY_PAGE_TITLE = "pageTitle";
  private String pageTitle;

  public static final String JSON_PROPERTY_PAGE_URL = "pageUrl";
  private String pageUrl;

  public static final String JSON_PROPERTY_LOAD_DATE = "loadDate";
  private OffsetDateTime loadDate;

  public static final String JSON_PROPERTY_RESPONSE_CODE = "responseCode";
  private Integer responseCode;

  public static final String JSON_PROPERTY_PAGE_TIMINGS = "pageTimings";
  private RealUserTestPagePageTimings pageTimings;

  public static final String JSON_PROPERTY_AGENT_ID = "agentId";
  private UUID agentId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ROUND_ID = "roundId";
  private Integer roundId;

  public static final String JSON_PROPERTY_RESPONSE_TIME = "responseTime";
  private Integer responseTime;

  public static final String JSON_PROPERTY_SYSTEM_METRICS = "systemMetrics";
  private SystemMetrics systemMetrics;

  public RealUserTestPageResult() { 
  }

  @JsonCreator
  public RealUserTestPageResult(
    @JsonProperty(JSON_PROPERTY_PAGE_ID) String pageId, 
    @JsonProperty(JSON_PROPERTY_PAGE_TITLE) String pageTitle, 
    @JsonProperty(JSON_PROPERTY_PAGE_URL) String pageUrl, 
    @JsonProperty(JSON_PROPERTY_LOAD_DATE) OffsetDateTime loadDate, 
    @JsonProperty(JSON_PROPERTY_RESPONSE_CODE) Integer responseCode, 
    @JsonProperty(JSON_PROPERTY_AGENT_ID) UUID agentId, 
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_ROUND_ID) Integer roundId, 
    @JsonProperty(JSON_PROPERTY_RESPONSE_TIME) Integer responseTime
  ) {
  this();
    this.pageId = pageId;
    this.pageTitle = pageTitle;
    this.pageUrl = pageUrl;
    this.loadDate = loadDate;
    this.responseCode = responseCode;
    this.agentId = agentId;
    this.id = id;
    this.roundId = roundId;
    this.responseTime = responseTime;
  }

   /**
   * Web page ID. The page ID is unique only within an endpoint real user test.
   * @return pageId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPageId() {
    return pageId;
  }




   /**
   * Web page title.
   * @return pageTitle
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPageTitle() {
    return pageTitle;
  }




   /**
   * Web page url
   * @return pageUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPageUrl() {
    return pageUrl;
  }




   /**
   * UTC date when page load started (ISO date-time format).
   * @return loadDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOAD_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLoadDate() {
    return loadDate;
  }




   /**
   * HTTP response code.
   * @return responseCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getResponseCode() {
    return responseCode;
  }




  public RealUserTestPageResult pageTimings(RealUserTestPagePageTimings pageTimings) {
    this.pageTimings = pageTimings;
    return this;
  }

   /**
   * Get pageTimings
   * @return pageTimings
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_TIMINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RealUserTestPagePageTimings getPageTimings() {
    return pageTimings;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_TIMINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageTimings(RealUserTestPagePageTimings pageTimings) {
    this.pageTimings = pageTimings;
  }


   /**
   * Unique ID of endpoint agent, from &#x60;/endpoint/agents&#x60; endpoint.
   * @return agentId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getAgentId() {
    return agentId;
  }




   /**
   * Endpoint real user test ID. Each endpoint real user test occurrence has a unique ID.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




   /**
   * Epoch time (seconds) indicating the start time of the round.
   * @return roundId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROUND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRoundId() {
    return roundId;
  }




   /**
   * HTTP server response in milliseconds.
   * @return responseTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getResponseTime() {
    return responseTime;
  }




  public RealUserTestPageResult systemMetrics(SystemMetrics systemMetrics) {
    this.systemMetrics = systemMetrics;
    return this;
  }

   /**
   * Get systemMetrics
   * @return systemMetrics
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYSTEM_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SystemMetrics getSystemMetrics() {
    return systemMetrics;
  }


  @JsonProperty(JSON_PROPERTY_SYSTEM_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSystemMetrics(SystemMetrics systemMetrics) {
    this.systemMetrics = systemMetrics;
  }


  /**
   * Return true if this RealUserTestPageResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealUserTestPageResult realUserTestPageResult = (RealUserTestPageResult) o;
    return Objects.equals(this.pageId, realUserTestPageResult.pageId) &&
        Objects.equals(this.pageTitle, realUserTestPageResult.pageTitle) &&
        Objects.equals(this.pageUrl, realUserTestPageResult.pageUrl) &&
        Objects.equals(this.loadDate, realUserTestPageResult.loadDate) &&
        Objects.equals(this.responseCode, realUserTestPageResult.responseCode) &&
        Objects.equals(this.pageTimings, realUserTestPageResult.pageTimings) &&
        Objects.equals(this.agentId, realUserTestPageResult.agentId) &&
        Objects.equals(this.id, realUserTestPageResult.id) &&
        Objects.equals(this.roundId, realUserTestPageResult.roundId) &&
        Objects.equals(this.responseTime, realUserTestPageResult.responseTime) &&
        Objects.equals(this.systemMetrics, realUserTestPageResult.systemMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageId, pageTitle, pageUrl, loadDate, responseCode, pageTimings, agentId, id, roundId, responseTime, systemMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealUserTestPageResult {\n");
    sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
    sb.append("    pageTitle: ").append(toIndentedString(pageTitle)).append("\n");
    sb.append("    pageUrl: ").append(toIndentedString(pageUrl)).append("\n");
    sb.append("    loadDate: ").append(toIndentedString(loadDate)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    pageTimings: ").append(toIndentedString(pageTimings)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
    sb.append("    systemMetrics: ").append(toIndentedString(systemMetrics)).append("\n");
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

