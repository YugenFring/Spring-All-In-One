package com.spring.proxy;

import com.spring.Calculator;

public class StaticProxyCalculator implements Calculator {
    private Calculator calculator;

    public StaticProxyCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int i, int j) {

        System.out.println("i = " + i + ", j = " + j);
        int result = calculator.add(i, j);
        System.out.println("result = " + result);

        return result;
    }

    @Override
    public int sub(int i, int j) {

        System.out.println("i = " + i + ", j = " + j);
        int result = calculator.sub(i, j);
        System.out.println("result = " + result);

        return result;
    }

    @Override
    public int mul(int i, int j) {

        System.out.println("i = " + i + ", j = " + j);
        int result = calculator.mul(i, j);
        System.out.println("result = " + result);

        return result;
    }

    @Override
    public int div(int i, int j) {

        System.out.println("i = " + i + ", j = " + j);
        int result = calculator.div(i, j);
        System.out.println("result = " + result);

        return result;    }
}
