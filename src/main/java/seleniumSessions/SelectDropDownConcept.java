package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		
//		WebElement country = driver.findElement(By.id("Form_getForm_Country"));
		
//		Select select = new Select(country);
//		select.selectByIndex(5);
//		select.selectByValue("India");
//		select.selectByVisibleText("Bangladesh");
		
		By country = By.id("Form_getForm_Country");
//		doSelectByIndex(country, 6);
//		doSelectByValue(country, "Bangladesh");
//		soSelectByVisibleText(country, "India");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSelectByIndex(country, 15);
		eleUtil.doSelectByValue(country, "Bangladesh");
		eleUtil.soSelectByVisibleText(country, "India");
		

	}
	
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//	}
//	
//	public static void doSelectByIndex(By locator, int index) {
//		
//		Select select = new Select(getElement(locator));
//		select.selectByIndex(index);	
//	}
//	
//	public static void doSelectByValue(By locator, String visibleText) {
//		if(visibleText == null || visibleText.length()==0){
//			throw new ElementUtilException("Visible Text can not be NULL");
//		}
//		Select select = new Select(getElement(locator));
//		select.selectByValue(visibleText);
//	}
//	
//	public static void soSelectByVisibleText(By locator, String value) {
//		if(value == null || value.length()==0){
//			throw new ElementUtilException("Visible Text can not be NULL");
//		}
//		Select select = new Select(getElement(locator));
//		select.selectByVisibleText(value);
//	}

}
