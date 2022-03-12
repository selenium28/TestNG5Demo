package asert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertClass {
	

	@Test
	public void testOne() {
	String url = "https://opensource-demo.orangehrmlive.com/"; 
	System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	
	Assert.assertEquals(driver.getTitle(), "OrangeHRM", "");
	
	WebElement username = driver.findElement(By.id("txtUsername"));
	username.sendKeys("Admin");
	
	WebElement password = driver.findElement(By.id("txtPassword"));
	password.sendKeys("admin123");
	
	WebElement loginBtn = driver.findElement(By.id("btnLogin"));
	loginBtn.click();
	
	WebElement Dashboard = driver.findElement(By.xpath("//h1[text()='Dashboard']"));
	Assert.assertTrue(Dashboard.isSelected(), "Dashboard is not selected");
	Assert.assertEquals('c', 'S');
	
	}

}
