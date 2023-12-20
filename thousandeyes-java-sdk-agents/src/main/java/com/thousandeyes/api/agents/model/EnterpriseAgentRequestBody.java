/*
 * Agents API
 *  ## Overview Manage all agents available to your account in ThousandEyes, including both Cloud and Enterprise Agents.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.agents.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.agents.model.AgentIpv6Policy;
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

import com.thousandeyes.api.JSON;

/**
 * EnterpriseAgentRequestBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T14:43:30.468717Z[Europe/Lisbon]")
public class EnterpriseAgentRequestBody {
  public static final String SERIALIZED_NAME_AGENT_NAME = "agentName";
  @SerializedName(SERIALIZED_NAME_AGENT_NAME)
  private String agentName;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_ACCOUNT_GROUPS = "accountGroups";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_GROUPS)
  private List<String> accountGroups;

  public static final String SERIALIZED_NAME_IPV6_POLICY = "ipv6Policy";
  @SerializedName(SERIALIZED_NAME_IPV6_POLICY)
  private AgentIpv6Policy ipv6Policy;

  public static final String SERIALIZED_NAME_KEEP_BROWSER_CACHE = "keepBrowserCache";
  @SerializedName(SERIALIZED_NAME_KEEP_BROWSER_CACHE)
  private Boolean keepBrowserCache;

  public static final String SERIALIZED_NAME_TARGET_FOR_TESTS = "targetForTests";
  @SerializedName(SERIALIZED_NAME_TARGET_FOR_TESTS)
  private String targetForTests;

  public static final String SERIALIZED_NAME_LOCAL_RESOLUTION_PREFIXES = "localResolutionPrefixes";
  @SerializedName(SERIALIZED_NAME_LOCAL_RESOLUTION_PREFIXES)
  private List<String> localResolutionPrefixes;

  public static final String SERIALIZED_NAME_TESTS = "tests";
  @SerializedName(SERIALIZED_NAME_TESTS)
  private List<String> tests;

  public EnterpriseAgentRequestBody() {
  }

  public EnterpriseAgentRequestBody agentName(String agentName) {
    
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


  public EnterpriseAgentRequestBody enabled(Boolean enabled) {
    
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


  public EnterpriseAgentRequestBody accountGroups(List<String> accountGroups) {
    
    this.accountGroups = accountGroups;
    return this;
  }

  public EnterpriseAgentRequestBody addAccountGroupsItem(String accountGroupsItem) {
    if (this.accountGroups == null) {
      this.accountGroups = new ArrayList<>();
    }
    this.accountGroups.add(accountGroupsItem);
    return this;
  }

   /**
   * Contains a list of account groups IDs. See &#x60;/accounts-groups&#x60; for a list of account IDs
   * @return accountGroups
  **/
  @javax.annotation.Nullable
  public List<String> getAccountGroups() {
    return accountGroups;
  }


  public void setAccountGroups(List<String> accountGroups) {
    this.accountGroups = accountGroups;
  }


  public EnterpriseAgentRequestBody ipv6Policy(AgentIpv6Policy ipv6Policy) {
    
    this.ipv6Policy = ipv6Policy;
    return this;
  }

   /**
   * Get ipv6Policy
   * @return ipv6Policy
  **/
  @javax.annotation.Nullable
  public AgentIpv6Policy getIpv6Policy() {
    return ipv6Policy;
  }


  public void setIpv6Policy(AgentIpv6Policy ipv6Policy) {
    this.ipv6Policy = ipv6Policy;
  }


  public EnterpriseAgentRequestBody keepBrowserCache(Boolean keepBrowserCache) {
    
    this.keepBrowserCache = keepBrowserCache;
    return this;
  }

   /**
   * Flag indicating if the agent retains cache.
   * @return keepBrowserCache
  **/
  @javax.annotation.Nullable
  public Boolean getKeepBrowserCache() {
    return keepBrowserCache;
  }


  public void setKeepBrowserCache(Boolean keepBrowserCache) {
    this.keepBrowserCache = keepBrowserCache;
  }


  public EnterpriseAgentRequestBody targetForTests(String targetForTests) {
    
    this.targetForTests = targetForTests;
    return this;
  }

   /**
   * Test target IP address.
   * @return targetForTests
  **/
  @javax.annotation.Nullable
  public String getTargetForTests() {
    return targetForTests;
  }


  public void setTargetForTests(String targetForTests) {
    this.targetForTests = targetForTests;
  }


  public EnterpriseAgentRequestBody localResolutionPrefixes(List<String> localResolutionPrefixes) {
    
    this.localResolutionPrefixes = localResolutionPrefixes;
    return this;
  }

  public EnterpriseAgentRequestBody addLocalResolutionPrefixesItem(String localResolutionPrefixesItem) {
    if (this.localResolutionPrefixes == null) {
      this.localResolutionPrefixes = new ArrayList<>();
    }
    this.localResolutionPrefixes.add(localResolutionPrefixesItem);
    return this;
  }

   /**
   * Public IP ranges for rDNS lookups. The range must be in CIDR notation; for example, 10.1.1.0/24. Maximum of 5 prefixes allowed (Enterprise Agents and Enterprise Agent clusters only).
   * @return localResolutionPrefixes
  **/
  @javax.annotation.Nullable
  public List<String> getLocalResolutionPrefixes() {
    return localResolutionPrefixes;
  }


  public void setLocalResolutionPrefixes(List<String> localResolutionPrefixes) {
    this.localResolutionPrefixes = localResolutionPrefixes;
  }


  public EnterpriseAgentRequestBody tests(List<String> tests) {
    
    this.tests = tests;
    return this;
  }

  public EnterpriseAgentRequestBody addTestsItem(String testsItem) {
    if (this.tests == null) {
      this.tests = new ArrayList<>();
    }
    this.tests.add(testsItem);
    return this;
  }

   /**
   * Contains list of test IDs. See &#x60;/tests&#x60; to pull a list of available tests.
   * @return tests
  **/
  @javax.annotation.Nullable
  public List<String> getTests() {
    return tests;
  }


  public void setTests(List<String> tests) {
    this.tests = tests;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseAgentRequestBody enterpriseAgentRequestBody = (EnterpriseAgentRequestBody) o;
    return Objects.equals(this.agentName, enterpriseAgentRequestBody.agentName) &&
        Objects.equals(this.enabled, enterpriseAgentRequestBody.enabled) &&
        Objects.equals(this.accountGroups, enterpriseAgentRequestBody.accountGroups) &&
        Objects.equals(this.ipv6Policy, enterpriseAgentRequestBody.ipv6Policy) &&
        Objects.equals(this.keepBrowserCache, enterpriseAgentRequestBody.keepBrowserCache) &&
        Objects.equals(this.targetForTests, enterpriseAgentRequestBody.targetForTests) &&
        Objects.equals(this.localResolutionPrefixes, enterpriseAgentRequestBody.localResolutionPrefixes) &&
        Objects.equals(this.tests, enterpriseAgentRequestBody.tests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentName, enabled, accountGroups, ipv6Policy, keepBrowserCache, targetForTests, localResolutionPrefixes, tests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseAgentRequestBody {\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    accountGroups: ").append(toIndentedString(accountGroups)).append("\n");
    sb.append("    ipv6Policy: ").append(toIndentedString(ipv6Policy)).append("\n");
    sb.append("    keepBrowserCache: ").append(toIndentedString(keepBrowserCache)).append("\n");
    sb.append("    targetForTests: ").append(toIndentedString(targetForTests)).append("\n");
    sb.append("    localResolutionPrefixes: ").append(toIndentedString(localResolutionPrefixes)).append("\n");
    sb.append("    tests: ").append(toIndentedString(tests)).append("\n");
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
    openapiFields.add("agentName");
    openapiFields.add("enabled");
    openapiFields.add("accountGroups");
    openapiFields.add("ipv6Policy");
    openapiFields.add("keepBrowserCache");
    openapiFields.add("targetForTests");
    openapiFields.add("localResolutionPrefixes");
    openapiFields.add("tests");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EnterpriseAgentRequestBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnterpriseAgentRequestBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnterpriseAgentRequestBody is not found in the empty JSON string", EnterpriseAgentRequestBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EnterpriseAgentRequestBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnterpriseAgentRequestBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("agentName") != null && !jsonObj.get("agentName").isJsonNull()) && !jsonObj.get("agentName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agentName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agentName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("accountGroups") != null && !jsonObj.get("accountGroups").isJsonNull() && !jsonObj.get("accountGroups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountGroups` to be an array in the JSON string but got `%s`", jsonObj.get("accountGroups").toString()));
      }
      // validate the optional field `ipv6Policy`
      if (jsonObj.get("ipv6Policy") != null && !jsonObj.get("ipv6Policy").isJsonNull()) {
        AgentIpv6Policy.validateJsonElement(jsonObj.get("ipv6Policy"));
      }
      if ((jsonObj.get("targetForTests") != null && !jsonObj.get("targetForTests").isJsonNull()) && !jsonObj.get("targetForTests").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetForTests` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetForTests").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("localResolutionPrefixes") != null && !jsonObj.get("localResolutionPrefixes").isJsonNull() && !jsonObj.get("localResolutionPrefixes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `localResolutionPrefixes` to be an array in the JSON string but got `%s`", jsonObj.get("localResolutionPrefixes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tests") != null && !jsonObj.get("tests").isJsonNull() && !jsonObj.get("tests").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tests` to be an array in the JSON string but got `%s`", jsonObj.get("tests").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterpriseAgentRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterpriseAgentRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterpriseAgentRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterpriseAgentRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterpriseAgentRequestBody>() {
           @Override
           public void write(JsonWriter out, EnterpriseAgentRequestBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnterpriseAgentRequestBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnterpriseAgentRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterpriseAgentRequestBody
  * @throws IOException if the JSON string is invalid with respect to EnterpriseAgentRequestBody
  */
  public static EnterpriseAgentRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterpriseAgentRequestBody.class);
  }

 /**
  * Convert an instance of EnterpriseAgentRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

