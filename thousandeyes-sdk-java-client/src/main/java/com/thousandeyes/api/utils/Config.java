package com.thousandeyes.api.utils;

import java.io.IOException;
import java.util.Properties;



public class Config {
    private static final Properties properties = new Properties();
    private static final String DEFAULT_VERSION = "1.0.0";

    static {
        try {
            properties.load(Config.class.getResourceAsStream("/config.properties"));
        } catch (IOException ignored) {
        }
    }

    public static String getVersion() {
        return properties.getProperty("version", DEFAULT_VERSION);
    }
}