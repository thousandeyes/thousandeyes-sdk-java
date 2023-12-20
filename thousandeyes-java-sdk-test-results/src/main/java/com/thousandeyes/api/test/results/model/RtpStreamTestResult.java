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
import com.thousandeyes.api.test.results.model.Agent;
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
 * RtpStreamTestResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T12:21:04.702673Z[Europe/Lisbon]")
public class RtpStreamTestResult {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_ROUND_ID = "roundId";
  @SerializedName(SERIALIZED_NAME_ROUND_ID)
  private Integer roundId;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Object links;

  public static final String SERIALIZED_NAME_AGENT = "agent";
  @SerializedName(SERIALIZED_NAME_AGENT)
  private Agent agent;

  public static final String SERIALIZED_NAME_SERVER_IP = "serverIp";
  @SerializedName(SERIALIZED_NAME_SERVER_IP)
  private String serverIp;

  public static final String SERIALIZED_NAME_DSCP = "dscp";
  @SerializedName(SERIALIZED_NAME_DSCP)
  private String dscp;

  public static final String SERIALIZED_NAME_DSCP_NAME = "dscpName";
  @SerializedName(SERIALIZED_NAME_DSCP_NAME)
  private String dscpName;

  public static final String SERIALIZED_NAME_MOS = "mos";
  @SerializedName(SERIALIZED_NAME_MOS)
  private Float mos;

  public static final String SERIALIZED_NAME_CODEC_NAME = "codecName";
  @SerializedName(SERIALIZED_NAME_CODEC_NAME)
  private String codecName;

  public static final String SERIALIZED_NAME_CODEC_MAX_MOS = "codecMaxMos";
  @SerializedName(SERIALIZED_NAME_CODEC_MAX_MOS)
  private Float codecMaxMos;

  public static final String SERIALIZED_NAME_LOSS = "loss";
  @SerializedName(SERIALIZED_NAME_LOSS)
  private Float loss;

  public static final String SERIALIZED_NAME_DISCARDS = "discards";
  @SerializedName(SERIALIZED_NAME_DISCARDS)
  private Float discards;

  public static final String SERIALIZED_NAME_LATENCY = "latency";
  @SerializedName(SERIALIZED_NAME_LATENCY)
  private Integer latency;

  public static final String SERIALIZED_NAME_PDV = "pdv";
  @SerializedName(SERIALIZED_NAME_PDV)
  private Integer pdv;

  public static final String SERIALIZED_NAME_ERROR_DETAIL = "errorDetail";
  @SerializedName(SERIALIZED_NAME_ERROR_DETAIL)
  private String errorDetail;

  public RtpStreamTestResult() {
  }

  
  public RtpStreamTestResult(
     OffsetDateTime date, 
     Integer roundId, 
     String serverIp, 
     String dscp, 
     String dscpName, 
     Float mos, 
     String codecName, 
     Float codecMaxMos, 
     Float loss, 
     Float discards, 
     Integer latency, 
     Integer pdv, 
     String errorDetail
  ) {
    this();
    this.date = date;
    this.roundId = roundId;
    this.serverIp = serverIp;
    this.dscp = dscp;
    this.dscpName = dscpName;
    this.mos = mos;
    this.codecName = codecName;
    this.codecMaxMos = codecMaxMos;
    this.loss = loss;
    this.discards = discards;
    this.latency = latency;
    this.pdv = pdv;
    this.errorDetail = errorDetail;
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




  public RtpStreamTestResult links(Object links) {
    
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


  public RtpStreamTestResult agent(Agent agent) {
    
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
   * Target agent IP address
   * @return serverIp
  **/
  @javax.annotation.Nullable
  public String getServerIp() {
    return serverIp;
  }




   /**
   * DSCP value received by the server from the agent
   * @return dscp
  **/
  @javax.annotation.Nullable
  public String getDscp() {
    return dscp;
  }




   /**
   * Name of DSCP value received by the server from the agent
   * @return dscpName
  **/
  @javax.annotation.Nullable
  public String getDscpName() {
    return dscpName;
  }




   /**
   * Mean opinion score for agent’s stream
   * @return mos
  **/
  @javax.annotation.Nullable
  public Float getMos() {
    return mos;
  }




   /**
   * Name of codec used by agen
   * @return codecName
  **/
  @javax.annotation.Nullable
  public String getCodecName() {
    return codecName;
  }




   /**
   * Maximum value of Mean Opinion Score based on codec selection
   * @return codecMaxMos
  **/
  @javax.annotation.Nullable
  public Float getCodecMaxMos() {
    return codecMaxMos;
  }




   /**
   * Percentage value of packets sent from agent not received by server
   * @return loss
  **/
  @javax.annotation.Nullable
  public Float getLoss() {
    return loss;
  }




   /**
   * Percentage of packets discarded
   * @return discards
  **/
  @javax.annotation.Nullable
  public Float getDiscards() {
    return discards;
  }




   /**
   * Time to send packets from source to server in milliseconds
   * @return latency
  **/
  @javax.annotation.Nullable
  public Integer getLatency() {
    return latency;
  }




   /**
   * Variation in packet delay in milliseconds
   * @return pdv
  **/
  @javax.annotation.Nullable
  public Integer getPdv() {
    return pdv;
  }




   /**
   * Error details, if an error was encountered
   * @return errorDetail
  **/
  @javax.annotation.Nullable
  public String getErrorDetail() {
    return errorDetail;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RtpStreamTestResult rtpStreamTestResult = (RtpStreamTestResult) o;
    return Objects.equals(this.date, rtpStreamTestResult.date) &&
        Objects.equals(this.roundId, rtpStreamTestResult.roundId) &&
        Objects.equals(this.links, rtpStreamTestResult.links) &&
        Objects.equals(this.agent, rtpStreamTestResult.agent) &&
        Objects.equals(this.serverIp, rtpStreamTestResult.serverIp) &&
        Objects.equals(this.dscp, rtpStreamTestResult.dscp) &&
        Objects.equals(this.dscpName, rtpStreamTestResult.dscpName) &&
        Objects.equals(this.mos, rtpStreamTestResult.mos) &&
        Objects.equals(this.codecName, rtpStreamTestResult.codecName) &&
        Objects.equals(this.codecMaxMos, rtpStreamTestResult.codecMaxMos) &&
        Objects.equals(this.loss, rtpStreamTestResult.loss) &&
        Objects.equals(this.discards, rtpStreamTestResult.discards) &&
        Objects.equals(this.latency, rtpStreamTestResult.latency) &&
        Objects.equals(this.pdv, rtpStreamTestResult.pdv) &&
        Objects.equals(this.errorDetail, rtpStreamTestResult.errorDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, roundId, links, agent, serverIp, dscp, dscpName, mos, codecName, codecMaxMos, loss, discards, latency, pdv, errorDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RtpStreamTestResult {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
    sb.append("    dscp: ").append(toIndentedString(dscp)).append("\n");
    sb.append("    dscpName: ").append(toIndentedString(dscpName)).append("\n");
    sb.append("    mos: ").append(toIndentedString(mos)).append("\n");
    sb.append("    codecName: ").append(toIndentedString(codecName)).append("\n");
    sb.append("    codecMaxMos: ").append(toIndentedString(codecMaxMos)).append("\n");
    sb.append("    loss: ").append(toIndentedString(loss)).append("\n");
    sb.append("    discards: ").append(toIndentedString(discards)).append("\n");
    sb.append("    latency: ").append(toIndentedString(latency)).append("\n");
    sb.append("    pdv: ").append(toIndentedString(pdv)).append("\n");
    sb.append("    errorDetail: ").append(toIndentedString(errorDetail)).append("\n");
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
    openapiFields.add("agent");
    openapiFields.add("serverIp");
    openapiFields.add("dscp");
    openapiFields.add("dscpName");
    openapiFields.add("mos");
    openapiFields.add("codecName");
    openapiFields.add("codecMaxMos");
    openapiFields.add("loss");
    openapiFields.add("discards");
    openapiFields.add("latency");
    openapiFields.add("pdv");
    openapiFields.add("errorDetail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RtpStreamTestResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RtpStreamTestResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RtpStreamTestResult is not found in the empty JSON string", RtpStreamTestResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RtpStreamTestResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RtpStreamTestResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `agent`
      if (jsonObj.get("agent") != null && !jsonObj.get("agent").isJsonNull()) {
        Agent.validateJsonElement(jsonObj.get("agent"));
      }
      if ((jsonObj.get("serverIp") != null && !jsonObj.get("serverIp").isJsonNull()) && !jsonObj.get("serverIp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serverIp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serverIp").toString()));
      }
      if ((jsonObj.get("dscp") != null && !jsonObj.get("dscp").isJsonNull()) && !jsonObj.get("dscp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dscp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dscp").toString()));
      }
      if ((jsonObj.get("dscpName") != null && !jsonObj.get("dscpName").isJsonNull()) && !jsonObj.get("dscpName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dscpName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dscpName").toString()));
      }
      if ((jsonObj.get("codecName") != null && !jsonObj.get("codecName").isJsonNull()) && !jsonObj.get("codecName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codecName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codecName").toString()));
      }
      if ((jsonObj.get("errorDetail") != null && !jsonObj.get("errorDetail").isJsonNull()) && !jsonObj.get("errorDetail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorDetail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorDetail").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RtpStreamTestResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RtpStreamTestResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RtpStreamTestResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RtpStreamTestResult.class));

       return (TypeAdapter<T>) new TypeAdapter<RtpStreamTestResult>() {
           @Override
           public void write(JsonWriter out, RtpStreamTestResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RtpStreamTestResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RtpStreamTestResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RtpStreamTestResult
  * @throws IOException if the JSON string is invalid with respect to RtpStreamTestResult
  */
  public static RtpStreamTestResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RtpStreamTestResult.class);
  }

 /**
  * Convert an instance of RtpStreamTestResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

