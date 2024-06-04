/*
 * Credentials API
 * Manage credentials for transaction tests using the Credentials API.  The following permissions are required to access Credentials API endpoints:  * `Settings Tests Read` for read operations. * `Settings Tests Update` for write operations. * `View sensitive data in web transaction scripts` to view the encrypted value property of credentials. * `Settings Tests Create Transaction (Tx) Tests` to create credentials.  For more information about credentials, see [Working With Secure Credentials](https://docs.thousandeyes.com/product-documentation/browser-synthetics/transaction-tests/getting-started/working-with-secure-credentials). 
 *
 * The version of the OpenAPI document: 7.0.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.credentials;

import com.thousandeyes.sdk.credentials.model.Credential;
import com.thousandeyes.sdk.credentials.model.CredentialRequest;
import com.thousandeyes.sdk.credentials.model.CredentialWithoutValue;
import com.thousandeyes.sdk.credentials.model.Credentials;
import com.thousandeyes.sdk.credentials.model.Error;
import java.net.URI;
import com.thousandeyes.sdk.credentials.model.UnauthorizedError;
import com.thousandeyes.sdk.credentials.model.ValidationError;
import static com.thousandeyes.sdk.serialization.JSON.getDefault;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * Request and Response model deserialization tests for CredentialsApi
 */
public class CredentialsApiTest {
    // private final CredentialsApi api = new CredentialsApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Create credential
     * <p>
     * Creates a new credential for ThousandEyes transaction tests, based on properties provided in the request data. To create a new credential, you must have permission to update tests.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void createCredentialRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "name" : "Example Credential 1",
                  "value" : "Example Credential 1 Password"
                }
                                 """;
        CredentialRequest mappedRequest = 
                mapper.readValue(requestBodyJson, CredentialRequest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "_links" : {
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  },
                  "name" : "Example Credential",
                  "id" : "3247"
                }
                                  """;
        CredentialWithoutValue mappedResponse = 
                mapper.readValue(responseBodyJson, CredentialWithoutValue.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Delete credential
     * <p>
     * Deletes a ThousandEyes transaction test credential, using the request parameters. To delete a credential, you must have permission to update tests and access to the credential based on its default or provided account ID.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Disabled
    @Test
    public void deleteCredentialRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

    }
    
    /**
     * Retrieve credential
     * <p>
     * Retrieves detailed information about a ThousandEyes transaction test credential. To access this information, you must have access to the credential based on its default or provided account ID.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getCredentialRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "_links" : {
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  },
                  "name" : "Example Credential",
                  "id" : "3247",
                  "value" : "rwhR12uDm1Im47p5IVXgzz4ORgC7m48ajzzeWVUt"
                }
                                  """;
        Credential mappedResponse = 
                mapper.readValue(responseBodyJson, Credential.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * List credentials
     * <p>
     * Retrieves a list of credentials configured in ThousandEyes. Users have access to the list of credentials based on the default settings or the specified account ID.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getCredentialsRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "credentials" : [ {
                    "_links" : {
                      "self" : {
                        "hreflang" : "hreflang",
                        "templated" : true,
                        "profile" : "profile",
                        "name" : "name",
                        "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                        "type" : "type",
                        "deprecation" : "deprecation",
                        "title" : "title"
                      }
                    },
                    "name" : "Example Credential",
                    "id" : "3247",
                    "value" : "rwhR12uDm1Im47p5IVXgzz4ORgC7m48ajzzeWVUt"
                  }, {
                    "_links" : {
                      "self" : {
                        "hreflang" : "hreflang",
                        "templated" : true,
                        "profile" : "profile",
                        "name" : "name",
                        "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                        "type" : "type",
                        "deprecation" : "deprecation",
                        "title" : "title"
                      }
                    },
                    "name" : "Example Credential",
                    "id" : "3247",
                    "value" : "rwhR12uDm1Im47p5IVXgzz4ORgC7m48ajzzeWVUt"
                  } ],
                  "_links" : {
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  }
                }
                                  """;
        Credentials mappedResponse = 
                mapper.readValue(responseBodyJson, Credentials.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Update credential
     * <p>
     * Updates the credential for ThousandEyes transaction tests, based on properties provided in the request data. To update a credential, you must have permission to update tests and access to the credential based on its default or provided account ID.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void updateCredentialRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "name" : "Example Credential 1",
                  "value" : "Example Credential 1 Password"
                }
                                 """;
        CredentialRequest mappedRequest = 
                mapper.readValue(requestBodyJson, CredentialRequest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "_links" : {
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  },
                  "name" : "Example Credential",
                  "id" : "3247"
                }
                                  """;
        CredentialWithoutValue mappedResponse = 
                mapper.readValue(responseBodyJson, CredentialWithoutValue.class);
        assertNotNull(mappedResponse);
    }
    
}
