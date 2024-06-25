/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
 *
 * The version of the OpenAPI document: 7.0.8
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
import com.thousandeyes.sdk.dashboards.model.ApiReportDataComponentLabelMap;
import com.thousandeyes.sdk.dashboards.model.ApiWidgetsDataV2;
import com.thousandeyes.sdk.dashboards.model.PaginationLinks;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ApiWidgetDataResponse
 */
@JsonPropertyOrder({
  ApiWidgetDataResponse.JSON_PROPERTY_GROUP_LABELS,
  ApiWidgetDataResponse.JSON_PROPERTY_BIN_SIZE,
  ApiWidgetDataResponse.JSON_PROPERTY_DATA,
  ApiWidgetDataResponse.JSON_PROPERTY_START_DATE,
  ApiWidgetDataResponse.JSON_PROPERTY_END_DATE,
  ApiWidgetDataResponse.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ApiWidgetDataResponse {
  public static final String JSON_PROPERTY_GROUP_LABELS = "groupLabels";
  private List<ApiReportDataComponentLabelMap> groupLabels = new ArrayList<>();

  public static final String JSON_PROPERTY_BIN_SIZE = "binSize";
  private Long binSize;

  public static final String JSON_PROPERTY_DATA = "data";
  private ApiWidgetsDataV2 data;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private OffsetDateTime endDate;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private PaginationLinks links;

  public ApiWidgetDataResponse() { 
  }

  @JsonCreator
  public ApiWidgetDataResponse(
    @JsonProperty(JSON_PROPERTY_START_DATE) OffsetDateTime startDate, 
    @JsonProperty(JSON_PROPERTY_END_DATE) OffsetDateTime endDate
  ) {
  this();
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public ApiWidgetDataResponse groupLabels(List<ApiReportDataComponentLabelMap> groupLabels) {
    this.groupLabels = groupLabels;
    return this;
  }

  public ApiWidgetDataResponse addGroupLabelsItem(ApiReportDataComponentLabelMap groupLabelsItem) {
    if (this.groupLabels == null) {
      this.groupLabels = new ArrayList<>();
    }
    this.groupLabels.add(groupLabelsItem);
    return this;
  }

   /**
   * Get groupLabels
   * @return groupLabels
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiReportDataComponentLabelMap> getGroupLabels() {
    return groupLabels;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupLabels(List<ApiReportDataComponentLabelMap> groupLabels) {
    this.groupLabels = groupLabels;
  }


  public ApiWidgetDataResponse binSize(Long binSize) {
    this.binSize = binSize;
    return this;
  }

   /**
   * Duration of each bin.
   * @return binSize
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BIN_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBinSize() {
    return binSize;
  }


  @JsonProperty(JSON_PROPERTY_BIN_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBinSize(Long binSize) {
    this.binSize = binSize;
  }


  public ApiWidgetDataResponse data(ApiWidgetsDataV2 data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiWidgetsDataV2 getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(ApiWidgetsDataV2 data) {
    this.data = data;
  }


   /**
   * (Optional) When passing &#x60;window&#x60; or &#x60;startDate&#x60; parameter,  the client will also receive the &#x60;startDate&#x60; field indicating the UTC start date of the data&#39;s time range being retrieved  (ISO date-time format).
   * @return startDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartDate() {
    return startDate;
  }




   /**
   * (Optional) When passing &#x60;window&#x60; or &#x60;endDate&#x60; parameter,  the client will also receive the &#x60;endDate&#x60; field indicating the UTC end date of the data&#39;s time range being retrieved  (ISO date-time format).
   * @return endDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEndDate() {
    return endDate;
  }




  public ApiWidgetDataResponse links(PaginationLinks links) {
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

  public PaginationLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(PaginationLinks links) {
    this.links = links;
  }


  /**
   * Return true if this ApiWidgetDataResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiWidgetDataResponse apiWidgetDataResponse = (ApiWidgetDataResponse) o;
    return Objects.equals(this.groupLabels, apiWidgetDataResponse.groupLabels) &&
        Objects.equals(this.binSize, apiWidgetDataResponse.binSize) &&
        Objects.equals(this.data, apiWidgetDataResponse.data) &&
        Objects.equals(this.startDate, apiWidgetDataResponse.startDate) &&
        Objects.equals(this.endDate, apiWidgetDataResponse.endDate) &&
        Objects.equals(this.links, apiWidgetDataResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupLabels, binSize, data, startDate, endDate, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiWidgetDataResponse {\n");
    sb.append("    groupLabels: ").append(toIndentedString(groupLabels)).append("\n");
    sb.append("    binSize: ").append(toIndentedString(binSize)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

