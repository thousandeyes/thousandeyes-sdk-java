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


package com.thousandeyes.api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.model.AlertType;
import com.thousandeyes.api.model.RuleLinksLinks;
import com.thousandeyes.api.model.Severity;
import com.thousandeyes.api.model.State;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.UUID;

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
 * Alert
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:17:23.082356Z[Europe/London]")
public class Alert {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_ALERT_TYPE = "alertType";
  @SerializedName(SERIALIZED_NAME_ALERT_TYPE)
  private AlertType alertType;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_VIOLATION_COUNT = "violationCount";
  @SerializedName(SERIALIZED_NAME_VIOLATION_COUNT)
  private Integer violationCount;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private BigDecimal duration;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private RuleLinksLinks links;

  public static final String SERIALIZED_NAME_ALERT_RULE_ID = "alertRuleId";
  @SerializedName(SERIALIZED_NAME_ALERT_RULE_ID)
  private String alertRuleId;

  public static final String SERIALIZED_NAME_ALERT_STATE = "alertState";
  @SerializedName(SERIALIZED_NAME_ALERT_STATE)
  private State alertState;

  public static final String SERIALIZED_NAME_ALERT_SEVERITY = "alertSeverity";
  @SerializedName(SERIALIZED_NAME_ALERT_SEVERITY)
  private Severity alertSeverity;

  public Alert() {
  }

  
  public Alert(
     UUID id, 
     OffsetDateTime startDate, 
     OffsetDateTime endDate, 
     String alertRuleId
  ) {
    this();
    this.id = id;
    this.startDate = startDate;
    this.endDate = endDate;
    this.alertRuleId = alertRuleId;
  }

   /**
   * A unique ID for each individual alert occurrence.
   * @return id
  **/
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }




  public Alert alertType(AlertType alertType) {
    
    this.alertType = alertType;
    return this;
  }

   /**
   * Get alertType
   * @return alertType
  **/
  @javax.annotation.Nullable
  public AlertType getAlertType() {
    return alertType;
  }


  public void setAlertType(AlertType alertType) {
    this.alertType = alertType;
  }


   /**
   * The start date and time (in UTC, ISO 8601 format) for querying alerts.
   * @return startDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getStartDate() {
    return startDate;
  }




   /**
   * The end date and time (in UTC, ISO 8601 format) for querying alerts.
   * @return endDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEndDate() {
    return endDate;
  }




  public Alert violationCount(Integer violationCount) {
    
    this.violationCount = violationCount;
    return this;
  }

   /**
   * Number of sources that meet the alert criteria.
   * @return violationCount
  **/
  @javax.annotation.Nullable
  public Integer getViolationCount() {
    return violationCount;
  }


  public void setViolationCount(Integer violationCount) {
    this.violationCount = violationCount;
  }


  public Alert duration(BigDecimal duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Duration in seconds the alert was active
   * @return duration
  **/
  @javax.annotation.Nullable
  public BigDecimal getDuration() {
    return duration;
  }


  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }


  public Alert links(RuleLinksLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public RuleLinksLinks getLinks() {
    return links;
  }


  public void setLinks(RuleLinksLinks links) {
    this.links = links;
  }


   /**
   * Unique ID of the rule.
   * @return alertRuleId
  **/
  @javax.annotation.Nullable
  public String getAlertRuleId() {
    return alertRuleId;
  }




  public Alert alertState(State alertState) {
    
    this.alertState = alertState;
    return this;
  }

   /**
   * Get alertState
   * @return alertState
  **/
  @javax.annotation.Nullable
  public State getAlertState() {
    return alertState;
  }


  public void setAlertState(State alertState) {
    this.alertState = alertState;
  }


  public Alert alertSeverity(Severity alertSeverity) {
    
    this.alertSeverity = alertSeverity;
    return this;
  }

   /**
   * Get alertSeverity
   * @return alertSeverity
  **/
  @javax.annotation.Nullable
  public Severity getAlertSeverity() {
    return alertSeverity;
  }


  public void setAlertSeverity(Severity alertSeverity) {
    this.alertSeverity = alertSeverity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Alert alert = (Alert) o;
    return Objects.equals(this.id, alert.id) &&
        Objects.equals(this.alertType, alert.alertType) &&
        Objects.equals(this.startDate, alert.startDate) &&
        Objects.equals(this.endDate, alert.endDate) &&
        Objects.equals(this.violationCount, alert.violationCount) &&
        Objects.equals(this.duration, alert.duration) &&
        Objects.equals(this.links, alert.links) &&
        Objects.equals(this.alertRuleId, alert.alertRuleId) &&
        Objects.equals(this.alertState, alert.alertState) &&
        Objects.equals(this.alertSeverity, alert.alertSeverity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, alertType, startDate, endDate, violationCount, duration, links, alertRuleId, alertState, alertSeverity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Alert {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    alertType: ").append(toIndentedString(alertType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    violationCount: ").append(toIndentedString(violationCount)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    alertRuleId: ").append(toIndentedString(alertRuleId)).append("\n");
    sb.append("    alertState: ").append(toIndentedString(alertState)).append("\n");
    sb.append("    alertSeverity: ").append(toIndentedString(alertSeverity)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("alertType");
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("violationCount");
    openapiFields.add("duration");
    openapiFields.add("_links");
    openapiFields.add("alertRuleId");
    openapiFields.add("alertState");
    openapiFields.add("alertSeverity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Alert
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Alert.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Alert is not found in the empty JSON string", Alert.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Alert.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Alert` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `_links`
      if (jsonObj.get("_links") != null && !jsonObj.get("_links").isJsonNull()) {
        RuleLinksLinks.validateJsonElement(jsonObj.get("_links"));
      }
      if ((jsonObj.get("alertRuleId") != null && !jsonObj.get("alertRuleId").isJsonNull()) && !jsonObj.get("alertRuleId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alertRuleId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alertRuleId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Alert.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Alert' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Alert> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Alert.class));

       return (TypeAdapter<T>) new TypeAdapter<Alert>() {
           @Override
           public void write(JsonWriter out, Alert value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Alert read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Alert given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Alert
  * @throws IOException if the JSON string is invalid with respect to Alert
  */
  public static Alert fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Alert.class);
  }

 /**
  * Convert an instance of Alert to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

