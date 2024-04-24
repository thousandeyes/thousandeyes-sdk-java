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
import com.thousandeyes.api.dashboards.model.ApiMultiSearchFilterApiTestTableFilterKey;
import com.thousandeyes.api.dashboards.model.TestTableFilterType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ApiWidgetFilterApiTestTableFilterKey
 */
@JsonPropertyOrder({
  ApiWidgetFilterApiTestTableFilterKey.JSON_PROPERTY_FILTERS,
  ApiWidgetFilterApiTestTableFilterKey.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T10:46:26.159899+01:00[Europe/Lisbon]")
public class ApiWidgetFilterApiTestTableFilterKey {
  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<ApiMultiSearchFilterApiTestTableFilterKey> filters = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private TestTableFilterType type;

  public ApiWidgetFilterApiTestTableFilterKey() { 
  }

  public ApiWidgetFilterApiTestTableFilterKey filters(List<ApiMultiSearchFilterApiTestTableFilterKey> filters) {
    this.filters = filters;
    return this;
  }

  public ApiWidgetFilterApiTestTableFilterKey addFiltersItem(ApiMultiSearchFilterApiTestTableFilterKey filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiMultiSearchFilterApiTestTableFilterKey> getFilters() {
    return filters;
  }


  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilters(List<ApiMultiSearchFilterApiTestTableFilterKey> filters) {
    this.filters = filters;
  }


  public ApiWidgetFilterApiTestTableFilterKey type(TestTableFilterType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestTableFilterType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TestTableFilterType type) {
    this.type = type;
  }


  /**
   * Return true if this ApiWidgetFilterApiTestTableFilterKey object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiWidgetFilterApiTestTableFilterKey apiWidgetFilterApiTestTableFilterKey = (ApiWidgetFilterApiTestTableFilterKey) o;
    return Objects.equals(this.filters, apiWidgetFilterApiTestTableFilterKey.filters) &&
        Objects.equals(this.type, apiWidgetFilterApiTestTableFilterKey.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiWidgetFilterApiTestTableFilterKey {\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

