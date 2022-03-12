package asert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsOnMethod {

	WebDriver driver;
	
	@Test (dependsOnMethods = {"smoke"} )
	public void regression() {
		driver.findElement(By.id("btnLogin")).isDisplayed();
	}

	@Test 
	public void smoke() {
		
		String url = "https://opensource-demo.orangehrmlive.com/";
		System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
//		driver.quit();

	}
	
}
