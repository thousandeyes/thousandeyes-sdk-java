

# ApiWidgetsDataV2

Data of a widget.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cards** | [**List&lt;ApiNumbersCardData&gt;**](ApiNumbersCardData.md) |  |  [optional] |
|**columns** | [**List&lt;ApiMultiMetricColumnData&gt;**](ApiMultiMetricColumnData.md) |  |  [optional] |
|**points** | [**List&lt;ApiWidgetDataPoint&gt;**](ApiWidgetDataPoint.md) |  |  [optional] |
|**tests** | [**List&lt;ApiTestTableData&gt;**](ApiTestTableData.md) |  |  [optional] |
|**startRound** | **Long** | Epoch time (seconds) indicating the start time of the round. |  [optional] |
|**alertSuppressionWindows** | [**List&lt;ApiDashboardAsw&gt;**](ApiDashboardAsw.md) |  |  [optional] |
|**totalAlerts** | **Long** | Total number of active alerts within configured timespan. |  [optional] |
|**activeAlerts** | **Long** | Total number of currently active alerts. |  [optional] |
|**alerts** | [**List&lt;ApiAlertListAlert&gt;**](ApiAlertListAlert.md) |  |  [optional] |
|**summary** | [**ApiAgentStatusSummary**](ApiAgentStatusSummary.md) |  |  [optional] |
|**agents** | [**List&lt;ApiAgentStatusAgent&gt;**](ApiAgentStatusAgent.md) |  |  [optional] |
|**status** | **String** | Message for not fully configured card or no data. |  [optional] |



