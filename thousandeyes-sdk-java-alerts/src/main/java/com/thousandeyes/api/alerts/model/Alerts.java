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
import com.thousandeyes.api.alerts.model.Alert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Alerts
 */
@JsonPropertyOrder({
  Alerts.JSON_PROPERTY_ALERTS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T16:57:45.250800+01:00[Europe/Lisbon]")
public class Alerts {
  public static final String JSON_PROPERTY_ALERTS = "alerts";
  private List<Alert> alerts = new ArrayList<>();

  public Alerts() { 
  }

  public Alerts alerts(List<Alert> alerts) {
    this.alerts = alerts;
    return this;
  }

  public Alerts addalertsItem(Alert alertsItem) {
    if (this.alerts == null) {
      this.alerts = new ArrayList<>();
    }
    this.alerts.add(alertsItem);
    return this;
  }

   /**
   * Get alerts
   * @return alerts
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Alert> getAlerts() {
    return alerts;
  }


  @JsonProperty(JSON_PROPERTY_ALERTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlerts(List<Alert> alerts) {
    this.alerts = alerts;
  }


  /**
   * Return true if this Alerts object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Alerts alerts = (Alerts) o;
    return Objects.equals(this.alerts, alerts.alerts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alerts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Alerts {\n");
    sb.append("    alerts: ").append(toIndentedString(alerts)).append("\n");
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

