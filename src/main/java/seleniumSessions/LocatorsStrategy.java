package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsStrategy {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By fname = By.name("firstname");
		By lname = By.name("lastname");
		By email = By.name("email");
		By phn = By.name("telephone");
		By pass = By.name("password");
		By cpass = By.name("confirm");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(fname, "ruchi");
		eleUtil.doSendKeys(lname, "test");
		eleUtil.doSendKeys(email, "test@gmail.com");
		eleUtil.doSendKeys(phn, "123456789");
		eleUtil.doSendKeys(pass, "123");
		eleUtil.doSendKeys(cpass, "123");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
