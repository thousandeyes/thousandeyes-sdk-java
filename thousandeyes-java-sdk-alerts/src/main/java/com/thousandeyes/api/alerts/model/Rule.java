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
import com.thousandeyes.api.alerts.model.Severity;
import com.thousandeyes.api.alerts.model.TestDirection;
import java.io.IOException;
import java.util.Arrays;

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
 * Rule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T14:43:29.716346Z[Europe/Lisbon]")
public class Rule {
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

  public Rule() {
  }

  
  public Rule(
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




  public Rule ruleName(String ruleName) {
    
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


  public Rule expression(String expression) {
    
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


  public Rule direction(TestDirection direction) {
    
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


  public Rule notifyOnClear(Boolean notifyOnClear) {
    
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


  public Rule isDefault(Boolean isDefault) {
    
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


  public Rule alertType(AlertType alertType) {
    
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


  public Rule minimumSources(Integer minimumSources) {
    
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


  public Rule minimumSourcesPct(Integer minimumSourcesPct) {
    
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


  public Rule roundsViolatingMode(AlertRoundsViolationMode roundsViolatingMode) {
    
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


  public Rule roundsViolatingOutOf(Integer roundsViolatingOutOf) {
    
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


  public Rule roundsViolatingRequired(Integer roundsViolatingRequired) {
    
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


  public Rule includeCoveredPrefixes(Boolean includeCoveredPrefixes) {
    
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


  public Rule severity(Severity severity) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rule rule = (Rule) o;
    return Objects.equals(this.ruleId, rule.ruleId) &&
        Objects.equals(this.ruleName, rule.ruleName) &&
        Objects.equals(this.expression, rule.expression) &&
        Objects.equals(this.direction, rule.direction) &&
        Objects.equals(this.notifyOnClear, rule.notifyOnClear) &&
        Objects.equals(this.isDefault, rule.isDefault) &&
        Objects.equals(this.alertType, rule.alertType) &&
        Objects.equals(this.minimumSources, rule.minimumSources) &&
        Objects.equals(this.minimumSourcesPct, rule.minimumSourcesPct) &&
        Objects.equals(this.roundsViolatingMode, rule.roundsViolatingMode) &&
        Objects.equals(this.roundsViolatingOutOf, rule.roundsViolatingOutOf) &&
        Objects.equals(this.roundsViolatingRequired, rule.roundsViolatingRequired) &&
        Objects.equals(this.includeCoveredPrefixes, rule.includeCoveredPrefixes) &&
        Objects.equals(this.severity, rule.severity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleId, ruleName, expression, direction, notifyOnClear, isDefault, alertType, minimumSources, minimumSourcesPct, roundsViolatingMode, roundsViolatingOutOf, roundsViolatingRequired, includeCoveredPrefixes, severity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rule {\n");
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
  * @throws IOException if the JSON Element is invalid with respect to Rule
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Rule.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Rule is not found in the empty JSON string", Rule.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Rule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Rule` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Rule.openapiRequiredFields) {
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Rule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Rule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Rule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Rule.class));

       return (TypeAdapter<T>) new TypeAdapter<Rule>() {
           @Override
           public void write(JsonWriter out, Rule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Rule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Rule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Rule
  * @throws IOException if the JSON string is invalid with respect to Rule
  */
  public static Rule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Rule.class);
  }

 /**
  * Convert an instance of Rule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

