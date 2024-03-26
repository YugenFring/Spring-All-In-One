package com.spring.ioc_04;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CommonComponent {
    /**
     * Wire value from the external properties file.
     */
    @Value("${jdbc.username}")
    private String username;
    /**
     * Specify default value if the value is not found in the properties file.
     */
    @Value("${jdbc.password:123456}")
    private String password;

    @Override
    public String toString() {
        return "CommonComponent{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
