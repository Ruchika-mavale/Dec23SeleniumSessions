package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorSixthApproach {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By eid = By.id("input-email");
		By pass  = By.id("input-password");
		
		sixthApproachUtil util = new sixthApproachUtil(driver);
		util.doSendKeys(eid, "test@gmail.com");
		util.doSendKeys(pass, "test123");
		
		
		
		

	}

}
