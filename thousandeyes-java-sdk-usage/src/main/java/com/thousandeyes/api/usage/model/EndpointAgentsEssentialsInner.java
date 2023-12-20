/*
 * Usage API
 * ## Overview These usage endpoints define the following operations: * **Usage**: Retrieve usage data for the specified time period (default is one month).          * Users must have the `View Billing` permission to access this endpoint.     * This endpoint offers visibility across all account groups within the organization.     * Users with `View Billing` permission in multiple organizations should query the endpoint with the `aid` query string parameter (see optional parameters) for each organization.  * **Quotas**: Obtain organization and account usage quotas. Additionally, users with the appropriate permissions can create, update, or delete these quotas.          * Users must have the necessary permissions to perform quota-related actions.  Refer to the API definitions below for detailed usage instructions and optional parameters.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.usage.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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

import com.thousandeyes.api.JSON;

/**
 * EndpointAgentsEssentialsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T12:21:03.693049Z[Europe/Lisbon]")
public class EndpointAgentsEssentialsInner {
  public static final String SERIALIZED_NAME_AID = "aid";
  @SerializedName(SERIALIZED_NAME_AID)
  private Object aid = null;

  public static final String SERIALIZED_NAME_ACCOUNT_GROUP_NAME = "accountGroupName";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_GROUP_NAME)
  private Object accountGroupName = null;

  public static final String SERIALIZED_NAME_ENDPOINT_AGENTS_ESSENTIALS_USED = "endpointAgentsEssentialsUsed";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_AGENTS_ESSENTIALS_USED)
  private Long endpointAgentsEssentialsUsed;

  public EndpointAgentsEssentialsInner() {
  }

  public EndpointAgentsEssentialsInner aid(Object aid) {
    
    this.aid = aid;
    return this;
  }

   /**
   * Unique identifier of the account group owning the endpoint agents essentials.
   * @return aid
  **/
  @javax.annotation.Nullable
  public Object getAid() {
    return aid;
  }


  public void setAid(Object aid) {
    this.aid = aid;
  }


  public EndpointAgentsEssentialsInner accountGroupName(Object accountGroupName) {
    
    this.accountGroupName = accountGroupName;
    return this;
  }

   /**
   * Name of the account group which owns the endpoint agents essentials.
   * @return accountGroupName
  **/
  @javax.annotation.Nullable
  public Object getAccountGroupName() {
    return accountGroupName;
  }


  public void setAccountGroupName(Object accountGroupName) {
    this.accountGroupName = accountGroupName;
  }


  public EndpointAgentsEssentialsInner endpointAgentsEssentialsUsed(Long endpointAgentsEssentialsUsed) {
    
    this.endpointAgentsEssentialsUsed = endpointAgentsEssentialsUsed;
    return this;
  }

   /**
   * Number of endpoint agents essentials owned by the specific account group in the usage period.
   * @return endpointAgentsEssentialsUsed
  **/
  @javax.annotation.Nullable
  public Long getEndpointAgentsEssentialsUsed() {
    return endpointAgentsEssentialsUsed;
  }


  public void setEndpointAgentsEssentialsUsed(Long endpointAgentsEssentialsUsed) {
    this.endpointAgentsEssentialsUsed = endpointAgentsEssentialsUsed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointAgentsEssentialsInner endpointAgentsEssentialsInner = (EndpointAgentsEssentialsInner) o;
    return Objects.equals(this.aid, endpointAgentsEssentialsInner.aid) &&
        Objects.equals(this.accountGroupName, endpointAgentsEssentialsInner.accountGroupName) &&
        Objects.equals(this.endpointAgentsEssentialsUsed, endpointAgentsEssentialsInner.endpointAgentsEssentialsUsed);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(aid, accountGroupName, endpointAgentsEssentialsUsed);
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
    sb.append("class EndpointAgentsEssentialsInner {\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    accountGroupName: ").append(toIndentedString(accountGroupName)).append("\n");
    sb.append("    endpointAgentsEssentialsUsed: ").append(toIndentedString(endpointAgentsEssentialsUsed)).append("\n");
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
    openapiFields.add("endpointAgentsEssentialsUsed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EndpointAgentsEssentialsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EndpointAgentsEssentialsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EndpointAgentsEssentialsInner is not found in the empty JSON string", EndpointAgentsEssentialsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EndpointAgentsEssentialsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EndpointAgentsEssentialsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EndpointAgentsEssentialsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EndpointAgentsEssentialsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EndpointAgentsEssentialsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EndpointAgentsEssentialsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EndpointAgentsEssentialsInner>() {
           @Override
           public void write(JsonWriter out, EndpointAgentsEssentialsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EndpointAgentsEssentialsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EndpointAgentsEssentialsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EndpointAgentsEssentialsInner
  * @throws IOException if the JSON string is invalid with respect to EndpointAgentsEssentialsInner
  */
  public static EndpointAgentsEssentialsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EndpointAgentsEssentialsInner.class);
  }

 /**
  * Convert an instance of EndpointAgentsEssentialsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

