/*
 * Agents API
 *  ## Overview Manage Cloud and Enterprise Agents available to your account in ThousandEyes.
 *
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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.agents.model.AccountGroup;
import com.thousandeyes.sdk.agents.model.AgentLabel;
import com.thousandeyes.sdk.agents.model.CloudAgentDetail;
import com.thousandeyes.sdk.agents.model.ClusterMember;
import com.thousandeyes.sdk.agents.model.EnterpriseAgentClusterDetail;
import com.thousandeyes.sdk.agents.model.EnterpriseAgentDetail;
import com.thousandeyes.sdk.agents.model.EnterpriseAgentIpv6Policy;
import com.thousandeyes.sdk.agents.model.EnterpriseAgentState;
import com.thousandeyes.sdk.agents.model.ErrorDetail;
import com.thousandeyes.sdk.agents.model.InterfaceIpMapping;
import com.thousandeyes.sdk.agents.model.NotificationRules;
import com.thousandeyes.sdk.agents.model.SelfLinks;
import com.thousandeyes.sdk.agents.model.SimpleTest;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.fasterxml.jackson.core.type.TypeReference;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.thousandeyes.sdk.serialization.JSON;
import com.thousandeyes.sdk.serialization.AbstractOpenApiSchema;

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
@JsonDeserialize(using = AgentDetails.AgentDetailsDeserializer.class)
@JsonSerialize(using = AgentDetails.AgentDetailsSerializer.class)
public class AgentDetails extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(AgentDetails.class.getName());

    public static class AgentDetailsSerializer extends StdSerializer<AgentDetails> {
        public AgentDetailsSerializer(Class<AgentDetails> t) {
            super(t);
        }

        public AgentDetailsSerializer() {
            this(null);
        }

        @Override
        public void serialize(AgentDetails value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class AgentDetailsDeserializer extends StdDeserializer<AgentDetails> {
        public AgentDetailsDeserializer() {
            this(AgentDetails.class);
        }

        public AgentDetailsDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public AgentDetails deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            AgentDetails newAgentDetails = new AgentDetails();
            Map<String,Object> result2 = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<Map<String, Object>>() {});
            String discriminatorValue = (String)result2.get("agentType");
            switch (discriminatorValue) {
                case "cloud":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CloudAgentDetail.class);
                    newAgentDetails.setActualInstance(deserialized);
                    return newAgentDetails;
                case "enterprise":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(EnterpriseAgentDetail.class);
                    newAgentDetails.setActualInstance(deserialized);
                    return newAgentDetails;
                case "enterprise-cluster":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(EnterpriseAgentClusterDetail.class);
                    newAgentDetails.setActualInstance(deserialized);
                    return newAgentDetails;
                default:
                    log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for AgentDetails. Possible values: cloud enterprise enterprise-cluster", discriminatorValue));
            }

            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize CloudAgentDetail
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CloudAgentDetail.class.equals(Integer.class) || CloudAgentDetail.class.equals(Long.class) || CloudAgentDetail.class.equals(Float.class) || CloudAgentDetail.class.equals(Double.class) || CloudAgentDetail.class.equals(Boolean.class) || CloudAgentDetail.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CloudAgentDetail.class.equals(Integer.class) || CloudAgentDetail.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CloudAgentDetail.class.equals(Float.class) || CloudAgentDetail.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CloudAgentDetail.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CloudAgentDetail.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CloudAgentDetail.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CloudAgentDetail'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CloudAgentDetail'", e);
            }

            // deserialize EnterpriseAgentClusterDetail
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (EnterpriseAgentClusterDetail.class.equals(Integer.class) || EnterpriseAgentClusterDetail.class.equals(Long.class) || EnterpriseAgentClusterDetail.class.equals(Float.class) || EnterpriseAgentClusterDetail.class.equals(Double.class) || EnterpriseAgentClusterDetail.class.equals(Boolean.class) || EnterpriseAgentClusterDetail.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((EnterpriseAgentClusterDetail.class.equals(Integer.class) || EnterpriseAgentClusterDetail.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((EnterpriseAgentClusterDetail.class.equals(Float.class) || EnterpriseAgentClusterDetail.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (EnterpriseAgentClusterDetail.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (EnterpriseAgentClusterDetail.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(EnterpriseAgentClusterDetail.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'EnterpriseAgentClusterDetail'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'EnterpriseAgentClusterDetail'", e);
            }

            // deserialize EnterpriseAgentDetail
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (EnterpriseAgentDetail.class.equals(Integer.class) || EnterpriseAgentDetail.class.equals(Long.class) || EnterpriseAgentDetail.class.equals(Float.class) || EnterpriseAgentDetail.class.equals(Double.class) || EnterpriseAgentDetail.class.equals(Boolean.class) || EnterpriseAgentDetail.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((EnterpriseAgentDetail.class.equals(Integer.class) || EnterpriseAgentDetail.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((EnterpriseAgentDetail.class.equals(Float.class) || EnterpriseAgentDetail.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (EnterpriseAgentDetail.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (EnterpriseAgentDetail.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(EnterpriseAgentDetail.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'EnterpriseAgentDetail'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'EnterpriseAgentDetail'", e);
            }

            if (match == 1) {
                AgentDetails ret = new AgentDetails();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for AgentDetails: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public AgentDetails getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "AgentDetails cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public AgentDetails() {
        super("oneOf", Boolean.FALSE);
    }

    public AgentDetails(CloudAgentDetail o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AgentDetails(EnterpriseAgentClusterDetail o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AgentDetails(EnterpriseAgentDetail o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CloudAgentDetail", CloudAgentDetail.class);
        schemas.put("EnterpriseAgentClusterDetail", EnterpriseAgentClusterDetail.class);
        schemas.put("EnterpriseAgentDetail", EnterpriseAgentDetail.class);
        JSON.registerDescendants(AgentDetails.class, Collections.unmodifiableMap(schemas));
        // Initialize and register the discriminator mappings.
        Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
        mappings.put("cloud", CloudAgentDetail.class);
        mappings.put("enterprise", EnterpriseAgentDetail.class);
        mappings.put("enterprise-cluster", EnterpriseAgentClusterDetail.class);
        mappings.put("AgentDetails", AgentDetails.class);
        JSON.registerDiscriminator(AgentDetails.class, "agentType", mappings);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return AgentDetails.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CloudAgentDetail, EnterpriseAgentClusterDetail, EnterpriseAgentDetail
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(CloudAgentDetail.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(EnterpriseAgentClusterDetail.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(EnterpriseAgentDetail.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CloudAgentDetail, EnterpriseAgentClusterDetail, EnterpriseAgentDetail");
    }

    /**
     * Get the actual instance, which can be the following:
     * CloudAgentDetail, EnterpriseAgentClusterDetail, EnterpriseAgentDetail
     *
     * @return The actual instance (CloudAgentDetail, EnterpriseAgentClusterDetail, EnterpriseAgentDetail)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CloudAgentDetail`. If the actual instance is not `CloudAgentDetail`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CloudAgentDetail`
     * @throws ClassCastException if the instance is not `CloudAgentDetail`
     */
    public CloudAgentDetail getCloudAgentDetail() throws ClassCastException {
        return (CloudAgentDetail)super.getActualInstance();
    }

    /**
     * Get the actual instance of `EnterpriseAgentClusterDetail`. If the actual instance is not `EnterpriseAgentClusterDetail`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EnterpriseAgentClusterDetail`
     * @throws ClassCastException if the instance is not `EnterpriseAgentClusterDetail`
     */
    public EnterpriseAgentClusterDetail getEnterpriseAgentClusterDetail() throws ClassCastException {
        return (EnterpriseAgentClusterDetail)super.getActualInstance();
    }

    /**
     * Get the actual instance of `EnterpriseAgentDetail`. If the actual instance is not `EnterpriseAgentDetail`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EnterpriseAgentDetail`
     * @throws ClassCastException if the instance is not `EnterpriseAgentDetail`
     */
    public EnterpriseAgentDetail getEnterpriseAgentDetail() throws ClassCastException {
        return (EnterpriseAgentDetail)super.getActualInstance();
    }



}

