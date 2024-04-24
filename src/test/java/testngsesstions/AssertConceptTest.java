package testngsesstions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertConceptTest {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test
	public void titleTest() {
		String title = driver.getTitle().toString();
		Assert.assertEquals(title, "Google", "titale is not match");
	}
	
	@Test
	public void imgTest() {
		boolean img = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		Assert.assertTrue(img);
	}
	
	@Test
	public void urlTest() {
		String url = driver.getCurrentUrl().toString();
		Assert.assertTrue(url.contains("google"), "url is not correct");
	}
	
	@AfterTest
	public void closeSetUp() {
		driver.close();
	}

}
