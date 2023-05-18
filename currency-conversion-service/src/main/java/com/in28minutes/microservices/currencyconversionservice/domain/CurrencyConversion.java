package com.in28minutes.microservices.currencyconversionservice.domain;

import java.math.BigDecimal;


public class CurrencyConversion {
	
	private Integer id;
	private String from;
	private String to;
	private BigDecimal quantity ;
	private BigDecimal conversionMultiple;
	private BigDecimal totalAmountCalculated;
	private String environment;
	
	public CurrencyConversion() {
		super();
	}

	public CurrencyConversion(Integer id, String from, String to,  BigDecimal quantity, BigDecimal conversionMultiple,
			BigDecimal totalAmountCalculated, String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.quantity = quantity;
		this.conversionMultiple = conversionMultiple;
		this.totalAmountCalculated = totalAmountCalculated;
		this.environment = environment;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getFrom() {
		return from;
	}
	
	public void setFrom(String from) {
		this.from = from;
	}
	
	public String getTo() {
		return to;
	}
	
	public void setTo(String to) {
		this.to = to;
	}
	
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	
	public BigDecimal getTotalAmountCalculated() {
		return totalAmountCalculated;
	}
	public void setTotalAmountCalculated(BigDecimal totalAmountCalculated) {
		this.totalAmountCalculated = totalAmountCalculated;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	

}
