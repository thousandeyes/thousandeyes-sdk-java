/*
 * Usage API
 *  These usage endpoints define the following operations:  * **Usage**: Retrieve usage data for the specified time period (default is one month).          * Users must have the `View Billing` permission to access this endpoint.     * This endpoint offers visibility across all account groups within the organization.     * Users with `View Billing` permission in multiple organizations should query the endpoint with the `aid` query string parameter (see optional parameters) for each organization.  * **Quotas**: Obtain organization and account usage quotas. Additionally, users with the appropriate permissions can create, update, or delete these quotas.          * Users must have the necessary permissions to perform quota-related actions.  Refer to the Usage API endpoints for detailed usage instructions and optional parameters. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.usage.model;

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
 * UnitsByTestsBreakdownsInner
 */
@JsonPropertyOrder({
  UnitsByTestsBreakdownsInner.JSON_PROPERTY_AID,
  UnitsByTestsBreakdownsInner.JSON_PROPERTY_ACCOUNT_GROUP_NAME,
  UnitsByTestsBreakdownsInner.JSON_PROPERTY_ENTERPRISE_UNITS_USED,
  UnitsByTestsBreakdownsInner.JSON_PROPERTY_ENTERPRISE_UNITS_PROJECTED,
  UnitsByTestsBreakdownsInner.JSON_PROPERTY_CLOUD_UNITS_USED,
  UnitsByTestsBreakdownsInner.JSON_PROPERTY_CLOUD_UNITS_PROJECTED,
  UnitsByTestsBreakdownsInner.JSON_PROPERTY_TEST_ID,
  UnitsByTestsBreakdownsInner.JSON_PROPERTY_TEST_NAME,
  UnitsByTestsBreakdownsInner.JSON_PROPERTY_TEST_TYPE,
  UnitsByTestsBreakdownsInner.JSON_PROPERTY_IS_INSTANT_TEST
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T16:57:46.021172+01:00[Europe/Lisbon]")
public class UnitsByTestsBreakdownsInner {
  public static final String JSON_PROPERTY_AID = "aid";
  private String aid;

  public static final String JSON_PROPERTY_ACCOUNT_GROUP_NAME = "accountGroupName";
  private String accountGroupName;

  public static final String JSON_PROPERTY_ENTERPRISE_UNITS_USED = "enterpriseUnitsUsed";
  private Integer enterpriseUnitsUsed;

  public static final String JSON_PROPERTY_ENTERPRISE_UNITS_PROJECTED = "enterpriseUnitsProjected";
  private Integer enterpriseUnitsProjected;

  public static final String JSON_PROPERTY_CLOUD_UNITS_USED = "cloudUnitsUsed";
  private Integer cloudUnitsUsed;

  public static final String JSON_PROPERTY_CLOUD_UNITS_PROJECTED = "cloudUnitsProjected";
  private Integer cloudUnitsProjected;

  public static final String JSON_PROPERTY_TEST_ID = "testId";
  private String testId;

  public static final String JSON_PROPERTY_TEST_NAME = "testName";
  private String testName;

  public static final String JSON_PROPERTY_TEST_TYPE = "testType";
  private String testType;

  public static final String JSON_PROPERTY_IS_INSTANT_TEST = "isInstantTest";
  private Boolean isInstantTest;

  public UnitsByTestsBreakdownsInner() { 
  }

  public UnitsByTestsBreakdownsInner aid(String aid) {
    this.aid = aid;
    return this;
  }

   /**
   * Unique ID of the account group owning the test that is generating units
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


  public UnitsByTestsBreakdownsInner accountGroupName(String accountGroupName) {
    this.accountGroupName = accountGroupName;
    return this;
  }

   /**
   * Name of the account group which owns the test that is generating the units
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


  public UnitsByTestsBreakdownsInner enterpriseUnitsUsed(Integer enterpriseUnitsUsed) {
    this.enterpriseUnitsUsed = enterpriseUnitsUsed;
    return this;
  }

   /**
   * Units generated by the by the enterprise agents running the test
   * @return enterpriseUnitsUsed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTERPRISE_UNITS_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEnterpriseUnitsUsed() {
    return enterpriseUnitsUsed;
  }


  @JsonProperty(JSON_PROPERTY_ENTERPRISE_UNITS_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseUnitsUsed(Integer enterpriseUnitsUsed) {
    this.enterpriseUnitsUsed = enterpriseUnitsUsed;
  }


  public UnitsByTestsBreakdownsInner enterpriseUnitsProjected(Integer enterpriseUnitsProjected) {
    this.enterpriseUnitsProjected = enterpriseUnitsProjected;
    return this;
  }

   /**
   * Enterprise Units projected in the current usage period, based on units consumed to date and configuration of the test
   * @return enterpriseUnitsProjected
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTERPRISE_UNITS_PROJECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEnterpriseUnitsProjected() {
    return enterpriseUnitsProjected;
  }


  @JsonProperty(JSON_PROPERTY_ENTERPRISE_UNITS_PROJECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseUnitsProjected(Integer enterpriseUnitsProjected) {
    this.enterpriseUnitsProjected = enterpriseUnitsProjected;
  }


  public UnitsByTestsBreakdownsInner cloudUnitsUsed(Integer cloudUnitsUsed) {
    this.cloudUnitsUsed = cloudUnitsUsed;
    return this;
  }

   /**
   * Units generated by the by the cloud agents running the test
   * @return cloudUnitsUsed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOUD_UNITS_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCloudUnitsUsed() {
    return cloudUnitsUsed;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_UNITS_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudUnitsUsed(Integer cloudUnitsUsed) {
    this.cloudUnitsUsed = cloudUnitsUsed;
  }


  public UnitsByTestsBreakdownsInner cloudUnitsProjected(Integer cloudUnitsProjected) {
    this.cloudUnitsProjected = cloudUnitsProjected;
    return this;
  }

   /**
   * Cloud Units projected in the current usage period, based on units consumed to date and configuration of the test
   * @return cloudUnitsProjected
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOUD_UNITS_PROJECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCloudUnitsProjected() {
    return cloudUnitsProjected;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_UNITS_PROJECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudUnitsProjected(Integer cloudUnitsProjected) {
    this.cloudUnitsProjected = cloudUnitsProjected;
  }


  public UnitsByTestsBreakdownsInner testId(String testId) {
    this.testId = testId;
    return this;
  }

   /**
   * Unique ID of the test generating usage
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


  public UnitsByTestsBreakdownsInner testName(String testName) {
    this.testName = testName;
    return this;
  }

   /**
   * Name of the test generating usage
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


  public UnitsByTestsBreakdownsInner testType(String testType) {
    this.testType = testType;
    return this;
  }

   /**
   * Type of test generating usage. Note that this is a friendly testType entry (so it shouldn’t be parsed to discover the correct endpoint to query for configuration details).
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


  public UnitsByTestsBreakdownsInner isInstantTest(Boolean isInstantTest) {
    this.isInstantTest = isInstantTest;
    return this;
  }

   /**
   * Indicates whether the test is scheduled or instant
   * @return isInstantTest
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_INSTANT_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsInstantTest() {
    return isInstantTest;
  }


  @JsonProperty(JSON_PROPERTY_IS_INSTANT_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsInstantTest(Boolean isInstantTest) {
    this.isInstantTest = isInstantTest;
  }


  /**
   * Return true if this UnitsByTests_breakdowns_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnitsByTestsBreakdownsInner unitsByTestsBreakdownsInner = (UnitsByTestsBreakdownsInner) o;
    return Objects.equals(this.aid, unitsByTestsBreakdownsInner.aid) &&
        Objects.equals(this.accountGroupName, unitsByTestsBreakdownsInner.accountGroupName) &&
        Objects.equals(this.enterpriseUnitsUsed, unitsByTestsBreakdownsInner.enterpriseUnitsUsed) &&
        Objects.equals(this.enterpriseUnitsProjected, unitsByTestsBreakdownsInner.enterpriseUnitsProjected) &&
        Objects.equals(this.cloudUnitsUsed, unitsByTestsBreakdownsInner.cloudUnitsUsed) &&
        Objects.equals(this.cloudUnitsProjected, unitsByTestsBreakdownsInner.cloudUnitsProjected) &&
        Objects.equals(this.testId, unitsByTestsBreakdownsInner.testId) &&
        Objects.equals(this.testName, unitsByTestsBreakdownsInner.testName) &&
        Objects.equals(this.testType, unitsByTestsBreakdownsInner.testType) &&
        Objects.equals(this.isInstantTest, unitsByTestsBreakdownsInner.isInstantTest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aid, accountGroupName, enterpriseUnitsUsed, enterpriseUnitsProjected, cloudUnitsUsed, cloudUnitsProjected, testId, testName, testType, isInstantTest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnitsByTestsBreakdownsInner {\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    accountGroupName: ").append(toIndentedString(accountGroupName)).append("\n");
    sb.append("    enterpriseUnitsUsed: ").append(toIndentedString(enterpriseUnitsUsed)).append("\n");
    sb.append("    enterpriseUnitsProjected: ").append(toIndentedString(enterpriseUnitsProjected)).append("\n");
    sb.append("    cloudUnitsUsed: ").append(toIndentedString(cloudUnitsUsed)).append("\n");
    sb.append("    cloudUnitsProjected: ").append(toIndentedString(cloudUnitsProjected)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    testType: ").append(toIndentedString(testType)).append("\n");
    sb.append("    isInstantTest: ").append(toIndentedString(isInstantTest)).append("\n");
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

