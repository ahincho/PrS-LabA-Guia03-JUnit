package com.unsa.fibonacci;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

// Fibonnaci Serie
// Fibo = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

public class FibonacciTest {
    @Test
    public void fibonacciOfZero() {
        assertEquals(Math.fibonacci(0), 0);
    }
    @Test
    public void fibonacciOfOne() {
        assertEquals(Math.fibonacci(1), 1);
    }
    @Test
    public void fibonacciOfTwo() {
        assertEquals(Math.fibonacci(2), 1);
    }
    @Test
    public void fibonacciOfFive() {
        assertEquals(Math.fibonacci(5), 5);
    }
    @Test
    public void fibonacciOfTen() {
        assertEquals(Math.fibonacci(10), 55);
    }
    @Test
    public void fibonacciOfTwelve() {
        assertEquals(Math.fibonacci(12), 144);
    }
    @Test(expected = IllegalArgumentException.class)
    public void fibonacciOfANegative() {
        Math.fibonacci(-1);
    }
    @Test(expected = IllegalArgumentException.class)
    public void fibonacciOfMinusTen() {
        Math.fibonacci(-10);
    }
    @Test(expected = IllegalArgumentException.class)
    public void fibonacciOfMinValue() {
        Math.fibonacci(Integer.MIN_VALUE);
    }
    @Test(expected = IllegalArgumentException.class)
    public void fibonacciOfMaxValue() {
        Math.fibonacci(Math.FIBONACCI_MAX_INDEX + 1);
    }
    @Test(timeout = 5000) 
    public void fibonacciLargeInput() {
        Math.fibonacci(Math.FIBONACCI_MAX_INDEX);
    }
}