

# ApiStackedAreaChartWidget

Displays line plots over time, stacking quantities vertically to showcase cumulative data trends, similar to stacked bar charts. Ideal for visualizing changes in response times, error counts, and other metrics, revealing the progression of values across a timeline. Use this chart to replace stacked bar charts for temporal data analysis.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Identifier of the widget. |  [optional] |
|**type** | **WidgetType** |  |  [optional] |
|**title** | **String** | Title of the widget |  [optional] |
|**visualMode** | **VisualMode** |  |  [optional] |
|**embedUrl** | **String** | When &#x60;isEmbedded&#x60; is set to &#x60;true&#x60;, an &#x60;embedUrl&#x60; is provided. |  [optional] [readonly] |
|**isEmbedded** | **Boolean** | Set to &#x60;true&#x60; if widget is marked as embedded; otherwise, set to &#x60;false&#x60;. |  [optional] |
|**metricGroup** | **MetricGroup** |  |  [optional] |
|**direction** | **DashboardMetricDirection** |  |  [optional] |
|**metric** | **DashboardMetric** |  |  [optional] |
|**filters** | **Map&lt;String, Set&lt;Object&gt;&gt;** | (Optional) Specifies the filters applied to the widget. When present, the &#x60;filters&#x60; property displays. Each filter object has two properties: &#x60;filterProperty&#x60; and &#x60;filterValue&#x60;. The &#x60;filterProperty&#x60; can be values like Agents, Agent Groups, Tests, Monitors, etc. The &#x60;filterValue&#x60; represents theIdentifierof the selected property. |  [optional] |
|**measure** | [**ApiWidgetMeasure**](ApiWidgetMeasure.md) |  |  [optional] |
|**fixedTimespan** | [**ApiDuration**](ApiDuration.md) |  |  [optional] |
|**apiLink** | **String** |  |  [optional] [readonly] |
|**shouldExcludeAlertSuppressionWindows** | **Boolean** | Excludes alert suppression window data if set to &#x60;true&#x60;. |  [optional] |
|**links** | [**SelfLinksLinks**](SelfLinksLinks.md) |  |  [optional] |
|**minScale** | **Float** | Mininum scale configured in the widget. |  [optional] |
|**maxScale** | **Float** | Maximum scale configured in the widget. |  [optional] |
|**unit** | **ApiWidgetFixedYScalePrefix** |  |  [optional] |
|**groupBy** | **ApiAggregateProperty** |  |  [optional] |
|**dataSource** | **StackedAreaChartDatasource** |  |  [optional] |



