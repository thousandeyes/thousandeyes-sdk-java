/*
 * ThousandEyes for OpenTelemetry API
 * ThousandEyes for OpenTelemetry provides machine-to-machine integration between ThousandEyes and its customers. It allows you to export ThousandEyes telemetry data in OTel format, which is widely used in the industry. With ThousandEyes for OTel, you can leverage frameworks widely used in the observability domain - such as Splunk, Grafana, and Honeycomb - to capture and analyze ThousandEyes data. Any client that supports OTel can use ThousandEyes for OpenTelemetry.  ThousandEyes for OTel is made up of the following components:  * Data streaming APIs that you can use to configure and enable your ThousandEyes tests with OTel-compatible streams, in particular to configure how ThousandEyes telemetry data is exported to client integrations. * A set of streaming pipelines called _collectors_ that actively fetch ThousandEyes network test data, enrich the data with some additional detail, filter, and push the data to the customer-configured endpoints, depending on what you configure via the public APIs. * Third-party OTel collectors that receive, transform, filter, and export different metrics to client applications such as AppD, or any other OTel-capable client configuration.  For more information about ThousandEyes for OpenTelemetry, see the [documentation](https://docs.thousandeyes.com/product-documentation/api/opentelemetry). 
 *
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Splunk HEC configuration. This can only be configured when the &#x60;type&#x60; is &#x60;splunk-hec&#x60;.
 */
@JsonPropertyOrder({
  ExporterConfigSplunkHec.JSON_PROPERTY_TOKEN,
  ExporterConfigSplunkHec.JSON_PROPERTY_SOURCE,
  ExporterConfigSplunkHec.JSON_PROPERTY_SOURCE_TYPE,
  ExporterConfigSplunkHec.JSON_PROPERTY_INDEX
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ExporterConfigSplunkHec {
  public static final String JSON_PROPERTY_TOKEN = "token";
  private String token;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source = "ThousandEyesOTel";

  public static final String JSON_PROPERTY_SOURCE_TYPE = "sourceType";
  private String sourceType = "ThousandEyesOTel";

  public static final String JSON_PROPERTY_INDEX = "index";
  private String index;

  public ExporterConfigSplunkHec() { 
  }

  public ExporterConfigSplunkHec token(String token) {
    this.token = token;
    return this;
  }

   /**
   * The Splunk HEC &#x60;token&#x60;. This is a required field.
   * @return token
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getToken() {
    return token;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToken(String token) {
    this.token = token;
  }


  public ExporterConfigSplunkHec source(String source) {
    this.source = source;
    return this;
  }

   /**
   * The Splunk HEC &#x60;source&#x60;. This field is optional.
   * @return source
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSource(String source) {
    this.source = source;
  }


  public ExporterConfigSplunkHec sourceType(String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * The Splunk HEC &#x60;sourceType&#x60;. This field is optional.
   * @return sourceType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceType() {
    return sourceType;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }


  public ExporterConfigSplunkHec index(String index) {
    this.index = index;
    return this;
  }

   /**
   * The name of the Splunk HEC index where the event data will be stored.  This field is optional.
   * @return index
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIndex() {
    return index;
  }


  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndex(String index) {
    this.index = index;
  }


  /**
   * Return true if this ExporterConfigSplunkHec object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExporterConfigSplunkHec exporterConfigSplunkHec = (ExporterConfigSplunkHec) o;
    return Objects.equals(this.token, exporterConfigSplunkHec.token) &&
        Objects.equals(this.source, exporterConfigSplunkHec.source) &&
        Objects.equals(this.sourceType, exporterConfigSplunkHec.sourceType) &&
        Objects.equals(this.index, exporterConfigSplunkHec.index);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, source, sourceType, index);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExporterConfigSplunkHec {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

