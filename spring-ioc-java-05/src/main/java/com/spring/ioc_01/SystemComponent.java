package com.spring.ioc_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SystemComponent {
    private final UserComponent userComponent;

    @Autowired
    public SystemComponent(UserComponent userComponent) {
        this.userComponent = userComponent;
    }

    public void show() {
        System.out.println("username: " + userComponent.getUsername());
        System.out.println("password: " + userComponent.getPassword());
    }
}
