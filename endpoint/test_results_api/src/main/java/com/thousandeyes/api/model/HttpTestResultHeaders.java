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
 * Expandable object containing both request and response headers.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:17:40.551124Z[Europe/London]")
public class HttpTestResultHeaders {
  public static final String SERIALIZED_NAME_REQUEST_HEADERS = "requestHeaders";
  @SerializedName(SERIALIZED_NAME_REQUEST_HEADERS)
  private String requestHeaders;

  public static final String SERIALIZED_NAME_RESPONSE_HEADERS = "responseHeaders";
  @SerializedName(SERIALIZED_NAME_RESPONSE_HEADERS)
  private String responseHeaders;

  public HttpTestResultHeaders() {
  }

  
  public HttpTestResultHeaders(
     String requestHeaders, 
     String responseHeaders
  ) {
    this();
    this.requestHeaders = requestHeaders;
    this.responseHeaders = responseHeaders;
  }

   /**
   * CRLF-delimited list of request headers in &#x60;header: value&#x60; format.
   * @return requestHeaders
  **/
  @javax.annotation.Nullable
  public String getRequestHeaders() {
    return requestHeaders;
  }




   /**
   * CRLF-delimited list of response headers in &#x60;header: value&#x60; format.
   * @return responseHeaders
  **/
  @javax.annotation.Nullable
  public String getResponseHeaders() {
    return responseHeaders;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpTestResultHeaders httpTestResultHeaders = (HttpTestResultHeaders) o;
    return Objects.equals(this.requestHeaders, httpTestResultHeaders.requestHeaders) &&
        Objects.equals(this.responseHeaders, httpTestResultHeaders.responseHeaders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestHeaders, responseHeaders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpTestResultHeaders {\n");
    sb.append("    requestHeaders: ").append(toIndentedString(requestHeaders)).append("\n");
    sb.append("    responseHeaders: ").append(toIndentedString(responseHeaders)).append("\n");
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
    openapiFields.add("requestHeaders");
    openapiFields.add("responseHeaders");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to HttpTestResultHeaders
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HttpTestResultHeaders.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HttpTestResultHeaders is not found in the empty JSON string", HttpTestResultHeaders.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HttpTestResultHeaders.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HttpTestResultHeaders` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("requestHeaders") != null && !jsonObj.get("requestHeaders").isJsonNull()) && !jsonObj.get("requestHeaders").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestHeaders` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestHeaders").toString()));
      }
      if ((jsonObj.get("responseHeaders") != null && !jsonObj.get("responseHeaders").isJsonNull()) && !jsonObj.get("responseHeaders").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `responseHeaders` to be a primitive type in the JSON string but got `%s`", jsonObj.get("responseHeaders").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HttpTestResultHeaders.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HttpTestResultHeaders' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HttpTestResultHeaders> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HttpTestResultHeaders.class));

       return (TypeAdapter<T>) new TypeAdapter<HttpTestResultHeaders>() {
           @Override
           public void write(JsonWriter out, HttpTestResultHeaders value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HttpTestResultHeaders read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HttpTestResultHeaders given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HttpTestResultHeaders
  * @throws IOException if the JSON string is invalid with respect to HttpTestResultHeaders
  */
  public static HttpTestResultHeaders fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HttpTestResultHeaders.class);
  }

 /**
  * Convert an instance of HttpTestResultHeaders to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

