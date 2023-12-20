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
import com.thousandeyes.api.internetinsights.model.SelfLinksLinks;
import java.io.IOException;
import java.util.Arrays;
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

import com.thousandeyes.api.JSON;

/**
 * ApiCatalogProviderResponseAllOfProvidersInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T12:21:01.633711Z[Europe/Lisbon]")
public class ApiCatalogProviderResponseAllOfProvidersInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_PROVIDER_NAME = "providerName";
  @SerializedName(SERIALIZED_NAME_PROVIDER_NAME)
  private String providerName;

  public static final String SERIALIZED_NAME_PROVIDER_TYPE = "providerType";
  @SerializedName(SERIALIZED_NAME_PROVIDER_TYPE)
  private String providerType;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_DATA_TYPE = "dataType";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private String dataType;

  public static final String SERIALIZED_NAME_ASNS_COUNT = "asnsCount";
  @SerializedName(SERIALIZED_NAME_ASNS_COUNT)
  private Integer asnsCount;

  public static final String SERIALIZED_NAME_COUNTRIES_COUNT = "countriesCount";
  @SerializedName(SERIALIZED_NAME_COUNTRIES_COUNT)
  private Integer countriesCount;

  public static final String SERIALIZED_NAME_LOCATIONS_COUNT = "locationsCount";
  @SerializedName(SERIALIZED_NAME_LOCATIONS_COUNT)
  private Integer locationsCount;

  public static final String SERIALIZED_NAME_INTERFACES_COUNT = "interfacesCount";
  @SerializedName(SERIALIZED_NAME_INTERFACES_COUNT)
  private Integer interfacesCount;

  public static final String SERIALIZED_NAME_INCLUDED = "included";
  @SerializedName(SERIALIZED_NAME_INCLUDED)
  private Boolean included;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private SelfLinksLinks links;

  public ApiCatalogProviderResponseAllOfProvidersInner() {
  }

  public ApiCatalogProviderResponseAllOfProvidersInner id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The catalog provider ID.
   * @return id
  **/
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public ApiCatalogProviderResponseAllOfProvidersInner providerName(String providerName) {
    
    this.providerName = providerName;
    return this;
  }

   /**
   * The name of the catalog provider.
   * @return providerName
  **/
  @javax.annotation.Nullable
  public String getProviderName() {
    return providerName;
  }


  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }


  public ApiCatalogProviderResponseAllOfProvidersInner providerType(String providerType) {
    
    this.providerType = providerType;
    return this;
  }

   /**
   * The type of catalog provider.
   * @return providerType
  **/
  @javax.annotation.Nullable
  public String getProviderType() {
    return providerType;
  }


  public void setProviderType(String providerType) {
    this.providerType = providerType;
  }


  public ApiCatalogProviderResponseAllOfProvidersInner region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * The catalog provider region.
   * @return region
  **/
  @javax.annotation.Nullable
  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public ApiCatalogProviderResponseAllOfProvidersInner dataType(String dataType) {
    
    this.dataType = dataType;
    return this;
  }

   /**
   * The type of data produced by the provider.
   * @return dataType
  **/
  @javax.annotation.Nullable
  public String getDataType() {
    return dataType;
  }


  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public ApiCatalogProviderResponseAllOfProvidersInner asnsCount(Integer asnsCount) {
    
    this.asnsCount = asnsCount;
    return this;
  }

   /**
   * The number of ASN&#39;s covered by the provider.
   * @return asnsCount
  **/
  @javax.annotation.Nullable
  public Integer getAsnsCount() {
    return asnsCount;
  }


  public void setAsnsCount(Integer asnsCount) {
    this.asnsCount = asnsCount;
  }


  public ApiCatalogProviderResponseAllOfProvidersInner countriesCount(Integer countriesCount) {
    
    this.countriesCount = countriesCount;
    return this;
  }

   /**
   * The number of countries covered by the provider.
   * @return countriesCount
  **/
  @javax.annotation.Nullable
  public Integer getCountriesCount() {
    return countriesCount;
  }


  public void setCountriesCount(Integer countriesCount) {
    this.countriesCount = countriesCount;
  }


  public ApiCatalogProviderResponseAllOfProvidersInner locationsCount(Integer locationsCount) {
    
    this.locationsCount = locationsCount;
    return this;
  }

   /**
   * The number of locations covered by the provider.
   * @return locationsCount
  **/
  @javax.annotation.Nullable
  public Integer getLocationsCount() {
    return locationsCount;
  }


  public void setLocationsCount(Integer locationsCount) {
    this.locationsCount = locationsCount;
  }


  public ApiCatalogProviderResponseAllOfProvidersInner interfacesCount(Integer interfacesCount) {
    
    this.interfacesCount = interfacesCount;
    return this;
  }

   /**
   * The number of interfaces covered by the provider.
   * @return interfacesCount
  **/
  @javax.annotation.Nullable
  public Integer getInterfacesCount() {
    return interfacesCount;
  }


  public void setInterfacesCount(Integer interfacesCount) {
    this.interfacesCount = interfacesCount;
  }


  public ApiCatalogProviderResponseAllOfProvidersInner included(Boolean included) {
    
    this.included = included;
    return this;
  }

   /**
   * Indicates whether the catalog provider is included in the licensed packages.
   * @return included
  **/
  @javax.annotation.Nullable
  public Boolean getIncluded() {
    return included;
  }


  public void setIncluded(Boolean included) {
    this.included = included;
  }


  public ApiCatalogProviderResponseAllOfProvidersInner links(SelfLinksLinks links) {
    
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
    ApiCatalogProviderResponseAllOfProvidersInner apiCatalogProviderResponseAllOfProvidersInner = (ApiCatalogProviderResponseAllOfProvidersInner) o;
    return Objects.equals(this.id, apiCatalogProviderResponseAllOfProvidersInner.id) &&
        Objects.equals(this.providerName, apiCatalogProviderResponseAllOfProvidersInner.providerName) &&
        Objects.equals(this.providerType, apiCatalogProviderResponseAllOfProvidersInner.providerType) &&
        Objects.equals(this.region, apiCatalogProviderResponseAllOfProvidersInner.region) &&
        Objects.equals(this.dataType, apiCatalogProviderResponseAllOfProvidersInner.dataType) &&
        Objects.equals(this.asnsCount, apiCatalogProviderResponseAllOfProvidersInner.asnsCount) &&
        Objects.equals(this.countriesCount, apiCatalogProviderResponseAllOfProvidersInner.countriesCount) &&
        Objects.equals(this.locationsCount, apiCatalogProviderResponseAllOfProvidersInner.locationsCount) &&
        Objects.equals(this.interfacesCount, apiCatalogProviderResponseAllOfProvidersInner.interfacesCount) &&
        Objects.equals(this.included, apiCatalogProviderResponseAllOfProvidersInner.included) &&
        Objects.equals(this.links, apiCatalogProviderResponseAllOfProvidersInner.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, providerName, providerType, region, dataType, asnsCount, countriesCount, locationsCount, interfacesCount, included, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiCatalogProviderResponseAllOfProvidersInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    asnsCount: ").append(toIndentedString(asnsCount)).append("\n");
    sb.append("    countriesCount: ").append(toIndentedString(countriesCount)).append("\n");
    sb.append("    locationsCount: ").append(toIndentedString(locationsCount)).append("\n");
    sb.append("    interfacesCount: ").append(toIndentedString(interfacesCount)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
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
    openapiFields.add("region");
    openapiFields.add("dataType");
    openapiFields.add("asnsCount");
    openapiFields.add("countriesCount");
    openapiFields.add("locationsCount");
    openapiFields.add("interfacesCount");
    openapiFields.add("included");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApiCatalogProviderResponseAllOfProvidersInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiCatalogProviderResponseAllOfProvidersInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiCatalogProviderResponseAllOfProvidersInner is not found in the empty JSON string", ApiCatalogProviderResponseAllOfProvidersInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiCatalogProviderResponseAllOfProvidersInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiCatalogProviderResponseAllOfProvidersInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if ((jsonObj.get("region") != null && !jsonObj.get("region").isJsonNull()) && !jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
      if ((jsonObj.get("dataType") != null && !jsonObj.get("dataType").isJsonNull()) && !jsonObj.get("dataType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataType").toString()));
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
       if (!ApiCatalogProviderResponseAllOfProvidersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiCatalogProviderResponseAllOfProvidersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiCatalogProviderResponseAllOfProvidersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiCatalogProviderResponseAllOfProvidersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiCatalogProviderResponseAllOfProvidersInner>() {
           @Override
           public void write(JsonWriter out, ApiCatalogProviderResponseAllOfProvidersInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiCatalogProviderResponseAllOfProvidersInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiCatalogProviderResponseAllOfProvidersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiCatalogProviderResponseAllOfProvidersInner
  * @throws IOException if the JSON string is invalid with respect to ApiCatalogProviderResponseAllOfProvidersInner
  */
  public static ApiCatalogProviderResponseAllOfProvidersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiCatalogProviderResponseAllOfProvidersInner.class);
  }

 /**
  * Convert an instance of ApiCatalogProviderResponseAllOfProvidersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

