package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllOptions {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		
//		WebElement country = driver.findElement(By.id("Form_getForm_Country"));
//		
//		Select  select = new Select(country);
//		List<WebElement> countryOptions = select.getOptions();
//		int count =countryOptions.size();
//		System.out.println(count);
//		
		By locator = By.id("Form_getForm_Country");
//		doSelectDropdownValue(locator, "India");
//		int count = getDropdownValueCount(locator);
//		System.out.println(count);
		ElementUtil eleutil = new ElementUtil(driver);
		eleutil.doSelectDropdownValue(locator, "India");
//		ArrayList<String> list = eleutil.getDropDownTextList(locator);
//		System.out.println(list);
		eleutil.printSelectDropdownValues(locator);

	}
	
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//	}
//	
//	public static List<WebElement> getDropDownOptionsList(By locator) {
//		Select select = new Select(getElement(locator)); 
//		List<WebElement> listDropdown = select.getOptions();
//		return listDropdown;
//		
//	}
//	
//	public static int getDropdownValueCount(By locator) {
//		return getDropDownOptionsList(locator).size();
//	}
//	
//	public static void doSelectDropdownValue(By locator, String slectValue) {
//		List<WebElement>listDropdown = getDropDownOptionsList(locator);
//		
//		for(WebElement e : listDropdown) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals(slectValue)) {
//				e.click();
//				break;
//				
//			}
//		}
//	
		
		
//	}
	

}
