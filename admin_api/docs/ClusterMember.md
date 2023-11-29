

# ClusterMember


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ipAddresses** | **List&lt;String&gt;** | Array of private IP addresses. |  [optional] [readonly] |
|**publicIpAddresses** | **List&lt;String&gt;** | Array of public IP addresses. |  [optional] [readonly] |
|**network** | **String** | Network (including ASN) of agent’s public IP. |  [optional] [readonly] |
|**memberId** | **String** | Unique ID of the cluster member |  [optional] [readonly] |
|**name** | **String** | Name of the cluster member |  [optional] [readonly] |
|**errorDetails** | [**List&lt;ErrorDetail&gt;**](ErrorDetail.md) | If an enterprise agent or a cluster member presents at least one error, the errors will be shown as an array of entries in the errorDetails field (Enterprise Agents and Enterprise Cluster members only) |  [optional] [readonly] |
|**lastSeen** | **OffsetDateTime** | UTC last seen date (ISO date-time format). |  [optional] [readonly] |
|**agentState** | **EnterpriseAgentState** |  |  [optional] |
|**targetForTests** | **String** | Test target IP address. |  [optional] |
|**utilization** | **Integer** | Shows overall utilization percentage (online Enterprise Agents and Enterprise Clusters only). |  [optional] [readonly] |



