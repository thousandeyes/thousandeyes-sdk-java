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


package com.thousandeyes.api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.model.Agent;
import com.thousandeyes.api.model.FtpServerRequestType;
import com.thousandeyes.api.model.TestIpv6Policy;
import com.thousandeyes.api.model.TestLabelsInner;
import com.thousandeyes.api.model.TestPathTraceMode;
import com.thousandeyes.api.model.TestProbeMode;
import com.thousandeyes.api.model.TestProtocol;
import com.thousandeyes.api.model.TestSharedAccountsInner;
import com.thousandeyes.api.model.UnexpandedInstantTestLinks;
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

import com.thousandeyes.JSON;

/**
 * FtpServerInstantTest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:17:29.962605Z[Europe/London]")
public class FtpServerInstantTest {
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

  public static final String SERIALIZED_NAME_BANDWIDTH_MEASUREMENTS = "bandwidthMeasurements";
  @SerializedName(SERIALIZED_NAME_BANDWIDTH_MEASUREMENTS)
  private Boolean bandwidthMeasurements;

  public static final String SERIALIZED_NAME_DOWNLOAD_LIMIT = "downloadLimit";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_LIMIT)
  private Integer downloadLimit;

  public static final String SERIALIZED_NAME_FTP_TARGET_TIME = "ftpTargetTime";
  @SerializedName(SERIALIZED_NAME_FTP_TARGET_TIME)
  private Integer ftpTargetTime;

  public static final String SERIALIZED_NAME_FTP_TIME_LIMIT = "ftpTimeLimit";
  @SerializedName(SERIALIZED_NAME_FTP_TIME_LIMIT)
  private Integer ftpTimeLimit = 10;

  public static final String SERIALIZED_NAME_MTU_MEASUREMENTS = "mtuMeasurements";
  @SerializedName(SERIALIZED_NAME_MTU_MEASUREMENTS)
  private Boolean mtuMeasurements;

  public static final String SERIALIZED_NAME_NETWORK_MEASUREMENTS = "networkMeasurements";
  @SerializedName(SERIALIZED_NAME_NETWORK_MEASUREMENTS)
  private Boolean networkMeasurements = true;

  public static final String SERIALIZED_NAME_NUM_PATH_TRACES = "numPathTraces";
  @SerializedName(SERIALIZED_NAME_NUM_PATH_TRACES)
  private Integer numPathTraces = 3;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PATH_TRACE_MODE = "pathTraceMode";
  @SerializedName(SERIALIZED_NAME_PATH_TRACE_MODE)
  private TestPathTraceMode pathTraceMode = TestPathTraceMode.CLASSIC;

  public static final String SERIALIZED_NAME_PROBE_MODE = "probeMode";
  @SerializedName(SERIALIZED_NAME_PROBE_MODE)
  private TestProbeMode probeMode = TestProbeMode.AUTO;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private TestProtocol protocol = TestProtocol.TCP;

  public static final String SERIALIZED_NAME_REQUEST_TYPE = "requestType";
  @SerializedName(SERIALIZED_NAME_REQUEST_TYPE)
  private FtpServerRequestType requestType;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_USE_ACTIVE_FTP = "useActiveFtp";
  @SerializedName(SERIALIZED_NAME_USE_ACTIVE_FTP)
  private Boolean useActiveFtp = false;

  public static final String SERIALIZED_NAME_USE_EXPLICIT_FTPS = "useExplicitFtps";
  @SerializedName(SERIALIZED_NAME_USE_EXPLICIT_FTPS)
  private Boolean useExplicitFtps;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_FIXED_PACKET_RATE = "fixedPacketRate";
  @SerializedName(SERIALIZED_NAME_FIXED_PACKET_RATE)
  private Integer fixedPacketRate;

  public static final String SERIALIZED_NAME_IPV6_POLICY = "ipv6Policy";
  @SerializedName(SERIALIZED_NAME_IPV6_POLICY)
  private TestIpv6Policy ipv6Policy = TestIpv6Policy.USE_AGENT_POLICY;

  public FtpServerInstantTest() {
  }

  
  public FtpServerInstantTest(
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




  public FtpServerInstantTest description(String description) {
    
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




  public FtpServerInstantTest testName(String testName) {
    
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




  public FtpServerInstantTest links(UnexpandedInstantTestLinks links) {
    
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




  public FtpServerInstantTest bandwidthMeasurements(Boolean bandwidthMeasurements) {
    
    this.bandwidthMeasurements = bandwidthMeasurements;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; to enable bandwidth measurements, only applies to Enterprise agents assigned to the test.
   * @return bandwidthMeasurements
  **/
  @javax.annotation.Nullable
  public Boolean getBandwidthMeasurements() {
    return bandwidthMeasurements;
  }


  public void setBandwidthMeasurements(Boolean bandwidthMeasurements) {
    this.bandwidthMeasurements = bandwidthMeasurements;
  }


  public FtpServerInstantTest downloadLimit(Integer downloadLimit) {
    
    this.downloadLimit = downloadLimit;
    return this;
  }

   /**
   * Specify maximum number of bytes to download from the target object.
   * @return downloadLimit
  **/
  @javax.annotation.Nullable
  public Integer getDownloadLimit() {
    return downloadLimit;
  }


  public void setDownloadLimit(Integer downloadLimit) {
    this.downloadLimit = downloadLimit;
  }


  public FtpServerInstantTest ftpTargetTime(Integer ftpTargetTime) {
    
    this.ftpTargetTime = ftpTargetTime;
    return this;
  }

   /**
   * Target time for operation completion; specified in milliseconds.
   * minimum: 1000
   * maximum: 6000
   * @return ftpTargetTime
  **/
  @javax.annotation.Nullable
  public Integer getFtpTargetTime() {
    return ftpTargetTime;
  }


  public void setFtpTargetTime(Integer ftpTargetTime) {
    this.ftpTargetTime = ftpTargetTime;
  }


  public FtpServerInstantTest ftpTimeLimit(Integer ftpTimeLimit) {
    
    this.ftpTimeLimit = ftpTimeLimit;
    return this;
  }

   /**
   * Set the time limit for the test in seconds.
   * minimum: 10
   * maximum: 60
   * @return ftpTimeLimit
  **/
  @javax.annotation.Nullable
  public Integer getFtpTimeLimit() {
    return ftpTimeLimit;
  }


  public void setFtpTimeLimit(Integer ftpTimeLimit) {
    this.ftpTimeLimit = ftpTimeLimit;
  }


  public FtpServerInstantTest mtuMeasurements(Boolean mtuMeasurements) {
    
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


  public FtpServerInstantTest networkMeasurements(Boolean networkMeasurements) {
    
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


  public FtpServerInstantTest numPathTraces(Integer numPathTraces) {
    
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


  public FtpServerInstantTest password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Password for Basic/NTLM authentication.
   * @return password
  **/
  @javax.annotation.Nonnull
  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public FtpServerInstantTest pathTraceMode(TestPathTraceMode pathTraceMode) {
    
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


  public FtpServerInstantTest probeMode(TestProbeMode probeMode) {
    
    this.probeMode = probeMode;
    return this;
  }

   /**
   * Get probeMode
   * @return probeMode
  **/
  @javax.annotation.Nullable
  public TestProbeMode getProbeMode() {
    return probeMode;
  }


  public void setProbeMode(TestProbeMode probeMode) {
    this.probeMode = probeMode;
  }


  public FtpServerInstantTest protocol(TestProtocol protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @javax.annotation.Nullable
  public TestProtocol getProtocol() {
    return protocol;
  }


  public void setProtocol(TestProtocol protocol) {
    this.protocol = protocol;
  }


  public FtpServerInstantTest requestType(FtpServerRequestType requestType) {
    
    this.requestType = requestType;
    return this;
  }

   /**
   * Get requestType
   * @return requestType
  **/
  @javax.annotation.Nonnull
  public FtpServerRequestType getRequestType() {
    return requestType;
  }


  public void setRequestType(FtpServerRequestType requestType) {
    this.requestType = requestType;
  }


  public FtpServerInstantTest url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Target for the test.
   * @return url
  **/
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public FtpServerInstantTest useActiveFtp(Boolean useActiveFtp) {
    
    this.useActiveFtp = useActiveFtp;
    return this;
  }

   /**
   * Explicitly set the flag to use active FTP.
   * @return useActiveFtp
  **/
  @javax.annotation.Nullable
  public Boolean getUseActiveFtp() {
    return useActiveFtp;
  }


  public void setUseActiveFtp(Boolean useActiveFtp) {
    this.useActiveFtp = useActiveFtp;
  }


  public FtpServerInstantTest useExplicitFtps(Boolean useExplicitFtps) {
    
    this.useExplicitFtps = useExplicitFtps;
    return this;
  }

   /**
   * Use explicit FTPS (ftp over SSL). By default, tests will autodetect when it is appropriate to use FTPS.
   * @return useExplicitFtps
  **/
  @javax.annotation.Nullable
  public Boolean getUseExplicitFtps() {
    return useExplicitFtps;
  }


  public void setUseExplicitFtps(Boolean useExplicitFtps) {
    this.useExplicitFtps = useExplicitFtps;
  }


  public FtpServerInstantTest username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Username for Basic/NTLM authentication.
   * @return username
  **/
  @javax.annotation.Nonnull
  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public FtpServerInstantTest fixedPacketRate(Integer fixedPacketRate) {
    
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


  public FtpServerInstantTest ipv6Policy(TestIpv6Policy ipv6Policy) {
    
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
    FtpServerInstantTest ftpServerInstantTest = (FtpServerInstantTest) o;
    return Objects.equals(this.createdBy, ftpServerInstantTest.createdBy) &&
        Objects.equals(this.createdDate, ftpServerInstantTest.createdDate) &&
        Objects.equals(this.description, ftpServerInstantTest.description) &&
        Objects.equals(this.liveShare, ftpServerInstantTest.liveShare) &&
        Objects.equals(this.modifiedBy, ftpServerInstantTest.modifiedBy) &&
        Objects.equals(this.modifiedDate, ftpServerInstantTest.modifiedDate) &&
        Objects.equals(this.savedEvent, ftpServerInstantTest.savedEvent) &&
        Objects.equals(this.testId, ftpServerInstantTest.testId) &&
        Objects.equals(this.testName, ftpServerInstantTest.testName) &&
        Objects.equals(this.type, ftpServerInstantTest.type) &&
        Objects.equals(this.links, ftpServerInstantTest.links) &&
        Objects.equals(this.labels, ftpServerInstantTest.labels) &&
        Objects.equals(this.sharedWithAccounts, ftpServerInstantTest.sharedWithAccounts) &&
        Objects.equals(this.agents, ftpServerInstantTest.agents) &&
        Objects.equals(this.bandwidthMeasurements, ftpServerInstantTest.bandwidthMeasurements) &&
        Objects.equals(this.downloadLimit, ftpServerInstantTest.downloadLimit) &&
        Objects.equals(this.ftpTargetTime, ftpServerInstantTest.ftpTargetTime) &&
        Objects.equals(this.ftpTimeLimit, ftpServerInstantTest.ftpTimeLimit) &&
        Objects.equals(this.mtuMeasurements, ftpServerInstantTest.mtuMeasurements) &&
        Objects.equals(this.networkMeasurements, ftpServerInstantTest.networkMeasurements) &&
        Objects.equals(this.numPathTraces, ftpServerInstantTest.numPathTraces) &&
        Objects.equals(this.password, ftpServerInstantTest.password) &&
        Objects.equals(this.pathTraceMode, ftpServerInstantTest.pathTraceMode) &&
        Objects.equals(this.probeMode, ftpServerInstantTest.probeMode) &&
        Objects.equals(this.protocol, ftpServerInstantTest.protocol) &&
        Objects.equals(this.requestType, ftpServerInstantTest.requestType) &&
        Objects.equals(this.url, ftpServerInstantTest.url) &&
        Objects.equals(this.useActiveFtp, ftpServerInstantTest.useActiveFtp) &&
        Objects.equals(this.useExplicitFtps, ftpServerInstantTest.useExplicitFtps) &&
        Objects.equals(this.username, ftpServerInstantTest.username) &&
        Objects.equals(this.fixedPacketRate, ftpServerInstantTest.fixedPacketRate) &&
        Objects.equals(this.ipv6Policy, ftpServerInstantTest.ipv6Policy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdDate, description, liveShare, modifiedBy, modifiedDate, savedEvent, testId, testName, type, links, labels, sharedWithAccounts, agents, bandwidthMeasurements, downloadLimit, ftpTargetTime, ftpTimeLimit, mtuMeasurements, networkMeasurements, numPathTraces, password, pathTraceMode, probeMode, protocol, requestType, url, useActiveFtp, useExplicitFtps, username, fixedPacketRate, ipv6Policy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FtpServerInstantTest {\n");
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
    sb.append("    bandwidthMeasurements: ").append(toIndentedString(bandwidthMeasurements)).append("\n");
    sb.append("    downloadLimit: ").append(toIndentedString(downloadLimit)).append("\n");
    sb.append("    ftpTargetTime: ").append(toIndentedString(ftpTargetTime)).append("\n");
    sb.append("    ftpTimeLimit: ").append(toIndentedString(ftpTimeLimit)).append("\n");
    sb.append("    mtuMeasurements: ").append(toIndentedString(mtuMeasurements)).append("\n");
    sb.append("    networkMeasurements: ").append(toIndentedString(networkMeasurements)).append("\n");
    sb.append("    numPathTraces: ").append(toIndentedString(numPathTraces)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    pathTraceMode: ").append(toIndentedString(pathTraceMode)).append("\n");
    sb.append("    probeMode: ").append(toIndentedString(probeMode)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    useActiveFtp: ").append(toIndentedString(useActiveFtp)).append("\n");
    sb.append("    useExplicitFtps: ").append(toIndentedString(useExplicitFtps)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
    openapiFields.add("bandwidthMeasurements");
    openapiFields.add("downloadLimit");
    openapiFields.add("ftpTargetTime");
    openapiFields.add("ftpTimeLimit");
    openapiFields.add("mtuMeasurements");
    openapiFields.add("networkMeasurements");
    openapiFields.add("numPathTraces");
    openapiFields.add("password");
    openapiFields.add("pathTraceMode");
    openapiFields.add("probeMode");
    openapiFields.add("protocol");
    openapiFields.add("requestType");
    openapiFields.add("url");
    openapiFields.add("useActiveFtp");
    openapiFields.add("useExplicitFtps");
    openapiFields.add("username");
    openapiFields.add("fixedPacketRate");
    openapiFields.add("ipv6Policy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("agents");
    openapiRequiredFields.add("password");
    openapiRequiredFields.add("requestType");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("username");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FtpServerInstantTest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FtpServerInstantTest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FtpServerInstantTest is not found in the empty JSON string", FtpServerInstantTest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FtpServerInstantTest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FtpServerInstantTest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FtpServerInstantTest.openapiRequiredFields) {
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
      if (!jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FtpServerInstantTest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FtpServerInstantTest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FtpServerInstantTest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FtpServerInstantTest.class));

       return (TypeAdapter<T>) new TypeAdapter<FtpServerInstantTest>() {
           @Override
           public void write(JsonWriter out, FtpServerInstantTest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FtpServerInstantTest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FtpServerInstantTest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FtpServerInstantTest
  * @throws IOException if the JSON string is invalid with respect to FtpServerInstantTest
  */
  public static FtpServerInstantTest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FtpServerInstantTest.class);
  }

 /**
  * Convert an instance of FtpServerInstantTest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

