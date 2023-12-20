/*
 * Instant Tests API
 *  ### Overview The Instant Tests API endpoint lets you create and run new instant tests. You will need to be a regular user or have the following permissions:   * `API Access`   * `View tests`  The response does not include the immediate test results. Use the Test Results endpoints to get test results after creating and executing an instant test. You can find the URLs for these endpoints in the _links section of the test definition that is returned when you create the instant test.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.instant.tests.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.instant.tests.model.CloudEnterpriseAgentType;
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

import com.thousandeyes.api.instant.JSON;

/**
 * Agent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T12:21:05.783040Z[Europe/Lisbon]")
public class Agent {
  public static final String SERIALIZED_NAME_IP_ADDRESSES = "ipAddresses";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESSES)
  private List<String> ipAddresses;

  public static final String SERIALIZED_NAME_PUBLIC_IP_ADDRESSES = "publicIpAddresses";
  @SerializedName(SERIALIZED_NAME_PUBLIC_IP_ADDRESSES)
  private List<String> publicIpAddresses;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_AGENT_ID = "agentId";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private String agentId;

  public static final String SERIALIZED_NAME_AGENT_NAME = "agentName";
  @SerializedName(SERIALIZED_NAME_AGENT_NAME)
  private String agentName;

  public static final String SERIALIZED_NAME_AGENT_TYPE = "agentType";
  @SerializedName(SERIALIZED_NAME_AGENT_TYPE)
  private CloudEnterpriseAgentType agentType;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_COUNTRY_ID = "countryId";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ID)
  private String countryId;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_VERIFY_SSL_CERTIFICATES = "verifySslCertificates";
  @SerializedName(SERIALIZED_NAME_VERIFY_SSL_CERTIFICATES)
  private Boolean verifySslCertificates;

  public Agent() {
  }

  
  public Agent(
     List<String> ipAddresses, 
     List<String> publicIpAddresses, 
     String network, 
     String agentId, 
     String location, 
     String countryId, 
     Boolean verifySslCertificates
  ) {
    this();
    this.ipAddresses = ipAddresses;
    this.publicIpAddresses = publicIpAddresses;
    this.network = network;
    this.agentId = agentId;
    this.location = location;
    this.countryId = countryId;
    this.verifySslCertificates = verifySslCertificates;
  }

   /**
   * Array of private IP addresses.
   * @return ipAddresses
  **/
  @javax.annotation.Nullable
  public List<String> getIpAddresses() {
    return ipAddresses;
  }




   /**
   * Array of public IP addresses.
   * @return publicIpAddresses
  **/
  @javax.annotation.Nullable
  public List<String> getPublicIpAddresses() {
    return publicIpAddresses;
  }




   /**
   * Network (including ASN) of agent’s public IP.
   * @return network
  **/
  @javax.annotation.Nullable
  public String getNetwork() {
    return network;
  }




   /**
   * Unique ID of the agent.
   * @return agentId
  **/
  @javax.annotation.Nullable
  public String getAgentId() {
    return agentId;
  }




  public Agent agentName(String agentName) {
    
    this.agentName = agentName;
    return this;
  }

   /**
   * Name of the agent.
   * @return agentName
  **/
  @javax.annotation.Nullable
  public String getAgentName() {
    return agentName;
  }


  public void setAgentName(String agentName) {
    this.agentName = agentName;
  }


  public Agent agentType(CloudEnterpriseAgentType agentType) {
    
    this.agentType = agentType;
    return this;
  }

   /**
   * Get agentType
   * @return agentType
  **/
  @javax.annotation.Nullable
  public CloudEnterpriseAgentType getAgentType() {
    return agentType;
  }


  public void setAgentType(CloudEnterpriseAgentType agentType) {
    this.agentType = agentType;
  }


   /**
   * Location of the agent.
   * @return location
  **/
  @javax.annotation.Nullable
  public String getLocation() {
    return location;
  }




   /**
   * 2-digit ISO country code
   * @return countryId
  **/
  @javax.annotation.Nullable
  public String getCountryId() {
    return countryId;
  }




  public Agent enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Flag indicating if the agent is enabled.
   * @return enabled
  **/
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


   /**
   * Flag indicating if has normal SSL operations or  if instead it&#39;s set to ignore SSL errors on browserbot-based tests.
   * @return verifySslCertificates
  **/
  @javax.annotation.Nullable
  public Boolean getVerifySslCertificates() {
    return verifySslCertificates;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Agent agent = (Agent) o;
    return Objects.equals(this.ipAddresses, agent.ipAddresses) &&
        Objects.equals(this.publicIpAddresses, agent.publicIpAddresses) &&
        Objects.equals(this.network, agent.network) &&
        Objects.equals(this.agentId, agent.agentId) &&
        Objects.equals(this.agentName, agent.agentName) &&
        Objects.equals(this.agentType, agent.agentType) &&
        Objects.equals(this.location, agent.location) &&
        Objects.equals(this.countryId, agent.countryId) &&
        Objects.equals(this.enabled, agent.enabled) &&
        Objects.equals(this.verifySslCertificates, agent.verifySslCertificates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddresses, publicIpAddresses, network, agentId, agentName, agentType, location, countryId, enabled, verifySslCertificates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Agent {\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    publicIpAddresses: ").append(toIndentedString(publicIpAddresses)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
    sb.append("    agentType: ").append(toIndentedString(agentType)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    verifySslCertificates: ").append(toIndentedString(verifySslCertificates)).append("\n");
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
    openapiFields.add("ipAddresses");
    openapiFields.add("publicIpAddresses");
    openapiFields.add("network");
    openapiFields.add("agentId");
    openapiFields.add("agentName");
    openapiFields.add("agentType");
    openapiFields.add("location");
    openapiFields.add("countryId");
    openapiFields.add("enabled");
    openapiFields.add("verifySslCertificates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Agent
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Agent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Agent is not found in the empty JSON string", Agent.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Agent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Agent` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("ipAddresses") != null && !jsonObj.get("ipAddresses").isJsonNull() && !jsonObj.get("ipAddresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipAddresses` to be an array in the JSON string but got `%s`", jsonObj.get("ipAddresses").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("publicIpAddresses") != null && !jsonObj.get("publicIpAddresses").isJsonNull() && !jsonObj.get("publicIpAddresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `publicIpAddresses` to be an array in the JSON string but got `%s`", jsonObj.get("publicIpAddresses").toString()));
      }
      if ((jsonObj.get("network") != null && !jsonObj.get("network").isJsonNull()) && !jsonObj.get("network").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `network` to be a primitive type in the JSON string but got `%s`", jsonObj.get("network").toString()));
      }
      if ((jsonObj.get("agentId") != null && !jsonObj.get("agentId").isJsonNull()) && !jsonObj.get("agentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agentId").toString()));
      }
      if ((jsonObj.get("agentName") != null && !jsonObj.get("agentName").isJsonNull()) && !jsonObj.get("agentName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agentName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agentName").toString()));
      }
      // validate the optional field `agentType`
      if (jsonObj.get("agentType") != null && !jsonObj.get("agentType").isJsonNull()) {
        CloudEnterpriseAgentType.validateJsonElement(jsonObj.get("agentType"));
      }
      if ((jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) && !jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if ((jsonObj.get("countryId") != null && !jsonObj.get("countryId").isJsonNull()) && !jsonObj.get("countryId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Agent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Agent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Agent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Agent.class));

       return (TypeAdapter<T>) new TypeAdapter<Agent>() {
           @Override
           public void write(JsonWriter out, Agent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Agent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Agent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Agent
  * @throws IOException if the JSON string is invalid with respect to Agent
  */
  public static Agent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Agent.class);
  }

 /**
  * Convert an instance of Agent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

