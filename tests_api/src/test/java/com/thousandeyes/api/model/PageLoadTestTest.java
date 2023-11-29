/*
 * Tests API
 *  ### Overview This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests.
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
import com.thousandeyes.api.model.AlertRule;
import com.thousandeyes.api.model.Monitor;
import com.thousandeyes.api.model.TestAuthType;
import com.thousandeyes.api.model.TestCustomHeaders;
import com.thousandeyes.api.model.TestHttpInterval;
import com.thousandeyes.api.model.TestInterval;
import com.thousandeyes.api.model.TestLabelsInner;
import com.thousandeyes.api.model.TestPageLoadingStrategy;
import com.thousandeyes.api.model.TestPathTraceMode;
import com.thousandeyes.api.model.TestProbeMode;
import com.thousandeyes.api.model.TestProtocol;
import com.thousandeyes.api.model.TestSharedAccountsInner;
import com.thousandeyes.api.model.TestSslVersionId;
import com.thousandeyes.api.model.TestSubInterval;
import com.thousandeyes.api.model.UnexpandedInstantTestLinks;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for PageLoadTest
 */
public class PageLoadTestTest {
    private final PageLoadTest model = new PageLoadTest();

    /**
     * Model tests for PageLoadTest
     */
    @Test
    public void testPageLoadTest() {
        // TODO: test PageLoadTest
    }

    /**
     * Test the property 'interval'
     */
    @Test
    public void intervalTest() {
        // TODO: test interval
    }

    /**
     * Test the property 'alertsEnabled'
     */
    @Test
    public void alertsEnabledTest() {
        // TODO: test alertsEnabled
    }

    /**
     * Test the property 'enabled'
     */
    @Test
    public void enabledTest() {
        // TODO: test enabled
    }

    /**
     * Test the property 'alertRules'
     */
    @Test
    public void alertRulesTest() {
        // TODO: test alertRules
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
     * Test the property 'authType'
     */
    @Test
    public void authTypeTest() {
        // TODO: test authType
    }

    /**
     * Test the property 'bandwidthMeasurements'
     */
    @Test
    public void bandwidthMeasurementsTest() {
        // TODO: test bandwidthMeasurements
    }

    /**
     * Test the property 'clientCertificate'
     */
    @Test
    public void clientCertificateTest() {
        // TODO: test clientCertificate
    }

    /**
     * Test the property 'contentRegex'
     */
    @Test
    public void contentRegexTest() {
        // TODO: test contentRegex
    }

    /**
     * Test the property 'customHeaders'
     */
    @Test
    public void customHeadersTest() {
        // TODO: test customHeaders
    }

    /**
     * Test the property 'followRedirects'
     */
    @Test
    public void followRedirectsTest() {
        // TODO: test followRedirects
    }

    /**
     * Test the property 'httpTargetTime'
     */
    @Test
    public void httpTargetTimeTest() {
        // TODO: test httpTargetTime
    }

    /**
     * Test the property 'httpTimeLimit'
     */
    @Test
    public void httpTimeLimitTest() {
        // TODO: test httpTimeLimit
    }

    /**
     * Test the property 'httpVersion'
     */
    @Test
    public void httpVersionTest() {
        // TODO: test httpVersion
    }

    /**
     * Test the property 'includeHeaders'
     */
    @Test
    public void includeHeadersTest() {
        // TODO: test includeHeaders
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
     * Test the property 'pageLoadTargetTime'
     */
    @Test
    public void pageLoadTargetTimeTest() {
        // TODO: test pageLoadTargetTime
    }

    /**
     * Test the property 'pageLoadTimeLimit'
     */
    @Test
    public void pageLoadTimeLimitTest() {
        // TODO: test pageLoadTimeLimit
    }

    /**
     * Test the property 'password'
     */
    @Test
    public void passwordTest() {
        // TODO: test password
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
     * Test the property 'sslVersion'
     */
    @Test
    public void sslVersionTest() {
        // TODO: test sslVersion
    }

    /**
     * Test the property 'sslVersionId'
     */
    @Test
    public void sslVersionIdTest() {
        // TODO: test sslVersionId
    }

    /**
     * Test the property 'url'
     */
    @Test
    public void urlTest() {
        // TODO: test url
    }

    /**
     * Test the property 'useNtlm'
     */
    @Test
    public void useNtlmTest() {
        // TODO: test useNtlm
    }

    /**
     * Test the property 'userAgent'
     */
    @Test
    public void userAgentTest() {
        // TODO: test userAgent
    }

    /**
     * Test the property 'username'
     */
    @Test
    public void usernameTest() {
        // TODO: test username
    }

    /**
     * Test the property 'verifyCertificate'
     */
    @Test
    public void verifyCertificateTest() {
        // TODO: test verifyCertificate
    }

    /**
     * Test the property 'blockDomains'
     */
    @Test
    public void blockDomainsTest() {
        // TODO: test blockDomains
    }

    /**
     * Test the property 'disableScreenshot'
     */
    @Test
    public void disableScreenshotTest() {
        // TODO: test disableScreenshot
    }

    /**
     * Test the property 'allowMicAndCamera'
     */
    @Test
    public void allowMicAndCameraTest() {
        // TODO: test allowMicAndCamera
    }

    /**
     * Test the property 'allowGeolocation'
     */
    @Test
    public void allowGeolocationTest() {
        // TODO: test allowGeolocation
    }

    /**
     * Test the property 'browserLanguage'
     */
    @Test
    public void browserLanguageTest() {
        // TODO: test browserLanguage
    }

    /**
     * Test the property 'pageLoadingStrategy'
     */
    @Test
    public void pageLoadingStrategyTest() {
        // TODO: test pageLoadingStrategy
    }

    /**
     * Test the property 'fixedPacketRate'
     */
    @Test
    public void fixedPacketRateTest() {
        // TODO: test fixedPacketRate
    }

    /**
     * Test the property 'bgpMeasurements'
     */
    @Test
    public void bgpMeasurementsTest() {
        // TODO: test bgpMeasurements
    }

    /**
     * Test the property 'monitors'
     */
    @Test
    public void monitorsTest() {
        // TODO: test monitors
    }

    /**
     * Test the property 'httpInterval'
     */
    @Test
    public void httpIntervalTest() {
        // TODO: test httpInterval
    }

    /**
     * Test the property 'subinterval'
     */
    @Test
    public void subintervalTest() {
        // TODO: test subinterval
    }

}
