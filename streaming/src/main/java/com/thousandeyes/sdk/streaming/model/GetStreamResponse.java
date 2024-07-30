/*
 * ThousandEyes for OpenTelemetry API
 * ThousandEyes for OpenTelemetry provides machine-to-machine integration between ThousandEyes and its customers. It allows you to export ThousandEyes telemetry data in OTel format, which is widely used in the industry. With ThousandEyes for OTel, you can leverage frameworks widely used in the observability domain - such as Splunk, Grafana, and Honeycomb - to capture and analyze ThousandEyes data. Any client that supports OTel can use ThousandEyes for OpenTelemetry.  ThousandEyes for OTel is made up of the following components:  * Data streaming APIs that you can use to configure and enable your ThousandEyes tests with OTel-compatible streams, in particular to configure how ThousandEyes telemetry data is exported to client integrations. * A set of streaming pipelines called _collectors_ that actively fetch ThousandEyes network test data, enrich the data with some additional detail, filter, and push the data to the customer-configured endpoints, depending on what you configure via the public APIs. * Third-party OTel collectors that receive, transform, filter, and export different metrics to client applications such as AppD, or any other OTel-capable client configuration.  For more information about ThousandEyes for OpenTelemetry, see the [documentation](https://docs.thousandeyes.com/product-documentation/api/opentelemetry). 
 *
 * The version of the OpenAPI document: 7.0.11
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
import com.thousandeyes.sdk.streaming.model.AuditOperationWithUpdate;
import com.thousandeyes.sdk.streaming.model.EndpointType;
import com.thousandeyes.sdk.streaming.model.StreamLinks;
import com.thousandeyes.sdk.streaming.model.StreamType;
import com.thousandeyes.sdk.streaming.model.TagMatch;
import com.thousandeyes.sdk.streaming.model.TestMatch;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GetStreamResponse
 */
@JsonPropertyOrder({
  GetStreamResponse.JSON_PROPERTY_ID,
  GetStreamResponse.JSON_PROPERTY_ENABLED,
  GetStreamResponse.JSON_PROPERTY_LINKS,
  GetStreamResponse.JSON_PROPERTY_TYPE,
  GetStreamResponse.JSON_PROPERTY_ENDPOINT_TYPE,
  GetStreamResponse.JSON_PROPERTY_STREAM_ENDPOINT_URL,
  GetStreamResponse.JSON_PROPERTY_CUSTOM_HEADERS,
  GetStreamResponse.JSON_PROPERTY_TAG_MATCH,
  GetStreamResponse.JSON_PROPERTY_TEST_MATCH,
  GetStreamResponse.JSON_PROPERTY_AUDIT_OPERATION
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class GetStreamResponse {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private StreamLinks links;

  public static final String JSON_PROPERTY_TYPE = "type";
  private StreamType type;

  public static final String JSON_PROPERTY_ENDPOINT_TYPE = "endpointType";
  private EndpointType endpointType = EndpointType.GRPC;

  public static final String JSON_PROPERTY_STREAM_ENDPOINT_URL = "streamEndpointUrl";
  private String streamEndpointUrl;

  public static final String JSON_PROPERTY_CUSTOM_HEADERS = "customHeaders";
  private Map<String, String> customHeaders = new HashMap<>();

  public static final String JSON_PROPERTY_TAG_MATCH = "tagMatch";
  private List<TagMatch> tagMatch = new ArrayList<>();

  public static final String JSON_PROPERTY_TEST_MATCH = "testMatch";
  private List<TestMatch> testMatch = new ArrayList<>();

  public static final String JSON_PROPERTY_AUDIT_OPERATION = "auditOperation";
  private AuditOperationWithUpdate auditOperation;

  public GetStreamResponse() { 
  }

  @JsonCreator
  public GetStreamResponse(
    @JsonProperty(JSON_PROPERTY_ID) String id
  ) {
  this();
    this.id = id;
  }

   /**
   * The data stream ID
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




  public GetStreamResponse enabled(Boolean enabled) {
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


  public GetStreamResponse links(StreamLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StreamLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(StreamLinks links) {
    this.links = links;
  }


  public GetStreamResponse type(StreamType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StreamType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(StreamType type) {
    this.type = type;
  }


  public GetStreamResponse endpointType(EndpointType endpointType) {
    this.endpointType = endpointType;
    return this;
  }

   /**
   * Get endpointType
   * @return endpointType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDPOINT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EndpointType getEndpointType() {
    return endpointType;
  }


  @JsonProperty(JSON_PROPERTY_ENDPOINT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndpointType(EndpointType endpointType) {
    this.endpointType = endpointType;
  }


  public GetStreamResponse streamEndpointUrl(String streamEndpointUrl) {
    this.streamEndpointUrl = streamEndpointUrl;
    return this;
  }

   /**
   * The URL ThousandEyes sends data stream to. For a URL to be valid, it needs to: - Be syntactically correct. - Be reachable. - Use the HTTPS protocol. - When using the &#x60;grpc&#x60; endpointType, streamEndpointUrl cannot contain paths:     - Valid . &#x60;grpc&#x60; - &#x60;https://example.com&#x60;     - Invalid . &#x60;grpc&#x60; - &#x60;https://example.com/collector&#x60;.     - Valid . &#x60;http&#x60; - &#x60;https://example.com/collector&#x60;.      - When using the &#x60;http&#x60; endpointType, the endpoint must match the exact final full URL (including the path if there is one) to which the metrics will be sent. Examples below:     - &#x60;https://api.honeycomb.io:443/v1/metrics&#x60;     - &#x60;https://ingest.eu0.signalfx.com/v2/datapoint/otlp&#x60;
   * @return streamEndpointUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STREAM_ENDPOINT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreamEndpointUrl() {
    return streamEndpointUrl;
  }


  @JsonProperty(JSON_PROPERTY_STREAM_ENDPOINT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreamEndpointUrl(String streamEndpointUrl) {
    this.streamEndpointUrl = streamEndpointUrl;
  }


  public GetStreamResponse customHeaders(Map<String, String> customHeaders) {
    this.customHeaders = customHeaders;
    return this;
  }

  public GetStreamResponse putCustomHeadersItem(String key, String customHeadersItem) {
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


  public GetStreamResponse tagMatch(List<TagMatch> tagMatch) {
    this.tagMatch = tagMatch;
    return this;
  }

  public GetStreamResponse addTagMatchItem(TagMatch tagMatchItem) {
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


  public GetStreamResponse testMatch(List<TestMatch> testMatch) {
    this.testMatch = testMatch;
    return this;
  }

  public GetStreamResponse addTestMatchItem(TestMatch testMatchItem) {
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


  public GetStreamResponse auditOperation(AuditOperationWithUpdate auditOperation) {
    this.auditOperation = auditOperation;
    return this;
  }

   /**
   * Get auditOperation
   * @return auditOperation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIT_OPERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AuditOperationWithUpdate getAuditOperation() {
    return auditOperation;
  }


  @JsonProperty(JSON_PROPERTY_AUDIT_OPERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuditOperation(AuditOperationWithUpdate auditOperation) {
    this.auditOperation = auditOperation;
  }


  /**
   * Return true if this GetStreamResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStreamResponse getStreamResponse = (GetStreamResponse) o;
    return Objects.equals(this.id, getStreamResponse.id) &&
        Objects.equals(this.enabled, getStreamResponse.enabled) &&
        Objects.equals(this.links, getStreamResponse.links) &&
        Objects.equals(this.type, getStreamResponse.type) &&
        Objects.equals(this.endpointType, getStreamResponse.endpointType) &&
        Objects.equals(this.streamEndpointUrl, getStreamResponse.streamEndpointUrl) &&
        Objects.equals(this.customHeaders, getStreamResponse.customHeaders) &&
        Objects.equals(this.tagMatch, getStreamResponse.tagMatch) &&
        Objects.equals(this.testMatch, getStreamResponse.testMatch) &&
        Objects.equals(this.auditOperation, getStreamResponse.auditOperation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, enabled, links, type, endpointType, streamEndpointUrl, customHeaders, tagMatch, testMatch, auditOperation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStreamResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    endpointType: ").append(toIndentedString(endpointType)).append("\n");
    sb.append("    streamEndpointUrl: ").append(toIndentedString(streamEndpointUrl)).append("\n");
    sb.append("    customHeaders: ").append(toIndentedString(customHeaders)).append("\n");
    sb.append("    tagMatch: ").append(toIndentedString(tagMatch)).append("\n");
    sb.append("    testMatch: ").append(toIndentedString(testMatch)).append("\n");
    sb.append("    auditOperation: ").append(toIndentedString(auditOperation)).append("\n");
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
