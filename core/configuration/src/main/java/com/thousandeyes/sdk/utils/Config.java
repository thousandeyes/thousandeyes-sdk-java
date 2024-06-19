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

package com.thousandeyes.sdk.utils;

import java.io.IOException;
import java.util.Properties;



public class Config {
    public static final String USER_AGENT;
    public static final String SDK_VERSION;
    private static final String DEFAULT_SDK_VERSION = "1.0.0";

    static {
        Properties prop = new Properties();
        try {
            prop.load(Config.class.getResourceAsStream("/config.properties"));
        } catch (IOException ignored) {
        }
        SDK_VERSION = prop.getProperty("version", DEFAULT_SDK_VERSION);
        USER_AGENT = "ThousandEyesSDK-Java/" + SDK_VERSION;
    }
}