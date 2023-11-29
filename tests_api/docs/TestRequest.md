

# TestRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**labels** | **List&lt;String&gt;** | Contains list of test label IDs (get &#x60;labelId&#x60; from &#x60;/labels&#x60; endpoint) |  [optional] |
|**sharedWithAccounts** | **List&lt;String&gt;** | Contains list of account group IDs. Test is shared with the listed account groups (get &#x60;aid&#x60; from &#x60;/account-groups&#x60; endpoint) |  [optional] |
|**alertRules** | **List&lt;String&gt;** | List of alert rules IDs to apply to the test (get &#x60;ruleId&#x60; from &#x60;/alerts/rules&#x60; endpoint. If &#x60;alertsEnabled&#x60; is set to &#x60;true&#x60; and &#x60;alertRules&#x60; is not included on test creation or update, applicable user default alert rules will be used) |  [optional] |
|**agents** | [**List&lt;TestRequestAllOfAgents&gt;**](TestRequestAllOfAgents.md) | Contains list of object with required &#x60;agentId&#x60; and optional &#x60;sourceIpAddress&#x60; |  [optional] |



