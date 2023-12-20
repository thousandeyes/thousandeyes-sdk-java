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
import com.thousandeyes.api.dashboards.model.ColorGridDatasource;
import com.thousandeyes.api.dashboards.model.DashboardMetric;
import com.thousandeyes.api.dashboards.model.DashboardMetricDirection;
import com.thousandeyes.api.dashboards.model.MetricGroup;
import com.thousandeyes.api.dashboards.model.SelfLinksLinks;
import com.thousandeyes.api.dashboards.model.VisualMode;
import com.thousandeyes.api.dashboards.model.WidgetSortDirection;
import com.thousandeyes.api.dashboards.model.WidgetSortProperty;
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
 * The Color Grid widget displays colored cards arranged in rows and columns.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T14:43:29.147613Z[Europe/Lisbon]")
public class ApiColorGridWidget {
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

  public static final String SERIALIZED_NAME_CARDS = "cards";
  @SerializedName(SERIALIZED_NAME_CARDS)
  private ApiAggregateProperty cards;

  public static final String SERIALIZED_NAME_GROUP_CARDS_BY = "groupCardsBy";
  @SerializedName(SERIALIZED_NAME_GROUP_CARDS_BY)
  private ApiAggregateProperty groupCardsBy;

  public static final String SERIALIZED_NAME_COLUMNS = "columns";
  @SerializedName(SERIALIZED_NAME_COLUMNS)
  private Integer columns;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_SORT_BY = "sortBy";
  @SerializedName(SERIALIZED_NAME_SORT_BY)
  private WidgetSortProperty sortBy;

  public static final String SERIALIZED_NAME_SORT_DIRECTION = "sortDirection";
  @SerializedName(SERIALIZED_NAME_SORT_DIRECTION)
  private WidgetSortDirection sortDirection;

  public static final String SERIALIZED_NAME_DATA_SOURCE = "dataSource";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE)
  private ColorGridDatasource dataSource;

  public ApiColorGridWidget() {
  }

  
  public ApiColorGridWidget(
     String embedUrl, 
     String apiLink
  ) {
    this();
    this.embedUrl = embedUrl;
    this.apiLink = apiLink;
  }

  public ApiColorGridWidget id(String id) {
    
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


  public ApiColorGridWidget type(WidgetType type) {
    
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


  public ApiColorGridWidget title(String title) {
    
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


  public ApiColorGridWidget visualMode(VisualMode visualMode) {
    
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




  public ApiColorGridWidget isEmbedded(Boolean isEmbedded) {
    
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


  public ApiColorGridWidget metricGroup(MetricGroup metricGroup) {
    
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


  public ApiColorGridWidget direction(DashboardMetricDirection direction) {
    
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


  public ApiColorGridWidget metric(DashboardMetric metric) {
    
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


  public ApiColorGridWidget filters(Map<String, Set<Object>> filters) {
    
    this.filters = filters;
    return this;
  }

  public ApiColorGridWidget putFiltersItem(String key, Set<Object> filtersItem) {
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


  public ApiColorGridWidget measure(ApiWidgetMeasure measure) {
    
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


  public ApiColorGridWidget fixedTimespan(ApiDuration fixedTimespan) {
    
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




  public ApiColorGridWidget shouldExcludeAlertSuppressionWindows(Boolean shouldExcludeAlertSuppressionWindows) {
    
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


  public ApiColorGridWidget links(SelfLinksLinks links) {
    
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


  public ApiColorGridWidget minScale(Float minScale) {
    
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


  public ApiColorGridWidget maxScale(Float maxScale) {
    
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


  public ApiColorGridWidget unit(ApiWidgetFixedYScalePrefix unit) {
    
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


  public ApiColorGridWidget cards(ApiAggregateProperty cards) {
    
    this.cards = cards;
    return this;
  }

   /**
   * Get cards
   * @return cards
  **/
  @javax.annotation.Nullable
  public ApiAggregateProperty getCards() {
    return cards;
  }


  public void setCards(ApiAggregateProperty cards) {
    this.cards = cards;
  }


  public ApiColorGridWidget groupCardsBy(ApiAggregateProperty groupCardsBy) {
    
    this.groupCardsBy = groupCardsBy;
    return this;
  }

   /**
   * Get groupCardsBy
   * @return groupCardsBy
  **/
  @javax.annotation.Nullable
  public ApiAggregateProperty getGroupCardsBy() {
    return groupCardsBy;
  }


  public void setGroupCardsBy(ApiAggregateProperty groupCardsBy) {
    this.groupCardsBy = groupCardsBy;
  }


  public ApiColorGridWidget columns(Integer columns) {
    
    this.columns = columns;
    return this;
  }

   /**
   * Number of columns: 1 or 2.
   * @return columns
  **/
  @javax.annotation.Nullable
  public Integer getColumns() {
    return columns;
  }


  public void setColumns(Integer columns) {
    this.columns = columns;
  }


  public ApiColorGridWidget limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Limit configured in the widget.
   * @return limit
  **/
  @javax.annotation.Nullable
  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public ApiColorGridWidget sortBy(WidgetSortProperty sortBy) {
    
    this.sortBy = sortBy;
    return this;
  }

   /**
   * Get sortBy
   * @return sortBy
  **/
  @javax.annotation.Nullable
  public WidgetSortProperty getSortBy() {
    return sortBy;
  }


  public void setSortBy(WidgetSortProperty sortBy) {
    this.sortBy = sortBy;
  }


  public ApiColorGridWidget sortDirection(WidgetSortDirection sortDirection) {
    
    this.sortDirection = sortDirection;
    return this;
  }

   /**
   * Get sortDirection
   * @return sortDirection
  **/
  @javax.annotation.Nullable
  public WidgetSortDirection getSortDirection() {
    return sortDirection;
  }


  public void setSortDirection(WidgetSortDirection sortDirection) {
    this.sortDirection = sortDirection;
  }


  public ApiColorGridWidget dataSource(ColorGridDatasource dataSource) {
    
    this.dataSource = dataSource;
    return this;
  }

   /**
   * Get dataSource
   * @return dataSource
  **/
  @javax.annotation.Nullable
  public ColorGridDatasource getDataSource() {
    return dataSource;
  }


  public void setDataSource(ColorGridDatasource dataSource) {
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
    ApiColorGridWidget apiColorGridWidget = (ApiColorGridWidget) o;
    return Objects.equals(this.id, apiColorGridWidget.id) &&
        Objects.equals(this.type, apiColorGridWidget.type) &&
        Objects.equals(this.title, apiColorGridWidget.title) &&
        Objects.equals(this.visualMode, apiColorGridWidget.visualMode) &&
        Objects.equals(this.embedUrl, apiColorGridWidget.embedUrl) &&
        Objects.equals(this.isEmbedded, apiColorGridWidget.isEmbedded) &&
        Objects.equals(this.metricGroup, apiColorGridWidget.metricGroup) &&
        Objects.equals(this.direction, apiColorGridWidget.direction) &&
        Objects.equals(this.metric, apiColorGridWidget.metric) &&
        Objects.equals(this.filters, apiColorGridWidget.filters) &&
        Objects.equals(this.measure, apiColorGridWidget.measure) &&
        Objects.equals(this.fixedTimespan, apiColorGridWidget.fixedTimespan) &&
        Objects.equals(this.apiLink, apiColorGridWidget.apiLink) &&
        Objects.equals(this.shouldExcludeAlertSuppressionWindows, apiColorGridWidget.shouldExcludeAlertSuppressionWindows) &&
        Objects.equals(this.links, apiColorGridWidget.links) &&
        Objects.equals(this.minScale, apiColorGridWidget.minScale) &&
        Objects.equals(this.maxScale, apiColorGridWidget.maxScale) &&
        Objects.equals(this.unit, apiColorGridWidget.unit) &&
        Objects.equals(this.cards, apiColorGridWidget.cards) &&
        Objects.equals(this.groupCardsBy, apiColorGridWidget.groupCardsBy) &&
        Objects.equals(this.columns, apiColorGridWidget.columns) &&
        Objects.equals(this.limit, apiColorGridWidget.limit) &&
        Objects.equals(this.sortBy, apiColorGridWidget.sortBy) &&
        Objects.equals(this.sortDirection, apiColorGridWidget.sortDirection) &&
        Objects.equals(this.dataSource, apiColorGridWidget.dataSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, title, visualMode, embedUrl, isEmbedded, metricGroup, direction, metric, filters, measure, fixedTimespan, apiLink, shouldExcludeAlertSuppressionWindows, links, minScale, maxScale, unit, cards, groupCardsBy, columns, limit, sortBy, sortDirection, dataSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiColorGridWidget {\n");
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
    sb.append("    cards: ").append(toIndentedString(cards)).append("\n");
    sb.append("    groupCardsBy: ").append(toIndentedString(groupCardsBy)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortDirection: ").append(toIndentedString(sortDirection)).append("\n");
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
    openapiFields.add("cards");
    openapiFields.add("groupCardsBy");
    openapiFields.add("columns");
    openapiFields.add("limit");
    openapiFields.add("sortBy");
    openapiFields.add("sortDirection");
    openapiFields.add("dataSource");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApiColorGridWidget
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiColorGridWidget.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiColorGridWidget is not found in the empty JSON string", ApiColorGridWidget.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiColorGridWidget.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiColorGridWidget` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      // validate the optional field `cards`
      if (jsonObj.get("cards") != null && !jsonObj.get("cards").isJsonNull()) {
        ApiAggregateProperty.validateJsonElement(jsonObj.get("cards"));
      }
      // validate the optional field `groupCardsBy`
      if (jsonObj.get("groupCardsBy") != null && !jsonObj.get("groupCardsBy").isJsonNull()) {
        ApiAggregateProperty.validateJsonElement(jsonObj.get("groupCardsBy"));
      }
      // validate the optional field `sortBy`
      if (jsonObj.get("sortBy") != null && !jsonObj.get("sortBy").isJsonNull()) {
        WidgetSortProperty.validateJsonElement(jsonObj.get("sortBy"));
      }
      // validate the optional field `sortDirection`
      if (jsonObj.get("sortDirection") != null && !jsonObj.get("sortDirection").isJsonNull()) {
        WidgetSortDirection.validateJsonElement(jsonObj.get("sortDirection"));
      }
      // validate the optional field `dataSource`
      if (jsonObj.get("dataSource") != null && !jsonObj.get("dataSource").isJsonNull()) {
        ColorGridDatasource.validateJsonElement(jsonObj.get("dataSource"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiColorGridWidget.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiColorGridWidget' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiColorGridWidget> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiColorGridWidget.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiColorGridWidget>() {
           @Override
           public void write(JsonWriter out, ApiColorGridWidget value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiColorGridWidget read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiColorGridWidget given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiColorGridWidget
  * @throws IOException if the JSON string is invalid with respect to ApiColorGridWidget
  */
  public static ApiColorGridWidget fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiColorGridWidget.class);
  }

 /**
  * Convert an instance of ApiColorGridWidget to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

