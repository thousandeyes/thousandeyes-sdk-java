/*
 * Usage API
 *  These usage endpoints define the following operations:  * **Usage**: Retrieve usage data for the specified time period (default is one month).          * Users must have the `View Billing` permission to access this endpoint.     * This endpoint offers visibility across all account groups within the organization.     * Users with `View Billing` permission in multiple organizations should query the endpoint with the `aid` query string parameter (see optional parameters) for each organization.  * **Quotas**: Obtain organization and account usage quotas. Additionally, users with the appropriate permissions can create, update, or delete these quotas.          * Users must have the necessary permissions to perform quota-related actions.  Refer to the Usage API endpoints for detailed usage instructions and optional parameters. 
 *
 * The version of the OpenAPI document: 7.0.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.usage.model;

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
 * Tests
 */
@JsonPropertyOrder({
  Tests.JSON_PROPERTY_AID,
  Tests.JSON_PROPERTY_ACCOUNT_GROUP_NAME,
  Tests.JSON_PROPERTY_TEST_ID,
  Tests.JSON_PROPERTY_TEST_NAME,
  Tests.JSON_PROPERTY_TEST_TYPE,
  Tests.JSON_PROPERTY_CLOUD_UNITS_USED,
  Tests.JSON_PROPERTY_CLOUD_UNITS_PROJECTED
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class Tests {
  public static final String JSON_PROPERTY_AID = "aid";
  private String aid;

  public static final String JSON_PROPERTY_ACCOUNT_GROUP_NAME = "accountGroupName";
  private String accountGroupName;

  public static final String JSON_PROPERTY_TEST_ID = "testId";
  private String testId;

  public static final String JSON_PROPERTY_TEST_NAME = "testName";
  private String testName;

  public static final String JSON_PROPERTY_TEST_TYPE = "testType";
  private String testType;

  public static final String JSON_PROPERTY_CLOUD_UNITS_USED = "cloudUnitsUsed";
  private Long cloudUnitsUsed;

  public static final String JSON_PROPERTY_CLOUD_UNITS_PROJECTED = "cloudUnitsProjected";
  private Long cloudUnitsProjected;

  public Tests() { 
  }

  public Tests aid(String aid) {
    this.aid = aid;
    return this;
  }

   /**
   * Unique identifier of the account group which owns the test.
   * @return aid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAid() {
    return aid;
  }


  @JsonProperty(JSON_PROPERTY_AID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAid(String aid) {
    this.aid = aid;
  }


  public Tests accountGroupName(String accountGroupName) {
    this.accountGroupName = accountGroupName;
    return this;
  }

   /**
   * Name of the account group which owns the test.
   * @return accountGroupName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountGroupName() {
    return accountGroupName;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountGroupName(String accountGroupName) {
    this.accountGroupName = accountGroupName;
  }


  public Tests testId(String testId) {
    this.testId = testId;
    return this;
  }

   /**
   * Unique identifier of the test generating usage.
   * @return testId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTestId() {
    return testId;
  }


  @JsonProperty(JSON_PROPERTY_TEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestId(String testId) {
    this.testId = testId;
  }


  public Tests testName(String testName) {
    this.testName = testName;
    return this;
  }

   /**
   * Name of the test generating usage.
   * @return testName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTestName() {
    return testName;
  }


  @JsonProperty(JSON_PROPERTY_TEST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestName(String testName) {
    this.testName = testName;
  }


  public Tests testType(String testType) {
    this.testType = testType;
    return this;
  }

   /**
   * The type of test that generated the usage data. Note that this parameter provides a user-friendly description of the test type and should not be parsed to determine the endpoint for querying configuration details.
   * @return testType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTestType() {
    return testType;
  }


  @JsonProperty(JSON_PROPERTY_TEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestType(String testType) {
    this.testType = testType;
  }


  public Tests cloudUnitsUsed(Long cloudUnitsUsed) {
    this.cloudUnitsUsed = cloudUnitsUsed;
    return this;
  }

   /**
   * Number of cloud units that the test has consumed in the usage period.
   * @return cloudUnitsUsed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOUD_UNITS_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCloudUnitsUsed() {
    return cloudUnitsUsed;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_UNITS_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudUnitsUsed(Long cloudUnitsUsed) {
    this.cloudUnitsUsed = cloudUnitsUsed;
  }


  public Tests cloudUnitsProjected(Long cloudUnitsProjected) {
    this.cloudUnitsProjected = cloudUnitsProjected;
    return this;
  }

   /**
   * The estimated number of cloud units that the test is expected to consume during the usage period. This estimate is determined by considering the units consumed up to the current time and the test&#39;s configuration. It&#39;s important to note that this value is updated every hour. For new tests, the &#x60;cloudUnitsProjected&#x60; parameter is absent until the projection is calculated.
   * @return cloudUnitsProjected
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOUD_UNITS_PROJECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCloudUnitsProjected() {
    return cloudUnitsProjected;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_UNITS_PROJECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudUnitsProjected(Long cloudUnitsProjected) {
    this.cloudUnitsProjected = cloudUnitsProjected;
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
    return Objects.equals(this.aid, tests.aid) &&
        Objects.equals(this.accountGroupName, tests.accountGroupName) &&
        Objects.equals(this.testId, tests.testId) &&
        Objects.equals(this.testName, tests.testName) &&
        Objects.equals(this.testType, tests.testType) &&
        Objects.equals(this.cloudUnitsUsed, tests.cloudUnitsUsed) &&
        Objects.equals(this.cloudUnitsProjected, tests.cloudUnitsProjected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aid, accountGroupName, testId, testName, testType, cloudUnitsUsed, cloudUnitsProjected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tests {\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    accountGroupName: ").append(toIndentedString(accountGroupName)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    testType: ").append(toIndentedString(testType)).append("\n");
    sb.append("    cloudUnitsUsed: ").append(toIndentedString(cloudUnitsUsed)).append("\n");
    sb.append("    cloudUnitsProjected: ").append(toIndentedString(cloudUnitsProjected)).append("\n");
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

