/*
 * Administrative API
 * ## Overview Manage users, accounts, and account groups in the ThousandEyes platform using the Administrative API.  This API provides the following endpoints that define the operations to manage your organization:     * `/account-groups`: Account groups are used to divide an organization into different sections. These endpoints can be used to create, retrieve, update and delete account groups.   * `/users`: Create, retrieve, update and delete users within an organization.    * `/roles`: Create, retrieve and update roles for the current user.    * `/permissions`: Retrieve all assignable permissions. Used in the context of modifying roles.    * `/audit-user-events`: Retrieve all activity log events.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.administrative.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.administrative.model.UserEvent;
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
 * UserEvents
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T12:44:58.735345Z[Europe/Lisbon]")
public class UserEvents {
  public static final String SERIALIZED_NAME_AUDIT_EVENTS = "auditEvents";
  @SerializedName(SERIALIZED_NAME_AUDIT_EVENTS)
  private List<UserEvent> auditEvents;

  public UserEvents() {
  }

  public UserEvents auditEvents(List<UserEvent> auditEvents) {
    
    this.auditEvents = auditEvents;
    return this;
  }

  public UserEvents addAuditEventsItem(UserEvent auditEventsItem) {
    if (this.auditEvents == null) {
      this.auditEvents = new ArrayList<>();
    }
    this.auditEvents.add(auditEventsItem);
    return this;
  }

   /**
   * Get auditEvents
   * @return auditEvents
  **/
  @javax.annotation.Nullable
  public List<UserEvent> getAuditEvents() {
    return auditEvents;
  }


  public void setAuditEvents(List<UserEvent> auditEvents) {
    this.auditEvents = auditEvents;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserEvents userEvents = (UserEvents) o;
    return Objects.equals(this.auditEvents, userEvents.auditEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditEvents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserEvents {\n");
    sb.append("    auditEvents: ").append(toIndentedString(auditEvents)).append("\n");
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
    openapiFields.add("auditEvents");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UserEvents
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserEvents.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserEvents is not found in the empty JSON string", UserEvents.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserEvents.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserEvents` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("auditEvents") != null && !jsonObj.get("auditEvents").isJsonNull()) {
        JsonArray jsonArrayauditEvents = jsonObj.getAsJsonArray("auditEvents");
        if (jsonArrayauditEvents != null) {
          // ensure the json data is an array
          if (!jsonObj.get("auditEvents").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `auditEvents` to be an array in the JSON string but got `%s`", jsonObj.get("auditEvents").toString()));
          }

          // validate the optional field `auditEvents` (array)
          for (int i = 0; i < jsonArrayauditEvents.size(); i++) {
            UserEvent.validateJsonElement(jsonArrayauditEvents.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserEvents.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserEvents' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserEvents> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserEvents.class));

       return (TypeAdapter<T>) new TypeAdapter<UserEvents>() {
           @Override
           public void write(JsonWriter out, UserEvents value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserEvents read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserEvents given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserEvents
  * @throws IOException if the JSON string is invalid with respect to UserEvents
  */
  public static UserEvents fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserEvents.class);
  }

 /**
  * Convert an instance of UserEvents to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

