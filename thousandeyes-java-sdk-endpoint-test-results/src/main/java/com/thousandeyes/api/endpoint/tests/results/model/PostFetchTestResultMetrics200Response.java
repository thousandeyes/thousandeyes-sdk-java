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


package com.thousandeyes.api.endpoint.tests.results.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.endpoint.tests.results.model.EndpointScheduledTest;
import com.thousandeyes.api.endpoint.tests.results.model.NetworkTestResult;
import com.thousandeyes.api.endpoint.tests.results.model.PaginationNextLinkLinks;
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

import com.thousandeyes.api.endpoint.tests.JSON;

/**
 * PostFetchTestResultMetrics200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T12:21:05.666462Z[Europe/Lisbon]")
public class PostFetchTestResultMetrics200Response {
  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<NetworkTestResult> results;

  public static final String SERIALIZED_NAME_TEST = "test";
  @SerializedName(SERIALIZED_NAME_TEST)
  private EndpointScheduledTest test;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private PaginationNextLinkLinks links;

  public PostFetchTestResultMetrics200Response() {
  }

  
  public PostFetchTestResultMetrics200Response(
     OffsetDateTime startDate, 
     OffsetDateTime endDate
  ) {
    this();
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public PostFetchTestResultMetrics200Response results(List<NetworkTestResult> results) {
    
    this.results = results;
    return this;
  }

  public PostFetchTestResultMetrics200Response addResultsItem(NetworkTestResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @javax.annotation.Nullable
  public List<NetworkTestResult> getResults() {
    return results;
  }


  public void setResults(List<NetworkTestResult> results) {
    this.results = results;
  }


  public PostFetchTestResultMetrics200Response test(EndpointScheduledTest test) {
    
    this.test = test;
    return this;
  }

   /**
   * Get test
   * @return test
  **/
  @javax.annotation.Nullable
  public EndpointScheduledTest getTest() {
    return test;
  }


  public void setTest(EndpointScheduledTest test) {
    this.test = test;
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




  public PostFetchTestResultMetrics200Response links(PaginationNextLinkLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public PaginationNextLinkLinks getLinks() {
    return links;
  }


  public void setLinks(PaginationNextLinkLinks links) {
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
    PostFetchTestResultMetrics200Response postFetchTestResultMetrics200Response = (PostFetchTestResultMetrics200Response) o;
    return Objects.equals(this.results, postFetchTestResultMetrics200Response.results) &&
        Objects.equals(this.test, postFetchTestResultMetrics200Response.test) &&
        Objects.equals(this.startDate, postFetchTestResultMetrics200Response.startDate) &&
        Objects.equals(this.endDate, postFetchTestResultMetrics200Response.endDate) &&
        Objects.equals(this.links, postFetchTestResultMetrics200Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, test, startDate, endDate, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostFetchTestResultMetrics200Response {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
    openapiFields.add("results");
    openapiFields.add("test");
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PostFetchTestResultMetrics200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PostFetchTestResultMetrics200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PostFetchTestResultMetrics200Response is not found in the empty JSON string", PostFetchTestResultMetrics200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PostFetchTestResultMetrics200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PostFetchTestResultMetrics200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("results") != null && !jsonObj.get("results").isJsonNull()) {
        JsonArray jsonArrayresults = jsonObj.getAsJsonArray("results");
        if (jsonArrayresults != null) {
          // ensure the json data is an array
          if (!jsonObj.get("results").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `results` to be an array in the JSON string but got `%s`", jsonObj.get("results").toString()));
          }

          // validate the optional field `results` (array)
          for (int i = 0; i < jsonArrayresults.size(); i++) {
            NetworkTestResult.validateJsonElement(jsonArrayresults.get(i));
          };
        }
      }
      // validate the optional field `test`
      if (jsonObj.get("test") != null && !jsonObj.get("test").isJsonNull()) {
        EndpointScheduledTest.validateJsonElement(jsonObj.get("test"));
      }
      // validate the optional field `_links`
      if (jsonObj.get("_links") != null && !jsonObj.get("_links").isJsonNull()) {
        PaginationNextLinkLinks.validateJsonElement(jsonObj.get("_links"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PostFetchTestResultMetrics200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PostFetchTestResultMetrics200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PostFetchTestResultMetrics200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PostFetchTestResultMetrics200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<PostFetchTestResultMetrics200Response>() {
           @Override
           public void write(JsonWriter out, PostFetchTestResultMetrics200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PostFetchTestResultMetrics200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PostFetchTestResultMetrics200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PostFetchTestResultMetrics200Response
  * @throws IOException if the JSON string is invalid with respect to PostFetchTestResultMetrics200Response
  */
  public static PostFetchTestResultMetrics200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PostFetchTestResultMetrics200Response.class);
  }

 /**
  * Convert an instance of PostFetchTestResultMetrics200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

