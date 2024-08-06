/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.14
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
import com.thousandeyes.sdk.endpoint.tests.results.model.AlertDirection;
import com.thousandeyes.sdk.endpoint.tests.results.model.AlertRoundsViolationMode;
import com.thousandeyes.sdk.endpoint.tests.results.model.AlertType;
import com.thousandeyes.sdk.endpoint.tests.results.model.Severity;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AlertRule
 */
@JsonPropertyOrder({
  AlertRule.JSON_PROPERTY_RULE_ID,
  AlertRule.JSON_PROPERTY_RULE_NAME,
  AlertRule.JSON_PROPERTY_EXPRESSION,
  AlertRule.JSON_PROPERTY_DIRECTION,
  AlertRule.JSON_PROPERTY_IS_DEFAULT,
  AlertRule.JSON_PROPERTY_ALERT_TYPE,
  AlertRule.JSON_PROPERTY_MINIMUM_SOURCES,
  AlertRule.JSON_PROPERTY_MINIMUM_SOURCES_PCT,
  AlertRule.JSON_PROPERTY_ROUNDS_VIOLATING_MODE,
  AlertRule.JSON_PROPERTY_ROUNDS_VIOLATING_OUT_OF,
  AlertRule.JSON_PROPERTY_ROUNDS_VIOLATING_REQUIRED,
  AlertRule.JSON_PROPERTY_SEVERITY
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class AlertRule {
  public static final String JSON_PROPERTY_RULE_ID = "ruleId";
  private String ruleId;

  public static final String JSON_PROPERTY_RULE_NAME = "ruleName";
  private String ruleName;

  public static final String JSON_PROPERTY_EXPRESSION = "expression";
  private String expression;

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private AlertDirection direction;

  public static final String JSON_PROPERTY_IS_DEFAULT = "isDefault";
  private Boolean isDefault;

  public static final String JSON_PROPERTY_ALERT_TYPE = "alertType";
  private AlertType alertType;

  public static final String JSON_PROPERTY_MINIMUM_SOURCES = "minimumSources";
  private Integer minimumSources;

  public static final String JSON_PROPERTY_MINIMUM_SOURCES_PCT = "minimumSourcesPct";
  private Integer minimumSourcesPct;

  public static final String JSON_PROPERTY_ROUNDS_VIOLATING_MODE = "roundsViolatingMode";
  private AlertRoundsViolationMode roundsViolatingMode;

  public static final String JSON_PROPERTY_ROUNDS_VIOLATING_OUT_OF = "roundsViolatingOutOf";
  private Integer roundsViolatingOutOf;

  public static final String JSON_PROPERTY_ROUNDS_VIOLATING_REQUIRED = "roundsViolatingRequired";
  private Integer roundsViolatingRequired;

  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private Severity severity;

  public AlertRule() { 
  }

  @JsonCreator
  public AlertRule(
    @JsonProperty(JSON_PROPERTY_RULE_ID) String ruleId, 
    @JsonProperty(JSON_PROPERTY_RULE_NAME) String ruleName, 
    @JsonProperty(JSON_PROPERTY_EXPRESSION) String expression, 
    @JsonProperty(JSON_PROPERTY_IS_DEFAULT) Boolean isDefault, 
    @JsonProperty(JSON_PROPERTY_MINIMUM_SOURCES) Integer minimumSources, 
    @JsonProperty(JSON_PROPERTY_MINIMUM_SOURCES_PCT) Integer minimumSourcesPct, 
    @JsonProperty(JSON_PROPERTY_ROUNDS_VIOLATING_OUT_OF) Integer roundsViolatingOutOf, 
    @JsonProperty(JSON_PROPERTY_ROUNDS_VIOLATING_REQUIRED) Integer roundsViolatingRequired
  ) {
  this();
    this.ruleId = ruleId;
    this.ruleName = ruleName;
    this.expression = expression;
    this.isDefault = isDefault;
    this.minimumSources = minimumSources;
    this.minimumSourcesPct = minimumSourcesPct;
    this.roundsViolatingOutOf = roundsViolatingOutOf;
    this.roundsViolatingRequired = roundsViolatingRequired;
  }

   /**
   * Unique ID of the rule
   * @return ruleId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRuleId() {
    return ruleId;
  }




   /**
   * Name of the alert rule
   * @return ruleName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRuleName() {
    return ruleName;
  }




   /**
   * String expression of alert rule
   * @return expression
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpression() {
    return expression;
  }




  public AlertRule direction(AlertDirection direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AlertDirection getDirection() {
    return direction;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirection(AlertDirection direction) {
    this.direction = direction;
  }


   /**
   * Alert rules allow up to 1 alert rule to be selected as a default for each type. By checking the default option, this alert rule will be automatically included on subsequently created tests that test a metric used in alerting here
   * @return isDefault
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDefault() {
    return isDefault;
  }




  public AlertRule alertType(AlertType alertType) {
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
   * The minimum number of agents or monitors that must meet the specified criteria in order to trigger the alert
   * @return minimumSources
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MINIMUM_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinimumSources() {
    return minimumSources;
  }




   /**
   * the minimum percentage of all assigned agents or monitors that must meet the specified criteria in order to trigger the alert
   * @return minimumSourcesPct
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MINIMUM_SOURCES_PCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinimumSourcesPct() {
    return minimumSourcesPct;
  }




  public AlertRule roundsViolatingMode(AlertRoundsViolationMode roundsViolatingMode) {
    this.roundsViolatingMode = roundsViolatingMode;
    return this;
  }

   /**
   * Get roundsViolatingMode
   * @return roundsViolatingMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROUNDS_VIOLATING_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AlertRoundsViolationMode getRoundsViolatingMode() {
    return roundsViolatingMode;
  }


  @JsonProperty(JSON_PROPERTY_ROUNDS_VIOLATING_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoundsViolatingMode(AlertRoundsViolationMode roundsViolatingMode) {
    this.roundsViolatingMode = roundsViolatingMode;
  }


   /**
   * Specifies the divisor (y value) for the “X of Y times” condition.
   * @return roundsViolatingOutOf
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROUNDS_VIOLATING_OUT_OF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRoundsViolatingOutOf() {
    return roundsViolatingOutOf;
  }




   /**
   * Specifies the numerator (x value) for the “X of Y times” condition
   * @return roundsViolatingRequired
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROUNDS_VIOLATING_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRoundsViolatingRequired() {
    return roundsViolatingRequired;
  }




  public AlertRule severity(Severity severity) {
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Severity getSeverity() {
    return severity;
  }


  @JsonProperty(JSON_PROPERTY_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSeverity(Severity severity) {
    this.severity = severity;
  }


  /**
   * Return true if this AlertRule object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertRule alertRule = (AlertRule) o;
    return Objects.equals(this.ruleId, alertRule.ruleId) &&
        Objects.equals(this.ruleName, alertRule.ruleName) &&
        Objects.equals(this.expression, alertRule.expression) &&
        Objects.equals(this.direction, alertRule.direction) &&
        Objects.equals(this.isDefault, alertRule.isDefault) &&
        Objects.equals(this.alertType, alertRule.alertType) &&
        Objects.equals(this.minimumSources, alertRule.minimumSources) &&
        Objects.equals(this.minimumSourcesPct, alertRule.minimumSourcesPct) &&
        Objects.equals(this.roundsViolatingMode, alertRule.roundsViolatingMode) &&
        Objects.equals(this.roundsViolatingOutOf, alertRule.roundsViolatingOutOf) &&
        Objects.equals(this.roundsViolatingRequired, alertRule.roundsViolatingRequired) &&
        Objects.equals(this.severity, alertRule.severity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleId, ruleName, expression, direction, isDefault, alertType, minimumSources, minimumSourcesPct, roundsViolatingMode, roundsViolatingOutOf, roundsViolatingRequired, severity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertRule {\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    alertType: ").append(toIndentedString(alertType)).append("\n");
    sb.append("    minimumSources: ").append(toIndentedString(minimumSources)).append("\n");
    sb.append("    minimumSourcesPct: ").append(toIndentedString(minimumSourcesPct)).append("\n");
    sb.append("    roundsViolatingMode: ").append(toIndentedString(roundsViolatingMode)).append("\n");
    sb.append("    roundsViolatingOutOf: ").append(toIndentedString(roundsViolatingOutOf)).append("\n");
    sb.append("    roundsViolatingRequired: ").append(toIndentedString(roundsViolatingRequired)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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

