package core;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class PriorityClass {
	
  @Test 
  public void testCaseOne() {
	  System.out.println("testCaseOne");
  }
  
  @Test (priority = 0)
  public void testCaseTwo() {
	  System.out.println("testCaseTwo");
  }
   
  @Test (priority = -3)
  public void testCaseThree() {
	  System.out.println("testCaseThree");
  }
  
  @Test (priority = -5)
  public void testCaseFour() {
	  System.out.println("testCaseFour");
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
