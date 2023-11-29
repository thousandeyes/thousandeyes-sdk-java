

# UsageUsage


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**quota** | [**UsageUsageQuota**](UsageUsageQuota.md) |  |  [optional] |
|**cloudUnitsUsed** | **Long** | Number of cloud units consumed thus far in the usage period. |  [optional] |
|**cloudUnitsProjected** | **Long** | Number of cloud units projected in the current usage period, based on units consumed to date and configuration of enabled tests. This value is updated hourly. |  [optional] |
|**cloudUnitsNextBillingPeriod** | **Long** | Number of cloud units projected in the upcoming usage period, based on configuration of enabled tests. This value is updated hourly. |  [optional] |
|**enterpriseUnitsUsed** | **Long** | Number of enterprise units consumed in the usage period. Returns non-zero value only for organizations with metered billing. |  [optional] |
|**enterpriseUnitsProjected** | **Long** | Number of enterprise units projected in the current usage period, based on units consumed to date and configuration of enabled tests. This value is updated hourly. Returns non-zero value only for organizations with metered billing. |  [optional] |
|**enterpriseUnitsNextBillingPeriod** | **Long** | Number of enterprise units projected in the upcoming usage period, based on configuration of enabled tests. This value is updated hourly. Returns non-zero value only for organizations with metered billing. |  [optional] |
|**endpointAgentsUsed** | **Long** | Number of endpoint agents used in the current usage period. This number is calculated by taking the maximum number of agents enabled for any one-hour period in the usage period. Disabled agents are excluded from this calculation. |  [optional] |
|**endpointAgentsEssentialsUsed** | **Long** | Number of endpoint agents essentials used in the current usage period. This number is calculated by taking the maximum number of agents enabled for any one-hour period in the usage period. Disabled agents are excluded from this calculation. |  [optional] |
|**endpointAgentsEmbeddedUsed** | **Long** | Number of embedded endpoint agents used in the current usage period. This number is calculated by taking the maximum number of agents enabled for any one-hour period in the usage period. Disabled agents are excluded from this calculation. |  [optional] |
|**enterpriseAgentsUsed** | **Long** | Number of enterprise agents used in the current usage period. This number is calculated by taking the maximum number of agents enabled for any one-hour period in the usage period. Disabled agents are excluded from this calculation. |  [optional] |
|**enterpriseAgentUnits** | [**List&lt;EnterpriseAgentUnitsInner&gt;**](EnterpriseAgentUnitsInner.md) | A breakdown of enterprise unit consumption for each agent during the current monthly period. Each entry provides data for both the current actual usage and the projected usage. Returns non-zero values for organizations with metered billing. |  [optional] |
|**tests** | [**List&lt;TestsInner&gt;**](TestsInner.md) | A breakdown of unit consumption for each test during the current monthly period. Each entry provides information about both the current actual usage and the projected usage. |  [optional] |
|**endpointAgents** | [**List&lt;EndpointAgentsInner&gt;**](EndpointAgentsInner.md) | Endpoint agents used by account group. |  [optional] |
|**endpointAgentsEssentials** | [**List&lt;EndpointAgentsEssentialsInner&gt;**](EndpointAgentsEssentialsInner.md) | Endpoint agents essentials used by account group. |  [optional] |
|**endpointAgentsEmbedded** | [**List&lt;EndpointAgentsEmbeddedInner&gt;**](EndpointAgentsEmbeddedInner.md) | Endpoint agents embedded used by account group. |  [optional] |
|**enterpriseAgents** | [**List&lt;EnterpriseAgentsInner&gt;**](EnterpriseAgentsInner.md) | Enterprise agents used by account group. |  [optional] |



