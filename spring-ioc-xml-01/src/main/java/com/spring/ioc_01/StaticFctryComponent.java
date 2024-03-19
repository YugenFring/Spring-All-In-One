package com.spring.ioc_01;

public class StaticFctryComponent {
    private StaticFctryComponent() {}
    private static StaticFctryComponent staticFctryComponent = new StaticFctryComponent();

    public static StaticFctryComponent createInstance() {
        return staticFctryComponent;
    }
}
