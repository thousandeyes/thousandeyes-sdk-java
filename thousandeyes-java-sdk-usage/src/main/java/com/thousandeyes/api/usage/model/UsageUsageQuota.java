/*
 * Usage API
 * ## Overview These usage endpoints define the following operations: * **Usage**: Retrieve usage data for the specified time period (default is one month).          * Users must have the `View Billing` permission to access this endpoint.     * This endpoint offers visibility across all account groups within the organization.     * Users with `View Billing` permission in multiple organizations should query the endpoint with the `aid` query string parameter (see optional parameters) for each organization.  * **Quotas**: Obtain organization and account usage quotas. Additionally, users with the appropriate permissions can create, update, or delete these quotas.          * Users must have the necessary permissions to perform quota-related actions.  Refer to the API definitions below for detailed usage instructions and optional parameters.
 *
 * The version of the OpenAPI document: 7.0.0
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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UsageUsageQuota
 */
@JsonPropertyOrder({
  UsageUsageQuota.JSON_PROPERTY_MONTH_START,
  UsageUsageQuota.JSON_PROPERTY_MONTH_END,
  UsageUsageQuota.JSON_PROPERTY_CLOUD_UNITS_INCLUDED,
  UsageUsageQuota.JSON_PROPERTY_ENDPOINT_AGENTS_INCLUDED,
  UsageUsageQuota.JSON_PROPERTY_ENDPOINT_AGENTS_ESSENTIALS_INCLUDED,
  UsageUsageQuota.JSON_PROPERTY_ENDPOINT_AGENTS_EMBEDDED_INCLUDED,
  UsageUsageQuota.JSON_PROPERTY_ENTERPRISE_AGENTS_INCLUDED
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-02-07T22:58:23.243155Z[Europe/Lisbon]")
public class UsageUsageQuota {
  public static final String JSON_PROPERTY_MONTH_START = "monthStart";
  private OffsetDateTime monthStart;

  public static final String JSON_PROPERTY_MONTH_END = "monthEnd";
  private OffsetDateTime monthEnd;

  public static final String JSON_PROPERTY_CLOUD_UNITS_INCLUDED = "cloudUnitsIncluded";
  private Long cloudUnitsIncluded;

  public static final String JSON_PROPERTY_ENDPOINT_AGENTS_INCLUDED = "endpointAgentsIncluded";
  private Long endpointAgentsIncluded;

  public static final String JSON_PROPERTY_ENDPOINT_AGENTS_ESSENTIALS_INCLUDED = "endpointAgentsEssentialsIncluded";
  private Long endpointAgentsEssentialsIncluded;

  public static final String JSON_PROPERTY_ENDPOINT_AGENTS_EMBEDDED_INCLUDED = "endpointAgentsEmbeddedIncluded";
  private Long endpointAgentsEmbeddedIncluded;

  public static final String JSON_PROPERTY_ENTERPRISE_AGENTS_INCLUDED = "enterpriseAgentsIncluded";
  private Long enterpriseAgentsIncluded;

  public UsageUsageQuota() { 
  }

  public UsageUsageQuota monthStart(OffsetDateTime monthStart) {
    this.monthStart = monthStart;
    return this;
  }

   /**
   * Beginning of usage period in UTC (ISO date-time format).
   * @return monthStart
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONTH_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getMonthStart() {
    return monthStart;
  }


  @JsonProperty(JSON_PROPERTY_MONTH_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonthStart(OffsetDateTime monthStart) {
    this.monthStart = monthStart;
  }


  public UsageUsageQuota monthEnd(OffsetDateTime monthEnd) {
    this.monthEnd = monthEnd;
    return this;
  }

   /**
   * End of usage period in UTC (ISO date-time format)..
   * @return monthEnd
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONTH_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getMonthEnd() {
    return monthEnd;
  }


  @JsonProperty(JSON_PROPERTY_MONTH_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonthEnd(OffsetDateTime monthEnd) {
    this.monthEnd = monthEnd;
  }


  public UsageUsageQuota cloudUnitsIncluded(Long cloudUnitsIncluded) {
    this.cloudUnitsIncluded = cloudUnitsIncluded;
    return this;
  }

   /**
   * Monthly number of cloud units allocated, as part of the contract.
   * @return cloudUnitsIncluded
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOUD_UNITS_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCloudUnitsIncluded() {
    return cloudUnitsIncluded;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_UNITS_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudUnitsIncluded(Long cloudUnitsIncluded) {
    this.cloudUnitsIncluded = cloudUnitsIncluded;
  }


  public UsageUsageQuota endpointAgentsIncluded(Long endpointAgentsIncluded) {
    this.endpointAgentsIncluded = endpointAgentsIncluded;
    return this;
  }

   /**
   * Monthly number of endpoint agents allocated, as part of the contract.
   * @return endpointAgentsIncluded
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDPOINT_AGENTS_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEndpointAgentsIncluded() {
    return endpointAgentsIncluded;
  }


  @JsonProperty(JSON_PROPERTY_ENDPOINT_AGENTS_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndpointAgentsIncluded(Long endpointAgentsIncluded) {
    this.endpointAgentsIncluded = endpointAgentsIncluded;
  }


  public UsageUsageQuota endpointAgentsEssentialsIncluded(Long endpointAgentsEssentialsIncluded) {
    this.endpointAgentsEssentialsIncluded = endpointAgentsEssentialsIncluded;
    return this;
  }

   /**
   * Monthly number of endpoint agents essentials allocated, as part of the contract.
   * @return endpointAgentsEssentialsIncluded
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDPOINT_AGENTS_ESSENTIALS_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEndpointAgentsEssentialsIncluded() {
    return endpointAgentsEssentialsIncluded;
  }


  @JsonProperty(JSON_PROPERTY_ENDPOINT_AGENTS_ESSENTIALS_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndpointAgentsEssentialsIncluded(Long endpointAgentsEssentialsIncluded) {
    this.endpointAgentsEssentialsIncluded = endpointAgentsEssentialsIncluded;
  }


  public UsageUsageQuota endpointAgentsEmbeddedIncluded(Long endpointAgentsEmbeddedIncluded) {
    this.endpointAgentsEmbeddedIncluded = endpointAgentsEmbeddedIncluded;
    return this;
  }

   /**
   * Number of embedded endpoint agents allocated monthly, as specified in the contract.
   * @return endpointAgentsEmbeddedIncluded
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDPOINT_AGENTS_EMBEDDED_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEndpointAgentsEmbeddedIncluded() {
    return endpointAgentsEmbeddedIncluded;
  }


  @JsonProperty(JSON_PROPERTY_ENDPOINT_AGENTS_EMBEDDED_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndpointAgentsEmbeddedIncluded(Long endpointAgentsEmbeddedIncluded) {
    this.endpointAgentsEmbeddedIncluded = endpointAgentsEmbeddedIncluded;
  }


  public UsageUsageQuota enterpriseAgentsIncluded(Long enterpriseAgentsIncluded) {
    this.enterpriseAgentsIncluded = enterpriseAgentsIncluded;
    return this;
  }

   /**
   * Monthly number of enterprise agents allocated, as part of the contract. Returns non-zero value only for organizations with legacy billing.
   * @return enterpriseAgentsIncluded
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTERPRISE_AGENTS_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEnterpriseAgentsIncluded() {
    return enterpriseAgentsIncluded;
  }


  @JsonProperty(JSON_PROPERTY_ENTERPRISE_AGENTS_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseAgentsIncluded(Long enterpriseAgentsIncluded) {
    this.enterpriseAgentsIncluded = enterpriseAgentsIncluded;
  }


  /**
   * Return true if this Usage_usage_quota object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageUsageQuota usageUsageQuota = (UsageUsageQuota) o;
    return Objects.equals(this.monthStart, usageUsageQuota.monthStart) &&
        Objects.equals(this.monthEnd, usageUsageQuota.monthEnd) &&
        Objects.equals(this.cloudUnitsIncluded, usageUsageQuota.cloudUnitsIncluded) &&
        Objects.equals(this.endpointAgentsIncluded, usageUsageQuota.endpointAgentsIncluded) &&
        Objects.equals(this.endpointAgentsEssentialsIncluded, usageUsageQuota.endpointAgentsEssentialsIncluded) &&
        Objects.equals(this.endpointAgentsEmbeddedIncluded, usageUsageQuota.endpointAgentsEmbeddedIncluded) &&
        Objects.equals(this.enterpriseAgentsIncluded, usageUsageQuota.enterpriseAgentsIncluded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monthStart, monthEnd, cloudUnitsIncluded, endpointAgentsIncluded, endpointAgentsEssentialsIncluded, endpointAgentsEmbeddedIncluded, enterpriseAgentsIncluded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageUsageQuota {\n");
    sb.append("    monthStart: ").append(toIndentedString(monthStart)).append("\n");
    sb.append("    monthEnd: ").append(toIndentedString(monthEnd)).append("\n");
    sb.append("    cloudUnitsIncluded: ").append(toIndentedString(cloudUnitsIncluded)).append("\n");
    sb.append("    endpointAgentsIncluded: ").append(toIndentedString(endpointAgentsIncluded)).append("\n");
    sb.append("    endpointAgentsEssentialsIncluded: ").append(toIndentedString(endpointAgentsEssentialsIncluded)).append("\n");
    sb.append("    endpointAgentsEmbeddedIncluded: ").append(toIndentedString(endpointAgentsEmbeddedIncluded)).append("\n");
    sb.append("    enterpriseAgentsIncluded: ").append(toIndentedString(enterpriseAgentsIncluded)).append("\n");
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
