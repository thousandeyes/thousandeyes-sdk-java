/*
 * Administrative API
 * Manage users, accounts, and account groups in the ThousandEyes platform using the Administrative API. This API provides the following operations to manage your organization:     * `/account-groups`: Account groups are used to divide an organization into different sections. These operations can be used to create, retrieve, update and delete account groups.   * `/users`: Create, retrieve, update and delete users within an organization.    * `/roles`: Create, retrieve and update roles for the current user.    * `/permissions`: Retrieve all assignable permissions. Used in the context of modifying roles.    * `/audit-user-events`: Retrieve all activity log events.    For more information about the administrative models, see [Account Management](https://docs.thousandeyes.com/product-documentation/user-management).
 *
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UserAccountGroupRole
 */
@JsonPropertyOrder({
  UserAccountGroupRole.JSON_PROPERTY_ACCOUNT_GROUP_ID,
  UserAccountGroupRole.JSON_PROPERTY_ROLE_IDS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class UserAccountGroupRole {
  public static final String JSON_PROPERTY_ACCOUNT_GROUP_ID = "accountGroupId";
  private String accountGroupId;

  public static final String JSON_PROPERTY_ROLE_IDS = "roleIds";
  private List<String> roleIds = new ArrayList<>();

  public UserAccountGroupRole() { 
  }

  public UserAccountGroupRole accountGroupId(String accountGroupId) {
    this.accountGroupId = accountGroupId;
    return this;
  }

   /**
   * Unique ID of the account group.
   * @return accountGroupId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountGroupId() {
    return accountGroupId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountGroupId(String accountGroupId) {
    this.accountGroupId = accountGroupId;
  }


  public UserAccountGroupRole roleIds(List<String> roleIds) {
    this.roleIds = roleIds;
    return this;
  }

  public UserAccountGroupRole addRoleIdsItem(String roleIdsItem) {
    if (this.roleIds == null) {
      this.roleIds = new ArrayList<>();
    }
    this.roleIds.add(roleIdsItem);
    return this;
  }

   /**
   * Unique role IDs.
   * @return roleIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRoleIds() {
    return roleIds;
  }


  @JsonProperty(JSON_PROPERTY_ROLE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoleIds(List<String> roleIds) {
    this.roleIds = roleIds;
  }


  /**
   * Return true if this UserAccountGroupRole object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAccountGroupRole userAccountGroupRole = (UserAccountGroupRole) o;
    return Objects.equals(this.accountGroupId, userAccountGroupRole.accountGroupId) &&
        Objects.equals(this.roleIds, userAccountGroupRole.roleIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountGroupId, roleIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAccountGroupRole {\n");
    sb.append("    accountGroupId: ").append(toIndentedString(accountGroupId)).append("\n");
    sb.append("    roleIds: ").append(toIndentedString(roleIds)).append("\n");
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

