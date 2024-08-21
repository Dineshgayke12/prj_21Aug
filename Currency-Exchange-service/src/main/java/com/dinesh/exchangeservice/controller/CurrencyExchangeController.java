package com.dinesh.exchangeservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dinesh.exchangeservice.controller.model.ExchangeValue;

@RestController
public class CurrencyExchangeController {

	@Autowired
	private Environment environment;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchngeValue(@PathVariable String from, @PathVariable String to) {
		
		ExchangeValue exchangeValue= new ExchangeValue(100L, from,to,BigDecimal.valueOf(80));
		
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		
		  return exchangeValue;
	}
}
