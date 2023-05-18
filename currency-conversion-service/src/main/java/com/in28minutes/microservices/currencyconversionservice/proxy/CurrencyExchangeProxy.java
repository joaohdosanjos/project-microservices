package com.in28minutes.microservices.currencyconversionservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.in28minutes.microservices.currencyconversionservice.domain.CurrencyConversion;

@FeignClient(name="currency-exchange", url="localhost:8000")
public interface CurrencyExchangeProxy {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	//Câmbio de moeda
	public CurrencyConversion retriveExchangeValue(@PathVariable String from, @PathVariable String to );
	
	
}
