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
import com.thousandeyes.sdk.dashboards.model.ApiDuration;
import com.thousandeyes.sdk.dashboards.model.ApiNumbersCard;
import com.thousandeyes.sdk.dashboards.model.ApiWidgetMeasure;
import com.thousandeyes.sdk.dashboards.model.DashboardMetric;
import com.thousandeyes.sdk.dashboards.model.DashboardMetricDirection;
import com.thousandeyes.sdk.dashboards.model.MetricGroup;
import com.thousandeyes.sdk.dashboards.model.NumbersCardDatasource;
import com.thousandeyes.sdk.dashboards.model.SelfLinks;
import com.thousandeyes.sdk.dashboards.model.VisualMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A widget composed of multiple cards, each presenting a singular metric, such as average packet loss, page load time, or alert count.
 */
@JsonPropertyOrder({
  ApiNumbersCardWidget.JSON_PROPERTY_ID,
  ApiNumbersCardWidget.JSON_PROPERTY_TITLE,
  ApiNumbersCardWidget.JSON_PROPERTY_VISUAL_MODE,
  ApiNumbersCardWidget.JSON_PROPERTY_EMBED_URL,
  ApiNumbersCardWidget.JSON_PROPERTY_IS_EMBEDDED,
  ApiNumbersCardWidget.JSON_PROPERTY_METRIC_GROUP,
  ApiNumbersCardWidget.JSON_PROPERTY_DIRECTION,
  ApiNumbersCardWidget.JSON_PROPERTY_METRIC,
  ApiNumbersCardWidget.JSON_PROPERTY_FILTERS,
  ApiNumbersCardWidget.JSON_PROPERTY_MEASURE,
  ApiNumbersCardWidget.JSON_PROPERTY_FIXED_TIMESPAN,
  ApiNumbersCardWidget.JSON_PROPERTY_API_LINK,
  ApiNumbersCardWidget.JSON_PROPERTY_SHOULD_EXCLUDE_ALERT_SUPPRESSION_WINDOWS,
  ApiNumbersCardWidget.JSON_PROPERTY_LINKS,
  ApiNumbersCardWidget.JSON_PROPERTY_TYPE,
  ApiNumbersCardWidget.JSON_PROPERTY_NUMBER_CARDS,
  ApiNumbersCardWidget.JSON_PROPERTY_DATA_SOURCE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ApiNumbersCardWidget {
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

  public static final String JSON_PROPERTY_NUMBER_CARDS = "numberCards";
  private List<ApiNumbersCard> numberCards = new ArrayList<>();

  public static final String JSON_PROPERTY_DATA_SOURCE = "dataSource";
  private NumbersCardDatasource dataSource;

  public ApiNumbersCardWidget() { 
  }

  @JsonCreator
  public ApiNumbersCardWidget(
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




  public ApiNumbersCardWidget title(String title) {
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


  public ApiNumbersCardWidget visualMode(VisualMode visualMode) {
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




  public ApiNumbersCardWidget isEmbedded(Boolean isEmbedded) {
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


  public ApiNumbersCardWidget metricGroup(MetricGroup metricGroup) {
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


  public ApiNumbersCardWidget direction(DashboardMetricDirection direction) {
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


  public ApiNumbersCardWidget metric(DashboardMetric metric) {
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


  public ApiNumbersCardWidget filters(Map<String, Set<Object>> filters) {
    this.filters = filters;
    return this;
  }

  public ApiNumbersCardWidget putFiltersItem(String key, Set<Object> filtersItem) {
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


  public ApiNumbersCardWidget measure(ApiWidgetMeasure measure) {
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


  public ApiNumbersCardWidget fixedTimespan(ApiDuration fixedTimespan) {
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




  public ApiNumbersCardWidget shouldExcludeAlertSuppressionWindows(Boolean shouldExcludeAlertSuppressionWindows) {
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


  public ApiNumbersCardWidget links(SelfLinks links) {
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


  public ApiNumbersCardWidget type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Number widget type.
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


  public ApiNumbersCardWidget numberCards(List<ApiNumbersCard> numberCards) {
    this.numberCards = numberCards;
    return this;
  }

  public ApiNumbersCardWidget addNumberCardsItem(ApiNumbersCard numberCardsItem) {
    if (this.numberCards == null) {
      this.numberCards = new ArrayList<>();
    }
    this.numberCards.add(numberCardsItem);
    return this;
  }

   /**
   * Get numberCards
   * @return numberCards
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_CARDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiNumbersCard> getNumberCards() {
    return numberCards;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_CARDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberCards(List<ApiNumbersCard> numberCards) {
    this.numberCards = numberCards;
  }


  public ApiNumbersCardWidget dataSource(NumbersCardDatasource dataSource) {
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

  public NumbersCardDatasource getDataSource() {
    return dataSource;
  }


  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataSource(NumbersCardDatasource dataSource) {
    this.dataSource = dataSource;
  }


  /**
   * Return true if this ApiNumbersCardWidget object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiNumbersCardWidget apiNumbersCardWidget = (ApiNumbersCardWidget) o;
    return Objects.equals(this.id, apiNumbersCardWidget.id) &&
        Objects.equals(this.title, apiNumbersCardWidget.title) &&
        Objects.equals(this.visualMode, apiNumbersCardWidget.visualMode) &&
        Objects.equals(this.embedUrl, apiNumbersCardWidget.embedUrl) &&
        Objects.equals(this.isEmbedded, apiNumbersCardWidget.isEmbedded) &&
        Objects.equals(this.metricGroup, apiNumbersCardWidget.metricGroup) &&
        Objects.equals(this.direction, apiNumbersCardWidget.direction) &&
        Objects.equals(this.metric, apiNumbersCardWidget.metric) &&
        Objects.equals(this.filters, apiNumbersCardWidget.filters) &&
        Objects.equals(this.measure, apiNumbersCardWidget.measure) &&
        Objects.equals(this.fixedTimespan, apiNumbersCardWidget.fixedTimespan) &&
        Objects.equals(this.apiLink, apiNumbersCardWidget.apiLink) &&
        Objects.equals(this.shouldExcludeAlertSuppressionWindows, apiNumbersCardWidget.shouldExcludeAlertSuppressionWindows) &&
        Objects.equals(this.links, apiNumbersCardWidget.links) &&
        Objects.equals(this.type, apiNumbersCardWidget.type) &&
        Objects.equals(this.numberCards, apiNumbersCardWidget.numberCards) &&
        Objects.equals(this.dataSource, apiNumbersCardWidget.dataSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, visualMode, embedUrl, isEmbedded, metricGroup, direction, metric, filters, measure, fixedTimespan, apiLink, shouldExcludeAlertSuppressionWindows, links, type, numberCards, dataSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiNumbersCardWidget {\n");
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
    sb.append("    numberCards: ").append(toIndentedString(numberCards)).append("\n");
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

