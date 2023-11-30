

# LocalNetworkTopologyResultBase


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agentId** | **UUID** | Unique ID of endpoint agent, from &#x60;/endpoint/agents&#x60; endpoint. |  [optional] [readonly] |
|**date** | **OffsetDateTime** | UTC date when endpoint network topology took place (ISO date-time format). |  [optional] [readonly] |
|**networkTopologyId** | **String** | Network topology ID. Each network topology occurrence has a unique ID. |  [optional] [readonly] |
|**roundId** | **Integer** | Epoch time (seconds) indicating the start time of the round. |  [optional] [readonly] |
|**target** | **String** | IP of the target the network topology was performed against. This is typically a default gateway, proxy or VPN endpoint. |  [optional] [readonly] |
|**targetPort** | **BigDecimal** | Port of the target the network topology was performed against. |  [optional] [readonly] |
|**type** | **NetworkTopologyType** |  |  [optional] [readonly] |
|**icmpPing** | [**NetworkPing**](NetworkPing.md) |  |  [optional] |
|**isIcmpBlocked** | **Boolean** | Set to &#x60;true&#x60; if network target is blocking ICMP echo (ping) queries. |  [optional] [readonly] |
|**tcpConnect** | [**TcpConnect**](TcpConnect.md) |  |  [optional] |
|**systemMetrics** | [**SystemMetrics**](SystemMetrics.md) |  |  [optional] |



