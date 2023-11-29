

# RealUserTestNetwork

Contains details about network profile and conditions during session.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**networkProfile** | [**NetworkProfile**](NetworkProfile.md) |  |  [optional] |
|**systemMetrics** | [**SystemMetrics**](SystemMetrics.md) |  |  [optional] |
|**gatewayPing** | [**RealUserTestNetworkGatewayPing**](RealUserTestNetworkGatewayPing.md) |  |  [optional] |
|**ping** | [**RealUserTestNetworkPing**](RealUserTestNetworkPing.md) |  |  [optional] |
|**traceroute** | [**RealUserTestNetworkTraceroute**](RealUserTestNetworkTraceroute.md) |  |  [optional] |
|**connectRtt** | **Double** | Represents the number of milliseconds required to establish TCP connectivity with the target. |  [optional] [readonly] |
|**isIcmpBlocked** | **Boolean** | Set to &#x60;true&#x60; if network target is blocking ICMP echo (ping) queries. |  [optional] [readonly] |
|**errors** | **List&lt;String&gt;** | Array of string representing possible network errors. |  [optional] [readonly] |
|**vpnPing** | [**RealUserTestNetworkVpnPing**](RealUserTestNetworkVpnPing.md) |  |  [optional] |
|**vpnTraceroute** | [**RealUserTestNetworkVpnTraceroute**](RealUserTestNetworkVpnTraceroute.md) |  |  [optional] |



