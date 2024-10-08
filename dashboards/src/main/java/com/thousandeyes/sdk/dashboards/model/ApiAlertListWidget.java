/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
 *
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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.thousandeyes.sdk.dashboards.model.ActiveWithin;
import com.thousandeyes.sdk.dashboards.model.AlertListDatasource;
import com.thousandeyes.sdk.dashboards.model.ApiDuration;
import com.thousandeyes.sdk.dashboards.model.ApiWidgetMeasure;
import com.thousandeyes.sdk.dashboards.model.DashboardMetric;
import com.thousandeyes.sdk.dashboards.model.DashboardMetricDirection;
import com.thousandeyes.sdk.dashboards.model.LegacyAlertListAlertType;
import com.thousandeyes.sdk.dashboards.model.MetricGroup;
import com.thousandeyes.sdk.dashboards.model.SelfLinks;
import com.thousandeyes.sdk.dashboards.model.VisualMode;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ApiAlertListWidget
 */
@JsonPropertyOrder({
  ApiAlertListWidget.JSON_PROPERTY_ID,
  ApiAlertListWidget.JSON_PROPERTY_TITLE,
  ApiAlertListWidget.JSON_PROPERTY_VISUAL_MODE,
  ApiAlertListWidget.JSON_PROPERTY_EMBED_URL,
  ApiAlertListWidget.JSON_PROPERTY_IS_EMBEDDED,
  ApiAlertListWidget.JSON_PROPERTY_METRIC_GROUP,
  ApiAlertListWidget.JSON_PROPERTY_DIRECTION,
  ApiAlertListWidget.JSON_PROPERTY_METRIC,
  ApiAlertListWidget.JSON_PROPERTY_FILTERS,
  ApiAlertListWidget.JSON_PROPERTY_MEASURE,
  ApiAlertListWidget.JSON_PROPERTY_FIXED_TIMESPAN,
  ApiAlertListWidget.JSON_PROPERTY_API_LINK,
  ApiAlertListWidget.JSON_PROPERTY_SHOULD_EXCLUDE_ALERT_SUPPRESSION_WINDOWS,
  ApiAlertListWidget.JSON_PROPERTY_LINKS,
  ApiAlertListWidget.JSON_PROPERTY_TYPE,
  ApiAlertListWidget.JSON_PROPERTY_ALERT_TYPES,
  ApiAlertListWidget.JSON_PROPERTY_LIMIT_TO,
  ApiAlertListWidget.JSON_PROPERTY_ACTIVE_WITHIN,
  ApiAlertListWidget.JSON_PROPERTY_DATA_SOURCE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ApiAlertListWidget {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_VISUAL_MODE = "visualMode";
  private VisualMode visualMode = VisualMode.FULL;

  public static final String JSON_PROPERTY_EMBED_URL = "embedUrl";
  private String embedUrl;

  public static final String JSON_PROPERTY_IS_EMBEDDED = "isEmbedded";
  private Boolean isEmbedded;

  public static final String JSON_PROPERTY_METRIC_GROUP = "metricGroup";
  private MetricGroup metricGroup;

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private DashboardMetricDirection direction;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private DashboardMetric metric;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private Map<String, Set<Object>> filters = new HashMap<>();

  public static final String JSON_PROPERTY_MEASURE = "measure";
  private ApiWidgetMeasure measure;

  public static final String JSON_PROPERTY_FIXED_TIMESPAN = "fixedTimespan";
  private ApiDuration fixedTimespan;

  public static final String JSON_PROPERTY_API_LINK = "apiLink";
  private String apiLink;

  public static final String JSON_PROPERTY_SHOULD_EXCLUDE_ALERT_SUPPRESSION_WINDOWS = "shouldExcludeAlertSuppressionWindows";
  private Boolean shouldExcludeAlertSuppressionWindows;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinks links;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_ALERT_TYPES = "alertTypes";
  private Set<LegacyAlertListAlertType> alertTypes = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_LIMIT_TO = "limitTo";
  private Integer limitTo;

  public static final String JSON_PROPERTY_ACTIVE_WITHIN = "activeWithin";
  private ActiveWithin activeWithin;

  public static final String JSON_PROPERTY_DATA_SOURCE = "dataSource";
  private AlertListDatasource dataSource;

  public ApiAlertListWidget() { 
  }

  @JsonCreator
  public ApiAlertListWidget(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_EMBED_URL) String embedUrl, 
    @JsonProperty(JSON_PROPERTY_API_LINK) String apiLink
  ) {
  this();
    this.id = id;
    this.embedUrl = embedUrl;
    this.apiLink = apiLink;
  }

   /**
   * Identifier of the widget.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




  public ApiAlertListWidget title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title of the widget
   * @return title
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public ApiAlertListWidget visualMode(VisualMode visualMode) {
    this.visualMode = visualMode;
    return this;
  }

   /**
   * Get visualMode
   * @return visualMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISUAL_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VisualMode getVisualMode() {
    return visualMode;
  }


  @JsonProperty(JSON_PROPERTY_VISUAL_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisualMode(VisualMode visualMode) {
    this.visualMode = visualMode;
  }


   /**
   * When &#x60;isEmbedded&#x60; is set to &#x60;true&#x60;, an &#x60;embedUrl&#x60; is provided.
   * @return embedUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMBED_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmbedUrl() {
    return embedUrl;
  }




  public ApiAlertListWidget isEmbedded(Boolean isEmbedded) {
    this.isEmbedded = isEmbedded;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; if widget is marked as embedded; otherwise, set to &#x60;false&#x60;.
   * @return isEmbedded
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_EMBEDDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEmbedded() {
    return isEmbedded;
  }


  @JsonProperty(JSON_PROPERTY_IS_EMBEDDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsEmbedded(Boolean isEmbedded) {
    this.isEmbedded = isEmbedded;
  }


  public ApiAlertListWidget metricGroup(MetricGroup metricGroup) {
    this.metricGroup = metricGroup;
    return this;
  }

   /**
   * Get metricGroup
   * @return metricGroup
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MetricGroup getMetricGroup() {
    return metricGroup;
  }


  @JsonProperty(JSON_PROPERTY_METRIC_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetricGroup(MetricGroup metricGroup) {
    this.metricGroup = metricGroup;
  }


  public ApiAlertListWidget direction(DashboardMetricDirection direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DashboardMetricDirection getDirection() {
    return direction;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirection(DashboardMetricDirection direction) {
    this.direction = direction;
  }


  public ApiAlertListWidget metric(DashboardMetric metric) {
    this.metric = metric;
    return this;
  }

   /**
   * Get metric
   * @return metric
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DashboardMetric getMetric() {
    return metric;
  }


  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetric(DashboardMetric metric) {
    this.metric = metric;
  }


  public ApiAlertListWidget filters(Map<String, Set<Object>> filters) {
    this.filters = filters;
    return this;
  }

  public ApiAlertListWidget putFiltersItem(String key, Set<Object> filtersItem) {
    if (this.filters == null) {
      this.filters = new HashMap<>();
    }
    this.filters.put(key, filtersItem);
    return this;
  }

   /**
   * (Optional) Specifies the filters applied to the widget. When present, the &#x60;filters&#x60; property displays. Each filter object has two properties: &#x60;filterProperty&#x60; and &#x60;filterValue&#x60;. The &#x60;filterProperty&#x60; can be values like &#x60;AGENT&#x60;, &#x60;ENDPOINT_MACHINE_ID&#x60;, &#x60;TEST&#x60;, &#x60;MONITOR&#x60;, etc.  The &#x60;filterValue&#x60; represents an identifier array of the selected property.
   * @return filters
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Set<Object>> getFilters() {
    return filters;
  }


  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilters(Map<String, Set<Object>> filters) {
    this.filters = filters;
  }


  public ApiAlertListWidget measure(ApiWidgetMeasure measure) {
    this.measure = measure;
    return this;
  }

   /**
   * Get measure
   * @return measure
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEASURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiWidgetMeasure getMeasure() {
    return measure;
  }


  @JsonProperty(JSON_PROPERTY_MEASURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeasure(ApiWidgetMeasure measure) {
    this.measure = measure;
  }


  public ApiAlertListWidget fixedTimespan(ApiDuration fixedTimespan) {
    this.fixedTimespan = fixedTimespan;
    return this;
  }

   /**
   * Get fixedTimespan
   * @return fixedTimespan
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIXED_TIMESPAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDuration getFixedTimespan() {
    return fixedTimespan;
  }


  @JsonProperty(JSON_PROPERTY_FIXED_TIMESPAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFixedTimespan(ApiDuration fixedTimespan) {
    this.fixedTimespan = fixedTimespan;
  }


   /**
   * Get apiLink
   * @return apiLink
   * @deprecated
  **/
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApiLink() {
    return apiLink;
  }




  public ApiAlertListWidget shouldExcludeAlertSuppressionWindows(Boolean shouldExcludeAlertSuppressionWindows) {
    this.shouldExcludeAlertSuppressionWindows = shouldExcludeAlertSuppressionWindows;
    return this;
  }

   /**
   * Excludes alert suppression window data if set to &#x60;true&#x60;.
   * @return shouldExcludeAlertSuppressionWindows
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOULD_EXCLUDE_ALERT_SUPPRESSION_WINDOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShouldExcludeAlertSuppressionWindows() {
    return shouldExcludeAlertSuppressionWindows;
  }


  @JsonProperty(JSON_PROPERTY_SHOULD_EXCLUDE_ALERT_SUPPRESSION_WINDOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShouldExcludeAlertSuppressionWindows(Boolean shouldExcludeAlertSuppressionWindows) {
    this.shouldExcludeAlertSuppressionWindows = shouldExcludeAlertSuppressionWindows;
  }


  public ApiAlertListWidget links(SelfLinks links) {
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

  public SelfLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(SelfLinks links) {
    this.links = links;
  }


  public ApiAlertListWidget type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Alert List widget type.
   * @return type
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  public ApiAlertListWidget alertTypes(Set<LegacyAlertListAlertType> alertTypes) {
    this.alertTypes = alertTypes;
    return this;
  }

  public ApiAlertListWidget addAlertTypesItem(LegacyAlertListAlertType alertTypesItem) {
    if (this.alertTypes == null) {
      this.alertTypes = new LinkedHashSet<>();
    }
    this.alertTypes.add(alertTypesItem);
    return this;
  }

   /**
   * List of alert types configured in the widget, an empty list means all alert types.
   * @return alertTypes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERT_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<LegacyAlertListAlertType> getAlertTypes() {
    return alertTypes;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_ALERT_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlertTypes(Set<LegacyAlertListAlertType> alertTypes) {
    this.alertTypes = alertTypes;
  }


  public ApiAlertListWidget limitTo(Integer limitTo) {
    this.limitTo = limitTo;
    return this;
  }

   /**
   * Limit the number of alerts displayed in the widget.
   * @return limitTo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimitTo() {
    return limitTo;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimitTo(Integer limitTo) {
    this.limitTo = limitTo;
  }


  public ApiAlertListWidget activeWithin(ActiveWithin activeWithin) {
    this.activeWithin = activeWithin;
    return this;
  }

   /**
   * Get activeWithin
   * @return activeWithin
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE_WITHIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActiveWithin getActiveWithin() {
    return activeWithin;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_WITHIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveWithin(ActiveWithin activeWithin) {
    this.activeWithin = activeWithin;
  }


  public ApiAlertListWidget dataSource(AlertListDatasource dataSource) {
    this.dataSource = dataSource;
    return this;
  }

   /**
   * Get dataSource
   * @return dataSource
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AlertListDatasource getDataSource() {
    return dataSource;
  }


  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataSource(AlertListDatasource dataSource) {
    this.dataSource = dataSource;
  }


  /**
   * Return true if this ApiAlertListWidget object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiAlertListWidget apiAlertListWidget = (ApiAlertListWidget) o;
    return Objects.equals(this.id, apiAlertListWidget.id) &&
        Objects.equals(this.title, apiAlertListWidget.title) &&
        Objects.equals(this.visualMode, apiAlertListWidget.visualMode) &&
        Objects.equals(this.embedUrl, apiAlertListWidget.embedUrl) &&
        Objects.equals(this.isEmbedded, apiAlertListWidget.isEmbedded) &&
        Objects.equals(this.metricGroup, apiAlertListWidget.metricGroup) &&
        Objects.equals(this.direction, apiAlertListWidget.direction) &&
        Objects.equals(this.metric, apiAlertListWidget.metric) &&
        Objects.equals(this.filters, apiAlertListWidget.filters) &&
        Objects.equals(this.measure, apiAlertListWidget.measure) &&
        Objects.equals(this.fixedTimespan, apiAlertListWidget.fixedTimespan) &&
        Objects.equals(this.apiLink, apiAlertListWidget.apiLink) &&
        Objects.equals(this.shouldExcludeAlertSuppressionWindows, apiAlertListWidget.shouldExcludeAlertSuppressionWindows) &&
        Objects.equals(this.links, apiAlertListWidget.links) &&
        Objects.equals(this.type, apiAlertListWidget.type) &&
        Objects.equals(this.alertTypes, apiAlertListWidget.alertTypes) &&
        Objects.equals(this.limitTo, apiAlertListWidget.limitTo) &&
        Objects.equals(this.activeWithin, apiAlertListWidget.activeWithin) &&
        Objects.equals(this.dataSource, apiAlertListWidget.dataSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, visualMode, embedUrl, isEmbedded, metricGroup, direction, metric, filters, measure, fixedTimespan, apiLink, shouldExcludeAlertSuppressionWindows, links, type, alertTypes, limitTo, activeWithin, dataSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiAlertListWidget {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    visualMode: ").append(toIndentedString(visualMode)).append("\n");
    sb.append("    embedUrl: ").append(toIndentedString(embedUrl)).append("\n");
    sb.append("    isEmbedded: ").append(toIndentedString(isEmbedded)).append("\n");
    sb.append("    metricGroup: ").append(toIndentedString(metricGroup)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    measure: ").append(toIndentedString(measure)).append("\n");
    sb.append("    fixedTimespan: ").append(toIndentedString(fixedTimespan)).append("\n");
    sb.append("    apiLink: ").append(toIndentedString(apiLink)).append("\n");
    sb.append("    shouldExcludeAlertSuppressionWindows: ").append(toIndentedString(shouldExcludeAlertSuppressionWindows)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    alertTypes: ").append(toIndentedString(alertTypes)).append("\n");
    sb.append("    limitTo: ").append(toIndentedString(limitTo)).append("\n");
    sb.append("    activeWithin: ").append(toIndentedString(activeWithin)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
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

