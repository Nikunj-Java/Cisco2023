package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator cal;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Welcome to Calculator Testing");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Testing Ended Successfully");
	}

	@BeforeEach
	void setUp() throws Exception {
		cal=new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		cal=null;
	}

	@Test
	void addtest() {
		assertEquals(5, cal.add(3, 2));
	}
	
	@Test
	void multTest() {
		assertEquals(20, cal.multiply(5, 4));
		assertNotEquals(10, cal.multiply(5, 4));
	}
	
	//multiplication test 
	
	//division test

}
