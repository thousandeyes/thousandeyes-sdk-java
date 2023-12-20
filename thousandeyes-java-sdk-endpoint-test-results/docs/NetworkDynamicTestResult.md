

# NetworkDynamicTestResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agentId** | **UUID** | Unique ID of endpoint agent, from &#x60;/endpoint/agents&#x60; endpoint. |  [optional] [readonly] |
|**aid** | [**AccountGroupId**](AccountGroupId.md) |  |  [optional] |
|**roundId** | **Integer** | Epoch time (seconds) indicating the start time of the round. |  [optional] [readonly] |
|**serverIp** | **String** | IP address of target server. |  [optional] [readonly] |
|**systemMetrics** | [**SystemMetrics**](SystemMetrics.md) |  |  [optional] |
|**vpnProfile** | [**VpnProfile**](VpnProfile.md) |  |  [optional] |
|**networkProfile** | [**NetworkProfile**](NetworkProfile.md) |  |  [optional] |
|**avgLatency** | **Double** | Average RTT for packets sent to destination. |  [optional] [readonly] |
|**errorDetails** | **String** | Error details, if an error was encountered. |  [optional] [readonly] |
|**jitter** | **Double** | Standard deviation of latency. |  [optional] [readonly] |
|**isIcmpBlocked** | **Boolean** | Set to &#x60;true&#x60; if network target is blocking ICMP echo (ping) queries. |  [optional] [readonly] |
|**loss** | **Double** | Percentage of packets not reaching destination. |  [optional] [readonly] |
|**maxLatency** | **Double** | Maximum RTT for packets sent to destination. |  [optional] [readonly] |
|**minLatency** | **Double** | Minimum RTT for packets sent to destination. |  [optional] [readonly] |
|**application** | **DynamicTestApplication** |  |  [optional] |
|**webex** | [**DynamicBaseTestResultWebex**](DynamicBaseTestResultWebex.md) |  |  [optional] |



