package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForURL {
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/");
		driver.findElement(By.linkText("Sign Up")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.urlContains("/register"));
		
		String url = waitForURLContains("/register" , 10);
		System.out.println(url);
		//System.out.println(driver.getCurrentUrl());
		
	}
	public static String waitForURLContains(String urlFraction , int timeUtit) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeUtit));
		try {
		if(wait.until(ExpectedConditions.urlContains(urlFraction))) {
			return driver.getCurrentUrl();
		}
		}
		catch (Exception e) {
			System.out.println("URL not found of duration " + timeUtit + "time");
		}
		return null;
		
	}
	
	public static String waitForURLIs(String url , int timeUnit) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeUnit));
		try {
		if(wait.until(ExpectedConditions.urlToBe(url))) {
			return driver.getCurrentUrl();
		}
		}
		catch (Exception e) {
			System.out.println("URL not found of duration " + timeUnit + "time");
		}
		return null;
	}

}
