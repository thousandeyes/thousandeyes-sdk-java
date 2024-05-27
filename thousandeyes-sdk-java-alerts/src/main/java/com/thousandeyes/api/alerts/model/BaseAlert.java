/*
 * Alerts API
 * You can manage the following alert functionalities on the ThousandEyes platform using the Alerts API:  * **Alerts**: Retrieve alert details. Alerts are assigned to tests through alert rules.  * **Alert Rules**: Conditions that you configure in order to highlight or be notified of events of interest in your ThousandEyes tests. When an alert rule’s conditions are met, the associated alert is triggered and the alert becomes active. It remains active until the alert is cleared. Alert rules are reusable across multiple tests..  * **Alert Suppression Windows**: Suppress alerts for tests during periods such as planned maintenance. Windows can be one-time events or recurring events to handle periodic occurrences such as monthly downtime for maintenance.  For more information about the alerts, see [Alerts](https://docs.thousandeyes.com/product-documentation/alerts). 
 *
 * The version of the OpenAPI document: 7.0.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.alerts.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.alerts.model.AlertLinks;
import com.thousandeyes.api.alerts.model.AlertMeta;
import com.thousandeyes.api.alerts.model.AlertType;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * BaseAlert
 */
@JsonPropertyOrder({
  BaseAlert.JSON_PROPERTY_ID,
  BaseAlert.JSON_PROPERTY_ALERT_TYPE,
  BaseAlert.JSON_PROPERTY_START_DATE,
  BaseAlert.JSON_PROPERTY_END_DATE,
  BaseAlert.JSON_PROPERTY_VIOLATION_COUNT,
  BaseAlert.JSON_PROPERTY_DURATION,
  BaseAlert.JSON_PROPERTY_SUPPRESSED,
  BaseAlert.JSON_PROPERTY_META,
  BaseAlert.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class BaseAlert {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_ALERT_TYPE = "alertType";
  private AlertType alertType;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private OffsetDateTime endDate;

  public static final String JSON_PROPERTY_VIOLATION_COUNT = "violationCount";
  private Integer violationCount;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private BigDecimal duration;

  public static final String JSON_PROPERTY_SUPPRESSED = "suppressed";
  private Boolean suppressed;

  public static final String JSON_PROPERTY_META = "meta";
  private AlertMeta meta;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private AlertLinks links;

  public BaseAlert() { 
  }

  @JsonCreator
  public BaseAlert(
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_START_DATE) OffsetDateTime startDate, 
    @JsonProperty(JSON_PROPERTY_END_DATE) OffsetDateTime endDate
  ) {
  this();
    this.id = id;
    this.startDate = startDate;
    this.endDate = endDate;
  }

   /**
   * A unique ID for each individual alert occurrence.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




  public BaseAlert alertType(AlertType alertType) {
    this.alertType = alertType;
    return this;
  }

   /**
   * Get alertType
   * @return alertType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AlertType getAlertType() {
    return alertType;
  }


  @JsonProperty(JSON_PROPERTY_ALERT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlertType(AlertType alertType) {
    this.alertType = alertType;
  }


   /**
   * The start date and time (in UTC, ISO 8601 format) for querying alerts.
   * @return startDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartDate() {
    return startDate;
  }




   /**
   * The end date and time (in UTC, ISO 8601 format) for querying alerts.
   * @return endDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEndDate() {
    return endDate;
  }




  public BaseAlert violationCount(Integer violationCount) {
    this.violationCount = violationCount;
    return this;
  }

   /**
   * Number of sources that meet the alert criteria.
   * @return violationCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIOLATION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getViolationCount() {
    return violationCount;
  }


  @JsonProperty(JSON_PROPERTY_VIOLATION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setViolationCount(Integer violationCount) {
    this.violationCount = violationCount;
  }


  public BaseAlert duration(BigDecimal duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Duration in seconds the alert was active
   * @return duration
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }


  public BaseAlert suppressed(Boolean suppressed) {
    this.suppressed = suppressed;
    return this;
  }

   /**
   * Indicates whether the alert is currently suppressed by a real-time ASW.
   * @return suppressed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPRESSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuppressed() {
    return suppressed;
  }


  @JsonProperty(JSON_PROPERTY_SUPPRESSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuppressed(Boolean suppressed) {
    this.suppressed = suppressed;
  }


  public BaseAlert meta(AlertMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AlertMeta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(AlertMeta meta) {
    this.meta = meta;
  }


  public BaseAlert links(AlertLinks links) {
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

  public AlertLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(AlertLinks links) {
    this.links = links;
  }


  /**
   * Return true if this BaseAlert object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseAlert baseAlert = (BaseAlert) o;
    return Objects.equals(this.id, baseAlert.id) &&
        Objects.equals(this.alertType, baseAlert.alertType) &&
        Objects.equals(this.startDate, baseAlert.startDate) &&
        Objects.equals(this.endDate, baseAlert.endDate) &&
        Objects.equals(this.violationCount, baseAlert.violationCount) &&
        Objects.equals(this.duration, baseAlert.duration) &&
        Objects.equals(this.suppressed, baseAlert.suppressed) &&
        Objects.equals(this.meta, baseAlert.meta) &&
        Objects.equals(this.links, baseAlert.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, alertType, startDate, endDate, violationCount, duration, suppressed, meta, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseAlert {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    alertType: ").append(toIndentedString(alertType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    violationCount: ").append(toIndentedString(violationCount)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    suppressed: ").append(toIndentedString(suppressed)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

