package com.unsa.fibonacci;

public class Math {
    static int FIBONACCI_MAX_INDEX = 46;
    public static int fibonacci(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("The number cant be a negative value.");
        }
        if (i > FIBONACCI_MAX_INDEX) {
            throw new IllegalArgumentException("Integer data type doesnt support high values.");
        }
        if (i == 0) { return 0; }
        if (i == 1) { return 1; }
        return fibonacci(i - 1) + fibonacci(i - 2);
    }
}