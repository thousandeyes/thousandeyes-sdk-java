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

import java.time.Duration;
import java.util.Objects;

/**
 * Timeout settings for {@link Hc5ApiClient}.
 *
 * @param poolAcquisitionTimeout maximum wait for a connection from the pool; default 5 seconds
 * @param connectTimeout maximum time to establish a connection; default 5 seconds
 * @param socketTimeout socket I/O timeout; default 30 seconds
 * @param responseTimeout default maximum wait for a response; default 30 seconds
 */
public record Hc5TimeoutConfig(
        Duration poolAcquisitionTimeout,
        Duration connectTimeout,
        Duration socketTimeout,
        Duration responseTimeout) {

    /** Validates that every timeout is present. */
    public Hc5TimeoutConfig {
        Objects.requireNonNull(poolAcquisitionTimeout, "poolAcquisitionTimeout");
        Objects.requireNonNull(connectTimeout, "connectTimeout");
        Objects.requireNonNull(socketTimeout, "socketTimeout");
        Objects.requireNonNull(responseTimeout, "responseTimeout");
    }

    /**
     * Creates a builder initialized with the documented defaults.
     *
     * @return timeout configuration builder
     */
    public static Builder builder() {
        return new Builder();
    }

    /** Fluent builder for {@link Hc5TimeoutConfig}. */
    public static final class Builder {
        private Duration poolAcquisitionTimeout = Duration.ofSeconds(5);
        private Duration connectTimeout = Duration.ofSeconds(5);
        private Duration socketTimeout = Duration.ofSeconds(30);
        private Duration responseTimeout = Duration.ofSeconds(30);

        /** Sets the maximum wait for a pooled connection. */
        public Builder poolAcquisitionTimeout(Duration value) {
            this.poolAcquisitionTimeout = Objects.requireNonNull(value);
            return this;
        }

        /** Sets the maximum time to establish a connection. */
        public Builder connectTimeout(Duration value) {
            this.connectTimeout = Objects.requireNonNull(value);
            return this;
        }

        /** Sets the socket I/O timeout. */
        public Builder socketTimeout(Duration value) {
            this.socketTimeout = Objects.requireNonNull(value);
            return this;
        }

        /** Sets the default maximum wait for a response. */
        public Builder responseTimeout(Duration value) {
            this.responseTimeout = Objects.requireNonNull(value);
            return this;
        }

        /** Builds an immutable timeout configuration. */
        public Hc5TimeoutConfig build() {
            return new Hc5TimeoutConfig(
                    poolAcquisitionTimeout, connectTimeout, socketTimeout, responseTimeout);
        }
    }
}
