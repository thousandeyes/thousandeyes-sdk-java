/*
 * Internet Insights API
 * We are happy to announce the release of the Internet Insights API set. This limited release includes endpoints that:  * Make our catalog provider and Internet outage data accessible to API users. * Provide access to advanced filtering, which is part of our next-generation API efforts to allow API users to fine-tune queries across all of our APIs in a consistent manner.  Internet Insights provide visibility into core Internet infrastructure, including ISPs, DNS providers, IaaS, CDNs , and SaaS providers. It tracks the macro-level impact of Internet events on individual users and enterprise networks connecting at the edge of the Internet. These events include Outages, Routing hijacks and leaks, DDoS attacks, And political interference, among others.  Future releases of the Internet Insights API set will further unlock access to core Internet Insights functionality, unlocking potential integrations to enrich customer process flows.  For more information about Internet Insights, see the [Internet Insights](https://docs.thousandeyes.com/product-documentation/internet-insights). 
 *
 * The version of the OpenAPI document: 7.0.14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.internet.insights.model;

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
 * ApiApplicationOutageAffectedServer
 */
@JsonPropertyOrder({
  ApiApplicationOutageAffectedServer.JSON_PROPERTY_DOMAIN,
  ApiApplicationOutageAffectedServer.JSON_PROPERTY_PREFIX
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ApiApplicationOutageAffectedServer {
  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public static final String JSON_PROPERTY_PREFIX = "prefix";
  private String prefix;

  public ApiApplicationOutageAffectedServer() { 
  }

  public ApiApplicationOutageAffectedServer domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDomain() {
    return domain;
  }


  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomain(String domain) {
    this.domain = domain;
  }


  public ApiApplicationOutageAffectedServer prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Get prefix
   * @return prefix
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrefix() {
    return prefix;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  /**
   * Return true if this ApiApplicationOutageAffectedServer object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiApplicationOutageAffectedServer apiApplicationOutageAffectedServer = (ApiApplicationOutageAffectedServer) o;
    return Objects.equals(this.domain, apiApplicationOutageAffectedServer.domain) &&
        Objects.equals(this.prefix, apiApplicationOutageAffectedServer.prefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, prefix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiApplicationOutageAffectedServer {\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
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

