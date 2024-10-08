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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Code for the agent error.
 */
public enum ErrorDetailCode {
  
  AGENT_VERSION_OUTDATED("agent-version-outdated"),
  
  BROWSERBOT_VERSION_OUTDATED("browserbot-version-outdated"),
  
  APPLIANCE_VERSION_OUTDATED("appliance-version-outdated"),
  
  CLOCK_OFFSET("clock-offset"),
  
  OS_END_OF_INSTALLATION_SUPPORT("os-end-of-installation-support"),
  
  OS_END_OF_SUPPORT("os-end-of-support"),
  
  OS_END_OF_LIFE("os-end-of-life"),
  
  NAT_TRAVERSAL_ERROR("nat-traversal-error"),
  
  UNKNOWN("unknown");

  private String value;

  ErrorDetailCode(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ErrorDetailCode fromValue(String value) {
    for (ErrorDetailCode b : ErrorDetailCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
  }

}

