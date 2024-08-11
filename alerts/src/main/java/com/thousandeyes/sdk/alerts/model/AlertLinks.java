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
import com.thousandeyes.sdk.alerts.model.Link;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * An object containing the alert links.
 */
@JsonPropertyOrder({
  AlertLinks.JSON_PROPERTY_TEST,
  AlertLinks.JSON_PROPERTY_RULE,
  AlertLinks.JSON_PROPERTY_APP_LINK,
  AlertLinks.JSON_PROPERTY_SELF
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class AlertLinks {
  public static final String JSON_PROPERTY_TEST = "test";
  private Link test;

  public static final String JSON_PROPERTY_RULE = "rule";
  private Link rule;

  public static final String JSON_PROPERTY_APP_LINK = "appLink";
  private Link appLink;

  public static final String JSON_PROPERTY_SELF = "self";
  private Link self;

  public AlertLinks() { 
  }

  public AlertLinks test(Link test) {
    this.test = test;
    return this;
  }

   /**
   * Get test
   * @return test
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Link getTest() {
    return test;
  }


  @JsonProperty(JSON_PROPERTY_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTest(Link test) {
    this.test = test;
  }


  public AlertLinks rule(Link rule) {
    this.rule = rule;
    return this;
  }

   /**
   * Get rule
   * @return rule
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Link getRule() {
    return rule;
  }


  @JsonProperty(JSON_PROPERTY_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRule(Link rule) {
    this.rule = rule;
  }


  public AlertLinks appLink(Link appLink) {
    this.appLink = appLink;
    return this;
  }

   /**
   * Get appLink
   * @return appLink
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Link getAppLink() {
    return appLink;
  }


  @JsonProperty(JSON_PROPERTY_APP_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppLink(Link appLink) {
    this.appLink = appLink;
  }


  public AlertLinks self(Link self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Link getSelf() {
    return self;
  }


  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelf(Link self) {
    this.self = self;
  }


  /**
   * Return true if this AlertLinks object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertLinks alertLinks = (AlertLinks) o;
    return Objects.equals(this.test, alertLinks.test) &&
        Objects.equals(this.rule, alertLinks.rule) &&
        Objects.equals(this.appLink, alertLinks.appLink) &&
        Objects.equals(this.self, alertLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(test, rule, appLink, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertLinks {\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    appLink: ").append(toIndentedString(appLink)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

