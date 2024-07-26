/*
 * Alerts API
 * You can manage the following alert functionalities on the ThousandEyes platform using the Alerts API:  * **Alerts**: Retrieve alert details. Alerts are assigned to tests through alert rules.  * **Alert Rules**: Conditions that you configure in order to highlight or be notified of events of interest in your ThousandEyes tests. When an alert rule’s conditions are met, the associated alert is triggered and the alert becomes active. It remains active until the alert is cleared. Alert rules are reusable across multiple tests..  * **Alert Suppression Windows**: Suppress alerts for tests during periods such as planned maintenance. Windows can be one-time events or recurring events to handle periodic occurrences such as monthly downtime for maintenance.  For more information about the alerts, see [Alerts](https://docs.thousandeyes.com/product-documentation/alerts). 
 *
 * The version of the OpenAPI document: 7.0.11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.alerts.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.alerts.model.AlertSuppressionWindowState;
import com.thousandeyes.sdk.alerts.model.BaseTest;
import com.thousandeyes.sdk.alerts.model.EndRepeat;
import com.thousandeyes.sdk.alerts.model.Repeat;
import com.thousandeyes.sdk.alerts.model.SelfLinks;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AlertSuppressionWindowDetail
 */
@JsonPropertyOrder({
  AlertSuppressionWindowDetail.JSON_PROPERTY_ALERT_SUPPRESSION_WINDOW_ID,
  AlertSuppressionWindowDetail.JSON_PROPERTY_NAME,
  AlertSuppressionWindowDetail.JSON_PROPERTY_IS_ENABLED,
  AlertSuppressionWindowDetail.JSON_PROPERTY_STATUS,
  AlertSuppressionWindowDetail.JSON_PROPERTY_START_DATE,
  AlertSuppressionWindowDetail.JSON_PROPERTY_DURATION,
  AlertSuppressionWindowDetail.JSON_PROPERTY_REPEAT,
  AlertSuppressionWindowDetail.JSON_PROPERTY_END_REPEAT,
  AlertSuppressionWindowDetail.JSON_PROPERTY_LINKS,
  AlertSuppressionWindowDetail.JSON_PROPERTY_TESTS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class AlertSuppressionWindowDetail {
  public static final String JSON_PROPERTY_ALERT_SUPPRESSION_WINDOW_ID = "alertSuppressionWindowId";
  private String alertSuppressionWindowId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_IS_ENABLED = "isEnabled";
  private Boolean isEnabled;

  public static final String JSON_PROPERTY_STATUS = "status";
  private AlertSuppressionWindowState status;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Integer duration;

  public static final String JSON_PROPERTY_REPEAT = "repeat";
  private Repeat repeat;

  public static final String JSON_PROPERTY_END_REPEAT = "endRepeat";
  private EndRepeat endRepeat;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinks links;

  public static final String JSON_PROPERTY_TESTS = "tests";
  private List<BaseTest> tests = new ArrayList<>();

  public AlertSuppressionWindowDetail() { 
  }

  @JsonCreator
  public AlertSuppressionWindowDetail(
    @JsonProperty(JSON_PROPERTY_ALERT_SUPPRESSION_WINDOW_ID) String alertSuppressionWindowId
  ) {
  this();
    this.alertSuppressionWindowId = alertSuppressionWindowId;
  }

   /**
   * Unique ID of the alert suppression window.
   * @return alertSuppressionWindowId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERT_SUPPRESSION_WINDOW_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAlertSuppressionWindowId() {
    return alertSuppressionWindowId;
  }




  public AlertSuppressionWindowDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the alert suppression window.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public AlertSuppressionWindowDetail isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Set to &#x60;false&#x60; for &#x60;disabled&#x60;, &#x60;true&#x60; for &#x60;enabled&#x60;.
   * @return isEnabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEnabled() {
    return isEnabled;
  }


  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public AlertSuppressionWindowDetail status(AlertSuppressionWindowState status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AlertSuppressionWindowState getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(AlertSuppressionWindowState status) {
    this.status = status;
  }


  public AlertSuppressionWindowDetail startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The date/time when the alert suppression window starts (ISO date-time format).
   * @return startDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public AlertSuppressionWindowDetail duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Duration in seconds the suppression window is active.
   * @return duration
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public AlertSuppressionWindowDetail repeat(Repeat repeat) {
    this.repeat = repeat;
    return this;
  }

   /**
   * Get repeat
   * @return repeat
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPEAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Repeat getRepeat() {
    return repeat;
  }


  @JsonProperty(JSON_PROPERTY_REPEAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRepeat(Repeat repeat) {
    this.repeat = repeat;
  }


  public AlertSuppressionWindowDetail endRepeat(EndRepeat endRepeat) {
    this.endRepeat = endRepeat;
    return this;
  }

   /**
   * Get endRepeat
   * @return endRepeat
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_REPEAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EndRepeat getEndRepeat() {
    return endRepeat;
  }


  @JsonProperty(JSON_PROPERTY_END_REPEAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndRepeat(EndRepeat endRepeat) {
    this.endRepeat = endRepeat;
  }


  public AlertSuppressionWindowDetail links(SelfLinks links) {
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

  public SelfLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(SelfLinks links) {
    this.links = links;
  }


  public AlertSuppressionWindowDetail tests(List<BaseTest> tests) {
    this.tests = tests;
    return this;
  }

  public AlertSuppressionWindowDetail addTestsItem(BaseTest testsItem) {
    if (this.tests == null) {
      this.tests = new ArrayList<>();
    }
    this.tests.add(testsItem);
    return this;
  }

   /**
   * List of tests assigned to the alert suppression window.
   * @return tests
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BaseTest> getTests() {
    return tests;
  }


  @JsonProperty(JSON_PROPERTY_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTests(List<BaseTest> tests) {
    this.tests = tests;
  }


  /**
   * Return true if this AlertSuppressionWindowDetail object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertSuppressionWindowDetail alertSuppressionWindowDetail = (AlertSuppressionWindowDetail) o;
    return Objects.equals(this.alertSuppressionWindowId, alertSuppressionWindowDetail.alertSuppressionWindowId) &&
        Objects.equals(this.name, alertSuppressionWindowDetail.name) &&
        Objects.equals(this.isEnabled, alertSuppressionWindowDetail.isEnabled) &&
        Objects.equals(this.status, alertSuppressionWindowDetail.status) &&
        Objects.equals(this.startDate, alertSuppressionWindowDetail.startDate) &&
        Objects.equals(this.duration, alertSuppressionWindowDetail.duration) &&
        Objects.equals(this.repeat, alertSuppressionWindowDetail.repeat) &&
        Objects.equals(this.endRepeat, alertSuppressionWindowDetail.endRepeat) &&
        Objects.equals(this.links, alertSuppressionWindowDetail.links) &&
        Objects.equals(this.tests, alertSuppressionWindowDetail.tests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertSuppressionWindowId, name, isEnabled, status, startDate, duration, repeat, endRepeat, links, tests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertSuppressionWindowDetail {\n");
    sb.append("    alertSuppressionWindowId: ").append(toIndentedString(alertSuppressionWindowId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    repeat: ").append(toIndentedString(repeat)).append("\n");
    sb.append("    endRepeat: ").append(toIndentedString(endRepeat)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    tests: ").append(toIndentedString(tests)).append("\n");
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

