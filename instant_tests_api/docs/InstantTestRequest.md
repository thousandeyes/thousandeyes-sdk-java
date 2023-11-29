

# InstantTestRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**labels** | **List&lt;String&gt;** | A list of test label identifiers (get &#x60;labelId&#x60; from &#x60;/labels&#x60; endpoint). |  [optional] |
|**sharedWithAccounts** | **List&lt;String&gt;** | A list of account group identifiers that the test is shared with (get &#x60;aid&#x60; from &#x60;/account-groups&#x60; endpoint). |  [optional] |
|**agents** | [**List&lt;InstantTestRequestAgentsInner&gt;**](InstantTestRequestAgentsInner.md) | A list of objects with &#x60;agentId&#x60; (required) and &#x60;sourceIpAddress&#x60; (optional). |  [optional] |



