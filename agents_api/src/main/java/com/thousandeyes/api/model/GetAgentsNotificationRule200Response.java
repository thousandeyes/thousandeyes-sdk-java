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


package com.thousandeyes.api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.model.Agent;
import com.thousandeyes.api.model.Notification;
import com.thousandeyes.api.model.SelfLinksLinks;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.thousandeyes.JSON;

/**
 * GetAgentsNotificationRule200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:17:26.714202Z[Europe/London]")
public class GetAgentsNotificationRule200Response {
  public static final String SERIALIZED_NAME_RULE_ID = "ruleId";
  @SerializedName(SERIALIZED_NAME_RULE_ID)
  private String ruleId;

  public static final String SERIALIZED_NAME_RULE_NAME = "ruleName";
  @SerializedName(SERIALIZED_NAME_RULE_NAME)
  private String ruleName;

  public static final String SERIALIZED_NAME_EXPRESSION = "expression";
  @SerializedName(SERIALIZED_NAME_EXPRESSION)
  private String expression;

  public static final String SERIALIZED_NAME_NOTIFY_ON_CLEAR = "notifyOnClear";
  @SerializedName(SERIALIZED_NAME_NOTIFY_ON_CLEAR)
  private Boolean notifyOnClear;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "isDefault";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  private Boolean isDefault;

  public static final String SERIALIZED_NAME_AGENTS = "agents";
  @SerializedName(SERIALIZED_NAME_AGENTS)
  private List<Agent> agents;

  public static final String SERIALIZED_NAME_NOTIFICATIONS = "notifications";
  @SerializedName(SERIALIZED_NAME_NOTIFICATIONS)
  private Notification notifications;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private SelfLinksLinks links;

  public GetAgentsNotificationRule200Response() {
  }

  
  public GetAgentsNotificationRule200Response(
     String ruleId
  ) {
    this();
    this.ruleId = ruleId;
  }

   /**
   * Agent notification rule ID
   * @return ruleId
  **/
  @javax.annotation.Nullable
  public String getRuleId() {
    return ruleId;
  }




  public GetAgentsNotificationRule200Response ruleName(String ruleName) {
    
    this.ruleName = ruleName;
    return this;
  }

   /**
   * Name of the agent notification rule
   * @return ruleName
  **/
  @javax.annotation.Nullable
  public String getRuleName() {
    return ruleName;
  }


  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }


  public GetAgentsNotificationRule200Response expression(String expression) {
    
    this.expression = expression;
    return this;
  }

   /**
   * Expression of agent notification rule
   * @return expression
  **/
  @javax.annotation.Nullable
  public String getExpression() {
    return expression;
  }


  public void setExpression(String expression) {
    this.expression = expression;
  }


  public GetAgentsNotificationRule200Response notifyOnClear(Boolean notifyOnClear) {
    
    this.notifyOnClear = notifyOnClear;
    return this;
  }

   /**
   * Send notification when notification clears
   * @return notifyOnClear
  **/
  @javax.annotation.Nullable
  public Boolean getNotifyOnClear() {
    return notifyOnClear;
  }


  public void setNotifyOnClear(Boolean notifyOnClear) {
    this.notifyOnClear = notifyOnClear;
  }


  public GetAgentsNotificationRule200Response isDefault(Boolean isDefault) {
    
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Agent notification rule will be automatically included on all new Enterprise Agents.
   * @return isDefault
  **/
  @javax.annotation.Nullable
  public Boolean getIsDefault() {
    return isDefault;
  }


  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public GetAgentsNotificationRule200Response agents(List<Agent> agents) {
    
    this.agents = agents;
    return this;
  }

  public GetAgentsNotificationRule200Response addAgentsItem(Agent agentsItem) {
    if (this.agents == null) {
      this.agents = new ArrayList<>();
    }
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * Get agents
   * @return agents
  **/
  @javax.annotation.Nullable
  public List<Agent> getAgents() {
    return agents;
  }


  public void setAgents(List<Agent> agents) {
    this.agents = agents;
  }


  public GetAgentsNotificationRule200Response notifications(Notification notifications) {
    
    this.notifications = notifications;
    return this;
  }

   /**
   * Get notifications
   * @return notifications
  **/
  @javax.annotation.Nullable
  public Notification getNotifications() {
    return notifications;
  }


  public void setNotifications(Notification notifications) {
    this.notifications = notifications;
  }


  public GetAgentsNotificationRule200Response links(SelfLinksLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public SelfLinksLinks getLinks() {
    return links;
  }


  public void setLinks(SelfLinksLinks links) {
    this.links = links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAgentsNotificationRule200Response getAgentsNotificationRule200Response = (GetAgentsNotificationRule200Response) o;
    return Objects.equals(this.ruleId, getAgentsNotificationRule200Response.ruleId) &&
        Objects.equals(this.ruleName, getAgentsNotificationRule200Response.ruleName) &&
        Objects.equals(this.expression, getAgentsNotificationRule200Response.expression) &&
        Objects.equals(this.notifyOnClear, getAgentsNotificationRule200Response.notifyOnClear) &&
        Objects.equals(this.isDefault, getAgentsNotificationRule200Response.isDefault) &&
        Objects.equals(this.agents, getAgentsNotificationRule200Response.agents) &&
        Objects.equals(this.notifications, getAgentsNotificationRule200Response.notifications) &&
        Objects.equals(this.links, getAgentsNotificationRule200Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleId, ruleName, expression, notifyOnClear, isDefault, agents, notifications, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAgentsNotificationRule200Response {\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    notifyOnClear: ").append(toIndentedString(notifyOnClear)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("ruleId");
    openapiFields.add("ruleName");
    openapiFields.add("expression");
    openapiFields.add("notifyOnClear");
    openapiFields.add("isDefault");
    openapiFields.add("agents");
    openapiFields.add("notifications");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetAgentsNotificationRule200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetAgentsNotificationRule200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAgentsNotificationRule200Response is not found in the empty JSON string", GetAgentsNotificationRule200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetAgentsNotificationRule200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetAgentsNotificationRule200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ruleId") != null && !jsonObj.get("ruleId").isJsonNull()) && !jsonObj.get("ruleId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ruleId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ruleId").toString()));
      }
      if ((jsonObj.get("ruleName") != null && !jsonObj.get("ruleName").isJsonNull()) && !jsonObj.get("ruleName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ruleName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ruleName").toString()));
      }
      if ((jsonObj.get("expression") != null && !jsonObj.get("expression").isJsonNull()) && !jsonObj.get("expression").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expression` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expression").toString()));
      }
      if (jsonObj.get("agents") != null && !jsonObj.get("agents").isJsonNull()) {
        JsonArray jsonArrayagents = jsonObj.getAsJsonArray("agents");
        if (jsonArrayagents != null) {
          // ensure the json data is an array
          if (!jsonObj.get("agents").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `agents` to be an array in the JSON string but got `%s`", jsonObj.get("agents").toString()));
          }

          // validate the optional field `agents` (array)
          for (int i = 0; i < jsonArrayagents.size(); i++) {
            Agent.validateJsonElement(jsonArrayagents.get(i));
          };
        }
      }
      // validate the optional field `notifications`
      if (jsonObj.get("notifications") != null && !jsonObj.get("notifications").isJsonNull()) {
        Notification.validateJsonElement(jsonObj.get("notifications"));
      }
      // validate the optional field `_links`
      if (jsonObj.get("_links") != null && !jsonObj.get("_links").isJsonNull()) {
        SelfLinksLinks.validateJsonElement(jsonObj.get("_links"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetAgentsNotificationRule200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAgentsNotificationRule200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAgentsNotificationRule200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAgentsNotificationRule200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAgentsNotificationRule200Response>() {
           @Override
           public void write(JsonWriter out, GetAgentsNotificationRule200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetAgentsNotificationRule200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetAgentsNotificationRule200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetAgentsNotificationRule200Response
  * @throws IOException if the JSON string is invalid with respect to GetAgentsNotificationRule200Response
  */
  public static GetAgentsNotificationRule200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAgentsNotificationRule200Response.class);
  }

 /**
  * Convert an instance of GetAgentsNotificationRule200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

