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
import com.thousandeyes.sdk.dashboards.model.ApiDataSourceFilter;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * List of different datasource filters.
 */
@JsonPropertyOrder({
  ApiDataSourceFilters.JSON_PROPERTY_DATA_SOURCE_ID,
  ApiDataSourceFilters.JSON_PROPERTY_FILTERS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ApiDataSourceFilters {
  public static final String JSON_PROPERTY_DATA_SOURCE_ID = "dataSourceId";
  private String dataSourceId;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private Set<ApiDataSourceFilter> filters = new LinkedHashSet<>();

  public ApiDataSourceFilters() { 
  }

  public ApiDataSourceFilters dataSourceId(String dataSourceId) {
    this.dataSourceId = dataSourceId;
    return this;
  }

   /**
   * Types of data source.
   * @return dataSourceId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDataSourceId() {
    return dataSourceId;
  }


  @JsonProperty(JSON_PROPERTY_DATA_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDataSourceId(String dataSourceId) {
    this.dataSourceId = dataSourceId;
  }


  public ApiDataSourceFilters filters(Set<ApiDataSourceFilter> filters) {
    this.filters = filters;
    return this;
  }

  public ApiDataSourceFilters addFiltersItem(ApiDataSourceFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new LinkedHashSet<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * List of different filter properties.
   * @return filters
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<ApiDataSourceFilter> getFilters() {
    return filters;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFilters(Set<ApiDataSourceFilter> filters) {
    this.filters = filters;
  }


  /**
   * Return true if this ApiDataSourceFilters object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiDataSourceFilters apiDataSourceFilters = (ApiDataSourceFilters) o;
    return Objects.equals(this.dataSourceId, apiDataSourceFilters.dataSourceId) &&
        Objects.equals(this.filters, apiDataSourceFilters.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSourceId, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiDataSourceFilters {\n");
    sb.append("    dataSourceId: ").append(toIndentedString(dataSourceId)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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

