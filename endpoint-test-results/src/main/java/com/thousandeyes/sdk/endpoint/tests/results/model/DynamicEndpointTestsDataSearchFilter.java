/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DynamicEndpointTestsDataSearchFilter
 */
@JsonPropertyOrder({
  DynamicEndpointTestsDataSearchFilter.JSON_PROPERTY_AGENT_ID,
  DynamicEndpointTestsDataSearchFilter.JSON_PROPERTY_WEBEX_CONFERENCE_ID
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class DynamicEndpointTestsDataSearchFilter {
  public static final String JSON_PROPERTY_AGENT_ID = "agentId";
  private List<UUID> agentId = new ArrayList<>();

  public static final String JSON_PROPERTY_WEBEX_CONFERENCE_ID = "webexConferenceId";
  private List<UUID> webexConferenceId = new ArrayList<>();

  public DynamicEndpointTestsDataSearchFilter() { 
  }

  public DynamicEndpointTestsDataSearchFilter agentId(List<UUID> agentId) {
    this.agentId = agentId;
    return this;
  }

  public DynamicEndpointTestsDataSearchFilter addAgentIdItem(UUID agentIdItem) {
    if (this.agentId == null) {
      this.agentId = new ArrayList<>();
    }
    this.agentId.add(agentIdItem);
    return this;
  }

   /**
   * Filter using the &#x60;agent-id&#x60;.
   * @return agentId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UUID> getAgentId() {
    return agentId;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentId(List<UUID> agentId) {
    this.agentId = agentId;
  }


  public DynamicEndpointTestsDataSearchFilter webexConferenceId(List<UUID> webexConferenceId) {
    this.webexConferenceId = webexConferenceId;
    return this;
  }

  public DynamicEndpointTestsDataSearchFilter addWebexConferenceIdItem(UUID webexConferenceIdItem) {
    if (this.webexConferenceId == null) {
      this.webexConferenceId = new ArrayList<>();
    }
    this.webexConferenceId.add(webexConferenceIdItem);
    return this;
  }

   /**
   * Filter using the &#x60;conference-id&#x60; of the webex call.
   * @return webexConferenceId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEBEX_CONFERENCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UUID> getWebexConferenceId() {
    return webexConferenceId;
  }


  @JsonProperty(JSON_PROPERTY_WEBEX_CONFERENCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebexConferenceId(List<UUID> webexConferenceId) {
    this.webexConferenceId = webexConferenceId;
  }


  /**
   * Return true if this DynamicEndpointTestsDataSearchFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicEndpointTestsDataSearchFilter dynamicEndpointTestsDataSearchFilter = (DynamicEndpointTestsDataSearchFilter) o;
    return Objects.equals(this.agentId, dynamicEndpointTestsDataSearchFilter.agentId) &&
        Objects.equals(this.webexConferenceId, dynamicEndpointTestsDataSearchFilter.webexConferenceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, webexConferenceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicEndpointTestsDataSearchFilter {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    webexConferenceId: ").append(toIndentedString(webexConferenceId)).append("\n");
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

