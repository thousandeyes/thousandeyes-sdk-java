/*
 * Usage API
 *  These usage endpoints define the following operations:  * **Usage**: Retrieve usage data for the specified time period (default is one month).          * Users must have the `View Billing` permission to access this endpoint.     * This endpoint offers visibility across all account groups within the organization.     * Users with `View Billing` permission in multiple organizations should query the endpoint with the `aid` query string parameter (see optional parameters) for each organization.  * **Quotas**: Obtain organization and account usage quotas. Additionally, users with the appropriate permissions can create, update, or delete these quotas.          * Users must have the necessary permissions to perform quota-related actions.  Refer to the Usage API endpoints for detailed usage instructions and optional parameters. 
 *
 * The version of the OpenAPI document: 7.0.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.usage.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.usage.model.EndpointAgents;
import com.thousandeyes.api.usage.model.EndpointAgentsEmbedded;
import com.thousandeyes.api.usage.model.EndpointAgentsEssentials;
import com.thousandeyes.api.usage.model.EnterpriseAgentUnits;
import com.thousandeyes.api.usage.model.EnterpriseAgents;
import com.thousandeyes.api.usage.model.Tests;
import com.thousandeyes.api.usage.model.UsageQuota;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UsageDetails
 */
@JsonPropertyOrder({
  UsageDetails.JSON_PROPERTY_QUOTA,
  UsageDetails.JSON_PROPERTY_CLOUD_UNITS_USED,
  UsageDetails.JSON_PROPERTY_CLOUD_UNITS_PROJECTED,
  UsageDetails.JSON_PROPERTY_CLOUD_UNITS_NEXT_BILLING_PERIOD,
  UsageDetails.JSON_PROPERTY_ENTERPRISE_UNITS_USED,
  UsageDetails.JSON_PROPERTY_ENTERPRISE_UNITS_PROJECTED,
  UsageDetails.JSON_PROPERTY_ENTERPRISE_UNITS_NEXT_BILLING_PERIOD,
  UsageDetails.JSON_PROPERTY_ENDPOINT_AGENTS_USED,
  UsageDetails.JSON_PROPERTY_ENDPOINT_AGENTS_ESSENTIALS_USED,
  UsageDetails.JSON_PROPERTY_ENDPOINT_AGENTS_EMBEDDED_USED,
  UsageDetails.JSON_PROPERTY_ENTERPRISE_AGENTS_USED,
  UsageDetails.JSON_PROPERTY_ENTERPRISE_AGENT_UNITS,
  UsageDetails.JSON_PROPERTY_TESTS,
  UsageDetails.JSON_PROPERTY_ENDPOINT_AGENTS,
  UsageDetails.JSON_PROPERTY_ENDPOINT_AGENTS_ESSENTIALS,
  UsageDetails.JSON_PROPERTY_ENDPOINT_AGENTS_EMBEDDED,
  UsageDetails.JSON_PROPERTY_ENTERPRISE_AGENTS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class UsageDetails {
  public static final String JSON_PROPERTY_QUOTA = "quota";
  private UsageQuota quota;

  public static final String JSON_PROPERTY_CLOUD_UNITS_USED = "cloudUnitsUsed";
  private Long cloudUnitsUsed;

  public static final String JSON_PROPERTY_CLOUD_UNITS_PROJECTED = "cloudUnitsProjected";
  private Long cloudUnitsProjected;

  public static final String JSON_PROPERTY_CLOUD_UNITS_NEXT_BILLING_PERIOD = "cloudUnitsNextBillingPeriod";
  private Long cloudUnitsNextBillingPeriod;

  public static final String JSON_PROPERTY_ENTERPRISE_UNITS_USED = "enterpriseUnitsUsed";
  private Long enterpriseUnitsUsed;

  public static final String JSON_PROPERTY_ENTERPRISE_UNITS_PROJECTED = "enterpriseUnitsProjected";
  private Long enterpriseUnitsProjected;

  public static final String JSON_PROPERTY_ENTERPRISE_UNITS_NEXT_BILLING_PERIOD = "enterpriseUnitsNextBillingPeriod";
  private Long enterpriseUnitsNextBillingPeriod;

  public static final String JSON_PROPERTY_ENDPOINT_AGENTS_USED = "endpointAgentsUsed";
  private Long endpointAgentsUsed;

  public static final String JSON_PROPERTY_ENDPOINT_AGENTS_ESSENTIALS_USED = "endpointAgentsEssentialsUsed";
  private Long endpointAgentsEssentialsUsed;

  public static final String JSON_PROPERTY_ENDPOINT_AGENTS_EMBEDDED_USED = "endpointAgentsEmbeddedUsed";
  private Long endpointAgentsEmbeddedUsed;

  public static final String JSON_PROPERTY_ENTERPRISE_AGENTS_USED = "enterpriseAgentsUsed";
  private Long enterpriseAgentsUsed;

  public static final String JSON_PROPERTY_ENTERPRISE_AGENT_UNITS = "enterpriseAgentUnits";
  private List<EnterpriseAgentUnits> enterpriseAgentUnits = new ArrayList<>();

  public static final String JSON_PROPERTY_TESTS = "tests";
  private List<Tests> tests = new ArrayList<>();

  public static final String JSON_PROPERTY_ENDPOINT_AGENTS = "endpointAgents";
  private List<EndpointAgents> endpointAgents = new ArrayList<>();

  public static final String JSON_PROPERTY_ENDPOINT_AGENTS_ESSENTIALS = "endpointAgentsEssentials";
  private List<EndpointAgentsEssentials> endpointAgentsEssentials = new ArrayList<>();

  public static final String JSON_PROPERTY_ENDPOINT_AGENTS_EMBEDDED = "endpointAgentsEmbedded";
  private List<EndpointAgentsEmbedded> endpointAgentsEmbedded = new ArrayList<>();

  public static final String JSON_PROPERTY_ENTERPRISE_AGENTS = "enterpriseAgents";
  private List<EnterpriseAgents> enterpriseAgents = new ArrayList<>();

  public UsageDetails() { 
  }

  public UsageDetails quota(UsageQuota quota) {
    this.quota = quota;
    return this;
  }

   /**
   * Get quota
   * @return quota
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UsageQuota getQuota() {
    return quota;
  }


  @JsonProperty(JSON_PROPERTY_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuota(UsageQuota quota) {
    this.quota = quota;
  }


  public UsageDetails cloudUnitsUsed(Long cloudUnitsUsed) {
    this.cloudUnitsUsed = cloudUnitsUsed;
    return this;
  }

   /**
   * Number of cloud units consumed thus far in the usage period.
   * @return cloudUnitsUsed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOUD_UNITS_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCloudUnitsUsed() {
    return cloudUnitsUsed;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_UNITS_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudUnitsUsed(Long cloudUnitsUsed) {
    this.cloudUnitsUsed = cloudUnitsUsed;
  }


  public UsageDetails cloudUnitsProjected(Long cloudUnitsProjected) {
    this.cloudUnitsProjected = cloudUnitsProjected;
    return this;
  }

   /**
   * Number of cloud units projected in the current usage period, based on units consumed to date and configuration of enabled tests. This value is updated hourly.
   * @return cloudUnitsProjected
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOUD_UNITS_PROJECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCloudUnitsProjected() {
    return cloudUnitsProjected;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_UNITS_PROJECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudUnitsProjected(Long cloudUnitsProjected) {
    this.cloudUnitsProjected = cloudUnitsProjected;
  }


  public UsageDetails cloudUnitsNextBillingPeriod(Long cloudUnitsNextBillingPeriod) {
    this.cloudUnitsNextBillingPeriod = cloudUnitsNextBillingPeriod;
    return this;
  }

   /**
   * Number of cloud units projected in the upcoming usage period, based on configuration of enabled tests. This value is updated hourly.
   * @return cloudUnitsNextBillingPeriod
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOUD_UNITS_NEXT_BILLING_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCloudUnitsNextBillingPeriod() {
    return cloudUnitsNextBillingPeriod;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_UNITS_NEXT_BILLING_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudUnitsNextBillingPeriod(Long cloudUnitsNextBillingPeriod) {
    this.cloudUnitsNextBillingPeriod = cloudUnitsNextBillingPeriod;
  }


  public UsageDetails enterpriseUnitsUsed(Long enterpriseUnitsUsed) {
    this.enterpriseUnitsUsed = enterpriseUnitsUsed;
    return this;
  }

   /**
   * Number of enterprise units consumed in the usage period. Returns non-zero value only for organizations with metered billing.
   * @return enterpriseUnitsUsed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTERPRISE_UNITS_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEnterpriseUnitsUsed() {
    return enterpriseUnitsUsed;
  }


  @JsonProperty(JSON_PROPERTY_ENTERPRISE_UNITS_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseUnitsUsed(Long enterpriseUnitsUsed) {
    this.enterpriseUnitsUsed = enterpriseUnitsUsed;
  }


  public UsageDetails enterpriseUnitsProjected(Long enterpriseUnitsProjected) {
    this.enterpriseUnitsProjected = enterpriseUnitsProjected;
    return this;
  }

   /**
   * Number of enterprise units projected in the current usage period, based on units consumed to date and configuration of enabled tests. This value is updated hourly. Returns non-zero value only for organizations with metered billing.
   * @return enterpriseUnitsProjected
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTERPRISE_UNITS_PROJECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEnterpriseUnitsProjected() {
    return enterpriseUnitsProjected;
  }


  @JsonProperty(JSON_PROPERTY_ENTERPRISE_UNITS_PROJECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseUnitsProjected(Long enterpriseUnitsProjected) {
    this.enterpriseUnitsProjected = enterpriseUnitsProjected;
  }


  public UsageDetails enterpriseUnitsNextBillingPeriod(Long enterpriseUnitsNextBillingPeriod) {
    this.enterpriseUnitsNextBillingPeriod = enterpriseUnitsNextBillingPeriod;
    return this;
  }

   /**
   * Number of enterprise units projected in the upcoming usage period, based on configuration of enabled tests. This value is updated hourly. Returns non-zero value only for organizations with metered billing.
   * @return enterpriseUnitsNextBillingPeriod
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTERPRISE_UNITS_NEXT_BILLING_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEnterpriseUnitsNextBillingPeriod() {
    return enterpriseUnitsNextBillingPeriod;
  }


  @JsonProperty(JSON_PROPERTY_ENTERPRISE_UNITS_NEXT_BILLING_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseUnitsNextBillingPeriod(Long enterpriseUnitsNextBillingPeriod) {
    this.enterpriseUnitsNextBillingPeriod = enterpriseUnitsNextBillingPeriod;
  }


  public UsageDetails endpointAgentsUsed(Long endpointAgentsUsed) {
    this.endpointAgentsUsed = endpointAgentsUsed;
    return this;
  }

   /**
   * Number of endpoint agents used in the current usage period. This number is calculated by taking the maximum number of agents enabled for any one-hour period in the usage period. Disabled agents are excluded from this calculation.
   * @return endpointAgentsUsed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDPOINT_AGENTS_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEndpointAgentsUsed() {
    return endpointAgentsUsed;
  }


  @JsonProperty(JSON_PROPERTY_ENDPOINT_AGENTS_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndpointAgentsUsed(Long endpointAgentsUsed) {
    this.endpointAgentsUsed = endpointAgentsUsed;
  }


  public UsageDetails endpointAgentsEssentialsUsed(Long endpointAgentsEssentialsUsed) {
    this.endpointAgentsEssentialsUsed = endpointAgentsEssentialsUsed;
    return this;
  }

   /**
   * Number of endpoint agents essentials used in the current usage period. This number is calculated by taking the maximum number of agents enabled for any one-hour period in the usage period. Disabled agents are excluded from this calculation.
   * @return endpointAgentsEssentialsUsed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDPOINT_AGENTS_ESSENTIALS_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEndpointAgentsEssentialsUsed() {
    return endpointAgentsEssentialsUsed;
  }


  @JsonProperty(JSON_PROPERTY_ENDPOINT_AGENTS_ESSENTIALS_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndpointAgentsEssentialsUsed(Long endpointAgentsEssentialsUsed) {
    this.endpointAgentsEssentialsUsed = endpointAgentsEssentialsUsed;
  }


  public UsageDetails endpointAgentsEmbeddedUsed(Long endpointAgentsEmbeddedUsed) {
    this.endpointAgentsEmbeddedUsed = endpointAgentsEmbeddedUsed;
    return this;
  }

   /**
   * Number of embedded endpoint agents used in the current usage period. This number is calculated by taking the maximum number of agents enabled for any one-hour period in the usage period. Disabled agents are excluded from this calculation.
   * @return endpointAgentsEmbeddedUsed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDPOINT_AGENTS_EMBEDDED_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEndpointAgentsEmbeddedUsed() {
    return endpointAgentsEmbeddedUsed;
  }


  @JsonProperty(JSON_PROPERTY_ENDPOINT_AGENTS_EMBEDDED_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndpointAgentsEmbeddedUsed(Long endpointAgentsEmbeddedUsed) {
    this.endpointAgentsEmbeddedUsed = endpointAgentsEmbeddedUsed;
  }


  public UsageDetails enterpriseAgentsUsed(Long enterpriseAgentsUsed) {
    this.enterpriseAgentsUsed = enterpriseAgentsUsed;
    return this;
  }

   /**
   * Number of enterprise agents used in the current usage period. This number is calculated by taking the maximum number of agents enabled for any one-hour period in the usage period. Disabled agents are excluded from this calculation.
   * @return enterpriseAgentsUsed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTERPRISE_AGENTS_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEnterpriseAgentsUsed() {
    return enterpriseAgentsUsed;
  }


  @JsonProperty(JSON_PROPERTY_ENTERPRISE_AGENTS_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseAgentsUsed(Long enterpriseAgentsUsed) {
    this.enterpriseAgentsUsed = enterpriseAgentsUsed;
  }


  public UsageDetails enterpriseAgentUnits(List<EnterpriseAgentUnits> enterpriseAgentUnits) {
    this.enterpriseAgentUnits = enterpriseAgentUnits;
    return this;
  }

  public UsageDetails addEnterpriseAgentUnitsItem(EnterpriseAgentUnits enterpriseAgentUnitsItem) {
    if (this.enterpriseAgentUnits == null) {
      this.enterpriseAgentUnits = new ArrayList<>();
    }
    this.enterpriseAgentUnits.add(enterpriseAgentUnitsItem);
    return this;
  }

   /**
   * A breakdown of enterprise unit consumption for each agent during the current monthly period. Each entry provides data for both the current actual usage and the projected usage. Returns non-zero values for organizations with metered billing.
   * @return enterpriseAgentUnits
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTERPRISE_AGENT_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EnterpriseAgentUnits> getEnterpriseAgentUnits() {
    return enterpriseAgentUnits;
  }


  @JsonProperty(JSON_PROPERTY_ENTERPRISE_AGENT_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseAgentUnits(List<EnterpriseAgentUnits> enterpriseAgentUnits) {
    this.enterpriseAgentUnits = enterpriseAgentUnits;
  }


  public UsageDetails tests(List<Tests> tests) {
    this.tests = tests;
    return this;
  }

  public UsageDetails addTestsItem(Tests testsItem) {
    if (this.tests == null) {
      this.tests = new ArrayList<>();
    }
    this.tests.add(testsItem);
    return this;
  }

   /**
   * A breakdown of unit consumption for each test during the current monthly period. Each entry provides information about both the current actual usage and the projected usage.
   * @return tests
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Tests> getTests() {
    return tests;
  }


  @JsonProperty(JSON_PROPERTY_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTests(List<Tests> tests) {
    this.tests = tests;
  }


  public UsageDetails endpointAgents(List<EndpointAgents> endpointAgents) {
    this.endpointAgents = endpointAgents;
    return this;
  }

  public UsageDetails addEndpointAgentsItem(EndpointAgents endpointAgentsItem) {
    if (this.endpointAgents == null) {
      this.endpointAgents = new ArrayList<>();
    }
    this.endpointAgents.add(endpointAgentsItem);
    return this;
  }

   /**
   * Endpoint agents used by account group.
   * @return endpointAgents
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDPOINT_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EndpointAgents> getEndpointAgents() {
    return endpointAgents;
  }


  @JsonProperty(JSON_PROPERTY_ENDPOINT_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndpointAgents(List<EndpointAgents> endpointAgents) {
    this.endpointAgents = endpointAgents;
  }


  public UsageDetails endpointAgentsEssentials(List<EndpointAgentsEssentials> endpointAgentsEssentials) {
    this.endpointAgentsEssentials = endpointAgentsEssentials;
    return this;
  }

  public UsageDetails addEndpointAgentsEssentialsItem(EndpointAgentsEssentials endpointAgentsEssentialsItem) {
    if (this.endpointAgentsEssentials == null) {
      this.endpointAgentsEssentials = new ArrayList<>();
    }
    this.endpointAgentsEssentials.add(endpointAgentsEssentialsItem);
    return this;
  }

   /**
   * Endpoint agents essentials used by account group.
   * @return endpointAgentsEssentials
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDPOINT_AGENTS_ESSENTIALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EndpointAgentsEssentials> getEndpointAgentsEssentials() {
    return endpointAgentsEssentials;
  }


  @JsonProperty(JSON_PROPERTY_ENDPOINT_AGENTS_ESSENTIALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndpointAgentsEssentials(List<EndpointAgentsEssentials> endpointAgentsEssentials) {
    this.endpointAgentsEssentials = endpointAgentsEssentials;
  }


  public UsageDetails endpointAgentsEmbedded(List<EndpointAgentsEmbedded> endpointAgentsEmbedded) {
    this.endpointAgentsEmbedded = endpointAgentsEmbedded;
    return this;
  }

  public UsageDetails addEndpointAgentsEmbeddedItem(EndpointAgentsEmbedded endpointAgentsEmbeddedItem) {
    if (this.endpointAgentsEmbedded == null) {
      this.endpointAgentsEmbedded = new ArrayList<>();
    }
    this.endpointAgentsEmbedded.add(endpointAgentsEmbeddedItem);
    return this;
  }

   /**
   * Endpoint agents embedded used by account group.
   * @return endpointAgentsEmbedded
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDPOINT_AGENTS_EMBEDDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EndpointAgentsEmbedded> getEndpointAgentsEmbedded() {
    return endpointAgentsEmbedded;
  }


  @JsonProperty(JSON_PROPERTY_ENDPOINT_AGENTS_EMBEDDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndpointAgentsEmbedded(List<EndpointAgentsEmbedded> endpointAgentsEmbedded) {
    this.endpointAgentsEmbedded = endpointAgentsEmbedded;
  }


  public UsageDetails enterpriseAgents(List<EnterpriseAgents> enterpriseAgents) {
    this.enterpriseAgents = enterpriseAgents;
    return this;
  }

  public UsageDetails addEnterpriseAgentsItem(EnterpriseAgents enterpriseAgentsItem) {
    if (this.enterpriseAgents == null) {
      this.enterpriseAgents = new ArrayList<>();
    }
    this.enterpriseAgents.add(enterpriseAgentsItem);
    return this;
  }

   /**
   * Enterprise agents used by account group.
   * @return enterpriseAgents
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTERPRISE_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EnterpriseAgents> getEnterpriseAgents() {
    return enterpriseAgents;
  }


  @JsonProperty(JSON_PROPERTY_ENTERPRISE_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseAgents(List<EnterpriseAgents> enterpriseAgents) {
    this.enterpriseAgents = enterpriseAgents;
  }


  /**
   * Return true if this UsageDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageDetails usageDetails = (UsageDetails) o;
    return Objects.equals(this.quota, usageDetails.quota) &&
        Objects.equals(this.cloudUnitsUsed, usageDetails.cloudUnitsUsed) &&
        Objects.equals(this.cloudUnitsProjected, usageDetails.cloudUnitsProjected) &&
        Objects.equals(this.cloudUnitsNextBillingPeriod, usageDetails.cloudUnitsNextBillingPeriod) &&
        Objects.equals(this.enterpriseUnitsUsed, usageDetails.enterpriseUnitsUsed) &&
        Objects.equals(this.enterpriseUnitsProjected, usageDetails.enterpriseUnitsProjected) &&
        Objects.equals(this.enterpriseUnitsNextBillingPeriod, usageDetails.enterpriseUnitsNextBillingPeriod) &&
        Objects.equals(this.endpointAgentsUsed, usageDetails.endpointAgentsUsed) &&
        Objects.equals(this.endpointAgentsEssentialsUsed, usageDetails.endpointAgentsEssentialsUsed) &&
        Objects.equals(this.endpointAgentsEmbeddedUsed, usageDetails.endpointAgentsEmbeddedUsed) &&
        Objects.equals(this.enterpriseAgentsUsed, usageDetails.enterpriseAgentsUsed) &&
        Objects.equals(this.enterpriseAgentUnits, usageDetails.enterpriseAgentUnits) &&
        Objects.equals(this.tests, usageDetails.tests) &&
        Objects.equals(this.endpointAgents, usageDetails.endpointAgents) &&
        Objects.equals(this.endpointAgentsEssentials, usageDetails.endpointAgentsEssentials) &&
        Objects.equals(this.endpointAgentsEmbedded, usageDetails.endpointAgentsEmbedded) &&
        Objects.equals(this.enterpriseAgents, usageDetails.enterpriseAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quota, cloudUnitsUsed, cloudUnitsProjected, cloudUnitsNextBillingPeriod, enterpriseUnitsUsed, enterpriseUnitsProjected, enterpriseUnitsNextBillingPeriod, endpointAgentsUsed, endpointAgentsEssentialsUsed, endpointAgentsEmbeddedUsed, enterpriseAgentsUsed, enterpriseAgentUnits, tests, endpointAgents, endpointAgentsEssentials, endpointAgentsEmbedded, enterpriseAgents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageDetails {\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    cloudUnitsUsed: ").append(toIndentedString(cloudUnitsUsed)).append("\n");
    sb.append("    cloudUnitsProjected: ").append(toIndentedString(cloudUnitsProjected)).append("\n");
    sb.append("    cloudUnitsNextBillingPeriod: ").append(toIndentedString(cloudUnitsNextBillingPeriod)).append("\n");
    sb.append("    enterpriseUnitsUsed: ").append(toIndentedString(enterpriseUnitsUsed)).append("\n");
    sb.append("    enterpriseUnitsProjected: ").append(toIndentedString(enterpriseUnitsProjected)).append("\n");
    sb.append("    enterpriseUnitsNextBillingPeriod: ").append(toIndentedString(enterpriseUnitsNextBillingPeriod)).append("\n");
    sb.append("    endpointAgentsUsed: ").append(toIndentedString(endpointAgentsUsed)).append("\n");
    sb.append("    endpointAgentsEssentialsUsed: ").append(toIndentedString(endpointAgentsEssentialsUsed)).append("\n");
    sb.append("    endpointAgentsEmbeddedUsed: ").append(toIndentedString(endpointAgentsEmbeddedUsed)).append("\n");
    sb.append("    enterpriseAgentsUsed: ").append(toIndentedString(enterpriseAgentsUsed)).append("\n");
    sb.append("    enterpriseAgentUnits: ").append(toIndentedString(enterpriseAgentUnits)).append("\n");
    sb.append("    tests: ").append(toIndentedString(tests)).append("\n");
    sb.append("    endpointAgents: ").append(toIndentedString(endpointAgents)).append("\n");
    sb.append("    endpointAgentsEssentials: ").append(toIndentedString(endpointAgentsEssentials)).append("\n");
    sb.append("    endpointAgentsEmbedded: ").append(toIndentedString(endpointAgentsEmbedded)).append("\n");
    sb.append("    enterpriseAgents: ").append(toIndentedString(enterpriseAgents)).append("\n");
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
