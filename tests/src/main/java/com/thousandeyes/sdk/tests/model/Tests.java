/*
 * Tests API
 * This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests. 
 *
 * The version of the OpenAPI document: 7.0.11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.tests.model.SelfLinks;
import com.thousandeyes.sdk.tests.model.SimpleTest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Tests
 */
@JsonPropertyOrder({
  Tests.JSON_PROPERTY_TESTS,
  Tests.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class Tests {
  public static final String JSON_PROPERTY_TESTS = "tests";
  private List<SimpleTest> tests = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinks links;

  public Tests() { 
  }

  public Tests tests(List<SimpleTest> tests) {
    this.tests = tests;
    return this;
  }

  public Tests addTestsItem(SimpleTest testsItem) {
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

  public List<SimpleTest> getTests() {
    return tests;
  }


  @JsonProperty(JSON_PROPERTY_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTests(List<SimpleTest> tests) {
    this.tests = tests;
  }


  public Tests links(SelfLinks links) {
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

  public SelfLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(SelfLinks links) {
    this.links = links;
  }


  /**
   * Return true if this Tests object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tests tests = (Tests) o;
    return Objects.equals(this.tests, tests.tests) &&
        Objects.equals(this.links, tests.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tests, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tests {\n");
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
