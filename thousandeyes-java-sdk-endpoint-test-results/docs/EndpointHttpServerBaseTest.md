

# EndpointHttpServerBaseTest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authType** | **EndpointTestAuthType** |  |  [optional] |
|**hasPathTraceInSession** | **Boolean** | Enables \&quot;in session\&quot; path trace. When enabled, this option initiates a TCP session with the target server and sends path trace packets within the established TCP session. |  [optional] |
|**httpTimeLimit** | **Integer** | Maximum amount of time in milliseconds the agents wait before a request times out. |  [optional] |
|**protocol** | **EndpointTestProtocol** |  |  [optional] |
|**url** | **String** | Test target URL. Optionally, you can specify a protocol (http or https). If no protocol is provided, the default &#x60;https&#x60; protocol is used. |  [optional] |
|**username** | **String** | Username for Basic/NTLM authentication. |  [optional] |
|**sslVersionId** | **TestSslVersionId** |  |  [optional] |
|**tcpProbeMode** | **TestProbeMode** |  |  [optional] |
|**verifyCertificate** | **Boolean** | Flag indicating if a certificate should be verified. |  [optional] |



