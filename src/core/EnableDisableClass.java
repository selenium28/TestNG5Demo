package core;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class EnableDisableClass {

	@Test 
	public void testCaseOne() {
		System.out.println("testCaseOne");
		
		EnableDisableClass obj = new EnableDisableClass();
		int c = obj.sum(10, 20);	
		System.out.println(c);
	}

//	@Test (priority = 2 , enabled = true)
//	public void testCaseTwo() {
//		System.out.println("testCaseTwo");
//	}
//
//	@Test (priority = 3 , enabled = false)
//	public void testCaseThree() {
//		System.out.println("testCaseThree");
//	}
//
//	@Test (priority = 4 , enabled = false)
//	public void testCaseFour() {
//		System.out.println("testCaseFour");
//	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}

	//	<?xml version="1.0" encoding="UTF-8"?>
	//	<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
	//	<suite parallel="false" name="Suite">
	//	  <test name="Test">
	//	    <classes>
	//	      <class name="core.IncludeExcludeClass">
	//	      <methods>
	//	      	<exclude name="testCaseOne"></exclude>
	//	      	<exclude name="testCaseFour"></exclude>
	//	      	<include name="testCaseThree"></include>
	//	      	<include name="testCaseTwo"></include>
	//	      </methods>
	//	      </class>
	//	    </classes>
	//	  </test> <!-- Test -->
	//	</suite> <!-- Suite -->
	
	@Test
	public int sum(int a, int b) {
		return a+b;
	}
}
