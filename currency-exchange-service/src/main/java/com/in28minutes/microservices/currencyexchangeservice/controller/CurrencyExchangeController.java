package com.in28minutes.microservices.currencyexchangeservice.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.currencyexchangeservice.domain.CurrencyExchange;

@RestController
public class CurrencyExchangeController {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	//Câmbio de moeda
	public CurrencyExchange retriveExchangeValue(@PathVariable String from, @PathVariable String to ) {
		return new CurrencyExchange(1000, from, to, BigDecimal.valueOf(50));
	}
}
