package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@DisplayName("DI Example")
public class DependencyInjection {

	
	 public DependencyInjection(TestInfo info) {
		 Assertions.assertEquals("DI Example", info.getDisplayName());
	 }
	 @Test
	 @DisplayName("Another Test")
	 public void mytest( TestInfo info) {
		 Assertions.assertEquals("Another Test", info.getDisplayName());
	 }
	 
	 @Test
	 @DisplayName("Test-1")
	 @Tag("my-test")
	 public void mytest1(TestInfo info) {
		 Assertions.assertEquals("Test-1", info.getDisplayName());
		 Assertions.assertTrue(info.getTags().contains("my-test"));
	 }

}
