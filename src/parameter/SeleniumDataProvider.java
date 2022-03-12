package parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeleniumDataProvider {
	WebDriver driver;

	@Test(dataProvider="testData")
	public void testCase(String urname,String pass) {
		String url = "https://opensource-demo.orangehrmlive.com/";

		System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys(urname);

		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys(pass);

		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		loginBtn.click();	
		
		driver.quit();


	}

	@DataProvider
	public Object[][] testData(){
		Object[][] data = new Object[3][2];

		data[0][0] = "Admin";
		data[0][1] = "admin123";

		data[1][0] = "Admin123";
		data[1][1] = "12345";
		
		data[2][0] = "Admin";
		data[2][1] = "admin123";

		return data;
	}




}
