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
import com.thousandeyes.api.account.management.admin.model.SelfLinksLinks;
import com.thousandeyes.api.account.management.admin.model.UserAccountGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateAccountGroup201Response
 */
@JsonPropertyOrder({
  CreateAccountGroup201Response.JSON_PROPERTY_AID,
  CreateAccountGroup201Response.JSON_PROPERTY_ACCOUNT_GROUP_NAME,
  CreateAccountGroup201Response.JSON_PROPERTY_IS_CURRENT_ACCOUNT_GROUP,
  CreateAccountGroup201Response.JSON_PROPERTY_IS_DEFAULT_ACCOUNT_GROUP,
  CreateAccountGroup201Response.JSON_PROPERTY_ORGANIZATION_NAME,
  CreateAccountGroup201Response.JSON_PROPERTY_USERS,
  CreateAccountGroup201Response.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T17:12:31.653403+01:00[Europe/Lisbon]")
public class CreateAccountGroup201Response {
  public static final String JSON_PROPERTY_AID = "aid";
  private String aid;

  public static final String JSON_PROPERTY_ACCOUNT_GROUP_NAME = "accountGroupName";
  private String accountGroupName;

  public static final String JSON_PROPERTY_IS_CURRENT_ACCOUNT_GROUP = "isCurrentAccountGroup";
  private Boolean isCurrentAccountGroup;

  public static final String JSON_PROPERTY_IS_DEFAULT_ACCOUNT_GROUP = "isDefaultAccountGroup";
  private Boolean isDefaultAccountGroup;

  public static final String JSON_PROPERTY_ORGANIZATION_NAME = "organizationName";
  private String organizationName;

  public static final String JSON_PROPERTY_USERS = "users";
  private List<UserAccountGroup> users = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinksLinks links;

  public CreateAccountGroup201Response() { 
  }

  public CreateAccountGroup201Response aid(String aid) {
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


  public CreateAccountGroup201Response accountGroupName(String accountGroupName) {
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


  public CreateAccountGroup201Response isCurrentAccountGroup(Boolean isCurrentAccountGroup) {
    this.isCurrentAccountGroup = isCurrentAccountGroup;
    return this;
  }

   /**
   * Indicates whether the requested aid is the context of the current account.
   * @return isCurrentAccountGroup
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_CURRENT_ACCOUNT_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsCurrentAccountGroup() {
    return isCurrentAccountGroup;
  }


  @JsonProperty(JSON_PROPERTY_IS_CURRENT_ACCOUNT_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsCurrentAccountGroup(Boolean isCurrentAccountGroup) {
    this.isCurrentAccountGroup = isCurrentAccountGroup;
  }


  public CreateAccountGroup201Response isDefaultAccountGroup(Boolean isDefaultAccountGroup) {
    this.isDefaultAccountGroup = isDefaultAccountGroup;
    return this;
  }

   /**
   * Indicates whether the aid is the default one for the requesting user.
   * @return isDefaultAccountGroup
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT_ACCOUNT_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDefaultAccountGroup() {
    return isDefaultAccountGroup;
  }


  @JsonProperty(JSON_PROPERTY_IS_DEFAULT_ACCOUNT_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDefaultAccountGroup(Boolean isDefaultAccountGroup) {
    this.isDefaultAccountGroup = isDefaultAccountGroup;
  }


  public CreateAccountGroup201Response organizationName(String organizationName) {
    this.organizationName = organizationName;
    return this;
  }

   /**
   * (Optional) Indicates whether the aid is the default one for the requesting user.
   * @return organizationName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrganizationName() {
    return organizationName;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }


  public CreateAccountGroup201Response users(List<UserAccountGroup> users) {
    this.users = users;
    return this;
  }

  public CreateAccountGroup201Response addUsersItem(UserAccountGroup usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UserAccountGroup> getUsers() {
    return users;
  }


  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsers(List<UserAccountGroup> users) {
    this.users = users;
  }


  public CreateAccountGroup201Response links(SelfLinksLinks links) {
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
   * Return true if this createAccountGroup_201_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAccountGroup201Response createAccountGroup201Response = (CreateAccountGroup201Response) o;
    return Objects.equals(this.aid, createAccountGroup201Response.aid) &&
        Objects.equals(this.accountGroupName, createAccountGroup201Response.accountGroupName) &&
        Objects.equals(this.isCurrentAccountGroup, createAccountGroup201Response.isCurrentAccountGroup) &&
        Objects.equals(this.isDefaultAccountGroup, createAccountGroup201Response.isDefaultAccountGroup) &&
        Objects.equals(this.organizationName, createAccountGroup201Response.organizationName) &&
        Objects.equals(this.users, createAccountGroup201Response.users) &&
        Objects.equals(this.links, createAccountGroup201Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aid, accountGroupName, isCurrentAccountGroup, isDefaultAccountGroup, organizationName, users, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAccountGroup201Response {\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    accountGroupName: ").append(toIndentedString(accountGroupName)).append("\n");
    sb.append("    isCurrentAccountGroup: ").append(toIndentedString(isCurrentAccountGroup)).append("\n");
    sb.append("    isDefaultAccountGroup: ").append(toIndentedString(isDefaultAccountGroup)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

