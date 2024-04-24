package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleURL {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.titleContains("Free CRM software for customer"));
//		String title = driver.getTitle();
//		System.out.println(title);
		
		String pagetitle = waitForTitleContains("Free CRM software for customer" , 5);
		System.out.println(pagetitle);
		

	}
	
	public static String waitForTitleContains(String titleFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if(wait.until(ExpectedConditions.titleContains(titleFraction))) {
				return driver.getTitle();
			}
		}
		catch (Exception e) {
			System.out.println("Title not found within time out" + timeOut);
		}
		
		return null;
	}
	
	public static String waitForTitleIs(String title, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if(wait.until(ExpectedConditions.titleIs(title))) {
				return driver.getTitle();
			}
		}
		catch (Exception e) {
			System.out.println("Title not found within time out" + timeOut);
		}
		
		return null;
	}
	
	

}
