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


package com.thousandeyes.api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.model.SnapshotResponseAllOfTest;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * SnapshotResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:17:33.108331Z[Europe/London]")
public class SnapshotResponse {
  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Object links = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_START_ROUND_ID = "startRoundId";
  @SerializedName(SERIALIZED_NAME_START_ROUND_ID)
  private Integer startRoundId;

  public static final String SERIALIZED_NAME_END_ROUND_ID = "endRoundId";
  @SerializedName(SERIALIZED_NAME_END_ROUND_ID)
  private Integer endRoundId;

  public static final String SERIALIZED_NAME_ROUND_ID = "roundId";
  @SerializedName(SERIALIZED_NAME_ROUND_ID)
  private Integer roundId;

  public static final String SERIALIZED_NAME_SHARE_DATE = "shareDate";
  @SerializedName(SERIALIZED_NAME_SHARE_DATE)
  private OffsetDateTime shareDate;

  public static final String SERIALIZED_NAME_SOURCE_TEST_ID = "sourceTestId";
  @SerializedName(SERIALIZED_NAME_SOURCE_TEST_ID)
  private String sourceTestId;

  public static final String SERIALIZED_NAME_TEST_ID = "testId";
  @SerializedName(SERIALIZED_NAME_TEST_ID)
  private String testId;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_EXTRA_PARAMS = "extraParams";
  @SerializedName(SERIALIZED_NAME_EXTRA_PARAMS)
  private String extraParams;

  public static final String SERIALIZED_NAME_TEST = "test";
  @SerializedName(SERIALIZED_NAME_TEST)
  private SnapshotResponseAllOfTest test;

  public SnapshotResponse() {
  }

  
  public SnapshotResponse(
     Integer startRoundId, 
     Integer endRoundId, 
     Integer roundId
  ) {
    this();
    this.startRoundId = startRoundId;
    this.endRoundId = endRoundId;
    this.roundId = roundId;
  }

  public SnapshotResponse links(Object links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public Object getLinks() {
    return links;
  }


  public void setLinks(Object links) {
    this.links = links;
  }


  public SnapshotResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Snapshot ID.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


   /**
   * The start time of the test snapshot, represented in epoch time format (in seconds).
   * @return startRoundId
  **/
  @javax.annotation.Nullable
  public Integer getStartRoundId() {
    return startRoundId;
  }




   /**
   * The end time of the test snapshot, represented in epoch time format (in seconds).
   * @return endRoundId
  **/
  @javax.annotation.Nullable
  public Integer getEndRoundId() {
    return endRoundId;
  }




   /**
   * The selected time of the test snapshot, represented in epoch time format (in seconds).
   * @return roundId
  **/
  @javax.annotation.Nullable
  public Integer getRoundId() {
    return roundId;
  }




  public SnapshotResponse shareDate(OffsetDateTime shareDate) {
    
    this.shareDate = shareDate;
    return this;
  }

   /**
   * The date when the test snapshot was created in UTC time, formatted in ISO date-time.
   * @return shareDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getShareDate() {
    return shareDate;
  }


  public void setShareDate(OffsetDateTime shareDate) {
    this.shareDate = shareDate;
  }


  public SnapshotResponse sourceTestId(String sourceTestId) {
    
    this.sourceTestId = sourceTestId;
    return this;
  }

   /**
   * Snapshot test ID.
   * @return sourceTestId
  **/
  @javax.annotation.Nullable
  public String getSourceTestId() {
    return sourceTestId;
  }


  public void setSourceTestId(String sourceTestId) {
    this.sourceTestId = sourceTestId;
  }


  public SnapshotResponse testId(String testId) {
    
    this.testId = testId;
    return this;
  }

   /**
   * Snapshot test ID.
   * @return testId
  **/
  @javax.annotation.Nullable
  public String getTestId() {
    return testId;
  }


  public void setTestId(String testId) {
    this.testId = testId;
  }


  public SnapshotResponse uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * User ID.
   * @return uid
  **/
  @javax.annotation.Nullable
  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }


  public SnapshotResponse displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Snapshot title.
   * @return displayName
  **/
  @javax.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public SnapshotResponse extraParams(String extraParams) {
    
    this.extraParams = extraParams;
    return this;
  }

   /**
   * Extra parameters.
   * @return extraParams
  **/
  @javax.annotation.Nullable
  public String getExtraParams() {
    return extraParams;
  }


  public void setExtraParams(String extraParams) {
    this.extraParams = extraParams;
  }


  public SnapshotResponse test(SnapshotResponseAllOfTest test) {
    
    this.test = test;
    return this;
  }

   /**
   * Get test
   * @return test
  **/
  @javax.annotation.Nullable
  public SnapshotResponseAllOfTest getTest() {
    return test;
  }


  public void setTest(SnapshotResponseAllOfTest test) {
    this.test = test;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotResponse snapshotResponse = (SnapshotResponse) o;
    return Objects.equals(this.links, snapshotResponse.links) &&
        Objects.equals(this.id, snapshotResponse.id) &&
        Objects.equals(this.startRoundId, snapshotResponse.startRoundId) &&
        Objects.equals(this.endRoundId, snapshotResponse.endRoundId) &&
        Objects.equals(this.roundId, snapshotResponse.roundId) &&
        Objects.equals(this.shareDate, snapshotResponse.shareDate) &&
        Objects.equals(this.sourceTestId, snapshotResponse.sourceTestId) &&
        Objects.equals(this.testId, snapshotResponse.testId) &&
        Objects.equals(this.uid, snapshotResponse.uid) &&
        Objects.equals(this.displayName, snapshotResponse.displayName) &&
        Objects.equals(this.extraParams, snapshotResponse.extraParams) &&
        Objects.equals(this.test, snapshotResponse.test);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, startRoundId, endRoundId, roundId, shareDate, sourceTestId, testId, uid, displayName, extraParams, test);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotResponse {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startRoundId: ").append(toIndentedString(startRoundId)).append("\n");
    sb.append("    endRoundId: ").append(toIndentedString(endRoundId)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    shareDate: ").append(toIndentedString(shareDate)).append("\n");
    sb.append("    sourceTestId: ").append(toIndentedString(sourceTestId)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    extraParams: ").append(toIndentedString(extraParams)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
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
    openapiFields.add("_links");
    openapiFields.add("id");
    openapiFields.add("startRoundId");
    openapiFields.add("endRoundId");
    openapiFields.add("roundId");
    openapiFields.add("shareDate");
    openapiFields.add("sourceTestId");
    openapiFields.add("testId");
    openapiFields.add("uid");
    openapiFields.add("displayName");
    openapiFields.add("extraParams");
    openapiFields.add("test");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SnapshotResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SnapshotResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SnapshotResponse is not found in the empty JSON string", SnapshotResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SnapshotResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SnapshotResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("sourceTestId") != null && !jsonObj.get("sourceTestId").isJsonNull()) && !jsonObj.get("sourceTestId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceTestId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceTestId").toString()));
      }
      if ((jsonObj.get("testId") != null && !jsonObj.get("testId").isJsonNull()) && !jsonObj.get("testId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testId").toString()));
      }
      if ((jsonObj.get("uid") != null && !jsonObj.get("uid").isJsonNull()) && !jsonObj.get("uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("extraParams") != null && !jsonObj.get("extraParams").isJsonNull()) && !jsonObj.get("extraParams").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extraParams` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extraParams").toString()));
      }
      // validate the optional field `test`
      if (jsonObj.get("test") != null && !jsonObj.get("test").isJsonNull()) {
        SnapshotResponseAllOfTest.validateJsonElement(jsonObj.get("test"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SnapshotResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SnapshotResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SnapshotResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SnapshotResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<SnapshotResponse>() {
           @Override
           public void write(JsonWriter out, SnapshotResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SnapshotResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SnapshotResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SnapshotResponse
  * @throws IOException if the JSON string is invalid with respect to SnapshotResponse
  */
  public static SnapshotResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SnapshotResponse.class);
  }

 /**
  * Convert an instance of SnapshotResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

