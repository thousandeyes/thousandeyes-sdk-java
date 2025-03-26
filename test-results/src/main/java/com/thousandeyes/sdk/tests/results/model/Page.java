/*
 * Test Results API
 * Get test result metrics for Network and Application Synthetics tests.
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests.results.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Page
 */
@JsonPropertyOrder({
  Page.JSON_PROPERTY_PAGE_NUM,
  Page.JSON_PROPERTY_PAGE_NAME,
  Page.JSON_PROPERTY_COMPONENT_COUNT,
  Page.JSON_PROPERTY_ERROR_COUNT,
  Page.JSON_PROPERTY_DURATION
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class Page {
  public static final String JSON_PROPERTY_PAGE_NUM = "pageNum";
  private Integer pageNum;

  public static final String JSON_PROPERTY_PAGE_NAME = "pageName";
  private String pageName;

  public static final String JSON_PROPERTY_COMPONENT_COUNT = "componentCount";
  private Integer componentCount;

  public static final String JSON_PROPERTY_ERROR_COUNT = "errorCount";
  private Integer errorCount;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Float duration;

  public Page() { 
  }

  @JsonCreator
  public Page(
    @JsonProperty(JSON_PROPERTY_PAGE_NUM) Integer pageNum, 
    @JsonProperty(JSON_PROPERTY_PAGE_NAME) String pageName, 
    @JsonProperty(JSON_PROPERTY_COMPONENT_COUNT) Integer componentCount, 
    @JsonProperty(JSON_PROPERTY_ERROR_COUNT) Integer errorCount, 
    @JsonProperty(JSON_PROPERTY_DURATION) Float duration
  ) {
  this();
    this.pageNum = pageNum;
    this.pageName = pageName;
    this.componentCount = componentCount;
    this.errorCount = errorCount;
    this.duration = duration;
  }

   /**
   * Page index
   * @return pageNum
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageNum() {
    return pageNum;
  }




   /**
   * Meta title value for page visited
   * @return pageName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPageName() {
    return pageName;
  }




   /**
   * Number of components on target page
   * @return componentCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getComponentCount() {
    return componentCount;
  }




   /**
   * Number of errors encountered during page load
   * @return errorCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getErrorCount() {
    return errorCount;
  }




   /**
   * Time spent on page in milliseconds
   * @return duration
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getDuration() {
    return duration;
  }




  /**
   * Return true if this Page object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Page page = (Page) o;
    return Objects.equals(this.pageNum, page.pageNum) &&
        Objects.equals(this.pageName, page.pageName) &&
        Objects.equals(this.componentCount, page.componentCount) &&
        Objects.equals(this.errorCount, page.errorCount) &&
        Objects.equals(this.duration, page.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNum, pageName, componentCount, errorCount, duration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Page {\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageName: ").append(toIndentedString(pageName)).append("\n");
    sb.append("    componentCount: ").append(toIndentedString(componentCount)).append("\n");
    sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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

