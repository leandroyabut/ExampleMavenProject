package com.leandroyabut.mavenexample;

public class Calculator {

    public Functions multiply() {
        return (a, b) -> a * b;
    }

    public Functions add() {
        return (a, b) -> a + b;
    }

    public Functions subtract() {
        return (a, b) -> a - b;
    }

    public Functions divide() {
        return (a, b) -> a / b;
    }

    public int calculate(Functions function, int a, int b) {
        return function.calculate(a, b);
    }

}
