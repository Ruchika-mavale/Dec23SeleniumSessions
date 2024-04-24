package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocatorsUsingString {
	
	static WebDriver driver;
	

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//id Locator
//		driver.findElement(By.id("input-firstname")).sendKeys("testFN");
//		driver.findElement(By.id("input-lastname")).sendKeys("testLN");
		
//		String fName = "input-firstname";
//		String lName = "input-lastname";
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys("id", fName, "TestFirstN");
//		eleUtil.doSendKeys("id", lName, "TestLastN");
		
		//name Locator
//		driver.findElement(By.name("firstname")).sendKeys("Fname");
//		driver.findElement(By.name("lastname")).sendKeys("LastName");
		
//		String FName = "firstname";
//		String LName = "lastname";
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys("name", FName, "fName");
//		eleUtil.doSendKeys("name", LName, "LName");
		
//		String name = "form-control";
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys("classname", name, "test123");
		
		//Xpath
//		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("testXpath");
//		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("lnamexpath");
		
//		String fname = "//*[@id=\"input-firstname\"]";
//		String lname = "//*[@id=\"input-lastname\"]";
//	
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys("xpath", fname, "textxpath");
//		eleUtil.doSendKeys("xpath", lname, "text");
		
		//CssSelector Locator
//		String fn = "#input-firstname";
//		String ln = "#input-lastname";
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys("cssselector", fn, "textselctor");
//		eleUtil.doSendKeys("cssselector", ln, "text");
		
		//LinkText Locaor
//		String text = "Forgotten Password";
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doElementClick("linktext", text);
		
//		String pText = "Forgotten";
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doElementClick("partiallinktext", pText);
		
//		String text = driver.findElement(By.tagName("h1")).getText();
//		System.out.println(text);
		
		String tgaName = "h1";
		
		ElementUtil eleUtil = new ElementUtil(driver);
		String eleText = eleUtil.doGetElementText("tagname", tgaName);
		System.out.println(eleText);
		
		
		
		
		
		
		
		
		
		

	}

}
