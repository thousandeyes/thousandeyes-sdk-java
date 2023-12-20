

# EndpointAgentSelectorConfig

Agents selection object based on agentSelectorType.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agentSelectorType** | **SpecificAgentsSelectorType** |  |  [optional] |
|**maxMachines** | **Integer** | Maximum number of agents which can execute the test. |  [optional] |
|**endpointAgentLabels** | **List&lt;String&gt;** | List of endpoint agent label IDs (obtained from &#x60;/endpoint/labels&#x60; endpoint), required when &#x60;agentSelectorType&#x60; is set to &#x60;agent-labels&#x60;. |  [optional] |
|**agents** | **List&lt;UUID&gt;** | List of endpoint agent IDs (obtained from &#x60;/endpoint/agents&#x60; endpoint). Required when &#x60;agentSelectorType&#x60; is set to &#x60;specific-agent&#x60;. |  [optional] |



