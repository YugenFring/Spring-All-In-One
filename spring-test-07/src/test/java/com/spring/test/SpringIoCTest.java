package com.spring.test;

import com.spring.bean.SystemComponent;
import com.spring.config.JavaConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(value = {JavaConfig.class})
public class SpringIoCTest {
    @Autowired
    private SystemComponent systemComponent;

    @Test
    void test(){
        systemComponent.doWork();
    }
}
