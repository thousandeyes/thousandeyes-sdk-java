/*
 * Usage API
 *  These usage endpoints define the following operations:  * **Usage**: Retrieve usage data for the specified time period (default is one month).          * Users must have the `View organization usage` permission to access this endpoint.     * This operation offers visibility across all account groups within the organization.     * Users with `View organization usage` permission in multiple organizations should query the operation with the `aid` query string parameter (see optional parameters) for each organization.  * **Quotas**: Obtain organization and account usage quotas. Additionally, users with the appropriate permissions can create, update, or delete these quotas.          * Users must have the necessary permissions to perform quota-related actions.  Refer to the Usage API operations for detailed usage instructions and optional parameters. 
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * OrganizationQuotaUnassignment
 */
@JsonPropertyOrder({
  OrganizationQuotaUnassignment.JSON_PROPERTY_ORG_ID,
  OrganizationQuotaUnassignment.JSON_PROPERTY_ACCOUNT_GROUPS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class OrganizationQuotaUnassignment {
  public static final String JSON_PROPERTY_ORG_ID = "orgId";
  private String orgId;

  public static final String JSON_PROPERTY_ACCOUNT_GROUPS = "accountGroups";
  private List<String> accountGroups = new ArrayList<>();

  public OrganizationQuotaUnassignment() { 
  }

  public OrganizationQuotaUnassignment orgId(String orgId) {
    this.orgId = orgId;
    return this;
  }

   /**
   * Unique identifier of the organization.
   * @return orgId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrgId() {
    return orgId;
  }


  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }


  public OrganizationQuotaUnassignment accountGroups(List<String> accountGroups) {
    this.accountGroups = accountGroups;
    return this;
  }

  public OrganizationQuotaUnassignment addAccountGroupsItem(String accountGroupsItem) {
    if (this.accountGroups == null) {
      this.accountGroups = new ArrayList<>();
    }
    this.accountGroups.add(accountGroupsItem);
    return this;
  }

   /**
   * List of account group IDs.
   * @return accountGroups
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAccountGroups() {
    return accountGroups;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountGroups(List<String> accountGroups) {
    this.accountGroups = accountGroups;
  }


  /**
   * Return true if this OrganizationQuotaUnassignment object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationQuotaUnassignment organizationQuotaUnassignment = (OrganizationQuotaUnassignment) o;
    return Objects.equals(this.orgId, organizationQuotaUnassignment.orgId) &&
        Objects.equals(this.accountGroups, organizationQuotaUnassignment.accountGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgId, accountGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationQuotaUnassignment {\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    accountGroups: ").append(toIndentedString(accountGroups)).append("\n");
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

