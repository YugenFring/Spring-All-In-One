package com.spring.ioc_02;

public class MyService {
    private MyDao myDao;
    private int age;
    private String name;

    /**
     * Constructor that takes one argument
     */
    public MyService(MyDao myDao) {
        this.myDao = myDao;
    }

    /**
     * Constructor that takes three arguments
     */
    public MyService(int age, String name, MyDao myDao) {
        this.age = age;
        this.name = name;
        this.myDao = myDao;
    }
}
