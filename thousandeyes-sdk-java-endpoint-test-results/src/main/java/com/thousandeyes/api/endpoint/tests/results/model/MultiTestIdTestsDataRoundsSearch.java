/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.tests.results.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.endpoint.tests.results.model.MultiTestIdTestsDataSearchFilter;
import com.thousandeyes.api.endpoint.tests.results.model.TestsDataSearchSort;
import com.thousandeyes.api.endpoint.tests.results.model.TestsDataThresholdFilters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * MultiTestIdTestsDataRoundsSearch
 */
@JsonPropertyOrder({
  MultiTestIdTestsDataRoundsSearch.JSON_PROPERTY_SEARCH_SORT,
  MultiTestIdTestsDataRoundsSearch.JSON_PROPERTY_THRESHOLD_FILTER,
  MultiTestIdTestsDataRoundsSearch.JSON_PROPERTY_SEARCH_FILTERS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class MultiTestIdTestsDataRoundsSearch {
  public static final String JSON_PROPERTY_SEARCH_SORT = "searchSort";
  private List<TestsDataSearchSort> searchSort = new ArrayList<>();

  public static final String JSON_PROPERTY_THRESHOLD_FILTER = "thresholdFilter";
  private TestsDataThresholdFilters thresholdFilter;

  public static final String JSON_PROPERTY_SEARCH_FILTERS = "searchFilters";
  private MultiTestIdTestsDataSearchFilter searchFilters;

  public MultiTestIdTestsDataRoundsSearch() { 
  }

  public MultiTestIdTestsDataRoundsSearch searchSort(List<TestsDataSearchSort> searchSort) {
    this.searchSort = searchSort;
    return this;
  }

  public MultiTestIdTestsDataRoundsSearch addSearchSortItem(TestsDataSearchSort searchSortItem) {
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

  public List<TestsDataSearchSort> getSearchSort() {
    return searchSort;
  }


  @JsonProperty(JSON_PROPERTY_SEARCH_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchSort(List<TestsDataSearchSort> searchSort) {
    this.searchSort = searchSort;
  }


  public MultiTestIdTestsDataRoundsSearch thresholdFilter(TestsDataThresholdFilters thresholdFilter) {
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

  public TestsDataThresholdFilters getThresholdFilter() {
    return thresholdFilter;
  }


  @JsonProperty(JSON_PROPERTY_THRESHOLD_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThresholdFilter(TestsDataThresholdFilters thresholdFilter) {
    this.thresholdFilter = thresholdFilter;
  }


  public MultiTestIdTestsDataRoundsSearch searchFilters(MultiTestIdTestsDataSearchFilter searchFilters) {
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

  public MultiTestIdTestsDataSearchFilter getSearchFilters() {
    return searchFilters;
  }


  @JsonProperty(JSON_PROPERTY_SEARCH_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchFilters(MultiTestIdTestsDataSearchFilter searchFilters) {
    this.searchFilters = searchFilters;
  }


  /**
   * Return true if this MultiTestIdTestsDataRoundsSearch object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiTestIdTestsDataRoundsSearch multiTestIdTestsDataRoundsSearch = (MultiTestIdTestsDataRoundsSearch) o;
    return Objects.equals(this.searchSort, multiTestIdTestsDataRoundsSearch.searchSort) &&
        Objects.equals(this.thresholdFilter, multiTestIdTestsDataRoundsSearch.thresholdFilter) &&
        Objects.equals(this.searchFilters, multiTestIdTestsDataRoundsSearch.searchFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchSort, thresholdFilter, searchFilters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiTestIdTestsDataRoundsSearch {\n");
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

