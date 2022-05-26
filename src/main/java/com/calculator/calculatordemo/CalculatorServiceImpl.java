package com.calculator.calculatordemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{

    public String calculatorStart() {
        return "Calculator is working" +
                "go to /calculator";
                    }


    public String calculatorHello() {
        return "Добро пожаловать в калькулятор" +
                " try this function: " +
                " plus, minus, multiply, divide";
    }


    public String calculatorPlus(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1+num2);
    }

    public String calculatorMinus(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1-num2);
    }

    public String calculatorMultiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1*num2);
    }

    public String calculatorDivide(double num1, double num2) {
        return num1 + " / " + num2 + " = " + (num1/num2);
    }
}