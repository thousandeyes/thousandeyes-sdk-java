/*
 * Test Snapshots API
 * Creates a new test snapshot in ThousandEyes
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.snapshots.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.snapshots.model.TestType;
import com.thousandeyes.api.snapshots.model.UnexpandedInstantTestLinks;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * UnexpandedInstantTest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-18T17:52:52.849573Z[Europe/Lisbon]")
public class UnexpandedInstantTest {
  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LIVE_SHARE = "liveShare";
  @SerializedName(SERIALIZED_NAME_LIVE_SHARE)
  private Boolean liveShare;

  public static final String SERIALIZED_NAME_MODIFIED_BY = "modifiedBy";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY)
  private String modifiedBy;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private OffsetDateTime modifiedDate;

  public static final String SERIALIZED_NAME_SAVED_EVENT = "savedEvent";
  @SerializedName(SERIALIZED_NAME_SAVED_EVENT)
  private Boolean savedEvent;

  public static final String SERIALIZED_NAME_TEST_ID = "testId";
  @SerializedName(SERIALIZED_NAME_TEST_ID)
  private String testId;

  public static final String SERIALIZED_NAME_TEST_NAME = "testName";
  @SerializedName(SERIALIZED_NAME_TEST_NAME)
  private String testName;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TestType type;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private UnexpandedInstantTestLinks links;

  public UnexpandedInstantTest() {
  }

  
  public UnexpandedInstantTest(
     String createdBy, 
     OffsetDateTime createdDate, 
     Boolean liveShare, 
     String modifiedBy, 
     OffsetDateTime modifiedDate, 
     Boolean savedEvent, 
     String testId
  ) {
    this();
    this.createdBy = createdBy;
    this.createdDate = createdDate;
    this.liveShare = liveShare;
    this.modifiedBy = modifiedBy;
    this.modifiedDate = modifiedDate;
    this.savedEvent = savedEvent;
    this.testId = testId;
  }

   /**
   * User that created the test.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  public String getCreatedBy() {
    return createdBy;
  }




   /**
   * UTC created date (ISO date-time format).
   * @return createdDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }




  public UnexpandedInstantTest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description of the test.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


   /**
   * Indicates if the test is shared with the account group.
   * @return liveShare
  **/
  @javax.annotation.Nullable
  public Boolean getLiveShare() {
    return liveShare;
  }




   /**
   * User that modified the test.
   * @return modifiedBy
  **/
  @javax.annotation.Nullable
  public String getModifiedBy() {
    return modifiedBy;
  }




   /**
   * UTC last modification date (ISO date-time format).
   * @return modifiedDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }




   /**
   * Indicates if the test is a saved event.
   * @return savedEvent
  **/
  @javax.annotation.Nullable
  public Boolean getSavedEvent() {
    return savedEvent;
  }




   /**
   * Each test is assigned an unique ID; this is used to access test information and results from other endpoints.
   * @return testId
  **/
  @javax.annotation.Nullable
  public String getTestId() {
    return testId;
  }




  public UnexpandedInstantTest testName(String testName) {
    
    this.testName = testName;
    return this;
  }

   /**
   * The name of the test. Test name must be unique.
   * @return testName
  **/
  @javax.annotation.Nullable
  public String getTestName() {
    return testName;
  }


  public void setTestName(String testName) {
    this.testName = testName;
  }


  public UnexpandedInstantTest type(TestType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public TestType getType() {
    return type;
  }


  public void setType(TestType type) {
    this.type = type;
  }


  public UnexpandedInstantTest links(UnexpandedInstantTestLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public UnexpandedInstantTestLinks getLinks() {
    return links;
  }


  public void setLinks(UnexpandedInstantTestLinks links) {
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
    UnexpandedInstantTest unexpandedInstantTest = (UnexpandedInstantTest) o;
    return Objects.equals(this.createdBy, unexpandedInstantTest.createdBy) &&
        Objects.equals(this.createdDate, unexpandedInstantTest.createdDate) &&
        Objects.equals(this.description, unexpandedInstantTest.description) &&
        Objects.equals(this.liveShare, unexpandedInstantTest.liveShare) &&
        Objects.equals(this.modifiedBy, unexpandedInstantTest.modifiedBy) &&
        Objects.equals(this.modifiedDate, unexpandedInstantTest.modifiedDate) &&
        Objects.equals(this.savedEvent, unexpandedInstantTest.savedEvent) &&
        Objects.equals(this.testId, unexpandedInstantTest.testId) &&
        Objects.equals(this.testName, unexpandedInstantTest.testName) &&
        Objects.equals(this.type, unexpandedInstantTest.type) &&
        Objects.equals(this.links, unexpandedInstantTest.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdDate, description, liveShare, modifiedBy, modifiedDate, savedEvent, testId, testName, type, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnexpandedInstantTest {\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    liveShare: ").append(toIndentedString(liveShare)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    savedEvent: ").append(toIndentedString(savedEvent)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("createdBy");
    openapiFields.add("createdDate");
    openapiFields.add("description");
    openapiFields.add("liveShare");
    openapiFields.add("modifiedBy");
    openapiFields.add("modifiedDate");
    openapiFields.add("savedEvent");
    openapiFields.add("testId");
    openapiFields.add("testName");
    openapiFields.add("type");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UnexpandedInstantTest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UnexpandedInstantTest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UnexpandedInstantTest is not found in the empty JSON string", UnexpandedInstantTest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UnexpandedInstantTest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UnexpandedInstantTest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("createdBy") != null && !jsonObj.get("createdBy").isJsonNull()) && !jsonObj.get("createdBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdBy").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("modifiedBy") != null && !jsonObj.get("modifiedBy").isJsonNull()) && !jsonObj.get("modifiedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedBy").toString()));
      }
      if ((jsonObj.get("testId") != null && !jsonObj.get("testId").isJsonNull()) && !jsonObj.get("testId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testId").toString()));
      }
      if ((jsonObj.get("testName") != null && !jsonObj.get("testName").isJsonNull()) && !jsonObj.get("testName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testName").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TestType.validateJsonElement(jsonObj.get("type"));
      }
      // validate the optional field `_links`
      if (jsonObj.get("_links") != null && !jsonObj.get("_links").isJsonNull()) {
        UnexpandedInstantTestLinks.validateJsonElement(jsonObj.get("_links"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UnexpandedInstantTest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UnexpandedInstantTest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UnexpandedInstantTest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UnexpandedInstantTest.class));

       return (TypeAdapter<T>) new TypeAdapter<UnexpandedInstantTest>() {
           @Override
           public void write(JsonWriter out, UnexpandedInstantTest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UnexpandedInstantTest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UnexpandedInstantTest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UnexpandedInstantTest
  * @throws IOException if the JSON string is invalid with respect to UnexpandedInstantTest
  */
  public static UnexpandedInstantTest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UnexpandedInstantTest.class);
  }

 /**
  * Convert an instance of UnexpandedInstantTest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

