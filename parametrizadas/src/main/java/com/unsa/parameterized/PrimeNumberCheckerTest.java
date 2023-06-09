package com.unsa.parameterized;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {
    private Integer inputNumber;
    private Boolean expectedResult;
    private PrimeNumberChecker primeNumberChecker;
    @Before
    public void initialize() {
        primeNumberChecker = new PrimeNumberChecker();
    }
    // Cada parametro debe colocarse como argumento aqui.
    // Cada vez que el trigger se dispara, pasara los argumentos a partir
    // de los parametros que definimos en el metodo primeNumbers ()
    public PrimeNumberCheckerTest(Integer inputNumber, Boolean expectedResult) {
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> primeNumbers() {
        return Arrays.asList(new Object[][] {
            { 1, true },
            { 2, true },
            { 6, false },
            { 19, true },
            { 22, false },
            { 23, true },
        });
    }
    // Esta prueba se ejecutara 4 veces ya que tenemos 5 parametros definidos
    @Test
    public void testPrimeNumberChecker() {
        System.out.println("Parameterized Number is : " + inputNumber);
        assertEquals(expectedResult, primeNumberChecker.validate(inputNumber));
    }
}