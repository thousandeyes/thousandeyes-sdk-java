

# GetDynamicTestDetail200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**links** | [**SelfLinksLinks**](SelfLinksLinks.md) |  |  [optional] |
|**agentSelectorConfig** | [**EndpointAgentSelectorConfig**](EndpointAgentSelectorConfig.md) |  |  [optional] |
|**application** | **DynamicTestApplication** |  |  [optional] |
|**createdDate** | **OffsetDateTime** | UTC created date (ISO date-time format). |  [optional] [readonly] |
|**interval** | **TestInterval** |  |  [optional] |
|**isEnabled** | [**DynamicTestIsEnabled**](DynamicTestIsEnabled.md) |  |  [optional] |
|**hasPathTraceInSession** | [**DynamicTestHasPathTraceInSession**](DynamicTestHasPathTraceInSession.md) |  |  [optional] |
|**hasPing** | **Boolean** | Optional flag indicating if the test should run ping. |  [optional] |
|**hasTraceroute** | **Boolean** | Optional flag indicating if the test should run traceroute. |  [optional] |
|**modifiedDate** | **OffsetDateTime** | UTC last modification date (ISO date-time format). |  [optional] [readonly] |
|**networkMeasurements** | [**DynamicTestNetworkMeasurements**](DynamicTestNetworkMeasurements.md) |  |  [optional] |
|**protocol** | **EndpointTestProtocol** |  |  [optional] |
|**tcpProbeMode** | [**DynamicTestTcpProbeMode**](DynamicTestTcpProbeMode.md) |  |  [optional] |
|**testId** | **String** | Each test is assigned a unique ID; this is used to access test information and results from other endpoints. |  [optional] [readonly] |
|**aid** | [**EndpointTestAid**](EndpointTestAid.md) |  |  [optional] |
|**testName** | **String** | Name of the test. |  [optional] |



