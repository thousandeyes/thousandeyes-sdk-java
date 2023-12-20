/*
 * Tests API
 *  ### Overview This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests.
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.tests.model.Agent;
import com.thousandeyes.api.tests.model.AlertRule;
import com.thousandeyes.api.tests.model.TestDscpId;
import com.thousandeyes.api.tests.model.TestInterval;
import com.thousandeyes.api.tests.model.TestLabelsInner;
import com.thousandeyes.api.tests.model.TestSharedAccountsInner;
import com.thousandeyes.api.tests.model.UnexpandedInstantTestLinks;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.thousandeyes.api.JSON;

/**
 * VoiceTest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T12:21:06.198107Z[Europe/Lisbon]")
public class VoiceTest {
  public static final String SERIALIZED_NAME_INTERVAL = "interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private TestInterval interval;

  public static final String SERIALIZED_NAME_ALERTS_ENABLED = "alertsEnabled";
  @SerializedName(SERIALIZED_NAME_ALERTS_ENABLED)
  private Boolean alertsEnabled;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled = true;

  public static final String SERIALIZED_NAME_ALERT_RULES = "alertRules";
  @SerializedName(SERIALIZED_NAME_ALERT_RULES)
  private List<AlertRule> alertRules;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LIVE_SHARE = "liveShare";
  @SerializedName(SERIALIZED_NAME_LIVE_SHARE)
  private Boolean liveShare;

  public static final String SERIALIZED_NAME_MODIFIED_BY = "modifiedBy";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY)
  private String modifiedBy;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private OffsetDateTime modifiedDate;

  public static final String SERIALIZED_NAME_SAVED_EVENT = "savedEvent";
  @SerializedName(SERIALIZED_NAME_SAVED_EVENT)
  private Boolean savedEvent;

  public static final String SERIALIZED_NAME_TEST_ID = "testId";
  @SerializedName(SERIALIZED_NAME_TEST_ID)
  private String testId;

  public static final String SERIALIZED_NAME_TEST_NAME = "testName";
  @SerializedName(SERIALIZED_NAME_TEST_NAME)
  private String testName;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private UnexpandedInstantTestLinks links;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<TestLabelsInner> labels;

  public static final String SERIALIZED_NAME_SHARED_WITH_ACCOUNTS = "sharedWithAccounts";
  @SerializedName(SERIALIZED_NAME_SHARED_WITH_ACCOUNTS)
  private List<TestSharedAccountsInner> sharedWithAccounts;

  public static final String SERIALIZED_NAME_AGENTS = "agents";
  @SerializedName(SERIALIZED_NAME_AGENTS)
  private List<Agent> agents = new ArrayList<>();

  public static final String SERIALIZED_NAME_CODEC = "codec";
  @SerializedName(SERIALIZED_NAME_CODEC)
  private String codec;

  public static final String SERIALIZED_NAME_CODEC_ID = "codecId";
  @SerializedName(SERIALIZED_NAME_CODEC_ID)
  private String codecId;

  public static final String SERIALIZED_NAME_DSCP = "dscp";
  @SerializedName(SERIALIZED_NAME_DSCP)
  private String dscp;

  public static final String SERIALIZED_NAME_DSCP_ID = "dscpId";
  @SerializedName(SERIALIZED_NAME_DSCP_ID)
  private TestDscpId dscpId = TestDscpId._0;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration = 5;

  public static final String SERIALIZED_NAME_JITTER_BUFFER = "jitterBuffer";
  @SerializedName(SERIALIZED_NAME_JITTER_BUFFER)
  private Integer jitterBuffer = 40;

  public static final String SERIALIZED_NAME_NUM_PATH_TRACES = "numPathTraces";
  @SerializedName(SERIALIZED_NAME_NUM_PATH_TRACES)
  private Integer numPathTraces = 3;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_TARGET_AGENT_ID = "targetAgentId";
  @SerializedName(SERIALIZED_NAME_TARGET_AGENT_ID)
  private String targetAgentId;

  public static final String SERIALIZED_NAME_BGP_MEASUREMENTS = "bgpMeasurements";
  @SerializedName(SERIALIZED_NAME_BGP_MEASUREMENTS)
  private Boolean bgpMeasurements = true;

  public VoiceTest() {
  }

  
  public VoiceTest(
     String createdBy, 
     OffsetDateTime createdDate, 
     Boolean liveShare, 
     String modifiedBy, 
     OffsetDateTime modifiedDate, 
     Boolean savedEvent, 
     String testId, 
     String type, 
     List<TestLabelsInner> labels, 
     List<TestSharedAccountsInner> sharedWithAccounts, 
     List<Agent> agents, 
     String codec, 
     String dscp
  ) {
    this();
    this.createdBy = createdBy;
    this.createdDate = createdDate;
    this.liveShare = liveShare;
    this.modifiedBy = modifiedBy;
    this.modifiedDate = modifiedDate;
    this.savedEvent = savedEvent;
    this.testId = testId;
    this.type = type;
    this.labels = labels;
    this.sharedWithAccounts = sharedWithAccounts;
    this.agents = agents;
    this.codec = codec;
    this.dscp = dscp;
  }

  public VoiceTest interval(TestInterval interval) {
    
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @javax.annotation.Nonnull
  public TestInterval getInterval() {
    return interval;
  }


  public void setInterval(TestInterval interval) {
    this.interval = interval;
  }


  public VoiceTest alertsEnabled(Boolean alertsEnabled) {
    
    this.alertsEnabled = alertsEnabled;
    return this;
  }

   /**
   * Indicates if alerts are enabled.
   * @return alertsEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getAlertsEnabled() {
    return alertsEnabled;
  }


  public void setAlertsEnabled(Boolean alertsEnabled) {
    this.alertsEnabled = alertsEnabled;
  }


  public VoiceTest enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Test is enabled.
   * @return enabled
  **/
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public VoiceTest alertRules(List<AlertRule> alertRules) {
    
    this.alertRules = alertRules;
    return this;
  }

  public VoiceTest addAlertRulesItem(AlertRule alertRulesItem) {
    if (this.alertRules == null) {
      this.alertRules = new ArrayList<>();
    }
    this.alertRules.add(alertRulesItem);
    return this;
  }

   /**
   * Contains list of enabled alert rule objects.
   * @return alertRules
  **/
  @javax.annotation.Nullable
  public List<AlertRule> getAlertRules() {
    return alertRules;
  }


  public void setAlertRules(List<AlertRule> alertRules) {
    this.alertRules = alertRules;
  }


   /**
   * User that created the test.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  public String getCreatedBy() {
    return createdBy;
  }




   /**
   * UTC created date (ISO date-time format).
   * @return createdDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }




  public VoiceTest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description of the test.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


   /**
   * Indicates if the test is shared with the account group.
   * @return liveShare
  **/
  @javax.annotation.Nullable
  public Boolean getLiveShare() {
    return liveShare;
  }




   /**
   * User that modified the test.
   * @return modifiedBy
  **/
  @javax.annotation.Nullable
  public String getModifiedBy() {
    return modifiedBy;
  }




   /**
   * UTC last modification date (ISO date-time format).
   * @return modifiedDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }




   /**
   * Indicates if the test is a saved event.
   * @return savedEvent
  **/
  @javax.annotation.Nullable
  public Boolean getSavedEvent() {
    return savedEvent;
  }




   /**
   * Each test is assigned an unique ID; this is used to access test information and results from other endpoints.
   * @return testId
  **/
  @javax.annotation.Nullable
  public String getTestId() {
    return testId;
  }




  public VoiceTest testName(String testName) {
    
    this.testName = testName;
    return this;
  }

   /**
   * The name of the test. Test name must be unique.
   * @return testName
  **/
  @javax.annotation.Nullable
  public String getTestName() {
    return testName;
  }


  public void setTestName(String testName) {
    this.testName = testName;
  }


   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }




  public VoiceTest links(UnexpandedInstantTestLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public UnexpandedInstantTestLinks getLinks() {
    return links;
  }


  public void setLinks(UnexpandedInstantTestLinks links) {
    this.links = links;
  }


   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable
  public List<TestLabelsInner> getLabels() {
    return labels;
  }




   /**
   * Get sharedWithAccounts
   * @return sharedWithAccounts
  **/
  @javax.annotation.Nullable
  public List<TestSharedAccountsInner> getSharedWithAccounts() {
    return sharedWithAccounts;
  }




   /**
   * Contains list of agents.
   * @return agents
  **/
  @javax.annotation.Nonnull
  public List<Agent> getAgents() {
    return agents;
  }




   /**
   * Codec label
   * @return codec
  **/
  @javax.annotation.Nullable
  public String getCodec() {
    return codec;
  }




  public VoiceTest codecId(String codecId) {
    
    this.codecId = codecId;
    return this;
  }

   /**
   * Coded ID, [see the list of acceptable values](https://docs.thousandeyes.com/product-documentation/internet-and-wan-monitoring/tests/working-with-test-settings#rtp-stream-advanced-settings-tab)
   * @return codecId
  **/
  @javax.annotation.Nullable
  public String getCodecId() {
    return codecId;
  }


  public void setCodecId(String codecId) {
    this.codecId = codecId;
  }


   /**
   * DSCP label.
   * @return dscp
  **/
  @javax.annotation.Nullable
  public String getDscp() {
    return dscp;
  }




  public VoiceTest dscpId(TestDscpId dscpId) {
    
    this.dscpId = dscpId;
    return this;
  }

   /**
   * Get dscpId
   * @return dscpId
  **/
  @javax.annotation.Nullable
  public TestDscpId getDscpId() {
    return dscpId;
  }


  public void setDscpId(TestDscpId dscpId) {
    this.dscpId = dscpId;
  }


  public VoiceTest duration(Integer duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Duration of the test in seconds.
   * minimum: 5
   * maximum: 30
   * @return duration
  **/
  @javax.annotation.Nullable
  public Integer getDuration() {
    return duration;
  }


  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public VoiceTest jitterBuffer(Integer jitterBuffer) {
    
    this.jitterBuffer = jitterBuffer;
    return this;
  }

   /**
   * De-jitter buffer size in seconds.
   * minimum: 0
   * maximum: 150
   * @return jitterBuffer
  **/
  @javax.annotation.Nullable
  public Integer getJitterBuffer() {
    return jitterBuffer;
  }


  public void setJitterBuffer(Integer jitterBuffer) {
    this.jitterBuffer = jitterBuffer;
  }


  public VoiceTest numPathTraces(Integer numPathTraces) {
    
    this.numPathTraces = numPathTraces;
    return this;
  }

   /**
   * Number of path traces executed by the agent.
   * minimum: 3
   * maximum: 10
   * @return numPathTraces
  **/
  @javax.annotation.Nullable
  public Integer getNumPathTraces() {
    return numPathTraces;
  }


  public void setNumPathTraces(Integer numPathTraces) {
    this.numPathTraces = numPathTraces;
  }


  public VoiceTest port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * Port number for the chosen protocol.
   * minimum: 1024
   * maximum: 65535
   * @return port
  **/
  @javax.annotation.Nullable
  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  public VoiceTest targetAgentId(String targetAgentId) {
    
    this.targetAgentId = targetAgentId;
    return this;
  }

   /**
   * Agent ID of the target agent for the test.
   * @return targetAgentId
  **/
  @javax.annotation.Nonnull
  public String getTargetAgentId() {
    return targetAgentId;
  }


  public void setTargetAgentId(String targetAgentId) {
    this.targetAgentId = targetAgentId;
  }


  public VoiceTest bgpMeasurements(Boolean bgpMeasurements) {
    
    this.bgpMeasurements = bgpMeasurements;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; to enable bgp measurements.
   * @return bgpMeasurements
  **/
  @javax.annotation.Nullable
  public Boolean getBgpMeasurements() {
    return bgpMeasurements;
  }


  public void setBgpMeasurements(Boolean bgpMeasurements) {
    this.bgpMeasurements = bgpMeasurements;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoiceTest voiceTest = (VoiceTest) o;
    return Objects.equals(this.interval, voiceTest.interval) &&
        Objects.equals(this.alertsEnabled, voiceTest.alertsEnabled) &&
        Objects.equals(this.enabled, voiceTest.enabled) &&
        Objects.equals(this.alertRules, voiceTest.alertRules) &&
        Objects.equals(this.createdBy, voiceTest.createdBy) &&
        Objects.equals(this.createdDate, voiceTest.createdDate) &&
        Objects.equals(this.description, voiceTest.description) &&
        Objects.equals(this.liveShare, voiceTest.liveShare) &&
        Objects.equals(this.modifiedBy, voiceTest.modifiedBy) &&
        Objects.equals(this.modifiedDate, voiceTest.modifiedDate) &&
        Objects.equals(this.savedEvent, voiceTest.savedEvent) &&
        Objects.equals(this.testId, voiceTest.testId) &&
        Objects.equals(this.testName, voiceTest.testName) &&
        Objects.equals(this.type, voiceTest.type) &&
        Objects.equals(this.links, voiceTest.links) &&
        Objects.equals(this.labels, voiceTest.labels) &&
        Objects.equals(this.sharedWithAccounts, voiceTest.sharedWithAccounts) &&
        Objects.equals(this.agents, voiceTest.agents) &&
        Objects.equals(this.codec, voiceTest.codec) &&
        Objects.equals(this.codecId, voiceTest.codecId) &&
        Objects.equals(this.dscp, voiceTest.dscp) &&
        Objects.equals(this.dscpId, voiceTest.dscpId) &&
        Objects.equals(this.duration, voiceTest.duration) &&
        Objects.equals(this.jitterBuffer, voiceTest.jitterBuffer) &&
        Objects.equals(this.numPathTraces, voiceTest.numPathTraces) &&
        Objects.equals(this.port, voiceTest.port) &&
        Objects.equals(this.targetAgentId, voiceTest.targetAgentId) &&
        Objects.equals(this.bgpMeasurements, voiceTest.bgpMeasurements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, alertsEnabled, enabled, alertRules, createdBy, createdDate, description, liveShare, modifiedBy, modifiedDate, savedEvent, testId, testName, type, links, labels, sharedWithAccounts, agents, codec, codecId, dscp, dscpId, duration, jitterBuffer, numPathTraces, port, targetAgentId, bgpMeasurements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoiceTest {\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    alertsEnabled: ").append(toIndentedString(alertsEnabled)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    alertRules: ").append(toIndentedString(alertRules)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    liveShare: ").append(toIndentedString(liveShare)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    savedEvent: ").append(toIndentedString(savedEvent)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    sharedWithAccounts: ").append(toIndentedString(sharedWithAccounts)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
    sb.append("    codecId: ").append(toIndentedString(codecId)).append("\n");
    sb.append("    dscp: ").append(toIndentedString(dscp)).append("\n");
    sb.append("    dscpId: ").append(toIndentedString(dscpId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    jitterBuffer: ").append(toIndentedString(jitterBuffer)).append("\n");
    sb.append("    numPathTraces: ").append(toIndentedString(numPathTraces)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    targetAgentId: ").append(toIndentedString(targetAgentId)).append("\n");
    sb.append("    bgpMeasurements: ").append(toIndentedString(bgpMeasurements)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("interval");
    openapiFields.add("alertsEnabled");
    openapiFields.add("enabled");
    openapiFields.add("alertRules");
    openapiFields.add("createdBy");
    openapiFields.add("createdDate");
    openapiFields.add("description");
    openapiFields.add("liveShare");
    openapiFields.add("modifiedBy");
    openapiFields.add("modifiedDate");
    openapiFields.add("savedEvent");
    openapiFields.add("testId");
    openapiFields.add("testName");
    openapiFields.add("type");
    openapiFields.add("_links");
    openapiFields.add("labels");
    openapiFields.add("sharedWithAccounts");
    openapiFields.add("agents");
    openapiFields.add("codec");
    openapiFields.add("codecId");
    openapiFields.add("dscp");
    openapiFields.add("dscpId");
    openapiFields.add("duration");
    openapiFields.add("jitterBuffer");
    openapiFields.add("numPathTraces");
    openapiFields.add("port");
    openapiFields.add("targetAgentId");
    openapiFields.add("bgpMeasurements");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("interval");
    openapiRequiredFields.add("agents");
    openapiRequiredFields.add("targetAgentId");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VoiceTest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VoiceTest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoiceTest is not found in the empty JSON string", VoiceTest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VoiceTest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoiceTest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VoiceTest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `interval`
      TestInterval.validateJsonElement(jsonObj.get("interval"));
      if (jsonObj.get("alertRules") != null && !jsonObj.get("alertRules").isJsonNull()) {
        JsonArray jsonArrayalertRules = jsonObj.getAsJsonArray("alertRules");
        if (jsonArrayalertRules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("alertRules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `alertRules` to be an array in the JSON string but got `%s`", jsonObj.get("alertRules").toString()));
          }

          // validate the optional field `alertRules` (array)
          for (int i = 0; i < jsonArrayalertRules.size(); i++) {
            AlertRule.validateJsonElement(jsonArrayalertRules.get(i));
          };
        }
      }
      if ((jsonObj.get("createdBy") != null && !jsonObj.get("createdBy").isJsonNull()) && !jsonObj.get("createdBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdBy").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("modifiedBy") != null && !jsonObj.get("modifiedBy").isJsonNull()) && !jsonObj.get("modifiedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedBy").toString()));
      }
      if ((jsonObj.get("testId") != null && !jsonObj.get("testId").isJsonNull()) && !jsonObj.get("testId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testId").toString()));
      }
      if ((jsonObj.get("testName") != null && !jsonObj.get("testName").isJsonNull()) && !jsonObj.get("testName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testName").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `_links`
      if (jsonObj.get("_links") != null && !jsonObj.get("_links").isJsonNull()) {
        UnexpandedInstantTestLinks.validateJsonElement(jsonObj.get("_links"));
      }
      if (jsonObj.get("labels") != null && !jsonObj.get("labels").isJsonNull()) {
        JsonArray jsonArraylabels = jsonObj.getAsJsonArray("labels");
        if (jsonArraylabels != null) {
          // ensure the json data is an array
          if (!jsonObj.get("labels").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `labels` to be an array in the JSON string but got `%s`", jsonObj.get("labels").toString()));
          }

          // validate the optional field `labels` (array)
          for (int i = 0; i < jsonArraylabels.size(); i++) {
            TestLabelsInner.validateJsonElement(jsonArraylabels.get(i));
          };
        }
      }
      if (jsonObj.get("sharedWithAccounts") != null && !jsonObj.get("sharedWithAccounts").isJsonNull()) {
        JsonArray jsonArraysharedWithAccounts = jsonObj.getAsJsonArray("sharedWithAccounts");
        if (jsonArraysharedWithAccounts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("sharedWithAccounts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `sharedWithAccounts` to be an array in the JSON string but got `%s`", jsonObj.get("sharedWithAccounts").toString()));
          }

          // validate the optional field `sharedWithAccounts` (array)
          for (int i = 0; i < jsonArraysharedWithAccounts.size(); i++) {
            TestSharedAccountsInner.validateJsonElement(jsonArraysharedWithAccounts.get(i));
          };
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("agents").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `agents` to be an array in the JSON string but got `%s`", jsonObj.get("agents").toString()));
      }

      JsonArray jsonArrayagents = jsonObj.getAsJsonArray("agents");
      // validate the required field `agents` (array)
      for (int i = 0; i < jsonArrayagents.size(); i++) {
        Agent.validateJsonElement(jsonArrayagents.get(i));
      };
      if ((jsonObj.get("codec") != null && !jsonObj.get("codec").isJsonNull()) && !jsonObj.get("codec").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codec` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codec").toString()));
      }
      if ((jsonObj.get("codecId") != null && !jsonObj.get("codecId").isJsonNull()) && !jsonObj.get("codecId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codecId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codecId").toString()));
      }
      if ((jsonObj.get("dscp") != null && !jsonObj.get("dscp").isJsonNull()) && !jsonObj.get("dscp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dscp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dscp").toString()));
      }
      // validate the optional field `dscpId`
      if (jsonObj.get("dscpId") != null && !jsonObj.get("dscpId").isJsonNull()) {
        TestDscpId.validateJsonElement(jsonObj.get("dscpId"));
      }
      if (!jsonObj.get("targetAgentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetAgentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetAgentId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoiceTest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoiceTest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoiceTest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoiceTest.class));

       return (TypeAdapter<T>) new TypeAdapter<VoiceTest>() {
           @Override
           public void write(JsonWriter out, VoiceTest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoiceTest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VoiceTest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoiceTest
  * @throws IOException if the JSON string is invalid with respect to VoiceTest
  */
  public static VoiceTest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoiceTest.class);
  }

 /**
  * Convert an instance of VoiceTest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

