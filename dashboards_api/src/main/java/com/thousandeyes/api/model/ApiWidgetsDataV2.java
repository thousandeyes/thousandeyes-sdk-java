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


package com.thousandeyes.api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.model.ApiAgentStatusAgent;
import com.thousandeyes.api.model.ApiAgentStatusSummary;
import com.thousandeyes.api.model.ApiAlertListAlert;
import com.thousandeyes.api.model.ApiDashboardAsw;
import com.thousandeyes.api.model.ApiMultiMetricColumnData;
import com.thousandeyes.api.model.ApiNumbersCardData;
import com.thousandeyes.api.model.ApiTestTableData;
import com.thousandeyes.api.model.ApiWidgetDataPoint;
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
 * Data of a widget.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:17:34.047854Z[Europe/London]")
public class ApiWidgetsDataV2 {
  public static final String SERIALIZED_NAME_CARDS = "cards";
  @SerializedName(SERIALIZED_NAME_CARDS)
  private List<ApiNumbersCardData> cards;

  public static final String SERIALIZED_NAME_COLUMNS = "columns";
  @SerializedName(SERIALIZED_NAME_COLUMNS)
  private List<ApiMultiMetricColumnData> columns;

  public static final String SERIALIZED_NAME_POINTS = "points";
  @SerializedName(SERIALIZED_NAME_POINTS)
  private List<ApiWidgetDataPoint> points;

  public static final String SERIALIZED_NAME_TESTS = "tests";
  @SerializedName(SERIALIZED_NAME_TESTS)
  private List<ApiTestTableData> tests;

  public static final String SERIALIZED_NAME_START_ROUND = "startRound";
  @SerializedName(SERIALIZED_NAME_START_ROUND)
  private Long startRound;

  public static final String SERIALIZED_NAME_ALERT_SUPPRESSION_WINDOWS = "alertSuppressionWindows";
  @SerializedName(SERIALIZED_NAME_ALERT_SUPPRESSION_WINDOWS)
  private List<ApiDashboardAsw> alertSuppressionWindows;

  public static final String SERIALIZED_NAME_TOTAL_ALERTS = "totalAlerts";
  @SerializedName(SERIALIZED_NAME_TOTAL_ALERTS)
  private Long totalAlerts;

  public static final String SERIALIZED_NAME_ACTIVE_ALERTS = "activeAlerts";
  @SerializedName(SERIALIZED_NAME_ACTIVE_ALERTS)
  private Long activeAlerts;

  public static final String SERIALIZED_NAME_ALERTS = "alerts";
  @SerializedName(SERIALIZED_NAME_ALERTS)
  private List<ApiAlertListAlert> alerts;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private ApiAgentStatusSummary summary;

  public static final String SERIALIZED_NAME_AGENTS = "agents";
  @SerializedName(SERIALIZED_NAME_AGENTS)
  private List<ApiAgentStatusAgent> agents;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public ApiWidgetsDataV2() {
  }

  public ApiWidgetsDataV2 cards(List<ApiNumbersCardData> cards) {
    
    this.cards = cards;
    return this;
  }

  public ApiWidgetsDataV2 addCardsItem(ApiNumbersCardData cardsItem) {
    if (this.cards == null) {
      this.cards = new ArrayList<>();
    }
    this.cards.add(cardsItem);
    return this;
  }

   /**
   * Get cards
   * @return cards
  **/
  @javax.annotation.Nullable
  public List<ApiNumbersCardData> getCards() {
    return cards;
  }


  public void setCards(List<ApiNumbersCardData> cards) {
    this.cards = cards;
  }


  public ApiWidgetsDataV2 columns(List<ApiMultiMetricColumnData> columns) {
    
    this.columns = columns;
    return this;
  }

  public ApiWidgetsDataV2 addColumnsItem(ApiMultiMetricColumnData columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Get columns
   * @return columns
  **/
  @javax.annotation.Nullable
  public List<ApiMultiMetricColumnData> getColumns() {
    return columns;
  }


  public void setColumns(List<ApiMultiMetricColumnData> columns) {
    this.columns = columns;
  }


  public ApiWidgetsDataV2 points(List<ApiWidgetDataPoint> points) {
    
    this.points = points;
    return this;
  }

  public ApiWidgetsDataV2 addPointsItem(ApiWidgetDataPoint pointsItem) {
    if (this.points == null) {
      this.points = new ArrayList<>();
    }
    this.points.add(pointsItem);
    return this;
  }

   /**
   * Get points
   * @return points
  **/
  @javax.annotation.Nullable
  public List<ApiWidgetDataPoint> getPoints() {
    return points;
  }


  public void setPoints(List<ApiWidgetDataPoint> points) {
    this.points = points;
  }


  public ApiWidgetsDataV2 tests(List<ApiTestTableData> tests) {
    
    this.tests = tests;
    return this;
  }

  public ApiWidgetsDataV2 addTestsItem(ApiTestTableData testsItem) {
    if (this.tests == null) {
      this.tests = new ArrayList<>();
    }
    this.tests.add(testsItem);
    return this;
  }

   /**
   * Get tests
   * @return tests
  **/
  @javax.annotation.Nullable
  public List<ApiTestTableData> getTests() {
    return tests;
  }


  public void setTests(List<ApiTestTableData> tests) {
    this.tests = tests;
  }


  public ApiWidgetsDataV2 startRound(Long startRound) {
    
    this.startRound = startRound;
    return this;
  }

   /**
   * Epoch time (seconds) indicating the start time of the round.
   * @return startRound
  **/
  @javax.annotation.Nullable
  public Long getStartRound() {
    return startRound;
  }


  public void setStartRound(Long startRound) {
    this.startRound = startRound;
  }


  public ApiWidgetsDataV2 alertSuppressionWindows(List<ApiDashboardAsw> alertSuppressionWindows) {
    
    this.alertSuppressionWindows = alertSuppressionWindows;
    return this;
  }

  public ApiWidgetsDataV2 addAlertSuppressionWindowsItem(ApiDashboardAsw alertSuppressionWindowsItem) {
    if (this.alertSuppressionWindows == null) {
      this.alertSuppressionWindows = new ArrayList<>();
    }
    this.alertSuppressionWindows.add(alertSuppressionWindowsItem);
    return this;
  }

   /**
   * Get alertSuppressionWindows
   * @return alertSuppressionWindows
  **/
  @javax.annotation.Nullable
  public List<ApiDashboardAsw> getAlertSuppressionWindows() {
    return alertSuppressionWindows;
  }


  public void setAlertSuppressionWindows(List<ApiDashboardAsw> alertSuppressionWindows) {
    this.alertSuppressionWindows = alertSuppressionWindows;
  }


  public ApiWidgetsDataV2 totalAlerts(Long totalAlerts) {
    
    this.totalAlerts = totalAlerts;
    return this;
  }

   /**
   * Total number of active alerts within configured timespan.
   * @return totalAlerts
  **/
  @javax.annotation.Nullable
  public Long getTotalAlerts() {
    return totalAlerts;
  }


  public void setTotalAlerts(Long totalAlerts) {
    this.totalAlerts = totalAlerts;
  }


  public ApiWidgetsDataV2 activeAlerts(Long activeAlerts) {
    
    this.activeAlerts = activeAlerts;
    return this;
  }

   /**
   * Total number of currently active alerts.
   * @return activeAlerts
  **/
  @javax.annotation.Nullable
  public Long getActiveAlerts() {
    return activeAlerts;
  }


  public void setActiveAlerts(Long activeAlerts) {
    this.activeAlerts = activeAlerts;
  }


  public ApiWidgetsDataV2 alerts(List<ApiAlertListAlert> alerts) {
    
    this.alerts = alerts;
    return this;
  }

  public ApiWidgetsDataV2 addAlertsItem(ApiAlertListAlert alertsItem) {
    if (this.alerts == null) {
      this.alerts = new ArrayList<>();
    }
    this.alerts.add(alertsItem);
    return this;
  }

   /**
   * Get alerts
   * @return alerts
  **/
  @javax.annotation.Nullable
  public List<ApiAlertListAlert> getAlerts() {
    return alerts;
  }


  public void setAlerts(List<ApiAlertListAlert> alerts) {
    this.alerts = alerts;
  }


  public ApiWidgetsDataV2 summary(ApiAgentStatusSummary summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nullable
  public ApiAgentStatusSummary getSummary() {
    return summary;
  }


  public void setSummary(ApiAgentStatusSummary summary) {
    this.summary = summary;
  }


  public ApiWidgetsDataV2 agents(List<ApiAgentStatusAgent> agents) {
    
    this.agents = agents;
    return this;
  }

  public ApiWidgetsDataV2 addAgentsItem(ApiAgentStatusAgent agentsItem) {
    if (this.agents == null) {
      this.agents = new ArrayList<>();
    }
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * Get agents
   * @return agents
  **/
  @javax.annotation.Nullable
  public List<ApiAgentStatusAgent> getAgents() {
    return agents;
  }


  public void setAgents(List<ApiAgentStatusAgent> agents) {
    this.agents = agents;
  }


  public ApiWidgetsDataV2 status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Message for not fully configured card or no data.
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiWidgetsDataV2 apiWidgetsDataV2 = (ApiWidgetsDataV2) o;
    return Objects.equals(this.cards, apiWidgetsDataV2.cards) &&
        Objects.equals(this.columns, apiWidgetsDataV2.columns) &&
        Objects.equals(this.points, apiWidgetsDataV2.points) &&
        Objects.equals(this.tests, apiWidgetsDataV2.tests) &&
        Objects.equals(this.startRound, apiWidgetsDataV2.startRound) &&
        Objects.equals(this.alertSuppressionWindows, apiWidgetsDataV2.alertSuppressionWindows) &&
        Objects.equals(this.totalAlerts, apiWidgetsDataV2.totalAlerts) &&
        Objects.equals(this.activeAlerts, apiWidgetsDataV2.activeAlerts) &&
        Objects.equals(this.alerts, apiWidgetsDataV2.alerts) &&
        Objects.equals(this.summary, apiWidgetsDataV2.summary) &&
        Objects.equals(this.agents, apiWidgetsDataV2.agents) &&
        Objects.equals(this.status, apiWidgetsDataV2.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cards, columns, points, tests, startRound, alertSuppressionWindows, totalAlerts, activeAlerts, alerts, summary, agents, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiWidgetsDataV2 {\n");
    sb.append("    cards: ").append(toIndentedString(cards)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    tests: ").append(toIndentedString(tests)).append("\n");
    sb.append("    startRound: ").append(toIndentedString(startRound)).append("\n");
    sb.append("    alertSuppressionWindows: ").append(toIndentedString(alertSuppressionWindows)).append("\n");
    sb.append("    totalAlerts: ").append(toIndentedString(totalAlerts)).append("\n");
    sb.append("    activeAlerts: ").append(toIndentedString(activeAlerts)).append("\n");
    sb.append("    alerts: ").append(toIndentedString(alerts)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("cards");
    openapiFields.add("columns");
    openapiFields.add("points");
    openapiFields.add("tests");
    openapiFields.add("startRound");
    openapiFields.add("alertSuppressionWindows");
    openapiFields.add("totalAlerts");
    openapiFields.add("activeAlerts");
    openapiFields.add("alerts");
    openapiFields.add("summary");
    openapiFields.add("agents");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApiWidgetsDataV2
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiWidgetsDataV2.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiWidgetsDataV2 is not found in the empty JSON string", ApiWidgetsDataV2.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiWidgetsDataV2.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiWidgetsDataV2` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("cards") != null && !jsonObj.get("cards").isJsonNull()) {
        JsonArray jsonArraycards = jsonObj.getAsJsonArray("cards");
        if (jsonArraycards != null) {
          // ensure the json data is an array
          if (!jsonObj.get("cards").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `cards` to be an array in the JSON string but got `%s`", jsonObj.get("cards").toString()));
          }

          // validate the optional field `cards` (array)
          for (int i = 0; i < jsonArraycards.size(); i++) {
            ApiNumbersCardData.validateJsonElement(jsonArraycards.get(i));
          };
        }
      }
      if (jsonObj.get("columns") != null && !jsonObj.get("columns").isJsonNull()) {
        JsonArray jsonArraycolumns = jsonObj.getAsJsonArray("columns");
        if (jsonArraycolumns != null) {
          // ensure the json data is an array
          if (!jsonObj.get("columns").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `columns` to be an array in the JSON string but got `%s`", jsonObj.get("columns").toString()));
          }

          // validate the optional field `columns` (array)
          for (int i = 0; i < jsonArraycolumns.size(); i++) {
            ApiMultiMetricColumnData.validateJsonElement(jsonArraycolumns.get(i));
          };
        }
      }
      if (jsonObj.get("points") != null && !jsonObj.get("points").isJsonNull()) {
        JsonArray jsonArraypoints = jsonObj.getAsJsonArray("points");
        if (jsonArraypoints != null) {
          // ensure the json data is an array
          if (!jsonObj.get("points").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `points` to be an array in the JSON string but got `%s`", jsonObj.get("points").toString()));
          }

          // validate the optional field `points` (array)
          for (int i = 0; i < jsonArraypoints.size(); i++) {
            ApiWidgetDataPoint.validateJsonElement(jsonArraypoints.get(i));
          };
        }
      }
      if (jsonObj.get("tests") != null && !jsonObj.get("tests").isJsonNull()) {
        JsonArray jsonArraytests = jsonObj.getAsJsonArray("tests");
        if (jsonArraytests != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tests").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tests` to be an array in the JSON string but got `%s`", jsonObj.get("tests").toString()));
          }

          // validate the optional field `tests` (array)
          for (int i = 0; i < jsonArraytests.size(); i++) {
            ApiTestTableData.validateJsonElement(jsonArraytests.get(i));
          };
        }
      }
      if (jsonObj.get("alertSuppressionWindows") != null && !jsonObj.get("alertSuppressionWindows").isJsonNull()) {
        JsonArray jsonArrayalertSuppressionWindows = jsonObj.getAsJsonArray("alertSuppressionWindows");
        if (jsonArrayalertSuppressionWindows != null) {
          // ensure the json data is an array
          if (!jsonObj.get("alertSuppressionWindows").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `alertSuppressionWindows` to be an array in the JSON string but got `%s`", jsonObj.get("alertSuppressionWindows").toString()));
          }

          // validate the optional field `alertSuppressionWindows` (array)
          for (int i = 0; i < jsonArrayalertSuppressionWindows.size(); i++) {
            ApiDashboardAsw.validateJsonElement(jsonArrayalertSuppressionWindows.get(i));
          };
        }
      }
      if (jsonObj.get("alerts") != null && !jsonObj.get("alerts").isJsonNull()) {
        JsonArray jsonArrayalerts = jsonObj.getAsJsonArray("alerts");
        if (jsonArrayalerts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("alerts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `alerts` to be an array in the JSON string but got `%s`", jsonObj.get("alerts").toString()));
          }

          // validate the optional field `alerts` (array)
          for (int i = 0; i < jsonArrayalerts.size(); i++) {
            ApiAlertListAlert.validateJsonElement(jsonArrayalerts.get(i));
          };
        }
      }
      // validate the optional field `summary`
      if (jsonObj.get("summary") != null && !jsonObj.get("summary").isJsonNull()) {
        ApiAgentStatusSummary.validateJsonElement(jsonObj.get("summary"));
      }
      if (jsonObj.get("agents") != null && !jsonObj.get("agents").isJsonNull()) {
        JsonArray jsonArrayagents = jsonObj.getAsJsonArray("agents");
        if (jsonArrayagents != null) {
          // ensure the json data is an array
          if (!jsonObj.get("agents").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `agents` to be an array in the JSON string but got `%s`", jsonObj.get("agents").toString()));
          }

          // validate the optional field `agents` (array)
          for (int i = 0; i < jsonArrayagents.size(); i++) {
            ApiAgentStatusAgent.validateJsonElement(jsonArrayagents.get(i));
          };
        }
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiWidgetsDataV2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiWidgetsDataV2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiWidgetsDataV2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiWidgetsDataV2.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiWidgetsDataV2>() {
           @Override
           public void write(JsonWriter out, ApiWidgetsDataV2 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiWidgetsDataV2 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiWidgetsDataV2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiWidgetsDataV2
  * @throws IOException if the JSON string is invalid with respect to ApiWidgetsDataV2
  */
  public static ApiWidgetsDataV2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiWidgetsDataV2.class);
  }

 /**
  * Convert an instance of ApiWidgetsDataV2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

