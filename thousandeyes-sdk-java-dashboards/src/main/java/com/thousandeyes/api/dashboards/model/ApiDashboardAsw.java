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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.thousandeyes.api.dashboards.model.AswRepeat;
import com.thousandeyes.api.dashboards.model.AswRepeatUnit;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Alert suppression window shown in a widget.
 */
@JsonPropertyOrder({
  ApiDashboardAsw.JSON_PROPERTY_ID,
  ApiDashboardAsw.JSON_PROPERTY_NAME,
  ApiDashboardAsw.JSON_PROPERTY_TEST_IDS,
  ApiDashboardAsw.JSON_PROPERTY_START_TIMES,
  ApiDashboardAsw.JSON_PROPERTY_DURATION_IN_SECONDS,
  ApiDashboardAsw.JSON_PROPERTY_REPEAT,
  ApiDashboardAsw.JSON_PROPERTY_REPEAT_EVERY,
  ApiDashboardAsw.JSON_PROPERTY_REPEAT_UNIT
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ApiDashboardAsw {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TEST_IDS = "testIds";
  private Set<String> testIds = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_START_TIMES = "startTimes";
  private List<OffsetDateTime> startTimes = new ArrayList<>();

  public static final String JSON_PROPERTY_DURATION_IN_SECONDS = "durationInSeconds";
  private Long durationInSeconds;

  public static final String JSON_PROPERTY_REPEAT = "repeat";
  private AswRepeat repeat;

  public static final String JSON_PROPERTY_REPEAT_EVERY = "repeatEvery";
  private Integer repeatEvery;

  public static final String JSON_PROPERTY_REPEAT_UNIT = "repeatUnit";
  private AswRepeatUnit repeatUnit;

  public ApiDashboardAsw() { 
  }

  public ApiDashboardAsw id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the alert suppression window.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public ApiDashboardAsw name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the alert suppression window.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public ApiDashboardAsw testIds(Set<String> testIds) {
    this.testIds = testIds;
    return this;
  }

  public ApiDashboardAsw addTestIdsItem(String testIdsItem) {
    if (this.testIds == null) {
      this.testIds = new LinkedHashSet<>();
    }
    this.testIds.add(testIdsItem);
    return this;
  }

   /**
   * Get testIds
   * @return testIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getTestIds() {
    return testIds;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_TEST_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestIds(Set<String> testIds) {
    this.testIds = testIds;
  }


  public ApiDashboardAsw startTimes(List<OffsetDateTime> startTimes) {
    this.startTimes = startTimes;
    return this;
  }

  public ApiDashboardAsw addStartTimesItem(OffsetDateTime startTimesItem) {
    if (this.startTimes == null) {
      this.startTimes = new ArrayList<>();
    }
    this.startTimes.add(startTimesItem);
    return this;
  }

   /**
   * Get startTimes
   * @return startTimes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_TIMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OffsetDateTime> getStartTimes() {
    return startTimes;
  }


  @JsonProperty(JSON_PROPERTY_START_TIMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTimes(List<OffsetDateTime> startTimes) {
    this.startTimes = startTimes;
  }


  public ApiDashboardAsw durationInSeconds(Long durationInSeconds) {
    this.durationInSeconds = durationInSeconds;
    return this;
  }

   /**
   * Get durationInSeconds
   * @return durationInSeconds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION_IN_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDurationInSeconds() {
    return durationInSeconds;
  }


  @JsonProperty(JSON_PROPERTY_DURATION_IN_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDurationInSeconds(Long durationInSeconds) {
    this.durationInSeconds = durationInSeconds;
  }


  public ApiDashboardAsw repeat(AswRepeat repeat) {
    this.repeat = repeat;
    return this;
  }

   /**
   * Get repeat
   * @return repeat
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPEAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AswRepeat getRepeat() {
    return repeat;
  }


  @JsonProperty(JSON_PROPERTY_REPEAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRepeat(AswRepeat repeat) {
    this.repeat = repeat;
  }


  public ApiDashboardAsw repeatEvery(Integer repeatEvery) {
    this.repeatEvery = repeatEvery;
    return this;
  }

   /**
   * Get repeatEvery
   * @return repeatEvery
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPEAT_EVERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRepeatEvery() {
    return repeatEvery;
  }


  @JsonProperty(JSON_PROPERTY_REPEAT_EVERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRepeatEvery(Integer repeatEvery) {
    this.repeatEvery = repeatEvery;
  }


  public ApiDashboardAsw repeatUnit(AswRepeatUnit repeatUnit) {
    this.repeatUnit = repeatUnit;
    return this;
  }

   /**
   * Get repeatUnit
   * @return repeatUnit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPEAT_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AswRepeatUnit getRepeatUnit() {
    return repeatUnit;
  }


  @JsonProperty(JSON_PROPERTY_REPEAT_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRepeatUnit(AswRepeatUnit repeatUnit) {
    this.repeatUnit = repeatUnit;
  }


  /**
   * Return true if this ApiDashboardAsw object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiDashboardAsw apiDashboardAsw = (ApiDashboardAsw) o;
    return Objects.equals(this.id, apiDashboardAsw.id) &&
        Objects.equals(this.name, apiDashboardAsw.name) &&
        Objects.equals(this.testIds, apiDashboardAsw.testIds) &&
        Objects.equals(this.startTimes, apiDashboardAsw.startTimes) &&
        Objects.equals(this.durationInSeconds, apiDashboardAsw.durationInSeconds) &&
        Objects.equals(this.repeat, apiDashboardAsw.repeat) &&
        Objects.equals(this.repeatEvery, apiDashboardAsw.repeatEvery) &&
        Objects.equals(this.repeatUnit, apiDashboardAsw.repeatUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, testIds, startTimes, durationInSeconds, repeat, repeatEvery, repeatUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiDashboardAsw {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    testIds: ").append(toIndentedString(testIds)).append("\n");
    sb.append("    startTimes: ").append(toIndentedString(startTimes)).append("\n");
    sb.append("    durationInSeconds: ").append(toIndentedString(durationInSeconds)).append("\n");
    sb.append("    repeat: ").append(toIndentedString(repeat)).append("\n");
    sb.append("    repeatEvery: ").append(toIndentedString(repeatEvery)).append("\n");
    sb.append("    repeatUnit: ").append(toIndentedString(repeatUnit)).append("\n");
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

