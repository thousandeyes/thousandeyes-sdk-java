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


package com.thousandeyes.api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.model.Agent;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * DnsServerTestResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:17:31.708307Z[Europe/London]")
public class DnsServerTestResult {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_ROUND_ID = "roundId";
  @SerializedName(SERIALIZED_NAME_ROUND_ID)
  private Integer roundId;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Object links = null;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private Integer startTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private Integer endTime;

  public static final String SERIALIZED_NAME_AGENT = "agent";
  @SerializedName(SERIALIZED_NAME_AGENT)
  private Agent agent;

  public static final String SERIALIZED_NAME_SERVER_ID = "serverId";
  @SerializedName(SERIALIZED_NAME_SERVER_ID)
  private String serverId;

  public static final String SERIALIZED_NAME_SERVER = "server";
  @SerializedName(SERIALIZED_NAME_SERVER)
  private String server;

  public static final String SERIALIZED_NAME_RESOLUTION_TIME = "resolutionTime";
  @SerializedName(SERIALIZED_NAME_RESOLUTION_TIME)
  private Integer resolutionTime;

  public static final String SERIALIZED_NAME_ERROR_DETAILS = "errorDetails";
  @SerializedName(SERIALIZED_NAME_ERROR_DETAILS)
  private String errorDetails;

  public static final String SERIALIZED_NAME_MAPPINGS = "mappings";
  @SerializedName(SERIALIZED_NAME_MAPPINGS)
  private String mappings;

  public DnsServerTestResult() {
  }

  
  public DnsServerTestResult(
     OffsetDateTime date, 
     Integer roundId, 
     Integer startTime, 
     Integer endTime, 
     String serverId, 
     String server, 
     Integer resolutionTime, 
     String errorDetails, 
     String mappings
  ) {
    this();
    this.date = date;
    this.roundId = roundId;
    this.startTime = startTime;
    this.endTime = endTime;
    this.serverId = serverId;
    this.server = server;
    this.resolutionTime = resolutionTime;
    this.errorDetails = errorDetails;
    this.mappings = mappings;
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




  public DnsServerTestResult links(Object links) {
    
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


   /**
   * Epoch time (seconds) indicating the start time of the round
   * @return startTime
  **/
  @javax.annotation.Nullable
  public Integer getStartTime() {
    return startTime;
  }




   /**
   * Epoch time (seconds) indicating the end time of the round
   * @return endTime
  **/
  @javax.annotation.Nullable
  public Integer getEndTime() {
    return endTime;
  }




  public DnsServerTestResult agent(Agent agent) {
    
    this.agent = agent;
    return this;
  }

   /**
   * Get agent
   * @return agent
  **/
  @javax.annotation.Nullable
  public Agent getAgent() {
    return agent;
  }


  public void setAgent(Agent agent) {
    this.agent = agent;
  }


   /**
   * Internal ID of DNS server being tested
   * @return serverId
  **/
  @javax.annotation.Nullable
  public String getServerId() {
    return serverId;
  }




   /**
   * Canonical name of server being tested
   * @return server
  **/
  @javax.annotation.Nullable
  public String getServer() {
    return server;
  }




   /**
   * How long it took to run the query against the serverow long it took to run the query against the server
   * @return resolutionTime
  **/
  @javax.annotation.Nullable
  public Integer getResolutionTime() {
    return resolutionTime;
  }




   /**
   * Error details, if an error were encountered
   * @return errorDetails
  **/
  @javax.annotation.Nullable
  public String getErrorDetails() {
    return errorDetails;
  }




   /**
   * Final mappings returned from the request
   * @return mappings
  **/
  @javax.annotation.Nullable
  public String getMappings() {
    return mappings;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsServerTestResult dnsServerTestResult = (DnsServerTestResult) o;
    return Objects.equals(this.date, dnsServerTestResult.date) &&
        Objects.equals(this.roundId, dnsServerTestResult.roundId) &&
        Objects.equals(this.links, dnsServerTestResult.links) &&
        Objects.equals(this.startTime, dnsServerTestResult.startTime) &&
        Objects.equals(this.endTime, dnsServerTestResult.endTime) &&
        Objects.equals(this.agent, dnsServerTestResult.agent) &&
        Objects.equals(this.serverId, dnsServerTestResult.serverId) &&
        Objects.equals(this.server, dnsServerTestResult.server) &&
        Objects.equals(this.resolutionTime, dnsServerTestResult.resolutionTime) &&
        Objects.equals(this.errorDetails, dnsServerTestResult.errorDetails) &&
        Objects.equals(this.mappings, dnsServerTestResult.mappings);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, roundId, links, startTime, endTime, agent, serverId, server, resolutionTime, errorDetails, mappings);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsServerTestResult {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    resolutionTime: ").append(toIndentedString(resolutionTime)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
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
    openapiFields.add("startTime");
    openapiFields.add("endTime");
    openapiFields.add("agent");
    openapiFields.add("serverId");
    openapiFields.add("server");
    openapiFields.add("resolutionTime");
    openapiFields.add("errorDetails");
    openapiFields.add("mappings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DnsServerTestResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DnsServerTestResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DnsServerTestResult is not found in the empty JSON string", DnsServerTestResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DnsServerTestResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DnsServerTestResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `agent`
      if (jsonObj.get("agent") != null && !jsonObj.get("agent").isJsonNull()) {
        Agent.validateJsonElement(jsonObj.get("agent"));
      }
      if ((jsonObj.get("serverId") != null && !jsonObj.get("serverId").isJsonNull()) && !jsonObj.get("serverId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serverId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serverId").toString()));
      }
      if ((jsonObj.get("server") != null && !jsonObj.get("server").isJsonNull()) && !jsonObj.get("server").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `server` to be a primitive type in the JSON string but got `%s`", jsonObj.get("server").toString()));
      }
      if ((jsonObj.get("errorDetails") != null && !jsonObj.get("errorDetails").isJsonNull()) && !jsonObj.get("errorDetails").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorDetails` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorDetails").toString()));
      }
      if ((jsonObj.get("mappings") != null && !jsonObj.get("mappings").isJsonNull()) && !jsonObj.get("mappings").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mappings` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mappings").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DnsServerTestResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DnsServerTestResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DnsServerTestResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DnsServerTestResult.class));

       return (TypeAdapter<T>) new TypeAdapter<DnsServerTestResult>() {
           @Override
           public void write(JsonWriter out, DnsServerTestResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DnsServerTestResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DnsServerTestResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DnsServerTestResult
  * @throws IOException if the JSON string is invalid with respect to DnsServerTestResult
  */
  public static DnsServerTestResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DnsServerTestResult.class);
  }

 /**
  * Convert an instance of DnsServerTestResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

