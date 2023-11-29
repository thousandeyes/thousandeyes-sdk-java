

# ApiTimeseriesWidget

The Timeseries widget graphs data over time, with the chosen metric displayed on the vertical axis. vertical axis

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
|**showTimeseriesOverallBaseline** | **Boolean** | Displays the overall baseline if set to &#x60;true&#x60;. |  [optional] |
|**groupBy** | **ApiAggregateProperty** |  |  [optional] |
|**isTimeseriesOneChartPerLine** | **Boolean** | Displays a separate chart for each line if set to &#x60;true&#x60;. |  [optional] |
|**dataSource** | **TimeseriesDatasource** |  |  [optional] |



