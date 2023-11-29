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


package com.thousandeyes.api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.model.OrganizationsQuotasAssignOrganizationsInner;
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
 * OrganizationsQuotasAssign
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:17:44.752803Z[Europe/London]")
public class OrganizationsQuotasAssign {
  public static final String SERIALIZED_NAME_ORGANIZATIONS = "organizations";
  @SerializedName(SERIALIZED_NAME_ORGANIZATIONS)
  private List<OrganizationsQuotasAssignOrganizationsInner> organizations;

  public OrganizationsQuotasAssign() {
  }

  public OrganizationsQuotasAssign organizations(List<OrganizationsQuotasAssignOrganizationsInner> organizations) {
    
    this.organizations = organizations;
    return this;
  }

  public OrganizationsQuotasAssign addOrganizationsItem(OrganizationsQuotasAssignOrganizationsInner organizationsItem) {
    if (this.organizations == null) {
      this.organizations = new ArrayList<>();
    }
    this.organizations.add(organizationsItem);
    return this;
  }

   /**
   * Get organizations
   * @return organizations
  **/
  @javax.annotation.Nullable
  public List<OrganizationsQuotasAssignOrganizationsInner> getOrganizations() {
    return organizations;
  }


  public void setOrganizations(List<OrganizationsQuotasAssignOrganizationsInner> organizations) {
    this.organizations = organizations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationsQuotasAssign organizationsQuotasAssign = (OrganizationsQuotasAssign) o;
    return Objects.equals(this.organizations, organizationsQuotasAssign.organizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationsQuotasAssign {\n");
    sb.append("    organizations: ").append(toIndentedString(organizations)).append("\n");
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
    openapiFields.add("organizations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrganizationsQuotasAssign
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrganizationsQuotasAssign.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrganizationsQuotasAssign is not found in the empty JSON string", OrganizationsQuotasAssign.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrganizationsQuotasAssign.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrganizationsQuotasAssign` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("organizations") != null && !jsonObj.get("organizations").isJsonNull()) {
        JsonArray jsonArrayorganizations = jsonObj.getAsJsonArray("organizations");
        if (jsonArrayorganizations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("organizations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `organizations` to be an array in the JSON string but got `%s`", jsonObj.get("organizations").toString()));
          }

          // validate the optional field `organizations` (array)
          for (int i = 0; i < jsonArrayorganizations.size(); i++) {
            OrganizationsQuotasAssignOrganizationsInner.validateJsonElement(jsonArrayorganizations.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrganizationsQuotasAssign.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrganizationsQuotasAssign' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrganizationsQuotasAssign> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrganizationsQuotasAssign.class));

       return (TypeAdapter<T>) new TypeAdapter<OrganizationsQuotasAssign>() {
           @Override
           public void write(JsonWriter out, OrganizationsQuotasAssign value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrganizationsQuotasAssign read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrganizationsQuotasAssign given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrganizationsQuotasAssign
  * @throws IOException if the JSON string is invalid with respect to OrganizationsQuotasAssign
  */
  public static OrganizationsQuotasAssign fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrganizationsQuotasAssign.class);
  }

 /**
  * Convert an instance of OrganizationsQuotasAssign to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

