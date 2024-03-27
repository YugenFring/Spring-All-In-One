package com.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class UserComponent {
    public void doWork() {
        System.out.println("UserComponent do work");
    }
}
