package com.in28minutes.microservices.currencyconversionservice.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.currencyconversionservice.domain.CurrencyConversion;

@RestController
public class CurrencyConversionController {

	@GetMapping("currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	private CurrencyConversion calculateCurrencyConversion(@PathVariable String from, 
			@PathVariable String to, @PathVariable BigDecimal quantity) {
		
		CurrencyConversion currencyConversion = new CurrencyConversion(1000,from,to,quantity,BigDecimal.ONE,BigDecimal.ONE,"");
		 
		return currencyConversion;
	}
}
