package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LocatorsConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		// create webElement+ perform action on it

				driver = new ChromeDriver();// 123
				driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

				// 1. approach
//				driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//				driver.findElement(By.id("input-password")).sendKeys("test@123");

				// 2. approach
//				WebElement emailID = driver.findElement(By.id("input-email"));
//				WebElement password = driver.findElement(By.id("input-password"));
//				
//				emailID.sendKeys("testtwo@gmail.com");
//				password.sendKeys("testtwo@123");

				// 3rd : approach = By locator approach

//				By eid = By.id("input-email");
//				By pwd = By.id("input-password");
//				
//				WebElement emailID  = driver.findElement(eid);
//				WebElement password = driver.findElement(pwd);
//				
//				emailID.sendKeys("test@gmail.com");
//				password.sendKeys("test@123");
//				
				// 4th approach By locator approach using util class
//				By eid = By.id("input-email");
//				By pass = By.id("input-password");
//				
//				
//				WebElement email = getElement(eid);
//				WebElement password = getElement(pass);
//				
//				email.sendKeys("test@gmail.com");
//				password.sendKeys("test@123");

				// 5th approach By locator approach using util class and action util

//				By eid = By.id("input-email");
//				By pass = By.id("input-password");
		//	
//				doSendKeys(eid, "test@gmail.com");
//				doSendKeys(pass, "test@123");

				// approach 6th By locator and create a common util class for elements

//				By username = By.id("input-email");
//				By pwd = By.id("input-password");
//
//				ElementUtil eleUtil = new ElementUtil(driver);
//				eleUtil.doSendKeys(username, "test@gmail.com");
//				eleUtil.doSendKeys(pwd, "test@123");
				
				//7th Approach
				String usernameId = "input-email";
				String passwordId = "input-password";
				
				ElementUtil eleUtil = new ElementUtil(driver);
				
				eleUtil.doSendKeys("id", usernameId, "test@gmail.com");
				eleUtil.doSendKeys("id", passwordId, "test12345");
				
				
				
				//string --> by -> webelement action 2nd
				//by-- webelement -action 1st
				//webelement -- action 3rd
				

	}
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//		
//	}
//	
//	public static void doSendKeys(By locator, String value) {
//		 getElement(locator).sendKeys(value);
//		
//	}

}
