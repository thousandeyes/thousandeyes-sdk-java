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