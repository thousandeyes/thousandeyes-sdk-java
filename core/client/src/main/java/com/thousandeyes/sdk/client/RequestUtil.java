/*
 * Copyright 2024 Cisco Systems, Inc. and its affiliates
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.thousandeyes.sdk.client;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.net.URLEncoder;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;



public class RequestUtil {

    /**
     * Convert a URL query name/value parameter to a list of encoded {@link Pair}
     * objects.
     *
     * <p>The value can be null, in which case an empty list is returned.</p>
     *
     * @param name The query name parameter.
     * @param value The query value, which may not be a collection but may be
     *              null.
     * @return A singleton list of the {@link Pair} objects representing the input
     * parameters, which is encoded for use in a URL. If the value is null, an
     * empty list is returned.
     */
    public static List<Pair<String, String>> parameterToPairs(String name, Object value) {
        if (name == null || name.isEmpty() || value == null) {
            return Collections.emptyList();
        }
        return Collections.singletonList(Pair.of(urlEncode(name), urlEncode(valueToString(value))));
    }

    /**
     * Convert a URL query name/collection parameter to a list of encoded
     * {@link Pair} objects.
     *
     * @param collectionFormat The swagger collectionFormat string (csv, tsv, etc).
     * @param name             The query name parameter.
     * @param values           A collection of values for the given query name, which may be
     *                         null.
     * @return A list of {@link Pair} objects representing the input parameters,
     * which is encoded for use in a URL. If the values collection is null, an
     * empty list is returned.
     */
    public static List<Pair<String, String>> parameterToPairs(
            String collectionFormat, String name, Collection<?> values)
    {
        if (name == null || name.isEmpty() || values == null || values.isEmpty()) {
            return Collections.emptyList();
        }

        // get the collection format (default: csv)
        String format = collectionFormat == null || collectionFormat.isEmpty() ? "csv" : collectionFormat;

        // create the params based on the collection format
        if ("multi".equals(format)) {
            return values.stream()
                         .map(value -> Pair.of(urlEncode(name), urlEncode(valueToString(value))))
                         .collect(Collectors.toList());
        }

        String delimiter;
        switch (format) {
            case "csv":
                delimiter = urlEncode(",");
                break;
            case "ssv":
                delimiter = urlEncode(" ");
                break;
            case "tsv":
                delimiter = urlEncode("\t");
                break;
            case "pipes":
                delimiter = urlEncode("|");
                break;
            default:
                throw new IllegalArgumentException("Illegal collection format: " + collectionFormat);
        }

        StringJoiner joiner = new StringJoiner(delimiter);
        for (Object value : values) {
            joiner.add(urlEncode(valueToString(value)));
        }

        return Collections.singletonList(Pair.of(urlEncode(name), joiner.toString()));
    }

    /**
     * URL encode a string in the UTF-8 encoding.
     *
     * @param s String to encode.
     * @return URL-encoded representation of the input string.
     */
    public static String urlEncode(String s) {
        return URLEncoder.encode(s, UTF_8).replaceAll("\\+", "%20");
    }

    public static String valueToString(Object value) {
        if (value == null) {
            return "";
        }
        if (value instanceof OffsetDateTime) {
            return ((OffsetDateTime) value).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }
        return value.toString();
    }
}
