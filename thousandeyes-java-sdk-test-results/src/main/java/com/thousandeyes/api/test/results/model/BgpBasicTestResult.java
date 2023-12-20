/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.test.results.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.test.results.model.Monitor;
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

import com.thousandeyes.api.test.JSON;

/**
 * BgpBasicTestResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T14:43:31.504596Z[Europe/Lisbon]")
public class BgpBasicTestResult {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_ROUND_ID = "roundId";
  @SerializedName(SERIALIZED_NAME_ROUND_ID)
  private Integer roundId;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Object links;

  public static final String SERIALIZED_NAME_MONITOR = "monitor";
  @SerializedName(SERIALIZED_NAME_MONITOR)
  private Monitor monitor;

  public static final String SERIALIZED_NAME_PREFIX_ID = "prefixId";
  @SerializedName(SERIALIZED_NAME_PREFIX_ID)
  private String prefixId;

  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public BgpBasicTestResult() {
  }

  
  public BgpBasicTestResult(
     OffsetDateTime date, 
     Integer roundId
  ) {
    this();
    this.date = date;
    this.roundId = roundId;
  }

   /**
   * Data point date UTC (ISO date-time format).
   * @return date
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDate() {
    return date;
  }




   /**
   * Epoch time (seconds) indicating the start time of the round
   * @return roundId
  **/
  @javax.annotation.Nullable
  public Integer getRoundId() {
    return roundId;
  }




  public BgpBasicTestResult links(Object links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public Object getLinks() {
    return links;
  }


  public void setLinks(Object links) {
    this.links = links;
  }


  public BgpBasicTestResult monitor(Monitor monitor) {
    
    this.monitor = monitor;
    return this;
  }

   /**
   * Get monitor
   * @return monitor
  **/
  @javax.annotation.Nullable
  public Monitor getMonitor() {
    return monitor;
  }


  public void setMonitor(Monitor monitor) {
    this.monitor = monitor;
  }


  public BgpBasicTestResult prefixId(String prefixId) {
    
    this.prefixId = prefixId;
    return this;
  }

   /**
   * Internally tracked prefix ID.
   * @return prefixId
  **/
  @javax.annotation.Nullable
  public String getPrefixId() {
    return prefixId;
  }


  public void setPrefixId(String prefixId) {
    this.prefixId = prefixId;
  }


  public BgpBasicTestResult prefix(String prefix) {
    
    this.prefix = prefix;
    return this;
  }

   /**
   * Prefix being tracked.
   * @return prefix
  **/
  @javax.annotation.Nullable
  public String getPrefix() {
    return prefix;
  }


  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BgpBasicTestResult bgpBasicTestResult = (BgpBasicTestResult) o;
    return Objects.equals(this.date, bgpBasicTestResult.date) &&
        Objects.equals(this.roundId, bgpBasicTestResult.roundId) &&
        Objects.equals(this.links, bgpBasicTestResult.links) &&
        Objects.equals(this.monitor, bgpBasicTestResult.monitor) &&
        Objects.equals(this.prefixId, bgpBasicTestResult.prefixId) &&
        Objects.equals(this.prefix, bgpBasicTestResult.prefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, roundId, links, monitor, prefixId, prefix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BgpBasicTestResult {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    monitor: ").append(toIndentedString(monitor)).append("\n");
    sb.append("    prefixId: ").append(toIndentedString(prefixId)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("roundId");
    openapiFields.add("_links");
    openapiFields.add("monitor");
    openapiFields.add("prefixId");
    openapiFields.add("prefix");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BgpBasicTestResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BgpBasicTestResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BgpBasicTestResult is not found in the empty JSON string", BgpBasicTestResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BgpBasicTestResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BgpBasicTestResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `monitor`
      if (jsonObj.get("monitor") != null && !jsonObj.get("monitor").isJsonNull()) {
        Monitor.validateJsonElement(jsonObj.get("monitor"));
      }
      if ((jsonObj.get("prefixId") != null && !jsonObj.get("prefixId").isJsonNull()) && !jsonObj.get("prefixId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prefixId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prefixId").toString()));
      }
      if ((jsonObj.get("prefix") != null && !jsonObj.get("prefix").isJsonNull()) && !jsonObj.get("prefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prefix").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BgpBasicTestResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BgpBasicTestResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BgpBasicTestResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BgpBasicTestResult.class));

       return (TypeAdapter<T>) new TypeAdapter<BgpBasicTestResult>() {
           @Override
           public void write(JsonWriter out, BgpBasicTestResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BgpBasicTestResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BgpBasicTestResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BgpBasicTestResult
  * @throws IOException if the JSON string is invalid with respect to BgpBasicTestResult
  */
  public static BgpBasicTestResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BgpBasicTestResult.class);
  }

 /**
  * Convert an instance of BgpBasicTestResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

