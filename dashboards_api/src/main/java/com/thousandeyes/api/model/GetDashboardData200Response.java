/*
 * Dashboards API
 * Manage ThousandEyes Dashboards
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
import com.thousandeyes.api.model.ApiReportDataComponentLabelMap;
import com.thousandeyes.api.model.ApiWidgetsDataV2;
import com.thousandeyes.api.model.SelfLinksLinks;
import java.io.IOException;
import java.time.OffsetDateTime;
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

import com.thousandeyes.JSON;

/**
 * GetDashboardData200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:17:34.047854Z[Europe/London]")
public class GetDashboardData200Response {
  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_GROUP_LABELS = "groupLabels";
  @SerializedName(SERIALIZED_NAME_GROUP_LABELS)
  private List<ApiReportDataComponentLabelMap> groupLabels;

  public static final String SERIALIZED_NAME_BIN_SIZE = "binSize";
  @SerializedName(SERIALIZED_NAME_BIN_SIZE)
  private Long binSize;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private ApiWidgetsDataV2 data;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private SelfLinksLinks links;

  public GetDashboardData200Response() {
  }

  
  public GetDashboardData200Response(
     OffsetDateTime startDate, 
     OffsetDateTime endDate
  ) {
    this();
    this.startDate = startDate;
    this.endDate = endDate;
  }

   /**
   * (Optional) When passing &#x60;window&#x60; or &#x60;startDate&#x60; parameter,  the client will also receive the &#x60;startDate&#x60; field indicating the UTC start date of the data&#39;s time range being retrieved  (ISO date-time format).
   * @return startDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getStartDate() {
    return startDate;
  }




   /**
   * (Optional) When passing &#x60;window&#x60; or &#x60;endDate&#x60; parameter,  the client will also receive the &#x60;endDate&#x60; field indicating the UTC end date of the data&#39;s time range being retrieved  (ISO date-time format).
   * @return endDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEndDate() {
    return endDate;
  }




  public GetDashboardData200Response groupLabels(List<ApiReportDataComponentLabelMap> groupLabels) {
    
    this.groupLabels = groupLabels;
    return this;
  }

  public GetDashboardData200Response addGroupLabelsItem(ApiReportDataComponentLabelMap groupLabelsItem) {
    if (this.groupLabels == null) {
      this.groupLabels = new ArrayList<>();
    }
    this.groupLabels.add(groupLabelsItem);
    return this;
  }

   /**
   * Get groupLabels
   * @return groupLabels
  **/
  @javax.annotation.Nullable
  public List<ApiReportDataComponentLabelMap> getGroupLabels() {
    return groupLabels;
  }


  public void setGroupLabels(List<ApiReportDataComponentLabelMap> groupLabels) {
    this.groupLabels = groupLabels;
  }


  public GetDashboardData200Response binSize(Long binSize) {
    
    this.binSize = binSize;
    return this;
  }

   /**
   * Duration of each bin.
   * @return binSize
  **/
  @javax.annotation.Nullable
  public Long getBinSize() {
    return binSize;
  }


  public void setBinSize(Long binSize) {
    this.binSize = binSize;
  }


  public GetDashboardData200Response data(ApiWidgetsDataV2 data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  public ApiWidgetsDataV2 getData() {
    return data;
  }


  public void setData(ApiWidgetsDataV2 data) {
    this.data = data;
  }


  public GetDashboardData200Response links(SelfLinksLinks links) {
    
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
    GetDashboardData200Response getDashboardData200Response = (GetDashboardData200Response) o;
    return Objects.equals(this.startDate, getDashboardData200Response.startDate) &&
        Objects.equals(this.endDate, getDashboardData200Response.endDate) &&
        Objects.equals(this.groupLabels, getDashboardData200Response.groupLabels) &&
        Objects.equals(this.binSize, getDashboardData200Response.binSize) &&
        Objects.equals(this.data, getDashboardData200Response.data) &&
        Objects.equals(this.links, getDashboardData200Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, groupLabels, binSize, data, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDashboardData200Response {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    groupLabels: ").append(toIndentedString(groupLabels)).append("\n");
    sb.append("    binSize: ").append(toIndentedString(binSize)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("groupLabels");
    openapiFields.add("binSize");
    openapiFields.add("data");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetDashboardData200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetDashboardData200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetDashboardData200Response is not found in the empty JSON string", GetDashboardData200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetDashboardData200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetDashboardData200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("groupLabels") != null && !jsonObj.get("groupLabels").isJsonNull()) {
        JsonArray jsonArraygroupLabels = jsonObj.getAsJsonArray("groupLabels");
        if (jsonArraygroupLabels != null) {
          // ensure the json data is an array
          if (!jsonObj.get("groupLabels").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `groupLabels` to be an array in the JSON string but got `%s`", jsonObj.get("groupLabels").toString()));
          }

          // validate the optional field `groupLabels` (array)
          for (int i = 0; i < jsonArraygroupLabels.size(); i++) {
            ApiReportDataComponentLabelMap.validateJsonElement(jsonArraygroupLabels.get(i));
          };
        }
      }
      // validate the optional field `data`
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        ApiWidgetsDataV2.validateJsonElement(jsonObj.get("data"));
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
       if (!GetDashboardData200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetDashboardData200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetDashboardData200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetDashboardData200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetDashboardData200Response>() {
           @Override
           public void write(JsonWriter out, GetDashboardData200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetDashboardData200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetDashboardData200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetDashboardData200Response
  * @throws IOException if the JSON string is invalid with respect to GetDashboardData200Response
  */
  public static GetDashboardData200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetDashboardData200Response.class);
  }

 /**
  * Convert an instance of GetDashboardData200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

