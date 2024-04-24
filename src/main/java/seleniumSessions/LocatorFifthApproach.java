package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorFifthApproach {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By eid = By.id("input-email");
		By pass = By.id("input-password");
		
		
		doSendKeys(eid,"test@gmail.com");
		doSendKeys(pass,"test123");
		
		
		

	}
	public static WebElement getLocator(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		getLocator(locator).sendKeys(value);
	}

}
