

# EnterpriseAgentUnitsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**aid** | **Object** | Unique identifier of the account group owning the enterprise agent units. |  [optional] |
|**accountGroupName** | **Object** | Name of the account group which owns the enterprise agent units. |  [optional] |
|**agentId** | **String** | Unique identifier of the enterprise agent generating usage. |  [optional] |
|**agentName** | **String** | Name of the enterprise agent generating usage. |  [optional] |
|**enterpriseUnitsUsed** | **Long** | Number of enterprise agent units owned by the specific account group in the usage period. |  [optional] |
|**enterpriseUnitsProjected** | **Long** | Number of enterprise units projected in the current usage period, based on units consumed to date and configuration of enabled tests. This value is updated hourly. Returns non-zero value only for organizations with metered billing. |  [optional] |
|**vagentId** | **String** | Unique identifier of the virtual agent generating usage |  [optional] |



