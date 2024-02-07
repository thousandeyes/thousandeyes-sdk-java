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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EndpointAgentsInner
 */
@JsonPropertyOrder({
  EndpointAgentsInner.JSON_PROPERTY_AID,
  EndpointAgentsInner.JSON_PROPERTY_ACCOUNT_GROUP_NAME,
  EndpointAgentsInner.JSON_PROPERTY_ENDPOINT_AGENTS_USED
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-02-07T22:58:23.243155Z[Europe/Lisbon]")
public class EndpointAgentsInner {
  public static final String JSON_PROPERTY_AID = "aid";
  private Object aid = null;

  public static final String JSON_PROPERTY_ACCOUNT_GROUP_NAME = "accountGroupName";
  private Object accountGroupName = null;

  public static final String JSON_PROPERTY_ENDPOINT_AGENTS_USED = "endpointAgentsUsed";
  private Long endpointAgentsUsed;

  public EndpointAgentsInner() { 
  }

  public EndpointAgentsInner aid(Object aid) {
    this.aid = aid;
    return this;
  }

   /**
   * Unique identifier of the account group owning the endpoint agents.
   * @return aid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getAid() {
    return aid;
  }


  @JsonProperty(JSON_PROPERTY_AID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAid(Object aid) {
    this.aid = aid;
  }


  public EndpointAgentsInner accountGroupName(Object accountGroupName) {
    this.accountGroupName = accountGroupName;
    return this;
  }

   /**
   * Name of the account group which owns the endpoint agents.
   * @return accountGroupName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getAccountGroupName() {
    return accountGroupName;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountGroupName(Object accountGroupName) {
    this.accountGroupName = accountGroupName;
  }


  public EndpointAgentsInner endpointAgentsUsed(Long endpointAgentsUsed) {
    this.endpointAgentsUsed = endpointAgentsUsed;
    return this;
  }

   /**
   * Number of endpoint agents owned by the specific account group in the usage period.
   * @return endpointAgentsUsed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDPOINT_AGENTS_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEndpointAgentsUsed() {
    return endpointAgentsUsed;
  }


  @JsonProperty(JSON_PROPERTY_ENDPOINT_AGENTS_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndpointAgentsUsed(Long endpointAgentsUsed) {
    this.endpointAgentsUsed = endpointAgentsUsed;
  }


  /**
   * Return true if this EndpointAgents_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointAgentsInner endpointAgentsInner = (EndpointAgentsInner) o;
    return Objects.equals(this.aid, endpointAgentsInner.aid) &&
        Objects.equals(this.accountGroupName, endpointAgentsInner.accountGroupName) &&
        Objects.equals(this.endpointAgentsUsed, endpointAgentsInner.endpointAgentsUsed);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(aid, accountGroupName, endpointAgentsUsed);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointAgentsInner {\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    accountGroupName: ").append(toIndentedString(accountGroupName)).append("\n");
    sb.append("    endpointAgentsUsed: ").append(toIndentedString(endpointAgentsUsed)).append("\n");
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

