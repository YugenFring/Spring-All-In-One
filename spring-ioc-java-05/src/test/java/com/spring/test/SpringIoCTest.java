package com.spring.test;

import com.spring.config.IntegrateConfiguration;
import com.spring.config.UserConfiguration;
import com.spring.ioc_01.SystemComponent;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringIoCTest {
    @Test
    void basicTest1() {
        // Create an IoC container.
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UserConfiguration.class);

        // Retrieve a bean from the IoC container.
        SystemComponent bean = context.getBean(SystemComponent.class);
        bean.show();
    }

    @Test
    void basicTest2() {
        // Create an IoC container.
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(UserConfiguration.class);
        context.refresh();

        // Retrieve a bean from the IoC container.
        SystemComponent bean = context.getBean(SystemComponent.class);
        bean.show();
    }

    @Test
    void testImport() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IntegrateConfiguration.class);
        SystemComponent bean = context.getBean(SystemComponent.class);
        bean.show();
    }
}
