

# PathVisDynamicTestResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agentId** | **UUID** | Unique ID of endpoint agent, from &#x60;/endpoint/agents&#x60; endpoint. |  [optional] [readonly] |
|**aid** | [**AccountGroupId**](AccountGroupId.md) |  |  [optional] |
|**roundId** | **Integer** | Epoch time (seconds) indicating the start time of the round. |  [optional] [readonly] |
|**serverIp** | **String** | IP address of target server. |  [optional] [readonly] |
|**systemMetrics** | [**SystemMetrics**](SystemMetrics.md) |  |  [optional] |
|**vpnProfile** | [**VpnProfile**](VpnProfile.md) |  |  [optional] |
|**asnDetails** | [**AsnDetails**](AsnDetails.md) |  |  [optional] |
|**server** | **String** | Target server, including port. |  [optional] [readonly] |
|**sourceIp** | **String** | IP address of source endpoint agent. |  [optional] [readonly] |
|**sourcePrefix** | **String** | IP prefix of source endpoint agent. |  [optional] [readonly] |
|**application** | **DynamicTestApplication** |  |  [optional] |
|**webex** | [**DynamicBaseTestResultWebex**](DynamicBaseTestResultWebex.md) |  |  [optional] |
|**location** | **String** | Geographic location of the pathvis. |  [optional] [readonly] |
|**endpoints** | [**List&lt;PathVisEndpoint&gt;**](PathVisEndpoint.md) | Shows an iteration of path trace, with each iteration specified by a pathId. |  [optional] |



