package com.spring.ioc_02;

public class MyController {
    private MyService myService;
    private String name;

    public void setMyService(MyService myService) {
        this.myService = myService;
    }

    public void setName(String name) {
        this.name = name;
    }
}
