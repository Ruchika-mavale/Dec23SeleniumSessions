package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practLocatorConcepts {
	
	static WebDriver driver;
	

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		//6. By locator and create a common util class for elements:
		
		By emailId = By.id("input-email");
		By pass = By.id("input-password");
		
		practElementUtil eleUtil = new practElementUtil(driver);
		eleUtil.doSendKeys(emailId, "ruchiTest@gmail.com");
		eleUtil.doSendKeys(pass, "test12345");
		
		
		
			
		
		
		
		

	}

}
