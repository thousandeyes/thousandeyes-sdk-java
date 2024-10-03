# client

This project contains an interface which all created API Clients should conform with - the native
Java
client [client-native](https://github.com/thousandeyes/thousandeyes-sdk-java/tree/main/core/client-native)
shipped alongside this project is an example of such implementation.

It also contains several utility Classes, namely `RateLimitDecorator` that can be used to make sure
the requests getting Rate Limited (HTTP response status code == 429) are automatically retried after
waiting the appropriate amount of time. E.g:

````java
class Example {
    private static final ApiClient apiClient = NativeApiClient
            .builder()
            .baseUri("https://api.stg.thousandeyes.com")
            .bearerToken("<token>")
            .build();

    public static void main(String[] args) {
        var rlApiClient = new RateLimitDecorator(apiClient);
        UsersApi apiInstance = new UsersApi(rlApiClient);
        try {
            var users = apiInstance.getUsers(aid);
        }
        catch (ApiException e) {
            //Treat exception
        }
    }

}
````


# Paginator

The `Paginator` class provides a way to handle paginated API responses in a convenient and efficient manner. It allows you to iterate through all items across multiple pages of results without having to manually handle the pagination logic.

## Usage

To use the `Paginator` class, you need to provide a `PaginatedApiCall` and a `dataExtractor` function. The `PaginatedApiCall` is a functional interface that defines the API call to fetch a page of results, and the `dataExtractor` function extracts the list of items from the API response.

```java
import com.thousandeyes.sdk.pagination.Paginator;
import com.thousandeyes.sdk.client.ApiException;

import java.util.List;
import java.util.stream.Collectors;

class Example {
    private static final ApiClient apiClient = NativeApiClient
            .builder()
            .baseUri("https://api.stg.thousandeyes.com")
            .bearerToken("<token>")
            .build();

    public static void main(String[] args) {
        var rlApiClient = new RateLimitDecorator(apiClient);
        // Creates the API as you would normally
        DashboardsApi apiInstance = new DashboardsApi(rlApiClient);
        
        // Define the API call to fetch a page of results
        PaginatedApiCall<ApiWidgetDataResponse> apiCall = cursor -> apiInstance.getDashboardWidgetData("dashboardId", null, null, null, null, null, null, cursor, "widgetId", null);

        // Define a function to extract the list of items from the API response
        Paginator<ApiTestTableData, ApiWidgetDataResponse> paginator = new Paginator<>(apiCall, r -> r.getData().getTests());

        // Iterate through all items across multiple pages of results
        paginator.stream().limit(200).forEach(System.out::println);
    }
}
```

## Built-in Pagination Support
Some APIs have built-in support for pagination, the API class exposes a method that will return the `Paginator` object for you. For example, the `EndpointAgentsApi` class has a `getEndpointAgentsPaginated` method that returns a `Paginator` object for fetching paginated endpoint agents.


