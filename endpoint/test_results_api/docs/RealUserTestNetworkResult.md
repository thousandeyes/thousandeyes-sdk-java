

# RealUserTestNetworkResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agentId** | **UUID** | Unique ID of endpoint agent, from &#x60;/endpoint/agents&#x60; endpoint. |  [optional] [readonly] |
|**date** | **OffsetDateTime** | UTC date when endpoint real user test took place (ISO date-time format). |  [optional] [readonly] |
|**id** | **String** | Endpoint real user test ID. Each endpoint real user test occurrence has a unique ID. |  [optional] [readonly] |
|**roundId** | **Integer** | Epoch time (seconds) indicating the start time of the round. |  [optional] [readonly] |
|**destination** | [**NetworkMetrics**](NetworkMetrics.md) |  |  [optional] |
|**vpn** | [**NetworkMetrics**](NetworkMetrics.md) |  |  [optional] |
|**proxy** | [**NetworkMetrics**](NetworkMetrics.md) |  |  [optional] |
|**systemMetrics** | [**SystemMetrics**](SystemMetrics.md) |  |  [optional] |



