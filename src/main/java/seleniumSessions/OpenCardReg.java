package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCardReg {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
	
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By telphn = By.id("input-telephone"); 
		By pass = By.id("input-password");
		By confirmpass = By.id("input-confirm");
		
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(firstName, "Ruchika");
		eleUtil.doSendKeys(lastName, "Mavale");
		eleUtil.doSendKeys(email, "test@gmail.com");
		eleUtil.doSendKeys(telphn, "7654323456");
		eleUtil.doSendKeys(pass, "123");
		eleUtil.doSendKeys(confirmpass, "123");
		
		
	}

}
