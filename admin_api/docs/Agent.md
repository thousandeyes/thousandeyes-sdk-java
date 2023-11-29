

# Agent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ipAddresses** | **List&lt;String&gt;** | Array of private IP addresses. |  [optional] [readonly] |
|**publicIpAddresses** | **List&lt;String&gt;** | Array of public IP addresses. |  [optional] [readonly] |
|**network** | **String** | Network (including ASN) of agent’s public IP. |  [optional] [readonly] |
|**agentId** | **String** | Unique ID of the agent. |  [optional] [readonly] |
|**agentName** | **String** | Name of the agent. |  [optional] |
|**agentType** | **CloudEnterpriseAgentType** |  |  [optional] |
|**location** | **String** | Location of the agent. |  [optional] [readonly] |
|**countryId** | **String** | 2-digit ISO country code |  [optional] [readonly] |
|**enabled** | **Boolean** | Flag indicating if the agent is enabled. |  [optional] |
|**verifySslCertificates** | **Boolean** | Flag indicating if has normal SSL operations or  if instead it&#39;s set to ignore SSL errors on browserbot-based tests. |  [optional] [readonly] |



