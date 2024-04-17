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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.dashboards.model.ApiAgentStatusAgent;
import com.thousandeyes.api.dashboards.model.ApiAgentStatusSummary;
import com.thousandeyes.api.dashboards.model.ApiAlertListAlert;
import com.thousandeyes.api.dashboards.model.ApiDashboardAsw;
import com.thousandeyes.api.dashboards.model.ApiMultiMetricColumnData;
import com.thousandeyes.api.dashboards.model.ApiNumbersCardData;
import com.thousandeyes.api.dashboards.model.ApiTestTableData;
import com.thousandeyes.api.dashboards.model.ApiWidgetDataPoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Data of a widget.
 */
@JsonPropertyOrder({
  ApiWidgetsDataV2.JSON_PROPERTY_CARDS,
  ApiWidgetsDataV2.JSON_PROPERTY_COLUMNS,
  ApiWidgetsDataV2.JSON_PROPERTY_POINTS,
  ApiWidgetsDataV2.JSON_PROPERTY_TESTS,
  ApiWidgetsDataV2.JSON_PROPERTY_START_ROUND,
  ApiWidgetsDataV2.JSON_PROPERTY_ALERT_SUPPRESSION_WINDOWS,
  ApiWidgetsDataV2.JSON_PROPERTY_TOTAL_ALERTS,
  ApiWidgetsDataV2.JSON_PROPERTY_ACTIVE_ALERTS,
  ApiWidgetsDataV2.JSON_PROPERTY_ALERTS,
  ApiWidgetsDataV2.JSON_PROPERTY_SUMMARY,
  ApiWidgetsDataV2.JSON_PROPERTY_AGENTS,
  ApiWidgetsDataV2.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-17T14:20:01.924510+01:00[Europe/Lisbon]")
public class ApiWidgetsDataV2 {
  public static final String JSON_PROPERTY_CARDS = "cards";
  private List<ApiNumbersCardData> cards;

  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<ApiMultiMetricColumnData> columns;

  public static final String JSON_PROPERTY_POINTS = "points";
  private List<ApiWidgetDataPoint> points;

  public static final String JSON_PROPERTY_TESTS = "tests";
  private List<ApiTestTableData> tests;

  public static final String JSON_PROPERTY_START_ROUND = "startRound";
  private Long startRound;

  public static final String JSON_PROPERTY_ALERT_SUPPRESSION_WINDOWS = "alertSuppressionWindows";
  private List<ApiDashboardAsw> alertSuppressionWindows;

  public static final String JSON_PROPERTY_TOTAL_ALERTS = "totalAlerts";
  private Long totalAlerts;

  public static final String JSON_PROPERTY_ACTIVE_ALERTS = "activeAlerts";
  private Long activeAlerts;

  public static final String JSON_PROPERTY_ALERTS = "alerts";
  private List<ApiAlertListAlert> alerts;

  public static final String JSON_PROPERTY_SUMMARY = "summary";
  private ApiAgentStatusSummary summary;

  public static final String JSON_PROPERTY_AGENTS = "agents";
  private List<ApiAgentStatusAgent> agents;

  public static final String JSON_PROPERTY_STATUS = "status";
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiNumbersCardData> getCards() {
    return cards;
  }


  @JsonProperty(JSON_PROPERTY_CARDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiMultiMetricColumnData> getColumns() {
    return columns;
  }


  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiWidgetDataPoint> getPoints() {
    return points;
  }


  @JsonProperty(JSON_PROPERTY_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiTestTableData> getTests() {
    return tests;
  }


  @JsonProperty(JSON_PROPERTY_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_ROUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStartRound() {
    return startRound;
  }


  @JsonProperty(JSON_PROPERTY_START_ROUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERT_SUPPRESSION_WINDOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiDashboardAsw> getAlertSuppressionWindows() {
    return alertSuppressionWindows;
  }


  @JsonProperty(JSON_PROPERTY_ALERT_SUPPRESSION_WINDOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_ALERTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTotalAlerts() {
    return totalAlerts;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_ALERTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE_ALERTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getActiveAlerts() {
    return activeAlerts;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_ALERTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiAlertListAlert> getAlerts() {
    return alerts;
  }


  @JsonProperty(JSON_PROPERTY_ALERTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiAgentStatusSummary getSummary() {
    return summary;
  }


  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiAgentStatusAgent> getAgents() {
    return agents;
  }


  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  /**
   * Return true if this ApiWidgetsDataV2 object is equal to o.
   */
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
}
