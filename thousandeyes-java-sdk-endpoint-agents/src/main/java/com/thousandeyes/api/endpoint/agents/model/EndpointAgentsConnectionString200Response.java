/*
 * Endpoint Agents API
 * Manage ThousandEyes Endpoint Agents using this API.
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
import com.thousandeyes.api.endpoint.agents.model.SelfLinksLinks;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EndpointAgentsConnectionString200Response
 */
@JsonPropertyOrder({
  EndpointAgentsConnectionString200Response.JSON_PROPERTY_LINKS,
  EndpointAgentsConnectionString200Response.JSON_PROPERTY_CONNECTION_STRING
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-02-07T22:58:17.779627Z[Europe/Lisbon]")
public class EndpointAgentsConnectionString200Response {
  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinksLinks links;

  public static final String JSON_PROPERTY_CONNECTION_STRING = "connectionString";
  private String connectionString;

  public EndpointAgentsConnectionString200Response() { 
  }

  public EndpointAgentsConnectionString200Response links(SelfLinksLinks links) {
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

  public SelfLinksLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(SelfLinksLinks links) {
    this.links = links;
  }


  public EndpointAgentsConnectionString200Response connectionString(String connectionString) {
    this.connectionString = connectionString;
    return this;
  }

   /**
   * The connection string is used for some integrations and other client types. 
   * @return connectionString
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECTION_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectionString() {
    return connectionString;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectionString(String connectionString) {
    this.connectionString = connectionString;
  }


  /**
   * Return true if this endpoint_agents_connection_string_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointAgentsConnectionString200Response endpointAgentsConnectionString200Response = (EndpointAgentsConnectionString200Response) o;
    return Objects.equals(this.links, endpointAgentsConnectionString200Response.links) &&
        Objects.equals(this.connectionString, endpointAgentsConnectionString200Response.connectionString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, connectionString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointAgentsConnectionString200Response {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    connectionString: ").append(toIndentedString(connectionString)).append("\n");
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
