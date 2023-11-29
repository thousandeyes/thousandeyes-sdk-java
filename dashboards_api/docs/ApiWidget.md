

# ApiWidget


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
|**agents** | **AgentWidgetType** |  |  [optional] |
|**show** | **AgentWidgetShow** |  |  [optional] |
|**dataSource** | **TimeseriesDatasource** |  |  [optional] |
|**alertTypes** | **Set&lt;ApiAlertListAlertType&gt;** | List of alert types configured in the widget, an empty list means all alert types. |  [optional] |
|**limitTo** | **Integer** | Limit the number of alerts displayed in the widget. |  [optional] |
|**activeWithin** | [**ApiAlertListWidgetAllOfActiveWithin**](ApiAlertListWidgetAllOfActiveWithin.md) |  |  [optional] |
|**minScale** | **Float** | Mininum scale configured in the widget. |  [optional] |
|**maxScale** | **Float** | Maximum scale configured in the widget. |  [optional] |
|**unit** | **ApiWidgetFixedYScalePrefix** |  |  [optional] |
|**groupBy** | **ApiAggregateProperty** |  |  [optional] |
|**cards** | **ApiAggregateProperty** |  |  [optional] |
|**groupCardsBy** | **ApiAggregateProperty** |  |  [optional] |
|**columns** | **Integer** | Number of columns: 1 or 2. |  [optional] |
|**limit** | **Integer** | Limit configured in the widget. |  [optional] |
|**sortBy** | **WidgetSortProperty** |  |  [optional] |
|**sortDirection** | **WidgetSortDirection** |  |  [optional] |
|**isGeoMapPerTest** | **Boolean** | Indicates whether a separate map is displayed for each test within the widget. When set to true, individual maps are generated. |  [optional] |
|**axisGroupBy** | **ApiAggregateProperty** |  |  [optional] |
|**showLabels** | **Boolean** |  |  [optional] |
|**isHorizontalBarChart** | **Boolean** | Set to &#x60;true&#x60; to display bars horizontally in the widget. |  [optional] |
|**compareToPreviousValue** | **Boolean** |  |  [optional] |
|**rowGroupBy** | **ApiAggregateProperty** |  |  [optional] |
|**multiMetricColumns** | [**List&lt;ApiMultiMetricColumn&gt;**](ApiMultiMetricColumn.md) |  |  [optional] |
|**numberCards** | [**List&lt;ApiNumbersCard&gt;**](ApiNumbersCard.md) |  |  [optional] |
|**columnGroupBy** | **ApiAggregateProperty** |  |  [optional] |
|**filter** | [**ApiWidgetFilterApiTestTableFilterKey**](ApiWidgetFilterApiTestTableFilterKey.md) |  |  [optional] |
|**exclude** | [**ApiWidgetFilterApiTestTableFilterKey**](ApiWidgetFilterApiTestTableFilterKey.md) |  |  [optional] |
|**showTimeseriesOverallBaseline** | **Boolean** | Displays the overall baseline if set to &#x60;true&#x60;. |  [optional] |
|**isTimeseriesOneChartPerLine** | **Boolean** | Displays a separate chart for each line if set to &#x60;true&#x60;. |  [optional] |



