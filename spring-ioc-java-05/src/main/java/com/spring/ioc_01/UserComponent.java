package com.spring.ioc_01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserComponent {
    @Value("${system.username}")
    private String username;
    @Value("${system.password}")
    private String password;
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
