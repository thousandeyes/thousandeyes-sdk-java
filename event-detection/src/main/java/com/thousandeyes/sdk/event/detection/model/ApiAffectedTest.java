/*
 * Event Detection API
 *  Event detection occurs when ThousandEyes identifies that error signals related to a component (proxy, network node, AS, server etc) have deviated from the baselines established by events. * To determine this, ThousandEyes takes the test results from all accounts groups within an organization, and analyzes that data. * Noisy test results (those that have too many errors in a short window) are removed until they stabilize, and the rest of the results are tagged with the components associated with that test result (for example, proxy, network, or server). * Next, any increase in failures from the test results and each component helps in determining the problem domain and which component may be at fault. * When this failure rate increases beyond a pre-defined threshold (set by the algorithm), an event is triggered and an email notification is sent to the user (if they've enabled email alerts).  With the Events API, you can perform the following tasks on the ThousandEyes platform: * **Retrieve Events**: Obtain a list of events and detailed information for each event. For more information about events, see [Event Detection](https://docs.thousandeyes.com/product-documentation/event-detection). 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.event.detection.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.event.detection.model.TestLinks;
import com.thousandeyes.sdk.event.detection.model.TestType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ApiAffectedTest
 */
@JsonPropertyOrder({
  ApiAffectedTest.JSON_PROPERTY_TEST_ID,
  ApiAffectedTest.JSON_PROPERTY_TEST_TYPE,
  ApiAffectedTest.JSON_PROPERTY_NAME,
  ApiAffectedTest.JSON_PROPERTY_AFFECTED_TARGET_IDS,
  ApiAffectedTest.JSON_PROPERTY_AFFECTED_AGENT_IDS,
  ApiAffectedTest.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ApiAffectedTest {
  public static final String JSON_PROPERTY_TEST_ID = "testId";
  private String testId;

  public static final String JSON_PROPERTY_TEST_TYPE = "testType";
  private TestType testType;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_AFFECTED_TARGET_IDS = "affectedTargetIds";
  private List<String> affectedTargetIds = new ArrayList<>();

  public static final String JSON_PROPERTY_AFFECTED_AGENT_IDS = "affectedAgentIds";
  private List<String> affectedAgentIds = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKS = "_links";
  private TestLinks links;

  public ApiAffectedTest() { 
  }

  @JsonCreator
  public ApiAffectedTest(
    @JsonProperty(JSON_PROPERTY_TEST_ID) String testId, 
    @JsonProperty(JSON_PROPERTY_NAME) String name
  ) {
  this();
    this.testId = testId;
    this.name = name;
  }

   /**
   * The ID of the affected test.
   * @return testId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTestId() {
    return testId;
  }




  public ApiAffectedTest testType(TestType testType) {
    this.testType = testType;
    return this;
  }

   /**
   * Get testType
   * @return testType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestType getTestType() {
    return testType;
  }


  @JsonProperty(JSON_PROPERTY_TEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestType(TestType testType) {
    this.testType = testType;
  }


   /**
   * The test name as configured in the test settings.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }




  public ApiAffectedTest affectedTargetIds(List<String> affectedTargetIds) {
    this.affectedTargetIds = affectedTargetIds;
    return this;
  }

  public ApiAffectedTest addAffectedTargetIdsItem(String affectedTargetIdsItem) {
    if (this.affectedTargetIds == null) {
      this.affectedTargetIds = new ArrayList<>();
    }
    this.affectedTargetIds.add(affectedTargetIdsItem);
    return this;
  }

   /**
   * An array of unique target IDs contributed data points which generated the signal for the event.
   * @return affectedTargetIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AFFECTED_TARGET_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAffectedTargetIds() {
    return affectedTargetIds;
  }


  @JsonProperty(JSON_PROPERTY_AFFECTED_TARGET_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAffectedTargetIds(List<String> affectedTargetIds) {
    this.affectedTargetIds = affectedTargetIds;
  }


  public ApiAffectedTest affectedAgentIds(List<String> affectedAgentIds) {
    this.affectedAgentIds = affectedAgentIds;
    return this;
  }

  public ApiAffectedTest addAffectedAgentIdsItem(String affectedAgentIdsItem) {
    if (this.affectedAgentIds == null) {
      this.affectedAgentIds = new ArrayList<>();
    }
    this.affectedAgentIds.add(affectedAgentIdsItem);
    return this;
  }

   /**
   * An array of unique agent IDs that contributed data points which generated the signal for the event.
   * @return affectedAgentIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AFFECTED_AGENT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAffectedAgentIds() {
    return affectedAgentIds;
  }


  @JsonProperty(JSON_PROPERTY_AFFECTED_AGENT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAffectedAgentIds(List<String> affectedAgentIds) {
    this.affectedAgentIds = affectedAgentIds;
  }


  public ApiAffectedTest links(TestLinks links) {
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

  public TestLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(TestLinks links) {
    this.links = links;
  }


  /**
   * Return true if this ApiAffectedTest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiAffectedTest apiAffectedTest = (ApiAffectedTest) o;
    return Objects.equals(this.testId, apiAffectedTest.testId) &&
        Objects.equals(this.testType, apiAffectedTest.testType) &&
        Objects.equals(this.name, apiAffectedTest.name) &&
        Objects.equals(this.affectedTargetIds, apiAffectedTest.affectedTargetIds) &&
        Objects.equals(this.affectedAgentIds, apiAffectedTest.affectedAgentIds) &&
        Objects.equals(this.links, apiAffectedTest.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testId, testType, name, affectedTargetIds, affectedAgentIds, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiAffectedTest {\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    testType: ").append(toIndentedString(testType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    affectedTargetIds: ").append(toIndentedString(affectedTargetIds)).append("\n");
    sb.append("    affectedAgentIds: ").append(toIndentedString(affectedAgentIds)).append("\n");
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
