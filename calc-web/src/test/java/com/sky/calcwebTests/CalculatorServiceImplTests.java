package com.sky.calcwebTests;

import com.sky.calcweb.exception.ZeroDivideException;
import com.sky.calcweb.service.CalculatorServiceImpl;
import org.junit.jupiter.api.Test;

import static com.sky.calcwebTests.CalculatorServiceImplNums.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceImplTests {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void shouldReturn3WhenSum1and2() {
        String result = ONE + " + " + TWO + " = " + (ONE+TWO);
        assertEquals(result, out.calculatorPlus(ONE, TWO));
    }
    @Test
    public void shouldReturn3WhenSum2and3() {
        String result = THREE + " + " + TWO + " = " + (THREE+TWO);
        assertEquals(result, out.calculatorPlus(THREE, TWO));
    }
    @Test
    public void shouldReturn0WhenSubtract3and3() {
        String result = THREE + " - " + THREE + " = " + (0);
        assertEquals(result, out.calculatorPlus(THREE, THREE));
    }
    @Test
    public void shouldReturn1WhenSubtract2and3() {
        String result = TWO + " - " + THREE + " = " + (TWO-THREE);
        assertEquals(result, out.calculatorPlus(TWO, THREE));
    }

    @Test
    public void shouldReturn6WhenMultiply2and3() {
        String result = TWO + " * " + THREE + " = " + (TWO*THREE);
        assertEquals(result, out.calculatorPlus(TWO, THREE));
    }
    @Test
    public void shouldReturn0WhenMultiply0and3() {
        String result = ZERO + " * " + THREE + " = " + (0);
        assertEquals(result, out.calculatorPlus(ZERO, THREE));
    }
    @Test
    public void shouldReturn2WhenDivide2and1() {
        String result = TWO + " / " + ONE + " = " + (TWO/ONE);
        assertEquals(result, out.calculatorPlus(TWO, ONE));
    }
    @Test
    public void shouldReturn1WhenDivide2and2() {
        String result = TWO + " / " + TWO + " = " + (1);
        assertEquals(result, out.calculatorPlus(TWO, TWO));
    }

    public void shouldThrowException() {
        assertThrows(ZeroDivideException.class, () -> out.calculatorDivide(TWO, ZERO));
    }


}
