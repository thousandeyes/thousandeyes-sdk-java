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
import com.thousandeyes.api.instant.tests.model.InstantTestRequestAgentsInner;
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
 * InstantTestRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T14:43:32.643170Z[Europe/Lisbon]")
public class InstantTestRequest {
  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<String> labels;

  public static final String SERIALIZED_NAME_SHARED_WITH_ACCOUNTS = "sharedWithAccounts";
  @SerializedName(SERIALIZED_NAME_SHARED_WITH_ACCOUNTS)
  private List<String> sharedWithAccounts;

  public static final String SERIALIZED_NAME_AGENTS = "agents";
  @SerializedName(SERIALIZED_NAME_AGENTS)
  private List<InstantTestRequestAgentsInner> agents;

  public InstantTestRequest() {
  }

  public InstantTestRequest labels(List<String> labels) {
    
    this.labels = labels;
    return this;
  }

  public InstantTestRequest addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * A list of test label identifiers (get &#x60;labelId&#x60; from &#x60;/labels&#x60; endpoint).
   * @return labels
  **/
  @javax.annotation.Nullable
  public List<String> getLabels() {
    return labels;
  }


  public void setLabels(List<String> labels) {
    this.labels = labels;
  }


  public InstantTestRequest sharedWithAccounts(List<String> sharedWithAccounts) {
    
    this.sharedWithAccounts = sharedWithAccounts;
    return this;
  }

  public InstantTestRequest addSharedWithAccountsItem(String sharedWithAccountsItem) {
    if (this.sharedWithAccounts == null) {
      this.sharedWithAccounts = new ArrayList<>();
    }
    this.sharedWithAccounts.add(sharedWithAccountsItem);
    return this;
  }

   /**
   * A list of account group identifiers that the test is shared with (get &#x60;aid&#x60; from &#x60;/account-groups&#x60; endpoint).
   * @return sharedWithAccounts
  **/
  @javax.annotation.Nullable
  public List<String> getSharedWithAccounts() {
    return sharedWithAccounts;
  }


  public void setSharedWithAccounts(List<String> sharedWithAccounts) {
    this.sharedWithAccounts = sharedWithAccounts;
  }


  public InstantTestRequest agents(List<InstantTestRequestAgentsInner> agents) {
    
    this.agents = agents;
    return this;
  }

  public InstantTestRequest addAgentsItem(InstantTestRequestAgentsInner agentsItem) {
    if (this.agents == null) {
      this.agents = new ArrayList<>();
    }
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * A list of objects with &#x60;agentId&#x60; (required) and &#x60;sourceIpAddress&#x60; (optional).
   * @return agents
  **/
  @javax.annotation.Nullable
  public List<InstantTestRequestAgentsInner> getAgents() {
    return agents;
  }


  public void setAgents(List<InstantTestRequestAgentsInner> agents) {
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
    InstantTestRequest instantTestRequest = (InstantTestRequest) o;
    return Objects.equals(this.labels, instantTestRequest.labels) &&
        Objects.equals(this.sharedWithAccounts, instantTestRequest.sharedWithAccounts) &&
        Objects.equals(this.agents, instantTestRequest.agents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, sharedWithAccounts, agents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstantTestRequest {\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    sharedWithAccounts: ").append(toIndentedString(sharedWithAccounts)).append("\n");
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
    openapiFields.add("labels");
    openapiFields.add("sharedWithAccounts");
    openapiFields.add("agents");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to InstantTestRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InstantTestRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InstantTestRequest is not found in the empty JSON string", InstantTestRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InstantTestRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InstantTestRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("labels") != null && !jsonObj.get("labels").isJsonNull() && !jsonObj.get("labels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `labels` to be an array in the JSON string but got `%s`", jsonObj.get("labels").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sharedWithAccounts") != null && !jsonObj.get("sharedWithAccounts").isJsonNull() && !jsonObj.get("sharedWithAccounts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sharedWithAccounts` to be an array in the JSON string but got `%s`", jsonObj.get("sharedWithAccounts").toString()));
      }
      if (jsonObj.get("agents") != null && !jsonObj.get("agents").isJsonNull()) {
        JsonArray jsonArrayagents = jsonObj.getAsJsonArray("agents");
        if (jsonArrayagents != null) {
          // ensure the json data is an array
          if (!jsonObj.get("agents").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `agents` to be an array in the JSON string but got `%s`", jsonObj.get("agents").toString()));
          }

          // validate the optional field `agents` (array)
          for (int i = 0; i < jsonArrayagents.size(); i++) {
            InstantTestRequestAgentsInner.validateJsonElement(jsonArrayagents.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InstantTestRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InstantTestRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InstantTestRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InstantTestRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<InstantTestRequest>() {
           @Override
           public void write(JsonWriter out, InstantTestRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InstantTestRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InstantTestRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InstantTestRequest
  * @throws IOException if the JSON string is invalid with respect to InstantTestRequest
  */
  public static InstantTestRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InstantTestRequest.class);
  }

 /**
  * Convert an instance of InstantTestRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

