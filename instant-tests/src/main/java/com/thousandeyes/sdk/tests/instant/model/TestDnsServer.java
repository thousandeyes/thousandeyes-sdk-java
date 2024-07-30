/*
 * Instant Tests API
 * The Instant Tests API endpoint lets you create and run new instant tests. You will need to be a regular user or have the following permissions:   * `API Access`   * `View tests`  The response does not include the immediate test results. Use the Test Results endpoints to get test results after creating and executing an instant test. You can find the URLs for these endpoints in the _links section of the test definition that is returned when you create the instant test. 
 *
 * The version of the OpenAPI document: 7.0.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests.instant.model;

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
 * TestDnsServer
 */
@JsonPropertyOrder({
  TestDnsServer.JSON_PROPERTY_SERVER_ID,
  TestDnsServer.JSON_PROPERTY_SERVER_NAME
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class TestDnsServer {
  public static final String JSON_PROPERTY_SERVER_ID = "serverId";
  private String serverId;

  public static final String JSON_PROPERTY_SERVER_NAME = "serverName";
  private String serverName;

  public TestDnsServer() { 
  }

  public TestDnsServer serverId(String serverId) {
    this.serverId = serverId;
    return this;
  }

   /**
   * Unique identifier of the DNS server.
   * @return serverId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServerId() {
    return serverId;
  }


  @JsonProperty(JSON_PROPERTY_SERVER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServerId(String serverId) {
    this.serverId = serverId;
  }


  public TestDnsServer serverName(String serverName) {
    this.serverName = serverName;
    return this;
  }

   /**
   * Fully qualified domain name (FQDN) of DNS server.
   * @return serverName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServerName() {
    return serverName;
  }


  @JsonProperty(JSON_PROPERTY_SERVER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServerName(String serverName) {
    this.serverName = serverName;
  }


  /**
   * Return true if this TestDnsServer object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestDnsServer testDnsServer = (TestDnsServer) o;
    return Objects.equals(this.serverId, testDnsServer.serverId) &&
        Objects.equals(this.serverName, testDnsServer.serverName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverId, serverName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestDnsServer {\n");
    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
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

