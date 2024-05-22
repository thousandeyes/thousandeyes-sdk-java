package com.thousandeyes.api.utils;

import java.io.IOException;
import java.util.Properties;



public class Config {
    public String getVersion() {
        Properties prop = new Properties();
        try {
            prop.load(getClass().getResourceAsStream("/config.properties"));
            return prop.getProperty("version");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}