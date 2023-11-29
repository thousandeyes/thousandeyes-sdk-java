/*
 * Agents API
 *  ## Overview Manage all agents available to your account in ThousandEyes, including both Cloud and Enterprise Agents.
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
 * AccountGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:17:26.714202Z[Europe/London]")
public class AccountGroup {
  public static final String SERIALIZED_NAME_AID = "aid";
  @SerializedName(SERIALIZED_NAME_AID)
  private String aid;

  public static final String SERIALIZED_NAME_ACCOUNT_GROUP_NAME = "accountGroupName";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_GROUP_NAME)
  private String accountGroupName;

  public AccountGroup() {
  }

  public AccountGroup aid(String aid) {
    
    this.aid = aid;
    return this;
  }

   /**
   * A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint.
   * @return aid
  **/
  @javax.annotation.Nullable
  public String getAid() {
    return aid;
  }


  public void setAid(String aid) {
    this.aid = aid;
  }


  public AccountGroup accountGroupName(String accountGroupName) {
    
    this.accountGroupName = accountGroupName;
    return this;
  }

   /**
   * Account group name
   * @return accountGroupName
  **/
  @javax.annotation.Nullable
  public String getAccountGroupName() {
    return accountGroupName;
  }


  public void setAccountGroupName(String accountGroupName) {
    this.accountGroupName = accountGroupName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountGroup accountGroup = (AccountGroup) o;
    return Objects.equals(this.aid, accountGroup.aid) &&
        Objects.equals(this.accountGroupName, accountGroup.accountGroupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aid, accountGroupName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountGroup {\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    accountGroupName: ").append(toIndentedString(accountGroupName)).append("\n");
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
    openapiFields.add("aid");
    openapiFields.add("accountGroupName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccountGroup
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccountGroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountGroup is not found in the empty JSON string", AccountGroup.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccountGroup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountGroup` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("aid") != null && !jsonObj.get("aid").isJsonNull()) && !jsonObj.get("aid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aid").toString()));
      }
      if ((jsonObj.get("accountGroupName") != null && !jsonObj.get("accountGroupName").isJsonNull()) && !jsonObj.get("accountGroupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountGroupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountGroupName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountGroup>() {
           @Override
           public void write(JsonWriter out, AccountGroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountGroup read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccountGroup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountGroup
  * @throws IOException if the JSON string is invalid with respect to AccountGroup
  */
  public static AccountGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountGroup.class);
  }

 /**
  * Convert an instance of AccountGroup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

