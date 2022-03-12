package core;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestNGSelenium {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		
	}

	@Test (priority = 1)
	public void inValidLogin() {
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin564");

		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin12323");

		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		loginBtn.click();	
		
		System.out.println("1: Invalid login : Failed");

	}
	
	@Test (priority = 2)
	public void blankLogin() {
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("");

		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("");

		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		loginBtn.click();	
		
		System.out.println("2: Blank login : Failed");

	}
	
	@Test (priority = 3)
	public void passInvalid() {
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");

		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("addgsd");

		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		loginBtn.click();		
		
		System.out.println("3: Invalid Password : Failed");

	}
	
	@Test (priority = 4)
	public void validLogin() {
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");

		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");

		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		loginBtn.click();	
		
		System.out.println("4: Valid username and password : Passed");

	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}


}
