/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
 *
 * The version of the OpenAPI document: 7.0.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.dashboards.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DefaultTimespan
 */
@JsonPropertyOrder({
  DefaultTimespan.JSON_PROPERTY_TIMESPAN_DURATION,
  DefaultTimespan.JSON_PROPERTY_TIMESPAN_START,
  DefaultTimespan.JSON_PROPERTY_TIMESPAN_END,
  DefaultTimespan.JSON_PROPERTY_DURATION,
  DefaultTimespan.JSON_PROPERTY_START,
  DefaultTimespan.JSON_PROPERTY_END
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class DefaultTimespan {
  public static final String JSON_PROPERTY_TIMESPAN_DURATION = "timespanDuration";
  private Long timespanDuration;

  public static final String JSON_PROPERTY_TIMESPAN_START = "timespanStart";
  private String timespanStart;

  public static final String JSON_PROPERTY_TIMESPAN_END = "timespanEnd";
  private String timespanEnd;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Long duration;

  public static final String JSON_PROPERTY_START = "start";
  private OffsetDateTime start;

  public static final String JSON_PROPERTY_END = "end";
  private OffsetDateTime end;

  public DefaultTimespan() { 
  }

  public DefaultTimespan timespanDuration(Long timespanDuration) {
    this.timespanDuration = timespanDuration;
    return this;
  }

   /**
   * Relative timespan in seconds.
   * @return timespanDuration
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESPAN_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTimespanDuration() {
    return timespanDuration;
  }


  @JsonProperty(JSON_PROPERTY_TIMESPAN_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimespanDuration(Long timespanDuration) {
    this.timespanDuration = timespanDuration;
  }


  public DefaultTimespan timespanStart(String timespanStart) {
    this.timespanStart = timespanStart;
    return this;
  }

   /**
   * UTC start date of the timespan range.
   * @return timespanStart
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESPAN_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimespanStart() {
    return timespanStart;
  }


  @JsonProperty(JSON_PROPERTY_TIMESPAN_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimespanStart(String timespanStart) {
    this.timespanStart = timespanStart;
  }


  public DefaultTimespan timespanEnd(String timespanEnd) {
    this.timespanEnd = timespanEnd;
    return this;
  }

   /**
   * UTC end date of the timespan range.
   * @return timespanEnd
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESPAN_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimespanEnd() {
    return timespanEnd;
  }


  @JsonProperty(JSON_PROPERTY_TIMESPAN_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimespanEnd(String timespanEnd) {
    this.timespanEnd = timespanEnd;
  }


  public DefaultTimespan duration(Long duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Relative timespan in seconds.
   * @return duration
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(Long duration) {
    this.duration = duration;
  }


  public DefaultTimespan start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * UTC start date of the timespan range (ISO date-time format).
   * @return start
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStart(OffsetDateTime start) {
    this.start = start;
  }


  public DefaultTimespan end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

   /**
   * UTC end date of the timespan range (ISO date-time format).
   * @return end
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEnd() {
    return end;
  }


  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }


  /**
   * Return true if this DefaultTimespan object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultTimespan defaultTimespan = (DefaultTimespan) o;
    return Objects.equals(this.timespanDuration, defaultTimespan.timespanDuration) &&
        Objects.equals(this.timespanStart, defaultTimespan.timespanStart) &&
        Objects.equals(this.timespanEnd, defaultTimespan.timespanEnd) &&
        Objects.equals(this.duration, defaultTimespan.duration) &&
        Objects.equals(this.start, defaultTimespan.start) &&
        Objects.equals(this.end, defaultTimespan.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timespanDuration, timespanStart, timespanEnd, duration, start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultTimespan {\n");
    sb.append("    timespanDuration: ").append(toIndentedString(timespanDuration)).append("\n");
    sb.append("    timespanStart: ").append(toIndentedString(timespanStart)).append("\n");
    sb.append("    timespanEnd: ").append(toIndentedString(timespanEnd)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

