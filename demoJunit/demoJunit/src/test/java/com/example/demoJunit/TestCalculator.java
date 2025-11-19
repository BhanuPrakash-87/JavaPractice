package com.example.demoJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class TestCalculator {

	Calculator c =  null;
	
	/*
	CalculatorService service = new CalculatorService() {
		public int add(int i, int j) {
			// TODO Auto-generated method stub
			return 0;
		}
	};
	*/
	
	//CalculatorService service = Mockito.mock(CalculatorService.class);
	

	@Mock
	CalculatorService service;
	
	@BeforeEach
	public void setup () {
		c =  new Calculator(service);
	}
	
	@Test
	public void testPerform () {
		when(service.add(2, 3)).thenReturn(5);
		assertEquals(10, c.perform(2, 3));
		verify(service).add(0, 0);
	}
}
