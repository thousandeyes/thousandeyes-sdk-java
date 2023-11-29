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
import com.thousandeyes.api.model.AlertEmail;
import com.thousandeyes.api.model.AlertIntegrationBase;
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

import com.thousandeyes.JSON;

/**
 * Alert notification object.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:17:26.714202Z[Europe/London]")
public class Notification {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private AlertEmail email;

  public static final String SERIALIZED_NAME_THIRD_PARTY = "thirdParty";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY)
  private List<AlertIntegrationBase> thirdParty;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private List<AlertIntegrationBase> webhook;

  public Notification() {
  }

  public Notification email(AlertEmail email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  public AlertEmail getEmail() {
    return email;
  }


  public void setEmail(AlertEmail email) {
    this.email = email;
  }


  public Notification thirdParty(List<AlertIntegrationBase> thirdParty) {
    
    this.thirdParty = thirdParty;
    return this;
  }

  public Notification addThirdPartyItem(AlertIntegrationBase thirdPartyItem) {
    if (this.thirdParty == null) {
      this.thirdParty = new ArrayList<>();
    }
    this.thirdParty.add(thirdPartyItem);
    return this;
  }

   /**
   * Get thirdParty
   * @return thirdParty
  **/
  @javax.annotation.Nullable
  public List<AlertIntegrationBase> getThirdParty() {
    return thirdParty;
  }


  public void setThirdParty(List<AlertIntegrationBase> thirdParty) {
    this.thirdParty = thirdParty;
  }


  public Notification webhook(List<AlertIntegrationBase> webhook) {
    
    this.webhook = webhook;
    return this;
  }

  public Notification addWebhookItem(AlertIntegrationBase webhookItem) {
    if (this.webhook == null) {
      this.webhook = new ArrayList<>();
    }
    this.webhook.add(webhookItem);
    return this;
  }

   /**
   * Get webhook
   * @return webhook
  **/
  @javax.annotation.Nullable
  public List<AlertIntegrationBase> getWebhook() {
    return webhook;
  }


  public void setWebhook(List<AlertIntegrationBase> webhook) {
    this.webhook = webhook;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notification notification = (Notification) o;
    return Objects.equals(this.email, notification.email) &&
        Objects.equals(this.thirdParty, notification.thirdParty) &&
        Objects.equals(this.webhook, notification.webhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, thirdParty, webhook);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notification {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    thirdParty: ").append(toIndentedString(thirdParty)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("thirdParty");
    openapiFields.add("webhook");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Notification
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Notification.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Notification is not found in the empty JSON string", Notification.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Notification.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Notification` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `email`
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) {
        AlertEmail.validateJsonElement(jsonObj.get("email"));
      }
      if (jsonObj.get("thirdParty") != null && !jsonObj.get("thirdParty").isJsonNull()) {
        JsonArray jsonArraythirdParty = jsonObj.getAsJsonArray("thirdParty");
        if (jsonArraythirdParty != null) {
          // ensure the json data is an array
          if (!jsonObj.get("thirdParty").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `thirdParty` to be an array in the JSON string but got `%s`", jsonObj.get("thirdParty").toString()));
          }

          // validate the optional field `thirdParty` (array)
          for (int i = 0; i < jsonArraythirdParty.size(); i++) {
            AlertIntegrationBase.validateJsonElement(jsonArraythirdParty.get(i));
          };
        }
      }
      if (jsonObj.get("webhook") != null && !jsonObj.get("webhook").isJsonNull()) {
        JsonArray jsonArraywebhook = jsonObj.getAsJsonArray("webhook");
        if (jsonArraywebhook != null) {
          // ensure the json data is an array
          if (!jsonObj.get("webhook").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `webhook` to be an array in the JSON string but got `%s`", jsonObj.get("webhook").toString()));
          }

          // validate the optional field `webhook` (array)
          for (int i = 0; i < jsonArraywebhook.size(); i++) {
            AlertIntegrationBase.validateJsonElement(jsonArraywebhook.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Notification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Notification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Notification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Notification.class));

       return (TypeAdapter<T>) new TypeAdapter<Notification>() {
           @Override
           public void write(JsonWriter out, Notification value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Notification read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Notification given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Notification
  * @throws IOException if the JSON string is invalid with respect to Notification
  */
  public static Notification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Notification.class);
  }

 /**
  * Convert an instance of Notification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

