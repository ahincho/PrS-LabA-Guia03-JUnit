package com.unsa.first;

import static org.junit.Assert.*;
import org.junit.Test;

public class MyFirstClassTest {
    @Test
    public void myFirstMethod() {
        String str = "JUnit is working fine!";
        assertEquals(str, "JUnit is working fine!");
    }
}