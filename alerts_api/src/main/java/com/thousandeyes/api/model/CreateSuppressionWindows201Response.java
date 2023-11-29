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
import com.thousandeyes.api.model.AlertSuppressionWindowState;
import com.thousandeyes.api.model.BaseTest;
import com.thousandeyes.api.model.EndRepeat;
import com.thousandeyes.api.model.Repeat;
import com.thousandeyes.api.model.SelfLinksLinks;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * CreateSuppressionWindows201Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:17:23.082356Z[Europe/London]")
public class CreateSuppressionWindows201Response {
  public static final String SERIALIZED_NAME_ALERT_SUPPRESSION_WINDOW_ID = "alertSuppressionWindowId";
  @SerializedName(SERIALIZED_NAME_ALERT_SUPPRESSION_WINDOW_ID)
  private String alertSuppressionWindowId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IS_ENABLED = "isEnabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private AlertSuppressionWindowState status;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_REPEAT = "repeat";
  @SerializedName(SERIALIZED_NAME_REPEAT)
  private Repeat repeat;

  public static final String SERIALIZED_NAME_END_REPEAT = "endRepeat";
  @SerializedName(SERIALIZED_NAME_END_REPEAT)
  private EndRepeat endRepeat;

  public static final String SERIALIZED_NAME_TESTS = "tests";
  @SerializedName(SERIALIZED_NAME_TESTS)
  private List<BaseTest> tests;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private SelfLinksLinks links;

  public CreateSuppressionWindows201Response() {
  }

  
  public CreateSuppressionWindows201Response(
     String alertSuppressionWindowId
  ) {
    this();
    this.alertSuppressionWindowId = alertSuppressionWindowId;
  }

   /**
   * Unique ID of the alert suppression window.
   * @return alertSuppressionWindowId
  **/
  @javax.annotation.Nullable
  public String getAlertSuppressionWindowId() {
    return alertSuppressionWindowId;
  }




  public CreateSuppressionWindows201Response name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the alert suppression window.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateSuppressionWindows201Response isEnabled(Boolean isEnabled) {
    
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Set to &#x60;false&#x60; for &#x60;disabled&#x60;, &#x60;true&#x60; for &#x60;enabled&#x60;.
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getIsEnabled() {
    return isEnabled;
  }


  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public CreateSuppressionWindows201Response status(AlertSuppressionWindowState status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public AlertSuppressionWindowState getStatus() {
    return status;
  }


  public void setStatus(AlertSuppressionWindowState status) {
    this.status = status;
  }


  public CreateSuppressionWindows201Response startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The date/time when the alert suppression window starts (ISO date-time format).
   * @return startDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public CreateSuppressionWindows201Response duration(Integer duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Duration in seconds the suppression window is active.
   * @return duration
  **/
  @javax.annotation.Nullable
  public Integer getDuration() {
    return duration;
  }


  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public CreateSuppressionWindows201Response repeat(Repeat repeat) {
    
    this.repeat = repeat;
    return this;
  }

   /**
   * Get repeat
   * @return repeat
  **/
  @javax.annotation.Nullable
  public Repeat getRepeat() {
    return repeat;
  }


  public void setRepeat(Repeat repeat) {
    this.repeat = repeat;
  }


  public CreateSuppressionWindows201Response endRepeat(EndRepeat endRepeat) {
    
    this.endRepeat = endRepeat;
    return this;
  }

   /**
   * Get endRepeat
   * @return endRepeat
  **/
  @javax.annotation.Nullable
  public EndRepeat getEndRepeat() {
    return endRepeat;
  }


  public void setEndRepeat(EndRepeat endRepeat) {
    this.endRepeat = endRepeat;
  }


  public CreateSuppressionWindows201Response tests(List<BaseTest> tests) {
    
    this.tests = tests;
    return this;
  }

  public CreateSuppressionWindows201Response addTestsItem(BaseTest testsItem) {
    if (this.tests == null) {
      this.tests = new ArrayList<>();
    }
    this.tests.add(testsItem);
    return this;
  }

   /**
   * List of tests assigned to the alert suppression window.
   * @return tests
  **/
  @javax.annotation.Nullable
  public List<BaseTest> getTests() {
    return tests;
  }


  public void setTests(List<BaseTest> tests) {
    this.tests = tests;
  }


  public CreateSuppressionWindows201Response links(SelfLinksLinks links) {
    
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
    CreateSuppressionWindows201Response createSuppressionWindows201Response = (CreateSuppressionWindows201Response) o;
    return Objects.equals(this.alertSuppressionWindowId, createSuppressionWindows201Response.alertSuppressionWindowId) &&
        Objects.equals(this.name, createSuppressionWindows201Response.name) &&
        Objects.equals(this.isEnabled, createSuppressionWindows201Response.isEnabled) &&
        Objects.equals(this.status, createSuppressionWindows201Response.status) &&
        Objects.equals(this.startDate, createSuppressionWindows201Response.startDate) &&
        Objects.equals(this.duration, createSuppressionWindows201Response.duration) &&
        Objects.equals(this.repeat, createSuppressionWindows201Response.repeat) &&
        Objects.equals(this.endRepeat, createSuppressionWindows201Response.endRepeat) &&
        Objects.equals(this.tests, createSuppressionWindows201Response.tests) &&
        Objects.equals(this.links, createSuppressionWindows201Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertSuppressionWindowId, name, isEnabled, status, startDate, duration, repeat, endRepeat, tests, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSuppressionWindows201Response {\n");
    sb.append("    alertSuppressionWindowId: ").append(toIndentedString(alertSuppressionWindowId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    repeat: ").append(toIndentedString(repeat)).append("\n");
    sb.append("    endRepeat: ").append(toIndentedString(endRepeat)).append("\n");
    sb.append("    tests: ").append(toIndentedString(tests)).append("\n");
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
    openapiFields.add("alertSuppressionWindowId");
    openapiFields.add("name");
    openapiFields.add("isEnabled");
    openapiFields.add("status");
    openapiFields.add("startDate");
    openapiFields.add("duration");
    openapiFields.add("repeat");
    openapiFields.add("endRepeat");
    openapiFields.add("tests");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateSuppressionWindows201Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateSuppressionWindows201Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateSuppressionWindows201Response is not found in the empty JSON string", CreateSuppressionWindows201Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateSuppressionWindows201Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateSuppressionWindows201Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("alertSuppressionWindowId") != null && !jsonObj.get("alertSuppressionWindowId").isJsonNull()) && !jsonObj.get("alertSuppressionWindowId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alertSuppressionWindowId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alertSuppressionWindowId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `repeat`
      if (jsonObj.get("repeat") != null && !jsonObj.get("repeat").isJsonNull()) {
        Repeat.validateJsonElement(jsonObj.get("repeat"));
      }
      // validate the optional field `endRepeat`
      if (jsonObj.get("endRepeat") != null && !jsonObj.get("endRepeat").isJsonNull()) {
        EndRepeat.validateJsonElement(jsonObj.get("endRepeat"));
      }
      if (jsonObj.get("tests") != null && !jsonObj.get("tests").isJsonNull()) {
        JsonArray jsonArraytests = jsonObj.getAsJsonArray("tests");
        if (jsonArraytests != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tests").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tests` to be an array in the JSON string but got `%s`", jsonObj.get("tests").toString()));
          }

          // validate the optional field `tests` (array)
          for (int i = 0; i < jsonArraytests.size(); i++) {
            BaseTest.validateJsonElement(jsonArraytests.get(i));
          };
        }
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
       if (!CreateSuppressionWindows201Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateSuppressionWindows201Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateSuppressionWindows201Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateSuppressionWindows201Response.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateSuppressionWindows201Response>() {
           @Override
           public void write(JsonWriter out, CreateSuppressionWindows201Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateSuppressionWindows201Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateSuppressionWindows201Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateSuppressionWindows201Response
  * @throws IOException if the JSON string is invalid with respect to CreateSuppressionWindows201Response
  */
  public static CreateSuppressionWindows201Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSuppressionWindows201Response.class);
  }

 /**
  * Convert an instance of CreateSuppressionWindows201Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

