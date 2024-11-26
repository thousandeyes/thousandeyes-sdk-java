/*
 * Instant Tests API
 * The Instant Tests API operations lets you create and run new instant tests. You will need to be a regular user or have the following permissions:   * `API Access`   * `View tests`  The response does not include the immediate test results. Use the Test Results endpoints to get test results after creating and executing an instant test. You can find the URLs for these endpoints in the _links section of the test definition that is returned when you create the instant test. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests.instant.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.tests.instant.model.FtpServerRequestType;
import com.thousandeyes.sdk.tests.instant.model.TestIpv6Policy;
import com.thousandeyes.sdk.tests.instant.model.TestPathTraceMode;
import com.thousandeyes.sdk.tests.instant.model.TestProbeMode;
import com.thousandeyes.sdk.tests.instant.model.TestProtocol;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * FtpServerProperties
 */
@JsonPropertyOrder({
  FtpServerProperties.JSON_PROPERTY_BANDWIDTH_MEASUREMENTS,
  FtpServerProperties.JSON_PROPERTY_DOWNLOAD_LIMIT,
  FtpServerProperties.JSON_PROPERTY_FTP_TARGET_TIME,
  FtpServerProperties.JSON_PROPERTY_FTP_TIME_LIMIT,
  FtpServerProperties.JSON_PROPERTY_MTU_MEASUREMENTS,
  FtpServerProperties.JSON_PROPERTY_NETWORK_MEASUREMENTS,
  FtpServerProperties.JSON_PROPERTY_NUM_PATH_TRACES,
  FtpServerProperties.JSON_PROPERTY_PASSWORD,
  FtpServerProperties.JSON_PROPERTY_PATH_TRACE_MODE,
  FtpServerProperties.JSON_PROPERTY_PROBE_MODE,
  FtpServerProperties.JSON_PROPERTY_PROTOCOL,
  FtpServerProperties.JSON_PROPERTY_RANDOMIZED_START_TIME,
  FtpServerProperties.JSON_PROPERTY_REQUEST_TYPE,
  FtpServerProperties.JSON_PROPERTY_URL,
  FtpServerProperties.JSON_PROPERTY_USE_ACTIVE_FTP,
  FtpServerProperties.JSON_PROPERTY_USE_EXPLICIT_FTPS,
  FtpServerProperties.JSON_PROPERTY_USERNAME,
  FtpServerProperties.JSON_PROPERTY_FIXED_PACKET_RATE,
  FtpServerProperties.JSON_PROPERTY_IPV6_POLICY,
  FtpServerProperties.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class FtpServerProperties {
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

  public static final String JSON_PROPERTY_RANDOMIZED_START_TIME = "randomizedStartTime";
  private Boolean randomizedStartTime = false;

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

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public FtpServerProperties() { 
  }

  @JsonCreator
  public FtpServerProperties(
    @JsonProperty(JSON_PROPERTY_TYPE) String type
  ) {
  this();
    this.type = type;
  }

  public FtpServerProperties bandwidthMeasurements(Boolean bandwidthMeasurements) {
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


  public FtpServerProperties downloadLimit(Integer downloadLimit) {
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


  public FtpServerProperties ftpTargetTime(Integer ftpTargetTime) {
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


  public FtpServerProperties ftpTimeLimit(Integer ftpTimeLimit) {
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


  public FtpServerProperties mtuMeasurements(Boolean mtuMeasurements) {
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


  public FtpServerProperties networkMeasurements(Boolean networkMeasurements) {
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


  public FtpServerProperties numPathTraces(Integer numPathTraces) {
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


  public FtpServerProperties password(String password) {
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


  public FtpServerProperties pathTraceMode(TestPathTraceMode pathTraceMode) {
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


  public FtpServerProperties probeMode(TestProbeMode probeMode) {
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


  public FtpServerProperties protocol(TestProtocol protocol) {
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


  public FtpServerProperties randomizedStartTime(Boolean randomizedStartTime) {
    this.randomizedStartTime = randomizedStartTime;
    return this;
  }

   /**
   * Indicates whether agents should randomize the start time in each test round.
   * @return randomizedStartTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RANDOMIZED_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRandomizedStartTime() {
    return randomizedStartTime;
  }


  @JsonProperty(JSON_PROPERTY_RANDOMIZED_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRandomizedStartTime(Boolean randomizedStartTime) {
    this.randomizedStartTime = randomizedStartTime;
  }


  public FtpServerProperties requestType(FtpServerRequestType requestType) {
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


  public FtpServerProperties url(String url) {
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


  public FtpServerProperties useActiveFtp(Boolean useActiveFtp) {
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


  public FtpServerProperties useExplicitFtps(Boolean useExplicitFtps) {
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


  public FtpServerProperties username(String username) {
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


  public FtpServerProperties fixedPacketRate(Integer fixedPacketRate) {
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


  public FtpServerProperties ipv6Policy(TestIpv6Policy ipv6Policy) {
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




  /**
   * Return true if this FtpServerProperties object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FtpServerProperties ftpServerProperties = (FtpServerProperties) o;
    return Objects.equals(this.bandwidthMeasurements, ftpServerProperties.bandwidthMeasurements) &&
        Objects.equals(this.downloadLimit, ftpServerProperties.downloadLimit) &&
        Objects.equals(this.ftpTargetTime, ftpServerProperties.ftpTargetTime) &&
        Objects.equals(this.ftpTimeLimit, ftpServerProperties.ftpTimeLimit) &&
        Objects.equals(this.mtuMeasurements, ftpServerProperties.mtuMeasurements) &&
        Objects.equals(this.networkMeasurements, ftpServerProperties.networkMeasurements) &&
        Objects.equals(this.numPathTraces, ftpServerProperties.numPathTraces) &&
        Objects.equals(this.password, ftpServerProperties.password) &&
        Objects.equals(this.pathTraceMode, ftpServerProperties.pathTraceMode) &&
        Objects.equals(this.probeMode, ftpServerProperties.probeMode) &&
        Objects.equals(this.protocol, ftpServerProperties.protocol) &&
        Objects.equals(this.randomizedStartTime, ftpServerProperties.randomizedStartTime) &&
        Objects.equals(this.requestType, ftpServerProperties.requestType) &&
        Objects.equals(this.url, ftpServerProperties.url) &&
        Objects.equals(this.useActiveFtp, ftpServerProperties.useActiveFtp) &&
        Objects.equals(this.useExplicitFtps, ftpServerProperties.useExplicitFtps) &&
        Objects.equals(this.username, ftpServerProperties.username) &&
        Objects.equals(this.fixedPacketRate, ftpServerProperties.fixedPacketRate) &&
        Objects.equals(this.ipv6Policy, ftpServerProperties.ipv6Policy) &&
        Objects.equals(this.type, ftpServerProperties.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandwidthMeasurements, downloadLimit, ftpTargetTime, ftpTimeLimit, mtuMeasurements, networkMeasurements, numPathTraces, password, pathTraceMode, probeMode, protocol, randomizedStartTime, requestType, url, useActiveFtp, useExplicitFtps, username, fixedPacketRate, ipv6Policy, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FtpServerProperties {\n");
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
    sb.append("    randomizedStartTime: ").append(toIndentedString(randomizedStartTime)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    useActiveFtp: ").append(toIndentedString(useActiveFtp)).append("\n");
    sb.append("    useExplicitFtps: ").append(toIndentedString(useExplicitFtps)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    fixedPacketRate: ").append(toIndentedString(fixedPacketRate)).append("\n");
    sb.append("    ipv6Policy: ").append(toIndentedString(ipv6Policy)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

