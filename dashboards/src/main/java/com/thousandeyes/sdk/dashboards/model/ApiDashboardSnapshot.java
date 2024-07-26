/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
 *
 * The version of the OpenAPI document: 7.0.11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.dashboards.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.dashboards.model.ApiDashboard;
import com.thousandeyes.sdk.dashboards.model.ApiReportSnapshotTimeSpan;
import com.thousandeyes.sdk.dashboards.model.ApiWidget;
import com.thousandeyes.sdk.dashboards.model.AppAndSelfLinks;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ApiDashboardSnapshot
 */
@JsonPropertyOrder({
  ApiDashboardSnapshot.JSON_PROPERTY_ACCOUNT_ID,
  ApiDashboardSnapshot.JSON_PROPERTY_CREATED_DATE,
  ApiDashboardSnapshot.JSON_PROPERTY_EXPIRATION_DATE,
  ApiDashboardSnapshot.JSON_PROPERTY_PERMALINK,
  ApiDashboardSnapshot.JSON_PROPERTY_API_LINKS,
  ApiDashboardSnapshot.JSON_PROPERTY_SNAPSHOT_ID,
  ApiDashboardSnapshot.JSON_PROPERTY_SNAPSHOT_NAME,
  ApiDashboardSnapshot.JSON_PROPERTY_AID,
  ApiDashboardSnapshot.JSON_PROPERTY_IS_SHARED,
  ApiDashboardSnapshot.JSON_PROPERTY_SNAPSHOT_CREATED_DATE,
  ApiDashboardSnapshot.JSON_PROPERTY_DASHBOARD,
  ApiDashboardSnapshot.JSON_PROPERTY_WIDGETS,
  ApiDashboardSnapshot.JSON_PROPERTY_IS_SCHEDULED,
  ApiDashboardSnapshot.JSON_PROPERTY_TIME_SPAN,
  ApiDashboardSnapshot.JSON_PROPERTY_SNAPSHOT_EXPIRATION_DATE,
  ApiDashboardSnapshot.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ApiDashboardSnapshot {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private String createdDate;

  public static final String JSON_PROPERTY_EXPIRATION_DATE = "expirationDate";
  private String expirationDate;

  public static final String JSON_PROPERTY_PERMALINK = "permalink";
  private String permalink;

  public static final String JSON_PROPERTY_API_LINKS = "apiLinks";
  private List<Map<String, Object>> apiLinks = new ArrayList<>();

  public static final String JSON_PROPERTY_SNAPSHOT_ID = "snapshotId";
  private UUID snapshotId;

  public static final String JSON_PROPERTY_SNAPSHOT_NAME = "snapshotName";
  private String snapshotName;

  public static final String JSON_PROPERTY_AID = "aid";
  private String aid;

  public static final String JSON_PROPERTY_IS_SHARED = "isShared";
  private Boolean isShared;

  public static final String JSON_PROPERTY_SNAPSHOT_CREATED_DATE = "snapshotCreatedDate";
  private OffsetDateTime snapshotCreatedDate;

  public static final String JSON_PROPERTY_DASHBOARD = "dashboard";
  private ApiDashboard dashboard;

  public static final String JSON_PROPERTY_WIDGETS = "widgets";
  private List<ApiWidget> widgets = new ArrayList<>();

  public static final String JSON_PROPERTY_IS_SCHEDULED = "isScheduled";
  private Boolean isScheduled;

  public static final String JSON_PROPERTY_TIME_SPAN = "timeSpan";
  private ApiReportSnapshotTimeSpan timeSpan;

  public static final String JSON_PROPERTY_SNAPSHOT_EXPIRATION_DATE = "snapshotExpirationDate";
  private OffsetDateTime snapshotExpirationDate;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private AppAndSelfLinks links;

  public ApiDashboardSnapshot() { 
  }

  public ApiDashboardSnapshot accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Identifier of the account group that the snapshot belongs to.
   * @return accountId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public ApiDashboardSnapshot createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * UTC date when dashboard snapshot was created.
   * @return createdDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedDate() {
    return createdDate;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }


  public ApiDashboardSnapshot expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Expiration date of the snapshot. If unspecified, the snapshot expires 1 year from its creation date. The expiration date must be set within 5 years from the current date.
   * @return expirationDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpirationDate() {
    return expirationDate;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }


  public ApiDashboardSnapshot permalink(String permalink) {
    this.permalink = permalink;
    return this;
  }

   /**
   * Hyperlink to dashboard snapshot in ThousandEyes Application
   * @return permalink
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERMALINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPermalink() {
    return permalink;
  }


  @JsonProperty(JSON_PROPERTY_PERMALINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPermalink(String permalink) {
    this.permalink = permalink;
  }


  public ApiDashboardSnapshot apiLinks(List<Map<String, Object>> apiLinks) {
    this.apiLinks = apiLinks;
    return this;
  }

  public ApiDashboardSnapshot addApiLinksItem(Map<String, Object> apiLinksItem) {
    if (this.apiLinks == null) {
      this.apiLinks = new ArrayList<>();
    }
    this.apiLinks.add(apiLinksItem);
    return this;
  }

   /**
   * A links array containing the self link.
   * @return apiLinks
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Map<String, Object>> getApiLinks() {
    return apiLinks;
  }


  @JsonProperty(JSON_PROPERTY_API_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApiLinks(List<Map<String, Object>> apiLinks) {
    this.apiLinks = apiLinks;
  }


  public ApiDashboardSnapshot snapshotId(UUID snapshotId) {
    this.snapshotId = snapshotId;
    return this;
  }

   /**
   * Identifier of the dashboard snapshot.
   * @return snapshotId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNAPSHOT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getSnapshotId() {
    return snapshotId;
  }


  @JsonProperty(JSON_PROPERTY_SNAPSHOT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnapshotId(UUID snapshotId) {
    this.snapshotId = snapshotId;
  }


  public ApiDashboardSnapshot snapshotName(String snapshotName) {
    this.snapshotName = snapshotName;
    return this;
  }

   /**
   * Name of the dashboard snapshot.
   * @return snapshotName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNAPSHOT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSnapshotName() {
    return snapshotName;
  }


  @JsonProperty(JSON_PROPERTY_SNAPSHOT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnapshotName(String snapshotName) {
    this.snapshotName = snapshotName;
  }


  public ApiDashboardSnapshot aid(String aid) {
    this.aid = aid;
    return this;
  }

   /**
   * Identifier of the account group that the snapshot belongs to.
   * @return aid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAid() {
    return aid;
  }


  @JsonProperty(JSON_PROPERTY_AID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAid(String aid) {
    this.aid = aid;
  }


  public ApiDashboardSnapshot isShared(Boolean isShared) {
    this.isShared = isShared;
    return this;
  }

   /**
   * Set &#x60;true&#x60; if dashboard snapshot is shared, &#x60;false&#x60; otherwise.
   * @return isShared
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_SHARED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsShared() {
    return isShared;
  }


  @JsonProperty(JSON_PROPERTY_IS_SHARED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsShared(Boolean isShared) {
    this.isShared = isShared;
  }


  public ApiDashboardSnapshot snapshotCreatedDate(OffsetDateTime snapshotCreatedDate) {
    this.snapshotCreatedDate = snapshotCreatedDate;
    return this;
  }

   /**
   * UTC date when dashboard snapshot was created (ISO date-time format).
   * @return snapshotCreatedDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNAPSHOT_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getSnapshotCreatedDate() {
    return snapshotCreatedDate;
  }


  @JsonProperty(JSON_PROPERTY_SNAPSHOT_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnapshotCreatedDate(OffsetDateTime snapshotCreatedDate) {
    this.snapshotCreatedDate = snapshotCreatedDate;
  }


  public ApiDashboardSnapshot dashboard(ApiDashboard dashboard) {
    this.dashboard = dashboard;
    return this;
  }

   /**
   * Get dashboard
   * @return dashboard
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DASHBOARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDashboard getDashboard() {
    return dashboard;
  }


  @JsonProperty(JSON_PROPERTY_DASHBOARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDashboard(ApiDashboard dashboard) {
    this.dashboard = dashboard;
  }


  public ApiDashboardSnapshot widgets(List<ApiWidget> widgets) {
    this.widgets = widgets;
    return this;
  }

  public ApiDashboardSnapshot addWidgetsItem(ApiWidget widgetsItem) {
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIDGETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiWidget> getWidgets() {
    return widgets;
  }


  @JsonProperty(JSON_PROPERTY_WIDGETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidgets(List<ApiWidget> widgets) {
    this.widgets = widgets;
  }


  public ApiDashboardSnapshot isScheduled(Boolean isScheduled) {
    this.isScheduled = isScheduled;
    return this;
  }

   /**
   * Set &#x60;true&#x60; if dashboard snapshot was generated from a schedule, &#x60;false&#x60; otherwise.
   * @return isScheduled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_SCHEDULED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsScheduled() {
    return isScheduled;
  }


  @JsonProperty(JSON_PROPERTY_IS_SCHEDULED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsScheduled(Boolean isScheduled) {
    this.isScheduled = isScheduled;
  }


  public ApiDashboardSnapshot timeSpan(ApiReportSnapshotTimeSpan timeSpan) {
    this.timeSpan = timeSpan;
    return this;
  }

   /**
   * Get timeSpan
   * @return timeSpan
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_SPAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiReportSnapshotTimeSpan getTimeSpan() {
    return timeSpan;
  }


  @JsonProperty(JSON_PROPERTY_TIME_SPAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeSpan(ApiReportSnapshotTimeSpan timeSpan) {
    this.timeSpan = timeSpan;
  }


  public ApiDashboardSnapshot snapshotExpirationDate(OffsetDateTime snapshotExpirationDate) {
    this.snapshotExpirationDate = snapshotExpirationDate;
    return this;
  }

   /**
   * Expiration date of the snapshot. If unspecified, the snapshot expires 1 year from its creation date. The expiration date must be set within 5 years from the current date and adhere to the ISO date-time format.
   * @return snapshotExpirationDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNAPSHOT_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getSnapshotExpirationDate() {
    return snapshotExpirationDate;
  }


  @JsonProperty(JSON_PROPERTY_SNAPSHOT_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnapshotExpirationDate(OffsetDateTime snapshotExpirationDate) {
    this.snapshotExpirationDate = snapshotExpirationDate;
  }


  public ApiDashboardSnapshot links(AppAndSelfLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppAndSelfLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(AppAndSelfLinks links) {
    this.links = links;
  }


  /**
   * Return true if this ApiDashboardSnapshot object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiDashboardSnapshot apiDashboardSnapshot = (ApiDashboardSnapshot) o;
    return Objects.equals(this.accountId, apiDashboardSnapshot.accountId) &&
        Objects.equals(this.createdDate, apiDashboardSnapshot.createdDate) &&
        Objects.equals(this.expirationDate, apiDashboardSnapshot.expirationDate) &&
        Objects.equals(this.permalink, apiDashboardSnapshot.permalink) &&
        Objects.equals(this.apiLinks, apiDashboardSnapshot.apiLinks) &&
        Objects.equals(this.snapshotId, apiDashboardSnapshot.snapshotId) &&
        Objects.equals(this.snapshotName, apiDashboardSnapshot.snapshotName) &&
        Objects.equals(this.aid, apiDashboardSnapshot.aid) &&
        Objects.equals(this.isShared, apiDashboardSnapshot.isShared) &&
        Objects.equals(this.snapshotCreatedDate, apiDashboardSnapshot.snapshotCreatedDate) &&
        Objects.equals(this.dashboard, apiDashboardSnapshot.dashboard) &&
        Objects.equals(this.widgets, apiDashboardSnapshot.widgets) &&
        Objects.equals(this.isScheduled, apiDashboardSnapshot.isScheduled) &&
        Objects.equals(this.timeSpan, apiDashboardSnapshot.timeSpan) &&
        Objects.equals(this.snapshotExpirationDate, apiDashboardSnapshot.snapshotExpirationDate) &&
        Objects.equals(this.links, apiDashboardSnapshot.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, createdDate, expirationDate, permalink, apiLinks, snapshotId, snapshotName, aid, isShared, snapshotCreatedDate, dashboard, widgets, isScheduled, timeSpan, snapshotExpirationDate, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiDashboardSnapshot {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    permalink: ").append(toIndentedString(permalink)).append("\n");
    sb.append("    apiLinks: ").append(toIndentedString(apiLinks)).append("\n");
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
    sb.append("    snapshotName: ").append(toIndentedString(snapshotName)).append("\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    isShared: ").append(toIndentedString(isShared)).append("\n");
    sb.append("    snapshotCreatedDate: ").append(toIndentedString(snapshotCreatedDate)).append("\n");
    sb.append("    dashboard: ").append(toIndentedString(dashboard)).append("\n");
    sb.append("    widgets: ").append(toIndentedString(widgets)).append("\n");
    sb.append("    isScheduled: ").append(toIndentedString(isScheduled)).append("\n");
    sb.append("    timeSpan: ").append(toIndentedString(timeSpan)).append("\n");
    sb.append("    snapshotExpirationDate: ").append(toIndentedString(snapshotExpirationDate)).append("\n");
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
}

