/*
 * Internet Insights API
 * We are happy to announce the release of the Internet Insights API set. This limited release includes endpoints that:  * Make our catalog provider and Internet outage data accessible to API users. * Provide access to advanced filtering, which is part of our next-generation API efforts to allow API users to fine-tune queries across all of our APIs in a consistent manner.  Internet Insights provide visibility into core Internet infrastructure, including ISPs, DNS providers, IaaS, CDNs , and SaaS providers. It tracks the macro-level impact of Internet events on individual users and enterprise networks connecting at the edge of the Internet. These events include Outages, Routing hijacks and leaks, DDoS attacks, And political interference, among others.  Future releases of the Internet Insights API set will further unlock access to core Internet Insights functionality, unlocking potential integrations to enrich customer process flows. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.internet.insights.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.internet.insights.model.ApiOutagesResponseAllOfOutagesInner;
import com.thousandeyes.api.internet.insights.model.SelfLinksLinks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ApiOutagesResponse
 */
@JsonPropertyOrder({
  ApiOutagesResponse.JSON_PROPERTY_LINKS,
  ApiOutagesResponse.JSON_PROPERTY_OUTAGES
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T16:57:44.976231+01:00[Europe/Lisbon]")
public class ApiOutagesResponse {
  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinksLinks links;

  public static final String JSON_PROPERTY_OUTAGES = "outages";
  private List<ApiOutagesResponseAllOfOutagesInner> outages = new ArrayList<>();

  public ApiOutagesResponse() { 
  }

  public ApiOutagesResponse links(SelfLinksLinks links) {
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

  public SelfLinksLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(SelfLinksLinks links) {
    this.links = links;
  }


  public ApiOutagesResponse outages(List<ApiOutagesResponseAllOfOutagesInner> outages) {
    this.outages = outages;
    return this;
  }

  public ApiOutagesResponse addoutagesItem(ApiOutagesResponseAllOfOutagesInner outagesItem) {
    if (this.outages == null) {
      this.outages = new ArrayList<>();
    }
    this.outages.add(outagesItem);
    return this;
  }

   /**
   * List of application outages.
   * @return outages
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OUTAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiOutagesResponseAllOfOutagesInner> getOutages() {
    return outages;
  }


  @JsonProperty(JSON_PROPERTY_OUTAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutages(List<ApiOutagesResponseAllOfOutagesInner> outages) {
    this.outages = outages;
  }


  /**
   * Return true if this ApiOutagesResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiOutagesResponse apiOutagesResponse = (ApiOutagesResponse) o;
    return Objects.equals(this.links, apiOutagesResponse.links) &&
        Objects.equals(this.outages, apiOutagesResponse.outages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, outages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiOutagesResponse {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    outages: ").append(toIndentedString(outages)).append("\n");
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

