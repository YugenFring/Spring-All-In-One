package com.spring.test;

import com.spring.ioc_03.MyComponent;
import com.spring.ioc_03.MyInterface;
import com.spring.ioc_04.JavaComponent;
import com.spring.ioc_05.SimpleComponent;
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

        // All the retrieved beans are the same instance because the default scope of a bean is singleton.
        component004.doWork();
    }

    /**
     * Test the method of initializing and destroying.
     */
    @Test
    void lifecycleMethod() {
        // The initialization method will be called after the container is initialized.
        // The bean will start to be initialized when the IoC container is created.
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-04.xml");

        // The destroy method will be called before the bean is destroyed.
        // The bean will be destroyed when the IoC container is closed.
        context.close();
    }

    /**
     * Test singleton scope.
     */
    @Test
    void singletonTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-04.xml");

        JavaComponent component001 = context.getBean("javaComponent002", JavaComponent.class);
        JavaComponent component002 = context.getBean("javaComponent002", JavaComponent.class);
        System.out.println("bean001 == bean002: " + (component001 == component002));
    }

    /**
     * Test prototype scope.
     */
    @Test
    void prototypeTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-04.xml");

        JavaComponent component001 = context.getBean("javaComponent003", JavaComponent.class);
        JavaComponent component002 = context.getBean("javaComponent003", JavaComponent.class);
        System.out.println("bean001 == bean002: " + (component001 == component002));
    }

    /**
     * Test factory bean.
     */
    @Test
    void testFactoryBean() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-05.xml");

        // Retrieve a bean through factory bean.
        SimpleComponent component001 = context.getBean("mySimpleComponent001", SimpleComponent.class);
        component001.doWork();

        // Retrieve the factory bean.
        Object factory001 = context.getBean("&mySimpleComponent001");
        System.out.println("factory001: " + factory001);
    }
}
