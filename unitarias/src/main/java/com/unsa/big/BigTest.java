package com.unsa.big;

import static org.junit.Assert.assertEquals;
import java.math.BigInteger;
import org.junit.Test;

public class BigTest {
    BigInteger a, b, answer;
    @Test
    public void maxWithPositiveNumbers() {
        a = new BigInteger("123456789");
        b = new BigInteger("987654321");
        answer = a.max(b);
        assertEquals(b, answer);
    }
    @Test
    public void maxWithNegativeNumbers() {
        a = new BigInteger("-987654321");
        b = new BigInteger("-123456789");
        answer = a.max(b);
        assertEquals(b, answer);
    }
    @Test
    public void maxWithMixedSigns() {
        a = new BigInteger("123456789");
        b = new BigInteger("-123456789");
        answer = a.max(b);
        assertEquals(a, answer);
    }
    @Test
    public void maxBidirectionalEvaluation() {
        a = new BigInteger("5");
        b = new BigInteger("6");
        answer = b.max(a);
        BigInteger answer2 = a.max(b);
        assertEquals(answer, answer2);
    }
    @Test
    public void maxOfTenAndTwenty() {
        a = new BigInteger("10");
        b = new BigInteger("20");
        answer = a.max(b);
        assertEquals(b, answer);
    }
    @Test
    public void maxOfMinusHundredAndZero() {
        a = new BigInteger("-100");
        b = new BigInteger("0");
        answer = a.max(b);
        assertEquals(b, answer);
    }
    @Test
    public void maxOfConsecutiveNumbers() {
        a = new BigInteger("999999999");
        b = new BigInteger("999999998");
        answer = a.max(b);
        assertEquals(a, answer);
    }
    @Test
    public void maxOfTwoNegatives() {
        a = new BigInteger("-50");
        b = new BigInteger("-20");
        answer = a.max(b);
        assertEquals(b, answer);
    }
    @Test
    public void maxOfTwoEqualsNegatives() {
        a = new BigInteger("-9999");
        b = new BigInteger("-9999");
        answer = a.max(b);
        assertEquals(a, answer);
        assertEquals(b, answer);
    }
    @Test
    public void maxOfPositiveAndNegative() {
        a = new BigInteger("-10");
        b = new BigInteger("5");
        answer = a.max(b);
        assertEquals(b, answer);
    }
    @Test
    public void maxOfZeroAndNegative() {
        a = new BigInteger("0");
        b = new BigInteger("-5");
        answer = a.max(b);
        assertEquals(a, answer);
    }
    @Test
    public void maxOfReallyBigNumbers() {
        a = new BigInteger("999999999999999999999999999999999999999999999999");
        b = new BigInteger("999999999999999999999999999999999999999999999998");
        answer = a.max(b);
        assertEquals(a, answer);
    }
}