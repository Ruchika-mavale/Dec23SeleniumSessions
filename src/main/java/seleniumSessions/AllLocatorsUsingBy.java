package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocatorsUsingBy {
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//id Locator
//		driver.findElement(By.id("input-firstname")).sendKeys("test");
//		driver.findElement(By.id("input-lastname")).sendKeys("automation");
		
		
//		By fn = By.id("input-firstname");
//		By ln = By.id("input-lastname");
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(fn, "testRuchi");
//		eleUtil.doSendKeys(ln, "testLastName");
		
		//Name Locator
//		driver.findElement(By.name("firstname")).sendKeys("nameFirst");
//		driver.findElement(By.name("lastname")).sendKeys("nameLast");
		
//		By Fname = By.name("firstname");
//		By Lname = By.name("lastname");
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(Fname, "RuchiFName");
//		eleUtil.doSendKeys(Lname, "RuchiLName");
		
		//ClassName Locator
		//driver.findElement(By.className("form-control")).sendKeys("test123");
		
//		By name = By.className("form-control");
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(name, "testRuchi");
		
		
		//Xpath Locator
//		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("testFN");
//		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("testLN");
		
//		By fname  = By.xpath("//*[@id=\"input-firstname\"]");
//		By lname = 	By.xpath("//*[@id=\"input-lastname\"]");
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(fname, "test123");
//		eleUtil.doSendKeys(lname, "test456");
		
		//CssSelecor Locator
//		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("text");
//		driver.findElement(By.cssSelector("#input-lastname")).sendKeys("text");
//		
//		By fname = By.cssSelector("#input-firstname");
//		By lname = By.cssSelector("#input-lastname");
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(fname, "test");
//		eleUtil.doSendKeys(lname, "test");
		
		//LinkText Locator
//		driver.findElement(By.linkText("Forgotten Password")).click();
		
//		By fclick = By.linkText("Forgotten Password");
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doElementClick(fclick);
		
		//partialLinkText locator
//		driver.findElement(By.partialLinkText("Forgotten")).click();
//		By plinktext = By.partialLinkText("Forgotten");
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doElementClick(plinktext);
		
		
//		String tagName = driver.findElement(By.tagName("h1")).getText();
//		System.out.println(tagName);
		
		By tagName = By.tagName("h1");
		ElementUtil eleUtil = new ElementUtil(driver);
		String eleText = eleUtil.doGetElementText(tagName);
		System.out.println(eleText);
		if(eleText.equals("Register Account")) {
			System.out.println("Text pass");
		}else {
			System.out.println("Text fail");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
