/*
 * Endpoint Agents API
 * Manage ThousandEyes Endpoint Agents using this API.   For more information about Endpoint Agents, see [Endpoint Agents](https://docs.thousandeyes.com/product-documentation/global-vantage-points/endpoint-agents).
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.agents.model;

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
 * A hyperlink from the containing resource to a URI.
 */
@JsonPropertyOrder({
  Link.JSON_PROPERTY_HREF,
  Link.JSON_PROPERTY_TEMPLATED,
  Link.JSON_PROPERTY_TYPE,
  Link.JSON_PROPERTY_DEPRECATION,
  Link.JSON_PROPERTY_NAME,
  Link.JSON_PROPERTY_PROFILE,
  Link.JSON_PROPERTY_TITLE,
  Link.JSON_PROPERTY_HREFLANG
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-22T10:43:50.660146+01:00[Europe/London]")
public class Link {
  public static final String JSON_PROPERTY_HREF = "href";
  private String href;

  public static final String JSON_PROPERTY_TEMPLATED = "templated";
  private Boolean templated;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_DEPRECATION = "deprecation";
  private String deprecation;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROFILE = "profile";
  private String profile;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_HREFLANG = "hreflang";
  private String hreflang;

  public Link() { 
  }

  public Link href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Its value is either a URI [RFC3986] or a URI template [RFC6570].
   * @return href
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHref() {
    return href;
  }


  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHref(String href) {
    this.href = href;
  }


  public Link templated(Boolean templated) {
    this.templated = templated;
    return this;
  }

   /**
   * Should be true when the link object&#39;s \&quot;href\&quot; property is a URI template.
   * @return templated
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTemplated() {
    return templated;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplated(Boolean templated) {
    this.templated = templated;
  }


  public Link type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Used as a hint to indicate the media type expected when dereferencing the target resource.
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public Link deprecation(String deprecation) {
    this.deprecation = deprecation;
    return this;
  }

   /**
   * Its presence indicates that the link is to be deprecated at a future date. Its value is a URL that should provide further information about the deprecation.
   * @return deprecation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEPRECATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeprecation() {
    return deprecation;
  }


  @JsonProperty(JSON_PROPERTY_DEPRECATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeprecation(String deprecation) {
    this.deprecation = deprecation;
  }


  public Link name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Its value may be used as a secondary key for selecting link objects that share the same relation type.
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


  public Link profile(String profile) {
    this.profile = profile;
    return this;
  }

   /**
   * A URI that hints about the profile of the target resource.
   * @return profile
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProfile() {
    return profile;
  }


  @JsonProperty(JSON_PROPERTY_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfile(String profile) {
    this.profile = profile;
  }


  public Link title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Intended for labelling the link with a human-readable identifier
   * @return title
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public Link hreflang(String hreflang) {
    this.hreflang = hreflang;
    return this;
  }

   /**
   * Indicates the language of the target resource
   * @return hreflang
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HREFLANG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHreflang() {
    return hreflang;
  }


  @JsonProperty(JSON_PROPERTY_HREFLANG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHreflang(String hreflang) {
    this.hreflang = hreflang;
  }


  /**
   * Return true if this Link object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Link link = (Link) o;
    return Objects.equals(this.href, link.href) &&
        Objects.equals(this.templated, link.templated) &&
        Objects.equals(this.type, link.type) &&
        Objects.equals(this.deprecation, link.deprecation) &&
        Objects.equals(this.name, link.name) &&
        Objects.equals(this.profile, link.profile) &&
        Objects.equals(this.title, link.title) &&
        Objects.equals(this.hreflang, link.hreflang);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, templated, type, deprecation, name, profile, title, hreflang);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Link {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    templated: ").append(toIndentedString(templated)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    deprecation: ").append(toIndentedString(deprecation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    hreflang: ").append(toIndentedString(hreflang)).append("\n");
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

