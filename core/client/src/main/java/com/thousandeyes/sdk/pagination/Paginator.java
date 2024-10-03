package com.thousandeyes.sdk.pagination;

import java.lang.reflect.InvocationTargetException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import com.thousandeyes.sdk.client.ApiException;



public class Paginator<T, R> implements Iterable<T> {
    private static final Pattern CURSOR_PATTERN = Pattern.compile("cursor=([^&]*)");
    private final PaginatedApiCall<R> apiCall;
    private final Function<R, List<T>> dataExtractor;

    public Paginator(PaginatedApiCall<R> apiCall, Function<R, List<T>> dataExtractor)
    {
        this.apiCall = apiCall;
        this.dataExtractor = dataExtractor;
    }

    private String extractCursor(String href) {
        if (href == null) {
            return null;
        }

        var matcher = CURSOR_PATTERN.matcher(href);
        if (matcher.find()) {
            return URLDecoder.decode(matcher.group(1), StandardCharsets.UTF_8);
        }

        return null;
    }

    @Override public Iterator<T> iterator() {
        return new PaginatorIterator();
    }

    public Stream<T> stream() {
        return StreamSupport.stream(spliterator(), false);
    }

    private class PaginatorIterator implements Iterator<T> {
        private String cursor = null;
        private Iterator<T> currentBatchIterator = null;
        private boolean hasNextBatch = true;

        @Override
        public boolean hasNext() {
            if (currentBatchIterator == null || !currentBatchIterator.hasNext()) {
                if (hasNextBatch) {
                    fetchNextBatch();
                }
            }
            return currentBatchIterator != null && currentBatchIterator.hasNext();
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return currentBatchIterator.next();
        }

        private void fetchNextBatch() {
            try {
                R result = apiCall.call(cursor);
                List<T> currentBatch = dataExtractor.apply(result);
                currentBatchIterator = currentBatch.iterator();

                var clazz = result.getClass();
                var getLinks = clazz.getMethod("getLinks");
                var links = getLinks.invoke(result);

                var getNext = links.getClass().getMethod("getNext");
                var next = getNext.invoke(links);

                if (next != null) {
                    var getHref = next.getClass().getMethod("getHref");
                    String nextHref = (String) getHref.invoke(next);
                    cursor = extractCursor(nextHref);
                }
                else {
                    hasNextBatch = false;

                }
            }
            catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException |
                   ApiException e) {
                throw new RuntimeException("Error fetching next batch", e);
            }
        }
    }
}