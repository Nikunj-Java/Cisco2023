package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AssertionExample {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		String s1=null;
		String s2="Nikunj Soni";
		
		String []a1= {"A","B"};
		String []a2= {"A","B"};
		
		//assertSame(s1, s2);
		assertNotSame(s1, s2);
		
		assertTrue(4>0);
		assertFalse(5<1);
		assertNull(s1);
		assertNotNull(s2);
		
		assertArrayEquals(a1, a2);
		
		assertThrows(RuntimeException.class, ()->{throw new RuntimeException();});
	}

}
