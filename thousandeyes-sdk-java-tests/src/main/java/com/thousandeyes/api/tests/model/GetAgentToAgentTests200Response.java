/*
 * Tests API
 * This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.tests.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.tests.model.SelfLinksLinks;
import com.thousandeyes.api.tests.model.UnexpandedAgentToAgentTest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GetAgentToAgentTests200Response
 */
@JsonPropertyOrder({
  GetAgentToAgentTests200Response.JSON_PROPERTY_TESTS,
  GetAgentToAgentTests200Response.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T10:46:27.140198+01:00[Europe/Lisbon]")
public class GetAgentToAgentTests200Response {
  public static final String JSON_PROPERTY_TESTS = "tests";
  private List<UnexpandedAgentToAgentTest> tests = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinksLinks links;

  public GetAgentToAgentTests200Response() { 
  }

  public GetAgentToAgentTests200Response tests(List<UnexpandedAgentToAgentTest> tests) {
    this.tests = tests;
    return this;
  }

  public GetAgentToAgentTests200Response addTestsItem(UnexpandedAgentToAgentTest testsItem) {
    if (this.tests == null) {
      this.tests = new ArrayList<>();
    }
    this.tests.add(testsItem);
    return this;
  }

   /**
   * Get tests
   * @return tests
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UnexpandedAgentToAgentTest> getTests() {
    return tests;
  }


  @JsonProperty(JSON_PROPERTY_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTests(List<UnexpandedAgentToAgentTest> tests) {
    this.tests = tests;
  }


  public GetAgentToAgentTests200Response links(SelfLinksLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SelfLinksLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(SelfLinksLinks links) {
    this.links = links;
  }


  /**
   * Return true if this getAgentToAgentTests_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAgentToAgentTests200Response getAgentToAgentTests200Response = (GetAgentToAgentTests200Response) o;
    return Objects.equals(this.tests, getAgentToAgentTests200Response.tests) &&
        Objects.equals(this.links, getAgentToAgentTests200Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tests, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAgentToAgentTests200Response {\n");
    sb.append("    tests: ").append(toIndentedString(tests)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

