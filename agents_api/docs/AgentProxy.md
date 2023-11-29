

# AgentProxy


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**aid** | **String** | Account id that this proxy configuration belongs to |  [optional] |
|**authType** | **ProxyAuthType** |  |  [optional] |
|**bypassList** | **List&lt;String&gt;** | A list of hostnames, network prefixes, or wildcards used to determine which test targets should not be proxied. If all tests should be proxied, leave empty. |  [optional] |
|**lastModified** | **OffsetDateTime** | Last modification timestamp of the proxy. Expressed in UTC (ISO date-time format). |  [optional] |
|**location** | **String** | The location of the proxy. If proxyType is &#x60;static&#x60; use the format &#x60;hostname:port&#x60;. If location is &#x60;pac&#x60;, then specify the URL where the PAC file can be obtained. |  [optional] |
|**isLocalConfigured** | **Boolean** | Set to &#x60;true&#x60; if this proxy configuration comes from the agent’s config file. Specify &#x60;false&#x60; if the proxy configuration was created in the ThousandEyes application. |  [optional] |
|**name** | **String** | Expression of agent notification rule. |  [optional] |
|**password** | **String** | Password for proxy authentication |  [optional] |
|**proxyId** | **String** | Agent proxy&#39;s unique ID. |  [optional] |
|**type** | **ProxyType** |  |  [optional] |
|**user** | **String** | Username for proxy authentication. |  [optional] |



