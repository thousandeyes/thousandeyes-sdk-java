

# EndpointAgentToServerTestRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agentSelectorType** | **EndpointTestAgentSelectorType** |  |  |
|**agents** | **List&lt;UUID&gt;** | List of endpoint agent IDs (obtained from &#x60;/endpoint/agents&#x60; endpoint). Required when &#x60;agentSelectorType&#x60; is set to &#x60;specific-agent&#x60;. |  [optional] |
|**hasPing** | **Boolean** | Optional flag indicating if the test should run ping. |  [optional] |
|**hasTraceroute** | **Boolean** | Optional flag indicating if the test should run traceroute. |  [optional] |
|**endpointAgentLabels** | **List&lt;String&gt;** | List of endpoint agent label IDs (obtained from &#x60;/endpoint/labels&#x60; endpoint), required when &#x60;agentSelectorType&#x60; is set to &#x60;agent-labels&#x60;. |  [optional] |
|**maxMachines** | **Integer** | Maximum number of agents which can execute the test. |  |
|**port** | **Integer** | Port number, if not specified, the port is selected based on a protocol (HTTP 80, HTTPS 443). |  [optional] |
|**testName** | **String** | Name of the test. |  |
|**serverName** | **String** | A server address without a protocol or IP address. |  |
|**interval** | **TestInterval** |  |  |



