/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.tests.results.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.endpoint.tests.results.model.AccountGroupId;
import com.thousandeyes.api.endpoint.tests.results.model.HttpErrorType;
import com.thousandeyes.api.endpoint.tests.results.model.HttpTestResultHeaders;
import com.thousandeyes.api.endpoint.tests.results.model.NetworkProfile;
import com.thousandeyes.api.endpoint.tests.results.model.SystemMetrics;
import com.thousandeyes.api.endpoint.tests.results.model.VpnProfile;
import java.io.IOException;
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

import com.thousandeyes.api.endpoint.tests.JSON;

/**
 * HttpTestResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T12:21:05.666462Z[Europe/Lisbon]")
public class HttpTestResult {
  public static final String SERIALIZED_NAME_AGENT_ID = "agentId";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private UUID agentId;

  public static final String SERIALIZED_NAME_AID = "aid";
  @SerializedName(SERIALIZED_NAME_AID)
  private AccountGroupId aid;

  public static final String SERIALIZED_NAME_ROUND_ID = "roundId";
  @SerializedName(SERIALIZED_NAME_ROUND_ID)
  private Integer roundId;

  public static final String SERIALIZED_NAME_SERVER_IP = "serverIp";
  @SerializedName(SERIALIZED_NAME_SERVER_IP)
  private String serverIp;

  public static final String SERIALIZED_NAME_SYSTEM_METRICS = "systemMetrics";
  @SerializedName(SERIALIZED_NAME_SYSTEM_METRICS)
  private SystemMetrics systemMetrics;

  public static final String SERIALIZED_NAME_VPN_PROFILE = "vpnProfile";
  @SerializedName(SERIALIZED_NAME_VPN_PROFILE)
  private VpnProfile vpnProfile;

  public static final String SERIALIZED_NAME_NETWORK_PROFILE = "networkProfile";
  @SerializedName(SERIALIZED_NAME_NETWORK_PROFILE)
  private NetworkProfile networkProfile;

  public static final String SERIALIZED_NAME_CONNECT_TIME = "connectTime";
  @SerializedName(SERIALIZED_NAME_CONNECT_TIME)
  private Integer connectTime;

  public static final String SERIALIZED_NAME_DNS_TIME = "dnsTime";
  @SerializedName(SERIALIZED_NAME_DNS_TIME)
  private Integer dnsTime;

  public static final String SERIALIZED_NAME_ERROR_TYPE = "errorType";
  @SerializedName(SERIALIZED_NAME_ERROR_TYPE)
  private HttpErrorType errorType = HttpErrorType.CONNECT;

  public static final String SERIALIZED_NAME_ERROR_DETAILS = "errorDetails";
  @SerializedName(SERIALIZED_NAME_ERROR_DETAILS)
  private String errorDetails;

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private HttpTestResultHeaders headers;

  public static final String SERIALIZED_NAME_NUM_REDIRECTS = "numRedirects";
  @SerializedName(SERIALIZED_NAME_NUM_REDIRECTS)
  private Integer numRedirects;

  public static final String SERIALIZED_NAME_RECEIVE_TIME = "receiveTime";
  @SerializedName(SERIALIZED_NAME_RECEIVE_TIME)
  private Integer receiveTime;

  public static final String SERIALIZED_NAME_REDIRECT_TIME = "redirectTime";
  @SerializedName(SERIALIZED_NAME_REDIRECT_TIME)
  private Integer redirectTime;

  public static final String SERIALIZED_NAME_RESPONSE_CODE = "responseCode";
  @SerializedName(SERIALIZED_NAME_RESPONSE_CODE)
  private Integer responseCode;

  public static final String SERIALIZED_NAME_RESPONSE_TIME = "responseTime";
  @SerializedName(SERIALIZED_NAME_RESPONSE_TIME)
  private Integer responseTime;

  public static final String SERIALIZED_NAME_SSL_TIME = "sslTime";
  @SerializedName(SERIALIZED_NAME_SSL_TIME)
  private Integer sslTime;

  public static final String SERIALIZED_NAME_TOTAL_TIME = "totalTime";
  @SerializedName(SERIALIZED_NAME_TOTAL_TIME)
  private Integer totalTime;

  public static final String SERIALIZED_NAME_WAIT_TIME = "waitTime";
  @SerializedName(SERIALIZED_NAME_WAIT_TIME)
  private Integer waitTime;

  public static final String SERIALIZED_NAME_WIRE_SIZE = "wireSize";
  @SerializedName(SERIALIZED_NAME_WIRE_SIZE)
  private Integer wireSize;

  public HttpTestResult() {
  }

  
  public HttpTestResult(
     UUID agentId, 
     Integer roundId, 
     String serverIp, 
     Integer connectTime, 
     Integer dnsTime, 
     String errorDetails, 
     Integer numRedirects, 
     Integer receiveTime, 
     Integer redirectTime, 
     Integer responseCode, 
     Integer responseTime, 
     Integer sslTime, 
     Integer totalTime, 
     Integer waitTime, 
     Integer wireSize
  ) {
    this();
    this.agentId = agentId;
    this.roundId = roundId;
    this.serverIp = serverIp;
    this.connectTime = connectTime;
    this.dnsTime = dnsTime;
    this.errorDetails = errorDetails;
    this.numRedirects = numRedirects;
    this.receiveTime = receiveTime;
    this.redirectTime = redirectTime;
    this.responseCode = responseCode;
    this.responseTime = responseTime;
    this.sslTime = sslTime;
    this.totalTime = totalTime;
    this.waitTime = waitTime;
    this.wireSize = wireSize;
  }

   /**
   * Unique ID of endpoint agent, from &#x60;/endpoint/agents&#x60; endpoint.
   * @return agentId
  **/
  @javax.annotation.Nullable
  public UUID getAgentId() {
    return agentId;
  }




  public HttpTestResult aid(AccountGroupId aid) {
    
    this.aid = aid;
    return this;
  }

   /**
   * Get aid
   * @return aid
  **/
  @javax.annotation.Nullable
  public AccountGroupId getAid() {
    return aid;
  }


  public void setAid(AccountGroupId aid) {
    this.aid = aid;
  }


   /**
   * Epoch time (seconds) indicating the start time of the round.
   * @return roundId
  **/
  @javax.annotation.Nullable
  public Integer getRoundId() {
    return roundId;
  }




   /**
   * IP address of destination server.
   * @return serverIp
  **/
  @javax.annotation.Nullable
  public String getServerIp() {
    return serverIp;
  }




  public HttpTestResult systemMetrics(SystemMetrics systemMetrics) {
    
    this.systemMetrics = systemMetrics;
    return this;
  }

   /**
   * Get systemMetrics
   * @return systemMetrics
  **/
  @javax.annotation.Nullable
  public SystemMetrics getSystemMetrics() {
    return systemMetrics;
  }


  public void setSystemMetrics(SystemMetrics systemMetrics) {
    this.systemMetrics = systemMetrics;
  }


  public HttpTestResult vpnProfile(VpnProfile vpnProfile) {
    
    this.vpnProfile = vpnProfile;
    return this;
  }

   /**
   * Get vpnProfile
   * @return vpnProfile
  **/
  @javax.annotation.Nullable
  public VpnProfile getVpnProfile() {
    return vpnProfile;
  }


  public void setVpnProfile(VpnProfile vpnProfile) {
    this.vpnProfile = vpnProfile;
  }


  public HttpTestResult networkProfile(NetworkProfile networkProfile) {
    
    this.networkProfile = networkProfile;
    return this;
  }

   /**
   * Get networkProfile
   * @return networkProfile
  **/
  @javax.annotation.Nullable
  public NetworkProfile getNetworkProfile() {
    return networkProfile;
  }


  public void setNetworkProfile(NetworkProfile networkProfile) {
    this.networkProfile = networkProfile;
  }


   /**
   * Time required to establish a TCP connection to the server in milliseconds.
   * @return connectTime
  **/
  @javax.annotation.Nullable
  public Integer getConnectTime() {
    return connectTime;
  }




   /**
   * Time required to resolve DNS in milliseconds.
   * @return dnsTime
  **/
  @javax.annotation.Nullable
  public Integer getDnsTime() {
    return dnsTime;
  }




  public HttpTestResult errorType(HttpErrorType errorType) {
    
    this.errorType = errorType;
    return this;
  }

   /**
   * Get errorType
   * @return errorType
  **/
  @javax.annotation.Nullable
  public HttpErrorType getErrorType() {
    return errorType;
  }


  public void setErrorType(HttpErrorType errorType) {
    this.errorType = errorType;
  }


   /**
   * Error details, if an error were encountered.
   * @return errorDetails
  **/
  @javax.annotation.Nullable
  public String getErrorDetails() {
    return errorDetails;
  }




  public HttpTestResult headers(HttpTestResultHeaders headers) {
    
    this.headers = headers;
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @javax.annotation.Nullable
  public HttpTestResultHeaders getHeaders() {
    return headers;
  }


  public void setHeaders(HttpTestResultHeaders headers) {
    this.headers = headers;
  }


   /**
   * Number of redirects.
   * @return numRedirects
  **/
  @javax.annotation.Nullable
  public Integer getNumRedirects() {
    return numRedirects;
  }




   /**
   * Elapsed time between first and last byte of response in milliseconds.
   * @return receiveTime
  **/
  @javax.annotation.Nullable
  public Integer getReceiveTime() {
    return receiveTime;
  }




   /**
   * Cumulative redirect timing in milliseconds.
   * @return redirectTime
  **/
  @javax.annotation.Nullable
  public Integer getRedirectTime() {
    return redirectTime;
  }




   /**
   * HTTP response code.
   * @return responseCode
  **/
  @javax.annotation.Nullable
  public Integer getResponseCode() {
    return responseCode;
  }




   /**
   * Time to first byte in milliseconds.
   * @return responseTime
  **/
  @javax.annotation.Nullable
  public Integer getResponseTime() {
    return responseTime;
  }




   /**
   * Time to negotiate SSL/TLS in milliseconds.
   * @return sslTime
  **/
  @javax.annotation.Nullable
  public Integer getSslTime() {
    return sslTime;
  }




   /**
   * Total time is the response time + receive time.
   * @return totalTime
  **/
  @javax.annotation.Nullable
  public Integer getTotalTime() {
    return totalTime;
  }




   /**
   * Time elapsed between completion of request and first byte of response in milliseconds.
   * @return waitTime
  **/
  @javax.annotation.Nullable
  public Integer getWaitTime() {
    return waitTime;
  }




   /**
   * Size of content in bytes.
   * @return wireSize
  **/
  @javax.annotation.Nullable
  public Integer getWireSize() {
    return wireSize;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpTestResult httpTestResult = (HttpTestResult) o;
    return Objects.equals(this.agentId, httpTestResult.agentId) &&
        Objects.equals(this.aid, httpTestResult.aid) &&
        Objects.equals(this.roundId, httpTestResult.roundId) &&
        Objects.equals(this.serverIp, httpTestResult.serverIp) &&
        Objects.equals(this.systemMetrics, httpTestResult.systemMetrics) &&
        Objects.equals(this.vpnProfile, httpTestResult.vpnProfile) &&
        Objects.equals(this.networkProfile, httpTestResult.networkProfile) &&
        Objects.equals(this.connectTime, httpTestResult.connectTime) &&
        Objects.equals(this.dnsTime, httpTestResult.dnsTime) &&
        Objects.equals(this.errorType, httpTestResult.errorType) &&
        Objects.equals(this.errorDetails, httpTestResult.errorDetails) &&
        Objects.equals(this.headers, httpTestResult.headers) &&
        Objects.equals(this.numRedirects, httpTestResult.numRedirects) &&
        Objects.equals(this.receiveTime, httpTestResult.receiveTime) &&
        Objects.equals(this.redirectTime, httpTestResult.redirectTime) &&
        Objects.equals(this.responseCode, httpTestResult.responseCode) &&
        Objects.equals(this.responseTime, httpTestResult.responseTime) &&
        Objects.equals(this.sslTime, httpTestResult.sslTime) &&
        Objects.equals(this.totalTime, httpTestResult.totalTime) &&
        Objects.equals(this.waitTime, httpTestResult.waitTime) &&
        Objects.equals(this.wireSize, httpTestResult.wireSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, aid, roundId, serverIp, systemMetrics, vpnProfile, networkProfile, connectTime, dnsTime, errorType, errorDetails, headers, numRedirects, receiveTime, redirectTime, responseCode, responseTime, sslTime, totalTime, waitTime, wireSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpTestResult {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
    sb.append("    systemMetrics: ").append(toIndentedString(systemMetrics)).append("\n");
    sb.append("    vpnProfile: ").append(toIndentedString(vpnProfile)).append("\n");
    sb.append("    networkProfile: ").append(toIndentedString(networkProfile)).append("\n");
    sb.append("    connectTime: ").append(toIndentedString(connectTime)).append("\n");
    sb.append("    dnsTime: ").append(toIndentedString(dnsTime)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    numRedirects: ").append(toIndentedString(numRedirects)).append("\n");
    sb.append("    receiveTime: ").append(toIndentedString(receiveTime)).append("\n");
    sb.append("    redirectTime: ").append(toIndentedString(redirectTime)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
    sb.append("    sslTime: ").append(toIndentedString(sslTime)).append("\n");
    sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
    sb.append("    waitTime: ").append(toIndentedString(waitTime)).append("\n");
    sb.append("    wireSize: ").append(toIndentedString(wireSize)).append("\n");
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
    openapiFields.add("agentId");
    openapiFields.add("aid");
    openapiFields.add("roundId");
    openapiFields.add("serverIp");
    openapiFields.add("systemMetrics");
    openapiFields.add("vpnProfile");
    openapiFields.add("networkProfile");
    openapiFields.add("connectTime");
    openapiFields.add("dnsTime");
    openapiFields.add("errorType");
    openapiFields.add("errorDetails");
    openapiFields.add("headers");
    openapiFields.add("numRedirects");
    openapiFields.add("receiveTime");
    openapiFields.add("redirectTime");
    openapiFields.add("responseCode");
    openapiFields.add("responseTime");
    openapiFields.add("sslTime");
    openapiFields.add("totalTime");
    openapiFields.add("waitTime");
    openapiFields.add("wireSize");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to HttpTestResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HttpTestResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HttpTestResult is not found in the empty JSON string", HttpTestResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HttpTestResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HttpTestResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("agentId") != null && !jsonObj.get("agentId").isJsonNull()) && !jsonObj.get("agentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agentId").toString()));
      }
      // validate the optional field `aid`
      if (jsonObj.get("aid") != null && !jsonObj.get("aid").isJsonNull()) {
        AccountGroupId.validateJsonElement(jsonObj.get("aid"));
      }
      if ((jsonObj.get("serverIp") != null && !jsonObj.get("serverIp").isJsonNull()) && !jsonObj.get("serverIp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serverIp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serverIp").toString()));
      }
      // validate the optional field `systemMetrics`
      if (jsonObj.get("systemMetrics") != null && !jsonObj.get("systemMetrics").isJsonNull()) {
        SystemMetrics.validateJsonElement(jsonObj.get("systemMetrics"));
      }
      // validate the optional field `vpnProfile`
      if (jsonObj.get("vpnProfile") != null && !jsonObj.get("vpnProfile").isJsonNull()) {
        VpnProfile.validateJsonElement(jsonObj.get("vpnProfile"));
      }
      // validate the optional field `networkProfile`
      if (jsonObj.get("networkProfile") != null && !jsonObj.get("networkProfile").isJsonNull()) {
        NetworkProfile.validateJsonElement(jsonObj.get("networkProfile"));
      }
      // validate the optional field `errorType`
      if (jsonObj.get("errorType") != null && !jsonObj.get("errorType").isJsonNull()) {
        HttpErrorType.validateJsonElement(jsonObj.get("errorType"));
      }
      if ((jsonObj.get("errorDetails") != null && !jsonObj.get("errorDetails").isJsonNull()) && !jsonObj.get("errorDetails").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorDetails` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorDetails").toString()));
      }
      // validate the optional field `headers`
      if (jsonObj.get("headers") != null && !jsonObj.get("headers").isJsonNull()) {
        HttpTestResultHeaders.validateJsonElement(jsonObj.get("headers"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HttpTestResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HttpTestResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HttpTestResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HttpTestResult.class));

       return (TypeAdapter<T>) new TypeAdapter<HttpTestResult>() {
           @Override
           public void write(JsonWriter out, HttpTestResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HttpTestResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HttpTestResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HttpTestResult
  * @throws IOException if the JSON string is invalid with respect to HttpTestResult
  */
  public static HttpTestResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HttpTestResult.class);
  }

 /**
  * Convert an instance of HttpTestResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

