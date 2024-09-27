package com.thousandeyes.sdk.client;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.Test;



public class RequestUtilTest {

    @Test
    public void shouldReturnListWithSingleValue() {
        List<Pair<String, String>> result = RequestUtil.parameterToPairs("name", "value");
        assertEquals(1, result.size());
        assertEquals("name", result.get(0).getLeft());
        assertEquals("value", result.get(0).getRight());
    }

    @Test
    public void shouldReturnEmptyList() {
        List<Pair<String, String>> result = RequestUtil.parameterToPairs("name", null);
        assertTrue(result.isEmpty());
    }

    @Test
    public void shouldReturnListOfCommaSeparatedValuesWhenCsvFormat() {
        List<Pair<String, String>> result =
                RequestUtil.parameterToPairs("csv", "name", Arrays.asList("value1", "value2"));
        assertEquals(1, result.size());
        assertEquals("name", result.get(0).getLeft());
        assertEquals("value1%2Cvalue2", result.get(0).getRight());
    }

    @Test
    public void shouldReturnListWithMultipleValues() {
        List<Pair<String, String>> result =
                RequestUtil.parameterToPairs("multi", "name", Arrays.asList("value1", "value2"));
        assertEquals(2, result.size());
        assertEquals("name", result.get(0).getLeft());
        assertEquals("value1", result.get(0).getRight());
        assertEquals("name", result.get(1).getLeft());
        assertEquals("value2", result.get(1).getRight());
    }

    @Test
    public void shouldReturnEmptyListWhenCsvFormatAndNullValues() {
        List<Pair<String, String>> result = RequestUtil.parameterToPairs("csv", "name", null);
        assertTrue(result.isEmpty());
    }

    @Test
    public void shouldUrlEncodeSpace() {
        String result = RequestUtil.urlEncode("test value");
        assertEquals("test%20value", result);
    }
}
