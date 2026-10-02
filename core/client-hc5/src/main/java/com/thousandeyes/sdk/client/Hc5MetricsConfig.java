/*
 * Copyright 2026 Cisco Systems, Inc. and its affiliates
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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Tag;

/**
 * Native Apache HttpClient request and connection pool metric settings.
 *
 * @param registry registry that receives HC5 meters
 * @param poolName value of the {@code httpclient} metric tag; default {@code thousandeyes}
 * @param tags additional common metric tags; default empty
 */
public record Hc5MetricsConfig(MeterRegistry registry, String poolName, List<Tag> tags) {

    /** Validates and defensively copies metric settings. */
    public Hc5MetricsConfig {
        Objects.requireNonNull(registry, "registry");
        Objects.requireNonNull(poolName, "poolName");
        tags = List.copyOf(Objects.requireNonNull(tags, "tags"));
    }

    /**
     * Creates a metrics builder for the supplied registry.
     *
     * @param registry registry that receives native HC5 meters
     * @return metrics configuration builder
     */
    public static Builder builder(MeterRegistry registry) {
        return new Builder(registry);
    }

    /** Fluent builder for {@link Hc5MetricsConfig}. */
    public static final class Builder {
        private final MeterRegistry registry;
        private String poolName = "thousandeyes";
        private final List<Tag> tags = new ArrayList<>();

        private Builder(MeterRegistry registry) {
            this.registry = Objects.requireNonNull(registry);
        }

        /** Sets the value of the {@code httpclient} tag on every HC5 meter. */
        public Builder poolName(String value) {
            this.poolName = Objects.requireNonNull(value);
            return this;
        }

        /** Adds common tags to every HC5 request and connection pool meter. */
        public Builder tags(Iterable<Tag> value) {
            Objects.requireNonNull(value).forEach(tags::add);
            return this;
        }

        /** Builds an immutable metrics configuration. */
        public Hc5MetricsConfig build() {
            return new Hc5MetricsConfig(registry, poolName, tags);
        }
    }
}
