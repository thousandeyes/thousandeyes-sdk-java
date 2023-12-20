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
import com.thousandeyes.api.administrative.model.AccountGroup1;
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
 * LoginAccountGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-18T17:52:53.269143Z[Europe/Lisbon]")
public class LoginAccountGroup {
  public static final String SERIALIZED_NAME_LOGIN_ACCOUNT_GROUP = "loginAccountGroup";
  @SerializedName(SERIALIZED_NAME_LOGIN_ACCOUNT_GROUP)
  private AccountGroup1 loginAccountGroup;

  public LoginAccountGroup() {
  }

  public LoginAccountGroup loginAccountGroup(AccountGroup1 loginAccountGroup) {
    
    this.loginAccountGroup = loginAccountGroup;
    return this;
  }

   /**
   * Get loginAccountGroup
   * @return loginAccountGroup
  **/
  @javax.annotation.Nullable
  public AccountGroup1 getLoginAccountGroup() {
    return loginAccountGroup;
  }


  public void setLoginAccountGroup(AccountGroup1 loginAccountGroup) {
    this.loginAccountGroup = loginAccountGroup;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginAccountGroup loginAccountGroup = (LoginAccountGroup) o;
    return Objects.equals(this.loginAccountGroup, loginAccountGroup.loginAccountGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loginAccountGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginAccountGroup {\n");
    sb.append("    loginAccountGroup: ").append(toIndentedString(loginAccountGroup)).append("\n");
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
    openapiFields.add("loginAccountGroup");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LoginAccountGroup
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LoginAccountGroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoginAccountGroup is not found in the empty JSON string", LoginAccountGroup.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LoginAccountGroup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LoginAccountGroup` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `loginAccountGroup`
      if (jsonObj.get("loginAccountGroup") != null && !jsonObj.get("loginAccountGroup").isJsonNull()) {
        AccountGroup1.validateJsonElement(jsonObj.get("loginAccountGroup"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoginAccountGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoginAccountGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoginAccountGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoginAccountGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<LoginAccountGroup>() {
           @Override
           public void write(JsonWriter out, LoginAccountGroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoginAccountGroup read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LoginAccountGroup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoginAccountGroup
  * @throws IOException if the JSON string is invalid with respect to LoginAccountGroup
  */
  public static LoginAccountGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoginAccountGroup.class);
  }

 /**
  * Convert an instance of LoginAccountGroup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

