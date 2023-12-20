

# HttpServerInstantTest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
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
|**contentRegex** | **String** | Content regex, this field does not require escaping. |  [optional] |
|**headers** | **List&lt;String&gt;** | HTTP request headers used. |  [optional] |
|**customHeaders** | [**TestCustomHeaders**](TestCustomHeaders.md) |  |  [optional] |
|**desiredStatusCode** | **String** | Specify the HTTP status code value that indicates a successful response. |  [optional] |
|**downloadLimit** | **Integer** | Specifies maximum number of bytes to download from the target object. |  [optional] |
|**dnsOverride** | **String** | IP address to use for DNS override. |  [optional] |
|**httpTargetTime** | **Integer** | Target time for HTTP server completion, specified in milliseconds. |  [optional] |
|**httpTimeLimit** | **Integer** | HTTP time limit in seconds. |  [optional] |
|**httpVersion** | **Integer** | HTTP protocol version. Set to &#39;2&#39; to prefer HTTP/2, or &#39;1&#39; to use only HTTP/1.1. |  [optional] |
|**includeHeaders** | **Boolean** | Set to &#x60;true&#x60; to capture response headers for objects loaded by the test. |  [optional] |
|**mtuMeasurements** | **Boolean** | Set &#x60;true&#x60; to measure MTU sizes on network from agents to the target. |  [optional] |
|**networkMeasurements** | **Boolean** | Enable or disable network measurements. Set to true to enable or false to disable network measurements. |  [optional] |
|**numPathTraces** | **Integer** | Number of path traces executed by the agent. |  [optional] |
|**password** | **String** | Password for Basic/NTLM authentication. |  [optional] |
|**pathTraceMode** | **TestPathTraceMode** |  |  [optional] |
|**postBody** | **String** | Enter the body for the HTTP POST request in this field. No special escaping is necessary. If the post body is provided with content, the &#x60;requestMethod&#x60; is automatically set to POST. |  [optional] |
|**probeMode** | **TestProbeMode** |  |  [optional] |
|**protocol** | **TestProtocol** |  |  [optional] |
|**sslVersion** | **String** | Reflects the verbose SSL protocol version used by a test. |  [optional] [readonly] |
|**sslVersionId** | **TestSslVersionId** |  |  [optional] |
|**url** | **String** | Target for the test. |  |
|**useNtlm** | **Boolean** | Set to true to use NTLM, false to use Basic Authentication. Requires username and password to be set. |  [optional] |
|**userAgent** | **String** | User-agent string to be provided during the test. |  [optional] |
|**username** | **String** | Username for Basic/NTLM authentication. |  [optional] |
|**verifyCertificate** | **Boolean** | Ignore or acknowledge certificate errors. Set to false to ignore certificate errors. |  [optional] |
|**ipv6Policy** | **TestIpv6Policy** |  |  [optional] |
|**followRedirects** | **Boolean** | To disable following HTTP/301 or HTTP/302 redirect directives, set this parameter to &#x60;false&#x60;. |  [optional] |
|**fixedPacketRate** | **Integer** | Sets packets rate sent to measure the network in packets per second. |  [optional] |



