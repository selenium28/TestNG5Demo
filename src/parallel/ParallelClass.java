package parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelClass {
	

	@Test
	public void testOne() {
		String url = "https://opensource-demo.orangehrmlive.com/"; 
		System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		WebElement userName2 = driver.findElement(By.id("txtUsername"));
		userName2.sendKeys("Admin");
		
		WebElement password1 = driver.findElement(By.name("txtPassword"));
		password1.sendKeys("admin123");
		
		WebElement loginbutton1 = driver.findElement(By.id("btnLogin"));
		loginbutton1.click();
		
		System.out.println("TestCasechrome 1 | " +Thread.currentThread());
		
		driver.quit();	
	}

//	@Test
//	public void testTwo() {
//		
//		String url = "https://opensource-demo.orangehrmlive.com/"; 
//		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
//		FirefoxDriver driver2 = new FirefoxDriver();
//		driver2.get(url);
//		driver2.manage().window().maximize();
//
//		WebElement userName2 = driver2.findElement(By.id("txtUsername"));
//		userName2.sendKeys("Admin");
//		
//		WebElement password1 = driver2.findElement(By.name("txtPassword"));
//		password1.sendKeys("admin123");
//		
//		WebElement loginbutton1 = driver2.findElement(By.id("btnLogin"));
//		loginbutton1.click();
//		
//		System.out.println("TestCaseFirefox 2 | " +Thread.currentThread());
//		
//		driver2.quit();
//	}
//	
//	@Test
//	public void testThree() {
//		
//		String url = "https://opensource-demo.orangehrmlive.com/"; 
//		System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get(url);
//		driver.manage().window().maximize();
//
//		WebElement userName2 = driver.findElement(By.id("txtUsername"));
//		userName2.sendKeys("Admin");
//		
//		WebElement password1 = driver.findElement(By.name("txtPassword"));
//		password1.sendKeys("admin123");
//		
//		WebElement loginbutton1 = driver.findElement(By.id("btnLogin"));
//		loginbutton1.click();
//		
//		System.out.println("TestCasechrome 3  | " +Thread.currentThread());
//		
//		driver.quit();	
//	}
}
