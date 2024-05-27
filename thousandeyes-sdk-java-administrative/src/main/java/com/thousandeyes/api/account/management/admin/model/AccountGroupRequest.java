/*
 * Administrative API
 * ## Overview Manage users, accounts, and account groups in the ThousandEyes platform using the Administrative API. This API provides the following endpoints that define the operations to manage your organization:     * `/account-groups`: Account groups are used to divide an organization into different sections. These endpoints can be used to create, retrieve, update and delete account groups.   * `/users`: Create, retrieve, update and delete users within an organization.    * `/roles`: Create, retrieve and update roles for the current user.    * `/permissions`: Retrieve all assignable permissions. Used in the context of modifying roles.    * `/audit-user-events`: Retrieve all activity log events.    For more information about the administrative models, see [Account Management](https://docs.thousandeyes.com/product-documentation/user-management).
 *
 * The version of the OpenAPI document: 7.0.5
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AccountGroupRequest
 */
@JsonPropertyOrder({
  AccountGroupRequest.JSON_PROPERTY_ACCOUNT_GROUP_NAME,
  AccountGroupRequest.JSON_PROPERTY_AGENTS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class AccountGroupRequest {
  public static final String JSON_PROPERTY_ACCOUNT_GROUP_NAME = "accountGroupName";
  private String accountGroupName;

  public static final String JSON_PROPERTY_AGENTS = "agents";
  private List<String> agents = new ArrayList<>();

  public AccountGroupRequest() { 
  }

  public AccountGroupRequest accountGroupName(String accountGroupName) {
    this.accountGroupName = accountGroupName;
    return this;
  }

   /**
   * The name of the account group
   * @return accountGroupName
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccountGroupName() {
    return accountGroupName;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountGroupName(String accountGroupName) {
    this.accountGroupName = accountGroupName;
  }


  public AccountGroupRequest agents(List<String> agents) {
    this.agents = agents;
    return this;
  }

  public AccountGroupRequest addAgentsItem(String agentsItem) {
    if (this.agents == null) {
      this.agents = new ArrayList<>();
    }
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * To grant access to enterprise agents, specify the agent list. Note that this is not an additive list - the full list must be specified if changing access to agents.
   * @return agents
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAgents() {
    return agents;
  }


  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgents(List<String> agents) {
    this.agents = agents;
  }


  /**
   * Return true if this AccountGroupRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountGroupRequest accountGroupRequest = (AccountGroupRequest) o;
    return Objects.equals(this.accountGroupName, accountGroupRequest.accountGroupName) &&
        Objects.equals(this.agents, accountGroupRequest.agents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountGroupName, agents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountGroupRequest {\n");
    sb.append("    accountGroupName: ").append(toIndentedString(accountGroupName)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
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

