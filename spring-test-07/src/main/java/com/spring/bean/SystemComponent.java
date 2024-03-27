package com.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class SystemComponent {
    private final UserComponent userComponent;
    public SystemComponent(UserComponent userComponent) {
        this.userComponent = userComponent;
    }

    public void doWork() {
        System.out.println("SystemComponent do work");
        userComponent.doWork();
    }
}
