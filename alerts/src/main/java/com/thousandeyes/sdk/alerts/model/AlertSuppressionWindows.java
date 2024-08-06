/*
 * Alerts API
 * You can manage the following alert functionalities on the ThousandEyes platform using the Alerts API:  * **Alerts**: Retrieve alert details. Alerts are assigned to tests through alert rules.  * **Alert Rules**: Conditions that you configure in order to highlight or be notified of events of interest in your ThousandEyes tests. When an alert rule’s conditions are met, the associated alert is triggered and the alert becomes active. It remains active until the alert is cleared. Alert rules are reusable across multiple tests..  * **Alert Suppression Windows**: Suppress alerts for tests during periods such as planned maintenance. Windows can be one-time events or recurring events to handle periodic occurrences such as monthly downtime for maintenance.  For more information about the alerts, see [Alerts](https://docs.thousandeyes.com/product-documentation/alerts). 
 *
 * The version of the OpenAPI document: 7.0.14
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
import com.thousandeyes.sdk.alerts.model.AlertSuppressionWindow;
import com.thousandeyes.sdk.alerts.model.SelfLinks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Alert suppression windows.
 */
@JsonPropertyOrder({
  AlertSuppressionWindows.JSON_PROPERTY_ALERT_SUPPRESSION_WINDOWS,
  AlertSuppressionWindows.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class AlertSuppressionWindows {
  public static final String JSON_PROPERTY_ALERT_SUPPRESSION_WINDOWS = "alertSuppressionWindows";
  private List<AlertSuppressionWindow> alertSuppressionWindows = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinks links;

  public AlertSuppressionWindows() { 
  }

  public AlertSuppressionWindows alertSuppressionWindows(List<AlertSuppressionWindow> alertSuppressionWindows) {
    this.alertSuppressionWindows = alertSuppressionWindows;
    return this;
  }

  public AlertSuppressionWindows addAlertSuppressionWindowsItem(AlertSuppressionWindow alertSuppressionWindowsItem) {
    if (this.alertSuppressionWindows == null) {
      this.alertSuppressionWindows = new ArrayList<>();
    }
    this.alertSuppressionWindows.add(alertSuppressionWindowsItem);
    return this;
  }

   /**
   * Get alertSuppressionWindows
   * @return alertSuppressionWindows
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERT_SUPPRESSION_WINDOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AlertSuppressionWindow> getAlertSuppressionWindows() {
    return alertSuppressionWindows;
  }


  @JsonProperty(JSON_PROPERTY_ALERT_SUPPRESSION_WINDOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlertSuppressionWindows(List<AlertSuppressionWindow> alertSuppressionWindows) {
    this.alertSuppressionWindows = alertSuppressionWindows;
  }


  public AlertSuppressionWindows links(SelfLinks links) {
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
   * Return true if this AlertSuppressionWindows object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertSuppressionWindows alertSuppressionWindows = (AlertSuppressionWindows) o;
    return Objects.equals(this.alertSuppressionWindows, alertSuppressionWindows.alertSuppressionWindows) &&
        Objects.equals(this.links, alertSuppressionWindows.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertSuppressionWindows, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertSuppressionWindows {\n");
    sb.append("    alertSuppressionWindows: ").append(toIndentedString(alertSuppressionWindows)).append("\n");
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

