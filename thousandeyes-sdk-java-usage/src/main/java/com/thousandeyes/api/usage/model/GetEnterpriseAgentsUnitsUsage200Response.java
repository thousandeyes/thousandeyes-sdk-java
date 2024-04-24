/*
 * Usage API
 *  These usage endpoints define the following operations:  * **Usage**: Retrieve usage data for the specified time period (default is one month).          * Users must have the `View Billing` permission to access this endpoint.     * This endpoint offers visibility across all account groups within the organization.     * Users with `View Billing` permission in multiple organizations should query the endpoint with the `aid` query string parameter (see optional parameters) for each organization.  * **Quotas**: Obtain organization and account usage quotas. Additionally, users with the appropriate permissions can create, update, or delete these quotas.          * Users must have the necessary permissions to perform quota-related actions.  Refer to the Usage API endpoints for detailed usage instructions and optional parameters. 
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
import com.thousandeyes.api.usage.model.EnterpriseAgentUnitsByTestOwnerAccountGroupBreakdownsInner;
import com.thousandeyes.api.usage.model.PaginationLinksLinks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GetEnterpriseAgentsUnitsUsage200Response
 */
@JsonPropertyOrder({
  GetEnterpriseAgentsUnitsUsage200Response.JSON_PROPERTY_BREAKDOWNS,
  GetEnterpriseAgentsUnitsUsage200Response.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T10:46:26.852676+01:00[Europe/Lisbon]")
public class GetEnterpriseAgentsUnitsUsage200Response {
  public static final String JSON_PROPERTY_BREAKDOWNS = "breakdowns";
  private List<EnterpriseAgentUnitsByTestOwnerAccountGroupBreakdownsInner> breakdowns = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKS = "_links";
  private PaginationLinksLinks links;

  public GetEnterpriseAgentsUnitsUsage200Response() { 
  }

  public GetEnterpriseAgentsUnitsUsage200Response breakdowns(List<EnterpriseAgentUnitsByTestOwnerAccountGroupBreakdownsInner> breakdowns) {
    this.breakdowns = breakdowns;
    return this;
  }

  public GetEnterpriseAgentsUnitsUsage200Response addBreakdownsItem(EnterpriseAgentUnitsByTestOwnerAccountGroupBreakdownsInner breakdownsItem) {
    if (this.breakdowns == null) {
      this.breakdowns = new ArrayList<>();
    }
    this.breakdowns.add(breakdownsItem);
    return this;
  }

   /**
   * Get breakdowns
   * @return breakdowns
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BREAKDOWNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EnterpriseAgentUnitsByTestOwnerAccountGroupBreakdownsInner> getBreakdowns() {
    return breakdowns;
  }


  @JsonProperty(JSON_PROPERTY_BREAKDOWNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBreakdowns(List<EnterpriseAgentUnitsByTestOwnerAccountGroupBreakdownsInner> breakdowns) {
    this.breakdowns = breakdowns;
  }


  public GetEnterpriseAgentsUnitsUsage200Response links(PaginationLinksLinks links) {
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

  public PaginationLinksLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(PaginationLinksLinks links) {
    this.links = links;
  }


  /**
   * Return true if this getEnterpriseAgentsUnitsUsage_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEnterpriseAgentsUnitsUsage200Response getEnterpriseAgentsUnitsUsage200Response = (GetEnterpriseAgentsUnitsUsage200Response) o;
    return Objects.equals(this.breakdowns, getEnterpriseAgentsUnitsUsage200Response.breakdowns) &&
        Objects.equals(this.links, getEnterpriseAgentsUnitsUsage200Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(breakdowns, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEnterpriseAgentsUnitsUsage200Response {\n");
    sb.append("    breakdowns: ").append(toIndentedString(breakdowns)).append("\n");
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

