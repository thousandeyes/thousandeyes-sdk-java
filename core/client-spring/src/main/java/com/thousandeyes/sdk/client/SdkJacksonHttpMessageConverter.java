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

import java.io.IOException;
import java.lang.reflect.Type;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractGenericHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotWritableException;

import com.fasterxml.jackson.databind.ObjectMapper;

/** Jackson 2 message conversion for the SDK mapper used by generated models. */
final class SdkJacksonHttpMessageConverter extends AbstractGenericHttpMessageConverter<Object> {
    private final ObjectMapper objectMapper;

    SdkJacksonHttpMessageConverter(ObjectMapper objectMapper) {
        super(MediaType.APPLICATION_JSON, new MediaType("application", "*+json"));
        this.objectMapper = objectMapper;
    }

    @Override
    public Object read(Type type, Class<?> contextClass, HttpInputMessage inputMessage) throws IOException {
        return objectMapper.readValue(inputMessage.getBody(), objectMapper.constructType(type));
    }

    @Override
    protected Object readInternal(Class<?> clazz, HttpInputMessage inputMessage) throws IOException {
        return objectMapper.readValue(inputMessage.getBody(), clazz);
    }

    @Override
    protected void writeInternal(Object value, Type type, HttpOutputMessage outputMessage)
            throws IOException, HttpMessageNotWritableException {
        objectMapper.writeValue(outputMessage.getBody(), value);
    }

    @Override
    protected boolean supportsRepeatableWrites(Object value) {
        return true;
    }
}
