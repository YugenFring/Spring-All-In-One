package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:user.properties")
@ComponentScan(value = {"com.spring.ioc_01"})
public class UserConfiguration {
}
