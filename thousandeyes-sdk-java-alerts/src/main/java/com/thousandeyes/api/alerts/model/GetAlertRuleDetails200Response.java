/*
 * Alerts API
 * You can manage the following alert functionalities on the ThousandEyes platform using the Alerts API:  * **Alerts**: Retrieve alert details. Alerts are assigned to tests through alert rules.  * **Alert Rules**: Conditions that you configure in order to highlight or be notified of events of interest in your ThousandEyes tests. When an alert rule’s conditions are met, the associated alert is triggered and the alert becomes active. It remains active until the alert is cleared. Alert rules are reusable across multiple tests..  * **Alert Suppression Windows**: Suppress alerts for tests during periods such as planned maintenance. Windows can be one-time events or recurring events to handle periodic occurrences such as monthly downtime for maintenance.  For more information about the alerts, see [Alerts](https://docs.thousandeyes.com/product-documentation/alerts). 
 *
 * The version of the OpenAPI document: 7.0.0
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
import com.thousandeyes.api.alerts.model.AlertDirection;
import com.thousandeyes.api.alerts.model.AlertRoundsViolationMode;
import com.thousandeyes.api.alerts.model.AlertType;
import com.thousandeyes.api.alerts.model.BaseTest;
import com.thousandeyes.api.alerts.model.Notification;
import com.thousandeyes.api.alerts.model.SelfLinksLinks;
import com.thousandeyes.api.alerts.model.Severity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GetAlertRuleDetails200Response
 */
@JsonPropertyOrder({
  GetAlertRuleDetails200Response.JSON_PROPERTY_RULE_ID,
  GetAlertRuleDetails200Response.JSON_PROPERTY_RULE_NAME,
  GetAlertRuleDetails200Response.JSON_PROPERTY_EXPRESSION,
  GetAlertRuleDetails200Response.JSON_PROPERTY_DIRECTION,
  GetAlertRuleDetails200Response.JSON_PROPERTY_NOTIFY_ON_CLEAR,
  GetAlertRuleDetails200Response.JSON_PROPERTY_IS_DEFAULT,
  GetAlertRuleDetails200Response.JSON_PROPERTY_ALERT_TYPE,
  GetAlertRuleDetails200Response.JSON_PROPERTY_MINIMUM_SOURCES,
  GetAlertRuleDetails200Response.JSON_PROPERTY_MINIMUM_SOURCES_PCT,
  GetAlertRuleDetails200Response.JSON_PROPERTY_ROUNDS_VIOLATING_MODE,
  GetAlertRuleDetails200Response.JSON_PROPERTY_ROUNDS_VIOLATING_OUT_OF,
  GetAlertRuleDetails200Response.JSON_PROPERTY_ROUNDS_VIOLATING_REQUIRED,
  GetAlertRuleDetails200Response.JSON_PROPERTY_INCLUDE_COVERED_PREFIXES,
  GetAlertRuleDetails200Response.JSON_PROPERTY_SEVERITY,
  GetAlertRuleDetails200Response.JSON_PROPERTY_NOTIFICATIONS,
  GetAlertRuleDetails200Response.JSON_PROPERTY_TESTS,
  GetAlertRuleDetails200Response.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T16:57:45.250800+01:00[Europe/Lisbon]")
public class GetAlertRuleDetails200Response {
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

  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private Severity severity;

  public static final String JSON_PROPERTY_NOTIFICATIONS = "notifications";
  private Notification notifications;

  public static final String JSON_PROPERTY_TESTS = "tests";
  private List<BaseTest> tests = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinksLinks links;

  public GetAlertRuleDetails200Response() { 
  }

  @JsonCreator
  public GetAlertRuleDetails200Response(
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




  public GetAlertRuleDetails200Response ruleName(String ruleName) {
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


  public GetAlertRuleDetails200Response expression(String expression) {
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


  public GetAlertRuleDetails200Response direction(AlertDirection direction) {
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


  public GetAlertRuleDetails200Response notifyOnClear(Boolean notifyOnClear) {
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


  public GetAlertRuleDetails200Response isDefault(Boolean isDefault) {
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


  public GetAlertRuleDetails200Response alertType(AlertType alertType) {
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


  public GetAlertRuleDetails200Response minimumSources(Integer minimumSources) {
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


  public GetAlertRuleDetails200Response minimumSourcesPct(Integer minimumSourcesPct) {
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


  public GetAlertRuleDetails200Response roundsViolatingMode(AlertRoundsViolationMode roundsViolatingMode) {
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


  public GetAlertRuleDetails200Response roundsViolatingOutOf(Integer roundsViolatingOutOf) {
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


  public GetAlertRuleDetails200Response roundsViolatingRequired(Integer roundsViolatingRequired) {
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


  public GetAlertRuleDetails200Response includeCoveredPrefixes(Boolean includeCoveredPrefixes) {
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


  public GetAlertRuleDetails200Response severity(Severity severity) {
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


  public GetAlertRuleDetails200Response notifications(Notification notifications) {
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

  public Notification getNotifications() {
    return notifications;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotifications(Notification notifications) {
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




  public GetAlertRuleDetails200Response links(SelfLinksLinks links) {
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

  public SelfLinksLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(SelfLinksLinks links) {
    this.links = links;
  }


  /**
   * Return true if this getAlertRuleDetails_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAlertRuleDetails200Response getAlertRuleDetails200Response = (GetAlertRuleDetails200Response) o;
    return Objects.equals(this.ruleId, getAlertRuleDetails200Response.ruleId) &&
        Objects.equals(this.ruleName, getAlertRuleDetails200Response.ruleName) &&
        Objects.equals(this.expression, getAlertRuleDetails200Response.expression) &&
        Objects.equals(this.direction, getAlertRuleDetails200Response.direction) &&
        Objects.equals(this.notifyOnClear, getAlertRuleDetails200Response.notifyOnClear) &&
        Objects.equals(this.isDefault, getAlertRuleDetails200Response.isDefault) &&
        Objects.equals(this.alertType, getAlertRuleDetails200Response.alertType) &&
        Objects.equals(this.minimumSources, getAlertRuleDetails200Response.minimumSources) &&
        Objects.equals(this.minimumSourcesPct, getAlertRuleDetails200Response.minimumSourcesPct) &&
        Objects.equals(this.roundsViolatingMode, getAlertRuleDetails200Response.roundsViolatingMode) &&
        Objects.equals(this.roundsViolatingOutOf, getAlertRuleDetails200Response.roundsViolatingOutOf) &&
        Objects.equals(this.roundsViolatingRequired, getAlertRuleDetails200Response.roundsViolatingRequired) &&
        Objects.equals(this.includeCoveredPrefixes, getAlertRuleDetails200Response.includeCoveredPrefixes) &&
        Objects.equals(this.severity, getAlertRuleDetails200Response.severity) &&
        Objects.equals(this.notifications, getAlertRuleDetails200Response.notifications) &&
        Objects.equals(this.tests, getAlertRuleDetails200Response.tests) &&
        Objects.equals(this.links, getAlertRuleDetails200Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleId, ruleName, expression, direction, notifyOnClear, isDefault, alertType, minimumSources, minimumSourcesPct, roundsViolatingMode, roundsViolatingOutOf, roundsViolatingRequired, includeCoveredPrefixes, severity, notifications, tests, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAlertRuleDetails200Response {\n");
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

