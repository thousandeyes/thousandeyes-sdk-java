/*
 * Endpoint Agents API
 * Manage ThousandEyes Endpoint Agents using this API.   For more information about Endpoint Agents, see [Endpoint Agents](https://docs.thousandeyes.com/product-documentation/global-vantage-points/endpoint-agents).
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.agents.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.endpoint.agents.model.BrowserType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EndpointBrowserExtension
 */
@JsonPropertyOrder({
  EndpointBrowserExtension.JSON_PROPERTY_BROWSER,
  EndpointBrowserExtension.JSON_PROPERTY_PROFILE,
  EndpointBrowserExtension.JSON_PROPERTY_VERSION,
  EndpointBrowserExtension.JSON_PROPERTY_ENABLED,
  EndpointBrowserExtension.JSON_PROPERTY_ACTIVE,
  EndpointBrowserExtension.JSON_PROPERTY_ERROR
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class EndpointBrowserExtension {
  public static final String JSON_PROPERTY_BROWSER = "browser";
  private BrowserType browser;

  public static final String JSON_PROPERTY_PROFILE = "profile";
  private String profile;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_ERROR = "error";
  private String error;

  public EndpointBrowserExtension() { 
  }

  public EndpointBrowserExtension browser(BrowserType browser) {
    this.browser = browser;
    return this;
  }

   /**
   * Get browser
   * @return browser
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BROWSER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BrowserType getBrowser() {
    return browser;
  }


  @JsonProperty(JSON_PROPERTY_BROWSER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrowser(BrowserType browser) {
    this.browser = browser;
  }


  public EndpointBrowserExtension profile(String profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Name of the browser profile where this extension is stored.
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


  public EndpointBrowserExtension version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Endpoint agent browser extension version.
   * @return version
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(String version) {
    this.version = version;
  }


  public EndpointBrowserExtension enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates if the extension is disabled or enabled in the web browser.
   * @return enabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public EndpointBrowserExtension active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Flag indicating if there is communication between the extension and ThousandEyes portal. 
   * @return active
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(Boolean active) {
    this.active = active;
  }


  public EndpointBrowserExtension error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Contains any errors encountered while getting extension status.
   * @return error
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setError(String error) {
    this.error = error;
  }


  /**
   * Return true if this EndpointBrowserExtension object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointBrowserExtension endpointBrowserExtension = (EndpointBrowserExtension) o;
    return Objects.equals(this.browser, endpointBrowserExtension.browser) &&
        Objects.equals(this.profile, endpointBrowserExtension.profile) &&
        Objects.equals(this.version, endpointBrowserExtension.version) &&
        Objects.equals(this.enabled, endpointBrowserExtension.enabled) &&
        Objects.equals(this.active, endpointBrowserExtension.active) &&
        Objects.equals(this.error, endpointBrowserExtension.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(browser, profile, version, enabled, active, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointBrowserExtension {\n");
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

