

# EndpointTest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**links** | [**EndpointTestLinks**](EndpointTestLinks.md) |  |  [optional] |
|**agentSelectorConfig** | [**EndpointAgentSelectorConfig**](EndpointAgentSelectorConfig.md) |  |  [optional] |
|**createdDate** | **OffsetDateTime** | UTC created date (ISO date-time format). |  [optional] [readonly] |
|**interval** | **TestInterval** |  |  [optional] |
|**isEnabled** | [**Boolean**](Boolean.md) |  |  [optional] |
|**isSavedEvent** | [**Boolean**](Boolean.md) |  |  [optional] |
|**hasPathTraceInSession** | **Boolean** | Enables \&quot;in session\&quot; path trace. When enabled, this option initiates a TCP session with the target server and sends path trace packets within the established TCP session. |  [optional] |
|**modifiedDate** | **OffsetDateTime** | UTC last modification date (ISO date-time format). |  [optional] [readonly] |
|**networkMeasurements** | **Boolean** | Enable or disable network measurements. Set to true to enable or false to disable network measurements. |  [optional] |
|**port** | **Integer** | Port number, if not specified, the port is selected based on a protocol (HTTP 80, HTTPS 443). |  [optional] |
|**protocol** | **EndpointTestProtocol** |  |  [optional] |
|**server** | **String** | Target domain name or IP address. |  [optional] |
|**testId** | **String** | Each test is assigned a unique ID to access test data from other endpoints. |  [optional] [readonly] |
|**aid** | [**EndpointTestAid**](EndpointTestAid.md) |  |  [optional] |
|**testName** | **String** | Name of the test. |  [optional] |
|**type** | **EndpointScheduledTestType** |  |  [optional] |



