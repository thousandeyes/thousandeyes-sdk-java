/*
 * Test Templates API
 *  ## Overview  Test templates allow you create a set of tests, alert rules, dashboards, and labels from a single template configuration file.    The following applies to test templates:  * You can create tests for monitoring common services and applications such as Microsoft 365, Webex, and others using a predefined set of certified templates.  * Test templates reduce the time and complexity of creating tests for common SaaS or other services by providing a set of templates for creating tests, alert rules, and other assets within the ThousandEyes platform.  * Templates created with an account group in a particular organization are visible to all account groups in that organization, provided they have the `View Test Templates` permission.  * Credentials (usernames, passwords, tokens, etc.) can be included in a test template only as placeholders whose value is provided by user input when the template is deployed. Creating or updating a test template that contains a credentials field in plain text will result in a bad request (HTTP 400).  * The schemas to use for `labels`, `tests`, `alertRules` and `dashboards` are defined at https://developer.thousandeyes.com/v7/.  * To support referencing an asset from another asset of a different type (for example, defining the `testId` field of an `alertRule` by referencing the ID of a test defined in the template itself), the deployment of assets is done in a specific order:      1. Labels     2. Tests     3. Alert rules     4. Dashboards      For a given asset type, you can reference any asset type with a higher order. (For example, labels cannot reference other assets in the template; tests can only reference labels; alert rules can reference tests and labels, etc.)
 *
 * The version of the OpenAPI document: 7.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.testtemplates.model;

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

import com.thousandeyes.api.JSON;

/**
 * Link
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-18T17:52:53.416039Z[Europe/Lisbon]")
public class Link {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_HREFLANG = "hreflang";
  @SerializedName(SERIALIZED_NAME_HREFLANG)
  private String hreflang;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_DEPRECATION = "deprecation";
  @SerializedName(SERIALIZED_NAME_DEPRECATION)
  private String deprecation;

  public static final String SERIALIZED_NAME_PROFILE = "profile";
  @SerializedName(SERIALIZED_NAME_PROFILE)
  private String profile;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TEMPLATED = "templated";
  @SerializedName(SERIALIZED_NAME_TEMPLATED)
  private Boolean templated;

  public Link() {
  }

  public Link href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @javax.annotation.Nullable
  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    this.href = href;
  }


  public Link hreflang(String hreflang) {
    
    this.hreflang = hreflang;
    return this;
  }

   /**
   * Get hreflang
   * @return hreflang
  **/
  @javax.annotation.Nullable
  public String getHreflang() {
    return hreflang;
  }


  public void setHreflang(String hreflang) {
    this.hreflang = hreflang;
  }


  public Link title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public Link type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Link deprecation(String deprecation) {
    
    this.deprecation = deprecation;
    return this;
  }

   /**
   * Get deprecation
   * @return deprecation
  **/
  @javax.annotation.Nullable
  public String getDeprecation() {
    return deprecation;
  }


  public void setDeprecation(String deprecation) {
    this.deprecation = deprecation;
  }


  public Link profile(String profile) {
    
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @javax.annotation.Nullable
  public String getProfile() {
    return profile;
  }


  public void setProfile(String profile) {
    this.profile = profile;
  }


  public Link name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Link templated(Boolean templated) {
    
    this.templated = templated;
    return this;
  }

   /**
   * Get templated
   * @return templated
  **/
  @javax.annotation.Nullable
  public Boolean getTemplated() {
    return templated;
  }


  public void setTemplated(Boolean templated) {
    this.templated = templated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Link link = (Link) o;
    return Objects.equals(this.href, link.href) &&
        Objects.equals(this.hreflang, link.hreflang) &&
        Objects.equals(this.title, link.title) &&
        Objects.equals(this.type, link.type) &&
        Objects.equals(this.deprecation, link.deprecation) &&
        Objects.equals(this.profile, link.profile) &&
        Objects.equals(this.name, link.name) &&
        Objects.equals(this.templated, link.templated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, hreflang, title, type, deprecation, profile, name, templated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Link {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    hreflang: ").append(toIndentedString(hreflang)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    deprecation: ").append(toIndentedString(deprecation)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    templated: ").append(toIndentedString(templated)).append("\n");
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
    openapiFields.add("hreflang");
    openapiFields.add("title");
    openapiFields.add("type");
    openapiFields.add("deprecation");
    openapiFields.add("profile");
    openapiFields.add("name");
    openapiFields.add("templated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Link
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Link.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Link is not found in the empty JSON string", Link.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Link.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Link` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if ((jsonObj.get("hreflang") != null && !jsonObj.get("hreflang").isJsonNull()) && !jsonObj.get("hreflang").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hreflang` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hreflang").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("deprecation") != null && !jsonObj.get("deprecation").isJsonNull()) && !jsonObj.get("deprecation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deprecation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deprecation").toString()));
      }
      if ((jsonObj.get("profile") != null && !jsonObj.get("profile").isJsonNull()) && !jsonObj.get("profile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profile").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Link.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Link' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Link> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Link.class));

       return (TypeAdapter<T>) new TypeAdapter<Link>() {
           @Override
           public void write(JsonWriter out, Link value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Link read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Link given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Link
  * @throws IOException if the JSON string is invalid with respect to Link
  */
  public static Link fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Link.class);
  }

 /**
  * Convert an instance of Link to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

