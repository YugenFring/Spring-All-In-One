package com.spring.jdbc;

import com.spring.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTemplateTest {
    @Test
    void testThreeLayers() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-01.xml");

        StudentController controller = context.getBean(StudentController.class);
        controller.handleAll();
    }
}
