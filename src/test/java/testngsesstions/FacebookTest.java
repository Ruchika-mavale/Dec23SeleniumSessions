package testngsesstions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookTest extends BaseTest {
	@Test(priority = 1)
	public void titleTest() {
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Facebook – log in or sign up", "titale is not match");
	}
	
	
	@Test(priority = 2)
	public void urlTest() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("facebook"), "url is not correct");
	}

}
