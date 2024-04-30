/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.tests.results.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.tests.results.model.Agent;
import com.thousandeyes.api.tests.results.model.Marker;
import com.thousandeyes.api.tests.results.model.Page;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * WebTransactionPageDetailTestResult
 */
@JsonPropertyOrder({
  WebTransactionPageDetailTestResult.JSON_PROPERTY_DATE,
  WebTransactionPageDetailTestResult.JSON_PROPERTY_ROUND_ID,
  WebTransactionPageDetailTestResult.JSON_PROPERTY_LINKS,
  WebTransactionPageDetailTestResult.JSON_PROPERTY_AGENT,
  WebTransactionPageDetailTestResult.JSON_PROPERTY_COMPONENT_ERRORS,
  WebTransactionPageDetailTestResult.JSON_PROPERTY_TRANSACTION_TIME,
  WebTransactionPageDetailTestResult.JSON_PROPERTY_ERROR_TYPE,
  WebTransactionPageDetailTestResult.JSON_PROPERTY_ERROR_DETAILS,
  WebTransactionPageDetailTestResult.JSON_PROPERTY_MARKERS,
  WebTransactionPageDetailTestResult.JSON_PROPERTY_PAGES,
  WebTransactionPageDetailTestResult.JSON_PROPERTY_HAR
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-30T10:06:14.116034+01:00[Europe/Lisbon]")
public class WebTransactionPageDetailTestResult {
  public static final String JSON_PROPERTY_DATE = "date";
  private OffsetDateTime date;

  public static final String JSON_PROPERTY_ROUND_ID = "roundId";
  private Integer roundId;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private Object links;

  public static final String JSON_PROPERTY_AGENT = "agent";
  private Agent agent;

  public static final String JSON_PROPERTY_COMPONENT_ERRORS = "componentErrors";
  private Integer componentErrors;

  public static final String JSON_PROPERTY_TRANSACTION_TIME = "transactionTime";
  private Integer transactionTime;

  public static final String JSON_PROPERTY_ERROR_TYPE = "errorType";
  private String errorType;

  public static final String JSON_PROPERTY_ERROR_DETAILS = "errorDetails";
  private String errorDetails;

  public static final String JSON_PROPERTY_MARKERS = "markers";
  private List<Marker> markers = new ArrayList<>();

  public static final String JSON_PROPERTY_PAGES = "pages";
  private List<Page> pages = new ArrayList<>();

  public static final String JSON_PROPERTY_HAR = "har";
  private Object har;

  public WebTransactionPageDetailTestResult() { 
  }

  @JsonCreator
  public WebTransactionPageDetailTestResult(
    @JsonProperty(JSON_PROPERTY_DATE) OffsetDateTime date, 
    @JsonProperty(JSON_PROPERTY_ROUND_ID) Integer roundId, 
    @JsonProperty(JSON_PROPERTY_COMPONENT_ERRORS) Integer componentErrors, 
    @JsonProperty(JSON_PROPERTY_TRANSACTION_TIME) Integer transactionTime, 
    @JsonProperty(JSON_PROPERTY_ERROR_TYPE) String errorType, 
    @JsonProperty(JSON_PROPERTY_ERROR_DETAILS) String errorDetails, 
    @JsonProperty(JSON_PROPERTY_HAR) Object har
  ) {
  this();
    this.date = date;
    this.roundId = roundId;
    this.componentErrors = componentErrors;
    this.transactionTime = transactionTime;
    this.errorType = errorType;
    this.errorDetails = errorDetails;
    this.har = har;
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




  public WebTransactionPageDetailTestResult links(Object links) {
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

  public Object getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(Object links) {
    this.links = links;
  }


  public WebTransactionPageDetailTestResult agent(Agent agent) {
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
   * Number of components which did not successfully load
   * @return componentErrors
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENT_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getComponentErrors() {
    return componentErrors;
  }




   /**
   * Elapsed execution time of the web transaction script in milliseconds
   * @return transactionTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSACTION_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTransactionTime() {
    return transactionTime;
  }




   /**
   * Type of error encountered; corresponds to phase of connection
   * @return errorType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorType() {
    return errorType;
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




  public WebTransactionPageDetailTestResult markers(List<Marker> markers) {
    this.markers = markers;
    return this;
  }

  public WebTransactionPageDetailTestResult addMarkersItem(Marker markersItem) {
    if (this.markers == null) {
      this.markers = new ArrayList<>();
    }
    this.markers.add(markersItem);
    return this;
  }

   /**
   * Get markers
   * @return markers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MARKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Marker> getMarkers() {
    return markers;
  }


  @JsonProperty(JSON_PROPERTY_MARKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarkers(List<Marker> markers) {
    this.markers = markers;
  }


  public WebTransactionPageDetailTestResult pages(List<Page> pages) {
    this.pages = pages;
    return this;
  }

  public WebTransactionPageDetailTestResult addPagesItem(Page pagesItem) {
    if (this.pages == null) {
      this.pages = new ArrayList<>();
    }
    this.pages.add(pagesItem);
    return this;
  }

   /**
   * Get pages
   * @return pages
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Page> getPages() {
    return pages;
  }


  @JsonProperty(JSON_PROPERTY_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPages(List<Page> pages) {
    this.pages = pages;
  }


   /**
   * See [HAR specification](http://www.softwareishard.com/blog/har-12-spec/) for details
   * @return har
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getHar() {
    return har;
  }




  /**
   * Return true if this WebTransactionPageDetailTestResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebTransactionPageDetailTestResult webTransactionPageDetailTestResult = (WebTransactionPageDetailTestResult) o;
    return Objects.equals(this.date, webTransactionPageDetailTestResult.date) &&
        Objects.equals(this.roundId, webTransactionPageDetailTestResult.roundId) &&
        Objects.equals(this.links, webTransactionPageDetailTestResult.links) &&
        Objects.equals(this.agent, webTransactionPageDetailTestResult.agent) &&
        Objects.equals(this.componentErrors, webTransactionPageDetailTestResult.componentErrors) &&
        Objects.equals(this.transactionTime, webTransactionPageDetailTestResult.transactionTime) &&
        Objects.equals(this.errorType, webTransactionPageDetailTestResult.errorType) &&
        Objects.equals(this.errorDetails, webTransactionPageDetailTestResult.errorDetails) &&
        Objects.equals(this.markers, webTransactionPageDetailTestResult.markers) &&
        Objects.equals(this.pages, webTransactionPageDetailTestResult.pages) &&
        Objects.equals(this.har, webTransactionPageDetailTestResult.har);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, roundId, links, agent, componentErrors, transactionTime, errorType, errorDetails, markers, pages, har);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebTransactionPageDetailTestResult {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    componentErrors: ").append(toIndentedString(componentErrors)).append("\n");
    sb.append("    transactionTime: ").append(toIndentedString(transactionTime)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    har: ").append(toIndentedString(har)).append("\n");
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

