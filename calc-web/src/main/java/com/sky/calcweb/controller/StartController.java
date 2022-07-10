package com.sky.calcweb.controller;

import com.sky.calcweb.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {
        private final CalculatorService calculatorServiceStart;

        public StartController(CalculatorService calculatorServiceStart) {
            this.calculatorServiceStart = calculatorServiceStart;
        }

    @GetMapping
    public String calculatorStart() {
        return calculatorServiceStart.calculatorStart();
    }



}
