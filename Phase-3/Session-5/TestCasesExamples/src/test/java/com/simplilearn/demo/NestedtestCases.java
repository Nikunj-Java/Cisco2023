package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class NestedtestCases {

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
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
	}

	@Test
	void test() {
		System.out.println("Main Test Case");
	}
	@Nested
	class Inner {
		
		@BeforeEach
		void setUp() throws Exception {
			System.out.println("Before Each");
		}

		@AfterEach
		void tearDown() throws Exception {
			System.out.println("After Each");
		}
		@Test
		void test() {
			System.out.println("Nested Test Case-1");
		}
		@Nested
		class whenX{
			@BeforeEach
			void setUp() throws Exception {
				System.out.println("Before Each");
			}

			@AfterEach
			void tearDown() throws Exception {
				System.out.println("After Each");
			}
			@Test
			void test() {
				System.out.println("Nested Test Case-3");
			}
		}
		
	}

}
