/*
 * Instant Tests API
 *  ### Overview The Instant Tests API endpoint lets you create and run new instant tests. You will need to be a regular user or have the following permissions:   * `API Access`   * `View tests`  The response does not include the immediate test results. Use the Test Results endpoints to get test results after creating and executing an instant test. You can find the URLs for these endpoints in the _links section of the test definition that is returned when you create the instant test.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.model.Agent;
import com.thousandeyes.api.model.DnsQueryClass;
import com.thousandeyes.api.model.TestDnsServer;
import com.thousandeyes.api.model.TestDnsTransportProtocol;
import com.thousandeyes.api.model.TestIpv6Policy;
import com.thousandeyes.api.model.TestLabelsInner;
import com.thousandeyes.api.model.TestPathTraceMode;
import com.thousandeyes.api.model.TestProbeMode;
import com.thousandeyes.api.model.TestProtocol;
import com.thousandeyes.api.model.TestSharedAccountsInner;
import com.thousandeyes.api.model.UnexpandedInstantTestLinks;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for DnsServerInstantTest
 */
public class DnsServerInstantTestTest {
    private final DnsServerInstantTest model = new DnsServerInstantTest();

    /**
     * Model tests for DnsServerInstantTest
     */
    @Test
    public void testDnsServerInstantTest() {
        // TODO: test DnsServerInstantTest
    }

    /**
     * Test the property 'createdBy'
     */
    @Test
    public void createdByTest() {
        // TODO: test createdBy
    }

    /**
     * Test the property 'createdDate'
     */
    @Test
    public void createdDateTest() {
        // TODO: test createdDate
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'liveShare'
     */
    @Test
    public void liveShareTest() {
        // TODO: test liveShare
    }

    /**
     * Test the property 'modifiedBy'
     */
    @Test
    public void modifiedByTest() {
        // TODO: test modifiedBy
    }

    /**
     * Test the property 'modifiedDate'
     */
    @Test
    public void modifiedDateTest() {
        // TODO: test modifiedDate
    }

    /**
     * Test the property 'savedEvent'
     */
    @Test
    public void savedEventTest() {
        // TODO: test savedEvent
    }

    /**
     * Test the property 'testId'
     */
    @Test
    public void testIdTest() {
        // TODO: test testId
    }

    /**
     * Test the property 'testName'
     */
    @Test
    public void testNameTest() {
        // TODO: test testName
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'links'
     */
    @Test
    public void linksTest() {
        // TODO: test links
    }

    /**
     * Test the property 'labels'
     */
    @Test
    public void labelsTest() {
        // TODO: test labels
    }

    /**
     * Test the property 'sharedWithAccounts'
     */
    @Test
    public void sharedWithAccountsTest() {
        // TODO: test sharedWithAccounts
    }

    /**
     * Test the property 'agents'
     */
    @Test
    public void agentsTest() {
        // TODO: test agents
    }

    /**
     * Test the property 'bandwidthMeasurements'
     */
    @Test
    public void bandwidthMeasurementsTest() {
        // TODO: test bandwidthMeasurements
    }

    /**
     * Test the property 'dnsServers'
     */
    @Test
    public void dnsServersTest() {
        // TODO: test dnsServers
    }

    /**
     * Test the property 'dnsTransportProtocol'
     */
    @Test
    public void dnsTransportProtocolTest() {
        // TODO: test dnsTransportProtocol
    }

    /**
     * Test the property 'domain'
     */
    @Test
    public void domainTest() {
        // TODO: test domain
    }

    /**
     * Test the property 'mtuMeasurements'
     */
    @Test
    public void mtuMeasurementsTest() {
        // TODO: test mtuMeasurements
    }

    /**
     * Test the property 'networkMeasurements'
     */
    @Test
    public void networkMeasurementsTest() {
        // TODO: test networkMeasurements
    }

    /**
     * Test the property 'numPathTraces'
     */
    @Test
    public void numPathTracesTest() {
        // TODO: test numPathTraces
    }

    /**
     * Test the property 'pathTraceMode'
     */
    @Test
    public void pathTraceModeTest() {
        // TODO: test pathTraceMode
    }

    /**
     * Test the property 'probeMode'
     */
    @Test
    public void probeModeTest() {
        // TODO: test probeMode
    }

    /**
     * Test the property 'protocol'
     */
    @Test
    public void protocolTest() {
        // TODO: test protocol
    }

    /**
     * Test the property 'recursiveQueries'
     */
    @Test
    public void recursiveQueriesTest() {
        // TODO: test recursiveQueries
    }

    /**
     * Test the property 'ipv6Policy'
     */
    @Test
    public void ipv6PolicyTest() {
        // TODO: test ipv6Policy
    }

    /**
     * Test the property 'fixedPacketRate'
     */
    @Test
    public void fixedPacketRateTest() {
        // TODO: test fixedPacketRate
    }

    /**
     * Test the property 'dnsQueryClass'
     */
    @Test
    public void dnsQueryClassTest() {
        // TODO: test dnsQueryClass
    }

}
