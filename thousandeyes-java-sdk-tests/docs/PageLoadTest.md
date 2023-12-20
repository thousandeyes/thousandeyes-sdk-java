

# PageLoadTest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**interval** | **TestInterval** |  |  |
|**alertsEnabled** | **Boolean** | Indicates if alerts are enabled. |  [optional] |
|**enabled** | **Boolean** | Test is enabled. |  [optional] |
|**alertRules** | [**List&lt;AlertRule&gt;**](AlertRule.md) | Contains list of enabled alert rule objects. |  [optional] |
|**createdBy** | **String** | User that created the test. |  [optional] [readonly] |
|**createdDate** | **OffsetDateTime** | UTC created date (ISO date-time format). |  [optional] [readonly] |
|**description** | **String** | A description of the test. |  [optional] |
|**liveShare** | **Boolean** | Indicates if the test is shared with the account group. |  [optional] [readonly] |
|**modifiedBy** | **String** | User that modified the test. |  [optional] [readonly] |
|**modifiedDate** | **OffsetDateTime** | UTC last modification date (ISO date-time format). |  [optional] [readonly] |
|**savedEvent** | **Boolean** | Indicates if the test is a saved event. |  [optional] [readonly] |
|**testId** | **String** | Each test is assigned an unique ID; this is used to access test information and results from other endpoints. |  [optional] [readonly] |
|**testName** | **String** | The name of the test. Test name must be unique. |  [optional] |
|**type** | **String** |  |  [optional] [readonly] |
|**links** | [**UnexpandedInstantTestLinks**](UnexpandedInstantTestLinks.md) |  |  [optional] |
|**labels** | [**List&lt;TestLabelsInner&gt;**](TestLabelsInner.md) |  |  [optional] [readonly] |
|**sharedWithAccounts** | [**List&lt;TestSharedAccountsInner&gt;**](TestSharedAccountsInner.md) |  |  [optional] [readonly] |
|**agents** | [**List&lt;Agent&gt;**](Agent.md) | Contains list of agents. |  [readonly] |
|**authType** | **TestAuthType** |  |  [optional] |
|**bandwidthMeasurements** | **Boolean** | Set to &#x60;true&#x60; to enable bandwidth measurements, only applies to Enterprise agents assigned to the test. |  [optional] |
|**clientCertificate** | **String** | String representation (containing newline characters) of client certificate, the private key must be placed first, then the certificate. |  [optional] |
|**contentRegex** | **String** | Verify content using a regular expression. This field does not require escaping. |  [optional] |
|**customHeaders** | [**TestCustomHeaders**](TestCustomHeaders.md) |  |  [optional] |
|**followRedirects** | **Boolean** | To disable following HTTP/301 or HTTP/302 redirect directives, set this parameter to false. |  [optional] |
|**httpTargetTime** | **Integer** | Target time for HTTP server completion, specified in milliseconds. |  [optional] |
|**httpTimeLimit** | **Integer** | HTTP time limit in seconds. |  [optional] |
|**httpVersion** | **Integer** | HTTP protocol version. Set to &#39;2&#39; to prefer HTTP/2, or &#39;1&#39; to use only HTTP/1.1. |  [optional] |
|**includeHeaders** | **Boolean** | Set to &#x60;true&#x60; to capture response headers for objects loaded by the test. |  [optional] |
|**mtuMeasurements** | **Boolean** | Set &#x60;true&#x60; to measure MTU sizes on network from agents to the target. |  [optional] |
|**networkMeasurements** | **Boolean** | Enable or disable network measurements. Set to true to enable or false to disable network measurements. |  [optional] |
|**numPathTraces** | **Integer** | Number of path traces executed by the agent. |  [optional] |
|**pageLoadTargetTime** | **Integer** | Target time for page load completion, specified in seconds and cannot exceed the &#x60;pageLoadTimeLimit&#x60;. |  [optional] |
|**pageLoadTimeLimit** | **Integer** | Page load time limit. Must be larger than the &#x60;httpTimeLimit&#x60;. |  [optional] |
|**password** | **String** | Password for Basic/NTLM authentication. |  [optional] |
|**pathTraceMode** | **TestPathTraceMode** |  |  [optional] |
|**probeMode** | **TestProbeMode** |  |  [optional] |
|**protocol** | **TestProtocol** |  |  [optional] |
|**sslVersion** | **String** | Reflects the verbose SSL protocol version used by a test. |  [optional] [readonly] |
|**sslVersionId** | **TestSslVersionId** |  |  [optional] |
|**url** | **String** | Target for the test. |  |
|**useNtlm** | **Boolean** | Set to true to use NTLM, false to use Basic Authentication. Requires username and password to be set. |  [optional] |
|**userAgent** | **String** | User-agent string to be provided during the test. |  [optional] |
|**username** | **String** | Username for Basic/NTLM authentication. |  [optional] |
|**verifyCertificate** | **Boolean** | Ignore or acknowledge certificate errors. Set to false to ignore certificate errors. |  [optional] |
|**blockDomains** | **String** | Domains or full object URLs to be excluded from metrics and waterfall data for transaction tests. |  [optional] |
|**disableScreenshot** | **Boolean** | Enables or disables screenshots on error. Set true to not capture |  [optional] |
|**allowMicAndCamera** | **Boolean** | Set true allow the use of a fake mic and camera in the browser. |  [optional] |
|**allowGeolocation** | **Boolean** | Set true to use the agent’s geolocation by the web page. |  [optional] |
|**browserLanguage** | **String** | Set one of the available browser language that you want to use to configure the browser. |  [optional] |
|**pageLoadingStrategy** | **TestPageLoadingStrategy** |  |  [optional] |
|**fixedPacketRate** | **Integer** | Sets packets rate sent to measure the network in packets per second. |  [optional] |
|**bgpMeasurements** | **Boolean** | Set to &#x60;true&#x60; to enable bgp measurements. |  [optional] |
|**monitors** | [**List&lt;Monitor&gt;**](Monitor.md) | Contains list of enabled BGP monitors. |  [optional] [readonly] |
|**httpInterval** | **TestHttpInterval** |  |  |
|**subinterval** | **TestSubInterval** |  |  [optional] |



