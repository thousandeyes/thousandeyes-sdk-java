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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EndpointAgentsEssentialsInner
 */
@JsonPropertyOrder({
  EndpointAgentsEssentialsInner.JSON_PROPERTY_AID,
  EndpointAgentsEssentialsInner.JSON_PROPERTY_ACCOUNT_GROUP_NAME,
  EndpointAgentsEssentialsInner.JSON_PROPERTY_ENDPOINT_AGENTS_ESSENTIALS_USED
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-30T10:06:14.323902+01:00[Europe/Lisbon]")
public class EndpointAgentsEssentialsInner {
  public static final String JSON_PROPERTY_AID = "aid";
  private Object aid = null;

  public static final String JSON_PROPERTY_ACCOUNT_GROUP_NAME = "accountGroupName";
  private Object accountGroupName = null;

  public static final String JSON_PROPERTY_ENDPOINT_AGENTS_ESSENTIALS_USED = "endpointAgentsEssentialsUsed";
  private Long endpointAgentsEssentialsUsed;

  public EndpointAgentsEssentialsInner() { 
  }

  public EndpointAgentsEssentialsInner aid(Object aid) {
    this.aid = aid;
    return this;
  }

   /**
   * Unique identifier of the account group owning the endpoint agents essentials.
   * @return aid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getAid() {
    return aid;
  }


  @JsonProperty(JSON_PROPERTY_AID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAid(Object aid) {
    this.aid = aid;
  }


  public EndpointAgentsEssentialsInner accountGroupName(Object accountGroupName) {
    this.accountGroupName = accountGroupName;
    return this;
  }

   /**
   * Name of the account group which owns the endpoint agents essentials.
   * @return accountGroupName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getAccountGroupName() {
    return accountGroupName;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountGroupName(Object accountGroupName) {
    this.accountGroupName = accountGroupName;
  }


  public EndpointAgentsEssentialsInner endpointAgentsEssentialsUsed(Long endpointAgentsEssentialsUsed) {
    this.endpointAgentsEssentialsUsed = endpointAgentsEssentialsUsed;
    return this;
  }

   /**
   * Number of endpoint agents essentials owned by the specific account group in the usage period.
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


  /**
   * Return true if this EndpointAgentsEssentials_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointAgentsEssentialsInner endpointAgentsEssentialsInner = (EndpointAgentsEssentialsInner) o;
    return Objects.equals(this.aid, endpointAgentsEssentialsInner.aid) &&
        Objects.equals(this.accountGroupName, endpointAgentsEssentialsInner.accountGroupName) &&
        Objects.equals(this.endpointAgentsEssentialsUsed, endpointAgentsEssentialsInner.endpointAgentsEssentialsUsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aid, accountGroupName, endpointAgentsEssentialsUsed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointAgentsEssentialsInner {\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    accountGroupName: ").append(toIndentedString(accountGroupName)).append("\n");
    sb.append("    endpointAgentsEssentialsUsed: ").append(toIndentedString(endpointAgentsEssentialsUsed)).append("\n");
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

