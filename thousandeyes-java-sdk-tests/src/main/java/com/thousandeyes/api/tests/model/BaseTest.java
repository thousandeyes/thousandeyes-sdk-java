/*
 * Tests API
 *  ### Overview This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.tests.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.tests.model.AlertRule;
import com.thousandeyes.api.tests.model.TestInterval;
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
 * BaseTest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-18T17:52:56.680950Z[Europe/Lisbon]")
public class BaseTest {
  public static final String SERIALIZED_NAME_INTERVAL = "interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private TestInterval interval;

  public static final String SERIALIZED_NAME_ALERTS_ENABLED = "alertsEnabled";
  @SerializedName(SERIALIZED_NAME_ALERTS_ENABLED)
  private Boolean alertsEnabled;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled = true;

  public static final String SERIALIZED_NAME_ALERT_RULES = "alertRules";
  @SerializedName(SERIALIZED_NAME_ALERT_RULES)
  private List<AlertRule> alertRules;

  public BaseTest() {
  }

  public BaseTest interval(TestInterval interval) {
    
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @javax.annotation.Nullable
  public TestInterval getInterval() {
    return interval;
  }


  public void setInterval(TestInterval interval) {
    this.interval = interval;
  }


  public BaseTest alertsEnabled(Boolean alertsEnabled) {
    
    this.alertsEnabled = alertsEnabled;
    return this;
  }

   /**
   * Indicates if alerts are enabled.
   * @return alertsEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getAlertsEnabled() {
    return alertsEnabled;
  }


  public void setAlertsEnabled(Boolean alertsEnabled) {
    this.alertsEnabled = alertsEnabled;
  }


  public BaseTest enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Test is enabled.
   * @return enabled
  **/
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public BaseTest alertRules(List<AlertRule> alertRules) {
    
    this.alertRules = alertRules;
    return this;
  }

  public BaseTest addAlertRulesItem(AlertRule alertRulesItem) {
    if (this.alertRules == null) {
      this.alertRules = new ArrayList<>();
    }
    this.alertRules.add(alertRulesItem);
    return this;
  }

   /**
   * Contains list of enabled alert rule objects.
   * @return alertRules
  **/
  @javax.annotation.Nullable
  public List<AlertRule> getAlertRules() {
    return alertRules;
  }


  public void setAlertRules(List<AlertRule> alertRules) {
    this.alertRules = alertRules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseTest baseTest = (BaseTest) o;
    return Objects.equals(this.interval, baseTest.interval) &&
        Objects.equals(this.alertsEnabled, baseTest.alertsEnabled) &&
        Objects.equals(this.enabled, baseTest.enabled) &&
        Objects.equals(this.alertRules, baseTest.alertRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, alertsEnabled, enabled, alertRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseTest {\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    alertsEnabled: ").append(toIndentedString(alertsEnabled)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    alertRules: ").append(toIndentedString(alertRules)).append("\n");
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
    openapiFields.add("interval");
    openapiFields.add("alertsEnabled");
    openapiFields.add("enabled");
    openapiFields.add("alertRules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BaseTest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BaseTest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BaseTest is not found in the empty JSON string", BaseTest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BaseTest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BaseTest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `interval`
      if (jsonObj.get("interval") != null && !jsonObj.get("interval").isJsonNull()) {
        TestInterval.validateJsonElement(jsonObj.get("interval"));
      }
      if (jsonObj.get("alertRules") != null && !jsonObj.get("alertRules").isJsonNull()) {
        JsonArray jsonArrayalertRules = jsonObj.getAsJsonArray("alertRules");
        if (jsonArrayalertRules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("alertRules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `alertRules` to be an array in the JSON string but got `%s`", jsonObj.get("alertRules").toString()));
          }

          // validate the optional field `alertRules` (array)
          for (int i = 0; i < jsonArrayalertRules.size(); i++) {
            AlertRule.validateJsonElement(jsonArrayalertRules.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BaseTest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BaseTest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BaseTest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BaseTest.class));

       return (TypeAdapter<T>) new TypeAdapter<BaseTest>() {
           @Override
           public void write(JsonWriter out, BaseTest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BaseTest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BaseTest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BaseTest
  * @throws IOException if the JSON string is invalid with respect to BaseTest
  */
  public static BaseTest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BaseTest.class);
  }

 /**
  * Convert an instance of BaseTest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

