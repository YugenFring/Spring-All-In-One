package com.spring.ioc_02;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class JavaComponent {
    @PostConstruct
    public void init() {
        System.out.println("JavaComponent init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("JavaComponent destroy");
    }
}
