/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.tests.results.model;

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
 * TcpConnect
 */
@JsonPropertyOrder({
  TcpConnect.JSON_PROPERTY_RTT,
  TcpConnect.JSON_PROPERTY_ERROR_CODE,
  TcpConnect.JSON_PROPERTY_ERROR,
  TcpConnect.JSON_PROPERTY_INFO_FLAGS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class TcpConnect {
  public static final String JSON_PROPERTY_RTT = "rtt";
  private Double rtt;

  public static final String JSON_PROPERTY_ERROR_CODE = "errorCode";
  private String errorCode;

  public static final String JSON_PROPERTY_ERROR = "error";
  private String error;

  public static final String JSON_PROPERTY_INFO_FLAGS = "infoFlags";
  private List<String> infoFlags = new ArrayList<>();

  public TcpConnect() { 
  }

  @JsonCreator
  public TcpConnect(
    @JsonProperty(JSON_PROPERTY_RTT) Double rtt, 
    @JsonProperty(JSON_PROPERTY_ERROR_CODE) String errorCode, 
    @JsonProperty(JSON_PROPERTY_ERROR) String error, 
    @JsonProperty(JSON_PROPERTY_INFO_FLAGS) List<String> infoFlags
  ) {
  this();
    this.rtt = rtt;
    this.errorCode = errorCode;
    this.error = error;
    this.infoFlags = infoFlags;
  }

   /**
   * Represents the number of milliseconds required to establish TCP connectivity with the target
   * @return rtt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RTT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getRtt() {
    return rtt;
  }




   /**
   * Only present when there is an error
   * @return errorCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorCode() {
    return errorCode;
  }




   /**
   * Only present when there is an error
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
   * Return true if this TcpConnect object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TcpConnect tcpConnect = (TcpConnect) o;
    return Objects.equals(this.rtt, tcpConnect.rtt) &&
        Objects.equals(this.errorCode, tcpConnect.errorCode) &&
        Objects.equals(this.error, tcpConnect.error) &&
        Objects.equals(this.infoFlags, tcpConnect.infoFlags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rtt, errorCode, error, infoFlags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TcpConnect {\n");
    sb.append("    rtt: ").append(toIndentedString(rtt)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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

