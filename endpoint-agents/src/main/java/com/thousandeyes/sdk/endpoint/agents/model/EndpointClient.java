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
import com.thousandeyes.sdk.endpoint.agents.model.EndpointBrowserExtension;
import com.thousandeyes.sdk.endpoint.agents.model.EndpointUserProfile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Information about the user who has the agent installed.
 */
@JsonPropertyOrder({
  EndpointClient.JSON_PROPERTY_USER_PROFILE,
  EndpointClient.JSON_PROPERTY_BROWSER_EXTENSIONS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class EndpointClient {
  public static final String JSON_PROPERTY_USER_PROFILE = "userProfile";
  private EndpointUserProfile userProfile;

  public static final String JSON_PROPERTY_BROWSER_EXTENSIONS = "browserExtensions";
  private List<EndpointBrowserExtension> browserExtensions = new ArrayList<>();

  public EndpointClient() { 
  }

  public EndpointClient userProfile(EndpointUserProfile userProfile) {
    this.userProfile = userProfile;
    return this;
  }

   /**
   * Get userProfile
   * @return userProfile
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EndpointUserProfile getUserProfile() {
    return userProfile;
  }


  @JsonProperty(JSON_PROPERTY_USER_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserProfile(EndpointUserProfile userProfile) {
    this.userProfile = userProfile;
  }


  public EndpointClient browserExtensions(List<EndpointBrowserExtension> browserExtensions) {
    this.browserExtensions = browserExtensions;
    return this;
  }

  public EndpointClient addBrowserExtensionsItem(EndpointBrowserExtension browserExtensionsItem) {
    if (this.browserExtensions == null) {
      this.browserExtensions = new ArrayList<>();
    }
    this.browserExtensions.add(browserExtensionsItem);
    return this;
  }

   /**
   * Get browserExtensions
   * @return browserExtensions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BROWSER_EXTENSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EndpointBrowserExtension> getBrowserExtensions() {
    return browserExtensions;
  }


  @JsonProperty(JSON_PROPERTY_BROWSER_EXTENSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrowserExtensions(List<EndpointBrowserExtension> browserExtensions) {
    this.browserExtensions = browserExtensions;
  }


  /**
   * Return true if this EndpointClient object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointClient endpointClient = (EndpointClient) o;
    return Objects.equals(this.userProfile, endpointClient.userProfile) &&
        Objects.equals(this.browserExtensions, endpointClient.browserExtensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userProfile, browserExtensions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointClient {\n");
    sb.append("    userProfile: ").append(toIndentedString(userProfile)).append("\n");
    sb.append("    browserExtensions: ").append(toIndentedString(browserExtensions)).append("\n");
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

