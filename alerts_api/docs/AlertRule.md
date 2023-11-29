

# AlertRule


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ruleId** | **String** | Unique ID of the rule |  [optional] [readonly] |
|**ruleName** | **String** | Name of the alert rule |  [optional] [readonly] |
|**expression** | **String** | String expression of alert rule |  [optional] [readonly] |
|**direction** | **TestDirection** |  |  [optional] |
|**isDefault** | **Boolean** | Alert rules allow up to 1 alert rule to be selected as a default for each type. By checking the default option, this alert rule will be automatically included on subsequently created tests that test a metric used in alerting here |  [optional] [readonly] |
|**alertType** | **AlertType** |  |  [optional] |
|**minimumSources** | **Integer** | The minimum number of agents or monitors that must meet the specified criteria in order to trigger the alert |  [optional] [readonly] |
|**minimumSourcesPct** | **Integer** | the minimum percentage of all assigned agents or monitors that must meet the specified criteria in order to trigger the alert |  [optional] [readonly] |
|**roundsViolatingMode** | **AlertRoundsViolationMode** |  |  [optional] |
|**roundsViolatingOutOf** | **Integer** | Specifies the divisor (y value) for the “X of Y times” condition. |  [optional] [readonly] |
|**roundsViolatingRequired** | **Integer** | Specifies the numerator (x value) for the “X of Y times” condition |  [optional] [readonly] |



