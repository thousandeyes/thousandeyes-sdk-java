/*
 * Usage API
 * ## Overview These usage endpoints define the following operations: * **Usage**: Retrieve usage data for the specified time period (default is one month).          * Users must have the `View Billing` permission to access this endpoint.     * This endpoint offers visibility across all account groups within the organization.     * Users with `View Billing` permission in multiple organizations should query the endpoint with the `aid` query string parameter (see optional parameters) for each organization.  * **Quotas**: Obtain organization and account usage quotas. Additionally, users with the appropriate permissions can create, update, or delete these quotas.          * Users must have the necessary permissions to perform quota-related actions.  Refer to the API definitions below for detailed usage instructions and optional parameters.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.usage.model;

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
 * AccountGroupQuota
 */
@JsonPropertyOrder({
  AccountGroupQuota.JSON_PROPERTY_VALUE,
  AccountGroupQuota.JSON_PROPERTY_AID
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-02-07T22:58:23.243155Z[Europe/Lisbon]")
public class AccountGroupQuota {
  public static final String JSON_PROPERTY_VALUE = "value";
  private Long value;

  public static final String JSON_PROPERTY_AID = "aid";
  private String aid;

  public AccountGroupQuota() { 
  }

  public AccountGroupQuota value(Long value) {
    this.value = value;
    return this;
  }

   /**
   * Value of the quota for the given Account Group.
   * @return value
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(Long value) {
    this.value = value;
  }


  public AccountGroupQuota aid(String aid) {
    this.aid = aid;
    return this;
  }

   /**
   * Unique ID of the account group.
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


  /**
   * Return true if this AccountGroupQuota object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountGroupQuota accountGroupQuota = (AccountGroupQuota) o;
    return Objects.equals(this.value, accountGroupQuota.value) &&
        Objects.equals(this.aid, accountGroupQuota.aid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, aid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountGroupQuota {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
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

