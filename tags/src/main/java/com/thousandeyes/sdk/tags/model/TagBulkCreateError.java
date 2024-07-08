/*
 * Tags API
 * The ThousandEyes Tags API provides a tagging system with key/value pairs. It allows you to tag assets within the ThousandEyes platform (such as agents, tests, or alert rules) with meaningful metadata. For example: `branch:sfo`, `branch:nyc`, and `team:netops`.  This feature provides:  * Support for automation. * Powerful and flexible reports/dashboards. * Support for third-party integrations.  Things to note with the ThousandEyes Tags API:  * Tags are backwards-compatible with existing labels. * Tags are separated by Tests (CEA), Agents (CEA), Endpoint Agents, Scheduled Endpoint Tests, and Reports. A single tag can only apply to one type of target object, so each tag must specify the target type of object via a `type` field. * Tags are defined in a single table so that they can be represented using a single model - `Tag`. 
 *
 * The version of the OpenAPI document: 7.0.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tags.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.tags.model.TagInfo;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TagBulkCreateError
 */
@JsonPropertyOrder({
  TagBulkCreateError.JSON_PROPERTY_TAG,
  TagBulkCreateError.JSON_PROPERTY_RESPONSE_CODE,
  TagBulkCreateError.JSON_PROPERTY_MESSAGE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class TagBulkCreateError {
  public static final String JSON_PROPERTY_TAG = "tag";
  private Map<String, TagInfo> tag = new HashMap<>();

  public static final String JSON_PROPERTY_RESPONSE_CODE = "responseCode";
  private Integer responseCode;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public TagBulkCreateError() { 
  }

  public TagBulkCreateError tag(Map<String, TagInfo> tag) {
    this.tag = tag;
    return this;
  }

  public TagBulkCreateError putTagItem(String key, TagInfo tagItem) {
    if (this.tag == null) {
      this.tag = new HashMap<>();
    }
    this.tag.put(key, tagItem);
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, TagInfo> getTag() {
    return tag;
  }


  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTag(Map<String, TagInfo> tag) {
    this.tag = tag;
  }


  public TagBulkCreateError responseCode(Integer responseCode) {
    this.responseCode = responseCode;
    return this;
  }

   /**
   * HTTP response code
   * @return responseCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getResponseCode() {
    return responseCode;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponseCode(Integer responseCode) {
    this.responseCode = responseCode;
  }


  public TagBulkCreateError message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Status / error message
   * @return message
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   * Return true if this TagBulkCreateError object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagBulkCreateError tagBulkCreateError = (TagBulkCreateError) o;
    return Objects.equals(this.tag, tagBulkCreateError.tag) &&
        Objects.equals(this.responseCode, tagBulkCreateError.responseCode) &&
        Objects.equals(this.message, tagBulkCreateError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, responseCode, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagBulkCreateError {\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

