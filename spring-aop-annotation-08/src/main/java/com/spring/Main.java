package com.spring;

import com.spring.proxy.StaticProxyCalculator;
import com.spring.impl.CalculatorPureImpl;

public class Main {
    public static void main(String[] args) {
        CalculatorPureImpl calculator = new CalculatorPureImpl();
        StaticProxyCalculator proxy = new StaticProxyCalculator(calculator);

        int add = proxy.add(1, 2);
        System.out.println("add = " + add);
    }
}
