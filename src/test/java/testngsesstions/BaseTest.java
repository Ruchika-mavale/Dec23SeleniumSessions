package testngsesstions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import seleniumSessions.BrowserException;



public class BaseTest {
	WebDriver driver;
	
	@Parameters({"url", "browser"})
	@BeforeTest
	public void setup(String url, String browser) {
		switch(browser.toLowerCase().trim()) {
		case "chrome" : 
			driver = new ChromeDriver();
			break;
		
		case "firefox" : 
			driver = new FirefoxDriver();
			break;
		
		case "edge" : 
			driver = new EdgeDriver();
			break;
		
		default : 
			//System.out.println("please pass correct browser");
			throw new BrowserException("pass correct prowser");
		
		
		
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
