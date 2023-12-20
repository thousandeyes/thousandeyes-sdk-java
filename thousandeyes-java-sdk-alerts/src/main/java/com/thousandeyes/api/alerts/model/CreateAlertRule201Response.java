/*
 * Alerts API
 *  ## Overview Manage all alerts, alert rules and alert suppression windows.
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.alerts.model.AlertRoundsViolationMode;
import com.thousandeyes.api.alerts.model.AlertType;
import com.thousandeyes.api.alerts.model.Notification;
import com.thousandeyes.api.alerts.model.SelfLinksLinks;
import com.thousandeyes.api.alerts.model.Severity;
import com.thousandeyes.api.alerts.model.TestDirection;
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

import com.thousandeyes.api.JSON;

/**
 * CreateAlertRule201Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T14:43:29.716346Z[Europe/Lisbon]")
public class CreateAlertRule201Response {
  public static final String SERIALIZED_NAME_RULE_ID = "ruleId";
  @SerializedName(SERIALIZED_NAME_RULE_ID)
  private String ruleId;

  public static final String SERIALIZED_NAME_RULE_NAME = "ruleName";
  @SerializedName(SERIALIZED_NAME_RULE_NAME)
  private String ruleName;

  public static final String SERIALIZED_NAME_EXPRESSION = "expression";
  @SerializedName(SERIALIZED_NAME_EXPRESSION)
  private String expression;

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private TestDirection direction = TestDirection.TO_TARGET;

  public static final String SERIALIZED_NAME_NOTIFY_ON_CLEAR = "notifyOnClear";
  @SerializedName(SERIALIZED_NAME_NOTIFY_ON_CLEAR)
  private Boolean notifyOnClear;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "isDefault";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  private Boolean isDefault;

  public static final String SERIALIZED_NAME_ALERT_TYPE = "alertType";
  @SerializedName(SERIALIZED_NAME_ALERT_TYPE)
  private AlertType alertType;

  public static final String SERIALIZED_NAME_MINIMUM_SOURCES = "minimumSources";
  @SerializedName(SERIALIZED_NAME_MINIMUM_SOURCES)
  private Integer minimumSources;

  public static final String SERIALIZED_NAME_MINIMUM_SOURCES_PCT = "minimumSourcesPct";
  @SerializedName(SERIALIZED_NAME_MINIMUM_SOURCES_PCT)
  private Integer minimumSourcesPct;

  public static final String SERIALIZED_NAME_ROUNDS_VIOLATING_MODE = "roundsViolatingMode";
  @SerializedName(SERIALIZED_NAME_ROUNDS_VIOLATING_MODE)
  private AlertRoundsViolationMode roundsViolatingMode;

  public static final String SERIALIZED_NAME_ROUNDS_VIOLATING_OUT_OF = "roundsViolatingOutOf";
  @SerializedName(SERIALIZED_NAME_ROUNDS_VIOLATING_OUT_OF)
  private Integer roundsViolatingOutOf;

  public static final String SERIALIZED_NAME_ROUNDS_VIOLATING_REQUIRED = "roundsViolatingRequired";
  @SerializedName(SERIALIZED_NAME_ROUNDS_VIOLATING_REQUIRED)
  private Integer roundsViolatingRequired;

  public static final String SERIALIZED_NAME_INCLUDE_COVERED_PREFIXES = "includeCoveredPrefixes";
  @SerializedName(SERIALIZED_NAME_INCLUDE_COVERED_PREFIXES)
  private Boolean includeCoveredPrefixes;

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private Severity severity;

  public static final String SERIALIZED_NAME_NOTIFICATIONS = "notifications";
  @SerializedName(SERIALIZED_NAME_NOTIFICATIONS)
  private Notification notifications;

  public static final String SERIALIZED_NAME_TEST_IDS = "testIds";
  @SerializedName(SERIALIZED_NAME_TEST_IDS)
  private List<String> testIds;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private SelfLinksLinks links;

  public CreateAlertRule201Response() {
  }

  
  public CreateAlertRule201Response(
     String ruleId
  ) {
    this();
    this.ruleId = ruleId;
  }

   /**
   * Unique ID of the rule.
   * @return ruleId
  **/
  @javax.annotation.Nullable
  public String getRuleId() {
    return ruleId;
  }




  public CreateAlertRule201Response ruleName(String ruleName) {
    
    this.ruleName = ruleName;
    return this;
  }

   /**
   * Name of the alert rule.
   * @return ruleName
  **/
  @javax.annotation.Nonnull
  public String getRuleName() {
    return ruleName;
  }


  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }


  public CreateAlertRule201Response expression(String expression) {
    
    this.expression = expression;
    return this;
  }

   /**
   * The expression of the alert rule.
   * @return expression
  **/
  @javax.annotation.Nonnull
  public String getExpression() {
    return expression;
  }


  public void setExpression(String expression) {
    this.expression = expression;
  }


  public CreateAlertRule201Response direction(TestDirection direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @javax.annotation.Nullable
  public TestDirection getDirection() {
    return direction;
  }


  public void setDirection(TestDirection direction) {
    this.direction = direction;
  }


  public CreateAlertRule201Response notifyOnClear(Boolean notifyOnClear) {
    
    this.notifyOnClear = notifyOnClear;
    return this;
  }

   /**
   * Send notification when alert clears.
   * @return notifyOnClear
  **/
  @javax.annotation.Nullable
  public Boolean getNotifyOnClear() {
    return notifyOnClear;
  }


  public void setNotifyOnClear(Boolean notifyOnClear) {
    this.notifyOnClear = notifyOnClear;
  }


  public CreateAlertRule201Response isDefault(Boolean isDefault) {
    
    this.isDefault = isDefault;
    return this;
  }

   /**
   * If set to &#x60;true&#x60;, this alert rule becomes the default for its test type and is automatically applied to newly created tests with relevant metrics. Only one default alert rule is allowed per test type.
   * @return isDefault
  **/
  @javax.annotation.Nullable
  public Boolean getIsDefault() {
    return isDefault;
  }


  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public CreateAlertRule201Response alertType(AlertType alertType) {
    
    this.alertType = alertType;
    return this;
  }

   /**
   * Get alertType
   * @return alertType
  **/
  @javax.annotation.Nonnull
  public AlertType getAlertType() {
    return alertType;
  }


  public void setAlertType(AlertType alertType) {
    this.alertType = alertType;
  }


  public CreateAlertRule201Response minimumSources(Integer minimumSources) {
    
    this.minimumSources = minimumSources;
    return this;
  }

   /**
   * The minimum number of agents or monitors that must meet the specified criteria to trigger the alert.
   * @return minimumSources
  **/
  @javax.annotation.Nullable
  public Integer getMinimumSources() {
    return minimumSources;
  }


  public void setMinimumSources(Integer minimumSources) {
    this.minimumSources = minimumSources;
  }


  public CreateAlertRule201Response minimumSourcesPct(Integer minimumSourcesPct) {
    
    this.minimumSourcesPct = minimumSourcesPct;
    return this;
  }

   /**
   * The minimum percentage of all assigned agents or monitors that must meet the specified criteria to trigger the alert.
   * @return minimumSourcesPct
  **/
  @javax.annotation.Nullable
  public Integer getMinimumSourcesPct() {
    return minimumSourcesPct;
  }


  public void setMinimumSourcesPct(Integer minimumSourcesPct) {
    this.minimumSourcesPct = minimumSourcesPct;
  }


  public CreateAlertRule201Response roundsViolatingMode(AlertRoundsViolationMode roundsViolatingMode) {
    
    this.roundsViolatingMode = roundsViolatingMode;
    return this;
  }

   /**
   * Get roundsViolatingMode
   * @return roundsViolatingMode
  **/
  @javax.annotation.Nullable
  public AlertRoundsViolationMode getRoundsViolatingMode() {
    return roundsViolatingMode;
  }


  public void setRoundsViolatingMode(AlertRoundsViolationMode roundsViolatingMode) {
    this.roundsViolatingMode = roundsViolatingMode;
  }


  public CreateAlertRule201Response roundsViolatingOutOf(Integer roundsViolatingOutOf) {
    
    this.roundsViolatingOutOf = roundsViolatingOutOf;
    return this;
  }

   /**
   * Specifies the divisor (y value) in the “X of Y times” condition.
   * @return roundsViolatingOutOf
  **/
  @javax.annotation.Nonnull
  public Integer getRoundsViolatingOutOf() {
    return roundsViolatingOutOf;
  }


  public void setRoundsViolatingOutOf(Integer roundsViolatingOutOf) {
    this.roundsViolatingOutOf = roundsViolatingOutOf;
  }


  public CreateAlertRule201Response roundsViolatingRequired(Integer roundsViolatingRequired) {
    
    this.roundsViolatingRequired = roundsViolatingRequired;
    return this;
  }

   /**
   * Specifies the numerator (x value) in the “X of Y times” condition.
   * @return roundsViolatingRequired
  **/
  @javax.annotation.Nonnull
  public Integer getRoundsViolatingRequired() {
    return roundsViolatingRequired;
  }


  public void setRoundsViolatingRequired(Integer roundsViolatingRequired) {
    this.roundsViolatingRequired = roundsViolatingRequired;
  }


  public CreateAlertRule201Response includeCoveredPrefixes(Boolean includeCoveredPrefixes) {
    
    this.includeCoveredPrefixes = includeCoveredPrefixes;
    return this;
  }

   /**
   * Set true to include covered prefixes in the BGP alert rule. Only applicable to BGP alert rules.
   * @return includeCoveredPrefixes
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeCoveredPrefixes() {
    return includeCoveredPrefixes;
  }


  public void setIncludeCoveredPrefixes(Boolean includeCoveredPrefixes) {
    this.includeCoveredPrefixes = includeCoveredPrefixes;
  }


  public CreateAlertRule201Response severity(Severity severity) {
    
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @javax.annotation.Nullable
  public Severity getSeverity() {
    return severity;
  }


  public void setSeverity(Severity severity) {
    this.severity = severity;
  }


  public CreateAlertRule201Response notifications(Notification notifications) {
    
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


  public CreateAlertRule201Response testIds(List<String> testIds) {
    
    this.testIds = testIds;
    return this;
  }

  public CreateAlertRule201Response addTestIdsItem(String testIdsItem) {
    if (this.testIds == null) {
      this.testIds = new ArrayList<>();
    }
    this.testIds.add(testIdsItem);
    return this;
  }

   /**
   * Array of test IDs to link to alert rule (get &#x60;testId&#x60; from &#x60;/tests&#x60; endpoint).
   * @return testIds
  **/
  @javax.annotation.Nullable
  public List<String> getTestIds() {
    return testIds;
  }


  public void setTestIds(List<String> testIds) {
    this.testIds = testIds;
  }


  public CreateAlertRule201Response links(SelfLinksLinks links) {
    
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
    CreateAlertRule201Response createAlertRule201Response = (CreateAlertRule201Response) o;
    return Objects.equals(this.ruleId, createAlertRule201Response.ruleId) &&
        Objects.equals(this.ruleName, createAlertRule201Response.ruleName) &&
        Objects.equals(this.expression, createAlertRule201Response.expression) &&
        Objects.equals(this.direction, createAlertRule201Response.direction) &&
        Objects.equals(this.notifyOnClear, createAlertRule201Response.notifyOnClear) &&
        Objects.equals(this.isDefault, createAlertRule201Response.isDefault) &&
        Objects.equals(this.alertType, createAlertRule201Response.alertType) &&
        Objects.equals(this.minimumSources, createAlertRule201Response.minimumSources) &&
        Objects.equals(this.minimumSourcesPct, createAlertRule201Response.minimumSourcesPct) &&
        Objects.equals(this.roundsViolatingMode, createAlertRule201Response.roundsViolatingMode) &&
        Objects.equals(this.roundsViolatingOutOf, createAlertRule201Response.roundsViolatingOutOf) &&
        Objects.equals(this.roundsViolatingRequired, createAlertRule201Response.roundsViolatingRequired) &&
        Objects.equals(this.includeCoveredPrefixes, createAlertRule201Response.includeCoveredPrefixes) &&
        Objects.equals(this.severity, createAlertRule201Response.severity) &&
        Objects.equals(this.notifications, createAlertRule201Response.notifications) &&
        Objects.equals(this.testIds, createAlertRule201Response.testIds) &&
        Objects.equals(this.links, createAlertRule201Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleId, ruleName, expression, direction, notifyOnClear, isDefault, alertType, minimumSources, minimumSourcesPct, roundsViolatingMode, roundsViolatingOutOf, roundsViolatingRequired, includeCoveredPrefixes, severity, notifications, testIds, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAlertRule201Response {\n");
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
    sb.append("    testIds: ").append(toIndentedString(testIds)).append("\n");
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
    openapiFields.add("direction");
    openapiFields.add("notifyOnClear");
    openapiFields.add("isDefault");
    openapiFields.add("alertType");
    openapiFields.add("minimumSources");
    openapiFields.add("minimumSourcesPct");
    openapiFields.add("roundsViolatingMode");
    openapiFields.add("roundsViolatingOutOf");
    openapiFields.add("roundsViolatingRequired");
    openapiFields.add("includeCoveredPrefixes");
    openapiFields.add("severity");
    openapiFields.add("notifications");
    openapiFields.add("testIds");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ruleName");
    openapiRequiredFields.add("expression");
    openapiRequiredFields.add("alertType");
    openapiRequiredFields.add("roundsViolatingOutOf");
    openapiRequiredFields.add("roundsViolatingRequired");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateAlertRule201Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateAlertRule201Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateAlertRule201Response is not found in the empty JSON string", CreateAlertRule201Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateAlertRule201Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateAlertRule201Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateAlertRule201Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ruleId") != null && !jsonObj.get("ruleId").isJsonNull()) && !jsonObj.get("ruleId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ruleId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ruleId").toString()));
      }
      if (!jsonObj.get("ruleName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ruleName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ruleName").toString()));
      }
      if (!jsonObj.get("expression").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expression` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expression").toString()));
      }
      // validate the optional field `direction`
      if (jsonObj.get("direction") != null && !jsonObj.get("direction").isJsonNull()) {
        TestDirection.validateJsonElement(jsonObj.get("direction"));
      }
      // validate the required field `alertType`
      AlertType.validateJsonElement(jsonObj.get("alertType"));
      // validate the optional field `roundsViolatingMode`
      if (jsonObj.get("roundsViolatingMode") != null && !jsonObj.get("roundsViolatingMode").isJsonNull()) {
        AlertRoundsViolationMode.validateJsonElement(jsonObj.get("roundsViolatingMode"));
      }
      // validate the optional field `severity`
      if (jsonObj.get("severity") != null && !jsonObj.get("severity").isJsonNull()) {
        Severity.validateJsonElement(jsonObj.get("severity"));
      }
      // validate the optional field `notifications`
      if (jsonObj.get("notifications") != null && !jsonObj.get("notifications").isJsonNull()) {
        Notification.validateJsonElement(jsonObj.get("notifications"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("testIds") != null && !jsonObj.get("testIds").isJsonNull() && !jsonObj.get("testIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `testIds` to be an array in the JSON string but got `%s`", jsonObj.get("testIds").toString()));
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
       if (!CreateAlertRule201Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateAlertRule201Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateAlertRule201Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateAlertRule201Response.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateAlertRule201Response>() {
           @Override
           public void write(JsonWriter out, CreateAlertRule201Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateAlertRule201Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateAlertRule201Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateAlertRule201Response
  * @throws IOException if the JSON string is invalid with respect to CreateAlertRule201Response
  */
  public static CreateAlertRule201Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateAlertRule201Response.class);
  }

 /**
  * Convert an instance of CreateAlertRule201Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

