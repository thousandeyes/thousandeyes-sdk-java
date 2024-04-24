/*
 * Endpoint Agents API
 * Manage ThousandEyes Endpoint Agents using this API.   For more information about Endpoint Agents, see [Endpoint Agents](https://docs.thousandeyes.com/product-documentation/global-vantage-points/endpoint-agents).
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.agents.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.endpoint.agents.model.AgentTransfer;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EndpointAgentBulkTransfer207ResponseItemsInner
 */
@JsonPropertyOrder({
  EndpointAgentBulkTransfer207ResponseItemsInner.JSON_PROPERTY_TYPE,
  EndpointAgentBulkTransfer207ResponseItemsInner.JSON_PROPERTY_TITLE,
  EndpointAgentBulkTransfer207ResponseItemsInner.JSON_PROPERTY_STATUS,
  EndpointAgentBulkTransfer207ResponseItemsInner.JSON_PROPERTY_DETAIL,
  EndpointAgentBulkTransfer207ResponseItemsInner.JSON_PROPERTY_INSTANCE,
  EndpointAgentBulkTransfer207ResponseItemsInner.JSON_PROPERTY_REQUEST
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T10:46:26.016598+01:00[Europe/Lisbon]")
public class EndpointAgentBulkTransfer207ResponseItemsInner {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public static final String JSON_PROPERTY_DETAIL = "detail";
  private String detail;

  public static final String JSON_PROPERTY_INSTANCE = "instance";
  private String instance;

  public static final String JSON_PROPERTY_REQUEST = "request";
  private AgentTransfer request;

  public EndpointAgentBulkTransfer207ResponseItemsInner() { 
  }

  public EndpointAgentBulkTransfer207ResponseItemsInner type(String type) {
    this.type = type;
    return this;
  }

   /**
   * A URI reference that identifies the problem type. When this member is not present, its value is assumed to be \&quot;about:blank\&quot;.
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public EndpointAgentBulkTransfer207ResponseItemsInner title(String title) {
    this.title = title;
    return this;
  }

   /**
   * A short, human-readable summary of the problem type.
   * @return title
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public EndpointAgentBulkTransfer207ResponseItemsInner status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * The HTTP status code generated by the origin server for this occurrence of the problem.
   * @return status
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(Integer status) {
    this.status = status;
  }


  public EndpointAgentBulkTransfer207ResponseItemsInner detail(String detail) {
    this.detail = detail;
    return this;
  }

   /**
   * A human-readable explanation specific to this occurrence of the problem.
   * @return detail
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDetail() {
    return detail;
  }


  @JsonProperty(JSON_PROPERTY_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetail(String detail) {
    this.detail = detail;
  }


  public EndpointAgentBulkTransfer207ResponseItemsInner instance(String instance) {
    this.instance = instance;
    return this;
  }

   /**
   * A URI reference that identifies the specific occurrence of the problem.
   * @return instance
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInstance() {
    return instance;
  }


  @JsonProperty(JSON_PROPERTY_INSTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstance(String instance) {
    this.instance = instance;
  }


  public EndpointAgentBulkTransfer207ResponseItemsInner request(AgentTransfer request) {
    this.request = request;
    return this;
  }

   /**
   * Get request
   * @return request
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AgentTransfer getRequest() {
    return request;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequest(AgentTransfer request) {
    this.request = request;
  }


  /**
   * Return true if this endpoint_agent_bulk_transfer_207_response_items_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointAgentBulkTransfer207ResponseItemsInner endpointAgentBulkTransfer207ResponseItemsInner = (EndpointAgentBulkTransfer207ResponseItemsInner) o;
    return Objects.equals(this.type, endpointAgentBulkTransfer207ResponseItemsInner.type) &&
        Objects.equals(this.title, endpointAgentBulkTransfer207ResponseItemsInner.title) &&
        Objects.equals(this.status, endpointAgentBulkTransfer207ResponseItemsInner.status) &&
        Objects.equals(this.detail, endpointAgentBulkTransfer207ResponseItemsInner.detail) &&
        Objects.equals(this.instance, endpointAgentBulkTransfer207ResponseItemsInner.instance) &&
        Objects.equals(this.request, endpointAgentBulkTransfer207ResponseItemsInner.request);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, status, detail, instance, request);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointAgentBulkTransfer207ResponseItemsInner {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
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

