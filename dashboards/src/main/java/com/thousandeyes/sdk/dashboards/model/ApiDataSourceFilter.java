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
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * List of different filter properties for a single datasource.
 */
@JsonPropertyOrder({
  ApiDataSourceFilter.JSON_PROPERTY_FILTER_ID,
  ApiDataSourceFilter.JSON_PROPERTY_VALUES,
  ApiDataSourceFilter.JSON_PROPERTY_METRIC_IDS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ApiDataSourceFilter {
  public static final String JSON_PROPERTY_FILTER_ID = "filterId";
  private String filterId;

  public static final String JSON_PROPERTY_VALUES = "values";
  private Set<String> values = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_METRIC_IDS = "metricIds";
  private Set<String> metricIds = new LinkedHashSet<>();

  public ApiDataSourceFilter() { 
  }

  public ApiDataSourceFilter filterId(String filterId) {
    this.filterId = filterId;
    return this;
  }

   /**
   * Data source property to filter by.
   * @return filterId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FILTER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFilterId() {
    return filterId;
  }


  @JsonProperty(JSON_PROPERTY_FILTER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFilterId(String filterId) {
    this.filterId = filterId;
  }


  public ApiDataSourceFilter values(Set<String> values) {
    this.values = values;
    return this;
  }

  public ApiDataSourceFilter addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new LinkedHashSet<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Values to filter by based on the specified &#x60;filterId&#x60;.
   * @return values
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<String> getValues() {
    return values;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValues(Set<String> values) {
    this.values = values;
  }


  public ApiDataSourceFilter metricIds(Set<String> metricIds) {
    this.metricIds = metricIds;
    return this;
  }

  public ApiDataSourceFilter addMetricIdsItem(String metricIdsItem) {
    if (this.metricIds == null) {
      this.metricIds = new LinkedHashSet<>();
    }
    this.metricIds.add(metricIdsItem);
    return this;
  }

   /**
   * Dashboard metric associated with the filter property.
   * @return metricIds
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_METRIC_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<String> getMetricIds() {
    return metricIds;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_METRIC_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMetricIds(Set<String> metricIds) {
    this.metricIds = metricIds;
  }


  /**
   * Return true if this ApiDataSourceFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiDataSourceFilter apiDataSourceFilter = (ApiDataSourceFilter) o;
    return Objects.equals(this.filterId, apiDataSourceFilter.filterId) &&
        Objects.equals(this.values, apiDataSourceFilter.values) &&
        Objects.equals(this.metricIds, apiDataSourceFilter.metricIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterId, values, metricIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiDataSourceFilter {\n");
    sb.append("    filterId: ").append(toIndentedString(filterId)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    metricIds: ").append(toIndentedString(metricIds)).append("\n");
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

