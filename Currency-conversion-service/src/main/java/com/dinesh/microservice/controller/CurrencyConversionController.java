package com.dinesh.microservice.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dinesh.microservice.model.CurrencyConversionBean;

@RestController
public class CurrencyConversionController {

    @GetMapping("/currency-converter/from/{from}/to/{to}/qty/{quantity}")
    public CurrencyConversionBean convertCurrency(@PathVariable String from, 
                                                  @PathVariable String to, 
                                                  @PathVariable("quantity") BigDecimal qty) {
        // Placeholder for actual conversion logic
        // Using dummy conversion rate for demonstration purposes
        BigDecimal conversionRate = BigDecimal.ONE;
        BigDecimal convertedAmount = qty.multiply(conversionRate);
        
        return new CurrencyConversionBean(1L, from, to, conversionRate, qty, convertedAmount, 0);
    }
}
