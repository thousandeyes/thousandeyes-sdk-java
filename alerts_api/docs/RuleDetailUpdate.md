

# RuleDetailUpdate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ruleId** | **String** | Unique ID of the rule. |  [optional] [readonly] |
|**ruleName** | **String** | Name of the alert rule. |  |
|**expression** | **String** | The expression of the alert rule. |  |
|**direction** | **TestDirection** |  |  [optional] |
|**notifyOnClear** | **Boolean** | Send notification when alert clears. |  [optional] |
|**isDefault** | **Boolean** | If set to &#x60;true&#x60;, this alert rule becomes the default for its test type and is automatically applied to newly created tests with relevant metrics. Only one default alert rule is allowed per test type. |  [optional] |
|**alertType** | **AlertType** |  |  |
|**minimumSources** | **Integer** | The minimum number of agents or monitors that must meet the specified criteria to trigger the alert. |  [optional] |
|**minimumSourcesPct** | **Integer** | The minimum percentage of all assigned agents or monitors that must meet the specified criteria to trigger the alert. |  [optional] |
|**roundsViolatingMode** | **AlertRoundsViolationMode** |  |  [optional] |
|**roundsViolatingOutOf** | **Integer** | Specifies the divisor (y value) in the “X of Y times” condition. |  |
|**roundsViolatingRequired** | **Integer** | Specifies the numerator (x value) in the “X of Y times” condition. |  |
|**includeCoveredPrefixes** | **Boolean** | Set true to include covered prefixes in the BGP alert rule. Only applicable to BGP alert rules. |  [optional] |
|**severity** | **Severity** |  |  [optional] |
|**notifications** | [**Notification**](Notification.md) |  |  [optional] |
|**testIds** | **List&lt;String&gt;** | Array of test IDs to link to alert rule (get &#x60;testId&#x60; from &#x60;/tests&#x60; endpoint). |  [optional] |



