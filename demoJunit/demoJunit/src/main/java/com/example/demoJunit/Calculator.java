package com.example.demoJunit;

public class Calculator {

	CalculatorService service;
	
	public Calculator(CalculatorService service) {
		super();
		this.service = service;
	}

	public int perform (int i, int j) {
		return service.add(i, j)*2;
		//return (i+j)*i;
	}
}
