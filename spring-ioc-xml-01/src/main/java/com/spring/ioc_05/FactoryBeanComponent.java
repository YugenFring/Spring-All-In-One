package com.spring.ioc_05;

import org.springframework.beans.factory.FactoryBean;

public class FactoryBeanComponent implements FactoryBean<SimpleComponent> {
    @Override
    public SimpleComponent getObject() throws Exception {
        SimpleComponent simpleComponent = new SimpleComponent();
        return simpleComponent;
    }

    @Override
    public Class<?> getObjectType() {
        return SimpleComponent.class;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
