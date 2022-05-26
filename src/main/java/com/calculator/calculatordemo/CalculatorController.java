package com.calculator.calculatordemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String calculatorText() {
        return calculatorService.calculatorStart();
    }

    @GetMapping(path = "/calculator")
    public String calculatorHello() {
        return calculatorService.calculatorHello();
    }

    @GetMapping(path = "/calculator/plus")
    public String calculatorPlus(@RequestParam ("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.calculatorPlus(num1, num2);
    }
    @GetMapping(path = "/calculator/minus")
    public String calculatorMinus(@RequestParam ("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.calculatorMinus(num1, num2);
    }
    @GetMapping(path = "/calculator/multiply")
    public String calculatorMultiply(@RequestParam ("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.calculatorMultiply(num1, num2);
    }
    @GetMapping(path = "/calculator/divide")
    public String calculatorDivide(@RequestParam ("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.calculatorDivide(num1, num2);
    }



}

