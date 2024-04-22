/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.tests.results.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.tests.results.model.Link;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A links object containing the ThousandEyes App link
 */
@JsonPropertyOrder({
  AppLinksLinks.JSON_PROPERTY_APP_LINK
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-22T10:43:50.800492+01:00[Europe/London]")
public class AppLinksLinks {
  public static final String JSON_PROPERTY_APP_LINK = "appLink";
  private Link appLink;

  public AppLinksLinks() { 
  }

  public AppLinksLinks appLink(Link appLink) {
    this.appLink = appLink;
    return this;
  }

   /**
   * Get appLink
   * @return appLink
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Link getAppLink() {
    return appLink;
  }


  @JsonProperty(JSON_PROPERTY_APP_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppLink(Link appLink) {
    this.appLink = appLink;
  }


  /**
   * Return true if this AppLinks__links object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppLinksLinks appLinksLinks = (AppLinksLinks) o;
    return Objects.equals(this.appLink, appLinksLinks.appLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppLinksLinks {\n");
    sb.append("    appLink: ").append(toIndentedString(appLink)).append("\n");
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

