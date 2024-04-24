package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorThirdApproach {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By eid = By.id("input-email");
		By pass = By.id("input-password");
		
		WebElement email  = driver.findElement(eid);
		WebElement password = driver.findElement(pass);
		
		email.sendKeys("testthree@gmail.com");
		password.sendKeys("test123@");
		

	}

}
