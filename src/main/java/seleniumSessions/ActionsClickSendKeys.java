package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickSendKeys {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/en/book-a-free-demo/");
		
//		WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='Accept Cookies']"));
		//Actions act = new Actions(driver);
		
//		WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='Accept Cookies']"));
//		WebElement name = driver.findElement(By.id("Form_getForm_FullName"));
//		WebElement email = driver.findElement(By.id("Form_getForm_Email"));
//		WebElement companyNmae = driver.findElement(By.id("Form_getForm_CompanyName"));
//		
//		Actions act = new Actions(driver);
//		Thread.sleep(1500);
//		act.click(ele).build().perform();
//		Thread.sleep(1500);
//		act.sendKeys(name, "text").build().perform();
//		act.sendKeys(email, "text@qa.com").build().perform();
//		act.sendKeys(companyNmae, "text123").build().perform();
		
		By ele = By.xpath("//a[normalize-space()='Accept Cookies']");
		By name = By.id("Form_getForm_FullName");
		By email = By.id("Form_getForm_Email");
		By companyNmae = By.id("Form_getForm_CompanyName");
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doActionClick(ele);
		eleUtil.doActionSendKeys(name, "text");
		eleUtil.doActionSendKeys(email, "text@qa.com");
		eleUtil.doActionSendKeys(companyNmae, "text123");
		
		

	}
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//	}
//	public static void doActionClick(By locator) throws InterruptedException {
//		//Actions act = new Actions(driver);
//		Thread.sleep(1500);
//		getAction().click(getElement(locator)).build().perform();
//		
//	}
//	public static Actions getAction() {
//		Actions act = new Actions(driver);
//		return act;
//	}
//	public static void doActionSendKeys(By locator, String value) throws InterruptedException {
//		//Actions act = getAction();
//		Thread.sleep(1500);
//		getAction().sendKeys(getElement(locator), value).build().perform();
//		
//		
//		
//	}

}
