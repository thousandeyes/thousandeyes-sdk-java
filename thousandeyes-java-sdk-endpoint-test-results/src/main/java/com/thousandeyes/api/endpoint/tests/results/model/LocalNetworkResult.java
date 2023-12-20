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

import com.thousandeyes.api.endpoint.tests.JSON;

/**
 * LocalNetworkResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T12:21:05.666462Z[Europe/Lisbon]")
public class LocalNetworkResult {
  public static final String SERIALIZED_NAME_NETWORK_ID = "networkId";
  @SerializedName(SERIALIZED_NAME_NETWORK_ID)
  private String networkId;

  public static final String SERIALIZED_NAME_NETWORK_NAME = "networkName";
  @SerializedName(SERIALIZED_NAME_NETWORK_NAME)
  private String networkName;

  public static final String SERIALIZED_NAME_LOCAL_PREFIX = "localPrefix";
  @SerializedName(SERIALIZED_NAME_LOCAL_PREFIX)
  private String localPrefix;

  public static final String SERIALIZED_NAME_PUBLIC_IP_RANGE = "publicIpRange";
  @SerializedName(SERIALIZED_NAME_PUBLIC_IP_RANGE)
  private String publicIpRange;

  public LocalNetworkResult() {
  }

  
  public LocalNetworkResult(
     String networkId, 
     String networkName, 
     String localPrefix, 
     String publicIpRange
  ) {
    this();
    this.networkId = networkId;
    this.networkName = networkName;
    this.localPrefix = localPrefix;
    this.publicIpRange = publicIpRange;
  }

   /**
   * The network ID. Each network occurrence has a unique ID.
   * @return networkId
  **/
  @javax.annotation.Nullable
  public String getNetworkId() {
    return networkId;
  }




   /**
   * The network name.
   * @return networkName
  **/
  @javax.annotation.Nullable
  public String getNetworkName() {
    return networkName;
  }




   /**
   * Network local private address.
   * @return localPrefix
  **/
  @javax.annotation.Nullable
  public String getLocalPrefix() {
    return localPrefix;
  }




   /**
   * Network public IP range.
   * @return publicIpRange
  **/
  @javax.annotation.Nullable
  public String getPublicIpRange() {
    return publicIpRange;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalNetworkResult localNetworkResult = (LocalNetworkResult) o;
    return Objects.equals(this.networkId, localNetworkResult.networkId) &&
        Objects.equals(this.networkName, localNetworkResult.networkName) &&
        Objects.equals(this.localPrefix, localNetworkResult.localPrefix) &&
        Objects.equals(this.publicIpRange, localNetworkResult.publicIpRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkId, networkName, localPrefix, publicIpRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalNetworkResult {\n");
    sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
    sb.append("    networkName: ").append(toIndentedString(networkName)).append("\n");
    sb.append("    localPrefix: ").append(toIndentedString(localPrefix)).append("\n");
    sb.append("    publicIpRange: ").append(toIndentedString(publicIpRange)).append("\n");
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
    openapiFields.add("networkId");
    openapiFields.add("networkName");
    openapiFields.add("localPrefix");
    openapiFields.add("publicIpRange");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LocalNetworkResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LocalNetworkResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LocalNetworkResult is not found in the empty JSON string", LocalNetworkResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LocalNetworkResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LocalNetworkResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("networkId") != null && !jsonObj.get("networkId").isJsonNull()) && !jsonObj.get("networkId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `networkId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("networkId").toString()));
      }
      if ((jsonObj.get("networkName") != null && !jsonObj.get("networkName").isJsonNull()) && !jsonObj.get("networkName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `networkName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("networkName").toString()));
      }
      if ((jsonObj.get("localPrefix") != null && !jsonObj.get("localPrefix").isJsonNull()) && !jsonObj.get("localPrefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `localPrefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("localPrefix").toString()));
      }
      if ((jsonObj.get("publicIpRange") != null && !jsonObj.get("publicIpRange").isJsonNull()) && !jsonObj.get("publicIpRange").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publicIpRange` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publicIpRange").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalNetworkResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalNetworkResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalNetworkResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalNetworkResult.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalNetworkResult>() {
           @Override
           public void write(JsonWriter out, LocalNetworkResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalNetworkResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalNetworkResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalNetworkResult
  * @throws IOException if the JSON string is invalid with respect to LocalNetworkResult
  */
  public static LocalNetworkResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalNetworkResult.class);
  }

 /**
  * Convert an instance of LocalNetworkResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

