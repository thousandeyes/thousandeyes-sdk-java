/*
 * Instant Tests API
 *  ### Overview The Instant Tests API endpoint lets you create and run new instant tests. You will need to be a regular user or have the following permissions:   * `API Access`   * `View tests`  The response does not include the immediate test results. Use the Test Results endpoints to get test results after creating and executing an instant test. You can find the URLs for these endpoints in the _links section of the test definition that is returned when you create the instant test.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.instant.tests.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.instant.tests.model.Agent;
import com.thousandeyes.api.instant.tests.model.SipTestProtocol;
import com.thousandeyes.api.instant.tests.model.TestIpv6Policy;
import com.thousandeyes.api.instant.tests.model.TestLabelsInner;
import com.thousandeyes.api.instant.tests.model.TestPathTraceMode;
import com.thousandeyes.api.instant.tests.model.TestSharedAccountsInner;
import com.thousandeyes.api.instant.tests.model.TestSipCredentials;
import com.thousandeyes.api.instant.tests.model.UnexpandedInstantTestLinks;
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

import com.thousandeyes.api.instant.JSON;

/**
 * SipServerInstantTest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T12:21:05.783040Z[Europe/Lisbon]")
public class SipServerInstantTest {
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

  public static final String SERIALIZED_NAME_AUTH_USER = "authUser";
  @SerializedName(SERIALIZED_NAME_AUTH_USER)
  private String authUser;

  public static final String SERIALIZED_NAME_MTU_MEASUREMENTS = "mtuMeasurements";
  @SerializedName(SERIALIZED_NAME_MTU_MEASUREMENTS)
  private Boolean mtuMeasurements;

  public static final String SERIALIZED_NAME_NETWORK_MEASUREMENTS = "networkMeasurements";
  @SerializedName(SERIALIZED_NAME_NETWORK_MEASUREMENTS)
  private Boolean networkMeasurements = true;

  public static final String SERIALIZED_NAME_OPTIONS_REGEX = "optionsRegex";
  @SerializedName(SERIALIZED_NAME_OPTIONS_REGEX)
  private String optionsRegex;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PATH_TRACE_MODE = "pathTraceMode";
  @SerializedName(SERIALIZED_NAME_PATH_TRACE_MODE)
  private TestPathTraceMode pathTraceMode = TestPathTraceMode.CLASSIC;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port = 49153;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private SipTestProtocol protocol = SipTestProtocol.TCP;

  public static final String SERIALIZED_NAME_REGISTER_ENABLED = "registerEnabled";
  @SerializedName(SERIALIZED_NAME_REGISTER_ENABLED)
  private Boolean registerEnabled = false;

  public static final String SERIALIZED_NAME_SIP_REGISTRAR = "sipRegistrar";
  @SerializedName(SERIALIZED_NAME_SIP_REGISTRAR)
  private String sipRegistrar;

  public static final String SERIALIZED_NAME_SIP_TARGET_TIME = "sipTargetTime";
  @SerializedName(SERIALIZED_NAME_SIP_TARGET_TIME)
  private Integer sipTargetTime;

  public static final String SERIALIZED_NAME_SIP_TIME_LIMIT = "sipTimeLimit";
  @SerializedName(SERIALIZED_NAME_SIP_TIME_LIMIT)
  private Integer sipTimeLimit = 5;

  public static final String SERIALIZED_NAME_TARGET_SIP_CREDENTIALS = "targetSipCredentials";
  @SerializedName(SERIALIZED_NAME_TARGET_SIP_CREDENTIALS)
  private TestSipCredentials targetSipCredentials;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public static final String SERIALIZED_NAME_FIXED_PACKET_RATE = "fixedPacketRate";
  @SerializedName(SERIALIZED_NAME_FIXED_PACKET_RATE)
  private Integer fixedPacketRate;

  public static final String SERIALIZED_NAME_IPV6_POLICY = "ipv6Policy";
  @SerializedName(SERIALIZED_NAME_IPV6_POLICY)
  private TestIpv6Policy ipv6Policy = TestIpv6Policy.USE_AGENT_POLICY;

  public SipServerInstantTest() {
  }

  
  public SipServerInstantTest(
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
     List<Agent> agents
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




  public SipServerInstantTest description(String description) {
    
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




  public SipServerInstantTest testName(String testName) {
    
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




  public SipServerInstantTest links(UnexpandedInstantTestLinks links) {
    
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




  public SipServerInstantTest authUser(String authUser) {
    
    this.authUser = authUser;
    return this;
  }

   /**
   * Username for authentication with SIP server.
   * @return authUser
  **/
  @javax.annotation.Nullable
  public String getAuthUser() {
    return authUser;
  }


  public void setAuthUser(String authUser) {
    this.authUser = authUser;
  }


  public SipServerInstantTest mtuMeasurements(Boolean mtuMeasurements) {
    
    this.mtuMeasurements = mtuMeasurements;
    return this;
  }

   /**
   * Set &#x60;true&#x60; to measure MTU sizes on network from agents to the target.
   * @return mtuMeasurements
  **/
  @javax.annotation.Nullable
  public Boolean getMtuMeasurements() {
    return mtuMeasurements;
  }


  public void setMtuMeasurements(Boolean mtuMeasurements) {
    this.mtuMeasurements = mtuMeasurements;
  }


  public SipServerInstantTest networkMeasurements(Boolean networkMeasurements) {
    
    this.networkMeasurements = networkMeasurements;
    return this;
  }

   /**
   * Enable or disable network measurements. Set to true to enable or false to disable network measurements.
   * @return networkMeasurements
  **/
  @javax.annotation.Nullable
  public Boolean getNetworkMeasurements() {
    return networkMeasurements;
  }


  public void setNetworkMeasurements(Boolean networkMeasurements) {
    this.networkMeasurements = networkMeasurements;
  }


  public SipServerInstantTest optionsRegex(String optionsRegex) {
    
    this.optionsRegex = optionsRegex;
    return this;
  }

   /**
   * Options regex, this field does not require escaping.
   * @return optionsRegex
  **/
  @javax.annotation.Nullable
  public String getOptionsRegex() {
    return optionsRegex;
  }


  public void setOptionsRegex(String optionsRegex) {
    this.optionsRegex = optionsRegex;
  }


  public SipServerInstantTest password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Password for Basic/NTLM authentication.
   * @return password
  **/
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public SipServerInstantTest pathTraceMode(TestPathTraceMode pathTraceMode) {
    
    this.pathTraceMode = pathTraceMode;
    return this;
  }

   /**
   * Get pathTraceMode
   * @return pathTraceMode
  **/
  @javax.annotation.Nullable
  public TestPathTraceMode getPathTraceMode() {
    return pathTraceMode;
  }


  public void setPathTraceMode(TestPathTraceMode pathTraceMode) {
    this.pathTraceMode = pathTraceMode;
  }


  public SipServerInstantTest port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * Target port.
   * minimum: 1
   * maximum: 65535
   * @return port
  **/
  @javax.annotation.Nonnull
  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  public SipServerInstantTest protocol(SipTestProtocol protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @javax.annotation.Nullable
  public SipTestProtocol getProtocol() {
    return protocol;
  }


  public void setProtocol(SipTestProtocol protocol) {
    this.protocol = protocol;
  }


  public SipServerInstantTest registerEnabled(Boolean registerEnabled) {
    
    this.registerEnabled = registerEnabled;
    return this;
  }

   /**
   * Set to true to perform SIP registration on the test target with the SIP REGISTER command.
   * @return registerEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getRegisterEnabled() {
    return registerEnabled;
  }


  public void setRegisterEnabled(Boolean registerEnabled) {
    this.registerEnabled = registerEnabled;
  }


  public SipServerInstantTest sipRegistrar(String sipRegistrar) {
    
    this.sipRegistrar = sipRegistrar;
    return this;
  }

   /**
   * SIP server to be tested, specified by domain name or IP address.
   * @return sipRegistrar
  **/
  @javax.annotation.Nullable
  public String getSipRegistrar() {
    return sipRegistrar;
  }


  public void setSipRegistrar(String sipRegistrar) {
    this.sipRegistrar = sipRegistrar;
  }


  public SipServerInstantTest sipTargetTime(Integer sipTargetTime) {
    
    this.sipTargetTime = sipTargetTime;
    return this;
  }

   /**
   * Target time for test completion in milliseconds.
   * minimum: 100
   * maximum: 5000
   * @return sipTargetTime
  **/
  @javax.annotation.Nullable
  public Integer getSipTargetTime() {
    return sipTargetTime;
  }


  public void setSipTargetTime(Integer sipTargetTime) {
    this.sipTargetTime = sipTargetTime;
  }


  public SipServerInstantTest sipTimeLimit(Integer sipTimeLimit) {
    
    this.sipTimeLimit = sipTimeLimit;
    return this;
  }

   /**
   * Time limit in milliseconds.
   * minimum: 5
   * maximum: 10
   * @return sipTimeLimit
  **/
  @javax.annotation.Nullable
  public Integer getSipTimeLimit() {
    return sipTimeLimit;
  }


  public void setSipTimeLimit(Integer sipTimeLimit) {
    this.sipTimeLimit = sipTimeLimit;
  }


  public SipServerInstantTest targetSipCredentials(TestSipCredentials targetSipCredentials) {
    
    this.targetSipCredentials = targetSipCredentials;
    return this;
  }

   /**
   * Get targetSipCredentials
   * @return targetSipCredentials
  **/
  @javax.annotation.Nonnull
  public TestSipCredentials getTargetSipCredentials() {
    return targetSipCredentials;
  }


  public void setTargetSipCredentials(TestSipCredentials targetSipCredentials) {
    this.targetSipCredentials = targetSipCredentials;
  }


  public SipServerInstantTest user(String user) {
    
    this.user = user;
    return this;
  }

   /**
   * Username for SIP registration, should be unique within a ThousandEyes account group.
   * @return user
  **/
  @javax.annotation.Nullable
  public String getUser() {
    return user;
  }


  public void setUser(String user) {
    this.user = user;
  }


  public SipServerInstantTest fixedPacketRate(Integer fixedPacketRate) {
    
    this.fixedPacketRate = fixedPacketRate;
    return this;
  }

   /**
   * Sets packets rate sent to measure the network in packets per second.
   * minimum: 0
   * maximum: 100
   * @return fixedPacketRate
  **/
  @javax.annotation.Nullable
  public Integer getFixedPacketRate() {
    return fixedPacketRate;
  }


  public void setFixedPacketRate(Integer fixedPacketRate) {
    this.fixedPacketRate = fixedPacketRate;
  }


  public SipServerInstantTest ipv6Policy(TestIpv6Policy ipv6Policy) {
    
    this.ipv6Policy = ipv6Policy;
    return this;
  }

   /**
   * Get ipv6Policy
   * @return ipv6Policy
  **/
  @javax.annotation.Nullable
  public TestIpv6Policy getIpv6Policy() {
    return ipv6Policy;
  }


  public void setIpv6Policy(TestIpv6Policy ipv6Policy) {
    this.ipv6Policy = ipv6Policy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SipServerInstantTest sipServerInstantTest = (SipServerInstantTest) o;
    return Objects.equals(this.createdBy, sipServerInstantTest.createdBy) &&
        Objects.equals(this.createdDate, sipServerInstantTest.createdDate) &&
        Objects.equals(this.description, sipServerInstantTest.description) &&
        Objects.equals(this.liveShare, sipServerInstantTest.liveShare) &&
        Objects.equals(this.modifiedBy, sipServerInstantTest.modifiedBy) &&
        Objects.equals(this.modifiedDate, sipServerInstantTest.modifiedDate) &&
        Objects.equals(this.savedEvent, sipServerInstantTest.savedEvent) &&
        Objects.equals(this.testId, sipServerInstantTest.testId) &&
        Objects.equals(this.testName, sipServerInstantTest.testName) &&
        Objects.equals(this.type, sipServerInstantTest.type) &&
        Objects.equals(this.links, sipServerInstantTest.links) &&
        Objects.equals(this.labels, sipServerInstantTest.labels) &&
        Objects.equals(this.sharedWithAccounts, sipServerInstantTest.sharedWithAccounts) &&
        Objects.equals(this.agents, sipServerInstantTest.agents) &&
        Objects.equals(this.authUser, sipServerInstantTest.authUser) &&
        Objects.equals(this.mtuMeasurements, sipServerInstantTest.mtuMeasurements) &&
        Objects.equals(this.networkMeasurements, sipServerInstantTest.networkMeasurements) &&
        Objects.equals(this.optionsRegex, sipServerInstantTest.optionsRegex) &&
        Objects.equals(this.password, sipServerInstantTest.password) &&
        Objects.equals(this.pathTraceMode, sipServerInstantTest.pathTraceMode) &&
        Objects.equals(this.port, sipServerInstantTest.port) &&
        Objects.equals(this.protocol, sipServerInstantTest.protocol) &&
        Objects.equals(this.registerEnabled, sipServerInstantTest.registerEnabled) &&
        Objects.equals(this.sipRegistrar, sipServerInstantTest.sipRegistrar) &&
        Objects.equals(this.sipTargetTime, sipServerInstantTest.sipTargetTime) &&
        Objects.equals(this.sipTimeLimit, sipServerInstantTest.sipTimeLimit) &&
        Objects.equals(this.targetSipCredentials, sipServerInstantTest.targetSipCredentials) &&
        Objects.equals(this.user, sipServerInstantTest.user) &&
        Objects.equals(this.fixedPacketRate, sipServerInstantTest.fixedPacketRate) &&
        Objects.equals(this.ipv6Policy, sipServerInstantTest.ipv6Policy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdDate, description, liveShare, modifiedBy, modifiedDate, savedEvent, testId, testName, type, links, labels, sharedWithAccounts, agents, authUser, mtuMeasurements, networkMeasurements, optionsRegex, password, pathTraceMode, port, protocol, registerEnabled, sipRegistrar, sipTargetTime, sipTimeLimit, targetSipCredentials, user, fixedPacketRate, ipv6Policy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SipServerInstantTest {\n");
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
    sb.append("    authUser: ").append(toIndentedString(authUser)).append("\n");
    sb.append("    mtuMeasurements: ").append(toIndentedString(mtuMeasurements)).append("\n");
    sb.append("    networkMeasurements: ").append(toIndentedString(networkMeasurements)).append("\n");
    sb.append("    optionsRegex: ").append(toIndentedString(optionsRegex)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    pathTraceMode: ").append(toIndentedString(pathTraceMode)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    registerEnabled: ").append(toIndentedString(registerEnabled)).append("\n");
    sb.append("    sipRegistrar: ").append(toIndentedString(sipRegistrar)).append("\n");
    sb.append("    sipTargetTime: ").append(toIndentedString(sipTargetTime)).append("\n");
    sb.append("    sipTimeLimit: ").append(toIndentedString(sipTimeLimit)).append("\n");
    sb.append("    targetSipCredentials: ").append(toIndentedString(targetSipCredentials)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    fixedPacketRate: ").append(toIndentedString(fixedPacketRate)).append("\n");
    sb.append("    ipv6Policy: ").append(toIndentedString(ipv6Policy)).append("\n");
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
    openapiFields.add("authUser");
    openapiFields.add("mtuMeasurements");
    openapiFields.add("networkMeasurements");
    openapiFields.add("optionsRegex");
    openapiFields.add("password");
    openapiFields.add("pathTraceMode");
    openapiFields.add("port");
    openapiFields.add("protocol");
    openapiFields.add("registerEnabled");
    openapiFields.add("sipRegistrar");
    openapiFields.add("sipTargetTime");
    openapiFields.add("sipTimeLimit");
    openapiFields.add("targetSipCredentials");
    openapiFields.add("user");
    openapiFields.add("fixedPacketRate");
    openapiFields.add("ipv6Policy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("agents");
    openapiRequiredFields.add("port");
    openapiRequiredFields.add("targetSipCredentials");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SipServerInstantTest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SipServerInstantTest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SipServerInstantTest is not found in the empty JSON string", SipServerInstantTest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SipServerInstantTest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SipServerInstantTest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SipServerInstantTest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
      if ((jsonObj.get("authUser") != null && !jsonObj.get("authUser").isJsonNull()) && !jsonObj.get("authUser").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authUser` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authUser").toString()));
      }
      if ((jsonObj.get("optionsRegex") != null && !jsonObj.get("optionsRegex").isJsonNull()) && !jsonObj.get("optionsRegex").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `optionsRegex` to be a primitive type in the JSON string but got `%s`", jsonObj.get("optionsRegex").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      // validate the optional field `pathTraceMode`
      if (jsonObj.get("pathTraceMode") != null && !jsonObj.get("pathTraceMode").isJsonNull()) {
        TestPathTraceMode.validateJsonElement(jsonObj.get("pathTraceMode"));
      }
      // validate the optional field `protocol`
      if (jsonObj.get("protocol") != null && !jsonObj.get("protocol").isJsonNull()) {
        SipTestProtocol.validateJsonElement(jsonObj.get("protocol"));
      }
      if ((jsonObj.get("sipRegistrar") != null && !jsonObj.get("sipRegistrar").isJsonNull()) && !jsonObj.get("sipRegistrar").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sipRegistrar` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sipRegistrar").toString()));
      }
      // validate the required field `targetSipCredentials`
      TestSipCredentials.validateJsonElement(jsonObj.get("targetSipCredentials"));
      if ((jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) && !jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
      // validate the optional field `ipv6Policy`
      if (jsonObj.get("ipv6Policy") != null && !jsonObj.get("ipv6Policy").isJsonNull()) {
        TestIpv6Policy.validateJsonElement(jsonObj.get("ipv6Policy"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SipServerInstantTest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SipServerInstantTest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SipServerInstantTest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SipServerInstantTest.class));

       return (TypeAdapter<T>) new TypeAdapter<SipServerInstantTest>() {
           @Override
           public void write(JsonWriter out, SipServerInstantTest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SipServerInstantTest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SipServerInstantTest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SipServerInstantTest
  * @throws IOException if the JSON string is invalid with respect to SipServerInstantTest
  */
  public static SipServerInstantTest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SipServerInstantTest.class);
  }

 /**
  * Convert an instance of SipServerInstantTest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

