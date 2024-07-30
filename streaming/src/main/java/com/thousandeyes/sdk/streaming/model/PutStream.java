/*
 * ThousandEyes for OpenTelemetry API
 * ThousandEyes for OpenTelemetry provides machine-to-machine integration between ThousandEyes and its customers. It allows you to export ThousandEyes telemetry data in OTel format, which is widely used in the industry. With ThousandEyes for OTel, you can leverage frameworks widely used in the observability domain - such as Splunk, Grafana, and Honeycomb - to capture and analyze ThousandEyes data. Any client that supports OTel can use ThousandEyes for OpenTelemetry.  ThousandEyes for OTel is made up of the following components:  * Data streaming APIs that you can use to configure and enable your ThousandEyes tests with OTel-compatible streams, in particular to configure how ThousandEyes telemetry data is exported to client integrations. * A set of streaming pipelines called _collectors_ that actively fetch ThousandEyes network test data, enrich the data with some additional detail, filter, and push the data to the customer-configured endpoints, depending on what you configure via the public APIs. * Third-party OTel collectors that receive, transform, filter, and export different metrics to client applications such as AppD, or any other OTel-capable client configuration.  For more information about ThousandEyes for OpenTelemetry, see the [documentation](https://docs.thousandeyes.com/product-documentation/api/opentelemetry). 
 *
 * The version of the OpenAPI document: 7.0.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.streaming.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.streaming.model.TagMatch;
import com.thousandeyes.sdk.streaming.model.TestMatch;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PutStream
 */
@JsonPropertyOrder({
  PutStream.JSON_PROPERTY_CUSTOM_HEADERS,
  PutStream.JSON_PROPERTY_TAG_MATCH,
  PutStream.JSON_PROPERTY_TEST_MATCH,
  PutStream.JSON_PROPERTY_ENABLED
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class PutStream {
  public static final String JSON_PROPERTY_CUSTOM_HEADERS = "customHeaders";
  private Map<String, String> customHeaders = new HashMap<>();

  public static final String JSON_PROPERTY_TAG_MATCH = "tagMatch";
  private List<TagMatch> tagMatch = new ArrayList<>();

  public static final String JSON_PROPERTY_TEST_MATCH = "testMatch";
  private List<TestMatch> testMatch = new ArrayList<>();

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public PutStream() { 
  }

  public PutStream customHeaders(Map<String, String> customHeaders) {
    this.customHeaders = customHeaders;
    return this;
  }

  public PutStream putCustomHeadersItem(String key, String customHeadersItem) {
    if (this.customHeaders == null) {
      this.customHeaders = new HashMap<>();
    }
    this.customHeaders.put(key, customHeadersItem);
    return this;
  }

   /**
   * Custom headers. **Note**: When using the &#x60;splunk-hec&#x60; &#x60;type&#x60;, the &#x60;customHeaders&#x60; must contain just one element with the key &#x60;token&#x60; and the value of the *Splunk HEC Token*.
   * @return customHeaders
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getCustomHeaders() {
    return customHeaders;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomHeaders(Map<String, String> customHeaders) {
    this.customHeaders = customHeaders;
  }


  public PutStream tagMatch(List<TagMatch> tagMatch) {
    this.tagMatch = tagMatch;
    return this;
  }

  public PutStream addTagMatchItem(TagMatch tagMatchItem) {
    if (this.tagMatch == null) {
      this.tagMatch = new ArrayList<>();
    }
    this.tagMatch.add(tagMatchItem);
    return this;
  }

   /**
   * A collection of tags that determine what tests are included in the data stream. These tag values are also included as attributes in the data stream metrics.
   * @return tagMatch
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAG_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TagMatch> getTagMatch() {
    return tagMatch;
  }


  @JsonProperty(JSON_PROPERTY_TAG_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTagMatch(List<TagMatch> tagMatch) {
    this.tagMatch = tagMatch;
  }


  public PutStream testMatch(List<TestMatch> testMatch) {
    this.testMatch = testMatch;
    return this;
  }

  public PutStream addTestMatchItem(TestMatch testMatchItem) {
    if (this.testMatch == null) {
      this.testMatch = new ArrayList<>();
    }
    this.testMatch.add(testMatchItem);
    return this;
  }

   /**
   * A collection of tests to be included in the data stream.
   * @return testMatch
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TestMatch> getTestMatch() {
    return testMatch;
  }


  @JsonProperty(JSON_PROPERTY_TEST_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestMatch(List<TestMatch> testMatch) {
    this.testMatch = testMatch;
  }


  public PutStream enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Flag to enable or disable the stream integration.
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
   * Return true if this PutStream object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutStream putStream = (PutStream) o;
    return Objects.equals(this.customHeaders, putStream.customHeaders) &&
        Objects.equals(this.tagMatch, putStream.tagMatch) &&
        Objects.equals(this.testMatch, putStream.testMatch) &&
        Objects.equals(this.enabled, putStream.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customHeaders, tagMatch, testMatch, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutStream {\n");
    sb.append("    customHeaders: ").append(toIndentedString(customHeaders)).append("\n");
    sb.append("    tagMatch: ").append(toIndentedString(tagMatch)).append("\n");
    sb.append("    testMatch: ").append(toIndentedString(testMatch)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

