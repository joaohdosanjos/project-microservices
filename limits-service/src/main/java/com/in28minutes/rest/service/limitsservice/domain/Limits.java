package com.in28minutes.rest.service.limitsservice.domain;

public class Limits {
	private int mininum;
	private int maximum;
	
	
	public Limits() {
		super();
	}
	
	public Limits(int mininum, int maximum) {
		super();
		this.mininum = mininum;
		this.maximum = maximum;
	}
	public int getMininum() {
		return mininum;
	}
	public void setMininum(int mininum) {
		this.mininum = mininum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	
	

}
