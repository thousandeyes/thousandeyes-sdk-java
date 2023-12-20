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

import com.thousandeyes.api.endpoint.tests.JSON;

/**
 * TracerouteHop
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T14:43:32.305594Z[Europe/Lisbon]")
public class TracerouteHop {
  public static final String SERIALIZED_NAME_HOP = "hop";
  @SerializedName(SERIALIZED_NAME_HOP)
  private Integer hop;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "ipAddress";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public static final String SERIALIZED_NAME_ASN = "asn";
  @SerializedName(SERIALIZED_NAME_ASN)
  private Integer asn;

  public static final String SERIALIZED_NAME_DELAY = "delay";
  @SerializedName(SERIALIZED_NAME_DELAY)
  private Integer delay;

  public static final String SERIALIZED_NAME_MPLS = "mpls";
  @SerializedName(SERIALIZED_NAME_MPLS)
  private List<String> mpls;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public TracerouteHop() {
  }

  
  public TracerouteHop(
     Integer hop, 
     String ipAddress, 
     String prefix, 
     Integer asn, 
     Integer delay, 
     List<String> mpls, 
     String name
  ) {
    this();
    this.hop = hop;
    this.ipAddress = ipAddress;
    this.prefix = prefix;
    this.asn = asn;
    this.delay = delay;
    this.mpls = mpls;
    this.name = name;
  }

   /**
   * The hop index.
   * @return hop
  **/
  @javax.annotation.Nullable
  public Integer getHop() {
    return hop;
  }




   /**
   * IP address of the hop.
   * @return ipAddress
  **/
  @javax.annotation.Nullable
  public String getIpAddress() {
    return ipAddress;
  }




   /**
   * Prefix of IP address shown in CIDR.
   * @return prefix
  **/
  @javax.annotation.Nullable
  public String getPrefix() {
    return prefix;
  }




   /**
   * Unique number assigned to an organization (also referred to as service provider).
   * @return asn
  **/
  @javax.annotation.Nullable
  public Integer getAsn() {
    return asn;
  }




   /**
   * Hop delay
   * @return delay
  **/
  @javax.annotation.Nullable
  public Integer getDelay() {
    return delay;
  }




   /**
   * Hop Multiprotocol Label Switching.
   * @return mpls
  **/
  @javax.annotation.Nullable
  public List<String> getMpls() {
    return mpls;
  }




   /**
   * The hop name.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TracerouteHop tracerouteHop = (TracerouteHop) o;
    return Objects.equals(this.hop, tracerouteHop.hop) &&
        Objects.equals(this.ipAddress, tracerouteHop.ipAddress) &&
        Objects.equals(this.prefix, tracerouteHop.prefix) &&
        Objects.equals(this.asn, tracerouteHop.asn) &&
        Objects.equals(this.delay, tracerouteHop.delay) &&
        Objects.equals(this.mpls, tracerouteHop.mpls) &&
        Objects.equals(this.name, tracerouteHop.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hop, ipAddress, prefix, asn, delay, mpls, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TracerouteHop {\n");
    sb.append("    hop: ").append(toIndentedString(hop)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
    sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
    sb.append("    mpls: ").append(toIndentedString(mpls)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("asn");
    openapiFields.add("delay");
    openapiFields.add("mpls");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TracerouteHop
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TracerouteHop.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TracerouteHop is not found in the empty JSON string", TracerouteHop.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TracerouteHop.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TracerouteHop` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ipAddress") != null && !jsonObj.get("ipAddress").isJsonNull()) && !jsonObj.get("ipAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ipAddress").toString()));
      }
      if ((jsonObj.get("prefix") != null && !jsonObj.get("prefix").isJsonNull()) && !jsonObj.get("prefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prefix").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("mpls") != null && !jsonObj.get("mpls").isJsonNull() && !jsonObj.get("mpls").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `mpls` to be an array in the JSON string but got `%s`", jsonObj.get("mpls").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TracerouteHop.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TracerouteHop' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TracerouteHop> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TracerouteHop.class));

       return (TypeAdapter<T>) new TypeAdapter<TracerouteHop>() {
           @Override
           public void write(JsonWriter out, TracerouteHop value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TracerouteHop read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TracerouteHop given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TracerouteHop
  * @throws IOException if the JSON string is invalid with respect to TracerouteHop
  */
  public static TracerouteHop fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TracerouteHop.class);
  }

 /**
  * Convert an instance of TracerouteHop to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

