package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SampleTestCase {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All Method Called");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("AfterAll Method Called");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each Method Called");
	}
	

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each Method Called");
	}

	@Test
	void test() {
		System.out.println("Hello Test");
	}
	@Test
	void test2() {
		System.out.println("This is my another test");
	}

}
