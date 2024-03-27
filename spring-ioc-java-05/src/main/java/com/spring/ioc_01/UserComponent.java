package com.spring.ioc_01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserComponent {
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
