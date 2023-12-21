package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

class Conditional_JRE_TestCases {

	@Test
	@EnabledOnJre(JRE.JAVA_8)
	void test1() {
		System.out.println("This system is running on JRE 8");
	}
	@Test
	@EnabledOnJre(JRE.JAVA_11)
	void test2() {
		System.out.println("This system is running on JRE 8");
	}
	@Test
	@EnabledOnJre(JRE.JAVA_17)
	void test3() {
		System.out.println("This system is running on JRE 17");
	}
	@Test
	@EnabledOnJre(JRE.JAVA_21)
	void test4() {
		System.out.println("This system is running on JRE 21");
	}
	
	
	@Test
	@EnabledIfSystemProperty(named = "os.version",matches = ".*10.*")
	void runOnWindows10() {
		System.out.println("Windows 10 Version");
	}
	
	@Test
	@EnabledIfSystemProperty(named = "os.version",matches = ".*11.*")
	void runOnWindows11() {
		System.out.println("Windows 11 Version");
	}
	
	@Test
	@EnabledIf("myCondition")
	void condition1() {
		System.out.println("Execute test is return true");
	}
	
	@Test
	@DisabledIf("myCondition")
	void condition2() {
		System.out.println("Execute test is return false");
	}
	
	boolean myCondition() {
		return true;
	}

}
