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
import com.thousandeyes.api.tests.model.FtpServerRequestType;
import com.thousandeyes.api.tests.model.TestInterval;
import com.thousandeyes.api.tests.model.TestIpv6Policy;
import com.thousandeyes.api.tests.model.TestPathTraceMode;
import com.thousandeyes.api.tests.model.TestProbeMode;
import com.thousandeyes.api.tests.model.TestProtocol;
import com.thousandeyes.api.tests.model.UnexpandedInstantTestLinks;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UnexpandedFtpServerTest
 */
@JsonPropertyOrder({
  UnexpandedFtpServerTest.JSON_PROPERTY_INTERVAL,
  UnexpandedFtpServerTest.JSON_PROPERTY_ALERTS_ENABLED,
  UnexpandedFtpServerTest.JSON_PROPERTY_ENABLED,
  UnexpandedFtpServerTest.JSON_PROPERTY_CREATED_BY,
  UnexpandedFtpServerTest.JSON_PROPERTY_CREATED_DATE,
  UnexpandedFtpServerTest.JSON_PROPERTY_DESCRIPTION,
  UnexpandedFtpServerTest.JSON_PROPERTY_LIVE_SHARE,
  UnexpandedFtpServerTest.JSON_PROPERTY_MODIFIED_BY,
  UnexpandedFtpServerTest.JSON_PROPERTY_MODIFIED_DATE,
  UnexpandedFtpServerTest.JSON_PROPERTY_SAVED_EVENT,
  UnexpandedFtpServerTest.JSON_PROPERTY_TEST_ID,
  UnexpandedFtpServerTest.JSON_PROPERTY_TEST_NAME,
  UnexpandedFtpServerTest.JSON_PROPERTY_TYPE,
  UnexpandedFtpServerTest.JSON_PROPERTY_LINKS,
  UnexpandedFtpServerTest.JSON_PROPERTY_BANDWIDTH_MEASUREMENTS,
  UnexpandedFtpServerTest.JSON_PROPERTY_DOWNLOAD_LIMIT,
  UnexpandedFtpServerTest.JSON_PROPERTY_FTP_TARGET_TIME,
  UnexpandedFtpServerTest.JSON_PROPERTY_FTP_TIME_LIMIT,
  UnexpandedFtpServerTest.JSON_PROPERTY_MTU_MEASUREMENTS,
  UnexpandedFtpServerTest.JSON_PROPERTY_NETWORK_MEASUREMENTS,
  UnexpandedFtpServerTest.JSON_PROPERTY_NUM_PATH_TRACES,
  UnexpandedFtpServerTest.JSON_PROPERTY_PASSWORD,
  UnexpandedFtpServerTest.JSON_PROPERTY_PATH_TRACE_MODE,
  UnexpandedFtpServerTest.JSON_PROPERTY_PROBE_MODE,
  UnexpandedFtpServerTest.JSON_PROPERTY_PROTOCOL,
  UnexpandedFtpServerTest.JSON_PROPERTY_REQUEST_TYPE,
  UnexpandedFtpServerTest.JSON_PROPERTY_URL,
  UnexpandedFtpServerTest.JSON_PROPERTY_USE_ACTIVE_FTP,
  UnexpandedFtpServerTest.JSON_PROPERTY_USE_EXPLICIT_FTPS,
  UnexpandedFtpServerTest.JSON_PROPERTY_USERNAME,
  UnexpandedFtpServerTest.JSON_PROPERTY_FIXED_PACKET_RATE,
  UnexpandedFtpServerTest.JSON_PROPERTY_IPV6_POLICY,
  UnexpandedFtpServerTest.JSON_PROPERTY_BGP_MEASUREMENTS,
  UnexpandedFtpServerTest.JSON_PROPERTY_USE_PUBLIC_BGP
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T16:57:46.217350+01:00[Europe/Lisbon]")
public class UnexpandedFtpServerTest {
  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private TestInterval interval;

  public static final String JSON_PROPERTY_ALERTS_ENABLED = "alertsEnabled";
  private Boolean alertsEnabled;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled = true;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private String createdBy;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private OffsetDateTime createdDate;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LIVE_SHARE = "liveShare";
  private Boolean liveShare;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modifiedBy";
  private String modifiedBy;

  public static final String JSON_PROPERTY_MODIFIED_DATE = "modifiedDate";
  private OffsetDateTime modifiedDate;

  public static final String JSON_PROPERTY_SAVED_EVENT = "savedEvent";
  private Boolean savedEvent;

  public static final String JSON_PROPERTY_TEST_ID = "testId";
  private String testId;

  public static final String JSON_PROPERTY_TEST_NAME = "testName";
  private String testName;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private UnexpandedInstantTestLinks links;

  public static final String JSON_PROPERTY_BANDWIDTH_MEASUREMENTS = "bandwidthMeasurements";
  private Boolean bandwidthMeasurements;

  public static final String JSON_PROPERTY_DOWNLOAD_LIMIT = "downloadLimit";
  private Integer downloadLimit;

  public static final String JSON_PROPERTY_FTP_TARGET_TIME = "ftpTargetTime";
  private Integer ftpTargetTime;

  public static final String JSON_PROPERTY_FTP_TIME_LIMIT = "ftpTimeLimit";
  private Integer ftpTimeLimit = 10;

  public static final String JSON_PROPERTY_MTU_MEASUREMENTS = "mtuMeasurements";
  private Boolean mtuMeasurements;

  public static final String JSON_PROPERTY_NETWORK_MEASUREMENTS = "networkMeasurements";
  private Boolean networkMeasurements = true;

  public static final String JSON_PROPERTY_NUM_PATH_TRACES = "numPathTraces";
  private Integer numPathTraces = 3;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_PATH_TRACE_MODE = "pathTraceMode";
  private TestPathTraceMode pathTraceMode = TestPathTraceMode.CLASSIC;

  public static final String JSON_PROPERTY_PROBE_MODE = "probeMode";
  private TestProbeMode probeMode = TestProbeMode.AUTO;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private TestProtocol protocol = TestProtocol.TCP;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "requestType";
  private FtpServerRequestType requestType;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_USE_ACTIVE_FTP = "useActiveFtp";
  private Boolean useActiveFtp = false;

  public static final String JSON_PROPERTY_USE_EXPLICIT_FTPS = "useExplicitFtps";
  private Boolean useExplicitFtps;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_FIXED_PACKET_RATE = "fixedPacketRate";
  private Integer fixedPacketRate;

  public static final String JSON_PROPERTY_IPV6_POLICY = "ipv6Policy";
  private TestIpv6Policy ipv6Policy = TestIpv6Policy.USE_AGENT_POLICY;

  public static final String JSON_PROPERTY_BGP_MEASUREMENTS = "bgpMeasurements";
  private Boolean bgpMeasurements = true;

  public static final String JSON_PROPERTY_USE_PUBLIC_BGP = "usePublicBgp";
  private Boolean usePublicBgp = true;

  public UnexpandedFtpServerTest() { 
  }

  @JsonCreator
  public UnexpandedFtpServerTest(
    @JsonProperty(JSON_PROPERTY_CREATED_BY) String createdBy, 
    @JsonProperty(JSON_PROPERTY_CREATED_DATE) OffsetDateTime createdDate, 
    @JsonProperty(JSON_PROPERTY_LIVE_SHARE) Boolean liveShare, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_BY) String modifiedBy, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_DATE) OffsetDateTime modifiedDate, 
    @JsonProperty(JSON_PROPERTY_SAVED_EVENT) Boolean savedEvent, 
    @JsonProperty(JSON_PROPERTY_TEST_ID) String testId, 
    @JsonProperty(JSON_PROPERTY_TYPE) String type
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
  }

  public UnexpandedFtpServerTest interval(TestInterval interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TestInterval getInterval() {
    return interval;
  }


  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInterval(TestInterval interval) {
    this.interval = interval;
  }


  public UnexpandedFtpServerTest alertsEnabled(Boolean alertsEnabled) {
    this.alertsEnabled = alertsEnabled;
    return this;
  }

   /**
   * Indicates if alerts are enabled.
   * @return alertsEnabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAlertsEnabled() {
    return alertsEnabled;
  }


  @JsonProperty(JSON_PROPERTY_ALERTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlertsEnabled(Boolean alertsEnabled) {
    this.alertsEnabled = alertsEnabled;
  }


  public UnexpandedFtpServerTest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Test is enabled.
   * @return enabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


   /**
   * User that created the test.
   * @return createdBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedBy() {
    return createdBy;
  }




   /**
   * UTC created date (ISO date-time format).
   * @return createdDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }




  public UnexpandedFtpServerTest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the test.
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


   /**
   * Indicates if the test is shared with the account group.
   * @return liveShare
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIVE_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLiveShare() {
    return liveShare;
  }




   /**
   * User that modified the test.
   * @return modifiedBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModifiedBy() {
    return modifiedBy;
  }




   /**
   * UTC last modification date (ISO date-time format).
   * @return modifiedDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }




   /**
   * Indicates if the test is a saved event.
   * @return savedEvent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAVED_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSavedEvent() {
    return savedEvent;
  }




   /**
   * Each test is assigned an unique ID; this is used to access test information and results from other endpoints.
   * @return testId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTestId() {
    return testId;
  }




  public UnexpandedFtpServerTest testName(String testName) {
    this.testName = testName;
    return this;
  }

   /**
   * The name of the test. Test name must be unique.
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


   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }




  public UnexpandedFtpServerTest links(UnexpandedInstantTestLinks links) {
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

  public UnexpandedInstantTestLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(UnexpandedInstantTestLinks links) {
    this.links = links;
  }


  public UnexpandedFtpServerTest bandwidthMeasurements(Boolean bandwidthMeasurements) {
    this.bandwidthMeasurements = bandwidthMeasurements;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; to enable bandwidth measurements, only applies to Enterprise agents assigned to the test.
   * @return bandwidthMeasurements
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BANDWIDTH_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBandwidthMeasurements() {
    return bandwidthMeasurements;
  }


  @JsonProperty(JSON_PROPERTY_BANDWIDTH_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBandwidthMeasurements(Boolean bandwidthMeasurements) {
    this.bandwidthMeasurements = bandwidthMeasurements;
  }


  public UnexpandedFtpServerTest downloadLimit(Integer downloadLimit) {
    this.downloadLimit = downloadLimit;
    return this;
  }

   /**
   * Specify maximum number of bytes to download from the target object.
   * @return downloadLimit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOWNLOAD_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDownloadLimit() {
    return downloadLimit;
  }


  @JsonProperty(JSON_PROPERTY_DOWNLOAD_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDownloadLimit(Integer downloadLimit) {
    this.downloadLimit = downloadLimit;
  }


  public UnexpandedFtpServerTest ftpTargetTime(Integer ftpTargetTime) {
    this.ftpTargetTime = ftpTargetTime;
    return this;
  }

   /**
   * Target time for operation completion; specified in milliseconds.
   * minimum: 1000
   * maximum: 6000
   * @return ftpTargetTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FTP_TARGET_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFtpTargetTime() {
    return ftpTargetTime;
  }


  @JsonProperty(JSON_PROPERTY_FTP_TARGET_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFtpTargetTime(Integer ftpTargetTime) {
    this.ftpTargetTime = ftpTargetTime;
  }


  public UnexpandedFtpServerTest ftpTimeLimit(Integer ftpTimeLimit) {
    this.ftpTimeLimit = ftpTimeLimit;
    return this;
  }

   /**
   * Set the time limit for the test in seconds.
   * minimum: 10
   * maximum: 60
   * @return ftpTimeLimit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FTP_TIME_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFtpTimeLimit() {
    return ftpTimeLimit;
  }


  @JsonProperty(JSON_PROPERTY_FTP_TIME_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFtpTimeLimit(Integer ftpTimeLimit) {
    this.ftpTimeLimit = ftpTimeLimit;
  }


  public UnexpandedFtpServerTest mtuMeasurements(Boolean mtuMeasurements) {
    this.mtuMeasurements = mtuMeasurements;
    return this;
  }

   /**
   * Set &#x60;true&#x60; to measure MTU sizes on network from agents to the target.
   * @return mtuMeasurements
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MTU_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMtuMeasurements() {
    return mtuMeasurements;
  }


  @JsonProperty(JSON_PROPERTY_MTU_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMtuMeasurements(Boolean mtuMeasurements) {
    this.mtuMeasurements = mtuMeasurements;
  }


  public UnexpandedFtpServerTest networkMeasurements(Boolean networkMeasurements) {
    this.networkMeasurements = networkMeasurements;
    return this;
  }

   /**
   * Enable or disable network measurements. Set to true to enable or false to disable network measurements.
   * @return networkMeasurements
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNetworkMeasurements() {
    return networkMeasurements;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworkMeasurements(Boolean networkMeasurements) {
    this.networkMeasurements = networkMeasurements;
  }


  public UnexpandedFtpServerTest numPathTraces(Integer numPathTraces) {
    this.numPathTraces = numPathTraces;
    return this;
  }

   /**
   * Number of path traces executed by the agent.
   * minimum: 1
   * maximum: 10
   * @return numPathTraces
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUM_PATH_TRACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumPathTraces() {
    return numPathTraces;
  }


  @JsonProperty(JSON_PROPERTY_NUM_PATH_TRACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumPathTraces(Integer numPathTraces) {
    this.numPathTraces = numPathTraces;
  }


  public UnexpandedFtpServerTest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password for Basic/NTLM authentication.
   * @return password
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPassword(String password) {
    this.password = password;
  }


  public UnexpandedFtpServerTest pathTraceMode(TestPathTraceMode pathTraceMode) {
    this.pathTraceMode = pathTraceMode;
    return this;
  }

   /**
   * Get pathTraceMode
   * @return pathTraceMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH_TRACE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestPathTraceMode getPathTraceMode() {
    return pathTraceMode;
  }


  @JsonProperty(JSON_PROPERTY_PATH_TRACE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPathTraceMode(TestPathTraceMode pathTraceMode) {
    this.pathTraceMode = pathTraceMode;
  }


  public UnexpandedFtpServerTest probeMode(TestProbeMode probeMode) {
    this.probeMode = probeMode;
    return this;
  }

   /**
   * Get probeMode
   * @return probeMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROBE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestProbeMode getProbeMode() {
    return probeMode;
  }


  @JsonProperty(JSON_PROPERTY_PROBE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProbeMode(TestProbeMode probeMode) {
    this.probeMode = probeMode;
  }


  public UnexpandedFtpServerTest protocol(TestProtocol protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestProtocol getProtocol() {
    return protocol;
  }


  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProtocol(TestProtocol protocol) {
    this.protocol = protocol;
  }


  public UnexpandedFtpServerTest requestType(FtpServerRequestType requestType) {
    this.requestType = requestType;
    return this;
  }

   /**
   * Get requestType
   * @return requestType
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FtpServerRequestType getRequestType() {
    return requestType;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRequestType(FtpServerRequestType requestType) {
    this.requestType = requestType;
  }


  public UnexpandedFtpServerTest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Target for the test.
   * @return url
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(String url) {
    this.url = url;
  }


  public UnexpandedFtpServerTest useActiveFtp(Boolean useActiveFtp) {
    this.useActiveFtp = useActiveFtp;
    return this;
  }

   /**
   * Explicitly set the flag to use active FTP.
   * @return useActiveFtp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USE_ACTIVE_FTP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUseActiveFtp() {
    return useActiveFtp;
  }


  @JsonProperty(JSON_PROPERTY_USE_ACTIVE_FTP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseActiveFtp(Boolean useActiveFtp) {
    this.useActiveFtp = useActiveFtp;
  }


  public UnexpandedFtpServerTest useExplicitFtps(Boolean useExplicitFtps) {
    this.useExplicitFtps = useExplicitFtps;
    return this;
  }

   /**
   * Use explicit FTPS (ftp over SSL). By default, tests will autodetect when it is appropriate to use FTPS.
   * @return useExplicitFtps
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USE_EXPLICIT_FTPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUseExplicitFtps() {
    return useExplicitFtps;
  }


  @JsonProperty(JSON_PROPERTY_USE_EXPLICIT_FTPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseExplicitFtps(Boolean useExplicitFtps) {
    this.useExplicitFtps = useExplicitFtps;
  }


  public UnexpandedFtpServerTest username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Username for Basic/NTLM authentication.
   * @return username
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUsername(String username) {
    this.username = username;
  }


  public UnexpandedFtpServerTest fixedPacketRate(Integer fixedPacketRate) {
    this.fixedPacketRate = fixedPacketRate;
    return this;
  }

   /**
   * Sets packets rate sent to measure the network in packets per second.
   * minimum: 0
   * maximum: 100
   * @return fixedPacketRate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIXED_PACKET_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFixedPacketRate() {
    return fixedPacketRate;
  }


  @JsonProperty(JSON_PROPERTY_FIXED_PACKET_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFixedPacketRate(Integer fixedPacketRate) {
    this.fixedPacketRate = fixedPacketRate;
  }


  public UnexpandedFtpServerTest ipv6Policy(TestIpv6Policy ipv6Policy) {
    this.ipv6Policy = ipv6Policy;
    return this;
  }

   /**
   * Get ipv6Policy
   * @return ipv6Policy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IPV6_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestIpv6Policy getIpv6Policy() {
    return ipv6Policy;
  }


  @JsonProperty(JSON_PROPERTY_IPV6_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpv6Policy(TestIpv6Policy ipv6Policy) {
    this.ipv6Policy = ipv6Policy;
  }


  public UnexpandedFtpServerTest bgpMeasurements(Boolean bgpMeasurements) {
    this.bgpMeasurements = bgpMeasurements;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; to enable bgp measurements.
   * @return bgpMeasurements
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BGP_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBgpMeasurements() {
    return bgpMeasurements;
  }


  @JsonProperty(JSON_PROPERTY_BGP_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBgpMeasurements(Boolean bgpMeasurements) {
    this.bgpMeasurements = bgpMeasurements;
  }


  public UnexpandedFtpServerTest usePublicBgp(Boolean usePublicBgp) {
    this.usePublicBgp = usePublicBgp;
    return this;
  }

   /**
   * Indicate if all available public BGP monitors should be used, when ommited defaults to &#x60;bgpMeasurements&#x60; value.
   * @return usePublicBgp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USE_PUBLIC_BGP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUsePublicBgp() {
    return usePublicBgp;
  }


  @JsonProperty(JSON_PROPERTY_USE_PUBLIC_BGP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsePublicBgp(Boolean usePublicBgp) {
    this.usePublicBgp = usePublicBgp;
  }


  /**
   * Return true if this UnexpandedFtpServerTest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnexpandedFtpServerTest unexpandedFtpServerTest = (UnexpandedFtpServerTest) o;
    return Objects.equals(this.interval, unexpandedFtpServerTest.interval) &&
        Objects.equals(this.alertsEnabled, unexpandedFtpServerTest.alertsEnabled) &&
        Objects.equals(this.enabled, unexpandedFtpServerTest.enabled) &&
        Objects.equals(this.createdBy, unexpandedFtpServerTest.createdBy) &&
        Objects.equals(this.createdDate, unexpandedFtpServerTest.createdDate) &&
        Objects.equals(this.description, unexpandedFtpServerTest.description) &&
        Objects.equals(this.liveShare, unexpandedFtpServerTest.liveShare) &&
        Objects.equals(this.modifiedBy, unexpandedFtpServerTest.modifiedBy) &&
        Objects.equals(this.modifiedDate, unexpandedFtpServerTest.modifiedDate) &&
        Objects.equals(this.savedEvent, unexpandedFtpServerTest.savedEvent) &&
        Objects.equals(this.testId, unexpandedFtpServerTest.testId) &&
        Objects.equals(this.testName, unexpandedFtpServerTest.testName) &&
        Objects.equals(this.type, unexpandedFtpServerTest.type) &&
        Objects.equals(this.links, unexpandedFtpServerTest.links) &&
        Objects.equals(this.bandwidthMeasurements, unexpandedFtpServerTest.bandwidthMeasurements) &&
        Objects.equals(this.downloadLimit, unexpandedFtpServerTest.downloadLimit) &&
        Objects.equals(this.ftpTargetTime, unexpandedFtpServerTest.ftpTargetTime) &&
        Objects.equals(this.ftpTimeLimit, unexpandedFtpServerTest.ftpTimeLimit) &&
        Objects.equals(this.mtuMeasurements, unexpandedFtpServerTest.mtuMeasurements) &&
        Objects.equals(this.networkMeasurements, unexpandedFtpServerTest.networkMeasurements) &&
        Objects.equals(this.numPathTraces, unexpandedFtpServerTest.numPathTraces) &&
        Objects.equals(this.password, unexpandedFtpServerTest.password) &&
        Objects.equals(this.pathTraceMode, unexpandedFtpServerTest.pathTraceMode) &&
        Objects.equals(this.probeMode, unexpandedFtpServerTest.probeMode) &&
        Objects.equals(this.protocol, unexpandedFtpServerTest.protocol) &&
        Objects.equals(this.requestType, unexpandedFtpServerTest.requestType) &&
        Objects.equals(this.url, unexpandedFtpServerTest.url) &&
        Objects.equals(this.useActiveFtp, unexpandedFtpServerTest.useActiveFtp) &&
        Objects.equals(this.useExplicitFtps, unexpandedFtpServerTest.useExplicitFtps) &&
        Objects.equals(this.username, unexpandedFtpServerTest.username) &&
        Objects.equals(this.fixedPacketRate, unexpandedFtpServerTest.fixedPacketRate) &&
        Objects.equals(this.ipv6Policy, unexpandedFtpServerTest.ipv6Policy) &&
        Objects.equals(this.bgpMeasurements, unexpandedFtpServerTest.bgpMeasurements) &&
        Objects.equals(this.usePublicBgp, unexpandedFtpServerTest.usePublicBgp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, alertsEnabled, enabled, createdBy, createdDate, description, liveShare, modifiedBy, modifiedDate, savedEvent, testId, testName, type, links, bandwidthMeasurements, downloadLimit, ftpTargetTime, ftpTimeLimit, mtuMeasurements, networkMeasurements, numPathTraces, password, pathTraceMode, probeMode, protocol, requestType, url, useActiveFtp, useExplicitFtps, username, fixedPacketRate, ipv6Policy, bgpMeasurements, usePublicBgp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnexpandedFtpServerTest {\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    alertsEnabled: ").append(toIndentedString(alertsEnabled)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
    sb.append("    bgpMeasurements: ").append(toIndentedString(bgpMeasurements)).append("\n");
    sb.append("    usePublicBgp: ").append(toIndentedString(usePublicBgp)).append("\n");
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

