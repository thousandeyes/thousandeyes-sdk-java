

# EndpointSpecificAgentsSelectorConfig

Specific agents selection object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agentSelectorType** | **SpecificAgentsSelectorType** |  |  [optional] |
|**maxMachines** | **Integer** | Maximum number of agents which can execute the test. |  [optional] |
|**agents** | **List&lt;UUID&gt;** | List of endpoint agent IDs (obtained from &#x60;/endpoint/agents&#x60; endpoint). Required when &#x60;agentSelectorType&#x60; is set to &#x60;specific-agent&#x60;. |  [optional] |



