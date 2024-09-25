package com.thousandeyes.sdk.client;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.fasterxml.jackson.databind.ObjectMapper;



@ExtendWith(MockitoExtension.class)
class NativeApiClientTest {
    @Mock
    private HttpResponse<InputStream> httpResponse;
    @Mock
    private HttpClient httpClient;
    @Mock
    private HttpClient.Builder httpClientBuilder;
    private final ObjectMapper objectMapper = new ObjectMapper()
            .findAndRegisterModules();
    private ApiClient apiClient;

    public static Stream<Arguments> invalidRequestProvider() {
        return Stream.of(
                Arguments.of(IOException.class),
                Arguments.of(InterruptedException.class)
        );
    }

    @BeforeEach
    public void setUp() {
        doReturn(httpClient)
                .when(httpClientBuilder)
                .build();
        
        apiClient = NativeApiClient.builder()
                                   .baseUri("http://localhost")
                                   .httpClientBuilder(httpClientBuilder)
                                   .mapper(objectMapper)
                                   .build();
    }

    public static Stream<Arguments> validRequestProvider() {
        return Stream.of(
                Arguments.of("GET with query params and headers",
                             baseRequestBuilder()
                                     .queryParams(List.of(Pair.of("aid", "33")))
                                     .build()),
                Arguments.of("POST with body and headers",
                             baseRequestBuilder()
                                     .method("POST")
                                     .header("content-type", List.of("application/json"))
                                     .queryParams(List.of(Pair.of("aid", "33")))
                                     .requestBody(new Request("name", 1))
                                     .build()),
                Arguments.of("POST with string body",
                             baseRequestBuilder()
                                     .method("POST")
                                     .requestBody("a String")
                                     .build()),
                Arguments.of("DELETE without query params, body and headers",
                             baseRequestBuilder()
                                     .method("DELETE")
                                     .build())
        );
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("validRequestProvider")
    void shouldSendRequestCorrectly(String testName, ApiRequest request)
            throws ApiException, IOException, InterruptedException
    {
        var expectedResponse = new Response("name", OffsetDateTime.now(ZoneId.of("UTC")));
        stubHttpClient(expectedResponse);

        var response = apiClient.send(request, Response.class);

        assertEquals(expectedResponse, response.getData());
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("validRequestProvider")
    void shouldSendRequestForListCorrectly(String testName, ApiRequest request)
            throws ApiException, IOException, InterruptedException
    {
        var expectedResponse = List.of(new Response("name", OffsetDateTime.now(ZoneId.of("UTC"))));
        stubHttpClient(expectedResponse);

        var response = apiClient.sendForList(request, Response.class);

        assertEquals(expectedResponse, response.getData());
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("invalidRequestProvider")
    void shouldThrowWhenHttpClientThrows(Class<Throwable> expectedException)
            throws IOException, InterruptedException
    {
        var request = baseRequestBuilder().build();
        stubHttpClient(expectedException);

        var exception = assertThrows(ApiException.class,
                                     () -> apiClient.send(request, Response.class));

        assertEquals(expectedException, exception.getCause().getClass());
    }

    @ParameterizedTest(name = "{0}")
    @ValueSource(ints = { 400, 401, 403, 404, 500, 502, 503 })
    void shouldThrowWhenHttpClientResponseNot2xx(int statusCode)
            throws IOException, InterruptedException
    {
        var request = baseRequestBuilder().build();
        var expectedResponse = List.of(new Response("name", OffsetDateTime.now(ZoneId.of("UTC"))));
        stubHttpClient(expectedResponse, statusCode);

        var exception = assertThrows(ApiException.class,
                                     () -> apiClient.send(request, Response.class));

        assertEquals(statusCode, exception.getCode());
    }

    private void stubHttpClient(Class<Throwable> expectedException) throws IOException,
                                                                           InterruptedException
    {
        doThrow(expectedException)
                .when(httpClient)
                .send(any(), any());
    }

    private <T> void stubHttpClient(T expectedResponse) throws IOException,
                                                               InterruptedException
    {
        stubHttpClient(expectedResponse, 200);
    }

    private <T> void stubHttpClient(T expectedResponse, int statusCode) throws IOException,
                                                                               InterruptedException
    {
        var expectedResponseBytes = objectMapper.writeValueAsBytes(expectedResponse);
        var body = new ByteArrayInputStream(expectedResponseBytes);
        doReturn(body)
                .when(httpResponse)
                .body();
        var headers = HttpHeaders.of(Map.of(), (s, s2) -> true);
        doReturn(headers)
                .when(httpResponse)
                .headers();
        doReturn(statusCode)
                .when(httpResponse)
                .statusCode();
        doReturn(httpResponse)
                .when(httpClient)
                .send(any(), any());
    }

    private static ApiRequest.ApiRequestBuilder baseRequestBuilder() {
        return ApiRequest.builder()
                         .method("GET")
                         .path("/account-groups")
                         .readTimeout(Duration.ofSeconds(2));
    }

    private record Request(String name, Integer interval) {
    }



    private record Response(String name, OffsetDateTime dateTime) {
    }
}
