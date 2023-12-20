/*
 * Tags API
 * The ThousandEyes Tags API provides a tagging system with key/value pairs. It allows you to tag assets within the ThousandEyes platform (such as agents, tests, or alert rules) with meaningful metadata. For example: `branch:sfo`, `branch:nyc`, and `team:netops`.  This feature allows for: * Better support for automation. * Powerful and flexible reports/dashboards. * Support for third-party integrations.  Things to note with the ThousandEyes Tags API: * Tags are backwards-compatible with existing labels. * Tags are separated by Tests (CEA), Agents (CEA), Endpoint Agents, Scheduled Endpoint Tests, and Reports. A single tag can only apply to one type of target object, so each tag must specify the target type of object via a `type` field. * Tags are defined in a single table so that they can be represented using a single model - `Tag`.     
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.tags.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.tags.model.Tag;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
 * TagBulkCreateError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T14:43:28.407560Z[Europe/Lisbon]")
public class TagBulkCreateError {
  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private Map<String, Tag> tag = new HashMap<>();

  public static final String SERIALIZED_NAME_RESPONSE_CODE = "responseCode";
  @SerializedName(SERIALIZED_NAME_RESPONSE_CODE)
  private Integer responseCode;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public TagBulkCreateError() {
  }

  public TagBulkCreateError tag(Map<String, Tag> tag) {
    
    this.tag = tag;
    return this;
  }

  public TagBulkCreateError putTagItem(String key, Tag tagItem) {
    if (this.tag == null) {
      this.tag = new HashMap<>();
    }
    this.tag.put(key, tagItem);
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @javax.annotation.Nullable
  public Map<String, Tag> getTag() {
    return tag;
  }


  public void setTag(Map<String, Tag> tag) {
    this.tag = tag;
  }


  public TagBulkCreateError responseCode(Integer responseCode) {
    
    this.responseCode = responseCode;
    return this;
  }

   /**
   * HTTP response code
   * @return responseCode
  **/
  @javax.annotation.Nullable
  public Integer getResponseCode() {
    return responseCode;
  }


  public void setResponseCode(Integer responseCode) {
    this.responseCode = responseCode;
  }


  public TagBulkCreateError message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Status / error message
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagBulkCreateError tagBulkCreateError = (TagBulkCreateError) o;
    return Objects.equals(this.tag, tagBulkCreateError.tag) &&
        Objects.equals(this.responseCode, tagBulkCreateError.responseCode) &&
        Objects.equals(this.message, tagBulkCreateError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, responseCode, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagBulkCreateError {\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("tag");
    openapiFields.add("responseCode");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TagBulkCreateError
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TagBulkCreateError.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TagBulkCreateError is not found in the empty JSON string", TagBulkCreateError.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TagBulkCreateError.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TagBulkCreateError` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TagBulkCreateError.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TagBulkCreateError' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TagBulkCreateError> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TagBulkCreateError.class));

       return (TypeAdapter<T>) new TypeAdapter<TagBulkCreateError>() {
           @Override
           public void write(JsonWriter out, TagBulkCreateError value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TagBulkCreateError read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TagBulkCreateError given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TagBulkCreateError
  * @throws IOException if the JSON string is invalid with respect to TagBulkCreateError
  */
  public static TagBulkCreateError fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TagBulkCreateError.class);
  }

 /**
  * Convert an instance of TagBulkCreateError to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

