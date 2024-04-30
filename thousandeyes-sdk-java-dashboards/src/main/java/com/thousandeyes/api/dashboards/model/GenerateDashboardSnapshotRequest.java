/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Request to generate a snapshot from a dashboard.
 */
@JsonPropertyOrder({
  GenerateDashboardSnapshotRequest.JSON_PROPERTY_START_DATE,
  GenerateDashboardSnapshotRequest.JSON_PROPERTY_END_DATE,
  GenerateDashboardSnapshotRequest.JSON_PROPERTY_DISPLAY_NAME,
  GenerateDashboardSnapshotRequest.JSON_PROPERTY_DASHBOARD_ID,
  GenerateDashboardSnapshotRequest.JSON_PROPERTY_ANONYMIZE_DATA,
  GenerateDashboardSnapshotRequest.JSON_PROPERTY_TIMEZONE,
  GenerateDashboardSnapshotRequest.JSON_PROPERTY_EXPIRATION_DATE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-30T10:06:13.271495+01:00[Europe/Lisbon]")
public class GenerateDashboardSnapshotRequest {
  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private OffsetDateTime endDate;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_DASHBOARD_ID = "dashboardId";
  private String dashboardId;

  public static final String JSON_PROPERTY_ANONYMIZE_DATA = "anonymizeData";
  private Boolean anonymizeData;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_EXPIRATION_DATE = "expirationDate";
  private OffsetDateTime expirationDate;

  public GenerateDashboardSnapshotRequest() { 
  }

  public GenerateDashboardSnapshotRequest startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Date and time to start aggregating data (ISO date-time format).
   * @return startDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public GenerateDashboardSnapshotRequest endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Date and time to end aggregating data (ISO date-time format).
   * @return endDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public GenerateDashboardSnapshotRequest displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The name of the snapshot, does not have to be unique.
   * @return displayName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public GenerateDashboardSnapshotRequest dashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

   /**
   * TheIdentifierof the dashboard to generate a snapshot from
   * @return dashboardId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DASHBOARD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDashboardId() {
    return dashboardId;
  }


  @JsonProperty(JSON_PROPERTY_DASHBOARD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
  }


  public GenerateDashboardSnapshotRequest anonymizeData(Boolean anonymizeData) {
    this.anonymizeData = anonymizeData;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; to anonymize the data in the snapshot.
   * @return anonymizeData
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANONYMIZE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAnonymizeData() {
    return anonymizeData;
  }


  @JsonProperty(JSON_PROPERTY_ANONYMIZE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnonymizeData(Boolean anonymizeData) {
    this.anonymizeData = anonymizeData;
  }


  public GenerateDashboardSnapshotRequest timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Specifies the timezone used for date and time fields.
   * @return timezone
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimezone() {
    return timezone;
  }


  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public GenerateDashboardSnapshotRequest expirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Expiration date of the snapshot. If unspecified, the snapshot expires 1 year from its creation date. The expiration date must be set within 5 years from the current date and adhere to the ISO date-time format.
   * @return expirationDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }


  /**
   * Return true if this GenerateDashboardSnapshotRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateDashboardSnapshotRequest generateDashboardSnapshotRequest = (GenerateDashboardSnapshotRequest) o;
    return Objects.equals(this.startDate, generateDashboardSnapshotRequest.startDate) &&
        Objects.equals(this.endDate, generateDashboardSnapshotRequest.endDate) &&
        Objects.equals(this.displayName, generateDashboardSnapshotRequest.displayName) &&
        Objects.equals(this.dashboardId, generateDashboardSnapshotRequest.dashboardId) &&
        Objects.equals(this.anonymizeData, generateDashboardSnapshotRequest.anonymizeData) &&
        Objects.equals(this.timezone, generateDashboardSnapshotRequest.timezone) &&
        Objects.equals(this.expirationDate, generateDashboardSnapshotRequest.expirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, displayName, dashboardId, anonymizeData, timezone, expirationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateDashboardSnapshotRequest {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    dashboardId: ").append(toIndentedString(dashboardId)).append("\n");
    sb.append("    anonymizeData: ").append(toIndentedString(anonymizeData)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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

