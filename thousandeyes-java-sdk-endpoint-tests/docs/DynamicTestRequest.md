

# DynamicTestRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**links** | [**DynamicTestLinks**](DynamicTestLinks.md) |  |  [optional] |
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
|**agentSelectorType** | **EndpointTestAgentSelectorType** |  |  [optional] |
|**agents** | **List&lt;UUID&gt;** | List of endpoint agent IDs (obtained from &#x60;/endpoint/agents&#x60; endpoint). Required when &#x60;agentSelectorType&#x60; is set to &#x60;specific-agent&#x60;. |  [optional] |
|**endpointAgentLabels** | **List&lt;String&gt;** | List of endpoint agent label IDs (obtained from &#x60;/endpoint/labels&#x60; endpoint), required when &#x60;agentSelectorType&#x60; is set to &#x60;agent-labels&#x60;. |  [optional] |
|**maxMachines** | **Integer** | Maximum number of agents which can execute this test. |  [optional] |



