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


package com.thousandeyes.api.dashboards.model;

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
 * LegacyDefaultTimespan
 * @deprecated
 */
@Deprecated
@JsonPropertyOrder({
  LegacyDefaultTimespan.JSON_PROPERTY_TIMESPAN_DURATION,
  LegacyDefaultTimespan.JSON_PROPERTY_TIMESPAN_START,
  LegacyDefaultTimespan.JSON_PROPERTY_TIMESPAN_END
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class LegacyDefaultTimespan {
  public static final String JSON_PROPERTY_TIMESPAN_DURATION = "timespanDuration";
  private Long timespanDuration;

  public static final String JSON_PROPERTY_TIMESPAN_START = "timespanStart";
  private String timespanStart;

  public static final String JSON_PROPERTY_TIMESPAN_END = "timespanEnd";
  private String timespanEnd;

  public LegacyDefaultTimespan() { 
  }

  public LegacyDefaultTimespan timespanDuration(Long timespanDuration) {
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


  public LegacyDefaultTimespan timespanStart(String timespanStart) {
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


  public LegacyDefaultTimespan timespanEnd(String timespanEnd) {
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


  /**
   * Return true if this LegacyDefaultTimespan object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegacyDefaultTimespan legacyDefaultTimespan = (LegacyDefaultTimespan) o;
    return Objects.equals(this.timespanDuration, legacyDefaultTimespan.timespanDuration) &&
        Objects.equals(this.timespanStart, legacyDefaultTimespan.timespanStart) &&
        Objects.equals(this.timespanEnd, legacyDefaultTimespan.timespanEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timespanDuration, timespanStart, timespanEnd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegacyDefaultTimespan {\n");
    sb.append("    timespanDuration: ").append(toIndentedString(timespanDuration)).append("\n");
    sb.append("    timespanStart: ").append(toIndentedString(timespanStart)).append("\n");
    sb.append("    timespanEnd: ").append(toIndentedString(timespanEnd)).append("\n");
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

