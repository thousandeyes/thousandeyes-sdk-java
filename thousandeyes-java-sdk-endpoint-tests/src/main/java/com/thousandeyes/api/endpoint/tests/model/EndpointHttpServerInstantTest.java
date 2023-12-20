/*
 * Endpoint Tests API
 *  ## Overview Manage endpoint agent dynamic and scheduled tests using the Endpoint Tests API.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.tests.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.endpoint.tests.model.EndpointTestAgentSelectorType;
import com.thousandeyes.api.endpoint.tests.model.EndpointTestAuthType;
import com.thousandeyes.api.endpoint.tests.model.EndpointTestProtocol;
import com.thousandeyes.api.endpoint.tests.model.TestProbeMode;
import com.thousandeyes.api.endpoint.tests.model.TestSslVersionId;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.thousandeyes.api.endpoint.JSON;

/**
 * EndpointHttpServerInstantTest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T12:21:05.597581Z[Europe/Lisbon]")
public class EndpointHttpServerInstantTest {
  public static final String SERIALIZED_NAME_AGENT_SELECTOR_TYPE = "agentSelectorType";
  @SerializedName(SERIALIZED_NAME_AGENT_SELECTOR_TYPE)
  private EndpointTestAgentSelectorType agentSelectorType;

  public static final String SERIALIZED_NAME_AGENTS = "agents";
  @SerializedName(SERIALIZED_NAME_AGENTS)
  private List<UUID> agents;

  public static final String SERIALIZED_NAME_HAS_PING = "hasPing";
  @SerializedName(SERIALIZED_NAME_HAS_PING)
  private Boolean hasPing = true;

  public static final String SERIALIZED_NAME_HAS_TRACEROUTE = "hasTraceroute";
  @SerializedName(SERIALIZED_NAME_HAS_TRACEROUTE)
  private Boolean hasTraceroute = true;

  public static final String SERIALIZED_NAME_ENDPOINT_AGENT_LABELS = "endpointAgentLabels";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_AGENT_LABELS)
  private List<String> endpointAgentLabels;

  public static final String SERIALIZED_NAME_MAX_MACHINES = "maxMachines";
  @SerializedName(SERIALIZED_NAME_MAX_MACHINES)
  private Integer maxMachines;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_TEST_NAME = "testName";
  @SerializedName(SERIALIZED_NAME_TEST_NAME)
  private String testName;

  public static final String SERIALIZED_NAME_AUTH_TYPE = "authType";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  private EndpointTestAuthType authType = EndpointTestAuthType.NONE;

  public static final String SERIALIZED_NAME_HAS_PATH_TRACE_IN_SESSION = "hasPathTraceInSession";
  @SerializedName(SERIALIZED_NAME_HAS_PATH_TRACE_IN_SESSION)
  private Boolean hasPathTraceInSession;

  public static final String SERIALIZED_NAME_HTTP_TIME_LIMIT = "httpTimeLimit";
  @SerializedName(SERIALIZED_NAME_HTTP_TIME_LIMIT)
  private Integer httpTimeLimit;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private EndpointTestProtocol protocol = EndpointTestProtocol.ICMP;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_SSL_VERSION_ID = "sslVersionId";
  @SerializedName(SERIALIZED_NAME_SSL_VERSION_ID)
  private TestSslVersionId sslVersionId;

  public static final String SERIALIZED_NAME_TCP_PROBE_MODE = "tcpProbeMode";
  @SerializedName(SERIALIZED_NAME_TCP_PROBE_MODE)
  private TestProbeMode tcpProbeMode = TestProbeMode.AUTO;

  public static final String SERIALIZED_NAME_VERIFY_CERTIFICATE = "verifyCertificate";
  @SerializedName(SERIALIZED_NAME_VERIFY_CERTIFICATE)
  private Boolean verifyCertificate;

  public static final String SERIALIZED_NAME_TARGET_RESPONSE_TIME = "targetResponseTime";
  @SerializedName(SERIALIZED_NAME_TARGET_RESPONSE_TIME)
  private Integer targetResponseTime;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public EndpointHttpServerInstantTest() {
  }

  public EndpointHttpServerInstantTest agentSelectorType(EndpointTestAgentSelectorType agentSelectorType) {
    
    this.agentSelectorType = agentSelectorType;
    return this;
  }

   /**
   * Get agentSelectorType
   * @return agentSelectorType
  **/
  @javax.annotation.Nonnull
  public EndpointTestAgentSelectorType getAgentSelectorType() {
    return agentSelectorType;
  }


  public void setAgentSelectorType(EndpointTestAgentSelectorType agentSelectorType) {
    this.agentSelectorType = agentSelectorType;
  }


  public EndpointHttpServerInstantTest agents(List<UUID> agents) {
    
    this.agents = agents;
    return this;
  }

  public EndpointHttpServerInstantTest addAgentsItem(UUID agentsItem) {
    if (this.agents == null) {
      this.agents = new ArrayList<>();
    }
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * List of endpoint agent IDs (obtained from &#x60;/endpoint/agents&#x60; endpoint). Required when &#x60;agentSelectorType&#x60; is set to &#x60;specific-agent&#x60;.
   * @return agents
  **/
  @javax.annotation.Nullable
  public List<UUID> getAgents() {
    return agents;
  }


  public void setAgents(List<UUID> agents) {
    this.agents = agents;
  }


  public EndpointHttpServerInstantTest hasPing(Boolean hasPing) {
    
    this.hasPing = hasPing;
    return this;
  }

   /**
   * Optional flag indicating if the test should run ping.
   * @return hasPing
  **/
  @javax.annotation.Nullable
  public Boolean getHasPing() {
    return hasPing;
  }


  public void setHasPing(Boolean hasPing) {
    this.hasPing = hasPing;
  }


  public EndpointHttpServerInstantTest hasTraceroute(Boolean hasTraceroute) {
    
    this.hasTraceroute = hasTraceroute;
    return this;
  }

   /**
   * Optional flag indicating if the test should run traceroute.
   * @return hasTraceroute
  **/
  @javax.annotation.Nullable
  public Boolean getHasTraceroute() {
    return hasTraceroute;
  }


  public void setHasTraceroute(Boolean hasTraceroute) {
    this.hasTraceroute = hasTraceroute;
  }


  public EndpointHttpServerInstantTest endpointAgentLabels(List<String> endpointAgentLabels) {
    
    this.endpointAgentLabels = endpointAgentLabels;
    return this;
  }

  public EndpointHttpServerInstantTest addEndpointAgentLabelsItem(String endpointAgentLabelsItem) {
    if (this.endpointAgentLabels == null) {
      this.endpointAgentLabels = new ArrayList<>();
    }
    this.endpointAgentLabels.add(endpointAgentLabelsItem);
    return this;
  }

   /**
   * List of endpoint agent label IDs (obtained from &#x60;/endpoint/labels&#x60; endpoint), required when &#x60;agentSelectorType&#x60; is set to &#x60;agent-labels&#x60;.
   * @return endpointAgentLabels
  **/
  @javax.annotation.Nullable
  public List<String> getEndpointAgentLabels() {
    return endpointAgentLabels;
  }


  public void setEndpointAgentLabels(List<String> endpointAgentLabels) {
    this.endpointAgentLabels = endpointAgentLabels;
  }


  public EndpointHttpServerInstantTest maxMachines(Integer maxMachines) {
    
    this.maxMachines = maxMachines;
    return this;
  }

   /**
   * Maximum number of agents which can execute the test.
   * minimum: 1
   * maximum: 5000
   * @return maxMachines
  **/
  @javax.annotation.Nonnull
  public Integer getMaxMachines() {
    return maxMachines;
  }


  public void setMaxMachines(Integer maxMachines) {
    this.maxMachines = maxMachines;
  }


  public EndpointHttpServerInstantTest port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * Port number, if not specified, the port is selected based on a protocol (HTTP 80, HTTPS 443).
   * @return port
  **/
  @javax.annotation.Nullable
  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  public EndpointHttpServerInstantTest testName(String testName) {
    
    this.testName = testName;
    return this;
  }

   /**
   * Name of the test.
   * @return testName
  **/
  @javax.annotation.Nonnull
  public String getTestName() {
    return testName;
  }


  public void setTestName(String testName) {
    this.testName = testName;
  }


  public EndpointHttpServerInstantTest authType(EndpointTestAuthType authType) {
    
    this.authType = authType;
    return this;
  }

   /**
   * Get authType
   * @return authType
  **/
  @javax.annotation.Nullable
  public EndpointTestAuthType getAuthType() {
    return authType;
  }


  public void setAuthType(EndpointTestAuthType authType) {
    this.authType = authType;
  }


  public EndpointHttpServerInstantTest hasPathTraceInSession(Boolean hasPathTraceInSession) {
    
    this.hasPathTraceInSession = hasPathTraceInSession;
    return this;
  }

   /**
   * Enables \&quot;in session\&quot; path trace. When enabled, this option initiates a TCP session with the target server and sends path trace packets within the established TCP session.
   * @return hasPathTraceInSession
  **/
  @javax.annotation.Nullable
  public Boolean getHasPathTraceInSession() {
    return hasPathTraceInSession;
  }


  public void setHasPathTraceInSession(Boolean hasPathTraceInSession) {
    this.hasPathTraceInSession = hasPathTraceInSession;
  }


  public EndpointHttpServerInstantTest httpTimeLimit(Integer httpTimeLimit) {
    
    this.httpTimeLimit = httpTimeLimit;
    return this;
  }

   /**
   * Maximum amount of time in milliseconds the agents wait before a request times out.
   * @return httpTimeLimit
  **/
  @javax.annotation.Nonnull
  public Integer getHttpTimeLimit() {
    return httpTimeLimit;
  }


  public void setHttpTimeLimit(Integer httpTimeLimit) {
    this.httpTimeLimit = httpTimeLimit;
  }


  public EndpointHttpServerInstantTest protocol(EndpointTestProtocol protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @javax.annotation.Nullable
  public EndpointTestProtocol getProtocol() {
    return protocol;
  }


  public void setProtocol(EndpointTestProtocol protocol) {
    this.protocol = protocol;
  }


  public EndpointHttpServerInstantTest url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Test target URL. Optionally, you can specify a protocol (http or https). If no protocol is provided, the default &#x60;https&#x60; protocol is used.
   * @return url
  **/
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public EndpointHttpServerInstantTest username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Username for Basic/NTLM authentication.
   * @return username
  **/
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public EndpointHttpServerInstantTest sslVersionId(TestSslVersionId sslVersionId) {
    
    this.sslVersionId = sslVersionId;
    return this;
  }

   /**
   * Get sslVersionId
   * @return sslVersionId
  **/
  @javax.annotation.Nonnull
  public TestSslVersionId getSslVersionId() {
    return sslVersionId;
  }


  public void setSslVersionId(TestSslVersionId sslVersionId) {
    this.sslVersionId = sslVersionId;
  }


  public EndpointHttpServerInstantTest tcpProbeMode(TestProbeMode tcpProbeMode) {
    
    this.tcpProbeMode = tcpProbeMode;
    return this;
  }

   /**
   * Get tcpProbeMode
   * @return tcpProbeMode
  **/
  @javax.annotation.Nullable
  public TestProbeMode getTcpProbeMode() {
    return tcpProbeMode;
  }


  public void setTcpProbeMode(TestProbeMode tcpProbeMode) {
    this.tcpProbeMode = tcpProbeMode;
  }


  public EndpointHttpServerInstantTest verifyCertificate(Boolean verifyCertificate) {
    
    this.verifyCertificate = verifyCertificate;
    return this;
  }

   /**
   * Flag indicating if a certificate should be verified.
   * @return verifyCertificate
  **/
  @javax.annotation.Nonnull
  public Boolean getVerifyCertificate() {
    return verifyCertificate;
  }


  public void setVerifyCertificate(Boolean verifyCertificate) {
    this.verifyCertificate = verifyCertificate;
  }


  public EndpointHttpServerInstantTest targetResponseTime(Integer targetResponseTime) {
    
    this.targetResponseTime = targetResponseTime;
    return this;
  }

   /**
   * Response time target in milliseconds. Affects the colors of agents and legends on the view page. The value is compared with actual response time in order to determine the color scale (from green to red).
   * @return targetResponseTime
  **/
  @javax.annotation.Nonnull
  public Integer getTargetResponseTime() {
    return targetResponseTime;
  }


  public void setTargetResponseTime(Integer targetResponseTime) {
    this.targetResponseTime = targetResponseTime;
  }


  public EndpointHttpServerInstantTest password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Password for Basic/NTLM authentication.
   * @return password
  **/
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointHttpServerInstantTest endpointHttpServerInstantTest = (EndpointHttpServerInstantTest) o;
    return Objects.equals(this.agentSelectorType, endpointHttpServerInstantTest.agentSelectorType) &&
        Objects.equals(this.agents, endpointHttpServerInstantTest.agents) &&
        Objects.equals(this.hasPing, endpointHttpServerInstantTest.hasPing) &&
        Objects.equals(this.hasTraceroute, endpointHttpServerInstantTest.hasTraceroute) &&
        Objects.equals(this.endpointAgentLabels, endpointHttpServerInstantTest.endpointAgentLabels) &&
        Objects.equals(this.maxMachines, endpointHttpServerInstantTest.maxMachines) &&
        Objects.equals(this.port, endpointHttpServerInstantTest.port) &&
        Objects.equals(this.testName, endpointHttpServerInstantTest.testName) &&
        Objects.equals(this.authType, endpointHttpServerInstantTest.authType) &&
        Objects.equals(this.hasPathTraceInSession, endpointHttpServerInstantTest.hasPathTraceInSession) &&
        Objects.equals(this.httpTimeLimit, endpointHttpServerInstantTest.httpTimeLimit) &&
        Objects.equals(this.protocol, endpointHttpServerInstantTest.protocol) &&
        Objects.equals(this.url, endpointHttpServerInstantTest.url) &&
        Objects.equals(this.username, endpointHttpServerInstantTest.username) &&
        Objects.equals(this.sslVersionId, endpointHttpServerInstantTest.sslVersionId) &&
        Objects.equals(this.tcpProbeMode, endpointHttpServerInstantTest.tcpProbeMode) &&
        Objects.equals(this.verifyCertificate, endpointHttpServerInstantTest.verifyCertificate) &&
        Objects.equals(this.targetResponseTime, endpointHttpServerInstantTest.targetResponseTime) &&
        Objects.equals(this.password, endpointHttpServerInstantTest.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentSelectorType, agents, hasPing, hasTraceroute, endpointAgentLabels, maxMachines, port, testName, authType, hasPathTraceInSession, httpTimeLimit, protocol, url, username, sslVersionId, tcpProbeMode, verifyCertificate, targetResponseTime, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointHttpServerInstantTest {\n");
    sb.append("    agentSelectorType: ").append(toIndentedString(agentSelectorType)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    hasPing: ").append(toIndentedString(hasPing)).append("\n");
    sb.append("    hasTraceroute: ").append(toIndentedString(hasTraceroute)).append("\n");
    sb.append("    endpointAgentLabels: ").append(toIndentedString(endpointAgentLabels)).append("\n");
    sb.append("    maxMachines: ").append(toIndentedString(maxMachines)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    hasPathTraceInSession: ").append(toIndentedString(hasPathTraceInSession)).append("\n");
    sb.append("    httpTimeLimit: ").append(toIndentedString(httpTimeLimit)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    sslVersionId: ").append(toIndentedString(sslVersionId)).append("\n");
    sb.append("    tcpProbeMode: ").append(toIndentedString(tcpProbeMode)).append("\n");
    sb.append("    verifyCertificate: ").append(toIndentedString(verifyCertificate)).append("\n");
    sb.append("    targetResponseTime: ").append(toIndentedString(targetResponseTime)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("agentSelectorType");
    openapiFields.add("agents");
    openapiFields.add("hasPing");
    openapiFields.add("hasTraceroute");
    openapiFields.add("endpointAgentLabels");
    openapiFields.add("maxMachines");
    openapiFields.add("port");
    openapiFields.add("testName");
    openapiFields.add("authType");
    openapiFields.add("hasPathTraceInSession");
    openapiFields.add("httpTimeLimit");
    openapiFields.add("protocol");
    openapiFields.add("url");
    openapiFields.add("username");
    openapiFields.add("sslVersionId");
    openapiFields.add("tcpProbeMode");
    openapiFields.add("verifyCertificate");
    openapiFields.add("targetResponseTime");
    openapiFields.add("password");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("agentSelectorType");
    openapiRequiredFields.add("maxMachines");
    openapiRequiredFields.add("testName");
    openapiRequiredFields.add("httpTimeLimit");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("sslVersionId");
    openapiRequiredFields.add("verifyCertificate");
    openapiRequiredFields.add("targetResponseTime");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EndpointHttpServerInstantTest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EndpointHttpServerInstantTest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EndpointHttpServerInstantTest is not found in the empty JSON string", EndpointHttpServerInstantTest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EndpointHttpServerInstantTest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EndpointHttpServerInstantTest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EndpointHttpServerInstantTest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `agentSelectorType`
      EndpointTestAgentSelectorType.validateJsonElement(jsonObj.get("agentSelectorType"));
      // ensure the optional json data is an array if present
      if (jsonObj.get("agents") != null && !jsonObj.get("agents").isJsonNull() && !jsonObj.get("agents").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `agents` to be an array in the JSON string but got `%s`", jsonObj.get("agents").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("endpointAgentLabels") != null && !jsonObj.get("endpointAgentLabels").isJsonNull() && !jsonObj.get("endpointAgentLabels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `endpointAgentLabels` to be an array in the JSON string but got `%s`", jsonObj.get("endpointAgentLabels").toString()));
      }
      if (!jsonObj.get("testName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testName").toString()));
      }
      // validate the optional field `authType`
      if (jsonObj.get("authType") != null && !jsonObj.get("authType").isJsonNull()) {
        EndpointTestAuthType.validateJsonElement(jsonObj.get("authType"));
      }
      // validate the optional field `protocol`
      if (jsonObj.get("protocol") != null && !jsonObj.get("protocol").isJsonNull()) {
        EndpointTestProtocol.validateJsonElement(jsonObj.get("protocol"));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      // validate the required field `sslVersionId`
      TestSslVersionId.validateJsonElement(jsonObj.get("sslVersionId"));
      // validate the optional field `tcpProbeMode`
      if (jsonObj.get("tcpProbeMode") != null && !jsonObj.get("tcpProbeMode").isJsonNull()) {
        TestProbeMode.validateJsonElement(jsonObj.get("tcpProbeMode"));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EndpointHttpServerInstantTest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EndpointHttpServerInstantTest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EndpointHttpServerInstantTest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EndpointHttpServerInstantTest.class));

       return (TypeAdapter<T>) new TypeAdapter<EndpointHttpServerInstantTest>() {
           @Override
           public void write(JsonWriter out, EndpointHttpServerInstantTest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EndpointHttpServerInstantTest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EndpointHttpServerInstantTest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EndpointHttpServerInstantTest
  * @throws IOException if the JSON string is invalid with respect to EndpointHttpServerInstantTest
  */
  public static EndpointHttpServerInstantTest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EndpointHttpServerInstantTest.class);
  }

 /**
  * Convert an instance of EndpointHttpServerInstantTest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

