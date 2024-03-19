package com.spring.ioc_03;

public class MyComponent implements MyInterface{
    @Override
    public void doWork() {
        System.out.println("doWork() method is called.");
    }
}
