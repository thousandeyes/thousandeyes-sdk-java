

# EndpointRealUserTest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agentId** | **UUID** | Unique ID of endpoint agent, from &#x60;/endpoint/agents&#x60; endpoint. |  [optional] [readonly] |
|**committed** | **OffsetDateTime** | UTC date when endpoint real user test was committed to the controller (ISO date-time format). |  [optional] [readonly] |
|**date** | **OffsetDateTime** | UTC date when endpoint real user test took place (ISO date-time format). |  [optional] [readonly] |
|**experienceScore** | **Double** | Score rating a user’s experience when loading a particular page, from 0 (the worst) to 1 (the best). [More details](https://docs.thousandeyes.com/product-documentation/end-user-monitoring/viewing-data/endpoint-agent-views-reference#user-experience-score). |  [optional] [readonly] |
|**numberOfPages** | **Integer** | Number of web pages visited on target website. |  [optional] [readonly] |
|**organizationName** | **String** | Name of the AS organization &#x60;sourceAddress&#x60; belongs to. |  [optional] [readonly] |
|**port** | **Integer** | Port used to visit target website. |  [optional] [readonly] |
|**protocol** | **String** | Protocol used to visit target website. |  [optional] [readonly] |
|**roundId** | **Integer** | Epoch time (seconds) indicating the start time of the round. |  [optional] [readonly] |
|**sourceAddress** | **String** | Public IP address of the endpoint agent during the session. |  [optional] [readonly] |
|**id** | **String** | Endpoint real user test ID. Each endpoint real user test occurrence has a unique ID. |  [optional] [readonly] |
|**visitedSite** | **String** | Domain used to visit target website. |  [optional] [readonly] |
|**pageId** | **String** | Web page ID. The page ID is unique only within an endpoint real user test. |  [optional] [readonly] |



