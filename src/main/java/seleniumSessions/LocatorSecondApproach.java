package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorSecondApproach {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement emailid = driver.findElement(By.id("input-email"));
		WebElement pass = driver.findElement(By.id("input-password"));
		
		emailid.sendKeys("testone@gmail.com");
		pass.sendKeys("test@123");
		
		
		
		

	}

}
