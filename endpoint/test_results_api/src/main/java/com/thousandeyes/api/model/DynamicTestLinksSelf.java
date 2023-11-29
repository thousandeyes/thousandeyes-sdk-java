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
 * DynamicTestLinksSelf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:17:40.551124Z[Europe/London]")
public class DynamicTestLinksSelf {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_TEMPLATED = "templated";
  @SerializedName(SERIALIZED_NAME_TEMPLATED)
  private Boolean templated;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_DEPRECATION = "deprecation";
  @SerializedName(SERIALIZED_NAME_DEPRECATION)
  private String deprecation;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROFILE = "profile";
  @SerializedName(SERIALIZED_NAME_PROFILE)
  private String profile;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_HREFLANG = "hreflang";
  @SerializedName(SERIALIZED_NAME_HREFLANG)
  private String hreflang;

  public DynamicTestLinksSelf() {
  }

  public DynamicTestLinksSelf href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * Its value is either a URI [RFC3986] or a URI template [RFC6570].
   * @return href
  **/
  @javax.annotation.Nonnull
  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    this.href = href;
  }


  public DynamicTestLinksSelf templated(Boolean templated) {
    
    this.templated = templated;
    return this;
  }

   /**
   * Should be true when the link object&#39;s \&quot;href\&quot; property is a URI template.
   * @return templated
  **/
  @javax.annotation.Nullable
  public Boolean getTemplated() {
    return templated;
  }


  public void setTemplated(Boolean templated) {
    this.templated = templated;
  }


  public DynamicTestLinksSelf type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Used as a hint to indicate the media type expected when dereferencing the target resource.
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public DynamicTestLinksSelf deprecation(String deprecation) {
    
    this.deprecation = deprecation;
    return this;
  }

   /**
   * Its presence indicates that the link is to be deprecated at a future date. Its value is a URL that should provide further information about the deprecation.
   * @return deprecation
  **/
  @javax.annotation.Nullable
  public String getDeprecation() {
    return deprecation;
  }


  public void setDeprecation(String deprecation) {
    this.deprecation = deprecation;
  }


  public DynamicTestLinksSelf name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Its value may be used as a secondary key for selecting link objects that share the same relation type.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DynamicTestLinksSelf profile(String profile) {
    
    this.profile = profile;
    return this;
  }

   /**
   * A URI that hints about the profile of the target resource.
   * @return profile
  **/
  @javax.annotation.Nullable
  public String getProfile() {
    return profile;
  }


  public void setProfile(String profile) {
    this.profile = profile;
  }


  public DynamicTestLinksSelf title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Intended for labelling the link with a human-readable identifier
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public DynamicTestLinksSelf hreflang(String hreflang) {
    
    this.hreflang = hreflang;
    return this;
  }

   /**
   * Indicates the language of the target resource
   * @return hreflang
  **/
  @javax.annotation.Nullable
  public String getHreflang() {
    return hreflang;
  }


  public void setHreflang(String hreflang) {
    this.hreflang = hreflang;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicTestLinksSelf dynamicTestLinksSelf = (DynamicTestLinksSelf) o;
    return Objects.equals(this.href, dynamicTestLinksSelf.href) &&
        Objects.equals(this.templated, dynamicTestLinksSelf.templated) &&
        Objects.equals(this.type, dynamicTestLinksSelf.type) &&
        Objects.equals(this.deprecation, dynamicTestLinksSelf.deprecation) &&
        Objects.equals(this.name, dynamicTestLinksSelf.name) &&
        Objects.equals(this.profile, dynamicTestLinksSelf.profile) &&
        Objects.equals(this.title, dynamicTestLinksSelf.title) &&
        Objects.equals(this.hreflang, dynamicTestLinksSelf.hreflang);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, templated, type, deprecation, name, profile, title, hreflang);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicTestLinksSelf {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    templated: ").append(toIndentedString(templated)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    deprecation: ").append(toIndentedString(deprecation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    hreflang: ").append(toIndentedString(hreflang)).append("\n");
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
    openapiFields.add("href");
    openapiFields.add("templated");
    openapiFields.add("type");
    openapiFields.add("deprecation");
    openapiFields.add("name");
    openapiFields.add("profile");
    openapiFields.add("title");
    openapiFields.add("hreflang");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("href");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DynamicTestLinksSelf
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DynamicTestLinksSelf.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DynamicTestLinksSelf is not found in the empty JSON string", DynamicTestLinksSelf.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DynamicTestLinksSelf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DynamicTestLinksSelf` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DynamicTestLinksSelf.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("deprecation") != null && !jsonObj.get("deprecation").isJsonNull()) && !jsonObj.get("deprecation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deprecation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deprecation").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("profile") != null && !jsonObj.get("profile").isJsonNull()) && !jsonObj.get("profile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profile").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("hreflang") != null && !jsonObj.get("hreflang").isJsonNull()) && !jsonObj.get("hreflang").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hreflang` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hreflang").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DynamicTestLinksSelf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DynamicTestLinksSelf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DynamicTestLinksSelf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DynamicTestLinksSelf.class));

       return (TypeAdapter<T>) new TypeAdapter<DynamicTestLinksSelf>() {
           @Override
           public void write(JsonWriter out, DynamicTestLinksSelf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DynamicTestLinksSelf read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DynamicTestLinksSelf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DynamicTestLinksSelf
  * @throws IOException if the JSON string is invalid with respect to DynamicTestLinksSelf
  */
  public static DynamicTestLinksSelf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DynamicTestLinksSelf.class);
  }

 /**
  * Convert an instance of DynamicTestLinksSelf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

