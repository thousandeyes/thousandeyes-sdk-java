/*
 * Tests API
 * This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests. 
 *
 * The version of the OpenAPI document: 7.0.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.tests.model.SipTestProtocol;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TestSipCredentials
 */
@JsonPropertyOrder({
  TestSipCredentials.JSON_PROPERTY_AUTH_USER,
  TestSipCredentials.JSON_PROPERTY_PASSWORD,
  TestSipCredentials.JSON_PROPERTY_PORT,
  TestSipCredentials.JSON_PROPERTY_PROTOCOL,
  TestSipCredentials.JSON_PROPERTY_SIP_REGISTRAR,
  TestSipCredentials.JSON_PROPERTY_USER
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class TestSipCredentials {
  public static final String JSON_PROPERTY_AUTH_USER = "authUser";
  private String authUser;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_PORT = "port";
  private Integer port = 49153;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private SipTestProtocol protocol = SipTestProtocol.TCP;

  public static final String JSON_PROPERTY_SIP_REGISTRAR = "sipRegistrar";
  private String sipRegistrar;

  public static final String JSON_PROPERTY_USER = "user";
  private String user;

  public TestSipCredentials() { 
  }

  public TestSipCredentials authUser(String authUser) {
    this.authUser = authUser;
    return this;
  }

   /**
   * Username for authentication with SIP server.
   * @return authUser
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthUser() {
    return authUser;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthUser(String authUser) {
    this.authUser = authUser;
  }


  public TestSipCredentials password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password for Basic/NTLM authentication.
   * @return password
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(String password) {
    this.password = password;
  }


  public TestSipCredentials port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Target port.
   * minimum: 1
   * maximum: 65535
   * @return port
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getPort() {
    return port;
  }


  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPort(Integer port) {
    this.port = port;
  }


  public TestSipCredentials protocol(SipTestProtocol protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SipTestProtocol getProtocol() {
    return protocol;
  }


  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProtocol(SipTestProtocol protocol) {
    this.protocol = protocol;
  }


  public TestSipCredentials sipRegistrar(String sipRegistrar) {
    this.sipRegistrar = sipRegistrar;
    return this;
  }

   /**
   * SIP server to be tested, specified by domain name or IP address.
   * @return sipRegistrar
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIP_REGISTRAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSipRegistrar() {
    return sipRegistrar;
  }


  @JsonProperty(JSON_PROPERTY_SIP_REGISTRAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSipRegistrar(String sipRegistrar) {
    this.sipRegistrar = sipRegistrar;
  }


  public TestSipCredentials user(String user) {
    this.user = user;
    return this;
  }

   /**
   * Username for SIP registration, should be unique within a ThousandEyes account group.
   * @return user
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUser(String user) {
    this.user = user;
  }


  /**
   * Return true if this TestSipCredentials object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestSipCredentials testSipCredentials = (TestSipCredentials) o;
    return Objects.equals(this.authUser, testSipCredentials.authUser) &&
        Objects.equals(this.password, testSipCredentials.password) &&
        Objects.equals(this.port, testSipCredentials.port) &&
        Objects.equals(this.protocol, testSipCredentials.protocol) &&
        Objects.equals(this.sipRegistrar, testSipCredentials.sipRegistrar) &&
        Objects.equals(this.user, testSipCredentials.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authUser, password, port, protocol, sipRegistrar, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestSipCredentials {\n");
    sb.append("    authUser: ").append(toIndentedString(authUser)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    sipRegistrar: ").append(toIndentedString(sipRegistrar)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

