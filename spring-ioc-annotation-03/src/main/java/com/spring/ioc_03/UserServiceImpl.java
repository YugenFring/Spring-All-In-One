package com.spring.ioc_03;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements SomeService{
    @Override
    public String doService() {
        return "UserService.doService()";
    }
}
