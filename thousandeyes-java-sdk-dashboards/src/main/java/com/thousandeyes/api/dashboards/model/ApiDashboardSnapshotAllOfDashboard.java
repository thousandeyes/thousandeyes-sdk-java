/*
 * Dashboards API
 * Manage ThousandEyes Dashboards
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.dashboards.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.dashboards.model.ApiDefaultTimespan;
import com.thousandeyes.api.dashboards.model.ApiWidget;
import com.thousandeyes.api.dashboards.model.DashboardLinksLinks;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * ApiDashboardSnapshotAllOfDashboard
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T12:21:02.427485Z[Europe/Lisbon]")
public class ApiDashboardSnapshotAllOfDashboard {
  public static final String SERIALIZED_NAME_DASHBOARD_ID = "dashboardId";
  @SerializedName(SERIALIZED_NAME_DASHBOARD_ID)
  private String dashboardId;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_IS_BUILT_IN = "isBuiltIn";
  @SerializedName(SERIALIZED_NAME_IS_BUILT_IN)
  private Boolean isBuiltIn;

  public static final String SERIALIZED_NAME_AID = "aid";
  @SerializedName(SERIALIZED_NAME_AID)
  private String aid;

  public static final String SERIALIZED_NAME_DASHBOARD_CREATED_BY = "dashboardCreatedBy";
  @SerializedName(SERIALIZED_NAME_DASHBOARD_CREATED_BY)
  private String dashboardCreatedBy;

  public static final String SERIALIZED_NAME_DASHBOARD_MODIFIED_BY = "dashboardModifiedBy";
  @SerializedName(SERIALIZED_NAME_DASHBOARD_MODIFIED_BY)
  private String dashboardModifiedBy;

  public static final String SERIALIZED_NAME_DASHBOARD_MODIFIED_DATE = "dashboardModifiedDate";
  @SerializedName(SERIALIZED_NAME_DASHBOARD_MODIFIED_DATE)
  private OffsetDateTime dashboardModifiedDate;

  public static final String SERIALIZED_NAME_IS_PRIVATE = "isPrivate";
  @SerializedName(SERIALIZED_NAME_IS_PRIVATE)
  private Boolean isPrivate;

  public static final String SERIALIZED_NAME_IS_DEFAULT_FOR_USER = "isDefaultForUser";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT_FOR_USER)
  private Boolean isDefaultForUser;

  public static final String SERIALIZED_NAME_IS_DEFAULT_FOR_ACCOUNT = "isDefaultForAccount";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT_FOR_ACCOUNT)
  private Boolean isDefaultForAccount;

  public static final String SERIALIZED_NAME_WIDGETS = "widgets";
  @SerializedName(SERIALIZED_NAME_WIDGETS)
  private List<ApiWidget> widgets;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DEFAULT_TIMESPAN = "defaultTimespan";
  @SerializedName(SERIALIZED_NAME_DEFAULT_TIMESPAN)
  private ApiDefaultTimespan defaultTimespan;

  public static final String SERIALIZED_NAME_IS_GLOBAL_OVERRIDE = "isGlobalOverride";
  @SerializedName(SERIALIZED_NAME_IS_GLOBAL_OVERRIDE)
  private Boolean isGlobalOverride;

  public static final String SERIALIZED_NAME_IS_MIGRATED_REPORT = "isMigratedReport";
  @SerializedName(SERIALIZED_NAME_IS_MIGRATED_REPORT)
  private Boolean isMigratedReport;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private DashboardLinksLinks links;

  public ApiDashboardSnapshotAllOfDashboard() {
  }

  
  public ApiDashboardSnapshotAllOfDashboard(
     String dashboardId, 
     Boolean isBuiltIn, 
     String aid, 
     String dashboardCreatedBy, 
     String dashboardModifiedBy, 
     OffsetDateTime dashboardModifiedDate, 
     Boolean isDefaultForUser, 
     Boolean isDefaultForAccount, 
     Boolean isMigratedReport
  ) {
    this();
    this.dashboardId = dashboardId;
    this.isBuiltIn = isBuiltIn;
    this.aid = aid;
    this.dashboardCreatedBy = dashboardCreatedBy;
    this.dashboardModifiedBy = dashboardModifiedBy;
    this.dashboardModifiedDate = dashboardModifiedDate;
    this.isDefaultForUser = isDefaultForUser;
    this.isDefaultForAccount = isDefaultForAccount;
    this.isMigratedReport = isMigratedReport;
  }

   /**
   * Identifier of a dashboard.
   * @return dashboardId
  **/
  @javax.annotation.Nullable
  public String getDashboardId() {
    return dashboardId;
  }




  public ApiDashboardSnapshotAllOfDashboard title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Title of a dashboard.
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


   /**
   * Indicates if a dashboard is built-in. True for built-in dashboards, false for user-created dashboards.
   * @return isBuiltIn
  **/
  @javax.annotation.Nullable
  public Boolean getIsBuiltIn() {
    return isBuiltIn;
  }




   /**
   * Identifier for the account group associated with a dashboard.
   * @return aid
  **/
  @javax.annotation.Nullable
  public String getAid() {
    return aid;
  }




   /**
   * Identifier for the user that created a dashboard.
   * @return dashboardCreatedBy
  **/
  @javax.annotation.Nullable
  public String getDashboardCreatedBy() {
    return dashboardCreatedBy;
  }




   /**
   * Identifier for the user that last modified a dashboard.
   * @return dashboardModifiedBy
  **/
  @javax.annotation.Nullable
  public String getDashboardModifiedBy() {
    return dashboardModifiedBy;
  }




   /**
   * UTC date/time when a dashboard was last modified (ISO date-time format).
   * @return dashboardModifiedDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDashboardModifiedDate() {
    return dashboardModifiedDate;
  }




  public ApiDashboardSnapshotAllOfDashboard isPrivate(Boolean isPrivate) {
    
    this.isPrivate = isPrivate;
    return this;
  }

   /**
   * A dashboard can be viewed by other users in the account. If true, only the creator of the dashboard may view it. If false, all users in the same account may view it.
   * @return isPrivate
  **/
  @javax.annotation.Nullable
  public Boolean getIsPrivate() {
    return isPrivate;
  }


  public void setIsPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
  }


   /**
   * Indicates whether this dashboard is the user&#39;s default. True for default, false if not.
   * @return isDefaultForUser
  **/
  @javax.annotation.Nullable
  public Boolean getIsDefaultForUser() {
    return isDefaultForUser;
  }




   /**
   * Indicates whether this dashboard is the account group&#39;s default. True for default, false if not.
   * @return isDefaultForAccount
  **/
  @javax.annotation.Nullable
  public Boolean getIsDefaultForAccount() {
    return isDefaultForAccount;
  }




  public ApiDashboardSnapshotAllOfDashboard widgets(List<ApiWidget> widgets) {
    
    this.widgets = widgets;
    return this;
  }

  public ApiDashboardSnapshotAllOfDashboard addWidgetsItem(ApiWidget widgetsItem) {
    if (this.widgets == null) {
      this.widgets = new ArrayList<>();
    }
    this.widgets.add(widgetsItem);
    return this;
  }

   /**
   * Get widgets
   * @return widgets
  **/
  @javax.annotation.Nullable
  public List<ApiWidget> getWidgets() {
    return widgets;
  }


  public void setWidgets(List<ApiWidget> widgets) {
    this.widgets = widgets;
  }


  public ApiDashboardSnapshotAllOfDashboard description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A text description of the dashboard&#39;s purpose and functionality. This information assists users in understanding the dashboard but isn&#39;t displayed when viewing a dashboard.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ApiDashboardSnapshotAllOfDashboard defaultTimespan(ApiDefaultTimespan defaultTimespan) {
    
    this.defaultTimespan = defaultTimespan;
    return this;
  }

   /**
   * Get defaultTimespan
   * @return defaultTimespan
  **/
  @javax.annotation.Nullable
  public ApiDefaultTimespan getDefaultTimespan() {
    return defaultTimespan;
  }


  public void setDefaultTimespan(ApiDefaultTimespan defaultTimespan) {
    this.defaultTimespan = defaultTimespan;
  }


  public ApiDashboardSnapshotAllOfDashboard isGlobalOverride(Boolean isGlobalOverride) {
    
    this.isGlobalOverride = isGlobalOverride;
    return this;
  }

   /**
   * When set to &#x60;true&#x60;, the defaultTimespan is used and overrides the widget&#39;s timespan. If set to &#x60;false&#x60;, the the widget&#39;s timespan is used.
   * @return isGlobalOverride
  **/
  @javax.annotation.Nullable
  public Boolean getIsGlobalOverride() {
    return isGlobalOverride;
  }


  public void setIsGlobalOverride(Boolean isGlobalOverride) {
    this.isGlobalOverride = isGlobalOverride;
  }


   /**
   * True if this dashboard was previously a report.
   * @return isMigratedReport
  **/
  @javax.annotation.Nullable
  public Boolean getIsMigratedReport() {
    return isMigratedReport;
  }




  public ApiDashboardSnapshotAllOfDashboard links(DashboardLinksLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public DashboardLinksLinks getLinks() {
    return links;
  }


  public void setLinks(DashboardLinksLinks links) {
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
    ApiDashboardSnapshotAllOfDashboard apiDashboardSnapshotAllOfDashboard = (ApiDashboardSnapshotAllOfDashboard) o;
    return Objects.equals(this.dashboardId, apiDashboardSnapshotAllOfDashboard.dashboardId) &&
        Objects.equals(this.title, apiDashboardSnapshotAllOfDashboard.title) &&
        Objects.equals(this.isBuiltIn, apiDashboardSnapshotAllOfDashboard.isBuiltIn) &&
        Objects.equals(this.aid, apiDashboardSnapshotAllOfDashboard.aid) &&
        Objects.equals(this.dashboardCreatedBy, apiDashboardSnapshotAllOfDashboard.dashboardCreatedBy) &&
        Objects.equals(this.dashboardModifiedBy, apiDashboardSnapshotAllOfDashboard.dashboardModifiedBy) &&
        Objects.equals(this.dashboardModifiedDate, apiDashboardSnapshotAllOfDashboard.dashboardModifiedDate) &&
        Objects.equals(this.isPrivate, apiDashboardSnapshotAllOfDashboard.isPrivate) &&
        Objects.equals(this.isDefaultForUser, apiDashboardSnapshotAllOfDashboard.isDefaultForUser) &&
        Objects.equals(this.isDefaultForAccount, apiDashboardSnapshotAllOfDashboard.isDefaultForAccount) &&
        Objects.equals(this.widgets, apiDashboardSnapshotAllOfDashboard.widgets) &&
        Objects.equals(this.description, apiDashboardSnapshotAllOfDashboard.description) &&
        Objects.equals(this.defaultTimespan, apiDashboardSnapshotAllOfDashboard.defaultTimespan) &&
        Objects.equals(this.isGlobalOverride, apiDashboardSnapshotAllOfDashboard.isGlobalOverride) &&
        Objects.equals(this.isMigratedReport, apiDashboardSnapshotAllOfDashboard.isMigratedReport) &&
        Objects.equals(this.links, apiDashboardSnapshotAllOfDashboard.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, title, isBuiltIn, aid, dashboardCreatedBy, dashboardModifiedBy, dashboardModifiedDate, isPrivate, isDefaultForUser, isDefaultForAccount, widgets, description, defaultTimespan, isGlobalOverride, isMigratedReport, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiDashboardSnapshotAllOfDashboard {\n");
    sb.append("    dashboardId: ").append(toIndentedString(dashboardId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    isBuiltIn: ").append(toIndentedString(isBuiltIn)).append("\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    dashboardCreatedBy: ").append(toIndentedString(dashboardCreatedBy)).append("\n");
    sb.append("    dashboardModifiedBy: ").append(toIndentedString(dashboardModifiedBy)).append("\n");
    sb.append("    dashboardModifiedDate: ").append(toIndentedString(dashboardModifiedDate)).append("\n");
    sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
    sb.append("    isDefaultForUser: ").append(toIndentedString(isDefaultForUser)).append("\n");
    sb.append("    isDefaultForAccount: ").append(toIndentedString(isDefaultForAccount)).append("\n");
    sb.append("    widgets: ").append(toIndentedString(widgets)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    defaultTimespan: ").append(toIndentedString(defaultTimespan)).append("\n");
    sb.append("    isGlobalOverride: ").append(toIndentedString(isGlobalOverride)).append("\n");
    sb.append("    isMigratedReport: ").append(toIndentedString(isMigratedReport)).append("\n");
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
    openapiFields.add("dashboardId");
    openapiFields.add("title");
    openapiFields.add("isBuiltIn");
    openapiFields.add("aid");
    openapiFields.add("dashboardCreatedBy");
    openapiFields.add("dashboardModifiedBy");
    openapiFields.add("dashboardModifiedDate");
    openapiFields.add("isPrivate");
    openapiFields.add("isDefaultForUser");
    openapiFields.add("isDefaultForAccount");
    openapiFields.add("widgets");
    openapiFields.add("description");
    openapiFields.add("defaultTimespan");
    openapiFields.add("isGlobalOverride");
    openapiFields.add("isMigratedReport");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApiDashboardSnapshotAllOfDashboard
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiDashboardSnapshotAllOfDashboard.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiDashboardSnapshotAllOfDashboard is not found in the empty JSON string", ApiDashboardSnapshotAllOfDashboard.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiDashboardSnapshotAllOfDashboard.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiDashboardSnapshotAllOfDashboard` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("dashboardId") != null && !jsonObj.get("dashboardId").isJsonNull()) && !jsonObj.get("dashboardId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dashboardId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dashboardId").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("aid") != null && !jsonObj.get("aid").isJsonNull()) && !jsonObj.get("aid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aid").toString()));
      }
      if ((jsonObj.get("dashboardCreatedBy") != null && !jsonObj.get("dashboardCreatedBy").isJsonNull()) && !jsonObj.get("dashboardCreatedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dashboardCreatedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dashboardCreatedBy").toString()));
      }
      if ((jsonObj.get("dashboardModifiedBy") != null && !jsonObj.get("dashboardModifiedBy").isJsonNull()) && !jsonObj.get("dashboardModifiedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dashboardModifiedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dashboardModifiedBy").toString()));
      }
      if (jsonObj.get("widgets") != null && !jsonObj.get("widgets").isJsonNull()) {
        JsonArray jsonArraywidgets = jsonObj.getAsJsonArray("widgets");
        if (jsonArraywidgets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("widgets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `widgets` to be an array in the JSON string but got `%s`", jsonObj.get("widgets").toString()));
          }

          // validate the optional field `widgets` (array)
          for (int i = 0; i < jsonArraywidgets.size(); i++) {
            ApiWidget.validateJsonElement(jsonArraywidgets.get(i));
          };
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `defaultTimespan`
      if (jsonObj.get("defaultTimespan") != null && !jsonObj.get("defaultTimespan").isJsonNull()) {
        ApiDefaultTimespan.validateJsonElement(jsonObj.get("defaultTimespan"));
      }
      // validate the optional field `_links`
      if (jsonObj.get("_links") != null && !jsonObj.get("_links").isJsonNull()) {
        DashboardLinksLinks.validateJsonElement(jsonObj.get("_links"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiDashboardSnapshotAllOfDashboard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiDashboardSnapshotAllOfDashboard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiDashboardSnapshotAllOfDashboard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiDashboardSnapshotAllOfDashboard.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiDashboardSnapshotAllOfDashboard>() {
           @Override
           public void write(JsonWriter out, ApiDashboardSnapshotAllOfDashboard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiDashboardSnapshotAllOfDashboard read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiDashboardSnapshotAllOfDashboard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiDashboardSnapshotAllOfDashboard
  * @throws IOException if the JSON string is invalid with respect to ApiDashboardSnapshotAllOfDashboard
  */
  public static ApiDashboardSnapshotAllOfDashboard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiDashboardSnapshotAllOfDashboard.class);
  }

 /**
  * Convert an instance of ApiDashboardSnapshotAllOfDashboard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

