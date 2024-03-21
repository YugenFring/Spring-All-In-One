package com.spring.ioc_03;

import org.springframework.stereotype.Service;

@Service
public class ViewServiceImpl implements SomeService{
    @Override
    public String doService() {
        return"ViewService.doService()";
    }
}
