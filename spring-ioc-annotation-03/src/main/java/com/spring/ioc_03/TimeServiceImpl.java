package com.spring.ioc_03;

import org.springframework.stereotype.Service;

@Service
public class TimeServiceImpl implements SomeService{
    @Override
    public String doService() {
        return "TimeService.doService()";
    }
}
