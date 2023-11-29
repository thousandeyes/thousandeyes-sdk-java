

# RealUserTestPageResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pageId** | **String** | Web page ID. The page ID is unique only within an endpoint real user test. |  [optional] [readonly] |
|**pageTitle** | **String** | Web page title. |  [optional] [readonly] |
|**pageUrl** | **String** | Web page url |  [optional] [readonly] |
|**loadDate** | **OffsetDateTime** | UTC date when page load started (ISO date-time format). |  [optional] [readonly] |
|**responseCode** | **Integer** | HTTP response code. |  [optional] [readonly] |
|**pageTimings** | [**RealUserTestPagePageTimings**](RealUserTestPagePageTimings.md) |  |  [optional] |
|**agentId** | **UUID** | Unique ID of endpoint agent, from &#x60;/endpoint/agents&#x60; endpoint. |  [optional] [readonly] |
|**id** | **String** | Endpoint real user test ID. Each endpoint real user test occurrence has a unique ID. |  [optional] [readonly] |
|**roundId** | **Integer** | Epoch time (seconds) indicating the start time of the round. |  [optional] [readonly] |
|**responseTime** | **Integer** | HTTP server response in milliseconds. |  [optional] [readonly] |
|**systemMetrics** | [**SystemMetrics**](SystemMetrics.md) |  |  [optional] |



