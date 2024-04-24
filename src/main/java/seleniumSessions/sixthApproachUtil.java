package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sixthApproachUtil {
	
	private WebDriver driver;

	public sixthApproachUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getLocator(By locator) {
		return driver.findElement(locator);
	}
	
	public void doSendKeys(By locator, String value) {
		getLocator(locator).sendKeys(value);
	}
	
	

	

}
