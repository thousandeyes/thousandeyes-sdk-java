

# HttpTestResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agentId** | **UUID** | Unique ID of endpoint agent, from &#x60;/endpoint/agents&#x60; endpoint. |  [optional] [readonly] |
|**aid** | [**AccountGroupId**](AccountGroupId.md) |  |  [optional] |
|**roundId** | **Integer** | Epoch time (seconds) indicating the start time of the round. |  [optional] [readonly] |
|**serverIp** | **String** | IP address of destination server. |  [optional] [readonly] |
|**systemMetrics** | [**SystemMetrics**](SystemMetrics.md) |  |  [optional] |
|**vpnProfile** | [**VpnProfile**](VpnProfile.md) |  |  [optional] |
|**networkProfile** | [**NetworkProfile**](NetworkProfile.md) |  |  [optional] |
|**connectTime** | **Integer** | Time required to establish a TCP connection to the server in milliseconds. |  [optional] [readonly] |
|**dnsTime** | **Integer** | Time required to resolve DNS in milliseconds. |  [optional] [readonly] |
|**errorType** | **HttpErrorType** |  |  [optional] |
|**errorDetails** | **String** | Error details, if an error were encountered. |  [optional] [readonly] |
|**headers** | [**HttpTestResultHeaders**](HttpTestResultHeaders.md) |  |  [optional] |
|**numRedirects** | **Integer** | Number of redirects. |  [optional] [readonly] |
|**receiveTime** | **Integer** | Elapsed time between first and last byte of response in milliseconds. |  [optional] [readonly] |
|**redirectTime** | **Integer** | Cumulative redirect timing in milliseconds. |  [optional] [readonly] |
|**responseCode** | **Integer** | HTTP response code. |  [optional] [readonly] |
|**responseTime** | **Integer** | Time to first byte in milliseconds. |  [optional] [readonly] |
|**sslTime** | **Integer** | Time to negotiate SSL/TLS in milliseconds. |  [optional] [readonly] |
|**totalTime** | **Integer** | Total time is the response time + receive time. |  [optional] [readonly] |
|**waitTime** | **Integer** | Time elapsed between completion of request and first byte of response in milliseconds. |  [optional] [readonly] |
|**wireSize** | **Integer** | Size of content in bytes. |  [optional] [readonly] |



