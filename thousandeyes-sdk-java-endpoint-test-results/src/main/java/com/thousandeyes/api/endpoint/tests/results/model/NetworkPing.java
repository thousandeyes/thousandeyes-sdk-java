/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.tests.results.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * NetworkPing
 */
@JsonPropertyOrder({
  NetworkPing.JSON_PROPERTY_AVG_RTT,
  NetworkPing.JSON_PROPERTY_MAX_RTT,
  NetworkPing.JSON_PROPERTY_MEAN_DEV_RTT,
  NetworkPing.JSON_PROPERTY_MIN_RTT,
  NetworkPing.JSON_PROPERTY_PKTS_RECEIVED,
  NetworkPing.JSON_PROPERTY_PKTS_SENT,
  NetworkPing.JSON_PROPERTY_ERROR,
  NetworkPing.JSON_PROPERTY_INFO_FLAGS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T10:46:26.208767+01:00[Europe/Lisbon]")
public class NetworkPing {
  public static final String JSON_PROPERTY_AVG_RTT = "avgRtt";
  private Integer avgRtt;

  public static final String JSON_PROPERTY_MAX_RTT = "maxRtt";
  private Integer maxRtt;

  public static final String JSON_PROPERTY_MEAN_DEV_RTT = "meanDevRtt";
  private Integer meanDevRtt;

  public static final String JSON_PROPERTY_MIN_RTT = "minRtt";
  private Integer minRtt;

  public static final String JSON_PROPERTY_PKTS_RECEIVED = "pktsReceived";
  private Integer pktsReceived;

  public static final String JSON_PROPERTY_PKTS_SENT = "pktsSent";
  private Integer pktsSent;

  public static final String JSON_PROPERTY_ERROR = "error";
  private String error;

  public static final String JSON_PROPERTY_INFO_FLAGS = "infoFlags";
  private List<String> infoFlags = new ArrayList<>();

  public NetworkPing() { 
  }

  @JsonCreator
  public NetworkPing(
    @JsonProperty(JSON_PROPERTY_AVG_RTT) Integer avgRtt, 
    @JsonProperty(JSON_PROPERTY_MAX_RTT) Integer maxRtt, 
    @JsonProperty(JSON_PROPERTY_MEAN_DEV_RTT) Integer meanDevRtt, 
    @JsonProperty(JSON_PROPERTY_MIN_RTT) Integer minRtt, 
    @JsonProperty(JSON_PROPERTY_PKTS_RECEIVED) Integer pktsReceived, 
    @JsonProperty(JSON_PROPERTY_PKTS_SENT) Integer pktsSent, 
    @JsonProperty(JSON_PROPERTY_ERROR) String error, 
    @JsonProperty(JSON_PROPERTY_INFO_FLAGS) List<String> infoFlags
  ) {
  this();
    this.avgRtt = avgRtt;
    this.maxRtt = maxRtt;
    this.meanDevRtt = meanDevRtt;
    this.minRtt = minRtt;
    this.pktsReceived = pktsReceived;
    this.pktsSent = pktsSent;
    this.error = error;
    this.infoFlags = infoFlags;
  }

   /**
   * Ping average response time.
   * @return avgRtt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVG_RTT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAvgRtt() {
    return avgRtt;
  }




   /**
   * Ping maximum response time.
   * @return maxRtt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_RTT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxRtt() {
    return maxRtt;
  }




   /**
   * Ping mean standard deviation response time.
   * @return meanDevRtt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEAN_DEV_RTT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMeanDevRtt() {
    return meanDevRtt;
  }




   /**
   * Ping minimum response time.
   * @return minRtt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN_RTT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinRtt() {
    return minRtt;
  }




   /**
   * Ping packets received.
   * @return pktsReceived
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PKTS_RECEIVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPktsReceived() {
    return pktsReceived;
  }




   /**
   * Ping packets sent.
   * @return pktsSent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PKTS_SENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPktsSent() {
    return pktsSent;
  }




   /**
   * Only present when there is an error.
   * @return error
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getError() {
    return error;
  }




   /**
   * Get infoFlags
   * @return infoFlags
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFO_FLAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getInfoFlags() {
    return infoFlags;
  }




  /**
   * Return true if this NetworkPing object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkPing networkPing = (NetworkPing) o;
    return Objects.equals(this.avgRtt, networkPing.avgRtt) &&
        Objects.equals(this.maxRtt, networkPing.maxRtt) &&
        Objects.equals(this.meanDevRtt, networkPing.meanDevRtt) &&
        Objects.equals(this.minRtt, networkPing.minRtt) &&
        Objects.equals(this.pktsReceived, networkPing.pktsReceived) &&
        Objects.equals(this.pktsSent, networkPing.pktsSent) &&
        Objects.equals(this.error, networkPing.error) &&
        Objects.equals(this.infoFlags, networkPing.infoFlags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avgRtt, maxRtt, meanDevRtt, minRtt, pktsReceived, pktsSent, error, infoFlags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkPing {\n");
    sb.append("    avgRtt: ").append(toIndentedString(avgRtt)).append("\n");
    sb.append("    maxRtt: ").append(toIndentedString(maxRtt)).append("\n");
    sb.append("    meanDevRtt: ").append(toIndentedString(meanDevRtt)).append("\n");
    sb.append("    minRtt: ").append(toIndentedString(minRtt)).append("\n");
    sb.append("    pktsReceived: ").append(toIndentedString(pktsReceived)).append("\n");
    sb.append("    pktsSent: ").append(toIndentedString(pktsSent)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    infoFlags: ").append(toIndentedString(infoFlags)).append("\n");
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

