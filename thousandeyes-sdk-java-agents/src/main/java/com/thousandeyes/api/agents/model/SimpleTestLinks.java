/*
 * Agents API
 *  ## Overview Manage all agents available to your account in ThousandEyes, including both Cloud and Enterprise Agents.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.agents.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.agents.model.Link;
import com.thousandeyes.api.agents.model.SimpleTestLinksSelf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A list of links that can be accessed to get more information
 */
@JsonPropertyOrder({
  SimpleTestLinks.JSON_PROPERTY_SELF,
  SimpleTestLinks.JSON_PROPERTY_TEST_RESULTS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-30T10:06:13.083499+01:00[Europe/Lisbon]")
public class SimpleTestLinks {
  public static final String JSON_PROPERTY_SELF = "self";
  private SimpleTestLinksSelf self;

  public static final String JSON_PROPERTY_TEST_RESULTS = "testResults";
  private List<Link> testResults = new ArrayList<>();

  public SimpleTestLinks() { 
  }

  public SimpleTestLinks self(SimpleTestLinksSelf self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SimpleTestLinksSelf getSelf() {
    return self;
  }


  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelf(SimpleTestLinksSelf self) {
    this.self = self;
  }


  public SimpleTestLinks testResults(List<Link> testResults) {
    this.testResults = testResults;
    return this;
  }

  public SimpleTestLinks addTestResultsItem(Link testResultsItem) {
    if (this.testResults == null) {
      this.testResults = new ArrayList<>();
    }
    this.testResults.add(testResultsItem);
    return this;
  }

   /**
   * Reference to the test results.
   * @return testResults
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Link> getTestResults() {
    return testResults;
  }


  @JsonProperty(JSON_PROPERTY_TEST_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestResults(List<Link> testResults) {
    this.testResults = testResults;
  }


  /**
   * Return true if this SimpleTest__links object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleTestLinks simpleTestLinks = (SimpleTestLinks) o;
    return Objects.equals(this.self, simpleTestLinks.self) &&
        Objects.equals(this.testResults, simpleTestLinks.testResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, testResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleTestLinks {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    testResults: ").append(toIndentedString(testResults)).append("\n");
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

