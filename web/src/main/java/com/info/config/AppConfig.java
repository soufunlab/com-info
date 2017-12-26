package com.info.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {
    @Value("${app.test}")
    private String test;

    public String getTest() {
        return this.test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
