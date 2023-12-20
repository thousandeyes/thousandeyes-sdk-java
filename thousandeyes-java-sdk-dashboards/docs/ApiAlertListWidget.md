

# ApiAlertListWidget


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
|**alertTypes** | **Set&lt;ApiAlertListAlertType&gt;** | List of alert types configured in the widget, an empty list means all alert types. |  [optional] |
|**limitTo** | **Integer** | Limit the number of alerts displayed in the widget. |  [optional] |
|**activeWithin** | [**ApiAlertListWidgetAllOfActiveWithin**](ApiAlertListWidgetAllOfActiveWithin.md) |  |  [optional] |
|**dataSource** | **AlertListDatasource** |  |  [optional] |



