/*
 * Usage API
 *  These usage endpoints define the following operations:  * **Usage**: Retrieve usage data for the specified time period (default is one month).          * Users must have the `View Billing` permission to access this endpoint.     * This endpoint offers visibility across all account groups within the organization.     * Users with `View Billing` permission in multiple organizations should query the endpoint with the `aid` query string parameter (see optional parameters) for each organization.  * **Quotas**: Obtain organization and account usage quotas. Additionally, users with the appropriate permissions can create, update, or delete these quotas.          * Users must have the necessary permissions to perform quota-related actions.  Refer to the Usage API endpoints for detailed usage instructions and optional parameters. 
 *
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
 * EnterpriseAgents
 */
@JsonPropertyOrder({
  EnterpriseAgents.JSON_PROPERTY_AID,
  EnterpriseAgents.JSON_PROPERTY_ACCOUNT_GROUP_NAME,
  EnterpriseAgents.JSON_PROPERTY_ENTERPRISE_AGENTS_USED
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class EnterpriseAgents {
  public static final String JSON_PROPERTY_AID = "aid";
  private String aid;

  public static final String JSON_PROPERTY_ACCOUNT_GROUP_NAME = "accountGroupName";
  private String accountGroupName;

  public static final String JSON_PROPERTY_ENTERPRISE_AGENTS_USED = "enterpriseAgentsUsed";
  private Long enterpriseAgentsUsed;

  public EnterpriseAgents() { 
  }

  public EnterpriseAgents aid(String aid) {
    this.aid = aid;
    return this;
  }

   /**
   * A unique identifier that specifies the account group that owns the enterprise agents.
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


  public EnterpriseAgents accountGroupName(String accountGroupName) {
    this.accountGroupName = accountGroupName;
    return this;
  }

   /**
   * Name of the account group which owns the enterprise agents.
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


  public EnterpriseAgents enterpriseAgentsUsed(Long enterpriseAgentsUsed) {
    this.enterpriseAgentsUsed = enterpriseAgentsUsed;
    return this;
  }

   /**
   * Number of enterprise agents owned by the specific account group in the usage period.
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


  /**
   * Return true if this EnterpriseAgents object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseAgents enterpriseAgents = (EnterpriseAgents) o;
    return Objects.equals(this.aid, enterpriseAgents.aid) &&
        Objects.equals(this.accountGroupName, enterpriseAgents.accountGroupName) &&
        Objects.equals(this.enterpriseAgentsUsed, enterpriseAgents.enterpriseAgentsUsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aid, accountGroupName, enterpriseAgentsUsed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseAgents {\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    accountGroupName: ").append(toIndentedString(accountGroupName)).append("\n");
    sb.append("    enterpriseAgentsUsed: ").append(toIndentedString(enterpriseAgentsUsed)).append("\n");
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

