/*
 * Dashboards API
 * Manage ThousandEyes Dashboards
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
import com.thousandeyes.api.model.ApiAlertListAlertType;
import java.io.IOException;
import java.time.OffsetDateTime;
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

import com.thousandeyes.JSON;

/**
 * Alert shown in the alert list widget.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:17:34.047854Z[Europe/London]")
public class ApiAlertListAlert {
  public static final String SERIALIZED_NAME_ALERT_ID = "alertId";
  @SerializedName(SERIALIZED_NAME_ALERT_ID)
  private String alertId;

  public static final String SERIALIZED_NAME_TEST_ID = "testId";
  @SerializedName(SERIALIZED_NAME_TEST_ID)
  private String testId;

  public static final String SERIALIZED_NAME_RULE_ID = "ruleId";
  @SerializedName(SERIALIZED_NAME_RULE_ID)
  private String ruleId;

  public static final String SERIALIZED_NAME_ALERT_SOURCE = "alertSource";
  @SerializedName(SERIALIZED_NAME_ALERT_SOURCE)
  private String alertSource;

  public static final String SERIALIZED_NAME_ALERT_RULE = "alertRule";
  @SerializedName(SERIALIZED_NAME_ALERT_RULE)
  private String alertRule;

  public static final String SERIALIZED_NAME_ALERT_TYPE = "alertType";
  @SerializedName(SERIALIZED_NAME_ALERT_TYPE)
  private ApiAlertListAlertType alertType;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_DURATION_IN_SECONDS = "durationInSeconds";
  @SerializedName(SERIALIZED_NAME_DURATION_IN_SECONDS)
  private Long durationInSeconds;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public ApiAlertListAlert() {
  }

  public ApiAlertListAlert alertId(String alertId) {
    
    this.alertId = alertId;
    return this;
  }

   /**
   * Identifier of the alert.
   * @return alertId
  **/
  @javax.annotation.Nullable
  public String getAlertId() {
    return alertId;
  }


  public void setAlertId(String alertId) {
    this.alertId = alertId;
  }


  public ApiAlertListAlert testId(String testId) {
    
    this.testId = testId;
    return this;
  }

   /**
   * Identifier of the test.
   * @return testId
  **/
  @javax.annotation.Nullable
  public String getTestId() {
    return testId;
  }


  public void setTestId(String testId) {
    this.testId = testId;
  }


  public ApiAlertListAlert ruleId(String ruleId) {
    
    this.ruleId = ruleId;
    return this;
  }

   /**
   * Identifier of the rule.
   * @return ruleId
  **/
  @javax.annotation.Nullable
  public String getRuleId() {
    return ruleId;
  }


  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }


  public ApiAlertListAlert alertSource(String alertSource) {
    
    this.alertSource = alertSource;
    return this;
  }

   /**
   * Name of the agent, monitor or device producing the alert.
   * @return alertSource
  **/
  @javax.annotation.Nullable
  public String getAlertSource() {
    return alertSource;
  }


  public void setAlertSource(String alertSource) {
    this.alertSource = alertSource;
  }


  public ApiAlertListAlert alertRule(String alertRule) {
    
    this.alertRule = alertRule;
    return this;
  }

   /**
   * Name of the alert rule that this alert belongs to.
   * @return alertRule
  **/
  @javax.annotation.Nullable
  public String getAlertRule() {
    return alertRule;
  }


  public void setAlertRule(String alertRule) {
    this.alertRule = alertRule;
  }


  public ApiAlertListAlert alertType(ApiAlertListAlertType alertType) {
    
    this.alertType = alertType;
    return this;
  }

   /**
   * Get alertType
   * @return alertType
  **/
  @javax.annotation.Nullable
  public ApiAlertListAlertType getAlertType() {
    return alertType;
  }


  public void setAlertType(ApiAlertListAlertType alertType) {
    this.alertType = alertType;
  }


  public ApiAlertListAlert startTime(OffsetDateTime startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * UTC date when the alert was first active.
   * @return startTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getStartTime() {
    return startTime;
  }


  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public ApiAlertListAlert durationInSeconds(Long durationInSeconds) {
    
    this.durationInSeconds = durationInSeconds;
    return this;
  }

   /**
   * Number of seconds the alert was active. If it’s still active, this number will increase every second.
   * @return durationInSeconds
  **/
  @javax.annotation.Nullable
  public Long getDurationInSeconds() {
    return durationInSeconds;
  }


  public void setDurationInSeconds(Long durationInSeconds) {
    this.durationInSeconds = durationInSeconds;
  }


  public ApiAlertListAlert active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; if alert is active, &#x60;false&#x60; otherwise.
   * @return active
  **/
  @javax.annotation.Nullable
  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiAlertListAlert apiAlertListAlert = (ApiAlertListAlert) o;
    return Objects.equals(this.alertId, apiAlertListAlert.alertId) &&
        Objects.equals(this.testId, apiAlertListAlert.testId) &&
        Objects.equals(this.ruleId, apiAlertListAlert.ruleId) &&
        Objects.equals(this.alertSource, apiAlertListAlert.alertSource) &&
        Objects.equals(this.alertRule, apiAlertListAlert.alertRule) &&
        Objects.equals(this.alertType, apiAlertListAlert.alertType) &&
        Objects.equals(this.startTime, apiAlertListAlert.startTime) &&
        Objects.equals(this.durationInSeconds, apiAlertListAlert.durationInSeconds) &&
        Objects.equals(this.active, apiAlertListAlert.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertId, testId, ruleId, alertSource, alertRule, alertType, startTime, durationInSeconds, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiAlertListAlert {\n");
    sb.append("    alertId: ").append(toIndentedString(alertId)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    alertSource: ").append(toIndentedString(alertSource)).append("\n");
    sb.append("    alertRule: ").append(toIndentedString(alertRule)).append("\n");
    sb.append("    alertType: ").append(toIndentedString(alertType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    durationInSeconds: ").append(toIndentedString(durationInSeconds)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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
    openapiFields.add("alertId");
    openapiFields.add("testId");
    openapiFields.add("ruleId");
    openapiFields.add("alertSource");
    openapiFields.add("alertRule");
    openapiFields.add("alertType");
    openapiFields.add("startTime");
    openapiFields.add("durationInSeconds");
    openapiFields.add("active");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApiAlertListAlert
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiAlertListAlert.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiAlertListAlert is not found in the empty JSON string", ApiAlertListAlert.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiAlertListAlert.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiAlertListAlert` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("alertId") != null && !jsonObj.get("alertId").isJsonNull()) && !jsonObj.get("alertId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alertId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alertId").toString()));
      }
      if ((jsonObj.get("testId") != null && !jsonObj.get("testId").isJsonNull()) && !jsonObj.get("testId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testId").toString()));
      }
      if ((jsonObj.get("ruleId") != null && !jsonObj.get("ruleId").isJsonNull()) && !jsonObj.get("ruleId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ruleId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ruleId").toString()));
      }
      if ((jsonObj.get("alertSource") != null && !jsonObj.get("alertSource").isJsonNull()) && !jsonObj.get("alertSource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alertSource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alertSource").toString()));
      }
      if ((jsonObj.get("alertRule") != null && !jsonObj.get("alertRule").isJsonNull()) && !jsonObj.get("alertRule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alertRule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alertRule").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiAlertListAlert.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiAlertListAlert' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiAlertListAlert> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiAlertListAlert.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiAlertListAlert>() {
           @Override
           public void write(JsonWriter out, ApiAlertListAlert value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiAlertListAlert read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiAlertListAlert given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiAlertListAlert
  * @throws IOException if the JSON string is invalid with respect to ApiAlertListAlert
  */
  public static ApiAlertListAlert fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiAlertListAlert.class);
  }

 /**
  * Convert an instance of ApiAlertListAlert to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

