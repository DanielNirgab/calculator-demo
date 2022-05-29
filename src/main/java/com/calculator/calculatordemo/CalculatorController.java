package com.calculator.calculatordemo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String calculatorHello() {
        return calculatorService.calculatorHello();
    }

    @GetMapping("/plus")
    public String calculatorPlus(@RequestParam int num1, @RequestParam int num2) {
            return calculatorService.calculatorPlus(num1, num2);
    }

    @GetMapping("/minus")
    public String calculatorMinus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.calculatorMinus(num1, num2);
    }

    @GetMapping("/multiply")
    public String calculatorMultiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.calculatorMultiply(num1, num2);
    }

    @GetMapping("/divide")
    public String calculatorDivide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.calculatorDivide(num1, num2);
    }




}

