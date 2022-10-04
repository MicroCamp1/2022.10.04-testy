package com.comarch.camp.micro.testy;

public class Calculator {

    public Calculator() {
        System.out.println("Konstruktor kalkulatora !!!");
    }

    public int add(int a, int b) {
        return a+b;
    }

    public int diff(int a, int b) {
        return a-b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public double divide(int a, int b) {
        if(b == 0) {
            throw new IllegalArgumentException();
        }
        return ((double) a) / ((double) b);
    }
}
