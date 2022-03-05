package core;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IncludeExcludeClass {


	@Test (groups = {"smoke"})
	public void testCaseOne() {
		System.out.println("smoke");
	}

	@Test (groups = {"Regression", "smoke"})
	public void testCaseTwo() {
		System.out.println("Regression and smoke");
	}

	@Test (groups = {"smoke"})
	public void testCaseThree() {
		System.out.println("smoke");
	}

	@Test (groups = {"Regression"})
	public void testCaseFour() {
		System.out.println("Regression");
	}
	
	@Test (groups = {"smoke"})
	public void testCaseFive() {
		System.out.println("smoke");
	}

	@Test (groups = {"Regression"})
	public void testCaseSix() {
		System.out.println("Regression");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}



}
