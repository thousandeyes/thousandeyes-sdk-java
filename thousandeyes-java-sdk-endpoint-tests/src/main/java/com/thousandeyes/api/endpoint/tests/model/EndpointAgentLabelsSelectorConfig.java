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


package com.thousandeyes.api.endpoint.tests.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.endpoint.tests.model.AgentLabelsSelectorType;
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

import com.thousandeyes.api.endpoint.JSON;

/**
 * Agent labels selection object.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-18T17:52:55.839690Z[Europe/Lisbon]")
public class EndpointAgentLabelsSelectorConfig {
  public static final String SERIALIZED_NAME_AGENT_SELECTOR_TYPE = "agentSelectorType";
  @SerializedName(SERIALIZED_NAME_AGENT_SELECTOR_TYPE)
  private AgentLabelsSelectorType agentSelectorType = AgentLabelsSelectorType.AGENT_LABELS;

  public static final String SERIALIZED_NAME_MAX_MACHINES = "maxMachines";
  @SerializedName(SERIALIZED_NAME_MAX_MACHINES)
  private Integer maxMachines;

  public static final String SERIALIZED_NAME_ENDPOINT_AGENT_LABELS = "endpointAgentLabels";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_AGENT_LABELS)
  private List<String> endpointAgentLabels;

  public EndpointAgentLabelsSelectorConfig() {
  }

  public EndpointAgentLabelsSelectorConfig agentSelectorType(AgentLabelsSelectorType agentSelectorType) {
    
    this.agentSelectorType = agentSelectorType;
    return this;
  }

   /**
   * Get agentSelectorType
   * @return agentSelectorType
  **/
  @javax.annotation.Nullable
  public AgentLabelsSelectorType getAgentSelectorType() {
    return agentSelectorType;
  }


  public void setAgentSelectorType(AgentLabelsSelectorType agentSelectorType) {
    this.agentSelectorType = agentSelectorType;
  }


  public EndpointAgentLabelsSelectorConfig maxMachines(Integer maxMachines) {
    
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


  public EndpointAgentLabelsSelectorConfig endpointAgentLabels(List<String> endpointAgentLabels) {
    
    this.endpointAgentLabels = endpointAgentLabels;
    return this;
  }

  public EndpointAgentLabelsSelectorConfig addEndpointAgentLabelsItem(String endpointAgentLabelsItem) {
    if (this.endpointAgentLabels == null) {
      this.endpointAgentLabels = new ArrayList<>();
    }
    this.endpointAgentLabels.add(endpointAgentLabelsItem);
    return this;
  }

   /**
   * List of endpoint agent label IDs (obtained from &#x60;/endpoint/labels&#x60; endpoint), required when &#x60;agentSelectorType&#x60; is set to &#x60;agent-labels&#x60;.
   * @return endpointAgentLabels
  **/
  @javax.annotation.Nullable
  public List<String> getEndpointAgentLabels() {
    return endpointAgentLabels;
  }


  public void setEndpointAgentLabels(List<String> endpointAgentLabels) {
    this.endpointAgentLabels = endpointAgentLabels;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointAgentLabelsSelectorConfig endpointAgentLabelsSelectorConfig = (EndpointAgentLabelsSelectorConfig) o;
    return Objects.equals(this.agentSelectorType, endpointAgentLabelsSelectorConfig.agentSelectorType) &&
        Objects.equals(this.maxMachines, endpointAgentLabelsSelectorConfig.maxMachines) &&
        Objects.equals(this.endpointAgentLabels, endpointAgentLabelsSelectorConfig.endpointAgentLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentSelectorType, maxMachines, endpointAgentLabels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointAgentLabelsSelectorConfig {\n");
    sb.append("    agentSelectorType: ").append(toIndentedString(agentSelectorType)).append("\n");
    sb.append("    maxMachines: ").append(toIndentedString(maxMachines)).append("\n");
    sb.append("    endpointAgentLabels: ").append(toIndentedString(endpointAgentLabels)).append("\n");
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
    openapiFields.add("endpointAgentLabels");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EndpointAgentLabelsSelectorConfig
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EndpointAgentLabelsSelectorConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EndpointAgentLabelsSelectorConfig is not found in the empty JSON string", EndpointAgentLabelsSelectorConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EndpointAgentLabelsSelectorConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EndpointAgentLabelsSelectorConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `agentSelectorType`
      if (jsonObj.get("agentSelectorType") != null && !jsonObj.get("agentSelectorType").isJsonNull()) {
        AgentLabelsSelectorType.validateJsonElement(jsonObj.get("agentSelectorType"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("endpointAgentLabels") != null && !jsonObj.get("endpointAgentLabels").isJsonNull() && !jsonObj.get("endpointAgentLabels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `endpointAgentLabels` to be an array in the JSON string but got `%s`", jsonObj.get("endpointAgentLabels").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EndpointAgentLabelsSelectorConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EndpointAgentLabelsSelectorConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EndpointAgentLabelsSelectorConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EndpointAgentLabelsSelectorConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<EndpointAgentLabelsSelectorConfig>() {
           @Override
           public void write(JsonWriter out, EndpointAgentLabelsSelectorConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EndpointAgentLabelsSelectorConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EndpointAgentLabelsSelectorConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EndpointAgentLabelsSelectorConfig
  * @throws IOException if the JSON string is invalid with respect to EndpointAgentLabelsSelectorConfig
  */
  public static EndpointAgentLabelsSelectorConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EndpointAgentLabelsSelectorConfig.class);
  }

 /**
  * Convert an instance of EndpointAgentLabelsSelectorConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

