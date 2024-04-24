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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.thousandeyes.api.internet.insights.model.ApiAffectedAgent;
import com.thousandeyes.api.internet.insights.model.ApiAffectedTest;
import com.thousandeyes.api.internet.insights.model.ApiApplicationOutageAffectedLocation;
import com.thousandeyes.api.internet.insights.model.SelfLinksLinks;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ApiApplicationOutageResponse
 */
@JsonPropertyOrder({
  ApiApplicationOutageResponse.JSON_PROPERTY_ID,
  ApiApplicationOutageResponse.JSON_PROPERTY_PROVIDER_NAME,
  ApiApplicationOutageResponse.JSON_PROPERTY_PROVIDER_TYPE,
  ApiApplicationOutageResponse.JSON_PROPERTY_APPLICATION_NAME,
  ApiApplicationOutageResponse.JSON_PROPERTY_START_DATE,
  ApiApplicationOutageResponse.JSON_PROPERTY_START_ROUND_ID,
  ApiApplicationOutageResponse.JSON_PROPERTY_END_DATE,
  ApiApplicationOutageResponse.JSON_PROPERTY_END_ROUND_ID,
  ApiApplicationOutageResponse.JSON_PROPERTY_DURATION,
  ApiApplicationOutageResponse.JSON_PROPERTY_AFFECTED_TESTS,
  ApiApplicationOutageResponse.JSON_PROPERTY_AFFECTED_DOMAINS,
  ApiApplicationOutageResponse.JSON_PROPERTY_AFFECTED_AGENTS,
  ApiApplicationOutageResponse.JSON_PROPERTY_ERRORS,
  ApiApplicationOutageResponse.JSON_PROPERTY_AFFECTED_LOCATIONS,
  ApiApplicationOutageResponse.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T10:46:25.859392+01:00[Europe/Lisbon]")
public class ApiApplicationOutageResponse {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PROVIDER_NAME = "providerName";
  private String providerName;

  public static final String JSON_PROPERTY_PROVIDER_TYPE = "providerType";
  private String providerType;

  public static final String JSON_PROPERTY_APPLICATION_NAME = "applicationName";
  private String applicationName;

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

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private Set<String> errors = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_AFFECTED_LOCATIONS = "affectedLocations";
  private Set<ApiApplicationOutageAffectedLocation> affectedLocations = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinksLinks links;

  public ApiApplicationOutageResponse() { 
  }

  public ApiApplicationOutageResponse id(String id) {
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


  public ApiApplicationOutageResponse providerName(String providerName) {
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


  public ApiApplicationOutageResponse providerType(String providerType) {
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


  public ApiApplicationOutageResponse applicationName(String applicationName) {
    this.applicationName = applicationName;
    return this;
  }

   /**
   * The name of the affected application.
   * @return applicationName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApplicationName() {
    return applicationName;
  }


  @JsonProperty(JSON_PROPERTY_APPLICATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }


  public ApiApplicationOutageResponse startDate(String startDate) {
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


  public ApiApplicationOutageResponse startRoundId(Long startRoundId) {
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


  public ApiApplicationOutageResponse endDate(String endDate) {
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


  public ApiApplicationOutageResponse endRoundId(Long endRoundId) {
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


  public ApiApplicationOutageResponse duration(Long duration) {
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


  public ApiApplicationOutageResponse affectedTests(Set<ApiAffectedTest> affectedTests) {
    this.affectedTests = affectedTests;
    return this;
  }

  public ApiApplicationOutageResponse addAffectedTestsItem(ApiAffectedTest affectedTestsItem) {
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


  public ApiApplicationOutageResponse affectedDomains(Set<String> affectedDomains) {
    this.affectedDomains = affectedDomains;
    return this;
  }

  public ApiApplicationOutageResponse addAffectedDomainsItem(String affectedDomainsItem) {
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


  public ApiApplicationOutageResponse affectedAgents(Set<ApiAffectedAgent> affectedAgents) {
    this.affectedAgents = affectedAgents;
    return this;
  }

  public ApiApplicationOutageResponse addAffectedAgentsItem(ApiAffectedAgent affectedAgentsItem) {
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


  public ApiApplicationOutageResponse errors(Set<String> errors) {
    this.errors = errors;
    return this;
  }

  public ApiApplicationOutageResponse addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new LinkedHashSet<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * List of errors.
   * @return errors
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getErrors() {
    return errors;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrors(Set<String> errors) {
    this.errors = errors;
  }


  public ApiApplicationOutageResponse affectedLocations(Set<ApiApplicationOutageAffectedLocation> affectedLocations) {
    this.affectedLocations = affectedLocations;
    return this;
  }

  public ApiApplicationOutageResponse addAffectedLocationsItem(ApiApplicationOutageAffectedLocation affectedLocationsItem) {
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

  public Set<ApiApplicationOutageAffectedLocation> getAffectedLocations() {
    return affectedLocations;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_AFFECTED_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAffectedLocations(Set<ApiApplicationOutageAffectedLocation> affectedLocations) {
    this.affectedLocations = affectedLocations;
  }


  public ApiApplicationOutageResponse links(SelfLinksLinks links) {
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


  /**
   * Return true if this ApiApplicationOutageResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiApplicationOutageResponse apiApplicationOutageResponse = (ApiApplicationOutageResponse) o;
    return Objects.equals(this.id, apiApplicationOutageResponse.id) &&
        Objects.equals(this.providerName, apiApplicationOutageResponse.providerName) &&
        Objects.equals(this.providerType, apiApplicationOutageResponse.providerType) &&
        Objects.equals(this.applicationName, apiApplicationOutageResponse.applicationName) &&
        Objects.equals(this.startDate, apiApplicationOutageResponse.startDate) &&
        Objects.equals(this.startRoundId, apiApplicationOutageResponse.startRoundId) &&
        Objects.equals(this.endDate, apiApplicationOutageResponse.endDate) &&
        Objects.equals(this.endRoundId, apiApplicationOutageResponse.endRoundId) &&
        Objects.equals(this.duration, apiApplicationOutageResponse.duration) &&
        Objects.equals(this.affectedTests, apiApplicationOutageResponse.affectedTests) &&
        Objects.equals(this.affectedDomains, apiApplicationOutageResponse.affectedDomains) &&
        Objects.equals(this.affectedAgents, apiApplicationOutageResponse.affectedAgents) &&
        Objects.equals(this.errors, apiApplicationOutageResponse.errors) &&
        Objects.equals(this.affectedLocations, apiApplicationOutageResponse.affectedLocations) &&
        Objects.equals(this.links, apiApplicationOutageResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, providerName, providerType, applicationName, startDate, startRoundId, endDate, endRoundId, duration, affectedTests, affectedDomains, affectedAgents, errors, affectedLocations, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiApplicationOutageResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startRoundId: ").append(toIndentedString(startRoundId)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    endRoundId: ").append(toIndentedString(endRoundId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    affectedTests: ").append(toIndentedString(affectedTests)).append("\n");
    sb.append("    affectedDomains: ").append(toIndentedString(affectedDomains)).append("\n");
    sb.append("    affectedAgents: ").append(toIndentedString(affectedAgents)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

