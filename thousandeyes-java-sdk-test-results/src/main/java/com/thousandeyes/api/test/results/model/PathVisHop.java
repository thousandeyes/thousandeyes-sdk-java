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

import com.thousandeyes.api.test.JSON;

/**
 * PathVisHop
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-18T17:52:54.864279Z[Europe/Lisbon]")
public class PathVisHop {
  public static final String SERIALIZED_NAME_HOP = "hop";
  @SerializedName(SERIALIZED_NAME_HOP)
  private Integer hop;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "ipAddress";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public static final String SERIALIZED_NAME_RDNS = "rdns";
  @SerializedName(SERIALIZED_NAME_RDNS)
  private String rdns;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_RESPONSE_TIME = "responseTime";
  @SerializedName(SERIALIZED_NAME_RESPONSE_TIME)
  private Integer responseTime;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_MPLS = "mpls";
  @SerializedName(SERIALIZED_NAME_MPLS)
  private String mpls;

  public PathVisHop() {
  }

  
  public PathVisHop(
     Integer hop, 
     String ipAddress, 
     String prefix, 
     String rdns, 
     String network, 
     Integer responseTime, 
     String location, 
     String mpls
  ) {
    this();
    this.hop = hop;
    this.ipAddress = ipAddress;
    this.prefix = prefix;
    this.rdns = rdns;
    this.network = network;
    this.responseTime = responseTime;
    this.location = location;
    this.mpls = mpls;
  }

   /**
   * Hop index
   * @return hop
  **/
  @javax.annotation.Nullable
  public Integer getHop() {
    return hop;
  }




   /**
   * IP address of the hop
   * @return ipAddress
  **/
  @javax.annotation.Nullable
  public String getIpAddress() {
    return ipAddress;
  }




   /**
   * Prefix of IP address shown in CIDR
   * @return prefix
  **/
  @javax.annotation.Nullable
  public String getPrefix() {
    return prefix;
  }




   /**
   * Reverse DNS entry of IP, if available
   * @return rdns
  **/
  @javax.annotation.Nullable
  public String getRdns() {
    return rdns;
  }




   /**
   * Autonomous System originating the prefix
   * @return network
  **/
  @javax.annotation.Nullable
  public String getNetwork() {
    return network;
  }




   /**
   * RTT to the hop’s IP in milliseconds
   * @return responseTime
  **/
  @javax.annotation.Nullable
  public Integer getResponseTime() {
    return responseTime;
  }




   /**
   * Location information for the hop
   * @return location
  **/
  @javax.annotation.Nullable
  public String getLocation() {
    return location;
  }




   /**
   * Multiprotocol Label Switching information, if available
   * @return mpls
  **/
  @javax.annotation.Nullable
  public String getMpls() {
    return mpls;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PathVisHop pathVisHop = (PathVisHop) o;
    return Objects.equals(this.hop, pathVisHop.hop) &&
        Objects.equals(this.ipAddress, pathVisHop.ipAddress) &&
        Objects.equals(this.prefix, pathVisHop.prefix) &&
        Objects.equals(this.rdns, pathVisHop.rdns) &&
        Objects.equals(this.network, pathVisHop.network) &&
        Objects.equals(this.responseTime, pathVisHop.responseTime) &&
        Objects.equals(this.location, pathVisHop.location) &&
        Objects.equals(this.mpls, pathVisHop.mpls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hop, ipAddress, prefix, rdns, network, responseTime, location, mpls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PathVisHop {\n");
    sb.append("    hop: ").append(toIndentedString(hop)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    rdns: ").append(toIndentedString(rdns)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    mpls: ").append(toIndentedString(mpls)).append("\n");
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
    openapiFields.add("hop");
    openapiFields.add("ipAddress");
    openapiFields.add("prefix");
    openapiFields.add("rdns");
    openapiFields.add("network");
    openapiFields.add("responseTime");
    openapiFields.add("location");
    openapiFields.add("mpls");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PathVisHop
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PathVisHop.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PathVisHop is not found in the empty JSON string", PathVisHop.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PathVisHop.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PathVisHop` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ipAddress") != null && !jsonObj.get("ipAddress").isJsonNull()) && !jsonObj.get("ipAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ipAddress").toString()));
      }
      if ((jsonObj.get("prefix") != null && !jsonObj.get("prefix").isJsonNull()) && !jsonObj.get("prefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prefix").toString()));
      }
      if ((jsonObj.get("rdns") != null && !jsonObj.get("rdns").isJsonNull()) && !jsonObj.get("rdns").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rdns` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rdns").toString()));
      }
      if ((jsonObj.get("network") != null && !jsonObj.get("network").isJsonNull()) && !jsonObj.get("network").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `network` to be a primitive type in the JSON string but got `%s`", jsonObj.get("network").toString()));
      }
      if ((jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) && !jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if ((jsonObj.get("mpls") != null && !jsonObj.get("mpls").isJsonNull()) && !jsonObj.get("mpls").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mpls` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mpls").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PathVisHop.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PathVisHop' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PathVisHop> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PathVisHop.class));

       return (TypeAdapter<T>) new TypeAdapter<PathVisHop>() {
           @Override
           public void write(JsonWriter out, PathVisHop value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PathVisHop read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PathVisHop given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PathVisHop
  * @throws IOException if the JSON string is invalid with respect to PathVisHop
  */
  public static PathVisHop fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PathVisHop.class);
  }

 /**
  * Convert an instance of PathVisHop to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

