/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
 *
 * The version of the OpenAPI document: 7.0.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.dashboards.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.dashboards.model.AlertListAlertType;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Alert shown in the alert list widget.
 */
@JsonPropertyOrder({
  ApiAlertListAlert.JSON_PROPERTY_ALERT_ID,
  ApiAlertListAlert.JSON_PROPERTY_TEST_ID,
  ApiAlertListAlert.JSON_PROPERTY_RULE_ID,
  ApiAlertListAlert.JSON_PROPERTY_ALERT_SOURCE,
  ApiAlertListAlert.JSON_PROPERTY_ALERT_RULE,
  ApiAlertListAlert.JSON_PROPERTY_ALERT_TYPE,
  ApiAlertListAlert.JSON_PROPERTY_START_TIME,
  ApiAlertListAlert.JSON_PROPERTY_DURATION_IN_SECONDS,
  ApiAlertListAlert.JSON_PROPERTY_ACTIVE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ApiAlertListAlert {
  public static final String JSON_PROPERTY_ALERT_ID = "alertId";
  private String alertId;

  public static final String JSON_PROPERTY_TEST_ID = "testId";
  private String testId;

  public static final String JSON_PROPERTY_RULE_ID = "ruleId";
  private String ruleId;

  public static final String JSON_PROPERTY_ALERT_SOURCE = "alertSource";
  private String alertSource;

  public static final String JSON_PROPERTY_ALERT_RULE = "alertRule";
  private String alertRule;

  public static final String JSON_PROPERTY_ALERT_TYPE = "alertType";
  private AlertListAlertType alertType;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private OffsetDateTime startTime;

  public static final String JSON_PROPERTY_DURATION_IN_SECONDS = "durationInSeconds";
  private Long durationInSeconds;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public ApiAlertListAlert() { 
  }

  public ApiAlertListAlert alertId(String alertId) {
    this.alertId = alertId;
    return this;
  }

   /**
   * Identifier of the alert.
   * @return alertId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAlertId() {
    return alertId;
  }


  @JsonProperty(JSON_PROPERTY_ALERT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlertId(String alertId) {
    this.alertId = alertId;
  }


  public ApiAlertListAlert testId(String testId) {
    this.testId = testId;
    return this;
  }

   /**
   * Identifier of the test.
   * @return testId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTestId() {
    return testId;
  }


  @JsonProperty(JSON_PROPERTY_TEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestId(String testId) {
    this.testId = testId;
  }


  public ApiAlertListAlert ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

   /**
   * Identifier of the rule.
   * @return ruleId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRuleId() {
    return ruleId;
  }


  @JsonProperty(JSON_PROPERTY_RULE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }


  public ApiAlertListAlert alertSource(String alertSource) {
    this.alertSource = alertSource;
    return this;
  }

   /**
   * Name of the agent, monitor or device producing the alert.
   * @return alertSource
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERT_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAlertSource() {
    return alertSource;
  }


  @JsonProperty(JSON_PROPERTY_ALERT_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlertSource(String alertSource) {
    this.alertSource = alertSource;
  }


  public ApiAlertListAlert alertRule(String alertRule) {
    this.alertRule = alertRule;
    return this;
  }

   /**
   * Name of the alert rule that this alert belongs to.
   * @return alertRule
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERT_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAlertRule() {
    return alertRule;
  }


  @JsonProperty(JSON_PROPERTY_ALERT_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlertRule(String alertRule) {
    this.alertRule = alertRule;
  }


  public ApiAlertListAlert alertType(AlertListAlertType alertType) {
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

  public AlertListAlertType getAlertType() {
    return alertType;
  }


  @JsonProperty(JSON_PROPERTY_ALERT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlertType(AlertListAlertType alertType) {
    this.alertType = alertType;
  }


  public ApiAlertListAlert startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * UTC date when the alert was first active.
   * @return startTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public ApiAlertListAlert durationInSeconds(Long durationInSeconds) {
    this.durationInSeconds = durationInSeconds;
    return this;
  }

   /**
   * Number of seconds the alert was active. If it’s still active, this number will increase every second.
   * @return durationInSeconds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION_IN_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDurationInSeconds() {
    return durationInSeconds;
  }


  @JsonProperty(JSON_PROPERTY_DURATION_IN_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDurationInSeconds(Long durationInSeconds) {
    this.durationInSeconds = durationInSeconds;
  }


  public ApiAlertListAlert active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; if alert is active, &#x60;false&#x60; otherwise.
   * @return active
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(Boolean active) {
    this.active = active;
  }


  /**
   * Return true if this ApiAlertListAlert object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiAlertListAlert apiAlertListAlert = (ApiAlertListAlert) o;
    return Objects.equals(this.alertId, apiAlertListAlert.alertId) &&
        Objects.equals(this.testId, apiAlertListAlert.testId) &&
        Objects.equals(this.ruleId, apiAlertListAlert.ruleId) &&
        Objects.equals(this.alertSource, apiAlertListAlert.alertSource) &&
        Objects.equals(this.alertRule, apiAlertListAlert.alertRule) &&
        Objects.equals(this.alertType, apiAlertListAlert.alertType) &&
        Objects.equals(this.startTime, apiAlertListAlert.startTime) &&
        Objects.equals(this.durationInSeconds, apiAlertListAlert.durationInSeconds) &&
        Objects.equals(this.active, apiAlertListAlert.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertId, testId, ruleId, alertSource, alertRule, alertType, startTime, durationInSeconds, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiAlertListAlert {\n");
    sb.append("    alertId: ").append(toIndentedString(alertId)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    alertSource: ").append(toIndentedString(alertSource)).append("\n");
    sb.append("    alertRule: ").append(toIndentedString(alertRule)).append("\n");
    sb.append("    alertType: ").append(toIndentedString(alertType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    durationInSeconds: ").append(toIndentedString(durationInSeconds)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

