package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RepeatedTestCase {

	private Calculator cal=null;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}
	

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each");
		cal= new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
		cal=null;
	}

	@Test
	@DisplayName("Add operation Test")
	@RepeatedTest(value = 5,name = "TestCase: {displayname} the curentcount {currentRepetition}out of {totalRepetition}")
	void addMethod() {
		assertEquals(8, cal.add(6, 2),"6+2 should Equals to 8");
		System.out.println("============Test Completed===========");
	}

}
