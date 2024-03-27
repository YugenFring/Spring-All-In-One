package com.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({UserConfiguration.class})
public class IntegrateConfiguration {
}
