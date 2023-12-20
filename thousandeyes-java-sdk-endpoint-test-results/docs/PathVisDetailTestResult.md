

# PathVisDetailTestResult


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
|**routes** | [**List&lt;PathVisRoute&gt;**](PathVisRoute.md) | Shows iterations of path trace, with each iteration specified by a pathId. |  [optional] |
|**vpnRoutes** | [**List&lt;PathVisRoute&gt;**](PathVisRoute.md) | Shows iterations of the VPN path trace, with each iteration specified by a pathId. |  [optional] |



