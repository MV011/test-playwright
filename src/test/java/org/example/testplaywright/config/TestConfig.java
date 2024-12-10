package org.example.testplaywright.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({ApiProperties.class,BrowserProperties.class})
@ComponentScan("org.example.testplaywright")
public class TestConfig {
}