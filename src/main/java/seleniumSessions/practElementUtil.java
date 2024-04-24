package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class practElementUtil {

	private WebDriver driver;

//	public practElementUtil(WebDriver driver) {
//		this.driver = driver;
//	}

	public practElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	

	public By getBy(String locatorid, String locatorValue) {
		By locator = null;

		switch (locatorid.toLowerCase().trim()) {

		case "id":
			locator = By.id(locatorValue);
			break;

		default:
			break;
		}

		return locator;

	}
	
	public WebElement getElement(String locatorid, String locatorValue) {
		return driver.findElement(getBy(locatorid, locatorValue));
	

	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);

	}
	
	public void doSendKeys(String locatorid, String locatorValue, String value) {
		getElement(locatorid, locatorValue).sendKeys(value);
		
	}


	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

}
