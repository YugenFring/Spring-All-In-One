package com.spring.ioc_01;

public class InstanceFctryComponent {
    private static MyInstance myInstance = new MyInstance();

    public MyInstance createInstance() {
        return myInstance;
    }
}
