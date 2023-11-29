/*
 * Endpoint Tests API
 *  ## Overview Manage endpoint agent dynamic and scheduled tests using the Endpoint Tests API.
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
import com.thousandeyes.api.model.AllAgentsSelectorType;
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

import com.thousandeyes.JSON;

/**
 * Any agent selection object.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:17:39.012067Z[Europe/London]")
public class EndpointAllAgentsSelectorConfig {
  public static final String SERIALIZED_NAME_AGENT_SELECTOR_TYPE = "agentSelectorType";
  @SerializedName(SERIALIZED_NAME_AGENT_SELECTOR_TYPE)
  private AllAgentsSelectorType agentSelectorType = AllAgentsSelectorType.ALL_AGENTS;

  public static final String SERIALIZED_NAME_MAX_MACHINES = "maxMachines";
  @SerializedName(SERIALIZED_NAME_MAX_MACHINES)
  private Integer maxMachines;

  public EndpointAllAgentsSelectorConfig() {
  }

  public EndpointAllAgentsSelectorConfig agentSelectorType(AllAgentsSelectorType agentSelectorType) {
    
    this.agentSelectorType = agentSelectorType;
    return this;
  }

   /**
   * Get agentSelectorType
   * @return agentSelectorType
  **/
  @javax.annotation.Nullable
  public AllAgentsSelectorType getAgentSelectorType() {
    return agentSelectorType;
  }


  public void setAgentSelectorType(AllAgentsSelectorType agentSelectorType) {
    this.agentSelectorType = agentSelectorType;
  }


  public EndpointAllAgentsSelectorConfig maxMachines(Integer maxMachines) {
    
    this.maxMachines = maxMachines;
    return this;
  }

   /**
   * Maximum number of agents which can execute the test.
   * minimum: 1
   * maximum: 5000
   * @return maxMachines
  **/
  @javax.annotation.Nullable
  public Integer getMaxMachines() {
    return maxMachines;
  }


  public void setMaxMachines(Integer maxMachines) {
    this.maxMachines = maxMachines;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointAllAgentsSelectorConfig endpointAllAgentsSelectorConfig = (EndpointAllAgentsSelectorConfig) o;
    return Objects.equals(this.agentSelectorType, endpointAllAgentsSelectorConfig.agentSelectorType) &&
        Objects.equals(this.maxMachines, endpointAllAgentsSelectorConfig.maxMachines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentSelectorType, maxMachines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointAllAgentsSelectorConfig {\n");
    sb.append("    agentSelectorType: ").append(toIndentedString(agentSelectorType)).append("\n");
    sb.append("    maxMachines: ").append(toIndentedString(maxMachines)).append("\n");
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
    openapiFields.add("agentSelectorType");
    openapiFields.add("maxMachines");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EndpointAllAgentsSelectorConfig
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EndpointAllAgentsSelectorConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EndpointAllAgentsSelectorConfig is not found in the empty JSON string", EndpointAllAgentsSelectorConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EndpointAllAgentsSelectorConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EndpointAllAgentsSelectorConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EndpointAllAgentsSelectorConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EndpointAllAgentsSelectorConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EndpointAllAgentsSelectorConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EndpointAllAgentsSelectorConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<EndpointAllAgentsSelectorConfig>() {
           @Override
           public void write(JsonWriter out, EndpointAllAgentsSelectorConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EndpointAllAgentsSelectorConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EndpointAllAgentsSelectorConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EndpointAllAgentsSelectorConfig
  * @throws IOException if the JSON string is invalid with respect to EndpointAllAgentsSelectorConfig
  */
  public static EndpointAllAgentsSelectorConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EndpointAllAgentsSelectorConfig.class);
  }

 /**
  * Convert an instance of EndpointAllAgentsSelectorConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

