/*
 * Administrative API
 * ## Overview Manage users, accounts, and account groups in the ThousandEyes platform using the Administrative API. This API provides the following endpoints that define the operations to manage your organization:     * `/account-groups`: Account groups are used to divide an organization into different sections. These endpoints can be used to create, retrieve, update and delete account groups.   * `/users`: Create, retrieve, update and delete users within an organization.    * `/roles`: Create, retrieve and update roles for the current user.    * `/permissions`: Retrieve all assignable permissions. Used in the context of modifying roles.    * `/audit-user-events`: Retrieve all activity log events.    For more information about the administrative models, see [Account Management](https://docs.thousandeyes.com/product-documentation/user-management).
 *
 * The version of the OpenAPI document: 7.0.4
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Permission
 */
@JsonPropertyOrder({
  Permission.JSON_PROPERTY_LABEL,
  Permission.JSON_PROPERTY_PERMISSION_ID,
  Permission.JSON_PROPERTY_IS_MANAGEMENT_PERMISSION,
  Permission.JSON_PROPERTY_PERMISSION
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-05-17T09:32:26.036333+01:00[Europe/Lisbon]")
public class Permission {
  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_PERMISSION_ID = "permissionId";
  private String permissionId;

  public static final String JSON_PROPERTY_IS_MANAGEMENT_PERMISSION = "isManagementPermission";
  private Boolean isManagementPermission;

  public static final String JSON_PROPERTY_PERMISSION = "permission";
  private String permission;

  public Permission() { 
  }

  public Permission label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Label corresponding to the permission.
   * @return label
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabel(String label) {
    this.label = label;
  }


  public Permission permissionId(String permissionId) {
    this.permissionId = permissionId;
    return this;
  }

   /**
   * Unique ID representing the permission.
   * @return permissionId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERMISSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPermissionId() {
    return permissionId;
  }


  @JsonProperty(JSON_PROPERTY_PERMISSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPermissionId(String permissionId) {
    this.permissionId = permissionId;
  }


  public Permission isManagementPermission(Boolean isManagementPermission) {
    this.isManagementPermission = isManagementPermission;
    return this;
  }

   /**
   * Flag indicating whether the permission is classified as a management permission.
   * @return isManagementPermission
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_MANAGEMENT_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsManagementPermission() {
    return isManagementPermission;
  }


  @JsonProperty(JSON_PROPERTY_IS_MANAGEMENT_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsManagementPermission(Boolean isManagementPermission) {
    this.isManagementPermission = isManagementPermission;
  }


  public Permission permission(String permission) {
    this.permission = permission;
    return this;
  }

   /**
   * Permission name
   * @return permission
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPermission() {
    return permission;
  }


  @JsonProperty(JSON_PROPERTY_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPermission(String permission) {
    this.permission = permission;
  }


  /**
   * Return true if this Permission object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Permission permission = (Permission) o;
    return Objects.equals(this.label, permission.label) &&
        Objects.equals(this.permissionId, permission.permissionId) &&
        Objects.equals(this.isManagementPermission, permission.isManagementPermission) &&
        Objects.equals(this.permission, permission.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, permissionId, isManagementPermission, permission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Permission {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    permissionId: ").append(toIndentedString(permissionId)).append("\n");
    sb.append("    isManagementPermission: ").append(toIndentedString(isManagementPermission)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
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

