

# UsageUsageQuota


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**monthStart** | **OffsetDateTime** | Beginning of usage period in UTC (ISO date-time format). |  [optional] |
|**monthEnd** | **OffsetDateTime** | End of usage period in UTC (ISO date-time format).. |  [optional] |
|**cloudUnitsIncluded** | **Long** | Monthly number of cloud units allocated, as part of the contract. |  [optional] |
|**endpointAgentsIncluded** | **Long** | Monthly number of endpoint agents allocated, as part of the contract. |  [optional] |
|**endpointAgentsEssentialsIncluded** | **Long** | Monthly number of endpoint agents essentials allocated, as part of the contract. |  [optional] |
|**endpointAgentsEmbeddedIncluded** | **Long** | Number of embedded endpoint agents allocated monthly, as specified in the contract. |  [optional] |
|**enterpriseAgentsIncluded** | **Long** | Monthly number of enterprise agents allocated, as part of the contract. Returns non-zero value only for organizations with legacy billing. |  [optional] |



