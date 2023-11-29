

# ApiAlertListAlert

Alert shown in the alert list widget.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**alertId** | **String** | Identifier of the alert. |  [optional] |
|**testId** | **String** | Identifier of the test. |  [optional] |
|**ruleId** | **String** | Identifier of the rule. |  [optional] |
|**alertSource** | **String** | Name of the agent, monitor or device producing the alert. |  [optional] |
|**alertRule** | **String** | Name of the alert rule that this alert belongs to. |  [optional] |
|**alertType** | **ApiAlertListAlertType** |  |  [optional] |
|**startTime** | **OffsetDateTime** | UTC date when the alert was first active. |  [optional] |
|**durationInSeconds** | **Long** | Number of seconds the alert was active. If it’s still active, this number will increase every second. |  [optional] |
|**active** | **Boolean** | Set to &#x60;true&#x60; if alert is active, &#x60;false&#x60; otherwise. |  [optional] |



