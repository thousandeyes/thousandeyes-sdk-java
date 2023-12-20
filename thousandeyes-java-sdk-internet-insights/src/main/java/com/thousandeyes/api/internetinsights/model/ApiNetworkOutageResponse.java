/*
 * Internet Insights API
 * # Overview We are happy to announce the release of the Internet Insights API set. This limited release includes endpoints that: * Make our catalog provider and Internet outage data accessible to API users. * Provide access to advanced filtering, which is part of our next-generation API efforts to allow API users to fine-tune queries across all of our APIs in a consistent manner.  Internet Insights provide visibility into core Internet infrastructure, including: ISPs, DNS providers, IaaS, CDNs , and SaaS providers. It tracks the macro-level impact of Internet events on individual users and enterprise networks connecting at the edge of the Internet. These events include: Outages, Routing hijacks and leaks, DDoS attacks, And political interference, among others.  Future releases of the Internet Insights API set will further unlock access to core Internet Insights functionality, unlocking potential integrations to enrich customer process flows. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.internetinsights.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.internetinsights.model.ApiAffectedAgent;
import com.thousandeyes.api.internetinsights.model.ApiAffectedTest;
import com.thousandeyes.api.internetinsights.model.ApiNetworkOutageAffectedLocation;
import com.thousandeyes.api.internetinsights.model.SelfLinksLinks;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

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
 * ApiNetworkOutageResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T14:43:28.694926Z[Europe/Lisbon]")
public class ApiNetworkOutageResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PROVIDER_NAME = "providerName";
  @SerializedName(SERIALIZED_NAME_PROVIDER_NAME)
  private String providerName;

  public static final String SERIALIZED_NAME_PROVIDER_TYPE = "providerType";
  @SerializedName(SERIALIZED_NAME_PROVIDER_TYPE)
  private String providerType;

  public static final String SERIALIZED_NAME_NETWORK_NAME = "networkName";
  @SerializedName(SERIALIZED_NAME_NETWORK_NAME)
  private String networkName;

  public static final String SERIALIZED_NAME_ASN = "asn";
  @SerializedName(SERIALIZED_NAME_ASN)
  private Integer asn;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_START_ROUND_ID = "startRoundId";
  @SerializedName(SERIALIZED_NAME_START_ROUND_ID)
  private Long startRoundId;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_END_ROUND_ID = "endRoundId";
  @SerializedName(SERIALIZED_NAME_END_ROUND_ID)
  private Long endRoundId;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Long duration;

  public static final String SERIALIZED_NAME_AFFECTED_TESTS = "affectedTests";
  @SerializedName(SERIALIZED_NAME_AFFECTED_TESTS)
  private Set<ApiAffectedTest> affectedTests;

  public static final String SERIALIZED_NAME_AFFECTED_DOMAINS = "affectedDomains";
  @SerializedName(SERIALIZED_NAME_AFFECTED_DOMAINS)
  private Set<String> affectedDomains;

  public static final String SERIALIZED_NAME_AFFECTED_AGENTS = "affectedAgents";
  @SerializedName(SERIALIZED_NAME_AFFECTED_AGENTS)
  private Set<ApiAffectedAgent> affectedAgents;

  public static final String SERIALIZED_NAME_AFFECTED_LOCATIONS = "affectedLocations";
  @SerializedName(SERIALIZED_NAME_AFFECTED_LOCATIONS)
  private Set<ApiNetworkOutageAffectedLocation> affectedLocations;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private SelfLinksLinks links;

  public ApiNetworkOutageResponse() {
  }

  public ApiNetworkOutageResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the outage.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ApiNetworkOutageResponse providerName(String providerName) {
    
    this.providerName = providerName;
    return this;
  }

   /**
   * The name of the affected provider.
   * @return providerName
  **/
  @javax.annotation.Nullable
  public String getProviderName() {
    return providerName;
  }


  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }


  public ApiNetworkOutageResponse providerType(String providerType) {
    
    this.providerType = providerType;
    return this;
  }

   /**
   * The type of the affected provider.
   * @return providerType
  **/
  @javax.annotation.Nullable
  public String getProviderType() {
    return providerType;
  }


  public void setProviderType(String providerType) {
    this.providerType = providerType;
  }


  public ApiNetworkOutageResponse networkName(String networkName) {
    
    this.networkName = networkName;
    return this;
  }

   /**
   * The affected network.
   * @return networkName
  **/
  @javax.annotation.Nullable
  public String getNetworkName() {
    return networkName;
  }


  public void setNetworkName(String networkName) {
    this.networkName = networkName;
  }


  public ApiNetworkOutageResponse asn(Integer asn) {
    
    this.asn = asn;
    return this;
  }

   /**
   * ASN number
   * @return asn
  **/
  @javax.annotation.Nullable
  public Integer getAsn() {
    return asn;
  }


  public void setAsn(Integer asn) {
    this.asn = asn;
  }


  public ApiNetworkOutageResponse startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Date and time when the outage started.
   * @return startDate
  **/
  @javax.annotation.Nullable
  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public ApiNetworkOutageResponse startRoundId(Long startRoundId) {
    
    this.startRoundId = startRoundId;
    return this;
  }

   /**
   * Epoch time (seconds) when the outage started.
   * @return startRoundId
  **/
  @javax.annotation.Nullable
  public Long getStartRoundId() {
    return startRoundId;
  }


  public void setStartRoundId(Long startRoundId) {
    this.startRoundId = startRoundId;
  }


  public ApiNetworkOutageResponse endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Date and time when the outage ended.
   * @return endDate
  **/
  @javax.annotation.Nullable
  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public ApiNetworkOutageResponse endRoundId(Long endRoundId) {
    
    this.endRoundId = endRoundId;
    return this;
  }

   /**
   * Epoch time (seconds) when the outage ended.
   * @return endRoundId
  **/
  @javax.annotation.Nullable
  public Long getEndRoundId() {
    return endRoundId;
  }


  public void setEndRoundId(Long endRoundId) {
    this.endRoundId = endRoundId;
  }


  public ApiNetworkOutageResponse duration(Long duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Duration of the outage in seconds.
   * @return duration
  **/
  @javax.annotation.Nullable
  public Long getDuration() {
    return duration;
  }


  public void setDuration(Long duration) {
    this.duration = duration;
  }


  public ApiNetworkOutageResponse affectedTests(Set<ApiAffectedTest> affectedTests) {
    
    this.affectedTests = affectedTests;
    return this;
  }

  public ApiNetworkOutageResponse addAffectedTestsItem(ApiAffectedTest affectedTestsItem) {
    if (this.affectedTests == null) {
      this.affectedTests = new LinkedHashSet<>();
    }
    this.affectedTests.add(affectedTestsItem);
    return this;
  }

   /**
   * List of affected tests.
   * @return affectedTests
  **/
  @javax.annotation.Nullable
  public Set<ApiAffectedTest> getAffectedTests() {
    return affectedTests;
  }


  public void setAffectedTests(Set<ApiAffectedTest> affectedTests) {
    this.affectedTests = affectedTests;
  }


  public ApiNetworkOutageResponse affectedDomains(Set<String> affectedDomains) {
    
    this.affectedDomains = affectedDomains;
    return this;
  }

  public ApiNetworkOutageResponse addAffectedDomainsItem(String affectedDomainsItem) {
    if (this.affectedDomains == null) {
      this.affectedDomains = new LinkedHashSet<>();
    }
    this.affectedDomains.add(affectedDomainsItem);
    return this;
  }

   /**
   * List of affected domains.
   * @return affectedDomains
  **/
  @javax.annotation.Nullable
  public Set<String> getAffectedDomains() {
    return affectedDomains;
  }


  public void setAffectedDomains(Set<String> affectedDomains) {
    this.affectedDomains = affectedDomains;
  }


  public ApiNetworkOutageResponse affectedAgents(Set<ApiAffectedAgent> affectedAgents) {
    
    this.affectedAgents = affectedAgents;
    return this;
  }

  public ApiNetworkOutageResponse addAffectedAgentsItem(ApiAffectedAgent affectedAgentsItem) {
    if (this.affectedAgents == null) {
      this.affectedAgents = new LinkedHashSet<>();
    }
    this.affectedAgents.add(affectedAgentsItem);
    return this;
  }

   /**
   * List of affected agents.
   * @return affectedAgents
  **/
  @javax.annotation.Nullable
  public Set<ApiAffectedAgent> getAffectedAgents() {
    return affectedAgents;
  }


  public void setAffectedAgents(Set<ApiAffectedAgent> affectedAgents) {
    this.affectedAgents = affectedAgents;
  }


  public ApiNetworkOutageResponse affectedLocations(Set<ApiNetworkOutageAffectedLocation> affectedLocations) {
    
    this.affectedLocations = affectedLocations;
    return this;
  }

  public ApiNetworkOutageResponse addAffectedLocationsItem(ApiNetworkOutageAffectedLocation affectedLocationsItem) {
    if (this.affectedLocations == null) {
      this.affectedLocations = new LinkedHashSet<>();
    }
    this.affectedLocations.add(affectedLocationsItem);
    return this;
  }

   /**
   * List of affected locations.
   * @return affectedLocations
  **/
  @javax.annotation.Nullable
  public Set<ApiNetworkOutageAffectedLocation> getAffectedLocations() {
    return affectedLocations;
  }


  public void setAffectedLocations(Set<ApiNetworkOutageAffectedLocation> affectedLocations) {
    this.affectedLocations = affectedLocations;
  }


  public ApiNetworkOutageResponse links(SelfLinksLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public SelfLinksLinks getLinks() {
    return links;
  }


  public void setLinks(SelfLinksLinks links) {
    this.links = links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiNetworkOutageResponse apiNetworkOutageResponse = (ApiNetworkOutageResponse) o;
    return Objects.equals(this.id, apiNetworkOutageResponse.id) &&
        Objects.equals(this.providerName, apiNetworkOutageResponse.providerName) &&
        Objects.equals(this.providerType, apiNetworkOutageResponse.providerType) &&
        Objects.equals(this.networkName, apiNetworkOutageResponse.networkName) &&
        Objects.equals(this.asn, apiNetworkOutageResponse.asn) &&
        Objects.equals(this.startDate, apiNetworkOutageResponse.startDate) &&
        Objects.equals(this.startRoundId, apiNetworkOutageResponse.startRoundId) &&
        Objects.equals(this.endDate, apiNetworkOutageResponse.endDate) &&
        Objects.equals(this.endRoundId, apiNetworkOutageResponse.endRoundId) &&
        Objects.equals(this.duration, apiNetworkOutageResponse.duration) &&
        Objects.equals(this.affectedTests, apiNetworkOutageResponse.affectedTests) &&
        Objects.equals(this.affectedDomains, apiNetworkOutageResponse.affectedDomains) &&
        Objects.equals(this.affectedAgents, apiNetworkOutageResponse.affectedAgents) &&
        Objects.equals(this.affectedLocations, apiNetworkOutageResponse.affectedLocations) &&
        Objects.equals(this.links, apiNetworkOutageResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, providerName, providerType, networkName, asn, startDate, startRoundId, endDate, endRoundId, duration, affectedTests, affectedDomains, affectedAgents, affectedLocations, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiNetworkOutageResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
    sb.append("    networkName: ").append(toIndentedString(networkName)).append("\n");
    sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startRoundId: ").append(toIndentedString(startRoundId)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    endRoundId: ").append(toIndentedString(endRoundId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    affectedTests: ").append(toIndentedString(affectedTests)).append("\n");
    sb.append("    affectedDomains: ").append(toIndentedString(affectedDomains)).append("\n");
    sb.append("    affectedAgents: ").append(toIndentedString(affectedAgents)).append("\n");
    sb.append("    affectedLocations: ").append(toIndentedString(affectedLocations)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("providerName");
    openapiFields.add("providerType");
    openapiFields.add("networkName");
    openapiFields.add("asn");
    openapiFields.add("startDate");
    openapiFields.add("startRoundId");
    openapiFields.add("endDate");
    openapiFields.add("endRoundId");
    openapiFields.add("duration");
    openapiFields.add("affectedTests");
    openapiFields.add("affectedDomains");
    openapiFields.add("affectedAgents");
    openapiFields.add("affectedLocations");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApiNetworkOutageResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiNetworkOutageResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiNetworkOutageResponse is not found in the empty JSON string", ApiNetworkOutageResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiNetworkOutageResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiNetworkOutageResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("providerName") != null && !jsonObj.get("providerName").isJsonNull()) && !jsonObj.get("providerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `providerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("providerName").toString()));
      }
      if ((jsonObj.get("providerType") != null && !jsonObj.get("providerType").isJsonNull()) && !jsonObj.get("providerType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `providerType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("providerType").toString()));
      }
      if ((jsonObj.get("networkName") != null && !jsonObj.get("networkName").isJsonNull()) && !jsonObj.get("networkName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `networkName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("networkName").toString()));
      }
      if ((jsonObj.get("startDate") != null && !jsonObj.get("startDate").isJsonNull()) && !jsonObj.get("startDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startDate").toString()));
      }
      if ((jsonObj.get("endDate") != null && !jsonObj.get("endDate").isJsonNull()) && !jsonObj.get("endDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endDate").toString()));
      }
      if (jsonObj.get("affectedTests") != null && !jsonObj.get("affectedTests").isJsonNull()) {
        JsonArray jsonArrayaffectedTests = jsonObj.getAsJsonArray("affectedTests");
        if (jsonArrayaffectedTests != null) {
          // ensure the json data is an array
          if (!jsonObj.get("affectedTests").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `affectedTests` to be an array in the JSON string but got `%s`", jsonObj.get("affectedTests").toString()));
          }

          // validate the optional field `affectedTests` (array)
          for (int i = 0; i < jsonArrayaffectedTests.size(); i++) {
            ApiAffectedTest.validateJsonElement(jsonArrayaffectedTests.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("affectedDomains") != null && !jsonObj.get("affectedDomains").isJsonNull() && !jsonObj.get("affectedDomains").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `affectedDomains` to be an array in the JSON string but got `%s`", jsonObj.get("affectedDomains").toString()));
      }
      if (jsonObj.get("affectedAgents") != null && !jsonObj.get("affectedAgents").isJsonNull()) {
        JsonArray jsonArrayaffectedAgents = jsonObj.getAsJsonArray("affectedAgents");
        if (jsonArrayaffectedAgents != null) {
          // ensure the json data is an array
          if (!jsonObj.get("affectedAgents").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `affectedAgents` to be an array in the JSON string but got `%s`", jsonObj.get("affectedAgents").toString()));
          }

          // validate the optional field `affectedAgents` (array)
          for (int i = 0; i < jsonArrayaffectedAgents.size(); i++) {
            ApiAffectedAgent.validateJsonElement(jsonArrayaffectedAgents.get(i));
          };
        }
      }
      if (jsonObj.get("affectedLocations") != null && !jsonObj.get("affectedLocations").isJsonNull()) {
        JsonArray jsonArrayaffectedLocations = jsonObj.getAsJsonArray("affectedLocations");
        if (jsonArrayaffectedLocations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("affectedLocations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `affectedLocations` to be an array in the JSON string but got `%s`", jsonObj.get("affectedLocations").toString()));
          }

          // validate the optional field `affectedLocations` (array)
          for (int i = 0; i < jsonArrayaffectedLocations.size(); i++) {
            ApiNetworkOutageAffectedLocation.validateJsonElement(jsonArrayaffectedLocations.get(i));
          };
        }
      }
      // validate the optional field `_links`
      if (jsonObj.get("_links") != null && !jsonObj.get("_links").isJsonNull()) {
        SelfLinksLinks.validateJsonElement(jsonObj.get("_links"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiNetworkOutageResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiNetworkOutageResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiNetworkOutageResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiNetworkOutageResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiNetworkOutageResponse>() {
           @Override
           public void write(JsonWriter out, ApiNetworkOutageResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiNetworkOutageResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiNetworkOutageResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiNetworkOutageResponse
  * @throws IOException if the JSON string is invalid with respect to ApiNetworkOutageResponse
  */
  public static ApiNetworkOutageResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiNetworkOutageResponse.class);
  }

 /**
  * Convert an instance of ApiNetworkOutageResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

