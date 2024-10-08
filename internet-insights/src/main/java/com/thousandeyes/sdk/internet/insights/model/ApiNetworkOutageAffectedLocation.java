/*
 * Internet Insights API
 * We are happy to announce the release of the Internet Insights API set. This limited release includes endpoints that:  * Make our catalog provider and Internet outage data accessible to API users. * Provide access to advanced filtering, which is part of our next-generation API efforts to allow API users to fine-tune queries across all of our APIs in a consistent manner.  Internet Insights provide visibility into core Internet infrastructure, including ISPs, DNS providers, IaaS, CDNs , and SaaS providers. It tracks the macro-level impact of Internet events on individual users and enterprise networks connecting at the edge of the Internet. These events include Outages, Routing hijacks and leaks, DDoS attacks, And political interference, among others.  Future releases of the Internet Insights API set will further unlock access to core Internet Insights functionality, unlocking potential integrations to enrich customer process flows.  For more information about Internet Insights, see the [Internet Insights](https://docs.thousandeyes.com/product-documentation/internet-insights). 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.internet.insights.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ApiNetworkOutageAffectedLocation
 */
@JsonPropertyOrder({
  ApiNetworkOutageAffectedLocation.JSON_PROPERTY_LOCATION,
  ApiNetworkOutageAffectedLocation.JSON_PROPERTY_AFFECTED_INTERFACES
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ApiNetworkOutageAffectedLocation {
  public static final String JSON_PROPERTY_LOCATION = "location";
  private String location;

  public static final String JSON_PROPERTY_AFFECTED_INTERFACES = "affectedInterfaces";
  private List<String> affectedInterfaces = new ArrayList<>();

  public ApiNetworkOutageAffectedLocation() { 
  }

  public ApiNetworkOutageAffectedLocation location(String location) {
    this.location = location;
    return this;
  }

   /**
   * The affected location.
   * @return location
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocation(String location) {
    this.location = location;
  }


  public ApiNetworkOutageAffectedLocation affectedInterfaces(List<String> affectedInterfaces) {
    this.affectedInterfaces = affectedInterfaces;
    return this;
  }

  public ApiNetworkOutageAffectedLocation addAffectedInterfacesItem(String affectedInterfacesItem) {
    if (this.affectedInterfaces == null) {
      this.affectedInterfaces = new ArrayList<>();
    }
    this.affectedInterfaces.add(affectedInterfacesItem);
    return this;
  }

   /**
   * The affected interfaces in this location.
   * @return affectedInterfaces
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AFFECTED_INTERFACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAffectedInterfaces() {
    return affectedInterfaces;
  }


  @JsonProperty(JSON_PROPERTY_AFFECTED_INTERFACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAffectedInterfaces(List<String> affectedInterfaces) {
    this.affectedInterfaces = affectedInterfaces;
  }


  /**
   * Return true if this ApiNetworkOutageAffectedLocation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiNetworkOutageAffectedLocation apiNetworkOutageAffectedLocation = (ApiNetworkOutageAffectedLocation) o;
    return Objects.equals(this.location, apiNetworkOutageAffectedLocation.location) &&
        Objects.equals(this.affectedInterfaces, apiNetworkOutageAffectedLocation.affectedInterfaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, affectedInterfaces);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiNetworkOutageAffectedLocation {\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    affectedInterfaces: ").append(toIndentedString(affectedInterfaces)).append("\n");
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

