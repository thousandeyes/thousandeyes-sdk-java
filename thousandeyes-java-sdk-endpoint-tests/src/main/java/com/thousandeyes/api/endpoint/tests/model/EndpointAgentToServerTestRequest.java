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
import com.thousandeyes.api.endpoint.tests.model.EndpointTestAgentSelectorType;
import com.thousandeyes.api.endpoint.tests.model.TestInterval;
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

import com.thousandeyes.api.endpoint.JSON;

/**
 * EndpointAgentToServerTestRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T12:21:05.597581Z[Europe/Lisbon]")
public class EndpointAgentToServerTestRequest {
  public static final String SERIALIZED_NAME_AGENT_SELECTOR_TYPE = "agentSelectorType";
  @SerializedName(SERIALIZED_NAME_AGENT_SELECTOR_TYPE)
  private EndpointTestAgentSelectorType agentSelectorType;

  public static final String SERIALIZED_NAME_AGENTS = "agents";
  @SerializedName(SERIALIZED_NAME_AGENTS)
  private List<UUID> agents;

  public static final String SERIALIZED_NAME_HAS_PING = "hasPing";
  @SerializedName(SERIALIZED_NAME_HAS_PING)
  private Boolean hasPing = true;

  public static final String SERIALIZED_NAME_HAS_TRACEROUTE = "hasTraceroute";
  @SerializedName(SERIALIZED_NAME_HAS_TRACEROUTE)
  private Boolean hasTraceroute = true;

  public static final String SERIALIZED_NAME_ENDPOINT_AGENT_LABELS = "endpointAgentLabels";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_AGENT_LABELS)
  private List<String> endpointAgentLabels;

  public static final String SERIALIZED_NAME_MAX_MACHINES = "maxMachines";
  @SerializedName(SERIALIZED_NAME_MAX_MACHINES)
  private Integer maxMachines;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_TEST_NAME = "testName";
  @SerializedName(SERIALIZED_NAME_TEST_NAME)
  private String testName;

  public static final String SERIALIZED_NAME_SERVER_NAME = "serverName";
  @SerializedName(SERIALIZED_NAME_SERVER_NAME)
  private String serverName;

  public static final String SERIALIZED_NAME_INTERVAL = "interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private TestInterval interval;

  public EndpointAgentToServerTestRequest() {
  }

  public EndpointAgentToServerTestRequest agentSelectorType(EndpointTestAgentSelectorType agentSelectorType) {
    
    this.agentSelectorType = agentSelectorType;
    return this;
  }

   /**
   * Get agentSelectorType
   * @return agentSelectorType
  **/
  @javax.annotation.Nonnull
  public EndpointTestAgentSelectorType getAgentSelectorType() {
    return agentSelectorType;
  }


  public void setAgentSelectorType(EndpointTestAgentSelectorType agentSelectorType) {
    this.agentSelectorType = agentSelectorType;
  }


  public EndpointAgentToServerTestRequest agents(List<UUID> agents) {
    
    this.agents = agents;
    return this;
  }

  public EndpointAgentToServerTestRequest addAgentsItem(UUID agentsItem) {
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


  public EndpointAgentToServerTestRequest hasPing(Boolean hasPing) {
    
    this.hasPing = hasPing;
    return this;
  }

   /**
   * Optional flag indicating if the test should run ping.
   * @return hasPing
  **/
  @javax.annotation.Nullable
  public Boolean getHasPing() {
    return hasPing;
  }


  public void setHasPing(Boolean hasPing) {
    this.hasPing = hasPing;
  }


  public EndpointAgentToServerTestRequest hasTraceroute(Boolean hasTraceroute) {
    
    this.hasTraceroute = hasTraceroute;
    return this;
  }

   /**
   * Optional flag indicating if the test should run traceroute.
   * @return hasTraceroute
  **/
  @javax.annotation.Nullable
  public Boolean getHasTraceroute() {
    return hasTraceroute;
  }


  public void setHasTraceroute(Boolean hasTraceroute) {
    this.hasTraceroute = hasTraceroute;
  }


  public EndpointAgentToServerTestRequest endpointAgentLabels(List<String> endpointAgentLabels) {
    
    this.endpointAgentLabels = endpointAgentLabels;
    return this;
  }

  public EndpointAgentToServerTestRequest addEndpointAgentLabelsItem(String endpointAgentLabelsItem) {
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


  public EndpointAgentToServerTestRequest maxMachines(Integer maxMachines) {
    
    this.maxMachines = maxMachines;
    return this;
  }

   /**
   * Maximum number of agents which can execute the test.
   * minimum: 1
   * maximum: 5000
   * @return maxMachines
  **/
  @javax.annotation.Nonnull
  public Integer getMaxMachines() {
    return maxMachines;
  }


  public void setMaxMachines(Integer maxMachines) {
    this.maxMachines = maxMachines;
  }


  public EndpointAgentToServerTestRequest port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * Port number, if not specified, the port is selected based on a protocol (HTTP 80, HTTPS 443).
   * @return port
  **/
  @javax.annotation.Nullable
  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  public EndpointAgentToServerTestRequest testName(String testName) {
    
    this.testName = testName;
    return this;
  }

   /**
   * Name of the test.
   * @return testName
  **/
  @javax.annotation.Nonnull
  public String getTestName() {
    return testName;
  }


  public void setTestName(String testName) {
    this.testName = testName;
  }


  public EndpointAgentToServerTestRequest serverName(String serverName) {
    
    this.serverName = serverName;
    return this;
  }

   /**
   * A server address without a protocol or IP address.
   * @return serverName
  **/
  @javax.annotation.Nonnull
  public String getServerName() {
    return serverName;
  }


  public void setServerName(String serverName) {
    this.serverName = serverName;
  }


  public EndpointAgentToServerTestRequest interval(TestInterval interval) {
    
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @javax.annotation.Nonnull
  public TestInterval getInterval() {
    return interval;
  }


  public void setInterval(TestInterval interval) {
    this.interval = interval;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointAgentToServerTestRequest endpointAgentToServerTestRequest = (EndpointAgentToServerTestRequest) o;
    return Objects.equals(this.agentSelectorType, endpointAgentToServerTestRequest.agentSelectorType) &&
        Objects.equals(this.agents, endpointAgentToServerTestRequest.agents) &&
        Objects.equals(this.hasPing, endpointAgentToServerTestRequest.hasPing) &&
        Objects.equals(this.hasTraceroute, endpointAgentToServerTestRequest.hasTraceroute) &&
        Objects.equals(this.endpointAgentLabels, endpointAgentToServerTestRequest.endpointAgentLabels) &&
        Objects.equals(this.maxMachines, endpointAgentToServerTestRequest.maxMachines) &&
        Objects.equals(this.port, endpointAgentToServerTestRequest.port) &&
        Objects.equals(this.testName, endpointAgentToServerTestRequest.testName) &&
        Objects.equals(this.serverName, endpointAgentToServerTestRequest.serverName) &&
        Objects.equals(this.interval, endpointAgentToServerTestRequest.interval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentSelectorType, agents, hasPing, hasTraceroute, endpointAgentLabels, maxMachines, port, testName, serverName, interval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointAgentToServerTestRequest {\n");
    sb.append("    agentSelectorType: ").append(toIndentedString(agentSelectorType)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    hasPing: ").append(toIndentedString(hasPing)).append("\n");
    sb.append("    hasTraceroute: ").append(toIndentedString(hasTraceroute)).append("\n");
    sb.append("    endpointAgentLabels: ").append(toIndentedString(endpointAgentLabels)).append("\n");
    sb.append("    maxMachines: ").append(toIndentedString(maxMachines)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
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
    openapiFields.add("agents");
    openapiFields.add("hasPing");
    openapiFields.add("hasTraceroute");
    openapiFields.add("endpointAgentLabels");
    openapiFields.add("maxMachines");
    openapiFields.add("port");
    openapiFields.add("testName");
    openapiFields.add("serverName");
    openapiFields.add("interval");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("agentSelectorType");
    openapiRequiredFields.add("maxMachines");
    openapiRequiredFields.add("testName");
    openapiRequiredFields.add("serverName");
    openapiRequiredFields.add("interval");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EndpointAgentToServerTestRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EndpointAgentToServerTestRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EndpointAgentToServerTestRequest is not found in the empty JSON string", EndpointAgentToServerTestRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EndpointAgentToServerTestRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EndpointAgentToServerTestRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EndpointAgentToServerTestRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `agentSelectorType`
      EndpointTestAgentSelectorType.validateJsonElement(jsonObj.get("agentSelectorType"));
      // ensure the optional json data is an array if present
      if (jsonObj.get("agents") != null && !jsonObj.get("agents").isJsonNull() && !jsonObj.get("agents").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `agents` to be an array in the JSON string but got `%s`", jsonObj.get("agents").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("endpointAgentLabels") != null && !jsonObj.get("endpointAgentLabels").isJsonNull() && !jsonObj.get("endpointAgentLabels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `endpointAgentLabels` to be an array in the JSON string but got `%s`", jsonObj.get("endpointAgentLabels").toString()));
      }
      if (!jsonObj.get("testName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testName").toString()));
      }
      if (!jsonObj.get("serverName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serverName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serverName").toString()));
      }
      // validate the required field `interval`
      TestInterval.validateJsonElement(jsonObj.get("interval"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EndpointAgentToServerTestRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EndpointAgentToServerTestRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EndpointAgentToServerTestRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EndpointAgentToServerTestRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<EndpointAgentToServerTestRequest>() {
           @Override
           public void write(JsonWriter out, EndpointAgentToServerTestRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EndpointAgentToServerTestRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EndpointAgentToServerTestRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EndpointAgentToServerTestRequest
  * @throws IOException if the JSON string is invalid with respect to EndpointAgentToServerTestRequest
  */
  public static EndpointAgentToServerTestRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EndpointAgentToServerTestRequest.class);
  }

 /**
  * Convert an instance of EndpointAgentToServerTestRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

