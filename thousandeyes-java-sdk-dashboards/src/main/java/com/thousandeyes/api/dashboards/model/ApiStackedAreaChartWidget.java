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
import com.thousandeyes.api.dashboards.model.ApiAggregateProperty;
import com.thousandeyes.api.dashboards.model.ApiDuration;
import com.thousandeyes.api.dashboards.model.ApiMultiMetricColumnFiltersValueInner;
import com.thousandeyes.api.dashboards.model.ApiWidgetFixedYScalePrefix;
import com.thousandeyes.api.dashboards.model.ApiWidgetMeasure;
import com.thousandeyes.api.dashboards.model.DashboardMetric;
import com.thousandeyes.api.dashboards.model.DashboardMetricDirection;
import com.thousandeyes.api.dashboards.model.MetricGroup;
import com.thousandeyes.api.dashboards.model.SelfLinksLinks;
import com.thousandeyes.api.dashboards.model.StackedAreaChartDatasource;
import com.thousandeyes.api.dashboards.model.VisualMode;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Displays line plots over time, stacking quantities vertically to showcase cumulative data trends, similar to stacked bar charts. Ideal for visualizing changes in response times, error counts, and other metrics, revealing the progression of values across a timeline. Use this chart to replace stacked bar charts for temporal data analysis.
 */
@JsonPropertyOrder({
  ApiStackedAreaChartWidget.JSON_PROPERTY_ID,
  ApiStackedAreaChartWidget.JSON_PROPERTY_TITLE,
  ApiStackedAreaChartWidget.JSON_PROPERTY_VISUAL_MODE,
  ApiStackedAreaChartWidget.JSON_PROPERTY_EMBED_URL,
  ApiStackedAreaChartWidget.JSON_PROPERTY_IS_EMBEDDED,
  ApiStackedAreaChartWidget.JSON_PROPERTY_METRIC_GROUP,
  ApiStackedAreaChartWidget.JSON_PROPERTY_DIRECTION,
  ApiStackedAreaChartWidget.JSON_PROPERTY_METRIC,
  ApiStackedAreaChartWidget.JSON_PROPERTY_FILTERS,
  ApiStackedAreaChartWidget.JSON_PROPERTY_MEASURE,
  ApiStackedAreaChartWidget.JSON_PROPERTY_FIXED_TIMESPAN,
  ApiStackedAreaChartWidget.JSON_PROPERTY_API_LINK,
  ApiStackedAreaChartWidget.JSON_PROPERTY_SHOULD_EXCLUDE_ALERT_SUPPRESSION_WINDOWS,
  ApiStackedAreaChartWidget.JSON_PROPERTY_LINKS,
  ApiStackedAreaChartWidget.JSON_PROPERTY_MIN_SCALE,
  ApiStackedAreaChartWidget.JSON_PROPERTY_MAX_SCALE,
  ApiStackedAreaChartWidget.JSON_PROPERTY_UNIT,
  ApiStackedAreaChartWidget.JSON_PROPERTY_TYPE,
  ApiStackedAreaChartWidget.JSON_PROPERTY_GROUP_BY,
  ApiStackedAreaChartWidget.JSON_PROPERTY_DATA_SOURCE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-02-07T22:58:18.098985Z[Europe/Lisbon]")
public class ApiStackedAreaChartWidget {
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
  private Map<String, Set<ApiMultiMetricColumnFiltersValueInner>> filters = new HashMap<>();

  public static final String JSON_PROPERTY_MEASURE = "measure";
  private ApiWidgetMeasure measure;

  public static final String JSON_PROPERTY_FIXED_TIMESPAN = "fixedTimespan";
  private ApiDuration fixedTimespan;

  public static final String JSON_PROPERTY_API_LINK = "apiLink";
  private String apiLink;

  public static final String JSON_PROPERTY_SHOULD_EXCLUDE_ALERT_SUPPRESSION_WINDOWS = "shouldExcludeAlertSuppressionWindows";
  private Boolean shouldExcludeAlertSuppressionWindows;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinksLinks links;

  public static final String JSON_PROPERTY_MIN_SCALE = "minScale";
  private Float minScale;

  public static final String JSON_PROPERTY_MAX_SCALE = "maxScale";
  private Float maxScale;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private ApiWidgetFixedYScalePrefix unit;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_GROUP_BY = "groupBy";
  private ApiAggregateProperty groupBy;

  public static final String JSON_PROPERTY_DATA_SOURCE = "dataSource";
  private StackedAreaChartDatasource dataSource;

  public ApiStackedAreaChartWidget() { 
  }

  @JsonCreator
  public ApiStackedAreaChartWidget(
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




  public ApiStackedAreaChartWidget title(String title) {
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


  public ApiStackedAreaChartWidget visualMode(VisualMode visualMode) {
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




  public ApiStackedAreaChartWidget isEmbedded(Boolean isEmbedded) {
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


  public ApiStackedAreaChartWidget metricGroup(MetricGroup metricGroup) {
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


  public ApiStackedAreaChartWidget direction(DashboardMetricDirection direction) {
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


  public ApiStackedAreaChartWidget metric(DashboardMetric metric) {
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


  public ApiStackedAreaChartWidget filters(Map<String, Set<ApiMultiMetricColumnFiltersValueInner>> filters) {
    this.filters = filters;
    return this;
  }

  public ApiStackedAreaChartWidget putFiltersItem(String key, Set<ApiMultiMetricColumnFiltersValueInner> filtersItem) {
    if (this.filters == null) {
      this.filters = new HashMap<>();
    }
    this.filters.put(key, filtersItem);
    return this;
  }

   /**
   * (Optional) Specifies the filters applied to the widget. When present, the &#x60;filters&#x60; property displays. Each filter object has two properties: &#x60;filterProperty&#x60; and &#x60;filterValue&#x60;. The &#x60;filterProperty&#x60; can be values like Agents, Agent Groups, Tests, Monitors, etc. The &#x60;filterValue&#x60; represents theIdentifierof the selected property.
   * @return filters
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Set<ApiMultiMetricColumnFiltersValueInner>> getFilters() {
    return filters;
  }


  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilters(Map<String, Set<ApiMultiMetricColumnFiltersValueInner>> filters) {
    this.filters = filters;
  }


  public ApiStackedAreaChartWidget measure(ApiWidgetMeasure measure) {
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


  public ApiStackedAreaChartWidget fixedTimespan(ApiDuration fixedTimespan) {
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




  public ApiStackedAreaChartWidget shouldExcludeAlertSuppressionWindows(Boolean shouldExcludeAlertSuppressionWindows) {
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


  public ApiStackedAreaChartWidget links(SelfLinksLinks links) {
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

  public SelfLinksLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(SelfLinksLinks links) {
    this.links = links;
  }


  public ApiStackedAreaChartWidget minScale(Float minScale) {
    this.minScale = minScale;
    return this;
  }

   /**
   * Minimum scale configured in the widget.
   * @return minScale
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN_SCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getMinScale() {
    return minScale;
  }


  @JsonProperty(JSON_PROPERTY_MIN_SCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinScale(Float minScale) {
    this.minScale = minScale;
  }


  public ApiStackedAreaChartWidget maxScale(Float maxScale) {
    this.maxScale = maxScale;
    return this;
  }

   /**
   * Maximum scale configured in the widget.
   * @return maxScale
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_SCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getMaxScale() {
    return maxScale;
  }


  @JsonProperty(JSON_PROPERTY_MAX_SCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxScale(Float maxScale) {
    this.maxScale = maxScale;
  }


  public ApiStackedAreaChartWidget unit(ApiWidgetFixedYScalePrefix unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiWidgetFixedYScalePrefix getUnit() {
    return unit;
  }


  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnit(ApiWidgetFixedYScalePrefix unit) {
    this.unit = unit;
  }


  public ApiStackedAreaChartWidget type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Time Series: Stacked Area widget type
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


  public ApiStackedAreaChartWidget groupBy(ApiAggregateProperty groupBy) {
    this.groupBy = groupBy;
    return this;
  }

   /**
   * Get groupBy
   * @return groupBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiAggregateProperty getGroupBy() {
    return groupBy;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupBy(ApiAggregateProperty groupBy) {
    this.groupBy = groupBy;
  }


  public ApiStackedAreaChartWidget dataSource(StackedAreaChartDatasource dataSource) {
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

  public StackedAreaChartDatasource getDataSource() {
    return dataSource;
  }


  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataSource(StackedAreaChartDatasource dataSource) {
    this.dataSource = dataSource;
  }


  /**
   * Return true if this ApiStackedAreaChartWidget object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiStackedAreaChartWidget apiStackedAreaChartWidget = (ApiStackedAreaChartWidget) o;
    return Objects.equals(this.id, apiStackedAreaChartWidget.id) &&
        Objects.equals(this.title, apiStackedAreaChartWidget.title) &&
        Objects.equals(this.visualMode, apiStackedAreaChartWidget.visualMode) &&
        Objects.equals(this.embedUrl, apiStackedAreaChartWidget.embedUrl) &&
        Objects.equals(this.isEmbedded, apiStackedAreaChartWidget.isEmbedded) &&
        Objects.equals(this.metricGroup, apiStackedAreaChartWidget.metricGroup) &&
        Objects.equals(this.direction, apiStackedAreaChartWidget.direction) &&
        Objects.equals(this.metric, apiStackedAreaChartWidget.metric) &&
        Objects.equals(this.filters, apiStackedAreaChartWidget.filters) &&
        Objects.equals(this.measure, apiStackedAreaChartWidget.measure) &&
        Objects.equals(this.fixedTimespan, apiStackedAreaChartWidget.fixedTimespan) &&
        Objects.equals(this.apiLink, apiStackedAreaChartWidget.apiLink) &&
        Objects.equals(this.shouldExcludeAlertSuppressionWindows, apiStackedAreaChartWidget.shouldExcludeAlertSuppressionWindows) &&
        Objects.equals(this.links, apiStackedAreaChartWidget.links) &&
        Objects.equals(this.minScale, apiStackedAreaChartWidget.minScale) &&
        Objects.equals(this.maxScale, apiStackedAreaChartWidget.maxScale) &&
        Objects.equals(this.unit, apiStackedAreaChartWidget.unit) &&
        Objects.equals(this.type, apiStackedAreaChartWidget.type) &&
        Objects.equals(this.groupBy, apiStackedAreaChartWidget.groupBy) &&
        Objects.equals(this.dataSource, apiStackedAreaChartWidget.dataSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, visualMode, embedUrl, isEmbedded, metricGroup, direction, metric, filters, measure, fixedTimespan, apiLink, shouldExcludeAlertSuppressionWindows, links, minScale, maxScale, unit, type, groupBy, dataSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiStackedAreaChartWidget {\n");
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
    sb.append("    minScale: ").append(toIndentedString(minScale)).append("\n");
    sb.append("    maxScale: ").append(toIndentedString(maxScale)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
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

