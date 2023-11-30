

# EndpointScheduledTest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**links** | [**EndpointTestLinks**](EndpointTestLinks.md) |  |  [optional] |
|**agentSelectorConfig** | [**EndpointAgentSelectorConfig**](EndpointAgentSelectorConfig.md) |  |  [optional] |
|**createdDate** | **OffsetDateTime** | UTC created date (ISO date-time format). |  [optional] [readonly] |
|**interval** | **TestInterval** |  |  [optional] |
|**isEnabled** | **Boolean** | Indicates if test is enabled. |  [optional] [readonly] |
|**isSavedEvent** | **Boolean** | Indicates if the test is a saved event. |  [optional] [readonly] |
|**hasPathTraceInSession** | **Boolean** | Enables \&quot;in session\&quot; path trace. When enabled, this option initiates a TCP session with the target server and sends path trace packets within the established TCP session. |  [optional] |
|**modifiedDate** | **OffsetDateTime** | UTC last modification date (ISO date-time format). |  [optional] [readonly] |
|**networkMeasurements** | **Boolean** | Enable or disable network measurements. Set to true to enable or false to disable network measurements. |  [optional] |
|**port** | **Integer** | Port number, if not specified, the port is selected based on a protocol (HTTP 80, HTTPS 443). |  [optional] |
|**protocol** | **EndpointTestProtocol** |  |  [optional] |
|**server** | **String** | Target domain name or IP address. |  [optional] |
|**testId** | **String** | Each test is assigned a unique ID to access test data from other endpoints. |  [optional] [readonly] |
|**aid** | [**EndpointTestAid**](EndpointTestAid.md) |  |  [optional] |
|**testName** | **String** | Name of the test. |  [optional] |
|**type** | **EndpointHttpServerType** |  |  [optional] |
|**authType** | **EndpointTestAuthType** |  |  [optional] |
|**httpTimeLimit** | **Integer** | Maximum amount of time in milliseconds the agents wait before a request times out. |  [optional] |
|**url** | **String** | Test target URL. Optionally, you can specify a protocol (http or https). If no protocol is provided, the default &#x60;https&#x60; protocol is used. |  [optional] |
|**username** | **String** | Username for Basic/NTLM authentication. |  [optional] |
|**sslVersionId** | **TestSslVersionId** |  |  [optional] |
|**tcpProbeMode** | **TestProbeMode** |  |  [optional] |
|**verifyCertificate** | **Boolean** | Flag indicating if a certificate should be verified. |  [optional] |
|**contentRegex** | **String** | Content regex, this field does not require escaping. |  [optional] |
|**followRedirects** | **Boolean** | To disable following HTTP/301 or HTTP/302 redirect directives, set this parameter to false. |  [optional] |
|**httpTargetTime** | **Integer** | Target time for HTTP server completion, specified in milliseconds. |  [optional] |
|**httpVersion** | **Integer** | HTTP protocol version. Set to &#39;2&#39; to prefer HTTP/2, or &#39;1&#39; to use only HTTP/1.1. |  [optional] |
|**postBody** | **String** | Enter the body for the HTTP POST request in this field. No special escaping is necessary. If the post body is provided with content, the &#x60;requestMethod&#x60; is automatically set to POST. |  [optional] |
|**sslVersion** | **String** | Reflects the verbose SSL protocol version used by a test. |  [optional] [readonly] |
|**useNtlm** | **Boolean** | Set to true to use NTLM, false to use Basic Authentication. Requires username and password to be set. |  [optional] |
|**userAgent** | **String** | User-agent string to be provided during the test. |  [optional] |



