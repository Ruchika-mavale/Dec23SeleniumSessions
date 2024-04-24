package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMenthod {
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		// By text elements
//		List<WebElement> allAnchorTag = driver.findElements(By.tagName("a"));
//		System.out.println(allAnchorTag.size());
//		
//		for(WebElement e : allAnchorTag) {
//			String anchorText = e.getText();
//			
//			if(anchorText.length()!=0) {
//				System.out.println(anchorText);
//			}
//		}
//		By name = By.tagName("a");
//		ArrayList<String> listvalue = getElementsText(name);
//		System.out.println(listvalue);
		
//		By name = By.tagName("a");
//		ElementUtil eleUtil = new ElementUtil(driver);
//		ArrayList<String> allValues = eleUtil.getElementsText(name);
//		System.out.print(allValues);
		
		
		
		//By Attribute elements
//		List<WebElement> allEle = driver.findElements(By.tagName("img"));
//		System.out.println(allEle.size());
//		
//		for(WebElement e : allEle) {
//			String srcAttributes = e.getAttribute("src");
//			String altAttribute = e.getAttribute("alt");
//			System.out.println(altAttribute+ "====="+ srcAttributes);
//		}
//		By AttributeName  = By.tagName("img");
//		ArrayList<String> valueOp = getElementsAttribute(AttributeName, "src");
//		System.out.println(valueOp);
	
		By AnchorText = By.tagName("a");
		By AttributeImg = By.tagName("img");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		ArrayList<String> allValueAnchor = eleUtil.getElementsText(AnchorText);
		System.out.println(allValueAnchor);
		System.out.println("+++++++++++++++++++++====++++++++");
		
		ArrayList<String> srcvalue = eleUtil.getElementsAttribute(AttributeImg, "src");
		ArrayList<String> altvalue = eleUtil.getElementsAttribute(AttributeImg, "alt");
		
		System.out.println(srcvalue);
		System.out.println(altvalue);
		
		
		
		
		
	
	}
//	public static List<WebElement> getElemnts(By locator) {
//		return driver.findElements(locator);
//	}
//	
//	public static ArrayList<String> getElementsText(By locator) {
//		List<WebElement> allValues = getElemnts(locator);
//		ArrayList<String> arrayValues = new ArrayList<String>();
//		for(WebElement e : allValues) {
//			String locatorText = e.getText();
//			
//			arrayValues.add(locatorText);
//			
//		}
//		return arrayValues;
	
//	}
	
//	public static ArrayList<String> getElementsAttribute(By locator, String attrName) {
//		List<WebElement> eleList = getElemnts(locator);
//		ArrayList<String> eleAttributeList = new ArrayList<String>();
//		
//		for(WebElement e : eleList) {
//			String attributeName = e.getAttribute(attrName);
//			eleAttributeList.add(attributeName);
//			
//		}
//		return eleAttributeList; 	
//		
//	}
	

}
