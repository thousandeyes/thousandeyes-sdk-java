/*
 * Administrative API
 * Manage users, accounts, and account groups in the ThousandEyes platform using the Administrative API. This API provides the following endpoints that define the operations to manage your organization:     * `/account-groups`: Account groups are used to divide an organization into different sections. These endpoints can be used to create, retrieve, update and delete account groups.   * `/users`: Create, retrieve, update and delete users within an organization.    * `/roles`: Create, retrieve and update roles for the current user.    * `/permissions`: Retrieve all assignable permissions. Used in the context of modifying roles.    * `/audit-user-events`: Retrieve all activity log events.    For more information about the administrative models, see [Account Management](https://docs.thousandeyes.com/product-documentation/user-management).
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AccountGroup
 */
@JsonPropertyOrder({
  AccountGroup.JSON_PROPERTY_AID,
  AccountGroup.JSON_PROPERTY_ACCOUNT_GROUP_NAME
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class AccountGroup {
  public static final String JSON_PROPERTY_AID = "aid";
  private String aid;

  public static final String JSON_PROPERTY_ACCOUNT_GROUP_NAME = "accountGroupName";
  private String accountGroupName;

  public AccountGroup() { 
  }

  public AccountGroup aid(String aid) {
    this.aid = aid;
    return this;
  }

   /**
   * A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint.
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


  public AccountGroup accountGroupName(String accountGroupName) {
    this.accountGroupName = accountGroupName;
    return this;
  }

   /**
   * Account group name
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


  /**
   * Return true if this AccountGroup object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountGroup accountGroup = (AccountGroup) o;
    return Objects.equals(this.aid, accountGroup.aid) &&
        Objects.equals(this.accountGroupName, accountGroup.accountGroupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aid, accountGroupName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountGroup {\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    accountGroupName: ").append(toIndentedString(accountGroupName)).append("\n");
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

