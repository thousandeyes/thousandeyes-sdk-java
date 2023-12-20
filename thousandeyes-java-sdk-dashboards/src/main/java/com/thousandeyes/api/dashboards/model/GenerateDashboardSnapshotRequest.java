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


package com.thousandeyes.api.dashboards.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
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

import com.thousandeyes.api.JSON;

/**
 * Request to generate a snapshot from a dashboard.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T12:21:02.427485Z[Europe/Lisbon]")
public class GenerateDashboardSnapshotRequest {
  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DASHBOARD_ID = "dashboardId";
  @SerializedName(SERIALIZED_NAME_DASHBOARD_ID)
  private String dashboardId;

  public static final String SERIALIZED_NAME_ANONYMIZE_DATA = "anonymizeData";
  @SerializedName(SERIALIZED_NAME_ANONYMIZE_DATA)
  private Boolean anonymizeData;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expirationDate";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private OffsetDateTime expirationDate;

  public GenerateDashboardSnapshotRequest() {
  }

  public GenerateDashboardSnapshotRequest startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Date and time to start aggregating data (ISO date-time format).
   * @return startDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public GenerateDashboardSnapshotRequest endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Date and time to end aggregating data (ISO date-time format).
   * @return endDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public GenerateDashboardSnapshotRequest displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The name of the snapshot, does not have to be unique.
   * @return displayName
  **/
  @javax.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public GenerateDashboardSnapshotRequest dashboardId(String dashboardId) {
    
    this.dashboardId = dashboardId;
    return this;
  }

   /**
   * TheIdentifierof the dashboard to generate a snapshot from
   * @return dashboardId
  **/
  @javax.annotation.Nullable
  public String getDashboardId() {
    return dashboardId;
  }


  public void setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
  }


  public GenerateDashboardSnapshotRequest anonymizeData(Boolean anonymizeData) {
    
    this.anonymizeData = anonymizeData;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; to anonymize the data in the snapshot.
   * @return anonymizeData
  **/
  @javax.annotation.Nullable
  public Boolean getAnonymizeData() {
    return anonymizeData;
  }


  public void setAnonymizeData(Boolean anonymizeData) {
    this.anonymizeData = anonymizeData;
  }


  public GenerateDashboardSnapshotRequest timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Specifies the timezone used for date and time fields.
   * @return timezone
  **/
  @javax.annotation.Nullable
  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public GenerateDashboardSnapshotRequest expirationDate(OffsetDateTime expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Expiration date of the snapshot. If unspecified, the snapshot expires 1 year from its creation date. The expiration date must be set within 5 years from the current date and adhere to the ISO date-time format.
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateDashboardSnapshotRequest generateDashboardSnapshotRequest = (GenerateDashboardSnapshotRequest) o;
    return Objects.equals(this.startDate, generateDashboardSnapshotRequest.startDate) &&
        Objects.equals(this.endDate, generateDashboardSnapshotRequest.endDate) &&
        Objects.equals(this.displayName, generateDashboardSnapshotRequest.displayName) &&
        Objects.equals(this.dashboardId, generateDashboardSnapshotRequest.dashboardId) &&
        Objects.equals(this.anonymizeData, generateDashboardSnapshotRequest.anonymizeData) &&
        Objects.equals(this.timezone, generateDashboardSnapshotRequest.timezone) &&
        Objects.equals(this.expirationDate, generateDashboardSnapshotRequest.expirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, displayName, dashboardId, anonymizeData, timezone, expirationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateDashboardSnapshotRequest {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    dashboardId: ").append(toIndentedString(dashboardId)).append("\n");
    sb.append("    anonymizeData: ").append(toIndentedString(anonymizeData)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("displayName");
    openapiFields.add("dashboardId");
    openapiFields.add("anonymizeData");
    openapiFields.add("timezone");
    openapiFields.add("expirationDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GenerateDashboardSnapshotRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GenerateDashboardSnapshotRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GenerateDashboardSnapshotRequest is not found in the empty JSON string", GenerateDashboardSnapshotRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GenerateDashboardSnapshotRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GenerateDashboardSnapshotRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("dashboardId") != null && !jsonObj.get("dashboardId").isJsonNull()) && !jsonObj.get("dashboardId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dashboardId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dashboardId").toString()));
      }
      if ((jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonNull()) && !jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GenerateDashboardSnapshotRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GenerateDashboardSnapshotRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GenerateDashboardSnapshotRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GenerateDashboardSnapshotRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GenerateDashboardSnapshotRequest>() {
           @Override
           public void write(JsonWriter out, GenerateDashboardSnapshotRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GenerateDashboardSnapshotRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GenerateDashboardSnapshotRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GenerateDashboardSnapshotRequest
  * @throws IOException if the JSON string is invalid with respect to GenerateDashboardSnapshotRequest
  */
  public static GenerateDashboardSnapshotRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GenerateDashboardSnapshotRequest.class);
  }

 /**
  * Convert an instance of GenerateDashboardSnapshotRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

