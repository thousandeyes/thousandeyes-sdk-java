/*
 * Agents API
 *  ## Overview Manage all agents available to your account in ThousandEyes, including both Cloud and Enterprise Agents.
 *
 * The version of the OpenAPI document: 7.0.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.agents.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.agents.model.NotificationRule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * NotificationRules
 */
@JsonPropertyOrder({
  NotificationRules.JSON_PROPERTY_AGENT_ALERT_RULES
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class NotificationRules {
  public static final String JSON_PROPERTY_AGENT_ALERT_RULES = "agentAlertRules";
  private List<NotificationRule> agentAlertRules = new ArrayList<>();

  public NotificationRules() { 
  }

  public NotificationRules agentAlertRules(List<NotificationRule> agentAlertRules) {
    this.agentAlertRules = agentAlertRules;
    return this;
  }

  public NotificationRules addAgentAlertRulesItem(NotificationRule agentAlertRulesItem) {
    if (this.agentAlertRules == null) {
      this.agentAlertRules = new ArrayList<>();
    }
    this.agentAlertRules.add(agentAlertRulesItem);
    return this;
  }

   /**
   * Get agentAlertRules
   * @return agentAlertRules
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_ALERT_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<NotificationRule> getAgentAlertRules() {
    return agentAlertRules;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_ALERT_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentAlertRules(List<NotificationRule> agentAlertRules) {
    this.agentAlertRules = agentAlertRules;
  }


  /**
   * Return true if this NotificationRules object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationRules notificationRules = (NotificationRules) o;
    return Objects.equals(this.agentAlertRules, notificationRules.agentAlertRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentAlertRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationRules {\n");
    sb.append("    agentAlertRules: ").append(toIndentedString(agentAlertRules)).append("\n");
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

