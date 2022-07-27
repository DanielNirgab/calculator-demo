package com.sky.calcwebTests;

import com.sky.calcweb.service.CalculatorServiceImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.sky.calcwebTests.CalculatorServiceImplNums.*;

public class CalculatorServiceImplTestsParams {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @MethodSource("argumentsStreamTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfSum(int num1, int num2) {
        String result = num1 + " + " + num2 + " = " + (num1 + num2);
        assertEquals(result, out.calculatorPlus(num1, num2));
    }
    @MethodSource("argumentsStreamTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfMinus(int num1, int num2) {
        String result = num1 + " - " + num2 + " = " + (num1 - num2);
        assertEquals(result, out.calculatorMinus(num1, num2));
    }
    @MethodSource("argumentsStreamTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfMultiply(int num1, int num2) {
        String result = num1 + " * " + num2 + " = " + (num1 * num2);
        assertEquals(result, out.calculatorMultiply(num1, num2));
    }
    @MethodSource("argumentsStreamTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfDivide(double num1, double num2) {
        String result = num1 + " / " + num2 + " = " + (num1 / num2);
        assertEquals(result, out.calculatorDivide(num1, num2));
    }

    private static Stream<Arguments> argumentsStreamTests () {
        return Stream.of(
                Arguments.of(ZERO, ONE),
                Arguments.of(TWO, TWO),
                Arguments.of(THREE, ONE),
                Arguments.of(TWO, ONE),
                Arguments.of(ONE, THREE)
        );
    }
}
