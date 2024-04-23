/*
 * Administrative API
 * ## Overview Manage users, accounts, and account groups in the ThousandEyes platform using the Administrative API. This API provides the following endpoints that define the operations to manage your organization:     * `/account-groups`: Account groups are used to divide an organization into different sections. These endpoints can be used to create, retrieve, update and delete account groups.   * `/users`: Create, retrieve, update and delete users within an organization.    * `/roles`: Create, retrieve and update roles for the current user.    * `/permissions`: Retrieve all assignable permissions. Used in the context of modifying roles.    * `/audit-user-events`: Retrieve all activity log events.    For more information about the administrative models, see [Account Management](https://docs.thousandeyes.com/product-documentation/user-management).
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.account.management.admin.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.account.management.admin.model.AccountGroupRolesAccountGroupRolesInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AccountGroupRoles
 */
@JsonPropertyOrder({
  AccountGroupRoles.JSON_PROPERTY_ACCOUNT_GROUP_ROLES
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T17:12:31.653403+01:00[Europe/Lisbon]")
public class AccountGroupRoles {
  public static final String JSON_PROPERTY_ACCOUNT_GROUP_ROLES = "accountGroupRoles";
  private List<AccountGroupRolesAccountGroupRolesInner> accountGroupRoles = new ArrayList<>();

  public AccountGroupRoles() { 
  }

  public AccountGroupRoles accountGroupRoles(List<AccountGroupRolesAccountGroupRolesInner> accountGroupRoles) {
    this.accountGroupRoles = accountGroupRoles;
    return this;
  }

  public AccountGroupRoles addAccountGroupRolesItem(AccountGroupRolesAccountGroupRolesInner accountGroupRolesItem) {
    if (this.accountGroupRoles == null) {
      this.accountGroupRoles = new ArrayList<>();
    }
    this.accountGroupRoles.add(accountGroupRolesItem);
    return this;
  }

   /**
   * Get accountGroupRoles
   * @return accountGroupRoles
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUP_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AccountGroupRolesAccountGroupRolesInner> getAccountGroupRoles() {
    return accountGroupRoles;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUP_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountGroupRoles(List<AccountGroupRolesAccountGroupRolesInner> accountGroupRoles) {
    this.accountGroupRoles = accountGroupRoles;
  }


  /**
   * Return true if this AccountGroupRoles object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountGroupRoles accountGroupRoles = (AccountGroupRoles) o;
    return Objects.equals(this.accountGroupRoles, accountGroupRoles.accountGroupRoles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountGroupRoles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountGroupRoles {\n");
    sb.append("    accountGroupRoles: ").append(toIndentedString(accountGroupRoles)).append("\n");
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

