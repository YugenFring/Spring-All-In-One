package com.spring.test;

import com.spring.config.JavaConfig;
import com.spring.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringIoCTest {
    @Test
    void testThreeLayers() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        StudentController bean = context.getBean(StudentController.class);
        bean.handleAll();
    }
}
