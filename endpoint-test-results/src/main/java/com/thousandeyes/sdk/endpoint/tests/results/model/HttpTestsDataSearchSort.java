/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.14
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
import com.thousandeyes.sdk.endpoint.tests.results.model.HttpTestsDataSearchSortKey;
import com.thousandeyes.sdk.endpoint.tests.results.model.SortOrder;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * HttpTestsDataSearchSort
 */
@JsonPropertyOrder({
  HttpTestsDataSearchSort.JSON_PROPERTY_SORT,
  HttpTestsDataSearchSort.JSON_PROPERTY_ORDER
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class HttpTestsDataSearchSort {
  public static final String JSON_PROPERTY_SORT = "sort";
  private HttpTestsDataSearchSortKey sort;

  public static final String JSON_PROPERTY_ORDER = "order";
  private SortOrder order;

  public HttpTestsDataSearchSort() { 
  }

  public HttpTestsDataSearchSort sort(HttpTestsDataSearchSortKey sort) {
    this.sort = sort;
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HttpTestsDataSearchSortKey getSort() {
    return sort;
  }


  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSort(HttpTestsDataSearchSortKey sort) {
    this.sort = sort;
  }


  public HttpTestsDataSearchSort order(SortOrder order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SortOrder getOrder() {
    return order;
  }


  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrder(SortOrder order) {
    this.order = order;
  }


  /**
   * Return true if this HttpTestsDataSearchSort object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpTestsDataSearchSort httpTestsDataSearchSort = (HttpTestsDataSearchSort) o;
    return Objects.equals(this.sort, httpTestsDataSearchSort.sort) &&
        Objects.equals(this.order, httpTestsDataSearchSort.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sort, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpTestsDataSearchSort {\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

