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
import com.thousandeyes.sdk.tests.results.model.TestResultAppLinks;
import com.thousandeyes.sdk.tests.results.model.TestResultMonitor;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * BgpBasicTestResult
 */
@JsonPropertyOrder({
  BgpBasicTestResult.JSON_PROPERTY_DATE,
  BgpBasicTestResult.JSON_PROPERTY_ROUND_ID,
  BgpBasicTestResult.JSON_PROPERTY_LINKS,
  BgpBasicTestResult.JSON_PROPERTY_MONITOR,
  BgpBasicTestResult.JSON_PROPERTY_PREFIX_ID,
  BgpBasicTestResult.JSON_PROPERTY_PREFIX
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class BgpBasicTestResult {
  public static final String JSON_PROPERTY_DATE = "date";
  private OffsetDateTime date;

  public static final String JSON_PROPERTY_ROUND_ID = "roundId";
  private Integer roundId;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private TestResultAppLinks links;

  public static final String JSON_PROPERTY_MONITOR = "monitor";
  private TestResultMonitor monitor;

  public static final String JSON_PROPERTY_PREFIX_ID = "prefixId";
  private String prefixId;

  public static final String JSON_PROPERTY_PREFIX = "prefix";
  private String prefix;

  public BgpBasicTestResult() { 
  }

  @JsonCreator
  public BgpBasicTestResult(
    @JsonProperty(JSON_PROPERTY_DATE) OffsetDateTime date, 
    @JsonProperty(JSON_PROPERTY_ROUND_ID) Integer roundId
  ) {
  this();
    this.date = date;
    this.roundId = roundId;
  }

   /**
   * Data point date UTC (ISO date-time format).
   * @return date
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDate() {
    return date;
  }




   /**
   * Epoch time (seconds) indicating the start time of the round
   * @return roundId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROUND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRoundId() {
    return roundId;
  }




  public BgpBasicTestResult links(TestResultAppLinks links) {
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

  public TestResultAppLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(TestResultAppLinks links) {
    this.links = links;
  }


  public BgpBasicTestResult monitor(TestResultMonitor monitor) {
    this.monitor = monitor;
    return this;
  }

   /**
   * Get monitor
   * @return monitor
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestResultMonitor getMonitor() {
    return monitor;
  }


  @JsonProperty(JSON_PROPERTY_MONITOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonitor(TestResultMonitor monitor) {
    this.monitor = monitor;
  }


  public BgpBasicTestResult prefixId(String prefixId) {
    this.prefixId = prefixId;
    return this;
  }

   /**
   * Internally tracked prefix ID.
   * @return prefixId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFIX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrefixId() {
    return prefixId;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefixId(String prefixId) {
    this.prefixId = prefixId;
  }


  public BgpBasicTestResult prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Prefix being tracked.
   * @return prefix
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrefix() {
    return prefix;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  /**
   * Return true if this BgpBasicTestResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BgpBasicTestResult bgpBasicTestResult = (BgpBasicTestResult) o;
    return Objects.equals(this.date, bgpBasicTestResult.date) &&
        Objects.equals(this.roundId, bgpBasicTestResult.roundId) &&
        Objects.equals(this.links, bgpBasicTestResult.links) &&
        Objects.equals(this.monitor, bgpBasicTestResult.monitor) &&
        Objects.equals(this.prefixId, bgpBasicTestResult.prefixId) &&
        Objects.equals(this.prefix, bgpBasicTestResult.prefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, roundId, links, monitor, prefixId, prefix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BgpBasicTestResult {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    monitor: ").append(toIndentedString(monitor)).append("\n");
    sb.append("    prefixId: ").append(toIndentedString(prefixId)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
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

