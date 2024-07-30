/*
 * Internet Insights API
 * We are happy to announce the release of the Internet Insights API set. This limited release includes endpoints that:  * Make our catalog provider and Internet outage data accessible to API users. * Provide access to advanced filtering, which is part of our next-generation API efforts to allow API users to fine-tune queries across all of our APIs in a consistent manner.  Internet Insights provide visibility into core Internet infrastructure, including ISPs, DNS providers, IaaS, CDNs , and SaaS providers. It tracks the macro-level impact of Internet events on individual users and enterprise networks connecting at the edge of the Internet. These events include Outages, Routing hijacks and leaks, DDoS attacks, And political interference, among others.  Future releases of the Internet Insights API set will further unlock access to core Internet Insights functionality, unlocking potential integrations to enrich customer process flows.  For more information about Internet Insights, see the [Internet Insights](https://docs.thousandeyes.com/product-documentation/internet-insights). 
 *
 * The version of the OpenAPI document: 7.0.12
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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.thousandeyes.sdk.internet.insights.model.ApiAffectedAgent;
import com.thousandeyes.sdk.internet.insights.model.ApiAffectedTest;
import com.thousandeyes.sdk.internet.insights.model.ApiNetworkOutageAffectedLocation;
import com.thousandeyes.sdk.internet.insights.model.SelfLinks;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ApiNetworkOutageDetails
 */
@JsonPropertyOrder({
  ApiNetworkOutageDetails.JSON_PROPERTY_ID,
  ApiNetworkOutageDetails.JSON_PROPERTY_PROVIDER_NAME,
  ApiNetworkOutageDetails.JSON_PROPERTY_PROVIDER_TYPE,
  ApiNetworkOutageDetails.JSON_PROPERTY_NETWORK_NAME,
  ApiNetworkOutageDetails.JSON_PROPERTY_ASN,
  ApiNetworkOutageDetails.JSON_PROPERTY_START_DATE,
  ApiNetworkOutageDetails.JSON_PROPERTY_START_ROUND_ID,
  ApiNetworkOutageDetails.JSON_PROPERTY_END_DATE,
  ApiNetworkOutageDetails.JSON_PROPERTY_END_ROUND_ID,
  ApiNetworkOutageDetails.JSON_PROPERTY_DURATION,
  ApiNetworkOutageDetails.JSON_PROPERTY_AFFECTED_TESTS,
  ApiNetworkOutageDetails.JSON_PROPERTY_AFFECTED_DOMAINS,
  ApiNetworkOutageDetails.JSON_PROPERTY_AFFECTED_AGENTS,
  ApiNetworkOutageDetails.JSON_PROPERTY_AFFECTED_LOCATIONS,
  ApiNetworkOutageDetails.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ApiNetworkOutageDetails {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PROVIDER_NAME = "providerName";
  private String providerName;

  public static final String JSON_PROPERTY_PROVIDER_TYPE = "providerType";
  private String providerType;

  public static final String JSON_PROPERTY_NETWORK_NAME = "networkName";
  private String networkName;

  public static final String JSON_PROPERTY_ASN = "asn";
  private Integer asn;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public static final String JSON_PROPERTY_START_ROUND_ID = "startRoundId";
  private Long startRoundId;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_END_ROUND_ID = "endRoundId";
  private Long endRoundId;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Long duration;

  public static final String JSON_PROPERTY_AFFECTED_TESTS = "affectedTests";
  private Set<ApiAffectedTest> affectedTests = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_AFFECTED_DOMAINS = "affectedDomains";
  private Set<String> affectedDomains = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_AFFECTED_AGENTS = "affectedAgents";
  private Set<ApiAffectedAgent> affectedAgents = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_AFFECTED_LOCATIONS = "affectedLocations";
  private Set<ApiNetworkOutageAffectedLocation> affectedLocations = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinks links;

  public ApiNetworkOutageDetails() { 
  }

  public ApiNetworkOutageDetails id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the outage.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public ApiNetworkOutageDetails providerName(String providerName) {
    this.providerName = providerName;
    return this;
  }

   /**
   * The name of the affected provider.
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


  public ApiNetworkOutageDetails providerType(String providerType) {
    this.providerType = providerType;
    return this;
  }

   /**
   * The type of the affected provider.
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


  public ApiNetworkOutageDetails networkName(String networkName) {
    this.networkName = networkName;
    return this;
  }

   /**
   * The affected network.
   * @return networkName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNetworkName() {
    return networkName;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworkName(String networkName) {
    this.networkName = networkName;
  }


  public ApiNetworkOutageDetails asn(Integer asn) {
    this.asn = asn;
    return this;
  }

   /**
   * ASN number
   * @return asn
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAsn() {
    return asn;
  }


  @JsonProperty(JSON_PROPERTY_ASN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsn(Integer asn) {
    this.asn = asn;
  }


  public ApiNetworkOutageDetails startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Date and time when the outage started.
   * @return startDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public ApiNetworkOutageDetails startRoundId(Long startRoundId) {
    this.startRoundId = startRoundId;
    return this;
  }

   /**
   * Epoch time (seconds) when the outage started.
   * @return startRoundId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_ROUND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStartRoundId() {
    return startRoundId;
  }


  @JsonProperty(JSON_PROPERTY_START_ROUND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartRoundId(Long startRoundId) {
    this.startRoundId = startRoundId;
  }


  public ApiNetworkOutageDetails endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Date and time when the outage ended.
   * @return endDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public ApiNetworkOutageDetails endRoundId(Long endRoundId) {
    this.endRoundId = endRoundId;
    return this;
  }

   /**
   * Epoch time (seconds) when the outage ended.
   * @return endRoundId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_ROUND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEndRoundId() {
    return endRoundId;
  }


  @JsonProperty(JSON_PROPERTY_END_ROUND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndRoundId(Long endRoundId) {
    this.endRoundId = endRoundId;
  }


  public ApiNetworkOutageDetails duration(Long duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Duration of the outage in seconds.
   * @return duration
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(Long duration) {
    this.duration = duration;
  }


  public ApiNetworkOutageDetails affectedTests(Set<ApiAffectedTest> affectedTests) {
    this.affectedTests = affectedTests;
    return this;
  }

  public ApiNetworkOutageDetails addAffectedTestsItem(ApiAffectedTest affectedTestsItem) {
    if (this.affectedTests == null) {
      this.affectedTests = new LinkedHashSet<>();
    }
    this.affectedTests.add(affectedTestsItem);
    return this;
  }

   /**
   * List of affected tests.
   * @return affectedTests
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AFFECTED_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<ApiAffectedTest> getAffectedTests() {
    return affectedTests;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_AFFECTED_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAffectedTests(Set<ApiAffectedTest> affectedTests) {
    this.affectedTests = affectedTests;
  }


  public ApiNetworkOutageDetails affectedDomains(Set<String> affectedDomains) {
    this.affectedDomains = affectedDomains;
    return this;
  }

  public ApiNetworkOutageDetails addAffectedDomainsItem(String affectedDomainsItem) {
    if (this.affectedDomains == null) {
      this.affectedDomains = new LinkedHashSet<>();
    }
    this.affectedDomains.add(affectedDomainsItem);
    return this;
  }

   /**
   * List of affected domains.
   * @return affectedDomains
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AFFECTED_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getAffectedDomains() {
    return affectedDomains;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_AFFECTED_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAffectedDomains(Set<String> affectedDomains) {
    this.affectedDomains = affectedDomains;
  }


  public ApiNetworkOutageDetails affectedAgents(Set<ApiAffectedAgent> affectedAgents) {
    this.affectedAgents = affectedAgents;
    return this;
  }

  public ApiNetworkOutageDetails addAffectedAgentsItem(ApiAffectedAgent affectedAgentsItem) {
    if (this.affectedAgents == null) {
      this.affectedAgents = new LinkedHashSet<>();
    }
    this.affectedAgents.add(affectedAgentsItem);
    return this;
  }

   /**
   * List of affected agents.
   * @return affectedAgents
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AFFECTED_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<ApiAffectedAgent> getAffectedAgents() {
    return affectedAgents;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_AFFECTED_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAffectedAgents(Set<ApiAffectedAgent> affectedAgents) {
    this.affectedAgents = affectedAgents;
  }


  public ApiNetworkOutageDetails affectedLocations(Set<ApiNetworkOutageAffectedLocation> affectedLocations) {
    this.affectedLocations = affectedLocations;
    return this;
  }

  public ApiNetworkOutageDetails addAffectedLocationsItem(ApiNetworkOutageAffectedLocation affectedLocationsItem) {
    if (this.affectedLocations == null) {
      this.affectedLocations = new LinkedHashSet<>();
    }
    this.affectedLocations.add(affectedLocationsItem);
    return this;
  }

   /**
   * List of affected locations.
   * @return affectedLocations
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AFFECTED_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<ApiNetworkOutageAffectedLocation> getAffectedLocations() {
    return affectedLocations;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_AFFECTED_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAffectedLocations(Set<ApiNetworkOutageAffectedLocation> affectedLocations) {
    this.affectedLocations = affectedLocations;
  }


  public ApiNetworkOutageDetails links(SelfLinks links) {
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

  public SelfLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(SelfLinks links) {
    this.links = links;
  }


  /**
   * Return true if this ApiNetworkOutageDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiNetworkOutageDetails apiNetworkOutageDetails = (ApiNetworkOutageDetails) o;
    return Objects.equals(this.id, apiNetworkOutageDetails.id) &&
        Objects.equals(this.providerName, apiNetworkOutageDetails.providerName) &&
        Objects.equals(this.providerType, apiNetworkOutageDetails.providerType) &&
        Objects.equals(this.networkName, apiNetworkOutageDetails.networkName) &&
        Objects.equals(this.asn, apiNetworkOutageDetails.asn) &&
        Objects.equals(this.startDate, apiNetworkOutageDetails.startDate) &&
        Objects.equals(this.startRoundId, apiNetworkOutageDetails.startRoundId) &&
        Objects.equals(this.endDate, apiNetworkOutageDetails.endDate) &&
        Objects.equals(this.endRoundId, apiNetworkOutageDetails.endRoundId) &&
        Objects.equals(this.duration, apiNetworkOutageDetails.duration) &&
        Objects.equals(this.affectedTests, apiNetworkOutageDetails.affectedTests) &&
        Objects.equals(this.affectedDomains, apiNetworkOutageDetails.affectedDomains) &&
        Objects.equals(this.affectedAgents, apiNetworkOutageDetails.affectedAgents) &&
        Objects.equals(this.affectedLocations, apiNetworkOutageDetails.affectedLocations) &&
        Objects.equals(this.links, apiNetworkOutageDetails.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, providerName, providerType, networkName, asn, startDate, startRoundId, endDate, endRoundId, duration, affectedTests, affectedDomains, affectedAgents, affectedLocations, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiNetworkOutageDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
    sb.append("    networkName: ").append(toIndentedString(networkName)).append("\n");
    sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startRoundId: ").append(toIndentedString(startRoundId)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    endRoundId: ").append(toIndentedString(endRoundId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    affectedTests: ").append(toIndentedString(affectedTests)).append("\n");
    sb.append("    affectedDomains: ").append(toIndentedString(affectedDomains)).append("\n");
    sb.append("    affectedAgents: ").append(toIndentedString(affectedAgents)).append("\n");
    sb.append("    affectedLocations: ").append(toIndentedString(affectedLocations)).append("\n");
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

