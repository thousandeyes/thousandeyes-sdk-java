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
import com.thousandeyes.api.dashboards.model.ApiAggregateProperty;
import com.thousandeyes.api.dashboards.model.ApiDuration;
import com.thousandeyes.api.dashboards.model.ApiWidgetFixedYScalePrefix;
import com.thousandeyes.api.dashboards.model.ApiWidgetMeasure;
import com.thousandeyes.api.dashboards.model.DashboardMetric;
import com.thousandeyes.api.dashboards.model.DashboardMetricDirection;
import com.thousandeyes.api.dashboards.model.MetricGroup;
import com.thousandeyes.api.dashboards.model.SelfLinksLinks;
import com.thousandeyes.api.dashboards.model.TimeseriesDatasource;
import com.thousandeyes.api.dashboards.model.VisualMode;
import com.thousandeyes.api.dashboards.model.WidgetType;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
 * The Timeseries widget graphs data over time, with the chosen metric displayed on the vertical axis. vertical axis
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T14:43:29.147613Z[Europe/Lisbon]")
public class ApiTimeseriesWidget {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private WidgetType type;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_VISUAL_MODE = "visualMode";
  @SerializedName(SERIALIZED_NAME_VISUAL_MODE)
  private VisualMode visualMode = VisualMode.FULL;

  public static final String SERIALIZED_NAME_EMBED_URL = "embedUrl";
  @SerializedName(SERIALIZED_NAME_EMBED_URL)
  private String embedUrl;

  public static final String SERIALIZED_NAME_IS_EMBEDDED = "isEmbedded";
  @SerializedName(SERIALIZED_NAME_IS_EMBEDDED)
  private Boolean isEmbedded;

  public static final String SERIALIZED_NAME_METRIC_GROUP = "metricGroup";
  @SerializedName(SERIALIZED_NAME_METRIC_GROUP)
  private MetricGroup metricGroup;

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private DashboardMetricDirection direction;

  public static final String SERIALIZED_NAME_METRIC = "metric";
  @SerializedName(SERIALIZED_NAME_METRIC)
  private DashboardMetric metric;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private Map<String, Set<Object>> filters = new HashMap<>();

  public static final String SERIALIZED_NAME_MEASURE = "measure";
  @SerializedName(SERIALIZED_NAME_MEASURE)
  private ApiWidgetMeasure measure;

  public static final String SERIALIZED_NAME_FIXED_TIMESPAN = "fixedTimespan";
  @SerializedName(SERIALIZED_NAME_FIXED_TIMESPAN)
  private ApiDuration fixedTimespan;

  public static final String SERIALIZED_NAME_API_LINK = "apiLink";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_API_LINK)
  private String apiLink;

  public static final String SERIALIZED_NAME_SHOULD_EXCLUDE_ALERT_SUPPRESSION_WINDOWS = "shouldExcludeAlertSuppressionWindows";
  @SerializedName(SERIALIZED_NAME_SHOULD_EXCLUDE_ALERT_SUPPRESSION_WINDOWS)
  private Boolean shouldExcludeAlertSuppressionWindows;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private SelfLinksLinks links;

  public static final String SERIALIZED_NAME_MIN_SCALE = "minScale";
  @SerializedName(SERIALIZED_NAME_MIN_SCALE)
  private Float minScale;

  public static final String SERIALIZED_NAME_MAX_SCALE = "maxScale";
  @SerializedName(SERIALIZED_NAME_MAX_SCALE)
  private Float maxScale;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private ApiWidgetFixedYScalePrefix unit;

  public static final String SERIALIZED_NAME_SHOW_TIMESERIES_OVERALL_BASELINE = "showTimeseriesOverallBaseline";
  @SerializedName(SERIALIZED_NAME_SHOW_TIMESERIES_OVERALL_BASELINE)
  private Boolean showTimeseriesOverallBaseline;

  public static final String SERIALIZED_NAME_GROUP_BY = "groupBy";
  @SerializedName(SERIALIZED_NAME_GROUP_BY)
  private ApiAggregateProperty groupBy;

  public static final String SERIALIZED_NAME_IS_TIMESERIES_ONE_CHART_PER_LINE = "isTimeseriesOneChartPerLine";
  @SerializedName(SERIALIZED_NAME_IS_TIMESERIES_ONE_CHART_PER_LINE)
  private Boolean isTimeseriesOneChartPerLine;

  public static final String SERIALIZED_NAME_DATA_SOURCE = "dataSource";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE)
  private TimeseriesDatasource dataSource;

  public ApiTimeseriesWidget() {
  }

  
  public ApiTimeseriesWidget(
     String embedUrl, 
     String apiLink
  ) {
    this();
    this.embedUrl = embedUrl;
    this.apiLink = apiLink;
  }

  public ApiTimeseriesWidget id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Identifier of the widget.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ApiTimeseriesWidget type(WidgetType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public WidgetType getType() {
    return type;
  }


  public void setType(WidgetType type) {
    this.type = type;
  }


  public ApiTimeseriesWidget title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Title of the widget
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ApiTimeseriesWidget visualMode(VisualMode visualMode) {
    
    this.visualMode = visualMode;
    return this;
  }

   /**
   * Get visualMode
   * @return visualMode
  **/
  @javax.annotation.Nullable
  public VisualMode getVisualMode() {
    return visualMode;
  }


  public void setVisualMode(VisualMode visualMode) {
    this.visualMode = visualMode;
  }


   /**
   * When &#x60;isEmbedded&#x60; is set to &#x60;true&#x60;, an &#x60;embedUrl&#x60; is provided.
   * @return embedUrl
  **/
  @javax.annotation.Nullable
  public String getEmbedUrl() {
    return embedUrl;
  }




  public ApiTimeseriesWidget isEmbedded(Boolean isEmbedded) {
    
    this.isEmbedded = isEmbedded;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; if widget is marked as embedded; otherwise, set to &#x60;false&#x60;.
   * @return isEmbedded
  **/
  @javax.annotation.Nullable
  public Boolean getIsEmbedded() {
    return isEmbedded;
  }


  public void setIsEmbedded(Boolean isEmbedded) {
    this.isEmbedded = isEmbedded;
  }


  public ApiTimeseriesWidget metricGroup(MetricGroup metricGroup) {
    
    this.metricGroup = metricGroup;
    return this;
  }

   /**
   * Get metricGroup
   * @return metricGroup
  **/
  @javax.annotation.Nullable
  public MetricGroup getMetricGroup() {
    return metricGroup;
  }


  public void setMetricGroup(MetricGroup metricGroup) {
    this.metricGroup = metricGroup;
  }


  public ApiTimeseriesWidget direction(DashboardMetricDirection direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @javax.annotation.Nullable
  public DashboardMetricDirection getDirection() {
    return direction;
  }


  public void setDirection(DashboardMetricDirection direction) {
    this.direction = direction;
  }


  public ApiTimeseriesWidget metric(DashboardMetric metric) {
    
    this.metric = metric;
    return this;
  }

   /**
   * Get metric
   * @return metric
  **/
  @javax.annotation.Nullable
  public DashboardMetric getMetric() {
    return metric;
  }


  public void setMetric(DashboardMetric metric) {
    this.metric = metric;
  }


  public ApiTimeseriesWidget filters(Map<String, Set<Object>> filters) {
    
    this.filters = filters;
    return this;
  }

  public ApiTimeseriesWidget putFiltersItem(String key, Set<Object> filtersItem) {
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
  @javax.annotation.Nullable
  public Map<String, Set<Object>> getFilters() {
    return filters;
  }


  public void setFilters(Map<String, Set<Object>> filters) {
    this.filters = filters;
  }


  public ApiTimeseriesWidget measure(ApiWidgetMeasure measure) {
    
    this.measure = measure;
    return this;
  }

   /**
   * Get measure
   * @return measure
  **/
  @javax.annotation.Nullable
  public ApiWidgetMeasure getMeasure() {
    return measure;
  }


  public void setMeasure(ApiWidgetMeasure measure) {
    this.measure = measure;
  }


  public ApiTimeseriesWidget fixedTimespan(ApiDuration fixedTimespan) {
    
    this.fixedTimespan = fixedTimespan;
    return this;
  }

   /**
   * Get fixedTimespan
   * @return fixedTimespan
  **/
  @javax.annotation.Nullable
  public ApiDuration getFixedTimespan() {
    return fixedTimespan;
  }


  public void setFixedTimespan(ApiDuration fixedTimespan) {
    this.fixedTimespan = fixedTimespan;
  }


   /**
   * Get apiLink
   * @return apiLink
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  public String getApiLink() {
    return apiLink;
  }




  public ApiTimeseriesWidget shouldExcludeAlertSuppressionWindows(Boolean shouldExcludeAlertSuppressionWindows) {
    
    this.shouldExcludeAlertSuppressionWindows = shouldExcludeAlertSuppressionWindows;
    return this;
  }

   /**
   * Excludes alert suppression window data if set to &#x60;true&#x60;.
   * @return shouldExcludeAlertSuppressionWindows
  **/
  @javax.annotation.Nullable
  public Boolean getShouldExcludeAlertSuppressionWindows() {
    return shouldExcludeAlertSuppressionWindows;
  }


  public void setShouldExcludeAlertSuppressionWindows(Boolean shouldExcludeAlertSuppressionWindows) {
    this.shouldExcludeAlertSuppressionWindows = shouldExcludeAlertSuppressionWindows;
  }


  public ApiTimeseriesWidget links(SelfLinksLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public SelfLinksLinks getLinks() {
    return links;
  }


  public void setLinks(SelfLinksLinks links) {
    this.links = links;
  }


  public ApiTimeseriesWidget minScale(Float minScale) {
    
    this.minScale = minScale;
    return this;
  }

   /**
   * Minimum scale configured in the widget.
   * @return minScale
  **/
  @javax.annotation.Nullable
  public Float getMinScale() {
    return minScale;
  }


  public void setMinScale(Float minScale) {
    this.minScale = minScale;
  }


  public ApiTimeseriesWidget maxScale(Float maxScale) {
    
    this.maxScale = maxScale;
    return this;
  }

   /**
   * Maximum scale configured in the widget.
   * @return maxScale
  **/
  @javax.annotation.Nullable
  public Float getMaxScale() {
    return maxScale;
  }


  public void setMaxScale(Float maxScale) {
    this.maxScale = maxScale;
  }


  public ApiTimeseriesWidget unit(ApiWidgetFixedYScalePrefix unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @javax.annotation.Nullable
  public ApiWidgetFixedYScalePrefix getUnit() {
    return unit;
  }


  public void setUnit(ApiWidgetFixedYScalePrefix unit) {
    this.unit = unit;
  }


  public ApiTimeseriesWidget showTimeseriesOverallBaseline(Boolean showTimeseriesOverallBaseline) {
    
    this.showTimeseriesOverallBaseline = showTimeseriesOverallBaseline;
    return this;
  }

   /**
   * Displays the overall baseline if set to &#x60;true&#x60;.
   * @return showTimeseriesOverallBaseline
  **/
  @javax.annotation.Nullable
  public Boolean getShowTimeseriesOverallBaseline() {
    return showTimeseriesOverallBaseline;
  }


  public void setShowTimeseriesOverallBaseline(Boolean showTimeseriesOverallBaseline) {
    this.showTimeseriesOverallBaseline = showTimeseriesOverallBaseline;
  }


  public ApiTimeseriesWidget groupBy(ApiAggregateProperty groupBy) {
    
    this.groupBy = groupBy;
    return this;
  }

   /**
   * Get groupBy
   * @return groupBy
  **/
  @javax.annotation.Nullable
  public ApiAggregateProperty getGroupBy() {
    return groupBy;
  }


  public void setGroupBy(ApiAggregateProperty groupBy) {
    this.groupBy = groupBy;
  }


  public ApiTimeseriesWidget isTimeseriesOneChartPerLine(Boolean isTimeseriesOneChartPerLine) {
    
    this.isTimeseriesOneChartPerLine = isTimeseriesOneChartPerLine;
    return this;
  }

   /**
   * Displays a separate chart for each line if set to &#x60;true&#x60;.
   * @return isTimeseriesOneChartPerLine
  **/
  @javax.annotation.Nullable
  public Boolean getIsTimeseriesOneChartPerLine() {
    return isTimeseriesOneChartPerLine;
  }


  public void setIsTimeseriesOneChartPerLine(Boolean isTimeseriesOneChartPerLine) {
    this.isTimeseriesOneChartPerLine = isTimeseriesOneChartPerLine;
  }


  public ApiTimeseriesWidget dataSource(TimeseriesDatasource dataSource) {
    
    this.dataSource = dataSource;
    return this;
  }

   /**
   * Get dataSource
   * @return dataSource
  **/
  @javax.annotation.Nullable
  public TimeseriesDatasource getDataSource() {
    return dataSource;
  }


  public void setDataSource(TimeseriesDatasource dataSource) {
    this.dataSource = dataSource;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiTimeseriesWidget apiTimeseriesWidget = (ApiTimeseriesWidget) o;
    return Objects.equals(this.id, apiTimeseriesWidget.id) &&
        Objects.equals(this.type, apiTimeseriesWidget.type) &&
        Objects.equals(this.title, apiTimeseriesWidget.title) &&
        Objects.equals(this.visualMode, apiTimeseriesWidget.visualMode) &&
        Objects.equals(this.embedUrl, apiTimeseriesWidget.embedUrl) &&
        Objects.equals(this.isEmbedded, apiTimeseriesWidget.isEmbedded) &&
        Objects.equals(this.metricGroup, apiTimeseriesWidget.metricGroup) &&
        Objects.equals(this.direction, apiTimeseriesWidget.direction) &&
        Objects.equals(this.metric, apiTimeseriesWidget.metric) &&
        Objects.equals(this.filters, apiTimeseriesWidget.filters) &&
        Objects.equals(this.measure, apiTimeseriesWidget.measure) &&
        Objects.equals(this.fixedTimespan, apiTimeseriesWidget.fixedTimespan) &&
        Objects.equals(this.apiLink, apiTimeseriesWidget.apiLink) &&
        Objects.equals(this.shouldExcludeAlertSuppressionWindows, apiTimeseriesWidget.shouldExcludeAlertSuppressionWindows) &&
        Objects.equals(this.links, apiTimeseriesWidget.links) &&
        Objects.equals(this.minScale, apiTimeseriesWidget.minScale) &&
        Objects.equals(this.maxScale, apiTimeseriesWidget.maxScale) &&
        Objects.equals(this.unit, apiTimeseriesWidget.unit) &&
        Objects.equals(this.showTimeseriesOverallBaseline, apiTimeseriesWidget.showTimeseriesOverallBaseline) &&
        Objects.equals(this.groupBy, apiTimeseriesWidget.groupBy) &&
        Objects.equals(this.isTimeseriesOneChartPerLine, apiTimeseriesWidget.isTimeseriesOneChartPerLine) &&
        Objects.equals(this.dataSource, apiTimeseriesWidget.dataSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, title, visualMode, embedUrl, isEmbedded, metricGroup, direction, metric, filters, measure, fixedTimespan, apiLink, shouldExcludeAlertSuppressionWindows, links, minScale, maxScale, unit, showTimeseriesOverallBaseline, groupBy, isTimeseriesOneChartPerLine, dataSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiTimeseriesWidget {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    sb.append("    showTimeseriesOverallBaseline: ").append(toIndentedString(showTimeseriesOverallBaseline)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    isTimeseriesOneChartPerLine: ").append(toIndentedString(isTimeseriesOneChartPerLine)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("type");
    openapiFields.add("title");
    openapiFields.add("visualMode");
    openapiFields.add("embedUrl");
    openapiFields.add("isEmbedded");
    openapiFields.add("metricGroup");
    openapiFields.add("direction");
    openapiFields.add("metric");
    openapiFields.add("filters");
    openapiFields.add("measure");
    openapiFields.add("fixedTimespan");
    openapiFields.add("apiLink");
    openapiFields.add("shouldExcludeAlertSuppressionWindows");
    openapiFields.add("_links");
    openapiFields.add("minScale");
    openapiFields.add("maxScale");
    openapiFields.add("unit");
    openapiFields.add("showTimeseriesOverallBaseline");
    openapiFields.add("groupBy");
    openapiFields.add("isTimeseriesOneChartPerLine");
    openapiFields.add("dataSource");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApiTimeseriesWidget
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiTimeseriesWidget.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiTimeseriesWidget is not found in the empty JSON string", ApiTimeseriesWidget.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiTimeseriesWidget.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiTimeseriesWidget` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        WidgetType.validateJsonElement(jsonObj.get("type"));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      // validate the optional field `visualMode`
      if (jsonObj.get("visualMode") != null && !jsonObj.get("visualMode").isJsonNull()) {
        VisualMode.validateJsonElement(jsonObj.get("visualMode"));
      }
      if ((jsonObj.get("embedUrl") != null && !jsonObj.get("embedUrl").isJsonNull()) && !jsonObj.get("embedUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `embedUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("embedUrl").toString()));
      }
      // validate the optional field `metricGroup`
      if (jsonObj.get("metricGroup") != null && !jsonObj.get("metricGroup").isJsonNull()) {
        MetricGroup.validateJsonElement(jsonObj.get("metricGroup"));
      }
      // validate the optional field `direction`
      if (jsonObj.get("direction") != null && !jsonObj.get("direction").isJsonNull()) {
        DashboardMetricDirection.validateJsonElement(jsonObj.get("direction"));
      }
      // validate the optional field `metric`
      if (jsonObj.get("metric") != null && !jsonObj.get("metric").isJsonNull()) {
        DashboardMetric.validateJsonElement(jsonObj.get("metric"));
      }
      // validate the optional field `measure`
      if (jsonObj.get("measure") != null && !jsonObj.get("measure").isJsonNull()) {
        ApiWidgetMeasure.validateJsonElement(jsonObj.get("measure"));
      }
      // validate the optional field `fixedTimespan`
      if (jsonObj.get("fixedTimespan") != null && !jsonObj.get("fixedTimespan").isJsonNull()) {
        ApiDuration.validateJsonElement(jsonObj.get("fixedTimespan"));
      }
      if ((jsonObj.get("apiLink") != null && !jsonObj.get("apiLink").isJsonNull()) && !jsonObj.get("apiLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiLink").toString()));
      }
      // validate the optional field `_links`
      if (jsonObj.get("_links") != null && !jsonObj.get("_links").isJsonNull()) {
        SelfLinksLinks.validateJsonElement(jsonObj.get("_links"));
      }
      // validate the optional field `unit`
      if (jsonObj.get("unit") != null && !jsonObj.get("unit").isJsonNull()) {
        ApiWidgetFixedYScalePrefix.validateJsonElement(jsonObj.get("unit"));
      }
      // validate the optional field `groupBy`
      if (jsonObj.get("groupBy") != null && !jsonObj.get("groupBy").isJsonNull()) {
        ApiAggregateProperty.validateJsonElement(jsonObj.get("groupBy"));
      }
      // validate the optional field `dataSource`
      if (jsonObj.get("dataSource") != null && !jsonObj.get("dataSource").isJsonNull()) {
        TimeseriesDatasource.validateJsonElement(jsonObj.get("dataSource"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiTimeseriesWidget.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiTimeseriesWidget' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiTimeseriesWidget> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiTimeseriesWidget.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiTimeseriesWidget>() {
           @Override
           public void write(JsonWriter out, ApiTimeseriesWidget value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiTimeseriesWidget read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiTimeseriesWidget given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiTimeseriesWidget
  * @throws IOException if the JSON string is invalid with respect to ApiTimeseriesWidget
  */
  public static ApiTimeseriesWidget fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiTimeseriesWidget.class);
  }

 /**
  * Convert an instance of ApiTimeseriesWidget to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

