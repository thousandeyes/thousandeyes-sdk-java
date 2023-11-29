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


package com.thousandeyes.api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.model.SpecificAgentsSelectorType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

import com.thousandeyes.JSON;

/**
 * Specific agents selection object.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:17:40.551124Z[Europe/London]")
public class EndpointSpecificAgentsSelectorConfig {
  public static final String SERIALIZED_NAME_AGENT_SELECTOR_TYPE = "agentSelectorType";
  @SerializedName(SERIALIZED_NAME_AGENT_SELECTOR_TYPE)
  private SpecificAgentsSelectorType agentSelectorType = SpecificAgentsSelectorType.SPECIFIC_AGENTS;

  public static final String SERIALIZED_NAME_MAX_MACHINES = "maxMachines";
  @SerializedName(SERIALIZED_NAME_MAX_MACHINES)
  private Integer maxMachines;

  public static final String SERIALIZED_NAME_AGENTS = "agents";
  @SerializedName(SERIALIZED_NAME_AGENTS)
  private List<UUID> agents;

  public EndpointSpecificAgentsSelectorConfig() {
  }

  public EndpointSpecificAgentsSelectorConfig agentSelectorType(SpecificAgentsSelectorType agentSelectorType) {
    
    this.agentSelectorType = agentSelectorType;
    return this;
  }

   /**
   * Get agentSelectorType
   * @return agentSelectorType
  **/
  @javax.annotation.Nullable
  public SpecificAgentsSelectorType getAgentSelectorType() {
    return agentSelectorType;
  }


  public void setAgentSelectorType(SpecificAgentsSelectorType agentSelectorType) {
    this.agentSelectorType = agentSelectorType;
  }


  public EndpointSpecificAgentsSelectorConfig maxMachines(Integer maxMachines) {
    
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


  public EndpointSpecificAgentsSelectorConfig agents(List<UUID> agents) {
    
    this.agents = agents;
    return this;
  }

  public EndpointSpecificAgentsSelectorConfig addAgentsItem(UUID agentsItem) {
    if (this.agents == null) {
      this.agents = new ArrayList<>();
    }
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * List of endpoint agent IDs (obtained from &#x60;/endpoint/agents&#x60; endpoint). Required when &#x60;agentSelectorType&#x60; is set to &#x60;specific-agent&#x60;.
   * @return agents
  **/
  @javax.annotation.Nullable
  public List<UUID> getAgents() {
    return agents;
  }


  public void setAgents(List<UUID> agents) {
    this.agents = agents;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointSpecificAgentsSelectorConfig endpointSpecificAgentsSelectorConfig = (EndpointSpecificAgentsSelectorConfig) o;
    return Objects.equals(this.agentSelectorType, endpointSpecificAgentsSelectorConfig.agentSelectorType) &&
        Objects.equals(this.maxMachines, endpointSpecificAgentsSelectorConfig.maxMachines) &&
        Objects.equals(this.agents, endpointSpecificAgentsSelectorConfig.agents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentSelectorType, maxMachines, agents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointSpecificAgentsSelectorConfig {\n");
    sb.append("    agentSelectorType: ").append(toIndentedString(agentSelectorType)).append("\n");
    sb.append("    maxMachines: ").append(toIndentedString(maxMachines)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
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
    openapiFields.add("agents");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EndpointSpecificAgentsSelectorConfig
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EndpointSpecificAgentsSelectorConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EndpointSpecificAgentsSelectorConfig is not found in the empty JSON string", EndpointSpecificAgentsSelectorConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EndpointSpecificAgentsSelectorConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EndpointSpecificAgentsSelectorConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("agents") != null && !jsonObj.get("agents").isJsonNull() && !jsonObj.get("agents").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `agents` to be an array in the JSON string but got `%s`", jsonObj.get("agents").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EndpointSpecificAgentsSelectorConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EndpointSpecificAgentsSelectorConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EndpointSpecificAgentsSelectorConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EndpointSpecificAgentsSelectorConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<EndpointSpecificAgentsSelectorConfig>() {
           @Override
           public void write(JsonWriter out, EndpointSpecificAgentsSelectorConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EndpointSpecificAgentsSelectorConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EndpointSpecificAgentsSelectorConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EndpointSpecificAgentsSelectorConfig
  * @throws IOException if the JSON string is invalid with respect to EndpointSpecificAgentsSelectorConfig
  */
  public static EndpointSpecificAgentsSelectorConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EndpointSpecificAgentsSelectorConfig.class);
  }

 /**
  * Convert an instance of EndpointSpecificAgentsSelectorConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

