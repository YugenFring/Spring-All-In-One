package com.spring.test;

import com.spring.ioc_01.MyComponent;
import com.spring.ioc_01.MyController;
import com.spring.ioc_01.MyService;
import com.spring.ioc_02.JavaComponent;
import com.spring.ioc_03.SomeController;
import com.spring.ioc_04.CommonComponent;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIoCTest {
    @Test
    void basicTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-01.xml");

        MyComponent component = context.getBean(MyComponent.class);
        component.doSomething();

        MyController controller = context.getBean(MyController.class);
        controller.doController();

        MyService service = context.getBean("testService", MyService.class);
        service.doService();
    }

    @Test
    void testLifeCycleAndCope() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-02.xml");

        JavaComponent component001 = context.getBean(JavaComponent.class);
        JavaComponent component002 = context.getBean(JavaComponent.class);
        System.out.println("component001 == component002: " + (component001 == component002));

        context.close();
    }

    @Test
    void testAutowired() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-03.xml");

        SomeController controller = context.getBean(SomeController.class);
        controller.doUserController();
        controller.doViewController();
        controller.doTimeController();

        context.close();
    }

    @Test
    void testValue() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-04.xml");

         CommonComponent component = context.getBean(CommonComponent.class);
         System.out.println(component);

        context.close();
    }
}
