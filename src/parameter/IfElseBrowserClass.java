package parameter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class IfElseBrowserClass {
	
	//TestNG Parameter
	//TestNG DataProvider
	// DataProviders pass the diff. parameters on a single test in a single excution.
	// Parameters pass the para parameters just once per execution.
	
	WebDriver driver;
//	String browser = "firefox";
  @Parameters("browser")	
  @Test
  public void launchBrowser(String browser) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
}
