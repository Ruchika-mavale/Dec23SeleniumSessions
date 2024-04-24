package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropDownWithoutUsingSelectClass {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
//		List<WebElement> list = driver.findElements(By.xpath("//select[@id = 'Form_getForm_Country']/option"));
//		
//		for(WebElement e : list) {
//			String text  = e.getText();
//			if(text.equals("Vietnam")) {
//				e.click();
//				break;
//			}
//			
//		}
		By locator = By.xpath("//select[@id = 'Form_getForm_Country']/option");
//		doSelectValueFromDropdown(locator, "India");
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSelectValueFromDropdown(locator, "India");
		

	}
	
//	public static  List<WebElement> getElements(By locator) {
//		return driver.findElements(locator);
//	}
	
//	public static void doSelectValueFromDropdown(By locator, String selectValue) {
//		List<WebElement> optionList = getElements(locator);
//		
//		for(WebElement e : optionList) {
//			String text  = e.getText();
//			if(text.equals(selectValue)) {
//				e.click();
//				break;
//			}
//		}
//
//		
//	}

}
