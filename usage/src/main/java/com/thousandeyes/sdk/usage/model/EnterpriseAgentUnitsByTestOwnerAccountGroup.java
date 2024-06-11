/*
 * Usage API
 *  These usage endpoints define the following operations:  * **Usage**: Retrieve usage data for the specified time period (default is one month).          * Users must have the `View Billing` permission to access this endpoint.     * This endpoint offers visibility across all account groups within the organization.     * Users with `View Billing` permission in multiple organizations should query the endpoint with the `aid` query string parameter (see optional parameters) for each organization.  * **Quotas**: Obtain organization and account usage quotas. Additionally, users with the appropriate permissions can create, update, or delete these quotas.          * Users must have the necessary permissions to perform quota-related actions.  Refer to the Usage API endpoints for detailed usage instructions and optional parameters. 
 *
 * The version of the OpenAPI document: 7.0.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.usage.model;

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
 * EnterpriseAgentUnitsByTestOwnerAccountGroup
 */
@JsonPropertyOrder({
  EnterpriseAgentUnitsByTestOwnerAccountGroup.JSON_PROPERTY_AID,
  EnterpriseAgentUnitsByTestOwnerAccountGroup.JSON_PROPERTY_ACCOUNT_GROUP_NAME,
  EnterpriseAgentUnitsByTestOwnerAccountGroup.JSON_PROPERTY_AGENT_ID,
  EnterpriseAgentUnitsByTestOwnerAccountGroup.JSON_PROPERTY_AGENT_NAME,
  EnterpriseAgentUnitsByTestOwnerAccountGroup.JSON_PROPERTY_ENTERPRISE_UNITS_USED,
  EnterpriseAgentUnitsByTestOwnerAccountGroup.JSON_PROPERTY_ENTERPRISE_UNITS_PROJECTED,
  EnterpriseAgentUnitsByTestOwnerAccountGroup.JSON_PROPERTY_VAGENT_ID
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class EnterpriseAgentUnitsByTestOwnerAccountGroup {
  public static final String JSON_PROPERTY_AID = "aid";
  private String aid;

  public static final String JSON_PROPERTY_ACCOUNT_GROUP_NAME = "accountGroupName";
  private String accountGroupName;

  public static final String JSON_PROPERTY_AGENT_ID = "agentId";
  private String agentId;

  public static final String JSON_PROPERTY_AGENT_NAME = "agentName";
  private String agentName;

  public static final String JSON_PROPERTY_ENTERPRISE_UNITS_USED = "enterpriseUnitsUsed";
  private Long enterpriseUnitsUsed;

  public static final String JSON_PROPERTY_ENTERPRISE_UNITS_PROJECTED = "enterpriseUnitsProjected";
  private Long enterpriseUnitsProjected;

  public static final String JSON_PROPERTY_VAGENT_ID = "vagentId";
  private String vagentId;

  public EnterpriseAgentUnitsByTestOwnerAccountGroup() { 
  }

  public EnterpriseAgentUnitsByTestOwnerAccountGroup aid(String aid) {
    this.aid = aid;
    return this;
  }

   /**
   * Unique identifier of the account group where some tests are incurring the enterprise agent units.
   * @return aid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAid() {
    return aid;
  }


  @JsonProperty(JSON_PROPERTY_AID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAid(String aid) {
    this.aid = aid;
  }


  public EnterpriseAgentUnitsByTestOwnerAccountGroup accountGroupName(String accountGroupName) {
    this.accountGroupName = accountGroupName;
    return this;
  }

   /**
   * Name of the account group which owns the tests that are incurring enterprise agent units.
   * @return accountGroupName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountGroupName() {
    return accountGroupName;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountGroupName(String accountGroupName) {
    this.accountGroupName = accountGroupName;
  }


  public EnterpriseAgentUnitsByTestOwnerAccountGroup agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }

   /**
   * Unique identifier of the enterprise agent generating usage.
   * @return agentId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAgentId() {
    return agentId;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }


  public EnterpriseAgentUnitsByTestOwnerAccountGroup agentName(String agentName) {
    this.agentName = agentName;
    return this;
  }

   /**
   * Name of the enterprise agent generating usage.
   * @return agentName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAgentName() {
    return agentName;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentName(String agentName) {
    this.agentName = agentName;
  }


  public EnterpriseAgentUnitsByTestOwnerAccountGroup enterpriseUnitsUsed(Long enterpriseUnitsUsed) {
    this.enterpriseUnitsUsed = enterpriseUnitsUsed;
    return this;
  }

   /**
   * Number of enterprise agent units owned by the specific account group in the usage period.
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


  public EnterpriseAgentUnitsByTestOwnerAccountGroup enterpriseUnitsProjected(Long enterpriseUnitsProjected) {
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


  public EnterpriseAgentUnitsByTestOwnerAccountGroup vagentId(String vagentId) {
    this.vagentId = vagentId;
    return this;
  }

   /**
   * Unique identifier of the virtual agent generating usage
   * @return vagentId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VAGENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVagentId() {
    return vagentId;
  }


  @JsonProperty(JSON_PROPERTY_VAGENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVagentId(String vagentId) {
    this.vagentId = vagentId;
  }


  /**
   * Return true if this EnterpriseAgentUnitsByTestOwnerAccountGroup object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseAgentUnitsByTestOwnerAccountGroup enterpriseAgentUnitsByTestOwnerAccountGroup = (EnterpriseAgentUnitsByTestOwnerAccountGroup) o;
    return Objects.equals(this.aid, enterpriseAgentUnitsByTestOwnerAccountGroup.aid) &&
        Objects.equals(this.accountGroupName, enterpriseAgentUnitsByTestOwnerAccountGroup.accountGroupName) &&
        Objects.equals(this.agentId, enterpriseAgentUnitsByTestOwnerAccountGroup.agentId) &&
        Objects.equals(this.agentName, enterpriseAgentUnitsByTestOwnerAccountGroup.agentName) &&
        Objects.equals(this.enterpriseUnitsUsed, enterpriseAgentUnitsByTestOwnerAccountGroup.enterpriseUnitsUsed) &&
        Objects.equals(this.enterpriseUnitsProjected, enterpriseAgentUnitsByTestOwnerAccountGroup.enterpriseUnitsProjected) &&
        Objects.equals(this.vagentId, enterpriseAgentUnitsByTestOwnerAccountGroup.vagentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aid, accountGroupName, agentId, agentName, enterpriseUnitsUsed, enterpriseUnitsProjected, vagentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseAgentUnitsByTestOwnerAccountGroup {\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    accountGroupName: ").append(toIndentedString(accountGroupName)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
    sb.append("    enterpriseUnitsUsed: ").append(toIndentedString(enterpriseUnitsUsed)).append("\n");
    sb.append("    enterpriseUnitsProjected: ").append(toIndentedString(enterpriseUnitsProjected)).append("\n");
    sb.append("    vagentId: ").append(toIndentedString(vagentId)).append("\n");
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

