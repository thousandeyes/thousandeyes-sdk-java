

# ApiNumbersCard

An individual number card within the numbers card widget.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**minScale** | **Float** | Mininum scale configured in the widget. |  [optional] |
|**maxScale** | **Float** | Maximum scale configured in the widget. |  [optional] |
|**unit** | **ApiWidgetFixedYScalePrefix** |  |  [optional] |
|**id** | **String** | Identifier of the widget. |  [optional] |
|**description** | **String** | Description of the number card. |  [optional] |
|**measure** | [**ApiWidgetMeasure**](ApiWidgetMeasure.md) |  |  [optional] |
|**compareToPreviousValue** | **Boolean** |  |  [optional] |
|**fixedTimespan** | [**ApiNumbersCardAllOfFixedTimespan**](ApiNumbersCardAllOfFixedTimespan.md) |  |  [optional] |
|**shouldExcludeAlertSuppressionWindows** | **Boolean** | Excludes alert suppression windows from the widget when set to &#x60;true&#x60;. |  [optional] |
|**dataSource** | **NumbersCardDatasource** |  |  [optional] |
|**metricGroup** | **MetricGroup** |  |  [optional] |
|**direction** | **DashboardMetricDirection** |  |  [optional] |
|**metric** | **DashboardMetric** |  |  [optional] |
|**filters** | **Map&lt;String, Set&lt;Object&gt;&gt;** | Filters to apply to the widget. |  [optional] |



