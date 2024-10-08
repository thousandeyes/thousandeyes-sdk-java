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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * String representation of the metric at the time that the source began alerting.   Note that the alert &#x60;start&#x60; and &#x60;startDate&#x60; for a particular source do not need to be the same,  as sources may change alerting status throughout an alert&#39;s lifecycle.
 */
@JsonPropertyOrder({
  StartAlertMetrics.JSON_PROPERTY_METRICS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class StartAlertMetrics {
  public static final String JSON_PROPERTY_METRICS = "metrics";
  private String metrics;

  public StartAlertMetrics() { 
  }

  public StartAlertMetrics metrics(String metrics) {
    this.metrics = metrics;
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMetrics() {
    return metrics;
  }


  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetrics(String metrics) {
    this.metrics = metrics;
  }


  /**
   * Return true if this StartAlertMetrics object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartAlertMetrics startAlertMetrics = (StartAlertMetrics) o;
    return Objects.equals(this.metrics, startAlertMetrics.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartAlertMetrics {\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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

