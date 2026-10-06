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

import org.apache.hc.core5.pool.PoolConcurrencyPolicy;
import org.apache.hc.core5.pool.PoolReusePolicy;

/**
 * Connection pool and connection lifetime settings for {@link Hc5ApiClient}.
 *
 * @param maxConnectionsTotal maximum connections across all routes; default 100
 * @param maxConnectionsPerRoute maximum connections for one route; default 20
 * @param concurrencyPolicy connection limit enforcement policy; default strict
 * @param reusePolicy available connection reuse order; default LIFO
 * @param connectionTimeToLive maximum pooled connection lifetime; default 5 minutes
 * @param validateAfterInactivity inactivity before validation on reuse; default 5 seconds
 * @param idleEviction idle time before background eviction; default 30 seconds. A positive value
 *        takes precedence over {@code expiredConnectionEvictionEnabled} because Apache HttpClient's
 *        idle eviction task also evicts expired connections
 * @param expiredConnectionEvictionEnabled whether expired connections are evicted in the background
 *        when idle eviction is disabled; default true
 * @param fallbackKeepAlive keep-alive used when a response does not specify one; default 3 minutes
 */
public record Hc5PoolConfig(
        int maxConnectionsTotal,
        int maxConnectionsPerRoute,
        PoolConcurrencyPolicy concurrencyPolicy,
        PoolReusePolicy reusePolicy,
        Duration connectionTimeToLive,
        Duration validateAfterInactivity,
        Duration idleEviction,
        boolean expiredConnectionEvictionEnabled,
        Duration fallbackKeepAlive) {

    /** Validates required pool settings. */
    public Hc5PoolConfig {
        Objects.requireNonNull(concurrencyPolicy, "concurrencyPolicy");
        Objects.requireNonNull(reusePolicy, "reusePolicy");
        Objects.requireNonNull(connectionTimeToLive, "connectionTimeToLive");
        Objects.requireNonNull(validateAfterInactivity, "validateAfterInactivity");
        Objects.requireNonNull(idleEviction, "idleEviction");
        Objects.requireNonNull(fallbackKeepAlive, "fallbackKeepAlive");
    }

    /**
     * Creates a builder initialized with the documented defaults.
     *
     * @return pool configuration builder
     */
    public static Builder builder() {
        return new Builder();
    }

    /** Fluent builder for {@link Hc5PoolConfig}. */
    public static final class Builder {
        private int maxConnectionsTotal = 100;
        private int maxConnectionsPerRoute = 20;
        private PoolConcurrencyPolicy concurrencyPolicy = PoolConcurrencyPolicy.STRICT;
        private PoolReusePolicy reusePolicy = PoolReusePolicy.LIFO;
        private Duration connectionTimeToLive = Duration.ofMinutes(5);
        private Duration validateAfterInactivity = Duration.ofSeconds(5);
        private Duration idleEviction = Duration.ofSeconds(30);
        private boolean expiredConnectionEvictionEnabled = true;
        private Duration fallbackKeepAlive = Duration.ofMinutes(3);

        /** Sets the maximum number of connections across all routes. */
        public Builder maxConnectionsTotal(int value) {
            this.maxConnectionsTotal = value;
            return this;
        }

        /** Sets the maximum number of connections for one route. */
        public Builder maxConnectionsPerRoute(int value) {
            this.maxConnectionsPerRoute = value;
            return this;
        }

        /** Sets how strictly the pool enforces connection limits. */
        public Builder concurrencyPolicy(PoolConcurrencyPolicy value) {
            this.concurrencyPolicy = Objects.requireNonNull(value);
            return this;
        }

        /** Sets the order in which available connections are reused. */
        public Builder reusePolicy(PoolReusePolicy value) {
            this.reusePolicy = Objects.requireNonNull(value);
            return this;
        }

        /** Sets the maximum lifetime of a pooled connection. */
        public Builder connectionTimeToLive(Duration value) {
            this.connectionTimeToLive = Objects.requireNonNull(value);
            return this;
        }

        /** Sets how long a connection may be idle before validation on reuse. */
        public Builder validateAfterInactivity(Duration value) {
            this.validateAfterInactivity = Objects.requireNonNull(value);
            return this;
        }

        /**
         * Sets the idle time after which the eviction thread closes a connection. A positive value
         * also enables expired connection eviction, regardless of
         * {@link #expiredConnectionEvictionEnabled(boolean)}.
         */
        public Builder idleEviction(Duration value) {
            this.idleEviction = Objects.requireNonNull(value);
            return this;
        }

        /**
         * Enables or disables background eviction of connections whose time to live has expired.
         * A positive {@link #idleEviction(Duration)} value takes precedence and also enables expired
         * connection eviction.
         */
        public Builder expiredConnectionEvictionEnabled(boolean value) {
            this.expiredConnectionEvictionEnabled = value;
            return this;
        }

        /** Sets the keep-alive used when a response does not provide one. */
        public Builder fallbackKeepAlive(Duration value) {
            this.fallbackKeepAlive = Objects.requireNonNull(value);
            return this;
        }

        /** Builds an immutable pool configuration. */
        public Hc5PoolConfig build() {
            return new Hc5PoolConfig(
                    maxConnectionsTotal,
                    maxConnectionsPerRoute,
                    concurrencyPolicy,
                    reusePolicy,
                    connectionTimeToLive,
                    validateAfterInactivity,
                    idleEviction,
                    expiredConnectionEvictionEnabled,
                    fallbackKeepAlive);
        }
    }
}
