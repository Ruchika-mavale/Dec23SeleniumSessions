package testngsesstions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityConceptTest {
	
	//Without priority execution result
//	Google
//	https://www.google.com/
//	PASSED: testngsesstions.GoogleTest.imgTest
//	PASSED: testngsesstions.GoogleTest.getTitle
//	PASSED: testngsesstions.GoogleTest.getURL
	
	
	//with priority test result
//	PASSED: testngsesstions.PriorityConceptTest.getTitle
//	PASSED: testngsesstions.PriorityConceptTest.getURL
//	PASSED: testngsesstions.PriorityConceptTest.imgTest
	
	
WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test(priority = 1)
	public void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority = 3)
	public void imgTest() {
		driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
	}
	
	@Test(priority = 2)
	public void getURL() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
