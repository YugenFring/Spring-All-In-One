package com.spring.ioc_01;

import org.springframework.stereotype.Service;

@Service(value = "testService")
public class MyService {
    public void doService() {
        System.out.println("Doing service");
    }
}
