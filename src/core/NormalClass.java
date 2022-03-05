package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NormalClass {

//	public static void main(String[] args) {
//		String url = "https://opensource-demo.orangehrmlive.com/";
//
//		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get(url);
//		driver.manage().window().maximize();
//
//
//	}
	
	@Test
	public void test() {
		String url = "https://opensource-demo.orangehrmlive.com/";

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}

}
