/*
 * ThousandEyes for OpenTelemetry API
 *  Configure ThousandEyes to stream or push test data to a OpenTelemetry compliant endpoint with the ThousandEyes for OpenTelemetry API. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.streaming.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
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
 * BadRequestError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T12:21:01.156542Z[Europe/Lisbon]")
public class BadRequestError {
  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Long timestamp;

  public static final String SERIALIZED_NAME_HTTP_STATUS = "httpStatus";
  @SerializedName(SERIALIZED_NAME_HTTP_STATUS)
  private String httpStatus;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<String> errors;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public BadRequestError() {
  }

  public BadRequestError timestamp(Long timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @javax.annotation.Nullable
  public Long getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  public BadRequestError httpStatus(String httpStatus) {
    
    this.httpStatus = httpStatus;
    return this;
  }

   /**
   * Get httpStatus
   * @return httpStatus
  **/
  @javax.annotation.Nullable
  public String getHttpStatus() {
    return httpStatus;
  }


  public void setHttpStatus(String httpStatus) {
    this.httpStatus = httpStatus;
  }


  public BadRequestError errors(List<String> errors) {
    
    this.errors = errors;
    return this;
  }

  public BadRequestError addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  public List<String> getErrors() {
    return errors;
  }


  public void setErrors(List<String> errors) {
    this.errors = errors;
  }


  public BadRequestError path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @javax.annotation.Nullable
  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BadRequestError badRequestError = (BadRequestError) o;
    return Objects.equals(this.timestamp, badRequestError.timestamp) &&
        Objects.equals(this.httpStatus, badRequestError.httpStatus) &&
        Objects.equals(this.errors, badRequestError.errors) &&
        Objects.equals(this.path, badRequestError.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, httpStatus, errors, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BadRequestError {\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    httpStatus: ").append(toIndentedString(httpStatus)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
    openapiFields.add("timestamp");
    openapiFields.add("httpStatus");
    openapiFields.add("errors");
    openapiFields.add("path");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BadRequestError
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BadRequestError.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BadRequestError is not found in the empty JSON string", BadRequestError.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BadRequestError.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BadRequestError` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("httpStatus") != null && !jsonObj.get("httpStatus").isJsonNull()) && !jsonObj.get("httpStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `httpStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("httpStatus").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonNull() && !jsonObj.get("errors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
      }
      if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull()) && !jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BadRequestError.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BadRequestError' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BadRequestError> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BadRequestError.class));

       return (TypeAdapter<T>) new TypeAdapter<BadRequestError>() {
           @Override
           public void write(JsonWriter out, BadRequestError value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BadRequestError read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BadRequestError given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BadRequestError
  * @throws IOException if the JSON string is invalid with respect to BadRequestError
  */
  public static BadRequestError fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BadRequestError.class);
  }

 /**
  * Convert an instance of BadRequestError to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

