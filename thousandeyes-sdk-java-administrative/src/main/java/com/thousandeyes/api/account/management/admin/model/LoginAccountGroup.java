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
import com.thousandeyes.api.account.management.admin.model.AccountGroup1;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * LoginAccountGroup
 */
@JsonPropertyOrder({
  LoginAccountGroup.JSON_PROPERTY_LOGIN_ACCOUNT_GROUP
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-30T10:06:13.144945+01:00[Europe/Lisbon]")
public class LoginAccountGroup {
  public static final String JSON_PROPERTY_LOGIN_ACCOUNT_GROUP = "loginAccountGroup";
  private AccountGroup1 loginAccountGroup;

  public LoginAccountGroup() { 
  }

  public LoginAccountGroup loginAccountGroup(AccountGroup1 loginAccountGroup) {
    this.loginAccountGroup = loginAccountGroup;
    return this;
  }

   /**
   * Get loginAccountGroup
   * @return loginAccountGroup
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGIN_ACCOUNT_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountGroup1 getLoginAccountGroup() {
    return loginAccountGroup;
  }


  @JsonProperty(JSON_PROPERTY_LOGIN_ACCOUNT_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoginAccountGroup(AccountGroup1 loginAccountGroup) {
    this.loginAccountGroup = loginAccountGroup;
  }


  /**
   * Return true if this LoginAccountGroup object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginAccountGroup loginAccountGroup = (LoginAccountGroup) o;
    return Objects.equals(this.loginAccountGroup, loginAccountGroup.loginAccountGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loginAccountGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginAccountGroup {\n");
    sb.append("    loginAccountGroup: ").append(toIndentedString(loginAccountGroup)).append("\n");
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

