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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Advanced filter query used to filter the response. The provider name, location, asn can be partial names. Can filter on: - Provider name - Provider type - Region - Location - ASN - included
 */
@JsonPropertyOrder({
  ApiCatalogProviderFilter.JSON_PROPERTY_PROVIDER_NAME,
  ApiCatalogProviderFilter.JSON_PROPERTY_PROVIDER_TYPE,
  ApiCatalogProviderFilter.JSON_PROPERTY_REGION,
  ApiCatalogProviderFilter.JSON_PROPERTY_LOCATION,
  ApiCatalogProviderFilter.JSON_PROPERTY_ASN,
  ApiCatalogProviderFilter.JSON_PROPERTY_INCLUDED
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-30T10:06:12.882644+01:00[Europe/Lisbon]")
public class ApiCatalogProviderFilter {
  public static final String JSON_PROPERTY_PROVIDER_NAME = "providerName";
  private String providerName;

  public static final String JSON_PROPERTY_PROVIDER_TYPE = "providerType";
  private String providerType;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private String location;

  public static final String JSON_PROPERTY_ASN = "asn";
  private String asn;

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private Boolean included;

  public ApiCatalogProviderFilter() { 
  }

  public ApiCatalogProviderFilter providerName(String providerName) {
    this.providerName = providerName;
    return this;
  }

   /**
   * The name of the catalog provider.
   * @return providerName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVIDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProviderName() {
    return providerName;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }


  public ApiCatalogProviderFilter providerType(String providerType) {
    this.providerType = providerType;
    return this;
  }

   /**
   * The type of catalog provider.
   * @return providerType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVIDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProviderType() {
    return providerType;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProviderType(String providerType) {
    this.providerType = providerType;
  }


  public ApiCatalogProviderFilter region(String region) {
    this.region = region;
    return this;
  }

   /**
   * The catalog provider region.
   * @return region
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegion() {
    return region;
  }


  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegion(String region) {
    this.region = region;
  }


  public ApiCatalogProviderFilter location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Location of the catalog provider.
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


  public ApiCatalogProviderFilter asn(String asn) {
    this.asn = asn;
    return this;
  }

   /**
   * Name of the ASN (Autonomous Systems Number) covered by providers.
   * @return asn
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAsn() {
    return asn;
  }


  @JsonProperty(JSON_PROPERTY_ASN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsn(String asn) {
    this.asn = asn;
  }


  public ApiCatalogProviderFilter included(Boolean included) {
    this.included = included;
    return this;
  }

   /**
   * Indicates whether the catalog provider is included in the licensed packages. true returns providers covered by licensed packages, false returns providers not covered by licensed packages.
   * @return included
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncluded() {
    return included;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncluded(Boolean included) {
    this.included = included;
  }


  /**
   * Return true if this ApiCatalogProviderFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiCatalogProviderFilter apiCatalogProviderFilter = (ApiCatalogProviderFilter) o;
    return Objects.equals(this.providerName, apiCatalogProviderFilter.providerName) &&
        Objects.equals(this.providerType, apiCatalogProviderFilter.providerType) &&
        Objects.equals(this.region, apiCatalogProviderFilter.region) &&
        Objects.equals(this.location, apiCatalogProviderFilter.location) &&
        Objects.equals(this.asn, apiCatalogProviderFilter.asn) &&
        Objects.equals(this.included, apiCatalogProviderFilter.included);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerName, providerType, region, location, asn, included);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiCatalogProviderFilter {\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
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

