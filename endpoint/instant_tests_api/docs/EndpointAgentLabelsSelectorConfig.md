

# EndpointAgentLabelsSelectorConfig

Agent labels selection object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agentSelectorType** | **AgentLabelsSelectorType** |  |  [optional] |
|**maxMachines** | **Integer** | Maximum number of agents which can execute the test. |  [optional] |
|**endpointAgentLabels** | **List&lt;String&gt;** | List of endpoint agent label IDs (obtained from &#x60;/endpoint/labels&#x60; endpoint), required when &#x60;agentSelectorType&#x60; is set to &#x60;agent-labels&#x60;. |  [optional] |



