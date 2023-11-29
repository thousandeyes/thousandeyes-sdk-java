

# BgpTestRouteInformationResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**date** | **OffsetDateTime** | Data point date UTC (ISO date-time format). |  [optional] [readonly] |
|**roundId** | **Integer** | Epoch time (seconds) indicating the start time of the round |  [optional] [readonly] |
|**links** | **Object** |  |  [optional] |
|**monitor** | [**Monitor**](Monitor.md) |  |  [optional] |
|**prefixId** | **String** | Internally tracked prefix ID. |  [optional] |
|**prefix** | **String** | Prefix being tracked. |  [optional] |
|**isActive** | **Boolean** | Represents whether the route is active or inactive. An inactive route was an active route in the previous test round and is now superseded by another active (preferred) route. When requesting data for the test round in which a route change happened, both routes (active and inactive one) are included in the response. |  [optional] |
|**hops** | [**List&lt;BgpHop&gt;**](BgpHop.md) |  |  [optional] |



