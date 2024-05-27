/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
 *
 * The version of the OpenAPI document: 7.0.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.tests.results.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.tests.results.model.BgpHop;
import com.thousandeyes.api.tests.results.model.Monitor;
import com.thousandeyes.api.tests.results.model.TestResultAppLinks;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * BgpTestRouteInformationResult
 */
@JsonPropertyOrder({
  BgpTestRouteInformationResult.JSON_PROPERTY_DATE,
  BgpTestRouteInformationResult.JSON_PROPERTY_ROUND_ID,
  BgpTestRouteInformationResult.JSON_PROPERTY_LINKS,
  BgpTestRouteInformationResult.JSON_PROPERTY_MONITOR,
  BgpTestRouteInformationResult.JSON_PROPERTY_PREFIX_ID,
  BgpTestRouteInformationResult.JSON_PROPERTY_PREFIX,
  BgpTestRouteInformationResult.JSON_PROPERTY_IS_ACTIVE,
  BgpTestRouteInformationResult.JSON_PROPERTY_HOPS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class BgpTestRouteInformationResult {
  public static final String JSON_PROPERTY_DATE = "date";
  private OffsetDateTime date;

  public static final String JSON_PROPERTY_ROUND_ID = "roundId";
  private Integer roundId;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private TestResultAppLinks links;

  public static final String JSON_PROPERTY_MONITOR = "monitor";
  private Monitor monitor;

  public static final String JSON_PROPERTY_PREFIX_ID = "prefixId";
  private String prefixId;

  public static final String JSON_PROPERTY_PREFIX = "prefix";
  private String prefix;

  public static final String JSON_PROPERTY_IS_ACTIVE = "isActive";
  private Boolean isActive;

  public static final String JSON_PROPERTY_HOPS = "hops";
  private List<BgpHop> hops = new ArrayList<>();

  public BgpTestRouteInformationResult() { 
  }

  @JsonCreator
  public BgpTestRouteInformationResult(
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




  public BgpTestRouteInformationResult links(TestResultAppLinks links) {
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


  public BgpTestRouteInformationResult monitor(Monitor monitor) {
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

  public Monitor getMonitor() {
    return monitor;
  }


  @JsonProperty(JSON_PROPERTY_MONITOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonitor(Monitor monitor) {
    this.monitor = monitor;
  }


  public BgpTestRouteInformationResult prefixId(String prefixId) {
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


  public BgpTestRouteInformationResult prefix(String prefix) {
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


  public BgpTestRouteInformationResult isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Represents whether the route is active or inactive. An inactive route was an active route in the previous test round and is now superseded by another active (preferred) route. When requesting data for the test round in which a route change happened, both routes (active and inactive one) are included in the response.
   * @return isActive
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsActive() {
    return isActive;
  }


  @JsonProperty(JSON_PROPERTY_IS_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public BgpTestRouteInformationResult hops(List<BgpHop> hops) {
    this.hops = hops;
    return this;
  }

  public BgpTestRouteInformationResult addHopsItem(BgpHop hopsItem) {
    if (this.hops == null) {
      this.hops = new ArrayList<>();
    }
    this.hops.add(hopsItem);
    return this;
  }

   /**
   * Get hops
   * @return hops
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BgpHop> getHops() {
    return hops;
  }


  @JsonProperty(JSON_PROPERTY_HOPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHops(List<BgpHop> hops) {
    this.hops = hops;
  }


  /**
   * Return true if this BgpTestRouteInformationResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BgpTestRouteInformationResult bgpTestRouteInformationResult = (BgpTestRouteInformationResult) o;
    return Objects.equals(this.date, bgpTestRouteInformationResult.date) &&
        Objects.equals(this.roundId, bgpTestRouteInformationResult.roundId) &&
        Objects.equals(this.links, bgpTestRouteInformationResult.links) &&
        Objects.equals(this.monitor, bgpTestRouteInformationResult.monitor) &&
        Objects.equals(this.prefixId, bgpTestRouteInformationResult.prefixId) &&
        Objects.equals(this.prefix, bgpTestRouteInformationResult.prefix) &&
        Objects.equals(this.isActive, bgpTestRouteInformationResult.isActive) &&
        Objects.equals(this.hops, bgpTestRouteInformationResult.hops);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, roundId, links, monitor, prefixId, prefix, isActive, hops);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BgpTestRouteInformationResult {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    monitor: ").append(toIndentedString(monitor)).append("\n");
    sb.append("    prefixId: ").append(toIndentedString(prefixId)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    hops: ").append(toIndentedString(hops)).append("\n");
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

