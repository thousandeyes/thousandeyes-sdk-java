/*
 * Agents API
 *  ## Overview Manage all agents available to your account in ThousandEyes, including both Cloud and Enterprise Agents.
 *
 * The version of the OpenAPI document: 7.0.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.agents.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.agents.model.AccountGroup;
import com.thousandeyes.sdk.agents.model.Agent;
import com.thousandeyes.sdk.agents.model.CloudEnterpriseAgentType;
import com.thousandeyes.sdk.agents.model.ClusterMember;
import com.thousandeyes.sdk.agents.model.EnterpriseAgent;
import com.thousandeyes.sdk.agents.model.EnterpriseAgentIpv6Policy;
import com.thousandeyes.sdk.agents.model.EnterpriseAgentState;
import com.thousandeyes.sdk.agents.model.ErrorDetail;
import com.thousandeyes.sdk.agents.model.InterfaceIpMapping;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.thousandeyes.sdk.serialization.JSON;
import com.thousandeyes.sdk.serialization.AbstractOpenApiSchema;

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
@JsonDeserialize(using=CloudEnterpriseAgent.CloudEnterpriseAgentDeserializer.class)
@JsonSerialize(using = CloudEnterpriseAgent.CloudEnterpriseAgentSerializer.class)
public class CloudEnterpriseAgent extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CloudEnterpriseAgent.class.getName());

    public static class CloudEnterpriseAgentSerializer extends StdSerializer<CloudEnterpriseAgent> {
        public CloudEnterpriseAgentSerializer(Class<CloudEnterpriseAgent> t) {
            super(t);
        }

        public CloudEnterpriseAgentSerializer() {
            this(null);
        }

        @Override
        public void serialize(CloudEnterpriseAgent value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class CloudEnterpriseAgentDeserializer extends StdDeserializer<CloudEnterpriseAgent> {
        public CloudEnterpriseAgentDeserializer() {
            this(CloudEnterpriseAgent.class);
        }

        public CloudEnterpriseAgentDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public CloudEnterpriseAgent deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();

            Object deserialized = null;
            // deserialize Agent
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(Agent.class);
                CloudEnterpriseAgent ret = new CloudEnterpriseAgent();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                // deserialization failed, continue, log to help debugging
                log.log(Level.FINER, "Input data does not match 'CloudEnterpriseAgent'", e);
            }

            // deserialize EnterpriseAgent
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(EnterpriseAgent.class);
                CloudEnterpriseAgent ret = new CloudEnterpriseAgent();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                // deserialization failed, continue, log to help debugging
                log.log(Level.FINER, "Input data does not match 'CloudEnterpriseAgent'", e);
            }

            throw new IOException(String.format("Failed deserialization for CloudEnterpriseAgent: no match found"));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public CloudEnterpriseAgent getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "CloudEnterpriseAgent cannot be null");
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CloudEnterpriseAgent() {
        super("anyOf", Boolean.FALSE);
    }

    public CloudEnterpriseAgent(Agent o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CloudEnterpriseAgent(EnterpriseAgent o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Agent", Agent.class);
        schemas.put("EnterpriseAgent", EnterpriseAgent.class);
        JSON.registerDescendants(CloudEnterpriseAgent.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CloudEnterpriseAgent.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * Agent, EnterpriseAgent
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(Agent.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(EnterpriseAgent.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Agent, EnterpriseAgent");
    }

    /**
     * Get the actual instance, which can be the following:
     * Agent, EnterpriseAgent
     *
     * @return The actual instance (Agent, EnterpriseAgent)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Agent`. If the actual instance is not `Agent`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Agent`
     * @throws ClassCastException if the instance is not `Agent`
     */
    public Agent getAgent() throws ClassCastException {
        return (Agent)super.getActualInstance();
    }

    /**
     * Get the actual instance of `EnterpriseAgent`. If the actual instance is not `EnterpriseAgent`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EnterpriseAgent`
     * @throws ClassCastException if the instance is not `EnterpriseAgent`
     */
    public EnterpriseAgent getEnterpriseAgent() throws ClassCastException {
        return (EnterpriseAgent)super.getActualInstance();
    }



}

