/*
 * Alerts API
 * You can manage the following alert functionalities on the ThousandEyes platform using the Alerts API:  * **Alerts**: Retrieve alert details. Alerts are assigned to tests through alert rules.  * **Alert Rules**: Conditions that you configure in order to highlight or be notified of events of interest in your ThousandEyes tests. When an alert rule’s conditions are met, the associated alert is triggered and the alert becomes active. It remains active until the alert is cleared. Alert rules are reusable across multiple tests..  * **Alert Suppression Windows**: Suppress alerts for tests during periods such as planned maintenance. Windows can be one-time events or recurring events to handle periodic occurrences such as monthly downtime for maintenance.  For more information about the alerts, see [Alerts](https://docs.thousandeyes.com/product-documentation/alerts). 
 *
 * The version of the OpenAPI document: 7.0.12
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
import com.thousandeyes.sdk.alerts.model.WebhookIntegrationType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Webhook notification.
 */
@JsonPropertyOrder({
  NotificationWebhook.JSON_PROPERTY_INTEGRATION_ID,
  NotificationWebhook.JSON_PROPERTY_INTEGRATION_TYPE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class NotificationWebhook {
  public static final String JSON_PROPERTY_INTEGRATION_ID = "integrationId";
  private String integrationId;

  public static final String JSON_PROPERTY_INTEGRATION_TYPE = "integrationType";
  private WebhookIntegrationType integrationType;

  public NotificationWebhook() { 
  }

  public NotificationWebhook integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

   /**
   * Integration ID.
   * @return integrationId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntegrationId() {
    return integrationId;
  }


  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  public NotificationWebhook integrationType(WebhookIntegrationType integrationType) {
    this.integrationType = integrationType;
    return this;
  }

   /**
   * Get integrationType
   * @return integrationType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WebhookIntegrationType getIntegrationType() {
    return integrationType;
  }


  @JsonProperty(JSON_PROPERTY_INTEGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegrationType(WebhookIntegrationType integrationType) {
    this.integrationType = integrationType;
  }


  /**
   * Return true if this NotificationWebhook object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationWebhook notificationWebhook = (NotificationWebhook) o;
    return Objects.equals(this.integrationId, notificationWebhook.integrationId) &&
        Objects.equals(this.integrationType, notificationWebhook.integrationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationId, integrationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationWebhook {\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
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

