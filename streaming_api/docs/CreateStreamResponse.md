

# CreateStreamResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The data stream ID |  [optional] [readonly] |
|**enabled** | **Boolean** | Flag to enable or disable the stream integration. |  [optional] |
|**links** | [**StreamResponseLinks**](StreamResponseLinks.md) |  |  [optional] |
|**type** | **StreamType** |  |  [optional] |
|**endpointType** | **EndpointType** |  |  [optional] |
|**streamEndpointUrl** | **String** | The URL ThousandEyes sends data stream to. For a URL to be valid, it needs to: - Be syntactically correct. - Be reachable. - Use the HTTPS protocol. - When using the &#x60;grpc&#x60; endpointType, streamEndpointUrl cannot contain paths:     - Valid . &#x60;grpc&#x60; - &#x60;https://example.com&#x60;     - Invalid . &#x60;grpc&#x60; - &#x60;https://example.com/collector&#x60;.     - Valid . &#x60;http&#x60; - &#x60;https://example.com/collector&#x60;.      - When using the &#x60;http&#x60; endpointType, the endpoint must match the exact final full URL (including the path if there is one) to which the metrics will be sent. Examples below:     - &#x60;https://api.honeycomb.io:443/v1/metrics&#x60;     - &#x60;https://ingest.eu0.signalfx.com/v2/datapoint/otlp&#x60; |  [optional] |
|**customHeaders** | **Map&lt;String, String&gt;** | Custom headers |  [optional] |
|**tagMatch** | [**List&lt;PutStreamTagMatchInner&gt;**](PutStreamTagMatchInner.md) | A collection of tags that determine what tests are included in the data stream. These tag values are also included as attributes in the data stream metrics. |  [optional] |
|**auditOperation** | [**AuditOperation**](AuditOperation.md) |  |  [optional] |



