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
import com.thousandeyes.api.usage.model.AccountGroupQuota;
import com.thousandeyes.api.usage.model.OrganizationQuota;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * QuotasQuotasInner
 */
@JsonPropertyOrder({
  QuotasQuotasInner.JSON_PROPERTY_ORGANIZATION_QUOTA,
  QuotasQuotasInner.JSON_PROPERTY_ACCOUNT_GROUP_QUOTAS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T17:12:32.521046+01:00[Europe/Lisbon]")
public class QuotasQuotasInner {
  public static final String JSON_PROPERTY_ORGANIZATION_QUOTA = "organizationQuota";
  private OrganizationQuota organizationQuota;

  public static final String JSON_PROPERTY_ACCOUNT_GROUP_QUOTAS = "accountGroupQuotas";
  private List<AccountGroupQuota> accountGroupQuotas = new ArrayList<>();

  public QuotasQuotasInner() { 
  }

  public QuotasQuotasInner organizationQuota(OrganizationQuota organizationQuota) {
    this.organizationQuota = organizationQuota;
    return this;
  }

   /**
   * Get organizationQuota
   * @return organizationQuota
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrganizationQuota getOrganizationQuota() {
    return organizationQuota;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZATION_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrganizationQuota(OrganizationQuota organizationQuota) {
    this.organizationQuota = organizationQuota;
  }


  public QuotasQuotasInner accountGroupQuotas(List<AccountGroupQuota> accountGroupQuotas) {
    this.accountGroupQuotas = accountGroupQuotas;
    return this;
  }

  public QuotasQuotasInner addAccountGroupQuotasItem(AccountGroupQuota accountGroupQuotasItem) {
    if (this.accountGroupQuotas == null) {
      this.accountGroupQuotas = new ArrayList<>();
    }
    this.accountGroupQuotas.add(accountGroupQuotasItem);
    return this;
  }

   /**
   * Get accountGroupQuotas
   * @return accountGroupQuotas
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUP_QUOTAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AccountGroupQuota> getAccountGroupQuotas() {
    return accountGroupQuotas;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUP_QUOTAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountGroupQuotas(List<AccountGroupQuota> accountGroupQuotas) {
    this.accountGroupQuotas = accountGroupQuotas;
  }


  /**
   * Return true if this Quotas_quotas_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotasQuotasInner quotasQuotasInner = (QuotasQuotasInner) o;
    return Objects.equals(this.organizationQuota, quotasQuotasInner.organizationQuota) &&
        Objects.equals(this.accountGroupQuotas, quotasQuotasInner.accountGroupQuotas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationQuota, accountGroupQuotas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuotasQuotasInner {\n");
    sb.append("    organizationQuota: ").append(toIndentedString(organizationQuota)).append("\n");
    sb.append("    accountGroupQuotas: ").append(toIndentedString(accountGroupQuotas)).append("\n");
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

