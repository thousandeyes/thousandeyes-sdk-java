/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.7
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
import com.thousandeyes.sdk.endpoint.tests.results.model.RealUserTestPageTimings;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RealUserTestPage
 */
@JsonPropertyOrder({
  RealUserTestPage.JSON_PROPERTY_PAGE_ID,
  RealUserTestPage.JSON_PROPERTY_PAGE_TITLE,
  RealUserTestPage.JSON_PROPERTY_PAGE_URL,
  RealUserTestPage.JSON_PROPERTY_LOAD_DATE,
  RealUserTestPage.JSON_PROPERTY_RESPONSE_CODE,
  RealUserTestPage.JSON_PROPERTY_PAGE_TIMINGS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class RealUserTestPage {
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
  private RealUserTestPageTimings pageTimings;

  public RealUserTestPage() { 
  }

  @JsonCreator
  public RealUserTestPage(
    @JsonProperty(JSON_PROPERTY_PAGE_ID) String pageId, 
    @JsonProperty(JSON_PROPERTY_PAGE_TITLE) String pageTitle, 
    @JsonProperty(JSON_PROPERTY_PAGE_URL) String pageUrl, 
    @JsonProperty(JSON_PROPERTY_LOAD_DATE) OffsetDateTime loadDate, 
    @JsonProperty(JSON_PROPERTY_RESPONSE_CODE) Integer responseCode
  ) {
  this();
    this.pageId = pageId;
    this.pageTitle = pageTitle;
    this.pageUrl = pageUrl;
    this.loadDate = loadDate;
    this.responseCode = responseCode;
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




  public RealUserTestPage pageTimings(RealUserTestPageTimings pageTimings) {
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

  public RealUserTestPageTimings getPageTimings() {
    return pageTimings;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_TIMINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageTimings(RealUserTestPageTimings pageTimings) {
    this.pageTimings = pageTimings;
  }


  /**
   * Return true if this RealUserTestPage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealUserTestPage realUserTestPage = (RealUserTestPage) o;
    return Objects.equals(this.pageId, realUserTestPage.pageId) &&
        Objects.equals(this.pageTitle, realUserTestPage.pageTitle) &&
        Objects.equals(this.pageUrl, realUserTestPage.pageUrl) &&
        Objects.equals(this.loadDate, realUserTestPage.loadDate) &&
        Objects.equals(this.responseCode, realUserTestPage.responseCode) &&
        Objects.equals(this.pageTimings, realUserTestPage.pageTimings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageId, pageTitle, pageUrl, loadDate, responseCode, pageTimings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealUserTestPage {\n");
    sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
    sb.append("    pageTitle: ").append(toIndentedString(pageTitle)).append("\n");
    sb.append("    pageUrl: ").append(toIndentedString(pageUrl)).append("\n");
    sb.append("    loadDate: ").append(toIndentedString(loadDate)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    pageTimings: ").append(toIndentedString(pageTimings)).append("\n");
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

