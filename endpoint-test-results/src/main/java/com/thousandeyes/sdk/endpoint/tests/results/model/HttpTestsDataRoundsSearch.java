/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.tests.results.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.endpoint.tests.results.model.HttpTestsDataSearchFilter;
import com.thousandeyes.sdk.endpoint.tests.results.model.HttpTestsDataSearchSort;
import com.thousandeyes.sdk.endpoint.tests.results.model.HttpTestsDataThresholdFilters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * HttpTestsDataRoundsSearch
 */
@JsonPropertyOrder({
  HttpTestsDataRoundsSearch.JSON_PROPERTY_SEARCH_SORT,
  HttpTestsDataRoundsSearch.JSON_PROPERTY_THRESHOLD_FILTER,
  HttpTestsDataRoundsSearch.JSON_PROPERTY_SEARCH_FILTERS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class HttpTestsDataRoundsSearch {
  public static final String JSON_PROPERTY_SEARCH_SORT = "searchSort";
  private List<HttpTestsDataSearchSort> searchSort = new ArrayList<>();

  public static final String JSON_PROPERTY_THRESHOLD_FILTER = "thresholdFilter";
  private HttpTestsDataThresholdFilters thresholdFilter;

  public static final String JSON_PROPERTY_SEARCH_FILTERS = "searchFilters";
  private HttpTestsDataSearchFilter searchFilters;

  public HttpTestsDataRoundsSearch() { 
  }

  public HttpTestsDataRoundsSearch searchSort(List<HttpTestsDataSearchSort> searchSort) {
    this.searchSort = searchSort;
    return this;
  }

  public HttpTestsDataRoundsSearch addSearchSortItem(HttpTestsDataSearchSort searchSortItem) {
    if (this.searchSort == null) {
      this.searchSort = new ArrayList<>();
    }
    this.searchSort.add(searchSortItem);
    return this;
  }

   /**
   * Get searchSort
   * @return searchSort
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEARCH_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<HttpTestsDataSearchSort> getSearchSort() {
    return searchSort;
  }


  @JsonProperty(JSON_PROPERTY_SEARCH_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchSort(List<HttpTestsDataSearchSort> searchSort) {
    this.searchSort = searchSort;
  }


  public HttpTestsDataRoundsSearch thresholdFilter(HttpTestsDataThresholdFilters thresholdFilter) {
    this.thresholdFilter = thresholdFilter;
    return this;
  }

   /**
   * Get thresholdFilter
   * @return thresholdFilter
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THRESHOLD_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HttpTestsDataThresholdFilters getThresholdFilter() {
    return thresholdFilter;
  }


  @JsonProperty(JSON_PROPERTY_THRESHOLD_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThresholdFilter(HttpTestsDataThresholdFilters thresholdFilter) {
    this.thresholdFilter = thresholdFilter;
  }


  public HttpTestsDataRoundsSearch searchFilters(HttpTestsDataSearchFilter searchFilters) {
    this.searchFilters = searchFilters;
    return this;
  }

   /**
   * Get searchFilters
   * @return searchFilters
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEARCH_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HttpTestsDataSearchFilter getSearchFilters() {
    return searchFilters;
  }


  @JsonProperty(JSON_PROPERTY_SEARCH_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchFilters(HttpTestsDataSearchFilter searchFilters) {
    this.searchFilters = searchFilters;
  }


  /**
   * Return true if this HttpTestsDataRoundsSearch object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpTestsDataRoundsSearch httpTestsDataRoundsSearch = (HttpTestsDataRoundsSearch) o;
    return Objects.equals(this.searchSort, httpTestsDataRoundsSearch.searchSort) &&
        Objects.equals(this.thresholdFilter, httpTestsDataRoundsSearch.thresholdFilter) &&
        Objects.equals(this.searchFilters, httpTestsDataRoundsSearch.searchFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchSort, thresholdFilter, searchFilters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpTestsDataRoundsSearch {\n");
    sb.append("    searchSort: ").append(toIndentedString(searchSort)).append("\n");
    sb.append("    thresholdFilter: ").append(toIndentedString(thresholdFilter)).append("\n");
    sb.append("    searchFilters: ").append(toIndentedString(searchFilters)).append("\n");
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

