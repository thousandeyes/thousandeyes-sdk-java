/*
 * Alerts API
 * You can manage the following alert functionalities on the ThousandEyes platform using the Alerts API:  * **Alerts**: Retrieve alert details. Alerts are assigned to tests through alert rules.  * **Alert Rules**: Conditions that you configure in order to highlight or be notified of events of interest in your ThousandEyes tests. When an alert rule’s conditions are met, the associated alert is triggered and the alert becomes active. It remains active until the alert is cleared. Alert rules are reusable across multiple tests..  * **Alert Suppression Windows**: Suppress alerts for tests during periods such as planned maintenance. Windows can be one-time events or recurring events to handle periodic occurrences such as monthly downtime for maintenance.  For more information about the alerts, see [Alerts](https://docs.thousandeyes.com/product-documentation/alerts). 
 *
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
import com.thousandeyes.sdk.alerts.model.AlertDirection;
import com.thousandeyes.sdk.alerts.model.AlertNotification;
import com.thousandeyes.sdk.alerts.model.AlertRoundsViolationMode;
import com.thousandeyes.sdk.alerts.model.AlertType;
import com.thousandeyes.sdk.alerts.model.BaseTest;
import com.thousandeyes.sdk.alerts.model.SelfLinks;
import com.thousandeyes.sdk.alerts.model.SensitivityLevel;
import com.thousandeyes.sdk.alerts.model.Severity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RuleDetail
 */
@JsonPropertyOrder({
  RuleDetail.JSON_PROPERTY_RULE_ID,
  RuleDetail.JSON_PROPERTY_RULE_NAME,
  RuleDetail.JSON_PROPERTY_EXPRESSION,
  RuleDetail.JSON_PROPERTY_DIRECTION,
  RuleDetail.JSON_PROPERTY_NOTIFY_ON_CLEAR,
  RuleDetail.JSON_PROPERTY_IS_DEFAULT,
  RuleDetail.JSON_PROPERTY_ALERT_TYPE,
  RuleDetail.JSON_PROPERTY_MINIMUM_SOURCES,
  RuleDetail.JSON_PROPERTY_MINIMUM_SOURCES_PCT,
  RuleDetail.JSON_PROPERTY_ROUNDS_VIOLATING_MODE,
  RuleDetail.JSON_PROPERTY_ROUNDS_VIOLATING_OUT_OF,
  RuleDetail.JSON_PROPERTY_ROUNDS_VIOLATING_REQUIRED,
  RuleDetail.JSON_PROPERTY_INCLUDE_COVERED_PREFIXES,
  RuleDetail.JSON_PROPERTY_SENSITIVITY_LEVEL,
  RuleDetail.JSON_PROPERTY_SEVERITY,
  RuleDetail.JSON_PROPERTY_NOTIFICATIONS,
  RuleDetail.JSON_PROPERTY_TESTS,
  RuleDetail.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class RuleDetail {
  public static final String JSON_PROPERTY_RULE_ID = "ruleId";
  private String ruleId;

  public static final String JSON_PROPERTY_RULE_NAME = "ruleName";
  private String ruleName;

  public static final String JSON_PROPERTY_EXPRESSION = "expression";
  private String expression;

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private AlertDirection direction;

  public static final String JSON_PROPERTY_NOTIFY_ON_CLEAR = "notifyOnClear";
  private Boolean notifyOnClear;

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

  public static final String JSON_PROPERTY_INCLUDE_COVERED_PREFIXES = "includeCoveredPrefixes";
  private Boolean includeCoveredPrefixes;

  public static final String JSON_PROPERTY_SENSITIVITY_LEVEL = "sensitivityLevel";
  private SensitivityLevel sensitivityLevel;

  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private Severity severity;

  public static final String JSON_PROPERTY_NOTIFICATIONS = "notifications";
  private AlertNotification notifications;

  public static final String JSON_PROPERTY_TESTS = "tests";
  private List<BaseTest> tests = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinks links;

  public RuleDetail() { 
  }

  @JsonCreator
  public RuleDetail(
    @JsonProperty(JSON_PROPERTY_RULE_ID) String ruleId, 
    @JsonProperty(JSON_PROPERTY_TESTS) List<BaseTest> tests
  ) {
  this();
    this.ruleId = ruleId;
    this.tests = tests;
  }

   /**
   * Unique ID of the rule.
   * @return ruleId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRuleId() {
    return ruleId;
  }




  public RuleDetail ruleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

   /**
   * Name of the alert rule.
   * @return ruleName
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RULE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRuleName() {
    return ruleName;
  }


  @JsonProperty(JSON_PROPERTY_RULE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }


  public RuleDetail expression(String expression) {
    this.expression = expression;
    return this;
  }

   /**
   * The expression of the alert rule.
   * @return expression
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExpression() {
    return expression;
  }


  @JsonProperty(JSON_PROPERTY_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExpression(String expression) {
    this.expression = expression;
  }


  public RuleDetail direction(AlertDirection direction) {
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


  public RuleDetail notifyOnClear(Boolean notifyOnClear) {
    this.notifyOnClear = notifyOnClear;
    return this;
  }

   /**
   * Send notification when alert clears.
   * @return notifyOnClear
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFY_ON_CLEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNotifyOnClear() {
    return notifyOnClear;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFY_ON_CLEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotifyOnClear(Boolean notifyOnClear) {
    this.notifyOnClear = notifyOnClear;
  }


  public RuleDetail isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * If set to &#x60;true&#x60;, this alert rule becomes the default for its test type and is automatically applied to newly created tests with relevant metrics. Only one default alert rule is allowed per test type.
   * @return isDefault
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDefault() {
    return isDefault;
  }


  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public RuleDetail alertType(AlertType alertType) {
    this.alertType = alertType;
    return this;
  }

   /**
   * Get alertType
   * @return alertType
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ALERT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AlertType getAlertType() {
    return alertType;
  }


  @JsonProperty(JSON_PROPERTY_ALERT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAlertType(AlertType alertType) {
    this.alertType = alertType;
  }


  public RuleDetail minimumSources(Integer minimumSources) {
    this.minimumSources = minimumSources;
    return this;
  }

   /**
   * The minimum number of agents or monitors that must meet the specified criteria to trigger the alert.
   * @return minimumSources
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MINIMUM_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinimumSources() {
    return minimumSources;
  }


  @JsonProperty(JSON_PROPERTY_MINIMUM_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimumSources(Integer minimumSources) {
    this.minimumSources = minimumSources;
  }


  public RuleDetail minimumSourcesPct(Integer minimumSourcesPct) {
    this.minimumSourcesPct = minimumSourcesPct;
    return this;
  }

   /**
   * The minimum percentage of all assigned agents or monitors that must meet the specified criteria to trigger the alert.
   * @return minimumSourcesPct
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MINIMUM_SOURCES_PCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinimumSourcesPct() {
    return minimumSourcesPct;
  }


  @JsonProperty(JSON_PROPERTY_MINIMUM_SOURCES_PCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimumSourcesPct(Integer minimumSourcesPct) {
    this.minimumSourcesPct = minimumSourcesPct;
  }


  public RuleDetail roundsViolatingMode(AlertRoundsViolationMode roundsViolatingMode) {
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


  public RuleDetail roundsViolatingOutOf(Integer roundsViolatingOutOf) {
    this.roundsViolatingOutOf = roundsViolatingOutOf;
    return this;
  }

   /**
   * Specifies the divisor (y value) in the “X of Y times” condition.
   * @return roundsViolatingOutOf
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROUNDS_VIOLATING_OUT_OF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getRoundsViolatingOutOf() {
    return roundsViolatingOutOf;
  }


  @JsonProperty(JSON_PROPERTY_ROUNDS_VIOLATING_OUT_OF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoundsViolatingOutOf(Integer roundsViolatingOutOf) {
    this.roundsViolatingOutOf = roundsViolatingOutOf;
  }


  public RuleDetail roundsViolatingRequired(Integer roundsViolatingRequired) {
    this.roundsViolatingRequired = roundsViolatingRequired;
    return this;
  }

   /**
   * Specifies the numerator (x value) in the “X of Y times” condition.
   * @return roundsViolatingRequired
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROUNDS_VIOLATING_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getRoundsViolatingRequired() {
    return roundsViolatingRequired;
  }


  @JsonProperty(JSON_PROPERTY_ROUNDS_VIOLATING_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoundsViolatingRequired(Integer roundsViolatingRequired) {
    this.roundsViolatingRequired = roundsViolatingRequired;
  }


  public RuleDetail includeCoveredPrefixes(Boolean includeCoveredPrefixes) {
    this.includeCoveredPrefixes = includeCoveredPrefixes;
    return this;
  }

   /**
   * Set true to include covered prefixes in the BGP alert rule. Only applicable to BGP alert rules.
   * @return includeCoveredPrefixes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_COVERED_PREFIXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeCoveredPrefixes() {
    return includeCoveredPrefixes;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_COVERED_PREFIXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeCoveredPrefixes(Boolean includeCoveredPrefixes) {
    this.includeCoveredPrefixes = includeCoveredPrefixes;
  }


  public RuleDetail sensitivityLevel(SensitivityLevel sensitivityLevel) {
    this.sensitivityLevel = sensitivityLevel;
    return this;
  }

   /**
   * Get sensitivityLevel
   * @return sensitivityLevel
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SENSITIVITY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SensitivityLevel getSensitivityLevel() {
    return sensitivityLevel;
  }


  @JsonProperty(JSON_PROPERTY_SENSITIVITY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSensitivityLevel(SensitivityLevel sensitivityLevel) {
    this.sensitivityLevel = sensitivityLevel;
  }


  public RuleDetail severity(Severity severity) {
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


  public RuleDetail notifications(AlertNotification notifications) {
    this.notifications = notifications;
    return this;
  }

   /**
   * Get notifications
   * @return notifications
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AlertNotification getNotifications() {
    return notifications;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotifications(AlertNotification notifications) {
    this.notifications = notifications;
  }


   /**
   * Get tests
   * @return tests
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BaseTest> getTests() {
    return tests;
  }




  public RuleDetail links(SelfLinks links) {
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


  /**
   * Return true if this RuleDetail object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleDetail ruleDetail = (RuleDetail) o;
    return Objects.equals(this.ruleId, ruleDetail.ruleId) &&
        Objects.equals(this.ruleName, ruleDetail.ruleName) &&
        Objects.equals(this.expression, ruleDetail.expression) &&
        Objects.equals(this.direction, ruleDetail.direction) &&
        Objects.equals(this.notifyOnClear, ruleDetail.notifyOnClear) &&
        Objects.equals(this.isDefault, ruleDetail.isDefault) &&
        Objects.equals(this.alertType, ruleDetail.alertType) &&
        Objects.equals(this.minimumSources, ruleDetail.minimumSources) &&
        Objects.equals(this.minimumSourcesPct, ruleDetail.minimumSourcesPct) &&
        Objects.equals(this.roundsViolatingMode, ruleDetail.roundsViolatingMode) &&
        Objects.equals(this.roundsViolatingOutOf, ruleDetail.roundsViolatingOutOf) &&
        Objects.equals(this.roundsViolatingRequired, ruleDetail.roundsViolatingRequired) &&
        Objects.equals(this.includeCoveredPrefixes, ruleDetail.includeCoveredPrefixes) &&
        Objects.equals(this.sensitivityLevel, ruleDetail.sensitivityLevel) &&
        Objects.equals(this.severity, ruleDetail.severity) &&
        Objects.equals(this.notifications, ruleDetail.notifications) &&
        Objects.equals(this.tests, ruleDetail.tests) &&
        Objects.equals(this.links, ruleDetail.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleId, ruleName, expression, direction, notifyOnClear, isDefault, alertType, minimumSources, minimumSourcesPct, roundsViolatingMode, roundsViolatingOutOf, roundsViolatingRequired, includeCoveredPrefixes, sensitivityLevel, severity, notifications, tests, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleDetail {\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    notifyOnClear: ").append(toIndentedString(notifyOnClear)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    alertType: ").append(toIndentedString(alertType)).append("\n");
    sb.append("    minimumSources: ").append(toIndentedString(minimumSources)).append("\n");
    sb.append("    minimumSourcesPct: ").append(toIndentedString(minimumSourcesPct)).append("\n");
    sb.append("    roundsViolatingMode: ").append(toIndentedString(roundsViolatingMode)).append("\n");
    sb.append("    roundsViolatingOutOf: ").append(toIndentedString(roundsViolatingOutOf)).append("\n");
    sb.append("    roundsViolatingRequired: ").append(toIndentedString(roundsViolatingRequired)).append("\n");
    sb.append("    includeCoveredPrefixes: ").append(toIndentedString(includeCoveredPrefixes)).append("\n");
    sb.append("    sensitivityLevel: ").append(toIndentedString(sensitivityLevel)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    tests: ").append(toIndentedString(tests)).append("\n");
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

