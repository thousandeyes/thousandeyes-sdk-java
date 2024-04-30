/*
 * Agents API
 *  ## Overview Manage all agents available to your account in ThousandEyes, including both Cloud and Enterprise Agents.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.agents.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.agents.model.NotificationRule;
import com.thousandeyes.api.agents.model.SelfLinksLinks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GetAgentsNotificationRules200Response
 */
@JsonPropertyOrder({
  GetAgentsNotificationRules200Response.JSON_PROPERTY_AGENT_ALERT_RULES,
  GetAgentsNotificationRules200Response.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-30T10:06:13.083499+01:00[Europe/Lisbon]")
public class GetAgentsNotificationRules200Response {
  public static final String JSON_PROPERTY_AGENT_ALERT_RULES = "agentAlertRules";
  private List<NotificationRule> agentAlertRules = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinksLinks links;

  public GetAgentsNotificationRules200Response() { 
  }

  public GetAgentsNotificationRules200Response agentAlertRules(List<NotificationRule> agentAlertRules) {
    this.agentAlertRules = agentAlertRules;
    return this;
  }

  public GetAgentsNotificationRules200Response addAgentAlertRulesItem(NotificationRule agentAlertRulesItem) {
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


  public GetAgentsNotificationRules200Response links(SelfLinksLinks links) {
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
   * Return true if this getAgentsNotificationRules_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAgentsNotificationRules200Response getAgentsNotificationRules200Response = (GetAgentsNotificationRules200Response) o;
    return Objects.equals(this.agentAlertRules, getAgentsNotificationRules200Response.agentAlertRules) &&
        Objects.equals(this.links, getAgentsNotificationRules200Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentAlertRules, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAgentsNotificationRules200Response {\n");
    sb.append("    agentAlertRules: ").append(toIndentedString(agentAlertRules)).append("\n");
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

