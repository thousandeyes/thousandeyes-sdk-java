

# EndpointHttpServerTestRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agentSelectorType** | **EndpointTestAgentSelectorType** |  |  |
|**agents** | **List&lt;UUID&gt;** | List of endpoint agent IDs (obtained from &#x60;/endpoint/agents&#x60; endpoint). Required when &#x60;agentSelectorType&#x60; is set to &#x60;specific-agent&#x60;. |  [optional] |
|**hasPing** | **Boolean** | Optional flag indicating if the test should run ping. |  [optional] |
|**hasTraceroute** | **Boolean** | Optional flag indicating if the test should run traceroute. |  [optional] |
|**endpointAgentLabels** | **List&lt;String&gt;** | List of endpoint agent label IDs (obtained from &#x60;/endpoint/labels&#x60; endpoint), required when &#x60;agentSelectorType&#x60; is set to &#x60;agent-labels&#x60;. |  [optional] |
|**maxMachines** | **Integer** | Maximum number of agents which can execute the test. |  |
|**port** | **Integer** | Port number, if not specified, the port is selected based on a protocol (HTTP 80, HTTPS 443). |  [optional] |
|**testName** | **String** | Name of the test. |  |
|**authType** | **EndpointTestAuthType** |  |  [optional] |
|**hasPathTraceInSession** | **Boolean** | Enables \&quot;in session\&quot; path trace. When enabled, this option initiates a TCP session with the target server and sends path trace packets within the established TCP session. |  [optional] |
|**httpTimeLimit** | **Integer** | Maximum amount of time in milliseconds the agents wait before a request times out. |  |
|**protocol** | **EndpointTestProtocol** |  |  [optional] |
|**url** | **String** | Test target URL. Optionally, you can specify a protocol (http or https). If no protocol is provided, the default &#x60;https&#x60; protocol is used. |  |
|**username** | **String** | Username for Basic/NTLM authentication. |  [optional] |
|**sslVersionId** | **TestSslVersionId** |  |  |
|**tcpProbeMode** | **TestProbeMode** |  |  [optional] |
|**verifyCertificate** | **Boolean** | Flag indicating if a certificate should be verified. |  |
|**targetResponseTime** | **Integer** | Response time target in milliseconds. Affects the colors of agents and legends on the view page. The value is compared with actual response time in order to determine the color scale (from green to red). |  |
|**password** | **String** | Password for Basic/NTLM authentication. |  [optional] |
|**interval** | **TestInterval** |  |  |



