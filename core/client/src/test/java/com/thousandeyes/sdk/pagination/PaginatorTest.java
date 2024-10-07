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

import com.thousandeyes.sdk.account.management.administrative.UserEventsApi;
import com.thousandeyes.sdk.account.management.administrative.model.AuditUserEvents;
import com.thousandeyes.sdk.account.management.administrative.model.UserEvent;
import com.thousandeyes.sdk.client.ApiException;



public class PaginatorTest {

    private static UserEventsApi api;
    private static AuditUserEvents withNextLink = null;
    private static AuditUserEvents noNextLink = null;
    private static final ObjectMapper mapper = getDefault().getMapper();

    @BeforeAll
    public static void setup() throws IOException {
        var withNextLinkJson = readJson("with-next-link.json");
        var noNextLinkJson = readJson("no-next-link.json");

        withNextLink = mapper.readValue(withNextLinkJson, AuditUserEvents.class);
        noNextLink = mapper.readValue(noNextLinkJson, AuditUserEvents.class);
    }

    @BeforeEach
    public void clear() {
        api = Mockito.mock(UserEventsApi.class);
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
        verify(api).getUserEvents(aid, false, window, null, null, null);
        verify(api).getUserEvents(aid, false, window, null, null, cursor);
        verifyNoMoreInteractions(api);
    }

    @ParameterizedTest
    @MethodSource("provideNoNextLinkResponses")
    void shouldNotMakeExtraCallsWhenThereIsNoNextLink(AuditUserEvents response)
            throws ApiException
    {
        var aid = "2";
        var window = "2d";
        mockApiResponse(response, aid, window, null);

        var paginator = buildPaginator(aid, window);
        var elements = paginator.stream().toList();

        assertEquals(2, elements.size());
        verify(api).getUserEvents(aid, false, window, null, null, null);
        verifyNoMoreInteractions(api);
    }

    @Test
    void shouldPropagateExceptionWhenApiThrowsException() throws ApiException {
        var aid = "3";
        var window = "3h";
        doThrow(ApiException.class)
                .when(api)
                .getUserEvents(aid, false, window, null, null, null);

        var paginator = buildPaginator(aid, window);
        var exception = assertThrows(RuntimeException.class, () -> paginator.iterator().next());

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
        var emptyResponse = mapper.readValue(emptyResponseJson, AuditUserEvents.class);
        mockApiResponse(emptyResponse, aid, window, null);

        var paginator = buildPaginator(aid, window);
        var elements = paginator.stream().toList();
        assertEquals(0, elements.size());
        verify(api).getUserEvents(aid, false, window, null, null, null);
        verifyNoMoreInteractions(api);
    }

    @Test
    void shouldThrowNoSuchElementExceptionWhenNoNextElement()
            throws ApiException, IOException
    {
        var aid = "5";
        var window = "5s";
        var emptyResponseJson = readJson("empty-response.json");
        var emptyResponse = mapper.readValue(emptyResponseJson, AuditUserEvents.class);
        mockApiResponse(emptyResponse, aid, window, null);

        var paginator = buildPaginator(aid, window);
        var iterator = paginator.iterator();

        assertThrows(NoSuchElementException.class, iterator::next);
        verify(api).getUserEvents(aid, false, window, null, null, null);
        verifyNoMoreInteractions(api);
    }

    private static Stream<AuditUserEvents> provideNoNextLinkResponses() throws IOException {
        var emptyNextLinkJson = readJson("empty-next-link.json");
        var missingNextLinkCursorJson = readJson("missing-next-link-cursor.json");

        var emptyNextLink = mapper.readValue(emptyNextLinkJson, AuditUserEvents.class);
        var missingNextLinkCursor =
                mapper.readValue(missingNextLinkCursorJson, AuditUserEvents.class);

        return Stream.of(noNextLink, emptyNextLink, missingNextLinkCursor);
    }

    private Paginator<UserEvent, AuditUserEvents> buildPaginator(String aid, String window) {
        return new Paginator<>(cursor -> api.getUserEvents(aid, false, window, null, null, cursor),
                               AuditUserEvents::getAuditEvents);
    }

    private void mockApiResponse(AuditUserEvents response, String aid, String window, String cursor)
            throws ApiException
    {
        doReturn(response)
                .when(api)
                .getUserEvents(aid, false, window, null, null, cursor);
    }

    private static String readJson(String fileName) throws IOException {
        return Files.readString(buildResourcesPath(fileName));
    }

    private static Path buildResourcesPath(String filePath) {
        return Paths.get("src", "test", "resources", "pagination", filePath);
    }
}
