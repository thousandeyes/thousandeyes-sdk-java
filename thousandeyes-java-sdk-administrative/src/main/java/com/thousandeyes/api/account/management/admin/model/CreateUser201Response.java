/*
 * Administrative API
 * ## Overview Manage users, accounts, and account groups in the ThousandEyes platform using the Administrative API.  This API provides the following endpoints that define the operations to manage your organization:     * `/account-groups`: Account groups are used to divide an organization into different sections. These endpoints can be used to create, retrieve, update and delete account groups.   * `/users`: Create, retrieve, update and delete users within an organization.    * `/roles`: Create, retrieve and update roles for the current user.    * `/permissions`: Retrieve all assignable permissions. Used in the context of modifying roles.    * `/audit-user-events`: Retrieve all activity log events.
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
import com.thousandeyes.api.account.management.admin.model.AccountGroupRolesAccountGroupRolesInner;
import com.thousandeyes.api.account.management.admin.model.Role;
import com.thousandeyes.api.account.management.admin.model.SelfLinksLinks;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateUser201Response
 */
@JsonPropertyOrder({
  CreateUser201Response.JSON_PROPERTY_NAME,
  CreateUser201Response.JSON_PROPERTY_EMAIL,
  CreateUser201Response.JSON_PROPERTY_UID,
  CreateUser201Response.JSON_PROPERTY_DATE_REGISTERED,
  CreateUser201Response.JSON_PROPERTY_LOGIN_ACCOUNT_GROUP,
  CreateUser201Response.JSON_PROPERTY_ACCOUNT_GROUP_ROLES,
  CreateUser201Response.JSON_PROPERTY_ALL_ACCOUNT_GROUP_ROLES,
  CreateUser201Response.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-02-07T22:58:17.986770Z[Europe/Lisbon]")
public class CreateUser201Response {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_UID = "uid";
  private String uid;

  public static final String JSON_PROPERTY_DATE_REGISTERED = "dateRegistered";
  private OffsetDateTime dateRegistered;

  public static final String JSON_PROPERTY_LOGIN_ACCOUNT_GROUP = "loginAccountGroup";
  private AccountGroup1 loginAccountGroup;

  public static final String JSON_PROPERTY_ACCOUNT_GROUP_ROLES = "accountGroupRoles";
  private List<AccountGroupRolesAccountGroupRolesInner> accountGroupRoles;

  public static final String JSON_PROPERTY_ALL_ACCOUNT_GROUP_ROLES = "allAccountGroupRoles";
  private List<Role> allAccountGroupRoles;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinksLinks links;

  public CreateUser201Response() { 
  }

  public CreateUser201Response name(String name) {
    this.name = name;
    return this;
  }

   /**
   * User&#39;s display name.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public CreateUser201Response email(String email) {
    this.email = email;
    return this;
  }

   /**
   * User&#39;s email address.
   * @return email
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public CreateUser201Response uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Unique ID of the user.
   * @return uid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUid() {
    return uid;
  }


  @JsonProperty(JSON_PROPERTY_UID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUid(String uid) {
    this.uid = uid;
  }


  public CreateUser201Response dateRegistered(OffsetDateTime dateRegistered) {
    this.dateRegistered = dateRegistered;
    return this;
  }

   /**
   * UTC date the user registered their account (ISO date-time format).
   * @return dateRegistered
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_REGISTERED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDateRegistered() {
    return dateRegistered;
  }


  @JsonProperty(JSON_PROPERTY_DATE_REGISTERED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateRegistered(OffsetDateTime dateRegistered) {
    this.dateRegistered = dateRegistered;
  }


  public CreateUser201Response loginAccountGroup(AccountGroup1 loginAccountGroup) {
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


  public CreateUser201Response accountGroupRoles(List<AccountGroupRolesAccountGroupRolesInner> accountGroupRoles) {
    this.accountGroupRoles = accountGroupRoles;
    return this;
  }

  public CreateUser201Response addAccountGroupRolesItem(AccountGroupRolesAccountGroupRolesInner accountGroupRolesItem) {
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


  public CreateUser201Response allAccountGroupRoles(List<Role> allAccountGroupRoles) {
    this.allAccountGroupRoles = allAccountGroupRoles;
    return this;
  }

  public CreateUser201Response addAllAccountGroupRolesItem(Role allAccountGroupRolesItem) {
    if (this.allAccountGroupRoles == null) {
      this.allAccountGroupRoles = new ArrayList<>();
    }
    this.allAccountGroupRoles.add(allAccountGroupRolesItem);
    return this;
  }

   /**
   * Get allAccountGroupRoles
   * @return allAccountGroupRoles
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALL_ACCOUNT_GROUP_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Role> getAllAccountGroupRoles() {
    return allAccountGroupRoles;
  }


  @JsonProperty(JSON_PROPERTY_ALL_ACCOUNT_GROUP_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllAccountGroupRoles(List<Role> allAccountGroupRoles) {
    this.allAccountGroupRoles = allAccountGroupRoles;
  }


  public CreateUser201Response links(SelfLinksLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SelfLinksLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(SelfLinksLinks links) {
    this.links = links;
  }


  /**
   * Return true if this createUser_201_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUser201Response createUser201Response = (CreateUser201Response) o;
    return Objects.equals(this.name, createUser201Response.name) &&
        Objects.equals(this.email, createUser201Response.email) &&
        Objects.equals(this.uid, createUser201Response.uid) &&
        Objects.equals(this.dateRegistered, createUser201Response.dateRegistered) &&
        Objects.equals(this.loginAccountGroup, createUser201Response.loginAccountGroup) &&
        Objects.equals(this.accountGroupRoles, createUser201Response.accountGroupRoles) &&
        Objects.equals(this.allAccountGroupRoles, createUser201Response.allAccountGroupRoles) &&
        Objects.equals(this.links, createUser201Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email, uid, dateRegistered, loginAccountGroup, accountGroupRoles, allAccountGroupRoles, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUser201Response {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    dateRegistered: ").append(toIndentedString(dateRegistered)).append("\n");
    sb.append("    loginAccountGroup: ").append(toIndentedString(loginAccountGroup)).append("\n");
    sb.append("    accountGroupRoles: ").append(toIndentedString(accountGroupRoles)).append("\n");
    sb.append("    allAccountGroupRoles: ").append(toIndentedString(allAccountGroupRoles)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

