/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.11
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
import com.thousandeyes.sdk.endpoint.tests.results.model.ApplicationScoreQuality;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EndpointPingDataPointScore
 */
@JsonPropertyOrder({
  EndpointPingDataPointScore.JSON_PROPERTY_APPLICATION_SCORE,
  EndpointPingDataPointScore.JSON_PROPERTY_QUALITY
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class EndpointPingDataPointScore {
  public static final String JSON_PROPERTY_APPLICATION_SCORE = "applicationScore";
  private Float applicationScore;

  public static final String JSON_PROPERTY_QUALITY = "quality";
  private ApplicationScoreQuality quality;

  public EndpointPingDataPointScore() { 
  }

  public EndpointPingDataPointScore applicationScore(Float applicationScore) {
    this.applicationScore = applicationScore;
    return this;
  }

   /**
   * Fine grained score between 0-100 based on metrics (latency, jitter, loss)
   * @return applicationScore
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICATION_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getApplicationScore() {
    return applicationScore;
  }


  @JsonProperty(JSON_PROPERTY_APPLICATION_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicationScore(Float applicationScore) {
    this.applicationScore = applicationScore;
  }


  public EndpointPingDataPointScore quality(ApplicationScoreQuality quality) {
    this.quality = quality;
    return this;
  }

   /**
   * Get quality
   * @return quality
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApplicationScoreQuality getQuality() {
    return quality;
  }


  @JsonProperty(JSON_PROPERTY_QUALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuality(ApplicationScoreQuality quality) {
    this.quality = quality;
  }


  /**
   * Return true if this EndpointPingDataPointScore object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointPingDataPointScore endpointPingDataPointScore = (EndpointPingDataPointScore) o;
    return Objects.equals(this.applicationScore, endpointPingDataPointScore.applicationScore) &&
        Objects.equals(this.quality, endpointPingDataPointScore.quality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationScore, quality);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointPingDataPointScore {\n");
    sb.append("    applicationScore: ").append(toIndentedString(applicationScore)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
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

