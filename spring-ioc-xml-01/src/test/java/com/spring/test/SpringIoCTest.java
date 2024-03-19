package com.spring.test;

import com.spring.ioc_03.MyComponent;
import com.spring.ioc_03.MyInterface;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIoCTest {
    /**
     * Create an IoC container via a configuration file.
     */
    void createIoC_1() {
        // Create an IoC container by specifying the XML-formatted configuration file.
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-03.xml");
    }

    void createIoC_2() {
        // Create an instance of IoC container.
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();

        // Load the XML-formatted configuration file.
        context.setConfigLocation("spring-03.xml");

        // Refresh the IoC container.
        context.refresh();
    }

    /**
     * Get beans from the IoC container.
     */
    @Test
    void getBean() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-03.xml");

        // Retrieve a bean through its id.
        MyComponent component001 = (MyComponent) context.getBean("myComponent001");

        // Retrieve a bean through its id and its class type.
        MyComponent component002 = context.getBean("myComponent001", MyComponent.class);

        // Retrieve a bean through its class type.
        MyComponent component003 = context.getBean(MyComponent.class);

        // Retrieve a bean through its interface type.
        MyInterface component004 = context.getBean(MyInterface.class);

        component004.doWork();
    }
}
