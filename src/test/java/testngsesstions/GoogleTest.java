package testngsesstions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {
	
	
	
	@Test(priority = 1)
	public void getTitle() {
		//driver.get("https://www.google.com/");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google", "titale is not match");
	}
	
	@Test (priority = 2)
	public void imgTest() {
		boolean img = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		Assert.assertTrue(img);
	}
	
	@Test(priority = 3)
	public void getURL() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("google"), "url is not correct");
	}
	
	
	

}
