/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.7
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Contains object with webex information. Only returned for webex applications.
 */
@JsonPropertyOrder({
  DynamicTestWebex.JSON_PROPERTY_CONFERENCE_ID,
  DynamicTestWebex.JSON_PROPERTY_CORRELATION_ID,
  DynamicTestWebex.JSON_PROPERTY_LOCAL_SIP_SESSION_ID,
  DynamicTestWebex.JSON_PROPERTY_REMOTE_SIP_SESSION_ID
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class DynamicTestWebex {
  public static final String JSON_PROPERTY_CONFERENCE_ID = "conferenceId";
  private String conferenceId;

  public static final String JSON_PROPERTY_CORRELATION_ID = "correlationId";
  private String correlationId;

  public static final String JSON_PROPERTY_LOCAL_SIP_SESSION_ID = "localSipSessionId";
  private String localSipSessionId;

  public static final String JSON_PROPERTY_REMOTE_SIP_SESSION_ID = "remoteSipSessionId";
  private String remoteSipSessionId;

  public DynamicTestWebex() { 
  }

  @JsonCreator
  public DynamicTestWebex(
    @JsonProperty(JSON_PROPERTY_CONFERENCE_ID) String conferenceId, 
    @JsonProperty(JSON_PROPERTY_CORRELATION_ID) String correlationId, 
    @JsonProperty(JSON_PROPERTY_LOCAL_SIP_SESSION_ID) String localSipSessionId, 
    @JsonProperty(JSON_PROPERTY_REMOTE_SIP_SESSION_ID) String remoteSipSessionId
  ) {
  this();
    this.conferenceId = conferenceId;
    this.correlationId = correlationId;
    this.localSipSessionId = localSipSessionId;
    this.remoteSipSessionId = remoteSipSessionId;
  }

   /**
   * Webex conference ID.
   * @return conferenceId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFERENCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConferenceId() {
    return conferenceId;
  }




   /**
   * Webex conference correlation ID.
   * @return correlationId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CORRELATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCorrelationId() {
    return correlationId;
  }




   /**
   * Webex calling local sip session ID.
   * @return localSipSessionId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCAL_SIP_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocalSipSessionId() {
    return localSipSessionId;
  }




   /**
   * Webex calling remote sip session ID.
   * @return remoteSipSessionId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMOTE_SIP_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRemoteSipSessionId() {
    return remoteSipSessionId;
  }




  /**
   * Return true if this DynamicTestWebex object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicTestWebex dynamicTestWebex = (DynamicTestWebex) o;
    return Objects.equals(this.conferenceId, dynamicTestWebex.conferenceId) &&
        Objects.equals(this.correlationId, dynamicTestWebex.correlationId) &&
        Objects.equals(this.localSipSessionId, dynamicTestWebex.localSipSessionId) &&
        Objects.equals(this.remoteSipSessionId, dynamicTestWebex.remoteSipSessionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conferenceId, correlationId, localSipSessionId, remoteSipSessionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicTestWebex {\n");
    sb.append("    conferenceId: ").append(toIndentedString(conferenceId)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    localSipSessionId: ").append(toIndentedString(localSipSessionId)).append("\n");
    sb.append("    remoteSipSessionId: ").append(toIndentedString(remoteSipSessionId)).append("\n");
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

