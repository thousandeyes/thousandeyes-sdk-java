/*
 * Administrative API
 * Manage users, accounts, and account groups in the ThousandEyes platform using the Administrative API. This API provides the following endpoints that define the operations to manage your organization:     * `/account-groups`: Account groups are used to divide an organization into different sections. These endpoints can be used to create, retrieve, update and delete account groups.   * `/users`: Create, retrieve, update and delete users within an organization.    * `/roles`: Create, retrieve and update roles for the current user.    * `/permissions`: Retrieve all assignable permissions. Used in the context of modifying roles.    * `/audit-user-events`: Retrieve all activity log events.    For more information about the administrative models, see [Account Management](https://docs.thousandeyes.com/product-documentation/user-management).
 *
 * The version of the OpenAPI document: 7.0.11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.account.management.administrative.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.account.management.administrative.model.AccountGroup;
import com.thousandeyes.sdk.account.management.administrative.model.Role;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AccountGroupRole
 */
@JsonPropertyOrder({
  AccountGroupRole.JSON_PROPERTY_ACCOUNT_GROUP,
  AccountGroupRole.JSON_PROPERTY_ROLES
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class AccountGroupRole {
  public static final String JSON_PROPERTY_ACCOUNT_GROUP = "accountGroup";
  private AccountGroup accountGroup;

  public static final String JSON_PROPERTY_ROLES = "roles";
  private List<Role> roles = new ArrayList<>();

  public AccountGroupRole() { 
  }

  public AccountGroupRole accountGroup(AccountGroup accountGroup) {
    this.accountGroup = accountGroup;
    return this;
  }

   /**
   * Get accountGroup
   * @return accountGroup
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountGroup getAccountGroup() {
    return accountGroup;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountGroup(AccountGroup accountGroup) {
    this.accountGroup = accountGroup;
  }


  public AccountGroupRole roles(List<Role> roles) {
    this.roles = roles;
    return this;
  }

  public AccountGroupRole addRolesItem(Role rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Role> getRoles() {
    return roles;
  }


  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }


  /**
   * Return true if this AccountGroupRole object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountGroupRole accountGroupRole = (AccountGroupRole) o;
    return Objects.equals(this.accountGroup, accountGroupRole.accountGroup) &&
        Objects.equals(this.roles, accountGroupRole.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountGroup, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountGroupRole {\n");
    sb.append("    accountGroup: ").append(toIndentedString(accountGroup)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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
