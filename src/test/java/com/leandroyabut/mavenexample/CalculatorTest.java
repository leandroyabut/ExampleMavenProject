package com.leandroyabut.mavenexample;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void multiplyTest() {
        assertEquals(10, calculate(calculator.multiply(), 5, 2));
        assertEquals(75, calculate(calculator.multiply(), 25, 3));
        assertEquals(110, calculate(calculator.multiply(), 11, 10));
    }

    @Test
    public void addTest() {
        assertEquals(10, calculate(calculator.add(), 5, 5));
        assertEquals(75, calculate(calculator.add(), 25, 50));
        assertEquals(110, calculate(calculator.add(), 100, 10));
    }

    @Test
    public void subtractTest() {
        assertEquals(10, calculate(calculator.subtract(), 12, 2));
        assertEquals(75, calculate(calculator.subtract(), 100, 25));
        assertEquals(110, calculate(calculator.subtract(), 200, 90));
    }

    @Test
    public void divideTest() {
        assertEquals(10, calculate(calculator.divide(), 120, 12));
        assertEquals(75, calculate(calculator.divide(), 750, 10));
        assertEquals(110, calculate(calculator.divide(), 220, 2));
    }

    private int calculate(Functions function, int a, int b) {
        return function.calculate(a, b);
    }

}
