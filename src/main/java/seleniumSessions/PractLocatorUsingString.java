package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractLocatorUsingString {
	
	static WebDriver driver;
	

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		
		// 8. By util + String locators
		String email = "input-email";
		String pass = "input-password";
		
		practElementUtil eleutil = new practElementUtil(driver);
		eleutil.doSendKeys("id", email, "test@gmail.com");
		eleutil.doSendKeys("id", pass, "test12345");
		

	}

}
