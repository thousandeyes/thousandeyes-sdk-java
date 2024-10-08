package com.thousandeyes.sdk.pagination;

import static com.thousandeyes.sdk.serialization.JSON.getDefault;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.pagination.PaginatedApi.Item;
import com.thousandeyes.sdk.pagination.PaginatedApi.PaginatedResponse;



public class PaginatorTest {

    private static PaginatedApi api;
    private static PaginatedResponse withNextLink = null;
    private static PaginatedResponse noNextLink = null;
    private static final ObjectMapper mapper = getDefault().getMapper();

    @BeforeAll
    public static void setup() throws IOException {
        var withNextLinkJson = readJson("with-next-link.json");
        var noNextLinkJson = readJson("no-next-link.json");

        withNextLink = mapper.readValue(withNextLinkJson, PaginatedResponse.class);
        noNextLink = mapper.readValue(noNextLinkJson, PaginatedResponse.class);
    }

    @BeforeEach
    public void mock() {
        api = Mockito.mock(PaginatedApi.class);
    }

    @Test
    void shouldCallNextLinkWhenNextLinkExists() throws ApiException {
        var aid = "1";
        var window = "1w";
        var cursor = "b2Zmc2V0PTUwMTIzMTc5";
        mockApiResponse(withNextLink, aid, window, null);
        mockApiResponse(noNextLink, aid, window, cursor);

        var paginator = buildPaginator(aid, window);
        var elements = paginator.stream().toList();

        assertEquals(4, elements.size());
        verify(api).getItems(aid, window, null);
        verify(api).getItems(aid, window, cursor);
        verifyNoMoreInteractions(api);
    }

    @ParameterizedTest
    @MethodSource("provideNoNextLinkResponses")
    void shouldNotMakeExtraCallsWhenThereIsNoNextLink(PaginatedResponse response)
            throws ApiException
    {
        var aid = "2";
        var window = "2d";
        mockApiResponse(response, aid, window, null);

        var paginator = buildPaginator(aid, window);
        var elements = paginator.stream().toList();

        assertEquals(2, elements.size());
        verify(api).getItems(aid, window, null);
        verifyNoMoreInteractions(api);
    }

    @Test
    void shouldPropagateExceptionWhenApiThrowsException() throws ApiException {
        var aid = "3";
        var window = "3h";
        doThrow(ApiException.class)
                .when(api)
                .getItems(aid, window, null);

        var paginator = buildPaginator(aid, window);
        var exception = assertThrows(PaginationException.class, () -> paginator.iterator().next());

        assertEquals("Error fetching next page", exception.getMessage());
        assertEquals(ApiException.class, exception.getCause().getClass());
    }

    @Test
    void shouldReturnNoElementsWhenEmptyResponse()
            throws ApiException, IOException
    {
        var aid = "4";
        var window = "4m";
        var emptyResponseJson = readJson("empty-response.json");
        var emptyResponse = mapper.readValue(emptyResponseJson, PaginatedResponse.class);
        mockApiResponse(emptyResponse, aid, window, null);

        var paginator = buildPaginator(aid, window);
        var elements = paginator.stream().toList();
        assertEquals(0, elements.size());
        verify(api).getItems(aid, window, null);
        verifyNoMoreInteractions(api);
    }

    @Test
    void shouldThrowNoSuchElementExceptionWhenNoNextElement()
            throws ApiException, IOException
    {
        var aid = "5";
        var window = "5s";
        var emptyResponseJson = readJson("empty-response.json");
        var emptyResponse = mapper.readValue(emptyResponseJson, PaginatedResponse.class);
        mockApiResponse(emptyResponse, aid, window, null);

        var paginator = buildPaginator(aid, window);
        var iterator = paginator.iterator();

        assertThrows(NoSuchElementException.class, iterator::next);
        verify(api).getItems(aid, window, null);
        verifyNoMoreInteractions(api);
    }

    private static Stream<PaginatedResponse> provideNoNextLinkResponses()
            throws IOException
    {
        var emptyNextLinkJson = readJson("empty-next-link.json");
        var missingNextLinkCursorJson = readJson("missing-next-link-cursor.json");

        var emptyNextLink = mapper.readValue(emptyNextLinkJson, PaginatedResponse.class);
        var missingNextLinkCursor =
                mapper.readValue(missingNextLinkCursorJson, PaginatedResponse.class);

        return Stream.of(noNextLink, emptyNextLink, missingNextLinkCursor);
    }

    private Paginator<Item, PaginatedResponse> buildPaginator(String aid, String window)
    {
        return new Paginator<>(cursor -> api.getItems(aid, window, cursor),
                               PaginatedResponse::items);
    }

    private void mockApiResponse(PaginatedResponse response, String aid, String window,
                                 String cursor)
            throws ApiException
    {
        doReturn(response)
                .when(api)
                .getItems(aid, window, cursor);
    }

    private static String readJson(String fileName) throws IOException {
        return Files.readString(buildResourcesPath(fileName));
    }

    private static Path buildResourcesPath(String filePath) {
        return Paths.get("src", "test", "resources", "pagination", filePath);
    }
}
