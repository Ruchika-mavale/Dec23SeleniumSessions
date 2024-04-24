package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysWithPause {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/en/book-a-free-demo/");
		
//		Actions act = new Actions(driver);
//		WebElement ele = driver.findElement(By.id("Form_getForm_FullName"));
//		
//		String name = "Ruchika";
//		char val[] = name.toCharArray();
//		
//		for(char c: val) {
//			act.sendKeys(ele, String.valueOf(c)).pause(1000).build().perform();
//		}
		
		
		String charValue = "Ruchika";
		By name = By.id("Form_getForm_FullName");
//		
//		doSendValueWithPause(name,charValue);
		
		ElementUtil ele = new ElementUtil(driver);
		ele.doActionsSendValueWithPause(name, charValue);
		

	}
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//		
//	}
//	public static void doActionsSendValueWithPause(By locator, String value) {
//		Actions act = new Actions(driver);
//		char val[] = value.toCharArray();
//		
//		for(char c: val) {
//			act.sendKeys(getElement(locator), String.valueOf(c)).pause(1000).build().perform();
//		}
//		
//	}

}
