package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		String FnPlaceholder = driver.findElement(By.name("firstname")).getAttribute("placeholder");
//		String FnType = driver.findElement(By.name("firstname")).getAttribute("type");
//		String FnClass = driver.findElement(By.name("firstname")).getAttribute("class");
//		
//		System.out.println(FnPlaceholder);
//		System.out.println(FnType);
//		System.out.println(FnClass);
		
		By name = By.name("firstname");
//		String FnPlaceholder =  getAttribute(name, "placeholder");
//		System.out.println(FnPlaceholder);
		ElementUtil eleUtil = new ElementUtil(driver);
		String FnPlaceholder = eleUtil.doGetAttribute(name, "placeholder");
		String FnType = eleUtil.doGetAttribute(name, "type");
		System.out.println(FnPlaceholder);
		System.out.println(FnType);
		
		

		
	}
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//	}
//	
//	public static String getAttribute(By locator, String value) {
//		return getElement(locator).getAttribute(value);
//	}

}
