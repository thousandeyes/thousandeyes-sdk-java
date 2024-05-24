/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
 *
 * The version of the OpenAPI document: 7.0.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.dashboards.model;

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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * LegacyDashboardSnapshot
 * @deprecated
 */
@Deprecated
@JsonPropertyOrder({
  LegacyDashboardSnapshot.JSON_PROPERTY_ACCOUNT_ID,
  LegacyDashboardSnapshot.JSON_PROPERTY_CREATED_DATE,
  LegacyDashboardSnapshot.JSON_PROPERTY_EXPIRATION_DATE,
  LegacyDashboardSnapshot.JSON_PROPERTY_PERMALINK,
  LegacyDashboardSnapshot.JSON_PROPERTY_API_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class LegacyDashboardSnapshot {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private String createdDate;

  public static final String JSON_PROPERTY_EXPIRATION_DATE = "expirationDate";
  private String expirationDate;

  public static final String JSON_PROPERTY_PERMALINK = "permalink";
  private String permalink;

  public static final String JSON_PROPERTY_API_LINKS = "apiLinks";
  private List<Map<String, Object>> apiLinks = new ArrayList<>();

  public LegacyDashboardSnapshot() { 
  }

  public LegacyDashboardSnapshot accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Identifier of the account group that the snapshot belongs to.
   * @return accountId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public LegacyDashboardSnapshot createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * UTC date when dashboard snapshot was created.
   * @return createdDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedDate() {
    return createdDate;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }


  public LegacyDashboardSnapshot expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Expiration date of the snapshot. If unspecified, the snapshot expires 1 year from its creation date. The expiration date must be set within 5 years from the current date.
   * @return expirationDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpirationDate() {
    return expirationDate;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }


  public LegacyDashboardSnapshot permalink(String permalink) {
    this.permalink = permalink;
    return this;
  }

   /**
   * Hyperlink to dashboard snapshot in ThousandEyes Application
   * @return permalink
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERMALINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPermalink() {
    return permalink;
  }


  @JsonProperty(JSON_PROPERTY_PERMALINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPermalink(String permalink) {
    this.permalink = permalink;
  }


  public LegacyDashboardSnapshot apiLinks(List<Map<String, Object>> apiLinks) {
    this.apiLinks = apiLinks;
    return this;
  }

  public LegacyDashboardSnapshot addApiLinksItem(Map<String, Object> apiLinksItem) {
    if (this.apiLinks == null) {
      this.apiLinks = new ArrayList<>();
    }
    this.apiLinks.add(apiLinksItem);
    return this;
  }

   /**
   * A links array containing the self link.
   * @return apiLinks
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Map<String, Object>> getApiLinks() {
    return apiLinks;
  }


  @JsonProperty(JSON_PROPERTY_API_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApiLinks(List<Map<String, Object>> apiLinks) {
    this.apiLinks = apiLinks;
  }


  /**
   * Return true if this LegacyDashboardSnapshot object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegacyDashboardSnapshot legacyDashboardSnapshot = (LegacyDashboardSnapshot) o;
    return Objects.equals(this.accountId, legacyDashboardSnapshot.accountId) &&
        Objects.equals(this.createdDate, legacyDashboardSnapshot.createdDate) &&
        Objects.equals(this.expirationDate, legacyDashboardSnapshot.expirationDate) &&
        Objects.equals(this.permalink, legacyDashboardSnapshot.permalink) &&
        Objects.equals(this.apiLinks, legacyDashboardSnapshot.apiLinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, createdDate, expirationDate, permalink, apiLinks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegacyDashboardSnapshot {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    permalink: ").append(toIndentedString(permalink)).append("\n");
    sb.append("    apiLinks: ").append(toIndentedString(apiLinks)).append("\n");
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

