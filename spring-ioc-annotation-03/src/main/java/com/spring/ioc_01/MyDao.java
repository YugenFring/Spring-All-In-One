package com.spring.ioc_01;

import org.springframework.stereotype.Repository;

@Repository
public class MyDao {
    public void doQuery() {
        System.out.println("Doing query");
    }
}
